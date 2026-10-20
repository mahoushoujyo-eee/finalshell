/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PM;
import com.a9;
import com.pf_2;

public class EN {
    protected static pf_2 h;
    protected static boolean U;
    private static String m;
    private static final String b;

    public static synchronized void b() {
        block3: {
            boolean bl;
            block2: {
                String string = EN.Y();
                bl = U;
                if (string == null) break block2;
                if (bl) break block3;
                bl = true;
            }
            U = bl;
            PM.m(pf_2.class);
        }
    }

    public static pf_2 t() {
        String string = EN.Y();
        pf_2 pf_22 = h;
        if (string != null) {
            if (pf_22 == null) {
                h = (pf_2)PM.s(a9.class.getResource(b));
            }
            pf_22 = h;
        }
        return pf_22;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (EN.Y() == null) {
                    EN.F("ucxTnb");
                }
                char[] cArray3 = "^6J4{*bI \u0016-k*rE<Wuv5m".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 49;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 29;
                            break;
                        }
                        case 1: {
                            n17 = 98;
                            break;
                        }
                        case 2: {
                            n17 = 8;
                            break;
                        }
                        case 3: {
                            n17 = 106;
                            break;
                        }
                        case 4: {
                            n17 = 63;
                            break;
                        }
                        case 5: {
                            n17 = 105;
                            break;
                        }
                        default: {
                            n17 = 48;
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
        b = new String(cArray).intern();
        h = null;
        U = false;
    }

    public static void F(String string) {
        m = string;
    }

    public static String Y() {
        return m;
    }
}

