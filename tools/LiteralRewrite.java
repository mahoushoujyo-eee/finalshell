import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * 把加密的字符串/数值常量调用点替换成真实字面量。
 *
 * 关键点：同一个 (n, n2) 在不同类下解出不同的值（实测 24,948 组冲突），
 * 所以必须先按源码作用域把类引用解析成内部名，再查表。
 *
 * 解密失败（FAIL）的一律保持原样 —— 绝不写入猜测值。
 */
public class LiteralRewrite {
    /** "owner|name|n|n2" -> 明文 / 数值 */
    private final Map<String, String> strings = new HashMap<>();
    private final Map<String, Long> numbers = new HashMap<>();
    private final ScopeIndex scope;

    public LiteralRewrite(ScopeIndex scope) { this.scope = scope; }

    public void loadStrings(Path tsv) throws IOException {
        for (String[] r : Tsv.read(tsv)) {
            if (r.length < 6 || "FAIL".equals(r[5])) continue;
            strings.put(r[0] + "|" + r[1] + "|" + r[3] + "|" + r[4], r[5]);
        }
    }

    public void loadNumbers(Path tsv) throws IOException {
        for (String[] r : Tsv.read(tsv)) {
            if (r.length < 6 || "FAIL".equals(r[5])) continue;
            try {
                numbers.put(r[0] + "|" + r[1] + "|" + r[3] + "|" + r[4], Long.parseLong(r[5]));
            } catch (NumberFormatException ignored) { }
        }
    }

    /** 匹配 <类引用>.<方法>(<int>, <int>[L]) */
    private static final Pattern CALL = Pattern.compile(
            "([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)\\.([a-zA-Z_$][\\w$]*)\\((-?\\d+), (-?\\d+)(L?)\\)");

    public int replaced = 0;
    public int unresolved = 0;

    /** 改写一个文件。 */
    public String rewrite(Path file, String txt) {
        ScopeIndex.Scope sc = scope.scopes.get(file);
        if (sc == null) sc = new ScopeIndex.Scope();
        Matcher m = CALL.matcher(txt);
        StringBuffer sb = new StringBuffer();
        int fileReplaced = 0;
        while (m.find()) {
            String ref = m.group(1);
            String meth = m.group(2);
            String n = m.group(3);
            String n2 = m.group(4);
            boolean isLong = !m.group(5).isEmpty();

            String internal = scope.resolve(sc, ref);
            if (internal == null) { unresolved++; m.appendReplacement(sb, Matcher.quoteReplacement(m.group(0))); continue; }

            String rep = null;
            if (isLong) {
                Long v = numbers.get(internal + "|" + meth + "|" + n + "|" + n2);
                if (v != null) rep = v + "L";
            } else {
                String v = strings.get(internal + "|" + meth + "|" + n + "|" + n2);
                if (v != null) rep = quote(v);
            }
            if (rep == null) { unresolved++; m.appendReplacement(sb, Matcher.quoteReplacement(m.group(0))); continue; }
            fileReplaced++;
            m.appendReplacement(sb, Matcher.quoteReplacement(rep));
        }
        m.appendTail(sb);
        replaced += fileReplaced;
        return sb.toString();
    }

    /** Java 字符串字面量转义。 */
    public static String quote(String s) {
        StringBuilder sb = new StringBuilder(s.length() + 2);
        sb.append('"');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '\\': sb.append("\\\\"); break;
                case '"': sb.append("\\\""); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (c < 0x20 || c > 0x7e) sb.append(String.format("\\u%04x", (int) c));
                    else sb.append(c);
            }
        }
        return sb.append('"').toString();
    }

    public static void main(String[] args) throws Exception {
        // args: srcRoot outRoot stringsTsv numbersTsv
        Path src = Paths.get(args[0]);
        Path out = Paths.get(args[1]);
        ScopeIndex si = new ScopeIndex();
        si.index(src);
        System.out.println("indexed " + si.scopes.size() + " files, "
                           + si.internalToSimple.size() + " classes");
        LiteralRewrite lr = new LiteralRewrite(si);
        lr.loadStrings(Paths.get(args[2]));
        lr.loadNumbers(Paths.get(args[3]));
        System.out.println("strings=" + lr.strings.size() + " numbers=" + lr.numbers.size());

        int files = 0, changed = 0;
        try (java.util.stream.Stream<Path> st = Files.walk(src)) {
            for (Path f : (Iterable<Path>) st.filter(x -> x.toString().endsWith(".java"))::iterator) {
                String txt = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                String res = lr.rewrite(f, txt);
                Path target = out.resolve(src.relativize(f).toString());
                Files.createDirectories(target.getParent());
                Files.write(target, res.getBytes(StandardCharsets.UTF_8));
                files++;
                if (!res.equals(txt)) changed++;
            }
        }
        System.out.println("files=" + files + " changed=" + changed
                           + " replaced=" + lr.replaced + " unresolved=" + lr.unresolved);
    }
}
