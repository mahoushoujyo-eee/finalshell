/*
 * Decompiled with CFR 0.152.
 */
package org.v;

public final class _F
extends Enum {
    public static final _F NAMED_TYPE_DECLARATION;
    public static final _F COMPILATION_UNIT;
    private static final _F[] k;

    public static _F[] values() {
        return (_F[])k.clone();
    }

    public static _F valueOf(String string) {
        return Enum.valueOf(_F.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _F() {
        void var2_-1;
        void var1_-1;
    }

    private static _F[] R() {
        return new _F[]{NAMED_TYPE_DECLARATION, COMPILATION_UNIT};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "y\u000e(Tc){n\u001f Nc3l{\u000e7Ps?`y\u0010t\u0000(An:nc\u0006*_x#a~\u001b";
            var5_3 = "y\u000e(Tc){n\u001f Nc3l{\u000e7Ps?`y\u0010t\u0000(An:nc\u0006*_x#a~\u001b".length();
            var2_4 = 22;
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
            v4 = 73;
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
                            v11 = 6;
                            break;
                        }
                        case 2: {
                            v11 = 44;
                            break;
                        }
                        case 3: {
                            v11 = 88;
                            break;
                        }
                        case 4: {
                            v11 = 110;
                            break;
                        }
                        case 5: {
                            v11 = 63;
                            break;
                        }
                        default: {
                            v11 = 102;
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
        _F.NAMED_TYPE_DECLARATION = new _F(var0[0], 0);
        _F.COMPILATION_UNIT = new _F(var0[1], 1);
        _F.k = _F.R();
    }
}

