import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * 导出类信息表，供源码修复器判断"真枚举"还是"混淆器伪造 ACC_ENUM 的普通类"。
 *
 * 判据：
 *   真枚举  = 有 ACC_ENUM 标志 且 继承 java/lang/Enum 且 没有子类
 *   假枚举  = 有 ACC_ENUM 标志但有子类，或继承的不是 java/lang/Enum
 * 假枚举在源码里必须写成 "class X extends Enum"（并补 compareTo 与 (String,int) 构造器），
 * 否则 javac 无法编译。
 *
 * 输出: internalName \t superName \t kind(real|fake) \t ctorDescs(空格分隔)
 */
public class ClassInfo {
    public static void main(String[] args) throws Exception {
        Jar jar = new Jar(args[0]);
        Map<String, List<ClassNode>> db = jar.classNodes();

        Map<String, List<String>> subs = new HashMap<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if (cn.superName != null) {
                    subs.computeIfAbsent(cn.superName, k -> new ArrayList<>()).add(cn.name);
                }
            }
        }

        // 哪些类被自己 new 出来过 —— 真枚举不可能被实例化，所以这是"假枚举"的硬判据。
        // 注意：字节码层已经把假枚举的 ACC_ENUM 清掉了，只看 ACC_ENUM 会把它们误判成
        // 普通类，于是源码里仍然渲染成 enum，javac 报 "enum types may not be instantiated"。
        Set<String> selfInst = new HashSet<>();
        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                for (org.objectweb.asm.tree.MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    for (org.objectweb.asm.tree.AbstractInsnNode in = m.instructions.getFirst();
                         in != null; in = in.getNext()) {
                        if (in instanceof org.objectweb.asm.tree.TypeInsnNode
                                && in.getOpcode() == Opcodes.NEW
                                && ((org.objectweb.asm.tree.TypeInsnNode) in).desc.equals(cn.name)) {
                            selfInst.add(cn.name);
                        }
                    }
                }
            }
        }

        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(args[1]), StandardCharsets.UTF_8))) {
            w.println("internal\tsuper\tkind\tctors");
            for (Map.Entry<String, List<ClassNode>> e : db.entrySet()) {
                for (ClassNode cn : e.getValue()) {
                    boolean enumFlag = (cn.access & Opcodes.ACC_ENUM) != 0;
                    boolean hasSubs = !subs.getOrDefault(cn.name, Collections.emptyList()).isEmpty();
                    boolean enumSuper = "java/lang/Enum".equals(cn.superName);
                    boolean self = selfInst.contains(cn.name);
                    String kind;
                    if (enumFlag) {
                        kind = (enumSuper && !hasSubs && !self) ? "real" : "fake";
                    } else if (enumSuper && (hasSubs || self)) {
                        kind = "fake";     // ACC_ENUM 已在字节码层清掉，但仍要按假枚举降级
                    } else {
                        kind = "plain";
                    }
                    List<String> ctors = new ArrayList<>();
                    for (org.objectweb.asm.tree.MethodNode m : cn.methods) {
                        if (m.name.equals("<init>")) ctors.add(m.desc);
                    }
                    w.println(cn.name + "\t" + (cn.superName == null ? "" : cn.superName)
                              + "\t" + kind + "\t" + String.join(" ", ctors));
                }
            }
        }
        System.out.println("classes=" + db.size() + " -> " + args[1]);
    }
}
