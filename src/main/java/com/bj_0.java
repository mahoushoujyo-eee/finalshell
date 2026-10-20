/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Bj
 */
public final class bj_0
extends Enum {
    public static final bj_0 standalone;
    public static final bj_0 attached;
    private static final /* synthetic */ bj_0[] C;

    public static bj_0[] values() {
        return (bj_0[])C.clone();
    }

    public static bj_0 valueOf(String string) {
        return Enum.valueOf(bj_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bj_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ bj_0[] E() {
        return new bj_0[]{standalone, attached};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "Da\u00076,\u0013\u001dA\nVa\u00129+\u001a\u0014J{\u0016";
            var5_3 = "Da\u00076,\u0013\u001dA\nVa\u00129+\u001a\u0014J{\u0016".length();
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
            v4 = 8;
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
                            v11 = 45;
                            break;
                        }
                        case 1: {
                            v11 = 29;
                            break;
                        }
                        case 2: {
                            v11 = 123;
                            break;
                        }
                        case 3: {
                            v11 = 95;
                            break;
                        }
                        case 4: {
                            v11 = 71;
                            break;
                        }
                        case 5: {
                            v11 = 115;
                            break;
                        }
                        default: {
                            v11 = 112;
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
        bj_0.standalone = new bj_0(var0[1], 0);
        bj_0.attached = new bj_0(var0[0], 1);
        bj_0.C = bj_0.E();
    }
}

