/*
 * Decompiled with CFR 0.152.
 */
package com.z;

/*
 * Renamed from com.Z.d
 */
public final class d_0
extends Enum {
    public static final d_0 path;
    public static final d_0 tree;
    public static final d_0 list;
    public static final d_0 table;
    public static final d_0 toolbar;
    public static final d_0 history;
    public static final d_0 other;
    private static final d_0[] G;
    private static final long[] a;
    private static final Integer[] b;

    public static d_0[] values() {
        return (d_0[])G.clone();
    }

    public static d_0 valueOf(String string) {
        return Enum.valueOf(d_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d_0() {
        void var2_-1;
        void var1_-1;
    }

    private static d_0[] B() {
        d_0[] d_0Array = new d_0[d_0.a(22907, 8884329091997267958L)];
        d_0Array[0] = path;
        d_0Array[1] = tree;
        d_0Array[2] = list;
        d_0Array[3] = table;
        d_0Array[4] = toolbar;
        d_0Array[5] = history;
        d_0Array[d_0.a((int)10845, (long)8802187126140110035L)] = other;
        return d_0Array;
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
                        var11_2 = "\u0006\u001c/\u001f\u0007\u001e\u001a3\u0007p\u001aR\u0005\u0005\u00014\u000e`\u0004\u001a\u0014(\u0003\u0007\u0002\u001c/\u001f}\tY";
                        var13_3 = "\u0006\u001c/\u001f\u0007\u001e\u001a3\u0007p\u001aR\u0005\u0005\u00014\u000e`\u0004\u001a\u0014(\u0003\u0007\u0002\u001c/\u001f}\tY".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 78;
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
                            var11_2 = "JSmZ\u0005J@jS#";
                            var13_3 = "JSmZ\u0005J@jS#".length();
                            var10_4 = 4;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 26;
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
                                    v15 = 36;
                                    break;
                                }
                                case 1: {
                                    v15 = 59;
                                    break;
                                }
                                case 2: {
                                    v15 = 18;
                                    break;
                                }
                                case 3: {
                                    v15 = 37;
                                    break;
                                }
                                case 4: {
                                    v15 = 92;
                                    break;
                                }
                                case 5: {
                                    v15 = 53;
                                    break;
                                }
                                default: {
                                    v15 = 110;
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
                var0_7 = 5636605380910315823L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u0002\u00be:C\"\u00b1\u0087\u0000\u00e4\u00c9\u00d9\u00850\u001c\u008e\u00de\u0094\u00c5s1\u00f8/\u00fd\u00fa";
                var5_11 = "\u0002\u00be:C\"\u00b1\u0087\u0000\u00e4\u00c9\u00d9\u00850\u001c\u008e\u00de\u0094\u00c5s1\u00f8/\u00fd\u00fa".length();
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
        d_0.a = var6_8;
        d_0.b = new Integer[3];
        d_0.path = new d_0(var8[3], 0);
        d_0.tree = new d_0(var8[5], 1);
        d_0.list = new d_0(var8[0], 2);
        d_0.table = new d_0(var8[6], 3);
        d_0.toolbar = new d_0(var8[1], 4);
        d_0.history = new d_0(var8[4], 5);
        d_0.other = new d_0(var8[2], d_0.a(20645, 4159135922992414249L));
        d_0.G = d_0.B();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2E8C;
        if (b[n11] == null) {
            d_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

