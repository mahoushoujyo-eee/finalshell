import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

import java.io.InputStream;
import java.util.*;

/**
 * 只读 jar 访问层。
 *
 * 所有 class 都留在内存里 —— jar 内有 1,758 组仅大小写不同的类名
 * （A.class vs a.class），在 Windows 文件系统上解压会互相覆盖。
 */
public class Jar {
    private final String path;
    private final java.util.zip.ZipFile zf;
    private final List<String> classEntries = new ArrayList<>();

    public Jar(String path) throws Exception {
        this.path = path;
        this.zf = new java.util.zip.ZipFile(path);
        Enumeration<? extends java.util.zip.ZipEntry> en = zf.entries();
        while (en.hasMoreElements()) {
            String n = en.nextElement().getName();
            if (n.endsWith(".class") || n.endsWith(".SCL.lombok")) classEntries.add(n);
        }
    }

    public List<String> entries() { return classEntries; }

    public java.nio.file.Path path() { return java.nio.file.Paths.get(path); }

    public byte[] read(String entry) throws Exception {
        try (InputStream in = zf.getInputStream(zf.getEntry(entry))) {
            return in.readAllBytes();
        }
    }

    /** 内部名 -> 该内部名的所有 class 版本（正常每个 1 个，lombok 有重名）。 */
    public Map<String, List<ClassNode>> classNodes() throws Exception {
        Map<String, List<ClassNode>> out = new LinkedHashMap<>();
        for (String e : classEntries) {
            byte[] b = read(e);
            ClassNode cn = new ClassNode();
            try {
                new ClassReader(b).accept(cn, ClassReader.SKIP_FRAMES);
            } catch (Throwable t) {
                continue;
            }
            out.computeIfAbsent(cn.name, k -> new ArrayList<>()).add(cn);
        }
        return out;
    }

    /** 内部名 -> class 字节（取第一个版本），供运行时解密器加载。 */
    public Map<String, byte[]> classBytes() throws Exception {
        Map<String, byte[]> out = new LinkedHashMap<>();
        for (String e : classEntries) {
            byte[] b = read(e);
            String internal = internalName(b);
            if (internal != null) out.putIfAbsent(internal, b);
        }
        return out;
    }

    /** class 文件的 this_class 内部名（斜杠分隔）。 */
    public static String internalName(byte[] b) {
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
                        utf[k] = new String(b, i, len, java.nio.charset.StandardCharsets.UTF_8);
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
