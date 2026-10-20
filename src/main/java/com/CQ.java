/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CY;

class CQ
extends CY {
    private static final String j;

    CQ() {
    }

    @Override
    String i() {
        return j;
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
                char[] cArray3 = "18\u0001cZ".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 109;
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
                            n17 = 47;
                            break;
                        }
                        case 1: {
                            n17 = 61;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 35;
                            break;
                        }
                        case 4: {
                            n17 = 6;
                            break;
                        }
                        case 5: {
                            n17 = 78;
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
        j = new String(cArray).intern();
    }
}

