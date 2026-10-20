/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.GO;
import com.m.T;
import java.awt.BasicStroke;
import java.awt.Color;

public final class n {
    public static boolean o;
    public static boolean a;
    public static Color r;
    public static boolean y;
    public static Color g;
    public static boolean A;
    public static Color x;
    public static T Y;
    public static int Q;
    public static int O;
    public static boolean G;
    public static Color E;
    public static Color W;
    public static int j;
    public static BasicStroke D;
    public static int U;
    public static int F;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 2306466989437600228L;
                var0_1 = new long[8];
                var4_2 = 0;
                var5_3 = "hc\u001f\u00e3\u00b7\u0097\u00c1\n!\u007f\u00b2q\u00b7\u0097\u00c1,\u00c3C\u008dH\u00b7\u0097\u00c1\u00d6\u00a9\u00c1\u0081\u00ea\u00b7\u0097\u00c1\u001b\u00c6,f,\u00b7\u0097\u00c1,\u00fa%:{\u00b7\u0097\u00c1\n";
                var6_4 = "hc\u001f\u00e3\u00b7\u0097\u00c1\n!\u007f\u00b2q\u00b7\u0097\u00c1,\u00c3C\u008dH\u00b7\u0097\u00c1\u00d6\u00a9\u00c1\u0081\u00ea\u00b7\u0097\u00c1\u001b\u00c6,f,\u00b7\u0097\u00c1,\u00fa%:{\u00b7\u0097\u00c1\n".length();
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
                    var5_3 = "\u0016\u00f1J\u0089\u00b7\u0097\u00c1\u00ec\u00fey\u001b\u00ce\u00b7\u0097\u00c1\u00e8";
                    var6_4 = "\u0016\u00f1J\u0089\u00b7\u0097\u00c1\u00ec\u00fey\u001b\u00ce\u00b7\u0097\u00c1\u00e8".length();
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
        n.o = false;
        n.a = true;
        n.r = new Color((int)var0_1[1], (int)var0_1[4], (int)var0_1[4]);
        n.y = true;
        n.g = new Color((int)var0_1[5], (int)var0_1[0], (int)var0_1[0]);
        n.A = true;
        n.x = Color.GRAY;
        n.Y = T.line;
        n.Q = GO.Fx;
        n.O = GO.FG;
        n.G = true;
        n.E = new Color(0, 0, (int)var0_1[3], (int)var0_1[2]);
        n.W = Color.GRAY;
        n.j = GO.Fx;
        n.D = new BasicStroke(1.0f, 1, 1, 0.0f, new float[]{3.0f, 3.0f}, 0.0f);
        n.U = (int)var0_1[6];
        n.F = (int)var0_1[7];
    }
}

