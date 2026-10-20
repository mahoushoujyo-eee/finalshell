/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class K6
extends Enum {
    public static final K6 underlined;
    public static final K6 waved;
    public static final K6 strikeThrough;
    public static final K6 doubleStrikeThrough;
    public static final K6 superscript;
    public static final K6 subscript;
    private static final /* synthetic */ K6[] q;
    private static final long a;

    public static K6[] values() {
        return (K6[])q.clone();
    }

    public static K6 valueOf(String string) {
        return Enum.valueOf(K6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private K6() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ K6[] G() {
        K6[] k6Array = new K6[(int)a];
        k6Array[0] = underlined;
        k6Array[1] = waved;
        k6Array[2] = strikeThrough;
        k6Array[3] = doubleStrikeThrough;
        k6Array[4] = superscript;
        k6Array[5] = subscript;
        return k6Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "x{3>\u0019?Khf/7\u0010\u000epn{3;\u001d\niz\"9\u00076qrq\"\ro`45\u001e?Ltf))\u00122\toa$/\u0016(ql`";
                var7_3 = "x{3>\u0019?Khf/7\u0010\u000epn{3;\u001d\niz\"9\u00076qrq\"\ro`45\u001e?Ltf))\u00122\toa$/\u0016(ql`".length();
                var4_4 = 19;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 69;
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
                    var5_2 = "RL\t\u0000(\u000bVX\u000f\u0000>\u0010BWD\u000f\u0011";
                    var7_3 = "RL\t\u0000(\u000bVX\u000f\u0000>\u0010BWD\u000f\u0011".length();
                    var4_4 = 5;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 124;
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
                            v15 = 89;
                            break;
                        }
                        case 1: {
                            v15 = 81;
                            break;
                        }
                        case 2: {
                            v15 = 3;
                            break;
                        }
                        case 3: {
                            v15 = 25;
                            break;
                        }
                        case 4: {
                            v15 = 48;
                            break;
                        }
                        case 5: {
                            v15 = 31;
                            break;
                        }
                        default: {
                            v15 = 93;
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
        var0_7 = 5371963831535055287L;
        ** while (true)
        K6.a = -3262492125167308367L ^ var0_7;
        K6.underlined = new K6(var2[1], 0);
        K6.waved = new K6(var2[4], 1);
        K6.strikeThrough = new K6(var2[2], 2);
        K6.doubleStrikeThrough = new K6(var2[0], 3);
        K6.superscript = new K6(var2[5], 4);
        K6.subscript = new K6(var2[3], 5);
        K6.q = K6.G();
    }
}

