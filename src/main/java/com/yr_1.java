/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.yR
 */
public final class yr_1
extends Enum {
    public static final yr_1 center;
    public static final yr_1 topLeft;
    public static final yr_1 topRight;
    public static final yr_1 bottomLeft;
    public static final yr_1 bottomRight;
    public static final yr_1 topCenter;
    public static final yr_1 bottomCenter;
    public static final yr_1 leftCenter;
    public static final yr_1 rightCenter;
    private static final /* synthetic */ yr_1[] l;
    private static final long[] a;
    private static final Integer[] b;

    public static yr_1[] values() {
        return (yr_1[])l.clone();
    }

    public static yr_1 valueOf(String string) {
        return Enum.valueOf(yr_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yr_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ yr_1[] B() {
        yr_1[] yr_1Array = new yr_1[yr_1.a(32018, 5656923265666673589L)];
        yr_1Array[0] = center;
        yr_1Array[1] = topLeft;
        yr_1Array[2] = topRight;
        yr_1Array[3] = bottomLeft;
        yr_1Array[4] = bottomRight;
        yr_1Array[5] = topCenter;
        yr_1Array[yr_1.a((int)2899, (long)2942506567363534327L)] = bottomCenter;
        yr_1Array[yr_1.a((int)14460, (long)5016124243327790815L)] = leftCenter;
        yr_1Array[yr_1.a((int)16381, (long)7429907130587097432L)] = rightCenter;
        return yr_1Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[9];
                        var12_1 = 0;
                        var11_2 = "?\u000f\u0011\u0017aDm.\u0012\n)\u000f\u0015 kGU.\u0006\u0015\u0007?\u000f\u0011\u0018aLm\u0006(\u0005\u000f aX\f)\u000f\u0015 kGZ.\u000e\u00151v\n'\u0005\u0007 GOw?\u0005\u0013\u000b9\t\u0006<pi|%\u0014\u0004&";
                        var13_3 = "?\u000f\u0011\u0017aDm.\u0012\n)\u000f\u0015 kGU.\u0006\u0015\u0007?\u000f\u0011\u0018aLm\u0006(\u0005\u000f aX\f)\u000f\u0015 kGZ.\u000e\u00151v\n'\u0005\u0007 GOw?\u0005\u0013\u000b9\t\u0006<pi|%\u0014\u0004&".length();
                        var10_4 = 9;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 16;
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
                            var11_2 = "\u00171+\u001eUyu\u001c97\u001e\b\u00011/8SsO\u0001";
                            var13_3 = "\u00171+\u001eUyu\u001c97\u001e\b\u00011/8SsO\u0001".length();
                            var10_4 = 11;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 46;
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
                                    v15 = 91;
                                    break;
                                }
                                case 1: {
                                    v15 = 112;
                                    break;
                                }
                                case 2: {
                                    v15 = 113;
                                    break;
                                }
                                case 3: {
                                    v15 = 68;
                                    break;
                                }
                                case 4: {
                                    v15 = 20;
                                    break;
                                }
                                case 5: {
                                    v15 = 58;
                                    break;
                                }
                                default: {
                                    v15 = 9;
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
                var0_7 = 7750794137010530234L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = "\\\u0081\th\u00b4\u0005\f\u0006\u00a6\u00a0|)\u009f\u00f9.\u00df\u00f4\u0087\u00e5\u0083?xN\u00eaL\u00be\u0004\u0013\u00b7DzK\u0003{\u0093\u00bf\u0087vIb";
                var5_11 = "\\\u0081\th\u00b4\u0005\f\u0006\u00a6\u00a0|)\u009f\u00f9.\u00df\u00f4\u0087\u00e5\u0083?xN\u00eaL\u00be\u0004\u0013\u00b7DzK\u0003{\u0093\u00bf\u0087vIb".length();
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
                    var4_10 = "\f\u00d3`\u001a\u00d7\u00e1\u00c0?~\u008e-e\u00e9^\u00bb\b";
                    var5_11 = "\f\u00d3`\u001a\u00d7\u00e1\u00c0?~\u008e-e\u00e9^\u00bb\b".length();
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
        yr_1.a = var6_8;
        yr_1.b = new Integer[7];
        yr_1.center = new yr_1(var8[3], 0);
        yr_1.topLeft = new yr_1(var8[2], 1);
        yr_1.topRight = new yr_1(var8[8], 2);
        yr_1.bottomLeft = new yr_1(var8[1], 3);
        yr_1.bottomRight = new yr_1(var8[7], 4);
        yr_1.topCenter = new yr_1(var8[0], 5);
        yr_1.bottomCenter = new yr_1(var8[4], yr_1.a(18965, 3332388938000096436L));
        yr_1.leftCenter = new yr_1(var8[5], yr_1.a(12576, 182949257619220354L));
        yr_1.rightCenter = new yr_1(var8[6], yr_1.a(24523, 5034363418539739501L));
        yr_1.l = yr_1.B();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x16A7;
        if (b[n11] == null) {
            yr_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

