/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import java.awt.Color;
import javax.swing.ImageIcon;

/*
 * Renamed from com.lf
 */
public final class lf_2 {
    public static ImageIcon B;
    public static Color R;
    public static Color f;
    public static Color X;
    public static Color O;
    public static boolean k;
    public static boolean w;
    public static int t;
    public static int C;
    public static int Z;
    public static boolean I;
    public static boolean i;
    public static int r;
    public static boolean s;

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
                v0 = "0lD/^{\u000b<bD3Tz\u00167h".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 62;
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
                                v9 = 103;
                                break;
                            }
                            case 1: {
                                v9 = 49;
                                break;
                            }
                            case 2: {
                                v9 = 21;
                                break;
                            }
                            case 3: {
                                v9 = 127;
                                break;
                            }
                            case 4: {
                                v9 = 19;
                                break;
                            }
                            case 5: {
                                v9 = 106;
                                break;
                            }
                            default: {
                                v9 = 88;
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
                var1_2 = 2730180531605770268L;
                var0_3 = new long[6];
                var4_4 = 0;
                var5_5 = "\n(\u00fb\u00d3w\f\u0090\u00ab9\u008e\u00f8\u00a2w\f\u0093\u00f4\u0007z\u00b6\u00dcw\f\u0090.xv\u009agw\f\u0090\u009e";
                var6_6 = "\n(\u00fb\u00d3w\f\u0090\u00ab9\u008e\u00f8\u00a2w\f\u0093\u00f4\u0007z\u00b6\u00dcw\f\u0090.xv\u009agw\f\u0090\u009e".length();
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
                    var5_5 = "0\u0007uOw\f\u0090\u00e3=.\u00e2\u00f3w\f\u0090\u009e";
                    var6_6 = "0\u0007uOw\f\u0090\u00e3=.\u00e2\u00f3w\f\u0090\u009e".length();
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
        lf_2.B = new ImageIcon(lf_2.class.getResource(var8));
        lf_2.R = Color.GRAY;
        lf_2.f = Color.LIGHT_GRAY;
        lf_2.X = new Color((int)var0_3[5], (int)var0_3[3], (int)var0_3[0]);
        lf_2.O = new Color(0, 0, (int)var0_3[4], (int)var0_3[2]);
        lf_2.k = GO.d;
        lf_2.w = true;
        lf_2.t = GO.FH;
        lf_2.C = GO.FG;
        lf_2.Z = GO.Fx;
        lf_2.I = true;
        lf_2.i = true;
        lf_2.r = (int)var0_3[1];
        lf_2.s = true;
    }
}

