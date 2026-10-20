/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.iw_2;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.h8
 */
public class h8_0
extends W5 {
    private float S = 0.0f;
    private float T = 1.0f;
    private float I = 1.0f;
    private float i = 0.0f;
    private float l = 0.0f;
    private boolean x = false;
    private boolean f = true;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public h8_0() {
    }

    public h8_0(float f10, float f11, float f12, float f13) {
        this.I = f10;
        this.S = f11;
        this.l = f12;
        this.i = f13;
    }

    public void F(float f10) {
        this.S = f10;
    }

    public float T() {
        return this.S;
    }

    public void s(float f10) {
        this.I = f10;
    }

    public float f() {
        return this.I;
    }

    public void Z(float f10) {
        this.l = f10;
    }

    public float S() {
        return this.l;
    }

    public void B(float f10) {
        this.i = f10;
    }

    public float r() {
        return this.i;
    }

    public void W(boolean bl) {
        this.x = bl;
    }

    public boolean x() {
        return this.x;
    }

    public void H(boolean bl) {
        this.f = bl;
    }

    public boolean t() {
        return this.f;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        h8_0 h8_02;
        int[] nArray;
        int n10;
        int n11;
        block36: {
            int n12;
            int[] nArray2;
            block21: {
                String[] stringArray;
                block24: {
                    BufferedImage bufferedImage3;
                    block23: {
                        n11 = bufferedImage.getWidth();
                        n10 = bufferedImage.getHeight();
                        stringArray = W5.q();
                        bufferedImage3 = bufferedImage2;
                        if (stringArray == null) break block23;
                        if (bufferedImage3 != null) break block24;
                        bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
                    }
                    bufferedImage2 = bufferedImage3;
                }
                nArray2 = new int[n11 * n10];
                nArray = new int[n11 * n10];
                this.l(bufferedImage, 0, 0, n11, n10, nArray2);
                float f10 = (float)Math.sin(this.S);
                float f11 = (float)Math.cos(this.S);
                int n13 = n11 / 2;
                int n14 = n10 / 2;
                int n15 = 0;
                float f12 = (float)Math.sqrt(n13 * n13 + n14 * n14);
                float f13 = (float)((double)this.I * Math.cos(this.S));
                float f14 = (float)((double)this.I * -Math.sin(this.S));
                float f15 = this.I + Math.abs(this.l * f12) + this.i * f12;
                int n16 = (int)f15;
                AffineTransform affineTransform = new AffineTransform();
                Point2D.Float float_ = new Point2D.Float();
                int n17 = this.f;
                if (stringArray != null) {
                    if (n17 != 0) {
                        NM.g(nArray2, 0, nArray2.length);
                    }
                    n17 = 0;
                }
                int n18 = n17;
                block0: while (true) {
                    int n19 = n18;
                    block1: while (n19 < n10) {
                        n12 = 0;
                        if (stringArray == null) break block21;
                        for (int i2 = v7969843; i2 < n11; ++i2) {
                            block35: {
                                int n20;
                                int n21;
                                int n22;
                                int n23;
                                int n24;
                                block33: {
                                    int n25;
                                    block34: {
                                        block22: {
                                            n24 = 0;
                                            n23 = 0;
                                            n22 = 0;
                                            n21 = 0;
                                            n25 = 0;
                                            n19 = 0;
                                            if (stringArray == null) continue block1;
                                            for (int i3 = v7969639; i3 < n16; ++i3) {
                                                int n26;
                                                block31: {
                                                    int n27;
                                                    int n28;
                                                    block32: {
                                                        block29: {
                                                            block30: {
                                                                block27: {
                                                                    block28: {
                                                                        block25: {
                                                                            block26: {
                                                                                n28 = i2;
                                                                                n27 = n18;
                                                                                float f16 = (float)i3 / (float)n16;
                                                                                float_.x = i2;
                                                                                float_.y = n18;
                                                                                affineTransform.setToIdentity();
                                                                                affineTransform.translate((float)n13 + f16 * f13, (float)n14 + f16 * f14);
                                                                                float f17 = 1.0f - this.i * f16;
                                                                                affineTransform.scale(f17, f17);
                                                                                float f18 = this.l - 0.0f;
                                                                                n20 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                                                                                if (stringArray == null) break block22;
                                                                                if (stringArray != null) {
                                                                                    if (n20 != 0) {
                                                                                        affineTransform.rotate(-this.l * f16);
                                                                                    }
                                                                                    affineTransform.translate(-n13, -n14);
                                                                                    affineTransform.transform(float_, float_);
                                                                                    n28 = (int)float_.x;
                                                                                    n27 = (int)float_.y;
                                                                                    n20 = n28;
                                                                                }
                                                                                if (stringArray == null) break block25;
                                                                                if (n20 < 0) break block26;
                                                                                n20 = n28;
                                                                                if (stringArray == null) break block27;
                                                                                if (n20 < n11) break block28;
                                                                            }
                                                                            n20 = this.x ? 1 : 0;
                                                                        }
                                                                        if (stringArray == null) break block22;
                                                                        if (n20 == 0) break;
                                                                        n28 = NM.r(n28, n11);
                                                                    }
                                                                    n20 = n27;
                                                                }
                                                                if (stringArray == null) break block29;
                                                                if (n20 < 0) break block30;
                                                                n26 = n27;
                                                                if (stringArray == null) break block31;
                                                                if (n26 < n10) break block32;
                                                            }
                                                            n20 = this.x ? 1 : 0;
                                                        }
                                                        if (stringArray == null) break block22;
                                                        if (n20 == 0) break;
                                                        n27 = NM.r(n27, n10);
                                                    }
                                                    ++n25;
                                                    n26 = nArray2[n27 * n11 + n28];
                                                }
                                                int n29 = n26;
                                                n24 += n29 >> h8_0.a(29296, 6107559316641299611L) & h8_0.a(26991, 4514215655147579269L);
                                                n23 += n29 >> h8_0.a(4458, 1685855918660116355L) & h8_0.a(378, 3499936799801757589L);
                                                n22 += n29 >> h8_0.a(30010, 4509896673732082644L) & h8_0.a(378, 3499936799801757589L);
                                                n21 += n29 & h8_0.a(378, 3499936799801757589L);
                                                if (stringArray != null) continue;
                                            }
                                            n20 = n25;
                                        }
                                        if (stringArray == null) break block33;
                                        if (n20 != 0) break block34;
                                        nArray[n15] = nArray2[n15];
                                        if (stringArray != null) break block35;
                                    }
                                    n24 = iw_2.e(n24 / n25);
                                    n23 = iw_2.e(n23 / n25);
                                    n22 = iw_2.e(n22 / n25);
                                    n20 = iw_2.e(n21 / n25);
                                }
                                n21 = n20;
                                nArray[n15] = n24 << h8_0.a(1610, 866871657049376934L) | n23 << h8_0.a(29609, 2721234698614488385L) | n22 << h8_0.a(19978, 544872417342193895L) | n21;
                            }
                            ++n15;
                            if (stringArray != null) continue;
                        }
                        ++n18;
                        if (stringArray != null) continue block0;
                    }
                    break;
                }
                h8_02 = this;
                if (stringArray == null) break block36;
                n12 = h8_02.f;
            }
            if (n12 != 0) {
                NM.L(nArray, 0, nArray2.length);
            }
            h8_02 = this;
        }
        h8_02.E(bufferedImage2, 0, 0, n11, n10, nArray);
        return bufferedImage2;
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
                v0 = "\u0018fsm*@z.ciq%Oy/x(1+".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 125;
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
                                v9 = 39;
                                break;
                            }
                            case 1: {
                                v9 = 119;
                                break;
                            }
                            case 2: {
                                v9 = 123;
                                break;
                            }
                            case 3: {
                                v9 = 98;
                                break;
                            }
                            case 4: {
                                v9 = 120;
                                break;
                            }
                            case 5: {
                                v9 = 112;
                                break;
                            }
                            default: {
                                v9 = 104;
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
                h8_0.a = new String(v10).intern();
                var0_1 = 2132268327520412337L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00b9\u00eb\u0005\u00ea\u00b7?\u0085\u00cb\u00b0\u00ab\"\u009c\u00fa\u00a3\u009e2\u00ebh5\u00dcJ\u00c9\u009f\u00e0\u00cc\u001e\u00dc\u009d\u0085\u0092}\"\u001cv\u008b3x/\u0099m=X\u0081\u00ea\u00fb+\u00ed\u00db";
                var5_5 = "\u00b9\u00eb\u0005\u00ea\u00b7?\u0085\u00cb\u00b0\u00ab\"\u009c\u00fa\u00a3\u009e2\u00ebh5\u00dcJ\u00c9\u009f\u00e0\u00cc\u001e\u00dc\u009d\u0085\u0092}\"\u001cv\u008b3x/\u0099m=X\u0081\u00ea\u00fb+\u00ed\u00db".length();
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
                    var4_4 = "I\u0094\u00fd\u00d3\u00c3\u00e3\u00ea\u000f~E_|\u0080<\u00a2^";
                    var5_5 = "I\u0094\u00fd\u00d3\u00c3\u00e3\u00ea\u000f~E_|\u0080<\u00a2^".length();
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
        h8_0.b = var6_2;
        h8_0.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4EEA;
        if (c[n11] == null) {
            h8_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

