import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * Probe: can the reflective-call table in com.c be decoded statically?
 *
 * com.c holds, for every reflective call site in the app, a descriptor string
 * addressed by a long key.  Structure recovered from the decompile:
 *
 *   index(key) = (int)(key >>> 46)          // when b[index] != null
 *   b[]        = descriptor strings
 *   a[]        = class-name strings (for class entries) / cache slot
 *
 * Descriptor grammar (delimiter = \b, char 8):
 *   method: <declClassKey36> \b <methodName> \b <paramKey36> ... <returnKey36>
 *   field : <declClassKey36> \b <fieldName>  \b <typeKey36>
 * where a "classKey" is itself a long that addresses a class entry.
 *
 * Usage: java ProbeReflect <jar> <sourceDir> [out.tsv]
 */
public class ProbeReflect {
    static final char DELIM = 8;

    public static void main(String[] args) throws Exception {
        Path jar = Paths.get(args[0]);
        Path srcDir = Paths.get(args[1]);
        boolean toFile = args.length > 2;
        PrintWriter out = toFile
                ? new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(args[2])), StandardCharsets.UTF_8))
                : new PrintWriter(System.out);

        Class<?> c = loadComC(jar);
        for (Field f : c.getDeclaredFields()) {
            f.setAccessible(true);
            Object v = f.get(null);
            String desc = (v instanceof Object[]) ? "Object[" + ((Object[]) v).length + "]"
                    : (v instanceof String[]) ? "String[" + ((String[]) v).length + "]"
                    : String.valueOf(v);
            System.out.println("FIELD " + f.getType().getSimpleName() + " " + f.getName() + " = " + desc);
        }
        Field fa = c.getDeclaredField("a");
        Field fb = c.getDeclaredField("b");
        fa.setAccessible(true); fb.setAccessible(true);
        Object[] A = (Object[]) fa.get(null);
        String[] B = (String[]) fb.get(null);
        Field fc = c.getDeclaredField("c"); fc.setAccessible(true);
        Field fd = c.getDeclaredField("d"); fd.setAccessible(true);
        String[] C = (String[]) fc.get(null);
        String[] D = (String[]) fd.get(null);
        for (String[] arr : new String[][] { C, D }) {
            int nn = 0; for (String s : arr) if (s != null) nn++;
            System.out.println("--- array len=" + arr.length + " nonNull=" + nn + " ---");
            for (int i = 0; i < Math.min(8, arr.length); i++) {
                System.out.println("   [" + i + "] = " + esc(String.valueOf(arr[i])));
            }
        }
        System.out.println("--- com.c methods ---");
        for (Method m : c.getDeclaredMethods()) {
            if (m.getParameterCount() == 1 && m.getParameterTypes()[0] == long.class) {
                System.out.println("   " + Modifier.toString(m.getModifiers()) + " " + m.getName() + "(long) -> " + m.getReturnType().getSimpleName());
            }
        }

        int aString = 0, bNonNull = 0, bothString = 0, aNull = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] instanceof String) aString++;
            else if (A[i] == null) aNull++;
            if (B[i] != null) { bNonNull++; if (A[i] instanceof String) bothString++; }
        }
        System.out.println("A.length=" + A.length + " B.length=" + B.length);
        System.out.println("a[]: String=" + aString + " null=" + aNull
                + " | b[] nonNull=" + bNonNull + " (bothString=" + bothString + ")");
        System.out.println("--- sample a[] entries ---");
        for (int i = 0; i < 12; i++) {
            System.out.println("  a[" + i + "] = " + esc(String.valueOf(A[i]))
                    + "   b[" + i + "]=" + esc(String.valueOf(B[i])));
        }
        System.out.println("--- sample descriptors (a[] containing \\b) ---");
        int shown = 0;
        for (int i = 0; i < A.length && shown < 8; i++) {
            if (A[i] instanceof String && ((String) A[i]).indexOf(DELIM) > 0) {
                System.out.println("  a[" + i + "] = " + esc((String) A[i]));
                shown++;
            }
        }

        // harvest keys from source
        Pattern p = Pattern.compile("(?:com\\.)?c\\.([dc])\\((-?\\d+)L\\)");
        Map<String, Set<Long>> keys = new TreeMap<>();
        int files = 0;
        try (java.util.stream.Stream<Path> st = Files.walk(srcDir)) {
            for (Path p2 : (Iterable<Path>) st.filter(x -> x.toString().endsWith(".java"))::iterator) {
                files++;
                String txt = new String(Files.readAllBytes(p2), StandardCharsets.UTF_8);
                Matcher m = p.matcher(txt);
                while (m.find()) {
                    keys.computeIfAbsent(m.group(1), z -> new TreeSet<>()).add(Long.parseLong(m.group(2)));
                }
            }
        }
        System.out.println("--- harvest ---");
        System.out.println("files=" + files + " distinct methodKeys=" + keys.getOrDefault("d", Collections.emptySet()).size()
                + " distinct fieldKeys=" + keys.getOrDefault("c", Collections.emptySet()).size());

        // resolve: ask the class itself what the key points at (ground truth)
        Method aLong = c.getDeclaredMethod("a", long.class);
        aLong.setAccessible(true);
        A_LONG = aLong;
        Method dLong = c.getDeclaredMethod("d", long.class);
        Method cLong = c.getDeclaredMethod("c", long.class);
        int okM = 0, okF = 0, bad = 0, noobj = 0;
        for (Map.Entry<String, Set<Long>> e : keys.entrySet()) {
            String kind = e.getKey();
            for (long key : e.getValue()) {
                int idx;
                try {
                    idx = (Integer) aLong.invoke(null, key);
                } catch (Throwable t) { bad++; continue; }
                String desc = (idx >= 0 && idx < B.length && B[idx] != null) ? B[idx] : "";
                String resolved = null;
                if (VERIFY_RUNTIME) {
                    try {
                        Object o = kind.equals("d") ? dLong.invoke(null, key) : cLong.invoke(null, key);
                        if (o instanceof Method) {
                            Method m = (Method) o;
                            StringBuilder sb = new StringBuilder();
                            sb.append("METHOD ").append(m.getDeclaringClass().getName()).append('#').append(m.getName()).append('(');
                            Class<?>[] ps = m.getParameterTypes();
                            for (int i = 0; i < ps.length; i++) {
                                if (i > 0) sb.append(", ");
                                sb.append(ps[i].getName());
                            }
                            sb.append(") : ").append(m.getReturnType().getName());
                            resolved = sb.toString();
                        } else if (o instanceof Field) {
                            Field f = (Field) o;
                            resolved = "FIELD " + f.getDeclaringClass().getName() + "#" + f.getName()
                                    + " : " + f.getType().getName();
                        }
                    } catch (Throwable t) { noobj++; }
                }
                if (resolved == null) {
                    // fall back to parsing the raw descriptor
                    resolved = resolve(desc, kind, A, B);
                }
                if (resolved == null) { bad++; continue; }
                if (kind.equals("d")) okM++; else okF++;
                if (toFile) {
                    out.println(kind + "\t" + key + "\t" + idx + "\t" + resolved + "\t" + esc(desc));
                } else if (okM + okF <= 15) {
                    System.out.println("  " + kind + " " + key + " -> " + resolved);
                }
            }
        }
        System.out.println("noobj=" + noobj);
        System.out.println("--- resolve ---");
        System.out.println("methods resolved=" + okM + " fields resolved=" + okF + " unresolved=" + bad);
        out.flush();
        out.close();
    }

    /** Resolve a descriptor into human form. kind: "d" = method, "c" = field.
     *  method: classKey \b name \b paramKey... \b returnKey \b   (trailing \b -> empty tail)
     *  field : classKey \b name \b typeKey \b                     */
    static String resolve(String desc, String kind, Object[] A, String[] B) {
        String[] parts = desc.split(String.valueOf(DELIM), -1);
        if (parts.length < 3) return null;
        String declClass = className(parts[0], A, B);
        if (declClass == null) return null;
        if (kind.equals("c")) {
            String type = className(parts[2], A, B);
            if (type == null) return null;
            return "FIELD " + declClass + "#" + parts[1] + " : " + type;
        }
        int paramCount = parts.length - 4;
        if (paramCount < 0) return null;
        StringBuilder sb = new StringBuilder();
        sb.append("METHOD ").append(declClass).append('#').append(parts[1]).append('(');
        for (int i = 0; i < paramCount; i++) {
            if (i > 0) sb.append(", ");
            String t = className(parts[2 + i], A, B);
            if (t == null) return null;
            sb.append(t);
        }
        sb.append(") : ").append(className(parts[parts.length - 2], A, B));
        return sb.toString();
    }

    /** A class key is a base36 long that addresses a class entry (needs the same lazy decrypt). */
    static String className(String base36, Object[] A, String[] B) {
        long k;
        try { k = Long.parseLong(base36, 36); } catch (Exception e) { return null; }
        int idx;
        try {
            idx = (Integer) A_LONG.invoke(null, k);   // drives the lazy decrypt of b[idx]
        } catch (Throwable t) { return null; }
        if (idx < 0 || idx >= A.length) return null;
        if (B[idx] != null) return B[idx].replace('/', '.');
        Object o = A[idx];
        if (o instanceof String) return ((String) o).replace('/', '.');
        if (o instanceof Class) return ((Class<?>) o).getName();
        return null;
    }

    static Method A_LONG;
    static boolean VERIFY_RUNTIME = false;

    static Class<?> loadComC(Path jar) throws Exception {
        final URL[] urls = { jar.toUri().toURL() };
        ClassLoader parent = ClassLoader.getSystemClassLoader();
        ClassLoader loader = new URLClassLoader(urls, parent) {
            @Override protected Class<?> loadClass(String n, boolean resolve) throws ClassNotFoundException {
                synchronized (getClassLoadingLock(n)) {
                    Class<?> c = findLoadedClass(n);
                    if (c == null) {
                        try { c = super.loadClass(n, false); }
                        catch (ClassNotFoundException e) { throw e; }
                    }
                    if (resolve) resolveClass(c);
                    return c;
                }
            }
        };
        Class<?> c = Class.forName("com.c", true, loader);
        System.out.println("loaded com.c from " + c.getClassLoader());
        return c;
    }

    static String esc(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == DELIM) sb.append("\\b");
            else if (ch < 0x20 || ch > 0x7e) sb.append(String.format("\\u%04x", (int) ch));
            else sb.append(ch);
        }
        return sb.toString();
    }
}
