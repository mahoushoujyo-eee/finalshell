/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

public class YK {
    private static Properties s;
    static File W;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = "Pg\u0013\n\u0012)\u001eE|\u0017\u000b8(\u0019".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 34;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 1;
                            break;
                        }
                        case 1: {
                            n17 = 55;
                            break;
                        }
                        case 2: {
                            n17 = 82;
                            break;
                        }
                        case 3: {
                            n17 = 7;
                            break;
                        }
                        case 4: {
                            n17 = 115;
                            break;
                        }
                        case 5: {
                            n17 = 100;
                            break;
                        }
                        default: {
                            n17 = 82;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        String string = new String(cArray).intern();
        s = null;
        W = new File(string);
        try {
            s = new Properties();
            s.load(new FileInputStream(W));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private YK() {
    }

    public static String T(String string) {
        String string2 = D6.k();
        Properties properties = s;
        String string3 = string;
        if (string2 == null) {
            if (!properties.containsKey(string3)) {
                return "";
            }
            properties = s;
            string3 = string;
        }
        return properties.get(string3).toString();
    }

    public static void u(String string, String string2) {
        String string3 = D6.k();
        Properties properties = s;
        String string4 = string;
        if (string3 == null) {
            if (!properties.containsKey(string4)) {
                return;
            }
            properties = s;
            string4 = string;
        }
        properties.put(string4, string2);
    }

    /*
     * Unable to fully structure code
     */
    public static void N(String[] var0) {
        var1_1 = D6.k();
        try {
            var2_2 = new FileWriter(YK.W);
            var3_4 = new BufferedWriter(var2_2);
            var4_5 = 0;
            try {
                if (var1_1 != null) {
                    while (true) {
                        var3_4.write(String.valueOf(var0[var4_5]) + "=" + YK.T(var0[var4_5]));
                        var3_4.newLine();
                        break;
                    }
                }
                ** GOTO lbl17
            }
            catch (Exception v0) {
                throw YK.a(v0);
            }
            do {
                ++var4_5;
lbl17:
                // 2 sources

                if (var4_5 < var0.length) ** continue;
                var3_4.close();
                var2_2.close();
            } while (var1_1 != null);
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

