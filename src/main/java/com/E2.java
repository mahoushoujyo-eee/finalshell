/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.xh_2;
import java.awt.Color;

public final class E2 {
    public static boolean c;
    public static xh_2 G;
    public static Color N;
    public static Color d;
    public static int K;
    public static int M;
    public static float e;
    public static int o;
    public static float W;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 3442260992371452571L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "\u00e9\u00a7\u00aaVz{\u00ea\u001b>\u00c3\u00f2\u00ecz{\u00ea\u008f";
                var6_4 = "\u00e9\u00a7\u00aaVz{\u00ea\u001b>\u00c3\u00f2\u00ecz{\u00ea\u008f".length();
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
                    var5_3 = "\u001a\u0091w\u008az{\u00ea\u0091\u00bf\u00f2\u000e\u00eez{\u00ea\u001b";
                    var6_4 = "\u001a\u0091w\u008az{\u00ea\u0091\u00bf\u00f2\u000e\u00eez{\u00ea\u001b".length();
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
        E2.c = true;
        E2.G = xh_2.componentSide;
        E2.N = new Color((int)var0_1[0], (int)var0_1[3], (int)var0_1[3], (int)var0_1[3]);
        E2.d = Color.WHITE;
        E2.K = GO.FT;
        E2.M = (int)var0_1[1];
        E2.e = 0.75f;
        E2.o = (int)var0_1[2];
        E2.W = 0.95f;
    }
}

