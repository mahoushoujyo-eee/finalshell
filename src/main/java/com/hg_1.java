/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.iw_2;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

/*
 * Renamed from com.hG
 */
public class hg_1
extends W5 {
    public static int g;
    public static int Y;
    public static int M;
    protected Kernel d = null;
    protected boolean K = true;
    protected boolean J = true;
    private int f = Y;
    private static final String a;
    private static final long[] h;
    private static final Integer[] i;

    public hg_1() {
        this(new float[hg_1.a(17144, 1471952460650239192L)]);
    }

    public hg_1(float[] fArray) {
        this(new Kernel(3, 3, fArray));
    }

    public hg_1(int n10, int n11, float[] fArray) {
        this(new Kernel(n11, n10, fArray));
    }

    public hg_1(Kernel kernel) {
        this.d = kernel;
    }

    public void M(Kernel kernel) {
        this.d = kernel;
    }

    public Kernel Y() {
        return this.d;
    }

    public void s(int n10) {
        this.f = n10;
    }

    public int p() {
        return this.f;
    }

    public void i(boolean bl) {
        this.K = bl;
    }

    public boolean v() {
        return this.K;
    }

    public void X(boolean bl) {
        this.J = bl;
    }

    public boolean X() {
        return this.J;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        hg_1 hg_12;
        int[] nArray;
        int n10;
        int n11;
        block11: {
            boolean bl;
            block10: {
                String[] stringArray;
                block9: {
                    BufferedImage bufferedImage3;
                    block8: {
                        n11 = bufferedImage.getWidth();
                        stringArray = W5.q();
                        n10 = bufferedImage.getHeight();
                        bufferedImage3 = bufferedImage2;
                        if (stringArray == null) break block8;
                        if (bufferedImage3 != null) break block9;
                        bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
                    }
                    bufferedImage2 = bufferedImage3;
                }
                int[] nArray2 = new int[n11 * n10];
                nArray = new int[n11 * n10];
                this.l(bufferedImage, 0, 0, n11, n10, nArray2);
                bl = this.J;
                if (stringArray == null) break block10;
                if (bl) {
                    NM.g(nArray2, 0, nArray2.length);
                }
                hg_1.Q(this.d, nArray2, nArray, n11, n10, this.K, this.f);
                hg_12 = this;
                if (stringArray == null) break block11;
                bl = hg_12.J;
            }
            if (bl) {
                NM.L(nArray, 0, nArray.length);
            }
            hg_12 = this;
        }
        hg_12.E(bufferedImage2, 0, 0, n11, n10, nArray);
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

    public static void m(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, int n12) {
        hg_1.Q(kernel, nArray, nArray2, n10, n11, true, n12);
    }

    public static void Q(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean bl, int n12) {
        block4: {
            Kernel kernel2;
            block5: {
                block6: {
                    int n13;
                    int n14;
                    String[] stringArray;
                    block2: {
                        block3: {
                            stringArray = W5.q();
                            n14 = kernel.getHeight();
                            n13 = 1;
                            if (stringArray == null) break block2;
                            if (n14 != n13) break block3;
                            hg_1.m(kernel, nArray, nArray2, n10, n11, bl, n12);
                            if (stringArray != null) break block4;
                        }
                        kernel2 = kernel;
                        if (stringArray == null) break block5;
                        n14 = kernel2.getWidth();
                        n13 = 1;
                    }
                    if (n14 != n13) break block6;
                    hg_1.t(kernel, nArray, nArray2, n10, n11, bl, n12);
                    if (stringArray != null) break block4;
                }
                kernel2 = kernel;
            }
            hg_1.V(kernel2, nArray, nArray2, n10, n11, bl, n12);
        }
    }

    public static void V(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean n12, int n13) {
        int n14 = 0;
        float[] fArray = kernel.getKernelData(null);
        int n15 = kernel.getHeight();
        int n16 = kernel.getWidth();
        int n17 = n15 / 2;
        String[] stringArray = W5.q();
        int n18 = n16 / 2;
        int n19 = 0;
        block0: while (true) {
            int n20 = n19;
            block1: while (n20 < n11) {
                int n21 = 0;
                block2: while (true) {
                    int n22 = n21;
                    int n23 = n10;
                    block3: while (n22 < n23) {
                        int n24;
                        int n25;
                        int n26;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        n20 = -n17;
                        if (stringArray == null) continue block1;
                        int n27 = n20;
                        block4: while (true) {
                            int n28 = n27;
                            block5: while (n28 <= n17) {
                                block17: {
                                    block13: {
                                        int n29;
                                        int n30;
                                        block16: {
                                            block14: {
                                                block15: {
                                                    block11: {
                                                        block12: {
                                                            n26 = n19 + n27;
                                                            n22 = 0;
                                                            n23 = n26;
                                                            if (stringArray == null) continue block3;
                                                            if (stringArray == null) break block11;
                                                            if (n22 > n23) break block12;
                                                            n30 = n26;
                                                            n29 = n11;
                                                            if (stringArray == null) break block11;
                                                            if (n30 >= n29) break block12;
                                                            n25 = n26 * n10;
                                                            if (stringArray != null) break block13;
                                                        }
                                                        n30 = n13;
                                                        n29 = Y;
                                                    }
                                                    if (stringArray == null) break block14;
                                                    if (n30 != n29) break block15;
                                                    n25 = n19 * n10;
                                                    if (stringArray != null) break block13;
                                                }
                                                n30 = n13;
                                                n29 = M;
                                            }
                                            if (stringArray == null) break block16;
                                            if (n30 != n29) break block17;
                                            n30 = (n26 + n11) % n11;
                                            n29 = n10;
                                        }
                                        n25 = n30 * n29;
                                    }
                                    n24 = n16 * (n27 + n17) + n18;
                                    int n31 = -n18;
                                    while (n31 <= n18) {
                                        block18: {
                                            block19: {
                                                int n32;
                                                float f14;
                                                block22: {
                                                    int n33;
                                                    block23: {
                                                        int n34;
                                                        int n35;
                                                        block26: {
                                                            block24: {
                                                                block25: {
                                                                    block20: {
                                                                        block21: {
                                                                            f14 = fArray[n24 + n31];
                                                                            if (stringArray == null) break block18;
                                                                            float f15 = f14 - 0.0f;
                                                                            n28 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                            if (stringArray == null) continue block5;
                                                                            if (n28 == 0) break block19;
                                                                            n33 = n21 + n31;
                                                                            n35 = 0;
                                                                            n34 = n33;
                                                                            if (stringArray == null) break block20;
                                                                            if (n35 > n34) break block21;
                                                                            n32 = n33;
                                                                            if (stringArray == null) break block22;
                                                                            if (n32 < n10) break block23;
                                                                        }
                                                                        n35 = n13;
                                                                        n34 = Y;
                                                                    }
                                                                    if (stringArray == null) break block24;
                                                                    if (n35 != n34) break block25;
                                                                    n33 = n21;
                                                                    if (stringArray != null) break block23;
                                                                }
                                                                n35 = n13;
                                                                n34 = M;
                                                            }
                                                            if (stringArray == null) break block26;
                                                            if (n35 != n34) break block19;
                                                            n35 = n21 + n10;
                                                            n34 = n10;
                                                        }
                                                        n33 = n35 % n34;
                                                    }
                                                    n32 = nArray[n25 + n33];
                                                }
                                                int n36 = n32;
                                                f13 += f14 * (float)(n36 >> hg_1.a(12636, 157449147678107518L) & hg_1.a(2220, 3750594293869944452L));
                                                f10 += f14 * (float)(n36 >> hg_1.a(7628, 8511879902027090922L) & hg_1.a(2220, 3750594293869944452L));
                                                f11 += f14 * (float)(n36 >> hg_1.a(775, 1072866591581705508L) & hg_1.a(2220, 3750594293869944452L));
                                                f12 += f14 * (float)(n36 & hg_1.a(2220, 3750594293869944452L));
                                            }
                                            ++n31;
                                        }
                                        if (stringArray != null) continue;
                                    }
                                }
                                ++n27;
                                if (stringArray != null) continue block4;
                            }
                            break;
                        }
                        int n37 = n12;
                        if (stringArray != null) {
                            n37 = n37 != 0 ? iw_2.e((int)((double)f13 + 0.5)) : hg_1.a(2220, 3750594293869944452L);
                        }
                        n27 = n37;
                        n26 = iw_2.e((int)((double)f10 + 0.5));
                        n25 = iw_2.e((int)((double)f11 + 0.5));
                        n24 = iw_2.e((int)((double)f12 + 0.5));
                        nArray2[n14++] = n27 << hg_1.a(12636, 157449147678107518L) | n26 << hg_1.a(7628, 8511879902027090922L) | n25 << hg_1.a(775, 1072866591581705508L) | n24;
                        ++n21;
                        if (stringArray != null) continue block2;
                    }
                    break;
                }
                ++n19;
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    public static void m(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean n12, int n13) {
        int n14 = 0;
        float[] fArray = kernel.getKernelData(null);
        int n15 = kernel.getWidth();
        String[] stringArray = W5.q();
        int n16 = n15 / 2;
        int n17 = 0;
        block0: while (true) {
            int n18 = n17;
            block1: while (n18 < n11) {
                int n19 = n17 * n10;
                for (int i2 = 0; i2 < n10; ++i2) {
                    int n20;
                    int n21;
                    int n22;
                    int n23;
                    float f10;
                    float f11;
                    float f12;
                    float f13;
                    block9: {
                        f13 = 0.0f;
                        f12 = 0.0f;
                        f11 = 0.0f;
                        f10 = 0.0f;
                        int n24 = n16;
                        n18 = -n16;
                        if (stringArray == null) continue block1;
                        n23 = n18;
                        while (n23 <= n16) {
                            block10: {
                                block11: {
                                    int n25;
                                    float f14;
                                    block17: {
                                        block16: {
                                            int n26;
                                            block18: {
                                                block19: {
                                                    block12: {
                                                        block13: {
                                                            int n27;
                                                            block14: {
                                                                block15: {
                                                                    f14 = fArray[n24 + n23];
                                                                    if (stringArray == null) break block10;
                                                                    float f15 = f14 - 0.0f;
                                                                    n22 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                    if (stringArray == null) break block9;
                                                                    if (n22 == 0) break block11;
                                                                    n25 = n21 = i2 + n23;
                                                                    if (stringArray == null) break block12;
                                                                    if (n25 >= 0) break block13;
                                                                    n25 = n13;
                                                                    n27 = Y;
                                                                    if (stringArray == null) break block14;
                                                                    if (n25 != n27) break block15;
                                                                    n21 = 0;
                                                                    if (stringArray != null) break block16;
                                                                }
                                                                n25 = n13;
                                                                if (stringArray == null) break block17;
                                                                n27 = M;
                                                            }
                                                            if (n25 != n27) break block16;
                                                            n21 = (i2 + n10) % n10;
                                                            if (stringArray != null) break block16;
                                                        }
                                                        n25 = n21;
                                                    }
                                                    if (stringArray == null) break block17;
                                                    if (n25 < n10) break block16;
                                                    n25 = n13;
                                                    n26 = Y;
                                                    if (stringArray == null) break block18;
                                                    if (n25 != n26) break block19;
                                                    n21 = n10 - 1;
                                                    if (stringArray != null) break block16;
                                                }
                                                n25 = n13;
                                                if (stringArray == null) break block17;
                                                n26 = M;
                                            }
                                            if (n25 == n26) {
                                                n21 = (i2 + n10) % n10;
                                            }
                                        }
                                        n25 = nArray[n19 + n21];
                                    }
                                    n20 = n25;
                                    f10 += f14 * (float)(n20 >> hg_1.a(12636, 157449147678107518L) & hg_1.a(2220, 3750594293869944452L));
                                    f13 += f14 * (float)(n20 >> hg_1.a(7628, 8511879902027090922L) & hg_1.a(2220, 3750594293869944452L));
                                    f12 += f14 * (float)(n20 >> hg_1.a(775, 1072866591581705508L) & hg_1.a(2220, 3750594293869944452L));
                                    f11 += f14 * (float)(n20 & hg_1.a(2220, 3750594293869944452L));
                                }
                                ++n23;
                            }
                            if (stringArray != null) continue;
                        }
                        n22 = n12;
                    }
                    if (stringArray != null) {
                        n22 = n22 != 0 ? iw_2.e((int)((double)f10 + 0.5)) : hg_1.a(2220, 3750594293869944452L);
                    }
                    n23 = n22;
                    int n28 = iw_2.e((int)((double)f13 + 0.5));
                    n21 = iw_2.e((int)((double)f12 + 0.5));
                    n20 = iw_2.e((int)((double)f11 + 0.5));
                    nArray2[n14++] = n23 << hg_1.a(12636, 157449147678107518L) | n28 << hg_1.a(7628, 8511879902027090922L) | n21 << hg_1.a(775, 1072866591581705508L) | n20;
                    if (stringArray != null) continue;
                }
                ++n17;
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    public static void t(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean n12, int n13) {
        int n14 = 0;
        float[] fArray = kernel.getKernelData(null);
        int n15 = kernel.getHeight();
        int n16 = n15 / 2;
        int n17 = 0;
        String[] stringArray = W5.q();
        block0: while (true) {
            int n18 = n17;
            block1: while (n18 < n11) {
                for (int i2 = 0; i2 < n10; ++i2) {
                    int n19;
                    int n20;
                    int n21;
                    int n22;
                    float f10;
                    float f11;
                    float f12;
                    float f13;
                    block10: {
                        f13 = 0.0f;
                        f12 = 0.0f;
                        f11 = 0.0f;
                        f10 = 0.0f;
                        n18 = -n16;
                        if (stringArray == null) continue block1;
                        n22 = n18;
                        while (n22 <= n16) {
                            block15: {
                                int n23;
                                int n24;
                                block18: {
                                    block19: {
                                        int n25;
                                        int n26;
                                        block22: {
                                            block23: {
                                                block20: {
                                                    block21: {
                                                        block11: {
                                                            block12: {
                                                                int n27;
                                                                int n28;
                                                                block16: {
                                                                    block17: {
                                                                        block13: {
                                                                            block14: {
                                                                                n20 = n21 = n17 + n22;
                                                                                if (stringArray == null) break block10;
                                                                                if (stringArray == null) break block11;
                                                                                if (n20 >= 0) break block12;
                                                                                n28 = n13;
                                                                                n27 = Y;
                                                                                if (stringArray == null) break block13;
                                                                                if (n28 != n27) break block14;
                                                                                n19 = 0;
                                                                                if (stringArray != null) break block15;
                                                                            }
                                                                            n28 = n13;
                                                                            n27 = M;
                                                                        }
                                                                        if (stringArray == null) break block16;
                                                                        if (n28 != n27) break block17;
                                                                        n19 = (n17 + n11) % n11 * n10;
                                                                        if (stringArray != null) break block15;
                                                                    }
                                                                    n28 = n21;
                                                                    n27 = n10;
                                                                }
                                                                n19 = n28 * n27;
                                                                if (stringArray != null) break block15;
                                                            }
                                                            n24 = n21;
                                                        }
                                                        n23 = n11;
                                                        if (stringArray == null) break block18;
                                                        if (n24 < n23) break block19;
                                                        n26 = n13;
                                                        n25 = Y;
                                                        if (stringArray == null) break block20;
                                                        if (n26 != n25) break block21;
                                                        n19 = (n11 - 1) * n10;
                                                        if (stringArray != null) break block15;
                                                    }
                                                    n26 = n13;
                                                    n25 = M;
                                                }
                                                if (stringArray == null) break block22;
                                                if (n26 != n25) break block23;
                                                n19 = (n17 + n11) % n11 * n10;
                                                if (stringArray != null) break block15;
                                            }
                                            n26 = n21;
                                            n25 = n10;
                                        }
                                        n19 = n26 * n25;
                                        if (stringArray != null) break block15;
                                    }
                                    n24 = n21;
                                    n23 = n10;
                                }
                                n19 = n24 * n23;
                            }
                            float f14 = fArray[n22 + n16];
                            if (stringArray != null) {
                                if (f14 != 0.0f) {
                                    int n29 = nArray[n19 + i2];
                                    f10 += f14 * (float)(n29 >> hg_1.a(5182, 1654599850695066137L) & hg_1.a(23722, 3970314927646722699L));
                                    f13 += f14 * (float)(n29 >> hg_1.a(16086, 161778083640617215L) & hg_1.a(2220, 3750594293869944452L));
                                    f12 += f14 * (float)(n29 >> hg_1.a(13293, 257311197017974217L) & hg_1.a(2220, 3750594293869944452L));
                                    f11 += f14 * (float)(n29 & hg_1.a(2220, 3750594293869944452L));
                                }
                                ++n22;
                            }
                            if (stringArray != null) continue;
                        }
                        n20 = n12;
                    }
                    if (stringArray != null) {
                        n20 = n20 != 0 ? iw_2.e((int)((double)f10 + 0.5)) : hg_1.a(2220, 3750594293869944452L);
                    }
                    n22 = n20;
                    n21 = iw_2.e((int)((double)f13 + 0.5));
                    n19 = iw_2.e((int)((double)f12 + 0.5));
                    int n30 = iw_2.e((int)((double)f11 + 0.5));
                    nArray2[n14++] = n22 << hg_1.a(12636, 157449147678107518L) | n21 << hg_1.a(7628, 8511879902027090922L) | n19 << hg_1.a(775, 1072866591581705508L) | n30;
                    if (stringArray != null) continue;
                }
                ++n17;
                if (stringArray != null) continue block0;
            }
            break;
        }
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
                v0 = "C<b\\\\;\u001do&xB\u0005\u001d\\/~".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 97;
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
                                v9 = 96;
                                break;
                            }
                            case 1: {
                                v9 = 49;
                                break;
                            }
                            case 2: {
                                v9 = 118;
                                break;
                            }
                            case 3: {
                                v9 = 79;
                                break;
                            }
                            case 4: {
                                v9 = 18;
                                break;
                            }
                            case 5: {
                                v9 = 25;
                                break;
                            }
                            default: {
                                v9 = 19;
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
                hg_1.a = new String(v10).intern();
                var0_1 = 5850812507718197699L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "\u00e2\u0086\u00c1\u00a1\r$\u00eb\u00b7\u00f0\u00c2\u0082\u0080\u00c6\u00a5u\u0012\u00fe\u00c0\u0098\u0001\u0003h4\u00ef\u00b8\u00ef\u00d9\u00fdt~\u0006\u00a5b\u00d8+\u0000\u00ad\u00ca\u0093\u00ec-\u00de\u00fa\u0007\u008f\b\u0004\u0002`\u0005\u00d7\u001e+\u00ec\u00a3\u00c2\u0014\u00e4\u0094\bZ\u00e8*9";
                var5_5 = "\u00e2\u0086\u00c1\u00a1\r$\u00eb\u00b7\u00f0\u00c2\u0082\u0080\u00c6\u00a5u\u0012\u00fe\u00c0\u0098\u0001\u0003h4\u00ef\u00b8\u00ef\u00d9\u00fdt~\u0006\u00a5b\u00d8+\u0000\u00ad\u00ca\u0093\u00ec-\u00de\u00fa\u0007\u008f\b\u0004\u0002`\u0005\u00d7\u001e+\u00ec\u00a3\u00c2\u0014\u00e4\u0094\bZ\u00e8*9".length();
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
                    var4_4 = "u\u00d5t\u00c1F#\t,\u00c7v\u00e0\u00b6\u0097M?\u00b8";
                    var5_5 = "u\u00d5t\u00c1F#\t,\u00c7v\u00e0\u00b6\u0097M?\u00b8".length();
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
        hg_1.h = var6_2;
        hg_1.i = new Integer[10];
        hg_1.g = 0;
        hg_1.Y = 1;
        hg_1.M = hg_1.a(9224, 8941948126168494637L);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1621;
        if (i[n11] == null) {
            hg_1.i[n11] = (int)(h[n11] ^ l2);
        }
        return i[n11];
    }
}

