/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.o__0;
import java.awt.Insets;

public final class KG {
    public static Insets L;
    public static int z;
    public static boolean C;
    public static float s;
    public static String j;

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
                char[] cArray3 = "/S\u0004".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 22;
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
                            n17 = 23;
                            break;
                        }
                        case 1: {
                            n17 = 107;
                            break;
                        }
                        case 2: {
                            n17 = 60;
                            break;
                        }
                        case 3: {
                            n17 = 64;
                            break;
                        }
                        case 4: {
                            n17 = 74;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 1;
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
        L = o__0.u;
        z = 1;
        C = false;
        s = 1.5f;
        j = string;
    }
}

