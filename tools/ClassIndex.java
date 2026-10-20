import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 建立 "内部名 &lt;-&gt; 源码可见类名" 映射表。
 *
 * <p>CFR 0.152 在 Windows 上输出源码时，为了避免大小写不敏感的文件名互相覆盖，
 * 会给冲突的类改名，并在文件头加一段注释：
 *
 * <pre>
 * /*
 *  * Renamed from com.Lk
 *  * /
 * class lk_0
 * implements ActionListener {
 * </pre>
 *
 * <p>因此：
 * <ul>
 *   <li>有 "Renamed from &lt;fqcn&gt;" 注释 &rarr; 内部名 = &lt;fqcn&gt; 的点换成斜杠</li>
 *   <li>没有该注释 &rarr; 内部名 = 包路径 + 类声明名（默认包则只有类名）</li>
 *   <li>源码可见名 = 文件里类声明的名字（可能是 CFR 改过的 lk_0 / _a_0 等）</li>
 * </ul>
 *
 * <p>用法：
 * <pre>java ClassIndex &lt;appDir&gt; [outTsv]</pre>
 */
public class ClassIndex {

    /** 一个源码类条目。 */
    public static final class Entry {
        /** 源码里的简单类名，例如 lk_0。 */
        public final String visible;
        /** 斜杠分隔的内部名，例如 com/Lk。 */
        public final String internal;
        /** 包名，默认包为 ""。 */
        public final String pkg;
        /** 源码中的全限定可见名，例如 com.lk_0。 */
        public final String visibleFqn;
        /** 相对 app/ 的源文件路径。 */
        public final String sourceFile;

        Entry(String visible, String internal, String pkg, String sourceFile) {
            this.visible = visible;
            this.internal = internal;
            this.pkg = pkg;
            this.sourceFile = sourceFile;
            this.visibleFqn = pkg.isEmpty() ? visible : pkg + "." + visible;
        }
    }

    private static final Pattern P_PACKAGE = Pattern.compile(
            "(?m)^[ \\t]*package[ \\t]+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)[ \\t]*;");
    private static final Pattern P_RENAMED = Pattern.compile(
            "Renamed from[ \\t]+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");
    /** 顶层类型声明（列 0 起，容忍注解与修饰符）。 */
    private static final Pattern P_TYPE = Pattern.compile(
            "(?m)^[ \\t]*(?:@[A-Za-z_$][\\w$.]*(?:[ \\t]*\\([^()]*\\))?[ \\t]*)*"
            + "(?:(?:public|final|abstract|strictfp|sealed|non-sealed)[ \\t]+)*"
            + "(?:class|interface|enum|@interface)[ \\t]+([A-Za-z_$][\\w$]*)");
    private static final Pattern P_INDENTED_TYPE = Pattern.compile(
            "(?m)^[ \\t]+(?:@[A-Za-z_$][\\w$.]*(?:[ \\t]*\\([^()]*\\))?[ \\t]*)*"
            + "(?:(?:public|protected|private|static|final|abstract|strictfp|sealed|non-sealed)[ \\t]+)*"
            + "(?:class|interface|enum|@interface)[ \\t]+([A-Za-z_$][\\w$]*)");

    /** 内部名 -> 条目。 */
    private final Map<String, Entry> byInternal = new LinkedHashMap<>();
    /** 源码可见全名 -> 条目。 */
    private final Map<String, Entry> byVisibleFqn = new LinkedHashMap<>();
    /** 简单可见名 -> 条目（仅当全局唯一时才有）。 */
    private final Map<String, Entry> bySimpleName = new LinkedHashMap<>();

    public Map<String, Entry> byInternal() { return byInternal; }
    public Map<String, Entry> byVisibleFqn() { return byVisibleFqn; }
    public Map<String, Entry> bySimpleName() { return bySimpleName; }

    public Entry get(String internal) { return byInternal.get(internal); }

    /** 把源码里写出来的类型名解析成内部名；解析不了返回 null。 */
    public String resolveType(String written) {
        if (written == null) return null;
        String t = written.trim();
        if (t.isEmpty()) return null;
        // 数组 / 泛型 / 基本类型
        if (t.endsWith("[]")) return null;
        if (t.indexOf('<') >= 0) t = t.substring(0, t.indexOf('<')).trim();
        if (t.isEmpty()) return null;
        Entry e = null;
        if (t.indexOf('.') >= 0) {
            e = byVisibleFqn.get(t);
        } else {
            e = bySimpleName.get(t);
        }
        if (e != null) return e.internal;
        // 不是本工程里的类 —— 当作外部类（JDK / 第三方库），内部名 = 点换斜杠
        if (t.indexOf('.') >= 0) return t.replace('.', '/');
        return null;
    }

    /** 源码里引用某个内部名类时应该写的名字（考虑包可见性）。 */
    public String visibleOf(String internal, String currentPkg) {
        Entry e = byInternal.get(internal);
        if (e == null) return internal.replace('/', '.');
        if (e.pkg.isEmpty()) return e.visible;
        if (e.pkg.equals(currentPkg)) return e.visible;
        return e.pkg + "." + e.visible;
    }

    /** 源码里做转型时应该写的名字（总是带包前缀，除非默认包）。 */
    public String qualifiedVisibleOf(String internal) {
        Entry e = byInternal.get(internal);
        if (e == null) return internal.replace('/', '.');
        if (e.pkg.isEmpty()) return e.visible;
        return e.pkg + "." + e.visible;
    }

    public int size() { return byInternal.size(); }

    // ------------------------------------------------------------------

    public static ClassIndex build(Path appDir) throws IOException {
        ClassIndex idx = new ClassIndex();
        List<Path> files;
        try (Stream<Path> st = Files.walk(appDir)) {
            files = st.filter(p -> p.toString().endsWith(".java")).sorted().collect(Collectors.toList());
        }
        Map<String, Integer> simpleNameCount = new LinkedHashMap<>();
        Map<String, Entry> pending = new LinkedHashMap<>();

        for (Path p : files) {
            String rel = appDir.relativize(p).toString().replace('\\', '/');
            String text;
            try {
                text = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
            } catch (IOException e) {
                continue;
            }
            Matcher pm = P_PACKAGE.matcher(text);
            String pkg = pm.find() ? pm.group(1) : "";

            Matcher rm = P_RENAMED.matcher(text);
            String renamed = rm.find() ? rm.group(1) : null;

            String visible = null;
            Matcher tm = P_TYPE.matcher(text);
            if (tm.find()) {
                visible = tm.group(1);
            } else {
                // 退化：文件基名去掉 .java
                String base = rel.substring(rel.lastIndexOf('/') + 1);
                visible = base.substring(0, base.length() - 5);
                // 若基名带 _N 后缀（CFR 的重名编号），去掉后缀并尝试匹配声明
                Matcher im = P_INDENTED_TYPE.matcher(text);
                if (im.find()) visible = im.group(1);
            }

            String internal;
            if (renamed != null) {
                internal = renamed.replace('.', '/');
            } else if (pkg.isEmpty()) {
                internal = visible;
            } else {
                internal = pkg.replace('.', '/') + "/" + visible;
            }

            Entry entry = new Entry(visible, internal, pkg, rel);
            idx.byInternal.putIfAbsent(internal, entry);
            idx.byVisibleFqn.putIfAbsent(entry.visibleFqn, entry);
            simpleNameCount.merge(visible, 1, Integer::sum);
            pending.put(visible, entry);
        }

        // 简单名只有在全局唯一时才可用于消歧
        for (Map.Entry<String, Entry> e : pending.entrySet()) {
            if (simpleNameCount.getOrDefault(e.getKey(), 0) == 1) {
                idx.bySimpleName.putIfAbsent(e.getKey(), e.getValue());
            }
        }
        return idx;
    }

    /** 输出 tables/classindex.tsv（表头 visible \t internal \t sourceFile）。 */
    public static void writeTsv(ClassIndex idx, Path out) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add("visible\tinternal\tsourceFile");
        List<Entry> es = new ArrayList<>(idx.byInternal.values());
        es.sort(Comparator.comparing(e -> e.internal));
        for (Entry e : es) {
            lines.add(e.visibleFqn + "\t" + e.internal + "\t" + e.sourceFile);
        }
        Path parent = out.getParent();
        if (parent != null) Files.createDirectories(parent);
        Files.write(out, lines, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws Exception {
        Path appDir = Paths.get(args[0]);
        ClassIndex idx = build(appDir);
        System.out.println("classes=" + idx.size()
                + "  visibleFqn=" + idx.byVisibleFqn().size()
                + "  uniqueSimple=" + idx.bySimpleName().size());
        if (args.length > 1) {
            Path out = Paths.get(args[1]);
            writeTsv(idx, out);
            System.out.println("wrote " + out);
        }
    }
}
