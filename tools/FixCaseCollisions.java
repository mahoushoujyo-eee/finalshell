import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.tree.ClassNode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

/**
 * 解决大小写冲突：jar 里有 1,758 组仅大小写不同的类（如 com/A 与 com/a）。
 * Windows/大小写不敏感的文件系统无法同时容纳它们，javac 也会因为
 * target/classes 下 A.class 与 a.class 互相覆盖而产出 "wrong name" 错误。
 *
 * 做法：在字节码层面用 ASM 的 ClassRemapper 把每组里的一个变体改名，
 * 所有引用（方法/字段归属、类型、描述符、签名、注解……）由 ASM 自动跟随更新。
 * 输出改名映射表，供反射重写器同步使用。
 */
public class FixCaseCollisions {
    /** 内部名 -> 新内部名（只记录被改的）。 */
    public static final Map<String, String> RENAMED = new LinkedHashMap<>();

    public static void main(String[] args) throws Exception {
        String jarPath = args[0];
        String outJar = args[1];
        String mapOut = args[2];

        // 1) 收集所有内部名及其大小写归并后的分组
        Map<String, byte[]> entries = new LinkedHashMap<>();   // entryName -> bytes
        Map<String, String> entryToInternal = new LinkedHashMap<>();
        try (ZipFile zf = new ZipFile(jarPath)) {
            Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                if (e.isDirectory()) continue;
                byte[] data;
                try (InputStream in = zf.getInputStream(e)) { data = in.readAllBytes(); }
                if (data.length < 4 || (data[0] & 0xff) != 0xca || (data[1] & 0xff) != 0xfe) continue;
                String internal = internalName(data);
                if (internal == null) continue;
                String key = internal + ".class";
                if (entries.containsKey(key)) continue;
                entries.put(key, data);
                entryToInternal.put(key, internal);
            }
        }

        Map<String, List<String>> groups = new TreeMap<>();
        for (String internal : entryToInternal.values()) {
            groups.computeIfAbsent(internal.toLowerCase(Locale.ROOT), k -> new ArrayList<>()).add(internal);
        }

        // 2) 为每组挑出要改名的变体：优先改"简单名更长的"（更可能是混淆器的小写诱饵），
        //    改名后必须全局唯一
        // 关键：按"小写形式"去重。Ba / bA / ba 三个变体的小写都是 "ba"，
        // 改名后必须落在 ba_2 / ba_3 / ba_4 这种小写互不相同的形式上。
        Set<String> used = new HashSet<>();
        for (String n : entryToInternal.values()) used.add(n.toLowerCase(Locale.ROOT));
        int renamed = 0;
        for (List<String> g : groups.values()) {
            if (g.size() < 2) continue;
            // 保留第一个（通常是真正的类），其余改名
            List<String> sorted = new ArrayList<>(g);
            sorted.sort(Comparator.comparingInt((String s) -> s.length())
                    .thenComparing(s -> s));      // 短的保留
            for (int i = 1; i < sorted.size(); i++) {
                String orig = sorted.get(i);
                String neu = uniqueName(orig, used);
                used.add(neu.toLowerCase(Locale.ROOT));
                RENAMED.put(orig, neu);
                renamed++;
            }
        }
        System.out.println("collision groups=" + groups.size() + " renamed classes=" + renamed);

        // 3) 用 ClassRemapper 重写并输出
        Remapper remapper = new Remapper() {
            @Override public String map(String internalName) {
                String n = RENAMED.get(internalName);
                return n != null ? n : internalName;
            }
        };
        Files.createDirectories(Paths.get(outJar).getParent());
        int written = 0;
        try (ZipOutputStream zos = new ZipOutputStream(
                new BufferedOutputStream(Files.newOutputStream(Paths.get(outJar))))) {
            for (Map.Entry<String, byte[]> e : entries.entrySet()) {
                String internal = entryToInternal.get(e.getKey());
                ClassReader cr = new ClassReader(e.getValue());
                ClassWriter cw = new ClassWriter(0);
                cr.accept(new ClassRemapper(cw, remapper), 0);
                String newInternal = RENAMED.getOrDefault(internal, internal);
                zos.putNextEntry(new ZipEntry(newInternal + ".class"));
                zos.write(cw.toByteArray());
                zos.closeEntry();
                written++;
            }
        }
        System.out.println("wrote " + written + " classes -> " + outJar);

        try (PrintWriter w = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(mapOut), StandardCharsets.UTF_8))) {
            w.println("original\tnew");
            for (Map.Entry<String, String> e : RENAMED.entrySet()) {
                w.println(e.getKey() + "\t" + e.getValue());
            }
        }
    }

    /** 生成小写形式全局唯一的新内部名：简单名加 _2/_3/... */
    static String uniqueName(String internal, Set<String> usedLower) {
        int slash = internal.lastIndexOf('/');
        String pkg = slash < 0 ? "" : internal.substring(0, slash + 1);
        String simple = slash < 0 ? internal : internal.substring(slash + 1);
        for (int i = 2; ; i++) {
            String cand = pkg + simple + "_" + i;
            if (!usedLower.contains(cand.toLowerCase(Locale.ROOT))) return cand;
        }
    }

    static String internalName(byte[] b) {
        try {
            int i = 10;
            int count = u2(b, 8);
            String[] utf = new String[count];
            int[] cls = new int[count];
            for (int k = 1; k < count; k++) {
                int tag = b[i++] & 0xff;
                switch (tag) {
                    case 7: cls[k] = u2(b, i); i += 2; break;
                    case 8: case 16: case 19: case 20: i += 2; break;
                    case 15: i += 3; break;
                    case 1: {
                        int len = u2(b, i); i += 2;
                        utf[k] = new String(b, i, len, StandardCharsets.UTF_8);
                        i += len; break;
                    }
                    case 3: case 4: case 9: case 10: case 11: case 12: case 17: case 18: i += 4; break;
                    case 5: case 6: i += 8; k++; break;
                    default: return null;
                }
            }
            int thisIdx = u2(b, i + 2);
            return utf[cls[thisIdx]];
        } catch (Throwable t) {
            return null;
        }
    }

    static int u2(byte[] b, int o) { return ((b[o] & 0xff) << 8) | (b[o + 1] & 0xff); }
}
