/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.hE
 */
public class he_1
extends W5 {
    private float m = 0.0f;
    private float M = 0.0f;
    private float A = 0.0f;
    private BufferedImage D;
    private BufferedImage C;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void Z(float f10) {
        this.m = f10;
    }

    public float H() {
        return this.m;
    }

    public void c(float f10) {
        this.M = f10;
    }

    public float z() {
        return this.M;
    }

    public void G(float f10) {
        this.A = f10;
    }

    public float o() {
        return this.A;
    }

    public void k(BufferedImage bufferedImage) {
        this.D = bufferedImage;
    }

    public BufferedImage d() {
        return this.D;
    }

    public void o(BufferedImage bufferedImage) {
        this.C = bufferedImage;
    }

    public BufferedImage L() {
        return this.C;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        BufferedImage bufferedImage3;
        block9: {
            block10: {
                int n10 = bufferedImage.getWidth();
                int n11 = bufferedImage.getHeight();
                int n12 = bufferedImage.getType();
                String[] stringArray = W5.q();
                WritableRaster writableRaster = bufferedImage.getRaster();
                BufferedImage bufferedImage4 = bufferedImage2;
                if (stringArray != null) {
                    if (bufferedImage4 == null) {
                        bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                    }
                    bufferedImage4 = bufferedImage2;
                }
                WritableRaster writableRaster2 = bufferedImage4.getRaster();
                bufferedImage3 = this.D;
                if (stringArray == null) break block9;
                if (bufferedImage3 == null) break block10;
                bufferedImage3 = this.C;
                if (stringArray == null) break block9;
                if (bufferedImage3 == null) break block10;
                float[] fArray = null;
                float[] fArray2 = null;
                int[] nArray = null;
                int[] nArray2 = null;
                int[] nArray3 = null;
                int n13 = 0;
                block0: while (true) {
                    int n14 = n13;
                    block1: while (n14 < n11) {
                        nArray = this.l(bufferedImage, 0, n13, n10, 1, nArray);
                        nArray2 = this.l(this.D, 0, n13, n10, 1, nArray2);
                        nArray3 = this.l(this.C, 0, n13, n10, 1, nArray3);
                        for (int i2 = 0; i2 < n10; ++i2) {
                            int n15;
                            block12: {
                                float f10;
                                int n16;
                                block13: {
                                    block11: {
                                        n15 = nArray[i2];
                                        n16 = nArray2[i2];
                                        int n17 = nArray3[i2];
                                        int n18 = n15 >> he_1.a(23766, 6947776715660042752L) & he_1.a(31667, 5575146098554602850L);
                                        int n19 = n15 >> he_1.a(19221, 4026630262429824449L) & he_1.a(25916, 4567500073241156587L);
                                        int n20 = n15 & he_1.a(25916, 4567500073241156587L);
                                        int n21 = n17 >> he_1.a(24993, 3377448795704696692L) & he_1.a(25916, 4567500073241156587L);
                                        int n22 = n17 >> he_1.a(15252, 413527745253688644L) & he_1.a(25916, 4567500073241156587L);
                                        int n23 = n17 & he_1.a(25916, 4567500073241156587L);
                                        fArray = Color.RGBtoHSB(n18, n20, n19, fArray);
                                        fArray2 = Color.RGBtoHSB(n21, n23, n22, fArray2);
                                        float f11 = Math.abs(fArray[0] - fArray2[0]) - this.m;
                                        n14 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                        if (stringArray == null) continue block1;
                                        if (stringArray == null) break block11;
                                        if (n14 >= 0) break block12;
                                        float f12 = Math.abs(fArray[1] - fArray2[1]) - this.M;
                                        f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                    }
                                    if (stringArray == null) break block13;
                                    if (f10 >= 0) break block12;
                                    float f13 = Math.abs(fArray[2] - fArray2[2]) - this.A;
                                    f10 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                }
                                if (f10 < 0) {
                                    nArray[i2] = n16;
                                    if (stringArray != null) continue;
                                }
                            }
                            nArray[i2] = n15;
                            if (stringArray != null) continue;
                        }
                        this.E(bufferedImage2, 0, n13, n10, 1, nArray);
                        ++n13;
                        if (stringArray != null) continue block0;
                    }
                    break;
                }
            }
            bufferedImage3 = bufferedImage2;
        }
        return bufferedImage3;
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
                v0 = "Ccc\u0016  \u000eCccQ`i".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 116;
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
                                v9 = 124;
                                break;
                            }
                            case 1: {
                                v9 = 114;
                                break;
                            }
                            case 2: {
                                v9 = 110;
                                break;
                            }
                            case 3: {
                                v9 = 11;
                                break;
                            }
                            case 4: {
                                v9 = 58;
                                break;
                            }
                            case 5: {
                                v9 = 51;
                                break;
                            }
                            default: {
                                v9 = 85;
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
                he_1.a = new String(v10).intern();
                var0_1 = 1616851054770137083L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "b\u00aaF\u00d2\u0007\u00bd\u00922\n\u00e051\u00c5F\u00b8\u009f\u008e=\u0080\u00e2m\u00ef\u0085\u00eb3\u00a1&/7V<\u00ef";
                var5_5 = "b\u00aaF\u00d2\u0007\u00bd\u00922\n\u00e051\u00c5F\u00b8\u009f\u008e=\u0080\u00e2m\u00ef\u0085\u00eb3\u00a1&/7V<\u00ef".length();
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
                    var4_4 = "\nQ\u00ed$\u00de\u00d7b\u00b79\u00aa\u00bd%Q\n\u00a2f";
                    var5_5 = "\nQ\u00ed$\u00de\u00d7b\u00b79\u00aa\u00bd%Q\n\u00a2f".length();
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
        he_1.b = var6_2;
        he_1.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7ED4;
        if (c[n11] == null) {
            he_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

