/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.yd_2;

/*
 * Renamed from com.yi
 */
public class yi_2
extends yd_2 {
    private static final String e;

    public yi_2() {
        this.N = e;
        this.v = true;
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
                char[] cArray3 = "\u0012\bZA\u001fwT\u001bW\u0016\u0010\u00072\u0011\u001f\u0011Vb]tY\u0014\u0016HJ\u001cgS\u0017".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 56;
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
                            n17 = 66;
                            break;
                        }
                        case 1: {
                            n17 = 93;
                            break;
                        }
                        case 2: {
                            n17 = 3;
                            break;
                        }
                        case 3: {
                            n17 = 26;
                            break;
                        }
                        case 4: {
                            n17 = 10;
                            break;
                        }
                        case 5: {
                            n17 = 60;
                            break;
                        }
                        default: {
                            n17 = 4;
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
        e = new String(cArray).intern();
    }
}

