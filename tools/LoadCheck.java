import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;

/**
 * 逐个加载 jar 里的项目类，统计加载失败（ClassFormatError / VerifyError / NoClassDefFoundError）。
 *
 * 用途：给改名前后做「类加载可用性」的基线对比。
 * 改名只改名字，不该让原本能加载的类变得不能加载。
 *
 * 用法: java -cp "&lt;tools\bin&gt;;&lt;_lib\asm&gt;" LoadCheck &lt;in.jar&gt; [prefix]
 */
public class LoadCheck {
    public static void main(String[] args) throws Exception {
        String jarPath = args[0];
        String prefix = args.length > 1 ? args[1] : "com/finalshell/";

        Jar jar = new Jar(jarPath);
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, List<org.objectweb.asm.tree.ClassNode>> e : jar.classNodes().entrySet()) {
            if (e.getKey().startsWith(prefix)) names.add(e.getKey());
        }
        names.sort(Comparator.naturalOrder());

        URLClassLoader cl = new URLClassLoader(new URL[]{java.nio.file.Paths.get(jarPath).toUri().toURL()}, null);
        int ok = 0, fmt = 0, verify = 0, other = 0;
        List<String> fmtSamples = new ArrayList<>(), verifySamples = new ArrayList<>(), otherSamples = new ArrayList<>();
        for (String n : names) {
            String bin = n.replace('/', '.');
            try {
                Class.forName(bin, false, cl);
                ok++;
            } catch (Throwable t) {
                String cn = t.getClass().getSimpleName();
                if (cn.equals("ClassFormatError")) { fmt++; if (fmtSamples.size() < 8) fmtSamples.add(bin + " : " + t.getMessage()); }
                else if (cn.equals("VerifyError")) { verify++; if (verifySamples.size() < 8) verifySamples.add(bin + " : " + String.valueOf(t.getMessage()).split("\n")[0]); }
                else { other++; if (otherSamples.size() < 8) otherSamples.add(bin + " : " + cn + " " + String.valueOf(t.getMessage()).split("\n")[0]); }
            }
        }
        System.out.println("jar=" + jarPath);
        System.out.println("project classes=" + names.size() + "  loadOK=" + ok
                + "  ClassFormatError=" + fmt + "  VerifyError=" + verify + "  otherError=" + other);
        for (String s : fmtSamples) System.out.println("   FMT  " + s);
        for (String s : verifySamples) System.out.println("   VER  " + s);
        for (String s : otherSamples) System.out.println("   OTH  " + s);
    }
}
