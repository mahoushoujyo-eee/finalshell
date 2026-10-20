/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Renamed from Jo
 */
class jo_0
extends jk_0 {
    private byte[] Z;
    private int N;
    static final String[] D;
    private static final String[] a;
    private static final String[] d;
    private static final long[] h;
    private static final Integer[] i;

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "\u0091\u00c2)@\u00c9i\u0094\u00ea\u00a1\u00ec\u00b1jz\u00b4#>R\u00bb\u00e6\u00f9O\u0081\u0002\u0087\u0018\u00d1!\u00be\u00c4\u008a\u00ea#JKM1]gU\u001dc\u008fw\u00e9\u0002\\\u00edL\u008e8T\u00f0\u00c6\u00e7\u00b4T\u00a1\u00f6\u00b3W\u00af\u00e09\u008f\u00f7n_G\u009e\u001a\u0094\"\u0007\u00c1\u0017t\u001b\u00ee\u00b9`|m/T\u00d2fOrr\bp\u0019\u009b\u00fek\u0097";
                        var12_3 = "\u0091\u00c2)@\u00c9i\u0094\u00ea\u00a1\u00ec\u00b1jz\u00b4#>R\u00bb\u00e6\u00f9O\u0081\u0002\u0087\u0018\u00d1!\u00be\u00c4\u008a\u00ea#JKM1]gU\u001dc\u008fw\u00e9\u0002\\\u00edL\u008e8T\u00f0\u00c6\u00e7\u00b4T\u00a1\u00f6\u00b3W\u00af\u00e09\u008f\u00f7n_G\u009e\u001a\u0094\"\u0007\u00c1\u0017t\u001b\u00ee\u00b9`|m/T\u00d2fOrr\bp\u0019\u009b\u00fek\u0097".length();
                        var9_4 = 39;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 15;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u008b\u00f8\u00b2\u00cc\u00f7\u0083QF\u00b34\u00d7Oq=\u00bb\u0012\u0019\u00d5\u001d\u0018Qe\u00d4\u001eO(\u00ee;h\u00b4\u0013\u00f9\u0087\u00b7";
                            var12_3 = "\u008b\u00f8\u00b2\u00cc\u00f7\u0083QF\u00b34\u00d7Oq=\u00bb\u0012\u0019\u00d5\u001d\u0018Qe\u00d4\u001eO(\u00ee;h\u00b4\u0013\u00f9\u0087\u00b7".length();
                            var9_4 = 15;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 118;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
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
                                    v15 = 19;
                                    break;
                                }
                                case 1: {
                                    v15 = 125;
                                    break;
                                }
                                case 2: {
                                    v15 = 112;
                                    break;
                                }
                                case 3: {
                                    v15 = 120;
                                    break;
                                }
                                case 4: {
                                    v15 = 45;
                                    break;
                                }
                                case 5: {
                                    v15 = 5;
                                    break;
                                }
                                default: {
                                    v15 = 15;
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
                jo_0.a = var13;
                jo_0.d = new String[5];
                var0_7 = 7209093591591782095L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = ";\u00a7\t\u008c\u00ca\u0096~O*^W\u00bax\u00d8w\u0019\u00e5W\u00a6r\u0091\u0095\u001a\u0010\u00b3\u00d1\u00f82v\u00ef\u00ca\u0011e\u0082Bb\u00de\u001b\u00dd\u00d5\u00beh\u00d7P\u008b\u0094\u009b\u008d";
                var5_11 = ";\u00a7\t\u008c\u00ca\u0096~O*^W\u00bax\u00d8w\u0019\u00e5W\u00a6r\u0091\u0095\u001a\u0010\u00b3\u00d1\u00f82v\u00ef\u00ca\u0011e\u0082Bb\u00de\u001b\u00dd\u00d5\u00beh\u00d7P\u008b\u0094\u009b\u008d".length();
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
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00f0\u00c3\u008b\u00a0\u0003\u00ec\u00c1[\u00b1Y\u00a9N\u001d\u001c\u0014\u0000";
                    var5_11 = "\u00f0\u00c3\u008b\u00a0\u0003\u00ec\u00c1[\u00b1Y\u00a9N\u001d\u001c\u0014\u0000".length();
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
lbl125:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        jo_0.h = var6_8;
        jo_0.i = new Integer[8];
        jo_0.D = new String[]{"Request Granted", "Request Rejected or Failed", "Failed request, can't connect to Identd", "Failed request, bad user name"};
    }

    public jo_0(int n10) {
        super(n10, null, 0);
        this.O = null;
        this.N = jo_0.b(24596, 7334922390716042460L);
        this.Z = new byte[2];
        this.Z[0] = 0;
        this.Z[1] = (byte)this.r;
    }

    public jo_0(int n10, InetAddress inetAddress, int n11) {
        this(0, n10, inetAddress, n11, null);
    }

    public jo_0(int n10, InetAddress inetAddress, int n11, String string) {
        this(4, n10, inetAddress, n11, string);
    }

    /*
     * Unable to fully structure code
     */
    public jo_0(int var1_1, int var2_2, InetAddress var3_3, int var4_4, String var5_5) {
        block12: {
            block11: {
                block10: {
                    block8: {
                        block9: {
                            v0 = jk_0.Y();
                            super(var2_2, var3_3, var4_4);
                            var6_6 = v0;
                            this.O = var5_5;
                            v1 = this;
                            v2 = var1_1;
                            if (var6_6 == null) ** GOTO lbl14
                            v1.u = v2;
                            v1 = this;
                            if (var5_5 == null) {
                                v3 = jo_0.b(21571, 6177561274986657928L);
                            } else {
                                v2 = jo_0.b(27472, 4730592630746072989L);
lbl14:
                                // 2 sources

                                v3 = v2 + var5_5.length();
                            }
                            v1.N = v3;
                            this.Z = new byte[this.N];
                            this.Z[0] = (byte)var1_1;
                            this.Z[1] = (byte)this.r;
                            this.Z[2] = (byte)(var4_4 >> jo_0.b(12676, 8866442875455085898L));
                            v4 = this.Z;
                            if (var6_6 == null) break block8;
                            v4[3] = (byte)var4_4;
                            if (var3_3 == null) break block9;
                            var7_7 = var3_3.getAddress();
                            if (var6_6 != null) break block10;
                        }
                        v4 = new byte[4];
                    }
                    var7_7 = v4;
                    var7_7[3] = 0;
                    var7_7[2] = 0;
                    var7_7[1] = 0;
                    var7_7[0] = 0;
                }
                System.arraycopy(var7_7, 0, this.Z, 4, 4);
                v5 = var5_5;
                if (var6_6 == null) break block11;
                if (v5 == null) break block12;
                v5 = var5_5;
            }
            var8_8 = v5.getBytes();
            System.arraycopy(var8_8, 0, this.Z, jo_0.b(12676, 8866442875455085898L), var8_8.length);
            this.Z[this.Z.length - 1] = 0;
        }
    }

    public jo_0(InputStream inputStream, boolean bl) throws IOException {
        this.Z = null;
        this.b(inputStream, bl);
    }

    @Override
    public void K(InputStream inputStream) throws IOException {
        this.b(inputStream, true);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void b(InputStream var1_1, boolean var2_2) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[DOLOOP]], but top level block is 9[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void l(OutputStream outputStream) throws IOException {
        block2: {
            block3: {
                String[] stringArray = jk_0.Y();
                try {
                    if (stringArray == null) break block2;
                    if (this.Z != null) break block3;
                }
                catch (IOException iOException) {
                    throw jo_0.a(iOException);
                }
                jo_0 jo_02 = new jo_0(this.u, this.r, this.e, this.R, this.O);
                this.Z = jo_02.Z;
                this.N = jo_02.N;
            }
            outputStream.write(this.Z);
        }
    }

    static InetAddress u(byte[] byArray) {
        String string = jo_0.n(byArray, 0);
        try {
            return InetAddress.getByName(string);
        }
        catch (UnknownHostException unknownHostException) {
            return null;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF8831) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 152;
                    break;
                }
                case 1: {
                    n14 = 194;
                    break;
                }
                case 2: {
                    n14 = 58;
                    break;
                }
                case 3: {
                    n14 = 138;
                    break;
                }
                case 4: {
                    n14 = 94;
                    break;
                }
                case 5: {
                    n14 = 85;
                    break;
                }
                case 6: {
                    n14 = 49;
                    break;
                }
                case 7: {
                    n14 = 90;
                    break;
                }
                case 8: {
                    n14 = 129;
                    break;
                }
                case 9: {
                    n14 = 116;
                    break;
                }
                case 10: {
                    n14 = 20;
                    break;
                }
                case 11: {
                    n14 = 155;
                    break;
                }
                case 12: {
                    n14 = 212;
                    break;
                }
                case 13: {
                    n14 = 177;
                    break;
                }
                case 14: {
                    n14 = 114;
                    break;
                }
                case 15: {
                    n14 = 238;
                    break;
                }
                case 16: {
                    n14 = 208;
                    break;
                }
                case 17: {
                    n14 = 253;
                    break;
                }
                case 18: {
                    n14 = 229;
                    break;
                }
                case 19: {
                    n14 = 70;
                    break;
                }
                case 20: {
                    n14 = 188;
                    break;
                }
                case 21: {
                    n14 = 230;
                    break;
                }
                case 22: {
                    n14 = 200;
                    break;
                }
                case 23: {
                    n14 = 154;
                    break;
                }
                case 24: {
                    n14 = 56;
                    break;
                }
                case 25: {
                    n14 = 1;
                    break;
                }
                case 26: {
                    n14 = 84;
                    break;
                }
                case 27: {
                    n14 = 210;
                    break;
                }
                case 28: {
                    n14 = 178;
                    break;
                }
                case 29: {
                    n14 = 231;
                    break;
                }
                case 30: {
                    n14 = 3;
                    break;
                }
                case 31: {
                    n14 = 213;
                    break;
                }
                case 32: {
                    n14 = 104;
                    break;
                }
                case 33: {
                    n14 = 97;
                    break;
                }
                case 34: {
                    n14 = 179;
                    break;
                }
                case 35: {
                    n14 = 99;
                    break;
                }
                case 36: {
                    n14 = 16;
                    break;
                }
                case 37: {
                    n14 = 111;
                    break;
                }
                case 38: {
                    n14 = 54;
                    break;
                }
                case 39: {
                    n14 = 103;
                    break;
                }
                case 40: {
                    n14 = 161;
                    break;
                }
                case 41: {
                    n14 = 45;
                    break;
                }
                case 42: {
                    n14 = 191;
                    break;
                }
                case 43: {
                    n14 = 122;
                    break;
                }
                case 44: {
                    n14 = 26;
                    break;
                }
                case 45: {
                    n14 = 235;
                    break;
                }
                case 46: {
                    n14 = 240;
                    break;
                }
                case 47: {
                    n14 = 145;
                    break;
                }
                case 48: {
                    n14 = 37;
                    break;
                }
                case 49: {
                    n14 = 64;
                    break;
                }
                case 50: {
                    n14 = 13;
                    break;
                }
                case 51: {
                    n14 = 50;
                    break;
                }
                case 52: {
                    n14 = 55;
                    break;
                }
                case 53: {
                    n14 = 131;
                    break;
                }
                case 54: {
                    n14 = 227;
                    break;
                }
                case 55: {
                    n14 = 160;
                    break;
                }
                case 56: {
                    n14 = 172;
                    break;
                }
                case 57: {
                    n14 = 219;
                    break;
                }
                case 58: {
                    n14 = 39;
                    break;
                }
                case 59: {
                    n14 = 222;
                    break;
                }
                case 60: {
                    n14 = 186;
                    break;
                }
                case 61: {
                    n14 = 136;
                    break;
                }
                case 62: {
                    n14 = 29;
                    break;
                }
                case 63: {
                    n14 = 12;
                    break;
                }
                case 64: {
                    n14 = 124;
                    break;
                }
                case 65: {
                    n14 = 173;
                    break;
                }
                case 66: {
                    n14 = 74;
                    break;
                }
                case 67: {
                    n14 = 126;
                    break;
                }
                case 68: {
                    n14 = 17;
                    break;
                }
                case 69: {
                    n14 = 101;
                    break;
                }
                case 70: {
                    n14 = 95;
                    break;
                }
                case 71: {
                    n14 = 66;
                    break;
                }
                case 72: {
                    n14 = 144;
                    break;
                }
                case 73: {
                    n14 = 166;
                    break;
                }
                case 74: {
                    n14 = 189;
                    break;
                }
                case 75: {
                    n14 = 185;
                    break;
                }
                case 76: {
                    n14 = 125;
                    break;
                }
                case 77: {
                    n14 = 167;
                    break;
                }
                case 78: {
                    n14 = 43;
                    break;
                }
                case 79: {
                    n14 = 63;
                    break;
                }
                case 80: {
                    n14 = 83;
                    break;
                }
                case 81: {
                    n14 = 237;
                    break;
                }
                case 82: {
                    n14 = 157;
                    break;
                }
                case 83: {
                    n14 = 53;
                    break;
                }
                case 84: {
                    n14 = 206;
                    break;
                }
                case 85: {
                    n14 = 46;
                    break;
                }
                case 86: {
                    n14 = 211;
                    break;
                }
                case 87: {
                    n14 = 112;
                    break;
                }
                case 88: {
                    n14 = 106;
                    break;
                }
                case 89: {
                    n14 = 174;
                    break;
                }
                case 90: {
                    n14 = 218;
                    break;
                }
                case 91: {
                    n14 = 24;
                    break;
                }
                case 92: {
                    n14 = 142;
                    break;
                }
                case 93: {
                    n14 = 40;
                    break;
                }
                case 94: {
                    n14 = 92;
                    break;
                }
                case 95: {
                    n14 = 162;
                    break;
                }
                case 96: {
                    n14 = 86;
                    break;
                }
                case 97: {
                    n14 = 71;
                    break;
                }
                case 98: {
                    n14 = 117;
                    break;
                }
                case 99: {
                    n14 = 196;
                    break;
                }
                case 100: {
                    n14 = 207;
                    break;
                }
                case 101: {
                    n14 = 135;
                    break;
                }
                case 102: {
                    n14 = 19;
                    break;
                }
                case 103: {
                    n14 = 156;
                    break;
                }
                case 104: {
                    n14 = 22;
                    break;
                }
                case 105: {
                    n14 = 89;
                    break;
                }
                case 106: {
                    n14 = 76;
                    break;
                }
                case 107: {
                    n14 = 158;
                    break;
                }
                case 108: {
                    n14 = 139;
                    break;
                }
                case 109: {
                    n14 = 123;
                    break;
                }
                case 110: {
                    n14 = 234;
                    break;
                }
                case 111: {
                    n14 = 81;
                    break;
                }
                case 112: {
                    n14 = 47;
                    break;
                }
                case 113: {
                    n14 = 163;
                    break;
                }
                case 114: {
                    n14 = 149;
                    break;
                }
                case 115: {
                    n14 = 120;
                    break;
                }
                case 116: {
                    n14 = 216;
                    break;
                }
                case 117: {
                    n14 = 195;
                    break;
                }
                case 118: {
                    n14 = 96;
                    break;
                }
                case 119: {
                    n14 = 220;
                    break;
                }
                case 120: {
                    n14 = 34;
                    break;
                }
                case 121: {
                    n14 = 171;
                    break;
                }
                case 122: {
                    n14 = 15;
                    break;
                }
                case 123: {
                    n14 = 110;
                    break;
                }
                case 124: {
                    n14 = 244;
                    break;
                }
                case 125: {
                    n14 = 205;
                    break;
                }
                case 126: {
                    n14 = 214;
                    break;
                }
                case 127: {
                    n14 = 236;
                    break;
                }
                case 128: {
                    n14 = 105;
                    break;
                }
                case 129: {
                    n14 = 202;
                    break;
                }
                case 130: {
                    n14 = 250;
                    break;
                }
                case 131: {
                    n14 = 52;
                    break;
                }
                case 132: {
                    n14 = 215;
                    break;
                }
                case 133: {
                    n14 = 62;
                    break;
                }
                case 134: {
                    n14 = 27;
                    break;
                }
                case 135: {
                    n14 = 88;
                    break;
                }
                case 136: {
                    n14 = 108;
                    break;
                }
                case 137: {
                    n14 = 77;
                    break;
                }
                case 138: {
                    n14 = 68;
                    break;
                }
                case 139: {
                    n14 = 140;
                    break;
                }
                case 140: {
                    n14 = 21;
                    break;
                }
                case 141: {
                    n14 = 184;
                    break;
                }
                case 142: {
                    n14 = 42;
                    break;
                }
                case 143: {
                    n14 = 115;
                    break;
                }
                case 144: {
                    n14 = 239;
                    break;
                }
                case 145: {
                    n14 = 23;
                    break;
                }
                case 146: {
                    n14 = 133;
                    break;
                }
                case 147: {
                    n14 = 48;
                    break;
                }
                case 148: {
                    n14 = 14;
                    break;
                }
                case 149: {
                    n14 = 192;
                    break;
                }
                case 150: {
                    n14 = 204;
                    break;
                }
                case 151: {
                    n14 = 183;
                    break;
                }
                case 152: {
                    n14 = 164;
                    break;
                }
                case 153: {
                    n14 = 73;
                    break;
                }
                case 154: {
                    n14 = 121;
                    break;
                }
                case 155: {
                    n14 = 61;
                    break;
                }
                case 156: {
                    n14 = 67;
                    break;
                }
                case 157: {
                    n14 = 165;
                    break;
                }
                case 158: {
                    n14 = 91;
                    break;
                }
                case 159: {
                    n14 = 148;
                    break;
                }
                case 160: {
                    n14 = 226;
                    break;
                }
                case 161: {
                    n14 = 146;
                    break;
                }
                case 162: {
                    n14 = 203;
                    break;
                }
                case 163: {
                    n14 = 150;
                    break;
                }
                case 164: {
                    n14 = 80;
                    break;
                }
                case 165: {
                    n14 = 180;
                    break;
                }
                case 166: {
                    n14 = 9;
                    break;
                }
                case 167: {
                    n14 = 32;
                    break;
                }
                case 168: {
                    n14 = 72;
                    break;
                }
                case 169: {
                    n14 = 98;
                    break;
                }
                case 170: {
                    n14 = 82;
                    break;
                }
                case 171: {
                    n14 = 233;
                    break;
                }
                case 172: {
                    n14 = 36;
                    break;
                }
                case 173: {
                    n14 = 190;
                    break;
                }
                case 174: {
                    n14 = 181;
                    break;
                }
                case 175: {
                    n14 = 78;
                    break;
                }
                case 176: {
                    n14 = 127;
                    break;
                }
                case 177: {
                    n14 = 182;
                    break;
                }
                case 178: {
                    n14 = 87;
                    break;
                }
                case 179: {
                    n14 = 223;
                    break;
                }
                case 180: {
                    n14 = 159;
                    break;
                }
                case 181: {
                    n14 = 102;
                    break;
                }
                case 182: {
                    n14 = 251;
                    break;
                }
                case 183: {
                    n14 = 130;
                    break;
                }
                case 184: {
                    n14 = 228;
                    break;
                }
                case 185: {
                    n14 = 187;
                    break;
                }
                case 186: {
                    n14 = 134;
                    break;
                }
                case 187: {
                    n14 = 193;
                    break;
                }
                case 188: {
                    n14 = 197;
                    break;
                }
                case 189: {
                    n14 = 31;
                    break;
                }
                case 190: {
                    n14 = 44;
                    break;
                }
                case 191: {
                    n14 = 141;
                    break;
                }
                case 192: {
                    n14 = 243;
                    break;
                }
                case 193: {
                    n14 = 100;
                    break;
                }
                case 194: {
                    n14 = 11;
                    break;
                }
                case 195: {
                    n14 = 7;
                    break;
                }
                case 196: {
                    n14 = 249;
                    break;
                }
                case 197: {
                    n14 = 28;
                    break;
                }
                case 198: {
                    n14 = 175;
                    break;
                }
                case 199: {
                    n14 = 2;
                    break;
                }
                case 200: {
                    n14 = 38;
                    break;
                }
                case 201: {
                    n14 = 199;
                    break;
                }
                case 202: {
                    n14 = 242;
                    break;
                }
                case 203: {
                    n14 = 5;
                    break;
                }
                case 204: {
                    n14 = 119;
                    break;
                }
                case 205: {
                    n14 = 170;
                    break;
                }
                case 206: {
                    n14 = 254;
                    break;
                }
                case 207: {
                    n14 = 147;
                    break;
                }
                case 208: {
                    n14 = 201;
                    break;
                }
                case 209: {
                    n14 = 57;
                    break;
                }
                case 210: {
                    n14 = 143;
                    break;
                }
                case 211: {
                    n14 = 75;
                    break;
                }
                case 212: {
                    n14 = 118;
                    break;
                }
                case 213: {
                    n14 = 41;
                    break;
                }
                case 214: {
                    n14 = 151;
                    break;
                }
                case 215: {
                    n14 = 168;
                    break;
                }
                case 216: {
                    n14 = 224;
                    break;
                }
                case 217: {
                    n14 = 65;
                    break;
                }
                case 218: {
                    n14 = 6;
                    break;
                }
                case 219: {
                    n14 = 107;
                    break;
                }
                case 220: {
                    n14 = 217;
                    break;
                }
                case 221: {
                    n14 = 225;
                    break;
                }
                case 222: {
                    n14 = 232;
                    break;
                }
                case 223: {
                    n14 = 10;
                    break;
                }
                case 224: {
                    n14 = 79;
                    break;
                }
                case 225: {
                    n14 = 252;
                    break;
                }
                case 226: {
                    n14 = 255;
                    break;
                }
                case 227: {
                    n14 = 30;
                    break;
                }
                case 228: {
                    n14 = 33;
                    break;
                }
                case 229: {
                    n14 = 241;
                    break;
                }
                case 230: {
                    n14 = 4;
                    break;
                }
                case 231: {
                    n14 = 35;
                    break;
                }
                case 232: {
                    n14 = 132;
                    break;
                }
                case 233: {
                    n14 = 176;
                    break;
                }
                case 234: {
                    n14 = 18;
                    break;
                }
                case 235: {
                    n14 = 51;
                    break;
                }
                case 236: {
                    n14 = 113;
                    break;
                }
                case 237: {
                    n14 = 69;
                    break;
                }
                case 238: {
                    n14 = 128;
                    break;
                }
                case 239: {
                    n14 = 169;
                    break;
                }
                case 240: {
                    n14 = 209;
                    break;
                }
                case 241: {
                    n14 = 198;
                    break;
                }
                case 242: {
                    n14 = 59;
                    break;
                }
                case 243: {
                    n14 = 221;
                    break;
                }
                case 244: {
                    n14 = 247;
                    break;
                }
                case 245: {
                    n14 = 0;
                    break;
                }
                case 246: {
                    n14 = 153;
                    break;
                }
                case 247: {
                    n14 = 246;
                    break;
                }
                case 248: {
                    n14 = 25;
                    break;
                }
                case 249: {
                    n14 = 248;
                    break;
                }
                case 250: {
                    n14 = 245;
                    break;
                }
                case 251: {
                    n14 = 109;
                    break;
                }
                case 252: {
                    n14 = 60;
                    break;
                }
                case 253: {
                    n14 = 137;
                    break;
                }
                case 254: {
                    n14 = 93;
                    break;
                }
                default: {
                    n14 = 8;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            jo_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2CCB;
        if (i[n11] == null) {
            jo_0.i[n11] = (int)(h[n11] ^ l2);
        }
        return i[n11];
    }
}

