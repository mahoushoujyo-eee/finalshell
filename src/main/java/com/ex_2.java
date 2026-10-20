/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.ex
 */
public final class ex_2
extends Enum {
    public static final ex_2 decrease;
    public static final ex_2 increase;
    private static final /* synthetic */ ex_2[] Y;

    public static ex_2[] values() {
        return (ex_2[])Y.clone();
    }

    public static ex_2 valueOf(String string) {
        return Enum.valueOf(ex_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ex_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ex_2[] t() {
        return new ex_2[]{decrease, increase};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u000eLGfmr\t\u0002\b\u0003GGfmr\t\u0002";
            var5_3 = "\u000eLGfmr\t\u0002\b\u0003GGfmr\t\u0002".length();
            var2_4 = 8;
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
            v4 = 110;
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
                            v11 = 9;
                            break;
                        }
                        case 1: {
                            v11 = 76;
                            break;
                        }
                        case 2: {
                            v11 = 74;
                            break;
                        }
                        case 3: {
                            v11 = 122;
                            break;
                        }
                        case 4: {
                            v11 = 102;
                            break;
                        }
                        case 5: {
                            v11 = 125;
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
        ex_2.decrease = new ex_2(var0[1], 0);
        ex_2.increase = new ex_2(var0[0], 1);
        ex_2.Y = ex_2.t();
    }
}

