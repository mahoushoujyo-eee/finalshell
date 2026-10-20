/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

class TY
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public TY(float f10, ColorModel colorModel, ColorModel colorModel2) {
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
                    int n22;
                    block14: {
                        block12: {
                            int n23;
                            int n24;
                            block10: {
                                int n25;
                                block11: {
                                    block9: {
                                        int n26;
                                        int n27;
                                        block7: {
                                            int n28;
                                            block8: {
                                                n28 = nArray[i2];
                                                n18 = nArray2[i2];
                                                n25 = nArray[i2 + 1];
                                                n17 = nArray2[i2 + 1];
                                                n22 = nArray[i2 + 2];
                                                n16 = nArray2[i2 + 2];
                                                n15 = nArray[i2 + 3];
                                                n14 = nArray2[i2 + 3];
                                                n27 = n18;
                                                n26 = TY.b(3664, 6730940233445230440L);
                                                if (string != null) break block7;
                                                if (n27 >= n26) break block8;
                                                n21 = n18 * n28 + TY.b(8278, 7649783469021981039L);
                                                n13 = 2 * ((n21 >> TY.b(6108, 4547976378018717408L)) + n21 >> TY.b(23778, 6048668738469041629L));
                                                if (string == null) break block9;
                                            }
                                            n27 = (TY.b(21112, 1487575835253447493L) - n18) * (TY.b(9653, 2662323655478996107L) - n28);
                                            n26 = TY.b(8278, 7649783469021981039L);
                                        }
                                        n21 = n27 + n26;
                                        n13 = 2 * (TY.b(9653, 2662323655478996107L) - ((n21 >> TY.b(23778, 6048668738469041629L)) + n21 >> TY.b(23778, 6048668738469041629L)));
                                    }
                                    n24 = n17;
                                    n23 = TY.b(8278, 7649783469021981039L);
                                    if (string != null) break block10;
                                    if (n24 >= n23) break block11;
                                    n21 = n17 * n25 + TY.b(8278, 7649783469021981039L);
                                    n12 = 2 * ((n21 >> TY.b(23778, 6048668738469041629L)) + n21 >> TY.b(23778, 6048668738469041629L));
                                    if (string == null) break block12;
                                }
                                n21 = (TY.b(9653, 2662323655478996107L) - n17) * (TY.b(9653, 2662323655478996107L) - n25) + TY.b(8278, 7649783469021981039L);
                                n24 = 2;
                                n23 = TY.b(9653, 2662323655478996107L) - ((n21 >> TY.b(23778, 6048668738469041629L)) + n21 >> TY.b(23778, 6048668738469041629L));
                            }
                            n12 = n24 * n23;
                        }
                        n20 = n16;
                        n19 = TY.b(8278, 7649783469021981039L);
                        if (string != null) break block13;
                        if (n20 >= n19) break block14;
                        n21 = n16 * n22 + TY.b(8278, 7649783469021981039L);
                        n11 = 2 * ((n21 >> TY.b(23778, 6048668738469041629L)) + n21 >> TY.b(23778, 6048668738469041629L));
                        if (string == null) break block15;
                    }
                    n21 = (TY.b(9653, 2662323655478996107L) - n16) * (TY.b(9653, 2662323655478996107L) - n22) + TY.b(8278, 7649783469021981039L);
                    n20 = 2;
                    n19 = TY.b(9653, 2662323655478996107L) - ((n21 >> TY.b(23778, 6048668738469041629L)) + n21 >> TY.b(23778, 6048668738469041629L));
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
                var0 = 3909850653919408307L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u00e1\u00a9]~=\u001d\u00ae[\u008e\u00f8\u0016\u0003c\rk\t\u00c8\u00caa\u00e4\u0006@\u001c\u00c7\u00dd\u00b7\u0082o\u00f7\u00c4\u00e5f";
                var5_4 = "\u00e1\u00a9]~=\u001d\u00ae[\u008e\u00f8\u0016\u0003c\rk\t\u00c8\u00caa\u00e4\u0006@\u001c\u00c7\u00dd\u00b7\u0082o\u00f7\u00c4\u00e5f".length();
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
                    var4_3 = "+\u00a8q\u00fb\u00a5R\u00b7[\u0090\u00dd\u008b\u009c\u00b0\u0004\u0019\\";
                    var5_4 = "+\u00a8q\u00fb\u00a5R\u00b7[\u0090\u00dd\u008b\u009c\u00b0\u0004\u0019\\".length();
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
        TY.c = var6_1;
        TY.e = new Integer[6];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x493C;
        if (e[n11] == null) {
            TY.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

