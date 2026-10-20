/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.P9;
import com.t.e_0;
import com.t.n_0;
import java.awt.Color;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class Q
implements Paint {
    private Color g = Color.RED;
    private boolean D = false;
    private ColorModel C = ColorModel.getRGBdefault();
    private int S;
    private int z;
    private int I;
    private int N;
    private static final long[] a;
    private static final Integer[] b;

    public Q(int n10, int n11, int n12, int n13, Color color) {
        this.S = n10;
        this.z = n11;
        this.I = n12;
        this.N = n13;
        this.g = color;
    }

    @Override
    public PaintContext createContext(ColorModel colorModel, Rectangle rectangle, Rectangle2D rectangle2D, AffineTransform affineTransform, RenderingHints renderingHints) {
        return new e_0(this, affineTransform);
    }

    public Color X(int n10, int n11) {
        block13: {
            int n12;
            int n13;
            block14: {
                int n14;
                block11: {
                    block12: {
                        block10: {
                            block9: {
                                block7: {
                                    block8: {
                                        n14 = n_0.W();
                                        n13 = n10;
                                        n12 = this.S;
                                        if (n14 == 0) break block7;
                                        if (n13 >= n12) break block8;
                                        n10 = this.S;
                                        if (n14 != 0) break block9;
                                    }
                                    n13 = n10;
                                    n12 = this.S + Q.a(6751, 1642532646966100142L);
                                }
                                if (n14 == 0) break block10;
                                if (n13 > n12) {
                                    n10 = this.S + Q.a(29747, 3321551848957079233L);
                                }
                            }
                            n13 = n11;
                            n12 = this.z;
                        }
                        if (n14 == 0) break block11;
                        if (n13 >= n12) break block12;
                        n11 = this.z;
                        if (n14 != 0) break block13;
                    }
                    n13 = n11;
                    n12 = this.z + Q.a(29747, 3321551848957079233L);
                }
                if (n14 == 0) break block14;
                if (n13 <= n12) break block13;
                n13 = this.z;
                n12 = Q.a(29747, 3321551848957079233L);
            }
            n11 = n13 + n12;
        }
        return new Color(this.v(n10, n11), this.G(n10, n11), this.f(n10, n11));
    }

    private int v(int n10, int n11) {
        int n12 = Q.a(11882, 5026002081987179674L) - (Q.a(11882, 5026002081987179674L) - this.g.getRed()) * (n10 - this.S) / this.I;
        n12 -= n12 * (n11 - this.z) / this.N;
        return this.q(n12);
    }

    private int G(int n10, int n11) {
        int n12 = Q.a(11882, 5026002081987179674L) - (Q.a(11882, 5026002081987179674L) - this.g.getGreen()) * (n10 - this.S) / this.I;
        n12 -= n12 * (n11 - this.z) / this.N;
        return this.q(n12);
    }

    private int f(int n10, int n11) {
        int n12 = Q.a(11882, 5026002081987179674L) - (Q.a(11882, 5026002081987179674L) - this.g.getBlue()) * (n10 - this.S) / this.I;
        n12 -= n12 * (n11 - this.z) / this.N;
        return this.q(n12);
    }

    private int q(int n10) {
        int n11;
        block9: {
            block8: {
                int n12;
                block6: {
                    block7: {
                        n12 = n_0.W();
                        n11 = this.D;
                        if (n12 != 0) {
                            if (n11 != 0) {
                                n10 = P9.d(n10);
                            }
                            n11 = n10;
                        }
                        if (n12 == 0) break block6;
                        if (n11 >= 0) break block7;
                        n10 = 0;
                        if (n12 != 0) break block8;
                    }
                    n11 = n10;
                }
                if (n12 == 0) break block9;
                if (n11 > Q.a(10922, 1162464156354719833L)) {
                    n10 = Q.a(11882, 5026002081987179674L);
                }
            }
            n11 = n10;
        }
        return n11;
    }

    @Override
    public int getTransparency() {
        return 1;
    }

    public Color L() {
        return this.g;
    }

    public boolean S() {
        return this.D;
    }

    public void c(boolean bl) {
        this.D = bl;
    }

    static ColorModel m(Q q2) {
        return q2.C;
    }

    static int N(Q q2, int n10, int n11) {
        return q2.v(n10, n11);
    }

    static int n(Q q2, int n10, int n11) {
        return q2.G(n10, n11);
    }

    static int F(Q q2, int n10, int n11) {
        return q2.f(n10, n11);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2216463484755511855L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00e4D\u00e8\u0091&Z\u00e5\u00ee#\u0004Y+u\u00df\u00ba\u0089";
                var5_4 = "\u00e4D\u00e8\u0091&Z\u00e5\u00ee#\u0004Y+u\u00df\u00ba\u0089".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "4\u00ce\u00d9\u0015\u000bB>Jt\u001d\u00f5\u00dd\u00a0\u001f\u008b\u0081";
                    var5_4 = "4\u00ce\u00d9\u0015\u000bB>Jt\u001d\u00f5\u00dd\u00a0\u001f\u008b\u0081".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        Q.a = var6_1;
        Q.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1AF2;
        if (b[n11] == null) {
            Q.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

