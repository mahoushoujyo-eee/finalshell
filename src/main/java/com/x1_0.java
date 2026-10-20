/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E6;
import com.O4;
import com.ky_2;
import com.xy_1;

/*
 * Renamed from com.x1
 */
@O4(Z={"type", "bbox", "coordinates"})
public class x1_0
extends xy_1 {
    private double i;
    private double e;
    private static final String a;

    public x1_0() {
        super(a);
    }

    public double[] d() {
        String[] stringArray = xy_1.q();
        double[] dArray = new double[]{this.i, this.e};
        if (stringArray != null) {
            ky_2.K(new String[4]);
        }
        return dArray;
    }

    public void I(double[] dArray) {
        int n10;
        block7: {
            block8: {
                block5: {
                    block6: {
                        String[] stringArray = xy_1.q();
                        if (stringArray != null) break block5;
                        if (dArray == null) break block6;
                        n10 = dArray.length;
                        if (stringArray != null) break block7;
                        if (n10 != 0) break block8;
                    }
                    this.i = 0.0;
                    this.e = 0.0;
                }
                return;
            }
            n10 = dArray.length;
        }
        if (n10 == 1) {
            this.i = dArray[0];
            return;
        }
        this.i = dArray[0];
        this.e = dArray[1];
        if (ky_2.F() != null) {
            xy_1.P(new String[5]);
        }
    }

    @E6(W=false)
    public double c() {
        return this.i;
    }

    @E6(W=false)
    public double G() {
        return this.e;
    }

    @E6(Y=false)
    public void I(double d2) {
        this.i = d2;
    }

    @E6(Y=false)
    public void L(double d2) {
        this.e = d2;
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
                char[] cArray3 = "H\b\u0015\u0015^".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 84;
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
                            n17 = 76;
                            break;
                        }
                        case 1: {
                            n17 = 51;
                            break;
                        }
                        case 2: {
                            n17 = 40;
                            break;
                        }
                        case 3: {
                            n17 = 47;
                            break;
                        }
                        case 4: {
                            n17 = 126;
                            break;
                        }
                        case 5: {
                            n17 = 57;
                            break;
                        }
                        default: {
                            n17 = 40;
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

