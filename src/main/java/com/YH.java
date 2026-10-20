/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class YH
extends Enum {
    public static final YH upCenter;
    public static final YH upLeft;
    public static final YH upRight;
    public static final YH leftCenter;
    public static final YH leftUp;
    public static final YH leftDown;
    public static final YH downCenter;
    public static final YH downLeft;
    public static final YH downRight;
    public static final YH rightCenter;
    public static final YH rightUp;
    public static final YH rightDown;
    private static final /* synthetic */ YH[] i;
    private static final long[] a;
    private static final Integer[] b;

    public static YH[] values() {
        return (YH[])i.clone();
    }

    public static YH valueOf(String string) {
        return Enum.valueOf(YH.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private YH() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ YH[] Y() {
        YH[] yHArray = new YH[YH.a(10020, 502190542574922515L)];
        yHArray[0] = upCenter;
        yHArray[1] = upLeft;
        yHArray[2] = upRight;
        yHArray[3] = leftCenter;
        yHArray[4] = leftUp;
        yHArray[5] = leftDown;
        yHArray[YH.a((int)22123, (long)8342099801556867670L)] = downCenter;
        yHArray[YH.a((int)23586, (long)6850944865468502041L)] = downLeft;
        yHArray[YH.a((int)17277, (long)3345183889195487051L)] = downRight;
        yHArray[YH.a((int)19379, (long)7554424840442693519L)] = rightCenter;
        yHArray[YH.a((int)18989, (long)4104650017525712414L)] = rightUp;
        yHArray[YH.a((int)31163, (long)8808235233553380750L)] = rightDown;
        return yHArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[12];
                        var12_1 = 0;
                        var11_2 = ",\u0018=yt\u0006\u001b\u00062\u0014<eU#\u000b,\u0018=yt\u0010\u000e0\u0005?c\b2\u0014<eD<\u001c0\u0007+\u0001\bxg;\u001f\b:\u001e-\u007fL6\r*\t:\u001e-\u007fR:\f6\u0005\n:\u001e-\u007fC6\u0005*\u0014(\n2\u0014<eC6\u0005*\u0014(\u0006+\u0001\u0016tf'";
                        var13_3 = ",\u0018=yt\u0006\u001b\u00062\u0014<eU#\u000b,\u0018=yt\u0010\u000e0\u0005?c\b2\u0014<eD<\u001c0\u0007+\u0001\bxg;\u001f\b:\u001e-\u007fL6\r*\t:\u001e-\u007fR:\f6\u0005\n:\u001e-\u007fC6\u0005*\u0014(\n2\u0014<eC6\u0005*\u0014(\u0006+\u0001\u0016tf'".length();
                        var10_4 = 7;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 79;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "6\u0002'cn\r\u001e3\u0005\b1\u001b\u0003nt=\u00146";
                            var13_3 = "6\u0002'cn\r\u001e3\u0005\b1\u001b\u0003nt=\u00146".length();
                            var10_4 = 9;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 85;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 17;
                                    break;
                                }
                                case 1: {
                                    v15 = 62;
                                    break;
                                }
                                case 2: {
                                    v15 = 21;
                                    break;
                                }
                                case 3: {
                                    v15 = 94;
                                    break;
                                }
                                case 4: {
                                    v15 = 79;
                                    break;
                                }
                                case 5: {
                                    v15 = 28;
                                    break;
                                }
                                default: {
                                    v15 = 36;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                var0_7 = 4102034707368021016L;
                var6_8 = new long[13];
                var3_9 = 0;
                var4_10 = "\u00fe\u00aeaEwC\u00a7\u0007\u00f8\u008d\u001a2;%\u00c3[L\b_\u00fa\u00d6\u00f9\u00f9\u009d\u00a2\u00f9\u00fc\u00ca\u001e\u0014\u0005\u00192M\u00be\u00a5\u00b9\u0015J\f6(\u0081\u00cb\u00bf\u0001\u00b1\u00af\u0000\u0092\u00df\u00e5_q\u00f4C\u00cb\u008bI)T\u0084\u00d6k\u008f)<Lp\u00e89\u00df3\u00ae\u00dd\u0080\u00154jJF\u00e7\u00f9Y\fY\u00d6H";
                var5_11 = "\u00fe\u00aeaEwC\u00a7\u0007\u00f8\u008d\u001a2;%\u00c3[L\b_\u00fa\u00d6\u00f9\u00f9\u009d\u00a2\u00f9\u00fc\u00ca\u001e\u0014\u0005\u00192M\u00be\u00a5\u00b9\u0015J\f6(\u0081\u00cb\u00bf\u0001\u00b1\u00af\u0000\u0092\u00df\u00e5_q\u00f4C\u00cb\u008bI)T\u0084\u00d6k\u008f)<Lp\u00e89\u00df3\u00ae\u00dd\u0080\u00154jJF\u00e7\u00f9Y\fY\u00d6H".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0018\u000f\u0013\u00a4<\u0007\u00cb\u009e8\u00b4\u00b1T\u009e\u00f7\u00dc\u0006";
                    var5_11 = "\u0018\u000f\u0013\u00a4<\u0007\u00cb\u009e8\u00b4\u00b1T\u009e\u00f7\u00dc\u0006".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl123:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        YH.a = var6_8;
        YH.b = new Integer[13];
        YH.upCenter = new YH(var8[11], 0);
        YH.upLeft = new YH(var8[9], 1);
        YH.upRight = new YH(var8[4], 2);
        YH.leftCenter = new YH(var8[8], 3);
        YH.leftUp = new YH(var8[1], 4);
        YH.leftDown = new YH(var8[3], 5);
        YH.downCenter = new YH(var8[7], YH.a(22085, 2433492002964920949L));
        YH.downLeft = new YH(var8[5], YH.a(14847, 93325019099608512L));
        YH.downRight = new YH(var8[6], YH.a(29794, 3105521198039005267L));
        YH.rightCenter = new YH(var8[2], YH.a(27237, 8267161065763825243L));
        YH.rightUp = new YH(var8[0], YH.a(1343, 2116766862957775115L));
        YH.rightDown = new YH(var8[10], YH.a(12686, 1898678136216698300L));
        YH.i = YH.Y();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xC37;
        if (b[n11] == null) {
            YH.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

