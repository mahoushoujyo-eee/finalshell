import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

/**
 * Analyses the application (non-vendor) source tree and proposes readable names.
 *
 * Evidence used, strongest first:
 *   1. the Swing window title  -> "设置同步密码" becomes SyncDialog
 *   2. the base class          -> JFrame/JDialog/JPanel/Thread/Exception...
 *   3. domain keywords found in the inlined string literals
 * Classes for which nothing can be inferred are left as Obf_<original>.
 *
 * Usage: java Analyze <appDir> <out.tsv>
 */
public class Analyze {

    /** Ordered: earlier entries win. */
    static final String[][] DICT = {
        {"端口转发", "PortForward"}, {"新建连接", "NewConnection"}, {"SSH连接", "SshConnection"},
        {"SFTP", "Sftp"}, {"RDP", "Rdp"}, {"同步密码", "SyncPassword"}, {"同步", "Sync"},
        {"私钥", "PrivateKey"}, {"密码", "Password"}, {"隧道", "Tunnel"}, {"代理", "Proxy"},
        {"终端", "Terminal"}, {"会话", "Session"}, {"连接", "Connection"}, {"服务器", "Server"},
        {"分组", "Group"}, {"设置", "Settings"}, {"属性", "Properties"}, {"主题", "Theme"},
        {"字体", "Font"}, {"颜色", "Color"}, {"外观", "Appearance"}, {"快捷键", "Shortcut"},
        {"上传", "Upload"}, {"下载", "Download"}, {"文件", "File"}, {"监控", "Monitor"},
        {"进程", "Process"}, {"磁盘", "Disk"}, {"内存", "Memory"}, {"网络", "Network"},
        {"加速", "Accelerate"}, {"重连", "Reconnect"}, {"导入", "Import"}, {"导出", "Export"},
        {"提醒", "Reminder"}, {"日志", "Log"}, {"关于", "About"}, {"更新", "Update"},
        {"授权", "License"}, {"注册", "Register"}, {"登录", "Login"}, {"用户", "User"},
        {"账号", "Account"}, {"密钥", "Key"}, {"证书", "Certificate"}, {"端口", "Port"},
        {"地址", "Address"}, {"系统", "System"}, {"复制", "Copy"}, {"粘贴", "Paste"},
        {"搜索", "Search"}, {"刷新", "Refresh"}, {"删除", "Delete"}, {"保存", "Save"},
        {"提示", "Tip"}, {"错误", "Error"}, {"警告", "Warning"}, {"失败", "Failed"},
        {"成功", "Success"}, {"新建", "New"}, {"编辑", "Edit"},
        /* english keywords */
        {"SSH", "Ssh"}, {"sftp", "Sftp"}, {"SFTP", "Sftp"}, {"socks", "Socks"},
        {"proxy", "Proxy"}, {"terminal", "Terminal"}, {"session", "Session"},
        {"shell", "Shell"}, {"channel", "Channel"}, {"tunnel", "Tunnel"},
        {"forward", "Forward"}, {"codec", "Codec"}, {"cipher", "Cipher"},
        {"key", "Key"}, {"cert", "Cert"}, {"xterm", "Terminal"}, {"ansi", "Ansi"},
        {"json", "Json"}, {"xml", "Xml"}, {"http", "Http"}, {"socket", "Socket"},
    };

    static final Pattern DECL = Pattern.compile(
            "(?m)^\\s*(?:public\\s+|final\\s+|abstract\\s+|static\\s+)*(class|interface|enum)\\s+([A-Za-z_$][\\w$]*)");
    static final Pattern TITLE = Pattern.compile("setTitle\\(\\s*\"([^\"]{1,60})\"\\s*\\)");
    static final Pattern STR = Pattern.compile("\"([^\"\\\\]{2,60})\"");

    public static void main(String[] args) throws Exception {
        Path root = Paths.get(args[0]);
        Path out = Paths.get(args[1]);
        List<Path> files;
        try (Stream<Path> s = Files.walk(root)) {
            files = s.filter(p -> p.toString().endsWith(".java")).collect(Collectors.toList());
        }
        List<String> rows = new ArrayList<>();
        Map<String, Integer> stat = new TreeMap<>();
        for (Path p : files) {
            String rel = root.relativize(p).toString().replace('\\', '/');
            String text;
            try { text = new String(Files.readAllBytes(p), StandardCharsets.UTF_8); } catch (Throwable t) { continue; }
            Matcher dm = DECL.matcher(text);
            if (!dm.find()) continue;
            String kind = dm.group(1);
            String name = dm.group(2);
            String header = text.substring(dm.start(), Math.min(text.length(), dm.start() + 400));
            String ext = pick(header, "extends\\s+([A-Za-z_$][\\w$.]*)");
            String impl = pick(header, "implements\\s+([A-Za-z_$][\\w$.,\\s]*)");
            String title = pick(text, TITLE);
            String suffix = suffixFor(ext, impl, kind);
            String hint = title != null ? hintFrom(title) : null;
            if (hint == null) hint = hintFromStrings(text);
            String newName;
            if (hint != null) {
                newName = (suffix != null && !hint.endsWith(suffix)) ? hint + suffix : hint;
            } else {
                // only a generic role (JDialog/Thread/...) is known: keep the original
                // name and record the role as a comment instead of inventing a name
                newName = null;
                stat.merge("role:" + (suffix == null ? "?" : suffix), 1, Integer::sum);
            }

            stat.merge(newName != null ? "named" : "unnamed", 1, Integer::sum);
            rows.add(String.join("\t", rel, name, kind, nz(ext), nz(impl), nz(title), nz(newName)));
        }
        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(out, StandardCharsets.UTF_8))) {
            w.println("path\tname\tkind\textends\timplements\ttitle\tproposed");
            for (String r : rows) w.println(r);
        }
        System.out.println("FILES=" + files.size() + " " + stat);
    }

    static String roleHint(String ext, String impl) {
        String s = (ext == null ? "" : ext) + "," + (impl == null ? "" : impl);
        if (s.contains("JFrame")) return "Main";
        if (s.contains("JDialog")) return "Dialog";
        if (s.contains("JPanel") || s.contains("JComponent")) return "Panel";
        if (s.contains("JTable")) return "Table";
        if (s.contains("JTree")) return "Tree";
        if (s.contains("JList")) return "List";
        if (s.contains("JPopupMenu") || s.contains("JMenuItem")) return "Menu";
        if (s.contains("Thread")) return "Task";
        if (s.contains("ChannelHandler")) return "Handler";
        if (s.contains("Runnable")) return "Job";
        return null;
    }

    static String suffixFor(String ext, String impl, String kind) {
        String s = (ext == null ? "" : ext) + "," + (impl == null ? "" : impl);
        if (kind.equals("interface")) return null;
        if (kind.equals("enum")) return null;
        if (s.contains("Exception") || s.contains("Throwable") || s.contains("Error")) return "Exception";
        if (s.contains("JFrame")) return "Frame";
        if (s.contains("JDialog") || s.contains("JWindow")) return "Dialog";
        if (s.contains("JPanel") || s.contains("JComponent") || s.contains("JLabel")) return "Panel";
        if (s.contains("JTable")) return "Table";
        if (s.contains("JTree")) return "Tree";
        if (s.contains("JList")) return "List";
        if (s.contains("JComboBox")) return "Combo";
        if (s.contains("JPopupMenu")) return "Menu";
        if (s.contains("Thread")) return "Task";
        if (s.contains("ChannelHandler")) return "Handler";
        if (s.contains("Runnable")) return "Job";
        return null;
    }

    static String hintFrom(String text) {
        for (String[] kv : DICT) {
            if (text.contains(kv[0])) return kv[1];
        }
        return null;
    }

    /** Prefer Chinese/domain strings over generic English ones. */
    static String hintFromStrings(String text) {
        Matcher m = STR.matcher(text);
        while (m.find()) {
            String v = m.group(1);
            if (!v.matches(".*[\\u4e00-\\u9fff].*")) continue;
            String h = hintFrom(v);
            if (h != null) return h;
        }
        return null;
    }

    static String pick(String text, String regex) {
        return pick(text, Pattern.compile(regex));
    }

    static String pick(String text, Pattern p) {
        Matcher m = p.matcher(text);
        return m.find() ? m.group(1).trim() : null;
    }

    static String nz(String s) { return s == null ? "" : s.replace('\t', ' '); }
}
