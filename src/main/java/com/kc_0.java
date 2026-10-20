/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.K4;

/*
 * Renamed from com.Kc
 */
public class kc_0
extends K4 {
    private static final String a;

    public kc_0() {
        this.Z = a;
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
                char[] cArray3 = "lpr?Z\rQtx~8FI\bDrc9\u0019\fKl3p3\u001a".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 10;
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
                            n17 = 14;
                            break;
                        }
                        case 1: {
                            n17 = 23;
                            break;
                        }
                        case 2: {
                            n17 = 25;
                            break;
                        }
                        case 3: {
                            n17 = 86;
                            break;
                        }
                        case 4: {
                            n17 = 125;
                            break;
                        }
                        case 5: {
                            n17 = 117;
                            break;
                        }
                        default: {
                            n17 = 50;
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

