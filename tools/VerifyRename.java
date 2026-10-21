import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * 改名后的一致性校验器。
 *
 * 用法：java -cp "&lt;tools\bin&gt;;&lt;_lib\asm&gt;" VerifyRename &lt;in.jar&gt; &lt;out.jar&gt; &lt;proposal.tsv&gt; [选项]
 *
 * 校验项：
 *   1. 改名表里每个 old 类在**输入** jar 里存在；
 *   2. **输出** jar 里没有残留的旧类名引用（扫所有 class 的常量池：CONSTANT_Class、
 *      字段/方法描述符、异常处理表的 catch 类型、注解类型、泛型签名、字符串常量）；
 *   3. 输出的类数量与输入一致；
 *   4. 输出 jar 里每个 class 的内部名与 jar 条目路径一致，且包名与目录一致
 *      （JVM 拒绝加载两者不一致的 jar）；
 *   5. **Registry 里的字符串类名引用是否都已加别名**：在输出 jar 上跑一遍
 *      Registry.lookupClass/lookupField/lookupMethod，统计 ClassNotFoundException。
 *
 * 选项：
 *   --registry <registry.tsv>  Registry 解密清单（RegistryProbe 产出），用于校验项 5 的静态比对
 *   --skip-runtime             跳过校验项 5 的运行时实测（只做静态比对）
 */
public class VerifyRename {

    static int checks = 0, failures = 0;

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("usage: VerifyRename <in.jar> <out.jar> <proposal.tsv> [--registry <tsv>] [--skip-runtime]");
            System.exit(2);
        }
        String inJar = args[0], outJar = args[1], propFile = args[2];
        String regTsv = null, aliasFile = null;
        boolean runtime = true;
        for (int i = 3; i < args.length; i++) {
            if (args[i].equals("--registry") && i + 1 < args.length) regTsv = args[++i];
            else if (args[i].equals("--alias") && i + 1 < args.length) aliasFile = args[++i];
            else if (args[i].equals("--skip-runtime")) runtime = false;
        }

        // ---------- 读改名表 ----------
        // 支持两种列式：
        //   A. 带表头：currentFqn(或 oldFqn) + newSimpleName + newPackage
        //   B. 两列：old \t new
        Map<String, String> plan = new LinkedHashMap<>();  // old internal -> new internal
        List<String[]> hdr = readTsvHeader(propFile);
        boolean hasHeader = false;
        for (String[] h : hdr) {
            String n = h[0].trim();
            if (n.equals("currentFqn") || n.equals("oldFqn") || n.equals("newSimpleName")
                    || n.equals("newPackage") || n.equals("proposedFQN") || n.equals("newFqn")) { hasHeader = true; break; }
        }
        int curIdx = -1, simpleIdx = -1, pkgIdx = -1, newFqnIdx = -1;
        if (hasHeader) {
            String[] h = hdr.get(0);
            for (int i = 0; i < h.length; i++) {
                String n = h[i].trim();
                if (n.equals("currentFqn") || n.equals("oldFqn")) curIdx = i;
                else if (n.equals("newSimpleName")) simpleIdx = i;
                else if (n.equals("newPackage")) pkgIdx = i;
                else if (n.equals("newFqn") || n.equals("proposedFQN")) newFqnIdx = i;
            }
        }
        for (String[] r : readTsv(propFile)) {
            String cur, neu = null;
            if (hasHeader) {
                int ci = curIdx, si = simpleIdx, pi = pkgIdx, ni = newFqnIdx;
                if (ci < 0 || ci >= r.length) continue;
                cur = r[ci].trim();
                if (ni >= 0 && ni < r.length && !r[ni].trim().isEmpty()) neu = r[ni].trim();
                else if (si >= 0 && pi >= 0 && si < r.length && pi < r.length
                        && !r[si].trim().isEmpty() && !r[pi].trim().isEmpty()) neu = r[pi].trim() + "." + r[si].trim();
            } else {
                if (r.length < 2) continue;
                cur = r[0].trim(); neu = r[1].trim();
            }
            if (cur.isEmpty() || neu == null || neu.isEmpty()) continue;
            plan.put(cur.replace('.', '/'), neu.replace('.', '/'));
        }
        System.out.println("proposal rows parsed: " + plan.size());

        Jar in = new Jar(inJar);
        Jar out = new Jar(outJar);
        Map<String, List<ClassNode>> inDb = in.classNodes();
        Map<String, List<ClassNode>> outDb = out.classNodes();

        // ---------- 校验 1：old 类在输入 jar 里存在 ----------
        System.out.println();
        System.out.println("[1] proposal old classes exist in input jar");
        List<String> missing = new ArrayList<>();
        for (String old : plan.keySet()) if (!inDb.containsKey(old)) missing.add(old);
        report(missing.isEmpty(), plan.size() - missing.size() + "/" + plan.size()
                + " present" + (missing.isEmpty() ? "" : "  MISSING: " + missing));

        // ---------- 校验 3：类数量一致 ----------
        System.out.println("[3] class count in == out");
        int inCount = inDb.size(), outCount = outDb.size();
        int injected = outDb.containsKey("com/finalshell/reflect/RegistryAliases") ? 1 : 0;
        report(outCount - injected == inCount, "in=" + inCount + " out=" + outCount
                + " (injectedAliasClass=" + injected + ")"
                + (outCount - injected == inCount ? "" : "  MISMATCH"));

        // ---------- 校验 2：输出 jar 里没有旧类名残留 ----------
        System.out.println("[2] no residual references to old class names in output jar");
        Set<String> oldInternal = new HashSet<>(plan.keySet());
        // 也检查"旧二进制名"形态
        Set<String> oldBinary = new HashSet<>();
        for (String o : plan.keySet()) oldBinary.add(o.replace('/', '.'));
        Map<String, List<String>> residual = new TreeMap<>();
        for (Map.Entry<String, List<ClassNode>> e : outDb.entrySet()) {
            for (ClassNode cn : e.getValue()) {
                for (String ref : collectClassRefs(cn)) {
                    if (oldInternal.contains(ref)) residual.computeIfAbsent(ref, k -> new ArrayList<>()).add(cn.name);
                }
            }
        }
        // 字符串常量里出现的旧二进制名
        Map<String, List<String>> residualStr = new TreeMap<>();
        for (Map.Entry<String, List<ClassNode>> e : outDb.entrySet()) {
            for (ClassNode cn : e.getValue()) {
                for (String s : collectStrings(cn)) {
                    for (String ob : oldBinary) {
                        if (s.equals(ob) || s.contains(ob + ".") || s.contains(ob + "$")) {
                            residualStr.computeIfAbsent(ob, k -> new ArrayList<>()).add(cn.name + " : \"" + s + "\"");
                        }
                    }
                }
            }
        }
        report(residual.isEmpty(), "constant-pool class refs to old names: " + residual.size()
                + (residual.isEmpty() ? "" : "  " + trim(residual)));
        report(residualStr.isEmpty(), "string literals containing old binary names: " + residualStr.size()
                + (residualStr.isEmpty() ? "" : "  " + trim(residualStr)));

        // ---------- 校验 4：内部名 / 条目名 / 包名 三者一致 ----------
        System.out.println("[4] class internal name == jar entry path == package prefix");
        List<String> mismatch = new ArrayList<>();
        java.util.zip.ZipFile zf = new java.util.zip.ZipFile(outJar);
        Enumeration<? extends java.util.zip.ZipEntry> en = zf.entries();
        int entryCount = 0;
        while (en.hasMoreElements()) {
            java.util.zip.ZipEntry ze = en.nextElement();
            if (!ze.getName().endsWith(".class")) continue;
            entryCount++;
            byte[] d;
            try (InputStream is = zf.getInputStream(ze)) { d = is.readAllBytes(); }
            String internal = Jar.internalName(d);
            if (internal == null) { mismatch.add(ze.getName() + " : unreadable"); continue; }
            String expect = ze.getName().substring(0, ze.getName().length() - 6);
            if (!internal.equals(expect)) mismatch.add(ze.getName() + " : internal=" + internal);
        }
        zf.close();
        report(mismatch.isEmpty(), "entries=" + entryCount + " mismatched=" + mismatch.size()
                + (mismatch.isEmpty() ? "" : "  " + mismatch.subList(0, Math.min(8, mismatch.size()))));

        // ---------- 校验 5：Registry 字符串类名是否都已加别名 ----------
        System.out.println("[5] Registry string class-name references are aliased");
        if (regTsv != null && Files.exists(Paths.get(regTsv))) {
            // 静态比对：Registry 解密出来的每个类名 P，必须满足二者之一：
            //   (a) P 本身就是输出 jar 里的合法类名（可被 Class.forName 直接解析，例如 JDK 类）
            //   (b) P 在别名表里（改名后由 RegistryAliases 转发到新名）
            List<String[]> rows = readTsv(regTsv);
            Set<String> aliasKeys = new HashSet<>();
            if (aliasFile != null && Files.exists(Paths.get(aliasFile))) {
                for (String[] r : readTsv(aliasFile)) {
                    if (r.length >= 2 && !r[0].equals("oldBinaryName")) aliasKeys.add(r[0]);
                }
            }
            Set<String> outFqns = new HashSet<>();
            for (String cn : outDb.keySet()) outFqns.add(cn.replace('/', '.'));
            // 能被 Class.forName 直接解析的（JDK / 三方类）也算已覆盖
            ClassLoader outCl = new URLClassLoader(new URL[]{Paths.get(outJar).toUri().toURL()},
                    ClassLoader.getSystemClassLoader());
            // 输入 jar 的加载器：判断某个明文「改名前是不是就能解析」
            ClassLoader inCl = new URLClassLoader(new URL[]{Paths.get(inJar).toUri().toURL()},
                    ClassLoader.getSystemClassLoader());
            int direct = 0, viaAlias = 0, loadable = 0, uncovered = 0, preexisting = 0;
            List<String> unc = new ArrayList<>();
            int classSlot = 0;   // 槽里存的是 Class 常量（void.class 之类），根本不走 forName
            for (String[] r : rows) {
                if (r.length < 4 || !r[0].equals("CLASS")) continue;
                String name = r[3];
                String slot = (r.length > 5) ? r[5] : "STRING";
                if ("CLASS".equals(slot)) { classSlot++; continue; }
                if (outFqns.contains(name)) { direct++; continue; }
                if (aliasKeys.contains(name)) { viaAlias++; continue; }
                if (isLoadable(name, outCl)) { loadable++; continue; }
                uncovered++;
                // 改名前就解析不了的属于「本来就坏掉的条目」，不算改名造成的回归
                if (isLoadable(name, inCl)) {
                    if (unc.size() < 15) unc.add(name);
                } else {
                    preexisting++;
                }
            }
            report(unc.isEmpty(), "registry CLASS names: direct=" + direct + " viaAlias=" + viaAlias
                    + " loadableByForName=" + loadable + " classSlotNotResolved=" + classSlot
                    + " uncovered=" + uncovered + " (改名前就解析不了的=" + preexisting + ")"
                    + (unc.isEmpty() ? "" : "  REGRESSION e.g. " + unc));
        } else {
            System.out.println("    (no --registry tsv given, static comparison skipped)");
        }
        if (runtime) {
            RuntimeCheck rc = runtimeCheck(outJar, regTsv);
            RuntimeCheck rb = runtimeCheck(inJar, regTsv);
            // 回归 = 改名前能解析、改名后不能
            List<String> regress = new ArrayList<>();
            for (String s : rb.okNames) {
                if (!rc.okNames.contains(s)) regress.add(s);
            }
            report(regress.isEmpty(), "runtime lookupClass: total=" + rc.total
                    + " ok=" + rc.okNames.size()
                    + " ClassNotFoundException=" + rc.cnfe + " otherError=" + rc.other
                    + " | 改名前 ok=" + rb.okNames.size() + " cnfe=" + rb.cnfe
                    + " | 回归=" + regress.size()
                    + (regress.isEmpty() ? "" : "  REGRESSION e.g. " + regress));
        }

        System.out.println();
        System.out.println("checks=" + checks + "  failures=" + failures);
        if (failures > 0) System.exit(1);
    }

    /** 用给定的 ClassLoader 试加载一个二进制名（不做初始化）。 */
    static boolean isLoadable(String binaryName, ClassLoader cl) {
        // 先用系统类加载器（能看见 java.sql 等平台模块），再用 jar 自己的加载器
        try {
            Class.forName(binaryName, false, ClassLoader.getSystemClassLoader());
            return true;
        } catch (Throwable t) {
            // 继续试 jar 加载器
        }
        try {
            Class.forName(binaryName, false, cl);
            return true;
        } catch (Throwable t) {
            return false;
        }
    }

    // ---------------- 运行时校验 ----------------
    static class RuntimeCheck {
        int total, cnfe, other;
        Set<String> okNames = new HashSet<>();
        List<String> samples = new ArrayList<>();
        List<String> otherSamples = new ArrayList<>();
    }

    static RuntimeCheck runtimeCheck(String jarPath, String regTsv) throws Exception {
        RuntimeCheck rc = new RuntimeCheck();
        if (regTsv == null || !Files.exists(Paths.get(regTsv))) {
            System.out.println("    (no registry tsv, runtime check skipped)");
            return rc;
        }
        List<String[]> rows = readTsv(regTsv);
        URLClassLoader cl = new URLClassLoader(new URL[]{Paths.get(jarPath).toUri().toURL()}, ClassLoader.getSystemClassLoader());
        Class<?> reg;
        try {
            reg = Class.forName("com.finalshell.reflect.Registry", true, cl);
        } catch (Throwable t) {
            System.out.println("    (cannot load Registry from output jar: " + t + ")");
            return rc;
        }
        java.lang.reflect.Method lookupClass = reg.getMethod("lookupClass", long.class);
        for (String[] r : rows) {
            if (r.length < 4 || !r[0].equals("CLASS")) continue;
            long key;
            try { key = Long.parseLong(r[2]); } catch (Exception e) { continue; }
            rc.total++;
            try {
                lookupClass.invoke(null, key);
                rc.okNames.add(r[3]);
            } catch (Throwable t) {
                Throwable cause = t.getCause() != null ? t.getCause() : t;
                String msg = String.valueOf(cause);
                // Registry.lookupClass 把 ClassNotFoundException 包成 RuntimeException(msg)
                if (cause instanceof ClassNotFoundException || msg.contains("ClassNotFoundException")) {
                    rc.cnfe++;
                    if (rc.samples.size() < 10) rc.samples.add(r[3] + " -> " + msg);
                } else {
                    rc.other++;
                    if (rc.otherSamples.size() < 5) rc.otherSamples.add(r[3] + " -> " + msg);
                }
            }
        }
        return rc;
    }

    // ---------------- 常量池引用收集 ----------------
    static Set<String> collectClassRefs(ClassNode cn) {
        Set<String> out = new HashSet<>();
        if (cn.superName != null) out.add(cn.superName);
        if (cn.interfaces != null) out.addAll(cn.interfaces);
        if (cn.signature != null) addFromSignature(cn.signature, out);
        for (FieldNode f : cn.fields) {
            out.add(Type.getType(f.desc).getInternalName());
            if (f.signature != null) addFromSignature(f.signature, out);
        }
        for (MethodNode m : cn.methods) {
            out.add(Type.getReturnType(m.desc).getInternalName());
            for (Type t : Type.getArgumentTypes(m.desc)) out.add(t.getInternalName());
            if (m.signature != null) addFromSignature(m.signature, out);
            if (m.instructions == null) continue;
            for (AbstractInsnNode in : m.instructions.toArray()) {
                if (in instanceof TypeInsnNode) out.add(((TypeInsnNode) in).desc);
                else if (in instanceof FieldInsnNode) out.add(((FieldInsnNode) in).owner);
                else if (in instanceof MethodInsnNode) out.add(((MethodInsnNode) in).owner);
                else if (in instanceof MultiANewArrayInsnNode) out.add(Type.getType(((MultiANewArrayInsnNode) in).desc).getInternalName());
                else if (in instanceof LdcInsnNode) {
                    Object c = ((LdcInsnNode) in).cst;
                    if (c instanceof Type) out.add(((Type) c).getInternalName());
                }
        for (TryCatchBlockNode tcb : m.tryCatchBlocks) {
            if (tcb.type != null) out.add(tcb.type);
        }
            }
        }
        // 注解
        if (cn.visibleAnnotations != null) for (AnnotationNode a : cn.visibleAnnotations) if (a.desc != null) out.add(Type.getType(a.desc).getInternalName());
        if (cn.invisibleAnnotations != null) for (AnnotationNode a : cn.invisibleAnnotations) if (a.desc != null) out.add(Type.getType(a.desc).getInternalName());
        for (FieldNode f : cn.fields) {
            if (f.visibleAnnotations != null) for (AnnotationNode a : f.visibleAnnotations) if (a.desc != null) out.add(Type.getType(a.desc).getInternalName());
            if (f.invisibleAnnotations != null) for (AnnotationNode a : f.invisibleAnnotations) if (a.desc != null) out.add(Type.getType(a.desc).getInternalName());
        }
        for (MethodNode m : cn.methods) {
            if (m.visibleAnnotations != null) for (AnnotationNode a : m.visibleAnnotations) if (a.desc != null) out.add(Type.getType(a.desc).getInternalName());
            if (m.invisibleAnnotations != null) for (AnnotationNode a : m.invisibleAnnotations) if (a.desc != null) out.add(Type.getType(a.desc).getInternalName());
        }
        out.remove(null);
        return out;
    }

    /** 从泛型签名里抽出类内部名。 */
    static void addFromSignature(String sig, Set<String> out) {
        for (String s : sig.split("[^A-Za-z0-9_$/]+")) {
            if (s.isEmpty()) continue;
            if (s.startsWith("L") && s.endsWith(";")) s = s.substring(1, s.length() - 1);
            if (!s.isEmpty() && !s.equals("java.lang.Object")) out.add(s);
        }
    }

    static List<String> collectStrings(ClassNode cn) {
        List<String> out = new ArrayList<>();
        for (MethodNode m : cn.methods) {
            if (m.instructions == null) continue;
            for (AbstractInsnNode in : m.instructions) {
                if (in instanceof LdcInsnNode) {
                    Object c = ((LdcInsnNode) in).cst;
                    if (c instanceof String) out.add((String) c);
                }
            }
        }
        return out;
    }

    static String trim(Map<String, List<String>> m) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (Map.Entry<String, List<String>> e : m.entrySet()) {
            if (n++ >= 5) break;
            sb.append(e.getKey()).append(" <- ").append(e.getValue().size()).append(" class(es); ");
        }
        return sb.toString();
    }

    static void report(boolean ok, String msg) {
        checks++;
        if (!ok) failures++;
        System.out.println("    " + (ok ? "PASS" : "FAIL") + "  " + msg);
    }

    static List<String[]> readTsvHeader(String path) throws IOException {
        try (BufferedReader r = Files.newBufferedReader(Paths.get(path), StandardCharsets.UTF_8)) {
            String line = r.readLine();
            if (line == null) return Collections.emptyList();
            return Collections.singletonList(line.split("\t", -1));
        }
    }

    static int colIndex(String[] row, String col) {
        if (col == null) return -1;
        for (int i = 0; i < row.length; i++) if (row[i] != null && row[i].trim().equals(col.trim())) return i;
        return -1;
    }

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
