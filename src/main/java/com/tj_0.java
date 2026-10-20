/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.Color;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Tj
 */
class tj_0
extends XM {
    private float[] V = new float[3];
    private float[] Y = new float[3];
    private static final long[] c;
    private static final Integer[] e;

    public tj_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
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
            Color.RGBtoHSB(n11, n13, n15, this.V);
            Color.RGBtoHSB(n12, n14, n16, this.Y);
            this.Y[0] = this.V[0];
            this.Y[1] = this.V[1];
            int n19 = Color.HSBtoRGB(this.Y[0], this.Y[1], this.Y[2]);
            int n20 = (n19 & tj_0.b(11318, 4747164371505270819L)) >> tj_0.b(21852, 5656419837903972680L);
            int n21 = (n19 & tj_0.b(12454, 1897947989088652465L)) >> tj_0.b(8390, 4654135539258088656L);
            int n22 = n19 & tj_0.b(2692, 2323825456291313300L);
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
                var0 = 1493632903275716907L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "5\u0094\r&\u00e2(\u0088s\u0003f\u0091\u00aee\u009c\u00f1\b\u008f\u001fc\u00b3\u0001j}\u00f3";
                var5_4 = "5\u0094\r&\u00e2(\u0088s\u0003f\u0091\u00aee\u009c\u00f1\b\u008f\u001fc\u00b3\u0001j}\u00f3".length();
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
                    var4_3 = "{\u00cb\u00de\u00aa\u00ab^\u0092\u009a`\u00cdm\u00ac\u00fa\u00d5W@";
                    var5_4 = "{\u00cb\u00de\u00aa\u00ab^\u0092\u009a`\u00cdm\u00ac\u00fa\u00d5W@".length();
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
        tj_0.c = var6_1;
        tj_0.e = new Integer[5];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7C14;
        if (e[n11] == null) {
            tj_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

