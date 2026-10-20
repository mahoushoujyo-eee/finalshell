/*
 * Decompiled with CFR 0.152.
 */
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import javax.net.ssl.HttpsURLConnection;

/*
 * Renamed from dO
 */
public class do_1 {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static HttpURLConnection T(String string) throws Exception {
        HttpURLConnection httpURLConnection;
        block9: {
            HttpURLConnection httpURLConnection2;
            block10: {
                boolean bl;
                block11: {
                    boolean bl2;
                    URL uRL;
                    block7: {
                        block8: {
                            uRL = new URL(string);
                            bl = cn_1.B();
                            httpURLConnection2 = null;
                            try {
                                bl2 = string.startsWith("http://");
                                if (bl) break block7;
                                if (!bl2) break block8;
                            }
                            catch (Exception exception) {
                                throw do_1.a(exception);
                            }
                            httpURLConnection2 = (HttpURLConnection)uRL.openConnection();
                            break block11;
                        }
                        bl2 = string.startsWith("https://");
                    }
                    if (bl2) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)uRL.openConnection();
                        httpsURLConnection.setHostnameVerifier(new YF());
                        httpURLConnection2 = httpsURLConnection;
                    }
                }
                try {
                    try {
                        httpURLConnection = httpURLConnection2;
                        if (bl) break block9;
                        if (httpURLConnection == null) break block10;
                    }
                    catch (Exception exception) {
                        throw do_1.a(exception);
                    }
                    httpURLConnection2.setConnectTimeout(do_1.a(24576, 5376184224152696828L));
                    httpURLConnection2.setReadTimeout(do_1.a(12518, 8105396525257418511L));
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setUseCaches(false);
                }
                catch (Exception exception) {
                    throw do_1.a(exception);
                }
            }
            httpURLConnection = httpURLConnection2;
        }
        return httpURLConnection;
    }

    public static String b(String string) {
        byte[] byArray = string.getBytes();
        return do_1.c(byArray);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String c(byte[] byArray) {
        String string = null;
        boolean bl = cn_1.B();
        char[] cArray = new char[do_1.a(15789, 6040534281061198409L)];
        cArray[0] = do_1.a(15683, 8951421809937738400L);
        cArray[1] = do_1.a(19659, 4386777348184480556L);
        cArray[2] = do_1.a(24557, 4216862108515469340L);
        cArray[3] = do_1.a(26291, 6719713232588157255L);
        cArray[4] = do_1.a(23758, 5359558343850855214L);
        cArray[5] = do_1.a(21847, 7774227852064817837L);
        cArray[do_1.a((int)10051, (long)5208862579186004134L)] = do_1.a(12861, 6716613985420436942L);
        cArray[do_1.a((int)23390, (long)4171595423746919601L)] = do_1.a(27654, 5037125346503867360L);
        cArray[do_1.a((int)1223, (long)8432283798605288250L)] = do_1.a(6386, 4738186108210466562L);
        cArray[do_1.a((int)29116, (long)7401455165348423241L)] = do_1.a(22699, 2400634459981516609L);
        cArray[do_1.a((int)2564, (long)4536660657965915626L)] = do_1.a(14117, 4376868301232922835L);
        cArray[do_1.a((int)31975, (long)7933657754591505162L)] = do_1.a(28388, 5705934257814878469L);
        cArray[do_1.a((int)8739, (long)4831962584196019656L)] = do_1.a(12736, 8601963166385956408L);
        cArray[do_1.a((int)11396, (long)488388192950188925L)] = do_1.a(25234, 2816442537607673193L);
        cArray[do_1.a((int)20006, (long)7374440824976087512L)] = do_1.a(7578, 1687349146487605869L);
        cArray[do_1.a((int)5570, (long)65313158950011438L)] = do_1.a(24364, 5182129379999385796L);
        char[] cArray2 = cArray;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byArray);
            byte[] byArray2 = messageDigest.digest();
            char[] cArray3 = new char[do_1.a(32000, 7929404820382198527L)];
            int n10 = 0;
            int n11 = 0;
            boolean bl2 = true;
            do {
                if (bl2 && !(bl2 = false) && !bl) continue;
                byte by = byArray2[n11];
                cArray3[n10++] = cArray2[by >>> 4 & do_1.a(6976, 977564145535241394L)];
                cArray3[n10++] = cArray2[by & do_1.a(6976, 977564145535241394L)];
                ++n11;
            } while (n11 < do_1.a(31862, 7308920878905666452L));
            return new String(cArray3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return string;
    }

    public static String h(long l2) {
        boolean bl = cn_1.B();
        long l3 = l2 - 0L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (!bl) {
            if (l4 <= 0) {
                return "0";
            }
            l4 = 5;
        }
        String[] stringArray = new String[l4];
        stringArray[0] = "B";
        stringArray[1] = "KB";
        stringArray[2] = "MB";
        stringArray[3] = "GB";
        stringArray[4] = "TB";
        String[] stringArray2 = stringArray;
        int n10 = (int)(Math.log10(l2) / Math.log10(1024.0));
        return new DecimalFormat("#,##0.#").format((double)l2 / Math.pow(1024.0, n10)) + " " + stringArray2[n10];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "<x\u00d6\u00d3>$\u00ee\u0007\u00e0\u00d18\u00e6T\u00ba\u00e4\u0003C\u00f6\u008c\bM\u00c7\u008d$\u00ab\u00f7{k\u00029F\u0002A\u00f1\u0002\u001e/";
                        var12_3 = "<x\u00d6\u00d3>$\u00ee\u0007\u00e0\u00d18\u00e6T\u00ba\u00e4\u0003C\u00f6\u008c\bM\u00c7\u008d$\u00ab\u00f7{k\u00029F\u0002A\u00f1\u0002\u001e/".length();
                        var9_4 = 7;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 83;
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
                            var10_2 = "@\u00adz_\u0002\u00aa\u0005";
                            var12_3 = "@\u00adz_\u0002\u00aa\u0005".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 120;
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
                                    v15 = 26;
                                    break;
                                }
                                case 1: {
                                    v15 = 49;
                                    break;
                                }
                                case 2: {
                                    v15 = 79;
                                    break;
                                }
                                case 3: {
                                    v15 = 73;
                                    break;
                                }
                                case 4: {
                                    v15 = 67;
                                    break;
                                }
                                case 5: {
                                    v15 = 39;
                                    break;
                                }
                                default: {
                                    v15 = 109;
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
                do_1.a = var13;
                do_1.b = new String[9];
                var0_7 = 7077223893917426076L;
                var6_8 = new long[32];
                var3_9 = 0;
                var4_10 = "\u00af5\u001fO5\u009fc\u0004\u00c4\u00ff\u00f5\u001dX\u00bdT\u0091\u00ae\u00fb\u0000\u00b37\u00b7\u0007\u00c7\u00e2\u00a0\u008e\u00f7\u00d1\u0090\u009a\u00ec\u009b\\f\u00ac]\fxJ\u0098\u00e4\u00bc\u008b\u009f\u00fcKC\u00b3\u00d7\u00ca\u00fc\u00cft\u00f1pn\u00bfs\u0088\u00cd\u00fc\u00b2\u00ae-\u00ean\u0080\u00b7\u0013\u00ad!\u00cd\u00d2\u00ab\u00d8\u00e6\u00bd\u0004d9\u0011\u00af\u00a4\u00d3I\u00ae\u00a6\u008ds\u00a9~l\u0004i\u00b2\u00f8B\u00b0^C}\u0001.\u00fb\u0014\u0089\u00d1X\u00a9+\u0094\u009e\u00eeA\u00c3\u009c2P\u00e8\u0018-\u000fz\u009fHG\u00dc\u0018\u0084\u0082i\u00fe\u0018n\u00e4\u009f\u00ce\u0088h\u0016!\u0094Xn\u00ae1\u008e\u008a i>\u00e3\u009e\u00b9\u0084\u008b}\u00a1\u0083orQz\u0088V\u00bc|\u009b\u00bc\u001a\u00b7\u0013\u00cem*\u00f8JyUV\u0085#\u00bd\t+W\u00ce\u0007)\u00ca\u009d\u001a\u00f4\u0006\u00cc&AJ\u0018\u009cN\u00b8\u00ea \u00df\u000b\f\t\u0085\u00b5+f\u00ec\u00ea\u0086Zp[\u00a8d\u0013X\u00fb\u0080\u00a6\u00ffh\u0017\u00a0ZK\u001e\u00a5\f\u001e\u000b\u009e\u00fa\u0081";
                var5_11 = "\u00af5\u001fO5\u009fc\u0004\u00c4\u00ff\u00f5\u001dX\u00bdT\u0091\u00ae\u00fb\u0000\u00b37\u00b7\u0007\u00c7\u00e2\u00a0\u008e\u00f7\u00d1\u0090\u009a\u00ec\u009b\\f\u00ac]\fxJ\u0098\u00e4\u00bc\u008b\u009f\u00fcKC\u00b3\u00d7\u00ca\u00fc\u00cft\u00f1pn\u00bfs\u0088\u00cd\u00fc\u00b2\u00ae-\u00ean\u0080\u00b7\u0013\u00ad!\u00cd\u00d2\u00ab\u00d8\u00e6\u00bd\u0004d9\u0011\u00af\u00a4\u00d3I\u00ae\u00a6\u008ds\u00a9~l\u0004i\u00b2\u00f8B\u00b0^C}\u0001.\u00fb\u0014\u0089\u00d1X\u00a9+\u0094\u009e\u00eeA\u00c3\u009c2P\u00e8\u0018-\u000fz\u009fHG\u00dc\u0018\u0084\u0082i\u00fe\u0018n\u00e4\u009f\u00ce\u0088h\u0016!\u0094Xn\u00ae1\u008e\u008a i>\u00e3\u009e\u00b9\u0084\u008b}\u00a1\u0083orQz\u0088V\u00bc|\u009b\u00bc\u001a\u00b7\u0013\u00cem*\u00f8JyUV\u0085#\u00bd\t+W\u00ce\u0007)\u00ca\u009d\u001a\u00f4\u0006\u00cc&AJ\u0018\u009cN\u00b8\u00ea \u00df\u000b\f\t\u0085\u00b5+f\u00ec\u00ea\u0086Zp[\u00a8d\u0013X\u00fb\u0080\u00a6\u00ffh\u0017\u00a0ZK\u001e\u00a5\f\u001e\u000b\u009e\u00fa\u0081".length();
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
                    var4_10 = "&D~0,\u00e2\u000b\u00c5\u0013\u00b79\u00f1\u0084\u00ee\u0011<";
                    var5_11 = "&D~0,\u00e2\u000b\u00c5\u0013\u00b79\u00f1\u0084\u00ee\u0011<".length();
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
        do_1.c = var6_8;
        do_1.d = new Integer[32];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x2E59) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 5;
                case 1 -> 89;
                case 2 -> 32;
                case 3 -> 175;
                case 4 -> 109;
                case 5 -> 100;
                case 6 -> 22;
                case 7 -> 255;
                case 8 -> 160;
                case 9 -> 221;
                case 10 -> 252;
                case 11 -> 254;
                case 12 -> 93;
                case 13 -> 27;
                case 14 -> 177;
                case 15 -> 125;
                case 16 -> 250;
                case 17 -> 8;
                case 18 -> 49;
                case 19 -> 228;
                case 20 -> 117;
                case 21 -> 3;
                case 22 -> 187;
                case 23 -> 44;
                case 24 -> 119;
                case 25 -> 114;
                case 26 -> 198;
                case 27 -> 73;
                case 28 -> 127;
                case 29 -> 71;
                case 30 -> 234;
                case 31 -> 23;
                case 32 -> 2;
                case 33 -> 131;
                case 34 -> 216;
                case 35 -> 232;
                case 36 -> 10;
                case 37 -> 70;
                case 38 -> 53;
                case 39 -> 46;
                case 40 -> 151;
                case 41 -> 200;
                case 42 -> 130;
                case 43 -> 83;
                case 44 -> 47;
                case 45 -> 190;
                case 46 -> 59;
                case 47 -> 129;
                case 48 -> 212;
                case 49 -> 61;
                case 50 -> 205;
                case 51 -> 66;
                case 52 -> 88;
                case 53 -> 166;
                case 54 -> 122;
                case 55 -> 173;
                case 56 -> 48;
                case 57 -> 124;
                case 58 -> 176;
                case 59 -> 103;
                case 60 -> 161;
                case 61 -> 136;
                case 62 -> 155;
                case 63 -> 128;
                case 64 -> 207;
                case 65 -> 57;
                case 66 -> 162;
                case 67 -> 38;
                case 68 -> 150;
                case 69 -> 204;
                case 70 -> 235;
                case 71 -> 226;
                case 72 -> 169;
                case 73 -> 194;
                case 74 -> 62;
                case 75 -> 229;
                case 76 -> 181;
                case 77 -> 149;
                case 78 -> 192;
                case 79 -> 112;
                case 80 -> 210;
                case 81 -> 1;
                case 82 -> 111;
                case 83 -> 84;
                case 84 -> 63;
                case 85 -> 82;
                case 86 -> 45;
                case 87 -> 184;
                case 88 -> 183;
                case 89 -> 6;
                case 90 -> 29;
                case 91 -> 145;
                case 92 -> 78;
                case 93 -> 225;
                case 94 -> 243;
                case 95 -> 60;
                case 96 -> 68;
                case 97 -> 104;
                case 98 -> 11;
                case 99 -> 202;
                case 100 -> 165;
                case 101 -> 244;
                case 102 -> 37;
                case 103 -> 193;
                case 104 -> 236;
                case 105 -> 12;
                case 106 -> 168;
                case 107 -> 239;
                case 108 -> 105;
                case 109 -> 106;
                case 110 -> 75;
                case 111 -> 217;
                case 112 -> 247;
                case 113 -> 19;
                case 114 -> 35;
                case 115 -> 223;
                case 116 -> 206;
                case 117 -> 215;
                case 118 -> 133;
                case 119 -> 99;
                case 120 -> 180;
                case 121 -> 55;
                case 122 -> 34;
                case 123 -> 31;
                case 124 -> 64;
                case 125 -> 209;
                case 126 -> 30;
                case 127 -> 118;
                case 128 -> 21;
                case 129 -> 147;
                case 130 -> 91;
                case 131 -> 79;
                case 132 -> 81;
                case 133 -> 245;
                case 134 -> 199;
                case 135 -> 123;
                case 136 -> 115;
                case 137 -> 101;
                case 138 -> 146;
                case 139 -> 208;
                case 140 -> 222;
                case 141 -> 186;
                case 142 -> 164;
                case 143 -> 110;
                case 144 -> 67;
                case 145 -> 137;
                case 146 -> 43;
                case 147 -> 33;
                case 148 -> 191;
                case 149 -> 195;
                case 150 -> 39;
                case 151 -> 246;
                case 152 -> 72;
                case 153 -> 201;
                case 154 -> 54;
                case 155 -> 142;
                case 156 -> 189;
                case 157 -> 113;
                case 158 -> 126;
                case 159 -> 51;
                case 160 -> 26;
                case 161 -> 172;
                case 162 -> 238;
                case 163 -> 197;
                case 164 -> 140;
                case 165 -> 153;
                case 166 -> 233;
                case 167 -> 76;
                case 168 -> 242;
                case 169 -> 108;
                case 170 -> 154;
                case 171 -> 74;
                case 172 -> 7;
                case 173 -> 213;
                case 174 -> 28;
                case 175 -> 121;
                case 176 -> 253;
                case 177 -> 96;
                case 178 -> 24;
                case 179 -> 0;
                case 180 -> 36;
                case 181 -> 120;
                case 182 -> 40;
                case 183 -> 15;
                case 184 -> 95;
                case 185 -> 16;
                case 186 -> 132;
                case 187 -> 171;
                case 188 -> 152;
                case 189 -> 241;
                case 190 -> 158;
                case 191 -> 156;
                case 192 -> 90;
                case 193 -> 174;
                case 194 -> 102;
                case 195 -> 92;
                case 196 -> 224;
                case 197 -> 85;
                case 198 -> 80;
                case 199 -> 144;
                case 200 -> 25;
                case 201 -> 97;
                case 202 -> 107;
                case 203 -> 231;
                case 204 -> 134;
                case 205 -> 203;
                case 206 -> 170;
                case 207 -> 185;
                case 208 -> 219;
                case 209 -> 227;
                case 210 -> 182;
                case 211 -> 18;
                case 212 -> 17;
                case 213 -> 50;
                case 214 -> 214;
                case 215 -> 141;
                case 216 -> 135;
                case 217 -> 249;
                case 218 -> 211;
                case 219 -> 69;
                case 220 -> 139;
                case 221 -> 196;
                case 222 -> 157;
                case 223 -> 148;
                case 224 -> 65;
                case 225 -> 143;
                case 226 -> 251;
                case 227 -> 52;
                case 228 -> 14;
                case 229 -> 163;
                case 230 -> 237;
                case 231 -> 179;
                case 232 -> 4;
                case 233 -> 167;
                case 234 -> 178;
                case 235 -> 218;
                case 236 -> 220;
                case 237 -> 86;
                case 238 -> 58;
                case 239 -> 116;
                case 240 -> 13;
                case 241 -> 248;
                case 242 -> 20;
                case 243 -> 188;
                case 244 -> 87;
                case 245 -> 9;
                case 246 -> 41;
                case 247 -> 56;
                case 248 -> 230;
                case 249 -> 159;
                case 250 -> 42;
                case 251 -> 77;
                case 252 -> 98;
                case 253 -> 138;
                case 254 -> 240;
                default -> 94;
            };
            int n15 = (n11 & 0xFF) - n14;
            if (n15 < 0) {
                n15 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n14) < 0) {
                n13 += 256;
            }
            int n16 = 0;
            while (n16 < cArray.length) {
                int n17 = n16 % 2;
                int n18 = n16;
                char[] cArray2 = cArray;
                char c2 = cArray[n18];
                if (n17 == 0) {
                    cArray2[n18] = (char)(c2 ^ n15);
                    n15 = ((n15 >>> 3 | n15 << 5) ^ cArray[n16]) & 0xFF;
                } else {
                    cArray2[n18] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n16]) & 0xFF;
                }
                ++n16;
            }
            do_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x57FA;
        if (d[n11] == null) {
            do_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

