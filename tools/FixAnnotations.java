import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FixAnnotations —— 修复「注解实参」与「注解元素定义」之间的名字断裂。
 *
 * <h3>背景（为什么 Vineflower 产物编译不过）</h3>
 * 字节码允许同一个注解类型里存在多个同名元素（名字相同、描述符不同），Java 源码不允许：
 * <pre>
 *     @interface O4 { String[] Z(); String Z(); }   // 字节码合法，源码不合法
 * </pre>
 * 上一轮的字节码修复工具（FixBytecode 的 --dup pass）按返回类型派生唯一名
 * （Z -&gt; Z$arrString / Z$String），并且是在<b>字节码层</b>改的：
 * <pre>
 *     @interface O4 { String[] Z$arrString() default {}; String Z$String() default ""; }
 * </pre>
 * 但是 ASM 的 ClassRemapper <b>不会</b>重写注解<b>使用处</b>里的元素名
 * （RuntimeVisibleAnnotations 里 element_name_value_pair 的 name 是裸 UTF8 常量，
 *  ASM 只 remap 值、不 remap 名字）。于是使用处仍然是：
 * <pre>
 *     @O4(Z = "Point", Z = {"type", "bbox", "coordinates"})
 * </pre>
 * javac 报：cannot find symbol / symbol: method Z() / location: @interface O4。
 *
 * <h3>本工具做的事</h3>
 * <ol>
 *   <li>索引所有 {@code @interface} 声明，解析出每个注解类型的元素：名字 / 类型 / default 值。</li>
 *   <li>若注解体里出现 {@code 类型 名字 = 初值;}（元素被写成字段初始化）这种形式，
 *       改写成 {@code 类型 名字() default 初值;}——初值不丢，重名时按返回类型派生唯一名。
 *       只有「确实被使用处当作元素引用过」的字段式成员才会被转换，避免误伤常量。</li>
 *   <li>扫描所有使用处，把实参里的元素名对齐到注解类型里<b>真实存在</b>的元素：
 *       精确命中则不动；否则在 {@code 名字} / {@code 名字$后缀} 的候选里按<b>值的类型</b>唯一匹配。
 *       实参的值本身一个字符都不改。</li>
 *   <li>报告每个文件改了多少处，以及所有没能自动解决的残留问题。</li>
 * </ol>
 *
 * <h3>用法</h3>
 * <pre>
 *   编译：
 *     javac -encoding UTF-8 -nowarn -cp &lt;asm-class-dir&gt; -d &lt;out&gt; FixAnnotations.java
 *   运行：
 *     java -cp &lt;out&gt; FixAnnotations &lt;源码根目录&gt; [--dry-run] [--report=&lt;tsv路径&gt;]
 * </pre>
 * 参数：
 *   &lt;源码根目录&gt;    必填。递归扫描其下所有 .java，原地改写。
 *   --dry-run          只分析并打印摘要，不落盘。
 *   --report=&lt;path&gt;  额外把逐条改动写成 TSV（file / line / annotation / old / new / value）。
 */
public class FixAnnotations {

    // ------------------------------------------------------------------ 正则

    /** 注解元素声明：类型 name() [default 值] */
    private static final Pattern METHOD_ELEM =
            Pattern.compile("^\\s*(?<type>[\\w$.]+(?:\\s*<[^>]*>)?(?:\\s*\\[\\s*\\])*)\\s+"
                    + "(?<name>[A-Za-z_$][\\w$]*)\\s*\\(\\s*\\)\\s*(?:default\\s+(?<def>.*?))?\\s*$",
                    Pattern.DOTALL);

    /** 注解元素被写成字段初始化：类型 名字 = 初值 */
    private static final Pattern FIELD_ELEM =
            Pattern.compile("^\\s*(?<type>[\\w$.]+(?:\\s*<[^>]*>)?(?:\\s*\\[\\s*\\])*)\\s+"
                    + "(?<name>[A-Za-z_$][\\w$]*)\\s*=\\s*(?<init>.*?)\\s*$",
                    Pattern.DOTALL);

    /** @interface 声明头 */
    private static final Pattern ANN_DECL =
            Pattern.compile("(?m)^\\s*(?:public\\s+|abstract\\s+|final\\s+|strictfp\\s+)*@interface\\s+"
                    + "(?<name>[A-Za-z_$][\\w$]*)");

    /** 成员里出现嵌套类型声明 */
    private static final Pattern NESTED_TYPE =
            Pattern.compile("^\\s*(?:(?:public|private|protected|static|final|abstract)\\s+)*"
                    + "(?:class|interface|enum|@interface)\\s");

    /** 成员带访问/静态/最终修饰符（常量），不是注解元素 */
    private static final Pattern HAS_MODIFIER =
            Pattern.compile("^\\s*(?:public|private|protected|static|final)\\b");

    // ------------------------------------------------------------------ 数据结构

    /** 注解类型 */
    static final class AnnType {
        String simpleName;
        String packageName;
        Path file;
        /** 元素名 -> 元素 */
        final Map<String, Element> elements = new LinkedHashMap<>();
        /** 注解体里字段式的成员（待判定是否转换） */
        final List<FieldMember> pending = new ArrayList<>();
    }

    /** 注解元素 */
    static final class Element {
        final String name;
        final String type;
        final String def;
        Element(String name, String type, String def) { this.name = name; this.type = type; this.def = def; }
    }

    /** 注解体里的字段式成员 */
    static final class FieldMember {
        final String raw;        // 含末尾 ';'
        final String type;
        final String name;
        final String init;
        boolean converted;
        FieldMember(String raw, String type, String name, String init) {
            this.raw = raw; this.type = type; this.name = name; this.init = init;
        }
    }

    /** 注解使用处里的一个 "名字 = 值" */
    static final class Pair {
        String name;
        String value;
        int nameStart, nameEnd;  // 在实参文本里的偏移
        Pair(String name, String value, int s, int e) {
            this.name = name; this.value = value; this.nameStart = s; this.nameEnd = e;
        }
    }

    /** 一个注解使用处 */
    static final class Usage {
        AnnType at;
        String annName;
        int argsStart, argsEnd;  // 括号内的区间（文件绝对偏移）
        String args;
        List<Pair> pairs = new ArrayList<>();
    }

    /** 一次改名改动 */
    static final class Edit {
        final int start, end;
        final String text;
        final int line;
        final String annotation, oldName, newName, value;
        Edit(int start, int end, String text, int line, String annotation,
             String oldName, String newName, String value) {
            this.start = start; this.end = end; this.text = text;
            this.line = line; this.annotation = annotation;
            this.oldName = oldName; this.newName = newName; this.value = value;
        }
    }

    /** 单文件结果 */
    static final class FileResult {
        Path file;
        int annotationsTouched;
        int renames;
        List<Edit> edits = new ArrayList<>();
        List<String> issues = new ArrayList<>();
        String newText;
    }

    // ------------------------------------------------------------------ main

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("用法: java FixAnnotations <源码根目录> [--dry-run] [--report=<tsv>]");
            System.exit(2);
        }
        Path root = Paths.get(args[0]);
        boolean dryRun = false;
        Path report = null;
        for (int i = 1; i < args.length; i++) {
            if (args[i].equals("--dry-run")) dryRun = true;
            else if (args[i].startsWith("--report=")) report = Paths.get(args[i].substring("--report=".length()));
            else { System.err.println("未知参数: " + args[i]); System.exit(2); }
        }
        if (!Files.isDirectory(root)) { System.err.println("不是目录: " + root); System.exit(2); }

        List<Path> files = new ArrayList<>();
        collect(root, files);
        Collections.sort(files);
        System.out.println("扫描 .java 文件: " + files.size() + "  (root=" + root + ")");

        // ---------- 阶段 1a: 索引注解类型 ----------
        Map<String, List<AnnType>> index = new LinkedHashMap<>();
        List<AnnType> allTypes = new ArrayList<>();
        for (Path f : files) {
            String text = read(f);
            AnnType at = parseAnnType(f, text);
            if (at == null) continue;
            index.computeIfAbsent(at.simpleName, k -> new ArrayList<>()).add(at);
            allTypes.add(at);
        }
        int elemCount = 0;
        for (AnnType at : allTypes) elemCount += at.elements.size();
        System.out.println("发现 @interface 类型: " + allTypes.size()
                + " 个（简单名 " + index.size() + " 个）/ 已解析注解元素: " + elemCount);

        // ---------- 阶段 1b: 统计使用处引用过的元素名 ----------
        Map<String, Set<String>> usedNames = new HashMap<>();
        for (Path f : files) {
            String text = read(f);
            for (Usage u : scanUsages(text, index)) {
                for (Pair p : u.pairs) {
                    usedNames.computeIfAbsent(u.annName, k -> new HashSet<>()).add(p.name);
                }
            }
        }

        // ---------- 阶段 1c: 转换字段式元素 ----------
        int bodyFixedFiles = 0, bodyConverted = 0;
        for (AnnType at : allTypes) {
            Set<String> used = usedNames.get(at.simpleName);
            if (used == null || used.isEmpty()) continue;
            String text = read(at.file);
            String fixed = fixAnnBody(text, at, used);
            if (!fixed.equals(text)) {
                bodyFixedFiles++;
                if (!dryRun) write(at.file, fixed);
            }
            bodyConverted += countConverted(at);
        }
        System.out.println("注解体字段式元素 -> 元素方法: " + bodyConverted
                + " 处，涉及文件 " + bodyFixedFiles);

        // ---------- 阶段 2: 修使用处 ----------
        int filesTouched = 0, totalRenames = 0, totalAnn = 0, totalIssues = 0;
        List<FileResult> results = new ArrayList<>();
        for (Path f : files) {
            String text = read(f);
            if (text.indexOf('@') < 0) continue;
            FileResult fr = process(f, text, index);
            if (fr == null) continue;
            results.add(fr);
            if (!fr.issues.isEmpty()) {
                for (String s : fr.issues) System.out.println("  [未解决] " + s);
                totalIssues += fr.issues.size();
            }
            if (!fr.edits.isEmpty()) {
                filesTouched++;
                totalRenames += fr.edits.size();
                totalAnn += fr.annotationsTouched;
                if (!dryRun) write(f, fr.newText);
            }
        }

        System.out.println();
        System.out.println("=== 摘要 ===");
        System.out.println("使用处被改写的文件:      " + filesTouched);
        System.out.println("被改写的注解使用处:      " + totalAnn);
        System.out.println("被改写的元素名:          " + totalRenames);
        System.out.println("未能自动解决的问题:      " + totalIssues);
        if (dryRun) System.out.println("(dry-run，未落盘)");

        if (report != null) { writeReport(report, results); System.out.println("报告已写出: " + report); }
    }

    // ------------------------------------------------------------------ 文件 IO

    static void collect(Path dir, List<Path> out) throws IOException {
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(dir)) {
            for (Path p : ds) {
                if (Files.isDirectory(p)) collect(p, out);
                else if (p.getFileName().toString().endsWith(".java")) out.add(p);
            }
        }
    }

    static String read(Path p) throws IOException {
        return new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
    }

    static void write(Path p, String s) throws IOException {
        Files.write(p, s.getBytes(StandardCharsets.UTF_8));
    }

    // ------------------------------------------------------------------ 注解类型解析

    /** 该文件声明了 @interface 就返回它，否则 null。 */
    static AnnType parseAnnType(Path file, String text) {
        Matcher m = ANN_DECL.matcher(text);
        if (!m.find()) return null;
        AnnType at = new AnnType();
        at.simpleName = m.group("name");
        at.file = file;
        at.packageName = packageOf(text);
        int brace = text.indexOf('{', m.end());
        if (brace < 0) return at;
        int close = matchBrace(text, brace);
        if (close < 0) return at;
        String body = text.substring(brace + 1, close);
        for (int[] sp : memberSpans(body)) {
            String raw = body.substring(sp[0], sp[1]);
            String member = raw.trim();
            if (member.isEmpty()) continue;
            if (NESTED_TYPE.matcher(member).find()) continue;
            if (HAS_MODIFIER.matcher(member).find() && !member.contains("(")) continue;
            Matcher mm = METHOD_ELEM.matcher(member);
            if (mm.matches()) {
                at.elements.put(mm.group("name"),
                        new Element(mm.group("name"), mm.group("type").replaceAll("\\s+", ""), mm.group("def")));
                continue;
            }
            Matcher fm = FIELD_ELEM.matcher(member);
            if (fm.matches() && !HAS_MODIFIER.matcher(member).find()) {
                at.pending.add(new FieldMember(raw, fm.group("type").replaceAll("\\s+", ""),
                        fm.group("name"), fm.group("init")));
            }
        }
        return at;
    }

    static int countConverted(AnnType at) {
        int c = 0;
        for (FieldMember f : at.pending) if (f.converted) c++;
        return c;
    }

    static String packageOf(String text) {
        Matcher m = Pattern.compile("(?m)^\\s*package\\s+([\\w.]+)\\s*;").matcher(text);
        return m.find() ? m.group(1) : "";
    }

    /** 注解体成员区间 [start,end)，end 含末尾 ';'。 */
    static List<int[]> memberSpans(String body) {
        List<int[]> out = new ArrayList<>();
        int i = 0, n = body.length(), start = 0, depth = 0;
        while (i < n) {
            char c = body.charAt(i);
            if (c == '"') { i = skipString(body, i); continue; }
            if (c == '\'') { i = skipChar(body, i); continue; }
            if (c == '/' && i + 1 < n && body.charAt(i + 1) == '/') {
                while (i < n && body.charAt(i) != '\n') i++;
                continue;
            }
            if (c == '/' && i + 1 < n && body.charAt(i + 1) == '*') {
                int e = body.indexOf("*/", i + 2);
                i = (e < 0) ? n : e + 2;
                continue;
            }
            if (c == '{') {
                if (depth == 0 && NESTED_TYPE.matcher(body.substring(start, i)).find()) {
                    int e = matchBrace(body, i);
                    i = (e < 0) ? n : e + 1;
                    if (i < n && body.charAt(i) == ';') i++;
                    out.add(new int[]{start, i});
                    start = i;
                    continue;
                }
                depth++;
            } else if (c == '}') {
                depth--;
            } else if (c == ';' && depth == 0) {
                out.add(new int[]{start, i + 1});
                start = i + 1;
            }
            i++;
        }
        if (start < n) out.add(new int[]{start, n});
        return out;
    }

    /**
     * 把注解体里被写成字段的成员 "类型 名字 = 初值;" 改写成 "类型 名字() default 初值;"。
     * 只转换 usedNames 命中的成员（确实被使用处当作元素引用过的），避免误伤常量。
     */
    static String fixAnnBody(String text, AnnType at, Set<String> usedNames) {
        Matcher dm = ANN_DECL.matcher(text);
        if (!dm.find()) return text;
        int brace = text.indexOf('{', dm.end());
        if (brace < 0) return text;
        int close = matchBrace(text, brace);
        if (close < 0) return text;
        String body = text.substring(brace + 1, close);

        StringBuilder nb = new StringBuilder();
        int cursor = 0;
        boolean changed = false;
        for (int[] sp : memberSpans(body)) {
            nb.append(body, cursor, sp[0]);
            String raw = body.substring(sp[0], sp[1]);
            String rep = null;
            for (FieldMember f : at.pending) {
                if (!f.raw.equals(raw)) continue;
                if (!usedNames.contains(f.name)) break;
                String newName = f.name;
                if (at.elements.containsKey(newName)) {
                    newName = f.name + "$" + typeSuffix(f.type);
                    int k = 2;
                    while (at.elements.containsKey(newName)) newName = f.name + "$" + typeSuffix(f.type) + k++;
                }
                at.elements.put(newName, new Element(newName, f.type, f.init));
                f.converted = true;
                String indent = raw.substring(0, raw.length() - raw.stripLeading().length());
                rep = indent + f.type + " " + newName + "() default " + f.init + ";";
                break;
            }
            if (rep == null) nb.append(raw); else { nb.append(rep); changed = true; }
            cursor = sp[1];
        }
        nb.append(body.substring(cursor));
        if (!changed) return text;
        return text.substring(0, brace + 1) + nb + text.substring(close);
    }

    /** 返回类型 -> 合法 Java 标识符片段（与 FixBytecode.sanitize 规则一致）。 */
    static String typeSuffix(String type) {
        String s = type.replaceAll("\\s+", "");
        if (s.endsWith("[]")) return "arr" + typeSuffix(s.substring(0, s.length() - 2));
        if (s.equals("void")) return "void";
        if (s.equals("int")) return "int";
        if (s.equals("long")) return "long";
        if (s.equals("boolean")) return "boolean";
        if (s.equals("double")) return "double";
        if (s.equals("float")) return "float";
        if (s.equals("byte")) return "byte";
        if (s.equals("short")) return "short";
        if (s.equals("char")) return "char";
        String simple = s;
        int i = simple.lastIndexOf('.');
        if (i >= 0) simple = simple.substring(i + 1);
        return simple.replace('$', '_');
    }

    // ------------------------------------------------------------------ 使用处扫描

    /** 扫描一个文件里所有已知注解类型的使用处。 */
    static List<Usage> scanUsages(String text, Map<String, List<AnnType>> index) {
        List<Usage> out = new ArrayList<>();
        int n = text.length(), i = 0;
        while (i < n) {
            char c = text.charAt(i);
            if (c == '"') { i = skipString(text, i); continue; }
            if (c == '\'') { i = skipChar(text, i); continue; }
            if (c == '/' && i + 1 < n && text.charAt(i + 1) == '/') {
                while (i < n && text.charAt(i) != '\n') i++;
                continue;
            }
            if (c == '/' && i + 1 < n && text.charAt(i + 1) == '*') {
                int e = text.indexOf("*/", i + 2);
                i = (e < 0) ? n : e + 2;
                continue;
            }
            if (c != '@') { i++; continue; }

            int j = i + 1;
            while (j < n && isWs(text.charAt(j))) j++;
            int segStart = j;
            while (j < n && isIdentPart(text.charAt(j))) j++;
            if (j == segStart) { i++; continue; }
            // 允许 @com.foo.Bar
            while (j < n && text.charAt(j) == '.' && j + 1 < n && isIdentStart(text.charAt(j + 1))) {
                j++;
                while (j < n && isIdentPart(text.charAt(j))) j++;
                segStart = j;
            }
            String simple = text.substring(segStart, j);

            List<AnnType> cands = index.get(simple);
            if (cands == null || cands.isEmpty()) { i = j; continue; }

            int k = j;
            while (k < n && isWs(text.charAt(k))) k++;
            if (k >= n || text.charAt(k) != '(') { i = j; continue; }
            int close = matchParen(text, k);
            if (close < 0) { i = j; continue; }

            Usage u = new Usage();
            u.at = pickType(cands, packageOf(text));
            u.annName = simple;
            u.argsStart = k + 1;
            u.argsEnd = close;
            u.args = text.substring(k + 1, close);
            u.pairs = parsePairs(u.args);
            out.add(u);
            i = close;
        }
        return out;
    }

    /** 把实参文本切成 "名字 = 值" 对。 */
    static List<Pair> parsePairs(String args) {
        List<Pair> out = new ArrayList<>();
        if (args.trim().isEmpty()) return out;
        for (int[] seg : splitTopLevel(args)) {
            String part = args.substring(seg[0], seg[1]);
            int eq = topLevelEquals(part);
            if (eq < 0) continue;
            String lhs = part.substring(0, eq).trim();
            if (!lhs.matches("[A-Za-z_$][\\w$]*")) continue;
            int ls = part.indexOf(lhs);
            if (ls < 0) continue;
            out.add(new Pair(lhs, part.substring(eq + 1).trim(),
                    seg[0] + ls, seg[0] + ls + lhs.length()));
        }
        return out;
    }

    /** 同一简单名对应多个 @interface 时优先同包的那个。 */
    static AnnType pickType(List<AnnType> cands, String pkg) {
        if (cands.size() == 1) return cands.get(0);
        for (AnnType a : cands) if (a.packageName.equals(pkg)) return a;
        return cands.get(0);
    }

    // ------------------------------------------------------------------ 使用处改写

    static FileResult process(Path file, String text, Map<String, List<AnnType>> index) {
        List<Usage> usages = scanUsages(text, index);
        if (usages.isEmpty()) return null;

        FileResult fr = new FileResult();
        fr.file = file;
        List<Edit> edits = new ArrayList<>();

        for (Usage u : usages) {
            if (u.pairs.isEmpty()) continue;

            // 同一注解里重复出现的元素名 -> 需要按类型消歧
            Map<String, Integer> count = new HashMap<>();
            for (Pair p : u.pairs) count.merge(p.name, 1, Integer::sum);

            Map<Integer, String> resolved = new HashMap<>();
            Set<String> claimed = new HashSet<>();

            // 只有一处出现的名字
            for (int i = 0; i < u.pairs.size(); i++) {
                Pair p = u.pairs.get(i);
                if (count.get(p.name) > 1) continue;
                if (u.at.elements.containsKey(p.name)) { claimed.add(p.name); continue; }
                String r = resolve(u, p, i, claimed, fr.issues, file);
                if (r != null) { resolved.put(i, r); claimed.add(r); }
            }
            // 重复出现的名字
            for (int i = 0; i < u.pairs.size(); i++) {
                Pair p = u.pairs.get(i);
                if (count.get(p.name) <= 1) continue;
                if (claimed.contains(p.name)) continue;
                String r = resolve(u, p, i, claimed, fr.issues, file);
                if (r != null) { resolved.put(i, r); claimed.add(r); }
            }
            if (resolved.isEmpty()) continue;

            for (Map.Entry<Integer, String> en : resolved.entrySet()) {
                int i = en.getKey();
                Pair p = u.pairs.get(i);
                int s = u.argsStart + p.nameStart;
                int e = u.argsStart + p.nameEnd;
                edits.add(new Edit(s, e, en.getValue(), lineOf(text, s), u.annName,
                        p.name, en.getValue(), p.value));
            }
        }

        if (edits.isEmpty()) {
            if (fr.issues.isEmpty()) return null;
            return fr;
        }
        Collections.sort(edits, Comparator.comparingInt(x -> x.start));
        StringBuilder sb = new StringBuilder(text);
        for (int i = edits.size() - 1; i >= 0; i--) {
            Edit ed = edits.get(i);
            sb.replace(ed.start, ed.end, ed.text);
        }
        fr.newText = sb.toString();
        fr.edits = edits;
        fr.renames = edits.size();
        Set<String> anns = new HashSet<>();
        for (Edit ed : edits) anns.add(ed.annotation);
        fr.annotationsTouched = anns.size();
        return fr;
    }

    /** 把元素名解析到注解类型里真实存在的元素；null = 无法唯一确定。 */
    static String resolve(Usage u, Pair p, int idx, Set<String> claimed,
                          List<String> issues, Path file) {
        AnnType at = u.at;
        if (at.elements.containsKey(p.name)) return p.name;

        List<String> cands = new ArrayList<>();
        for (String en : at.elements.keySet()) {
            if ((en.equals(p.name) || en.startsWith(p.name + "$")) && !claimed.contains(en)) cands.add(en);
        }
        if (cands.isEmpty()) {
            issues.add(rel(file) + ": @" + u.annName + " 的元素 \"" + p.name
                    + "\" 在注解类型里不存在，也没有 \"" + p.name + "$*\" 候选（值=" + brief(p.value) + "）");
            return null;
        }
        List<String> typed = new ArrayList<>();
        for (String c : cands) {
            Element el = at.elements.get(c);
            if (compatible(familyOfDecl(el.type), familyOfValue(p.value))) typed.add(c);
        }
        if (typed.size() == 1) return typed.get(0);
        if (typed.size() > 1) {
            issues.add(rel(file) + ": @" + u.annName + " 的元素 \"" + p.name
                    + "\" 有多个类型相同的候选 " + typed + "，未自动修改（值=" + brief(p.value) + "）");
            return null;
        }
        if (cands.size() == 1) {
            issues.add(rel(file) + ": @" + u.annName + " 的元素 \"" + p.name + "\" -> \"" + cands.get(0)
                    + "\"（类型不匹配，仅按名字唯一匹配；值=" + brief(p.value) + "）");
            return cands.get(0);
        }
        issues.add(rel(file) + ": @" + u.annName + " 的元素 \"" + p.name
                + "\" 无法在候选 " + cands + " 中唯一确定（值=" + brief(p.value) + "）");
        return null;
    }

    // ------------------------------------------------------------------ 类型族判定

    static String familyOfDecl(String type) {
        String s = type.replaceAll("\\s+", "");
        if (s.endsWith("[]")) return "ARRAY:" + familyOfDecl(s.substring(0, s.length() - 2));
        if (s.equals("boolean")) return "boolean";
        if (s.equals("int") || s.equals("long") || s.equals("short") || s.equals("byte")
                || s.equals("char") || s.equals("float") || s.equals("double")) return "numeric";
        if (s.equals("String") || s.equals("java.lang.String")) return "String";
        if (s.equals("Class") || s.equals("java.lang.Class")) return "Class";
        return "OBJ";
    }

    static String familyOfValue(String v) {
        String s = v == null ? "" : v.trim();
        if (s.isEmpty()) return "?";
        if (s.startsWith("\"")) return "String";
        if (s.equals("true") || s.equals("false")) return "boolean";
        if (s.matches("[-+]?\\d+[lLfFdD]?")) return "numeric";
        if (s.matches("[\\w.$]+\\.class")) return "Class";
        if (s.startsWith("{")) {
            int close = s.lastIndexOf('}');
            String inner = close > 0 ? s.substring(1, close) : s.substring(1);
            List<int[]> segs = splitTopLevel(inner);
            if (segs.isEmpty()) return "ARRAY:?";
            return "ARRAY:" + familyOfValue(inner.substring(segs.get(0)[0], segs.get(0)[1]));
        }
        return "OBJ";
    }

    static boolean compatible(String df, String vf) {
        if (df.equals(vf)) return true;
        if (df.startsWith("ARRAY:") && vf.startsWith("ARRAY:")) {
            String a = df.substring(5), b = vf.substring(5);
            if (a.equals("?") || b.equals("?")) return true;
            return compatible(a, b);
        }
        return false;
    }

    // ------------------------------------------------------------------ 词法小工具

    static boolean isWs(char c) { return c == ' ' || c == '\t' || c == '\r' || c == '\n'; }
    static boolean isIdentStart(char c) { return Character.isJavaIdentifierStart(c); }
    static boolean isIdentPart(char c) { return Character.isJavaIdentifierPart(c); }

    static int skipString(String s, int i) {
        if (s.startsWith("\"\"\"", i)) {
            int e = s.indexOf("\"\"\"", i + 3);
            return e < 0 ? s.length() : e + 3;
        }
        int n = s.length();
        i++;
        while (i < n) {
            char c = s.charAt(i);
            if (c == '\\') { i += 2; continue; }
            if (c == '"') return i + 1;
            if (c == '\n') return i;
            i++;
        }
        return n;
    }

    static int skipChar(String s, int i) {
        int n = s.length();
        i++;
        while (i < n) {
            char c = s.charAt(i);
            if (c == '\\') { i += 2; continue; }
            if (c == '\'') return i + 1;
            if (c == '\n') return i;
            i++;
        }
        return n;
    }

    static int matchParen(String s, int open) {
        int depth = 0, i = open, n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            if (c == '"') { i = skipString(s, i); continue; }
            if (c == '\'') { i = skipChar(s, i); continue; }
            if (c == '/' && i + 1 < n && s.charAt(i + 1) == '/') {
                while (i < n && s.charAt(i) != '\n') i++;
                continue;
            }
            if (c == '/' && i + 1 < n && s.charAt(i + 1) == '*') {
                int e = s.indexOf("*/", i + 2);
                i = (e < 0) ? n : e + 2;
                continue;
            }
            if (c == '(') depth++;
            else if (c == ')') { depth--; if (depth == 0) return i; }
            i++;
        }
        return -1;
    }

    static int matchBrace(String s, int open) {
        int depth = 0, i = open, n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            if (c == '"') { i = skipString(s, i); continue; }
            if (c == '\'') { i = skipChar(s, i); continue; }
            if (c == '/' && i + 1 < n && s.charAt(i + 1) == '/') {
                while (i < n && s.charAt(i) != '\n') i++;
                continue;
            }
            if (c == '/' && i + 1 < n && s.charAt(i + 1) == '*') {
                int e = s.indexOf("*/", i + 2);
                i = (e < 0) ? n : e + 2;
                continue;
            }
            if (c == '{') depth++;
            else if (c == '}') { depth--; if (depth == 0) return i; }
            i++;
        }
        return -1;
    }

    static List<int[]> splitTopLevel(String s) {
        List<int[]> out = new ArrayList<>();
        if (s.trim().isEmpty()) return out;
        int depth = 0, start = 0, i = 0, n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            if (c == '"') { i = skipString(s, i); continue; }
            if (c == '\'') { i = skipChar(s, i); continue; }
            if (c == '(' || c == '{' || c == '[') { depth++; i++; continue; }
            if (c == ')' || c == '}' || c == ']') { depth--; i++; continue; }
            if (c == ',' && depth == 0) { out.add(new int[]{start, i}); start = i + 1; i++; continue; }
            i++;
        }
        out.add(new int[]{start, n});
        return out;
    }

    static int topLevelEquals(String part) {
        int depth = 0, i = 0, n = part.length();
        while (i < n) {
            char c = part.charAt(i);
            if (c == '"') { i = skipString(part, i); continue; }
            if (c == '\'') { i = skipChar(part, i); continue; }
            if (c == '(' || c == '{' || c == '[') { depth++; i++; continue; }
            if (c == ')' || c == '}' || c == ']') { depth--; i++; continue; }
            if (c == '=' && depth == 0) {
                boolean eq2 = (i + 1 < n && part.charAt(i + 1) == '=');
                boolean prev = (i > 0 && (part.charAt(i - 1) == '!' || part.charAt(i - 1) == '<'
                        || part.charAt(i - 1) == '>'));
                if (!eq2 && !prev) return i;
            }
            i++;
        }
        return -1;
    }

    static int lineOf(String s, int offset) {
        int line = 1;
        for (int i = 0; i < offset && i < s.length(); i++) if (s.charAt(i) == '\n') line++;
        return line;
    }

    static String brief(String v) {
        if (v == null) return "";
        String s = v.replaceAll("\\s+", " ").trim();
        return s.length() > 60 ? s.substring(0, 60) + "..." : s;
    }

    static String rel(Path p) {
        try {
            return Paths.get("").toAbsolutePath().relativize(p.toAbsolutePath()).toString();
        } catch (Exception e) {
            return p.toString();
        }
    }

    // ------------------------------------------------------------------ 报告

    static void writeReport(Path report, List<FileResult> results) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("file\tline\tannotation\toldElement\tnewElement\tvalue\n");
        for (FileResult fr : results) {
            for (Edit e : fr.edits) {
                sb.append(rel(fr.file)).append('\t').append(e.line).append('\t')
                        .append(e.annotation).append('\t')
                        .append(e.oldName).append('\t')
                        .append(e.newName).append('\t')
                        .append(brief(e.value)).append('\n');
            }
        }
        if (report.getParent() != null) Files.createDirectories(report.getParent());
        Files.write(report, sb.toString().getBytes(StandardCharsets.UTF_8));
    }
}
