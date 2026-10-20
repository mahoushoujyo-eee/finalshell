/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Dc
 */
public final class dc_0
extends Enum {
    public static final dc_0 NONPRINTING;
    public static final dc_0 PRINTING;
    public static final dc_0 NONASCII;
    public static final dc_0 NONE;
    private static final dc_0[] I;

    public static dc_0[] values() {
        return (dc_0[])I.clone();
    }

    public static dc_0 valueOf(String string) {
        return Enum.valueOf(dc_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dc_0() {
        void var2_-1;
        void var1_-1;
    }

    private static dc_0[] Y() {
        return new dc_0[]{NONPRINTING, PRINTING, NONASCII, NONE};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "fn0\u0005T2}|h0\u0012\bxs7\u001bR2}o";
                var5_3 = "fn0\u0005T2}|h0\u0012\bxs7\u001bR2}o".length();
                var2_4 = 11;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 44;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "\u0005\rSw6[\u0019\u0002\u0004\u0005\rSs";
                    var5_3 = "\u0005\rSw6[\u0019\u0002\u0004\u0005\rSs".length();
                    var2_4 = 8;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 79;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 4;
                            break;
                        }
                        case 1: {
                            v15 = 13;
                            break;
                        }
                        case 2: {
                            v15 = 82;
                            break;
                        }
                        case 3: {
                            v15 = 121;
                            break;
                        }
                        case 4: {
                            v15 = 42;
                            break;
                        }
                        case 5: {
                            v15 = 87;
                            break;
                        }
                        default: {
                            v15 = 31;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        dc_0.NONPRINTING = new dc_0(var0[0], 0);
        dc_0.PRINTING = new dc_0(var0[1], 1);
        dc_0.NONASCII = new dc_0(var0[2], 2);
        dc_0.NONE = new dc_0(var0[3], 3);
        dc_0.I = dc_0.Y();
    }
}

