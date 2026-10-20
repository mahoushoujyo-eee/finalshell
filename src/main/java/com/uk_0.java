/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.uV;

/*
 * Renamed from com.uk
 */
public class uk_0
extends uV {
    private static final String a;

    @Override
    String y() {
        return a;
    }

    @Override
    public byte[] m(byte[] byArray, int n10) {
        return super.m(byArray, n10);
    }

    @Override
    public void l(byte[] byArray, int n10) throws Exception {
        super.l(byArray, n10);
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
                char[] cArray3 = "}mI0\b\u0012\u0012D[j<#A&~gCA\u007f\u0012".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 15;
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
                            n17 = 34;
                            break;
                        }
                        case 1: {
                            n17 = 32;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 123;
                            break;
                        }
                        case 4: {
                            n17 = 65;
                            break;
                        }
                        case 5: {
                            n17 = 47;
                            break;
                        }
                        default: {
                            n17 = 74;
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

