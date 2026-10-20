/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Dy
 */
public final class dy_0
extends Enum {
    public static final dy_0 Character;
    public static final dy_0 Backspace;
    public static final dy_0 AltBackspace;
    public static final dy_0 LeftArrow;
    public static final dy_0 RightArrow;
    public static final dy_0 AltLeftArrow;
    public static final dy_0 AltRightArrow;
    public static final dy_0 Delete;
    public static final dy_0 Home;
    public static final dy_0 End;
    public static final dy_0 Unknown;
    private static final dy_0[] r;
    private static final long[] a;
    private static final Integer[] b;

    public static dy_0[] values() {
        return (dy_0[])r.clone();
    }

    public static dy_0 valueOf(String string) {
        return Enum.valueOf(dy_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dy_0() {
        void var2_-1;
        void var1_-1;
    }

    private static dy_0[] a() {
        dy_0[] dy_0Array = new dy_0[dy_0.a(4980, 5032447088388625154L)];
        dy_0Array[0] = Character;
        dy_0Array[1] = Backspace;
        dy_0Array[2] = AltBackspace;
        dy_0Array[3] = LeftArrow;
        dy_0Array[4] = RightArrow;
        dy_0Array[5] = AltLeftArrow;
        dy_0Array[dy_0.a((int)4768, (long)6866963138646758101L)] = AltRightArrow;
        dy_0Array[dy_0.a((int)23614, (long)911104205695327297L)] = Delete;
        dy_0Array[dy_0.a((int)9848, (long)4002453550734861826L)] = Home;
        dy_0Array[dy_0.a((int)18504, (long)5227934465354598448L)] = End;
        dy_0Array[dy_0.a((int)6799, (long)4325365779957177074L)] = Unknown;
        return dy_0Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[11];
                        var12_1 = 0;
                        var11_2 = "V\u0019\u0007@K{\u0003\u0003F\u0019\b\fB\u001b\u0018bAj\u0019B\u0005\u001eAS\nQ\u001e\u000bFPM\u001fq\u0018\u001b\tA\u0016\u000fEW|\f`\u0012\rB\u001b\u0018|Mk\u0005w6\u001e\\K{\tO\u0012\nZe~\u001fl\u0000\u0006G\u0012\u0000KPi\t@\u001f\r\\Eo\u0019f\u0005";
                        var13_3 = "V\u0019\u0007@K{\u0003\u0003F\u0019\b\fB\u001b\u0018bAj\u0019B\u0005\u001eAS\nQ\u001e\u000bFPM\u001fq\u0018\u001b\tA\u0016\u000fEW|\f`\u0012\rB\u001b\u0018|Mk\u0005w6\u001e\\K{\tO\u0012\nZe~\u001fl\u0000\u0006G\u0012\u0000KPi\t@\u001f\r\\Eo\u0019f\u0005".length();
                        var10_4 = 7;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 61;
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
                            var11_2 = "Y\u0000\u0003w^t\u001dk\u001c\u0016VZ\u0004P\u0003\u001aP";
                            var13_3 = "Y\u0000\u0003w^t\u001dk\u001c\u0016VZ\u0004P\u0003\u001aP".length();
                            var10_4 = 12;
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
                                    v15 = 62;
                                    break;
                                }
                                case 1: {
                                    v15 = 74;
                                    break;
                                }
                                case 2: {
                                    v15 = 81;
                                    break;
                                }
                                case 3: {
                                    v15 = 19;
                                    break;
                                }
                                case 4: {
                                    v15 = 25;
                                    break;
                                }
                                case 5: {
                                    v15 = 49;
                                    break;
                                }
                                default: {
                                    v15 = 80;
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
                var0_7 = 9069667028154136505L;
                var6_8 = new long[11];
                var3_9 = 0;
                var4_10 = "\u00fcw\u0089\rA\u00e6\u00ab\u00ff(L\u0087\u0097\u0084\u00df\u00d6\u00fe\u0095\u0003\u0090\u00c0q\u00c9mA\u00cc\u00ee\u00e6\u00cd\u00c8\u00b3[\u0086+y6\u00d1\u00c2]\u0081O\u009d\u008e\u008dg\u008d\u00beQ\u00b3\u00a6t\u00d8\u001f'\u0095s\u00f5\u00c17\u0016\u0018hH\u00bf\u0080/\u00c1\u0084K\u0088!\u00cc\u00c5";
                var5_11 = "\u00fcw\u0089\rA\u00e6\u00ab\u00ff(L\u0087\u0097\u0084\u00df\u00d6\u00fe\u0095\u0003\u0090\u00c0q\u00c9mA\u00cc\u00ee\u00e6\u00cd\u00c8\u00b3[\u0086+y6\u00d1\u00c2]\u0081O\u009d\u008e\u008dg\u008d\u00beQ\u00b3\u00a6t\u00d8\u001f'\u0095s\u00f5\u00c17\u0016\u0018hH\u00bf\u0080/\u00c1\u0084K\u0088!\u00cc\u00c5".length();
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
                    var4_10 = "#q4\u00c6Zid\u00b0\u00f9)\u0003\u001f`\u008e\u00e5j";
                    var5_11 = "#q4\u00c6Zid\u00b0\u00f9)\u0003\u001f`\u008e\u00e5j".length();
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
        dy_0.a = var6_8;
        dy_0.b = new Integer[11];
        dy_0.Character = new dy_0(var8[8], 0);
        dy_0.Backspace = new dy_0(var8[4], 1);
        dy_0.AltBackspace = new dy_0(var8[9], 2);
        dy_0.LeftArrow = new dy_0(var8[6], 3);
        dy_0.RightArrow = new dy_0(var8[3], 4);
        dy_0.AltLeftArrow = new dy_0(var8[2], 5);
        dy_0.AltRightArrow = new dy_0(var8[5], dy_0.a(8511, 8728300121867739457L));
        dy_0.Delete = new dy_0(var8[7], dy_0.a(15116, 2518410816635730811L));
        dy_0.Home = new dy_0(var8[10], dy_0.a(1085, 3027134129354720324L));
        dy_0.End = new dy_0(var8[1], dy_0.a(30340, 5527688511927269119L));
        dy_0.Unknown = new dy_0(var8[0], dy_0.a(11337, 2152903463682468917L));
        dy_0.r = dy_0.a();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x407F;
        if (b[n11] == null) {
            dy_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

