/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.Color;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Tr
 */
class tr_0
extends XM {
    private float[] c = new float[3];
    private float[] U = new float[3];
    private static final long[] e;
    private static final Integer[] g;

    public tr_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
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
            Color.RGBtoHSB(n11, n13, n15, this.c);
            Color.RGBtoHSB(n12, n14, n16, this.U);
            this.U[2] = this.c[2];
            int n19 = Color.HSBtoRGB(this.U[0], this.U[1], this.U[2]);
            int n20 = (n19 & tr_0.b(11835, 593538394074009732L)) >> tr_0.b(23774, 2371336937751192165L);
            int n21 = (n19 & tr_0.b(8255, 7910131832878325381L)) >> tr_0.b(17316, 6730012776450538781L);
            int n22 = n19 & tr_0.b(19279, 4043486719288194551L);
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
                var0 = 5836329565147288931L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "\u0088\u0015n\u00e8\u00b3\u00da\u00f7\u0016\u00bc\u0092\u008c\u001e3\u008e\u00f4\u00e6\u00db\u009e\u00e0\u00da\u00b0\u009ahv";
                var5_4 = "\u0088\u0015n\u00e8\u00b3\u00da\u00f7\u0016\u00bc\u0092\u008c\u001e3\u008e\u00f4\u00e6\u00db\u009e\u00e0\u00da\u00b0\u009ahv".length();
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
                    var4_3 = "\u0005\u008b>\u008bO\u0098`k\u009f\u00a1\u00df\u00a4i\u001f\u0085\u00e7";
                    var5_4 = "\u0005\u008b>\u008bO\u0098`k\u009f\u00a1\u00df\u00a4i\u001f\u0085\u00e7".length();
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
        tr_0.e = var6_1;
        tr_0.g = new Integer[5];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7EBB;
        if (g[n11] == null) {
            tr_0.g[n11] = (int)(e[n11] ^ l2);
        }
        return g[n11];
    }
}

