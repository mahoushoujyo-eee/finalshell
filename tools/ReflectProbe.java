import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.util.*;

/**
 * 统计反射调用点的字节码模式。
 * 目的是在写改写器之前，先把真实存在的几种模式数清楚 —— 盲写容易漏。
 */
public class ReflectProbe {
    public static void main(String[] args) throws Exception {
        Jar jar = new Jar(args[0]);
        Map<String, List<ClassNode>> db = jar.classNodes();
        Map<String, Integer> patterns = new TreeMap<>();
        Map<String, Integer> invokeSites = new TreeMap<>();
        List<String> samples = new ArrayList<>();
        int totalInvoke = 0, totalFieldSet = 0, totalFieldGet = 0, totalLookup = 0;

        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    List<AbstractInsnNode> insns = new ArrayList<>();
                    for (AbstractInsnNode i = m.instructions.getFirst(); i != null; i = i.getNext()) insns.add(i);
                    for (int idx = 0; idx < insns.size(); idx++) {
                        AbstractInsnNode in = insns.get(idx);
                        if (!(in instanceof MethodInsnNode)) continue;
                        MethodInsnNode mi = (MethodInsnNode) in;
                        if (mi.owner.equals("com/c") && mi.name.equals("d") && mi.desc.equals("(J)Ljava/lang/reflect/Method;")) {
                            totalLookup++;
                            String pat = describe(insns, idx);
                            patterns.merge(pat, 1, Integer::sum);
                            if (samples.size() < 12) samples.add(cn.name + "#" + m.name + "  " + pat);
                        }
                        if (mi.owner.equals("java/lang/reflect/Method") && mi.name.equals("invoke")) {
                            totalInvoke++;
                            invokeSites.merge(mi.desc, 1, Integer::sum);
                        }
                        if (mi.owner.equals("java/lang/reflect/Field") && mi.name.equals("set")) totalFieldSet++;
                        if (mi.owner.equals("java/lang/reflect/Field") && mi.name.equals("get")) totalFieldGet++;
                    }
                }
            }
        }
        System.out.println("com.c.d(J) lookups = " + totalLookup);
        System.out.println("Method.invoke sites = " + totalInvoke + "  " + invokeSites);
        System.out.println("Field.set sites    = " + totalFieldSet);
        System.out.println("Field.get sites    = " + totalFieldGet);
        System.out.println();
        System.out.println("=== pattern histogram (instructions after com.c.d) ===");
        for (Map.Entry<String, Integer> e : patterns.entrySet())
            System.out.printf("%8d  %s%n", e.getValue(), e.getKey());
        System.out.println();
        System.out.println("=== samples ===");
        for (String s : samples) System.out.println("  " + s);
    }

    /** 把 com.c.d 调用之后、下一个 invoke 之前的指令序列压成一个模式串。 */
    static String describe(List<AbstractInsnNode> insns, int idx) {
        StringBuilder sb = new StringBuilder();
        for (int k = idx + 1; k < Math.min(idx + 7, insns.size()); k++) {
            AbstractInsnNode in = insns.get(k);
            if (in instanceof MethodInsnNode) {
                MethodInsnNode mi = (MethodInsnNode) in;
                sb.append(mi.owner).append('.').append(mi.name).append(mi.desc).append(" | ");
                if (mi.name.equals("invoke")) break;
            } else if (in.getOpcode() >= 0) {
                sb.append(opName(in.getOpcode())).append(' ');
            } else {
                sb.append("? ");
            }
        }
        return sb.toString();
    }

    static String opName(int op) {
        switch (op) {
            case Opcodes.SWAP: return "swap";
            case Opcodes.ACONST_NULL: return "aconst_null";
            case Opcodes.POP: return "pop";
            case Opcodes.POP2: return "pop2";
            case Opcodes.DUP: return "dup";
            case Opcodes.DUP_X1: return "dup_x1";
            case Opcodes.DUP_X2: return "dup_x2";
            case Opcodes.DUP2: return "dup2";
            case Opcodes.DUP2_X1: return "dup2_x1";
            case Opcodes.DUP2_X2: return "dup2_x2";
            default: return "op" + op;
        }
    }
}
