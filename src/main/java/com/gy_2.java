/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.gy
 */
public abstract class gy_2
extends W5 {
    protected int t = gy_2.a(25584, 6697158943221741684L);
    protected int P = 1;
    protected Rectangle r;
    protected Rectangle U;
    private static final long[] ab;
    private static final Integer[] bb;

    public void Y(int n10) {
        this.t = n10;
    }

    public int s() {
        return this.t;
    }

    public void Q(int n10) {
        this.P = n10;
    }

    public int A() {
        return this.P;
    }

    protected abstract void h(int var1, int var2, float[] var3);

    protected void T(Rectangle rectangle) {
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        Object object;
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        int n12 = bufferedImage.getType();
        String[] stringArray = W5.q();
        WritableRaster writableRaster = bufferedImage.getRaster();
        this.U = new Rectangle(0, 0, n10, n11);
        this.r = new Rectangle(0, 0, n10, n11);
        this.T(this.r);
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                object = bufferedImage.getColorModel();
                bufferedImage2 = new BufferedImage((ColorModel)object, ((ColorModel)object).createCompatibleWritableRaster(this.r.width, this.r.height), ((ColorModel)object).isAlphaPremultiplied(), null);
            }
            bufferedImage3 = bufferedImage2;
        }
        object = bufferedImage3.getRaster();
        int[] nArray = this.l(bufferedImage, 0, 0, n10, n11, null);
        int n13 = this.P;
        if (stringArray != null) {
            if (n13 == 0) {
                return this.l(bufferedImage2, n10, n11, nArray, this.r);
            }
            n13 = n10;
        }
        int n14 = n13;
        int n15 = n11;
        int n16 = n10 - 1;
        int n17 = n11 - 1;
        int n18 = this.r.width;
        int n19 = this.r.height;
        boolean bl = false;
        int[] nArray2 = new int[n18];
        int n20 = this.r.x;
        int n21 = this.r.y;
        float[] fArray = new float[2];
        int n22 = 0;
        block0: while (true) {
            int n23 = n22;
            block1: while (n23 < n19) {
                for (int i2 = 0; i2 < n18; ++i2) {
                    int n24;
                    int n25;
                    int n26;
                    int n27;
                    float f10;
                    float f11;
                    block12: {
                        int n28;
                        int n29;
                        int n30;
                        block10: {
                            block11: {
                                this.h(n20 + i2, n21 + n22, fArray);
                                n30 = (int)Math.floor(fArray[0]);
                                n29 = (int)Math.floor(fArray[1]);
                                f11 = fArray[0] - (float)n30;
                                f10 = fArray[1] - (float)n29;
                                n23 = n30;
                                if (stringArray == null) continue block1;
                                if (stringArray == null) break block10;
                                if (n23 < 0) break block11;
                                n28 = n30;
                                if (stringArray == null) break block10;
                                if (n28 >= n16) break block11;
                                n28 = n29;
                                if (stringArray == null) break block10;
                                if (n28 < 0) break block11;
                                n28 = n29;
                                if (stringArray == null) break block10;
                                if (n28 >= n17) break block11;
                                int n31 = n14 * n29 + n30;
                                n27 = nArray[n31];
                                n26 = nArray[n31 + 1];
                                n25 = nArray[n31 + n14];
                                n24 = nArray[n31 + n14 + 1];
                                if (stringArray != null) break block12;
                            }
                            n28 = this.A(nArray, n30, n29, n14, n15);
                        }
                        n27 = n28;
                        n26 = this.A(nArray, n30 + 1, n29, n14, n15);
                        n25 = this.A(nArray, n30, n29 + 1, n14, n15);
                        n24 = this.A(nArray, n30 + 1, n29 + 1, n14, n15);
                    }
                    nArray2[i2] = NM.O(f11, f10, n27, n26, n25, n24);
                    if (stringArray != null) continue;
                }
                this.E(bufferedImage2, 0, n22, this.r.width, 1, nArray2);
                ++n22;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return bufferedImage2;
    }

    private final int A(int[] nArray, int n10, int n11, int n12, int n13) {
        int n14;
        block11: {
            block12: {
                int n15;
                String[] stringArray;
                block9: {
                    block10: {
                        stringArray = W5.q();
                        n15 = n10;
                        if (stringArray == null) break block9;
                        if (n15 < 0) break block10;
                        n15 = n10;
                        if (stringArray == null) break block9;
                        if (n15 >= n12) break block10;
                        n15 = n11;
                        if (stringArray == null) break block9;
                        if (n15 < 0) break block10;
                        n14 = n11;
                        if (stringArray == null) break block11;
                        if (n14 < n13) break block12;
                    }
                    n15 = this.t;
                }
                if (stringArray != null) {
                    switch (n15) {
                        default: {
                            return 0;
                        }
                        case 2: {
                            return nArray[NM.r(n11, n13) * n12 + NM.r(n10, n12)];
                        }
                        case 1: {
                            return nArray[NM.L(n11, 0, n13 - 1) * n12 + NM.L(n10, 0, n12 - 1)];
                        }
                        case 3: 
                    }
                    n15 = nArray[NM.L(n11, 0, n13 - 1) * n12 + NM.L(n10, 0, n12 - 1)] & gy_2.a(27418, 8664314053654900895L);
                }
                return n15;
            }
            n14 = nArray[n11 * n12 + n10];
        }
        return n14;
    }

    protected BufferedImage l(BufferedImage bufferedImage, int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = n10;
        int n13 = n11;
        int n14 = rectangle.width;
        int n15 = rectangle.height;
        int[] nArray2 = new int[n14];
        String[] stringArray = W5.q();
        int n16 = rectangle.x;
        int n17 = rectangle.y;
        int[] nArray3 = new int[4];
        float[] fArray = new float[2];
        int n18 = 0;
        block5: while (true) {
            int n19 = n18;
            block6: while (n19 < n15) {
                for (int i2 = 0; i2 < n14; ++i2) {
                    int n20;
                    int n21;
                    int n22;
                    block10: {
                        int n23;
                        int n24;
                        block11: {
                            block13: {
                                int n25;
                                block12: {
                                    block8: {
                                        block9: {
                                            this.h(n16 + i2, n17 + n18, fArray);
                                            n24 = (int)fArray[0];
                                            n23 = (int)fArray[1];
                                            float f10 = fArray[0] - 0.0f;
                                            n19 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                            if (stringArray == null) continue block6;
                                            if (stringArray == null) break block8;
                                            if (n19 < 0) break block9;
                                            n25 = n24;
                                            if (stringArray == null) break block8;
                                            if (n25 >= n12) break block9;
                                            float f11 = fArray[1] - 0.0f;
                                            n25 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                            if (stringArray == null) break block8;
                                            if (n25 < 0) break block9;
                                            n22 = n23;
                                            n21 = n13;
                                            if (stringArray == null) break block10;
                                            if (n22 < n21) break block11;
                                        }
                                        n25 = this.t;
                                    }
                                    if (stringArray == null) break block12;
                                    switch (n25) {
                                        default: {
                                            n20 = 0;
                                            if (stringArray != null) break block13;
                                        }
                                        case 2: {
                                            n20 = nArray[NM.r(n23, n13) * n12 + NM.r(n24, n12)];
                                            if (stringArray != null) break block13;
                                        }
                                        case 1: {
                                            n20 = nArray[NM.L(n23, 0, n13 - 1) * n12 + NM.L(n24, 0, n12 - 1)];
                                            if (stringArray != null) break block13;
                                        }
                                        case 3: {
                                            n25 = nArray[NM.L(n23, 0, n13 - 1) * n12 + NM.L(n24, 0, n12 - 1)] & gy_2.a(9692, 6242484975259827802L);
                                        }
                                    }
                                }
                                n20 = n25;
                            }
                            nArray2[i2] = n20;
                            if (stringArray != null) continue;
                        }
                        n22 = n12 * n23;
                        n21 = n24;
                    }
                    n20 = n22 + n21;
                    nArray3[0] = nArray[n20];
                    nArray2[i2] = nArray[n20];
                    if (stringArray != null) continue;
                }
                this.E(bufferedImage, 0, n18, rectangle.width, 1, nArray2);
                ++n18;
                if (stringArray != null) continue block5;
            }
            break;
        }
        return bufferedImage;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6894852758606319829L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u0095\u001d\u0014&\u00c8U\u00e8\u00a2D1\u00c1\u00e1A#\u009f\u00b5\u00a5\u00a9\u0081we\u00b6\u00d1p";
        int n11 = "\u0095\u001d\u0014&\u00c8U\u00e8\u00a2D1\u00c1\u00e1A#\u009f\u00b5\u00a5\u00a9\u0081we\u00b6\u00d1p".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        ab = lArray;
        bb = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1B84;
        if (bb[n11] == null) {
            gy_2.bb[n11] = (int)(ab[n11] ^ l2);
        }
        return bb[n11];
    }
}

