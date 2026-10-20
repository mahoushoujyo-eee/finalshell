import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.util.*;

/**
 * 从字节码精确采集字符串/数值解密器的调用点。
 *
 * 与旧的"正则扫反编译文本"方案不同：这里用 invokestatic 自带的 owner+desc
 * 定位解密器，并用一个常量栈跟踪器还原两个整型实参，因此不存在
 * "同名方法误判"（旧方案因此产生 1,300 处误匹配并污染了 85 个源文件）。
 */
public class Harvest2 {

    public static class Site {
        public String owner;      // 解密器所在类（内部名，斜杠分隔）
        public String name;       // 解密器方法名
        public String desc;       // 解密器描述符
        public int n;             // 第一个整型实参
        public long n2;           // 第二个实参
        public String callerClass;
        public String callerMethod;
        public String callerDesc;
    }

    public final List<Site> stringSites = new ArrayList<>();
    public final List<Site> numberSites = new ArrayList<>();
    private static final Set<String> STRING_DESC = Set.of("(II)Ljava/lang/String;");
    // 数值解密器的第二个实参是 long 常量 —— 这是混淆器的特征签名。
    // 刻意不收 (II)* 形态：类的 (II)I 等方法往往是正常业务方法，误采会导致错误替换。
    private static final Set<String> NUMBER_DESC = Set.of(
            "(IJ)I", "(IJ)J", "(IJ)Z", "(IJ)D", "(IJ)F",
            "(IJ)B", "(IJ)S", "(IJ)C");

    private final Set<String> decryptors = new HashSet<>();
    private final Jar jar;

    public Harvest2(Jar jar) { this.jar = jar; }

    public void run() throws Exception {
        Map<String, List<ClassNode>> db = jar.classNodes();
        // 第一遍：登记全 jar 的解密器方法
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                for (MethodNode m : cn.methods) {
                    if ((m.access & Opcodes.ACC_STATIC) == 0) continue;
                    // 只认 private 的：混淆器的解密器一律是 private static，
                    // 而正常业务方法通常不是 —— 这一条把误采风险压到最低。
                    if ((m.access & Opcodes.ACC_PRIVATE) == 0) continue;
                    if (STRING_DESC.contains(m.desc) || NUMBER_DESC.contains(m.desc)) {
                        decryptors.add(cn.name + "." + m.name + m.desc);
                    }
                }
            }
        }
        // 第二遍：采集调用点
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                for (MethodNode m : cn.methods) {
                    if (m.instructions != null) scan(cn, m);
                }
            }
        }
    }

    private void scan(ClassNode cn, MethodNode m) {
        List<Object> stack = new ArrayList<>();
        for (AbstractInsnNode insn = m.instructions.getFirst(); insn != null; insn = insn.getNext()) {
            int op = insn.getOpcode();
            Integer iv = null;
            Long lv = null;
            if (op >= Opcodes.ICONST_M1 && op <= Opcodes.ICONST_5) {
                iv = op - Opcodes.ICONST_0;
            } else if (insn instanceof IntInsnNode) {
                iv = ((IntInsnNode) insn).operand;
            } else if (insn instanceof LdcInsnNode) {
                Object c = ((LdcInsnNode) insn).cst;
                if (c instanceof Integer) iv = (Integer) c;
                else if (c instanceof Long) lv = (Long) c;
            }
            if (iv != null) { stack.add(iv); continue; }
            if (lv != null) { stack.add(lv); continue; }
            if (op == Opcodes.LCONST_0) { stack.add(0L); continue; }
            if (op == Opcodes.LCONST_1) { stack.add(1L); continue; }

            if (op == Opcodes.INVOKESTATIC) {
                MethodInsnNode mi = (MethodInsnNode) insn;
                if (decryptors.contains(mi.owner + "." + mi.name + mi.desc)) {
                    Object b2 = pop(stack), b1 = pop(stack);
                    Site s = new Site();
                    s.owner = mi.owner; s.name = mi.name; s.desc = mi.desc;
                    s.callerClass = cn.name; s.callerMethod = m.name; s.callerDesc = m.desc;
                    if (b1 instanceof Integer && b2 instanceof Integer) {
                        s.n = (Integer) b1; s.n2 = (Integer) b2;
                        stringSites.add(s);
                    } else if (b1 instanceof Integer && b2 instanceof Long) {
                        s.n = (Integer) b1; s.n2 = (Long) b2;
                        numberSites.add(s);
                    }
                }
                stack.clear();
            } else if (op == Opcodes.INVOKEVIRTUAL || op == Opcodes.INVOKESPECIAL
                    || op == Opcodes.INVOKEINTERFACE) {
                stack.clear();
            } else if (op == Opcodes.POP || op == Opcodes.POP2) {
                pop(stack);
            } else if (op == Opcodes.DUP) {
                if (!stack.isEmpty()) stack.add(stack.get(stack.size() - 1));
            } else if (op == Opcodes.ASTORE || op == Opcodes.ISTORE || op == Opcodes.LSTORE
                    || (op >= Opcodes.IALOAD && op <= Opcodes.SALOAD)) {
                pop(stack);
            } else {
                stack.clear();
            }
        }
    }

    private static Object pop(List<Object> s) {
        return s.isEmpty() ? null : s.remove(s.size() - 1);
    }

    public static void main(String[] args) throws Exception {
        Harvest2 h = new Harvest2(new Jar(args[0]));
        h.run();
        write(args[1], h.stringSites);
        write(args[2], h.numberSites);
        System.out.println("decryptor methods=" + h.decryptors.size()
                           + "  string sites=" + h.stringSites.size()
                           + "  number sites=" + h.numberSites.size());
    }

    static void write(String path, List<Site> sites) throws Exception {
        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(path), java.nio.charset.StandardCharsets.UTF_8))) {
            w.println("owner\tname\tdesc\tn\tn2\tcallerClass\tcallerMethod\tcallerDesc");
            for (Site s : sites) {
                w.println(s.owner + "\t" + s.name + "\t" + s.desc + "\t" + s.n + "\t" + s.n2
                          + "\t" + s.callerClass + "\t" + s.callerMethod + "\t" + s.callerDesc);
            }
        }
    }
}
