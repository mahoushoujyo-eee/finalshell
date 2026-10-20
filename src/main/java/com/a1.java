/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.uZ;

public class a1 {
    protected float[] D;
    protected float[] U;
    protected float[] c;

    public a1(int n10) {
        this.D = new float[n10];
        this.U = new float[n10];
        this.c = new float[n10];
        int n11 = 1;
        String string = uZ.h();
        for (int i2 = 0; i2 < n10; ++i2) {
            double d2 = Math.PI * -2 / (double)(n11 <<= 1);
            this.D[i2] = (float)Math.sin(0.5 * d2);
            this.U[i2] = -2.0f * this.D[i2] * this.D[i2];
            this.c[i2] = (float)Math.sin(d2);
            if (string == null) continue;
        }
    }

    private void L(int n10, float[] fArray, float[] fArray2) {
        int n11 = 0;
        String string = uZ.h();
        for (int i2 = 0; i2 < n10; ++i2) {
            int n12;
            int n13;
            block5: {
                int n14;
                int n15 = i2;
                int n16 = n11;
                if (string == null) {
                    if (n15 > n16) {
                        float f10 = fArray[n11];
                        fArray[n11] = fArray[i2];
                        fArray[i2] = f10;
                        f10 = fArray2[n11];
                        fArray2[n11] = fArray2[i2];
                        fArray2[i2] = f10;
                    }
                    n15 = n10;
                    n16 = 1;
                }
                for (n14 = (v5847929) >> (v5847930); n11 >= n14; n11 -= n14, n14 >>= 1) {
                    n13 = n14;
                    n12 = 2;
                    if (string == null && string == null) {
                        if (n13 < n12) break;
                        if (string == null) continue;
                    }
                    break block5;
                }
                n13 = n11;
                n12 = n14;
            }
            n11 = n13 + n12;
            if (string == null) continue;
        }
    }

    private void L(int n10, int n11, int n12, float[] fArray, float[] fArray2) {
        int n13;
        String string;
        block7: {
            int n14 = 1;
            int n15 = 0;
            string = uZ.h();
            block0: while (true) {
                int n16 = n15;
                block1: while (n16 < n11) {
                    int n17 = n14;
                    n14 <<= 1;
                    float f10 = (float)n12 * this.D[n15];
                    float f11 = this.U[n15];
                    float f12 = (float)n12 * this.c[n15];
                    float f13 = 1.0f;
                    float f14 = 0.0f;
                    n13 = 0;
                    if (string != null) break block7;
                    int n18 = n13;
                    while (n18 < n17) {
                        block8: {
                            n16 = n18;
                            if (string != null) continue block1;
                            for (int i2 = v5847960; i2 < n10; i2 += n14) {
                                int n19 = i2 + n17;
                                float f15 = fArray[n19];
                                float f16 = fArray2[n19];
                                float f17 = f13 * f15 - f14 * f16;
                                float f18 = f14 * f15 + f13 * f16;
                                fArray[n19] = fArray[i2] - f17;
                                int n20 = i2;
                                fArray[n20] = fArray[n20] + f17;
                                fArray2[n19] = fArray2[i2] - f18;
                                int n21 = i2;
                                fArray2[n21] = fArray2[n21] + f18;
                                if (string == null) {
                                    if (string == null) continue;
                                }
                                break block8;
                            }
                            f10 = f13;
                            f13 = f10 * f11 - f14 * f12 + f13;
                            f14 = f14 * f11 + f10 * f12 + f14;
                            ++n18;
                        }
                        if (string == null) continue;
                    }
                    ++n15;
                    if (string == null) continue block0;
                }
                break;
            }
            n13 = n12;
        }
        if (n13 == -1) {
            float f19 = 1.0f / (float)n10;
            int n22 = 0;
            while (n22 < n10) {
                int n23 = n22;
                fArray[n23] = fArray[n23] * f19;
                int n24 = n22++;
                fArray2[n24] = fArray2[n24] * f19;
                if (string == null) continue;
            }
        }
    }

    public void r(float[] fArray, float[] fArray2, int n10, int n11, boolean n12) {
        String string = uZ.h();
        this.L(n11, fArray, fArray2);
        String string2 = string;
        int n13 = n12;
        if (string2 == null) {
            n13 = n13 != 0 ? 1 : -1;
        }
        this.L(n11, n10, n13, fArray, fArray2);
    }

    public void f(float[] fArray, float[] fArray2, int n10, int n11, boolean bl) {
        int n12;
        int n13;
        float[] fArray3;
        float[] fArray4;
        String string;
        int n14;
        block7: {
            int n15 = this.r(n10);
            n14 = this.r(n11);
            int n16 = Math.max(n11, n10);
            string = uZ.h();
            fArray4 = new float[n16];
            fArray3 = new float[n16];
            for (n13 = 0; n13 < n11; ++n13) {
                n12 = n13 * n10;
                System.arraycopy(fArray, n12, fArray4, 0, n10);
                System.arraycopy(fArray2, n12, fArray3, 0, n10);
                this.r(fArray4, fArray3, n15, n10, bl);
                System.arraycopy(fArray4, 0, fArray, n12, n10);
                System.arraycopy(fArray3, 0, fArray2, n12, n10);
                if (string == null) {
                    if (string == null) continue;
                }
                break block7;
            }
            n13 = 0;
        }
        while (n13 < n10) {
            block9: {
                int n17;
                block8: {
                    n12 = n13;
                    for (n17 = 0; n17 < n11; ++n17) {
                        fArray4[n17] = fArray[n12];
                        fArray3[n17] = fArray2[n12];
                        n12 += n10;
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block8;
                    }
                    this.r(fArray4, fArray3, n14, n11, bl);
                    n12 = n13;
                }
                for (n17 = 0; n17 < n11; ++n17) {
                    fArray[n12] = fArray4[n17];
                    fArray2[n12] = fArray3[n17];
                    n12 += n10;
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block9;
                }
                ++n13;
            }
            if (string == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int r(int n10) {
        int n11 = 1;
        String string = uZ.h();
        int n12 = 0;
        while (n11 < n10) {
            n11 *= 2;
            ++n12;
            if (string != null) return -1;
            if (string == null) continue;
        }
        int n13 = n11;
        if (string != null) return n13;
        if (n13 != n10) return -1;
        n13 = n12;
        return n13;
    }
}

