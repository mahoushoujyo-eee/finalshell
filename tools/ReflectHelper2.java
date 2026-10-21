import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.util.*;

/**
 * 把 com.c 的反射调用改写成"辅助方法"形态。
 *
 * 背景：混淆器把普通调用改写成
 *     Method m = com.c.d(key);            // 按 key 从注册表取 Method
 *     Object r = m.invoke(target, args);  // args 是 com.c.a(...) 打包出来的 Object[]
 * 反编译器（Vineflower）面对这串 swap/dup 栈调整指令时，会把同一个局部变量槽
 * 同时当成 Method 和 Object[] 用，于是生成
 *     var53 = (Object[])var29;   // 编译不过：Method 不能转成 Object[]
 *     var29 = var10000;          // 编译不过：Object[] 不能转成 Method
 * 这类错误占了全部编译错误的近八成。
 *
 * 做法：字节码层把整条序列折叠成一次辅助调用（辅助类 com.finalshell.reflect.Ref
 * 是手写的）。运行时行为完全不变。
 *
 * **关键**：栈上几个值的角色不用猜 —— 被调用方法的描述符已经说明了谁是接收者、
 * 谁是实参数组：
 *     Method.invoke(Object target, Object[] args)  -> 浅的是 target，深的是 args
 *     Field.set(Object obj, Object val)           -> 浅的是 obj，深的是 val
 *     Field.get(Object obj)                       -> 只有一个值，是 obj
 * 改写手法：把栈上的值搬进局部变量，再按确定的顺序重新压栈调用辅助方法。
 *
 * （早先一版靠手推栈序 + ASM Analyzer 定位，Analyzer 在混淆后的不可约控制流上
 *  会对 16,517 个方法抛异常；而且手推的顺序把上千处调用写反了，
 *  生成的 class 过不了 JVM 校验。）
 */
public class ReflectHelper2 {

    static final String C = "com/Registry";
    static final String M = "java/lang/reflect/Method";
    static final String F = "java/lang/reflect/Field";
    static final String REF = "com/finalshell/reflect/Ref";
    static final String INVOKE_DESC = "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;";

    static int nInvoke = 0, nFieldSet = 0, nFieldGet = 0, nNoKey = 0, nBadPattern = 0;

    public static void main(String[] args) throws Exception {
        String in = args[0], out = args[1];
        Jar jar = new Jar(in);
        Map<String, List<ClassNode>> db = jar.classNodes();

        for (List<ClassNode> l : db.values()) {
            for (ClassNode cn : l) {
                if (cn.name.equals(C) || cn.name.equals("com/Registry")) continue;
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    rewrite(m);
                }
            }
        }
        System.out.println("invoke=" + nInvoke + "  field.set=" + nFieldSet + "  field.get=" + nFieldGet
                + "  noKey=" + nNoKey + "  badPattern=" + nBadPattern);

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
            List<AbstractInsnNode> insns = new ArrayList<>();
            for (AbstractInsnNode i = m.instructions.getFirst(); i != null; i = i.getNext()) {
                if (i.getOpcode() >= 0) insns.add(i);
            }
            for (int idx = 1; idx < insns.size(); idx++) {
                AbstractInsnNode in = insns.get(idx);
                if (!(in instanceof MethodInsnNode)) continue;
                MethodInsnNode mi = (MethodInsnNode) in;
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
        if (p + 1 >= insns.size()) return false;
        AbstractInsnNode a = insns.get(p), b = insns.get(p + 1);
        boolean patternA = a.getOpcode() == Opcodes.DUP_X2 && b.getOpcode() == Opcodes.POP;
        boolean patternB = a.getOpcode() == Opcodes.SWAP && b.getOpcode() == Opcodes.ACONST_NULL;
        int invokeAt;
        if (patternA) invokeAt = p + 2;
        else if (patternB) {
            if (p + 2 >= insns.size() || insns.get(p + 2).getOpcode() != Opcodes.SWAP) { nBadPattern++; return false; }
            invokeAt = p + 3;
        } else { nBadPattern++; return false; }
        if (invokeAt >= insns.size()) return false;
        AbstractInsnNode inv = insns.get(invokeAt);
        if (!(inv instanceof MethodInsnNode)) return false;
        MethodInsnNode imi = (MethodInsnNode) inv;
        if (!imi.owner.equals(M) || !imi.name.equals("invoke") || !imi.desc.equals(INVOKE_DESC)) {
            nBadPattern++;
            return false;
        }
        AbstractInsnNode keyInsn = insns.get(idx - 1);
        if (!(keyInsn instanceof LdcInsnNode) || !(((LdcInsnNode) keyInsn).cst instanceof Long)) {
            nNoKey++;
            return false;
        }
        long key = (Long) ((LdcInsnNode) keyInsn).cst;

        int t1 = m.maxLocals;
        int t2 = m.maxLocals + 1;
        m.maxLocals += 2;

        InsnList repl = new InsnList();
        if (patternA) {
            // 栈（底->顶）= [args, target]；invoke 的 arg1=target(浅)，arg2=args(深)
            repl.add(new VarInsnNode(Opcodes.ASTORE, t2));   // target -> t2
            repl.add(new VarInsnNode(Opcodes.ASTORE, t1));   // args   -> t1
            repl.add(new LdcInsnNode(key));
            // 辅助方法 h(Object target, Object args, long key)：栈(底->顶) 必须是 [key, args, target]
            repl.add(new VarInsnNode(Opcodes.ALOAD, t1));    // args
            repl.add(new VarInsnNode(Opcodes.ALOAD, t2));    // target
            repl.add(new MethodInsnNode(Opcodes.INVOKESTATIC, REF, "h",
                    "(Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;", false));
        } else {
            // 静态方法：栈 = [args]，接收者是 null
            repl.add(new VarInsnNode(Opcodes.ASTORE, t1));   // args -> t1
            repl.add(new LdcInsnNode(key));
            repl.add(new VarInsnNode(Opcodes.ALOAD, t1));    // args
            repl.add(new MethodInsnNode(Opcodes.INVOKESTATIC, REF, "h2",
                    "([Ljava/lang/Object;J)Ljava/lang/Object;", false));
        }

        m.instructions.insertBefore(insns.get(p), repl);
        m.instructions.remove(insns.get(idx));
        for (int k = p; k <= invokeAt; k++) m.instructions.remove(insns.get(k));
        nInvoke++;
        return true;
    }

    static boolean tryField(MethodNode m, List<AbstractInsnNode> insns, int idx) {
        int p = idx + 1;
        if (p >= insns.size()) return false;
        AbstractInsnNode a = insns.get(p);
        String helper;
        int endIdx;
        boolean isSet;
        if (a.getOpcode() == Opcodes.DUP_X2) {
            if (p + 2 >= insns.size() || insns.get(p + 1).getOpcode() != Opcodes.POP) return false;
            if (!(insns.get(p + 2) instanceof MethodInsnNode)) return false;
            MethodInsnNode mi = (MethodInsnNode) insns.get(p + 2);
            if (!mi.owner.equals(F) || !mi.name.equals("set")) { nBadPattern++; return false; }
            helper = "s"; isSet = true; endIdx = p + 2;
        } else if (a.getOpcode() == Opcodes.SWAP) {
            if (p + 1 >= insns.size() || !(insns.get(p + 1) instanceof MethodInsnNode)) return false;
            MethodInsnNode mi = (MethodInsnNode) insns.get(p + 1);
            if (!mi.owner.equals(F) || !mi.name.equals("get")) { nBadPattern++; return false; }
            helper = "g"; isSet = false; endIdx = p + 1;
        } else { nBadPattern++; return false; }

        AbstractInsnNode keyInsn = insns.get(idx - 1);
        if (!(keyInsn instanceof LdcInsnNode) || !(((LdcInsnNode) keyInsn).cst instanceof Long)) {
            nNoKey++;
            return false;
        }
        long key = (Long) ((LdcInsnNode) keyInsn).cst;

        int t1 = m.maxLocals;
        int t2 = m.maxLocals + 1;
        m.maxLocals += 2;

        InsnList repl = new InsnList();
        if (isSet) {
            // Field.set(Object obj, Object val)：栈(底->顶) = [obj, val]，arg1=obj(浅)，arg2=val(深)
            repl.add(new VarInsnNode(Opcodes.ASTORE, t2));   // obj -> t2
            repl.add(new VarInsnNode(Opcodes.ASTORE, t1));   // val -> t1
            repl.add(new LdcInsnNode(key));
            // s(Object obj, Object val, long key)：栈(底->顶) = [key, val, obj]
            repl.add(new VarInsnNode(Opcodes.ALOAD, t1));    // val
            repl.add(new VarInsnNode(Opcodes.ALOAD, t2));    // obj
            repl.add(new MethodInsnNode(Opcodes.INVOKESTATIC, REF, helper,
                    "(Ljava/lang/Object;Ljava/lang/Object;J)V", false));
        } else {
            // Field.get(Object obj)：栈 = [obj]
            repl.add(new VarInsnNode(Opcodes.ASTORE, t1));   // obj -> t1
            repl.add(new LdcInsnNode(key));
            repl.add(new VarInsnNode(Opcodes.ALOAD, t1));    // obj
            repl.add(new MethodInsnNode(Opcodes.INVOKESTATIC, REF, helper,
                    "(JLjava/lang/Object;)Ljava/lang/Object;", false));
        }

        m.instructions.insertBefore(insns.get(p), repl);
        m.instructions.remove(insns.get(idx));
        for (int k = p; k <= endIdx; k++) m.instructions.remove(insns.get(k));
        if (isSet) nFieldSet++; else nFieldGet++;
        return true;
    }
}
