import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

/** Debug probe: try to load given classes with the same loader DumpStrings uses. */
public class Probe {
    public static void main(String[] args) throws Exception {
        Path jar = Paths.get(args[0]);
        Map<String, byte[]> classes = new HashMap<>();
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                if (!e.getName().endsWith(".class")) continue;
                byte[] b;
                try (InputStream in = zf.getInputStream(e)) { b = in.readAllBytes(); }
                String name;
                try { name = DumpStrings.thisClass(b); } catch (Throwable t) { continue; }
                classes.putIfAbsent(name, b);
            }
        }
        System.out.println("map size=" + classes.size() + " has a3=" + classes.containsKey("a3"));
        ClassLoader loader = new DumpStrings.Loader(classes);
        for (int i = 1; i < args.length; i++) {
            String n = args[i];
            System.out.println("=== " + n + " present=" + classes.containsKey(n) + " ===");
            try {
                Class<?> c = Class.forName(n, true, loader);
                System.out.println("  loaded " + c);
            } catch (Throwable t) {
                t.printStackTrace(System.out);
            }
        }
    }
}
