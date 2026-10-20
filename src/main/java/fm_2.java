/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fm
 */
public class fm_2 {
    HashMap A = new HashMap();
    private static final String a;

    public tp_2 d(String string, int n10) {
        return (tp_2)this.A.get(String.valueOf(string) + ":" + n10);
    }

    public void l(tp_2 tp_22) {
        String string = String.valueOf(tp_22.H().getHostAddress()) + ":" + tp_22.c();
        System.out.println(a + string);
        this.A.put(string, tp_22);
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
                char[] cArray3 = "\u0013/gSQ9\u0017\u0017(wyQ9Y".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 98;
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
                            n17 = 16;
                            break;
                        }
                        case 1: {
                            n17 = 41;
                            break;
                        }
                        case 2: {
                            n17 = 97;
                            break;
                        }
                        case 3: {
                            n17 = 114;
                            break;
                        }
                        case 4: {
                            n17 = 92;
                            break;
                        }
                        case 5: {
                            n17 = 53;
                            break;
                        }
                        default: {
                            n17 = 27;
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

