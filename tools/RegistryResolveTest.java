import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * 验证「Registry 里的类名在当前 jar 里能不能 Class.forName 出来」。
 *
 * 用法: java -cp "<tools\bin>;<_lib\asm>" RegistryResolveTest <jar> <registry.tsv>
 */
public class RegistryResolveTest {
    public static void main(String[] args) throws Exception {
        String jarPath = args[0], tsv = args[1];
        Jar jar = new Jar(jarPath);
        Map<String, List<ClassNode>> db = jar.classNodes();

        // jar 里有哪些类（内部名）
        Set<String> internal = new HashSet<>();
        for (String k : db.keySet()) internal.add(k);

        // 读 registry.tsv，找 CLASS 行
        List<String[]> rows = Tsv.read(tsv);
        int cls = 0, ok = 0, fail = 0;
        List<String> fails = new ArrayList<>();
        List<String> oks = new ArrayList<>();
        for (String[] r : rows) {
            if (!r[0].equals("CLASS")) continue;
            cls++;
            String name = r[3];
            // 二进制名 -> 内部名
            String in = name.replace('.', '/');
            if (internal.contains(in)) { ok++; if (oks.size() < 20) oks.add(name); }
            else { fail++; if (fails.size() < 20) fails.add(name); }
        }
        System.out.println("CLASS entries=" + cls + "  resolvable-in-jar=" + ok + "  NOT-in-jar=" + fail);
        System.out.println("  ok sample : " + oks);
        System.out.println("  bad sample: " + fails);

        // 运行时实测：调 lookupClass 会不会抛
        URLClassLoader cl = new URLClassLoader(new URL[]{jar.path().toUri().toURL()}, null);
        Class<?> reg = Class.forName("com.finalshell.reflect.Registry", true, cl);
        Field fa = reg.getField("a"), fb = reg.getField("b");
        Object[] a = (Object[]) fa.get(null);
        String[] b = (String[]) fb.get(null);
        java.lang.reflect.Method lookupClass = reg.getMethod("lookupClass", long.class);

        int n = 0, okR = 0, failR = 0;
        List<String> failNames = new ArrayList<>();
        List<String> failMsgs = new ArrayList<>();
        for (String[] r : rows) {
            if (!r[0].equals("CLASS")) continue;
            if (n++ >= 400) break;
            long key = Long.parseLong(r[2]);
            try {
                Class<?> c = (Class<?>) lookupClass.invoke(null, key);
                okR++;
            } catch (Throwable t) {
                failR++;
                Throwable cause = t.getCause() != null ? t.getCause() : t;
                if (failNames.size() < 10) {
                    failNames.add(r[3]);
                    failMsgs.add(cause.toString());
                }
            }
        }
        System.out.println();
        System.out.println("runtime lookupClass on first " + Math.min(n, 400) + " CLASS entries: ok=" + okR + " fail=" + failR);
        for (int i = 0; i < failNames.size(); i++) {
            System.out.println("   FAIL " + failNames.get(i) + "  ->  " + failMsgs.get(i));
        }
    }
}
