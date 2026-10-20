/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.LS;
import com.og_2;
import java.awt.Color;
import java.awt.Insets;

/*
 * Renamed from com.nJ
 */
public final class nj_1 {
    public static Color m;
    public static Color o;
    public static Color I;
    public static Color r;
    public static boolean i;
    public static int f;
    public static int k;
    public static Insets s;
    public static int R;
    public static LS x;
    public static og_2 t;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 6273336424357238553L;
                var0_1 = new long[6];
                var4_2 = 0;
                var5_3 = "\u00c07\u00e8\u00e7\u008aU\u0017\u00fc\u0086G\u0092\u0095\u008aU\u0017\u008e\u00f4\u0085Py\u008aU\u0017\u00f0\u00ac\u00a9\u0096\u0081\u008aU\u0017\u0089";
                var6_4 = "\u00c07\u00e8\u00e7\u008aU\u0017\u00fc\u0086G\u0092\u0095\u008aU\u0017\u008e\u00f4\u0085Py\u008aU\u0017\u00f0\u00ac\u00a9\u0096\u0081\u008aU\u0017\u0089".length();
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
                    var5_3 = "\u000e\u0002\u008f\u00c0\u008aU\u0017\u00f7\u00ce\u00c9\u00c9\u0092\u008aU\u0017\u0092";
                    var6_4 = "\u000e\u0002\u008f\u00c0\u008aU\u0017\u00f7\u00ce\u00c9\u00c9\u0092\u008aU\u0017\u0092".length();
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
        nj_1.m = Color.WHITE;
        nj_1.o = new Color((int)var0_1[0], (int)var0_1[2], (int)var0_1[4]);
        nj_1.I = new Color((int)var0_1[5], (int)var0_1[3], (int)var0_1[1]);
        nj_1.r = GO.FX;
        nj_1.i = false;
        nj_1.f = GO.Y;
        nj_1.k = GO.FG;
        nj_1.s = new Insets(1, 1, 1, 1);
        nj_1.R = GO.FV;
        nj_1.x = LS.standalone;
        nj_1.t = null;
    }
}

