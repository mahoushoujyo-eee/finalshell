/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;
import com.uZ;
import java.awt.geom.Point2D;

/*
 * Renamed from com.hR
 */
public class hr_1
extends hn_1 {
    private int h = (int)c;
    private float k;
    private float e = 1.0f;
    private float v = 0.2f;
    private float W = 0.1f;
    private int t = -1;
    private int F;
    private int U;
    private float C = 0.5f;
    private float Y = 0.5f;
    private float r = 1.6f;
    private float s = 0.03f;
    private float b = 0.006f;
    private float X = 0.5f;
    private float V = 6.0f;
    private float P;
    private float p;
    private float B;
    private static final String a;
    private static final long c;

    public hr_1() {
        this.f(50.0f);
    }

    public void k(int n10) {
        this.t = n10;
    }

    public int M() {
        return this.t;
    }

    public void P(float f10) {
        this.r = f10;
    }

    public float J() {
        return this.r;
    }

    public void D(float f10) {
        this.e = f10;
    }

    public float s() {
        return this.e;
    }

    public void V(float f10) {
        this.v = f10;
    }

    public float V() {
        return this.v;
    }

    public void s(float f10) {
        this.W = f10;
    }

    public float U() {
        return this.W;
    }

    public void F(Point2D point2D) {
        this.C = (float)point2D.getX();
        this.Y = (float)point2D.getY();
    }

    public Point2D h() {
        return new Point2D.Float(this.C, this.Y);
    }

    public void f(float f10) {
        this.k = f10;
        this.P = f10 / 3.0f;
    }

    public float P() {
        return this.k;
    }

    @Override
    public void C(int n10, int n11) {
        this.F = n10;
        this.U = n11;
        this.p = this.C * (float)n10;
        this.B = this.Y * (float)n11;
        super.C(n10, n11);
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        block9: {
            float f15;
            float f16;
            block7: {
                block8: {
                    String[] stringArray;
                    block5: {
                        float f17;
                        block6: {
                            float f18;
                            block4: {
                                f14 = (float)n10 - this.p;
                                f13 = (float)n11 - this.B;
                                f12 = (float)Math.sqrt(f14 * f14 + f13 * f13);
                                f11 = (float)Math.exp(-f12 * f12 * this.b) * this.X + (float)Math.exp(-f12 * this.s) * (1.0f - this.X);
                                f11 *= this.e;
                                stringArray = W5.q();
                                float f19 = f12 - (this.k + this.r);
                                f18 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                if (stringArray == null) break block4;
                                if (f18 > 0) {
                                    f11 = NM.J((f12 - (this.k + this.r)) / this.V, f11, 0.0f);
                                }
                                f17 = f12;
                                if (stringArray == null) break block5;
                                float f20 = f17 - (this.k - this.r);
                                f18 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                            }
                            if (f18 < 0) break block6;
                            f16 = f12;
                            f15 = this.k + this.r;
                            if (stringArray == null) break block7;
                            if (!(f16 > f15)) break block8;
                        }
                        f17 = f10 = 0.0f;
                    }
                    if (stringArray != null) break block9;
                }
                f16 = Math.abs(f12 - this.k);
                f15 = this.r;
            }
            f10 = f16 / f15;
            f10 = 1.0f - f10 * f10 * (3.0f - 2.0f * f10);
            f10 *= this.v;
        }
        f11 += f10;
        float f21 = (float)Math.atan2(f14, f13) + (float)Math.PI;
        f21 = (NM.i(f21 / (float)Math.PI * 17.0f + 1.0f + uZ.x(f21 * 10.0f), 1.0f) - 0.5f) * 2.0f;
        f21 = Math.abs(f21);
        f21 = (float)Math.pow(f21, 5.0);
        float f22 = this.W * f21 / (1.0f + f12 * 0.1f);
        f11 += f22;
        f11 = NM.X(f11, 0.0f, 1.0f);
        return NM.n(f11, n12, this.t);
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
                char[] cArray3 = "#\n; \u001a?X_8.-\u0001 \u0013^P".toCharArray();
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
                            n17 = 87;
                            break;
                        }
                        case 1: {
                            n17 = 89;
                            break;
                        }
                        case 2: {
                            n17 = 101;
                            break;
                        }
                        case 3: {
                            n17 = 107;
                            break;
                        }
                        case 4: {
                            n17 = 84;
                            break;
                        }
                        case 5: {
                            n17 = 98;
                            break;
                        }
                        default: {
                            n17 = 26;
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
        long l2 = 2128575396354611125L;
        c = 0x67897340995A5787L ^ l2;
    }
}

