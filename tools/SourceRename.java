import org.objectweb.asm.*;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * 在**字节码层**按改名表重命名类，并可选地注入 Registry 别名机制。
 *
 * 为什么必须在字节码层做：类名一改，所有引用点（字段类型、方法签名、指令 owner、
 * 常量池里的类名、异常处理表的 catch 类型、注解类型、泛型签名）都必须跟着改。
 * 文本层做要靠正则逐个匹配，既慢又容易漏；字节码层用 ASM 的 ClassRemapper 一次性全部跟随更新。
 *
 * 用法：
 *   java -cp "<tools\bin>;<_lib\asm>" SourceRename <in.jar> <out.jar> <proposal.tsv> [more.tsv ...] [选项]
 *
 * 选项：
 *   --alias <map.tsv>     Registry 别名表：oldBinaryName \t newBinaryName（单列也可）
 *                         不给则不注入别名机制
 *   --no-alias-inject     给了 --alias 也不改 Registry.lookupClass（只生成别名类）
 *   --log <rename-log.tsv> 改名日志输出（oldInternal \t newInternal），默认打印到标准输出
 *
 * 改名表（proposal.tsv）支持两种列式：
 *   A. 带表头，且含 currentFqn（或 oldFqn）+ newSimpleName + newPackage 三列
 *   B. 两列：oldFqn \t newFqn
 * 表头里若还有 action 列，则 action=vendor / keep / review 且没有新名的行会被跳过。
 */
public class SourceRename {

    /** 改名表里跳过的 action（这些行不是"改名"，是标记）。 */
    static final Set<String> SKIP_ACTIONS = new HashSet<>(Arrays.asList("vendor", "keep"));

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("usage: SourceRename <in.jar> <out.jar> <proposal.tsv> [more.tsv ...] [--alias <map.tsv>] [--log <file>]");
            System.exit(2);
        }
        String in = args[0], out = args[1];

        List<String> proposalFiles = new ArrayList<>();
        String aliasFile = null, logFile = null;
        boolean injectAlias = true;
        for (int i = 2; i < args.length; i++) {
            String a = args[i];
            if (a.equals("--alias") && i + 1 < args.length) { aliasFile = args[++i]; }
            else if (a.equals("--log") && i + 1 < args.length) { logFile = args[++i]; }
            else if (a.equals("--no-alias-inject")) { injectAlias = false; }
            else proposalFiles.add(a);
        }
        if (proposalFiles.isEmpty()) { System.err.println("no proposal file"); System.exit(2); }

        // ---------------- 1. 读改名表 ----------------
        Map<String, String> plan = new LinkedHashMap<>();   // currentInternal -> newInternal
        Map<String, String> planDesc = new LinkedHashMap<>(); // currentInternal -> 说明
        for (String pf : proposalFiles) {
            List<String[]> hdr = readTsvHeader(pf);
            // 表头里若没有可识别的列名，就按"两列 oldFqn newFqn"处理
            boolean hasHeader = false;
            for (String[] h : hdr) {
                String n = h[0].trim();
                if (n.equals("currentFqn") || n.equals("oldFqn") || n.equals("newSimpleName")
                        || n.equals("newPackage") || n.equals("proposedFQN") || n.equals("newFqn")) { hasHeader = true; break; }
            }
            // 列下标必须从**表头**算，不能拿数据行去匹配列名
            int curIdx = -1, simpleIdx = -1, pkgIdx = -1, newFqnIdx = -1, actIdx = -1;
            if (hasHeader) {
                String[] h = hdr.get(0);
                for (int i = 0; i < h.length; i++) {
                    String n = h[i].trim();
                    if (n.equals("currentFqn") || n.equals("oldFqn")) curIdx = i;
                    else if (n.equals("newSimpleName")) simpleIdx = i;
                    else if (n.equals("newPackage")) pkgIdx = i;
                    else if (n.equals("newFqn") || n.equals("proposedFQN")) newFqnIdx = i;
                    else if (n.equals("action")) actIdx = i;
                }
            }
            for (String[] r : readTsv(pf)) {
                String cur, neu = null;
                String action = "";
                if (hasHeader) {
                    int ci = curIdx, si = simpleIdx, pi = pkgIdx;
                    int ni = newFqnIdx, ai = actIdx;
                    if (ci < 0 || ci >= r.length) continue;
                    cur = r[ci].trim();
                    if (ai >= 0 && ai < r.length) action = r[ai].trim();
                    if (ni >= 0 && ni < r.length && !r[ni].trim().isEmpty()) neu = r[ni].trim();
                    else if (si >= 0 && pi >= 0 && si < r.length && pi < r.length
                            && !r[si].trim().isEmpty() && !r[pi].trim().isEmpty()) {
                        neu = r[pi].trim() + "." + r[si].trim();
                    }
                } else if (r.length >= 2) {
                    cur = r[0].trim();
                    neu = r[1].trim();
                } else continue;
                if (cur.isEmpty() || neu == null || neu.isEmpty()) continue;
                if (SKIP_ACTIONS.contains(action)) continue;
                String curInternal = cur.replace('.', '/');
                String neuInternal = neu.replace('.', '/');
                if (curInternal.equals(neuInternal)) continue;
                plan.put(curInternal, neuInternal);
                planDesc.put(curInternal, cur + " -> " + neu + (action.isEmpty() ? "" : "  [" + action + "]"));
            }
        }
        System.out.println("proposal entries: " + plan.size());

        // ---------------- 2. 读 jar，算新名字 ----------------
        Jar jar = new Jar(in);
        Map<String, List<ClassNode>> db = jar.classNodes();
        Set<String> existing = new HashSet<>(db.keySet());

        Map<String, String> newName = new LinkedHashMap<>();
        Set<String> reserved = new HashSet<>();
        int missing = 0, collision = 0;

        // 先占住所有"不打算改名"的类名
        for (String cn : existing) {
            boolean willRename = plan.containsKey(cn);
            if (!willRename) {
                int i = cn.lastIndexOf('$');
                if (i > 0 && plan.containsKey(cn.substring(0, i))) willRename = true;   // 内部类跟随外部类
            }
            if (!willRename) reserved.add(cn);
        }

        for (Map.Entry<String, String> e : plan.entrySet()) {
            String cur = e.getKey();
            if (!existing.contains(cur)) {
                System.out.println("  MISSING in jar: " + cur);
                missing++;
                continue;
            }
            String neu = e.getValue();
            if (existing.contains(neu) && !plan.containsKey(neu)) {
                System.out.println("  COLLISION: target already exists: " + neu);
                collision++;
                continue;
            }
            newName.put(cur, neu);
        }
        System.out.println("classes to rename: " + newName.size() + "  (missing=" + missing + "  collision=" + collision + ")");

        // 内部类跟随外部类
        for (String cn : existing) {
            if (newName.containsKey(cn)) continue;
            int i = cn.lastIndexOf('$');
            if (i <= 0) continue;
            String outerNew = newName.get(cn.substring(0, i));
            if (outerNew == null) continue;
            newName.put(cn, outerNew + cn.substring(i));
        }

        // ---------------- 3. 别名表 ----------------
        Map<String, String> aliasMap = new LinkedHashMap<>();
        if (aliasFile != null) {
            for (String[] r : readTsv(aliasFile)) {
                if (r.length < 2) continue;
                String k = r[0].trim(), v = r[1].trim();
                if (k.isEmpty() || v.isEmpty()) continue;
                // 别名表的 value 也要跟着改名走
                String vNew = newName.containsKey(v.replace('.', '/')) ? newName.get(v.replace('.', '/')) : v;
                aliasMap.put(k, vNew.replace('/', '.'));
            }
            System.out.println("alias entries: " + aliasMap.size());
        }

        final Map<String, String> nn = newName;
        Remapper remap = new Remapper() {
            @Override public String map(String internalName) {
                if (internalName == null) return null;
                String v = nn.get(internalName);
                return v != null ? v : internalName;
            }
        };

        // ---------------- 4. 逐条重写 jar ----------------
        int written = 0, unchanged = 0, aliasInjected = 0;
        List<String> log = new ArrayList<>();
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
                    ClassNode cn = new ClassNode();
                    cr.accept(cn, ClassReader.SKIP_FRAMES);
                    // 注入别名钩子
                    if (injectAlias && !aliasMap.isEmpty() && isRegistry(cn.name)) {
                        if (patchLookupClass(cn)) { aliasInjected++; }
                    }
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(new ClassRemapper(cw, remap));
                    data = cw.toByteArray();
                    if (oldInternal != null) {
                        String target = remap.map(oldInternal);
                        if (target != null && !target.equals(oldInternal)) {
                            name = target + (name.endsWith(".class") ? ".class" : ".SCL.lombok");
                            written++;
                            log.add(oldInternal + "\t" + target);
                        } else unchanged++;
                    }
                }
                java.util.zip.ZipEntry ne = new java.util.zip.ZipEntry(name);
                ne.setTime(e.getTime());
                zo.putNextEntry(ne);
                zo.write(data);
                zo.closeEntry();
            }
            // 别名类
            if (!aliasMap.isEmpty()) {
                byte[] ac = AliasClass.build(aliasMap);
                java.util.zip.ZipEntry ne = new java.util.zip.ZipEntry("com/finalshell/reflect/RegistryAliases.class");
                zo.putNextEntry(ne);
                zo.write(ac);
                zo.closeEntry();
                System.out.println("injected com/finalshell/reflect/RegistryAliases.class  entries=" + aliasMap.size());
            }
        }
        System.out.println("entries renamed=" + written + "  unchanged=" + unchanged + "  registry patched=" + aliasInjected);
        System.out.println("wrote " + out + "  size=" + Files.size(Paths.get(out)));

        // ---------------- 5. 日志 ----------------
        if (logFile != null) {
            try (PrintWriter w = new PrintWriter(new OutputStreamWriter(new FileOutputStream(logFile), StandardCharsets.UTF_8))) {
                w.println("oldInternalName\tnewInternalName");
                for (String s : log) w.println(s);
            }
            System.out.println("rename log -> " + logFile);
        } else {
            for (String s : log) System.out.println("  RENAME " + s);
        }
    }

    static boolean isRegistry(String internal) {
        return internal.equals("com/finalshell/reflect/Registry") || internal.equals("com/c");
    }

    /**
     * 把 Registry.lookupClass 里的 Class.forName(String) 换成 RegistryAliases.forName(String)。
     * 两者描述符完全一致（(Ljava/lang/String;)Ljava/lang/Class;），所以栈图和异常表都不用改。
     */
    static boolean patchLookupClass(ClassNode cn) {
        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("lookupClass") || !m.desc.equals("(J)Ljava/lang/Class;")) continue;
            if (m.instructions == null) continue;
            for (AbstractInsnNode in = m.instructions.getFirst(); in != null; in = in.getNext()) {
                if (!(in instanceof MethodInsnNode)) continue;
                MethodInsnNode mi = (MethodInsnNode) in;
                if (mi.owner.equals("java/lang/Class") && mi.name.equals("forName")
                        && mi.desc.equals("(Ljava/lang/String;)Ljava/lang/Class;")) {
                    mi.owner = "com/finalshell/reflect/RegistryAliases";
                    mi.name = "forName";
                    mi.itf = false;
                    patched = true;
                }
            }
        }
        return patched;
    }

    // ---------------- 小工具 ----------------
    static int indexOf(String[] row, String col) {
        if (col == null) return -1;
        for (int i = 0; i < row.length; i++) if (row[i] != null && row[i].trim().equals(col.trim())) return i;
        return -1;
    }

    static List<String[]> readTsvHeader(String path) throws IOException {
        try (BufferedReader r = Files.newBufferedReader(Paths.get(path), StandardCharsets.UTF_8)) {
            String line = r.readLine();
            if (line == null) return Collections.emptyList();
            return Collections.singletonList(line.split("\t", -1));
        }
    }

    /** 读 TSV，跳过表头。 */
    static List<String[]> readTsv(String path) throws IOException {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader r = Files.newBufferedReader(Paths.get(path), StandardCharsets.UTF_8)) {
            String line;
            boolean first = true;
            while ((line = r.readLine()) != null) {
                if (first) { first = false; continue; }
                if (line.trim().isEmpty()) continue;
                rows.add(line.split("\t", -1));
            }
        }
        return rows;
    }
}
