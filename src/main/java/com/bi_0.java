/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Bi
 */
public final class bi_0
extends Enum {
    public static final bi_0 clock;
    public static final bi_0 stopwatch;
    public static final bi_0 timer;
    private static final /* synthetic */ bi_0[] B;
    private static String[] k;

    public static bi_0[] values() {
        return (bi_0[])B.clone();
    }

    public static bi_0 valueOf(String string) {
        return Enum.valueOf(bi_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bi_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ bi_0[] E() {
        return new bi_0[]{clock, stopwatch, timer};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "F77 d\u0005Q25&}\tA*55a<mQ6";
            var5_3 = "F77 d\u0005Q25&}\tA*55a<mQ6".length();
            var2_4 = 5;
            var1_5 = -1;
            bi_0.R(null);
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v4 = 29;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 47;
                            break;
                        }
                        case 1: {
                            v11 = 67;
                            break;
                        }
                        case 2: {
                            v11 = 71;
                            break;
                        }
                        case 3: {
                            v11 = 88;
                            break;
                        }
                        case 4: {
                            v11 = 11;
                            break;
                        }
                        case 5: {
                            v11 = 64;
                            break;
                        }
                        default: {
                            v11 = 4;
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
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        bi_0.clock = new bi_0(var0[1], 0);
        bi_0.stopwatch = new bi_0(var0[2], 1);
        bi_0.timer = new bi_0(var0[0], 2);
        bi_0.B = bi_0.E();
    }

    public static void R(String[] stringArray) {
        k = stringArray;
    }

    public static String[] Y() {
        return k;
    }
}

