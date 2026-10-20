/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class G6
extends Enum {
    public static final G6 icons;
    public static final G6 tiles;
    private static final /* synthetic */ G6[] T;

    public static G6[] values() {
        return (G6[])T.clone();
    }

    public static G6 valueOf(String string) {
        return Enum.valueOf(G6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private G6() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ G6[] K() {
        return new G6[]{icons, tiles};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "EM3\u0013D\u0005XG0\u0018D";
            var5_3 = "EM3\u0013D\u0005XG0\u0018D".length();
            var2_4 = 5;
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
            v4 = 44;
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
                            v11 = 29;
                            break;
                        }
                        case 1: {
                            v11 = 8;
                            break;
                        }
                        case 2: {
                            v11 = 115;
                            break;
                        }
                        case 3: {
                            v11 = 90;
                            break;
                        }
                        case 4: {
                            v11 = 27;
                            break;
                        }
                        case 5: {
                            v11 = 3;
                            break;
                        }
                        default: {
                            v11 = 54;
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
        G6.icons = new G6(var0[1], 0);
        G6.tiles = new G6(var0[0], 1);
        G6.T = G6.K();
    }
}

