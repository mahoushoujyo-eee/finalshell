/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class D6
extends Enum {
    public static final D6 add;
    public static final D6 remove;
    public static final D6 replace;
    public static final D6 move;
    public static final D6 copy;
    public static final D6 test;
    private static final D6[] F;
    private static final long a;

    public static D6[] values() {
        return (D6[])F.clone();
    }

    public static D6 valueOf(String string) {
        return Enum.valueOf(D6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private D6() {
        void var2_-1;
        void var1_-1;
    }

    private static D6[] m() {
        D6[] d6Array = new D6[(int)a];
        d6Array[0] = add;
        d6Array[1] = remove;
        d6Array[2] = replace;
        d6Array[3] = move;
        d6Array[4] = copy;
        d6Array[5] = test;
        return d6Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "~QE\u0004rZW|\u0006mPLvq#\u0007mPQuf%H";
                var7_3 = "~QE\u0004rZW|\u0006mPLvq#\u0007mPQuf%H".length();
                var4_4 = 3;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 49;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "9\u001f\u0014%\u0004.\u0015\u0017(";
                    var7_3 = "9\u001f\u0014%\u0004.\u0015\u0017(".length();
                    var4_4 = 4;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 116;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 46;
                            break;
                        }
                        case 1: {
                            v15 = 4;
                            break;
                        }
                        case 2: {
                            v15 = 16;
                            break;
                        }
                        case 3: {
                            v15 = 40;
                            break;
                        }
                        case 4: {
                            v15 = 54;
                            break;
                        }
                        case 5: {
                            v15 = 119;
                            break;
                        }
                        default: {
                            v15 = 28;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 7738935872742658095L;
        ** while (true)
        D6.a = 3909796765412003881L ^ var0_7;
        D6.add = new D6(var2[0], 0);
        D6.remove = new D6(var2[2], 1);
        D6.replace = new D6(var2[3], 2);
        D6.move = new D6(var2[1], 3);
        D6.copy = new D6(var2[4], 4);
        D6.test = new D6(var2[5], 5);
        D6.F = D6.m();
    }
}

