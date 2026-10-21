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

        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(args[1]), StandardCharsets.UTF_8))) {
            w.println("internal\tsuper\tkind\tctors");
            for (Map.Entry<String, List<ClassNode>> e : db.entrySet()) {
                for (ClassNode cn : e.getValue()) {
                    boolean enumFlag = (cn.access & Opcodes.ACC_ENUM) != 0;
                    boolean hasSubs = !subs.getOrDefault(cn.name, Collections.emptyList()).isEmpty();
                    boolean enumSuper = "java/lang/Enum".equals(cn.superName);
                    String kind = (!enumFlag) ? "plain"
                            : (enumSuper && !hasSubs) ? "real" : "fake";
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
