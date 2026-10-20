/*
 * Decompiled with CFR 0.152.
 */
package org.l;

final class M
extends Enum {
    public static final M DEFAULT;
    public static final M READ_AHEAD;
    public static final M AT_END;
    private static final M[] h;

    public static M[] values() {
        return (M[])h.clone();
    }

    public static M valueOf(String string) {
        return Enum.valueOf(M.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private M() {
        void var2_-1;
        void var1_-1;
    }

    private static M[] J() {
        return new M[]{DEFAULT, READ_AHEAD, AT_END};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "KJ:\u0010:QW\\N?\u0006X[$\u0011+T\u0007]J=\u00150\\K";
            var5_3 = "KJ:\u0010:QW\\N?\u0006X[$\u0011+T\u0007]J=\u00150\\K".length();
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
                            v11 = 14;
                            break;
                        }
                        case 1: {
                            v11 = 24;
                            break;
                        }
                        case 2: {
                            v11 = 108;
                            break;
                        }
                        case 3: {
                            v11 = 67;
                            break;
                        }
                        case 4: {
                            v11 = 114;
                            break;
                        }
                        case 5: {
                            v11 = 7;
                            break;
                        }
                        default: {
                            v11 = 8;
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
        M.DEFAULT = new M(var0[2], 0);
        M.READ_AHEAD = new M(var0[0], 1);
        M.AT_END = new M(var0[1], 2);
        M.h = M.J();
    }
}

