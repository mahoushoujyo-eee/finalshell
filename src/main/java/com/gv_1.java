/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SC;
import com.gy_2;

/*
 * Renamed from com.gV
 */
public class gv_1
extends gy_2 {
    private SC i;
    private SC z;
    private static final String a;

    public void B(SC sC) {
        this.i = sC;
    }

    public SC r() {
        return this.i;
    }

    public void Z(SC sC) {
        this.z = sC;
    }

    public SC U() {
        return this.z;
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        float f10 = this.i.h(n10, n11);
        float f11 = this.z.h(n10, n11);
        fArray[0] = f10 * (float)this.r.width;
        fArray[1] = f11 * (float)this.r.height;
    }

    public String toString() {
        return a;
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
                char[] cArray3 = "[\u007flD\u0002/@0[~@M\u001e[pd{Y\u0003<@ze1\u001eC".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 47;
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
                            n17 = 48;
                            break;
                        }
                        case 1: {
                            n17 = 57;
                            break;
                        }
                        case 2: {
                            n17 = 48;
                            break;
                        }
                        case 3: {
                            n17 = 31;
                            break;
                        }
                        case 4: {
                            n17 = 66;
                            break;
                        }
                        case 5: {
                            n17 = 114;
                            break;
                        }
                        default: {
                            n17 = 27;
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

