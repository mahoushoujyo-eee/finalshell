/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.M;
import com.GO;
import java.awt.Color;

/*
 * Renamed from com.C.q
 */
public final class q_0 {
    public static M k;
    public static Color V;
    public static int o;
    public static int n;
    public static float w;
    public static int W;
    public static float L;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 5864627057702841633L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "\u00ec\u00bb\u00e2\u00d3\u00a2\u0085\u00ad'\u0094#\u00d9\u00d1\u00a2\u0085\u00ad-";
                var6_4 = "\u00ec\u00bb\u00e2\u00d3\u00a2\u0085\u00ad'\u0094#\u00d9\u00d1\u00a2\u0085\u00ad-".length();
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
                    var5_3 = "\u00c8l\u008f\u00a1\u00a2\u0085\u00ad\u00a1\u00a6\u0004\u0011\u009a\u00a2\u0085\u00ad\u00a1";
                    var6_4 = "\u00c8l\u008f\u00a1\u00a2\u0085\u00ad\u00a1\u00a6\u0004\u0011\u009a\u00a2\u0085\u00ad\u00a1".length();
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
        q_0.k = M.dropdown;
        q_0.V = new Color((int)var0_1[2], (int)var0_1[3], (int)var0_1[3], (int)var0_1[3]);
        q_0.o = GO.FT;
        q_0.n = (int)var0_1[1];
        q_0.w = 0.75f;
        q_0.W = (int)var0_1[0];
        q_0.L = 0.95f;
    }
}

