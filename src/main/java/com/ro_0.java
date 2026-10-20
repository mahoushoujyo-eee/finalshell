/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.d9_0;
import com.dg_1;
import com.ue_0;

/*
 * Renamed from com.Ro
 */
final class ro_0 {
    static final d9_0 W;
    static final d9_0 C;
    static final d9_0 k;
    static final d9_0 I;
    private static final String a;

    ro_0() {
    }

    static String Y() {
        return a;
    }

    static long w(long l2, long l3, long l4) {
        return dg_1.h(l2, l3, l4);
    }

    static long b(long l2, long l3, long l4) {
        return ue_0.j(l2, l3, l4);
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
                char[] cArray3 = "Q\u007ft\u007fF".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 31;
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
                            n17 = 127;
                            break;
                        }
                        case 1: {
                            n17 = 78;
                            break;
                        }
                        case 2: {
                            n17 = 90;
                            break;
                        }
                        case 3: {
                            n17 = 78;
                            break;
                        }
                        case 4: {
                            n17 = 106;
                            break;
                        }
                        case 5: {
                            n17 = 40;
                            break;
                        }
                        default: {
                            n17 = 126;
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
        W = d9_0.NONE;
        C = d9_0.ZLIB;
        k = d9_0.GZIP;
        I = d9_0.ANY;
    }
}

