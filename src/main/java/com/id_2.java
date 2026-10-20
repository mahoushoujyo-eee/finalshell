/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.id
 */
public final class id_2
extends Enum {
    public static final id_2 circe;
    public static final id_2 facebook;
    public static final id_2 roller;
    public static final id_2 arrows;
    public static final id_2 indicator;
    public static final id_2 snake;
    public static final id_2 none;
    private static final /* synthetic */ id_2[] c;
    private static final long[] a;
    private static final Integer[] b;

    public static id_2[] values() {
        return (id_2[])c.clone();
    }

    public static id_2 valueOf(String string) {
        return Enum.valueOf(id_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private id_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ id_2[] s() {
        id_2[] id_2Array = new id_2[id_2.a(6103, 7183848983689982810L)];
        id_2Array[0] = circe;
        id_2Array[1] = facebook;
        id_2Array[2] = roller;
        id_2Array[3] = arrows;
        id_2Array[4] = indicator;
        id_2Array[5] = snake;
        id_2Array[id_2.a((int)16986, (long)8628082348534998740L)] = none;
        return id_2Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var8 = new String[7];
                        var12_1 = 0;
                        var11_2 = "(r]P7\u00058uNX7\u00069tC_7_\u0006*i]\\%^\b-zLV0Bz ";
                        var13_3 = "(r]P7\u00058uNX7\u00069tC_7_\u0006*i]\\%^\b-zLV0Bz ".length();
                        var10_4 = 5;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 86;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block21;
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
                            var11_2 = "<kUD/R\u007f:w\u0004;j_H";
                            var13_3 = "<kUD/R\u007f:w\u0004;j_H".length();
                            var10_4 = 9;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 72;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block21;
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
                            break block22;
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
                                    v15 = 29;
                                    break;
                                }
                                case 1: {
                                    v15 = 77;
                                    break;
                                }
                                case 2: {
                                    v15 = 121;
                                    break;
                                }
                                case 3: {
                                    v15 = 101;
                                    break;
                                }
                                case 4: {
                                    v15 = 4;
                                    break;
                                }
                                case 5: {
                                    v15 = 123;
                                    break;
                                }
                                default: {
                                    v15 = 67;
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
                var0_7 = 277624548844636480L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u0098\u00d8\t\u009e\u00c0\u009a\u00ed\u00d2\u0091&\u00a6K\u00ae4z\u001df\u00ac\n\u0096\u00d3\u00ef/\u0092";
                var5_11 = "\u0098\u00d8\t\u009e\u00c0\u009a\u00ed\u00d2\u0091&\u00a6K\u00ae4z\u001df\u00ac\n\u0096\u00d3\u00ef/\u0092".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        id_2.a = var6_8;
        id_2.b = new Integer[3];
        id_2.circe = new id_2(var8[0], 0);
        id_2.facebook = new id_2(var8[4], 1);
        id_2.roller = new id_2(var8[2], 2);
        id_2.arrows = new id_2(var8[3], 3);
        id_2.indicator = new id_2(var8[5], 4);
        id_2.snake = new id_2(var8[1], 5);
        id_2.none = new id_2(var8[6], id_2.a(24, 7509580539788715156L));
        id_2.c = id_2.s();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x648C;
        if (b[n11] == null) {
            id_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

