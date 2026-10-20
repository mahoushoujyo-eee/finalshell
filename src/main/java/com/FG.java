/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B1;
import com.yr_1;

class FG {
    static final int[] V;
    static final int[] L;

    /*
     * Unable to fully structure code
     */
    static {
        block34: {
            block33: {
                var1 = 8303453149883046337L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "\u00c2^\u0089\u0089o\u00e0\u0099\u00c63\u008f7No\u00e0\u0099\u00c8";
                var6_4 = "\u00c2^\u0089\u0089o\u00e0\u0099\u00c63\u008f7No\u00e0\u0099\u00c8".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block33;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "X\u00e4\u00cc\u00c1o\u00e0\u0099\u00c7\u00bd\u00e4N\u00d0o\u00e0\u0099\u00c9";
                    var6_4 = "X\u00e4\u00cc\u00c1o\u00e0\u0099\u00c7\u00bd\u00e4N\u00d0o\u00e0\u0099\u00c9".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block33;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block34;
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
        FG.L = new int[B1.values().length];
        try {
            FG.L[B1.up.ordinal()] = 1;
        }
        catch (NoSuchFieldError var8_7) {
            // empty catch block
        }
        try {
            FG.L[B1.down.ordinal()] = 2;
        }
        catch (NoSuchFieldError var8_8) {
            // empty catch block
        }
        try {
            FG.L[B1.left.ordinal()] = 3;
        }
        catch (NoSuchFieldError var8_9) {
            // empty catch block
        }
        try {
            FG.L[B1.right.ordinal()] = 4;
        }
        catch (NoSuchFieldError var8_10) {
            // empty catch block
        }
        FG.V = new int[yr_1.values().length];
        try {
            FG.V[yr_1.center.ordinal()] = 1;
        }
        catch (NoSuchFieldError var8_11) {
            // empty catch block
        }
        try {
            FG.V[yr_1.topLeft.ordinal()] = 2;
        }
        catch (NoSuchFieldError var8_12) {
            // empty catch block
        }
        try {
            FG.V[yr_1.topRight.ordinal()] = 3;
        }
        catch (NoSuchFieldError var8_13) {
            // empty catch block
        }
        try {
            FG.V[yr_1.bottomLeft.ordinal()] = 4;
        }
        catch (NoSuchFieldError var8_14) {
            // empty catch block
        }
        try {
            FG.V[yr_1.bottomRight.ordinal()] = 5;
        }
        catch (NoSuchFieldError var8_15) {
            // empty catch block
        }
        try {
            FG.V[yr_1.topCenter.ordinal()] = (int)var0_1[2];
        }
        catch (NoSuchFieldError var8_16) {
            // empty catch block
        }
        try {
            FG.V[yr_1.bottomCenter.ordinal()] = (int)var0_1[0];
        }
        catch (NoSuchFieldError var8_17) {
            // empty catch block
        }
        try {
            FG.V[yr_1.leftCenter.ordinal()] = (int)var0_1[3];
        }
        catch (NoSuchFieldError var8_18) {
            // empty catch block
        }
        try {
            FG.V[yr_1.rightCenter.ordinal()] = (int)var0_1[1];
        }
        catch (NoSuchFieldError var8_19) {
            // empty catch block
        }
    }
}

