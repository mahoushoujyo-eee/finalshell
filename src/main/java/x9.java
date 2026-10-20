/*
 * Decompiled with CFR 0.152.
 */
public final class x9
extends Enum {
    public static final x9 ZPAD;
    public static final x9 ZDLE;
    public static final x9 ZDLEE;
    public static final x9 ZBIN;
    public static final x9 ZHEX;
    public static final x9 ZBIN32;
    public static final x9 ZCRCE;
    public static final x9 ZCRCG;
    public static final x9 ZCRCQ;
    public static final x9 ZCRCW;
    public static final x9 ZRUB0;
    public static final x9 ZRUB1;
    public static final x9 ZRQINIT;
    public static final x9 ZRINIT;
    public static final x9 ZSINIT;
    public static final x9 ZACK;
    public static final x9 ZFILE;
    public static final x9 ZSKIP;
    public static final x9 ZNAK;
    public static final x9 ZABORT;
    public static final x9 ZFIN;
    public static final x9 ZRPOS;
    public static final x9 ZDATA;
    public static final x9 ZEOF;
    public static final x9 ZFERR;
    public static final x9 ZCRC;
    public static final x9 ZCHALLENGE;
    public static final x9 ZCOMPL;
    public static final x9 ZCAN;
    public static final x9 ZFREECNT;
    public static final x9 ZCOMMAND;
    public static final x9 ZSTDERR;
    private byte e;
    private static final /* synthetic */ x9[] E;
    private static final long[] a;
    private static final Integer[] b;

    public static x9[] values() {
        return (x9[])E.clone();
    }

    public static x9 valueOf(String string) {
        return Enum.valueOf(x9.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private x9() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.e = (byte)var3_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private x9() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.e = (byte)var3_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private x9() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.e = var3_1;
    }

    public byte r() {
        return this.e;
    }

    public static x9 X(byte by) {
        x9[] x9Array = x9.values();
        int n10 = x9Array.length;
        int n11 = 0;
        String[] stringArray = ub_0.A();
        while (n11 < n10) {
            x9 x92 = x9Array[n11];
            if (stringArray == null) {
                if (x92.r() == by) {
                    return x92;
                }
                ++n11;
            }
            if (stringArray == null) continue;
        }
        return null;
    }

    private static /* synthetic */ x9[] z() {
        x9[] x9Array = new x9[x9.a(20653, 7270078940446551271L)];
        x9Array[0] = ZPAD;
        x9Array[1] = ZDLE;
        x9Array[2] = ZDLEE;
        x9Array[3] = ZBIN;
        x9Array[4] = ZHEX;
        x9Array[5] = ZBIN32;
        x9Array[x9.a((int)24608, (long)7938023860708629588L)] = ZCRCE;
        x9Array[x9.a((int)5936, (long)7985113665368697673L)] = ZCRCG;
        x9Array[x9.a((int)16991, (long)5572803982119435813L)] = ZCRCQ;
        x9Array[x9.a((int)31342, (long)7119471486046651916L)] = ZCRCW;
        x9Array[x9.a((int)9406, (long)8589273579928492262L)] = ZRUB0;
        x9Array[x9.a((int)20580, (long)7134716933208566794L)] = ZRUB1;
        x9Array[x9.a((int)1087, (long)6221413109578709071L)] = ZRQINIT;
        x9Array[x9.a((int)22050, (long)2967158244603882085L)] = ZRINIT;
        x9Array[x9.a((int)24288, (long)698188619015348911L)] = ZSINIT;
        x9Array[x9.a((int)27889, (long)4292462888071286936L)] = ZACK;
        x9Array[x9.a((int)28863, (long)8031098012600126702L)] = ZFILE;
        x9Array[x9.a((int)2995, (long)3083239112251553761L)] = ZSKIP;
        x9Array[x9.a((int)24272, (long)3392439728807928511L)] = ZNAK;
        x9Array[x9.a((int)21523, (long)7779138773245913157L)] = ZABORT;
        x9Array[x9.a((int)28583, (long)6560785089666175953L)] = ZFIN;
        x9Array[x9.a((int)23089, (long)7435874808650294890L)] = ZRPOS;
        x9Array[x9.a((int)26872, (long)5482314384369112210L)] = ZDATA;
        x9Array[x9.a((int)25351, (long)6023929681201520449L)] = ZEOF;
        x9Array[x9.a((int)31433, (long)5045865583323629203L)] = ZFERR;
        x9Array[x9.a((int)19448, (long)7879790778017183656L)] = ZCRC;
        x9Array[x9.a((int)3340, (long)4090474447073358159L)] = ZCHALLENGE;
        x9Array[x9.a((int)26949, (long)4017791607874934028L)] = ZCOMPL;
        x9Array[x9.a((int)22381, (long)2297255248839437104L)] = ZCAN;
        x9Array[x9.a((int)20540, (long)462201817251769410L)] = ZFREECNT;
        x9Array[x9.a((int)28095, (long)1418921394248765890L)] = ZCOMMAND;
        x9Array[x9.a((int)30653, (long)6788201869105515512L)] = ZSTDERR;
        return x9Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[32];
                        var12_1 = 0;
                        var11_2 = "Ya;#\u0007Yc+.\u0002FB\u0005Yr($\u000b\u0004Yr($\u0004Yr;)\u0005Yb1.\u001c\u0005Yu6\"\t\u0004Yt5!\u0004Yw3)\u0006Yr5*\u001cC\u0006Yb3)\u0005[\u0005Yr($\u001b\u0005Yu;3\r\u0005Yw3+\t\u0005Yr($\t\u0004Yy??\u0005Yc/%}\bYr5*\u0001NXG\u0007Yb.#\t]D\u0004Yp9,\u0006Yc3)\u0005[\bYw(\"\tLXW\u0004Yu6\"\u0006Ys3)\u007f=\u0005Yr($\u001d\nYr2&\u0000CSMv?\u0005Yc/%|\u0005Yc*(\u001f\u0006Yp8(\u001e[\u0004Ys3)";
                        var13_3 = "Ya;#\u0007Yc+.\u0002FB\u0005Yr($\u000b\u0004Yr($\u0004Yr;)\u0005Yb1.\u001c\u0005Yu6\"\t\u0004Yt5!\u0004Yw3)\u0006Yr5*\u001cC\u0006Yb3)\u0005[\u0005Yr($\u001b\u0005Yu;3\r\u0005Yw3+\t\u0005Yr($\t\u0004Yy??\u0005Yc/%}\bYr5*\u0001NXG\u0007Yb.#\t]D\u0004Yp9,\u0006Yc3)\u0005[\bYw(\"\tLXW\u0004Yu6\"\u0006Ys3)\u007f=\u0005Yr($\u001d\nYr2&\u0000CSMv?\u0005Yc/%|\u0005Yc*(\u001f\u0006Yp8(\u001e[\u0004Ys3)".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 65;
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
                            var11_2 = "\f*ny\u0005\f\"j`K";
                            var13_3 = "\f*ny\u0005\f\"j`K".length();
                            var10_4 = 4;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 20;
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
                                    v15 = 66;
                                    break;
                                }
                                case 1: {
                                    v15 = 112;
                                    break;
                                }
                                case 2: {
                                    v15 = 59;
                                    break;
                                }
                                case 3: {
                                    v15 = 38;
                                    break;
                                }
                                case 4: {
                                    v15 = 13;
                                    break;
                                }
                                case 5: {
                                    v15 = 78;
                                    break;
                                }
                                default: {
                                    v15 = 87;
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
                var0_7 = 4695532889504775890L;
                var6_8 = new long[64];
                var3_9 = 0;
                var4_10 = "\u009d\u00da\u00c1\u009e\u000f\u00149\u00f1E\u001d+\u0005\u00bb#-\u0017\u00a2\u00f0.>\u00a5\u00c2.\f\u00cf\u00c8)\u00ae\"\u0004\u00a2\u0080|\u0010i\u001f\u00c9j\u00cf\u00c0\u00fc\u00f3\u00b5\u00e6\u0083/.\u0006t?,\u00fd\u00cb\u0001\u00fc\u000f\u00c72:\u009aK}\u00c6\u0091\u0082\u0086N\u00e2a\u00b0\u00ad\u0018\u00d9\u00fa\u0082Pm\u00cc\u0092\u008d\u00b64\u00bc\u00c4r~/\u000e\u00d6\u00b1HY?D\u0086\u00fa~$\u00f0NQ\u00a0;G\u00c2\u0011\u00aa\u00f0\u00eb\u0004\u0000\u00ff\u00b4/\u00d6\u00c6\u00adsU\u009cM\u00d6N\u0003\u00ff\u00e9\u00b0\u00adg\u009b\u00d6\u00a6\u00ce\u0088u\u00fd[\u001cL\u0093\u00ef\u00f7\u00de\u00ea\u00d9\u00ef\u001f5\u00aaE\u00ee_p\u0010t\u00f1\u00cb\u00ee\u00ab\u00ac\u00e5;JI\u00bb\u00f3g\u0003\u00aa\u0099\u00d2VdM8\u00d7T\u00fbYy\u00cc\u00c6\u009a\u00c9\u00ba\u0089\u00aa\f\u001e\u00beN\u0006\u0089\u00dfdNk\u009c\u009c\u007f\u0015\u00a4.y.\u00c4\u0012\u00d3_}\u0014J^~)\u00f9\u0003\t\u00bb\u00b7`\u00ea\u00c2\"\u0005\u00b3N\u0095\u0015\u0013\u0097qN\u00bb+`%M\u00aaV\u0095G\u00ae\u0096\u00e1\u0011.EQ\u00daog\u009c]\u0080|D\u0081\u00f7\u00be\u00f9\u00fd#\u008ft}\u00df\u00c6S\u00d2\u0016\u0084\u0080\u00d1\u0011\u00a7kg24]\u00d4\u00bf\u00b0k\u0085CM\u0084\u009d/'\u00dcU3\u00c6\u00e3W\u00ee/\u00fd@I\"A\u00bb\u00f8bsx2,\u00e0u\u00d7\u0098B\u0004\u0089c;\u0005+l\u00a0_.]\u00e5\u00fd\u008d\u0011T5\"N\u0083c\u00e51\u00cfa\u0095\u00fe\u00bbp\u00ddIQ\\&H\u00d4\u00e5\u001e;%\u00f8\u0018\u00ad\u0097*E\u0000xG\u00b8Y9\u00d2\u008b\u00ce\"p;;\u009f\u007fN\u0005\u00d4Qf>\u0088\u00f9\b\u0007\u001f\u00e4\u0014\u00ba)#i(\t\u00ea\u00a1\u0084\u00c8M(\u00ba\u0099\u00b555\u0092\u0097\u0005\u00c9sZ\u0089ps\u0015\u00dbC\u00aa\u0086\u00cf\u0087\u00b1 \u00a4\u00a0D\u0084\t\u00a0\u00d7\u00ccxe\u00f4\u00f0\u00da^\u00e7\u00b1\"\u0016\u0003*e\u00de\u00c7\u000e\u00e7\u001ax\u00b9\u001csS\u00b9\u0006\u00fe}\u00bd\u00f4Z\u00d9\u00a0\u00e0\u0006\u0016\u001e\u00fcJ n\u00cc\u0099\u0085k\u000fH\u00d5<\u008e`\u00bb\u0015[\u00de\u00fc\u0003\u00ba_\u00e8E\u0012\u0015";
                var5_11 = "\u009d\u00da\u00c1\u009e\u000f\u00149\u00f1E\u001d+\u0005\u00bb#-\u0017\u00a2\u00f0.>\u00a5\u00c2.\f\u00cf\u00c8)\u00ae\"\u0004\u00a2\u0080|\u0010i\u001f\u00c9j\u00cf\u00c0\u00fc\u00f3\u00b5\u00e6\u0083/.\u0006t?,\u00fd\u00cb\u0001\u00fc\u000f\u00c72:\u009aK}\u00c6\u0091\u0082\u0086N\u00e2a\u00b0\u00ad\u0018\u00d9\u00fa\u0082Pm\u00cc\u0092\u008d\u00b64\u00bc\u00c4r~/\u000e\u00d6\u00b1HY?D\u0086\u00fa~$\u00f0NQ\u00a0;G\u00c2\u0011\u00aa\u00f0\u00eb\u0004\u0000\u00ff\u00b4/\u00d6\u00c6\u00adsU\u009cM\u00d6N\u0003\u00ff\u00e9\u00b0\u00adg\u009b\u00d6\u00a6\u00ce\u0088u\u00fd[\u001cL\u0093\u00ef\u00f7\u00de\u00ea\u00d9\u00ef\u001f5\u00aaE\u00ee_p\u0010t\u00f1\u00cb\u00ee\u00ab\u00ac\u00e5;JI\u00bb\u00f3g\u0003\u00aa\u0099\u00d2VdM8\u00d7T\u00fbYy\u00cc\u00c6\u009a\u00c9\u00ba\u0089\u00aa\f\u001e\u00beN\u0006\u0089\u00dfdNk\u009c\u009c\u007f\u0015\u00a4.y.\u00c4\u0012\u00d3_}\u0014J^~)\u00f9\u0003\t\u00bb\u00b7`\u00ea\u00c2\"\u0005\u00b3N\u0095\u0015\u0013\u0097qN\u00bb+`%M\u00aaV\u0095G\u00ae\u0096\u00e1\u0011.EQ\u00daog\u009c]\u0080|D\u0081\u00f7\u00be\u00f9\u00fd#\u008ft}\u00df\u00c6S\u00d2\u0016\u0084\u0080\u00d1\u0011\u00a7kg24]\u00d4\u00bf\u00b0k\u0085CM\u0084\u009d/'\u00dcU3\u00c6\u00e3W\u00ee/\u00fd@I\"A\u00bb\u00f8bsx2,\u00e0u\u00d7\u0098B\u0004\u0089c;\u0005+l\u00a0_.]\u00e5\u00fd\u008d\u0011T5\"N\u0083c\u00e51\u00cfa\u0095\u00fe\u00bbp\u00ddIQ\\&H\u00d4\u00e5\u001e;%\u00f8\u0018\u00ad\u0097*E\u0000xG\u00b8Y9\u00d2\u008b\u00ce\"p;;\u009f\u007fN\u0005\u00d4Qf>\u0088\u00f9\b\u0007\u001f\u00e4\u0014\u00ba)#i(\t\u00ea\u00a1\u0084\u00c8M(\u00ba\u0099\u00b555\u0092\u0097\u0005\u00c9sZ\u0089ps\u0015\u00dbC\u00aa\u0086\u00cf\u0087\u00b1 \u00a4\u00a0D\u0084\t\u00a0\u00d7\u00ccxe\u00f4\u00f0\u00da^\u00e7\u00b1\"\u0016\u0003*e\u00de\u00c7\u000e\u00e7\u001ax\u00b9\u001csS\u00b9\u0006\u00fe}\u00bd\u00f4Z\u00d9\u00a0\u00e0\u0006\u0016\u001e\u00fcJ n\u00cc\u0099\u0085k\u000fH\u00d5<\u008e`\u00bb\u0015[\u00de\u00fc\u0003\u00ba_\u00e8E\u0012\u0015".length();
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
                    var4_10 = "d\u001don\u00d6\u00f6+\u00c5\u00d2\u00f8\u00c0\u00c7\u00a8\u009c8c";
                    var5_11 = "d\u001don\u00d6\u00f6+\u00c5\u00d2\u00f8\u00c0\u00c7\u00a8\u009c8c".length();
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
        x9.a = var6_8;
        x9.b = new Integer[64];
        x9.ZPAD = new x9(var8[0], 0, (char)x9.a(19226, 7036469705994696536L));
        x9.ZDLE = new x9(var8[22], 1, x9.a(24794, 3855254173363559556L));
        x9.ZDLEE = new x9(var8[6], 2, x9.ZDLE.r() ^ x9.a(9714, 5145826346146666897L));
        x9.ZBIN = new x9(var8[29], 3, (char)x9.a(221, 1216018309044157617L));
        x9.ZHEX = new x9(var8[15], 4, (char)x9.a(28663, 4730471377426502536L));
        x9.ZBIN32 = new x9(var8[23], 5, (char)x9.a(3319, 715283548141400215L));
        x9.ZCRCE = new x9(var8[14], x9.a(21966, 7357054359362595237L), (char)x9.a(29295, 4479388055076195863L));
        x9.ZCRCG = new x9(var8[2], x9.a(16043, 6749396761428198106L), (char)x9.a(27833, 7098433914884542694L));
        x9.ZCRCQ = new x9(var8[24], x9.a(10052, 2921227722794605316L), (char)x9.a(31379, 5548437663083939547L));
        x9.ZCRCW = new x9(var8[11], x9.a(6340, 1251119330513953925L), (char)x9.a(16062, 1248730555018019571L));
        x9.ZRUB0 = new x9(var8[26], x9.a(24832, 5320348896615292247L), (char)x9.a(19898, 1986629007213556214L));
        x9.ZRUB1 = new x9(var8[16], x9.a(14029, 8768416882360683139L), (char)x9.a(22551, 5022273060277773430L));
        x9.ZRQINIT = new x9(var8[1], x9.a(19434, 8862992886745200558L), 0);
        x9.ZRINIT = new x9(var8[20], x9.a(31577, 4747743594336241454L), 1);
        x9.ZSINIT = new x9(var8[10], x9.a(25800, 8240733356841785492L), 2);
        x9.ZACK = new x9(var8[19], x9.a(27817, 3356448018155393243L), 3);
        x9.ZFILE = new x9(var8[13], x9.a(26890, 7535110145768346990L), 4);
        x9.ZSKIP = new x9(var8[5], x9.a(31231, 1419711686003672452L), 5);
        x9.ZNAK = new x9(var8[30], x9.a(14170, 8147865579245538109L), x9.a(21966, 7357054359362595237L));
        x9.ZABORT = new x9(var8[28], x9.a(472, 4757328039956528524L), x9.a(16043, 6749396761428198106L));
        x9.ZFIN = new x9(var8[8], x9.a(17472, 497245194918099004L), x9.a(10052, 2921227722794605316L));
        x9.ZRPOS = new x9(var8[27], x9.a(17107, 8537509248010419899L), x9.a(6340, 1251119330513953925L));
        x9.ZDATA = new x9(var8[12], x9.a(27837, 6021323298885488840L), x9.a(24832, 5320348896615292247L));
        x9.ZEOF = new x9(var8[7], x9.a(7241, 6172132768046096431L), x9.a(14029, 8768416882360683139L));
        x9.ZFERR = new x9(var8[31], x9.a(24794, 3855254173363559556L), x9.a(19434, 8862992886745200558L));
        x9.ZCRC = new x9(var8[3], x9.a(6494, 8819584604824216853L), x9.a(31577, 4747743594336241454L));
        x9.ZCHALLENGE = new x9(var8[25], x9.a(3451, 8961000259697422600L), x9.a(25800, 8240733356841785492L));
        x9.ZCOMPL = new x9(var8[9], x9.a(31147, 7323012328069809650L), x9.a(27817, 3356448018155393243L));
        x9.ZCAN = new x9(var8[4], x9.a(27482, 815020882474194743L), x9.a(26890, 7535110145768346990L));
        x9.ZFREECNT = new x9(var8[21], x9.a(29018, 529914040647765257L), x9.a(31231, 1419711686003672452L));
        x9.ZCOMMAND = new x9(var8[17], x9.a(28845, 3430576925272132856L), x9.a(14170, 8147865579245538109L));
        x9.ZSTDERR = new x9(var8[18], x9.a(11511, 2778048654636585106L), x9.a(472, 4757328039956528524L));
        x9.E = x9.z();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3C77;
        if (b[n11] == null) {
            x9.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

