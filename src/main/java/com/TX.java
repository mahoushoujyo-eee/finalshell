/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.Color;
import java.awt.image.ColorModel;

class TX
extends XM {
    private float[] c = new float[3];
    private float[] W = new float[3];
    private static final long[] e;
    private static final Integer[] g;

    public TX(float f10, ColorModel colorModel, ColorModel colorModel2) {
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
            Color.RGBtoHSB(n12, n14, n16, this.W);
            this.W[0] = this.c[0];
            int n19 = Color.HSBtoRGB(this.W[0], this.W[1], this.W[2]);
            int n20 = (n19 & TX.b(31006, 6143023173494371528L)) >> TX.b(12938, 1241702702093320029L);
            int n21 = (n19 & TX.b(2049, 4661819275116709333L)) >> TX.b(3650, 5904975953761633168L);
            int n22 = n19 & TX.b(762, 8112551033732304687L);
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
                var0 = 1645038390566171920L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "\u009ex\u00f1\u00ab8sA\u00d8_\u0012\u00a5x\u0015y\u008a]\b\u0098jq#\u00f5\u00cf\u00c5";
                var5_4 = "\u009ex\u00f1\u00ab8sA\u00d8_\u0012\u00a5x\u0015y\u008a]\b\u0098jq#\u00f5\u00cf\u00c5".length();
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
                    var4_3 = "I<\u008d\n\u0094D:\u00c0yL\u0000@\\\u00bc6\u0088";
                    var5_4 = "I<\u008d\n\u0094D:\u00c0yL\u0000@\\\u00bc6\u0088".length();
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
        TX.e = var6_1;
        TX.g = new Integer[5];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xDD6;
        if (g[n11] == null) {
            TX.g[n11] = (int)(e[n11] ^ l2);
        }
        return g[n11];
    }
}

