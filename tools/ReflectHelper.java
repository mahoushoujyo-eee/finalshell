import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.util.*;

/**
 * 把 com.c 的反射调用改写成"辅助方法"形态。
 *
 * 背景：混淆器把普通调用改写成
 *     Method m = com.c.d(key);            // 按 key 从注册表取 Method
 *     m.invoke(target, argsPack);         // argsPack 是 com.c.a(...) 打包出来的 Object[]
 * 反编译器（Vineflower）面对这一串 swap/dup 指令时会把同一个局部变量槽
 * 同时当成 Method 和 Object[] 用，于是生成
 *     var53 = (Object[])var29;   // 编译不过：Method 不能转成 Object[]
 *     var29 = var10000;          // 编译不过：Object[] 不能转成 Method
 * 这类错误占了全部编译错误的近八成。
 *
 * 做法：在字节码层把
 *     [argsPack] [target] ldc key; com.c.d(key); <栈调整>; Method.invoke(...)
 * 折叠成一次辅助调用（辅助类 com.finalshell.reflect.Ref 是手写的，见 Ref.java）
 *     Ref.h(key, target, args)     /     Ref.h2(key, args)
 * 辅助方法内部仍用反射，运行时行为完全不变；调用点不再出现 Method 类型，
 * 局部变量槽的类型冲突随之消失。
 *
 * 字节码实测只有两种模式（8,523 + 2,168 处），见 ReflectProbe。
 *
 * 注意栈序：JVM 静态调用的参数是逆序压栈的，描述符里第一个参数在栈顶。
 * 模式 A 去掉 com.c.d 之后栈是 [args, target, key]（底->顶），
 * 对应签名 (key, target, args)。
 */
public class ReflectHelper {

    static final String C = "com/Registry";
    static final String M = "java/lang/reflect/Method";
    static final String F = "java/lang/reflect/Field";
    static final String REF = "com/finalshell/reflect/Ref";
    static final String INVOKE_DESC = "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;";

    static int nInvokeA = 0, nInvokeB = 0, nFieldSet = 0, nFieldGet = 0, nMiss = 0;
    static int rejNoPattern = 0, rejNoInvoke = 0, rejBadInvoke = 0, rejNoKey = 0, rejShort = 0;

    public static void main(String[] args) throws Exception {
        String in = args[0], out = args[1];
        Jar jar = new Jar(in);
        Map<String, List<ClassNode>> db = jar.classNodes();

        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                // 注册表自身不改（它在 pass 1 里已由 com/c 改名为 com/Registry）
                if (cn.name.equals(C) || cn.name.equals("com/Registry")) continue;
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    rewrite(m);
                }
            }
        }
        System.out.println("invoke(patternA)=" + nInvokeA + "  invoke(patternB)=" + nInvokeB
                + "  field.set=" + nFieldSet + "  field.get=" + nFieldGet + "  unmatched=" + nMiss);
        System.out.println("  reject: noPattern=" + rejNoPattern + " noInvoke=" + rejNoInvoke
                + " badInvoke=" + rejBadInvoke + " noKey=" + rejNoKey + " short=" + rejShort);

        try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(in);
             java.util.zip.ZipOutputStream zo = new java.util.zip.ZipOutputStream(
                     new BufferedOutputStream(new FileOutputStream(out)))) {
            java.util.Enumeration<? extends java.util.zip.ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                java.util.zip.ZipEntry e = en.nextElement();
                byte[] data;
                try (InputStream is = zf.getInputStream(e)) { data = is.readAllBytes(); }
                String name = e.getName();
                if (name.endsWith(".class")) {
                    ClassReader cr = new ClassReader(data);
                    ClassNode cn = new ClassNode();
                    cr.accept(cn, 0);
                    List<ClassNode> cands = db.get(cn.name);
                    if (cands != null && !cands.isEmpty()) {
                        ClassWriter cw = new ClassWriter(0);
                        cands.get(0).accept(cw);
                        data = cw.toByteArray();
                    }
                }
                java.util.zip.ZipEntry ne = new java.util.zip.ZipEntry(name);
                ne.setTime(e.getTime());
                zo.putNextEntry(ne);
                zo.write(data);
                zo.closeEntry();
            }
        }
        System.out.println("wrote " + out + "  size=" + new File(out).length());
    }

    static void rewrite(MethodNode m) {
        boolean again = true;
        int guard = 0;
        while (again && guard++ < 500) {
            again = false;
            // 只保留真正的指令（跳过 LabelNode / LineNumberNode / FrameNode，
            // 它们夹在栈调整指令和 invoke 之间会打断模式匹配）
            List<AbstractInsnNode> insns = new ArrayList<>();
            for (AbstractInsnNode i = m.instructions.getFirst(); i != null; i = i.getNext()) {
                if (i.getOpcode() >= 0) insns.add(i);
            }
            for (int idx = 1; idx < insns.size(); idx++) {
                AbstractInsnNode in = insns.get(idx);
                if (!(in instanceof MethodInsnNode)) continue;
                MethodInsnNode mi = (MethodInsnNode) in;
                // 按描述符匹配，不按方法名 —— dup 改名后名字会变成 d$Method 之类
                if (mi.owner.equals(C) && mi.desc.equals("(J)Ljava/lang/reflect/Method;")) {
                    if (tryInvoke(m, insns, idx)) { again = true; break; }
                } else if (mi.owner.equals(C) && mi.desc.equals("(J)Ljava/lang/reflect/Field;")) {
                    if (tryField(m, insns, idx)) { again = true; break; }
                }
            }
        }
    }

    static boolean tryInvoke(MethodNode m, List<AbstractInsnNode> insns, int idx) {
        int p = idx + 1;
        if (p + 1 >= insns.size()) { rejShort++; return false; }
        AbstractInsnNode a = insns.get(p), b = insns.get(p + 1);

        boolean patternA = a.getOpcode() == Opcodes.DUP_X2 && b.getOpcode() == Opcodes.POP;
        boolean patternB = a.getOpcode() == Opcodes.SWAP && b.getOpcode() == Opcodes.ACONST_NULL;
        int invokeAt;
        if (patternA) {
            invokeAt = p + 2;                 // dup_x2 pop ; invoke
        } else if (patternB) {
            if (p + 2 >= insns.size()) { rejShort++; return false; }
            if (insns.get(p + 2).getOpcode() != Opcodes.SWAP) { rejNoPattern++; return false; }
            invokeAt = p + 3;                 // swap aconst_null swap ; invoke
        } else { rejNoPattern++; return false; }

        if (invokeAt >= insns.size()) { rejShort++; return false; }
        AbstractInsnNode inv = insns.get(invokeAt);
        if (!(inv instanceof MethodInsnNode)) { rejNoInvoke++; return false; }
        MethodInsnNode imi = (MethodInsnNode) inv;
        if (!imi.owner.equals(M) || !imi.name.equals("invoke") || !imi.desc.equals(INVOKE_DESC)) {
            rejBadInvoke++;
            return false;
        }

        // key 必须在栈上：com.c.d 之前紧邻的 LDC(long)
        AbstractInsnNode keyInsn = insns.get(idx - 1);
        if (!(keyInsn instanceof LdcInsnNode)
                || !(((LdcInsnNode) keyInsn).cst instanceof Long)) {
            rejNoKey++;
            nMiss++;
            return false;
        }

        // 模式 A 去掉 com.c.d 后栈是 [args, target, key] -> 签名 (key, target, args)
        // 模式 B 去掉 com.c.d 后栈是 [args, key]         -> 签名 (key, args)
        String helper, hdesc;
        if (patternA) {
            helper = "h";
            hdesc = "(JLjava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;";
        } else {
            helper = "h2";
            hdesc = "(JLjava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;";
        }

        InsnList repl = new InsnList();
        repl.add(new MethodInsnNode(Opcodes.INVOKESTATIC, REF, helper, hdesc, false));

        // 顺序很重要：先插入替换指令，再删旧指令。
        // 反过来做的话，insertBefore 的锚点已经被摘掉，指令链会断。
        m.instructions.insertBefore(insns.get(p), repl);
        m.instructions.remove(insns.get(idx));          // 移除 com.c.d 查找（key 保留在栈上）
        for (int k = p; k <= invokeAt; k++) m.instructions.remove(insns.get(k));
        if (patternA) nInvokeA++; else nInvokeB++;
        return true;
    }

    static boolean tryField(MethodNode m, List<AbstractInsnNode> insns, int idx) {
        int p = idx + 1;
        if (p >= insns.size()) return false;
        AbstractInsnNode a = insns.get(p);
        String helper, hdesc;
        int endIdx;
        if (a.getOpcode() == Opcodes.DUP_X2) {
            if (p + 2 >= insns.size()) return false;
            if (insns.get(p + 1).getOpcode() != Opcodes.POP) return false;
            if (!(insns.get(p + 2) instanceof MethodInsnNode)) return false;
            MethodInsnNode mi = (MethodInsnNode) insns.get(p + 2);
            if (!mi.owner.equals(F) || !mi.name.equals("set")) return false;
            // 去掉 com.c.d 后栈是 [obj, val, key] -> 签名 (key, obj, val)
            helper = "s"; hdesc = "(JLjava/lang/Object;Ljava/lang/Object;)V"; endIdx = p + 2;
        } else if (a.getOpcode() == Opcodes.SWAP) {
            if (p + 1 >= insns.size()) return false;
            if (!(insns.get(p + 1) instanceof MethodInsnNode)) return false;
            MethodInsnNode mi = (MethodInsnNode) insns.get(p + 1);
            if (!mi.owner.equals(F) || !mi.name.equals("get")) return false;
            // 去掉 com.c.d 后栈是 [obj, key] -> 签名 (key, obj)
            helper = "g"; hdesc = "(JLjava/lang/Object;)Ljava/lang/Object;"; endIdx = p + 1;
        } else return false;

        AbstractInsnNode keyInsn = insns.get(idx - 1);
        if (!(keyInsn instanceof LdcInsnNode)
                || !(((LdcInsnNode) keyInsn).cst instanceof Long)) {
            nMiss++;
            return false;
        }
        InsnList repl = new InsnList();
        repl.add(new MethodInsnNode(Opcodes.INVOKESTATIC, REF, helper, hdesc, false));

        m.instructions.insertBefore(insns.get(p), repl);
        m.instructions.remove(insns.get(idx));
        for (int k = p; k <= endIdx; k++) m.instructions.remove(insns.get(k));
        if (helper.equals("s")) nFieldSet++; else nFieldGet++;
        return true;
    }
}
