import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * 跨包可见性修复器。
 *
 * 背景：把原来"一个混淆包一个目录"的源码树按功能类别重新归包之后，
 * 原本同包内互访的**包级私有成员**变成了跨包访问，javac 会报：
 *     e() is not public in Fv2; cannot be accessed from outside package
 *     H has protected access in X
 *
 * 办法：把报错的成员声明改成 public。这是逆向重建工程的标准做法 ——
 * 原本的封装本来就是混淆器打乱的，没有"保持可见性"的意义。
 *
 * 用法: java FixVisibility <srcRoot> <javac.log>
 */
public class FixVisibility {

    public static void main(String[] args) throws Exception {
        Path root = Paths.get(args[0]);
        List<String> log = Files.readAllLines(Paths.get(args[1]), StandardCharsets.UTF_8);

        // 成员名 -> 所在包（javac 的消息里给的是包名，不是类名）
        Map<String, Set<String>> need = new LinkedHashMap<>();
        Pattern p1 = Pattern.compile("^(.*?)\\s+is not public in ([\\w.$]+); cannot be accessed");
        Pattern p2 = Pattern.compile("^(.*?)\\s+has (protected|private) access in ([\\w.$]+)");
        Pattern p3 = Pattern.compile("^(.*?)\\s+is private in ([\\w.$]+) and not accessible");
        for (String l : log) {
            // javac 的日志行是 "<路径>:<行号>: error: <消息>"，先把前缀剥掉
            String m = l.replaceFirst("^.*?:\\s*error:\\s*", "").trim();
            Matcher a = p1.matcher(m);
            if (a.find()) { add(need, a.group(1), a.group(2)); continue; }
            a = p2.matcher(m);
            if (a.find()) { add(need, a.group(1), a.group(3)); continue; }
            a = p3.matcher(m);
            if (a.find()) { add(need, a.group(1), a.group(2)); continue; }
        }
        // 去掉方法签名里的参数
        Map<String, Set<String>> members = new LinkedHashMap<>();
        for (Map.Entry<String, Set<String>> e : need.entrySet()) {
            String name = e.getKey().replaceAll("\\(.*", "").trim();
            if (name.isEmpty()) continue;
            members.computeIfAbsent(name, k -> new LinkedHashSet<>()).addAll(e.getValue());
        }
        System.out.println("members needing public: " + members.size());

        // 按包分组：一个包里的文件只读一次，逐个套用该包需要的成员
        Map<String, Set<String>> byPkg = new HashMap<>();
        for (Map.Entry<String, Set<String>> e : members.entrySet()) {
            for (String pkg : e.getValue()) {
                byPkg.computeIfAbsent(pkg, k -> new LinkedHashSet<>()).add(e.getKey());
            }
        }
        int filesChanged = 0, declsChanged = 0;
        for (Map.Entry<String, Set<String>> pe : byPkg.entrySet()) {
            Path pkgDir = root.resolve(pe.getKey().replace('.', File.separatorChar));
            if (!Files.isDirectory(pkgDir)) continue;
            List<Path> files = new ArrayList<>();
            try (java.util.stream.Stream<Path> st = Files.list(pkgDir)) {
                for (Path p : (Iterable<Path>) st.filter(x -> x.toString().endsWith(".java"))::iterator) files.add(p);
            }
            for (Path f : files) {
                String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                String out = makePublic(src, pe.getValue());
                if (!out.equals(src)) {
                    Files.write(f, out.getBytes(StandardCharsets.UTF_8));
                    filesChanged++;
                }
            }
        }
        System.out.println("files made public: " + filesChanged);
    }

    /** 声明名不能是关键字，否则会把 if/for/while 当成成员声明。 */
    static final Set<String> KEYWORDS = new HashSet<>(Arrays.asList(
            "if", "for", "while", "switch", "catch", "return", "new", "throw", "do", "else",
            "try", "finally", "case", "default", "break", "continue", "assert", "synchronized",
            "this", "super", "instanceof", "void", "int", "long", "short", "byte", "char",
            "boolean", "float", "double", "class", "interface", "enum", "package", "import",
            "public", "private", "protected", "static", "final", "abstract", "native",
            "transient", "volatile", "strictfp", "extends", "implements", "null", "true", "false"));

    /** 把一组成员的声明加上 public（先解析出声明的标识符，再查 HashSet）。 */
    static String makePublic(String src, Set<String> members) {
        if (members.isEmpty()) return src;
        // (a) 类型声明： [缩进][修饰符] class/interface/enum/record 名字 [extends ...] {
        Pattern tp = Pattern.compile("^(\\s*)((?:public|protected|private|static|final|abstract|sealed|non-sealed)\\s+)*"
                + "(class|interface|enum|record)\\s+([A-Za-z_$][\\w$]*)");
        // (b) 成员声明： [缩进][修饰符] 类型 名字 [;=(]
        Pattern p = Pattern.compile("^(\\s*)((?:public|protected|private|static|final|abstract|volatile|transient|synchronized|native|default|strictfp)\\s+)*"
                + "([\\w$.<>\\[\\],? ]+?\\s+)([A-Za-z_$][\\w$]*)\\s*([;=(])");
        String[] lines = src.split("\n", -1);
        boolean changed = false;
        for (int i = 0; i < lines.length; i++) {
            String l = lines[i];
            if (l.matches("^\\s*public\\b.*")) continue;
            String t = l.trim();
            if (t.isEmpty() || t.startsWith("//") || t.startsWith("*") || t.startsWith("/*")) continue;
            Matcher tm = tp.matcher(l);
            if (tm.find()) {
                if (!members.contains(tm.group(4))) continue;
                lines[i] = tm.group(1) + "public " + tm.group(2) + tm.group(3) + " " + tm.group(4)
                        + l.substring(tm.end(4));
                changed = true;
                continue;
            }
            Matcher m = p.matcher(l);
            if (!m.find()) continue;
            // 类型部分不能为空，否则 "if (x) {" 这种控制语句也会被匹配上，
            // 改出 "public if (x) {" 直接把文件改坏
            if (m.group(3).trim().isEmpty()) continue;
            String name = m.group(4);
            if (KEYWORDS.contains(name)) continue;
            if (!members.contains(name)) continue;
            lines[i] = m.group(1) + "public " + m.group(2) + m.group(3) + name + m.group(5)
                    + l.substring(m.end(4) + 1);
            changed = true;
        }
        return changed ? String.join("\n", lines) : src;
    }

    static void add(Map<String, Set<String>> need, String member, String cls) {
        need.computeIfAbsent(member, k -> new LinkedHashSet<>()).add(cls);
    }

    /** 把指定成员名的声明加上 public。 */
    static String makePublic(String src, String member) {
        String[] lines = src.split("\n", -1);
        boolean changed = false;
        // 方法：  [修饰符] 类型 名字(
        Pattern m1 = Pattern.compile("^(\\s*)((?:public|protected|private|static|final|abstract|synchronized|native|default|strictfp)\\s+)*"
                + "([\\w$.<>\\[\\],? ]+\\s+)" + Pattern.quote(member) + "\\s*\\(");
        // 字段：  [修饰符] 类型 名字 [;=]
        Pattern m2 = Pattern.compile("^(\\s*)((?:public|protected|private|static|final|abstract|volatile|transient)\\s+)*"
                + "([\\w$.<>\\[\\],? ]+\\s+)" + Pattern.quote(member) + "\\s*[;=]");
        for (int i = 0; i < lines.length; i++) {
            String l = lines[i];
            if (l.matches("^\\s*public\\b.*")) continue;          // 已经是 public
            Matcher a = m1.matcher(l);
            if (a.matches() && !l.trim().startsWith("//")) {
                lines[i] = a.group(1) + "public " + a.group(2) + a.group(3) + member + l.substring(a.end(3) + member.length());
                changed = true;
                continue;
            }
            Matcher b = m2.matcher(l);
            if (b.matches() && !l.trim().startsWith("//")) {
                lines[i] = b.group(1) + "public " + b.group(2) + b.group(3) + member + l.substring(b.end(3) + member.length());
                changed = true;
            }
        }
        return changed ? String.join("\n", lines) : src;
    }
}
