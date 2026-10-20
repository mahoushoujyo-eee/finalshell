/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.hL
 */
public class hl_1
extends W5 {
    private float F = 0.0f;
    private float k = 0.0f;
    private float D = 0.0f;
    private int J;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void z(float f10) {
        this.F = f10;
    }

    public float n() {
        return this.F;
    }

    public void u(float f10) {
        this.k = f10;
    }

    public float e() {
        return this.k;
    }

    public void Y(float f10) {
        this.D = f10;
    }

    public float w() {
        return this.D;
    }

    public void V(int n10) {
        this.J = n10;
    }

    public int c() {
        return this.J;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        String[] stringArray = W5.q();
        int n12 = bufferedImage.getType();
        WritableRaster writableRaster = bufferedImage.getRaster();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = bufferedImage2;
        }
        WritableRaster writableRaster2 = bufferedImage3.getRaster();
        float[] fArray = null;
        float[] fArray2 = null;
        int n13 = this.J;
        int n14 = n13 >> hl_1.a(30271, 3427552491576289018L) & hl_1.a(5437, 8474625266174494207L);
        int n15 = n13 >> hl_1.a(5624, 2459426018438546751L) & hl_1.a(24318, 6538686542428556863L);
        int n16 = n13 & hl_1.a(24318, 6538686542428556863L);
        fArray2 = Color.RGBtoHSB(n14, n16, n15, fArray2);
        int[] nArray = null;
        int n17 = 0;
        block0: while (true) {
            int n18 = n17;
            block1: while (n18 < n11) {
                nArray = this.l(bufferedImage, 0, n17, n10, 1, nArray);
                for (int i2 = 0; i2 < n10; ++i2) {
                    int n19;
                    block10: {
                        float f10;
                        block11: {
                            block9: {
                                n19 = nArray[i2];
                                int n20 = n19 >> hl_1.a(598, 6246191735092744848L) & hl_1.a(24318, 6538686542428556863L);
                                int n21 = n19 >> hl_1.a(23309, 8437934781275851725L) & hl_1.a(24318, 6538686542428556863L);
                                int n22 = n19 & hl_1.a(24318, 6538686542428556863L);
                                fArray = Color.RGBtoHSB(n20, n22, n21, fArray);
                                float f11 = Math.abs(fArray[0] - fArray2[0]) - this.F;
                                n18 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                if (stringArray == null) continue block1;
                                if (stringArray == null) break block9;
                                if (n18 >= 0) break block10;
                                float f12 = Math.abs(fArray[1] - fArray2[1]) - this.k;
                                f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            }
                            if (stringArray == null) break block11;
                            if (f10 >= 0) break block10;
                            float f13 = Math.abs(fArray[2] - fArray2[2]) - this.D;
                            f10 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                        }
                        if (f10 < 0) {
                            nArray[i2] = n19 & hl_1.a(30098, 2246021578804192593L);
                            if (stringArray != null) continue;
                        }
                    }
                    nArray[i2] = n19;
                    if (stringArray != null) continue;
                }
                this.E(bufferedImage2, 0, n17, n10, 1, nArray);
                ++n17;
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
                v0 = "@tQ%*f\nHyZ#)`\u0005@tQbj/".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 121;
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
                                v9 = 114;
                                break;
                            }
                            case 1: {
                                v9 = 104;
                                break;
                            }
                            case 2: {
                                v9 = 81;
                                break;
                            }
                            case 3: {
                                v9 = 53;
                                break;
                            }
                            case 4: {
                                v9 = 61;
                                break;
                            }
                            case 5: {
                                v9 = 120;
                                break;
                            }
                            default: {
                                v9 = 92;
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
                hl_1.a = new String(v10).intern();
                var0_1 = 4698780237102926517L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u000eP/\u00f2$\u00a6\u00d0\u001b\u0082\u0003\u00c6\u0099\u008c\u00c4\u00cf\u00b5\u00d2Bqz\u00ad1\u0084u\u00ce\u00d8\u00a9\u001d\u00c5\u00f9\u0001pa>\u00d09\u001aGO\u0082";
                var5_5 = "\u000eP/\u00f2$\u00a6\u00d0\u001b\u0082\u0003\u00c6\u0099\u008c\u00c4\u00cf\u00b5\u00d2Bqz\u00ad1\u0084u\u00ce\u00d8\u00a9\u001d\u00c5\u00f9\u0001pa>\u00d09\u001aGO\u0082".length();
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
                    var4_4 = "\u00f7\u00d1 *\u00ef\nX5\u000b/\u00e8\u00ab;M\u00ac_";
                    var5_5 = "\u00f7\u00d1 *\u00ef\nX5\u000b/\u00e8\u00ab;M\u00ac_".length();
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
        hl_1.b = var6_2;
        hl_1.c = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x10C3;
        if (c[n11] == null) {
            hl_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

