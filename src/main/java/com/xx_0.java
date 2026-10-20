/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Xx
 */
public final class xx_0
extends Enum {
    public static final xx_0 preferred;
    public static final xx_0 fitComponent;
    public static final xx_0 repeat;
    private static final /* synthetic */ xx_0[] I;

    public static xx_0[] values() {
        return (xx_0[])I.clone();
    }

    public static xx_0 valueOf(String string) {
        return Enum.valueOf(xx_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xx_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ xx_0[] x() {
        return new xx_0[]{preferred, fitComponent, repeat};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\n7\u0015\u0018\u0010h\t\b \u0000\u001b\u0014nm\u001d6\f\u001e;\u0011>\u001eqo\u0017<\u0000\u0013\u0005";
            var5_3 = "\n7\u0015\u0018\u0010h\t\b \u0000\u001b\u0014nm\u001d6\f\u001e;\u0011>\u001eqo\u0017<\u0000\u0013\u0005".length();
            var2_4 = 6;
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
            v4 = 49;
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
                            v11 = 73;
                            break;
                        }
                        case 1: {
                            v11 = 99;
                            break;
                        }
                        case 2: {
                            v11 = 84;
                            break;
                        }
                        case 3: {
                            v11 = 76;
                            break;
                        }
                        case 4: {
                            v11 = 64;
                            break;
                        }
                        case 5: {
                            v11 = 45;
                            break;
                        }
                        default: {
                            v11 = 46;
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
        xx_0.preferred = new xx_0(var0[1], 0);
        xx_0.fitComponent = new xx_0(var0[2], 1);
        xx_0.repeat = new xx_0(var0[0], 2);
        xx_0.I = xx_0.x();
    }
}

