/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Ey
 */
public class ey_0 {
    public static String t;
    public static String q;
    public static String O;
    public static String z;
    public static String T;
    public static String L;
    public static String R;
    public static String i;
    public static String V;
    public static String W;
    public static String F;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[11];
                var4_1 = 0;
                var3_2 = "<\f%\u001a)\u0005\u0010+;&\u0013&\u001e\u0003*\u001b\u0010<\f%\u001a)\u0005\u0010+- \f+\u0013\u0019*\r\u000f<\f%\u001a)\u0005\u0010+9;\u001a9\u0002\u0010+\b<\f%\u001a)\u0005\u0010+\u0006!\u0006;\u0012+\u001d\b+\u0000:\u001e(\u001d\u0010+\u0010)\u0005&\u001e>\u0018\u001b(- \f+\u0013\u0019*\r\b=\u0006%\u0013%\u0007\u0010=\u0007)\u0006*\n9\u0014\u0011";
                var5_3 = "<\f%\u001a)\u0005\u0010+;&\u0013&\u001e\u0003*\u001b\u0010<\f%\u001a)\u0005\u0010+- \f+\u0013\u0019*\r\u000f<\f%\u001a)\u0005\u0010+9;\u001a9\u0002\u0010+\b<\f%\u001a)\u0005\u0010+\u0006!\u0006;\u0012+\u001d\b+\u0000:\u001e(\u001d\u0010+\u0010)\u0005&\u001e>\u0018\u001b(- \f+\u0013\u0019*\r\b=\u0006%\u0013%\u0007\u0010=\u0007)\u0006*\n9\u0014\u0011".length();
                var2_4 = 16;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 68;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "]yNn[vs\bKgD|\\zyJ";
                    var5_3 = "]yNn[vs\bKgD|\\zyJ".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 38;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 11;
                            break;
                        }
                        case 1: {
                            v15 = 45;
                            break;
                        }
                        case 2: {
                            v15 = 13;
                            break;
                        }
                        case 3: {
                            v15 = 59;
                            break;
                        }
                        case 4: {
                            v15 = 14;
                            break;
                        }
                        case 5: {
                            v15 = 53;
                            break;
                        }
                        default: {
                            v15 = 49;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        ey_0.t = var0[4];
        ey_0.q = var0[5];
        ey_0.O = var0[7];
        ey_0.z = var0[9];
        ey_0.T = var0[3];
        ey_0.L = var0[0];
        ey_0.R = var0[1];
        ey_0.i = var0[2];
        ey_0.V = var0[10];
        ey_0.W = var0[6];
        ey_0.F = var0[8];
    }
}

