import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Registry 引用形式的**实证**探针。
 *
 * 背景：混淆器把「类名 / 字段名 / 方法名」加密存进 Registry 的静态数组，
 * 运行时解密后用 Class.forName / getDeclaredField / getDeclaredMethod 反查。
 * 改类名之前必须先搞清楚 Registry 到底以什么形式引用类：
 *   (a) 常量池里的 Class 引用  -> ASM ClassRemapper 自动跟随，无需额外机制
 *   (b) 加密的字符串类名        -> 改名后必然 ClassNotFoundException，需要别名
 *   (c) long key -> 索引 -> 加密字符串 -> 类名  (间接 b)
 *
 * 本工具做两件事：
 *   1. 静态扫 jar，收集所有传给 Registry.lookupClass / lookupField / lookupMethod
 *      的 long key（改写后是 Ref.h/h2/s/g 的第一个参数）。
 *   2. 运行时把 Registry 加载起来，逐个 key 调 decryptInt 解密，
 *      把 b[] / a[] 的明文导出来，并做不动点迭代把「描述符里嵌套的
 *      base36 类 key」也一并解开。
 *
 * 用法: java -cp "<tools\bin>;<_lib\asm>" RegistryProbe <in.jar> <out.tsv>
 *
 * 输出 TSV 列: kind \t index \t key \t plaintext
 *   kind = CLASS    该索引指向一个类（二进制名）
 *   kind = DESCR    该索引指向一个字段/方法描述符
 *   kind = PRIM     该索引指向一个 Class 常量（int.class 之类）
 *   kind = EMPTY    解不出明文
 */
public class RegistryProbe {

    /** Registry 可能的持有者名字：改名前 com/c，改名后 com/finalshell/reflect/Registry。 */
    static final String[] REGISTRY_OWNERS = {
            "com/finalshell/reflect/Registry", "com/c"
    };
    static final String[] REF_OWNERS = {
            "com/finalshell/reflect/Ref"
    };

    public static void main(String[] args) throws Exception {
        String in = args[0], out = args[1];

        // ---------- 1. 静态扫描：收集所有 long key ----------
        Jar jar = new Jar(in);
        Map<String, List<ClassNode>> db = jar.classNodes();

        // key -> 出现的调用点描述
        Map<Long, Set<String>> keySites = new TreeMap<>();
        Map<String, Integer> lookupCounter = new TreeMap<>();

        for (Map.Entry<String, List<ClassNode>> e : db.entrySet()) {
            for (ClassNode cn : e.getValue()) {
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    AbstractInsnNode[] insns = m.instructions.toArray();
                    for (int i = 0; i < insns.length; i++) {
                        AbstractInsnNode in2 = insns[i];
                        if (!(in2 instanceof MethodInsnNode)) continue;
                        MethodInsnNode mi = (MethodInsnNode) in2;
                        boolean isLookup = false;
                        for (String o : REGISTRY_OWNERS) {
                            if (mi.owner.equals(o)
                                    && (mi.name.equals("lookupClass") || mi.name.equals("lookupField")
                                    || mi.name.equals("lookupMethod"))) {
                                isLookup = true;
                            }
                        }
                        boolean isRef = false;
                        for (String o : REF_OWNERS) {
                            if (mi.owner.equals(o) && (mi.name.equals("h") || mi.name.equals("h2")
                                    || mi.name.equals("s") || mi.name.equals("g"))) {
                                isRef = true;
                            }
                        }
                        if (!isLookup && !isRef) continue;
                        lookupCounter.merge(mi.owner + "." + mi.name, 1, Integer::sum);

                        // 往前找 LDC2_W / LDC long
                        Long key = findLong(insns, i);
                        if (key == null) continue;
                        keySites.computeIfAbsent(key, k -> new TreeSet<>())
                                .add(cn.name + "#" + m.name + " -> " + mi.owner + "." + mi.name);
                    }
                }
            }
        }
        System.out.println("lookup call sites: " + lookupCounter);
        System.out.println("distinct long keys: " + keySites.size());

        // ---------- 2. 运行时解密 ----------
        URLClassLoader cl = new URLClassLoader(new URL[]{jar.path().toUri().toURL()}, null);
        Class<?> reg = null;
        for (String o : REGISTRY_OWNERS) {
            try {
                reg = Class.forName(o.replace('/', '.'), true, cl);
                System.out.println("loaded registry class: " + o);
                break;
            } catch (Throwable t) {
                // try next
            }
        }
        if (reg == null) throw new IllegalStateException("cannot load Registry class");

        Field fa = reg.getField("a");
        Field fb = reg.getField("b");
        Object[] a = (Object[]) fa.get(null);
        String[] b = (String[]) fb.get(null);
        System.out.println("Registry.a.length=" + a.length + "  Registry.b.length=" + b.length);

        java.lang.reflect.Method decryptInt = reg.getMethod("decryptInt", long.class);

        // 不动点：解密 call-site key -> 解密描述符里嵌套的 base36 类 key
        Set<Integer> known = new TreeSet<>();
        Map<Integer, Long> indexKey = new HashMap<>();
        Deque<Long> queue = new ArrayDeque<>(keySites.keySet());
        Set<Long> done = new HashSet<>();

        int rounds = 0;
        while (!queue.isEmpty() && rounds < 50) {
            rounds++;
            int added = 0;
            while (!queue.isEmpty()) {
                long key = queue.poll();
                if (!done.add(key)) continue;
                int idx;
                try {
                    idx = (Integer) decryptInt.invoke(null, key);
                } catch (Throwable t) {
                    continue;
                }
                known.add(idx);
                indexKey.putIfAbsent(idx, key);
                String plain = (idx >= 0 && idx < b.length) ? b[idx] : null;
                if (plain == null) continue;
                // 描述符里嵌的 base36 类 key
                if (plain.indexOf((char) 8) < 0) continue;
                String[] segs = plain.split("" + (char) 8);
                for (String seg : segs) {
                    if (seg.isEmpty()) continue;
                    boolean numeric = true;
                    for (int k = 0; k < seg.length(); k++) {
                        char ch = seg.charAt(k);
                        boolean ok = (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z');
                        if (!ok) { numeric = false; break; }
                    }
                    if (!numeric) continue;
                    long sub;
                    try {
                        sub = Long.parseLong(seg, 36);
                    } catch (NumberFormatException nfe) {
                        continue;
                    }
                    if (!done.contains(sub)) { queue.add(sub); added++; }
                }
            }
            System.out.println("round " + rounds + ": known indices=" + known.size() + " newKeys=" + added);
            if (added == 0) break;
        }

        // ---------- 3. 分类输出 ----------
        Set<String> classRefs = new TreeSet<>();
        Set<String> descrClasses = new TreeSet<>();
        int prim = 0, empty = 0, descr = 0;

        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(out), StandardCharsets.UTF_8))) {
            w.println("kind\tindex\tkey\tplaintext\tsites\tslotType");
            for (int idx : known) {
                Object av = a[idx];
                String plain = b[idx];
                String sites = String.join(";", keySites.getOrDefault(indexKey.getOrDefault(idx, -1L), Collections.emptySet()));
                String kind;
                if (plain == null) {
                    if (av instanceof Class) { kind = "PRIM"; prim++; plain = ((Class<?>) av).getName(); }
                    else { kind = "EMPTY"; empty++; }
                } else if (plain.indexOf((char) 8) >= 0) {
                    kind = "DESCR"; descr++;
                    // 解析嵌套类 key
                    for (String seg : plain.split("" + (char) 8)) {
                        if (seg.isEmpty()) continue;
                        boolean numeric = true;
                        for (int k = 0; k < seg.length(); k++) {
                            char ch = seg.charAt(k);
                            if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z'))) { numeric = false; break; }
                        }
                        if (!numeric) continue;
                        long sub = Long.parseLong(seg, 36);
                        int si = (int) (sub >>> 46);
                        String sp = (si >= 0 && si < b.length) ? b[si] : null;
                        if (sp != null && sp.indexOf((char) 8) < 0) descrClasses.add(sp);
                    }
                } else {
                    kind = "CLASS";
                    classRefs.add(plain);
                }
                String slotType = (av instanceof String) ? "STRING" : (av == null ? "NULL" : "CLASS");
                w.println(kind + "\t" + idx + "\t" + indexKey.getOrDefault(idx, -1L) + "\t"
                        + (plain == null ? "" : plain.replace("\t", "\\t")) + "\t" + sites + "\t" + slotType);
            }
        }
        System.out.println();
        System.out.println("indices known      = " + known.size());
        System.out.println("  CLASS entries    = " + classRefs.size());
        System.out.println("  DESCR entries    = " + descr);
        System.out.println("  PRIM entries     = " + prim);
        System.out.println("  EMPTY entries    = " + empty);
        System.out.println("distinct classes referenced by CLASS entries = " + classRefs.size());
        System.out.println("distinct classes referenced inside DESCR     = " + descrClasses.size());

        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(out + ".classes.txt"), StandardCharsets.UTF_8))) {
            for (String s : classRefs) w.println(s);
        }
        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(out + ".descrclasses.txt"), StandardCharsets.UTF_8))) {
            for (String s : descrClasses) w.println(s);
        }
        System.out.println("wrote " + out);
    }

    /** 从调用点往前回溯，找作为第一个 long 参数压栈的 LDC 常量。 */
    static Long findLong(AbstractInsnNode[] insns, int callIdx) {
        // 往前最多找 6 条指令，遇到 LDC2_W / LDC 就取
        for (int k = callIdx - 1; k >= 0 && k >= callIdx - 8; k--) {
            AbstractInsnNode n = insns[k];
            if (n instanceof LdcInsnNode) {
                Object v = ((LdcInsnNode) n).cst;
                if (v instanceof Long) return (Long) v;
            }
            if (n.getOpcode() >= 0) {
                int op = n.getOpcode();
                // 跳过不影响栈顶的指令
                if (op == Opcodes.NOP || op == Opcodes.DUP || op == Opcodes.POP
                        || op == Opcodes.CHECKCAST || op == Opcodes.DUP_X1) continue;
            }
        }
        return null;
    }
}
