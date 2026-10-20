/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O4;
import com.xy_1;

/*
 * Renamed from com.xH
 */
@O4(Z={"type", "bbox", "coordinates"})
public class xh_1
extends xy_1 {
    private double[][][][] t;
    private static final String a;

    public xh_1() {
        super(a);
    }

    public double[][][][] K() {
        return this.t;
    }

    public void c(double[][][][] dArray) {
        this.t = dArray;
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
                char[] cArray3 = "7\u00123\bF5P\u0016\u001e8\u0013A".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 48;
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
                            n17 = 74;
                            break;
                        }
                        case 1: {
                            n17 = 87;
                            break;
                        }
                        case 2: {
                            n17 = 111;
                            break;
                        }
                        case 3: {
                            n17 = 76;
                            break;
                        }
                        case 4: {
                            n17 = 31;
                            break;
                        }
                        case 5: {
                            n17 = 85;
                            break;
                        }
                        default: {
                            n17 = 15;
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

