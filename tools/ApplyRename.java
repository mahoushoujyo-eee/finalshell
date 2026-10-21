import org.objectweb.asm.*;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * 按语义命名表在**字节码层**重命名类（并重整包目录）。
 *
 * 为什么必须在字节码层做：类名一改，所有引用点（字段类型、方法签名、指令 owner、
 * 常量池里的类名）都必须跟着改。文本层做要靠正则逐个匹配，既慢又容易漏；
 * 字节码层用 ASM 的 ClassRemapper 一次性全部跟随更新。
 *
 * 输入：
 *   args[0] 输入 jar
 *   args[1] 输出 jar
 *   args[2] 命名表 TSV： oldInternalName \t newSimpleName \t newPackage \t kind \t confidence \t evidence
 *   args[3] 反向别名表 TSV： newInternalName \t oldInternalName  （把字节码阶段改过的名字还原回命名表用的老名字）
 *   args[4] 冲突输出文件（可选）
 */
public class ApplyRename {

    /**
     * 在命名表里查一个内部名。
     * 依次尝试：原名、别名表、以及**只差大小写的包名变体**
     * （jar 里有 com/c 与 com/C 这两组仅大小写不同的包，命名表里记的是哪一种对不上都会漏）。
     */
    static String[] lookup(Map<String, String[]> table, Map<String, String> alias, String internal) {
        String[] t = table.get(internal);
        if (t != null) return t;
        String old = alias.get(internal);
        if (old != null) {
            t = table.get(old);
            if (t != null) return t;
        }
        // 只差大小写的包名变体
        int i = internal.lastIndexOf('/');
        if (i > 0) {
            String pkg = internal.substring(0, i);
            String rest = internal.substring(i);
            for (String alt : caseVariants(pkg)) {
                t = table.get(alt + rest);
                if (t != null) return t;
                String a2 = alias.get(alt + rest);
                if (a2 != null) {
                    t = table.get(a2);
                    if (t != null) return t;
                }
            }
        }
        return null;
    }

    /** 生成一个包名的大小写翻转变体（com/c <-> com/C）。 */
    static List<String> caseVariants(String pkg) {
        List<String> out = new ArrayList<>();
        String[] segs = pkg.split("/");
        // 逐段尝试翻转大小写（只针对含字母的段）
        for (int i = 0; i < segs.length; i++) {
            String s = segs[i];
            if (s.isEmpty()) continue;
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
                else if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
                else sb.append(c);
            }
            if (sb.toString().equals(s)) continue;
            String[] copy = segs.clone();
            copy[i] = sb.toString();
            out.add(String.join("/", copy));
        }
        return out;
    }

    public static void main(String[] args) throws Exception {
        String in = args[0], out = args[1];
        Map<String, String[]> table = new LinkedHashMap<>();   // oldInternal -> [simple, pkg, kind, conf, ev]
        for (String[] r : Tsv.read(args[2])) {
            if (r.length < 3 || r[0].equals("oldInternalName")) continue;
            table.put(r[0], new String[]{r[1], r[2], r.length > 3 ? r[3] : "", r.length > 4 ? r[4] : "", r.length > 5 ? r[5] : ""});
        }
        Map<String, String> alias = new HashMap<>();          // newInternal -> oldInternal
        if (args.length > 3 && Files.exists(Paths.get(args[3]))) {
            for (String[] r : Tsv.read(args[3])) {
                if (r.length >= 2 && !r[0].equals("newInternalName")) alias.put(r[0], r[1]);
            }
        }
        System.out.println("rename table=" + table.size() + "  alias=" + alias.size());

        Jar jar = new Jar(in);
        Map<String, List<ClassNode>> db = jar.classNodes();

        // 先算出每个类的新内部名，并检查冲突
        Map<String, String> newName = new HashMap<>();
        Set<String> reserved = new HashSet<>();
        int renamed = 0, missing = 0;

        // 第一轮：确定哪些类要改名（表里有条目的），并把"不改名"的类所占的名字先占住
        Map<String, String[]> plan = new LinkedHashMap<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                String[] t = lookup(table, alias, cn.name);
                if (t != null) { plan.put(cn.name, t); continue; }
                int i = cn.name.lastIndexOf('$');
                if (i > 0) {
                    String[] to = lookup(table, alias, cn.name.substring(0, i));
                    if (to != null) { plan.put(cn.name, null); continue; }   // 嵌套类，名字跟外部类走
                }
                missing++;
                reserved.add(cn.name);
            }
        }

        // 第二轮：分配新名字，避开所有已被占用的名字
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if (!plan.containsKey(cn.name)) continue;
                String[] t = plan.get(cn.name);
                String simple, pkg;
                if (t == null) {
                    // 嵌套类：外部类新名 + $后缀
                    int i = cn.name.lastIndexOf('$');
                    String[] to = lookup(table, alias, cn.name.substring(0, i));
                    simple = cn.name.substring(i + 1);
                    pkg = to[1].replace('.', '/');
                } else {
                    simple = t[0];
                    pkg = t[1].replace('.', '/');
                }
                String base = pkg.isEmpty() ? simple : pkg + "/" + simple;
                String cand = base;
                int n = 1;
                while (reserved.contains(cand)) { n++; cand = base + "_" + n; }
                reserved.add(cand);
                newName.put(cn.name, cand);
                renamed++;
            }
        }
        System.out.println("classes to rename=" + renamed + "  (no table entry: " + missing + ")");

        final Map<String, String> nn = newName;
        Remapper remap = new Remapper() {
            @Override public String map(String internalName) {
                if (internalName == null) return null;
                String v = nn.get(internalName);
                return v != null ? v : internalName;
            }
        };

        int written = 0, skipped = 0;
        try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(in);
             java.util.zip.ZipOutputStream zo = new java.util.zip.ZipOutputStream(
                     new BufferedOutputStream(new FileOutputStream(out)))) {
            java.util.Enumeration<? extends java.util.zip.ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                java.util.zip.ZipEntry e = en.nextElement();
                byte[] data;
                try (InputStream is = zf.getInputStream(e)) { data = is.readAllBytes(); }
                String name = e.getName();
                if (name.endsWith(".class") || name.endsWith(".SCL.lombok")) {
                    String oldInternal = Jar.internalName(data);
                    ClassReader cr = new ClassReader(data);
                    ClassWriter cw = new ClassWriter(0);
                    cr.accept(new ClassRemapper(cw, remap), 0);
                    data = cw.toByteArray();
                    if (oldInternal != null) {
                        String target = remap.map(oldInternal);
                        if (target != null && !target.equals(oldInternal)) {
                            name = target + (name.endsWith(".class") ? ".class" : ".SCL.lombok");
                            written++;
                        } else skipped++;
                    }
                }
                java.util.zip.ZipEntry ne = new java.util.zip.ZipEntry(name);
                ne.setTime(e.getTime());
                zo.putNextEntry(ne);
                zo.write(data);
                zo.closeEntry();
            }
        }
        System.out.println("entries renamed=" + written + "  unchanged=" + skipped);
        System.out.println("wrote " + out + "  size=" + Files.size(Paths.get(out)));

        if (args.length > 4) {
            try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(args[4]), StandardCharsets.UTF_8))) {
                w.println("oldInternalName\tnewInternalName");
                for (Map.Entry<String, String> e : newName.entrySet()) w.println(e.getKey() + "\t" + e.getValue());
            }
        }
    }
}
