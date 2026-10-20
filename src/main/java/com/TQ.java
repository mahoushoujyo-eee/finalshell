/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

class TQ
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public TQ(float f10, ColorModel colorModel, ColorModel colorModel2) {
        super(f10, colorModel, colorModel2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void G(int[] var1_1, int[] var2_2, float var3_3) {
        var5_4 = var1_1.length;
        var4_5 = ra_1.c();
        for (var6_6 = 0; var6_6 < var5_4; var6_6 += 4) {
            var7_7 = var1_1[var6_6];
            var8_8 = var2_2[var6_6];
            var9_9 = var1_1[var6_6 + 1];
            var10_10 = var2_2[var6_6 + 1];
            var11_11 = var1_1[var6_6 + 2];
            var12_12 = var2_2[var6_6 + 2];
            var13_13 = var1_1[var6_6 + 3];
            var14_14 = var2_2[var6_6 + 3];
            v0 = var7_7;
            v1 = TQ.b(15135, 2806817836720972409L);
            if (var4_5 != null) ** GOTO lbl20
            if (v0 > v1) {
                v2 = Math.max(var7_7, var8_8);
            } else {
                v0 = var7_7;
                v1 = var8_8;
lbl20:
                // 2 sources

                v2 = Math.min(v0, v1);
            }
            var15_15 = v2;
            v3 = var9_9;
            v4 = TQ.b(9098, 4152576233581542125L);
            if (var4_5 != null) ** GOTO lbl30
            if (v3 > v4) {
                v5 = Math.max(var9_9, var10_10);
            } else {
                v3 = var9_9;
                v4 = var10_10;
lbl30:
                // 2 sources

                v5 = Math.min(v3, v4);
            }
            var16_16 = v5;
            v6 = var11_11;
            v7 = TQ.b(9098, 4152576233581542125L);
            if (var4_5 != null) ** GOTO lbl40
            if (v6 > v7) {
                v8 = Math.max(var11_11, var12_12);
            } else {
                v6 = var11_11;
                v7 = var12_12;
lbl40:
                // 2 sources

                v8 = Math.min(v6, v7);
            }
            var17_17 = v8;
            var18_18 = var3_3 * (float)var13_13 / 255.0f;
            var19_19 = 1.0f - var18_18;
            var2_2[var6_6] = (int)(var18_18 * (float)var15_15 + var19_19 * (float)var8_8);
            var2_2[var6_6 + 1] = (int)(var18_18 * (float)var16_16 + var19_19 * (float)var10_10);
            var2_2[var6_6 + 2] = (int)(var18_18 * (float)var17_17 + var19_19 * (float)var12_12);
            var2_2[var6_6 + 3] = (int)((float)var13_13 * var3_3 + (float)var14_14 * var19_19);
            if (var4_5 == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3896533788173633122L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00df1~\u00fc\u00a2>\u00fc\u00f0rg(`a\u009edd";
        int n11 = "\u00df1~\u00fc\u00a2>\u00fc\u00f0rg(`a\u009edd".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        c = lArray;
        e = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5967;
        if (e[n11] == null) {
            TQ.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

