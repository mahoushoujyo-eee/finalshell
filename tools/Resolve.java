import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * 运行时求解解密器输出。
 *
 * 每个类用独立 ClassLoader 从 jar 的确切条目定义，绕开同名/大小写碰撞；
 * 解密器方法从 harvest 表精确指定（owner + name + desc），不做启发式猜测。
 *
 * 失败一律写 FAIL —— 绝不把异常信息当明文写回源码
 * （旧方案因此污染了 85 个源文件）。
 */
public class Resolve {
    /** 内部名 -> class 字节。 */
    static final Map<String, byte[]> POOL = new HashMap<>();

    public static void main(String[] args) throws Exception {
        String jarPath = args[0];
        loadPool(jarPath);
        System.out.println("pool classes=" + POOL.size());
        int f1 = resolveTable(jarPath, args[1], args[2], true);
        int f2 = resolveTable(jarPath, args[3], args[4], false);
        System.out.println("string failures=" + f1 + "  number failures=" + f2);
    }

    static void loadPool(String jarPath) throws Exception {
        try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(jarPath)) {
            Enumeration<? extends java.util.zip.ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                java.util.zip.ZipEntry e = en.nextElement();
                if (!e.getName().endsWith(".class")) continue;
                byte[] b;
                try (InputStream in = zf.getInputStream(e)) { b = in.readAllBytes(); }
                String internal = Jar.internalName(b);
                // 反射 API 要的是二进制名（点分），不是 class 文件里的内部名（斜杠）
                if (internal != null) POOL.putIfAbsent(internal.replace('/', '.'), b);
            }
        }
    }

    static int resolveTable(String jarPath, String in, String out, boolean isString) throws Exception {
        Map<String, List<String[]>> byOwner = new LinkedHashMap<>();
        for (String[] r : readTsv(in)) {
            if (r.length < 5) continue;
            byOwner.computeIfAbsent(r[0] + "#" + r[1] + "#" + r[2], k -> new ArrayList<>()).add(r);
        }
        int fails = 0, done = 0;
        try (PrintWriter w = writer(out)) {
            w.println("owner\tname\tdesc\tn\tn2\tvalue");
            for (Map.Entry<String, List<String[]>> e : byOwner.entrySet()) {
                String[] key = e.getKey().split("#");
                String owner = key[0], mname = key[1], mdesc = key[2];
                List<String[]> rows = e.getValue();
                Method dec = findDecryptor(owner, mname, mdesc);
                for (String[] r : rows) {
                    String val = "FAIL";
                    if (dec != null) {
                        try {
                            Object arg2 = mdesc.startsWith("(IJ") ? (Object) Long.parseLong(r[4])
                                    : (Object) Integer.parseInt(r[4]);
                            Object v = dec.invoke(null, Integer.parseInt(r[3]), arg2);
                            val = v == null ? "null" : String.valueOf(v);
                        } catch (Throwable t) {
                            val = "FAIL";
                        }
                    }
                    if ("FAIL".equals(val)) fails++; else done++;
                    w.println(r[0] + "\t" + r[1] + "\t" + r[2] + "\t" + r[3] + "\t" + r[4]
                              + "\t" + val.replace("\t", " ").replace("\n", "\\n").replace("\r", "\\r"));
                }
                if (done % 5000 < rows.size()) {
                    System.out.println("  ... " + done + " decoded, " + fails + " failed");
                    w.flush();
                }
            }
        }
        System.out.println((isString ? "strings" : "numbers") + ": decoded=" + done + " failed=" + fails);
        return fails;
    }

    /** 精确定位解密器方法：owner 类 + name + **精确描述符**。
     *  同一个类里可能同时有 a(int,int)->String 和 a(int,long)->int，
     *  只按名字和参数个数挑会选错，必须匹配返回类型。 */
    static Method findDecryptor(String owner, String mname, String mdesc) {
        byte[] bytes = POOL.get(owner.replace('/', '.'));
        if (bytes == null) return null;
        String[] want = parseDesc(mdesc);       // [param1, param2, return]
        final Object[] result = new Object[1];
        Thread t = new Thread(() -> {
            try {
                Class<?> c = define(owner.replace('/', '.'), bytes);
                for (Method m : c.getDeclaredMethods()) {
                    if (!m.getName().equals(mname) || m.getParameterCount() != 2) continue;
                    Class<?>[] pt = m.getParameterTypes();
                    if (!kindOf(pt[0]).equals(want[0]) || !kindOf(pt[1]).equals(want[1])) continue;
                    if (!kindOf(m.getReturnType()).equals(want[2])) continue;
                    m.setAccessible(true);
                    result[0] = m;
                    return;
                }
            } catch (Throwable ex) {
                result[0] = ex;
            }
        }, "dec-" + owner);
        t.setDaemon(true);
        t.start();
        try { t.join(20000); } catch (InterruptedException ie) { }
        if (t.isAlive()) return null;
        return result[0] instanceof Method ? (Method) result[0] : null;
    }

    /** 描述符里的类型记号：基本类型用字母，其它用内部名。 */
    static String kindOf(Class<?> c) {
        if (c == int.class) return "I";
        if (c == long.class) return "J";
        if (c == boolean.class) return "Z";
        if (c == double.class) return "D";
        if (c == float.class) return "F";
        if (c == byte.class) return "B";
        if (c == short.class) return "S";
        if (c == char.class) return "C";
        if (c == void.class) return "V";
        return "L" + c.getName().replace('.', '/') + ";";
    }

    /** 解析方法描述符 -> [param1, param2, return]。 */
    static String[] parseDesc(String desc) {
        int close = desc.indexOf(')');
        String params = desc.substring(1, close);
        String ret = desc.substring(close + 1);
        List<String> ps = new ArrayList<>();
        int i = 0;
        while (i < params.length()) {
            char c = params.charAt(i);
            if (c == '[') {                       // 数组
                int j = i;
                while (j < params.length() && params.charAt(j) == '[') j++;
                int k = j;
                if (k < params.length() && params.charAt(k) == 'L') {
                    k = params.indexOf(';', k);
                } else {
                    k++;
                }
                ps.add(params.substring(i, k + 1));
                i = k + 1;
            } else if (c == 'L') {
                int j = params.indexOf(';', i);
                ps.add(params.substring(i, j + 1));
                i = j + 1;
            } else {
                ps.add(String.valueOf(c));
                i++;
            }
        }
        String[] out = new String[3];
        out[0] = ps.size() > 0 ? ps.get(0) : "?";
        out[1] = ps.size() > 1 ? ps.get(1) : "?";
        out[2] = ret;
        return out;
    }

    /** 从 jar 内存按内部名定义类，父加载器提供 JDK 类。 */
    static Class<?> define(String binaryName, byte[] bytes) throws Exception {
        final String internalName = binaryName;
        ClassLoader loader = new ClassLoader(ClassLoader.getSystemClassLoader()) {
            @Override protected Class<?> loadClass(String n, boolean resolve)
                    throws ClassNotFoundException {
                synchronized (getClassLoadingLock(n)) {
                    Class<?> c = findLoadedClass(n);
                    if (c == null) {
                        byte[] b = n.equals(internalName) ? bytes : POOL.get(n);
                        if (b != null) c = defineClass(n, b, 0, b.length);
                        else c = super.loadClass(n, false);
                    }
                    if (resolve) resolveClass(c);
                    return c;
                }
            }
        };
        return Class.forName(internalName, true, loader);
    }

    static List<String[]> readTsv(String path) throws IOException {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader r = Files.newBufferedReader(Paths.get(path), StandardCharsets.UTF_8)) {
            String line; boolean first = true;
            while ((line = r.readLine()) != null) {
                if (first) { first = false; continue; }
                if (line.isEmpty()) continue;
                rows.add(line.split("\t", -1));
            }
        }
        return rows;
    }

    static PrintWriter writer(String path) throws IOException {
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), StandardCharsets.UTF_8), 1 << 20));
    }
}
