import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * 修复 Vineflower 在混淆字节码上的输出缺陷，让反编译结果能编译。
 *
 * 关键点是混淆器给一批普通类**伪造了 ACC_ENUM 标志**（有的还继承 java.lang.Enum），
 * Vineflower 会照着把它们当枚举渲染，javac 编译不过。这里按字节码事实还原：
 *
 *   真枚举（ACC_ENUM + 继承 java/lang/Enum + 无子类）  -> 保持 enum，常量写成枚举常量
 *   假枚举叶子（同上但无子类）                            -> 同样按真枚举处理
 *   假枚举子树根（有子类）                              -> 降级为 class X extends Enum
 *   假枚举子类（父类是假枚举）                          -> 降级为 class X extends <父类>
 *
 * 另外还处理：构造器 resugar 失败、枚举构造器签名、方法体整体反编译失败、孤立转型语句。
 *
 * 用法: java FixVineflower <srcRoot> <classinfo.tsv>
 */
public class FixVineflower {
    static int statEnum = 0, statCtor = 0, statUndec = 0, statCast = 0;
    static int statEnumCtor = 0, statFakeEnum = 0, statFakeSub = 0, statIface = 0, defaultFixed = 0, fixFailed = 0;

    /** internalName -> [super, kind, ctors] */
    static final Map<String, String[]> INFO = new HashMap<>();

    /** 组1=缩进 组2=修饰符 组3=类名 组4=extends/implements 子句 */
    static final Pattern RE_ENUM_HEAD =
            Pattern.compile("^(\\s*)((?:public\\s+|final\\s+|abstract\\s+)*)enum\\s+([\\w$.]+)(.*?)\\s*\\{\\s*$");
    static final Pattern RE_CONST_FIELD =
            Pattern.compile("^(\\s*)public static final ([\\w$.]+) (\\w+);\\s*$");
    static final Pattern RE_DECL = Pattern.compile(
            "^(\\s*)([A-Za-z_$][\\w$.]*(?:\\s*<[^>]*>)?(?:\\[\\])?)\\s+(var\\d+)\\s*=\\s*new\\s+([A-Za-z_$][\\w$.]*)\\s*;\\s*$");
    /** Vineflower 有时把 "Type varN = new Type;" 写成没有类型的 "varN = new Type;"。 */
    static final Pattern RE_DECL_NOTYPE = Pattern.compile(
            "^(\\s*)(var\\d+)\\s*=\\s*new\\s+([A-Za-z_$][\\w$.]*)\\s*;\\s*$");
    /** 仅有声明没有赋值的局部变量：Type varN; */
    static final Pattern RE_DECL_PLAIN = Pattern.compile(
            "^\\s*([A-Za-z_$][\\w$.]*(?:\\s*<[^>]*>)?(?:\\[\\])?)\\s+(var\\d+)\\s*;\\s*$");
    static final Pattern RE_INIT_1LINE = Pattern.compile(
            "^(\\s*)(var\\d+)\\.\\/\\* \\$VF: Unable to resugar constructor \\*\\/\\<init\\>\\((.*)\\);\\s*$");
    static final Pattern RE_INIT_MULTI = Pattern.compile(
            "^\\s*(var\\d+)\\.\\/\\* \\$VF: Unable to resugar constructor \\*\\/\\<init\\>\\((.*)$");
    static final Pattern RE_UNDEC = Pattern.compile("^\\s*// \\$VF: Couldn't be decompiled\\s*$");
    static final Pattern RE_CAST_STMT =
            Pattern.compile("^\\s*\\([A-Za-z_$][\\w$.]*\\)\\s*[A-Za-z_$][\\w$]*;\\s*$");
    static final Pattern RE_ENUM_CTOR = Pattern.compile("^(\\s*)private\\s+([\\w$.]+)\\(\\s*\\)\\s*\\{\\s*$");
    static final Pattern RE_PKG = Pattern.compile("^\\s*package\\s+([\\w.]+)\\s*;", Pattern.MULTILINE);
    static final Pattern RE_CLASS_DECL = Pattern.compile(
            "^(?:public\\s+|final\\s+|abstract\\s+|static\\s+)*(?:class|interface|enum)\\s+(\\w+)",
            Pattern.MULTILINE);
    /** 静态块里 new 出一个枚举常量：CONST = new X(); */
    static final Pattern RE_CONST_NEW = Pattern.compile(
            "^\\s*([A-Za-z_$][\\w$]*)\\s*=\\s*new\\s+([\\w$.]+)\\(\\s*\\);\\s*$");

    public static void main(String[] args) throws Exception {
        Path root = Paths.get(args[0]);
        if (args.length > 1 && Files.exists(Paths.get(args[1]))) {
            for (String[] r : Tsv.read(args[1])) {
                if (r.length >= 3 && !r[0].equals("internal")) {
                    INFO.put(r[0], new String[]{r[1], r[2], r.length > 3 ? r[3] : ""});
                }
            }
        }
        System.out.println("classinfo entries=" + INFO.size());

        List<Path> files = new ArrayList<>();
        try (java.util.stream.Stream<Path> st = Files.walk(root)) {
            for (Path p : (Iterable<Path>) st.filter(x -> x.toString().endsWith(".java"))::iterator) {
                files.add(p);
            }
        }
        int changed = 0;
        Map<Path, String> fixed = new LinkedHashMap<>();
        Map<Path, String> internals = new LinkedHashMap<>();
        Map<Path, String> originals = new LinkedHashMap<>();
        // 预扫描：先收集全工程所有 interface 的名字。
        // 降级 interface 时需要知道它 extends 的那些是不是也是 interface
        // （Java 的 interface 只能 extends interface，所以理论上都是，
        //  但混进来的第三方接口可能已经不存在了，所以查一下更稳）。
        for (Path f : files) {
            String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
            for (String l : src.split("\n", -1)) {
                Matcher im = RE_IFACE_HEAD.matcher(l);
                if (im.matches()) ALL_INTERFACES.add(lastSeg(im.group(2)));
            }
        }
        for (Path f : files) {
            String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
            String internal = internalNameOf(src, f);
            internals.put(f, internal);
            originals.put(f, src);
            // 单个文件处理失败不能拖垮整轮 —— 之前一次 IndexOutOfBounds
            // 让 5,386 个文件一个都没写出去，整轮白跑。
            String fixedSrc;
            try {
                fixedSrc = fix(src, internal);
            } catch (Throwable t) {
                fixFailed++;
                System.out.println("  fix() failed on " + f.getFileName() + " : " + t);
                fixedSrc = src;
            }
            fixed.put(f, fixedSrc);
        }
        // 改名沿继承链传播后，再统一套用一遍
        // propagateRenames();  // 传播会引入新的冲突，暂不启用
        for (Path f : files) {
            String src = fixed.get(f);
            String orig = originals.get(f);
            String rel = root.relativize(f).toString().replace('\\', '/');
            String internal = internals.get(f);
            String out = applyForcedRenames(src, internal);
            // 文件级个案修正
            for (Map.Entry<String, String[][]> e : FILE_TEXT_FIXES.entrySet()) {
                if (!rel.toLowerCase(Locale.ROOT).endsWith(e.getKey().toLowerCase(Locale.ROOT))) continue;
                for (String[] fx : e.getValue()) out = out.replace(fx[0], fx[1]);
            }
            if (!out.equals(orig)) {
                Files.write(f, out.getBytes(StandardCharsets.UTF_8));
                changed++;
            }
        }
        // 实现者：被降级的接口不能留在 implements 列表里
        //（Java 的类只能有一个 extends，所以已有 extends 时只能把降级接口丢掉；
        //  它原来的方法实现者自己类体里已经写了）
        if (!IFACE_TO_CLASS.isEmpty()) {
            System.out.println("interfaces downgraded to class: " + IFACE_TO_CLASS);
            // 降级接口的全限定名（实现者可能在别的包里，需要 import）
            Map<String, String> ifaceFqcn = new LinkedHashMap<>();
            for (Path f : files) {
                String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                Matcher pm = RE_PKG.matcher(src);
                if (!pm.find()) continue;
                String pkg = pm.group(1);
                for (String n : IFACE_TO_CLASS) {
                    if (f.getFileName().toString().equals(n + ".java")) {
                        ifaceFqcn.put(n, pkg + "." + n);
                    }
                }
            }
            int qualifyFiles = 0, qualifyHits = 0;
            for (Path f : files) {
                String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                Map<String, String> qualify = new LinkedHashMap<>();
                String out = rewriteIfaceExtends(src, qualify);
                if (!qualify.isEmpty()) {
                    qualifyFiles++;
                    qualifyHits += qualify.size();
                    out = qualifyStaticFields(out, qualify);
                    out = ensureImports(out, ifaceFqcn, qualify.values());
                }
                out = stripIfaceMethodQualifier(out);
                if (!out.equals(src)) Files.write(f, out.getBytes(StandardCharsets.UTF_8));
            }
            System.out.println("iface fields qualified: files=" + qualifyFiles + " fields=" + qualifyHits);
        }
        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(args.length > 2 ? args[2] : "dup-renames.tsv"), StandardCharsets.UTF_8))) {
            w.println("class	origName	params	retType	newName");
            for (String[] r : DUP_RENAMES) w.println(String.join("	", r));
        }
        System.out.println("files=" + files.size() + " changed=" + changed
                           + " dupMethodRenames=" + DUP_RENAMES.size()
                           + " fixFailed=" + fixFailed + " defaultFixed=" + defaultFixed);
        System.out.println("enumConstList=" + statEnum + " fakeEnumToClass=" + statFakeEnum
                           + " fakeEnumSubToClass=" + statFakeSub + " enumCtorFixed=" + statEnumCtor
                           + " ctorFixed=" + statCtor + " undecodableFixed=" + statUndec
                           + " castStmtsRemoved=" + statCast);
    }

    /** 按内部类名找变量类型覆盖表。 */
    static Map<String, String> typeOverrideFor(String internal) {
        if (internal == null) return null;
        for (Map.Entry<String, Map<String, String>> e : TYPE_OVERRIDE.entrySet()) {
            // internal 用斜杠分隔，键也用斜杠
            if ((internal + ".java").toLowerCase(Locale.ROOT).endsWith(e.getKey().toLowerCase(Locale.ROOT))) return e.getValue();
        }
        return null;
    }


    /**
     * 混淆器造了"同名同参但返回类型不同"的方法对。字节码允许，Java 源码不允许。
     * 这里把后出现的那个改名成 <name>$1 / <name>$2 ...，并把映射记进 DUP_RENAMES，
     * 供反射表同步（反射表决定改写后源码里写的方法名）。
     */
    static final List<String[]> DUP_RENAMES = new ArrayList<>();
    static final Pattern RE_METHOD_DECL = Pattern.compile(
            "^(\s*)((?:public\s+|private\s+|protected\s+|static\s+|final\s+|synchronized\s+|abstract\s+|native\s+)*)"
            + "([\\w.$<>\\[\\], ?]+?)\\s+([\\w$]+)\\(([^)]*)\\)\\s*(\\{.*|throws.*)$");
    static final Pattern RE_PARAM_TYPE = Pattern.compile("([\\w.$<>\\[\\], ?]+?)\\s+\\w+");

    static String fixDupMethods(String src) {
        String[] lines = src.split("\n", -1);
        Map<String, String> seen = new HashMap<>();   // name+params -> 首个声明的返回类型
        Set<String> usedNames = new HashSet<>();
        for (String l : lines) {
            Matcher um = RE_METHOD_DECL.matcher(l);
            if (um.matches()) usedNames.add(um.group(4));
        }
        StringBuilder sb = new StringBuilder();
        String cls = null;
        for (String l : lines) {
            Matcher cm = RE_CLASS_DECL.matcher(l);
            if (cm.find() && cls == null) cls = cm.group(1);
            Matcher m = RE_METHOD_DECL.matcher(l);
            if (m.matches()) {
                String ret = m.group(3).trim();
                String name = m.group(4);
                String params = normalizeParams(m.group(5));
                String key = name + "(" + params + ")";
                String prev = seen.get(key);
                if (prev != null && !name.equals(cls)) {
                    // 用返回类型派生唯一名：同名同参但返回类型不同的方法，名字必然不同
                    String base = name + "$" + sanitize(ret);
                    String neu = base;
                    int n = 2;
                    while (usedNames.contains(neu)) neu = base + "_" + (n++);
                    usedNames.add(neu);
                    seen.put(key + "#" + n, ret);
                    DUP_RENAMES.add(new String[]{cls, name, params, ret, neu});
                    l = m.group(1) + m.group(2) + ret + " " + neu + "(" + m.group(5) + ") " + m.group(6);
                } else {
                    seen.put(key, ret);
                }
            }
            sb.append(l).append('\n');
        }
        return sb.toString();
    }


    /** 把类型名转成可以拼进标识符的片段。 */
    static String sanitize(String type) {
        String t = type.replaceAll("[\\s<>\\[\\],?.]", "");
        return t.isEmpty() ? "x" : t;
    }

    /** 把参数列表归一化成"类型,类型"形式（去掉参数名）。 */
    static String normalizeParams(String params) {
        StringBuilder sb = new StringBuilder();
        if (params.trim().isEmpty()) return "";
        for (String p : params.split(",")) {
            Matcher m = RE_PARAM_TYPE.matcher(p.trim());
            String t = m.find() ? m.group(1).trim() : p.trim();
            if (sb.length() > 0) sb.append(',');
            sb.append(t);
        }
        return sb.toString();
    }

    /** 强制定名：内部类名 -> (方法名+参数) -> 新名 */
    static final Map<String, Map<String, String>> FORCED_RENAMES = new LinkedHashMap<>();

    /** 改名必须沿继承链传播，否则子类覆写会失配。这里迭代到不动点。 */
    static void propagateRenames() {
        Map<String, List<String>> subs = new HashMap<>();
        for (Map.Entry<String, String[]> e : INFO.entrySet()) {
            String sup = e.getValue()[0];
            if (sup != null && !sup.isEmpty()) {
                subs.computeIfAbsent(sup, k -> new ArrayList<>()).add(e.getKey());
            }
        }
        for (String[] r : DUP_RENAMES) {
            FORCED_RENAMES.computeIfAbsent(r[0], k -> new LinkedHashMap<>())
                    .put(r[1] + "(" + r[2] + ")", r[4]);
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Map.Entry<String, Map<String, String>> e : FORCED_RENAMES.entrySet()) {
                for (String sub : subs.getOrDefault(e.getKey(), Collections.emptyList())) {
                    Map<String, String> target = FORCED_RENAMES.get(sub);
                    if (target == null) continue;
                    for (Map.Entry<String, String> f : e.getValue().entrySet()) {
                        if (!target.containsKey(f.getKey())) {
                            target.put(f.getKey(), f.getValue());
                            changed = true;
                        }
                    }
                }
            }
        }
    }

    /** 应用强制改名。 */
    static String applyForcedRenames(String src, String internal) {
        if (internal == null) return src;
        Map<String, String> m = FORCED_RENAMES.get(internal);
        if (m == null || m.isEmpty()) return src;
        String[] lines = src.split("\n", -1);
        Set<String> fileNames = new HashSet<>();
        for (String l : lines) {
            Matcher um = RE_METHOD_DECL.matcher(l);
            if (um.matches()) fileNames.add(um.group(4));
        }
        StringBuilder sb = new StringBuilder();
        for (String l : lines) {
            Matcher mm = RE_METHOD_DECL.matcher(l);
            if (mm.matches()) {
                String params = normalizeParams(mm.group(5));
                String neu = m.get(mm.group(4) + "(" + params + ")");
                // 目标名被占用就再加后缀，保证不冲突
                if (neu != null) {
                    String base = neu;
                    int q = 2;
                    while (fileNames.contains(neu)) neu = base + "_" + (q++);
                }
                if (neu != null) {
                    l = mm.group(1) + mm.group(2) + mm.group(3) + " " + neu
                            + "(" + mm.group(5) + ") " + mm.group(6);
                }
            }
            sb.append(l).append('\n');
        }
        return sb.toString();
    }

    /** 从源码推断内部类名：包名 + 类声明名。 */
    static String internalNameOf(String src, Path f) {
        Matcher pm = RE_PKG.matcher(src);
        String pkg = pm.find() ? pm.group(1) : "";
        Matcher cm = RE_CLASS_DECL.matcher(src);
        if (!cm.find()) return null;
        return pkg.isEmpty() ? cm.group(1) : pkg.replace('.', '/') + "/" + cm.group(1);
    }

    /**
     * 少数几个文件的个案修正。Vineflower 在这两处丢了局部变量的类型声明，
     * 泛化处理会误伤别处，所以按文件精确处理。
     */
    static final Map<String, String[][]> FILE_TEXT_FIXES = new LinkedHashMap<>();
    static {
        // 局部变量 var10/var11 的类型声明被 Vineflower 丢了。
        // 从字节码可知：org.V.G 的构造器是 (File[])，与 var11.<init>(var10002) 对应。
        FILE_TEXT_FIXES.put("org/V/_L.java", new String[][]{
                {"label22: {", "org.V.G var10;\n      org.V.G var11;\n\n      label22: {"},
        });
        // 增强 for 的循环变量声明成了 String，实际装的是 List 元素。
        FILE_TEXT_FIXES.put("com/QL.java", new String[][]{
                // 增强 for 的循环变量必须带类型声明；原来的 "String var15;" 是 Vineflower 误加的
                {"String var15;" + "\n", ""},
                {"for (var15 : var1.n())", "for (Object var15 : var1.n())"},
        });
    }

    /** 变量类型覆盖：文件名后缀 -> 变量名 -> 类型 */
    static final Map<String, Map<String, String>> TYPE_OVERRIDE = new LinkedHashMap<>();
    static {
        Map<String, String> m = new HashMap<>();
        m.put("var10", "org.V.G");
        m.put("var11", "org.V.G");
        TYPE_OVERRIDE.put("org/V/_L.java", m);
    }

    static String fix(String src, String internal) {
        src = fixIfaceBlankFinals(src);
        src = fixEnumStaticBlock(src);
        if (internal != null && internal.endsWith("reflect/Registry")) {
            src = fixRegistryGenerics(src);
        }
        src = fixRedundantCasts(src);
        src = fixFakeEnum(src, internal);        src = fixEnumConstList(src);
        src = fixEnumCtor(src, internal);
        src = fixCtor(src, typeOverrideFor(internal));
        src = fixUndecodable(src);
        src = fixCastStmt(src);
        src = fixDupMethods(src);
        return src;
    }

    /**
     * 把类声明里的 implements 列表按"被降级成类的接口"重新整理：
     *   implements A, I   ->   extends I implements A      （没有别的 extends 时）
     *   extends B implements A, I -> extends B implements A （Java 不允许多继承，I 只能丢）
     *
     * <p>第二种情况下 I 被丢掉，但它携带的静态字段在实现者里可能被**裸访问**
     * （原来靠 implements 继承接口的静态字段作用域）。丢掉 implements 后裸访问
     * 就编译不过，所以要把这些裸访问改成显式限定 {@code I.字段}。
     * {@code qualifyOut} 收集 字段名 -> 接口名 的映射，供调用方做限定改写。
     */
    static String rewriteIfaceExtends(String src, Map<String, String> qualifyOut) {
        String[] lines = src.split("\n", -1);
        for (int i = 0; i < lines.length; i++) {
            String l = lines[i];
            int idx = l.indexOf(" implements ");
            if (idx < 0) continue;
            int brace = l.indexOf('{', idx);
            if (brace < 0) continue;
            String head = l.substring(0, brace);
            String tail = l.substring(brace);
            // 顺序很重要：先切 implements，再在剩下的部分里切 extends。
            // 反过来切会把 "extends B implements A" 整段当成 ext，
            // 于是 before 里找不到 " implements " 直接 continue —— 改写静默失效。
            int ii = head.indexOf(" implements ");
            if (ii < 0) continue;
            String base = head.substring(0, ii);
            String implList = head.substring(ii + " implements ".length());
            int ei = base.indexOf(" extends ");
            String namePart = base, ext = "";
            if (ei >= 0) { namePart = base.substring(0, ei); ext = base.substring(ei); }
            List<String> keep = new ArrayList<>(), promoted = new ArrayList<>();
            for (String e : implList.split(",")) {
                String t = e.trim();
                if (t.isEmpty()) continue;
                // 可能是带包名的写法（com.finalshell.core.Nd4），按简单名比对
                String simple = t.substring(t.lastIndexOf('.') + 1);
                if (IFACE_TO_CLASS.contains(t) || IFACE_TO_CLASS.contains(simple)) promoted.add(simple);
                else keep.add(t);
            }
            if (promoted.isEmpty()) continue;
            StringBuilder nb = new StringBuilder(namePart);
            if (ext.isEmpty()) {
                // 没有别的父类：降级接口直接顶上去当父类
                nb.append(" extends ").append(String.join(", ", promoted));
            } else {
                // 已有父类：Java 不允许多继承，降级接口只能从 implements 里丢掉，
                // 但它携带的静态字段还要能被访问 -> 记下来做显式限定
                nb.append(ext);
                for (String p : promoted) {
                    for (Map.Entry<String, String> fe : IFACE_FIELDS.entrySet()) {
                        if (fe.getValue().equals(p)) qualifyOut.put(fe.getKey(), p);
                    }
                }
            }
            if (!keep.isEmpty()) nb.append(" implements ").append(String.join(", ", keep));
            nb.append(tail);
            lines[i] = nb.toString();
        }
        return String.join("\n", lines);
    }

    /**
     * 把裸访问的静态字段改成显式限定：{@code q} -> {@code Nd4.q}。
     * 只在该文件确实 implements 过被降级接口时才会传进来非空映射。
     */
    static String qualifyStaticFields(String src, Map<String, String> fields) {
        if (fields.isEmpty()) return src;
        String out = src;
        for (Map.Entry<String, String> e : fields.entrySet()) {
            String f = e.getKey(), iface = e.getValue();
            // 前面不是 . / 标识符字符，才算"裸访问"
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(
                    "(?<![\\w.$])" + java.util.regex.Pattern.quote(f) + "\\b");
            out = p.matcher(out).replaceAll(iface + "." + f);
        }
        return out;
    }

    /**
     * 接口里的字段隐式是 public static final，不允许"空 final"再在静态块里赋值，
     * javac 会报"需要="。这些接口实际上是带静态表的抽象契约，
     * 降级成 "public abstract class X" + "public static Type f;"，
     * 再把实现者的 implements X 改成 extends X。
     */
    static final Set<String> IFACE_TO_CLASS = new LinkedHashSet<>();
    /** 降级接口携带的静态字段名 -> 接口名（用于把实现者里的裸访问改成显式限定） */
    static final Map<String, String> IFACE_FIELDS = new LinkedHashMap<>();
    /** 全工程里所有 interface 的名字（判断降级后 extends 列表该怎么拆） */
    static final Set<String> ALL_INTERFACES = new LinkedHashSet<>();
    // interface 头：允许带 extends 子句
    //   public interface C_5 extends E22, P_2_4 {
    //   public interface E22 {
    static final Pattern RE_IFACE_HEAD =
            Pattern.compile("^(\\s*)(?:public\\s+|abstract\\s+)*interface\\s+([\\w$.]+)"
                    + "((?:\\s+extends\\s+[^{]+?)?)\\s*\\{\\s*$");
    static final Pattern RE_BLANK_FINAL =
            Pattern.compile("^\\s*([A-Za-z_$][\\w$.]*(?:\\s*<[^>]*>)?(?:\\[\\])?)\\s+([A-Za-z_$][\\w$]*)\\s*;\\s*$");
    static final Pattern RE_STATIC_BLOCK =
            Pattern.compile("^\\s*static\\s*\\{\\s*$");

    static String fixIfaceBlankFinals(String src) {
        String[] lines = src.split("\n", -1);
        int headIdx = -1;
        String ifaceName = null;
        String extendsClause = "";
        for (int i = 0; i < Math.min(lines.length, 12); i++) {
            Matcher m = RE_IFACE_HEAD.matcher(lines[i]);
            if (m.matches()) {
                headIdx = i; ifaceName = m.group(2);
                extendsClause = m.group(3) == null ? "" : m.group(3).trim();
                break;
            }
        }
        if (headIdx < 0) return src;
        boolean hasBlank = false;
        boolean hasStaticBlock = false;
        for (int i = headIdx + 1; i < Math.min(lines.length, headIdx + 14); i++) {
            if (RE_BLANK_FINAL.matcher(lines[i]).matches()) { hasBlank = true; break; }
            if (RE_STATIC_BLOCK.matcher(lines[i]).matches()) { hasStaticBlock = true; break; }
            if (lines[i].trim().endsWith(";")) break;
        }
        // 接口在 Java 源码里既不能有 static 块，也不能有没初值的 final 字段。
        // 这两种情况都必须降级成 class。
        if (!hasBlank && !hasStaticBlock) return src;
        // 只处理类头之后、第一个方法/静态块之前的字段区，
        // 否则会误伤方法体里的局部变量声明（"char[] var10002;" 之类）
        int fieldEnd = headIdx + 1;
        for (int i = headIdx + 1; i < lines.length; i++) {
            String l = lines[i].trim();
            if (l.isEmpty() || l.startsWith("//") || l.startsWith("*") || l.startsWith("/*")) continue;
            if (l.contains("(") || l.startsWith("{")) break;
            fieldEnd = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            String l = lines[i];
            if (i == headIdx) {
                Matcher hm = RE_IFACE_HEAD.matcher(l);
                hm.matches();
                sb.append(hm.group(1)).append("public abstract class ")
                  .append(ifaceName).append(splitExtends(extendsClause)).append(" {\n");
                IFACE_TO_CLASS.add(ifaceName);
                continue;
            }
            Matcher bm = RE_BLANK_FINAL.matcher(l);
            if (i > headIdx && i < fieldEnd && bm.matches() && !bm.group(2).equals(ifaceName)) {
                sb.append("   public static ").append(bm.group(1)).append(' ').append(bm.group(2)).append(";\n");
                IFACE_FIELDS.put(bm.group(2), ifaceName);
                statIface++;
                continue;
            }
            // 接口的 default 方法降级成 class 之后，"default" 修饰符不再合法
            //（javac: modifier default not allowed here）
            if (hasStaticBlock || hasBlank) {
                String d = l.replaceFirst("(?m)^(\\s*)default\\s+", "$1");
                if (!d.equals(l)) { sb.append(d).append('\n'); defaultFixed++; continue; }
            }
            sb.append(l).append('\n');
        }
        return sb.toString();
    }

    /**
     * enum 不允许 static 初始化块（JLS 8.9.2），但反编译器会把 {@code <clinit>}
     * 渲染成 {@code static { ... }}。这里把块内容搬进一个 static 方法，
     * 再用"静态字段的初始化表达式"触发它 —— 字段初始化发生在 {@code <clinit>} 里，
     * 位置和原来的静态块一致（块通常在常量之后），语义等价。
     */
    static String fixEnumStaticBlock(String src) {
        String[] lines = src.split("\n", -1);
        boolean isEnum = false;
        for (String l : lines) {
            if (RE_ENUM_HEAD.matcher(l).matches()) { isEnum = true; break; }
        }
        if (!isEnum) return src;
        int enumHead = -1;
        for (int k = 0; k < lines.length; k++) {
            if (RE_ENUM_HEAD.matcher(lines[k]).matches()) { enumHead = k; break; }
        }
        for (int i = 0; i < lines.length; i++) {
            if (!RE_STATIC_BLOCK.matcher(lines[i]).matches()) continue;
            String indent = lines[i].substring(0, lines[i].length() - lines[i].trim().length());
            // 找块结束：同缩进的 "}"
            int end = -1;
            for (int j = i + 1; j < lines.length; j++) {
                if (lines[j].trim().equals("}") && lines[j].startsWith(indent)) { end = j; break; }
            }
            if (end < 0) continue;
            StringBuilder body = new StringBuilder();
            for (int j = i + 1; j < end; j++) body.append(lines[j]).append('\n');
            StringBuilder out = new StringBuilder();
            for (int j = 0; j < lines.length; j++) {
                if (j < i) { out.append(lines[j]).append('\n'); continue; }
                if (j == i) {
                    // enum 体的第一个成员必须是枚举常量。空 enum（原本就没有常量）
                    // 直接放字段会被 javac 拒（"enum constant expected here"），
                    // 所以补一个 ";" 表示常量列表结束。
                    boolean hasConst = false;
                    for (int k = enumHead + 1; k < i; k++) {
                        String t = lines[k].trim();
                        if (t.isEmpty() || t.startsWith("//") || t.startsWith("*") || t.startsWith("/*")) continue;
                        hasConst = true;
                        break;
                    }
                    if (!hasConst) out.append(indent).append(";\n");
                    out.append(indent).append("private static final Object __vfClinitTrigger = __vfClinitTrigger();\n");
                    out.append(indent).append("private static Object __vfClinitTrigger() {\n");
                    out.append(body);
                    out.append(indent).append("   return null;\n");
                    out.append(indent).append("}\n");
                    j = end;
                    continue;
                }
                out.append(lines[j]).append('\n');
            }
            return out.toString();
        }
        return src;
    }

    /**
     * 被降级的接口，其方法在实现者里被 Vineflower 写成带接口限定前缀的形式：
     *     public EnumSet C_5.G() { ... }
     * 接口降级成 class 之后这个前缀必须去掉，否则 javac 报
     * "invalid method declaration; return type required"。
     * 只处理成员方法声明行（行首是修饰符关键字），避免误伤表达式里的静态调用。
     */
    static String stripIfaceMethodQualifier(String src) {
        if (IFACE_TO_CLASS.isEmpty()) return src;
        String[] lines = src.split("\n", -1);
        for (int i = 0; i < lines.length; i++) {
            String t = lines[i].trim();
            if (t.isEmpty() || !t.contains("(")) continue;
            if (!RE_MODIFIER_START.matcher(t).find()) continue;
            for (String n : IFACE_TO_CLASS) {
                String q = java.util.regex.Pattern.quote(n);
                lines[i] = java.util.regex.Pattern.compile(
                        "(\\b" + q + ")\\.(\\w+)\\s*\\(").matcher(lines[i]).replaceAll("$2(");
            }
        }
        return String.join("\n", lines);
    }

    static final Pattern RE_MODIFIER_START =
            Pattern.compile("^(?:public|protected|private|static|final|abstract|synchronized|native|default|strictfp)\\b");

    /**
     * 接口的 extends 列表（全是接口）降级成 class 后要拆开：
     *   extends A, B   ->   extends A implements B
     * 因为 Java 的类只能 extends 一个父类。
     * 若只有一个父接口，直接 extends 它。
     */
    static String splitExtends(String ext) {
        if (ext == null || ext.isEmpty()) return "";
        String body = ext.trim();
        if (body.toLowerCase(Locale.ROOT).startsWith("extends ")) {
            body = body.substring("extends ".length()).trim();
        }
        List<String> parts = new ArrayList<>();
        for (String p : body.split(",")) {
            String t = p.trim();
            if (!t.isEmpty()) parts.add(t);
        }
        if (parts.isEmpty()) return "";
        if (parts.size() == 1) return " extends " + parts.get(0);
        return " extends " + parts.get(0) + " implements " + String.join(", ", parts.subList(1, parts.size()));
    }

    /**
     * 确保降级接口的全限定名被 import（实现者可能在别的包里）。
     */
    static String ensureImports(String src, Map<String, String> ifaceFqcn, Collection<String> simpleNames) {
        Set<String> need = new LinkedHashSet<>();
        String pkg = null;
        Matcher pm = RE_PKG.matcher(src);
        if (pm.find()) pkg = pm.group(1);
        for (String s : simpleNames) {
            String fq = ifaceFqcn.get(s);
            if (fq == null) continue;
            int dot = fq.lastIndexOf('.');
            if (dot > 0 && fq.substring(0, dot).equals(pkg)) continue;   // 同包
            if (src.contains("import " + fq + ";")) continue;
            need.add(fq);
        }
        if (need.isEmpty()) return src;
        String[] lines = src.split("\n", -1);
        int lastImport = -1;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].trim().startsWith("import ")) lastImport = i;
        }
        StringBuilder sb = new StringBuilder();
        if (lastImport >= 0) {
            for (int i = 0; i <= lastImport; i++) sb.append(lines[i]).append('\n');
            for (String s : need) sb.append("import ").append(s).append(";\n");
            for (int i = lastImport + 1; i < lines.length; i++) sb.append(lines[i]).append('\n');
        } else {
            int pkgLine = -1;
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].trim().startsWith("package ")) { pkgLine = i; break; }
            }
            for (int i = 0; i < lines.length; i++) {
                sb.append(lines[i]).append('\n');
                if (i == pkgLine) {
                    sb.append('\n');
                    for (String s : need) sb.append("import ").append(s).append(";\n");
                }
            }
        }
        return sb.toString();
    }

    /**
     * Registry（混淆器的常量/方法注册表）的辅助方法泛型化。
     *
     * <p>这些方法原本返回 {@code Object} 或 {@code Object[]}，但调用点把它们赋给
     * 各种具体类型（DY3 / String / int / boolean …），javac 报
     * "incompatible types: Object[] cannot be converted to X"（实测 3,411 处）。
     *
     * <p>把签名改成 {@code <T> T} 后，类型实参由赋值目标推断，调用点无需改动；
     * 运行时行为完全不变（泛型只影响编译期，擦除后仍是 Object）。
     */
    static String fixRegistryGenerics(String src) {
        String[] lines = src.split("\n", -1);
        int genericized = 0, casts = 0;
        for (int i = 0; i < lines.length; i++) {
            Matcher m = RE_REGISTRY_RET.matcher(lines[i]);
            if (!m.matches()) continue;
            // 改声明：public static Object[] foo(  ->  public static <T> T foo(
            lines[i] = RE_REGISTRY_RET.matcher(lines[i])
                    .replaceFirst(Matcher.quoteReplacement(m.group(1) + "public static <T> T " + m.group(2) + m.group(3)));
            genericized++;
            String indent = m.group(1);
            int end = -1;
            for (int j = i + 1; j < lines.length; j++) {
                if (lines[j].trim().equals("}") && lines[j].startsWith(indent)) { end = j; break; }
            }
            if (end < 0) continue;
            for (int j = i + 1; j < end; j++) {
                if (RE_RETURN.matcher(lines[j]).matches()) {
                    // return expr;  ->  return (T) expr;
                    lines[j] = lines[j].replaceFirst("return ", "return (T) ");
                    casts++;
                }
            }
            i = end;
        }
        if (genericized == 0) return src;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) sb.append(lines[i]).append('\n');
        System.out.println("registry generics: methods=" + genericized + " casts=" + casts);
        return sb.toString();
    }

    static final Pattern RE_REGISTRY_RET =
            Pattern.compile("^(\\s*)public static (?:Object|Object\\[\\]) (\\w+)(\\(.*)$");    static final Pattern RE_RETURN =
            Pattern.compile("^\\s*return \\S.*;\\s*$");

    /**
     * 删掉辅助方法调用前多余的 (Object[]) / (Object) 强转。
     *
     * <p>反编译器不知道 Ref.h / Registry.packArgs 返回的到底是什么类型，
     * 一律按 Object[] 处理，于是给每个调用点加了 {@code (Object[])} 强转。
     * 但这些方法现在都是泛型 {@code <T> T}，类型实参由赋值目标推断，
     * 强转反而把 T 钉死成 Object[]，导致
     * "incompatible types: Object[] cannot be converted to DY3"（实测 3,178 处）。
     *
     * <p>运行时返回的是注册表里方法的**真实**返回类型，删掉强转才是对的。
     */
    static String fixRedundantCasts(String src) {
        // 只针对我们自己的辅助方法，别的地方的 (Object[]) 强转是有意义的
        return src.replaceAll("\\(Object\\[\\]\\)\\s*(Ref\\.h2?\\(|Registry\\.(emptyArgs|packArgs)\\()", "$1")
                  .replaceAll("\\(Object\\)\\s*(Ref\\.h2?\\(|Registry\\.(emptyArgs|packArgs)\\()", "$1");
    }

    static String lastSeg(String s) {
        int i = s.lastIndexOf('.');
        return i < 0 ? s : s.substring(i + 1);
    }

    // ---------- 假枚举降级 ----------
    static String fixFakeEnum(String src, String internal) {
        if (internal == null) return src;
        String[] info = INFO.get(internal);
        if (info == null || !"fake".equals(info[1])) return src;
        String superName = info[0];
        boolean directEnumSuper = "java/lang/Enum".equals(superName);
        // 有子类的（父类是假枚举）-> class X extends <父类简单名>
        // 直接继承 java.lang.Enum 但有子类 -> class X extends Enum
        String[] lines = src.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        for (String l : lines) {
            Matcher em = RE_ENUM_HEAD.matcher(l);
            if (!em.matches()) { sb.append(l).append('\n'); continue; }
            String cls = em.group(3);
            String rest = em.group(4).trim();
            String ext;
            if (rest.contains("extends")) {
                ext = " " + rest;                 // 原行已有 super/implements，整段保留
            } else {
                ext = " extends " + (directEnumSuper ? "Enum" : superName.replace('/', '.'));
            }
            sb.append(em.group(1)).append(em.group(2)).append("class ").append(cls)
              .append(ext).append(" {\n");
            if (directEnumSuper) statFakeEnum++; else statFakeSub++;
            // 构造函数：private X() {} -> protected X(String name, int ordinal) { super(name, ordinal); }
            // 单独处理，见 fixEnumCtor
        }
        String out = sb.toString();
        // 静态块里的常量创建：CONST = new X(); -> CONST = new X("CONST", ordinal);
        out = fixConstNew(out, internal);
        // 直接继承 Enum 的要补 compareTo
        if (directEnumSuper) out = addCompareTo(out, internal);
        return out;
    }

    /** 把静态块里的 "C = new X();" 改成 "C = new X(\"C\", 序号);"，序号按出现顺序。 */
    static String fixConstNew(String src, String internal) {
        String[] lines = src.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        int ord = 0;
        for (String l : lines) {
            Matcher m = RE_CONST_NEW.matcher(l);
            if (m.matches()) {
                String cname = m.group(1);
                String type = m.group(2);
                sb.append(l.replaceFirst("new\\s+" + Pattern.quote(type) + "\\(\\s*\\)",
                        "new " + type + "(\"" + cname + "\", " + (ord++) + ")"));
                sb.append('\n');
                continue;
            }
            sb.append(l).append('\n');
        }
        return sb.toString();
    }

    static String addCompareTo(String src, String internal) {
        String cls = lastSeg(internal);
        if (src.contains("public int compareTo(")) return src;
        // 插到类的第一个 '{' 之后
        int idx = src.indexOf('{');
        if (idx < 0) return src;
        String ins = "\n   @Override public int compareTo(Enum o) {\n"
                + "      throw new UnsupportedOperationException(\"compareTo not implemented\");\n"
                + "   }\n";
        return src.substring(0, idx + 1) + ins + src.substring(idx + 1);
    }

    // ---------- 枚举常量列表 ----------
    static String fixEnumConstList(String src) {
        List<String> lines = new ArrayList<>(Arrays.asList(src.split("\n", -1)));
        List<String> out = new ArrayList<>();
        int i = 0;
        boolean any = false;
        while (i < lines.size()) {
            String l = lines.get(i);
            Matcher em = RE_ENUM_HEAD.matcher(l);
            if (!em.matches()) { out.add(l); i++; continue; }
            String enumName = em.group(3);
            out.add(l);
            i++;
            List<String> consts = new ArrayList<>();
            String indent = "";
            while (i < lines.size()) {
                Matcher cm = RE_CONST_FIELD.matcher(lines.get(i));
                if (cm.matches() && lastSeg(cm.group(2)).equals(lastSeg(enumName))) {
                    if (consts.isEmpty()) indent = cm.group(1);
                    consts.add(cm.group(3));
                    i++;
                } else break;
            }
            if (consts.isEmpty()) continue;
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < consts.size(); k++) {
                if (k > 0) sb.append(", ");
                sb.append(consts.get(k));
            }
            sb.append(';');
            out.add(indent + sb);
            any = true;
            statEnum++;
        }
        if (!any) return src;
        Set<String> consts = collectEnumConsts(src);
        StringBuilder sb2 = new StringBuilder();
        for (String l : out) {
            boolean drop = false;
            for (String c : consts) {
                if (l.trim().matches("^" + Pattern.quote(c) + "\\s*=\\s*new\\s+[\\w$.]+\\s*\\([^;]*\\);\\s*$")) {
                    drop = true;
                    break;
                }
            }
            if (!drop) sb2.append(l).append('\n');
        }
        return sb2.toString();
    }

    static Set<String> collectEnumConsts(String src) {
        Set<String> res = new LinkedHashSet<>();
        String[] lines = src.split("\n", -1);
        for (int i = 0; i < lines.length; i++) {
            Matcher em = RE_ENUM_HEAD.matcher(lines[i]);
            if (!em.matches()) continue;
            String enumName = em.group(3);
            int j = i + 1;
            while (j < lines.length) {
                Matcher cm = RE_CONST_FIELD.matcher(lines[j]);
                if (cm.matches() && lastSeg(cm.group(2)).equals(lastSeg(enumName))) res.add(cm.group(3));
                else break;
                j++;
            }
        }
        return res;
    }

    // ---------- 枚举/假枚举构造器签名 ----------
    static String fixEnumCtor(String src, String internal) {
        String[] info = internal == null ? null : INFO.get(internal);
        boolean fake = info != null && "fake".equals(info[1]);
        boolean directEnumSuper = fake && "java/lang/Enum".equals(info[0]);
        String cls = internal == null ? null : lastSeg(internal);
        StringBuilder sb = new StringBuilder();
        for (String l : src.split("\n", -1)) {
            Matcher m = RE_ENUM_CTOR.matcher(l);
            if (m.matches() && m.group(2).equals(cls)) {
                if (fake) {
                    sb.append(m.group(1)).append("protected ").append(m.group(2))
                      .append("(String name, int ordinal) {\n");
                    sb.append(m.group(1)).append("   super(name, ordinal);\n");
                    sb.append(m.group(1)).append("}\n");
                } else {
                    sb.append(m.group(1)).append("private ").append(m.group(2))
                      .append("(String name, int ordinal) {\n");
                }
                statEnumCtor++;
                continue;
            }
            sb.append(l).append('\n');
        }
        return sb.toString();
    }

    // ---------- 构造器 ----------
    static String fixCtor(String src) {
        return fixCtor(src, null);
    }

    static String fixCtor(String src, Map<String, String> typeOverride) {
        String[] lines = src.split("\n", -1);
        Map<String, String> typeOf = new HashMap<>();
        for (String l : lines) {
            Matcher m = RE_DECL.matcher(l);
            if (m.matches()) { typeOf.put(m.group(3), m.group(4)); continue; }
            Matcher m2 = RE_DECL_NOTYPE.matcher(l);
            if (m2.matches()) { typeOf.put(m2.group(2), m2.group(3)); continue; }
            Matcher m3 = RE_DECL_PLAIN.matcher(l);
            if (m3.matches()) typeOf.putIfAbsent(m3.group(2), m3.group(1));
        }
        if (typeOverride != null) typeOf.putAll(typeOverride);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            String l = lines[i];
            Matcher nm = RE_DECL_NOTYPE.matcher(l);
            if (nm.matches()) {
                // 变量已在别处声明，这里只是一次"分配"，改成置 null，真正的构造在后面的 <init> 那行
                sb.append(nm.group(1)).append(nm.group(2)).append(" = null;").append('\n');
                statCtor++;
                continue;
            }
            Matcher dm = RE_DECL.matcher(l);
            if (dm.matches()) {
                sb.append(dm.group(1)).append(dm.group(2)).append(' ').append(dm.group(3)).append(";\n");
                statCtor++;
                continue;
            }
            Matcher im = RE_INIT_1LINE.matcher(l);
            if (im.matches()) {
                String type = typeOf.get(im.group(2));
                if (type != null) {
                    sb.append(im.group(1)).append(im.group(2)).append(" = new ").append(type)
                      .append('(').append(im.group(3)).append(");\n");
                    statCtor++;
                    continue;
                }
            }
            Matcher mm = RE_INIT_MULTI.matcher(l);
            if (mm.matches()) {
                String var = mm.group(1);
                String type = typeOf.get(var);
                int end = findInitEnd(lines, i);
                if (type != null && end > i) {
                    StringBuilder args = new StringBuilder(mm.group(2));
                    // 末行若只是 <init> 的右括号，不要并进实参
                    int last = end;
                    if (lines[end].trim().equals(");") || lines[end].trim().equals(")")) last = end - 1;
                    for (int k = i + 1; k <= last; k++) {
                        String seg = lines[k].trim();
                        if (k == last) seg = seg.replaceFirst(";\\s*$", "");
                        args.append(' ').append(seg);
                    }
                    String a = args.toString().trim();
                    while (a.endsWith(")") && countChar(a, '(') < countChar(a, ')')) {
                        a = a.substring(0, a.length() - 1).trim();
                    }
                    sb.append(var).append(" = new ").append(type).append('(').append(a).append(");\n");
                    statCtor++;
                    i = end;
                    continue;
                }
            }
            sb.append(l).append('\n');
        }
        return sb.toString();
    }

    static int countChar(String s, char c) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) n++;
        return n;
    }

    static int findInitEnd(String[] lines, int i) {
        for (int k = i; k < Math.min(lines.length, i + 15); k++) {
            if (lines[k].trim().endsWith(");")) return k;
        }
        return -1;
    }

    // ---------- 方法体整体反编译失败 ----------
    static String fixUndecodable(String src) {
        String[] lines = src.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            String l = lines[i];
            sb.append(l).append('\n');
            if (!RE_UNDEC.matcher(l).matches()) continue;
            String prev = i > 0 ? lines[i - 1] : "";
            if (prev.trim().endsWith("{")) {
                sb.append("      throw new UnsupportedOperationException("
                        + "\"decompilation failed (Vineflower)\");\n");
                statUndec++;
            }
        }
        return sb.toString();
    }

    // ---------- 孤立转型语句 ----------
    static String fixCastStmt(String src) {
        StringBuilder sb = new StringBuilder();
        for (String l : src.split("\n", -1)) {
            if (RE_CAST_STMT.matcher(l).matches()) { statCast++; continue; }
            sb.append(l).append('\n');
        }
        return sb.toString();
    }
}
