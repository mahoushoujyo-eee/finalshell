import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;

import java.util.*;

/**
 * 统计每个内部类被多少处引用，用来判断"大小写冲突组"里的小写变体
 * 是真实在用的类，还是混淆器放的反工具化诱饵。
 */
public class RefCount {
    public static void main(String[] args) throws Exception {
        Jar jar = new Jar(args[0]);
        Map<String, List<ClassNode>> db = jar.classNodes();

        // 被引用次数
        Map<String, Integer> refs = new HashMap<>();
        Map<String, Integer> size = new HashMap<>();
        for (Map.Entry<String, List<ClassNode>> e : db.entrySet()) {
            for (ClassNode cn : e.getValue()) {
                size.merge(cn.name, 0, (a, b) -> a + b);
                for (MethodNode mn : cn.methods) {
                    if (mn.instructions == null) continue;
                    for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext()) {
                        if (insn.getOpcode() == Opcodes.INVOKESTATIC
                                || insn.getOpcode() == Opcodes.INVOKEVIRTUAL
                                || insn.getOpcode() == Opcodes.INVOKESPECIAL
                                || insn.getOpcode() == Opcodes.INVOKEINTERFACE) {
                            MethodInsnNode mi = (MethodInsnNode) insn;
                            refs.merge(mi.owner, 1, Integer::sum);
                        } else if (insn.getOpcode() == Opcodes.GETSTATIC
                                || insn.getOpcode() == Opcodes.PUTSTATIC
                                || insn.getOpcode() == Opcodes.GETFIELD
                                || insn.getOpcode() == Opcodes.PUTFIELD) {
                            FieldInsnNode fi = (FieldInsnNode) insn;
                            refs.merge(fi.owner, 1, Integer::sum);
                        } else if (insn.getOpcode() == Opcodes.NEW
                                || insn.getOpcode() == Opcodes.ANEWARRAY
                                || insn.getOpcode() == Opcodes.CHECKCAST
                                || insn.getOpcode() == Opcodes.INSTANCEOF) {
                            TypeInsnNode ti = (TypeInsnNode) insn;
                            refs.merge(ti.desc, 1, Integer::sum);
                        } else if (insn instanceof LdcInsnNode) {
                            Object c = ((LdcInsnNode) insn).cst;
                            if (c instanceof Type) refs.merge(((Type) c).getInternalName(), 1, Integer::sum);
                        }
                    }
                }
            }
        }
        // 大小写冲突组
        Map<String, List<String>> ci = new TreeMap<>();
        for (String n : db.keySet()) {
            ci.computeIfAbsent(n.toLowerCase(Locale.ROOT), k -> new ArrayList<>()).add(n);
        }
        int groups = 0, decoyGroups = 0, bothUsed = 0;
        List<String> decoys = new ArrayList<>();
        for (Map.Entry<String, List<String>> e : ci.entrySet()) {
            if (e.getValue().size() < 2) continue;
            groups++;
            int used = 0;
            for (String n : e.getValue()) {
                if (refs.getOrDefault(n, 0) > 0) used++;
            }
            if (used == 0) { decoyGroups++; decoys.addAll(e.getValue()); }
            else if (used == e.getValue().size()) bothUsed++;
        }
        System.out.println("大小写冲突组=" + groups);
        System.out.println("  组内全部零引用(诱饵组)=" + decoyGroups);
        System.out.println("  组内每个变体都被引用=" + bothUsed);
        System.out.println("零引用的类总数=" + decoys.size());
        try (java.io.PrintWriter w = new java.io.PrintWriter(args[1])) {
            w.println("internal\trefs");
            for (Map.Entry<String, Integer> e : new TreeMap<>(refs).entrySet()) {
                w.println(e.getKey() + "\t" + e.getValue());
            }
        }
        try (java.io.PrintWriter w = new java.io.PrintWriter(args[2])) {
            for (String d : decoys) w.println(d);
        }
    }
}
