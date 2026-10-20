/*
 * Decompiled with CFR 0.152.
 */
package org.v;

/*
 * Renamed from org.v.d
 */
public final class d_2
extends Enum {
    public static final d_2 VOID;
    public static final d_2 BYTE;
    public static final d_2 SHORT;
    public static final d_2 CHAR;
    public static final d_2 INT;
    public static final d_2 LONG;
    public static final d_2 FLOAT;
    public static final d_2 DOUBLE;
    public static final d_2 BOOLEAN;
    private static final d_2[] E;
    private static final long[] a;
    private static final Integer[] b;

    public static d_2[] values() {
        return (d_2[])E.clone();
    }

    public static d_2 valueOf(String string) {
        return Enum.valueOf(d_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d_2() {
        void var2_-1;
        void var1_-1;
    }

    public String toString() {
        return this.name().toLowerCase();
    }

    private static d_2[] m() {
        d_2[] d_2Array = new d_2[d_2.a(16626, 2048712378761219428L)];
        d_2Array[0] = VOID;
        d_2Array[1] = BYTE;
        d_2Array[2] = SHORT;
        d_2Array[3] = CHAR;
        d_2Array[4] = INT;
        d_2Array[5] = LONG;
        d_2Array[d_2.a((int)4611, (long)298439324260032404L)] = FLOAT;
        d_2Array[d_2.a((int)7780, (long)3333372131502838772L)] = DOUBLE;
        d_2Array[d_2.a((int)18113, (long)2719855876287925076L)] = BOOLEAN;
        return d_2Array;
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
                        var11_2 = "\\w\fb\u0004Sp\u0003w\u0004Ra\u0016`\u0004Fw\u000ba\u0003Yv\u0016\u0006Tw\u0017g(Q\u0005Cp\rw0";
                        var13_3 = "\\w\fb\u0004Sp\u0003w\u0004Ra\u0016`\u0004Fw\u000ba\u0003Yv\u0016\u0006Tw\u0017g(Q\u0005Cp\rw0".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 12;
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
                            var11_2 = "\u0019<F\"j\u001ep\u0005\u001d?F/{";
                            var13_3 = "\u0019<F\"j\u001ep\u0005\u001d?F/{".length();
                            var10_4 = 7;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 71;
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
                                    v15 = 28;
                                    break;
                                }
                                case 1: {
                                    v15 = 52;
                                    break;
                                }
                                case 2: {
                                    v15 = 78;
                                    break;
                                }
                                case 3: {
                                    v15 = 41;
                                    break;
                                }
                                case 4: {
                                    v15 = 104;
                                    break;
                                }
                                case 5: {
                                    v15 = 24;
                                    break;
                                }
                                default: {
                                    v15 = 121;
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
                var0_7 = 893324975705062803L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = "\u00a6\u00c4(\u00f4\u00a9\u00da\u00bcz+kRI\u00df\n\u007f!\u00e1~h_\u00fb\u00d4\u00ce\u00cc\u009f\u00ae\u00f87\u00ff\u008b\u00ae`l\u00e8\r\u00c4\u00e0d\u00a2\u0001";
                var5_11 = "\u00a6\u00c4(\u00f4\u00a9\u00da\u00bcz+kRI\u00df\n\u007f!\u00e1~h_\u00fb\u00d4\u00ce\u00cc\u009f\u00ae\u00f87\u00ff\u008b\u00ae`l\u00e8\r\u00c4\u00e0d\u00a2\u0001".length();
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
                    var4_10 = "\u00db\u0012n\u000f\u00da\u00e0p\u00fe\u00d8\u00d8{AG\u0084\u00f6\u00cf";
                    var5_11 = "\u00db\u0012n\u000f\u00da\u00e0p\u00fe\u00d8\u00d8{AG\u0084\u00f6\u00cf".length();
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
        d_2.a = var6_8;
        d_2.b = new Integer[7];
        d_2.VOID = new d_2(var8[3], 0);
        d_2.BYTE = new d_2(var8[2], 1);
        d_2.SHORT = new d_2(var8[6], 2);
        d_2.CHAR = new d_2(var8[1], 3);
        d_2.INT = new d_2(var8[4], 4);
        d_2.LONG = new d_2(var8[0], 5);
        d_2.FLOAT = new d_2(var8[8], d_2.a(20262, 5649810506679583412L));
        d_2.DOUBLE = new d_2(var8[5], d_2.a(32457, 3583108064463991640L));
        d_2.BOOLEAN = new d_2(var8[7], d_2.a(3186, 2636664676527161825L));
        d_2.E = d_2.m();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4D93;
        if (b[n11] == null) {
            d_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

