/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Tp
 */
class tp_0
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public tp_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
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
                                                if (n23 == tp_0.b(17100, 8260888752962153602L)) break block8;
                                                n13 = Math.min((n18 << tp_0.b(29944, 4876849918020000437L)) / (tp_0.b(5364, 1553565865533700792L) - n24), tp_0.b(5364, 1553565865533700792L));
                                                if (string == null) break block9;
                                            }
                                            n23 = n24;
                                        }
                                        n13 = n23;
                                    }
                                    n21 = n22;
                                    if (string != null) break block10;
                                    if (n21 == tp_0.b(5364, 1553565865533700792L)) break block11;
                                    n12 = Math.min((n17 << tp_0.b(32133, 5162521361070232522L)) / (tp_0.b(5364, 1553565865533700792L) - n22), tp_0.b(5364, 1553565865533700792L));
                                    if (string == null) break block12;
                                }
                                n21 = n22;
                            }
                            n12 = n21;
                        }
                        n19 = n20;
                        if (string != null) break block13;
                        if (n19 == tp_0.b(5364, 1553565865533700792L)) break block14;
                        n11 = Math.min((n16 << tp_0.b(32133, 5162521361070232522L)) / (tp_0.b(5364, 1553565865533700792L) - n20), tp_0.b(5364, 1553565865533700792L));
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
                var0 = 8507461729964107450L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u0002/\u0098\u001e\u00f3\u00e9\u008a\u00c7\u00d4\u009cG\u008c-H\u00b5x";
                var5_4 = "\u0002/\u0098\u001e\u00f3\u00e9\u008a\u00c7\u00d4\u009cG\u008c-H\u00b5x".length();
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
                    var4_3 = "*.\u0011\u0095\u001c\u00f3\\\u00fd\u00d0Y\u00c3\u0001\u0018\u00c4<\u0007";
                    var5_4 = "*.\u0011\u0095\u001c\u00f3\\\u00fd\u00d0Y\u00c3\u0001\u0018\u00c4<\u0007".length();
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
        tp_0.c = var6_1;
        tp_0.e = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6E4E;
        if (e[n11] == null) {
            tp_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

