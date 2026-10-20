/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.N6;
import com.z9;
import com.zH;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class z7
extends z9 {
    protected float I;
    protected Kernel n;
    private static final long[] c;
    private static final Integer[] d;

    public z7() {
        this(2.0f);
    }

    public z7(float f10) {
        this.o(f10);
    }

    public void o(float f10) {
        this.I = f10;
        this.n = z7.i(f10);
    }

    public float V() {
        return this.I;
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
        bufferedImage.getRGB(0, 0, n11, n10, nArray, 0, n11);
        z7.s(this.n, nArray, nArray2, n11, n10, this.T, i);
        z7.s(this.n, nArray2, nArray, n10, n11, this.T, i);
        bufferedImage2.setRGB(0, 0, n11, n10, nArray, 0, n11);
        return bufferedImage2;
    }

    public static void s(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean n12, int n13) {
        float[] fArray = kernel.getKernelData(null);
        String[] stringArray = zH.U();
        int n14 = kernel.getWidth();
        int n15 = n14 / 2;
        int n16 = 0;
        block0: while (true) {
            int n17 = n16;
            block1: while (n17 < n11) {
                int n18 = n16;
                int n19 = n16 * n10;
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
                        n17 = -n15;
                        if (stringArray != null) continue block1;
                        n23 = n17;
                        while (n23 <= n15) {
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
                                                                    f14 = fArray[n15 + n23];
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
                                    f10 += f14 * (float)(n20 >> z7.b(26857, 705373954430749629L) & z7.b(6705, 1882377701407930722L));
                                    f13 += f14 * (float)(n20 >> z7.b(2814, 2400866963155233192L) & z7.b(9559, 4802532881827956226L));
                                    f12 += f14 * (float)(n20 >> z7.b(10486, 1390218484461669284L) & z7.b(9559, 4802532881827956226L));
                                    f11 += f14 * (float)(n20 & z7.b(9559, 4802532881827956226L));
                                }
                                ++n23;
                            }
                            if (stringArray == null) continue;
                        }
                        n22 = n12;
                    }
                    if (stringArray == null) {
                        n22 = n22 != 0 ? N6.W((int)((double)f10 + 0.5)) : z7.b(9559, 4802532881827956226L);
                    }
                    n23 = n22;
                    int n27 = N6.W((int)((double)f13 + 0.5));
                    n21 = N6.W((int)((double)f12 + 0.5));
                    n20 = N6.W((int)((double)f11 + 0.5));
                    nArray2[n18] = n23 << z7.b(11361, 3626671100152123185L) | n27 << z7.b(29157, 7833370080731124402L) | n21 << z7.b(12814, 5450116554555625823L) | n20;
                    n18 += n11;
                    if (stringArray == null) continue;
                }
                ++n16;
                if (stringArray == null) continue block0;
            }
            break;
        }
    }

    public static Kernel i(float f10) {
        int n10;
        float f11;
        String[] stringArray;
        float[] fArray;
        int n11;
        block4: {
            int n12;
            int n13 = (int)Math.ceil(f10);
            n11 = n13 * 2 + 1;
            fArray = new float[n11];
            float f12 = f10 / 3.0f;
            float f13 = 2.0f * f12 * f12;
            float f14 = (float)Math.PI * 2 * f12;
            float f15 = (float)Math.sqrt(f14);
            float f16 = f10 * f10;
            stringArray = zH.U();
            f11 = 0.0f;
            int n14 = 0;
            for (n10 = -n13; n10 <= n13; ++n10) {
                block7: {
                    float f17;
                    block6: {
                        block5: {
                            f17 = n10 * n10;
                            if (stringArray != null) break block5;
                            n12 = f17 == f16 ? 0 : (f17 > f16 ? 1 : -1);
                            if (stringArray != null) break block4;
                            if (n12 <= 0) break block6;
                            fArray[n14] = 0.0f;
                        }
                        if (stringArray == null) break block7;
                    }
                    fArray[n14] = (float)Math.exp(-f17 / f13) / f15;
                }
                f11 += fArray[n14];
                ++n14;
                if (stringArray == null) continue;
            }
            n12 = n10 = 0;
        }
        while (n10 < n11) {
            int n15 = n10++;
            fArray[n15] = fArray[n15] / f11;
            if (stringArray == null) continue;
        }
        return new Kernel(n11, 1, fArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5113615349178364905L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u00901\u00ca\u00caG\u0001b\u00be\u00f3\u001d^X\u00b4|\u00fc\u00c0\u00cc\u00cc\u00e9U\u00f4K\u00cat\u00b9G\u00f5\u008c\u00abG\u00f8E\u00d4]GK.\u00bf\u00f5\u0014j0\f\u00ed\u00f6j\u00b8L";
                var5_4 = "\u00901\u00ca\u00caG\u0001b\u00be\u00f3\u001d^X\u00b4|\u00fc\u00c0\u00cc\u00cc\u00e9U\u00f4K\u00cat\u00b9G\u00f5\u008c\u00abG\u00f8E\u00d4]GK.\u00bf\u00f5\u0014j0\f\u00ed\u00f6j\u00b8L".length();
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
                    var4_3 = "#\u00aeE\f\u00c5\u00e4!K\"Gi/~\u0014ZQ";
                    var5_4 = "#\u00aeE\f\u00c5\u00e4!K\"Gi/~\u0014ZQ".length();
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
        z7.c = var6_1;
        z7.d = new Integer[8];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2351;
        if (d[n11] == null) {
            z7.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

