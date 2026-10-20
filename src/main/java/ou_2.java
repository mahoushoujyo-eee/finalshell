/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

/*
 * Renamed from ou
 */
public class ou_2 {
    private static final String a;

    /*
     * Unable to fully structure code
     */
    public static String f(Hashtable var0) {
        var2_1 = new StringBuffer();
        var1_2 = D6.k();
        var3_3 = var0.keys();
        if (var1_2 == null) ** GOTO lbl11
        block0: while (true) {
            v0 = (String)var3_3.nextElement();
            do {
                var4_4 = v0;
                var2_1.append(var0.get(var4_4) + ou_2.a + var4_4 + "\n");
lbl11:
                // 2 sources

                if (var3_3.hasMoreElements()) continue block0;
                v0 = var2_1.toString();
            } while (var1_2 != null);
            break;
        }
        return v0;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u001c\b\t".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 45;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 17;
                            break;
                        }
                        case 1: {
                            n17 = 31;
                            break;
                        }
                        case 2: {
                            n17 = 4;
                            break;
                        }
                        case 3: {
                            n17 = 13;
                            break;
                        }
                        case 4: {
                            n17 = 46;
                            break;
                        }
                        case 5: {
                            n17 = 37;
                            break;
                        }
                        default: {
                            n17 = 17;
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
        a = new String(cArray).intern();
    }
}

