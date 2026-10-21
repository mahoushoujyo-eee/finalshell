import org.objectweb.asm.*;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

/**
 * 字节码层修复：把 javac 层面无法表达的 Java 约束，在 class 层面解决掉。
 *
 * 两个 pass：
 *
 *  1) dup   —— 同一 (方法名, 参数列表) 但返回类型不同的方法，Java 源码不允许共存，
 *               字节码允许。混淆器大量制造这种"同名不同返回类型"（1,426 处）。
 *               办法是按返回类型派生唯一名（m -> m$int / m$String），并且
 *               **在字节码层重命名**，这样所有调用点由 ASM 自动跟随更新。
 *               文本层改名字做不到这一点（调用点找不到），这正是之前
 *               "改名未沿继承链传播"问题的根因。
 *
 *  2) enum  —— 混淆器给一批普通类伪造了 ACC_ENUM 标志。判据以字节码事实为准：
 *               有子类 / 父类不是 java.lang.Enum / **自身被 new 出来过**。
 *               最后一条最硬：真枚举不可能被实例化。
 *               修法是清掉 ACC_ENUM，让反编译器按普通类渲染。
 */
public class FixBytecode {

    /** 类改名表：内部名 -> 新内部名。 */
    static final Map<String, String> RENAME_CLASS = new HashMap<>();

    /** 语义改名规则：owner|name|desc 前缀 -> 新方法名（desc 以 * 结尾表示前缀匹配）。 */
    static final List<String[]> METHOD_RULES = new ArrayList<>();

    /** 包改名表：包名 -> 新包名（解决仅大小写不同的包在 Windows 上的覆盖问题）。 */
    static final Map<String, String> PKG_RENAME = new HashMap<>();

    /**
     * 枚举降级的作用域文件：每行一个内部名（改名前的）。
     *
     * <p>为什么需要作用域：降级后的类不再是 java.lang.Enum 的子类。
     * 进了源码树（会被重新编译）的类，降级是**必须的** —— 源码里不允许
     * {@code class X extends java.lang.Enum}。
     * 而第三方类（Guava / FlatLaf / Swing 那些）会原样打进 bundled-libs.jar，
     * 它们**不会被重新编译**，降级对编译没有任何好处，却会让它们丢掉
     * {@code name()} / {@code ordinal()} / {@code Enum.valueOf} 的运行时行为。
     * 所以默认只降级作用域内的类。
     */
    static String enumScopeFile = null;

    public static void main(String[] args) throws Exception {
        String in = args[0], out = args[1];
        boolean doDup = false, doEnum = false, publicize = false, doClinit = false;
        int clinitCount = 0;
        int ifaceBumped = 0;
        int enumSuperFixed = 0, enumCtorFixed = 0, enumCtorSkipped = 0;
        for (int i = 2; i < args.length; i++) {
            if (args[i].equals("--dup")) doDup = true;
            if (args[i].equals("--enum")) doEnum = true;
            if (args[i].equals("--publicize")) publicize = true;
            if (args[i].equals("--clinit")) doClinit = true;
            if (args[i].startsWith("--rename=")) {
                String[] kv = args[i].substring("--rename=".length()).split("=", 2);
                RENAME_CLASS.put(kv[0], kv[1]);
                System.out.println("class rename: " + kv[0] + " -> " + kv[1]);
            }
            if (args[i].startsWith("--enum-scope=")) {
                enumScopeFile = args[i].substring("--enum-scope=".length());
            }
            if (args[i].startsWith("--method=")) {
                String[] kv = args[i].substring("--method=".length()).split("=", 2);
                String[] kk = kv[0].split("\\|", 3);
                if (kk.length != 3) throw new IllegalArgumentException("bad --method: " + kv[0]);
                METHOD_RULES.add(new String[]{kk[0], kk[1], kk[2], kv[1]});
                System.out.println("method rename: " + kv[0] + " -> " + kv[1]);
            }
        }
        Jar jar = new Jar(in);
        Map<String, List<ClassNode>> db = jar.classNodes();
        System.out.println("classes=" + db.size());

        // ---------- pass 1: 同名不同返回类型 ----------
        Map<String, Set<String>> returnsByKey = new HashMap<>();   // name|params -> 返回类型集合
        Map<String, List<ClassNode>> owners = new HashMap<>();      // name|params -> 声明者
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                for (MethodNode m : cn.methods) {
                    if (m.name.startsWith("<")) continue;
                    String key = m.name + "|" + paramDesc(m.desc);
                    returnsByKey.computeIfAbsent(key, k -> new HashSet<>()).add(retOf(m.desc));
                    owners.computeIfAbsent(key, k -> new ArrayList<>()).add(cn);
                }
            }
        }
        // ---------- pass 0: 包名大小写冲突 ----------
        // jar 里有 441 个类落在仅大小写不同的包里（com/c 与 com/C），
        // Windows 文件系统上会互相覆盖，源码树会丢类。解决办法是在字节码层改包名。
        Map<String, Set<String>> pkgByLower = new LinkedHashMap<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                int i = cn.name.lastIndexOf('/');
                if (i <= 0) continue;
                String pkg = cn.name.substring(0, i);
                pkgByLower.computeIfAbsent(pkg.toLowerCase(Locale.ROOT), k -> new LinkedHashSet<>()).add(pkg);
            }
        }
        int pkgFixed = 0;
        for (Set<String> group : pkgByLower.values()) {
            if (group.size() < 2) continue;
            List<String> gs = new ArrayList<>(group);
            for (int i = 1; i < gs.size(); i++) {
                String base = gs.get(i);
                PKG_RENAME.put(base, base + "_" + (i + 1));
                pkgFixed++;
            }
            System.out.println("package collision: " + gs + " -> keep " + gs.get(0));
        }
        System.out.println("packages renamed = " + pkgFixed);

        // ---------- pass 0b: 非法 Java 标识符的类名 ----------
        // jar 里有 package-info 这类类名（含连字符），反编译成源码后 javac 报
        // "<identifier> expected"。在字节码层改成合法标识符。
        int badNames = 0;
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                int i = cn.name.lastIndexOf('/');
                String simple = i >= 0 ? cn.name.substring(i + 1) : cn.name;
                if (isJavaIdentifier(simple)) continue;
                RENAME_CLASS.put(cn.name, (i >= 0 ? cn.name.substring(0, i + 1) : "") + toJavaIdentifier(simple));
                badNames++;
            }
        }
        System.out.println("illegal-identifier classes renamed = " + badNames);

        // 写反向别名表（新内部名 -> 原内部名），供后续的语义改名表对表用
        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream("rename-log.tsv"), StandardCharsets.UTF_8))) {
            w.println("newInternalName\toldInternalName");
            for (Map.Entry<String, String> e : RENAME_CLASS.entrySet())
                w.println(e.getValue() + "\t" + e.getKey());
            for (List<ClassNode> l : db.values()) {
                for (ClassNode cn : l) {
                    int i = cn.name.lastIndexOf('/');
                    if (i <= 0) continue;
                    String pkg = cn.name.substring(0, i);
                    String np = PKG_RENAME.get(pkg);
                    if (np != null) w.println(np + cn.name.substring(i) + "\t" + cn.name);
                }
            }
        }

        // ---------- pass 1: 同名不同返回类型 ----------
        // 关键：只改**真正冲突的类**里的方法。
        // 早先版本按 (方法名, 参数) 全局改名，结果把 implements Runnable 的
        // run() 也改成了 run$void —— 覆写关系直接断掉。
        // 现在按类判定冲突，再沿继承链把新名字传给子类（保持覆写关系）。
        final Map<String, String> rename = new HashMap<>();   // owner|name|desc -> newName
        int renamed = 0, conflictClasses = 0;

        // 1) 每个类内部找冲突
        Map<String, Set<String>> conflictOfClass = new HashMap<>();   // class -> 冲突的 key
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                Map<String, Set<String>> byKey = new HashMap<>();
                for (MethodNode m : cn.methods) {
                    if (m.name.startsWith("<")) continue;
                    String key = m.name + "|" + paramDesc(m.desc);
                    byKey.computeIfAbsent(key, k -> new HashSet<>()).add(retOf(m.desc));
                }
                for (Map.Entry<String, Set<String>> e : byKey.entrySet()) {
                    if (e.getValue().size() > 1) {
                        conflictOfClass.computeIfAbsent(cn.name, k -> new HashSet<>()).add(e.getKey());
                    }
                }
            }
        }
        conflictClasses = conflictOfClass.size();

        // 2) 给冲突类里的方法起新名（按返回类型派生）
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                Set<String> keys = conflictOfClass.get(cn.name);
                if (keys == null) continue;
                for (MethodNode m : cn.methods) {
                    if (m.name.startsWith("<")) continue;
                    String key = m.name + "|" + paramDesc(m.desc);
                    if (!keys.contains(key)) continue;
                    String nn = m.name + "$" + sanitize(retOf(m.desc));
                    rename.put(cn.name + "|" + m.name + "|" + m.desc, nn);
                    renamed++;
                }
            }
        }

        // 3) 沿继承链传播：子类里与被改名方法同 (名, 参数, 返回) 的方法要跟着改，
        //    否则覆写关系断裂。桥接方法（ACC_BRIDGE）描述符与父类一致，自然覆盖到。
        Map<String, String> superOf = new HashMap<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if (cn.superName != null) superOf.put(cn.name, cn.superName);
            }
        }
        boolean grew = true;
        int guard = 0;
        while (grew && guard++ < 50) {
            grew = false;
            for (List<ClassNode> l : db.values()) {
                for (ClassNode cn : l) {
                    for (MethodNode m : cn.methods) {
                        if (m.name.startsWith("<")) continue;
                        if (rename.containsKey(cn.name + "|" + m.name + "|" + m.desc)) continue;
                        // 往上找最近的、声明了同名同参同返回类型的祖先
                        String sup = superOf.get(cn.name);
                        int hop = 0;
                        while (sup != null && hop++ < 40) {
                            String cand = null;
                            List<ClassNode> sl = db.get(sup);
                            if (sl != null) {
                                for (ClassNode scn : sl) {
                                    for (MethodNode sm : scn.methods) {
                                        if (sm.name.equals(m.name) && sm.desc.equals(m.desc)) { cand = sup; break; }
                                    }
                                    if (cand != null) break;
                                }
                            }
                            String nn = cand == null ? null : rename.get(cand + "|" + m.name + "|" + m.desc);
                            if (nn != null) {
                                rename.put(cn.name + "|" + m.name + "|" + m.desc, nn);
                                renamed++;
                                grew = true;
                            }
                            sup = superOf.get(sup);
                        }
                    }
                }
            }
        }
        System.out.println("classes with (name,params) conflicts = " + conflictClasses
                + "  methods renamed = " + renamed + "  (map entries " + rename.size() + ")");

        // ---------- pass 2: 假枚举 ----------
        // 哪些类被当成子类（父类指针指向它）。匿名子类（$1/$2…）和自身是枚举的子类不算 ——
        // 真枚举允许有常量专属子类。
        Set<String> hasSub = new HashSet<>();
        Set<String> enumClasses = new HashSet<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if ((cn.access & Opcodes.ACC_ENUM) != 0) enumClasses.add(cn.name);
            }
        }
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if (cn.superName == null || cn.superName.equals("java/lang/Object")
                        || cn.superName.equals("java/lang/Enum")) {
                    continue;
                }
                if (enumClasses.contains(cn.name)) continue;                 // 子类自己是枚举
                if (cn.name.matches(".*\\$\\d+$")) continue;                 // 匿名子类
                hasSub.add(cn.superName);
            }
        }
        // 自身被 new 出来的类
        Set<String> selfInstantiated = new HashSet<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    for (AbstractInsnNode insn = m.instructions.getFirst(); insn != null; insn = insn.getNext()) {
                        if (insn instanceof TypeInsnNode && insn.getOpcode() == Opcodes.NEW) {
                            String t = ((TypeInsnNode) insn).desc;
                            if (t.equals(cn.name)) selfInstantiated.add(cn.name);
                        }
                    }
                }
            }
        }
        Set<String> fakeEnums = new TreeSet<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if ((cn.access & Opcodes.ACC_ENUM) == 0) continue;
                boolean fake = hasSub.contains(cn.name)
                        || !("java/lang/Enum".equals(cn.superName))
                        || selfInstantiated.contains(cn.name);
                if (fake) fakeEnums.add(cn.name);
            }
        }
        System.out.println("fake enums = " + fakeEnums.size()
                + "  (self-instantiated " + selfInstantiated.size() + ", has-subclass " + hasSub.size() + ")");

        // ---------- pass 2b: 枚举标志清理 + 父类还原 ----------
        //
        // 诊断结论（见 tools/ProbeEnum.java，对 finalshell-fixed.jar 全量扫描）：
        //   jar 里带 ACC_ENUM 的类共 629 个，分两类：
        //     (a) 489 个 super_class == java/lang/Enum，且同时有 values()/valueOf()/$VALUES 数组，
        //         构造器里 invokespecial java/lang/Enum.<init>(String,int)，
        //         <clinit> 里 new 自己 —— 这些是**被 ZKM 改写过的真枚举**；
        //     (b) 140 个 super_class 是别的类（枚举常量专属子类，javac 本来就给它们打 ACC_ENUM）。
        //   **一个"假枚举"都没有**。
        //
        // 之前 --enum 的判据里"自身被 new 出来"这一条是错的：
        // 真枚举的 <clinit> 就是 new 自己建枚举常量，所以每个真枚举都会被误判成假枚举，
        // 于是 ACC_ENUM 被清掉，而父类仍然是 java/lang/Enum，
        // Vineflower 渲染成 `class X extends Enum` —— javac 直接报
        //   "classes cannot directly extend java.lang.Enum"
        //   "constructor Enum in class Enum<E> cannot be applied to given types"
        //   "compareTo(Enum) in X cannot override compareTo(E) in Enum / overridden method is final"
        //
        // 修法（字节码层）：
        //   1) ACC_ENUM 一律清掉（让反编译器按普通类渲染）；
        //   2) super_class 从 java/lang/Enum 改成 java/lang/Object
        //      （Java 源码不允许 class 直接 extends java.lang.Enum）；
        //   3) 构造器里 invokespecial java/lang/Enum.<init>(Ljava/lang/String;I)V
        //      改成 invokespecial java/lang/Object.<init>()V，
        //      并删掉压在它上面的两条参数压栈指令（String 名字 / int ordinal）。
        //
        // 构造器的**签名不动**：(String,int,...) 保留 —— 枚举常量是靠 new X("NAME", 0, ...)
        // 创建的，改签名会把所有调用点一起弄坏；而 (String,int) 里的 name/ordinal
        // 变成没人用的形参，javac 只是不报错而已。
        //
        // (b) 类（枚举常量专属子类）父类不是 java/lang/Enum，super_name 不用动：
        // 它调的是父枚举的 <init>(String,int)，父枚举的构造器签名没变，调用点依然匹配。
        Set<String> enumFlagged = new TreeSet<>();
        Set<String> scope = null;
        if (enumScopeFile != null) {
            scope = new TreeSet<>();
            try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(
                    new java.io.FileInputStream(enumScopeFile), StandardCharsets.UTF_8))) {
                String l;
                while ((l = br.readLine()) != null) {
                    l = l.trim();
                    if (!l.isEmpty() && !l.startsWith("#")) scope.add(l);
                }
            }
            System.out.println("enum scope = " + scope.size() + " classes (from " + enumScopeFile + ")");
        }
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if ((cn.access & Opcodes.ACC_ENUM) == 0) continue;
                if (scope != null && !scope.contains(cn.name)) continue;
                enumFlagged.add(cn.name);
            }
        }
        // 干跑一遍，只为统计（真正的改动在写 jar 的循环里做 —— 那里的 ClassNode
        // 是从 zip 重新读出来的，前面分析阶段改的字段不会留下来）
        int enumSuperCount = 0, enumCtorCount = 0;
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if (!enumFlagged.contains(cn.name)) continue;
                if (!"java/lang/Enum".equals(cn.superName)) continue;
                enumSuperCount++;
                for (MethodNode m : cn.methods) {
                    if (m.name.equals("<init>") && m.instructions != null) enumCtorCount++;
                }
            }
        }
        System.out.println("enum flags cleared = " + enumFlagged.size()
                + "  super->Object = " + enumSuperCount
                + "  ctors to fix = " + enumCtorCount);
        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream("fake-enums-bytecode.tsv"), StandardCharsets.UTF_8))) {
            w.println("internal\treason");
            for (String f : fakeEnums) {
                String r = selfInstantiated.contains(f) ? "self-instantiated"
                        : hasSub.contains(f) ? "has-subclass" : "bad-super";
                w.println(f + "\t" + r);
            }
        }

        // ---------- 写新 jar ----------
        Remapper remap = new Remapper() {
            @Override public String mapMethodName(String owner, String name, String desc) {
                // 1) 语义规则优先（用原始 owner/name 匹配）
                for (String[] rule : METHOD_RULES) {
                    if (!rule[0].equals(owner) || !rule[1].equals(name)) continue;
                    String pat = rule[2];
                    boolean hit;
                    if (pat.startsWith("*")) {
                        hit = desc.endsWith(pat.substring(1));
                    } else if (pat.endsWith("*")) {
                        hit = desc.startsWith(pat.substring(0, pat.length() - 1));
                    } else {
                        hit = pat.equals(desc);
                    }
                    if (hit) return rule[3];
                }
                // 2) dup 改名
                String v = rename.get(owner + "|" + name + "|" + desc);
                return v != null ? v : name;
            }
            // 类改名：com.c -> com.Registry。必须在字节码层做，引用由 ASM 自动跟随更新。
            // ASM 的 ClassRemapper 把**内部类名**（如 com/c）传给 mapType，
            // 而 mapType 默认只认描述符（[Lcom/c;），所以两个钩子都要覆盖：
            //   map(String)      —— 内部类名
            //   mapType(String)  —— 描述符里的类型 / 被当成内部类名传入时
            @Override public String map(String internalName) {
                if (internalName == null) return null;
                String v = RENAME_CLASS.get(internalName);
                if (v != null) return v;
                int i = internalName.lastIndexOf('/');
                if (i > 0) {
                    String np = PKG_RENAME.get(internalName.substring(0, i));
                    if (np != null) return np + internalName.substring(i);
                }
                return internalName;
            }
            @Override public String mapType(String type) {
                if (type == null) return null;
                boolean isDescriptor = type.charAt(0) == '['
                        || (type.charAt(0) == 'L' && type.endsWith(";"))
                        || (type.length() == 1 && "VZBCSIJFD".indexOf(type.charAt(0)) >= 0);
                return isDescriptor ? super.mapType(type) : map(type);
            }
        };

        try (ZipFile zf = new ZipFile(in);
             ZipOutputStream zo = new ZipOutputStream(new BufferedOutputStream(
                     new FileOutputStream(out)))) {
            Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                byte[] data;
                try (InputStream in2 = zf.getInputStream(e)) { data = in2.readAllBytes(); }
                String name = e.getName();
                if (name.endsWith(".class") || name.endsWith(".SCL.lombok")) {
                    // 改名前的内部名，用来决定 zip 条目名
                    String oldInternal = Jar.internalName(data);
                    ClassNode node = new ClassNode();
                    new ClassReader(data).accept(node, 0);
                    if (doEnum && enumFlagged.contains(node.name)) {
                        // 清掉伪造/继承来的 ACC_ENUM，让反编译器按普通类渲染。
                        node.access &= ~Opcodes.ACC_ENUM;
                        if ("java/lang/Enum".equals(node.superName)) {
                            // Java 源码不允许 class 直接 extends java.lang.Enum，
                            // 而只清 ACC_ENUM 不够 —— 父类还指着 java.lang.Enum，
                            // Vineflower 会渲染成 `class X extends Enum`，javac 直接报错。
                            node.superName = "java/lang/Object";
                            // 泛型签名里若还指着 java.lang.Enum，一并换掉
                            if (node.signature != null && node.signature.contains("java/lang/Enum")) {
                                node.signature = node.signature.replace("java/lang/Enum", "java/lang/Object");
                            }
                            // 构造器里 super(name, ordinal) -> super()
                            for (MethodNode m : node.methods) {
                                if (m.name.equals("<init>") && m.instructions != null) {
                                    if (fixEnumSuperCall(m)) enumCtorFixed++;
                                    else enumCtorSkipped++;
                                }
                            }
                            enumSuperFixed++;
                        }
                    }
                    if (publicize) {
                        // 把成员开放成 public：混淆后的封装本来就没意义；而"按功能类别重新归包"
                        // 会把原来同包互访的包级私有成员变成跨包访问，
                        // 在字节码层统一放开，比在源码层逐个改声明可靠得多。
                        // 类本身也要放开：javac 报的
                        // "X is not public in Y; cannot be accessed from outside package"
                        // 说的是**包级私有的类**本身（不是它的成员）。
                        //
                        // 【2026-10-21 扩充】原来只放开 ACC_PRIVATE，包级私有（无修饰符）和
                        // protected 的成员没动。但改包名之后，原来的"同包互访"变成了跨包访问，
                        // javac 报 "method X in class Y cannot be applied to given types;
                        // reason: X(..) is not public in Y; cannot be accessed from outside package" ——
                        // 实测 397 个这类错误里 374 个是这个原因。
                        // 所以这里把**所有**非 public 成员都放开。
                        for (MethodNode m : node.methods) {
                            if ((m.access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_PRIVATE
                                    | Opcodes.ACC_PROTECTED)) != Opcodes.ACC_PUBLIC) {
                                m.access = (m.access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED))
                                        | Opcodes.ACC_PUBLIC;
                            }
                        }
                        for (FieldNode f : node.fields) {
                            if ((f.access & (Opcodes.ACC_PUBLIC | Opcodes.ACC_PRIVATE
                                    | Opcodes.ACC_PROTECTED)) != Opcodes.ACC_PUBLIC) {
                                f.access = (f.access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED))
                                        | Opcodes.ACC_PUBLIC;
                            }
                        }
                        if ((node.access & Opcodes.ACC_PUBLIC) == 0) {
                            node.access |= Opcodes.ACC_PUBLIC;
                        }
                    }
                    if (doClinit) {
                        // 把 <clinit> 的方法体搬到一个人工合成的静态方法里，
                        // <clinit> 只留一次调用。
                        // 为什么：Vineflower 面对不可约控制流时会把 <clinit> 渲染成
                        //     static { ... return; ... }
                        // 而 return; 在静态初始化块里是非法 Java（"return outside method"）。
                        // 搬进方法后 return; 就合法了，而且**不用在源码层做任何文本手术** ——
                        // 文本层的 do-while 包一层很容易把文件改坏。
                        MethodNode clinit = null;
                        for (MethodNode m : node.methods) {
                            if (m.name.equals("<clinit>")) { clinit = m; break; }
                        }
                        if (clinit != null && clinit.instructions != null && clinit.instructions.size() > 0) {
                            // 记下 <clinit> 里被赋值的静态字段：搬到方法后 final 就不能赋值了
                            Set<String> assigned = new HashSet<>();
                            for (AbstractInsnNode ins = clinit.instructions.getFirst(); ins != null; ins = ins.getNext()) {
                                if (ins instanceof FieldInsnNode && ins.getOpcode() == Opcodes.PUTSTATIC) {
                                    FieldInsnNode fi = (FieldInsnNode) ins;
                                    assigned.add(fi.owner + "." + fi.name);
                                }
                            }
                            if (!assigned.isEmpty()) {
                                for (FieldNode f : node.fields) {
                                    if ((f.access & Opcodes.ACC_STATIC) != 0
                                            && (f.access & Opcodes.ACC_FINAL) != 0
                                            && assigned.contains(node.name + "." + f.name)) {
                                        f.access &= ~Opcodes.ACC_FINAL;
                                    }
                                }
                            }
                            // 注意：不能加 ACC_SYNTHETIC —— 反编译器默认跳过 synthetic 方法，
                            // 那样静态初始化代码会整个丢失（编译能过，运行行为就变了）。
                            MethodNode helper = new MethodNode(
                                    Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                                    "__vfClinit__", "()V", null, null);
                            helper.access = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC;
                            helper.maxStack = clinit.maxStack;
                            helper.maxLocals = clinit.maxLocals;
                            // 搬运指令与 try-catch
                            InsnList body = new InsnList();
                            AbstractInsnNode first = clinit.instructions.getFirst();
                            while (first != null) {
                                AbstractInsnNode next = first.getNext();
                                body.add(first);
                                first = next;
                            }
                            // 结尾补一条 return（原来靠 athrow/goto 结束）。
                            // 但 <clinit> 原本就以 RETURN 收尾时不能再补 ——
                            // 反编译器会渲染成 "return; return;"，
                            // javac 报 "unreachable statement"（是错误，不是警告）。
                            boolean needReturn = true;
                            AbstractInsnNode last = body.getLast();
                            if (last != null) {
                                int op = last.getOpcode();
                                if (op == Opcodes.RETURN || op == Opcodes.ATHROW
                                        || op == Opcodes.IRETURN || op == Opcodes.LRETURN
                                        || op == Opcodes.FRETURN || op == Opcodes.DRETURN
                                        || op == Opcodes.ARETURN) {
                                    needReturn = false;
                                }
                            }
                            if (needReturn) body.add(new InsnNode(Opcodes.RETURN));
                            helper.instructions = body;
                            for (TryCatchBlockNode tcb : clinit.tryCatchBlocks) {
                                helper.tryCatchBlocks.add(tcb);
                            }
                            clinit.tryCatchBlocks.clear();
                            clinit.instructions = new InsnList();
                            clinit.instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                                    node.name, "__vfClinit__", "()V", false));
                            clinit.instructions.add(new InsnNode(Opcodes.RETURN));
                            clinit.maxStack = 1;
                            clinit.maxLocals = 0;
                            node.methods.add(helper);
                            clinitCount++;
                            // 接口的 static 方法是 Java 8 (class file 52) 才引入的。
                            // 混淆后的 jar 里很多接口还是 version 50 (Java 6)，
                            // 给它们加 static 方法后 javac 会报
                            //   "bad class file: static method found in version 50.0 classfile"
                            // 所以给被提取过的接口把版本提到 52。
                            if ((node.access & Opcodes.ACC_INTERFACE) != 0 && node.version < 52) {
                                node.version = 52;
                                ifaceBumped++;
                            }
                        }
                    }
                    ClassWriter cw = new ClassWriter(0);
                    ClassVisitor cv = cw;
                    if (doDup || !RENAME_CLASS.isEmpty() || !PKG_RENAME.isEmpty()) {
                        cv = new ClassRemapper(cv, remap);
                    }
                    node.accept(cv);
                    data = cw.toByteArray();
                    // zip 条目名必须与类名一致，否则 JVM 拒绝加载
                    if (oldInternal != null) {
                        String nn = remap.map(oldInternal);
                        if (nn != null && !nn.equals(oldInternal)) {
                            String ext = name.endsWith(".class") ? ".class" : ".SCL.lombok";
                            name = nn + ext;
                        }
                    }
                }
                ZipEntry ne = new ZipEntry(name);
                ne.setTime(e.getTime());
                zo.putNextEntry(ne);
                zo.write(data);
                zo.closeEntry();
            }
        }
        System.out.println("wrote " + out + "  size=" + Files.size(Paths.get(out)));
        System.out.println("clinit extracted to __vfClinit__ = " + clinitCount
                + "  (interfaces bumped to v52 = " + ifaceBumped + ")");
        System.out.println("enum fix: super->Object = " + enumSuperFixed
                + "  ctor super() = " + enumCtorFixed
                + "  ctor skipped = " + enumCtorSkipped);
    }

    static String paramDesc(String desc) {
        int close = desc.indexOf(')');
        return desc.substring(1, close);
    }

    /**
     * 把构造器里的 {@code super(name, ordinal)} 换成 {@code super()}。
     *
     * <p>字节码形态（javac 生成的枚举构造器，ZKM 改写后仍是这个形状）：
     * <pre>
     *   aload_0
     *   aload_1     // String name
     *   iload_2     // int ordinal
     *   invokespecial java/lang/Enum.<init>(Ljava/lang/String;I)V
     * </pre>
     * 父类换成 java/lang/Object 之后 Object 没有 (String,int) 构造器，
     * 所以这条调用必须改成 {@code invokespecial java/lang/Object.<init>()V}，
     * 并且把它压栈的两个参数（name / ordinal）一并从 InsnList 里删掉。
     *
     * <p>注意：构造器的**描述符不变**。枚举常量是靠 {@code new X("NAME", 0, ...)}
     * 创建的，改描述符会让所有调用点一起坏掉；name/ordinal 变成没人用的形参，
     * javac 不报错。
     *
     * @return true 表示确实改到了
     */
    static boolean fixEnumSuperCall(MethodNode m) {
        InsnList ins = m.instructions;
        boolean changed = false;
        for (AbstractInsnNode n = ins.getFirst(); n != null; ) {
            AbstractInsnNode next = n.getNext();
            if (n instanceof MethodInsnNode) {
                MethodInsnNode mi = (MethodInsnNode) n;
                if (mi.owner.equals("java/lang/Enum") && mi.name.equals("<init>")
                        && mi.desc.equals("(Ljava/lang/String;I)V")) {
                    AbstractInsnNode intInsn = n.getPrevious();     // 压 int ordinal
                    AbstractInsnNode refInsn = intInsn == null ? null : intInsn.getPrevious(); // 压 String name
                    if (intInsn != null && refInsn != null
                            && isIntPush(intInsn) && isRefPush(refInsn)) {
                        ins.remove(intInsn);
                        ins.remove(refInsn);
                        mi.owner = "java/lang/Object";
                        mi.desc = "()V";
                        mi.itf = false;
                        changed = true;
                    } else {
                        System.out.println("  WARN: 找不到 Enum.<init> 的两个参数压栈指令: "
                                + m.name + m.desc);
                    }
                }
            }
            n = next;
        }
        return changed;
    }

    /**
     * 该指令是否压入一个 int 值。
     *
     * <p>注意两点：
     * <ul>
     *   <li>JVM 的紧凑形式常量是 ILOAD_0..ILOAD_3 = 22..25、ALOAD_0..ALOAD_3 = 26..29
     *       （ILOAD=21、ALOAD=25）；本仓库这版 ASM 没有 ILOAD_0..3 / ALOAD_0..3 常量，
     *       而且它读字节码时**统一归一化成基形式 + 显式 var 索引**
     *       （即 aload_1 读出来是 opcode=ALOAD(25), var=1），所以要按基形式判。
     *   <li>ICONST_M1..ICONST_5 = 2..8，BIPUSH=16，SIPUSH=17，LDC=18。
     * </ul>
     */
    static boolean isIntPush(AbstractInsnNode n) {
        int op = n.getOpcode();
        if (op == Opcodes.ILOAD) return true;               // 21
        if (op >= 22 && op <= 25) return true;               // ILOAD_0..ILOAD_3
        if (op >= 2 && op <= 8) return true;                 // ICONST_M1..ICONST_5
        if (op == 16 || op == 17) return true;               // BIPUSH, SIPUSH
        if (op == 18 && n instanceof LdcInsnNode) {          // LDC
            Object c = ((LdcInsnNode) n).cst;
            return c instanceof Integer || c instanceof Short || c instanceof Byte
                    || c instanceof Character;
        }
        return false;
    }

    /** 该指令是否压入一个引用（这里是 String 名字）。 */
    static boolean isRefPush(AbstractInsnNode n) {
        int op = n.getOpcode();
        if (op == Opcodes.ALOAD) return true;                // 25
        if (op >= 26 && op <= 29) return true;               // ALOAD_0..ALOAD_3
        if (op == 18 && n instanceof LdcInsnNode) {          // LDC
            Object c = ((LdcInsnNode) n).cst;
            return c instanceof String;
        }
        return false;
    }

    /** 简单类名是否是合法的 Java 标识符（且不是关键字）。 */
    static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
            "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while",
            "true", "false", "null", "var", "record", "yield", "sealed", "permits", "non-sealed"));

    static boolean isJavaIdentifier(String s) {
        if (s.isEmpty()) return false;
        if (!Character.isJavaIdentifierStart(s.charAt(0))) return false;
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isJavaIdentifierPart(s.charAt(i))) return false;
        }
        return !JAVA_KEYWORDS.contains(s);
    }

    /** package-info -> PackageInfo，package-info_2 -> PackageInfo2 */
    static String toJavaIdentifier(String s) {
        StringBuilder sb = new StringBuilder();
        boolean up = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-' || c == '_' || c == '$' || c == '.' || !Character.isJavaIdentifierPart(c)) {
                if (c == '_' || c == '$' || c == '.') { sb.append(c); up = false; }
                else up = true;
                continue;
            }
            sb.append(up ? Character.toUpperCase(c) : c);
            up = false;
        }
        String r = sb.toString();
        if (r.isEmpty()) r = "Renamed";
        if (!Character.isJavaIdentifierStart(r.charAt(0))) r = "X" + r;
        return r;
    }

    static String retOf(String desc) {
        return desc.substring(desc.indexOf(')') + 1);
    }

    /** 返回类型 -> 合法 Java 标识符片段 */
    static String sanitize(String ret) {
        if (ret.equals("V")) return "void";
        if (ret.equals("I")) return "int";
        if (ret.equals("J")) return "long";
        if (ret.equals("Z")) return "boolean";
        if (ret.equals("D")) return "double";
        if (ret.equals("F")) return "float";
        if (ret.equals("B")) return "byte";
        if (ret.equals("S")) return "short";
        if (ret.equals("C")) return "char";
        if (ret.startsWith("L")) {
            String n = ret.substring(1, ret.length() - 1);
            int i = n.lastIndexOf('/');
            if (i >= 0) n = n.substring(i + 1);
            return n.replace('$', '_');
        }
        if (ret.startsWith("[")) return "arr" + sanitize(ret.substring(1));
        return "x";
    }
}
