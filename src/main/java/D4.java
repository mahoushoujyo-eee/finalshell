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

public class D4 {
    static Key W;
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
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "\u007f%g\u0016\u009a\u0003\u0018\u00be\u00e7\u0007\u00dd\u009e\u009f<\u00d7\u00f5\u00c8\u0003\u0080\u0014\u00f4\b[\u00daO\u00b4\u0084\u00f1\u00c2(\u0004~\u00cc\u00f3\u000e\u0003\u00a7{`";
                        var12_3 = "\u007f%g\u0016\u009a\u0003\u0018\u00be\u00e7\u0007\u00dd\u009e\u009f<\u00d7\u00f5\u00c8\u0003\u0080\u0014\u00f4\b[\u00daO\u00b4\u0084\u00f1\u00c2(\u0004~\u00cc\u00f3\u000e\u0003\u00a7{`".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 63;
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
                            var10_2 = "yw'X\u95ae\u6532\u6224\u57e8\u9566\u655e\u6238\u959a\u6513\u62a2\u5115\u95b6\u0098\u0003\u000e\u00a6\u00f1";
                            var12_3 = "yw'X\u95ae\u6532\u6224\u57e8\u9566\u655e\u6238\u959a\u6513\u62a2\u5115\u95b6\u0098\u0003\u000e\u00a6\u00f1".length();
                            var9_4 = 17;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 2;
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
                                    v15 = 63;
                                    break;
                                }
                                case 1: {
                                    v15 = 84;
                                    break;
                                }
                                case 2: {
                                    v15 = 10;
                                    break;
                                }
                                case 3: {
                                    v15 = 55;
                                    break;
                                }
                                case 4: {
                                    v15 = 125;
                                    break;
                                }
                                case 5: {
                                    v15 = 29;
                                    break;
                                }
                                default: {
                                    v15 = 23;
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
                D4.a = var13;
                D4.b = new String[9];
                var0_7 = 320067700998929062L;
                var6_8 = new long[35];
                var3_9 = 0;
                var4_10 = "$\u00b3\u00acN\u00fc\u00ce;o\u00ceR\u0090^\u00cb\tK\u008d\u00ab\u0010\u0083:U\u0014#\u00fa\u00d6\u00f7\f\u00e9\u0084\u009f4\u0015\u00cf\u00c1\u00b3\u0088\u0094\t\u00f6\u00ce=]\u0083\u00ea\u00a4\u0000\u00b3\u00d0WBL<\u00e3\u001d \u00cc\u00a3\u00e3\u00f5,IQs\u00e7o\u00f0\u0005\u00e5\u00113\u0084\u0084\b\u0092\t\u00f3\u00bf)\u00d3&\u0081\u0017^\u00deUd\u0093\u00d2\u001b\u007f\u00f3\u000b{\u008a>)\u00ea\u00df\u00b7\u00bc\u00ef+\u00a1\u0081E\u0097\u00e0\u00e8_\u00f1\u007f\u0096W\u001fM~(\u009a\u0019nq\u0094\u00deS\u00de\u009cD\u0017\u00ad\u00a2\u00d0\u00d5;iq\u00b6\u00182i\u00cd\u00e5\u00b6j\u00ab\u00e2\u00cfle\u00159\u00e3\u00cd\u00ea\u0099F\u0001$?\u00a1\u00b9U\u009b\u0081Y\u00c8\u0089\u0012\u00c3\u00e5\u00c2b?S!\u0004\f\u00f5Bo&\u00c7\u00a8\u00e8\u00e8aSN\u00c9x\u00c7\u0095\u00e7\u001ci\u001b,z\u00b4\u00144\u00ef\u008aj\"\u00aaZ\u00b5\u001a\u001e\u0099uO#\u008f\u00a6\u00ff\u00e0\u007f\u00d3\u00d4DR\u0082)\u00b8LA\u00c9\u00c5\u0088\\=\u00e4\u0017X\u008a\u00c3J@E\u00d3X\u00f1\u00c8\u00f7\n\u00b3\u001f\u0011`\u0090xs\u009f\u00e1e\u00a0O\u0097\u0090mx\u00d0`";
                var5_11 = "$\u00b3\u00acN\u00fc\u00ce;o\u00ceR\u0090^\u00cb\tK\u008d\u00ab\u0010\u0083:U\u0014#\u00fa\u00d6\u00f7\f\u00e9\u0084\u009f4\u0015\u00cf\u00c1\u00b3\u0088\u0094\t\u00f6\u00ce=]\u0083\u00ea\u00a4\u0000\u00b3\u00d0WBL<\u00e3\u001d \u00cc\u00a3\u00e3\u00f5,IQs\u00e7o\u00f0\u0005\u00e5\u00113\u0084\u0084\b\u0092\t\u00f3\u00bf)\u00d3&\u0081\u0017^\u00deUd\u0093\u00d2\u001b\u007f\u00f3\u000b{\u008a>)\u00ea\u00df\u00b7\u00bc\u00ef+\u00a1\u0081E\u0097\u00e0\u00e8_\u00f1\u007f\u0096W\u001fM~(\u009a\u0019nq\u0094\u00deS\u00de\u009cD\u0017\u00ad\u00a2\u00d0\u00d5;iq\u00b6\u00182i\u00cd\u00e5\u00b6j\u00ab\u00e2\u00cfle\u00159\u00e3\u00cd\u00ea\u0099F\u0001$?\u00a1\u00b9U\u009b\u0081Y\u00c8\u0089\u0012\u00c3\u00e5\u00c2b?S!\u0004\f\u00f5Bo&\u00c7\u00a8\u00e8\u00e8aSN\u00c9x\u00c7\u0095\u00e7\u001ci\u001b,z\u00b4\u00144\u00ef\u008aj\"\u00aaZ\u00b5\u001a\u001e\u0099uO#\u008f\u00a6\u00ff\u00e0\u007f\u00d3\u00d4DR\u0082)\u00b8LA\u00c9\u00c5\u0088\\=\u00e4\u0017X\u008a\u00c3J@E\u00d3X\u00f1\u00c8\u00f7\n\u00b3\u001f\u0011`\u0090xs\u009f\u00e1e\u00a0O\u0097\u0090mx\u00d0`".length();
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
                    var4_10 = "H,-\u00c3\u00b4b\u00fc\u009c\u001b\u00c0\u00cas\u00d9\u008b\u00a4 ";
                    var5_11 = "H,-\u00c3\u00b4b\u00fc\u009c\u001b\u00c0\u00cas\u00d9\u008b\u00a4 ".length();
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
        D4.c = var6_8;
        D4.d = new Integer[35];
        D4.W = null;
    }

    public String N(String string) {
        String string2;
        block7: {
            String string3;
            block6: {
                string2 = string;
                String[] stringArray = QI.N();
                try {
                    string3 = string2;
                    if (stringArray == null) break block6;
                    if (string3 != null) break block7;
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    throw D4.a(noSuchAlgorithmException);
                }
                string3 = "";
            }
            return string3;
        }
        String string4 = null;
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        try {
            string4 = Base64.getEncoder().encodeToString(messageDigest.digest(string2.getBytes("utf-8")));
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string4;
    }

    public static Key B() throws Exception {
        Key key;
        block2: {
            block3: {
                String[] stringArray = QI.N();
                try {
                    key = W;
                    if (stringArray == null) break block2;
                    if (key != null) break block3;
                }
                catch (Exception exception) {
                    throw D4.a(exception);
                }
                InputStream inputStream = new D4().getClass().getResourceAsStream("/sk");
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                byte[] byArray = new byte[D4.a(16623, 7693825535196855970L)];
                dataInputStream.readFully(byArray);
                DESKeySpec dESKeySpec = new DESKeySpec(byArray);
                W = SecretKeyFactory.getInstance("DES").generateSecret(dESKeySpec);
            }
            key = W;
        }
        return key;
    }

    public static HttpURLConnection J(String string) throws Exception {
        HttpURLConnection httpURLConnection;
        block9: {
            HttpURLConnection httpURLConnection2;
            block10: {
                String[] stringArray;
                block11: {
                    boolean bl;
                    URL uRL;
                    block7: {
                        block8: {
                            uRL = new URL(string);
                            stringArray = QI.N();
                            httpURLConnection2 = null;
                            try {
                                bl = string.startsWith("http://");
                                if (stringArray == null) break block7;
                                if (!bl) break block8;
                            }
                            catch (Exception exception) {
                                throw D4.a(exception);
                            }
                            httpURLConnection2 = (HttpURLConnection)uRL.openConnection();
                            break block11;
                        }
                        bl = string.startsWith("https://");
                    }
                    if (bl) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)uRL.openConnection();
                        httpsURLConnection.setHostnameVerifier(new CJ());
                        httpURLConnection2 = httpsURLConnection;
                    }
                }
                try {
                    try {
                        httpURLConnection = httpURLConnection2;
                        if (stringArray == null) break block9;
                        if (httpURLConnection == null) break block10;
                    }
                    catch (Exception exception) {
                        throw D4.a(exception);
                    }
                    httpURLConnection2.setConnectTimeout(D4.a(24012, 3601574614571410335L));
                    httpURLConnection2.setReadTimeout(D4.a(49, 446526540195577467L));
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setUseCaches(false);
                }
                catch (Exception exception) {
                    throw D4.a(exception);
                }
            }
            httpURLConnection = httpURLConnection2;
        }
        return httpURLConnection;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String t(byte[] byArray) {
        String[] stringArray;
        block4: {
            block3: {
                stringArray = QI.N();
                if (stringArray == null) break block3;
                if (byArray.length == D4.a(29179, 946986895819624378L)) break block4;
                System.err.println("MAC 锟斤拷址锟斤拷锟斤拷写锟?");
            }
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n10 = 0;
        boolean bl = true;
        do {
            if (bl && !(bl = false) && stringArray != null) continue;
            byte by = (byte)((byArray[n10] & D4.a(15253, 4818791199180359104L)) >> 4);
            stringBuffer.append(Integer.toHexString(by));
            by = (byte)(byArray[n10] & D4.a(3965, 7982202080223080740L));
            stringBuffer.append(Integer.toHexString(by));
            stringBuffer.append("-");
            ++n10;
        } while (n10 < byArray.length);
        stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
        return stringBuffer.toString().toUpperCase();
    }

    public static String n(String string) {
        byte[] byArray = string.getBytes();
        return D4.X(byArray);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String X(byte[] byArray) {
        String string = null;
        char[] cArray = new char[D4.a(1206, 1997038258308496115L)];
        cArray[0] = D4.a(22294, 6492404357910849860L);
        cArray[1] = D4.a(16451, 8090282190596636179L);
        cArray[2] = D4.a(6115, 458635799545784754L);
        cArray[3] = D4.a(25920, 8992898672462551828L);
        cArray[4] = D4.a(22045, 7914359283646785617L);
        cArray[5] = D4.a(23979, 6368094717800342525L);
        cArray[D4.a((int)13662, (long)5212660352096176918L)] = D4.a(9650, 5807380920428272629L);
        cArray[D4.a((int)32662, (long)6507340697900925390L)] = D4.a(14121, 7388212748230625654L);
        cArray[D4.a((int)30499, (long)7010334558333520254L)] = D4.a(18164, 6473774465066956983L);
        cArray[D4.a((int)14410, (long)7213971872541509171L)] = D4.a(25965, 6564224905970342694L);
        cArray[D4.a((int)25105, (long)599825653391580243L)] = D4.a(24733, 4526961384979062503L);
        cArray[D4.a((int)11855, (long)4843572274267918342L)] = D4.a(26468, 4897161694948219198L);
        cArray[D4.a((int)12856, (long)9203173386590882916L)] = D4.a(28811, 5806017674941222608L);
        cArray[D4.a((int)5299, (long)9160518307473074891L)] = D4.a(25680, 3592319293032815118L);
        cArray[D4.a((int)6353, (long)2772683590722758293L)] = D4.a(20663, 7686635940993429239L);
        cArray[D4.a((int)233, (long)5383067758453964478L)] = D4.a(11366, 7235449349070983720L);
        char[] cArray2 = cArray;
        String[] stringArray = QI.N();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byArray);
            byte[] byArray2 = messageDigest.digest();
            char[] cArray3 = new char[D4.a(30687, 1452364224152422809L)];
            int n10 = 0;
            int n11 = 0;
            boolean bl = true;
            do {
                if (bl && !(bl = false) && stringArray != null) continue;
                byte by = byArray2[n11];
                cArray3[n10++] = cArray2[by >>> 4 & D4.a(3965, 7982202080223080740L)];
                cArray3[n10++] = cArray2[by & D4.a(3965, 7982202080223080740L)];
                ++n11;
            } while (n11 < D4.a(20766, 1526381180354195281L));
            return new String(cArray3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE0CE) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 237;
                    break;
                }
                case 1: {
                    n14 = 254;
                    break;
                }
                case 2: {
                    n14 = 67;
                    break;
                }
                case 3: {
                    n14 = 218;
                    break;
                }
                case 4: {
                    n14 = 71;
                    break;
                }
                case 5: {
                    n14 = 145;
                    break;
                }
                case 6: {
                    n14 = 251;
                    break;
                }
                case 7: {
                    n14 = 248;
                    break;
                }
                case 8: {
                    n14 = 130;
                    break;
                }
                case 9: {
                    n14 = 26;
                    break;
                }
                case 10: {
                    n14 = 33;
                    break;
                }
                case 11: {
                    n14 = 210;
                    break;
                }
                case 12: {
                    n14 = 5;
                    break;
                }
                case 13: {
                    n14 = 120;
                    break;
                }
                case 14: {
                    n14 = 27;
                    break;
                }
                case 15: {
                    n14 = 219;
                    break;
                }
                case 16: {
                    n14 = 110;
                    break;
                }
                case 17: {
                    n14 = 32;
                    break;
                }
                case 18: {
                    n14 = 221;
                    break;
                }
                case 19: {
                    n14 = 74;
                    break;
                }
                case 20: {
                    n14 = 124;
                    break;
                }
                case 21: {
                    n14 = 11;
                    break;
                }
                case 22: {
                    n14 = 118;
                    break;
                }
                case 23: {
                    n14 = 49;
                    break;
                }
                case 24: {
                    n14 = 24;
                    break;
                }
                case 25: {
                    n14 = 199;
                    break;
                }
                case 26: {
                    n14 = 69;
                    break;
                }
                case 27: {
                    n14 = 143;
                    break;
                }
                case 28: {
                    n14 = 44;
                    break;
                }
                case 29: {
                    n14 = 125;
                    break;
                }
                case 30: {
                    n14 = 217;
                    break;
                }
                case 31: {
                    n14 = 155;
                    break;
                }
                case 32: {
                    n14 = 12;
                    break;
                }
                case 33: {
                    n14 = 159;
                    break;
                }
                case 34: {
                    n14 = 170;
                    break;
                }
                case 35: {
                    n14 = 65;
                    break;
                }
                case 36: {
                    n14 = 136;
                    break;
                }
                case 37: {
                    n14 = 177;
                    break;
                }
                case 38: {
                    n14 = 100;
                    break;
                }
                case 39: {
                    n14 = 109;
                    break;
                }
                case 40: {
                    n14 = 38;
                    break;
                }
                case 41: {
                    n14 = 222;
                    break;
                }
                case 42: {
                    n14 = 89;
                    break;
                }
                case 43: {
                    n14 = 77;
                    break;
                }
                case 44: {
                    n14 = 9;
                    break;
                }
                case 45: {
                    n14 = 152;
                    break;
                }
                case 46: {
                    n14 = 196;
                    break;
                }
                case 47: {
                    n14 = 241;
                    break;
                }
                case 48: {
                    n14 = 202;
                    break;
                }
                case 49: {
                    n14 = 249;
                    break;
                }
                case 50: {
                    n14 = 46;
                    break;
                }
                case 51: {
                    n14 = 60;
                    break;
                }
                case 52: {
                    n14 = 34;
                    break;
                }
                case 53: {
                    n14 = 51;
                    break;
                }
                case 54: {
                    n14 = 17;
                    break;
                }
                case 55: {
                    n14 = 212;
                    break;
                }
                case 56: {
                    n14 = 122;
                    break;
                }
                case 57: {
                    n14 = 97;
                    break;
                }
                case 58: {
                    n14 = 70;
                    break;
                }
                case 59: {
                    n14 = 247;
                    break;
                }
                case 60: {
                    n14 = 93;
                    break;
                }
                case 61: {
                    n14 = 200;
                    break;
                }
                case 62: {
                    n14 = 15;
                    break;
                }
                case 63: {
                    n14 = 45;
                    break;
                }
                case 64: {
                    n14 = 132;
                    break;
                }
                case 65: {
                    n14 = 104;
                    break;
                }
                case 66: {
                    n14 = 160;
                    break;
                }
                case 67: {
                    n14 = 146;
                    break;
                }
                case 68: {
                    n14 = 167;
                    break;
                }
                case 69: {
                    n14 = 19;
                    break;
                }
                case 70: {
                    n14 = 227;
                    break;
                }
                case 71: {
                    n14 = 187;
                    break;
                }
                case 72: {
                    n14 = 211;
                    break;
                }
                case 73: {
                    n14 = 25;
                    break;
                }
                case 74: {
                    n14 = 141;
                    break;
                }
                case 75: {
                    n14 = 231;
                    break;
                }
                case 76: {
                    n14 = 108;
                    break;
                }
                case 77: {
                    n14 = 185;
                    break;
                }
                case 78: {
                    n14 = 142;
                    break;
                }
                case 79: {
                    n14 = 53;
                    break;
                }
                case 80: {
                    n14 = 83;
                    break;
                }
                case 81: {
                    n14 = 139;
                    break;
                }
                case 82: {
                    n14 = 66;
                    break;
                }
                case 83: {
                    n14 = 137;
                    break;
                }
                case 84: {
                    n14 = 135;
                    break;
                }
                case 85: {
                    n14 = 138;
                    break;
                }
                case 86: {
                    n14 = 230;
                    break;
                }
                case 87: {
                    n14 = 115;
                    break;
                }
                case 88: {
                    n14 = 99;
                    break;
                }
                case 89: {
                    n14 = 243;
                    break;
                }
                case 90: {
                    n14 = 47;
                    break;
                }
                case 91: {
                    n14 = 88;
                    break;
                }
                case 92: {
                    n14 = 134;
                    break;
                }
                case 93: {
                    n14 = 119;
                    break;
                }
                case 94: {
                    n14 = 2;
                    break;
                }
                case 95: {
                    n14 = 214;
                    break;
                }
                case 96: {
                    n14 = 226;
                    break;
                }
                case 97: {
                    n14 = 176;
                    break;
                }
                case 98: {
                    n14 = 195;
                    break;
                }
                case 99: {
                    n14 = 240;
                    break;
                }
                case 100: {
                    n14 = 78;
                    break;
                }
                case 101: {
                    n14 = 106;
                    break;
                }
                case 102: {
                    n14 = 174;
                    break;
                }
                case 103: {
                    n14 = 0;
                    break;
                }
                case 104: {
                    n14 = 216;
                    break;
                }
                case 105: {
                    n14 = 175;
                    break;
                }
                case 106: {
                    n14 = 20;
                    break;
                }
                case 107: {
                    n14 = 201;
                    break;
                }
                case 108: {
                    n14 = 229;
                    break;
                }
                case 109: {
                    n14 = 73;
                    break;
                }
                case 110: {
                    n14 = 131;
                    break;
                }
                case 111: {
                    n14 = 232;
                    break;
                }
                case 112: {
                    n14 = 58;
                    break;
                }
                case 113: {
                    n14 = 72;
                    break;
                }
                case 114: {
                    n14 = 157;
                    break;
                }
                case 115: {
                    n14 = 105;
                    break;
                }
                case 116: {
                    n14 = 96;
                    break;
                }
                case 117: {
                    n14 = 209;
                    break;
                }
                case 118: {
                    n14 = 59;
                    break;
                }
                case 119: {
                    n14 = 23;
                    break;
                }
                case 120: {
                    n14 = 239;
                    break;
                }
                case 121: {
                    n14 = 30;
                    break;
                }
                case 122: {
                    n14 = 22;
                    break;
                }
                case 123: {
                    n14 = 114;
                    break;
                }
                case 124: {
                    n14 = 79;
                    break;
                }
                case 125: {
                    n14 = 215;
                    break;
                }
                case 126: {
                    n14 = 242;
                    break;
                }
                case 127: {
                    n14 = 16;
                    break;
                }
                case 128: {
                    n14 = 43;
                    break;
                }
                case 129: {
                    n14 = 129;
                    break;
                }
                case 130: {
                    n14 = 55;
                    break;
                }
                case 131: {
                    n14 = 81;
                    break;
                }
                case 132: {
                    n14 = 40;
                    break;
                }
                case 133: {
                    n14 = 225;
                    break;
                }
                case 134: {
                    n14 = 54;
                    break;
                }
                case 135: {
                    n14 = 63;
                    break;
                }
                case 136: {
                    n14 = 68;
                    break;
                }
                case 137: {
                    n14 = 95;
                    break;
                }
                case 138: {
                    n14 = 236;
                    break;
                }
                case 139: {
                    n14 = 180;
                    break;
                }
                case 140: {
                    n14 = 52;
                    break;
                }
                case 141: {
                    n14 = 161;
                    break;
                }
                case 142: {
                    n14 = 31;
                    break;
                }
                case 143: {
                    n14 = 107;
                    break;
                }
                case 144: {
                    n14 = 87;
                    break;
                }
                case 145: {
                    n14 = 92;
                    break;
                }
                case 146: {
                    n14 = 183;
                    break;
                }
                case 147: {
                    n14 = 205;
                    break;
                }
                case 148: {
                    n14 = 117;
                    break;
                }
                case 149: {
                    n14 = 188;
                    break;
                }
                case 150: {
                    n14 = 50;
                    break;
                }
                case 151: {
                    n14 = 102;
                    break;
                }
                case 152: {
                    n14 = 8;
                    break;
                }
                case 153: {
                    n14 = 235;
                    break;
                }
                case 154: {
                    n14 = 85;
                    break;
                }
                case 155: {
                    n14 = 156;
                    break;
                }
                case 156: {
                    n14 = 80;
                    break;
                }
                case 157: {
                    n14 = 37;
                    break;
                }
                case 158: {
                    n14 = 150;
                    break;
                }
                case 159: {
                    n14 = 116;
                    break;
                }
                case 160: {
                    n14 = 29;
                    break;
                }
                case 161: {
                    n14 = 86;
                    break;
                }
                case 162: {
                    n14 = 171;
                    break;
                }
                case 163: {
                    n14 = 164;
                    break;
                }
                case 164: {
                    n14 = 168;
                    break;
                }
                case 165: {
                    n14 = 179;
                    break;
                }
                case 166: {
                    n14 = 75;
                    break;
                }
                case 167: {
                    n14 = 220;
                    break;
                }
                case 168: {
                    n14 = 169;
                    break;
                }
                case 169: {
                    n14 = 192;
                    break;
                }
                case 170: {
                    n14 = 98;
                    break;
                }
                case 171: {
                    n14 = 91;
                    break;
                }
                case 172: {
                    n14 = 250;
                    break;
                }
                case 173: {
                    n14 = 41;
                    break;
                }
                case 174: {
                    n14 = 213;
                    break;
                }
                case 175: {
                    n14 = 10;
                    break;
                }
                case 176: {
                    n14 = 208;
                    break;
                }
                case 177: {
                    n14 = 206;
                    break;
                }
                case 178: {
                    n14 = 101;
                    break;
                }
                case 179: {
                    n14 = 166;
                    break;
                }
                case 180: {
                    n14 = 165;
                    break;
                }
                case 181: {
                    n14 = 194;
                    break;
                }
                case 182: {
                    n14 = 234;
                    break;
                }
                case 183: {
                    n14 = 244;
                    break;
                }
                case 184: {
                    n14 = 203;
                    break;
                }
                case 185: {
                    n14 = 153;
                    break;
                }
                case 186: {
                    n14 = 64;
                    break;
                }
                case 187: {
                    n14 = 191;
                    break;
                }
                case 188: {
                    n14 = 245;
                    break;
                }
                case 189: {
                    n14 = 148;
                    break;
                }
                case 190: {
                    n14 = 238;
                    break;
                }
                case 191: {
                    n14 = 36;
                    break;
                }
                case 192: {
                    n14 = 48;
                    break;
                }
                case 193: {
                    n14 = 186;
                    break;
                }
                case 194: {
                    n14 = 1;
                    break;
                }
                case 195: {
                    n14 = 147;
                    break;
                }
                case 196: {
                    n14 = 204;
                    break;
                }
                case 197: {
                    n14 = 140;
                    break;
                }
                case 198: {
                    n14 = 39;
                    break;
                }
                case 199: {
                    n14 = 121;
                    break;
                }
                case 200: {
                    n14 = 90;
                    break;
                }
                case 201: {
                    n14 = 3;
                    break;
                }
                case 202: {
                    n14 = 144;
                    break;
                }
                case 203: {
                    n14 = 103;
                    break;
                }
                case 204: {
                    n14 = 21;
                    break;
                }
                case 205: {
                    n14 = 252;
                    break;
                }
                case 206: {
                    n14 = 14;
                    break;
                }
                case 207: {
                    n14 = 184;
                    break;
                }
                case 208: {
                    n14 = 255;
                    break;
                }
                case 209: {
                    n14 = 57;
                    break;
                }
                case 210: {
                    n14 = 7;
                    break;
                }
                case 211: {
                    n14 = 62;
                    break;
                }
                case 212: {
                    n14 = 193;
                    break;
                }
                case 213: {
                    n14 = 13;
                    break;
                }
                case 214: {
                    n14 = 149;
                    break;
                }
                case 215: {
                    n14 = 6;
                    break;
                }
                case 216: {
                    n14 = 112;
                    break;
                }
                case 217: {
                    n14 = 158;
                    break;
                }
                case 218: {
                    n14 = 4;
                    break;
                }
                case 219: {
                    n14 = 94;
                    break;
                }
                case 220: {
                    n14 = 35;
                    break;
                }
                case 221: {
                    n14 = 133;
                    break;
                }
                case 222: {
                    n14 = 127;
                    break;
                }
                case 223: {
                    n14 = 61;
                    break;
                }
                case 224: {
                    n14 = 42;
                    break;
                }
                case 225: {
                    n14 = 113;
                    break;
                }
                case 226: {
                    n14 = 151;
                    break;
                }
                case 227: {
                    n14 = 189;
                    break;
                }
                case 228: {
                    n14 = 253;
                    break;
                }
                case 229: {
                    n14 = 18;
                    break;
                }
                case 230: {
                    n14 = 76;
                    break;
                }
                case 231: {
                    n14 = 56;
                    break;
                }
                case 232: {
                    n14 = 84;
                    break;
                }
                case 233: {
                    n14 = 162;
                    break;
                }
                case 234: {
                    n14 = 197;
                    break;
                }
                case 235: {
                    n14 = 82;
                    break;
                }
                case 236: {
                    n14 = 154;
                    break;
                }
                case 237: {
                    n14 = 246;
                    break;
                }
                case 238: {
                    n14 = 163;
                    break;
                }
                case 239: {
                    n14 = 126;
                    break;
                }
                case 240: {
                    n14 = 178;
                    break;
                }
                case 241: {
                    n14 = 207;
                    break;
                }
                case 242: {
                    n14 = 173;
                    break;
                }
                case 243: {
                    n14 = 182;
                    break;
                }
                case 244: {
                    n14 = 198;
                    break;
                }
                case 245: {
                    n14 = 172;
                    break;
                }
                case 246: {
                    n14 = 224;
                    break;
                }
                case 247: {
                    n14 = 190;
                    break;
                }
                case 248: {
                    n14 = 223;
                    break;
                }
                case 249: {
                    n14 = 123;
                    break;
                }
                case 250: {
                    n14 = 233;
                    break;
                }
                case 251: {
                    n14 = 111;
                    break;
                }
                case 252: {
                    n14 = 28;
                    break;
                }
                case 253: {
                    n14 = 128;
                    break;
                }
                case 254: {
                    n14 = 181;
                    break;
                }
                default: {
                    n14 = 228;
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
            D4.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3E58;
        if (d[n11] == null) {
            D4.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

