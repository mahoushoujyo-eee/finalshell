/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.gU
 */
public class gu_1
extends W5 {
    private int K = 1;
    private int v = 1;
    private int t = 1;
    private BufferedImage d;
    private boolean U = true;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void e(boolean bl) {
        this.U = bl;
    }

    public boolean A() {
        return this.U;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block10: {
            int n10;
            String[] stringArray;
            int n11;
            int n12;
            block12: {
                BufferedImage bufferedImage3;
                block11: {
                    n12 = bufferedImage.getWidth();
                    n11 = bufferedImage.getHeight();
                    stringArray = W5.q();
                    bufferedImage3 = bufferedImage2;
                    if (stringArray == null) break block11;
                    if (bufferedImage3 != null) break block12;
                    bufferedImage3 = new BufferedImage(n12, n11, 2);
                }
                bufferedImage2 = bufferedImage3;
            }
            int[] nArray = new int[n12 * n11];
            int[] nArray2 = new int[n12 * n11];
            this.l(bufferedImage, 0, 0, n12, n11, nArray);
            int n13 = this.U;
            if (stringArray != null) {
                if (n13 != 0) {
                    NM.g(nArray, 0, nArray.length);
                }
                n13 = n10 = 0;
            }
            while (n10 < this.t) {
                this.R(nArray, nArray2, n12, n11, this.K, 1);
                this.R(nArray2, nArray, n11, n12, this.v, 2);
                ++n10;
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block10;
            }
            gu_1 gu_12 = this;
            if (stringArray != null) {
                if (gu_12.U) {
                    NM.L(nArray, 0, nArray.length);
                }
                gu_12 = this;
            }
            gu_12.E(bufferedImage2, 0, 0, n12, n11, nArray);
        }
        return bufferedImage2;
    }

    @Override
    public BufferedImage createCompatibleDestImage(BufferedImage bufferedImage, ColorModel colorModel) {
        block3: {
            ColorModel colorModel2;
            block2: {
                String[] stringArray = W5.q();
                colorModel2 = colorModel;
                if (stringArray == null) break block2;
                if (colorModel2 != null) break block3;
                colorModel2 = bufferedImage.getColorModel();
            }
            colorModel = colorModel2;
        }
        return new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight()), colorModel.isAlphaPremultiplied(), null);
    }

    @Override
    public Rectangle2D getBounds2D(BufferedImage bufferedImage) {
        return new Rectangle(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
    }

    @Override
    public Point2D getPoint2D(Point2D point2D, Point2D point2D2) {
        String[] stringArray = W5.q();
        Point2D point2D3 = point2D2;
        if (stringArray != null) {
            if (point2D3 == null) {
                point2D2 = new Point2D.Double();
            }
            point2D2.setLocation(point2D.getX(), point2D.getY());
            point2D3 = point2D2;
        }
        return point2D3;
    }

    @Override
    public RenderingHints getRenderingHints() {
        return null;
    }

    public void R(int[] nArray, int[] nArray2, int n10, int n11, int n12, int n13) {
        int n14 = n10 - 1;
        int[] nArray3 = new int[n10];
        int[] nArray4 = new int[n10];
        int[] nArray5 = new int[n10];
        int[] nArray6 = new int[n10];
        int[] nArray7 = new int[n10];
        String[] stringArray = W5.q();
        int n15 = 0;
        for (int i2 = 0; i2 < n11; ++i2) {
            int n16 = i2;
            BufferedImage bufferedImage = this.d;
            block1: while (true) {
                int n17;
                int n18;
                block19: {
                    int n19;
                    block20: {
                        block21: {
                            if (bufferedImage == null) break block20;
                            if (n13 != 1) break block21;
                            this.l(this.d, 0, i2, n10, 1, nArray7);
                            if (stringArray != null) break block20;
                        }
                        this.l(this.d, i2, 0, 1, n10, nArray7);
                    }
                    n18 = 0;
                    while (n18 < n10) {
                        n17 = nArray[n15 + n18];
                        nArray6[n18] = n17 >> gu_1.a(809, 2599659608606802642L) & gu_1.a(13178, 5627020562749928069L);
                        nArray3[n18] = n17 >> gu_1.a(9686, 2672784213075764271L) & gu_1.a(1226, 8354698696482981172L);
                        nArray4[n18] = n17 >> gu_1.a(9470, 4241176921147254019L) & gu_1.a(1226, 8354698696482981172L);
                        nArray5[n18] = n17 & gu_1.a(1226, 8354698696482981172L);
                        if (stringArray != null) {
                            n19 = n18;
                            if (stringArray == null) break block19;
                            if (n19 != 0) {
                                int n20 = n18;
                                nArray6[n20] = nArray6[n20] + nArray6[n18 - 1];
                                int n21 = n18;
                                nArray3[n21] = nArray3[n21] + nArray3[n18 - 1];
                                int n22 = n18;
                                nArray4[n22] = nArray4[n22] + nArray4[n18 - 1];
                                int n23 = n18;
                                nArray5[n23] = nArray5[n23] + nArray5[n18 - 1];
                            }
                            ++n18;
                        }
                        if (stringArray != null) continue;
                    }
                    n19 = n18 = 0;
                }
                while (n18 < n10) {
                    int n24;
                    int n25;
                    block25: {
                        int n26;
                        block26: {
                            block27: {
                                block22: {
                                    int n27;
                                    int n28;
                                    block23: {
                                        block24: {
                                            bufferedImage = this.d;
                                            if (stringArray == null) continue block1;
                                            if (bufferedImage == null) break block22;
                                            n28 = n13;
                                            n27 = 1;
                                            if (stringArray == null) break block23;
                                            if (n28 != n27) break block24;
                                            n17 = (int)((float)((nArray7[n18] & gu_1.a(1226, 8354698696482981172L)) * this.K) / 255.0f);
                                            if (stringArray != null) break block25;
                                        }
                                        n28 = nArray7[n18] & gu_1.a(1226, 8354698696482981172L);
                                        n27 = this.v;
                                    }
                                    n17 = (int)((float)(n28 * n27) / 255.0f);
                                    if (stringArray != null) break block25;
                                }
                                n26 = n13;
                                if (stringArray == null) break block26;
                                if (n26 != 1) break block27;
                                n17 = (int)(this.v(n18, i2, n10, n11) * (float)this.K);
                                if (stringArray != null) break block25;
                            }
                            n26 = (int)(this.v(i2, n18, n11, n10) * (float)this.v);
                        }
                        n17 = n26;
                    }
                    int n29 = 2 * n17 + 1;
                    int n30 = 0;
                    int n31 = 0;
                    int n32 = 0;
                    int n33 = 0;
                    int n34 = n25 = n18 + n17;
                    int n35 = n14;
                    if (stringArray != null) {
                        if (n34 > n35) {
                            n24 = n25 - n14;
                            int n36 = n14;
                            n30 += (nArray6[n36] - nArray6[n36 - 1]) * n24;
                            n31 += (nArray3[n36] - nArray3[n36 - 1]) * n24;
                            n32 += (nArray4[n36] - nArray4[n36 - 1]) * n24;
                            n33 += (nArray5[n36] - nArray5[n36 - 1]) * n24;
                            n25 = n14;
                        }
                        n34 = n18 - n17;
                        n35 = 1;
                    }
                    int n37 = n24 = n34 - n35;
                    if (stringArray != null) {
                        if (n37 < 0) {
                            n30 -= nArray6[0] * n24;
                            n31 -= nArray3[0] * n24;
                            n32 -= nArray4[0] * n24;
                            n33 -= nArray5[0] * n24;
                            n24 = 0;
                        }
                        nArray2[n16] = (n30 += nArray6[n25] - nArray6[n24]) / n29 << gu_1.a(5244, 7709163281894118788L) | (n31 += nArray3[n25] - nArray3[n24]) / n29 << gu_1.a(27006, 2378830329643690116L) | (n32 += nArray4[n25] - nArray4[n24]) / n29 << gu_1.a(26904, 6658203400421370084L) | (n33 += nArray5[n25] - nArray5[n24]) / n29;
                        n37 = n16 + n11;
                    }
                    n16 = n37;
                    ++n18;
                    if (stringArray != null) continue;
                }
                break;
            }
            n15 += n10;
            if (stringArray != null) continue;
        }
    }

    protected float v(int n10, int n11, int n12, int n13) {
        return (float)n10 / (float)n12;
    }

    public void V(int n10) {
        this.K = n10;
    }

    public int A() {
        return this.K;
    }

    public void c(int n10) {
        this.v = n10;
    }

    public int Z() {
        return this.v;
    }

    public void a(int n10) {
        this.K = this.v = n10;
    }

    public int g() {
        return this.K;
    }

    public void U(int n10) {
        this.t = n10;
    }

    public int e() {
        return this.t;
    }

    public void G(BufferedImage bufferedImage) {
        this.d = bufferedImage;
    }

    public BufferedImage R() {
        return this.d;
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
                v0 = "eI\u00114\u0001r9UL\u0005$BAxeI\u00114\u0000\nv".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 72;
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
                                v9 = 111;
                                break;
                            }
                            case 1: {
                                v9 = 109;
                                break;
                            }
                            case 2: {
                                v9 = 44;
                                break;
                            }
                            case 3: {
                                v9 = 14;
                                break;
                            }
                            case 4: {
                                v9 = 102;
                                break;
                            }
                            case 5: {
                                v9 = 108;
                                break;
                            }
                            default: {
                                v9 = 16;
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
                gu_1.a = new String(v10).intern();
                var0_1 = 3874481496640463265L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00ed?\u00f2\u00f2\u00d6\u0085\u0004\u00aa\u001b\u0087HC\u00fc}\u00c9M\u00f1\u008d\u009ac\u00ca\u0093\u0013\u00db\u00fd\u00c3z\u00a9\u00b9]\u00a4j!2W=\u001d\u00b3\u0005\u009e\u00adh\u00c7~D\u00dc\u00b4=";
                var5_5 = "\u00ed?\u00f2\u00f2\u00d6\u0085\u0004\u00aa\u001b\u0087HC\u00fc}\u00c9M\u00f1\u008d\u009ac\u00ca\u0093\u0013\u00db\u00fd\u00c3z\u00a9\u00b9]\u00a4j!2W=\u001d\u00b3\u0005\u009e\u00adh\u00c7~D\u00dc\u00b4=".length();
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
                    var4_4 = "F\u00db\u00e0\u0098C\u00e4\u00a3kC\u00dcr\u00d4{BI5";
                    var5_5 = "F\u00db\u00e0\u0098C\u00e4\u00a3kC\u00dcr\u00d4{BI5".length();
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
        gu_1.b = var6_2;
        gu_1.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1FD;
        if (c[n11] == null) {
            gu_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

