/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.hj
 */
public class hj_2
extends W5 {
    private float H = 2.0f;
    private float o = (float)Math.toRadians(108.0);
    private float i = (float)Math.toRadians(162.0);
    private float T = (float)Math.toRadians(90.0);
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void h(float f10) {
        this.H = f10;
    }

    public float u() {
        return this.H;
    }

    public float r() {
        return this.o;
    }

    public void m(float f10) {
        this.o = f10;
    }

    public float H() {
        return this.i;
    }

    public void N(float f10) {
        this.i = f10;
    }

    public float T() {
        return this.T;
    }

    public void W(float f10) {
        this.T = f10;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10;
        String[] stringArray;
        int n11;
        block16: {
            BufferedImage bufferedImage3;
            block15: {
                n11 = bufferedImage.getWidth();
                stringArray = W5.q();
                n10 = bufferedImage.getHeight();
                int n12 = bufferedImage.getType();
                WritableRaster writableRaster = bufferedImage.getRaster();
                bufferedImage3 = bufferedImage2;
                if (stringArray == null) break block15;
                if (bufferedImage3 != null) break block16;
                bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage2 = bufferedImage3;
        }
        float f10 = 2.0f * this.H * 1.414f;
        float[] fArray = new float[]{this.o, this.i, this.T};
        float[] fArray2 = new float[]{0.0f, -1.0f, 1.0f, 0.0f, 0.0f};
        float[] fArray3 = new float[]{0.0f, 0.0f, 0.0f, -1.0f, 1.0f};
        float f11 = f10 / 2.0f;
        int[] nArray = new int[n11];
        int[] nArray2 = this.l(bufferedImage, 0, 0, n11, n10, null);
        int n13 = 0;
        block0: while (true) {
            int n14 = n13;
            block1: while (n14 < n10) {
                int n15;
                int n16;
                block13: {
                    n16 = 0;
                    n15 = n13 * n11;
                    while (n16 < n11) {
                        nArray[n16] = nArray2[n15] & hj_2.a(18595, 6958353787693511217L) | hj_2.a(560, 4685628046255126691L);
                        ++n16;
                        ++n15;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block13;
                    }
                    n16 = 0;
                }
                block3: while (true) {
                    int n17 = n16;
                    block4: while (n17 < 3) {
                        n15 = hj_2.a(16538, 4219483431474903562L) - hj_2.a(32526, 6439501515653350811L) * n16;
                        int n18 = hj_2.a(9162, 8937331381710936414L) << n15;
                        float f12 = fArray[n16];
                        float f13 = (float)Math.sin(f12);
                        float f14 = (float)Math.cos(f12);
                        n14 = 0;
                        if (stringArray == null) continue block1;
                        int n19 = n14;
                        while (n19 < n11) {
                            block14: {
                                int n20;
                                float f15 = (float)n19 * f14 + (float)n13 * f13;
                                float f16 = (float)(-n19) * f13 + (float)n13 * f14;
                                f15 = f15 - NM.i(f15 - f11, f10) + f11;
                                f16 = f16 - NM.i(f16 - f11, f10) + f11;
                                float f17 = 1.0f;
                                n17 = 0;
                                if (stringArray == null) continue block4;
                                for (n20 = v8088557; n20 < 5; ++n20) {
                                    float f18 = f15 + fArray2[n20] * f10;
                                    float f19 = f16 + fArray3[n20] * f10;
                                    float f20 = f18 * f14 - f19 * f13;
                                    float f21 = f18 * f13 + f19 * f14;
                                    int n21 = NM.L((int)f20, 0, n11 - 1);
                                    int n22 = NM.L((int)f21, 0, n10 - 1);
                                    int n23 = nArray2[n22 * n11 + n21];
                                    int n24 = n23 >> n15 & hj_2.a(12174, 1172769696302257439L);
                                    float f22 = (float)n24 / 255.0f;
                                    f22 = 1.0f - f22 * f22;
                                    f22 = (float)((double)f22 * ((double)f11 * 1.414));
                                    float f23 = (float)n19 - f20;
                                    float f24 = (float)n13 - f21;
                                    float f25 = f23 * f23;
                                    float f26 = f24 * f24;
                                    float f27 = (float)Math.sqrt(f25 + f26);
                                    float f28 = 1.0f - NM.k(f27, f27 + 1.0f, f22);
                                    f17 = Math.min(f17, f28);
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                    }
                                    break block14;
                                }
                                n20 = (int)(255.0f * f17);
                                n20 <<= n15;
                                n20 ^= ~n18;
                                int n25 = n19++;
                                nArray[n25] = nArray[n25] & (n20 |= hj_2.a(17364, 3506722014742526275L));
                            }
                            if (stringArray != null) continue;
                        }
                        ++n16;
                        if (stringArray != null) continue block3;
                    }
                    break;
                }
                this.E(bufferedImage2, 0, n13, n11, 1, nArray);
                ++n13;
                if (stringArray != null) continue block0;
            }
            break;
        }
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
                v0 = "`\u0010qUzM%D\u001c&syM+BYAQzG0_\u0017l\u001e8\u000f".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 76;
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
                                v9 = 53;
                                break;
                            }
                            case 2: {
                                v9 = 69;
                                break;
                            }
                            case 3: {
                                v9 = 124;
                                break;
                            }
                            case 4: {
                                v9 = 90;
                                break;
                            }
                            case 5: {
                                v9 = 109;
                                break;
                            }
                            default: {
                                v9 = 8;
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
                hj_2.a = new String(v10).intern();
                var0_1 = 5239867199143746088L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00b4\u00ae(\u0006\u009c_O\u00c8\u00de\u00fd\u0092c\u009f\u009a 2b\u00ee\u00fc7Mt\u001dt|Y\u00ea\u000et\u00d8(\u0019vi\u0002I\u00104\u009f\u00bb";
                var5_5 = "\u00b4\u00ae(\u0006\u009c_O\u00c8\u00de\u00fd\u0092c\u009f\u009a 2b\u00ee\u00fc7Mt\u001dt|Y\u00ea\u000et\u00d8(\u0019vi\u0002I\u00104\u009f\u00bb".length();
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
                    var4_4 = "\u0004k\u0017X\u0085\u00fb\u00c3\u0089\u00b7\u007f\u0084\u00b3\u0092\u00ea#k";
                    var5_5 = "\u0004k\u0017X\u0085\u00fb\u00c3\u0089\u00b7\u007f\u0084\u00b3\u0092\u00ea#k".length();
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
        hj_2.b = var6_2;
        hj_2.c = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7A91;
        if (c[n11] == null) {
            hj_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

