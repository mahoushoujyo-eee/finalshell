/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Color;
import java.awt.Stroke;

/*
 * Renamed from com.Eb
 */
public final class eb_0 {
    public static Color M;
    public static Stroke L;
    public static int m;
    public static int i;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 2936010967133830468L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "\u0016\u0083GP@\u00a9\u00bdA\u0082 \u00b3\u00dd@\u00a9\u00bd\u0098";
                var6_4 = "\u0016\u0083GP@\u00a9\u00bdA\u0082 \u00b3\u00dd@\u00a9\u00bd\u0098".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "^\u0096\u00f3\u0010@\u00a9\u00bd\u0098\u00cd\u00e2\u00e7\u00c4@\u00a9\u00bd@";
                    var6_4 = "^\u0096\u00f3\u0010@\u00a9\u00bd\u0098\u00cd\u00e2\u00e7\u00c4@\u00a9\u00bd@".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
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
                    if (var3_5 < var6_4) ** continue;
                    break block8;
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
        eb_0.M = new Color((int)var0_1[2], (int)var0_1[1], (int)var0_1[1]);
        eb_0.L = null;
        eb_0.m = (int)var0_1[0];
        eb_0.i = (int)var0_1[3];
    }
}

