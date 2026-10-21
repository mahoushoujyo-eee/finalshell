import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.util.*;

/**
 * 生成 {@code com/finalshell/reflect/RegistryAliases} 的字节码。
 *
 * <p>这个类是别名机制的载体：
 * <ul>
 *   <li>{@code MAP}：原始混淆名（二进制名） -&gt; 当前/改名后的二进制名。
 *       key 必须是 **Registry 里实际存着的那个字符串**，也就是混淆器打包前用的原始类名；
 *       混淆器把类名加密进 Registry 的静态数组，运行时解密后用
 *       {@code Class.forName(String)} 解析。</li>
 *   <li>{@code resolve(String)}：纯查表，不命中就原样返回。</li>
 *   <li>{@code forName(String)}：查表 -&gt; {@code Class.forName}；失败时把
 *       「旧名 -&gt; 新名」一起写进异常信息，避免线上排查时看不出到底哪个类没对上。</li>
 * </ul>
 *
 * <p>用 ASM 直接生成字节码，不依赖运行时是否有 javac。
 *
 * <p>注意：class 文件版本必须显式设成 52(Java8) 或更高，
 * 否则生成的 class 文件里 major version 是 0，JVM 和 Vineflower 都会读不了。
 * 同时要开 COMPUTE_FRAMES —— 程序化构造的 MethodNode 没有 StackMapTable，
 * 版本 &gt;= 50 的 class 文件缺了它会被校验器拒绝。
 */
public class AliasClass {

    public static final String INTERNAL = "com/finalshell/reflect/RegistryAliases";

    public static byte[] build(Map<String, String> aliasMap) {
        ClassNode cn = new ClassNode();
        cn.version = Opcodes.V1_8;      // 必须是合法版本号，否则生成的 class 读不出来
        cn.access = Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL | Opcodes.ACC_SUPER;
        cn.name = INTERNAL;
        cn.superName = "java/lang/Object";
        cn.sourceFile = "RegistryAliases.java";

        // private static final java.util.Map MAP
        cn.fields.add(new FieldNode(Opcodes.ACC_PRIVATE | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL,
                "MAP", "Ljava/util/Map;", null, null));
        // private static final int CAPACITY
        cn.fields.add(new FieldNode(Opcodes.ACC_PRIVATE | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL,
                "CAPACITY", "I", null, null));

        // ---------------- <clinit> ----------------
        MethodNode clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
        clinit.visitLdcInsn(Math.max(16, aliasMap.size() * 2));
        clinit.visitFieldInsn(Opcodes.PUTSTATIC, INTERNAL, "CAPACITY", "I");
        clinit.visitTypeInsn(Opcodes.NEW, "java/util/HashMap");
        clinit.visitInsn(Opcodes.DUP);
        clinit.visitFieldInsn(Opcodes.GETSTATIC, INTERNAL, "CAPACITY", "I");
        clinit.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
        clinit.visitInsn(Opcodes.DUP);
        clinit.visitFieldInsn(Opcodes.PUTSTATIC, INTERNAL, "MAP", "Ljava/util/Map;");
        List<String> keys = new ArrayList<>(aliasMap.keySet());
        Collections.sort(keys);   // 稳定输出，便于比对
        for (String k : keys) {
            clinit.visitLdcInsn(k);
            clinit.visitLdcInsn(aliasMap.get(k));
            clinit.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Map", "put",
                    "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
            clinit.visitInsn(Opcodes.POP);
        }
        clinit.visitInsn(Opcodes.RETURN);
        clinit.visitMaxs(0, 0);
        cn.methods.add(clinit);

        // ---------------- public static String resolve(String) ----------------
        // 用 Map.getOrDefault 而不是 ifnull 分支：分支会引出 StackMapTable，
        // 而 getOrDefault 是 Java 8 的接口默认方法，版本 52 直接支持。
        MethodNode resolve = new MethodNode(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                "resolve", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
        resolve.visitFieldInsn(Opcodes.GETSTATIC, INTERNAL, "MAP", "Ljava/util/Map;");
        resolve.visitVarInsn(Opcodes.ALOAD, 0);
        resolve.visitVarInsn(Opcodes.ALOAD, 0);
        resolve.visitMethodInsn(Opcodes.INVOKEINTERFACE, "java/util/Map", "getOrDefault",
                "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
        resolve.visitTypeInsn(Opcodes.CHECKCAST, "java/lang/String");
        resolve.visitInsn(Opcodes.ARETURN);
        resolve.visitMaxs(0, 0);
        cn.methods.add(resolve);

        // ---------------- public static Class forName(String) ----------------
        MethodNode forName = new MethodNode(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                "forName", "(Ljava/lang/String;)Ljava/lang/Class;",
                null, new String[]{"java/lang/ClassNotFoundException"});
        Label tryStart = new Label();
        Label tryEnd = new Label();
        Label handler = new Label();
        forName.visitTryCatchBlock(tryStart, tryEnd, handler, "java/lang/ClassNotFoundException");
        // 注意：astore 1 必须在 try 块**外面**。
        // 异常处理表里只有 [tryStart, tryEnd) 受保护，若 astore 在块内，
        // handler 处的局部变量 1 是 top，校验器直接报 VerifyError。
        forName.visitVarInsn(Opcodes.ALOAD, 0);
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, INTERNAL, "resolve", "(Ljava/lang/String;)Ljava/lang/String;", false);
        forName.visitVarInsn(Opcodes.ASTORE, 1);
        forName.visitLabel(tryStart);
        forName.visitVarInsn(Opcodes.ALOAD, 1);
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Class", "forName",
                "(Ljava/lang/String;)Ljava/lang/Class;", false);
        forName.visitInsn(Opcodes.ARETURN);
        forName.visitLabel(tryEnd);
        forName.visitLabel(handler);
        // new ClassNotFoundException("registry alias: old -> new not found")
        forName.visitTypeInsn(Opcodes.NEW, "java/lang/ClassNotFoundException");
        forName.visitInsn(Opcodes.DUP);
        forName.visitLdcInsn("registry alias: ");
        forName.visitVarInsn(Opcodes.ALOAD, 0);
        forName.visitLdcInsn(" -> ");
        forName.visitVarInsn(Opcodes.ALOAD, 1);
        forName.visitLdcInsn(" not found");
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/StringBuilder", "append",
                "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/StringBuilder", "append",
                "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/StringBuilder", "append",
                "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/StringBuilder", "append",
                "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/StringBuilder", "append",
                "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
        forName.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/StringBuilder", "toString",
                "()Ljava/lang/String;", false);
        forName.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/ClassNotFoundException", "<init>",
                "(Ljava/lang/String;)V", false);
        forName.visitInsn(Opcodes.ATHROW);
        forName.visitMaxs(0, 0);
        cn.methods.add(forName);

        // ---------------- private <init>() ----------------
        MethodNode ctor = new MethodNode(Opcodes.ACC_PRIVATE, "<init>", "()V", null, null);
        ctor.visitVarInsn(Opcodes.ALOAD, 0);
        ctor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        ctor.visitInsn(Opcodes.RETURN);
        ctor.visitMaxs(0, 0);
        cn.methods.add(ctor);

        // COMPUTE_FRAMES：程序化构造的 MethodNode 没有 StackMapTable
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
            @Override protected String getCommonSuperClass(String type1, String type2) {
                return "java/lang/Object";
            }
        };
        cn.accept(cw);
        byte[] out = cw.toByteArray();

        // 自检：生成的字节码必须能被 ClassReader 读回来
        try {
            new ClassReader(out).accept(new ClassNode(), 0);
        } catch (Throwable t) {
            throw new IllegalStateException("generated RegistryAliases.class is not readable: " + t, t);
        }
        return out;
    }
}
