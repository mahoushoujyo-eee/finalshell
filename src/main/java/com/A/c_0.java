/*
 * Decompiled with CFR 0.152.
 */
package com.a;

import com.GO;
import com.SG;
import com.xk_0;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;

/*
 * Renamed from com.A.c
 */
public final class c_0 {
    public static Color G;
    public static Color Y;
    public static Color X;
    public static Color p;
    public static int i;
    public static int V;
    public static int e;
    public static Insets h;
    public static boolean W;
    public static ImageIcon K;
    public static int I;
    public static String P;
    public static boolean M;
    public static boolean Q;
    public static boolean z;
    public static boolean u;
    public static boolean A;
    public static boolean g;
    public static boolean R;
    public static Integer y;
    public static int T;
    public static Insets b;
    public static boolean o;
    public static boolean U;

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u0012uT".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 88;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var9_1;
                    while (true) {
                        switch (var9_1 % 7) {
                            case 0: {
                                v9 = 106;
                                break;
                            }
                            case 1: {
                                v9 = 13;
                                break;
                            }
                            case 2: {
                                v9 = 44;
                                break;
                            }
                            case 3: {
                                v9 = 66;
                                break;
                            }
                            case 4: {
                                v9 = 9;
                                break;
                            }
                            case 5: {
                                v9 = 34;
                                break;
                            }
                            default: {
                                v9 = 67;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var9_1;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var9_1);
                ** while (true)
                var8 = new String(v10).intern();
                var1_2 = 4182493412644211633L;
                var0_3 = new long[7];
                var4_4 = 0;
                var5_5 = "2\u0015Y\u0096X\u0011\u00cb\u00a8\u00a4G\u00d6\u0012X\u0011\u00cbZ\u00ed\u008e\u00cecX\u0011\u00cbZi\u00c0\u00ac\u00d2X\u0011\u00cbE\u00ef6V\u008eX\u0011\u00cb\u00be";
                var6_6 = "2\u0015Y\u0096X\u0011\u00cb\u00a8\u00a4G\u00d6\u0012X\u0011\u00cbZ\u00ed\u008e\u00cecX\u0011\u00cbZi\u00c0\u00ac\u00d2X\u0011\u00cbE\u00ef6V\u008eX\u0011\u00cb\u00be".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v11 = var0_3;
                    v12 = var4_4++;
                    v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u00e6\u0089-TX\u0011\u00cb\u00d5\u00e8\u009c\u00cb\u00d8X\u0011\u00cbE";
                    var6_6 = "\u00e6\u0089-TX\u0011\u00cb\u00d5\u00e8\u009c\u00cb\u00d8X\u0011\u00cbE".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v11 = var0_3;
                        v12 = var4_4++;
                        v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var3_7 < var6_6) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var1_2;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        c_0.G = new Color((int)var0_3[6], (int)var0_3[3], (int)var0_3[3]);
        c_0.Y = new Color((int)var0_3[1], (int)var0_3[2], (int)var0_3[2]);
        c_0.X = GO.N;
        c_0.p = GO.t;
        c_0.i = xk_0.R() != false ? (int)var0_3[0] : 0;
        c_0.V = xk_0.R() != false ? (int)var0_3[4] : 0;
        c_0.e = xk_0.R() != false ? GO.Y : 0;
        c_0.h = new Insets(0, 0, 0, 0);
        c_0.W = false;
        c_0.K = null;
        c_0.I = (int)var0_3[5];
        c_0.P = var8;
        c_0.M = true;
        c_0.Q = true;
        c_0.z = true;
        c_0.u = true;
        c_0.A = true;
        c_0.g = true;
        c_0.R = true;
        c_0.y = null;
        c_0.T = SG.d;
        c_0.b = new Insets(1, 4, 1, 4);
        c_0.o = true;
        c_0.U = true;
    }
}

