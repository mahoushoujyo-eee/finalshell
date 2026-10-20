import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * 用 ASM 读 jar 建类继承表（superName + interfaces），并用 JDK 反射补齐 JDK 类的继承关系。
 *
 * <p>用途：判断某个接收者的静态类型是不是声明类的子类，从而决定要不要加
 * {@code ((DeclClass) recv)} 转型。
 *
 * <p>用法：{@code java Hierarchy <jar> [outTsv]}
 */
public class Hierarchy {

    /** 内部名 -> 直接父类内部名。 */
    private final Map<String, String> supers = new HashMap<>();
    /** 内部名 -> 直接接口内部名集合。 */
    private final Map<String, Set<String>> ifaces = new HashMap<>();
    /** 来自 jar 的类集合（内部名，斜杠分隔）。 */
    private final Set<String> jarClasses = new HashSet<>();
    /** 反射解析失败的 JDK 类，缓存 null 结果避免反复尝试。 */
    private final Map<String, String[]> jdkCache = new HashMap<>();
    /** 内部名 -> 该类的方法签名列表 {name, paramCount, static?"1":"0", desc}。 */
    private final Map<String, List<String[]>> methodSigs = new HashMap<>();
    /** 内部名 + "#" + 字段名 -> 是否 static。 */
    private final Map<String, Boolean> fieldSigs = new HashMap<>();

    public int jarClassCount() { return jarClasses.size(); }

    /** 从 jar 里读全部 class 的继承信息与成员签名。 */
    public static Hierarchy fromJar(Path jar) throws IOException {
        Hierarchy h = new Hierarchy();
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            java.util.Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                if (!e.getName().endsWith(".class")) continue;
                try (InputStream in = zf.getInputStream(e)) {
                    byte[] bytes = in.readAllBytes();
                    ClassNode cn = new ClassNode();
                    new ClassReader(bytes).accept(cn,
                            ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    h.jarClasses.add(cn.name);
                    if (cn.superName != null) h.supers.putIfAbsent(cn.name, cn.superName);
                    if (cn.interfaces != null && !cn.interfaces.isEmpty()) {
                        h.ifaces.put(cn.name, new LinkedHashSet<>(cn.interfaces));
                    }
                    // 轻量再扫一遍，只收方法/字段签名（用 ClassVisitor，不建完整树）
                    final String owner = cn.name;
                    new ClassReader(bytes).accept(new ClassVisitor(Opcodes.ASM9) {
                        @Override public MethodVisitor visitMethod(int access, String name, String desc,
                                                                 String sig, String[] ex) {
                            int pc = paramCount(desc);
                            h.methodSigs.computeIfAbsent(owner, k -> new ArrayList<>())
                                    .add(new String[]{name, String.valueOf(pc),
                                            (access & Opcodes.ACC_STATIC) != 0 ? "1" : "0", desc});
                            return null;
                        }
                        @Override public FieldVisitor visitField(int access, String name, String desc,
                                                                String sig, Object value) {
                            h.fieldSigs.put(owner + "#" + name,
                                    (access & Opcodes.ACC_STATIC) != 0);
                            return null;
                        }
                    }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                } catch (Throwable ignored) {
                    // 单个损坏条目不影响整体
                }
            }
        }
        return h;
    }

    /** 从方法描述符里数参数个数。 */
    static int paramCount(String desc) {
        int i = desc.indexOf('(') + 1;
        int n = 0;
        while (i < desc.length() && desc.charAt(i) != ')') {
            char c = desc.charAt(i);
            if (c == 'L') { while (i < desc.length() && desc.charAt(i) != ';') i++; i++; }
            else if (c == '[') { i++; continue; }
            else i++;
            n++;
        }
        return n;
    }

    /**
     * 判断某个方法是否 static。desc 可为 null。
     * 返回 null 表示判断不出来。
     */
    public Boolean methodIsStatic(String internal, String name, int paramCount, String desc) {
        List<String[]> sigs = methodSigs.get(internal);
        if (sigs != null) {
            List<String[]> byName = new ArrayList<>();
            for (String[] s : sigs) if (s[0].equals(name)) byName.add(s);
            if (byName.size() == 1) return byName.get(0)[2].equals("1");
            if (desc != null) {
                for (String[] s : byName) if (s[3].equals(desc)) return s[2].equals("1");
            }
            for (String[] s : byName) if (Integer.parseInt(s[1]) == paramCount) return s[2].equals("1");
        }
        return jdkMemberIsStatic(internal, name, paramCount, true);
    }

    /** 判断某个字段是否 static；返回 null 表示判断不出来。 */
    public Boolean fieldIsStatic(String internal, String name) {
        Boolean b = fieldSigs.get(internal + "#" + name);
        if (b != null) return b;
        return jdkMemberIsStatic(internal, name, -1, false);
    }

    /** JDK 类用反射判断成员是否 static。 */
    private Boolean jdkMemberIsStatic(String internal, String name, int paramCount, boolean method) {
        if (jarClasses.contains(internal)) return null;
        try {
            Class<?> c = Class.forName(internal.replace('/', '.'), false,
                    ClassLoader.getSystemClassLoader());
            if (method) {
                for (java.lang.reflect.Method m : c.getDeclaredMethods()) {
                    if (m.getName().equals(name) && (paramCount < 0 || m.getParameterCount() == paramCount)) {
                        return java.lang.reflect.Modifier.isStatic(m.getModifiers());
                    }
                }
            } else {
                for (java.lang.reflect.Field f : c.getDeclaredFields()) {
                    if (f.getName().equals(name)) {
                        return java.lang.reflect.Modifier.isStatic(f.getModifiers());
                    }
                }
            }
        } catch (Throwable ignored) { }
        return null;
    }

    /** 该内部名是否来自被拆解的 jar。 */
    public boolean isJarClass(String internal) { return jarClasses.contains(internal); }

    /** 直接父类；JDK 类用反射补齐。 */
    public String superOf(String internal) {
        String s = supers.get(internal);
        if (s != null) return s;
        String[] j = jdkInfo(internal);
        return j == null ? null : j[0];
    }

    /** 直接接口集合。 */
    public Set<String> interfacesOf(String internal) {
        Set<String> s = ifaces.get(internal);
        if (s != null) return s;
        String[] j = jdkInfo(internal);
        if (j == null) return java.util.Collections.emptySet();
        Set<String> out = new LinkedHashSet<>();
        for (int i = 1; i < j.length; i++) out.add(j[i]);
        return out;
    }

    /** sub 是否是 sup 的子类（含自身）。 */
    public boolean isSubclass(String sub, String sup) {
        if (sub == null || sup == null) return false;
        if (sub.equals(sup)) return true;
        Set<String> seen = new HashSet<>();
        Deque<String> q = new ArrayDeque<>();
        q.add(sub);
        seen.add(sub);
        while (!q.isEmpty()) {
            String cur = q.poll();
            String sup2 = superOf(cur);
            if (sup2 != null && seen.add(sup2)) {
                if (sup2.equals(sup)) return true;
                q.add(sup2);
            }
            for (String i : interfacesOf(cur)) {
                if (seen.add(i)) {
                    if (i.equals(sup)) return true;
                    q.add(i);
                }
            }
        }
        return false;
    }

    /**
     * 反射取 JDK 类的父类 + 接口（内部名形式）。
     * 返回 {super, iface1, iface2, ...}；解析不了返回 null。
     */
    private String[] jdkInfo(String internal) {
        if (jdkCache.containsKey(internal)) return jdkCache.get(internal);
        String[] res = null;
        if (jarClasses.contains(internal)) {
            jdkCache.put(internal, null);
            return null;
        }
        try {
            Class<?> c = Class.forName(internal.replace('/', '.'), false,
                    ClassLoader.getSystemClassLoader());
            Class<?> sup = c.getSuperclass();
            List<String> parts = new ArrayList<>();
            parts.add(sup == null ? null : sup.getName().replace('.', '/'));
            for (Class<?> i : c.getInterfaces()) parts.add(i.getName().replace('.', '/'));
            res = parts.toArray(new String[0]);
        } catch (Throwable t) {
            res = null;
        }
        jdkCache.put(internal, res);
        return res;
    }

    // ------------------------------------------------------------------

    public static void main(String[] args) throws Exception {
        Hierarchy h = fromJar(Paths.get(args[0]));
        System.out.println("jarClasses=" + h.jarClassCount());
        if (args.length > 1) {
            List<String> lines = new ArrayList<>();
            lines.add("internal\tsuper\tinterfaces");
            List<String> names = new ArrayList<>(h.supers.keySet());
            java.util.Collections.sort(names);
            for (String n : names) {
                Set<String> ifs = h.interfacesOf(n);
                lines.add(n + "\t" + h.supers.get(n) + "\t" + String.join(",", ifs));
            }
            java.nio.file.Files.write(Paths.get(args[1]), lines,
                    java.nio.charset.StandardCharsets.UTF_8);
            System.out.println("wrote " + args[1]);
        }
    }
}
