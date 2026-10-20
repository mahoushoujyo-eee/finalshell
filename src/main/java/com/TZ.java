/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

class TZ
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public TZ(float f10, ColorModel colorModel, ColorModel colorModel2) {
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
                int n20;
                block13: {
                    int n21;
                    block14: {
                        block12: {
                            int n22;
                            int n23;
                            block10: {
                                int n24;
                                block11: {
                                    block9: {
                                        int n25;
                                        int n26;
                                        block7: {
                                            int n27;
                                            block8: {
                                                n27 = nArray[i2];
                                                n18 = nArray2[i2];
                                                n24 = nArray[i2 + 1];
                                                n17 = nArray2[i2 + 1];
                                                n21 = nArray[i2 + 2];
                                                n16 = nArray2[i2 + 2];
                                                n15 = nArray[i2 + 3];
                                                n14 = nArray2[i2 + 3];
                                                n26 = n27;
                                                n25 = TZ.b(2011, 3277840925875532657L);
                                                if (string != null) break block7;
                                                if (n26 <= n25) break block8;
                                                n13 = TZ.b(26392, 5314250651222086576L) - 2 * TZ.U(TZ.b(29342, 260001062946375221L) - n27, TZ.b(29342, 260001062946375221L) - n18);
                                                if (string == null) break block9;
                                            }
                                            n26 = 2;
                                            n25 = TZ.U(n27, n18);
                                        }
                                        n13 = n26 * n25;
                                    }
                                    n23 = n24;
                                    n22 = TZ.b(30461, 4961901585517052500L);
                                    if (string != null) break block10;
                                    if (n23 <= n22) break block11;
                                    n12 = TZ.b(29342, 260001062946375221L) - 2 * TZ.U(TZ.b(29342, 260001062946375221L) - n24, TZ.b(29342, 260001062946375221L) - n17);
                                    if (string == null) break block12;
                                }
                                n23 = 2;
                                n22 = TZ.U(n24, n17);
                            }
                            n12 = n23 * n22;
                        }
                        n20 = n21;
                        n19 = TZ.b(30461, 4961901585517052500L);
                        if (string != null) break block13;
                        if (n20 <= n19) break block14;
                        n11 = TZ.b(29342, 260001062946375221L) - 2 * TZ.U(TZ.b(29342, 260001062946375221L) - n21, TZ.b(29342, 260001062946375221L) - n16);
                        if (string == null) break block15;
                    }
                    n20 = 2;
                    n19 = TZ.U(n21, n16);
                }
                n11 = n20 * n19;
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
                var0 = 8189101713035110550L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "@\u008f\u0001\u00aeZ\f[\u0098\u00d8\u001a\u009eY\u001d$\u00ae\\";
                var5_4 = "@\u008f\u0001\u00aeZ\f[\u0098\u00d8\u001a\u009eY\u001d$\u00ae\\".length();
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
                    var4_3 = "2\u00c6+\u0088b{;\u00d9\u00a7J{\u0001,1*\u00bd";
                    var5_4 = "2\u00c6+\u0088b{;\u00d9\u00a7J{\u0001,1*\u00bd".length();
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
        TZ.c = var6_1;
        TZ.e = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x74AA;
        if (e[n11] == null) {
            TZ.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

