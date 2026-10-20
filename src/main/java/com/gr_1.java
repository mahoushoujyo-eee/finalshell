/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import com.uZ;

/*
 * Renamed from com.gR
 */
public class gr_1
extends gy_2 {
    private float V = 32.0f;
    private float k = 1.0f;
    private float B = 0.0f;
    private float v = 1.0f;
    private float s = 1.0f;
    private float T = 0.0f;
    private float w = 1.0f;
    private float o = 0.0f;
    private float F = 0.0f;
    private float g = 1.0f;
    private static final String a;

    public void D(float f10) {
        this.v = f10;
    }

    public float k() {
        return this.v;
    }

    public void e(float f10) {
        this.V = f10;
    }

    public float v() {
        return this.V;
    }

    public void J(float f10) {
        this.k = f10;
    }

    public float U() {
        return this.k;
    }

    public void Q(float f10) {
        this.B = f10;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.w = f11;
        this.o = f12;
        this.F = -f12;
        this.g = f11;
    }

    public float K() {
        return this.B;
    }

    public void q(float f10) {
        this.s = f10;
    }

    public float g() {
        return this.s;
    }

    public void M(float f10) {
        this.T = f10;
    }

    public float M() {
        return this.T;
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        block4: {
            float f10;
            float f11;
            block2: {
                block3: {
                    f11 = this.w * (float)n10 + this.o * (float)n11;
                    f10 = this.F * (float)n10 + this.g * (float)n11;
                    String[] stringArray = W5.q();
                    f11 /= this.V;
                    f10 /= this.V * this.k;
                    if (stringArray == null) break block2;
                    if (this.s != 1.0f) break block3;
                    fArray[0] = (float)n10 + this.v * uZ.G(f11 + 0.5f, f10, this.T);
                    fArray[1] = (float)n11 + this.v * uZ.G(f11, f10 + 0.5f, this.T);
                    if (stringArray != null) break block4;
                }
                fArray[0] = (float)n10 + this.v * uZ.b(f11 + 0.5f, f10, this.s, this.T);
            }
            fArray[1] = (float)n11 + this.v * uZ.b(f11, f10 + 0.5f, this.s, this.T);
        }
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
                char[] cArray3 = "$_<H_q#Oe8U]-yN".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 59;
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
                            n17 = 91;
                            break;
                        }
                        case 1: {
                            n17 = 13;
                            break;
                        }
                        case 2: {
                            n17 = 116;
                            break;
                        }
                        case 3: {
                            n17 = 7;
                            break;
                        }
                        case 4: {
                            n17 = 11;
                            break;
                        }
                        case 5: {
                            n17 = 56;
                            break;
                        }
                        default: {
                            n17 = 108;
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

