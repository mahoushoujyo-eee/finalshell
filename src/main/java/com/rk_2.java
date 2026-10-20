/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.rk
 */
public final class rk_2
extends Enum {
    public static final rk_2 fill;
    public static final rk_2 align;
    public static final rk_2 custom;
    private static final /* synthetic */ rk_2[] T;

    public static rk_2[] values() {
        return (rk_2[])T.clone();
    }

    public static rk_2 valueOf(String string) {
        return Enum.valueOf(rk_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rk_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ rk_2[] M() {
        return new rk_2[]{fill, align, custom};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "=_S\u0001c\u0000\u0005?FI\u0012b\u00048CL\u0019";
            var5_3 = "=_S\u0001c\u0000\u0005?FI\u0012b\u00048CL\u0019".length();
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
            v4 = 13;
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
                            v11 = 83;
                            break;
                        }
                        case 1: {
                            v11 = 39;
                            break;
                        }
                        case 2: {
                            v11 = 45;
                            break;
                        }
                        case 3: {
                            v11 = 120;
                            break;
                        }
                        case 4: {
                            v11 = 1;
                            break;
                        }
                        case 5: {
                            v11 = 96;
                            break;
                        }
                        default: {
                            v11 = 56;
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
        rk_2.fill = new rk_2(var0[2], 0);
        rk_2.align = new rk_2(var0[1], 1);
        rk_2.custom = new rk_2(var0[0], 2);
        rk_2.T = rk_2.M();
    }
}

