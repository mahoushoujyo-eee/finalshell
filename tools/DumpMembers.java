import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * 导出 jar 里每个类的**声明成员**（字段名/方法名 + 描述符）。
 *
 * 用途：Registry 别名表消歧。Registry 的字段/方法描述符明文形如
 *   &lt;ownerKey:base36&gt; \\x08 &lt;成员名&gt; \\x08 &lt;typeKey:base36&gt;
 * owner 类一定声明了那个成员，所以可以用"候选类有没有这个成员、类型对不对"
 * 在同名候选里挑出唯一正确的那个。
 *
 * 用法: java -cp "<tools\bin>;<_lib\asm>" DumpMembers <in.jar> <out.tsv> [packagePrefix]
 * 输出: internalName \t memberName \t memberDescriptor \t kind(FIELD/METHOD)
 */
public class DumpMembers {
    public static void main(String[] args) throws Exception {
        String in = args[0], out = args[1];
        String prefix = args.length > 2 ? args[2] : "com/finalshell/";
        Jar jar = new Jar(in);
        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(new FileOutputStream(out), StandardCharsets.UTF_8))) {
            w.println("internalName\tmemberName\tdescriptor\tkind");
            for (Map.Entry<String, List<ClassNode>> e : jar.classNodes().entrySet()) {
                if (!e.getKey().startsWith(prefix)) continue;
                for (ClassNode cn : e.getValue()) {
                    for (FieldNode f : cn.fields) {
                        w.println(cn.name + "\t" + f.name + "\t" + f.desc + "\tFIELD");
                    }
                    for (MethodNode m : cn.methods) {
                        if (m.name.startsWith("<")) continue;   // 构造器/静态初始化不参与成员名匹配
                        w.println(cn.name + "\t" + m.name + "\t" + m.desc + "\tMETHOD");
                    }
                }
            }
        }
        System.out.println("wrote " + out);
    }
}
