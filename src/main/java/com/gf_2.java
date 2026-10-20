/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gf
 */
public class gf_2
extends gy_2 {
    private float V = 1.0f;
    private BufferedImage j = null;
    private int[] O;
    private int[] w;
    private int M;
    private int G;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void r(BufferedImage bufferedImage) {
        this.j = bufferedImage;
    }

    public BufferedImage T() {
        return this.j;
    }

    public void d(float f10) {
        this.V = f10;
    }

    public float A() {
        return this.V;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int[] nArray;
        String[] stringArray;
        block7: {
            int n17;
            int n18 = bufferedImage.getWidth();
            int n19 = bufferedImage.getHeight();
            stringArray = W5.q();
            BufferedImage bufferedImage3 = this.j;
            if (stringArray != null) {
                bufferedImage3 = bufferedImage3 != null ? this.j : bufferedImage;
            }
            BufferedImage bufferedImage4 = bufferedImage3;
            this.M = bufferedImage4.getWidth();
            this.G = bufferedImage4.getHeight();
            nArray = new int[this.M * this.G];
            this.l(bufferedImage4, 0, 0, this.M, this.G, nArray);
            this.O = new int[this.M * this.G];
            this.w = new int[this.M * this.G];
            n16 = 0;
            n15 = 0;
            while (n15 < this.G) {
                block8: {
                    n17 = 0;
                    if (stringArray == null) break block7;
                    for (n14 = v7878910; n14 < this.M; ++n14) {
                        n13 = nArray[n16];
                        n12 = n13 >> gf_2.b(6558, 7362546283204356881L) & gf_2.b(10545, 2862813268562156476L);
                        n11 = n13 >> gf_2.b(24882, 89588235312419774L) & gf_2.b(8099, 209103218654948653L);
                        n10 = n13 & gf_2.b(8099, 209103218654948653L);
                        nArray[n16] = (n12 + n11 + n10) / gf_2.b(24956, 8283180312587654135L);
                        ++n16;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block8;
                    }
                    ++n15;
                }
                if (stringArray != null) continue;
            }
            n16 = 0;
            n17 = n15 = 0;
        }
        while (n15 < this.G) {
            block9: {
                n14 = (n15 + this.G - 1) % this.G * this.M;
                n13 = n15 * this.M;
                n12 = (n15 + 1) % this.G * this.M;
                for (n11 = 0; n11 < this.M; ++n11) {
                    n10 = (n11 + this.M - 1) % this.M;
                    int n20 = n11;
                    int n21 = (n11 + 1) % this.M;
                    this.O[n16] = nArray[n10 + n14] + nArray[n10 + n13] + nArray[n10 + n12] - nArray[n21 + n14] - nArray[n21 + n13] - nArray[n21 + n12];
                    this.w[n16] = nArray[n10 + n12] + nArray[n20 + n12] + nArray[n21 + n12] - nArray[n10 + n14] - nArray[n20 + n14] - nArray[n21 + n14];
                    ++n16;
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block9;
                }
                ++n15;
            }
            if (stringArray != null) continue;
        }
        nArray = null;
        bufferedImage2 = super.filter(bufferedImage, bufferedImage2);
        this.w = null;
        this.O = null;
        return bufferedImage2;
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        float f10 = n10;
        float f11 = n11;
        int n12 = n11 % this.G * this.M + n10 % this.M;
        fArray[0] = (float)n10 + this.V * (float)this.O[n12];
        fArray[1] = (float)n11 + this.V * (float)this.w[n12];
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
                v0 = "by`X\u007fU\u0007\tTz_`K\u0012Eu=\u0002>".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 30;
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
                                v9 = 56;
                                break;
                            }
                            case 1: {
                                v9 = 14;
                                break;
                            }
                            case 2: {
                                v9 = 13;
                                break;
                            }
                            case 3: {
                                v9 = 50;
                                break;
                            }
                            case 4: {
                                v9 = 14;
                                break;
                            }
                            case 5: {
                                v9 = 57;
                                break;
                            }
                            default: {
                                v9 = 109;
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
                gf_2.a = new String(v10).intern();
                var0_1 = 2469273914123126608L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "\u00cb\u00c8\u00f9\u00f2\u00c4\u00b6,Q\u001e\u0005kP5#*\u0082\u00baj3\u00b22\u009e\u009c\u0013";
                var5_5 = "\u00cb\u00c8\u00f9\u00f2\u00c4\u00b6,Q\u001e\u0005kP5#*\u0082\u00baj3\u00b22\u009e\u009c\u0013".length();
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
                    var4_4 = "\u0089\u00e0!\u00d0\u00b5\u00abT\u00e6Q\u00e3\u00b4\u00fdf9T\u00af";
                    var5_5 = "\u0089\u00e0!\u00d0\u00b5\u00abT\u00e6Q\u00e3\u00b4\u00fdf9T\u00af".length();
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
        gf_2.b = var6_2;
        gf_2.c = new Integer[5];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x328F;
        if (c[n11] == null) {
            gf_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

