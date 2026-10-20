/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Du
 */
public final class du_0
extends Enum {
    public static final du_0 random;
    public static final du_0 cascade;
    public static final du_0 randomize;
    private static final /* synthetic */ du_0[] t;
    private static boolean T;

    public static du_0[] values() {
        return (du_0[])t.clone();
    }

    public static du_0 valueOf(String string) {
        return Enum.valueOf(du_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private du_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ du_0[] g() {
        return new du_0[]{random, cascade, randomize};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            du_0.r(true);
            var3_2 = "\u0002T}.\u0000\u001f\u0004\t\u0013T`)\u000e\u0016\b\u001bP\u0006\u0013T`)\u000e\u0016";
            var5_3 = "\u0002T}.\u0000\u001f\u0004\t\u0013T`)\u000e\u0016\b\u001bP\u0006\u0013T`)\u000e\u0016".length();
            var2_4 = 7;
            var1_5 = -1;
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v4 = 9;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 104;
                            break;
                        }
                        case 1: {
                            v11 = 60;
                            break;
                        }
                        case 2: {
                            v11 = 7;
                            break;
                        }
                        case 3: {
                            v11 = 68;
                            break;
                        }
                        case 4: {
                            v11 = 104;
                            break;
                        }
                        case 5: {
                            v11 = 114;
                            break;
                        }
                        default: {
                            v11 = 104;
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
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        du_0.random = new du_0(var0[2], 0);
        du_0.cascade = new du_0(var0[0], 1);
        du_0.randomize = new du_0(var0[1], 2);
        du_0.t = du_0.g();
    }

    public static void r(boolean bl) {
        T = bl;
    }

    public static boolean R() {
        return T;
    }

    public static boolean W() {
        boolean bl = du_0.R();
        return !bl;
    }
}

