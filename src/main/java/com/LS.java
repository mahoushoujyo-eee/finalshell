/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class LS
extends Enum {
    public static final LS standalone;
    public static final LS attached;
    private static final /* synthetic */ LS[] n;

    public static LS[] values() {
        return (LS[])n.clone();
    }

    public static LS valueOf(String string) {
        return Enum.valueOf(LS.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LS() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ LS[] h() {
        return new LS[]{standalone, attached};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\"[Xt\u000be\u0012>A\\\b0[M{\fl\u001b5";
            var5_3 = "\"[Xt\u000be\u0012>A\\\b0[M{\fl\u001b5".length();
            var2_4 = 10;
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
            v4 = 66;
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
                            v11 = 19;
                            break;
                        }
                        case 1: {
                            v11 = 109;
                            break;
                        }
                        case 2: {
                            v11 = 123;
                            break;
                        }
                        case 3: {
                            v11 = 88;
                            break;
                        }
                        case 4: {
                            v11 = 45;
                            break;
                        }
                        case 5: {
                            v11 = 70;
                            break;
                        }
                        default: {
                            v11 = 60;
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
        LS.standalone = new LS(var0[0], 0);
        LS.attached = new LS(var0[1], 1);
        LS.n = LS.h();
    }
}

