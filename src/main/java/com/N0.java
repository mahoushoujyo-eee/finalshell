/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class N0
extends Enum {
    public static final N0 field;
    public static final N0 calendar;
    public static final N0 other;
    private static final N0[] X;

    public static N0[] values() {
        return (N0[])X.clone();
    }

    public static N0 valueOf(String string) {
        return Enum.valueOf(N0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private N0() {
        void var2_-1;
        void var1_-1;
    }

    private static N0[] p() {
        return new N0[]{field, calendar, other};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "FZL\u0006\u0017\u0005OGA\u000f\u0001\bJOH\u0006\u000b v[";
            var5_3 = "FZL\u0006\u0017\u0005OGA\u000f\u0001\bJOH\u0006\u000b v[".length();
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
            v4 = 56;
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
                            v11 = 17;
                            break;
                        }
                        case 1: {
                            v11 = 22;
                            break;
                        }
                        case 2: {
                            v11 = 28;
                            break;
                        }
                        case 3: {
                            v11 = 91;
                            break;
                        }
                        case 4: {
                            v11 = 93;
                            break;
                        }
                        case 5: {
                            v11 = 124;
                            break;
                        }
                        default: {
                            v11 = 47;
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
        N0.field = new N0(var0[1], 0);
        N0.calendar = new N0(var0[2], 1);
        N0.other = new N0(var0[0], 2);
        N0.X = N0.p();
    }
}

