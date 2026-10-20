/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O4;
import com.xy_1;

/*
 * Renamed from com.xr
 */
@O4(Z={"type", "bbox", "coordinates"})
public class xr_2
extends xy_1 {
    private double[][] w;
    private static final String a;

    public xr_2() {
        super(a);
    }

    public double[][] m() {
        return this.w;
    }

    public void V(double[][] dArray) {
        this.w = dArray;
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
                char[] cArray3 = "l\u0012\u0011-o?QH\t\t".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 39;
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
                            n17 = 6;
                            break;
                        }
                        case 1: {
                            n17 = 64;
                            break;
                        }
                        case 2: {
                            n17 = 90;
                            break;
                        }
                        case 3: {
                            n17 = 126;
                            break;
                        }
                        case 4: {
                            n17 = 33;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 25;
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

