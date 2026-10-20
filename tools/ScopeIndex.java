import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * 源码作用域索引：把源码里写的类引用解析到 jar 的内部名。
 *
 * 两个难点：
 *  1. CFR 改过名（大小写冲突类）—— 源码里写的是 "Renamed from" 注释里的新名字，
 *     但要查表得用原内部名。
 *  2. 同一个简单名在多个包下都存在（com/ah 和 com/x/ah），
 *     所以必须靠 import + 当前包来消歧。
 */
public class ScopeIndex {
    /** 内部名 -> 源码可见的简单名 */
    public final Map<String, String> internalToSimple = new HashMap<>();
    /** "包.可见简单名" -> 内部名 */
    public final Map<String, String> qualifiedToInternal = new HashMap<>();
    /** 简单名 -> 内部名列表（仅当全局唯一时可用） */
    public final Map<String, List<String>> simpleToInternal = new HashMap<>();

    private static final Pattern RE_RENAMED = Pattern.compile("Renamed from ([\\w.$]+)");
    private static final Pattern RE_PKG = Pattern.compile("^\\s*package\\s+([\\w.]+)\\s*;", Pattern.MULTILINE);
    private static final Pattern RE_IMPORT = Pattern.compile("^\\s*import\\s+(?!static\\s)([\\w.$]+)\\s*;", Pattern.MULTILINE);
    private static final Pattern RE_IMPORT_STATIC = Pattern.compile("^\\s*import\\s+static\\s+([\\w.$]+)\\s*;", Pattern.MULTILINE);
    private static final Pattern RE_CLASS = Pattern.compile(
            "^(?:public\\s+|final\\s+|abstract\\s+|static\\s+)*(?:class|interface|enum|@interface)\\s+(\\w+)", Pattern.MULTILINE);

    /** 每个源文件的作用域信息。 */
    public static class Scope {
        public String pkg = "";
        /** import 的简单名 -> 内部名 */
        public final Map<String, String> imports = new HashMap<>();
        /** 当前包下的简单名 -> 内部名 */
        public final Map<String, String> samePkg = new HashMap<>();
        /** 全局唯一可解析的简单名 -> 内部名 */
        public final Map<String, String> unique = new HashMap<>();
    }

    public final Map<Path, Scope> scopes = new HashMap<>();

    /** 扫一遍源码树，建立全部索引。 */
    public void index(Path srcRoot) throws IOException {
        // 第一遍：文件 -> (可见名, 内部名)
        List<Object[]> files = new ArrayList<>();   // [Path, visible, internal]
        try (java.util.stream.Stream<Path> st = Files.walk(srcRoot)) {
            for (Path f : (Iterable<Path>) st.filter(x -> x.toString().endsWith(".java"))::iterator) {
                String txt = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                Matcher rm = RE_RENAMED.matcher(txt);
                String internal = rm.find() ? rm.group(1) : null;
                Matcher cm = RE_CLASS.matcher(txt);
                if (!cm.find()) continue;
                String visible = cm.group(1);
                if (internal == null) {
                    Matcher pm = RE_PKG.matcher(txt);
                    String pkg = pm.find() ? pm.group(1) : "";
                    internal = pkg.isEmpty() ? visible : pkg + "." + visible;
                }
                internal = internal.replace('.', '/');
                files.add(new Object[]{f, visible, internal});
                internalToSimple.put(internal, visible);
                qualifiedToInternal.put(internal.replace('/', '.'), internal);
                simpleToInternal.computeIfAbsent(visible, k -> new ArrayList<>()).add(internal);
            }
        }
        // 第二遍：建每个文件的作用域
        for (Object[] row : files) {
            Path f = (Path) row[0];
            String visible = (String) row[1];
            String internal = (String) row[2];
            Scope sc = new Scope();
            String txt = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
            Matcher pm = RE_PKG.matcher(txt);
            if (pm.find()) sc.pkg = pm.group(1);
            Matcher im = RE_IMPORT.matcher(txt);
            while (im.find()) {
                String fqn = im.group(1);
                int dot = fqn.lastIndexOf('.');
                if (dot < 0) continue;
                sc.imports.put(fqn.substring(dot + 1), fqn.replace('.', '/'));
            }
            Matcher sm = RE_IMPORT_STATIC.matcher(txt);
            while (sm.find()) {
                String fqn = sm.group(1);
                int dot = fqn.lastIndexOf('.');
                if (dot < 0) continue;
                sc.imports.put(fqn.substring(dot + 1), fqn.replace('.', '/'));
            }
            sc.samePkg.put(visible, internal);
            scopes.put(f, sc);
        }
        // 全局唯一简单名
        for (Map.Entry<String, List<String>> e : simpleToInternal.entrySet()) {
            if (e.getValue().size() == 1) {
                for (Scope sc : scopes.values()) sc.unique.put(e.getKey(), e.getValue().get(0));
            }
        }
    }

    /** 把源码里的一段类引用解析成内部名；解析不了返回 null。 */
    public String resolve(Scope sc, String ref) {
        if (ref == null || ref.isEmpty()) return null;
        if (ref.indexOf('.') >= 0) {
            // 可能是 "com.DI" 或 "com.DI.Inner"
            String direct = qualifiedToInternal.get(ref);
            if (direct != null) return direct;
            // 去掉内部类后缀再试
            int dot = ref.lastIndexOf('.');
            if (dot > 0) {
                String outer = qualifiedToInternal.get(ref.substring(0, dot));
                if (outer != null) return outer;
            }
            return null;
        }
        String viaImport = sc.imports.get(ref);
        if (viaImport != null) return viaImport;
        String viaPkg = sc.samePkg.get(ref);
        if (viaPkg != null) return viaPkg;
        return sc.unique.get(ref);
    }

    public static void main(String[] args) throws Exception {
        ScopeIndex si = new ScopeIndex();
        si.index(Paths.get(args[0]));
        System.out.println("internal classes=" + si.internalToSimple.size()
                           + "  source files=" + si.scopes.size());
        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(args[1]), StandardCharsets.UTF_8))) {
            w.println("internal\tvisible\tqualified");
            for (Map.Entry<String, String> e : si.internalToSimple.entrySet()) {
                w.println(e.getKey() + "\t" + e.getValue() + "\t" + e.getValue().replace('/', '.'));
            }
        }
    }
}
