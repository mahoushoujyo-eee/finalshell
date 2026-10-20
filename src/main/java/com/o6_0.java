/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.o6
 */
public final class o6_0
extends Enum {
    public static final o6_0 random;
    public static final o6_0 fade;
    public static final o6_0 fill;
    public static final o6_0 slide;
    private static final /* synthetic */ o6_0[] h;
    private static String[] c;

    public static o6_0[] values() {
        return (o6_0[])h.clone();
    }

    public static o6_0 valueOf(String string) {
        return Enum.valueOf(o6_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o6_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ o6_0[] P() {
        return new o6_0[]{random, fade, fill, slide};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "Y\u0000z\u001b\u0004Y\br\u0012";
                var5_3 = "Y\u0000z\u001b\u0004Y\br\u0012".length();
                o6_0.R(null);
                var2_4 = 4;
                var1_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 57;
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
                    var3_2 = "`)S?7\u0006a$T?=>";
                    var5_3 = "`)S?7\u0006a$T?=>".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 21;
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
                            v15 = 6;
                            break;
                        }
                        case 1: {
                            v15 = 80;
                            break;
                        }
                        case 2: {
                            v15 = 47;
                            break;
                        }
                        case 3: {
                            v15 = 78;
                            break;
                        }
                        case 4: {
                            v15 = 71;
                            break;
                        }
                        case 5: {
                            v15 = 70;
                            break;
                        }
                        default: {
                            v15 = 106;
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
        o6_0.random = new o6_0(var0[3], 0);
        o6_0.fade = new o6_0(var0[1], 1);
        o6_0.fill = new o6_0(var0[0], 2);
        o6_0.slide = new o6_0(var0[2], 3);
        o6_0.h = o6_0.P();
    }

    public static void R(String[] stringArray) {
        c = stringArray;
    }

    public static String[] S() {
        return c;
    }
}

