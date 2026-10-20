/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.gy_2;
import com.p9_0;
import java.awt.Point;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.g8
 */
public class g8_0
extends gy_2 {
    private float W = 1.0f;
    private float n = 1.0f;
    private float N = 2.0f;
    private p9_0[] w;
    private p9_0[] G;
    private p9_0[] e;
    private float b;
    private float R;
    private static final String a;

    public void I(float f10) {
        this.W = f10;
    }

    public float R() {
        return this.W;
    }

    public void W(float f10) {
        this.n = f10;
    }

    public float j() {
        return this.n;
    }

    public void U(float f10) {
        this.N = f10;
    }

    public float M() {
        return this.N;
    }

    public void d(p9_0[] p9_0Array) {
        this.w = p9_0Array;
    }

    public p9_0[] K() {
        return this.w;
    }

    public void K(p9_0[] p9_0Array) {
        this.G = p9_0Array;
    }

    public p9_0[] E() {
        return this.G;
    }

    protected void B(int n10, int n11, Point point) {
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        block3: {
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.001f;
            float f14 = 1.5f * this.N + 0.5f;
            float f15 = this.n;
            float f16 = 0.0f;
            float f17 = 0.0f;
            String[] stringArray = W5.q();
            float f18 = 0.0f;
            for (int i2 = 0; i2 < this.w.length; ++i2) {
                float f19;
                float f20;
                p9_0 p9_02;
                p9_0 p9_03;
                block6: {
                    float f21;
                    block9: {
                        block10: {
                            float f22;
                            block7: {
                                block8: {
                                    float f23;
                                    float f24;
                                    block4: {
                                        float f25;
                                        block5: {
                                            p9_03 = this.w[i2];
                                            p9_02 = this.e[i2];
                                            f24 = n10 - p9_02.i;
                                            f23 = n11 - p9_02.l;
                                            f12 = (f24 * (float)p9_02.z + f23 * (float)p9_02.G) / p9_02.f;
                                            f20 = (f23 * (float)p9_02.z - f24 * (float)p9_02.G) / p9_02.V;
                                            if (stringArray == null) break block3;
                                            float f26 = f12 - 0.0f;
                                            f22 = f26 == 0.0f ? 0 : (f26 < 0.0f ? -1 : 1);
                                            if (stringArray == null) break block4;
                                            if (f22 > 0) break block5;
                                            f19 = (float)Math.sqrt(f24 * f24 + f23 * f23);
                                            if (stringArray != null) break block6;
                                        }
                                        f22 = (f25 = f12 - 1.0f) == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                                    }
                                    if (stringArray == null) break block7;
                                    if (f22 < 0) break block8;
                                    f24 = n10 - p9_02.q;
                                    f23 = n11 - p9_02.W;
                                    f19 = (float)Math.sqrt(f24 * f24 + f23 * f23);
                                    if (stringArray != null) break block6;
                                }
                                f21 = f20;
                                if (stringArray == null) break block9;
                                float f27 = f21 - 0.0f;
                                f22 = f27 == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1);
                            }
                            if (f22 < 0) break block10;
                            f19 = f20;
                            if (stringArray != null) break block6;
                        }
                        f21 = -f20;
                    }
                    f19 = f21;
                }
                f10 = (float)p9_03.i + f12 * (float)p9_03.z - f20 * (float)p9_03.G / p9_03.V;
                f11 = (float)p9_03.l + f12 * (float)p9_03.G + f20 * (float)p9_03.z / p9_03.V;
                float f28 = (float)Math.pow(Math.pow(p9_02.V, f15) / (double)(f13 + f19), f14);
                f17 += (f10 - (float)n10) * f28;
                f18 += (f11 - (float)n11) * f28;
                f16 += f28;
                if (stringArray != null) continue;
            }
            fArray[0] = (float)n10 + f17 / f16 + 0.5f;
            fArray[1] = (float)n11 + f18 / f16 + 0.5f;
        }
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block5: {
            block3: {
                String[] stringArray;
                block6: {
                    g8_0 g8_02;
                    p9_0[] p9_0Array;
                    block4: {
                        this.b = this.b;
                        stringArray = W5.q();
                        this.R = this.R;
                        p9_0Array = this.w;
                        if (stringArray == null) break block4;
                        if (p9_0Array == null) break block5;
                        g8_02 = this;
                        if (stringArray == null) break block6;
                        p9_0Array = g8_02.G;
                    }
                    if (p9_0Array == null) break block5;
                    g8_02 = this;
                }
                g8_02.e = new p9_0[this.w.length];
                for (int i2 = 0; i2 < this.w.length; ++i2) {
                    p9_0 p9_02 = this.e[i2] = new p9_0(NM.Q(this.W, this.w[i2].i, this.G[i2].i), NM.Q(this.W, this.w[i2].l, this.G[i2].l), NM.Q(this.W, this.w[i2].q, this.G[i2].q), NM.Q(this.W, this.w[i2].W, this.G[i2].W));
                    p9_02.o();
                    this.w[i2].o();
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block3;
                }
                bufferedImage2 = super.filter(bufferedImage, bufferedImage2);
                this.e = null;
            }
            return bufferedImage2;
        }
        return bufferedImage;
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
                char[] cArray3 = "UxR\u001dH9q>WH\fK/%FpS\u0019\te+".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 113;
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
                            n17 = 96;
                            break;
                        }
                        case 1: {
                            n17 = 96;
                            break;
                        }
                        case 2: {
                            n17 = 80;
                            break;
                        }
                        case 3: {
                            n17 = 24;
                            break;
                        }
                        case 4: {
                            n17 = 86;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 116;
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

