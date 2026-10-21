import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * 错误驱动的源码树修复器。
 *
 * 读 javac 的完整错误日志（-Xmaxerrs 100000），按错误类别对源码做定点修补，
 * 反复迭代直到 javac 不再报错为止。
 *
 * 为什么必须"错误驱动"：反编译产物的缺陷种类太多，每种的外观都随上下文变化，
 * 靠正则盲改会误伤。javac 报的行列 + 符号名是唯一可靠的定位信息。
 */
public class FixTree {

    static class Err {
        String file; int line; int col; String msg;
        String symbol; String symKind; String srcLine;
    }

    static final Map<String, List<Err>> byFile = new LinkedHashMap<>();
    static int statReturn = 0, statBool = 0, statOverride = 0, statIface = 0,
               statVar = 0, statEnum = 0, statOther = 0, statSneaky = 0, statDeadCatch = 0;
    static final Set<String> touched = new TreeSet<>();
    static final List<String> unresolved = new ArrayList<>();
    /** 需要降级的假枚举：被 new 出来的枚举 */
    static final Set<String> fakeEnums = new TreeSet<>();

    public static void main(String[] args) throws Exception {
        String root = args[0];
        String log = args[1];
        parseLog(log);
        System.out.println("errors parsed=" + total() + "  files=" + byFile.size());

        for (Map.Entry<String, List<Err>> e : byFile.entrySet()) {
            Path f = Paths.get(e.getKey());
            if (!Files.exists(f)) continue;
            String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
            String out = src;
            for (Err er : e.getValue()) {
                String r = apply(er, out);
                if (r != null) out = r;
            }
            if (!out.equals(src)) {
                Files.write(f, out.getBytes(StandardCharsets.UTF_8));
                touched.add(f.toString());
            }
        }
        System.out.println("files modified=" + touched.size());
        System.out.println("  static-block wrapped        = " + statReturn);
        System.out.println("  boolean-cast fixed          = " + statBool);
        System.out.println("  @Override removed           = " + statOverride);
        System.out.println("  implements->extends         = " + statIface);
        System.out.println("  undeclared variable         = " + statVar);
        System.out.println("  sneaky throw               = " + statSneaky);
        System.out.println("  dead catch removed         = " + statDeadCatch);
        System.out.println("  fake enum candidates        = " + statEnum + " (" + fakeEnums.size() + " distinct)");
        System.out.println("  other                       = " + statOther);
        if (!fakeEnums.isEmpty()) {
            try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(args.length > 2 ? args[2] : "fake-enums.txt"),
                    StandardCharsets.UTF_8))) {
                for (String s : fakeEnums) w.println(s);
            }
            System.out.println("  -> fake enum list written to " + (args.length > 2 ? args[2] : "fake-enums.txt"));
        }
        if (!unresolved.isEmpty()) {
            System.out.println("--- unresolved (" + unresolved.size() + ") ---");
            int n = 0;
            for (String u : unresolved) { if (n++ >= 20) break; System.out.println("  " + u); }
        }
    }

    static int total() { int n = 0; for (List<Err> l : byFile.values()) n += l.size(); return n; }

    // ---------- 解析 javac 日志 ----------
    static void parseLog(String logPath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(logPath), StandardCharsets.UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            String l = lines.get(i);
            if (l.startsWith("Picked up ")) continue;
            Matcher m = Pattern.compile("^(.+?\\.java):(\\d+): error: (.*)$").matcher(l);
            if (!m.matches()) continue;
            Err er = new Err();
            er.file = m.group(1); er.line = Integer.parseInt(m.group(2)); er.msg = m.group(3);
            if (i + 2 < lines.size()) {
                er.srcLine = lines.get(i + 1);
                int c = lines.get(i + 2).indexOf('^');
                er.col = c >= 0 ? c + 1 : 1;
            }
            for (int k = i + 1; k < Math.min(i + 6, lines.size()); k++) {
                Matcher sm = Pattern.compile("^\\s*symbol:\\s+(class|variable|method)\\s+(\\S+)\\s*$")
                        .matcher(lines.get(k));
                if (sm.matches()) { er.symKind = sm.group(1); er.symbol = sm.group(2); break; }
            }
            byFile.computeIfAbsent(er.file, x -> new ArrayList<>()).add(er);
        }
    }

    static String apply(Err er, String src) {
        try {
            if (er.msg.contains("return outside method")) return fixReturn(er, src);
            if (er.msg.contains("cannot be converted to boolean")) return fixBooleanCast(er, src);
            if (er.msg.contains("does not override or implement")) return fixOverride(er, src);
            if (er.msg.contains("interface expected here")) return fixIface(er, src);
            if (er.msg.contains("enum types may not be instantiated")) return noteFakeEnum(er, src);
            if (er.msg.contains("unreported exception") && er.msg.contains("Throwable"))
                return fixSneakyThrow(er, src);
            if (er.msg.contains("is never thrown in body of corresponding try statement"))
                return fixDeadCatch(er, src);
            if (er.msg.startsWith("cannot find symbol") && "variable".equals(er.symKind))
                return fixUndeclaredVar(er, src);
        } catch (Exception ex) {
            unresolved.add(er.file + ":" + er.line + "  " + er.msg + "  (" + ex + ")");
            return null;
        }
        statOther++;
        return null;
    }

    // ---------- 7. throw x.getTargetException() 抛受检 Throwable ----------
    // 原始字节码是 "catch InvocationTargetException -> athrow targetException"，
    // 反编译成 Java 后变成 throw 一个受检 Throwable，方法签名里通常没法声明它
    // （比如实现 Runnable.run）。用 sneakyThrow 保留原异常类型又绕过受检检查。
    static String fixSneakyThrow(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String line = lines[idx];
        Matcher m = Pattern.compile("throw\\s+([\\w.$]+)\\.getTargetException\\(\\)\\s*;")
                .matcher(line);
        if (!m.find()) return null;
        String var = m.group(1);
        lines[idx] = line.substring(0, m.start())
                + "throw com.finalshell.reflect.Ref.<RuntimeException>sneaky("
                + var + ".getTargetException());"
                + line.substring(m.end());
        statSneaky++;
        return String.join("\n", lines);
    }

    // ---------- 8. catch 块永远不会触发（异常类型不再抛出） ----------
    // 反射改写后调用点不再抛 InvocationTargetException，原来的 catch 就成了死代码，
    // javac 报 "exception X is never thrown in body of corresponding try statement"。
    // 修法：把整个 catch 块删掉。
    static String fixDeadCatch(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        // 找到 catch 关键字
        int catchLine = -1;
        for (int i = Math.max(0, idx - 2); i < Math.min(lines.length, idx + 2); i++) {
            if (lines[i].contains("catch")) { catchLine = i; break; }
        }
        if (catchLine < 0) return null;
        // 找 catch 块的结束（右花括号）
        int depth = 0, end = -1;
        boolean started = false;
        for (int i = catchLine; i < lines.length; i++) {
            depth += count(lines[i], '{') - count(lines[i], '}');
            if (count(lines[i], '{') > 0) started = true;
            if (started && depth == 0) { end = i; break; }
        }
        if (end < 0) return null;
        // 同时删掉 catch 前面的那一行（可能是 "{"，需要改成 "}")
        int start = catchLine;
        String prev = catchLine > 0 ? lines[catchLine - 1].trim() : "";
        if (prev.equals("{")) {
            // try 块后面直接跟 catch —— 删掉 catch 后 try 的 { 也得去掉
            lines[catchLine - 1] = lines[catchLine - 1].replaceFirst("\\{\\s*$", "");
            start = catchLine - 1;
        }
        String[] out = new String[lines.length - (end - start + 1)];
        System.arraycopy(lines, 0, out, 0, start);
        System.arraycopy(lines, end + 1, out, start, lines.length - end - 1);
        statDeadCatch++;
        return String.join("\n", out);
    }

    // ---------- 1. static 块里的 return;  ->  把块体搬进私有静态方法 ----------
    /**
     * Vineflower 把不可约控制流画成 static { ... return; ... }，
     * 而 return; 在静态初始化块里是非法的（javac: return outside method）。
     *
     * 修法：把块体塞进一个带标签的 do-while(false)，return; 改成 break <标签>。
     *  - break 标签可以从任意深度跳出（含嵌套 switch），语义 = 提前结束 <clinit>
     *  - do-while(false) 保证块体最多执行一次，顺序执行语义不变
     *  - 块体仍留在 static 块里，所以对 final 静态字段的赋值依然合法
     *    （把块体搬进独立方法会破坏这一点）
     */
    static String fixReturn(Err er, String src) {
        String[] lines = src.split("\n", -1);
        boolean changed = false;
        for (int i = 0; i < lines.length; i++) {
            String t = lines[i];
            if (!t.matches("^(\\s*)static\\s*\\{\\s*$")) continue;
            // 找配对的右花括号
            int depth = 0, end = -1;
            for (int j = i; j < lines.length; j++) {
                depth += count(lines[j], '{') - count(lines[j], '}');
                if (depth == 0 && j > i) { end = j; break; }
            }
            if (end < 0) continue;
            // 块体里有没有裸的 return;
            int firstReturn = -1;
            for (int j = i + 1; j < end; j++) {
                if (lines[j].matches("^\\s*return;\\s*$")) { firstReturn = j; break; }
            }
            if (firstReturn < 0) continue;
            String indent = t.substring(0, t.indexOf("static"));
            // static {  ->  static { __vfClinit: do {
            lines[i] = indent + "static { __vfClinit: do {";
            // 块体里的 return;  ->  break __vfClinit;
            for (int j = i + 1; j < end; j++) {
                if (lines[j].matches("^\\s*return;\\s*$")) {
                    lines[j] = lines[j].replaceFirst("return;", "break __vfClinit;");
                }
            }
            // 结尾的 }  ->  } while (false); }
            lines[end] = lines[end] + " while (false); }";
            statReturn++;
            changed = true;
        }
        return changed ? String.join("\n", lines) : null;
    }

    // ---------- 2. (boolean) intExpr -> (boolean)(intExpr != 0) ----------
    static String fixBooleanCast(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String line = lines[idx];
        int c = er.col - 1;
        if (c < 0 || c >= line.length()) return null;
        int castPos = line.indexOf("(boolean)", c);
        if (castPos < 0) return null;
        int opPos = castPos + "(boolean)".length();
        while (opPos < line.length() && Character.isWhitespace(line.charAt(opPos))) opPos++;
        int end = scanPrimary(line, opPos);
        if (end <= opPos) return null;
        String operand = line.substring(opPos, end);
        if (operand.isEmpty()) return null;
        lines[idx] = line.substring(0, castPos) + "(boolean)(" + operand + " != 0)" + line.substring(end);
        statBool++;
        return String.join("\n", lines);
    }

    static int scanPrimary(String s, int pos) {
        int i = pos;
        if (i >= s.length()) return i;
        if (s.charAt(i) == '(') { int e = matchParen(s, i); if (e < 0) return pos; i = e; }
        else if (s.charAt(i) == '!') { i = scanPrimary(s, i + 1); }
        else {
            int st = i;
            while (i < s.length() && Character.isJavaIdentifierPart(s.charAt(i))) i++;
            if (i == st) return pos;
        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '.') {
                int j = i + 1;
                while (j < s.length() && Character.isJavaIdentifierPart(s.charAt(j))) j++;
                if (j == i + 1) break;
                i = j;
                if (i < s.length() && s.charAt(i) == '(') { int e = matchParen(s, i); if (e < 0) break; i = e; }
            } else if (ch == '[') {
                int e = s.indexOf(']', i);
                if (e < 0) break;
                i = e + 1;
            } else break;
        }
        return i;
    }

    static int matchParen(String s, int open) {
        int d = 0;
        for (int i = open; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') d++;
            else if (ch == ')') { d--; if (d == 0) return i + 1; }
        }
        return -1;
    }

    // ---------- 3. @Override 失效 -> 删掉 ----------
    static String fixOverride(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        for (int i = idx; i >= Math.max(0, idx - 3); i--) {
            if (lines[i].trim().equals("@Override")) {
                System.arraycopy(lines, i + 1, lines, i, lines.length - i - 1);
                statOverride++;
                return String.join("\n", lines);
            }
        }
        return null;
    }

    // ---------- 4. interface expected here -> implements 改 extends ----------
    static String fixIface(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String line = lines[idx];
        int c = er.col - 1;
        int s = c;
        while (s > 0 && Character.isJavaIdentifierPart(line.charAt(s - 1))) s--;
        int e = c;
        while (e < line.length() && Character.isJavaIdentifierPart(line.charAt(e))) e++;
        String name = line.substring(s, e);
        if (name.isEmpty()) return null;

        Matcher hm = Pattern.compile("^(.*?\\bclass\\s+\\w+)(.*)$").matcher(line);
        if (!hm.matches()) return null;
        String head = hm.group(1), rest = hm.group(2);

        String ext = "";
        Matcher em = Pattern.compile("\\bextends\\s+([^\\s{]+(?:\\s*,\\s*[^\\s{]+)*)").matcher(rest);
        if (em.find()) ext = em.group(1).trim();
        String imp = "";
        Matcher im = Pattern.compile("\\bimplements\\s+(.+)$").matcher(rest);
        if (im.find()) imp = im.group(1).trim();
        if (imp.isEmpty()) return null;

        List<String> impl = new ArrayList<>();
        for (String t : imp.split(",")) { String x = t.trim(); if (!x.isEmpty()) impl.add(x); }
        if (!impl.remove(name)) return null;
        List<String> extList = new ArrayList<>();
        if (!ext.isEmpty()) for (String t : ext.split(",")) { String x = t.trim(); if (!x.isEmpty()) extList.add(x); }
        extList.add(name);

        StringBuilder nb = new StringBuilder(head).append(" extends ").append(String.join(", ", extList));
        if (!impl.isEmpty()) nb.append(" implements ").append(String.join(", ", impl));
        nb.append(" {");
        lines[idx] = nb.toString();
        statIface++;
        return String.join("\n", lines);
    }

    // ---------- 5. enum types may not be instantiated -> 记下要降级的枚举 ----------
    static String noteFakeEnum(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String line = lines[idx];
        int c = er.col - 1;
        int n = line.indexOf("new ", c);
        if (n < 0) return null;
        int st = n + 4;
        int en = st;
        while (en < line.length() && (Character.isJavaIdentifierPart(line.charAt(en)))) en++;
        if (en == st) return null;
        fakeEnums.add(line.substring(st, en));
        statEnum++;
        return null;
    }

    // ---------- 6. 未声明的局部变量 -> 在方法开头补声明 ----------
    static String fixUndeclaredVar(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String var = er.symbol;
        if (var == null) return null;
        String line = lines[idx];
        Matcher m = Pattern.compile("^\\s*" + Pattern.quote(var) + "\\s*=\\s*\\(([\\w$.<>\\[\\]]+)\\)\\s*")
                .matcher(line);
        if (!m.matches()) return null;
        String type = m.group(1);
        int insert = findMethodStart(lines, idx);
        for (int i = insert; i < idx; i++) {
            if (lines[i].matches("^\\s*[\\w$.<>\\[\\]]+\\s+" + Pattern.quote(var) + "\\s*[;=].*")) return null;
        }
        lines[insert] = "      " + type + " " + var + ";" + System.lineSeparator() + lines[insert];
        statVar++;
        return String.join("\n", lines);
    }

    static int findMethodStart(String[] lines, int idx) {
        for (int i = idx; i >= 0; i--) {
            String t = lines[i].trim();
            if (t.endsWith("{") && !t.equals("{") && (t.contains("(") || t.equals("static {"))) return i + 1;
        }
        return 0;
    }

    static int count(String s, char ch) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == ch) n++;
        return n;
    }
}
