/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

class TL
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public TL(float f10, ColorModel colorModel, ColorModel colorModel2) {
        super(f10, colorModel, colorModel2);
    }

    @Override
    public void G(int[] nArray, int[] nArray2, float f10) {
        int n10 = nArray.length;
        String string = ra_1.c();
        for (int i2 = 0; i2 < n10; i2 += 4) {
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            block15: {
                int n19;
                block13: {
                    int n20;
                    block14: {
                        block12: {
                            int n21;
                            block10: {
                                int n22;
                                block11: {
                                    block9: {
                                        int n23;
                                        block7: {
                                            int n24;
                                            block8: {
                                                n24 = nArray[i2];
                                                n18 = nArray2[i2];
                                                n22 = nArray[i2 + 1];
                                                n17 = nArray2[i2 + 1];
                                                n20 = nArray[i2 + 2];
                                                n16 = nArray2[i2 + 2];
                                                n15 = nArray[i2 + 3];
                                                n14 = nArray2[i2 + 3];
                                                n23 = n24;
                                                if (string != null) break block7;
                                                if (n23 == 0) break block8;
                                                n13 = Math.max(TL.b(21803, 778304311843761528L) - (TL.b(24630, 6128435644021315684L) - n18 << TL.b(18631, 8781407763416887446L)) / n24, 0);
                                                if (string == null) break block9;
                                            }
                                            n23 = n24;
                                        }
                                        n13 = n23;
                                    }
                                    n21 = n22;
                                    if (string != null) break block10;
                                    if (n21 == 0) break block11;
                                    n12 = Math.max(TL.b(24630, 6128435644021315684L) - (TL.b(24630, 6128435644021315684L) - n17 << TL.b(16807, 6124068998702676471L)) / n22, 0);
                                    if (string == null) break block12;
                                }
                                n21 = n22;
                            }
                            n12 = n21;
                        }
                        n19 = n20;
                        if (string != null) break block13;
                        if (n19 == 0) break block14;
                        n11 = Math.max(TL.b(24630, 6128435644021315684L) - (TL.b(24630, 6128435644021315684L) - n16 << TL.b(16807, 6124068998702676471L)) / n20, 0);
                        if (string == null) break block15;
                    }
                    n19 = n20;
                }
                n11 = n19;
            }
            float f11 = f10 * (float)n15 / 255.0f;
            float f12 = 1.0f - f11;
            nArray2[i2] = (int)(f11 * (float)n13 + f12 * (float)n18);
            nArray2[i2 + 1] = (int)(f11 * (float)n12 + f12 * (float)n17);
            nArray2[i2 + 2] = (int)(f11 * (float)n11 + f12 * (float)n16);
            nArray2[i2 + 3] = (int)((float)n15 * f10 + (float)n14 * f12);
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8822623872489642782L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "t\ff\u00f6d\u001b\u00c3\u0085z\u0080,\u00dc\u0010:v\u0099";
                var5_4 = "t\ff\u00f6d\u001b\u00c3\u0085z\u0080,\u00dc\u0010:v\u0099".length();
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
                    var4_3 = "j\u00e7\u00fe\u00a9M\u0007\u00e2\u00e1W\u00ae1\u0096L\u00f2k\u0080";
                    var5_4 = "j\u00e7\u00fe\u00a9M\u0007\u00e2\u00e1W\u00ae1\u0096L\u00f2k\u0080".length();
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
        TL.c = var6_1;
        TL.e = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7852;
        if (e[n11] == null) {
            TL.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

