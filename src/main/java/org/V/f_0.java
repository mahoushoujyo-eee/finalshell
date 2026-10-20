/*
 * Decompiled with CFR 0.152.
 */
package org.v;

/*
 * Renamed from org.v.F
 */
public final class f_0
extends Enum {
    public static final f_0 END_OF_INPUT;
    public static final f_0 IDENTIFIER;
    public static final f_0 KEYWORD;
    public static final f_0 INTEGER_LITERAL;
    public static final f_0 FLOATING_POINT_LITERAL;
    public static final f_0 BOOLEAN_LITERAL;
    public static final f_0 CHARACTER_LITERAL;
    public static final f_0 STRING_LITERAL;
    public static final f_0 NULL_LITERAL;
    public static final f_0 OPERATOR;
    public static final f_0 WHITE_SPACE;
    public static final f_0 C_PLUS_PLUS_STYLE_COMMENT;
    public static final f_0 C_STYLE_COMMENT;
    private static final /* synthetic */ f_0[] h;
    private static final long[] a;
    private static final Integer[] b;

    public static f_0[] values() {
        return (f_0[])h.clone();
    }

    public static f_0 valueOf(String string) {
        return Enum.valueOf(f_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ f_0[] K() {
        f_0[] f_0Array = new f_0[f_0.a(166, 3065301117195655853L)];
        f_0Array[0] = END_OF_INPUT;
        f_0Array[1] = IDENTIFIER;
        f_0Array[2] = KEYWORD;
        f_0Array[3] = INTEGER_LITERAL;
        f_0Array[4] = FLOATING_POINT_LITERAL;
        f_0Array[5] = BOOLEAN_LITERAL;
        f_0Array[f_0.a((int)13106, (long)2141240150003394865L)] = CHARACTER_LITERAL;
        f_0Array[f_0.a((int)29210, (long)7574217857093855252L)] = STRING_LITERAL;
        f_0Array[f_0.a((int)25844, (long)3763504846579662587L)] = NULL_LITERAL;
        f_0Array[f_0.a((int)10371, (long)7276132213868540559L)] = OPERATOR;
        f_0Array[f_0.a((int)3596, (long)2120393314484065285L)] = WHITE_SPACE;
        f_0Array[f_0.a((int)22067, (long)1497341807350139957L)] = C_PLUS_PLUS_STYLE_COMMENT;
        f_0Array[f_0.a((int)30507, (long)6047493143182372131L)] = C_STYLE_COMMENT;
        return f_0Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[13];
                        var12_1 = 0;
                        var11_2 = "*\u0018~\u0003v&:\f$\u0013c\u000bv2!(\u0013w\u0001m\u000f#\u0012h\u0018|50>\u0011n\u0000|&?-\u000b6\u0015n\u0000|+-1\u001cd\u0011\u0019\"\u0002w\u0018l'!1\u0011r\u0007f'*8\u0011b\u000bz;3,\u0018i\u0000\u000f(\u0013s\u0011~1,>\u0011n\u0000|&?-\u0016'\u0011h\u0015m=0&\u0002w\u001bp:*>\u0011n\u0000|&?-\n(\u0019b\u001am=8(\u0018u\u000f\"\u0002t\u0000`8;>\u001eh\u0019t105\u0011\"\u0015f\u0006x7*$\u000fx\u0018p ;3\u001ck\b.\rb\u0006x 13";
                        var13_3 = "*\u0018~\u0003v&:\f$\u0013c\u000bv2!(\u0013w\u0001m\u000f#\u0012h\u0018|50>\u0011n\u0000|&?-\u000b6\u0015n\u0000|+-1\u001cd\u0011\u0019\"\u0002w\u0018l'!1\u0011r\u0007f'*8\u0011b\u000bz;3,\u0018i\u0000\u000f(\u0013s\u0011~1,>\u0011n\u0000|&?-\u0016'\u0011h\u0015m=0&\u0002w\u001bp:*>\u0011n\u0000|&?-\n(\u0019b\u001am=8(\u0018u\u000f\"\u0002t\u0000`8;>\u001eh\u0019t105\u0011\"\u0015f\u0006x7*$\u000fx\u0018p ;3\u001ck\b.\rb\u0006x 13".length();
                        var10_4 = 7;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 78;
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
                            var11_2 = "Oh\u000bx\u0006XWUx\u0015u\u0015\u000eRi\u0015}\u0017SAMt\u0013q\u000bUR";
                            var13_3 = "Oh\u000bx\u0006XWUx\u0015u\u0015\u000eRi\u0015}\u0017SAMt\u0013q\u000bUR".length();
                            var10_4 = 12;
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
                                    v15 = 47;
                                    break;
                                }
                                case 1: {
                                    v15 = 19;
                                    break;
                                }
                                case 2: {
                                    v15 = 105;
                                    break;
                                }
                                case 3: {
                                    v15 = 26;
                                    break;
                                }
                                case 4: {
                                    v15 = 119;
                                    break;
                                }
                                case 5: {
                                    v15 = 58;
                                    break;
                                }
                                default: {
                                    v15 = 48;
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
                var0_7 = 7819731775894784899L;
                var6_8 = new long[15];
                var3_9 = 0;
                var4_10 = "Lw-E\u0091\u00f5\u00e6\u00ac\u00d2\u00a91\u00e9\u00a0\u00e4\u009f\u008c\u00a6ty/\u0083L\u009c\bd\u0003x\u00d8\u0089\u0005\u0011#\u00fa\u0001\u00e1\u00d7?b9\u0005\u00f2\u00cc/\u00ce\u0083\u00ff\u001f\u0004\u00f9JH\u00feBt\u00e3\u0090\u008a\u00f9~\u008fG\u00dcup\u00f0\u0088M\u0013w\u00c1\u0010\u00d0\u00bf\u00a6R\u00d0\u001a\u009b\n\u00ed\u009a\u0007\u0014\u0017\u0080\u00d0\u00f9 \u00a8\u00ae\u00fe\u0098\u00c2\u00ca\u00a2\u00b4=\u000ek\u00b9V\u00e6\u00d3\u00ba";
                var5_11 = "Lw-E\u0091\u00f5\u00e6\u00ac\u00d2\u00a91\u00e9\u00a0\u00e4\u009f\u008c\u00a6ty/\u0083L\u009c\bd\u0003x\u00d8\u0089\u0005\u0011#\u00fa\u0001\u00e1\u00d7?b9\u0005\u00f2\u00cc/\u00ce\u0083\u00ff\u001f\u0004\u00f9JH\u00feBt\u00e3\u0090\u008a\u00f9~\u008fG\u00dcup\u00f0\u0088M\u0013w\u00c1\u0010\u00d0\u00bf\u00a6R\u00d0\u001a\u009b\n\u00ed\u009a\u0007\u0014\u0017\u0080\u00d0\u00f9 \u00a8\u00ae\u00fe\u0098\u00c2\u00ca\u00a2\u00b4=\u000ek\u00b9V\u00e6\u00d3\u00ba".length();
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
                    var4_10 = "Ju\u00b8#c\u00c8\u008d\u00b2\u0011\u00de]\u00a6SyG\u00bd";
                    var5_11 = "Ju\u00b8#c\u00c8\u008d\u00b2\u0011\u00de]\u00a6SyG\u00bd".length();
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
        f_0.a = var6_8;
        f_0.b = new Integer[15];
        f_0.END_OF_INPUT = new f_0(var8[1], 0);
        f_0.IDENTIFIER = new f_0(var8[7], 1);
        f_0.KEYWORD = new f_0(var8[0], 2);
        f_0.INTEGER_LITERAL = new f_0(var8[5], 3);
        f_0.FLOATING_POINT_LITERAL = new f_0(var8[6], 4);
        f_0.BOOLEAN_LITERAL = new f_0(var8[2], 5);
        f_0.CHARACTER_LITERAL = new f_0(var8[9], f_0.a(26791, 6852154458917040805L));
        f_0.STRING_LITERAL = new f_0(var8[12], f_0.a(7219, 3985489239738648118L));
        f_0.NULL_LITERAL = new f_0(var8[11], f_0.a(3465, 2211265244159252355L));
        f_0.OPERATOR = new f_0(var8[10], f_0.a(7014, 6157710819595387239L));
        f_0.WHITE_SPACE = new f_0(var8[3], f_0.a(345, 523049393218788185L));
        f_0.C_PLUS_PLUS_STYLE_COMMENT = new f_0(var8[4], f_0.a(16950, 5726251509863012402L));
        f_0.C_STYLE_COMMENT = new f_0(var8[8], f_0.a(3718, 6294454914054886539L));
        f_0.h = f_0.K();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1A08;
        if (b[n11] == null) {
            f_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

