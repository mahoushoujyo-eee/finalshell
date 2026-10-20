/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.xh
 */
public final class xh_2
extends Enum {
    public static final xh_2 componentSide;
    public static final xh_2 componentCenter;
    private static final /* synthetic */ xh_2[] z;

    public static xh_2[] values() {
        return (xh_2[])z.clone();
    }

    public static xh_2 valueOf(String string) {
        return Enum.valueOf(xh_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xh_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ xh_2[] R() {
        return new xh_2[]{componentSide, componentCenter};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "'\u0004-3 x\u0017*\u001f\u0003&!b\u00176\r'\u0004-3 x\u0017*\u001f\u0013*+s";
            var5_3 = "'\u0004-3 x\u0017*\u001f\u0003&!b\u00176\r'\u0004-3 x\u0017*\u001f\u0013*+s".length();
            var2_4 = 15;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 102;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 34;
                            break;
                        }
                        case 1: {
                            v11 = 13;
                            break;
                        }
                        case 2: {
                            v11 = 38;
                            break;
                        }
                        case 3: {
                            v11 = 37;
                            break;
                        }
                        case 4: {
                            v11 = 41;
                            break;
                        }
                        case 5: {
                            v11 = 112;
                            break;
                        }
                        default: {
                            v11 = 20;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        xh_2.componentSide = new xh_2(var0[1], 0);
        xh_2.componentCenter = new xh_2(var0[0], 1);
        xh_2.z = xh_2.R();
    }
}

