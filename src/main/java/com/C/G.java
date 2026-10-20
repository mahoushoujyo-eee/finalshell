/*
 * Decompiled with CFR 0.152.
 */
package com.C;

public final class G
extends Enum {
    public static final G bold;
    public static final G thick;
    private static final /* synthetic */ G[] M;

    public static G[] values() {
        return (G[])M.clone();
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private G() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ G[] S() {
        return new G[]{bold, thick};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "Dd\u001b\u001b\u0005Rc\u001e\u001cw";
            var5_3 = "Dd\u001b\u001b\u0005Rc\u001e\u001cw".length();
            var2_4 = 4;
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
            v4 = 23;
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
                            v11 = 49;
                            break;
                        }
                        case 1: {
                            v11 = 28;
                            break;
                        }
                        case 2: {
                            v11 = 96;
                            break;
                        }
                        case 3: {
                            v11 = 104;
                            break;
                        }
                        case 4: {
                            v11 = 11;
                            break;
                        }
                        case 5: {
                            v11 = 121;
                            break;
                        }
                        default: {
                            v11 = 106;
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
        G.bold = new G(var0[0], 0);
        G.thick = new G(var0[1], 1);
        G.M = G.S();
    }
}

