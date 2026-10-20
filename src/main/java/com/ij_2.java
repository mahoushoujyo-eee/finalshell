/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.ij
 */
public final class ij_2
extends Enum {
    public static final ij_2 standalone;
    public static final ij_2 attached;
    private static final /* synthetic */ ij_2[] n;

    public static ij_2[] values() {
        return (ij_2[])n.clone();
    }

    public static ij_2 valueOf(String string) {
        return Enum.valueOf(ij_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ij_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ij_2[] M() {
        return new ij_2[]{standalone, attached};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u0015/nt~1$\u0010\n\u0007/{{y8-\u001b5\u007f";
            var5_3 = "\u0015/nt~1$\u0010\n\u0007/{{y8-\u001b5\u007f".length();
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
                            v11 = 54;
                            break;
                        }
                        case 1: {
                            v11 = 25;
                            break;
                        }
                        case 2: {
                            v11 = 88;
                            break;
                        }
                        case 3: {
                            v11 = 87;
                            break;
                        }
                        case 4: {
                            v11 = 95;
                            break;
                        }
                        case 5: {
                            v11 = 27;
                            break;
                        }
                        default: {
                            v11 = 3;
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
        ij_2.standalone = new ij_2(var0[1], 0);
        ij_2.attached = new ij_2(var0[0], 1);
        ij_2.n = ij_2.M();
    }
}

