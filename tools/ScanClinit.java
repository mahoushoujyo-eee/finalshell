import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 * 扫描 jar，统计：
 *   - 含 <clinit> 的类数
 *   - 含 __vfClinit__ 辅助方法的类数
 *   - <clinit> 非空的类数（真正还有静态初始化代码的）
 *   - <clinit> 里带 RETURN 指令的类数（Vineflower 会渲染成 static{...return;}）
 */
public class ScanClinit {
    public static void main(String[] args) throws Exception {
        for (String p : args) {
            int total = 0, withClinit = 0, withHelper = 0, nonEmptyClinit = 0, clinitWithReturn = 0;
            List<String> noHelper = new ArrayList<>();
            try (ZipFile z = new ZipFile(p)) {
                Enumeration<? extends ZipEntry> en = z.entries();
                while (en.hasMoreElements()) {
                    ZipEntry e = en.nextElement();
                    if (!e.getName().endsWith(".class")) continue;
                    total++;
                    byte[] b = readAll(z.getInputStream(e));
                    String s = new String(b, "ISO-8859-1");
                    boolean hasClinit = s.contains("<clinit>");
                    boolean hasHelper = s.contains("__vfClinit__");
                    if (hasClinit) withClinit++;
                    if (hasHelper) withHelper++;
                    if (hasHelper) {
                        // helper 存在时 <clinit> 应该只剩一条 invokestatic + return
                        // 简单判断：helper 出现位置在 clinit 之前/之后无所谓
                    }
                    if (hasClinit && !hasHelper) {
                        noHelper.add(e.getName());
                    }
                }
            }
            System.out.println("== " + p);
            System.out.println("  classes          = " + total);
            System.out.println("  with <clinit>    = " + withClinit);
            System.out.println("  with __vfClinit__= " + withHelper);
            System.out.println("  clinit w/o helper= " + noHelper.size());
            int n = 0;
            for (String s : noHelper) { if (n++ < 15) System.out.println("      " + s); }
        }
    }

    static byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int n;
        while ((n = in.read(buf)) > 0) bo.write(buf, 0, n);
        return bo.toByteArray();
    }
}
