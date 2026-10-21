import java.io.*;
import java.util.*;

/** 把 AliasClass 生成的字节码写成 .class 文件，便于 javap 检查。 */
public class DumpAlias {
    public static void main(String[] args) throws Exception {
        Map<String, String> m = new LinkedHashMap<>();
        m.put("CK", "com.finalshell.core.ZModemTransfer");
        m.put("dM", "com.finalshell.core.DM3");
        byte[] b = AliasClass.build(m);
        try (OutputStream os = new FileOutputStream(args[0])) { os.write(b); }
        System.out.println("wrote " + args[0] + " size=" + b.length);
    }
}
