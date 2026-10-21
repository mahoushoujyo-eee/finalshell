import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 * 把 jar 里所有 interface 的 class file 版本提到 52 (Java 8)。
 *
 * <p>为什么需要：反编译管线会往接口里注入一个 public static 方法
 * （{@code __vfClinit__}，把 &lt;clinit&gt; 的静态初始化代码搬出来）。
 * 而 Java 8 之前（JVM class file version &lt; 52）的接口不允许有 static 方法，
 * javac 会报：
 * <pre>
 *   bad class file: .../Kernel32.class
 *     static method found in version 50.0 classfile
 * </pre>
 *
 * <p>本工具**只改 class 文件头的 major_version 两个字节**，其余字节原样保留，
 * 因此反编译产物与改之前完全一致（版本号不影响反编译结果），
 * 省掉一次 10 分钟的全量反编译。
 *
 * <p>用法: java BumpIfaceVersion &lt;in.jar&gt; &lt;out.jar&gt;
 */
public class BumpIfaceVersion {

    private static final int MAJOR_JAVA8 = 52;

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("usage: BumpIfaceVersion <in.jar> <out.jar>");
            return;
        }
        String in = args[0], out = args[1];
        int total = 0, ifaces = 0, bumped = 0;
        try (ZipFile zf = new ZipFile(in);
             ZipOutputStream zo = new ZipOutputStream(new BufferedOutputStream(
                     new FileOutputStream(out)))) {
            Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                byte[] data;
                try (InputStream is = zf.getInputStream(e)) { data = is.readAllBytes(); }
                if (isClassFile(data)) {
                    total++;
                    int major = ((data[6] & 0xFF) << 8) | (data[7] & 0xFF);
                    if (isInterface(data) && major < MAJOR_JAVA8) {
                        ifaces++;
                        data[6] = 0;
                        data[7] = (byte) MAJOR_JAVA8;
                        bumped++;
                    }
                }
                ZipEntry ne = new ZipEntry(e.getName());
                ne.setTime(e.getTime());
                zo.putNextEntry(ne);
                zo.write(data);
                zo.closeEntry();
            }
        }
        System.out.println("classes=" + total + "  interfaces(v<52)=" + ifaces + "  bumped=" + bumped);
        System.out.println("wrote " + out);
    }

    static boolean isClassFile(byte[] d) {
        return d.length > 10
                && (d[0] & 0xFF) == 0xCA && (d[1] & 0xFF) == 0xFE
                && (d[2] & 0xFF) == 0xBA && (d[3] & 0xFF) == 0xBE;
    }

    /** 读 constant_pool 找到 access_flags，判断是不是 interface。 */
    static boolean isInterface(byte[] d) {
        try {
            int p = 10;
            int cpCount = ((d[8] & 0xFF) << 8) | (d[9] & 0xFF);
            for (int i = 1; i < cpCount; i++) {
                int tag = d[p] & 0xFF;
                switch (tag) {
                    case 1: // CONSTANT_Utf8
                        p += 3 + (((d[p + 1] & 0xFF) << 8) | (d[p + 2] & 0xFF));
                        break;
                    case 7: case 8: case 16: case 19: case 20:
                        p += 3;
                        break;
                    case 15:
                        p += 4;
                        break;
                    case 3: case 4: case 9: case 10: case 11: case 12: case 17: case 18:
                        p += 5;
                        break;
                    case 5: case 6: // Long / Double 占两个槽
                        p += 9;
                        i++;
                        break;
                    default:
                        return false;
                }
            }
            int access = ((d[p] & 0xFF) << 8) | (d[p + 1] & 0xFF);
            return (access & 0x0200) != 0;   // ACC_INTERFACE
        } catch (Exception e) {
            return false;
        }
    }
}
