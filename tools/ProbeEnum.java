import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * 假枚举诊断探针。
 *
 * 背景：FixBytecode 的 --enum 判定把「自身被 new 出来」当成假枚举的判据，
 * 但**真枚举的 <clinit> 就会 new 自己**（枚举常量就是 new 出来的）。
 * 于是 594 个被判定为假枚举的类里，绝大多数其实是**真枚举**，
 * 它们的 ACC_ENUM 被清掉后，Vineflower 渲染成 `class X extends Enum`，
 * javac 报 "classes cannot directly extend java.lang.Enum"。
 *
 * 这个探针把每个 ACC_ENUM 类的关键事实打出来，作为重写判据的依据。
 */
public class ProbeEnum {

    public static void main(String[] args) throws Exception {
        String in = args[0];
        Jar jar = new Jar(in);
        Map<String, List<ClassNode>> db = jar.classNodes();

        // 收集"被谁 new"的映射：newTarget -> set of enclosing classes
        Map<String, Set<String>> newedBy = new HashMap<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    for (AbstractInsnNode insn = m.instructions.getFirst(); insn != null; insn = insn.getNext()) {
                        if (insn instanceof TypeInsnNode && insn.getOpcode() == Opcodes.NEW) {
                            newedBy.computeIfAbsent(((TypeInsnNode) insn).desc, k -> new HashSet<>()).add(cn.name);
                        }
                    }
                }
            }
        }

        PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(args[1]), StandardCharsets.UTF_8));
        w.println("internal\tsuper\thasValues\thasValueOf\thasValuesArr\tselfNewedInClinit\t"
                + "hasEnumCtorSuperCall\tctors\tsuperIsEnumish\tclassKind");
        int n = 0;
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if ((cn.access & Opcodes.ACC_ENUM) == 0) continue;
                n++;

                boolean hasValues = false, hasValueOf = false, hasValuesArr = false;
                List<String> ctors = new ArrayList<>();
                boolean enumSuperCall = false;
                boolean selfNewInClinit = false;

                String arrDesc = "[L" + cn.name + ";";
                for (MethodNode m : cn.methods) {
                    if (m.name.equals("values") && m.desc.equals("()" + arrDesc)) hasValues = true;
                    if (m.name.equals("valueOf") && m.desc.equals("(Ljava/lang/String;)L" + cn.name + ";"))
                        hasValueOf = true;
                    if (m.name.equals("<init>")) ctors.add(m.desc);
                    if (m.instructions != null) {
                        for (AbstractInsnNode insn = m.instructions.getFirst(); insn != null; insn = insn.getNext()) {
                            if (insn instanceof MethodInsnNode
                                    && ((MethodInsnNode) insn).owner.equals("java/lang/Enum")
                                    && ((MethodInsnNode) insn).name.equals("<init>")
                                    && ((MethodInsnNode) insn).desc.equals("(Ljava/lang/String;I)V")) {
                                enumSuperCall = true;
                            }
                            if (m.name.equals("<clinit>") && insn instanceof TypeInsnNode
                                    && insn.getOpcode() == Opcodes.NEW
                                    && ((TypeInsnNode) insn).desc.equals(cn.name)) {
                                selfNewInClinit = true;
                            }
                        }
                    }
                }
                for (FieldNode f : cn.fields) {
                    if ((f.access & Opcodes.ACC_STATIC) != 0 && f.desc.equals(arrDesc)) hasValuesArr = true;
                }

                // 父类是不是"枚举状"的（父类自己有 values()/valueOf 或父类父类是 Enum）
                String sup = cn.superName;
                boolean superIsEnumish = false;
                if (sup != null) {
                    List<ClassNode> sl = db.get(sup);
                    if (sl != null) {
                        for (ClassNode scn : sl) {
                            if ((scn.access & Opcodes.ACC_ENUM) != 0) { superIsEnumish = true; break; }
                        }
                    }
                }

                String kind;
                if (!"java/lang/Enum".equals(sup)) kind = "const-body-subclass";
                else if (hasValues && hasValueOf) kind = "real-enum";
                else if (enumSuperCall) kind = "enum-super-no-values";
                else kind = "fake-enum";

                w.println(cn.name + "\t" + sup + "\t" + hasValues + "\t" + hasValueOf + "\t" + hasValuesArr
                        + "\t" + selfNewInClinit + "\t" + enumSuperCall + "\t"
                        + String.join(",", ctors) + "\t" + superIsEnumish + "\t" + kind);
            }
        }
        w.close();
        System.out.println("ACC_ENUM classes = " + n);
    }
}
