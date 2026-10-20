/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class KO
extends Enum {
    public static final KO ALWAYS;
    public static final KO NEVER;
    public static final KO HOVER;
    private static final KO[] E;

    public static KO[] values() {
        return (KO[])E.clone();
    }

    public static KO valueOf(String string) {
        return Enum.valueOf(KO.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private KO() {
        void var2_-1;
        void var1_-1;
    }

    private static KO[] s() {
        return new KO[]{ALWAYS, NEVER, HOVER};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "JO\u001b\u0007|\u0005LE\u001b\u0007|\u0006CL\u001a\u0003w\u007f";
            var5_3 = "JO\u001b\u0007|\u0005LE\u001b\u0007|\u0006CL\u001a\u0003w\u007f".length();
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
            v4 = 90;
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
                            v11 = 88;
                            break;
                        }
                        case 1: {
                            v11 = 90;
                            break;
                        }
                        case 2: {
                            v11 = 23;
                            break;
                        }
                        case 3: {
                            v11 = 24;
                            break;
                        }
                        case 4: {
                            v11 = 116;
                            break;
                        }
                        case 5: {
                            v11 = 118;
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
        KO.ALWAYS = new KO(var0[2], 0);
        KO.NEVER = new KO(var0[1], 1);
        KO.HOVER = new KO(var0[0], 2);
        KO.E = KO.s();
    }
}

