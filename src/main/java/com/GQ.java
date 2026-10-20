/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class GQ
extends Enum {
    public static final GQ root;
    public static final GQ folder;
    public static final GQ leaf;
    private static final /* synthetic */ GQ[] s;
    private static String[] u;

    public static GQ[] values() {
        return (GQ[])s.clone();
    }

    public static GQ valueOf(String string) {
        return Enum.valueOf(GQ.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private GQ() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ GQ[] v() {
        return new GQ[]{root, folder, leaf};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "QjZT\u0006EjYD%\"\u0004O`TF";
            var5_3 = "QjZT\u0006EjYD%\"\u0004O`TF".length();
            GQ.w(new String[4]);
            var2_4 = 4;
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
            v4 = 40;
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
                            v11 = 11;
                            break;
                        }
                        case 1: {
                            v11 = 45;
                            break;
                        }
                        case 2: {
                            v11 = 29;
                            break;
                        }
                        case 3: {
                            v11 = 8;
                            break;
                        }
                        case 4: {
                            v11 = 104;
                            break;
                        }
                        case 5: {
                            v11 = 120;
                            break;
                        }
                        default: {
                            v11 = 13;
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
        GQ.root = new GQ(var0[0], 0);
        GQ.folder = new GQ(var0[1], 1);
        GQ.leaf = new GQ(var0[2], 2);
        GQ.s = GQ.v();
    }

    public static void w(String[] stringArray) {
        u = stringArray;
    }

    public static String[] W() {
        return u;
    }
}

