/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class LX
extends Enum {
    public static final LX none;
    public static final LX united;
    public static final LX separated;
    private static final /* synthetic */ LX[] a;

    public static LX[] values() {
        return (LX[])a.clone();
    }

    public static LX valueOf(String string) {
        return Enum.valueOf(LX.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LX() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ LX[] x() {
        return new LX[]{none, united, separated};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "6\u0011W|T\u0006\t0\u001aNiC\u0003f&\u001b\u0004-\u0010Pm";
            var5_3 = "6\u0011W|T\u0006\t0\u001aNiC\u0003f&\u001b\u0004-\u0010Pm".length();
            var2_4 = 6;
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
            v4 = 69;
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
                            v11 = 6;
                            break;
                        }
                        case 1: {
                            v11 = 58;
                            break;
                        }
                        case 2: {
                            v11 = 123;
                            break;
                        }
                        case 3: {
                            v11 = 77;
                            break;
                        }
                        case 4: {
                            v11 = 116;
                            break;
                        }
                        case 5: {
                            v11 = 39;
                            break;
                        }
                        default: {
                            v11 = 87;
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
        LX.none = new LX(var0[2], 0);
        LX.united = new LX(var0[0], 1);
        LX.separated = new LX(var0[1], 2);
        LX.a = LX.x();
    }
}

