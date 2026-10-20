/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class OK
extends Enum {
    public static final OK aboveLive;
    public static final OK onLine;
    public static final OK belowLine;
    private static final /* synthetic */ OK[] e;

    public static OK[] values() {
        return (OK[])e.clone();
    }

    public static OK valueOf(String string) {
        return Enum.valueOf(OK.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private OK() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ OK[] x() {
        return new OK[]{aboveLive, onLine, belowLine};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "%3{#@\u0015\u0006)3\u0006(8[%Y<\t&4x:R\u0015\u000613";
            var5_3 = "%3{#@\u0015\u0006)3\u0006(8[%Y<\t&4x:R\u0015\u000613".length();
            var2_4 = 9;
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
            v4 = 35;
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
                            v11 = 100;
                            break;
                        }
                        case 1: {
                            v11 = 117;
                            break;
                        }
                        case 2: {
                            v11 = 52;
                            break;
                        }
                        case 3: {
                            v11 = 111;
                            break;
                        }
                        case 4: {
                            v11 = 20;
                            break;
                        }
                        case 5: {
                            v11 = 122;
                            break;
                        }
                        default: {
                            v11 = 76;
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
        OK.aboveLive = new OK(var0[2], 0);
        OK.onLine = new OK(var0[1], 1);
        OK.belowLine = new OK(var0[0], 2);
        OK.e = OK.x();
    }
}

