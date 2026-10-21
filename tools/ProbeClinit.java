import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;

/** 诊断：ASM 读进来的 <clinit> 到底长什么样 */
public class ProbeClinit {
    public static void main(String[] args) throws Exception {
        try (ZipFile z = new ZipFile(args[0])) {
            int n = 0, withClinit = 0, emptyClinit = 0;
            List<String> samples = new ArrayList<>();
            Enumeration<? extends ZipEntry> en = z.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                if (!e.getName().endsWith(".class")) continue;
                n++;
                byte[] b = z.getInputStream(e).readAllBytes();
                ClassNode node = new ClassNode();
                new ClassReader(b).accept(node, 0);
                for (MethodNode m : node.methods) {
                    if (!m.name.equals("<clinit>")) continue;
                    withClinit++;
                    int sz = m.instructions == null ? -1 : m.instructions.size();
                    if (sz == 0) { emptyClinit++; }
                    if (samples.size() < 5) {
                        samples.add(e.getName() + "  instr=" + sz
                            + "  methods=" + node.methods.size()
                            + "  fields=" + node.fields.size()
                            + "  first=" + (m.instructions == null || m.instructions.size() == 0
                                ? "-" : m.instructions.getFirst().getClass().getSimpleName()));
                    }
                }
                if (n >= 400) break;
            }
            System.out.println("scanned=" + n + "  withClinit=" + withClinit + "  emptyClinit=" + emptyClinit);
            for (String s : samples) System.out.println("  " + s);
        }
    }
}
