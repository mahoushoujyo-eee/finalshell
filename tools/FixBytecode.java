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

    public static void main(String[] args) throws Exception {
        String in = args[0], out = args[1];
        boolean doDup = false, doEnum = false;
        for (int i = 2; i < args.length; i++) {
            if (args[i].equals("--dup")) doDup = true;
            if (args[i].equals("--enum")) doEnum = true;
            if (args[i].startsWith("--rename=")) {
                String[] kv = args[i].substring("--rename=".length()).split("=", 2);
                RENAME_CLASS.put(kv[0], kv[1]);
                System.out.println("class rename: " + kv[0] + " -> " + kv[1]);
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
                    ClassReader cr = new ClassReader(data);
                    ClassWriter cw = new ClassWriter(0);
                    ClassVisitor cv = cw;
                    if (doDup || !RENAME_CLASS.isEmpty()) cv = new ClassRemapper(cv, remap);
                    cr.accept(cv, 0);
                    if (doEnum) {
                        // 清掉假枚举的 ACC_ENUM：需要重新读一遍节点
                        ClassNode cn = new ClassNode();
                        new ClassReader(data).accept(cn, 0);
                        if (fakeEnums.contains(cn.name)) {
                            cn.access &= ~Opcodes.ACC_ENUM;
                            ClassWriter cw2 = new ClassWriter(0);
                            cn.accept(cw2);
                            data = cw2.toByteArray();
                        }
                    }
                    data = cw.toByteArray();
                    // zip 条目名必须与类名一致，否则 JVM 拒绝加载
                    if (oldInternal != null && !RENAME_CLASS.isEmpty()) {
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
    }

    static String paramDesc(String desc) {
        int close = desc.indexOf(')');
        return desc.substring(1, close);
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
