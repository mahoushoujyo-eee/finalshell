/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nv_2;

public final class EP
extends Enum {
    public static final EP QuoteFieldNames;
    public static final EP UseSingleQuotes;
    public static final EP WriteMapNullValue;
    public static final EP WriteEnumUsingToString;
    public static final EP WriteEnumUsingName;
    public static final EP UseISO8601DateFormat;
    public static final EP WriteNullListAsEmpty;
    public static final EP WriteNullStringAsEmpty;
    public static final EP WriteNullNumberAsZero;
    public static final EP WriteNullBooleanAsFalse;
    public static final EP SkipTransientField;
    public static final EP SortField;
    @Deprecated
    public static final EP WriteTabAsSpecial;
    public static final EP PrettyFormat;
    public static final EP WriteClassName;
    public static final EP DisableCircularReferenceDetect;
    public static final EP WriteSlashAsSpecial;
    public static final EP BrowserCompatible;
    public static final EP WriteDateUseDateFormat;
    public static final EP NotWriteRootClassName;
    public static final EP DisableCheckSpecialChar;
    public static final EP BeanToArray;
    public static final EP WriteNonStringKeyAsString;
    public static final EP NotWriteDefaultValue;
    public static final EP BrowserSecure;
    public static final EP IgnoreNonFieldGetter;
    public static final EP WriteNonStringValueAsString;
    public static final EP IgnoreErrorGetter;
    public static final EP WriteBigDecimalAsPlain;
    public static final EP MapSortField;
    public final int mask = 1 << this.ordinal();
    public static final EP[] EMPTY;
    public static final int WRITE_MAP_NULL_FEATURES;
    private static final /* synthetic */ EP[] c;
    private static final long[] a;
    private static final Integer[] b;

    public static EP[] values() {
        return (EP[])c.clone();
    }

    public static EP valueOf(String string) {
        return Enum.valueOf(EP.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EP() {
        void var2_-1;
        void var1_-1;
    }

    public final int a() {
        return this.mask;
    }

    public static boolean e(int n10, EP eP) {
        String string = nv_2.o();
        boolean bl = n10 & eP.mask;
        if (string != null) {
            bl = bl;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n10, int n11, EP eP) {
        int n12 = eP.mask;
        String string = nv_2.o();
        int n13 = n10 & n12;
        if (string == null) return n13 != 0;
        if (n13 != 0) return 1 != 0;
        n13 = n11 & n12;
        if (string == null) return n13 != 0;
        if (n13 == 0) return 0 != 0;
        return 1 != 0;
    }

    public static int g(int n10, EP eP, boolean n11) {
        block4: {
            int n12;
            block2: {
                block3: {
                    String string = nv_2.o();
                    n12 = n11;
                    if (string == null) break block2;
                    if (n12 == 0) break block3;
                    n10 |= eP.mask;
                    if (string != null) break block4;
                }
                n12 = n10 & ~eP.mask;
            }
            n10 = n12;
        }
        return n10;
    }

    public static int Q(EP[] ePArray) {
        if (ePArray == null) {
            return 0;
        }
        int n10 = 0;
        for (EP eP : ePArray) {
            n10 |= eP.mask;
        }
        return n10;
    }

    private static /* synthetic */ EP[] c() {
        EP[] ePArray = new EP[EP.a(22273, 269201810384550253L)];
        ePArray[0] = QuoteFieldNames;
        ePArray[1] = UseSingleQuotes;
        ePArray[2] = WriteMapNullValue;
        ePArray[3] = WriteEnumUsingToString;
        ePArray[4] = WriteEnumUsingName;
        ePArray[5] = UseISO8601DateFormat;
        ePArray[EP.a((int)17003, (long)8481004394461228049L)] = WriteNullListAsEmpty;
        ePArray[EP.a((int)27928, (long)4942798033902322508L)] = WriteNullStringAsEmpty;
        ePArray[EP.a((int)17952, (long)6219887719046146172L)] = WriteNullNumberAsZero;
        ePArray[EP.a((int)31698, (long)5720177388958733727L)] = WriteNullBooleanAsFalse;
        ePArray[EP.a((int)16892, (long)6261245322579472265L)] = SkipTransientField;
        ePArray[EP.a((int)22832, (long)2997061409551644488L)] = SortField;
        ePArray[EP.a((int)3237, (long)4390179575446774492L)] = WriteTabAsSpecial;
        ePArray[EP.a((int)8178, (long)8935794711146901900L)] = PrettyFormat;
        ePArray[EP.a((int)17543, (long)6482734279457696506L)] = WriteClassName;
        ePArray[EP.a((int)9904, (long)8152382398189471983L)] = DisableCircularReferenceDetect;
        ePArray[EP.a((int)126, (long)311878538968116775L)] = WriteSlashAsSpecial;
        ePArray[EP.a((int)24678, (long)8429957684854574609L)] = BrowserCompatible;
        ePArray[EP.a((int)26792, (long)6722785152276383464L)] = WriteDateUseDateFormat;
        ePArray[EP.a((int)11734, (long)2166617093858263974L)] = NotWriteRootClassName;
        ePArray[EP.a((int)31208, (long)8674729457324316590L)] = DisableCheckSpecialChar;
        ePArray[EP.a((int)3807, (long)2668387645395443861L)] = BeanToArray;
        ePArray[EP.a((int)6059, (long)6274104781382007258L)] = WriteNonStringKeyAsString;
        ePArray[EP.a((int)4429, (long)7663083259431501630L)] = NotWriteDefaultValue;
        ePArray[EP.a((int)19083, (long)4765080696570602696L)] = BrowserSecure;
        ePArray[EP.a((int)26647, (long)114564359311410795L)] = IgnoreNonFieldGetter;
        ePArray[EP.a((int)14170, (long)4695313731606354203L)] = WriteNonStringValueAsString;
        ePArray[EP.a((int)9322, (long)6024715590226479672L)] = IgnoreErrorGetter;
        ePArray[EP.a((int)9205, (long)6790558606689996220L)] = WriteBigDecimalAsPlain;
        ePArray[EP.a((int)5100, (long)7026961996088032674L)] = MapSortField;
        return ePArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[30];
                        var12_1 = 0;
                        var11_2 = "2F|3N\u0007U\u0011Q@4N\u0007U\u0011QS(Y.U\u0011\u000e2F|3N\u0000X\u0004Gf\tJ.Q\u00140Gp\u000ex\f\fS\u0004$\u0003J7Q#[g*J7\f5Fp3_:r\nFx&_\u000f0Gp\u0014B-S\tQD2D7Q\u0016\u00172F|3N\rA\tXW(D/Q\u0004ZT4m\"X\u0016Q\u00126_|7\u007f1U\u000bG|\"E7r\fQy#\u0011'Fz0X&F&[x7J7]\u0007Xp\u00162F|3N\u0006Z\u0010Y@4B-S1[F3Y*Z\u0002\u0014+[a\u0010Y*@\u0000pp!J6X\u0011bt+^&\u001b2F|3N\r[\u000bga5B-S3Uy2N\u0002G6@g.E$\u000b'Qt)\u007f,u\u0017Ft>\u0014,S{(Y&z\nZS.N/P\"Qa3N1\f(Ue\u0014D1@#]p+O\u00162F|3N\rA\tXF3Y*Z\u0002uf\u0002F3@\u001c\u00132F|3N\u0010X\u0004G}\u0006X\u0010D\u0000W|&G\u00162F|3N\u0001]\u0002pp$B.U\tuf\u0017G\"]\u000b\u000f4Az3N\u0005]\u0000Xq\tJ.Q\u0016\u00122F|3N\u0006Z\u0010Y@4B-S+Ux\"\u0011,S{(Y&q\u0017Fz5l&@\u0011Qg\t6[g3m*Q\tP\r'Fz0X&F6Qv2Y&\u0017!]f&I/Q&\\p$@\u0010D\u0000W|&G\u0000\\\u0004F\u00112F|3N\u0017U\u0007uf\u0014[&W\fUy\u00152F|3N\rA\tX[2F!Q\u0017uf\u001dN1[\u00142F|3N\rA\tXY.X7u\u0016qx7_:\u00192F|3N\r[\u000bga5B-S.Ql\u0006X\u0010@\u0017]{ \u001e!]f&I/Q&]g$^/U\u0017fp!N1Q\u000bWp\u0003N7Q\u0006@";
                        var13_3 = "2F|3N\u0007U\u0011Q@4N\u0007U\u0011QS(Y.U\u0011\u000e2F|3N\u0000X\u0004Gf\tJ.Q\u00140Gp\u000ex\f\fS\u0004$\u0003J7Q#[g*J7\f5Fp3_:r\nFx&_\u000f0Gp\u0014B-S\tQD2D7Q\u0016\u00172F|3N\rA\tXW(D/Q\u0004ZT4m\"X\u0016Q\u00126_|7\u007f1U\u000bG|\"E7r\fQy#\u0011'Fz0X&F&[x7J7]\u0007Xp\u00162F|3N\u0006Z\u0010Y@4B-S1[F3Y*Z\u0002\u0014+[a\u0010Y*@\u0000pp!J6X\u0011bt+^&\u001b2F|3N\r[\u000bga5B-S3Uy2N\u0002G6@g.E$\u000b'Qt)\u007f,u\u0017Ft>\u0014,S{(Y&z\nZS.N/P\"Qa3N1\f(Ue\u0014D1@#]p+O\u00162F|3N\rA\tXF3Y*Z\u0002uf\u0002F3@\u001c\u00132F|3N\u0010X\u0004G}\u0006X\u0010D\u0000W|&G\u00162F|3N\u0001]\u0002pp$B.U\tuf\u0017G\"]\u000b\u000f4Az3N\u0005]\u0000Xq\tJ.Q\u0016\u00122F|3N\u0006Z\u0010Y@4B-S+Ux\"\u0011,S{(Y&q\u0017Fz5l&@\u0011Qg\t6[g3m*Q\tP\r'Fz0X&F6Qv2Y&\u0017!]f&I/Q&\\p$@\u0010D\u0000W|&G\u0000\\\u0004F\u00112F|3N\u0017U\u0007uf\u0014[&W\fUy\u00152F|3N\rA\tX[2F!Q\u0017uf\u001dN1[\u00142F|3N\rA\tXY.X7u\u0016qx7_:\u00192F|3N\r[\u000bga5B-S.Ql\u0006X\u0010@\u0017]{ \u001e!]f&I/Q&]g$^/U\u0017fp!N1Q\u000bWp\u0003N7Q\u0006@".length();
                        var10_4 = 22;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 62;
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
                            var11_2 = "K?\u0005J7w,l\u0003\u0019R>l,p8\t\u0015R\"\u0018i S9y\u001f\u0003Q&y!}>\u001fp3W(";
                            var13_3 = "K?\u0005J7w,l\u0003\u0019R>l,p8\t\u0015R\"\u0018i S9y\u001f\u0003Q&y!}>\u001fp3W(".length();
                            var10_4 = 17;
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
                                    v15 = 91;
                                    break;
                                }
                                case 1: {
                                    v15 = 10;
                                    break;
                                }
                                case 2: {
                                    v15 = 43;
                                    break;
                                }
                                case 3: {
                                    v15 = 121;
                                    break;
                                }
                                case 4: {
                                    v15 = 21;
                                    break;
                                }
                                case 5: {
                                    v15 = 125;
                                    break;
                                }
                                default: {
                                    v15 = 10;
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
                var0_7 = 7855599374859201195L;
                var6_8 = new long[49];
                var3_9 = 0;
                var4_10 = "\u00eb\u00ed\u008d\u00df\u00a8\u00cc\u0002\u00df\u00a7\u00aaT\u00f4\u007f\u0011\u0017{\u00c9\u00d2Mni\u00ad\u00b6\u001fE\u00ec\b\u009b\u00a9xbKE6K\u00bd\u00a5|d\u008f\u00c9\u00b6\u00d5.D\u0000D\u009c\u008b\u00ca\u00ea\"\u009a\u009dX\u00001\u00e0\u009a\u00d2!\u0002\u00865\u00f5\u00e3\u009ce\u0013|)\u00e0K\u0093\u009e\u00a3\u00fa\u00b1k\u0083\u00f0F\u00c1\u0014PR\u00eb\u00d5\u00deV\u0094\u00cb\u00c8\u00e6\u001a\u00e5\u00fa\u00ae\u0089>\u00bcD\u00a2Nu3<F\u00c9\u00a0\"$H\u0003\u00b38\bv`\u0088\"\u0017\u00aaL\u00a9\u00f8#\u00fed\r\u0094\u0090\u00d7C\u00ad\u00d1\u00cc\u001dX\u00d5\u00f5X?=\u00e7c\u00bbW\u00c6\u00bcW\u0014j\u00bemc\u0092$\u00b5\u009d\u00f0\u00d2k\u00c6\u0012\u000b\u00c4\u00e7)G\u00e8\u00f5\u0096y\u00e7\u000b\u00cc\u00bay\u0091B\u0095J+\u00ab\u00c6S\u0007\u00e6\u00c2\u00bb>\u0012\u0082B\u00fcN\u0012\u00b7\u00c0\u00d3\u00e1\u00e3p\u00c5x\u00c5\u0088X\u00ads\u00e1\u00ae-\u00bd\u0011\u00d6\u00a8\u00dd'[\u0002\u00c6\u00f6\u00fb\u00ee}`\u009a\u00f7,QW\u00cd\u00ee\u0007\u00f5*s\u00aat\u009e\u008e\u00a5\u00ad\u00de\u00e7\u00c9n\u00b3\u00c71\u0019j\u000e{\u00b5\u001c\u0091\u00b48\u00ee,\u00d9\u00b6\"\u00de\u008cP\u0011\u0080_\u0017\u00a5s\u0081\u009b\u00fa\u00db*\u0081x2\u00d6\u00da\u00ad\u00fb\u00dai\u00f69\u00ef\u00b2\u0018\u001d\u00e8\u0007\u0089la\u00f2\u00edH{]\u00fc\b%B \u0006\u00bc\u00e9|\u0086\u00d5\u0081I\u00dd\u000b\u00b5lK\u0006\u00c5\u00c7rt\u00d3\\\u00d4\u0086;\u00af\u0085(\u00a8m~\u00d7_\u0017\u00eb}\u00be\u00f9\u00bf\n\u0001\u0017\u00a4\u00ab\u00a7\u00c8\u00bc\u0002?\u00f5i\u001e\u00fb\u00d0d[%\u0099\u00d3g\u00e0\u009e\u008d\u0006\u00c7\u00b8\n1";
                var5_11 = "\u00eb\u00ed\u008d\u00df\u00a8\u00cc\u0002\u00df\u00a7\u00aaT\u00f4\u007f\u0011\u0017{\u00c9\u00d2Mni\u00ad\u00b6\u001fE\u00ec\b\u009b\u00a9xbKE6K\u00bd\u00a5|d\u008f\u00c9\u00b6\u00d5.D\u0000D\u009c\u008b\u00ca\u00ea\"\u009a\u009dX\u00001\u00e0\u009a\u00d2!\u0002\u00865\u00f5\u00e3\u009ce\u0013|)\u00e0K\u0093\u009e\u00a3\u00fa\u00b1k\u0083\u00f0F\u00c1\u0014PR\u00eb\u00d5\u00deV\u0094\u00cb\u00c8\u00e6\u001a\u00e5\u00fa\u00ae\u0089>\u00bcD\u00a2Nu3<F\u00c9\u00a0\"$H\u0003\u00b38\bv`\u0088\"\u0017\u00aaL\u00a9\u00f8#\u00fed\r\u0094\u0090\u00d7C\u00ad\u00d1\u00cc\u001dX\u00d5\u00f5X?=\u00e7c\u00bbW\u00c6\u00bcW\u0014j\u00bemc\u0092$\u00b5\u009d\u00f0\u00d2k\u00c6\u0012\u000b\u00c4\u00e7)G\u00e8\u00f5\u0096y\u00e7\u000b\u00cc\u00bay\u0091B\u0095J+\u00ab\u00c6S\u0007\u00e6\u00c2\u00bb>\u0012\u0082B\u00fcN\u0012\u00b7\u00c0\u00d3\u00e1\u00e3p\u00c5x\u00c5\u0088X\u00ads\u00e1\u00ae-\u00bd\u0011\u00d6\u00a8\u00dd'[\u0002\u00c6\u00f6\u00fb\u00ee}`\u009a\u00f7,QW\u00cd\u00ee\u0007\u00f5*s\u00aat\u009e\u008e\u00a5\u00ad\u00de\u00e7\u00c9n\u00b3\u00c71\u0019j\u000e{\u00b5\u001c\u0091\u00b48\u00ee,\u00d9\u00b6\"\u00de\u008cP\u0011\u0080_\u0017\u00a5s\u0081\u009b\u00fa\u00db*\u0081x2\u00d6\u00da\u00ad\u00fb\u00dai\u00f69\u00ef\u00b2\u0018\u001d\u00e8\u0007\u0089la\u00f2\u00edH{]\u00fc\b%B \u0006\u00bc\u00e9|\u0086\u00d5\u0081I\u00dd\u000b\u00b5lK\u0006\u00c5\u00c7rt\u00d3\\\u00d4\u0086;\u00af\u0085(\u00a8m~\u00d7_\u0017\u00eb}\u00be\u00f9\u00bf\n\u0001\u0017\u00a4\u00ab\u00a7\u00c8\u00bc\u0002?\u00f5i\u001e\u00fb\u00d0d[%\u0099\u00d3g\u00e0\u009e\u008d\u0006\u00c7\u00b8\n1".length();
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
                    var4_10 = "\u0099\u009f\u00f0\u00ef\u0016\u00ebU\u0082\u00c4\u00a7\u0095,t\u009f\u0093\u00d8";
                    var5_11 = "\u0099\u009f\u00f0\u00ef\u0016\u00ebU\u0082\u00c4\u00a7\u0095,t\u009f\u0093\u00d8".length();
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
        EP.a = var6_8;
        EP.b = new Integer[49];
        EP.QuoteFieldNames = new EP(var8[17], 0);
        EP.UseSingleQuotes = new EP(var8[4], 1);
        EP.WriteMapNullValue = new EP(var8[28], 2);
        EP.WriteEnumUsingToString = new EP(var8[8], 3);
        EP.WriteEnumUsingName = new EP(var8[18], 4);
        EP.UseISO8601DateFormat = new EP(var8[2], 5);
        EP.WriteNullListAsEmpty = new EP(var8[25], EP.a(26328, 9090847318221211785L));
        EP.WriteNullStringAsEmpty = new EP(var8[14], EP.a(12079, 5586288705432289657L));
        EP.WriteNullNumberAsZero = new EP(var8[24], EP.a(530, 6770578692583304277L));
        EP.WriteNullBooleanAsFalse = new EP(var8[5], EP.a(20193, 5939134367295824019L));
        EP.SkipTransientField = new EP(var8[6], EP.a(29043, 3648390486108397372L));
        EP.SortField = new EP(var8[20], EP.a(32725, 230487192370270622L));
        EP.WriteTabAsSpecial = new EP(var8[23], EP.a(12145, 498406435922772260L));
        EP.PrettyFormat = new EP(var8[3], EP.a(7420, 3385892268217873062L));
        EP.WriteClassName = new EP(var8[1], EP.a(26299, 8980568666504939755L));
        EP.DisableCircularReferenceDetect = new EP(var8[27], EP.a(24086, 7172550057192157249L));
        EP.WriteSlashAsSpecial = new EP(var8[15], EP.a(21405, 3260456952099143104L));
        EP.BrowserCompatible = new EP(var8[7], EP.a(6602, 2651218033636980657L));
        EP.WriteDateUseDateFormat = new EP(var8[0], EP.a(9010, 5466356657764011376L));
        EP.NotWriteRootClassName = new EP(var8[29], EP.a(12211, 3539495291320566213L));
        EP.DisableCheckSpecialChar = new EP(var8[22], EP.a(29499, 4269634809859530111L));
        EP.BeanToArray = new EP(var8[11], EP.a(16155, 1406770256964129124L));
        EP.WriteNonStringKeyAsString = new EP(var8[26], EP.a(29436, 8388585162953120930L));
        EP.NotWriteDefaultValue = new EP(var8[9], EP.a(26913, 6564162961684875117L));
        EP.BrowserSecure = new EP(var8[21], EP.a(28, 4226344961463332436L));
        EP.IgnoreNonFieldGetter = new EP(var8[12], EP.a(17116, 7696811976684596359L));
        EP.WriteNonStringValueAsString = new EP(var8[10], EP.a(26396, 6617971173826971983L));
        EP.IgnoreErrorGetter = new EP(var8[19], EP.a(381, 3933793400645201720L));
        EP.WriteBigDecimalAsPlain = new EP(var8[16], EP.a(14007, 5489294602366359747L));
        EP.MapSortField = new EP(var8[13], EP.a(8289, 9186895696077196857L));
        EP.c = EP.c();
        EP.EMPTY = new EP[0];
        EP.WRITE_MAP_NULL_FEATURES = EP.WriteMapNullValue.a() | EP.WriteNullBooleanAsFalse.a() | EP.WriteNullListAsEmpty.a() | EP.WriteNullNumberAsZero.a() | EP.WriteNullStringAsEmpty.a();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2E5C;
        if (b[n11] == null) {
            EP.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

