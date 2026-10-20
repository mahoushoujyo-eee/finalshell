/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.ij_2;
import com.og_2;
import com.so_0;
import java.awt.Color;
import java.awt.Insets;

/*
 * Renamed from com.e
 */
public final class e_0 {
    public static ij_2 V;
    public static Color s;
    public static Color Y;
    public static Color g;
    public static Color l;
    public static int b;
    public static int Z;
    public static boolean C;
    public static Insets j;
    public static Insets r;
    public static og_2 h;
    public static int R;
    public static int U;
    public static so_0 u;
    public static Color f;
    public static Color m;
    public static boolean P;
    public static boolean k;
    public static Color e;
    public static boolean O;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 6034722658978188568L;
                var0_1 = new long[4];
                var4_2 = 0;
                var5_3 = "\u008f\u0011*\u00e2\u00f6eM\u00c8\u009a\u00f8=9\u00f6eM\u00c8";
                var6_4 = "\u008f\u0011*\u00e2\u00f6eM\u00c8\u009a\u00f8=9\u00f6eM\u00c8".length();
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
                    var5_3 = "#$c\u0019\u00f6eM\u00fb\u00ba\u009b\u00aa\u00e0\u00f6eM\u00fb";
                    var6_4 = "#$c\u0019\u00f6eM\u00fb\u00ba\u009b\u00aa\u00e0\u00f6eM\u00fb".length();
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
        e_0.V = ij_2.standalone;
        e_0.s = new Color((int)var0_1[2], (int)var0_1[3], (int)var0_1[3]);
        e_0.Y = new Color((int)var0_1[0], (int)var0_1[1], (int)var0_1[1]);
        e_0.g = Color.WHITE;
        e_0.l = GO.R;
        e_0.b = GO.Fx;
        e_0.Z = GO.FG;
        e_0.C = false;
        e_0.j = new Insets(0, 0, 0, 0);
        e_0.r = new Insets(3, 4, 3, 4);
        e_0.h = null;
        e_0.R = 0;
        e_0.U = 1;
        e_0.u = so_0.multiline;
        e_0.f = GO.Ff;
        e_0.m = Color.GRAY;
        e_0.P = false;
        e_0.k = false;
        e_0.e = GO.R;
        e_0.O = false;
    }
}

