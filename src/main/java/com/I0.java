/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dy_0;

class I0 {
    static final int[] j;

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                var1 = 5451504847456240147L;
                var0_1 = new long[6];
                var4_2 = 0;
                var5_3 = "-pg\u0019\u0083\u00f3\u0002\u0014<\u00fdO\u00fd\u0083\u00f3\u0002\u001b\u0001\u00fb^U\u0083\u00f3\u0002\u001a\r\u00c13)\u0083\u00f3\u0002\u0018";
                var6_4 = "-pg\u0019\u0083\u00f3\u0002\u0014<\u00fdO\u00fd\u0083\u00f3\u0002\u001b\u0001\u00fb^U\u0083\u00f3\u0002\u001a\r\u00c13)\u0083\u00f3\u0002\u0018".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block29;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "e\u0083O-\u0083\u00f3\u0002\u0015\u00df\u00f4\u009e\u00d1\u0083\u00f3\u0002\u0019";
                    var6_4 = "e\u0083O-\u0083\u00f3\u0002\u0015\u00df\u00f4\u009e\u00d1\u0083\u00f3\u0002\u0019".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block29;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block30;
                    break;
                }
            }
            v4 = v2 ^ var1;
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
        I0.j = new int[dy_0.values().length];
        try {
            I0.j[dy_0.Character.ordinal()] = 1;
        }
        catch (NoSuchFieldError var8_7) {
            // empty catch block
        }
        try {
            I0.j[dy_0.Backspace.ordinal()] = 2;
        }
        catch (NoSuchFieldError var8_8) {
            // empty catch block
        }
        try {
            I0.j[dy_0.AltBackspace.ordinal()] = 3;
        }
        catch (NoSuchFieldError var8_9) {
            // empty catch block
        }
        try {
            I0.j[dy_0.LeftArrow.ordinal()] = 4;
        }
        catch (NoSuchFieldError var8_10) {
            // empty catch block
        }
        try {
            I0.j[dy_0.RightArrow.ordinal()] = 5;
        }
        catch (NoSuchFieldError var8_11) {
            // empty catch block
        }
        try {
            I0.j[dy_0.AltLeftArrow.ordinal()] = (int)var0_1[4];
        }
        catch (NoSuchFieldError var8_12) {
            // empty catch block
        }
        try {
            I0.j[dy_0.AltRightArrow.ordinal()] = (int)var0_1[0];
        }
        catch (NoSuchFieldError var8_13) {
            // empty catch block
        }
        try {
            I0.j[dy_0.Delete.ordinal()] = (int)var0_1[1];
        }
        catch (NoSuchFieldError var8_14) {
            // empty catch block
        }
        try {
            I0.j[dy_0.Home.ordinal()] = (int)var0_1[2];
        }
        catch (NoSuchFieldError var8_15) {
            // empty catch block
        }
        try {
            I0.j[dy_0.End.ordinal()] = (int)var0_1[5];
        }
        catch (NoSuchFieldError var8_16) {
            // empty catch block
        }
        try {
            I0.j[dy_0.Unknown.ordinal()] = (int)var0_1[3];
        }
        catch (NoSuchFieldError var8_17) {
            // empty catch block
        }
    }
}

