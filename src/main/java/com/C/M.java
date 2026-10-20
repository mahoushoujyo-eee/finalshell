/*
 * Decompiled with CFR 0.152.
 */
package com.C;

public final class M
extends Enum {
    public static final M simple;
    public static final M dropdown;
    private static final /* synthetic */ M[] F;

    public static M[] values() {
        return (M[])F.clone();
    }

    public static M valueOf(String string) {
        return Enum.valueOf(M.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private M() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ M[] L() {
        return new M[]{simple, dropdown};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "4^s{sSX>\u0006#Eq{{Y";
            var5_3 = "4^s{sSX>\u0006#Eq{{Y".length();
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
            v4 = 79;
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
                            v11 = 31;
                            break;
                        }
                        case 1: {
                            v11 = 99;
                            break;
                        }
                        case 2: {
                            v11 = 83;
                            break;
                        }
                        case 3: {
                            v11 = 68;
                            break;
                        }
                        case 4: {
                            v11 = 88;
                            break;
                        }
                        case 5: {
                            v11 = 115;
                            break;
                        }
                        default: {
                            v11 = 96;
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
        M.simple = new M(var0[1], 0);
        M.dropdown = new M(var0[0], 1);
        M.F = M.L();
    }
}

