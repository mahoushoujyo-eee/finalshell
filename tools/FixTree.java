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
               statVar = 0, statEnum = 0, statOther = 0, statSneaky = 0, statDeadCatch = 0,
               statResugar = 0, statDupDecl = 0, statIncompat = 0, statNewNoParens = 0, statNewArray = 0, statForEach = 0, statUnknown = 0, statNewReturn = 0,
               statPrimType = 0, statPromote = 0;
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
        System.out.println("  dup declaration removed    = " + statDupDecl);
        System.out.println("  incompatible types fixed   = " + statIncompat);
        System.out.println("  prim type mismatch fixed   = " + statPrimType);
        System.out.println("  var type promoted          = " + statPromote);
        System.out.println("  new T; fixed             = " + statNewNoParens);
        System.out.println("  new prim(...) fixed       = " + statNewArray);
        System.out.println("  for-each renamed          = " + statForEach);
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
            // 【重要】下面每条规则都写成"非 null 才 return"。
            // 写成 `return fixXxx(er, src)` 时，规则一旦判定"这个错误我修不了"
            // 就返回 null，而 null 会被当成"处理完了"直接 return 掉 ——
            // 后面所有规则都没机会跑。实测这一条就吃掉了上千个
            // "incompatible types" 的修复机会。
            if (er.msg.contains("return outside method")) {
                String r = fixReturn(er, src); if (r != null) return r;
            }
            if (er.msg.contains("cannot be converted to boolean")) {
                String r = fixBooleanCast(er, src); if (r != null) return r;
            }
            if (er.msg.contains("does not override or implement")) {
                String r = fixOverride(er, src); if (r != null) return r;
            }
            if (er.msg.contains("interface expected here")) {
                String r = fixIface(er, src); if (r != null) return r;
            }
            if (er.msg.contains("enum types may not be instantiated")) {
                String r = noteFakeEnum(er, src); if (r != null) return r;
            }
            if (er.msg.contains("unreported exception") && er.msg.contains("Throwable")) {
                String r = fixSneakyThrow(er, src); if (r != null) return r;
            }
            if (er.msg.contains("is already defined in method")) {
                String r = fixDupDecl(er, src); if (r != null) return r;
            }
            if (er.msg.contains("bad initializer for for-loop")) {
                String r = fixForEach(er, src); if (r != null) return r;
            }
            if (er.msg.contains("illegal start of expression")) {
                String r = fixUnknown(er, src); if (r != null) return r;
            }
            if (er.msg.contains("not a statement") || er.msg.contains("';' expected")
                || er.msg.contains("'(' or '[' expected") || er.msg.contains("'[' expected")
                || er.msg.contains("']' expected") || er.msg.contains("')' expected")
                || er.msg.contains("<identifier> expected")) {
                String r = fixResugarCtor(er, src);
                if (r != null) return r;
                r = fixNewNoParens(er, src);
                if (r != null) return r;
                r = fixNewReturn(er, src);
                if (r != null) return r;
                r = fixNewArray(er, src);
                if (r != null) return r;
            }
            if (er.msg.startsWith("incompatible types: ")) {
                // 局部变量类型提升（改声明 + 给初值加强转）
                String pr = fixVarTypePromote(er, src);
                if (pr != null) return pr;
                // primitive 错配走保守规则（只转表达式 / 整行 return）
                String prim = fixPrimTypeMismatch(er, src);
                if (prim != null) return prim;
                // 注意：这个修补会在表达式里插强转，一旦插错位置就把文件改坏
                // （实测一轮下来 2 万多个语法错误）。默认关闭，需要时再开。
                if (System.getenv("FIXTREE_FIX_INCOMPAT") != null) {
                    String inc = fixIncompatible(er, src);
                    if (inc != null) return inc;
                }
                statOther++;
                return null;
            }
            if (er.msg.contains("is never thrown in body of corresponding try statement")) {
                String r = fixDeadCatch(er, src); if (r != null) return r;
            }
            if (er.msg.startsWith("cannot find symbol") && "variable".equals(er.symKind)) {
                String r = fixUndeclaredVar(er, src); if (r != null) return r;
            }
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
            // 找配对的右花括号（必须跳过字符串/字符字面量与注释，
            // 否则字面量里的一个 "}" 就会让配对错位，把后面的类体代码甩到块外）
            int[] delta = braceDelta(lines);
            int depth = 0, end = -1;
            for (int j = i; j < lines.length; j++) {
                depth += delta[j];
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

    // ---------- 9. Vineflower 的 "Unable to resugar constructor" ----------
    // 形如：  var11./* $VF: Unable to resugar constructor */<init>(var10002);
    // 这是非法 Java（"<identifier> expected"）。真实语义是 "new T(args)"。
    // 类型从同一方法里相同实参的 "new T(args)" 语句反推。
    static String fixResugarCtor(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        // 实参可能跨多行：一直找到配对的 ");" 为止
        int endLine = idx;
        StringBuilder joined = new StringBuilder();
        for (int k = idx; k < lines.length && k < idx + 40; k++) {
            if (k > idx) joined.append(' ');
            joined.append(lines[k].trim());
            String t = joined.toString();
            if (t.matches(".*\\);\\s*$")) { endLine = k; break; }
        }
        if (endLine == idx && !joined.toString().matches(".*\\);\\s*$")) return null;
        String whole = joined.toString();
        Matcher pm = Pattern.compile("^\\s*.*?\\.\\/\\* \\$VF: Unable to resugar constructor \\*\\/"
                + "<init>\\((.*)\\);\\s*$").matcher(whole);
        if (!pm.matches()) return null;
        String args = pm.group(1).trim();
        // 实参个数
        int n = 1, depth = 0;
        for (int i = 0; i < args.length(); i++) {
            char c = args.charAt(i);
            if (c == '(' || c == '[') depth++;
            else if (c == ')' || c == ']') depth--;
            else if (c == ',' && depth == 0) n++;
        }
        // 在同文件里找实参个数相同的 "new T(" —— 通常是 Vineflower 复制出来的那一段
        String type = null;
        for (String l : lines) {
            Matcher nm = Pattern.compile("\\bnew\\s+([A-Za-z_$][\\w$.]*)\\s*\\(").matcher(l);
            while (nm.find()) {
                int open = l.indexOf('(', nm.start());
                int close = matchParen(l, open) - 1;
                if (close < 0) continue;
                String inner = l.substring(open + 1, close);
                int c2 = 1, d2 = 0;
                for (int i = 0; i < inner.length(); i++) {
                    char c = inner.charAt(i);
                    if (c == '(' || c == '[') d2++;
                    else if (c == ')' || c == ']') d2--;
                    else if (c == ',' && d2 == 0) c2++;
                }
                if (c2 == n) { type = nm.group(1); break; }
            }
            if (type != null) break;
        }
        if (type == null) {
            // 退路：这类"无法 resugar 的构造器"多半是本类的构造器（this(...) 委托）
            Matcher cm = Pattern.compile("^(?:public\\s+|final\\s+|abstract\\s+)*(?:class|enum)\\s+(\\w+)",
                    Pattern.MULTILINE).matcher(src);
            if (cm.find()) type = cm.group(1);
        }
        if (type == null) return null;
        String repl = "new " + type + "(" + args + ");";
        for (int k = idx; k <= endLine && k < lines.length; k++) lines[k] = "";
        lines[idx] = repl;
        statResugar++;
        return String.join("\n", lines);
    }

    // ---------- 12. "new T;" —— Vineflower 丢掉了构造器实参 ----------
    // 形如 "new JCheckBox;" 是非法 Java（缺括号）。
    // 这行其实是 Vineflower 拆表达式时留下的悬空分配（真正的对象由后面的反射调用产生），
    // 所以直接删掉这一行 —— 数组初始化式 "new T[0];" 也不行，数组创建不能当语句。
    static String fixNewNoParens(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        if (!lines[idx].trim().matches("^new\\s+[\\w.$]+\\s*(\\[\\d*\\])?\\s*;$")) return null;
        String[] out = new String[lines.length - 1];
        System.arraycopy(lines, 0, out, 0, idx);
        System.arraycopy(lines, idx + 1, out, idx, lines.length - idx - 1);
        statNewNoParens++;
        return String.join("\n", out);
    }

    // ---------- 13. "new int(a, b, c)" —— 数组初始化被渲染成了构造器调用 ----------
    // 基本类型 + 多个实参 = 数组初始化；单个实参 = 数组长度。
    static String fixNewArray(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String line = lines[idx];
        Matcher m = Pattern.compile("\\bnew\\s+(int|long|boolean|byte|char|short|float|double)\\s*\\(")
                .matcher(line);
        if (!m.find()) return null;
        // 找到对应的右括号，数实参个数
        int open = line.indexOf('(', m.start());
        int close = matchParen(line, open) - 1;
        if (close < 0) return null;
        String inner = line.substring(open + 1, close);
        int n = 1, depth = 0;
        for (int i = 0; i < inner.length(); i++) {
            char c = inner.charAt(i);
            if (c == '(') depth++;
            else if (c == ')') depth--;
            else if (c == ',' && depth == 0) n++;
        }
        String type = m.group(1);
        String repl = n > 1 ? ("new " + type + "[]{" + inner + "}") : ("new " + type + "[" + inner + "]");
        lines[idx] = line.substring(0, m.start()) + repl + line.substring(close + 1);
        statNewArray++;
        return String.join("\n", lines);
    }

    // ---------- 14. for-each 的循环变量与外层同名 ----------
    // "for (var15 : xs)" 但 var15 在外层已声明 —— Java 不允许。
    // 办法：给循环变量换个新名字，并同步改写循环体里的引用。
    // （已废弃：现在统一由下面第 17 条按"补元素类型"处理）
    static String fixForEachRenamed(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        Matcher m = Pattern.compile("^(\\s*)for\\s*\\(\\s*(\\w+)\\s*:").matcher(lines[idx]);
        if (!m.matches()) return null;
        String var = m.group(2);
        // 外层是否已声明同名变量
        boolean declared = false;
        for (int i = 0; i < idx; i++) {
            if (lines[i].matches("^\\s*[\\w$.<>\\[\\]]+\\s+" + Pattern.quote(var) + "\\s*[;=].*")) { declared = true; break; }
        }
        if (!declared) return null;
        String nv = var + "_2";
        lines[idx] = lines[idx].replaceFirst(Pattern.quote(var), Matcher.quoteReplacement(nv));
        // 循环体：从 for 行开始按花括号配对找结尾，把体里的 var 换掉
        int[] delta = braceDelta(lines);
        int depth = 0, end = idx;
        for (int j = idx; j < lines.length; j++) {
            depth += delta[j];
            if (depth <= 0 && j > idx) { end = j; break; }
            if (depth <= 0 && j == idx && delta[j] == 0) { end = j; break; }
        }
        for (int j = idx + 1; j <= end && j < lines.length; j++) {
            lines[j] = lines[j].replaceAll("\\b" + Pattern.quote(var) + "\\b", nv);
        }
        statForEach++;
        return String.join("\n", lines);
    }

    // ---------- 15. "<unknown> varN;" —— Vineflower 的占位符 ----------
    static String fixUnknown(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        if (!lines[idx].contains("<unknown>")) return null;
        lines[idx] = lines[idx].replace("<unknown> ", "");
        statUnknown++;
        return String.join("\n", lines);
    }

    // ---------- 16. "new return(args)" ----------
    // Vineflower 在无法 resugar 构造器时会直接把字节码里的 return 助记符吐出来。
    // 类型从赋值目标的声明里反查。
    static String fixNewReturn(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        Matcher m = Pattern.compile("^\\s*(\\w+)\\s*=\\s*new\\s+return\\s*\\(").matcher(lines[idx]);
        if (!m.matches()) return null;
        String target = m.group(1);
        String type = null;
        for (String l : lines) {
            Matcher dm = Pattern.compile("^\\s*([\\w$.<>\\[\\]]+)\\s+" + Pattern.quote(target) + "\\s*[;=]")
                    .matcher(l);
            if (dm.find()) { type = dm.group(1); break; }
        }
        if (type == null) {
            Matcher cm = Pattern.compile("^(?:public\\s+|final\\s+|abstract\\s+)*(?:class|enum)\\s+(\\w+)",
                    Pattern.MULTILINE).matcher(src);
            if (cm.find()) type = cm.group(1);
        }
        if (type == null) return null;
        lines[idx] = lines[idx].replaceFirst("\\bnew\\s+return\\s*\\(", "new " + type + "(");
        statNewReturn++;
        return String.join("\n", lines);
    }

    // ---------- 17. for (varN : xs) —— 缺类型 ----------
    // Java 的 for-each 必须带元素类型。类型从循环体里 "Type v = varN;" 反查。
    static String fixForEach(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        Matcher m = Pattern.compile("^(\\s*)for\\s*\\(\\s*(\\w+)\\s*:").matcher(lines[idx]);
        if (!m.matches()) return null;
        String var = m.group(2);
        // 循环体范围
        int[] delta = braceDelta(lines);
        int depth = 0, end = idx;
        for (int j = idx; j < lines.length; j++) {
            depth += delta[j];
            if (depth < 0) { end = j; break; }
            if (depth == 0 && j > idx) { end = j; break; }
        }
        // 找 "Type v = varN;" 得到元素类型
        String type = null;
        for (int j = idx + 1; j <= end && j < lines.length; j++) {
            Matcher tm = Pattern.compile("^\\s*([\\w$.<>\\[\\]]+)\\s+\\w+\\s*=\\s*" + Pattern.quote(var) + "\\s*;")
                    .matcher(lines[j]);
            if (tm.find()) { type = tm.group(1); break; }
        }
        if (type == null) type = "Object";
        lines[idx] = lines[idx].replaceFirst(Pattern.quote(var),
                Matcher.quoteReplacement(type + " " + var));
        statForEach++;
        return String.join("\n", lines);
    }

    // ---------- 10. 重复声明：删掉后面那一条 ----------
    // 混淆器的字节码里同一个局部变量槽被复用，反编译器有时会给出两条同样的声明。
    static String fixDupDecl(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String l = lines[idx];
        // 只删"看起来是声明"的那一行
        if (!l.trim().matches("^[\\w$.<>\\[\\]]+\\s+\\w+\\s*;$")) return null;
        System.arraycopy(lines, idx + 1, lines, idx, lines.length - idx - 1);
        statDupDecl++;
        return String.join("\n", lines);
    }

    // ---------- 11b. primitive 类型错配（boolean <-> int 等）：保守修法 ----------
    // 混淆器故意把 boolean 当 int 用（字节码层面合法，源码层面不行）。
    // 这里**不插表达式转换**，只做两种最小改写：
    //   1) 声明处类型词写错了：<Type> varN = <expr>;  把 <Type> 改成实际类型
    //   2) return (T)varN;  改成 return varN != 0;  /  return varN ? 1 : 0;
    // 比通用 fixIncompatible 安全得多 —— 不会动复杂表达式的结构。
    static String fixPrimTypeMismatch(Err er, String src) {
        Matcher mm = Pattern.compile("^incompatible types: (\\S+) cannot be converted to (\\S+)$")
                .matcher(er.msg);
        if (!mm.matches()) return null;
        String from = mm.group(1), to = mm.group(2);
        boolean f2b = to.equals("boolean")
                && (from.equals("int") || from.equals("short") || from.equals("byte")
                    || from.equals("char") || from.equals("long"));
        boolean b2f = from.equals("boolean")
                && (to.equals("int") || to.equals("long") || to.equals("short")
                    || to.equals("byte") || to.equals("char"));
        if (!f2b && !b2f) return null;
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String line = lines[idx];
        // 情况 1：return (T)varN;
        Matcher rm = Pattern.compile(
                "^(\\s*)return \\((?:int|long|short|byte|char|boolean)\\)\\s*(\\w+)\\s*;\\s*$").matcher(line);
        if (rm.matches()) {
            String var = rm.group(2);
            String repl = f2b ? ("return " + var + " != 0;") : ("return " + var + " ? 1 : 0;");
            lines[idx] = rm.group(1) + repl;
            statPrimType++;
            return String.join("\n", lines);
        }
        // 情况 2：<Type> varN = <expr>;
        //
        // 【重要教训】曾经试过"把声明处的类型词改成实际类型"（int var13 -> boolean var13），
        // 结果**错误数反而涨了 1,159 个**：声明改了，但后面所有把 var13 当 int 用的地方
        // 全都变成新错误（incompatible types: int cannot be converted to boolean +602、
        // incomparable types: boolean and int +557）。
        //
        // 正确做法：**声明类型不动，只在赋值的那一处转换表达式**，
        // 错误只消一处，不会波及后续使用。
        //   boolean -> int :  (expr) ? 1 : 0
        //   int -> boolean:  (expr) != 0
        Matcher dm = Pattern.compile(
                "^(\\s*)([A-Za-z_$][\\w$.<>\\[\\]]*)\\s+(\\w+)\\s*=\\s*(.+?);?\\s*$").matcher(line);
        if (dm.matches() && dm.group(2).equals(to)) {
            String expr = dm.group(4).trim();
            if (expr.isEmpty()) return null;
            // 表达式外面加括号：expr 里可能含三元运算符，
            // 不加括号的话 "a ? b : c ? 1 : 0" 的结合方向会变，语义就错了
            String conv = f2b ? ("(" + expr + ") != 0") : ("(" + expr + ") ? 1 : 0");
            lines[idx] = dm.group(1) + dm.group(2) + " " + dm.group(3) + " = " + conv + ";";
            statPrimType++;
            return String.join("\n", lines);
        }
        // 情况 2b：varN = <expr>;   —— 纯赋值（变量已在别处声明）。
        // javac 报的 to 就是这个变量的声明类型，所以只转右边表达式即可。
        Matcher am = Pattern.compile("^(\\s*)(\\w+)\\s*=\\s*(.+?);?\\s*$").matcher(line);
        if (am.matches()) {
            String expr = am.group(3).trim();
            if (expr.isEmpty()) return null;
            if (expr.contains("->")) return null;     // lambda 跳过
            String conv = f2b ? ("(" + expr + ") != 0") : ("(" + expr + ") ? 1 : 0");
            lines[idx] = am.group(1) + am.group(2) + " = " + conv + ";";
            statPrimType++;
            return String.join("\n", lines);
        }
        return null;
    }

    // ---------- 11c. 局部变量类型提升 ----------
    // Vineflower 会把变量的类型"抖动"：先按初始值声明成 Object[]，
    // 后面又用 (DY3)varN 强转赋值，说明它实际是 DY3：
    //     Object[] var10001 = Registry.emptyArgs();
    //     ...
    //     var10001 = (DY3)var10001;          <-- javac: Object[] cannot be converted to DY3
    //
    // 修法：把**声明**改成目标类型，并给**初始值**加同样的强转。
    //   Object[] var10001 = Registry.emptyArgs();
    //   ->
    //   DY3 var10001 = (DY3)(Registry.emptyArgs());
    // 这样只影响这一个变量，后续对该变量的使用全部自动变合法。
    //
    // 【与 11b 的区别】11b 只改声明不给初值加强转 —— 那会把一处错误变成 N 处错误。
    // 这里**必须**同时加强转，否则初始值本身就编译不过。
    static String fixVarTypePromote(Err er, String src) {
        Matcher mm = Pattern.compile("^incompatible types: (Object|Object\\[\\]) cannot be converted to (\\S+)$")
                .matcher(er.msg);
        if (!mm.matches()) return null;
        String target = mm.group(2);
        if (!target.matches("[A-Za-z_$][\\w$.<>\\[\\]]*")) return null;
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        // 错误行：varN = (Target)varN;   —— 取出变量名
        Matcher um = Pattern.compile("^\\s*(\\w+)\\s*=\\s*\\(\\s*" + Pattern.quote(target) + "\\s*\\)\\s*(\\w+)\\s*;\\s*$")
                .matcher(lines[idx]);
        if (!um.matches()) return null;
        String var = um.group(1);
        if (!var.equals(um.group(2))) return null;    // 必须是自赋值形式
        // 找声明行：<Type> var = <init>;
        // 【坑】同名变量常在同文件的**另一个方法**里也出现（混淆后到处是 var10002）。
        // 只在「上一个 } 之后」的范围里找，也就是同一个方法体内，
        // 否则会因为"多处候选"而整个放弃修复。
        int lowerBound = 0;
        for (int i = idx - 1; i >= 0; i--) {
            if (lines[i].trim().equals("}")) { lowerBound = i + 1; break; }
        }
        Pattern decl = Pattern.compile(
                "^(\\s*)([A-Za-z_$][\\w$.<>\\[\\]]*)\\s+" + Pattern.quote(var) + "\\s*=\\s*(.+?);?\\s*$");
        int found = -1;
        for (int i = lowerBound; i < idx; i++) {
            Matcher dm = decl.matcher(lines[i]);
            if (dm.matches() && !dm.group(2).equals(target)) {
                if (found >= 0) return null;          // 同名声明多处，不敢改
                found = i;
            }
        }
        if (found < 0) return null;
        Matcher dm = decl.matcher(lines[found]);
        if (!dm.matches()) return null;
        String init = dm.group(3).trim();
        if (init.isEmpty()) return null;
        // 初值已经是目标类型的强转就别重复加
        if (init.startsWith("(" + target + ")")) return null;
        lines[found] = dm.group(1) + target + " " + var + " = (" + target + ")(" + init + ");";
        statPromote++;
        return String.join("\n", lines);
    }

    // ---------- 11. incompatible types：按 javac 给的列号做显式转换 ----------
    // javac 比 JVM 严格：字节码里 int 可以当 boolean 用（校验器不区分），
    // 源码里不行。这里按错误信息做最小改写：
    //   int    -> boolean   (x != 0)
    //   boolean-> int       (x ? 1 : 0)
    //   其它               显式强转 (T)(x)
    static String fixIncompatible(Err er, String src) {
        Matcher mm = Pattern.compile("^incompatible types: (\\S+) cannot be converted to (\\S+)$")
                .matcher(er.msg);
        if (!mm.matches()) return null;
        String from = mm.group(1), to = mm.group(2);
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String line = lines[idx];
        // lambda（->）和泛型尖括号里插强转很容易插错位置，先跳过
        if (line.contains("->")) return null;
        int c = er.col - 1;
        if (c < 0 || c >= line.length()) return null;
        // 只在标识符或左括号处插强转
        char ch = line.charAt(c);
        if (!Character.isJavaIdentifierStart(ch) && ch != '(') return null;

        // 定位待转换的表达式：
        //  - 若光标正好在一个 "(类型)" 强转型上，就替换整个强转型
        //  - 否则替换光标处的那个表达式
        int start = c, end = -1;
        String inner;
        String castType = null;
        if (c < line.length() && line.charAt(c) == '(') {
            int close = line.indexOf(')', c);
            if (close > c) {
                String t = line.substring(c + 1, close).trim();
                if (t.matches("[\\w$.<>\\[\\]]+")) castType = t;
            }
        }
        if (castType != null) {
            end = scanPrimary(line, c + castType.length() + 2);
            if (end <= c) return null;
            inner = line.substring(c + castType.length() + 2, end);
        } else {
            end = scanPrimary(line, c);
            if (end <= c) return null;
            inner = line.substring(c, end);
        }
        String expr = inner;
        String repl;
        if (to.equals("boolean") && (from.equals("int") || from.equals("short") || from.equals("byte")
                || from.equals("char"))) {
            repl = "(" + expr + " != 0)";
        } else if (from.equals("boolean") && (to.equals("int") || to.equals("long")
                || to.equals("short") || to.equals("byte"))) {
            repl = "(" + expr + " ? 1 : 0)";
        } else {
            repl = "(" + to + ")(" + expr + ")";
        }
        lines[idx] = line.substring(0, start) + repl + line.substring(end);
        statIncompat++;
        return String.join("\n", lines);
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
        String type = null;
        if (m.matches()) {
            type = m.group(1);
        } else {
            // varN = varM;  —— 从 varM 的声明反推类型
            Matcher m2 = Pattern.compile("^\\s*" + Pattern.quote(var) + "\\s*=\\s*(var\\d+)\\s*;")
                    .matcher(line);
            if (m2.matches()) {
                String other = m2.group(1);
                for (int i = 0; i < lines.length; i++) {
                    Matcher dm = Pattern.compile("^\\s*([\\w$.<>\\[\\]]+)\\s+" + Pattern.quote(other) + "\\s*[;=]")
                            .matcher(lines[i]);
                    if (dm.find()) { type = dm.group(1); break; }
                }
                // 同一方法里 "varM = new T(...)" 也能反推
                if (type == null) {
                    for (int i = 0; i < lines.length; i++) {
                        Matcher nm = Pattern.compile("=\\s*new\\s+([A-Za-z_$][\\w$.]*)\\s*\\(").matcher(lines[i]);
                        if (nm.find() && lines[i].contains(other)) { type = nm.group(1); break; }
                    }
                }
            }
        }
        if (type == null) return null;
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

    /**
     * 逐行计算花括号净增减，**忽略字符串/字符字面量与注释**。
     * 直接数括号会被字面量里的 "}" 带偏。
     */
    static int[] braceDelta(String[] lines) {
        int[] out = new int[lines.length];
        boolean inBlockComment = false;
        for (int i = 0; i < lines.length; i++) {
            String s = lines[i];
            int d = 0;
            int n = s.length();
            for (int k = 0; k < n; k++) {
                char c = s.charAt(k);
                if (inBlockComment) {
                    if (c == '*' && k + 1 < n && s.charAt(k + 1) == '/') { inBlockComment = false; k++; }
                    continue;
                }
                if (c == '/' && k + 1 < n && s.charAt(k + 1) == '/') break;
                if (c == '/' && k + 1 < n && s.charAt(k + 1) == '*') { inBlockComment = true; k++; continue; }
                if (c == '"' || c == '\'') {
                    char q = c;
                    k++;
                    while (k < n) {
                        if (s.charAt(k) == '\\') { k += 2; continue; }
                        if (s.charAt(k) == q) break;
                        k++;
                    }
                    continue;
                }
                if (c == '{') d++;
                else if (c == '}') d--;
            }
            out[i] = d;
        }
        return out;
    }
}
