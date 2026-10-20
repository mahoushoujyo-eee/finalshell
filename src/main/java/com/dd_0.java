/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import java.util.Arrays;

/*
 * Renamed from com.Dd
 */
public class dd_0 {
    public static final char[] B;
    public static final int[] I;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    public static byte[] m(char[] var0, int var1_1, int var2_2) {
        block25: {
            block35: {
                block24: {
                    block34: {
                        block23: {
                            block31: {
                                block30: {
                                    block29: {
                                        block28: {
                                            block27: {
                                                block26: {
                                                    block22: {
                                                        var3_3 = ph_0.u();
                                                        v0 = var2_2;
                                                        if (var3_3 == 0) {
                                                            if (v0 == 0) {
                                                                return new byte[0];
                                                            }
                                                            v0 = var1_1;
                                                        }
                                                        var5_5 = var1_1 + var2_2 - 1;
                                                        for (var4_4 = v2979549; var4_4 < var5_5; ++var4_4) {
                                                            v1 = dd_0.I[var0[var4_4]];
                                                            if (var3_3 == 0 && var3_3 == 0) {
                                                                if (v1 >= 0) break;
                                                                if (var3_3 == 0) continue;
                                                            }
                                                            ** GOTO lbl16
                                                        }
                                                        do {
                                                            v1 = var5_5;
lbl16:
                                                            // 2 sources

                                                            if (v1 <= 0) break;
                                                            v2 = dd_0.I[var0[var5_5]];
                                                            if (var3_3 != 0 || var3_3 != 0) break block22;
                                                            if (v2 >= 0) break;
                                                            --var5_5;
                                                        } while (var3_3 == 0);
                                                        v2 = var0[var5_5];
                                                    }
                                                    v3 = dd_0.a(219, 4802436660618389513L);
                                                    if (var3_3 != 0) break block26;
                                                    if (v2 != v3) break block27;
                                                    v2 = var0[var5_5 - 1];
                                                    if (var3_3 != 0) break block28;
                                                    v3 = dd_0.a(219, 4802436660618389513L);
                                                }
                                                v2 = v2 == v3 ? 2 : 1;
                                                break block28;
                                            }
                                            v2 = 0;
                                        }
                                        var6_6 = v2;
                                        var7_7 = var5_5 - var4_4 + 1;
                                        v4 = var2_2;
                                        v5 = dd_0.a(16164, 4905771672803497962L);
                                        if (var3_3 != 0) break block29;
                                        if (v4 <= v5) break block30;
                                        v4 = var0[dd_0.a(16164, 4905771672803497962L)];
                                        v5 = dd_0.a(2506, 4602994592062071071L);
                                    }
                                    if (var3_3 != 0) ** GOTO lbl50
                                    if (v4 == v5) {
                                        v4 = var7_7;
                                        v5 = dd_0.a(19266, 8000463361573299073L);
lbl50:
                                        // 2 sources

                                        v6 = v4 / v5;
                                    } else {
                                        v6 = 0;
                                    }
                                    v7 = v6 << 1;
                                    break block31;
                                }
                                v7 = 0;
                            }
                            var8_8 = v7;
                            var9_9 = ((var7_7 - var8_8) * dd_0.a(5614, 7730332275594460454L) >> 3) - var6_6;
                            var10_10 = new byte[var9_9];
                            var11_11 = 0;
                            var12_12 = 0;
                            var13_13 = var9_9 / 3 * 3;
                            while (var11_11 < var13_13) {
                                block33: {
                                    block32: {
                                        var14_14 = dd_0.I[var0[var4_4++]] << dd_0.a(27822, 3834597584656204927L) | dd_0.I[var0[var4_4++]] << dd_0.a(23268, 6207395113592336933L) | dd_0.I[var0[var4_4++]] << dd_0.a(5614, 7730332275594460454L) | dd_0.I[var0[var4_4++]];
                                        var10_10[var11_11++] = (byte)(var14_14 >> dd_0.a(31730, 1649310781495677749L));
                                        var10_10[var11_11++] = (byte)(var14_14 >> dd_0.a(8165, 2372584448918714149L));
                                        var10_10[var11_11++] = (byte)var14_14;
                                        v8 = var8_8;
                                        if (var3_3 != 0) break block23;
                                        if (var3_3 != 0) break block32;
                                        if (v8 <= 0) break block33;
                                        v9 = ++var12_12;
                                    }
                                    if (var3_3 == 0 && v9 == dd_0.a(26358, 8580412412086980157L)) {
                                        var4_4 += 2;
                                        v9 = var12_12 = 0;
                                    }
                                }
                                if (var3_3 == 0) continue;
                            }
                            v8 = var11_11;
                        }
                        if (var3_3 != 0) break block34;
                        if (v8 >= var9_9) break block35;
                        var12_12 = 0;
                        v8 = var13_13 = 0;
                    }
                    while (var4_4 <= var5_5 - var6_6) {
                        var12_12 |= dd_0.I[var0[var4_4++]] << dd_0.a(27822, 3834597584656204927L) - var13_13 * dd_0.a(5614, 7730332275594460454L);
                        ++var13_13;
                        if (var3_3 == 0) {
                            if (var3_3 == 0) continue;
                        }
                        break block24;
                    }
                    var13_13 = dd_0.a(31730, 1649310781495677749L);
                }
                while (var11_11 < var9_9) {
                    v10 = var10_10;
                    if (var3_3 == 0) {
                        v10[var11_11++] = (byte)(var12_12 >> var13_13);
                        var13_13 -= 8;
                        if (var3_3 == 0) continue;
                    }
                    break block25;
                }
            }
            v10 = var10_10;
        }
        return v10;
    }

    /*
     * Unable to fully structure code
     */
    public static byte[] r(String var0, int var1_1, int var2_2) {
        block25: {
            block35: {
                block24: {
                    block34: {
                        block23: {
                            block31: {
                                block30: {
                                    block29: {
                                        block28: {
                                            block27: {
                                                block26: {
                                                    block22: {
                                                        var3_3 = ph_0.w();
                                                        v0 = var2_2;
                                                        if (var3_3 != 0) {
                                                            if (v0 == 0) {
                                                                return new byte[0];
                                                            }
                                                            v0 = var1_1;
                                                        }
                                                        var5_5 = var1_1 + var2_2 - 1;
                                                        for (var4_4 = v2981839; var4_4 < var5_5; ++var4_4) {
                                                            v1 = dd_0.I[var0.charAt(var4_4)];
                                                            if (var3_3 != 0 && var3_3 != 0) {
                                                                if (v1 >= 0) break;
                                                                if (var3_3 != 0) continue;
                                                            }
                                                            ** GOTO lbl16
                                                        }
                                                        do {
                                                            v1 = var5_5;
lbl16:
                                                            // 2 sources

                                                            if (v1 <= 0) break;
                                                            v2 = dd_0.I[var0.charAt(var5_5)];
                                                            if (var3_3 == 0 || var3_3 == 0) break block22;
                                                            if (v2 >= 0) break;
                                                            --var5_5;
                                                        } while (var3_3 != 0);
                                                        v2 = var0.charAt(var5_5);
                                                    }
                                                    v3 = dd_0.a(219, 4802436660618389513L);
                                                    if (var3_3 == 0) break block26;
                                                    if (v2 != v3) break block27;
                                                    v2 = var0.charAt(var5_5 - 1);
                                                    if (var3_3 == 0) break block28;
                                                    v3 = dd_0.a(219, 4802436660618389513L);
                                                }
                                                v2 = v2 == v3 ? 2 : 1;
                                                break block28;
                                            }
                                            v2 = 0;
                                        }
                                        var6_6 = v2;
                                        var7_7 = var5_5 - var4_4 + 1;
                                        v4 = var2_2;
                                        v5 = dd_0.a(29014, 5836247368506087827L);
                                        if (var3_3 == 0) break block29;
                                        if (v4 <= v5) break block30;
                                        v4 = var0.charAt(dd_0.a(16164, 4905771672803497962L));
                                        v5 = dd_0.a(31164, 5219238331983008126L);
                                    }
                                    if (var3_3 == 0) ** GOTO lbl50
                                    if (v4 == v5) {
                                        v4 = var7_7;
                                        v5 = dd_0.a(12936, 2674045981100857924L);
lbl50:
                                        // 2 sources

                                        v6 = v4 / v5;
                                    } else {
                                        v6 = 0;
                                    }
                                    v7 = v6 << 1;
                                    break block31;
                                }
                                v7 = 0;
                            }
                            var8_8 = v7;
                            var9_9 = ((var7_7 - var8_8) * dd_0.a(26635, 466335938777579716L) >> 3) - var6_6;
                            var10_10 = new byte[var9_9];
                            var11_11 = 0;
                            var12_12 = 0;
                            var13_13 = var9_9 / 3 * 3;
                            while (var11_11 < var13_13) {
                                block33: {
                                    block32: {
                                        var14_14 = dd_0.I[var0.charAt(var4_4++)] << dd_0.a(8519, 4860261691652131201L) | dd_0.I[var0.charAt(var4_4++)] << dd_0.a(6711, 2163401343897400039L) | dd_0.I[var0.charAt(var4_4++)] << dd_0.a(5614, 7730332275594460454L) | dd_0.I[var0.charAt(var4_4++)];
                                        var10_10[var11_11++] = (byte)(var14_14 >> dd_0.a(27945, 1238824587946853869L));
                                        var10_10[var11_11++] = (byte)(var14_14 >> dd_0.a(21957, 7850013313912552723L));
                                        var10_10[var11_11++] = (byte)var14_14;
                                        v8 = var8_8;
                                        if (var3_3 == 0) break block23;
                                        if (var3_3 == 0) break block32;
                                        if (v8 <= 0) break block33;
                                        v9 = ++var12_12;
                                    }
                                    if (var3_3 != 0 && v9 == dd_0.a(27311, 7933415358630101602L)) {
                                        var4_4 += 2;
                                        v9 = var12_12 = 0;
                                    }
                                }
                                if (var3_3 != 0) continue;
                            }
                            v8 = var11_11;
                        }
                        if (var3_3 == 0) break block34;
                        if (v8 >= var9_9) break block35;
                        var12_12 = 0;
                        v8 = var13_13 = 0;
                    }
                    while (var4_4 <= var5_5 - var6_6) {
                        var12_12 |= dd_0.I[var0.charAt(var4_4++)] << dd_0.a(27822, 3834597584656204927L) - var13_13 * dd_0.a(5614, 7730332275594460454L);
                        ++var13_13;
                        if (var3_3 != 0) {
                            if (var3_3 != 0) continue;
                        }
                        break block24;
                    }
                    var13_13 = dd_0.a(31730, 1649310781495677749L);
                }
                while (var11_11 < var9_9) {
                    v10 = var10_10;
                    if (var3_3 != 0) {
                        v10[var11_11++] = (byte)(var12_12 >> var13_13);
                        var13_13 -= 8;
                        if (var3_3 != 0) continue;
                    }
                    break block25;
                }
            }
            v10 = var10_10;
        }
        return v10;
    }

    /*
     * Unable to fully structure code
     */
    public static byte[] y(String var0) {
        block25: {
            block35: {
                block24: {
                    block34: {
                        block23: {
                            block31: {
                                block30: {
                                    block29: {
                                        block28: {
                                            block27: {
                                                block26: {
                                                    block22: {
                                                        var2_1 = var0.length();
                                                        var1_2 = ph_0.u();
                                                        v0 = var2_1;
                                                        if (var1_2 == 0) {
                                                            if (v0 == 0) {
                                                                return new byte[0];
                                                            }
                                                            v0 = 0;
                                                        }
                                                        var4_4 = var2_1 - 1;
                                                        for (var3_3 = v2984131; var3_3 < var4_4; ++var3_3) {
                                                            v1 = dd_0.I[var0.charAt(var3_3) & dd_0.a(14310, 2068736245604605745L)];
                                                            if (var1_2 == 0 && var1_2 == 0) {
                                                                if (v1 >= 0) break;
                                                                if (var1_2 == 0) continue;
                                                            }
                                                            ** GOTO lbl17
                                                        }
                                                        do {
                                                            v1 = var4_4;
lbl17:
                                                            // 2 sources

                                                            if (v1 <= 0) break;
                                                            v2 = dd_0.I[var0.charAt(var4_4) & dd_0.a(428, 3728974573605939558L)];
                                                            if (var1_2 != 0 || var1_2 != 0) break block22;
                                                            if (v2 >= 0) break;
                                                            --var4_4;
                                                        } while (var1_2 == 0);
                                                        v2 = var0.charAt(var4_4);
                                                    }
                                                    v3 = dd_0.a(219, 4802436660618389513L);
                                                    if (var1_2 != 0) break block26;
                                                    if (v2 != v3) break block27;
                                                    v2 = var0.charAt(var4_4 - 1);
                                                    if (var1_2 != 0) break block28;
                                                    v3 = dd_0.a(219, 4802436660618389513L);
                                                }
                                                v2 = v2 == v3 ? 2 : 1;
                                                break block28;
                                            }
                                            v2 = 0;
                                        }
                                        var5_5 = v2;
                                        var6_6 = var4_4 - var3_3 + 1;
                                        v4 = var2_1;
                                        v5 = dd_0.a(16164, 4905771672803497962L);
                                        if (var1_2 != 0) break block29;
                                        if (v4 <= v5) break block30;
                                        v4 = var0.charAt(dd_0.a(16164, 4905771672803497962L));
                                        v5 = dd_0.a(2506, 4602994592062071071L);
                                    }
                                    if (var1_2 != 0) ** GOTO lbl51
                                    if (v4 == v5) {
                                        v4 = var6_6;
                                        v5 = dd_0.a(19266, 8000463361573299073L);
lbl51:
                                        // 2 sources

                                        v6 = v4 / v5;
                                    } else {
                                        v6 = 0;
                                    }
                                    v7 = v6 << 1;
                                    break block31;
                                }
                                v7 = 0;
                            }
                            var7_7 = v7;
                            var8_8 = ((var6_6 - var7_7) * dd_0.a(5614, 7730332275594460454L) >> 3) - var5_5;
                            var9_9 = new byte[var8_8];
                            var10_10 = 0;
                            var11_11 = 0;
                            var12_12 = var8_8 / 3 * 3;
                            while (var10_10 < var12_12) {
                                block33: {
                                    block32: {
                                        var13_13 = dd_0.I[var0.charAt(var3_3++)] << dd_0.a(27822, 3834597584656204927L) | dd_0.I[var0.charAt(var3_3++)] << dd_0.a(23268, 6207395113592336933L) | dd_0.I[var0.charAt(var3_3++)] << dd_0.a(5614, 7730332275594460454L) | dd_0.I[var0.charAt(var3_3++)];
                                        var9_9[var10_10++] = (byte)(var13_13 >> dd_0.a(31730, 1649310781495677749L));
                                        var9_9[var10_10++] = (byte)(var13_13 >> dd_0.a(8165, 2372584448918714149L));
                                        var9_9[var10_10++] = (byte)var13_13;
                                        v8 = var7_7;
                                        if (var1_2 != 0) break block23;
                                        if (var1_2 != 0) break block32;
                                        if (v8 <= 0) break block33;
                                        v9 = ++var11_11;
                                    }
                                    if (var1_2 == 0 && v9 == dd_0.a(26358, 8580412412086980157L)) {
                                        var3_3 += 2;
                                        v9 = var11_11 = 0;
                                    }
                                }
                                if (var1_2 == 0) continue;
                            }
                            v8 = var10_10;
                        }
                        if (var1_2 != 0) break block34;
                        if (v8 >= var8_8) break block35;
                        var11_11 = 0;
                        v8 = var12_12 = 0;
                    }
                    while (var3_3 <= var4_4 - var5_5) {
                        var11_11 |= dd_0.I[var0.charAt(var3_3++)] << dd_0.a(27822, 3834597584656204927L) - var12_12 * dd_0.a(5614, 7730332275594460454L);
                        ++var12_12;
                        if (var1_2 == 0) {
                            if (var1_2 == 0) continue;
                        }
                        break block24;
                    }
                    var12_12 = dd_0.a(31730, 1649310781495677749L);
                }
                while (var10_10 < var8_8) {
                    v10 = var9_9;
                    if (var1_2 == 0) {
                        v10[var10_10++] = (byte)(var11_11 >> var12_12);
                        var12_12 -= 8;
                        if (var1_2 == 0) continue;
                    }
                    break block25;
                }
            }
            v10 = var9_9;
        }
        return v10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                block21: {
                    break block21;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\ns.\u001bn\u0014'\u0003x'\u0014g\u001f.\u0004a<\rx\u00065\u001df5\u0006q3\u0002(U\b9L:\t!Z\u00012E=\u0010:C\u001e+^$\u00173H\u0017o\u001a`S\u007f\u0004[h\u0013kKd".toCharArray();
                v1 = v0.length;
                var9_1 = 0;
                v2 = 44;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var9_1;
                    while (true) {
                        switch (var9_1 % 7) {
                            case 0: {
                                v9 = 103;
                                break;
                            }
                            case 1: {
                                v9 = 29;
                                break;
                            }
                            case 2: {
                                v9 = 65;
                                break;
                            }
                            case 3: {
                                v9 = 115;
                                break;
                            }
                            case 4: {
                                v9 = 7;
                                break;
                            }
                            case 5: {
                                v9 = 126;
                                break;
                            }
                            default: {
                                v9 = 76;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var9_1;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var9_1);
                ** while (true)
                var8 = new String(v10).intern();
                var0_2 = 8251872514937284113L;
                var6_3 = new long[23];
                var3_4 = 0;
                var4_5 = ")\u00f6}j\u0001\u00bf\u00c5\u00de*\u008f`\u00a67Vwb`\u00d5\u0081\u008e\u00b6\u008f\u00d48w\u00f7\u0004\"]\u00cf\u0011<\u00cf\u00f5\u00d7\u00fe\u00d7\u00e0\u00f54&9\u00c8\u00b9\u00fe\u00f8/\u0082\u00e0\u00e8\u0099\u00b5U\u00b8\u007f\u00ce\u00c5y+U/2\u00e3\u00ec\u00a9+s\r\u00b8ih?\u00b5\u00d7M$$\u009b\u008f\u0088\u00a3\u001aw+\u00e6\u0093{\u00c17?\u00d5\rb.\u001b1\u008a(\u00e8\u001c\u00c8sf\u00d3\u00c3\u00a4d+2\u00051\u00b7Iz\u00e4\u00f2Rc\u00e4`\u000eZ\u00cdo\u00f06\u00bc\u001bG\u00d4\u0004\u00aa\u00ef\u00bb\u0095\u00b0\u00f3\u00a6\u00921\u00cc\u00dd\u008e%\u00d6Es\u00d9\u00ca\u00a4b|\u00e0\u0000\u0013Ta>\u0014\u00fa\u0096\u00c3\u00e3\u009c\u009d\u0099\u00b9\u00df";
                var5_6 = ")\u00f6}j\u0001\u00bf\u00c5\u00de*\u008f`\u00a67Vwb`\u00d5\u0081\u008e\u00b6\u008f\u00d48w\u00f7\u0004\"]\u00cf\u0011<\u00cf\u00f5\u00d7\u00fe\u00d7\u00e0\u00f54&9\u00c8\u00b9\u00fe\u00f8/\u0082\u00e0\u00e8\u0099\u00b5U\u00b8\u007f\u00ce\u00c5y+U/2\u00e3\u00ec\u00a9+s\r\u00b8ih?\u00b5\u00d7M$$\u009b\u008f\u0088\u00a3\u001aw+\u00e6\u0093{\u00c17?\u00d5\rb.\u001b1\u008a(\u00e8\u001c\u00c8sf\u00d3\u00c3\u00a4d+2\u00051\u00b7Iz\u00e4\u00f2Rc\u00e4`\u000eZ\u00cdo\u00f06\u00bc\u001bG\u00d4\u0004\u00aa\u00ef\u00bb\u0095\u00b0\u00f3\u00a6\u00921\u00cc\u00dd\u008e%\u00d6Es\u00d9\u00ca\u00a4b|\u00e0\u0000\u0013Ta>\u0014\u00fa\u0096\u00c3\u00e3\u009c\u009d\u0099\u00b9\u00df".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v11 = var6_3;
                    v12 = var3_4++;
                    v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v14 = -1;
                    break block19;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00a1\u00f0\u0081\u00b8\u0091}[\n\u008d\u00a61U\u009aB\u0007\u0003";
                    var5_6 = "\u00a1\u00f0\u0081\u00b8\u0091}[\n\u008d\u00a61U\u009aB\u0007\u0003".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v11 = var6_3;
                        v12 = var3_4++;
                        v13 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v14 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_7 < var5_6) ** continue;
                    break block20;
                    break;
                }
            }
            v15 = v13 ^ var0_2;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        dd_0.a = var6_3;
        dd_0.b = new Integer[23];
        dd_0.B = var8.toCharArray();
        dd_0.I = new int[dd_0.a(29721, 4449762684328877264L)];
        Arrays.fill(dd_0.I, -1);
        var11_10 = dd_0.B.length;
        for (var10_9 = 0; var10_9 < var11_10; ++var10_9) {
            dd_0.I[dd_0.B[var10_9]] = var10_9;
        }
        dd_0.I[dd_0.a((int)6991, (long)7581547476878816156L)] = 0;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x68C3;
        if (b[n11] == null) {
            dd_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

