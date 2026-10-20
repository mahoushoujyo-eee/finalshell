/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/*
 * Renamed from d5
 */
public class d5_0 {
    static Key o;
    private static String V;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[10];
                        var11_1 = 0;
                        d5_0.b(null);
                        var10_2 = "\u0083m\u00f8)\u00c0\u0003\u00c4\u00ad|\u0003\u0093h\u00d8\u0007]\u00d0\u008f\u00c3|\u0080\u000e\u0003\u0011\u00edb\b\u0091E\u0016q\u0006\u00c3!Z\u0004\u00d3\u00d5F\u001b\u0003\u00d1\u008f\u00ae";
                        var12_3 = "\u0083m\u00f8)\u00c0\u0003\u00c4\u00ad|\u0003\u0093h\u00d8\u0007]\u00d0\u008f\u00c3|\u0080\u000e\u0003\u0011\u00edb\b\u0091E\u0016q\u0006\u00c3!Z\u0004\u00d3\u00d5F\u001b\u0003\u00d1\u008f\u00ae".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 24;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "[\u00f7\u0011\f\uff51\uff19\u05e4\uff04\uff7c\uffe2\uff8b\u048f\uff8fX\u0003\u00a8\u00c6\u0019";
                            var12_3 = "[\u00f7\u0011\f\uff51\uff19\u05e4\uff04\uff7c\uffe2\uff8b\u048f\uff8fX\u0003\u00a8\u00c6\u0019".length();
                            var9_4 = 14;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 124;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 41;
                                    break;
                                }
                                case 1: {
                                    v15 = 106;
                                    break;
                                }
                                case 2: {
                                    v15 = 11;
                                    break;
                                }
                                case 3: {
                                    v15 = 5;
                                    break;
                                }
                                case 4: {
                                    v15 = 55;
                                    break;
                                }
                                case 5: {
                                    v15 = 18;
                                    break;
                                }
                                default: {
                                    v15 = 46;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                d5_0.a = var13;
                d5_0.b = new String[10];
                var0_7 = 4362096308803946011L;
                var6_8 = new long[35];
                var3_9 = 0;
                var4_10 = "\u00ad\u00c9\u00ea\u00fd\u00bc#\u008ap\u00b1\u0095]\u00e5\u0087[\u0004\u001f0\u00a2\u007f\u0093R\u001d\u00e38\u00b1F\u009a\u00be\u0087\u00d5/a{\u00c3\u0002\"\u008d\u00a5b\u0085EM\u00bf\f\u00a8\u00c8,\u00fc\u001c>>\u0081`\u00af>'\u00d8[\u009d\u00c4\u000bw\u0084\u00d5@\u00e5\u00d4\u00a3\t\u00cdxLX\u00c3\u001fjC8\u00d2\u009fq\u00f9]\u00bald\u00f6\u00e4^\u009e\u00e4\u0092\u00f4pt\u001a\u00b1\b\u000f\u00de\u00f9p1\u00e08bu\u0093\u00dd\u009d;\u00d6x\u00c5\u00cf\u00b1\u00c9\u00d8\u00car\u00a6\u00e1\u00c0\u0090w\u00fc\u009c\u0081\f9\u00e7\u001bc2t>\u009fE^\u00b5W\u0092kCjj%:A\u0084\u00ba\u00c0\u00b7\u00dbeix\u00da8\u00a9\u0012\u0084\u008e\"A~f\u0081\u00e9\u00af\u008b\u0085\u000fBMY\u00f6X\u0007\u00fa\u00a2\u00a8\u0012\u00c2\u0001\u00ef\u00eb;>\u00da\u0015\u00d1\u00d8\u00d2L(\\\u00d2\u00df\u009fE\u0014P\u0090\u0011\u00c5Yd\u00ee\u00a8aYL\u0080\u009d\u00b7\u00cb\"\u00c9%8\u0082\t\u0091\u0092\u009b\u0093\u00a2\u0010x\u00fe\u00a8+p1\u00b0\u00b5%[\u00fc-\u009a\u00fb/\u00b2U(r\u00d2v\u00b8\u009b\u00c6\u00b0]\u009eX=\u00a3\u00b5 ?\u0092\u009e";
                var5_11 = "\u00ad\u00c9\u00ea\u00fd\u00bc#\u008ap\u00b1\u0095]\u00e5\u0087[\u0004\u001f0\u00a2\u007f\u0093R\u001d\u00e38\u00b1F\u009a\u00be\u0087\u00d5/a{\u00c3\u0002\"\u008d\u00a5b\u0085EM\u00bf\f\u00a8\u00c8,\u00fc\u001c>>\u0081`\u00af>'\u00d8[\u009d\u00c4\u000bw\u0084\u00d5@\u00e5\u00d4\u00a3\t\u00cdxLX\u00c3\u001fjC8\u00d2\u009fq\u00f9]\u00bald\u00f6\u00e4^\u009e\u00e4\u0092\u00f4pt\u001a\u00b1\b\u000f\u00de\u00f9p1\u00e08bu\u0093\u00dd\u009d;\u00d6x\u00c5\u00cf\u00b1\u00c9\u00d8\u00car\u00a6\u00e1\u00c0\u0090w\u00fc\u009c\u0081\f9\u00e7\u001bc2t>\u009fE^\u00b5W\u0092kCjj%:A\u0084\u00ba\u00c0\u00b7\u00dbeix\u00da8\u00a9\u0012\u0084\u008e\"A~f\u0081\u00e9\u00af\u008b\u0085\u000fBMY\u00f6X\u0007\u00fa\u00a2\u00a8\u0012\u00c2\u0001\u00ef\u00eb;>\u00da\u0015\u00d1\u00d8\u00d2L(\\\u00d2\u00df\u009fE\u0014P\u0090\u0011\u00c5Yd\u00ee\u00a8aYL\u0080\u009d\u00b7\u00cb\"\u00c9%8\u0082\t\u0091\u0092\u009b\u0093\u00a2\u0010x\u00fe\u00a8+p1\u00b0\u00b5%[\u00fc-\u009a\u00fb/\u00b2U(r\u00d2v\u00b8\u009b\u00c6\u00b0]\u009eX=\u00a3\u00b5 ?\u0092\u009e".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00c0@\u0097\u00bdC\u001d\u0086\u00f2am\u0095\f\u0004bO\u00a1";
                    var5_11 = "\u00c0@\u0097\u00bdC\u001d\u0086\u00f2am\u0095\f\u0004bO\u00a1".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        d5_0.c = var6_8;
        d5_0.d = new Integer[35];
        d5_0.o = null;
    }

    public String W(String string) {
        String string2;
        block7: {
            String string3;
            block6: {
                string2 = string;
                String string4 = d5_0.k();
                try {
                    string3 = string2;
                    if (string4 != null) break block6;
                    if (string3 != null) break block7;
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    throw d5_0.a(noSuchAlgorithmException);
                }
                string3 = "";
            }
            return string3;
        }
        String string5 = null;
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        try {
            string5 = Base64.getEncoder().encodeToString(messageDigest.digest(string2.getBytes("utf-8")));
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string5;
    }

    public static Key p() throws Exception {
        Key key;
        block2: {
            block3: {
                String string = d5_0.k();
                try {
                    key = o;
                    if (string != null) break block2;
                    if (key != null) break block3;
                }
                catch (Exception exception) {
                    throw d5_0.a(exception);
                }
                InputStream inputStream = new d5_0().getClass().getResourceAsStream("/sk");
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                byte[] byArray = new byte[d5_0.a(23142, 2246304965403897441L)];
                dataInputStream.readFully(byArray);
                DESKeySpec dESKeySpec = new DESKeySpec(byArray);
                o = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            }
            key = o;
        }
        return key;
    }

    public static HttpURLConnection P(String string) throws Exception {
        HttpURLConnection httpURLConnection;
        block9: {
            HttpURLConnection httpURLConnection2;
            block10: {
                String string2;
                block11: {
                    boolean bl;
                    URL uRL;
                    block7: {
                        block8: {
                            uRL = new URL(string);
                            string2 = d5_0.k();
                            httpURLConnection2 = null;
                            try {
                                bl = string.startsWith("http://");
                                if (string2 != null) break block7;
                                if (!bl) break block8;
                            }
                            catch (Exception exception) {
                                throw d5_0.a(exception);
                            }
                            httpURLConnection2 = (HttpURLConnection)uRL.openConnection();
                            break block11;
                        }
                        bl = string.startsWith("https://");
                    }
                    if (bl) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)uRL.openConnection();
                        httpsURLConnection.setHostnameVerifier(new WP());
                        httpURLConnection2 = httpsURLConnection;
                    }
                }
                try {
                    try {
                        httpURLConnection = httpURLConnection2;
                        if (string2 != null) break block9;
                        if (httpURLConnection == null) break block10;
                    }
                    catch (Exception exception) {
                        throw d5_0.a(exception);
                    }
                    httpURLConnection2.setConnectTimeout(d5_0.a(6238, 1060081166411836498L));
                    httpURLConnection2.setReadTimeout(d5_0.a(18374, 3271100564454601673L));
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setUseCaches(false);
                }
                catch (Exception exception) {
                    throw d5_0.a(exception);
                }
            }
            httpURLConnection = httpURLConnection2;
        }
        return httpURLConnection;
    }

    public static SSLContext h() throws Exception {
        gu_0 gu_02 = new gu_0();
        TrustManager[] trustManagerArray = new TrustManager[]{gu_02};
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, trustManagerArray, null);
        return sSLContext;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String v(byte[] byArray) {
        String string;
        block4: {
            block3: {
                string = d5_0.k();
                if (string != null) break block3;
                if (byArray.length == d5_0.a(3248, 3229199299207608501L)) break block4;
                System.err.println("MAC ��ַ����д� ");
            }
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n10 = 0;
        boolean bl = true;
        do {
            if (bl && !(bl = false) && string == null) continue;
            byte by = (byte)((byArray[n10] & d5_0.a(15729, 695599963701184842L)) >> 4);
            stringBuffer.append(Integer.toHexString(by));
            by = (byte)(byArray[n10] & d5_0.a(18902, 3412352378346700226L));
            stringBuffer.append(Integer.toHexString(by));
            stringBuffer.append("-");
            ++n10;
        } while (n10 < byArray.length);
        stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
        return stringBuffer.toString().toUpperCase();
    }

    public static String J(String string) {
        byte[] byArray = string.getBytes();
        return d5_0.D(byArray);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String D(byte[] byArray) {
        String string = null;
        String string2 = d5_0.k();
        char[] cArray = new char[d5_0.a(19507, 3874578032251533356L)];
        cArray[0] = d5_0.a(26612, 3163933981910979578L);
        cArray[1] = d5_0.a(30787, 5854175651467021402L);
        cArray[2] = d5_0.a(10705, 2277695507103489493L);
        cArray[3] = d5_0.a(4363, 3758876358924608784L);
        cArray[4] = d5_0.a(30248, 5200406912802636336L);
        cArray[5] = d5_0.a(17371, 6793066934448256974L);
        cArray[d5_0.a((int)1557, (long)2959555017750426119L)] = d5_0.a(14408, 3490581938833820767L);
        cArray[d5_0.a((int)31631, (long)9031396612920790925L)] = d5_0.a(23895, 336678624177973581L);
        cArray[d5_0.a((int)12171, (long)611632482239716237L)] = d5_0.a(24259, 3569596956282284767L);
        cArray[d5_0.a((int)28582, (long)3625655076196834213L)] = d5_0.a(11708, 7663030952970394045L);
        cArray[d5_0.a((int)28294, (long)3257841714071722640L)] = d5_0.a(30385, 225669063408009903L);
        cArray[d5_0.a((int)1575, (long)6787742301998232110L)] = d5_0.a(6450, 1579360011700612410L);
        cArray[d5_0.a((int)8344, (long)6880415635440243848L)] = d5_0.a(24799, 5914702393864541414L);
        cArray[d5_0.a((int)5274, (long)1591118012641124503L)] = d5_0.a(19164, 892716899146104534L);
        cArray[d5_0.a((int)4237, (long)3032814361248277648L)] = d5_0.a(2595, 582678517594996274L);
        cArray[d5_0.a((int)11120, (long)9146179084966436720L)] = d5_0.a(1162, 2039499911730933913L);
        char[] cArray2 = cArray;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byArray);
            byte[] byArray2 = messageDigest.digest();
            char[] cArray3 = new char[d5_0.a(29937, 6673814660389585097L)];
            int n10 = 0;
            int n11 = 0;
            boolean bl = true;
            do {
                if (bl && !(bl = false) && string2 == null) continue;
                byte by = byArray2[n11];
                cArray3[n10++] = cArray2[by >>> 4 & d5_0.a(11120, 9146179084966436720L)];
                cArray3[n10++] = cArray2[by & d5_0.a(11120, 9146179084966436720L)];
                ++n11;
            } while (n11 < d5_0.a(18624, 7755044807156301003L));
            return new String(cArray3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return string;
    }

    public static void b(String string) {
        V = string;
    }

    public static String k() {
        return V;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x28BD) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 68;
                    break;
                }
                case 1: {
                    n14 = 50;
                    break;
                }
                case 2: {
                    n14 = 113;
                    break;
                }
                case 3: {
                    n14 = 134;
                    break;
                }
                case 4: {
                    n14 = 10;
                    break;
                }
                case 5: {
                    n14 = 149;
                    break;
                }
                case 6: {
                    n14 = 26;
                    break;
                }
                case 7: {
                    n14 = 11;
                    break;
                }
                case 8: {
                    n14 = 49;
                    break;
                }
                case 9: {
                    n14 = 218;
                    break;
                }
                case 10: {
                    n14 = 52;
                    break;
                }
                case 11: {
                    n14 = 185;
                    break;
                }
                case 12: {
                    n14 = 54;
                    break;
                }
                case 13: {
                    n14 = 57;
                    break;
                }
                case 14: {
                    n14 = 75;
                    break;
                }
                case 15: {
                    n14 = 93;
                    break;
                }
                case 16: {
                    n14 = 85;
                    break;
                }
                case 17: {
                    n14 = 175;
                    break;
                }
                case 18: {
                    n14 = 172;
                    break;
                }
                case 19: {
                    n14 = 90;
                    break;
                }
                case 20: {
                    n14 = 31;
                    break;
                }
                case 21: {
                    n14 = 202;
                    break;
                }
                case 22: {
                    n14 = 16;
                    break;
                }
                case 23: {
                    n14 = 161;
                    break;
                }
                case 24: {
                    n14 = 150;
                    break;
                }
                case 25: {
                    n14 = 241;
                    break;
                }
                case 26: {
                    n14 = 209;
                    break;
                }
                case 27: {
                    n14 = 100;
                    break;
                }
                case 28: {
                    n14 = 199;
                    break;
                }
                case 29: {
                    n14 = 215;
                    break;
                }
                case 30: {
                    n14 = 166;
                    break;
                }
                case 31: {
                    n14 = 130;
                    break;
                }
                case 32: {
                    n14 = 21;
                    break;
                }
                case 33: {
                    n14 = 244;
                    break;
                }
                case 34: {
                    n14 = 234;
                    break;
                }
                case 35: {
                    n14 = 226;
                    break;
                }
                case 36: {
                    n14 = 69;
                    break;
                }
                case 37: {
                    n14 = 112;
                    break;
                }
                case 38: {
                    n14 = 105;
                    break;
                }
                case 39: {
                    n14 = 250;
                    break;
                }
                case 40: {
                    n14 = 233;
                    break;
                }
                case 41: {
                    n14 = 23;
                    break;
                }
                case 42: {
                    n14 = 84;
                    break;
                }
                case 43: {
                    n14 = 247;
                    break;
                }
                case 44: {
                    n14 = 46;
                    break;
                }
                case 45: {
                    n14 = 235;
                    break;
                }
                case 46: {
                    n14 = 111;
                    break;
                }
                case 47: {
                    n14 = 4;
                    break;
                }
                case 48: {
                    n14 = 192;
                    break;
                }
                case 49: {
                    n14 = 231;
                    break;
                }
                case 50: {
                    n14 = 145;
                    break;
                }
                case 51: {
                    n14 = 204;
                    break;
                }
                case 52: {
                    n14 = 99;
                    break;
                }
                case 53: {
                    n14 = 186;
                    break;
                }
                case 54: {
                    n14 = 168;
                    break;
                }
                case 55: {
                    n14 = 207;
                    break;
                }
                case 56: {
                    n14 = 124;
                    break;
                }
                case 57: {
                    n14 = 147;
                    break;
                }
                case 58: {
                    n14 = 104;
                    break;
                }
                case 59: {
                    n14 = 109;
                    break;
                }
                case 60: {
                    n14 = 3;
                    break;
                }
                case 61: {
                    n14 = 92;
                    break;
                }
                case 62: {
                    n14 = 232;
                    break;
                }
                case 63: {
                    n14 = 156;
                    break;
                }
                case 64: {
                    n14 = 67;
                    break;
                }
                case 65: {
                    n14 = 121;
                    break;
                }
                case 66: {
                    n14 = 24;
                    break;
                }
                case 67: {
                    n14 = 55;
                    break;
                }
                case 68: {
                    n14 = 79;
                    break;
                }
                case 69: {
                    n14 = 74;
                    break;
                }
                case 70: {
                    n14 = 87;
                    break;
                }
                case 71: {
                    n14 = 245;
                    break;
                }
                case 72: {
                    n14 = 201;
                    break;
                }
                case 73: {
                    n14 = 131;
                    break;
                }
                case 74: {
                    n14 = 217;
                    break;
                }
                case 75: {
                    n14 = 246;
                    break;
                }
                case 76: {
                    n14 = 210;
                    break;
                }
                case 77: {
                    n14 = 212;
                    break;
                }
                case 78: {
                    n14 = 73;
                    break;
                }
                case 79: {
                    n14 = 63;
                    break;
                }
                case 80: {
                    n14 = 170;
                    break;
                }
                case 81: {
                    n14 = 70;
                    break;
                }
                case 82: {
                    n14 = 116;
                    break;
                }
                case 83: {
                    n14 = 249;
                    break;
                }
                case 84: {
                    n14 = 162;
                    break;
                }
                case 85: {
                    n14 = 97;
                    break;
                }
                case 86: {
                    n14 = 222;
                    break;
                }
                case 87: {
                    n14 = 146;
                    break;
                }
                case 88: {
                    n14 = 187;
                    break;
                }
                case 89: {
                    n14 = 251;
                    break;
                }
                case 90: {
                    n14 = 225;
                    break;
                }
                case 91: {
                    n14 = 61;
                    break;
                }
                case 92: {
                    n14 = 213;
                    break;
                }
                case 93: {
                    n14 = 219;
                    break;
                }
                case 94: {
                    n14 = 194;
                    break;
                }
                case 95: {
                    n14 = 252;
                    break;
                }
                case 96: {
                    n14 = 197;
                    break;
                }
                case 97: {
                    n14 = 148;
                    break;
                }
                case 98: {
                    n14 = 221;
                    break;
                }
                case 99: {
                    n14 = 138;
                    break;
                }
                case 100: {
                    n14 = 169;
                    break;
                }
                case 101: {
                    n14 = 155;
                    break;
                }
                case 102: {
                    n14 = 44;
                    break;
                }
                case 103: {
                    n14 = 118;
                    break;
                }
                case 104: {
                    n14 = 153;
                    break;
                }
                case 105: {
                    n14 = 157;
                    break;
                }
                case 106: {
                    n14 = 151;
                    break;
                }
                case 107: {
                    n14 = 193;
                    break;
                }
                case 108: {
                    n14 = 48;
                    break;
                }
                case 109: {
                    n14 = 183;
                    break;
                }
                case 110: {
                    n14 = 240;
                    break;
                }
                case 111: {
                    n14 = 243;
                    break;
                }
                case 112: {
                    n14 = 34;
                    break;
                }
                case 113: {
                    n14 = 171;
                    break;
                }
                case 114: {
                    n14 = 12;
                    break;
                }
                case 115: {
                    n14 = 255;
                    break;
                }
                case 116: {
                    n14 = 19;
                    break;
                }
                case 117: {
                    n14 = 228;
                    break;
                }
                case 118: {
                    n14 = 224;
                    break;
                }
                case 119: {
                    n14 = 18;
                    break;
                }
                case 120: {
                    n14 = 71;
                    break;
                }
                case 121: {
                    n14 = 122;
                    break;
                }
                case 122: {
                    n14 = 7;
                    break;
                }
                case 123: {
                    n14 = 125;
                    break;
                }
                case 124: {
                    n14 = 126;
                    break;
                }
                case 125: {
                    n14 = 37;
                    break;
                }
                case 126: {
                    n14 = 137;
                    break;
                }
                case 127: {
                    n14 = 43;
                    break;
                }
                case 128: {
                    n14 = 58;
                    break;
                }
                case 129: {
                    n14 = 211;
                    break;
                }
                case 130: {
                    n14 = 154;
                    break;
                }
                case 131: {
                    n14 = 51;
                    break;
                }
                case 132: {
                    n14 = 205;
                    break;
                }
                case 133: {
                    n14 = 141;
                    break;
                }
                case 134: {
                    n14 = 32;
                    break;
                }
                case 135: {
                    n14 = 101;
                    break;
                }
                case 136: {
                    n14 = 189;
                    break;
                }
                case 137: {
                    n14 = 140;
                    break;
                }
                case 138: {
                    n14 = 254;
                    break;
                }
                case 139: {
                    n14 = 81;
                    break;
                }
                case 140: {
                    n14 = 82;
                    break;
                }
                case 141: {
                    n14 = 15;
                    break;
                }
                case 142: {
                    n14 = 60;
                    break;
                }
                case 143: {
                    n14 = 77;
                    break;
                }
                case 144: {
                    n14 = 165;
                    break;
                }
                case 145: {
                    n14 = 20;
                    break;
                }
                case 146: {
                    n14 = 117;
                    break;
                }
                case 147: {
                    n14 = 132;
                    break;
                }
                case 148: {
                    n14 = 152;
                    break;
                }
                case 149: {
                    n14 = 139;
                    break;
                }
                case 150: {
                    n14 = 2;
                    break;
                }
                case 151: {
                    n14 = 177;
                    break;
                }
                case 152: {
                    n14 = 5;
                    break;
                }
                case 153: {
                    n14 = 65;
                    break;
                }
                case 154: {
                    n14 = 86;
                    break;
                }
                case 155: {
                    n14 = 42;
                    break;
                }
                case 156: {
                    n14 = 167;
                    break;
                }
                case 157: {
                    n14 = 198;
                    break;
                }
                case 158: {
                    n14 = 88;
                    break;
                }
                case 159: {
                    n14 = 236;
                    break;
                }
                case 160: {
                    n14 = 39;
                    break;
                }
                case 161: {
                    n14 = 1;
                    break;
                }
                case 162: {
                    n14 = 128;
                    break;
                }
                case 163: {
                    n14 = 174;
                    break;
                }
                case 164: {
                    n14 = 229;
                    break;
                }
                case 165: {
                    n14 = 115;
                    break;
                }
                case 166: {
                    n14 = 142;
                    break;
                }
                case 167: {
                    n14 = 239;
                    break;
                }
                case 168: {
                    n14 = 143;
                    break;
                }
                case 169: {
                    n14 = 0;
                    break;
                }
                case 170: {
                    n14 = 196;
                    break;
                }
                case 171: {
                    n14 = 33;
                    break;
                }
                case 172: {
                    n14 = 40;
                    break;
                }
                case 173: {
                    n14 = 223;
                    break;
                }
                case 174: {
                    n14 = 94;
                    break;
                }
                case 175: {
                    n14 = 248;
                    break;
                }
                case 176: {
                    n14 = 45;
                    break;
                }
                case 177: {
                    n14 = 103;
                    break;
                }
                case 178: {
                    n14 = 89;
                    break;
                }
                case 179: {
                    n14 = 227;
                    break;
                }
                case 180: {
                    n14 = 158;
                    break;
                }
                case 181: {
                    n14 = 182;
                    break;
                }
                case 182: {
                    n14 = 178;
                    break;
                }
                case 183: {
                    n14 = 102;
                    break;
                }
                case 184: {
                    n14 = 191;
                    break;
                }
                case 185: {
                    n14 = 214;
                    break;
                }
                case 186: {
                    n14 = 195;
                    break;
                }
                case 187: {
                    n14 = 35;
                    break;
                }
                case 188: {
                    n14 = 78;
                    break;
                }
                case 189: {
                    n14 = 179;
                    break;
                }
                case 190: {
                    n14 = 17;
                    break;
                }
                case 191: {
                    n14 = 62;
                    break;
                }
                case 192: {
                    n14 = 237;
                    break;
                }
                case 193: {
                    n14 = 129;
                    break;
                }
                case 194: {
                    n14 = 206;
                    break;
                }
                case 195: {
                    n14 = 98;
                    break;
                }
                case 196: {
                    n14 = 200;
                    break;
                }
                case 197: {
                    n14 = 242;
                    break;
                }
                case 198: {
                    n14 = 64;
                    break;
                }
                case 199: {
                    n14 = 27;
                    break;
                }
                case 200: {
                    n14 = 133;
                    break;
                }
                case 201: {
                    n14 = 14;
                    break;
                }
                case 202: {
                    n14 = 160;
                    break;
                }
                case 203: {
                    n14 = 184;
                    break;
                }
                case 204: {
                    n14 = 29;
                    break;
                }
                case 205: {
                    n14 = 106;
                    break;
                }
                case 206: {
                    n14 = 123;
                    break;
                }
                case 207: {
                    n14 = 220;
                    break;
                }
                case 208: {
                    n14 = 80;
                    break;
                }
                case 209: {
                    n14 = 230;
                    break;
                }
                case 210: {
                    n14 = 22;
                    break;
                }
                case 211: {
                    n14 = 159;
                    break;
                }
                case 212: {
                    n14 = 253;
                    break;
                }
                case 213: {
                    n14 = 38;
                    break;
                }
                case 214: {
                    n14 = 203;
                    break;
                }
                case 215: {
                    n14 = 108;
                    break;
                }
                case 216: {
                    n14 = 9;
                    break;
                }
                case 217: {
                    n14 = 56;
                    break;
                }
                case 218: {
                    n14 = 176;
                    break;
                }
                case 219: {
                    n14 = 136;
                    break;
                }
                case 220: {
                    n14 = 119;
                    break;
                }
                case 221: {
                    n14 = 28;
                    break;
                }
                case 222: {
                    n14 = 216;
                    break;
                }
                case 223: {
                    n14 = 238;
                    break;
                }
                case 224: {
                    n14 = 6;
                    break;
                }
                case 225: {
                    n14 = 180;
                    break;
                }
                case 226: {
                    n14 = 30;
                    break;
                }
                case 227: {
                    n14 = 107;
                    break;
                }
                case 228: {
                    n14 = 95;
                    break;
                }
                case 229: {
                    n14 = 188;
                    break;
                }
                case 230: {
                    n14 = 59;
                    break;
                }
                case 231: {
                    n14 = 13;
                    break;
                }
                case 232: {
                    n14 = 144;
                    break;
                }
                case 233: {
                    n14 = 53;
                    break;
                }
                case 234: {
                    n14 = 47;
                    break;
                }
                case 235: {
                    n14 = 127;
                    break;
                }
                case 236: {
                    n14 = 66;
                    break;
                }
                case 237: {
                    n14 = 208;
                    break;
                }
                case 238: {
                    n14 = 164;
                    break;
                }
                case 239: {
                    n14 = 96;
                    break;
                }
                case 240: {
                    n14 = 36;
                    break;
                }
                case 241: {
                    n14 = 110;
                    break;
                }
                case 242: {
                    n14 = 173;
                    break;
                }
                case 243: {
                    n14 = 25;
                    break;
                }
                case 244: {
                    n14 = 72;
                    break;
                }
                case 245: {
                    n14 = 76;
                    break;
                }
                case 246: {
                    n14 = 181;
                    break;
                }
                case 247: {
                    n14 = 135;
                    break;
                }
                case 248: {
                    n14 = 190;
                    break;
                }
                case 249: {
                    n14 = 83;
                    break;
                }
                case 250: {
                    n14 = 114;
                    break;
                }
                case 251: {
                    n14 = 41;
                    break;
                }
                case 252: {
                    n14 = 163;
                    break;
                }
                case 253: {
                    n14 = 91;
                    break;
                }
                case 254: {
                    n14 = 120;
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
            d5_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3419;
        if (d[n11] == null) {
            d5_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

