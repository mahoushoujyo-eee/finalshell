/*
 * Decompiled with CFR 0.152.
 */
package org.v;

final class fX
extends Enum {
    public static final fX INT;
    public static final fX ENUM;
    public static final fX STRING;
    private static final fX[] l;

    public static fX[] values() {
        return (fX[])l.clone();
    }

    public static fX valueOf(String string) {
        return Enum.valueOf(fX.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fX() {
        void var2_-1;
        void var1_-1;
    }

    private static fX[] K() {
        return new fX[]{INT, ENUM, STRING};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "l=-\u0004`=,P\u0006v'+T\u0018m";
            var5_3 = "l=-\u0004`=,P\u0006v'+T\u0018m".length();
            var2_4 = 3;
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
            v4 = 91;
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
                            v11 = 126;
                            break;
                        }
                        case 1: {
                            v11 = 40;
                            break;
                        }
                        case 2: {
                            v11 = 34;
                            break;
                        }
                        case 3: {
                            v11 = 70;
                            break;
                        }
                        case 4: {
                            v11 = 13;
                            break;
                        }
                        case 5: {
                            v11 = 113;
                            break;
                        }
                        default: {
                            v11 = 82;
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
        fX.INT = new fX(var0[0], 0);
        fX.ENUM = new fX(var0[1], 1);
        fX.STRING = new fX(var0[2], 2);
        fX.l = fX.K();
    }
}

