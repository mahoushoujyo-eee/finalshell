/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.iw_2;
import com.po_0;
import com.wy_1;
import java.awt.Point;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hH
 */
public class hh_1
extends W5 {
    private float A = 0.0f;
    private int l;
    private int C;
    private Point j;
    private Point u;
    private boolean V;
    private float X;
    private float N;
    private float P;
    private float T;
    private po_0 S;
    private int w;
    private int b;
    private int v;
    private static final String a;
    private static final long[] c;
    private static final Integer[] d;

    public hh_1() {
        this.l = hh_1.a(6762, 8470716206035906385L);
        this.C = -1;
        this.j = new Point(0, 0);
        this.u = new Point(hh_1.a(27384, 6998446904661794753L), hh_1.a(8019, 5472921053428853355L));
        this.V = false;
        this.S = null;
        this.b = 0;
        this.v = 1;
    }

    public hh_1(Point point, Point point2, int n10, int n11, boolean bl, int n12, int n13) {
        this.l = hh_1.a(29941, 1210445150781686223L);
        this.C = -1;
        this.j = new Point(0, 0);
        this.u = new Point(hh_1.a(8019, 5472921053428853355L), hh_1.a(8019, 5472921053428853355L));
        this.V = false;
        this.S = null;
        this.b = 0;
        this.v = 1;
        this.j = point;
        this.u = point2;
        this.l = n10;
        this.C = n11;
        this.V = bl;
        this.w = n12;
        this.b = n13;
        this.S = new wy_1(n10, n11);
    }

    public void j(Point point) {
        this.j = point;
    }

    public Point W() {
        return this.j;
    }

    public void W(Point point) {
        this.u = point;
    }

    public Point D() {
        return this.u;
    }

    public void r(int n10) {
        this.w = n10;
    }

    public int A() {
        return this.w;
    }

    public void A(int n10) {
        this.b = n10;
    }

    public int G() {
        return this.b;
    }

    public void W(float f10) {
        this.A = f10;
        this.u = new Point((int)(64.0 * Math.cos(f10)), (int)(64.0 * Math.sin(f10)));
    }

    public float g() {
        return this.A;
    }

    public void r(po_0 po_02) {
        this.S = po_02;
    }

    public po_0 C() {
        return this.S;
    }

    public void U(int n10) {
        this.v = n10;
    }

    public int e() {
        return this.v;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        float f10;
        int n10;
        String[] stringArray;
        int n11;
        block23: {
            float f11;
            float f12;
            block24: {
                float f13;
                float f14;
                float f15;
                float f16;
                block22: {
                    int n12;
                    int n13;
                    float f17;
                    block20: {
                        block21: {
                            block19: {
                                BufferedImage bufferedImage3;
                                block18: {
                                    n11 = bufferedImage.getWidth();
                                    stringArray = W5.q();
                                    n10 = bufferedImage.getHeight();
                                    bufferedImage3 = bufferedImage2;
                                    if (stringArray == null) break block18;
                                    if (bufferedImage3 != null) break block19;
                                    bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
                                }
                                bufferedImage2 = bufferedImage3;
                            }
                            f16 = this.j.x;
                            f15 = this.u.x;
                            f17 = f16 == f15 ? 0 : (f16 > f15 ? 1 : -1);
                            if (stringArray == null) break block20;
                            if (f17 <= 0) break block21;
                            f17 = this.w;
                            if (stringArray == null) break block20;
                            if (f17 == 2) break block21;
                            f14 = f16;
                            f16 = f15;
                            f15 = f14;
                            f14 = this.u.y;
                            f13 = this.j.y;
                            n13 = this.C;
                            n12 = this.l;
                            if (stringArray != null) break block22;
                        }
                        f17 = this.j.y;
                    }
                    f14 = f17;
                    f13 = this.u.y;
                    n13 = this.l;
                    n12 = this.C;
                }
                f12 = f15 - f16;
                f11 = f13 - f14;
                float f18 = f12 * f12 + f11 * f11;
                this.X = f16;
                this.N = f14;
                float f19 = f18 - Float.MIN_VALUE;
                f10 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                if (stringArray == null) break block23;
                if (f10 < 0) break block24;
                f12 /= f18;
                f11 /= f18;
                f10 = (float)this.V;
                if (stringArray == null) break block23;
                if (f10 != false) {
                    f12 %= 1.0f;
                    f11 %= 1.0f;
                }
            }
            this.P = f12;
            this.T = f11;
            f10 = n11;
        }
        int[] nArray = new int[f10];
        for (int i2 = 0; i2 < n10; ++i2) {
            this.l(bufferedImage, 0, i2, n11, 1, nArray);
            hh_1 hh_12 = this;
            if (stringArray != null) {
                switch (hh_12.w) {
                    case 0: 
                    case 1: {
                        this.N(nArray, i2, n11, 1);
                        if (stringArray != null) break;
                    }
                    case 2: {
                        this.d(nArray, i2, n11, 1);
                        if (stringArray != null) break;
                    }
                    case 3: 
                    case 4: {
                        this.e(nArray, i2, n11, 1);
                        if (stringArray != null) break;
                    }
                    case 5: {
                        this.O(nArray, i2, n11, 1);
                    }
                }
                hh_12 = this;
            }
            hh_12.E(bufferedImage2, 0, i2, n11, 1, nArray);
            if (stringArray != null) continue;
        }
        return bufferedImage2;
    }

    private void x(int[] nArray, int n10, int n11, float f10, float f11, float f12) {
        int n12 = 0;
        String[] stringArray = W5.q();
        int n13 = 0;
        block0: while (true) {
            int n14 = n13;
            int n15 = n11;
            block1: while (n14 < n15) {
                float f13 = f10;
                int n16 = n10;
                while (--n16 >= 0) {
                    int n17;
                    block7: {
                        int n18;
                        block5: {
                            block6: {
                                n18 = this.w;
                                if (stringArray == null) break block5;
                                n15 = 1;
                                if (stringArray == null) continue block1;
                                if (n18 != n15) break block6;
                                n17 = this.S.D(this.V(NM.l(f13)));
                                if (stringArray != null) break block7;
                            }
                            n18 = this.S.D(this.V(NM.i(f13, 1.0f)));
                        }
                        n17 = n18;
                    }
                    nArray[n12] = iw_2.P(n17, nArray[n12], this.v);
                    ++n12;
                    f13 += f11;
                    if (stringArray != null) continue;
                }
                f10 += f12;
                ++n13;
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void I(int[] nArray, int n10, int n11, float f10, float f11, float f12) {
        int n12 = 0;
        String[] stringArray = W5.q();
        for (int i2 = 0; i2 < n11; f10 += f12, ++i2) {
            int n13;
            int n14;
            block21: {
                int n15;
                block19: {
                    block20: {
                        block13: {
                            float f13 = f10;
                            n14 = n10;
                            double d2 = (double)f13 - 0.0;
                            double d3 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                            boolean bl = true;
                            do {
                                block18: {
                                    int n16;
                                    block16: {
                                        block17: {
                                            block15: {
                                                double d4;
                                                block14: {
                                                    if (!bl || (bl = false)) break block14;
                                                    if (stringArray == null) break block15;
                                                    if (d3 <= 0) {
                                                        n13 = this.S.D(0.0f);
                                                        do {
                                                            nArray[n12] = iw_2.P(n13, nArray[n12], this.v);
                                                            ++n12;
                                                        } while (--n14 > 0 && (double)(f13 += f11) <= 0.0);
                                                    }
                                                }
                                                d3 = (d4 = (double)f13 - 1.0) == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                                            }
                                            if (d3 >= 0) break;
                                            n15 = --n14;
                                            if (stringArray == null || stringArray == null) break block13;
                                            if (n15 < 0) break;
                                            n16 = this.w;
                                            if (stringArray == null) break block16;
                                            if (n16 != 1) break block17;
                                            n13 = this.S.D(this.V(NM.l(f13)));
                                            if (stringArray != null) break block18;
                                        }
                                        n16 = this.S.D(this.V(f13));
                                    }
                                    n13 = n16;
                                }
                                nArray[n12] = iw_2.P(n13, nArray[n12], this.v);
                                ++n12;
                                f13 += f11;
                            } while (stringArray != null);
                            n15 = n14;
                        }
                        if (stringArray != null) {
                            if (n15 <= 0) continue;
                            n15 = this.w;
                        }
                        if (stringArray == null) break block19;
                        if (n15 != 1) break block20;
                        n13 = this.S.D(0.0f);
                        if (stringArray != null) break block21;
                    }
                    n15 = this.S.D(1.0f);
                }
                n13 = n15;
            }
            do {
                nArray[n12] = iw_2.P(n13, nArray[n12], this.v);
                ++n12;
            } while (--n14 > 0);
            if (stringArray != null) continue;
        }
    }

    private void N(int[] nArray, int n10, int n11, int n12) {
        block4: {
            hh_1 hh_12;
            float f10;
            block2: {
                block3: {
                    boolean bl = false;
                    String[] stringArray = W5.q();
                    f10 = ((float)bl - this.X) * this.P + ((float)n10 - this.N) * this.T;
                    hh_12 = this;
                    if (stringArray == null) break block2;
                    if (!hh_12.V) break block3;
                    this.x(nArray, n11, n12, f10, this.P, this.T);
                    if (stringArray != null) break block4;
                }
                hh_12 = this;
            }
            hh_12.I(nArray, n11, n12, f10, this.P, this.T);
        }
    }

    private void d(int[] nArray, int n10, int n11, int n12) {
        int n13 = 0;
        float f10 = this.x(this.u.x - this.j.x, this.u.y - this.j.y);
        String[] stringArray = W5.q();
        for (int i2 = 0; i2 < n11; ++i2) {
            int n14;
            block8: {
                float f11;
                block7: {
                    block5: {
                        double d2;
                        block6: {
                            float f12 = this.x(i2 - this.j.x, n10 - this.j.y);
                            f11 = f12 / f10;
                            n14 = this.V;
                            if (stringArray == null) break block5;
                            if (n14 == 0) break block6;
                            f11 %= 2.0f;
                            if (stringArray != null) break block7;
                        }
                        n14 = (d2 = (double)f11 - 1.0) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                    }
                    if (stringArray == null) break block8;
                    if (n14 > 0) {
                        f11 = 1.0f;
                    }
                }
                n14 = this.S.D(this.V(f11));
            }
            int n15 = n14;
            nArray[n13] = iw_2.P(n15, nArray[n13], this.v);
            ++n13;
            if (stringArray != null) continue;
        }
    }

    private void O(int[] nArray, int n10, int n11, int n12) {
        int n13 = 0;
        String[] stringArray = W5.q();
        float f10 = Math.max(Math.abs(this.u.x - this.j.x), Math.abs(this.u.y - this.j.y));
        for (int i2 = 0; i2 < n11; ++i2) {
            int n14;
            block8: {
                float f11;
                block7: {
                    block5: {
                        double d2;
                        block6: {
                            float f12 = Math.max(Math.abs(i2 - this.j.x), Math.abs(n10 - this.j.y));
                            f11 = f12 / f10;
                            n14 = this.V;
                            if (stringArray == null) break block5;
                            if (n14 == 0) break block6;
                            f11 %= 2.0f;
                            if (stringArray != null) break block7;
                        }
                        n14 = (d2 = (double)f11 - 1.0) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                    }
                    if (stringArray == null) break block8;
                    if (n14 > 0) {
                        f11 = 1.0f;
                    }
                }
                n14 = this.S.D(this.V(f11));
            }
            int n15 = n14;
            nArray[n13] = iw_2.P(n15, nArray[n13], this.v);
            ++n13;
            if (stringArray != null) continue;
        }
    }

    private void e(int[] nArray, int n10, int n11, int n12) {
        int n13 = 0;
        String[] stringArray = W5.q();
        float f10 = (float)Math.atan2(this.u.x - this.j.x, this.u.y - this.j.y);
        for (int i2 = 0; i2 < n11; ++i2) {
            float f11 = (float)(Math.atan2(i2 - this.j.x, n10 - this.j.y) - (double)f10) / ((float)Math.PI * 2);
            f11 += 1.0f;
            f11 %= 1.0f;
            int n14 = this.w;
            if (stringArray != null) {
                if (n14 == 4) {
                    f11 = NM.l(f11);
                }
                n14 = this.S.D(this.V(f11));
            }
            int n15 = n14;
            nArray[n13] = iw_2.P(n15, nArray[n13], this.v);
            ++n13;
            if (stringArray != null) continue;
        }
    }

    private float V(float f10) {
        String[] stringArray = W5.q();
        int n10 = this.V;
        if (stringArray != null) {
            if (n10 != 0) {
                float f11 = f10;
                if (stringArray != null) {
                    f11 = (double)f11 > 1.0 ? 2.0f - f10 : f10;
                }
                f10 = f11;
            }
            n10 = this.b;
        }
        switch (n10) {
            case 1: {
                f10 = NM.P(NM.X(f10, 0.0f, 1.0f));
                if (stringArray != null) break;
            }
            case 2: {
                f10 = NM.q(NM.X(f10, 0.0f, 1.0f));
                if (stringArray != null) break;
            }
            case 3: {
                f10 = NM.k(0.0f, 1.0f, f10);
            }
        }
        return f10;
    }

    private float x(float f10, float f11) {
        return (float)Math.sqrt(f10 * f10 + f11 * f11);
    }

    public String toString() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "_iX(\\PXb|T$K\u0011k0[Y!BQ1>".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 104;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 120;
                                break;
                            }
                            case 1: {
                                v9 = 117;
                                break;
                            }
                            case 2: {
                                v9 = 88;
                                break;
                            }
                            case 3: {
                                v9 = 37;
                                break;
                            }
                            case 4: {
                                v9 = 70;
                                break;
                            }
                            case 5: {
                                v9 = 23;
                                break;
                            }
                            default: {
                                v9 = 119;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                hh_1.a = new String(v10).intern();
                var0_1 = 9070750587747201989L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "\u00b7\u00ab\u0096\fM\u00b4Y\u00ee\u00ad\u00ee\u00c5r\u00a7\u001a,D";
                var5_5 = "\u00b7\u00ab\u0096\fM\u00b4Y\u00ee\u00ad\u00ee\u00c5r\u00a7\u001a,D".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "6\u00b5\r\u00fb\u00ab\u00b9\u00b2\nO\u00fc<`N<\\\u0094";
                    var5_5 = "6\u00b5\r\u00fb\u00ab\u00b9\u00b2\nO\u00fc<`N<\\\u0094".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        hh_1.c = var6_2;
        hh_1.d = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3538;
        if (d[n11] == null) {
            hh_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

