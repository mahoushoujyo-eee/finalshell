/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v.d_2;
import org.v.fX;

class fM {
    static final int[] Z;
    static final int[] s;

    /*
     * Unable to fully structure code
     */
    static {
        block32: {
            block31: {
                var1 = 3705866394280606081L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "\u00cf)\u00ac\u0086\u00e0'9\u0087\u0010\u0002\u0012\u00e9\u00e0'9\u0088";
                var6_4 = "\u00cf)\u00ac\u0086\u00e0'9\u0087\u0010\u0002\u0012\u00e9\u00e0'9\u0088".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block31;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "`g\u00f5^\u00e0'9\u0086\u00e7=\u0011c\u00e0'9\u0089";
                    var6_4 = "`g\u00f5^\u00e0'9\u0086\u00e7=\u0011c\u00e0'9\u0089".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block31;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block32;
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
        fM.s = new int[d_2.values().length];
        try {
            fM.s[d_2.VOID.ordinal()] = 1;
        }
        catch (NoSuchFieldError var8_7) {
            // empty catch block
        }
        try {
            fM.s[d_2.BYTE.ordinal()] = 2;
        }
        catch (NoSuchFieldError var8_8) {
            // empty catch block
        }
        try {
            fM.s[d_2.SHORT.ordinal()] = 3;
        }
        catch (NoSuchFieldError var8_9) {
            // empty catch block
        }
        try {
            fM.s[d_2.CHAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError var8_10) {
            // empty catch block
        }
        try {
            fM.s[d_2.INT.ordinal()] = 5;
        }
        catch (NoSuchFieldError var8_11) {
            // empty catch block
        }
        try {
            fM.s[d_2.LONG.ordinal()] = (int)var0_1[0];
        }
        catch (NoSuchFieldError var8_12) {
            // empty catch block
        }
        try {
            fM.s[d_2.FLOAT.ordinal()] = (int)var0_1[2];
        }
        catch (NoSuchFieldError var8_13) {
            // empty catch block
        }
        try {
            fM.s[d_2.DOUBLE.ordinal()] = (int)var0_1[3];
        }
        catch (NoSuchFieldError var8_14) {
            // empty catch block
        }
        try {
            fM.s[d_2.BOOLEAN.ordinal()] = (int)var0_1[1];
        }
        catch (NoSuchFieldError var8_15) {
            // empty catch block
        }
        fM.Z = new int[fX.values().length];
        try {
            fM.Z[fX.ENUM.ordinal()] = 1;
        }
        catch (NoSuchFieldError var8_16) {
            // empty catch block
        }
        try {
            fM.Z[fX.INT.ordinal()] = 2;
        }
        catch (NoSuchFieldError var8_17) {
            // empty catch block
        }
        try {
            fM.Z[fX.STRING.ordinal()] = 3;
        }
        catch (NoSuchFieldError var8_18) {
            // empty catch block
        }
    }
}

