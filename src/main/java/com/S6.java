/*
 * Decompiled with CFR 0.152.
 */
package com;

final class S6
extends Enum {
    public static final S6 EQ;
    public static final S6 NE;
    public static final S6 GT;
    public static final S6 GE;
    public static final S6 LT;
    public static final S6 LE;
    public static final S6 LIKE;
    public static final S6 NOT_LIKE;
    public static final S6 RLIKE;
    public static final S6 NOT_RLIKE;
    public static final S6 IN;
    public static final S6 NOT_IN;
    public static final S6 BETWEEN;
    public static final S6 NOT_BETWEEN;
    public static final S6 And;
    public static final S6 Or;
    public static final S6 REG_MATCH;
    private static final S6[] s;
    private static final long[] a;
    private static final Integer[] b;

    public static S6[] values() {
        return (S6[])s.clone();
    }

    public static S6 valueOf(String string) {
        return Enum.valueOf(S6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private S6() {
        void var2_-1;
        void var1_-1;
    }

    private static S6[] B() {
        S6[] s6Array = new S6[S6.a(18491, 8393993693542485201L)];
        s6Array[0] = EQ;
        s6Array[1] = NE;
        s6Array[2] = GT;
        s6Array[3] = GE;
        s6Array[4] = LT;
        s6Array[5] = LE;
        s6Array[S6.a((int)11060, (long)8746497312926625750L)] = LIKE;
        s6Array[S6.a((int)23846, (long)6416178932637112774L)] = NOT_LIKE;
        s6Array[S6.a((int)16415, (long)5485471483460879599L)] = RLIKE;
        s6Array[S6.a((int)16093, (long)3413571137119582771L)] = NOT_RLIKE;
        s6Array[S6.a((int)1154, (long)909951168880918634L)] = IN;
        s6Array[S6.a((int)23932, (long)7904394205650491802L)] = NOT_IN;
        s6Array[S6.a((int)7969, (long)6504123496138234822L)] = BETWEEN;
        s6Array[S6.a((int)3043, (long)7344732789202472716L)] = NOT_BETWEEN;
        s6Array[S6.a((int)2796, (long)7729797464415227419L)] = And;
        s6Array[S6.a((int)20105, (long)6612950618871106152L)] = Or;
        s6Array[S6.a((int)24212, (long)7170361047027751520L)] = REG_MATCH;
        return s6Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[17];
                        var12_1 = 0;
                        var11_2 = "\u0002\u0013y~\u0015\u0002\u001e\u001a\u0002\u0015\u000e\u0004\u001c\u0016{p\u000b\u001e\u0010dj\u00128$\u0007\u001au{\u0002\u0019\u0011\t\u0002\u001awj\u001d<$\u0013\u0017\u0002\u0017\u000b\u0002\u0017\u001a\b\u001e\u0010dj\u001c4;\u0015\u0002\u001f-\u0002\u001c\u000b\u0002\u001c\u001a\t\u001e\u0010dj\u000219\u001b\u001a\u0006\u001e\u0010dj\u00193";
                        var13_3 = "\u0002\u0013y~\u0015\u0002\u001e\u001a\u0002\u0015\u000e\u0004\u001c\u0016{p\u000b\u001e\u0010dj\u00128$\u0007\u001au{\u0002\u0019\u0011\t\u0002\u001awj\u001d<$\u0013\u0017\u0002\u0017\u000b\u0002\u0017\u001a\b\u001e\u0010dj\u001c4;\u0015\u0002\u001f-\u0002\u001c\u000b\u0002\u001c\u001a\t\u001e\u0010dj\u000219\u001b\u001a\u0006\u001e\u0010dj\u00193".length();
                        var10_4 = 5;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 114;
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
                            var11_2 = "Ee\u0000\u0007FN06Alj";
                            var13_3 = "Ee\u0000\u0007FN06Alj".length();
                            var10_4 = 3;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 38;
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
                                    v15 = 34;
                                    break;
                                }
                                case 1: {
                                    v15 = 45;
                                    break;
                                }
                                case 2: {
                                    v15 = 66;
                                    break;
                                }
                                case 3: {
                                    v15 = 71;
                                    break;
                                }
                                case 4: {
                                    v15 = 34;
                                    break;
                                }
                                case 5: {
                                    v15 = 15;
                                    break;
                                }
                                default: {
                                    v15 = 2;
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
                var0_7 = 4293588133246143767L;
                var6_8 = new long[23];
                var3_9 = 0;
                var4_10 = "\u008b\u009d\u00a9\u00be=\u008c\u0014\u0086\u0087\u009c}Y\u00a7oV\u00dd\u00f5\u0098\u00d9[D\u00f5\u00f9\u00b8r\u00c5?\u008c#\u0082\u00c7\u0005\u0004\u00f4k\u00f6\u00b0\u001eb\u00c7KIK\u009c\u009c\n\u00fa\u00c9\u0016\u00f4\u0090\u0005\n\u00d6\u0014\u00d6\u00dc\u00e7\u0092:\u00ae\u00fb\u0007p\u0085\u001f5r\u00a6q\u00f7-\u00f3\u0093\u00c5\u00e1ck\u00c2\u0016\u00fe\u0080\u00d5<\u00e4\u00df\u00fd\u0088D$ZP\u00b3\u0014\u008dH1\u008b\u00a3\u0013\u00db\u0080\u0001\u00d7ei\u000fn\u00edmN.\u001e\u0000\u007f,\u00fd\u00e1Mw\u00b6\u00f2U\u00dc\u00a0\u00d3\u0006\u001f\u00d1\u00e8|\u00b7\u008fh\u0086\u00d5\u009a\u00acf\u00c0Q\u00d7C\u0002\u0019\u0000\u009c\u00fcj\u009b\u0017g\u00f7\u00a6\u0094H\u00d5\u00b8\u00d7\u00d1X\u008e%k\u00c3)<\u00bf";
                var5_11 = "\u008b\u009d\u00a9\u00be=\u008c\u0014\u0086\u0087\u009c}Y\u00a7oV\u00dd\u00f5\u0098\u00d9[D\u00f5\u00f9\u00b8r\u00c5?\u008c#\u0082\u00c7\u0005\u0004\u00f4k\u00f6\u00b0\u001eb\u00c7KIK\u009c\u009c\n\u00fa\u00c9\u0016\u00f4\u0090\u0005\n\u00d6\u0014\u00d6\u00dc\u00e7\u0092:\u00ae\u00fb\u0007p\u0085\u001f5r\u00a6q\u00f7-\u00f3\u0093\u00c5\u00e1ck\u00c2\u0016\u00fe\u0080\u00d5<\u00e4\u00df\u00fd\u0088D$ZP\u00b3\u0014\u008dH1\u008b\u00a3\u0013\u00db\u0080\u0001\u00d7ei\u000fn\u00edmN.\u001e\u0000\u007f,\u00fd\u00e1Mw\u00b6\u00f2U\u00dc\u00a0\u00d3\u0006\u001f\u00d1\u00e8|\u00b7\u008fh\u0086\u00d5\u009a\u00acf\u00c0Q\u00d7C\u0002\u0019\u0000\u009c\u00fcj\u009b\u0017g\u00f7\u00a6\u0094H\u00d5\u00b8\u00d7\u00d1X\u008e%k\u00c3)<\u00bf".length();
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
                    var4_10 = "R\u00ab\u0012\u00dcw\u008a:\u00e1\u00a6X\u00825\u0098\u00c0\u0089\u00f0";
                    var5_11 = "R\u00ab\u0012\u00dcw\u008a:\u00e1\u00a6X\u00825\u0098\u00c0\u0089\u00f0".length();
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
        S6.a = var6_8;
        S6.b = new Integer[23];
        S6.EQ = new S6(var8[2], 0);
        S6.NE = new S6(var8[1], 1);
        S6.GT = new S6(var8[7], 2);
        S6.GE = new S6(var8[8], 3);
        S6.LT = new S6(var8[11], 4);
        S6.LE = new S6(var8[12], 5);
        S6.LIKE = new S6(var8[3], S6.a(29443, 3430597919960610800L));
        S6.NOT_LIKE = new S6(var8[9], S6.a(20454, 6479914054024104719L));
        S6.RLIKE = new S6(var8[0], S6.a(30034, 2111557145942110624L));
        S6.NOT_RLIKE = new S6(var8[13], S6.a(3838, 7989625915782646299L));
        S6.IN = new S6(var8[5], S6.a(13433, 6545798934955552917L));
        S6.NOT_IN = new S6(var8[14], S6.a(7736, 5953918696798870221L));
        S6.BETWEEN = new S6(var8[16], S6.a(20280, 7665727870510074830L));
        S6.NOT_BETWEEN = new S6(var8[4], S6.a(13104, 4929660869437224915L));
        S6.And = new S6(var8[15], S6.a(17596, 7060143958255239249L));
        S6.Or = new S6(var8[10], S6.a(12356, 2811957982010406048L));
        S6.REG_MATCH = new S6(var8[6], S6.a(1986, 336928267054695209L));
        S6.s = S6.B();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x44E6;
        if (b[n11] == null) {
            S6.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

