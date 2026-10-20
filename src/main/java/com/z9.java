/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.N6;
import com.zH;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class z9
extends zH {
    public static int U;
    public static int i;
    public static int G;
    protected Kernel V = null;
    public boolean T = true;
    private int y = i;
    private static final long[] a;
    private static final Integer[] b;

    public z9() {
        this(new float[z9.a(4811, 5153385376517548265L)]);
    }

    public z9(float[] fArray) {
        this(new Kernel(3, 3, fArray));
    }

    public z9(int n10, int n11, float[] fArray) {
        this(new Kernel(n11, n10, fArray));
    }

    public z9(Kernel kernel) {
        this.V = kernel;
    }

    public void y(Kernel kernel) {
        this.V = kernel;
    }

    public Kernel Y() {
        return this.V;
    }

    public void C(int n10) {
        this.y = n10;
    }

    public int J() {
        return this.y;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10;
        int n11;
        block3: {
            BufferedImage bufferedImage3;
            block2: {
                n11 = bufferedImage.getWidth();
                String[] stringArray = zH.U();
                n10 = bufferedImage.getHeight();
                bufferedImage3 = bufferedImage2;
                if (stringArray != null) break block2;
                if (bufferedImage3 != null) break block3;
                bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage2 = bufferedImage3;
        }
        int[] nArray = new int[n11 * n10];
        int[] nArray2 = new int[n11 * n10];
        this.Q(bufferedImage, 0, 0, n11, n10, nArray);
        z9.b(this.V, nArray, nArray2, n11, n10, this.T, this.y);
        this.K(bufferedImage2, 0, 0, n11, n10, nArray2);
        return bufferedImage2;
    }

    @Override
    public BufferedImage createCompatibleDestImage(BufferedImage bufferedImage, ColorModel colorModel) {
        block3: {
            ColorModel colorModel2;
            block2: {
                String[] stringArray = zH.U();
                colorModel2 = colorModel;
                if (stringArray != null) break block2;
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
        String[] stringArray = zH.U();
        Point2D point2D3 = point2D2;
        if (stringArray == null) {
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

    public static void W(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, int n12) {
        z9.b(kernel, nArray, nArray2, n10, n11, true, n12);
    }

    public static void b(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean bl, int n12) {
        block4: {
            Kernel kernel2;
            block5: {
                block6: {
                    int n13;
                    int n14;
                    String[] stringArray;
                    block2: {
                        block3: {
                            stringArray = zH.U();
                            n14 = kernel.getHeight();
                            n13 = 1;
                            if (stringArray != null) break block2;
                            if (n14 != n13) break block3;
                            z9.X(kernel, nArray, nArray2, n10, n11, bl, n12);
                            if (stringArray == null) break block4;
                        }
                        kernel2 = kernel;
                        if (stringArray != null) break block5;
                        n14 = kernel2.getWidth();
                        n13 = 1;
                    }
                    if (n14 != n13) break block6;
                    z9.N(kernel, nArray, nArray2, n10, n11, bl, n12);
                    if (stringArray == null) break block4;
                }
                kernel2 = kernel;
            }
            z9.h(kernel2, nArray, nArray2, n10, n11, bl, n12);
        }
    }

    public static void h(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean n12, int n13) {
        int n14 = 0;
        float[] fArray = kernel.getKernelData(null);
        int n15 = kernel.getHeight();
        int n16 = kernel.getWidth();
        int n17 = n15 / 2;
        String[] stringArray = zH.U();
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
                        if (stringArray != null) continue block1;
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
                                                            if (stringArray != null) continue block3;
                                                            if (stringArray != null) break block11;
                                                            if (n22 > n23) break block12;
                                                            n30 = n26;
                                                            n29 = n11;
                                                            if (stringArray != null) break block11;
                                                            if (n30 >= n29) break block12;
                                                            n25 = n26 * n10;
                                                            if (stringArray == null) break block13;
                                                        }
                                                        n30 = n13;
                                                        n29 = i;
                                                    }
                                                    if (stringArray != null) break block14;
                                                    if (n30 != n29) break block15;
                                                    n25 = n19 * n10;
                                                    if (stringArray == null) break block13;
                                                }
                                                n30 = n13;
                                                n29 = G;
                                            }
                                            if (stringArray != null) break block16;
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
                                                                            if (stringArray != null) break block18;
                                                                            float f15 = f14 - 0.0f;
                                                                            n28 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                            if (stringArray != null) continue block5;
                                                                            if (n28 == 0) break block19;
                                                                            n33 = n21 + n31;
                                                                            n35 = 0;
                                                                            n34 = n33;
                                                                            if (stringArray != null) break block20;
                                                                            if (n35 > n34) break block21;
                                                                            n32 = n33;
                                                                            if (stringArray != null) break block22;
                                                                            if (n32 < n10) break block23;
                                                                        }
                                                                        n35 = n13;
                                                                        n34 = i;
                                                                    }
                                                                    if (stringArray != null) break block24;
                                                                    if (n35 != n34) break block25;
                                                                    n33 = n21;
                                                                    if (stringArray == null) break block23;
                                                                }
                                                                n35 = n13;
                                                                n34 = G;
                                                            }
                                                            if (stringArray != null) break block26;
                                                            if (n35 != n34) break block19;
                                                            n35 = n21 + n10;
                                                            n34 = n10;
                                                        }
                                                        n33 = n35 % n34;
                                                    }
                                                    n32 = nArray[n25 + n33];
                                                }
                                                int n36 = n32;
                                                f13 += f14 * (float)(n36 >> z9.a(28877, 6660585969314597614L) & z9.a(19522, 7411467199444334181L));
                                                f10 += f14 * (float)(n36 >> z9.a(29082, 6984963813634804659L) & z9.a(19522, 7411467199444334181L));
                                                f11 += f14 * (float)(n36 >> z9.a(8642, 6019011735365147620L) & z9.a(19522, 7411467199444334181L));
                                                f12 += f14 * (float)(n36 & z9.a(19522, 7411467199444334181L));
                                            }
                                            ++n31;
                                        }
                                        if (stringArray == null) continue;
                                    }
                                }
                                ++n27;
                                if (stringArray == null) continue block4;
                            }
                            break;
                        }
                        int n37 = n12;
                        if (stringArray == null) {
                            n37 = n37 != 0 ? N6.W((int)((double)f13 + 0.5)) : z9.a(19522, 7411467199444334181L);
                        }
                        n27 = n37;
                        n26 = N6.W((int)((double)f10 + 0.5));
                        n25 = N6.W((int)((double)f11 + 0.5));
                        n24 = N6.W((int)((double)f12 + 0.5));
                        nArray2[n14++] = n27 << z9.a(28877, 6660585969314597614L) | n26 << z9.a(29082, 6984963813634804659L) | n25 << z9.a(8642, 6019011735365147620L) | n24;
                        ++n21;
                        if (stringArray == null) continue block2;
                    }
                    break;
                }
                ++n19;
                if (stringArray == null) continue block0;
            }
            break;
        }
    }

    public static void X(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean n12, int n13) {
        int n14 = 0;
        float[] fArray = kernel.getKernelData(null);
        int n15 = kernel.getWidth();
        String[] stringArray = zH.U();
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
                        n18 = -n16;
                        if (stringArray != null) continue block1;
                        n23 = n18;
                        while (n23 <= n16) {
                            block10: {
                                block11: {
                                    int n24;
                                    float f14;
                                    block17: {
                                        block16: {
                                            int n25;
                                            block18: {
                                                block19: {
                                                    block12: {
                                                        block13: {
                                                            int n26;
                                                            block14: {
                                                                block15: {
                                                                    f14 = fArray[n16 + n23];
                                                                    if (stringArray != null) break block10;
                                                                    float f15 = f14 - 0.0f;
                                                                    n22 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                    if (stringArray != null) break block9;
                                                                    if (n22 == 0) break block11;
                                                                    n24 = n21 = i2 + n23;
                                                                    if (stringArray != null) break block12;
                                                                    if (n24 >= 0) break block13;
                                                                    n24 = n13;
                                                                    n26 = i;
                                                                    if (stringArray != null) break block14;
                                                                    if (n24 != n26) break block15;
                                                                    n21 = 0;
                                                                    if (stringArray == null) break block16;
                                                                }
                                                                n24 = n13;
                                                                if (stringArray != null) break block17;
                                                                n26 = G;
                                                            }
                                                            if (n24 != n26) break block16;
                                                            n21 = (i2 + n10) % n10;
                                                            if (stringArray == null) break block16;
                                                        }
                                                        n24 = n21;
                                                    }
                                                    if (stringArray != null) break block17;
                                                    if (n24 < n10) break block16;
                                                    n24 = n13;
                                                    n25 = i;
                                                    if (stringArray != null) break block18;
                                                    if (n24 != n25) break block19;
                                                    n21 = n10 - 1;
                                                    if (stringArray == null) break block16;
                                                }
                                                n24 = n13;
                                                if (stringArray != null) break block17;
                                                n25 = G;
                                            }
                                            if (n24 == n25) {
                                                n21 = (i2 + n10) % n10;
                                            }
                                        }
                                        n24 = nArray[n19 + n21];
                                    }
                                    n20 = n24;
                                    f10 += f14 * (float)(n20 >> z9.a(13170, 8148950039860726099L) & z9.a(21188, 5323025724233656545L));
                                    f13 += f14 * (float)(n20 >> z9.a(29058, 2333827884635065250L) & z9.a(19522, 7411467199444334181L));
                                    f12 += f14 * (float)(n20 >> z9.a(27652, 2070484748868097568L) & z9.a(19522, 7411467199444334181L));
                                    f11 += f14 * (float)(n20 & z9.a(19522, 7411467199444334181L));
                                }
                                ++n23;
                            }
                            if (stringArray == null) continue;
                        }
                        n22 = n12;
                    }
                    if (stringArray == null) {
                        n22 = n22 != 0 ? N6.W((int)((double)f10 + 0.5)) : z9.a(19522, 7411467199444334181L);
                    }
                    n23 = n22;
                    int n27 = N6.W((int)((double)f13 + 0.5));
                    n21 = N6.W((int)((double)f12 + 0.5));
                    n20 = N6.W((int)((double)f11 + 0.5));
                    nArray2[n14++] = n23 << z9.a(28877, 6660585969314597614L) | n27 << z9.a(29082, 6984963813634804659L) | n21 << z9.a(8642, 6019011735365147620L) | n20;
                    if (stringArray == null) continue;
                }
                ++n17;
                if (stringArray == null) continue block0;
            }
            break;
        }
    }

    public static void N(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean n12, int n13) {
        int n14 = 0;
        String[] stringArray = zH.U();
        float[] fArray = kernel.getKernelData(null);
        int n15 = kernel.getHeight();
        int n16 = n15 / 2;
        int n17 = 0;
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
                        if (stringArray != null) continue block1;
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
                                                                                if (stringArray != null) break block10;
                                                                                if (stringArray != null) break block11;
                                                                                if (n20 >= 0) break block12;
                                                                                n28 = n13;
                                                                                n27 = i;
                                                                                if (stringArray != null) break block13;
                                                                                if (n28 != n27) break block14;
                                                                                n19 = 0;
                                                                                if (stringArray == null) break block15;
                                                                            }
                                                                            n28 = n13;
                                                                            n27 = G;
                                                                        }
                                                                        if (stringArray != null) break block16;
                                                                        if (n28 != n27) break block17;
                                                                        n19 = (n17 + n11) % n11 * n10;
                                                                        if (stringArray == null) break block15;
                                                                    }
                                                                    n28 = n21;
                                                                    n27 = n10;
                                                                }
                                                                n19 = n28 * n27;
                                                                if (stringArray == null) break block15;
                                                            }
                                                            n24 = n21;
                                                        }
                                                        n23 = n11;
                                                        if (stringArray != null) break block18;
                                                        if (n24 < n23) break block19;
                                                        n26 = n13;
                                                        n25 = i;
                                                        if (stringArray != null) break block20;
                                                        if (n26 != n25) break block21;
                                                        n19 = (n11 - 1) * n10;
                                                        if (stringArray == null) break block15;
                                                    }
                                                    n26 = n13;
                                                    n25 = G;
                                                }
                                                if (stringArray != null) break block22;
                                                if (n26 != n25) break block23;
                                                n19 = (n17 + n11) % n11 * n10;
                                                if (stringArray == null) break block15;
                                            }
                                            n26 = n21;
                                            n25 = n10;
                                        }
                                        n19 = n26 * n25;
                                        if (stringArray == null) break block15;
                                    }
                                    n24 = n21;
                                    n23 = n10;
                                }
                                n19 = n24 * n23;
                            }
                            float f14 = fArray[n22 + n16];
                            if (stringArray == null) {
                                if (f14 != 0.0f) {
                                    int n29 = nArray[n19 + i2];
                                    f10 += f14 * (float)(n29 >> z9.a(28877, 6660585969314597614L) & z9.a(19522, 7411467199444334181L));
                                    f13 += f14 * (float)(n29 >> z9.a(29082, 6984963813634804659L) & z9.a(19522, 7411467199444334181L));
                                    f12 += f14 * (float)(n29 >> z9.a(8642, 6019011735365147620L) & z9.a(19522, 7411467199444334181L));
                                    f11 += f14 * (float)(n29 & z9.a(19522, 7411467199444334181L));
                                }
                                ++n22;
                            }
                            if (stringArray == null) continue;
                        }
                        n20 = n12;
                    }
                    if (stringArray == null) {
                        n20 = n20 != 0 ? N6.W((int)((double)f10 + 0.5)) : z9.a(19522, 7411467199444334181L);
                    }
                    n22 = n20;
                    n21 = N6.W((int)((double)f13 + 0.5));
                    n19 = N6.W((int)((double)f12 + 0.5));
                    int n30 = N6.W((int)((double)f11 + 0.5));
                    nArray2[n14++] = n22 << z9.a(28877, 6660585969314597614L) | n21 << z9.a(29082, 6984963813634804659L) | n19 << z9.a(8642, 6019011735365147620L) | n30;
                    if (stringArray == null) continue;
                }
                ++n17;
                if (stringArray == null) continue block0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7680959638925584282L;
                var6_1 = new long[10];
                var3_2 = 0;
                var4_3 = "\u00c5\u00db\u0088;\u0012\u00d6\u00ac(\u0005v^\u00cc~\bn\u00d1<\u00a0\u00e2\u0010\u00aa@\u00cfzZ:Q\t\u00c4\u00b7-lo\u00c8MF]`1\u00b2\u0083\u00d5X\u00ae\u0013s\u000f\u0084\u00e3\u000e\u00c3\u008e\u001d\u001d|vJ\u00a7U\u00c8\u00eb\u0013\u0011\u0000";
                var5_4 = "\u00c5\u00db\u0088;\u0012\u00d6\u00ac(\u0005v^\u00cc~\bn\u00d1<\u00a0\u00e2\u0010\u00aa@\u00cfzZ:Q\t\u00c4\u00b7-lo\u00c8MF]`1\u00b2\u0083\u00d5X\u00ae\u0013s\u000f\u0084\u00e3\u000e\u00c3\u008e\u001d\u001d|vJ\u00a7U\u00c8\u00eb\u0013\u0011\u0000".length();
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
                    var4_3 = "w\u0099\u00c1\u00ed\u00edZ\u00d6\u00dc\u00dd\u001d\u0005^<\u00ec\u00ac9";
                    var5_4 = "w\u0099\u00c1\u00ed\u00edZ\u00d6\u00dc\u00dd\u001d\u0005^<\u00ec\u00ac9".length();
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
        z9.a = var6_1;
        z9.b = new Integer[10];
        z9.U = 0;
        z9.i = 1;
        z9.G = z9.a(2924, 8541464569407566148L);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7A20;
        if (b[n11] == null) {
            z9.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

