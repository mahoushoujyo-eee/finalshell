import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/** 打印 invokespecial java/lang/Enum.<init> 之前的那几条指令，用来定位参数压栈指令。 */
public class ProbeCtor {
    public static void main(String[] args) throws Exception {
        Jar jar = new Jar(args[0]);
        Map<String, List<ClassNode>> db = jar.classNodes();
        int shown = 0;
        Set<String> shapes = new TreeSet<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if ((cn.access & Opcodes.ACC_ENUM) == 0) continue;
                if (!"java/lang/Enum".equals(cn.superName)) continue;
                for (MethodNode m : cn.methods) {
                    if (!m.name.equals("<init>") || m.instructions == null) continue;
                    List<AbstractInsnNode> before = new ArrayList<>();
                    for (AbstractInsnNode n = m.instructions.getFirst(); n != null; n = n.getNext()) {
                        if (n instanceof MethodInsnNode) {
                            MethodInsnNode mi = (MethodInsnNode) n;
                            if (mi.owner.equals("java/lang/Enum") && mi.name.equals("<init>")) {
                                // 往回取 3 条
                                List<AbstractInsnNode> back = new ArrayList<>();
                                AbstractInsnNode p = n.getPrevious();
                                for (int k = 0; k < 3 && p != null; k++, p = p.getPrevious()) back.add(0, p);
                                StringBuilder sb = new StringBuilder();
                                for (AbstractInsnNode b : back) {
                                    sb.append(opName(b)).append("(").append(b.getOpcode()).append(") ");
                                }
                                String shape = sb.toString().trim();
                                shapes.add(shape);
                                if (shown < 8) {
                                    System.out.println(cn.name + " " + m.desc + "  <-  " + shape);
                                    shown++;
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("--- distinct shapes ---");
        for (String s : shapes) System.out.println("  " + s);
    }

    static String opName(AbstractInsnNode n) {
        int op = n.getOpcode();
        if (n instanceof VarInsnNode) return "VAR" + ((VarInsnNode) n).var;
        if (n instanceof LdcInsnNode) {
            Object c = ((LdcInsnNode) n).cst;
            return "LDC(" + (c == null ? "null" : c.getClass().getSimpleName()) + ")";
        }
        if (n instanceof IntInsnNode) return "INT";
        if (n instanceof MethodInsnNode) return "CALL";
        if (n instanceof TypeInsnNode) return "TYPE";
        if (n instanceof FieldInsnNode) return "FIELD";
        if (n instanceof JumpInsnNode) return "JUMP";
        if (n instanceof LabelNode) return "LABEL";
        if (n instanceof LineNumberNode) return "LINE";
        return "OP" + op;
    }
}
