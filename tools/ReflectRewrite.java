import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 把反编译源码里的反射调用改写成直接调用。
 *
 * <p>混淆器把跨类调用改成了
 * <pre>
 *   com.c.d(KEY).invoke(recv, com.c.a(args))   // 方法
 *   com.c.c(KEY).get(recv) / .set(recv, v)     // 字段
 * </pre>
 * 其中 com.c 是全局反射注册表。本工具用 {@code reflect.tsv} 里已经解好的反射表，
 * 把这些调用还原成
 * <pre>
 *   recv.member(args)
 *   recv.member = v
 * </pre>
 * 并把声明类换成源码里可见的名字（CFR 改过名的类，例如 com.Lk -&gt; lk_0）。
 *
 * <p>用法：
 * <pre>
 *   java -cp "bin;../_lib/asm" ReflectRewrite ../app ../clean-rewrite ../reflect.tsv [jar]
 * </pre>
 */
public class ReflectRewrite {

    // =================================================================
    // 反射表
    // =================================================================

    /** 一个被反射的成员。 */
    static final class Member {
        String kind;            // "m" 方法 / "f" 字段
        long key;
        String declInternal;    // 斜杠分隔的声明类内部名
        String declDotted;      // 点分隔的声明类名
        String member;          // 成员名
        final List<String> params = new ArrayList<>();
        String retOrType;
        Boolean isStatic;       // null = 判断不出来
        String desc;            // 方法描述符（用于精确匹配重载）
    }

    /** key -> 成员。 */
    static final class Table {
        final Map<Long, Member> methods = new HashMap<>();
        final Map<Long, Member> fields = new HashMap<>();
        final Set<Long> unresolved = new LinkedHashSet<>();
        int runtimeResolved;
        int fallbackResolved;
        int failed;
    }

    // =================================================================
    // 每个文件的上下文
    // =================================================================

    /** 单个源文件的上下文。 */
    static final class FileCtx {
        String pkg = "";              // 包名，默认包为 ""
        String visibleClass = "";     // 本文件的类名（源码可见名）
        String visibleClassInternal;  // 本文件的内部名
        boolean bareC;                // 裸写 c. 是否指 com.c
        final Map<String, String> varTypes = new HashMap<>();  // 标识符 -> 源码里写的类型
    }

    // =================================================================
    // 统计
    // =================================================================

    static final class Stats {
        int filesTotal;
        int filesChanged;
        int filesBalanceFailed;
        int methodCalls;
        int staticCalls;
        int instanceCalls;
        int fieldReads;
        int fieldWrites;
        int castsAdded;
        int unresolvedSites;
        final Map<Long, Integer> unresolvedKeys = new LinkedHashMap<>();
        final List<String> residualSamples = new ArrayList<>();
        int residualTotal;
    }

    // =================================================================
    // 入口
    // =================================================================

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("usage: ReflectRewrite <appDir> <outDir> <reflect.tsv> [jar]");
            System.exit(2);
        }
        Path appDir = Paths.get(args[0]);
        Path outDir = Paths.get(args[1]);
        Path tsv = Paths.get(args[2]);
        Path jar = args.length > 3 ? Paths.get(args[3]) : guessJar(tsv, appDir);

        System.out.println("app   = " + appDir);
        System.out.println("out   = " + outDir);
        System.out.println("tsv   = " + tsv);
        System.out.println("jar   = " + jar + (Files.exists(jar) ? "" : "  (缺失!)"));

        // 1) 继承表（ASM 读 jar）
        Hierarchy hier = jar != null && Files.exists(jar)
                ? Hierarchy.fromJar(jar) : new Hierarchy();
        System.out.println("继承表: " + hier.jarClassCount() + " 个 jar 类");

        // 2) 反射表
        Table table = buildTable(tsv, hier);
        System.out.println("表: 方法 " + table.methods.size() + " / 字段 " + table.fields.size()
                + "  (解析成功 " + table.runtimeResolved + ", 失败 " + table.failed + ")");

        // 3) 类名映射
        ClassIndex idx = ClassIndex.build(appDir);
        System.out.println("类名映射: " + idx.size() + " 个内部名");

        // 输出 tables/classindex.tsv
        Path tablesDir = outDir.resolveSibling("tables");
        Files.createDirectories(tablesDir);
        ClassIndex.writeTsv(idx, tablesDir.resolve("classindex.tsv"));
        System.out.println("写出 " + tablesDir.resolve("classindex.tsv"));

        // 可选：抽样用 com.c 的运行时反射结果核对表
        for (String a : args) {
            if (a.equals("--verify")) {
                System.out.println("--- 运行时抽样校验 ---");
                verifyAgainstRuntime(jar, table, 200);
            }
        }

        // 4) 逐文件改写
        Stats stats = new Stats();
        List<Path> files;
        try (Stream<Path> st = Files.walk(appDir)) {
            files = st.filter(p -> p.toString().endsWith(".java")).sorted().collect(Collectors.toList());
        }
        for (Path p : files) {
            String rel = appDir.relativize(p).toString().replace('\\', '/');
            Path dst = outDir.resolve(rel.replace('/', java.io.File.separatorChar));
            Files.createDirectories(dst.getParent());
            String src;
            try {
                src = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
            } catch (IOException e) {
                Files.copy(p, dst);
                continue;
            }
            stats.filesTotal++;
            FileCtx ctx = buildCtx(src, rel, idx);
            String out = rewriteFile(src, ctx, idx, hier, table, stats);
            if (!out.equals(src)) {
                if (!balanceOk(src) || !balanceOk(out)) {
                    // 括号配平不一致 —— 放弃该文件的全部改写
                    stats.filesBalanceFailed++;
                    stats.filesChanged -= countChanges(src, out);
                    Files.write(dst, src.getBytes(StandardCharsets.UTF_8));
                    continue;
                }
                stats.filesChanged++;
            }
            Files.write(dst, out.getBytes(StandardCharsets.UTF_8));
        }

        // 5) 残留统计
        countResidual(outDir, stats);

        System.out.println();
        System.out.println("=== 统计 ===");
        System.out.println("文件总数        : " + stats.filesTotal);
        System.out.println("被改写的文件    : " + stats.filesChanged);
        System.out.println("配平校验失败    : " + stats.filesBalanceFailed);
        System.out.println("方法调用改写    : " + stats.methodCalls
                + "  (静态 " + stats.staticCalls + " / 实例 " + stats.instanceCalls + ")");
        System.out.println("字段读改写      : " + stats.fieldReads);
        System.out.println("字段写改写      : " + stats.fieldWrites);
        System.out.println("加转型次数      : " + stats.castsAdded);
        System.out.println("无法解析的站点  : " + stats.unresolvedSites);
        System.out.println("残留反射调用    : " + stats.residualTotal);
        if (!stats.unresolvedKeys.isEmpty()) {
            System.out.println("无法解析的 key  :");
            int n = 0;
            for (Map.Entry<Long, Integer> e : stats.unresolvedKeys.entrySet()) {
                System.out.println("   " + e.getKey() + "  x" + e.getValue());
                if (++n >= 60) { System.out.println("   ... 其余 " + (stats.unresolvedKeys.size() - n) + " 个见报告"); break; }
            }
        }
        Files.createDirectories(tablesDir);
        Files.write(tablesDir.resolve("rewrite-stats.tsv"),
                ("metric\tvalue\n"
                        + "filesTotal\t" + stats.filesTotal + "\n"
                        + "filesChanged\t" + stats.filesChanged + "\n"
                        + "filesBalanceFailed\t" + stats.filesBalanceFailed + "\n"
                        + "methodCalls\t" + stats.methodCalls + "\n"
                        + "staticCalls\t" + stats.staticCalls + "\n"
                        + "instanceCalls\t" + stats.instanceCalls + "\n"
                        + "fieldReads\t" + stats.fieldReads + "\n"
                        + "fieldWrites\t" + stats.fieldWrites + "\n"
                        + "castsAdded\t" + stats.castsAdded + "\n"
                        + "unresolvedSites\t" + stats.unresolvedSites + "\n"
                        + "residualTotal\t" + stats.residualTotal + "\n")
                        .getBytes(StandardCharsets.UTF_8));
    }

    private static Path guessJar(Path tsv, Path appDir) {
        Path p = tsv.toAbsolutePath().getParent();
        if (p != null) {
            Path j = p.resolve("finalshell.jar");
            if (Files.exists(j)) return j;
        }
        p = appDir.toAbsolutePath().getParent();
        if (p != null) {
            Path j = p.resolve("finalshell.jar");
            if (Files.exists(j)) return j;
        }
        return Paths.get("finalshell.jar");
    }

    // =================================================================
    // 反射表构建
    // =================================================================

    private static Table buildTable(Path tsv, Hierarchy hier) throws Exception {
        Table t = new Table();
        for (String line : Files.readAllLines(tsv, StandardCharsets.UTF_8)) {
            if (line.isEmpty()) continue;
            String[] p = line.split("\t", -1);
            if (p.length < 2) continue;
            String kind = p[0].trim();
            boolean isMethod = kind.equals("d") || kind.equals("m");
            if (!isMethod && !kind.equals("c") && !kind.equals("f")) continue;
            long key;
            try {
                key = Long.parseLong(p[1].trim());
            } catch (Exception e) {
                t.failed++;
                continue;
            }
            Member m = parseRow(p, isMethod);
            if (m == null) {
                t.failed++;
                t.unresolved.add(key);
                continue;
            }
            m.kind = isMethod ? "m" : "f";
            m.key = key;
            if (isMethod) {
                m.isStatic = hier.methodIsStatic(m.declInternal, m.member, m.params.size(), m.desc);
                t.runtimeResolved++;
            } else {
                m.isStatic = hier.fieldIsStatic(m.declInternal, m.member);
                t.runtimeResolved++;
            }
            (isMethod ? t.methods : t.fields).put(key, m);
        }
        return t;
    }

    /**
     * 解析反射表的一行。兼容两种列布局：
     * <ul>
     *   <li>5 列：kind \t key \t idx \t "METHOD cls#name(p1, p2) : ret" \t rawDesc</li>
     *   <li>7 列：kind \t key \t declClass \t member \t params \t retOrType \t rawDesc</li>
     * </ul>
     */
    private static Member parseRow(String[] p, boolean isMethod) {
        Member m = new Member();
        String decl, member, paramsStr, ret;
        if (p.length >= 6 && p[3] != null && p[3].indexOf('#') < 0 && !p[3].isEmpty()) {
            // 7 列布局
            decl = p[2].trim();
            member = p[3].trim();
            paramsStr = p[4] == null ? "" : p[4].trim();
            ret = p[5] == null ? "" : p[5].trim();
        } else {
            if (p.length < 4) return null;
            String resolved = p[3].trim();
            int hash = resolved.indexOf('#');
            if (hash < 0) return null;
            String head = resolved.substring(0, hash);
            String tail = resolved.substring(hash + 1);
            int sp = head.indexOf(' ');
            decl = (sp < 0 ? head : head.substring(sp + 1)).trim();
            if (isMethod) {
                int lp = tail.indexOf('(');
                int rp = tail.lastIndexOf(')');
                if (lp < 0 || rp < lp) return null;
                member = tail.substring(0, lp).trim();
                paramsStr = tail.substring(lp + 1, rp).trim();
                int colon = tail.indexOf(':', rp);
                ret = colon < 0 ? "" : tail.substring(colon + 1).trim();
            } else {
                int colon = tail.indexOf(':');
                if (colon < 0) return null;
                member = tail.substring(0, colon).trim();
                paramsStr = "";
                ret = tail.substring(colon + 1).trim();
            }
        }
        if (decl.isEmpty() || member.isEmpty()) return null;
        m.declDotted = decl.replace('/', '.');
        m.declInternal = m.declDotted.replace('.', '/');
        m.member = member;
        m.retOrType = ret;
        if (!paramsStr.isEmpty()) {
            for (String s : paramsStr.split(",")) {
                String x = s.trim();
                if (!x.isEmpty()) m.params.add(x);
            }
        }
        if (isMethod) {
            StringBuilder sb = new StringBuilder("(");
            for (String pt : m.params) {
                String d = typeToDescriptor(pt);
                if (d == null) { sb.setLength(0); break; }
                sb.append(d);
            }
            if (sb.length() > 0) {
                String rd = typeToDescriptor(m.retOrType);
                if (rd != null) m.desc = sb + ")" + rd;
            }
        }
        return m;
    }

    /** 把点分隔的类型名转成 JVM 描述符片段。 */
    static String typeToDescriptor(String t) {
        if (t == null) return null;
        t = t.trim();
        if (t.isEmpty()) return null;
        if (t.startsWith("[")) {
            String d = typeToDescriptor(t.substring(1));
            return d == null ? null : "[" + d;
        }
        switch (t) {
            case "int": return "I";
            case "long": return "J";
            case "short": return "S";
            case "byte": return "B";
            case "char": return "C";
            case "float": return "F";
            case "double": return "D";
            case "boolean": return "Z";
            case "void": return "V";
            default: return "L" + t.replace('.', '/') + ";";
        }
    }

    private static Member runtimeMethod(Method dLong, long key) throws Exception {
        Object o = dLong.invoke(null, key);
        if (!(o instanceof Method)) return null;
        Method mm = (Method) o;
        Member mem = new Member();
        mem.declDotted = mm.getDeclaringClass().getName();
        mem.declInternal = mem.declDotted.replace('.', '/');
        mem.member = mm.getName();
        for (Class<?> p : mm.getParameterTypes()) mem.params.add(p.getName());
        mem.retOrType = mm.getReturnType().getName();
        mem.isStatic = Modifier.isStatic(mm.getModifiers());
        return mem;
    }

    private static Member runtimeField(Method cLong, long key) throws Exception {
        Object o = cLong.invoke(null, key);
        if (!(o instanceof Field)) return null;
        Field ff = (Field) o;
        Member mem = new Member();
        mem.declDotted = ff.getDeclaringClass().getName();
        mem.declInternal = mem.declDotted.replace('.', '/');
        mem.member = ff.getName();
        mem.retOrType = ff.getType().getName();
        mem.isStatic = Modifier.isStatic(ff.getModifiers());
        return mem;
    }

    /**
     * 抽样校验：用 com.c 的运行时反射结果核对反射表里的解析（声明类 / 成员名 / 参数）。
     * 注意：加载 app 类会触发它们的静态初始化（可能发网络请求），所以只在
     * --verify 模式下、且只抽样少量 key。
     */
    private static int verifyAgainstRuntime(Path jar, Table table, int sample) {
        try {
            Class<?> comc = loadComC(jar);
            Method dLong = comc.getDeclaredMethod("d", long.class);
            dLong.setAccessible(true);
            Method cLong = comc.getDeclaredMethod("c", long.class);
            cLong.setAccessible(true);
            int ok = 0, bad = 0, skipped = 0;
            List<Map.Entry<Long, Member>> ms = new ArrayList<>(table.methods.entrySet());
            Collections.shuffle(ms, new java.util.Random(42));
            for (Map.Entry<Long, Member> e : ms) {
                if (ok + bad >= sample) break;
                try {
                    Member r = runtimeMethod(dLong, e.getKey());
                    if (r == null) { skipped++; continue; }
                    Member m = e.getValue();
                    if (r.declInternal.equals(m.declInternal) && r.member.equals(m.member)
                            && r.params.equals(m.params)) ok++;
                    else { bad++; System.out.println("  MISMATCH key=" + e.getKey() + " tsv=" + m.declInternal
                            + "#" + m.member + m.params + "  runtime=" + r.declInternal + "#" + r.member + r.params); }
                } catch (Throwable t) { skipped++; }
            }
            List<Map.Entry<Long, Member>> fs = new ArrayList<>(table.fields.entrySet());
            Collections.shuffle(fs, new java.util.Random(42));
            for (Map.Entry<Long, Member> e : fs) {
                if (ok + bad >= sample) break;
                try {
                    Member r = runtimeField(cLong, e.getKey());
                    if (r == null) { skipped++; continue; }
                    Member m = e.getValue();
                    if (r.declInternal.equals(m.declInternal) && r.member.equals(m.member)
                            && r.retOrType.equals(m.retOrType)) ok++;
                    else { bad++; System.out.println("  MISMATCH key=" + e.getKey() + " tsv=" + m.declInternal
                            + "#" + m.member + "  runtime=" + r.declInternal + "#" + r.member); }
                } catch (Throwable t) { skipped++; }
            }
            System.out.println("运行时抽样校验: 一致 " + ok + " / 不一致 " + bad + " / 跳过 " + skipped);
            return ok;
        } catch (Throwable e) {
            System.out.println("运行时抽样校验失败: " + e);
            return -1;
        }
    }

    private static Class<?> loadComC(Path jar) throws Exception {
        final URL[] urls = { jar.toUri().toURL() };
        ClassLoader parent = ClassLoader.getSystemClassLoader();
        ClassLoader loader = new URLClassLoader(urls, parent) {
            @Override protected Class<?> loadClass(String n, boolean resolve) throws ClassNotFoundException {
                synchronized (getClassLoadingLock(n)) {
                    Class<?> c = findLoadedClass(n);
                    if (c == null) {
                        try { c = super.loadClass(n, false); }
                        catch (ClassNotFoundException e) { throw e; }
                    }
                    if (resolve) resolveClass(c);
                    return c;
                }
            }
        };
        return Class.forName("com.c", true, loader);
    }

    // =================================================================
    // 文件上下文
    // =================================================================

    private static final Pattern P_PACKAGE = Pattern.compile(
            "(?m)^[ \\t]*package[ \\t]+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)[ \\t]*;");
    private static final Pattern P_IMPORT_COM_C = Pattern.compile(
            "(?m)^[ \\t]*import[ \\t]+com\\.c[ \\t]*;");
    private static final Pattern P_TYPE = Pattern.compile(
            "(?m)^[ \\t]*(?:@[A-Za-z_$][\\w$.]*(?:[ \\t]*\\([^()]*\\))?[ \\t]*)*"
            + "(?:(?:public|final|abstract|strictfp|sealed|non-sealed)[ \\t]+)*"
            + "(?:class|interface|enum|@interface)[ \\t]+([A-Za-z_$][\\w$]*)");

    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "return", "new", "this", "super", "if", "else", "while", "for", "do", "switch",
            "case", "default", "throw", "throws", "try", "catch", "finally", "instanceof",
            "void", "int", "long", "short", "byte", "char", "float", "double", "boolean",
            "break", "continue", "assert", "synchronized", "native", "strictfp", "enum",
            "interface", "class", "extends", "implements", "package", "import", "null",
            "true", "false", "var", "record", "yield", "sealed", "permits", "non"));

    /** 局部变量 / 字段声明：Type name = ... ; 或 Type name ; */
    private static final Pattern P_VAR_DECL = Pattern.compile(
            "(?m)^[ \\t]*(?:(?:public|private|protected|static|final|transient|volatile|"
            + "abstract|native|synchronized|default)[ \\t]+)*"
            + "([A-Za-z_$][\\w$.]*(?:[ \\t]*<[^;{}()]*>)?(?:[ \\t]*\\[[ \\t]*\\])*)[ \\t]+"
            + "([A-Za-z_$][\\w$]*)[ \\t]*(?=;|[ \\t]*=(?!=)|:)");

    private static FileCtx buildCtx(String src, String rel, ClassIndex idx) {
        FileCtx ctx = new FileCtx();
        Matcher pm = P_PACKAGE.matcher(src);
        if (pm.find()) ctx.pkg = pm.group(1);
        ctx.bareC = ctx.pkg.equals("com") || P_IMPORT_COM_C.matcher(src).find();
        Matcher tm = P_TYPE.matcher(src);
        if (tm.find()) ctx.visibleClass = tm.group(1);
        else {
            String base = rel.substring(rel.lastIndexOf('/') + 1);
            ctx.visibleClass = base.substring(0, base.length() - 5);
        }
        ctx.visibleClassInternal = idx.resolveType(
                ctx.pkg.isEmpty() ? ctx.visibleClass : ctx.pkg + "." + ctx.visibleClass);
        collectVarTypes(src, ctx);
        return ctx;
    }

    private static void collectVarTypes(String src, FileCtx ctx) {
        Matcher m = P_VAR_DECL.matcher(src);
        while (m.find()) {
            String type = m.group(1);
            String name = m.group(2);
            if (JAVA_KEYWORDS.contains(type)) continue;
            if (type.contains(".")) continue;          // 限定名先不管（可能歧义）
            if (type.endsWith("[]")) continue;         // 数组不是类
            if (type.indexOf('<') >= 0) type = type.substring(0, type.indexOf('<')).trim();
            String prev = ctx.varTypes.get(name);
            if (prev == null) ctx.varTypes.put(name, type);
            else if (!prev.equals(type)) ctx.varTypes.put(name, "?");
        }
    }

    // =================================================================
    // 改写主逻辑
    // =================================================================

    private static String rewriteFile(String src, FileCtx ctx, ClassIndex idx,
                                      Hierarchy hier, Table table, Stats stats) {
        String cur = src;
        List<Integer> starts = findCandidates(cur, ctx);
        for (int i = starts.size() - 1; i >= 0; i--) {
            int start = starts.get(i);
            Res r = tryRewrite(cur, start, ctx, idx, hier, table, stats);
            if (r != null) {
                cur = cur.substring(0, start) + r.text + cur.substring(start + r.consumed);
            } else {
                stats.unresolvedSites++;
                long key = keyAt(cur, start);
                if (key != Long.MIN_VALUE) stats.unresolvedKeys.merge(key, 1, Integer::sum);
            }
        }
        return cur;
    }

    /** 一个改写结果。 */
    static final class Res {
        String text;
        int consumed;
        Res(String text, int consumed) { this.text = text; this.consumed = consumed; }
    }

    /** 找出所有反射调用候选点的起始下标（升序）。 */
    private static List<Integer> findCandidates(String s, FileCtx ctx) {
        List<Integer> out = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int t = skipToken(s, i);
            if (t > 0) { i = t; continue; }
            if (s.startsWith("com.c.", i)) {
                if (prevOk(s, i) && s.charAt(i + 6) != '\0' && (s.charAt(i + 6) == 'd' || s.charAt(i + 6) == 'c')
                        && i + 7 < s.length() && s.charAt(i + 7) == '(') {
                    if (longLiteralEnd(s, i + 7) > 0) out.add(i);
                }
            } else if (s.startsWith("c.", i) && ctx.bareC) {
                if (prevOk(s, i) && (s.charAt(i + 2) == 'd' || s.charAt(i + 2) == 'c')
                        && i + 3 < s.length() && s.charAt(i + 3) == '(') {
                    if (longLiteralEnd(s, i + 3) > 0) out.add(i);
                }
            }
            i++;
        }
        return out;
    }

    /** 前一个字符不能是标识符字符，也不能是 '.'（否则是别的包的 c）。 */
    private static boolean prevOk(String s, int i) {
        if (i == 0) return true;
        char c = s.charAt(i - 1);
        return !(Character.isJavaIdentifierPart(c) || c == '.');
    }

    /** 若 s[open] 是 '(' 且里面是一个 long 字面量，返回 ')' 的下标，否则 -1。 */
    private static int longLiteralEnd(String s, int open) {
        if (open >= s.length() || s.charAt(open) != '(') return -1;
        int j = open + 1;
        while (j < s.length() && Character.isWhitespace(s.charAt(j))) j++;
        int st = j;
        if (j < s.length() && (s.charAt(j) == '-' || s.charAt(j) == '+')) j++;
        while (j < s.length() && Character.isDigit(s.charAt(j))) j++;
        if (j == st) return -1;
        if (j >= s.length() || s.charAt(j) != 'L') return -1;
        j++;
        while (j < s.length() && Character.isWhitespace(s.charAt(j))) j++;
        if (j >= s.length() || s.charAt(j) != ')') return -1;
        return j;
    }

    private static long keyAt(String s, int start) {
        try {
            int q = s.startsWith("com.c.", start) ? start + 6 : start + 2;
            int open = q + 1;
            int close = longLiteralEnd(s, open);
            if (close < 0) return Long.MIN_VALUE;
            return Long.parseLong(s.substring(open + 1, close - 1).trim());
        } catch (Exception e) {
            return Long.MIN_VALUE;
        }
    }

    /** 尝试改写 start 处的一个反射调用。 */
    private static Res tryRewrite(String s, int start, FileCtx ctx, ClassIndex idx,
                                   Hierarchy hier, Table table, Stats stats) {
        int qLen;
        if (s.startsWith("com.c.", start)) qLen = 6;
        else if (s.startsWith("c.", start) && ctx.bareC) qLen = 2;
        else return null;

        char which = s.charAt(start + qLen);
        int open = start + qLen + 1;
        int close = longLiteralEnd(s, open);
        if (close < 0) return null;
        long key;
        try {
            key = Long.parseLong(s.substring(open + 1, close - 1).trim());
        } catch (Exception e) {
            return null;
        }

        int dot = close + 1;
        if (dot >= s.length() || s.charAt(dot) != '.') return null;
        int nameStart = dot + 1;
        int nameEnd = nameStart;
        while (nameEnd < s.length() && Character.isJavaIdentifierPart(s.charAt(nameEnd))) nameEnd++;
        String accessor = s.substring(nameStart, nameEnd);
        int accOpen = nameEnd;
        if (accOpen >= s.length() || s.charAt(accOpen) != '(') return null;
        int accClose = matchParen(s, accOpen);
        if (accClose < 0) return null;

        if (which == 'd') {
            if (!accessor.equals("invoke")) return null;
            return rewriteInvoke(s, start, accOpen, accClose, key, ctx, idx, hier, table, stats);
        }
        return rewriteField(s, start, accessor, accOpen, accClose, key, ctx, idx, hier, table, stats);
    }

    // ------------------------------------------------------------------
    // 方法调用
    // ------------------------------------------------------------------

    private static Res rewriteInvoke(String s, int start, int open, int close, long key,
                                      FileCtx ctx, ClassIndex idx, Hierarchy hier,
                                      Table table, Stats stats) {
        Member m = table.methods.get(key);
        if (m == null) return null;

        List<int[]> segs = splitTopLevel(s, open, close, false);
        if (segs == null) return null;

        String receiver;
        String[] args;
        if (segs.size() == 1) {
            receiver = s.substring(segs.get(0)[0], segs.get(0)[1]).trim();
            args = new String[0];
        } else {
            int[] last = segs.get(segs.size() - 1);
            String packerText = s.substring(last[0], last[1]).trim();
            String[] packed = parsePacker(packerText, ctx);
            if (packed == null) return null;
            receiver = s.substring(open + 1, segs.get(segs.size() - 2)[1]).trim();
            args = packed;
        }

        // 参数个数必须与反射表一致，否则不改
        if (m.params.size() != args.length) return null;

        boolean recvIsNull = receiver.equals("null");
        if (m.isStatic != null && recvIsNull != m.isStatic) return null;   // 静态/实例不一致 —— 不确定就不改

        StringBuilder sb = new StringBuilder();
        if (recvIsNull) {
            sb.append(idx.visibleOf(m.declInternal, ctx.pkg));
        } else {
            String cast = neededCast(receiver, m.declInternal, ctx, idx, hier);
            if (cast != null) { sb.append(cast); stats.castsAdded++; }
            sb.append(receiver);
        }
        sb.append('.').append(m.member).append('(');
        for (int i = 0; i < args.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(args[i]);
        }
        sb.append(')');

        stats.methodCalls++;
        if (recvIsNull) stats.staticCalls++; else stats.instanceCalls++;
        return new Res(sb.toString(), close + 1 - start);
    }

    // ------------------------------------------------------------------
    // 字段访问
    // ------------------------------------------------------------------

    private static final Set<String> GETTERS = new HashSet<>(Arrays.asList(
            "get", "getInt", "getBoolean", "getLong", "getFloat", "getDouble", "getShort",
            "getByte", "getChar"));
    private static final Set<String> SETTERS = new HashSet<>(Arrays.asList(
            "set", "setInt", "setBoolean", "setLong", "setFloat", "setDouble", "setShort",
            "setByte", "setChar"));

    private static Res rewriteField(String s, int start, String accessor, int open, int close,
                                    long key, FileCtx ctx, ClassIndex idx, Hierarchy hier,
                                    Table table, Stats stats) {
        Member m = table.fields.get(key);
        if (m == null) return null;
        boolean isSet = SETTERS.contains(accessor);
        if (!isSet && !GETTERS.contains(accessor)) return null;

        List<int[]> segs = splitTopLevel(s, open, close, false);
        if (segs == null) return null;
        if (isSet ? segs.size() != 2 : segs.size() != 1) return null;

        String receiver = s.substring(segs.get(0)[0], segs.get(0)[1]).trim();
        String value = isSet ? s.substring(segs.get(1)[0], segs.get(1)[1]).trim() : null;

        boolean recvIsNull = receiver.equals("null");
        if (m.isStatic != null && recvIsNull != m.isStatic) return null;

        StringBuilder sb = new StringBuilder();
        if (recvIsNull) {
            sb.append(idx.visibleOf(m.declInternal, ctx.pkg));
        } else {
            String cast = neededCast(receiver, m.declInternal, ctx, idx, hier);
            if (cast != null) { sb.append(cast); stats.castsAdded++; }
            sb.append(receiver);
        }
        sb.append('.').append(m.member);
        if (isSet) {
            sb.append(" = ").append(value);
            stats.fieldWrites++;
        } else {
            stats.fieldReads++;
        }
        return new Res(sb.toString(), close + 1 - start);
    }

    // ------------------------------------------------------------------
    // 转型
    // ------------------------------------------------------------------

    /** 需要时返回 "((DeclClass) " 前缀，不需要时返回 null。 */
    private static String neededCast(String receiver, String declInternal, FileCtx ctx,
                                     ClassIndex idx, Hierarchy hier) {
        String recvInternal = inferInternal(receiver, ctx, idx);
        if (recvInternal == null) return null;              // 拿不准 —— 保持原样
        if (recvInternal.equals(declInternal)) return null;
        if (hier.isSubclass(recvInternal, declInternal)) return null;
        // recv 是声明类的父类或无关类 —— 加转型
        if (hier.isSubclass(declInternal, recvInternal)) {
            return "((" + idx.qualifiedVisibleOf(declInternal) + ") ";
        }
        if (hier.isJarClass(declInternal) || hier.isJarClass(recvInternal)) {
            return "((" + idx.qualifiedVisibleOf(declInternal) + ") ";
        }
        return null;   // 外部类信息不足 —— 不动
    }

    /** 推断接收者的内部名；推不出来返回 null。 */
    private static String inferInternal(String receiver, FileCtx ctx, ClassIndex idx) {
        String r = receiver.trim();
        if (r.equals("this")) return ctx.visibleClassInternal;
        if (!r.matches("[A-Za-z_$][\\w$]*")) return null;
        String written = ctx.varTypes.get(r);
        if (written == null || written.equals("?")) return null;
        return idx.resolveType(written);
    }

    // ------------------------------------------------------------------
    // 参数打包器
    // ------------------------------------------------------------------

    /**
     * 解析参数打包器：{@code c.f()}（0 个）、{@code c.e(x)}（1 个）、
     * {@code c.a(x, y, ...)}（n 个）。不是打包器返回 null。
     */
    private static String[] parsePacker(String text, FileCtx ctx) {
        String t = text.trim();
        int qLen;
        if (t.startsWith("com.c.")) qLen = 6;
        else if (t.startsWith("c.") && ctx.bareC) qLen = 2;
        else return null;
        if (qLen >= t.length()) return null;
        char k = t.charAt(qLen);
        if (k != 'f' && k != 'e' && k != 'a') return null;
        int open = qLen + 1;
        if (open >= t.length() || t.charAt(open) != '(') return null;
        int close = matchParen(t, open);
        if (close < 0 || close != t.length() - 1) return null;
        if (k == 'f') return new String[0];
        List<int[]> segs = splitTopLevel(t, open, close, false);
        if (segs == null) return null;
        String[] out = new String[segs.size()];
        for (int i = 0; i < segs.size(); i++) {
            out[i] = t.substring(segs.get(i)[0], segs.get(i)[1]).trim();
        }
        return out;
    }

    // =================================================================
    // 源码扫描工具（跳过字符串 / 字符 / 注释）
    // =================================================================

    /** 若 s[i] 处是字符串 / 字符字面量 / 注释，返回跳过后的下标；否则 -1。 */
    static int skipToken(String s, int i) {
        char c = s.charAt(i);
        if (c == '"') {
            if (s.startsWith("\"\"\"", i)) {
                int e = s.indexOf("\"\"\"", i + 3);
                return e < 0 ? s.length() : e + 3;
            }
            int j = i + 1;
            while (j < s.length()) {
                char d = s.charAt(j);
                if (d == '\\') { j += 2; continue; }
                if (d == '"') return j + 1;
                j++;
            }
            return s.length();
        }
        if (c == '\'') {
            int j = i + 1;
            while (j < s.length()) {
                char d = s.charAt(j);
                if (d == '\\') { j += 2; continue; }
                if (d == '\'') return j + 1;
                if (d == '\n') return j;
                j++;
            }
            return j;
        }
        if (c == '/' && i + 1 < s.length()) {
            char d = s.charAt(i + 1);
            if (d == '/') {
                int j = s.indexOf('\n', i);
                return j < 0 ? s.length() : j + 1;
            }
            if (d == '*') {
                int j = s.indexOf("*/", i + 2);
                return j < 0 ? s.length() : j + 2;
            }
        }
        return -1;
    }

    /** 找到 openIdx 处 '(' 的匹配 ')'。 */
    static int matchParen(String s, int openIdx) {
        int depth = 0;
        for (int i = openIdx; i < s.length(); i++) {
            int t = skipToken(s, i);
            if (t > 0) { i = t - 1; continue; }
            char c = s.charAt(i);
            if (c == '(') depth++;
            else if (c == ')') { depth--; if (depth == 0) return i; }
        }
        return -1;
    }

    /**
     * 在 (open, close) 之间按顶层逗号切分，返回每段的 [start,end) 区间。
     * 只在代码区切分，字符串 / 注释里的逗号不算。
     */
    static List<int[]> splitTopLevel(String s, int open, int close, boolean trackAngles) {
        List<int[]> out = new ArrayList<>();
        int depth = 0;
        int angle = 0;
        int segStart = open + 1;
        for (int i = open + 1; i < close; i++) {
            int t = skipToken(s, i);
            if (t > 0) { i = t - 1; continue; }
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') { depth++; continue; }
            if (c == ')' || c == ']' || c == '}') { depth--; continue; }
            if (trackAngles && c == '<') {
                if (angleOpen(s, i)) angle++;
                continue;
            }
            if (trackAngles && c == '>') {
                if (angle > 0) angle--;
                continue;
            }
            if (c == ',' && depth == 0 && angle == 0) {
                out.add(new int[]{segStart, i});
                segStart = i + 1;
            }
        }
        out.add(new int[]{segStart, close});
        return out;
    }

    /** 判断 s[i] 处的 '<' 是否像泛型（而不是比较运算）。 */
    private static boolean angleOpen(String s, int i) {
        int j = i - 1;
        while (j >= 0 && Character.isWhitespace(s.charAt(j))) j--;
        if (j < 0) return false;
        char p = s.charAt(j);
        if (p == '>') return true;
        if (!Character.isJavaIdentifierPart(p)) return false;
        int st = j;
        while (st >= 0 && Character.isJavaIdentifierPart(s.charAt(st))) st--;
        String word = s.substring(st + 1, j + 1);
        if (word.isEmpty()) return false;
        return Character.isUpperCase(word.charAt(0));
    }

    // =================================================================
    // 括号配平校验
    // =================================================================

    /** 返回三种括号的配平信息（最小深度 / 最终深度）。 */
    static int[] balance(String s) {
        int curlyMin = 0, curlyEnd = 0, parenMin = 0, parenEnd = 0, brackMin = 0, brackEnd = 0;
        int cd = 0, pd = 0, bd = 0;
        for (int i = 0; i < s.length(); i++) {
            int t = skipToken(s, i);
            if (t > 0) { i = t - 1; continue; }
            char c = s.charAt(i);
            if (c == '{') { cd++; }
            else if (c == '}') { cd--; if (cd < curlyMin) curlyMin = cd; }
            else if (c == '(') { pd++; }
            else if (c == ')') { pd--; if (pd < parenMin) parenMin = pd; }
            else if (c == '[') { bd++; }
            else if (c == ']') { bd--; if (bd < brackMin) brackMin = bd; }
        }
        curlyEnd = cd; parenEnd = pd; brackEnd = bd;
        return new int[]{curlyMin, curlyEnd, parenMin, parenEnd, brackMin, brackEnd};
    }

    static boolean balanceOk(String s) {
        int[] b = balance(s);
        for (int i = 0; i < b.length; i += 2) {
            if (b[i] < 0) return false;
            if (b[i + 1] != 0) return false;
        }
        return true;
    }

    /** 粗略统计改写处数（用于配平失败时回退计数）。 */
    private static int countChanges(String a, String b) {
        return a.equals(b) ? 0 : 1;
    }

    // =================================================================
    // 残留统计
    // =================================================================

    private static final Pattern P_RESIDUAL = Pattern.compile(
            "(?:com\\.)?c\\.[dc]\\(-?[0-9]+L\\)");

    private static void countResidual(Path outDir, Stats stats) throws IOException {
        try (Stream<Path> st = Files.walk(outDir)) {
            List<Path> files = st.filter(p -> p.toString().endsWith(".java"))
                    .sorted().collect(Collectors.toList());
            for (Path p : files) {
                String txt = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
                Matcher m = P_RESIDUAL.matcher(txt);
                int n = 0;
                while (m.find()) {
                    n++;
                    if (stats.residualSamples.size() < 40) {
                        stats.residualSamples.add(outDir.relativize(p).toString().replace('\\', '/')
                                + "  ->  " + m.group());
                    }
                }
                stats.residualTotal += n;
            }
        }
    }
}
