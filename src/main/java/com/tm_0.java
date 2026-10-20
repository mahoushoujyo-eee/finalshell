/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Tm
 */
class tm_0
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public tm_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
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
            int n19 = tm_0.c((n11 << tm_0.b(3040, 2091678050655079513L)) / (tm_0.b(183, 375426383899985676L) - n12));
            int n20 = tm_0.c((n13 << tm_0.b(31068, 5505995576225693414L)) / (tm_0.b(31291, 2905730490919845251L) - n14));
            int n21 = tm_0.c((n15 << tm_0.b(31068, 5505995576225693414L)) / (tm_0.b(31291, 2905730490919845251L) - n16));
            float f11 = f10 * (float)n17 / 255.0f;
            float f12 = 1.0f - f11;
            nArray2[i2] = (int)(f11 * (float)n19 + f12 * (float)n12);
            nArray2[i2 + 1] = (int)(f11 * (float)n20 + f12 * (float)n14);
            nArray2[i2 + 2] = (int)(f11 * (float)n21 + f12 * (float)n16);
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
                var0 = 2548755882655846989L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u0082I\u00f4\u00ec7H\u0094AI3Y\u00d3[.l\u00a3";
                var5_4 = "\u0082I\u00f4\u00ec7H\u0094AI3Y\u00d3[.l\u00a3".length();
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
                    var4_3 = "\u009f\u0084\u00c0\u00aeu$\u009e\u001c`\u00eb\u0017\u000e\u00d0\u00af\u00ee\u00ce";
                    var5_4 = "\u009f\u0084\u00c0\u00aeu$\u009e\u001c`\u00eb\u0017\u000e\u00d0\u00af\u00ee\u00ce".length();
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
        tm_0.c = var6_1;
        tm_0.e = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7BB;
        if (e[n11] == null) {
            tm_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

