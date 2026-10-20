import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

/**
 * Decrypts obfuscated string constants by invoking the owning class's private
 * static decryptor.
 *
 * A class is identified by (internal name, occurrence index) because the jar
 * holds several distinct classes per name; each is defined by its own loader
 * from exactly that jar entry.
 *
 * Usage: java DumpStrings <jar> <pairs.tsv> <out.tsv>
 * pairs.tsv: <realName> \t <idx> \t <n> \t <n2>
 * out.tsv:   <realName> \t <idx> \t <n> \t <n2> \t <escaped plaintext>
 */
public class DumpStrings {
    public static void main(String[] args) throws Exception {
        Path jar = Paths.get(args[0]);
        Path pairsFile = Paths.get(args[1]);
        Path outFile = Paths.get(args[2]);

        Map<String, byte[]> first = new HashMap<>();
        Map<String, List<byte[]>> all = new HashMap<>();
        Map<String, List<byte[]>> allLower = new HashMap<>();
        int total = 0;
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                if (!e.getName().endsWith(".class")) continue;
                byte[] b;
                try (InputStream in = zf.getInputStream(e)) { b = in.readAllBytes(); }
                String name;
                try { name = thisClass(b); } catch (Throwable t) { continue; }
                total++;
                first.putIfAbsent(name, b);
                all.computeIfAbsent(name, k -> new ArrayList<>()).add(b);
                allLower.computeIfAbsent(name.toLowerCase(Locale.ROOT), k -> new ArrayList<>()).add(b);
            }
        }
        System.out.println("ENTRIES=" + total + " NAMES=" + all.size());

        Map<String, List<int[]>> byOwner = new LinkedHashMap<>();
        try (BufferedReader r = Files.newBufferedReader(pairsFile, StandardCharsets.UTF_8)) {
            String line;
            while ((line = r.readLine()) != null) {
                String[] f = line.split("\t");
                if (f.length < 4) continue;
                int idx, n, n2;
                try {
                    idx = Integer.parseInt(f[1]); n = Integer.parseInt(f[2]); n2 = Integer.parseInt(f[3]);
                } catch (NumberFormatException e) { continue; }
                byOwner.computeIfAbsent(f[0] + "#" + idx, k -> new ArrayList<>()).add(new int[]{n, n2});
            }
        }

        Set<String> done = new HashSet<>();
        if (Files.exists(outFile)) {
            try (BufferedReader r = Files.newBufferedReader(outFile, StandardCharsets.UTF_8)) {
                String line;
                while ((line = r.readLine()) != null) {
                    int t = line.indexOf('\t');
                    if (t > 0) done.add(line.substring(0, t));
                }
            }
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(outFile.toFile(), true), StandardCharsets.UTF_8), 1 << 20));

        int ok = 0, fail = 0, timeout = 0, nomethod = 0;
        for (Map.Entry<String, List<int[]>> e : byOwner.entrySet()) {
            final String key = e.getKey();
            if (done.contains(key)) continue;
            String real = key.substring(0, key.lastIndexOf('#'));
            int idx = Integer.parseInt(key.substring(key.lastIndexOf('#') + 1));

            List<byte[]> versions = all.get(real);
            if (versions == null) versions = allLower.get(real.toLowerCase(Locale.ROOT));
            int use = idx;
            if (versions != null && use >= versions.size()) use = 0;
            final byte[] bytes = (versions != null && use < versions.size()) ? versions.get(use) : null;
            final String prefix = real + "\t" + idx + "\t";
            if (bytes == null) {
                out.println(key + "\tERR\tERR\tNO_ENTRY\t");
                out.flush();
                fail++;
                continue;
            }
            final List<int[]> work = e.getValue();
            final Object[] result = new Object[1];
            Thread t = new Thread(() -> {
                List<String> lines = new ArrayList<>();
                try {
                    String actual = thisClass(bytes);   // may differ in case from the caller's spelling
                    ClassLoader loader = new EntryLoader(actual, bytes, first);
                    Class<?> c = Class.forName(actual, true, loader);
                    Method m = findDecryptor(c);
                    if (m == null) { result[0] = "NOMETHOD"; return; }
                    for (int[] p : work) {
                        String val;
                        try {
                            val = String.valueOf(m.invoke(null, p[0], p[1]));
                        } catch (Throwable ex) {
                            Throwable cc = ex;
                            while (cc.getCause() != null) cc = cc.getCause();
                            val = "\u0000ERR:" + cc.getClass().getSimpleName() + ":" + cc.getMessage();
                        }
                        lines.add(p[0] + "\t" + p[1] + "\t" + val);
                    }
                    result[0] = lines;
                } catch (Throwable ex) {
                    result[0] = ex;
                }
            }, "dec-" + key);
            t.setDaemon(true);
            t.start();
            try { t.join(8000); } catch (InterruptedException ie) { }
            if (t.isAlive()) {
                timeout++;
                out.println(key + "\tERR\tERR\tTIMEOUT\t");
                out.flush();
                continue;
            }
            if (result[0] instanceof List) {
                @SuppressWarnings("unchecked") List<String> lines = (List<String>) result[0];
                for (String ln : lines) out.println(prefix + ln);
                ok++;
            } else if ("NOMETHOD".equals(result[0])) {
                nomethod++;
                out.println(key + "\tERR\tERR\tNO_METHOD\t");
            } else {
                fail++;
                out.println(key + "\tERR\tERR\tLOAD_FAIL\t" + esc(shortErr((Throwable) result[0])));
            }
            out.flush();
        }
        out.close();
        System.out.println("DONE ok=" + ok + " fail=" + fail + " timeout=" + timeout + " nomethod=" + nomethod);
    }

    static String shortErr(Throwable t) {
        Throwable c = t;
        while (c.getCause() != null) c = c.getCause();
        return c.getClass().getName() + ": " + c.getMessage();
    }

    private static Method findDecryptor(Class<?> c) {
        Method fallback = null;
        for (Method m : c.getDeclaredMethods()) {
            if (!Modifier.isStatic(m.getModifiers())) continue;
            Class<?>[] pt = m.getParameterTypes();
            if (pt.length == 2 && pt[0] == int.class && pt[1] == int.class
                    && m.getReturnType() == String.class) {
                try { m.setAccessible(true); } catch (Throwable t) { }
                if (Modifier.isPrivate(m.getModifiers())) return m;
                if (fallback == null) fallback = m;
            }
        }
        return fallback;
    }

    static class EntryLoader extends ClassLoader {
        private final String name;
        private final byte[] bytes;
        private final Map<String, byte[]> pool;
        EntryLoader(String name, byte[] bytes, Map<String, byte[]> pool) {
            super(ClassLoader.getSystemClassLoader());
            this.name = name;
            this.bytes = bytes;
            this.pool = pool;
        }
        @Override
        protected Class<?> loadClass(String n, boolean resolve) throws ClassNotFoundException {
            if (n.startsWith("java.") || n.startsWith("javax.") || n.startsWith("jdk.")
                    || n.startsWith("sun.") || n.startsWith("com.sun.")) {
                return super.loadClass(n, resolve);
            }
            synchronized (getClassLoadingLock(n)) {
                Class<?> c = findLoadedClass(n);
                if (c == null) {
                    byte[] b = n.equals(name) ? bytes : pool.get(n);
                    if (b != null) c = defineClass(n, b, 0, b.length);
                    else c = super.loadClass(n, false);
                }
                if (resolve) resolveClass(c);
                return c;
            }
        }
    }

    static String thisClass(byte[] b) {
        int i = 10;
        int count = u2(b, 8);
        int[] classIndex = new int[count];
        String[] utf = new String[count];
        for (int k = 1; k < count; k++) {
            int tag = b[i++] & 0xff;
            switch (tag) {
                case 7:  classIndex[k] = u2(b, i); i += 2; break;
                case 8: case 16: case 19: case 20: i += 2; break;
                case 15: i += 3; break;
                case 1: {
                    int len = u2(b, i); i += 2;
                    utf[k] = new String(b, i, len, StandardCharsets.UTF_8);
                    i += len;
                    break;
                }
                case 3: case 4: case 9: case 10: case 11: case 12: case 17: case 18:
                    i += 4; break;
                case 5: case 6: i += 8; k++; break;
                default: throw new IllegalStateException("tag " + tag);
            }
        }
        int thisIdx = u2(b, i + 2);
        return utf[classIndex[thisIdx]].replace('/', '.');
    }

    static int u2(byte[] b, int o) {
        return ((b[o] & 0xff) << 8) | (b[o + 1] & 0xff);
    }

    private static String esc(String s) {
        StringBuilder sb = new StringBuilder(s.length() + 16);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '\\': sb.append("\\\\"); break;
                case '\t': sb.append("\\t"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                default:
                    if (ch < 0x20 || ch > 0x7e) sb.append(String.format("\\u%04x", (int) ch));
                    else sb.append(ch);
            }
        }
        return sb.toString();
    }
}
