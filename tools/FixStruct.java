import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * 结构性错误的源码层修复器（补 FixTree ��覆盖不到的几类）。
 *
 * FixTree 是"错误驱动"的：读 javac 日志，按错误类别定点修补。
 * 但它只覆盖了语法错误和少数几种类型错误，下面这几类没人管：
 *
 *   (1) "call to super must be first statement in constructor"
 *       Vineflower 把 super(...) 排到了构造器体的中间（前面还夹着
 *       局部变量声明、甚至包在 label 块里）。Java 要求 super()/this()
 *       必须是构造器的第一条语句。修法：把 super(...) 整条挪到构造器体最前面。
 *
 *   (2) "bad operand types for binary operator '==' / '!='"
 *       混淆器把 boolean 和 int / 引用混着用，Vineflower 又把
 *       "引用 == null" 之类的空检查渲染成 "引用 == false"，
 *       于是 javac 报两个操作数类型不兼容。
 *       修法（保守，只动一个字面量，不动声明，避免波及后续使用）：
 *         数字基本类型  <op> false/true   ->  <op> 0 / != 0
 *         引用类型       <op> false/true   ->  <op> null
 *         数字基本类型  <op> null         ->  <op> 0
 *
 * 用法: java FixStruct <srcRoot> <javacLog> [--report=<file>]
 */
public class FixStruct {

    // ---------- 错误模型 ----------
    static class Err {
        String file; int line; String msg; String detail;
        String firstType, secondType, op, symbol, symKind;
    }

    static final Set<String> SYM_KINDS = new HashSet<>(Arrays.asList(
            "variable", "method", "class", "package", "interface", "enum"));
    static final Map<String, List<Err>> byFile = new LinkedHashMap<>();
    static int statSuper = 0, statSuperSkip = 0, statOperand = 0, statOperandSkip = 0, statEnumValueOf = 0, statMissingField = 0, statNotPublic = 0, statNotPublicSkip = 0;
    static final List<String> skipped = new ArrayList<>();

    // 数字基本类型（可以和 0/1 比较）
    static final Set<String> NUMERIC = new HashSet<>(Arrays.asList(
            "int", "long", "short", "byte", "char", "float", "double"));
    static final Set<String> PRIMITIVE = new HashSet<>(Arrays.asList(
            "int", "long", "short", "byte", "char", "float", "double", "boolean"));

    public static void main(String[] args) throws Exception {
        String root = args[0];
        String log = args[1];
        String report = args.length > 2 && args[2].startsWith("--report=")
                ? args[2].substring("--report=".length()) : null;

        parseLog(log);
        System.out.println("errors parsed = " + total() + "  files = " + byFile.size());
        buildClassIndex(root);
        System.out.println("class index = " + CLASS_INDEX.size());

        int filesChanged = 0;
        for (Map.Entry<String, List<Err>> e : byFile.entrySet()) {
            Path f = resolve(root, e.getKey());
            if (!Files.exists(f)) continue;
            String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
            String out = src;
            // 先修操作数（只改行内文本，不改行数），再修 super 位置（会挪行）
            for (Err er : e.getValue()) {
                if (!er.msg.contains("bad operand types for binary operator")) continue;
                String r = fixBadOperand(er, out);
                if (r != null) out = r;
            }
            for (Err er : e.getValue()) {
                if (!er.msg.contains("call to super must be first statement")) continue;
                String r = fixSuperFirst(er, out);
                if (r != null) out = r;
            }
            for (Err er : e.getValue()) {
                boolean enumValueOf = er.msg.contains("cannot be converted to Class<Enum")
                        || er.msg.contains("incompatible bounds")
                        || er.detail.contains("incompatible bounds")
                        || (er.msg.contains("cannot be applied to given types")
                            && er.detail.contains("valueOf(Class<T>,String)"));
                if (!enumValueOf) continue;
                String r = fixEnumValueOf(er, out);
                if (r != null) out = r;
            }
            for (Err er : e.getValue()) {
                if (!er.msg.startsWith("cannot find symbol")) continue;
                if (!"variable".equals(er.symKind)) continue;
                String r = fixMissingField(er, out);
                if (r != null) out = r;
            }
            for (Err er : e.getValue()) {
                if (!er.msg.contains("cannot be applied to given types")) continue;
                String r = fixNotPublic(er, out);
                if (r != null) out = r;
            }
            if (!out.equals(src)) {
                Files.write(f, out.getBytes(StandardCharsets.UTF_8));
                filesChanged++;
            }
        }
        System.out.println("files modified = " + filesChanged);
        System.out.println("  super-first moved        = " + statSuper);
        System.out.println("  super-first skipped      = " + statSuperSkip);
        System.out.println("  bad-operand rewritten    = " + statOperand);
        System.out.println("  bad-operand skipped      = " + statOperandSkip);
        System.out.println("  enum valueOf stubbed     = " + statEnumValueOf);
        System.out.println("  missing field declared   = " + statMissingField);
        System.out.println("  not-public made public   = " + statNotPublic
                + "  (skipped " + statNotPublicSkip + ")");
        if (!skipped.isEmpty()) {
            System.out.println("--- skipped (" + skipped.size() + ") ---");
            int n = 0;
            for (String s : skipped) {
                if (n++ >= 40) { System.out.println("  ... (" + (skipped.size() - 40) + " more)"); break; }
                System.out.println("  " + s);
            }
        }
        if (report != null) {
            try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(report), StandardCharsets.UTF_8))) {
                w.println("kind\tfile\tline\treason");
                for (String s : skipped) w.println("skipped\t" + s);
            }
            System.out.println("  -> report written to " + report);
        }
    }

    /**
     * 枚举降级后的 {@code Enum.valueOf(X.class, name)} 没法编译。
     *
     * <p>字节码层把假枚举的父类从 java.lang.Enum 换成了 java.lang.Object，
     * 于是 {@code Enum.valueOf} 要求 {@code T extends Enum<T>} 的约束不成立，
     * javac 报 "incompatible types: Class<X> cannot be converted to Class<Enum<X>>"。
     *
     * <p>枚举常量的**名字**（name）在字节码里是运行期解密出来的字符串，
     * 反编译后已经丢失，无法还原 valueOf 的查找逻辑。
     * 这里按项目里既有的做法（见 FixVineflower.addCompareTo），
     * 把它换成显式的"未实现"异常，至少保证能编译。
     */
    static String fixEnumValueOf(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        // javac 报的可能是 "method valueOf in class Enum<E> cannot be applied"，
        // 出错行在 Enum.valueOf(...) 那一行；有时会偏一两行，所以前后都找一下。
        int hit = -1;
        for (int i = Math.max(0, idx - 3); i <= Math.min(lines.length - 1, idx + 3); i++) {
            if (lines[i].contains("Enum.valueOf(")) { hit = i; break; }
        }
        if (hit < 0) return null;
        String line = lines[hit];
        Matcher m = Pattern.compile("^(\\s*)(return\\s+)?.*Enum\\.valueOf\\(.*$").matcher(line);
        if (!m.matches()) return null;
        String indent = m.group(1);
        lines[hit] = indent + "throw new UnsupportedOperationException(\"valueOf not implemented\");";
        statEnumValueOf++;
        return String.join("\n", lines);
    }

    /**
     * 降级后的枚举少了一个静态字段声明。
     *
     * <p>枚举的 {@code $VALUES} 数组是编译器生成的。Vineflower 在把类渲染成
     * {@code enum X} 时会把它作为枚举体的一部分处理；一旦父类被换成 Object、
     * 类被渲染成普通 class，它就不再声明这个字段了，于是
     * {@code $VALUES = new X[0];} 报 "cannot find symbol: variable $VALUES"。
     *
     * <p>修法：按赋值语句反推出字段类型，在类体开头补一条静态字段声明。
     */
    static String fixMissingField(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        String var = er.symbol;
        if (var == null || var.isEmpty()) return null;
        Matcher m = Pattern.compile("^\\s*" + Pattern.quote(var)
                + "\\s*=\\s*new\\s+([\\w.$]+)\\s*\\[[^\\]]*\\]\\s*;\\s*$").matcher(lines[idx]);
        if (!m.matches()) return null;
        String elemType = m.group(1);
        // 简单名 -> 用同文件里的类声明决定要不要加包前缀
        String decl = "private static " + elemType + "[] " + var + ";";
        // 插到类体开头
        int body = -1;
        for (int i = 0; i < lines.length; i++) {
            if (Pattern.compile("^\\s*(?:public\\s+|final\\s+|abstract\\s+)*class\\s+\\w+").matcher(lines[i]).find()) {
                for (int k = i; k < lines.length; k++) {
                    if (lines[k].contains("{")) { body = k; break; }
                }
                break;
            }
        }
        if (body < 0) return null;
        for (String l : lines) {
            if (l.matches("^\\s*(?:private\\s+|public\\s+|protected\\s+)?static\\s+[\\w.$]+\\[\\]\\s+"
                    + Pattern.quote(var) + "\\s*;.*")) return null;   // 已声明
        }
        String indent = indentOf(lines[body]);
        String ins = indent + "   " + decl;
        List<String> out = new ArrayList<>(Arrays.asList(lines));
        out.add(body + 1, ins);
        statMissingField++;
        return String.join("\n", out);
    }

    /**
     * "method X in class Y cannot be applied to given types;
     *  reason: X(...) is not public in Y; cannot be accessed from outside package"
     *
     * <p>真实原因不是参数对不上（javac 的 required/found 两栏完全一样），
     * 而是**可见性**：改名重排包之后，原本"同包互访"的包级私有成员变成了跨包访问。
     *
     * <p>修法：找到 Y 类里 X 方法的声明，加上 public。
     * （字节码层的等价做法是 FixBytecode 的 --publicize 把包级私有成员也放开。）
     */
    static String fixNotPublic(Err er, String src) {
        try {
            return fixNotPublic0(er);
        } catch (Exception e) {
            statNotPublicSkip++;
            skipped.add(er.file + ":" + er.line + "  处理失败: " + e);
            return null;
        }
    }

    static String fixNotPublic0(Err er) throws Exception {
        Matcher rm = Pattern.compile("reason:\\s*(.*?)\\s+is not public in (\\w+);").matcher(er.detail);
        Matcher pm = Pattern.compile("reason:\\s*(.*?)\\s+has protected access in (\\w+)").matcher(er.detail);
        Matcher mm2 = Pattern.compile("reason:\\s*(.*?)\\s+has private access in (\\w+)").matcher(er.detail);
        String sig = null, cls = null;
        if (rm.find()) { sig = rm.group(1); cls = rm.group(2); }
        else if (pm.find()) { sig = pm.group(1); cls = pm.group(2); }
        else if (mm2.find()) { sig = mm2.group(1); cls = mm2.group(2); }
        if (sig == null || cls == null) return null;
        String name = sig;
        int par = name.indexOf('(');
        if (par > 0) name = name.substring(0, par);
        if (name.isEmpty()) return null;
        int nparams = -1;
        if (par > 0) {
            String ps = name.substring(0, par);
            nparams = 0;
        }
        // 找 Y 类的源文件
        Path file = CLASS_INDEX.get(cls);
        if (file == null) {
            statNotPublicSkip++;
            skipped.add(er.file + ":" + er.line + "  找不到类 " + cls + " 的源文件");
            return null;
        }
        String target = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
        String[] lines = target.split("\n", -1);
        // 找方法声明：<modifiers> <ret> <name>(<params>) ...
        Pattern decl = Pattern.compile("^(\\s*)((?:public\\s+|private\\s+|protected\\s+|static\\s+|final\\s+|"
                + "synchronized\\s+|abstract\\s+|native\\s+|strictfp\\s+)*)"
                + "([\\w.$<>\\[\\], ?]+?)\\s+(" + Pattern.quote(name) + ")\\s*\\(([^)]*)\\)");
        int found = -1;
        for (int i = 0; i < lines.length; i++) {
            Matcher m = decl.matcher(lines[i]);
            if (!m.find()) continue;
            // 修饰符可能在 group(2) 里，也可能在 group(3)（构造器没有返回类型时，
            // "public" 会被当成"返回类型"那一段）—— 两边一起看
            if ((m.group(2) + " " + m.group(3)).contains("public")) continue;
            // 参数个数对得上更好（重载时避免改错）
            String ps = m.group(5).trim();
            int cnt = ps.isEmpty() ? 0 : ps.split(",").length;
            if (nparams >= 0 && cnt != nparams) continue;
            found = i;
            break;
        }
        if (found < 0) {
            statNotPublicSkip++;
            skipped.add(er.file + ":" + er.line + "  类 " + cls + " 里找不到方法 " + name + " 的声明");
            return null;
        }
        Matcher m = decl.matcher(lines[found]);
        m.find();
        String indent = m.group(1);
        lines[found] = indent + "public " + lines[found].trim();
        statNotPublic++;
        try {
            Files.write(file, String.join("\n", lines).getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            return null;
        }
        return null;   // 直接写盘，不返回新内容
    }

    /** 简单类名 -> 源文件（用于跨文件定位被调用的类） */
    static final Map<String, Path> CLASS_INDEX = new HashMap<>();

    static void buildClassIndex(String root) throws IOException {
        try (java.util.stream.Stream<Path> st = Files.walk(Paths.get(root))) {
            for (Path p : (Iterable<Path>) st.filter(x -> x.toString().endsWith(".java"))::iterator) {
                String s = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
                Matcher m = Pattern.compile("^\\s*(?:public\\s+|final\\s+|abstract\\s+|static\\s+)*"
                        + "(?:class|interface|enum)\\s+(\\w+)", Pattern.MULTILINE).matcher(s);
                if (m.find()) CLASS_INDEX.putIfAbsent(m.group(1), p);
            }
        }
    }

    static int total() { int n = 0; for (List<Err> l : byFile.values()) n += l.size(); return n; }

    /**
     * 把日志里的绝对路径映射到当前源码树下。
     *
     * <p>【重要】javac 日志里记的是**编译时**的绝对路径。如果直接按日志里的路径去改文件，
     * 改的就不是传进来的这棵树，而是当初编译时的那棵树 —— 之前就踩过：
     * 在副本上跑 FixStruct，结果把"原始"那棵树改坏了。
     * 所以这里统一按"根目录 + 相对路径"重新定位。
     */
    static Path resolve(String root, String logPath) {
        Path r = Paths.get(root);
        Path p = Paths.get(logPath);
        if (p.startsWith(r)) return p;
        // 取日志路径里从包名开始的那一段（com/... 或 xxx.java）
        String s = logPath.replace('\\', '/');
        int i = s.indexOf("/com/");
        String rel = i >= 0 ? s.substring(i + 1) : p.getFileName().toString();
        Path cand = r.resolve(rel);
        if (Files.exists(cand)) return cand;
        // 退一步：按文件名在整个树下找
        String fn = p.getFileName().toString();
        try (java.util.stream.Stream<Path> st = Files.walk(r)) {
            for (Path x : (Iterable<Path>) st.filter(q -> q.getFileName().toString().equals(fn))::iterator) {
                return x;
            }
        } catch (Exception ignore) {
        }
        return cand;
    }

    // ---------- 解析 javac 日志 ----------
    static void parseLog(String logPath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(logPath), StandardCharsets.UTF_8);
        int i = 0;
        while (i < lines.size()) {
            Matcher m = Pattern.compile("^(.+?\\.java):(\\d+): error: (.*)$").matcher(lines.get(i));
            if (m.matches()) {
                List<String> det = new ArrayList<>();
                int j = i + 1;
                while (j < lines.size()) {
                    String l = lines.get(j);
                    if (Pattern.compile("^\\S.*\\.java:\\d+: (error|warning):").matcher(l).find()) break;
                    if (l.trim().isEmpty() && det.isEmpty()) { j++; continue; }
                    det.add(l);
                    j++;
                }
                Err er = new Err();
                er.file = m.group(1);
                er.line = Integer.parseInt(m.group(2));
                er.msg = m.group(3);
                er.detail = String.join("\n", det);
                Matcher ft = Pattern.compile("first type:\\s*(\\S+)").matcher(er.detail);
                if (ft.find()) er.firstType = ft.group(1);
                Matcher st = Pattern.compile("second type:\\s*(\\S+)").matcher(er.detail);
                if (st.find()) er.secondType = st.group(1);
                Matcher op = Pattern.compile("bad operand types for binary operator '([^']+)'").matcher(er.msg);
                if (op.find()) er.op = op.group(1);
                // "symbol:   variable $VALUES" / "symbol:   method foo()"
                Matcher sy = Pattern.compile("symbol:\\s+(\\w+)\\s+([^\\s]+)").matcher(er.detail);
                if (sy.find()) {
                    er.symKind = sy.group(1);
                    er.symbol = sy.group(2);
                }
                byFile.computeIfAbsent(er.file, k -> new ArrayList<>()).add(er);
                i = j;
            } else {
                i++;
            }
        }
    }

    // =====================================================================
    // (1) super(...) 必须是构造器的第一条语句
    // =====================================================================

    /** 构造器声明行：修饰符 + 类型 + 名字( + 参数 ) + { */
    static final Pattern RE_CTOR_HEAD = Pattern.compile(
            "^\\s*((?:public\\s+|protected\\s+|private\\s+)*)([\\w.$]+(?:\\s*<[^>]*>)?(?:\\[\\])?)\\s+(\\w+)\\s*\\((.*)$");

    static String fixSuperFirst(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;

        // 1) 找 super(...) 语句所在行
        int superLine = -1;
        for (int i = idx; i >= 0 && i >= idx - 30; i--) {
            String t = lines[i].trim();
            if (t.startsWith("super(")) { superLine = i; break; }
        }
        if (superLine < 0) { statSuperSkip++; skipped.add(er.file + ":" + er.line + "  找不到 super( 语句"); return null; }

        // 2) 往前找所属构造器
        //    注意：Vineflower 渲染出来的文件里，**类名经常和文件名对不上**
        //    （比如 Lv4_2.java 里的类其实叫 Ln4_2），所以不能用文件名判断，
        //    要用"离出错行最近的那个 class 声明"来定位外层类。
        String outerClass = enclosingClass(lines, superLine);
        int ctorHead = findCtorHead(lines, superLine, outerClass);
        if (ctorHead < 0) {
            statSuperSkip++;
            skipped.add(er.file + ":" + er.line + "  找不到构造器声明 (外层类=" + outerClass + ")");
            return null;
        }

        // 3) super 语句可能跨多行：找到语句结束（括号配平 + 分号）
        int end = superLine;
        int paren = 0;
        boolean closed = false;
        StringBuilder stmt = new StringBuilder();
        for (int i = superLine; i < lines.length; i++) {
            String l = lines[i];
            stmt.append(l.trim()).append(' ');
            for (int c = 0; c < l.length(); c++) {
                char ch = l.charAt(c);
                if (ch == '(') paren++;
                else if (ch == ')') { paren--; if (paren == 0) closed = true; }
            }
            if (closed && l.trim().endsWith(";")) { end = i; break; }
            if (closed) { end = i; break; }
        }
        if (end < superLine) { statSuperSkip++; skipped.add(er.file + ":" + er.line + "  super 语句边界判断失败"); return null; }
        String superText = stmt.toString().trim();
        if (!superText.startsWith("super(")) { statSuperSkip++; return null; }

        // 4) 构造器体的第一条语句位置
        int bodyStart = ctorHead + 1;
        // 5) 已经有 this(...) 调用？Java 里 this(...) 之后不能再有 super(...)
        for (int i = bodyStart; i < superLine; i++) {
            String t = lines[i].trim();
            if (t.startsWith("this(")) {
                statSuperSkip++;
                skipped.add(er.file + ":" + er.line + "  构造器里先有 this(...) 调用，super 由它链式调用");
                return null;
            }
        }
        // 6) super 的实参是否依赖前面执行过的语句？
        //    构造器的**形参**不算"前面赋值"（形参在 super 之前就有值）。
        String args = superText.substring(superText.indexOf('(') + 1,
                superText.lastIndexOf(')'));
        Set<String> used = new HashSet<>();
        Matcher idm = Pattern.compile("[A-Za-z_$][\\w$]*").matcher(args);
        while (idm.find()) {
            String id = idm.group();
            if (!isJavaKeyword(id)) used.add(id);
        }
        used.removeAll(ctorParams(lines, ctorHead));
        for (int i = bodyStart; i < superLine; i++) {
            String t = lines[i].trim();
            for (String id : used) {
                // 前面有对 id 的赋值 -> 挪动会改变语义
                if (Pattern.compile("(^|[^.\\w$])" + Pattern.quote(id) + "\\s*=[^=]").matcher(t).find()
                        || Pattern.compile("^\\s*(?:final\\s+)?[\\w.$<>\\[\\]]+\\s+" + Pattern.quote(id) + "\\s*=").matcher(t).find()) {
                    statSuperSkip++;
                    skipped.add(er.file + ":" + er.line + "  super(" + args + ") 的实参 " + id
                            + " 在前面被赋值，挪动会改变语义 —— 需人工处理");
                    return null;
                }
            }
        }
        // 7) 已经是第一条语句了？javac 可能是因为它包在 label 块里才报的
        //    （label 块里的 super 不算构造器的第一条语句）
        // 8) 执行搬移
        List<String> out = new ArrayList<>(Arrays.asList(lines));
        // 删除原位置
        for (int i = end; i >= superLine; i--) out.remove(i);
        // 重新定位 ctorHead / bodyStart（删除的行都在 ctorHead 之后，ctorHead 不变，
        // 但如果删除的行在 ctorHead 之后 bodyStart 也不变）
        int insertAt = ctorHead + 1;
        String indent = indentOf(out.get(insertAt - 1));
        out.add(insertAt, indent + superText);
        statSuper++;
        return String.join("\n", out);
    }

    /** 构造器的形参名集合（形参在 super 之前就有值，不算"前面被赋值"）。 */
    static Set<String> ctorParams(String[] lines, int braceLine) {
        Set<String> ps = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = braceLine; i >= 0 && i >= braceLine - 12; i--) {
            sb.insert(0, lines[i].trim() + " ");
            if (lines[i].contains("(")) break;
        }
        String head = sb.toString();
        int p = head.indexOf('(');
        if (p < 0) return ps;
        int q = head.indexOf(')', p);
        if (q < 0) q = head.length();
        String params = head.substring(p + 1, q);
        for (String one : params.split(",")) {
            Matcher m = Pattern.compile("([A-Za-z_$][\\w$]*)\\s*$").matcher(one.trim());
            if (m.find()) ps.add(m.group(1));
        }
        return ps;
    }

    static String indentOf(String line) {
        int i = 0;
        while (i < line.length() && (line.charAt(i) == ' ' || line.charAt(i) == '\t')) i++;
        return line.substring(0, i);
    }

    /** 离给定行最近的那个 class 声明里的类名（找不到返回 null）。 */
    static String enclosingClass(String[] lines, int from) {
        for (int i = from; i >= 0 && i >= from - 600; i--) {
            Matcher m = Pattern.compile(
                    "^\\s*(?:public\\s+|protected\\s+|private\\s+|static\\s+|final\\s+|abstract\\s+)*"
                            + "(?:class|interface|enum)\\s+(\\w+)").matcher(lines[i]);
            if (m.find()) return m.group(1);
        }
        return null;
    }

    /**
     * 从 superLine 往上找构造器声明行。
     *
     * <p>找法：先往上找"方法/构造器签名"的起始行（形如 {@code public Foo(int a) {}
     * 或者签名跨行、{@code { } 在后面几行），再确认它的名字等于外层类名。
     */
    static int findCtorHead(String[] lines, int superLine, String outerClass) {
        for (int i = superLine; i >= 0 && i >= superLine - 400; i--) {
            String t = lines[i].trim();
            if (t.isEmpty()) continue;
            // 候选：像方法/构造器声明的一行
            Matcher m = Pattern.compile(
                    "^(?:public\\s+|protected\\s+|private\\s+|static\\s+|final\\s+|abstract\\s+)*"
                            + "(?:[\\w.$]+(?:\\s*<[^>]*>)?(?:\\[\\])?\\s+)?(\\w+)\\s*\\(").matcher(t);
            if (!m.find()) continue;
            String name = m.group(1);
            if (outerClass != null && !name.equals(outerClass)) continue;
            if (outerClass == null && !t.endsWith("{")) continue;
            // 确认这个声明的 { 在哪儿（可能签名跨行）
            int brace = -1;
            for (int k = i; k < lines.length && k <= superLine; k++) {
                String l = lines[k];
                int p = l.indexOf('{');
                if (p >= 0) { brace = k; break; }
                if (l.trim().endsWith(";")) break;
            }
            if (brace < 0) continue;
            if (brace >= superLine) continue;      // { 在 super 之后，不是构造器
            return brace;                          // 返回带 { 的那一行
        }
        return -1;
    }

    static final Set<String> KEYWORDS = new HashSet<>(Arrays.asList(
            "new", "return", "if", "else", "for", "while", "do", "switch", "case", "default",
            "break", "continue", "this", "super", "null", "true", "false", "int", "long",
            "short", "byte", "char", "boolean", "float", "double", "void", "class", "interface",
            "enum", "static", "final", "public", "private", "protected", "try", "catch", "finally",
            "throw", "throws", "instanceof", "synchronized", "volatile", "transient", "native",
            "abstract", "strictfp", "package", "import", "extends", "implements", "assert"));

    static boolean isJavaKeyword(String s) { return KEYWORDS.contains(s); }

    // =====================================================================
    // (2) bad operand types for binary operator
    // =====================================================================

    static String fixBadOperand(Err er, String src) {
        String[] lines = src.split("\n", -1);
        int idx = er.line - 1;
        if (idx < 0 || idx >= lines.length) return null;
        if (er.op == null || !(er.op.equals("==") || er.op.equals("!="))) {
            statOperandSkip++;
            skipped.add(er.file + ":" + er.line + "  运算符 '" + er.op + "' 不在处理范围");
            return null;
        }
        if (er.firstType == null || er.secondType == null) {
            statOperandSkip++;
            skipped.add(er.file + ":" + er.line + "  错误信息里没有 first/second type");
            return null;
        }
        String line = lines[idx];
        int opPos = findComparison(line, er.op);
        if (opPos < 0) { statOperandSkip++; skipped.add(er.file + ":" + er.line + "  行里找不到 " + er.op); return null; }

        String left = lastTokenBefore(line, opPos);
        String right = firstTokenAfter(line, opPos + er.op.length());
        if (left == null || right == null) { statOperandSkip++; return null; }

        String repl = null;
        boolean flipOp = false;
        int at = -1;
        int len = 0;
        boolean leftIsLiteral = isBoolLit(left) || "null".equals(left) || isNumericLit(left);
        boolean rightIsLiteral = isBoolLit(right) || "null".equals(right) || isNumericLit(right);

        if (rightIsLiteral) {
            String otherType = er.firstType;
            Lit lit = literalFor(right, otherType, er.op);
            if (lit == null) {
                statOperandSkip++;
                skipped.add(er.file + ":" + er.line + "  " + left + " " + er.op + " " + right
                        + "  (first=" + er.firstType + ", second=" + er.secondType + ") 无法安全改写");
                return null;
            }
            repl = lit.text; flipOp = lit.flipOp;
            // 右侧字面量的起始位置：跳过运算符后面的空白
            at = opPos + er.op.length();
            while (at < line.length() && Character.isWhitespace(line.charAt(at))) at++;
            len = right.length();
        } else if (leftIsLiteral) {
            String otherType = er.secondType;
            Lit lit = literalFor(left, otherType, er.op);
            if (lit == null) {
                statOperandSkip++;
                skipped.add(er.file + ":" + er.line + "  " + left + " " + er.op + " " + right
                        + "  (first=" + er.firstType + ", second=" + er.secondType + ") 无法安全改写");
                return null;
            }
            repl = lit.text; flipOp = lit.flipOp;
            // 左侧字面量的起始位置：从运算符往前跳过空白
            at = opPos - 1;
            while (at >= 0 && Character.isWhitespace(line.charAt(at))) at--;
            at = at - left.length() + 1;
            len = left.length();
        }
        if (repl == null) {
            statOperandSkip++;
            skipped.add(er.file + ":" + er.line + "  " + left + " " + er.op + " " + right
                    + "  (first=" + er.firstType + ", second=" + er.secondType + ") 无法安全改写");
            return null;
        }
        if (at < 0 || at + len > line.length()) { statOperandSkip++; return null; }
        String newLine = line.substring(0, at) + repl + line.substring(at + len);
        if (flipOp) {
            int p = findComparison(newLine, er.op);
            if (p < 0) { statOperandSkip++; return null; }
            newLine = newLine.substring(0, p) + (er.op.equals("==") ? "!=" : "==") + newLine.substring(p + 2);
        }
        if (newLine.equals(line)) return null;
        lines[idx] = newLine;
        statOperand++;
        return String.join("\n", lines);
    }

    /** 字面量改写的结果：替换文本 + 是否需要把运算符反过来 */
    static class Lit {
        final String text; final boolean flipOp;
        Lit(String text, boolean flipOp) { this.text = text; this.flipOp = flipOp; }
    }

    /**
     * 把一个字面量换成能和另一侧比较的写法。
     *
     * @param lit      字面量（true / false / null）
     * @param otherType 另一侧的类型（javac 给的 first/second type）
     * @param op       == 或 !=
     */
    static Lit literalFor(String lit, String otherType, String op) {
        boolean otherIsNumeric = NUMERIC.contains(otherType);
        boolean otherIsBoolean = otherType.equals("boolean");
        boolean otherIsRef = !otherIsNumeric && !otherIsBoolean;
        if (lit.equals("null")) {
            // null 只能和引用比；和数字比 -> 0，和 boolean 比 -> false
            if (otherIsNumeric) return new Lit("0", false);
            if (otherIsBoolean) return new Lit("false", false);
            return null;                      // 引用 vs null 本来就合法
        }
        if (isNumericLit(lit)) {
            // 数字字面量
            if (otherIsNumeric) return new Lit(lit, false);
            if (otherIsBoolean) return new Lit(lit.equals("0") ? "false" : "true", false);
            // 另一侧是引用：引用不能和数字比 —— 只能是被渲染错的空检查
            return new Lit("null", false);
        }
        // true / false
        if (otherIsNumeric) {
            // 数字 <op> false  ->  数字 <op> 0（true 则取反）
            boolean wantTrue = lit.equals("true");
            boolean eq = op.equals("==");
            boolean result = eq ? wantTrue : !wantTrue;   // 结果为 true 的条件
            return new Lit(result ? "1" : "0", false);
        }
        if (otherIsBoolean) {
            return new Lit(lit, false);        // boolean <op> boolean 本来就合法
        }
        // 另一侧是引用：Vineflower 把空检查渲染成了 == false
        // 引用没有"真假"，用 null 判断最贴近，且一定能编过
        //   X == false -> X == null      X != false -> X != null
        //   X == true  -> X != null      X != true  -> X == null
        boolean eq = op.equals("==");
        boolean wantNull = eq ? lit.equals("false") : lit.equals("true");
        // wantNull=true  -> 运算符不变（== null / != null）
        // wantNull=false -> 运算符要反过来
        return new Lit("null", !wantNull);
    }

    static boolean isBoolLit(String s) { return s.equals("true") || s.equals("false"); }

    static boolean isNumericLit(String s) { return s.matches("-?\\d+[lL]?"); }

    /** 找比较运算符位置（跳过 != 的误判：&lt;= &gt;= != == 之外的不处理） */
    static int findComparison(String line, String op) {
        for (int i = 0; i + op.length() <= line.length(); i++) {
            if (!line.startsWith(op, i)) continue;
            if (op.equals("==") && i + 2 < line.length() && line.charAt(i + 2) == '=') continue;
            if (i > 0) {
                char p = line.charAt(i - 1);
                if (p == '!' || p == '<' || p == '>' || p == '=') continue;
            }
            return i;
        }
        return -1;
    }

    /** 运算符左边紧邻的记号 */
    static String lastTokenBefore(String line, int pos) {
        int i = pos - 1;
        while (i >= 0 && Character.isWhitespace(line.charAt(i))) i--;
        if (i < 0) return null;
        // 负数字面量：-1
        if ((line.charAt(i) == '-' || line.charAt(i) == '+') && i > 0
                && Character.isDigit(line.charAt(i + 1))
                && !Character.isJavaIdentifierPart(line.charAt(i - 1))) {
            int st = i;
            i--;
            while (i >= 0 && Character.isDigit(line.charAt(i))) i--;
            return line.substring(i + 1, st + 1);
        }
        int end = i + 1;
        if (Character.isJavaIdentifierPart(line.charAt(i))) {
            while (i >= 0 && Character.isJavaIdentifierPart(line.charAt(i))) i--;
            return line.substring(i + 1, end);
        }
        if (line.charAt(i) == ')') {
            int depth = 0;
            while (i >= 0) {
                if (line.charAt(i) == ')') depth++;
                else if (line.charAt(i) == '(') { depth--; if (depth == 0) { i--; break; } }
                i--;
            }
            if (i < 0) return null;
            while (i >= 0 && Character.isJavaIdentifierPart(line.charAt(i))) i--;
            return line.substring(i + 1, end);
        }
        return line.substring(i, end);
    }

    /** 运算符右边紧邻的记号 */
    static String firstTokenAfter(String line, int pos) {
        int i = pos;
        while (i < line.length() && Character.isWhitespace(line.charAt(i))) i++;
        if (i >= line.length()) return null;
        int start = i;
        // 负数 / 正数字面量：-1 / +1
        if ((line.charAt(i) == '-' || line.charAt(i) == '+') && i + 1 < line.length()
                && Character.isDigit(line.charAt(i + 1))) {
            i++;
            while (i < line.length() && (Character.isLetterOrDigit(line.charAt(i))
                    || line.charAt(i) == 'L' || line.charAt(i) == 'l')) i++;
            return line.substring(start, i);
        }
        if (Character.isJavaIdentifierStart(line.charAt(i))) {
            while (i < line.length() && Character.isJavaIdentifierPart(line.charAt(i))) i++;
            return line.substring(start, i);
        }
        if (line.charAt(i) == '(') {
            int depth = 0;
            while (i < line.length()) {
                if (line.charAt(i) == '(') depth++;
                else if (line.charAt(i) == ')') { depth--; if (depth == 0) { i++; break; } }
                i++;
            }
            return line.substring(start, i);
        }
        return line.substring(start, start + 1);
    }

    static int leadingWs(String s, int from) {
        int n = 0;
        for (int i = from; i >= 0 && Character.isWhitespace(s.charAt(i)); i--) n++;
        return n;
    }

    static int trailingWs(String s, int to) {
        int n = 0;
        for (int i = to - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); i--) n++;
        return n;
    }
}
