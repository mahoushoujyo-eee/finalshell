/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.eg
 */
public final class eg_2
extends Enum {
    public static final eg_2 random;
    public static final eg_2 moveNew;
    public static final eg_2 moveOld;
    public static final eg_2 moveBoth;
    private static final /* synthetic */ eg_2[] X;
    private static boolean P;

    public static eg_2[] values() {
        return (eg_2[])X.clone();
    }

    public static eg_2 valueOf(String string) {
        return Enum.valueOf(eg_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eg_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ eg_2[] I() {
        return new eg_2[]{random, moveNew, moveOld, moveBoth};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u0016^M:-L<\u0013\u0006\tPU;\u0000N";
                var5_3 = "\u0016^M:-L<\u0013\u0006\tPU;\u0000N".length();
                var2_4 = 8;
                eg_2.g(false);
                var1_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 5;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "\u0010XK<'@9\u0007\u0010XK<&I*";
                    var5_3 = "\u0010XK<'@9\u0007\u0010XK<&I*".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 3;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 126;
                            break;
                        }
                        case 1: {
                            v15 = 52;
                            break;
                        }
                        case 2: {
                            v15 = 62;
                            break;
                        }
                        case 3: {
                            v15 = 90;
                            break;
                        }
                        case 4: {
                            v15 = 106;
                            break;
                        }
                        case 5: {
                            v15 = 38;
                            break;
                        }
                        default: {
                            v15 = 77;
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
lbl86:
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
lbl96:
                // 1 sources

                ** continue;
            }
        }
        eg_2.random = new eg_2(var0[1], 0);
        eg_2.moveNew = new eg_2(var0[2], 1);
        eg_2.moveOld = new eg_2(var0[3], 2);
        eg_2.moveBoth = new eg_2(var0[0], 3);
        eg_2.X = eg_2.I();
    }

    public static void g(boolean bl) {
        P = bl;
    }

    public static boolean L() {
        return P;
    }

    public static boolean a() {
        boolean bl = eg_2.L();
        return !bl;
    }
}

