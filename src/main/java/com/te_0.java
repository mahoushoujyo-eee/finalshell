/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Te
 */
class te_0
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public te_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
        super(f10, colorModel, colorModel2);
    }

    @Override
    public void G(int[] nArray, int[] nArray2, float f10) {
        int n10 = nArray.length;
        String string = ra_1.c();
        for (int i2 = 0; i2 < n10; i2 += 4) {
            int n11 = nArray[i2];
            int n12 = nArray2[i2];
            int n13 = nArray[i2 + 1];
            int n14 = nArray2[i2 + 1];
            int n15 = nArray[i2 + 2];
            int n16 = nArray2[i2 + 2];
            int n17 = nArray[i2 + 3];
            int n18 = nArray2[i2 + 3];
            int n19 = (te_0.b(2157, 2707633846231914238L) - n12) * (te_0.b(7444, 1165573058385593222L) - n11) + te_0.b(25186, 2792082941933698294L);
            int n20 = te_0.b(7444, 1165573058385593222L) - ((n19 >> te_0.b(14817, 8394250381264775024L)) + n19 >> te_0.b(30367, 6972892515718932495L));
            n19 = (te_0.b(7444, 1165573058385593222L) - n14) * (te_0.b(7444, 1165573058385593222L) - n13) + te_0.b(31889, 323620260321337860L);
            int n21 = te_0.b(7444, 1165573058385593222L) - ((n19 >> te_0.b(30367, 6972892515718932495L)) + n19 >> te_0.b(30367, 6972892515718932495L));
            n19 = (te_0.b(7444, 1165573058385593222L) - n16) * (te_0.b(7444, 1165573058385593222L) - n15) + te_0.b(31889, 323620260321337860L);
            int n22 = te_0.b(7444, 1165573058385593222L) - ((n19 >> te_0.b(30367, 6972892515718932495L)) + n19 >> te_0.b(30367, 6972892515718932495L));
            float f11 = f10 * (float)n17 / 255.0f;
            float f12 = 1.0f - f11;
            nArray2[i2] = (int)(f11 * (float)n20 + f12 * (float)n12);
            nArray2[i2 + 1] = (int)(f11 * (float)n21 + f12 * (float)n14);
            nArray2[i2 + 2] = (int)(f11 * (float)n22 + f12 * (float)n16);
            nArray2[i2 + 3] = (int)((float)n17 * f10 + (float)n18 * f12);
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1139314928574003848L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u00a2\u00cb2V\u00b4\u009b\u00d2\u008f\u00f3\u0096\u00d6^f\n\u009d\u00f0\u00f1X^\u00f1L%9\u00f1\u00a0O\u0095X\u0016\u0089\u00ac\u0089";
                var5_4 = "\u00a2\u00cb2V\u00b4\u009b\u00d2\u008f\u00f3\u0096\u00d6^f\n\u009d\u00f0\u00f1X^\u00f1L%9\u00f1\u00a0O\u0095X\u0016\u0089\u00ac\u0089".length();
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
                    var4_3 = "\u0006\u0013A\u00cc\u00a5\u0091F\u00fe\u008d1\u00d9D\u00a6aX\f";
                    var5_4 = "\u0006\u0013A\u00cc\u00a5\u0091F\u00fe\u008d1\u00d9D\u00a6aX\f".length();
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
        te_0.c = var6_1;
        te_0.e = new Integer[6];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E90;
        if (e[n11] == null) {
            te_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

