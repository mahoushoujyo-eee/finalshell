import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

/**
 * 从 finalshell.jar 里切出第三方库，打成 bundled-libs.jar。
 *
 * 为什么不直接用 Maven 中央仓库的坐标：
 *  - 第三方库在原包里是**未混淆的上游字节**，与自研代码编译时用的 API 100% 一致；
 *  - 中央仓库的版本无法精确复原（Guava 18->21 有 breaking change、
 *    Netty 4.1.34->4.1.113 的 native 库、FlatLaf 3.6 的 API 变动等），
 *    换版本会引入编译期或运行期差异；
 *  - 打包后完全离线可构建。
 * 每个库对应的上游坐标记录在 docs/DEPS.md，可随时替换回真实依赖。
 *
 * 用法: java BuildBundledLibs <finalshell.jar> <selfClasses.txt> <out.jar>
 *   selfClasses.txt 每行一个自研类的内部名（斜杠分隔）
 */
public class BuildBundledLibs {
    public static void main(String[] args) throws Exception {
        String jarPath = args[0];
        Set<String> self = new HashSet<>();
        for (String line : Files.readAllLines(Paths.get(args[1]), StandardCharsets.UTF_8)) {
            line = line.trim();
            if (!line.isEmpty()) self.add(line);
        }
        Path out = Paths.get(args[2]);
        Files.createDirectories(out.getParent());

        int vendored = 0, selfSkipped = 0, renamed = 0;
        Set<String> seen = new HashSet<>();
        try (ZipFile zf = new ZipFile(jarPath);
             ZipOutputStream zos = new ZipOutputStream(
                     new BufferedOutputStream(Files.newOutputStream(out)))) {
            Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                if (e.isDirectory()) continue;
                String name = e.getName();
                byte[] data;
                try (InputStream in = zf.getInputStream(e)) { data = in.readAllBytes(); }
                if (data.length < 4 || (data[0] & 0xff) != 0xca || (data[1] & 0xff) != 0xfe) {
                    continue;   // 不是 class
                }
                String internal = internalName(data);
                if (internal == null) continue;
                if (self.contains(internal)) { selfSkipped++; continue; }
                if (!seen.add(internal)) continue;      // 同名类只取第一个
                String entryName = internal + ".class";
                if (!entryName.equals(name)) renamed++;
                zos.putNextEntry(new ZipEntry(entryName));
                zos.write(data);
                zos.closeEntry();
                vendored++;
            }
        }
        System.out.println("bundled classes=" + vendored
                           + "  self-skipped=" + selfSkipped
                           + "  renamed-entries=" + renamed
                           + "  size=" + Files.size(out) / 1024 + "KB -> " + out);
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
