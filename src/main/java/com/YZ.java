/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ip_2;
import com.uJ;
import com.y1_0;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
abstract class YZ
implements ip_2 {
    Signature k;
    KeyFactory n;
    private static final String[] a;
    private static final String[] b;

    YZ() {
    }

    abstract String d();

    /*
     * Unable to fully structure code
     */
    @Override
    public void k() throws Exception {
        block32: {
            block37: {
                block36: {
                    block35: {
                        block33: {
                            block34: {
                                block31: {
                                    block29: {
                                        block30: {
                                            var2_1 = this.d();
                                            var1_2 = y1_0.Q();
                                            var3_3 = YZ.a(-14389, -16828);
                                            try {
                                                try {
                                                    try {
                                                        v0 = var2_1;
                                                        if (!var1_2) break block29;
                                                        if (v0.equals(YZ.a(-14398, 4708))) break block30;
                                                    }
                                                    catch (Exception v1) {
                                                        throw YZ.a(v1);
                                                    }
                                                    v2 = var2_1.equals(YZ.a(-14396, 24054));
                                                    if (!var1_2) break block31;
                                                }
                                                catch (Exception v3) {
                                                    throw YZ.a(v3);
                                                }
                                                if (v2) {
                                                }
                                                ** GOTO lbl30
                                            }
                                            catch (Exception v4) {
                                                throw YZ.a(v4);
                                            }
                                        }
                                        v0 = YZ.a(-14392, -11142);
                                    }
                                    var3_3 = v0;
                                    try {
                                        try {
                                            if (var1_2) break block32;
lbl30:
                                            // 2 sources

                                            v5 = var2_1;
                                            if (!var1_2) break block33;
                                        }
                                        catch (Exception v6) {
                                            throw YZ.a(v6);
                                        }
                                        v2 = v5.equals(YZ.a(-14387, 9116));
                                    }
                                    catch (Exception v7) {
                                        throw YZ.a(v7);
                                    }
                                }
                                try {
                                    try {
                                        if (v2) break block34;
                                        v8 = var2_1.equals(YZ.a(-14391, -9599));
                                        if (!var1_2) break block35;
                                    }
                                    catch (Exception v9) {
                                        throw YZ.a(v9);
                                    }
                                    if (v8) {
                                    }
                                    ** GOTO lbl59
                                }
                                catch (Exception v10) {
                                    throw YZ.a(v10);
                                }
                            }
                            v5 = YZ.a(-14390, 1162);
                        }
                        var3_3 = v5;
                        try {
                            if (var1_2) break block32;
lbl59:
                            // 2 sources

                            v8 = var2_1.equals(YZ.a(-14399, 3270));
                        }
                        catch (Exception v11) {
                            throw YZ.a(v11);
                        }
                    }
                    try {
                        if (!var1_2) break block36;
                        if (v8) {
                        }
                        ** GOTO lbl75
                    }
                    catch (Exception v12) {
                        throw YZ.a(v12);
                    }
                    var3_3 = YZ.a(-14397, 16376);
                    try {
                        try {
                            if (var1_2) break block32;
lbl75:
                            // 2 sources

                            v13 = var2_1;
                            if (!var1_2) break block37;
                        }
                        catch (Exception v14) {
                            throw YZ.a(v14);
                        }
                        v8 = v13.equals(YZ.a(-14395, 15972));
                    }
                    catch (Exception v15) {
                        throw YZ.a(v15);
                    }
                }
                if (!v8) break block32;
                v13 = YZ.a(-14386, -27637);
            }
            var3_3 = v13;
        }
        this.k = Signature.getInstance(var3_3);
        this.n = KeyFactory.getInstance(YZ.a(-14388, -22472));
    }

    @Override
    public void Q(byte[] byArray, byte[] byArray2) throws Exception {
        RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(new BigInteger(byArray2), new BigInteger(byArray));
        PublicKey publicKey = this.n.generatePublic(rSAPublicKeySpec);
        this.k.initVerify(publicKey);
    }

    @Override
    public void i(byte[] byArray, byte[] byArray2) throws Exception {
        RSAPrivateKeySpec rSAPrivateKeySpec = new RSAPrivateKeySpec(new BigInteger(byArray2), new BigInteger(byArray));
        PrivateKey privateKey = this.n.generatePrivate(rSAPrivateKeySpec);
        this.k.initSign(privateKey);
    }

    @Override
    public byte[] k() throws Exception {
        byte[] byArray = this.k.sign();
        return byArray;
    }

    @Override
    public void d(byte[] byArray) throws Exception {
        this.k.update(byArray);
    }

    @Override
    public boolean g(byte[] byArray) throws Exception {
        boolean bl;
        block34: {
            block35: {
                int n10;
                int n11;
                int n12;
                block36: {
                    uJ uJ2;
                    block37: {
                        boolean bl2;
                        block32: {
                            n12 = 0;
                            n11 = 0;
                            uJ2 = new uJ(byArray);
                            String string = new String(uJ2.S(), StandardCharsets.UTF_8);
                            bl2 = y1_0.D();
                            try {
                                block33: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        n10 = string.equals(YZ.a(-14394, 25006));
                                                                                        if (bl2) break block32;
                                                                                        if (n10 != 0) break block33;
                                                                                    }
                                                                                    catch (Exception exception) {
                                                                                        throw YZ.a(exception);
                                                                                    }
                                                                                    n10 = string.equals(YZ.a(-14373, -23138)) ? 1 : 0;
                                                                                    if (bl2) break block32;
                                                                                }
                                                                                catch (Exception exception) {
                                                                                    throw YZ.a(exception);
                                                                                }
                                                                                if (n10 != 0) break block33;
                                                                            }
                                                                            catch (Exception exception) {
                                                                                throw YZ.a(exception);
                                                                            }
                                                                            n10 = string.equals(YZ.a(-14393, -14386)) ? 1 : 0;
                                                                            if (bl2) break block32;
                                                                        }
                                                                        catch (Exception exception) {
                                                                            throw YZ.a(exception);
                                                                        }
                                                                        if (n10 != 0) break block33;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        throw YZ.a(exception);
                                                                    }
                                                                    n10 = string.equals(YZ.a(-14376, -21690)) ? 1 : 0;
                                                                    if (bl2) break block32;
                                                                }
                                                                catch (Exception exception) {
                                                                    throw YZ.a(exception);
                                                                }
                                                                if (n10 != 0) break block33;
                                                            }
                                                            catch (Exception exception) {
                                                                throw YZ.a(exception);
                                                            }
                                                            n10 = string.equals(YZ.a(-14385, 6534)) ? 1 : 0;
                                                            if (bl2) break block32;
                                                        }
                                                        catch (Exception exception) {
                                                            throw YZ.a(exception);
                                                        }
                                                        if (n10 != 0) break block33;
                                                    }
                                                    catch (Exception exception) {
                                                        throw YZ.a(exception);
                                                    }
                                                    n10 = string.equals(YZ.a(-14375, -6595)) ? 1 : 0;
                                                    if (bl2) break block32;
                                                }
                                                catch (Exception exception) {
                                                    throw YZ.a(exception);
                                                }
                                                if (n10 != 0) break block33;
                                            }
                                            catch (Exception exception) {
                                                throw YZ.a(exception);
                                            }
                                            bl = string.equals(YZ.a(-14400, 25526));
                                            if (bl2) break block34;
                                        }
                                        catch (Exception exception) {
                                            throw YZ.a(exception);
                                        }
                                        if (!bl) break block35;
                                    }
                                    catch (Exception exception) {
                                        throw YZ.a(exception);
                                    }
                                }
                                n10 = string.equals(this.d());
                            }
                            catch (Exception exception) {
                                throw YZ.a(exception);
                            }
                        }
                        try {
                            try {
                                if (bl2) break block36;
                                if (n10 != 0) break block37;
                            }
                            catch (Exception exception) {
                                throw YZ.a(exception);
                            }
                            return false;
                        }
                        catch (Exception exception) {
                            throw YZ.a(exception);
                        }
                    }
                    n11 = uJ2.d();
                    n12 = uJ2.R();
                    n10 = n11;
                }
                byte[] byArray2 = new byte[n10];
                System.arraycopy(byArray, n12, byArray2, 0, n11);
                byArray = byArray2;
            }
            bl = this.k.verify(byArray);
        }
        return bl;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[19];
                var3_1 = 0;
                var2_2 = "\u00ca\u0094\u00c1gq\u00f5\u0012x;\u0002\u00deNE\t\ta\u00f7\u009c\u0093w\u0097z\rQ\u00d9\u00bf\u008d\u00f5\u0011;M\u00cdh\u00d4e!\u000b\u00b9\u0001\u00a2\u0095\u0014.\u000e\u001f.8Y\r(\u00f0\u0090\u00af\u0014\u00b6\u0083=\u00daf6\u00a4}\f4\u008b6\u0084\u00a6\u0092\u00c9\u00f3\u001e\u00d2\u00bf\u00a5\u0003\u00d9q\u008f\u0016E\u00ef0\bO\u0018\u00d5\u00c5\u00c3\u00b5\u00c1\u00bf\u00a2\u00d4q^\u00f8{r\u008b\u00ab\u00e5\r\u00aa\u001f\u00c0U\u001d\b\u00c1,\u0092D?\u00e0\\\u0016\u00b65NS\u0080s,\u00a8\u00fc\u0018&\u000bSa\u00e3\u00aa\u00aa\u00e58X\u00e2\u009f\u0016\u00bf\u00ebo\u0088\u00a4\b\u00a8\u00c7l\u00f54\u00b0\u0018\u00d6\u00a2\u009a\u0082\u00e3=\u0098B\u0087\r\u000f\u00e6tk\u0081\u00ee\u0019\u00f0\u0089\u00df\\\u00930\f\u00d7=JR)H8\u00a8 \u00be|\u00cb\u0016\u00b9\u00ba\u00af\u00a2\u00bcM\u00abo\f\u00e08\u0015\u009a\u0083\u0091\u00f6\u00e4n\u00f1)\u00db\u00b1\u0016\u0001\u00c7\u00b8\r^\u00b8\u00f7\u00d1\u00877I\u00ef\u00b3\u00deS\u001f\u00bcS\u00fa\u008e\u00baE\f\u00ec\u00ed-H\u00c5\u000b\u00a5\u00c0\u0093\u00b4\u000ei\u0007C\u00b5\u00f0CWq\u00d6\u0016\u0095\u00f5*K\fp\u00bd\u00c8\u00ce\u0014`\u008a\u009bQ\u00fa\u00ac\u0089%\\@n\u009c";
                var4_3 = "\u00ca\u0094\u00c1gq\u00f5\u0012x;\u0002\u00deNE\t\ta\u00f7\u009c\u0093w\u0097z\rQ\u00d9\u00bf\u008d\u00f5\u0011;M\u00cdh\u00d4e!\u000b\u00b9\u0001\u00a2\u0095\u0014.\u000e\u001f.8Y\r(\u00f0\u0090\u00af\u0014\u00b6\u0083=\u00daf6\u00a4}\f4\u008b6\u0084\u00a6\u0092\u00c9\u00f3\u001e\u00d2\u00bf\u00a5\u0003\u00d9q\u008f\u0016E\u00ef0\bO\u0018\u00d5\u00c5\u00c3\u00b5\u00c1\u00bf\u00a2\u00d4q^\u00f8{r\u008b\u00ab\u00e5\r\u00aa\u001f\u00c0U\u001d\b\u00c1,\u0092D?\u00e0\\\u0016\u00b65NS\u0080s,\u00a8\u00fc\u0018&\u000bSa\u00e3\u00aa\u00aa\u00e58X\u00e2\u009f\u0016\u00bf\u00ebo\u0088\u00a4\b\u00a8\u00c7l\u00f54\u00b0\u0018\u00d6\u00a2\u009a\u0082\u00e3=\u0098B\u0087\r\u000f\u00e6tk\u0081\u00ee\u0019\u00f0\u0089\u00df\\\u00930\f\u00d7=JR)H8\u00a8 \u00be|\u00cb\u0016\u00b9\u00ba\u00af\u00a2\u00bcM\u00abo\f\u00e08\u0015\u009a\u0083\u0091\u00f6\u00e4n\u00f1)\u00db\u00b1\u0016\u0001\u00c7\u00b8\r^\u00b8\u00f7\u00d1\u00877I\u00ef\u00b3\u00deS\u001f\u00bcS\u00fa\u008e\u00baE\f\u00ec\u00ed-H\u00c5\u000b\u00a5\u00c0\u0093\u00b4\u000ei\u0007C\u00b5\u00f0CWq\u00d6\u0016\u0095\u00f5*K\fp\u00bd\u00c8\u00ce\u0014`\u008a\u009bQ\u00fa\u00ac\u0089%\\@n\u009c".length();
                var1_4 = 22;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 40;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "S\u008fn\u0098\u0018\u0096\u00a3\u0088\u0091\u0080\u0017\u0085\u00e3\r\"\u00bb\u000e[0\u0013\u007fj\f\u00ec\u00df\u00b1\u0092\u00ca\u00cc\u00d8\u00a4\u00a0\u00a3\u00f0\u00f4";
                    var4_3 = "S\u008fn\u0098\u0018\u0096\u00a3\u0088\u0091\u0080\u0017\u0085\u00e3\r\"\u00bb\u000e[0\u0013\u007fj\f\u00ec\u00df\u00b1\u0092\u00ca\u00cc\u00d8\u00a4\u00a0\u00a3\u00f0\u00f4".length();
                    var1_4 = 22;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 126;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 22;
                            break;
                        }
                        case 1: {
                            v15 = 47;
                            break;
                        }
                        case 2: {
                            v15 = 2;
                            break;
                        }
                        case 3: {
                            v15 = 13;
                            break;
                        }
                        case 4: {
                            v15 = 51;
                            break;
                        }
                        case 5: {
                            v15 = 110;
                            break;
                        }
                        default: {
                            v15 = 42;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        YZ.a = var5;
        YZ.b = new String[19];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC7C9) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 42;
                    break;
                }
                case 1: {
                    n14 = 8;
                    break;
                }
                case 2: {
                    n14 = 173;
                    break;
                }
                case 3: {
                    n14 = 92;
                    break;
                }
                case 4: {
                    n14 = 232;
                    break;
                }
                case 5: {
                    n14 = 242;
                    break;
                }
                case 6: {
                    n14 = 6;
                    break;
                }
                case 7: {
                    n14 = 67;
                    break;
                }
                case 8: {
                    n14 = 90;
                    break;
                }
                case 9: {
                    n14 = 134;
                    break;
                }
                case 10: {
                    n14 = 36;
                    break;
                }
                case 11: {
                    n14 = 121;
                    break;
                }
                case 12: {
                    n14 = 91;
                    break;
                }
                case 13: {
                    n14 = 247;
                    break;
                }
                case 14: {
                    n14 = 182;
                    break;
                }
                case 15: {
                    n14 = 99;
                    break;
                }
                case 16: {
                    n14 = 88;
                    break;
                }
                case 17: {
                    n14 = 102;
                    break;
                }
                case 18: {
                    n14 = 138;
                    break;
                }
                case 19: {
                    n14 = 245;
                    break;
                }
                case 20: {
                    n14 = 78;
                    break;
                }
                case 21: {
                    n14 = 71;
                    break;
                }
                case 22: {
                    n14 = 69;
                    break;
                }
                case 23: {
                    n14 = 105;
                    break;
                }
                case 24: {
                    n14 = 11;
                    break;
                }
                case 25: {
                    n14 = 70;
                    break;
                }
                case 26: {
                    n14 = 60;
                    break;
                }
                case 27: {
                    n14 = 39;
                    break;
                }
                case 28: {
                    n14 = 98;
                    break;
                }
                case 29: {
                    n14 = 157;
                    break;
                }
                case 30: {
                    n14 = 205;
                    break;
                }
                case 31: {
                    n14 = 79;
                    break;
                }
                case 32: {
                    n14 = 120;
                    break;
                }
                case 33: {
                    n14 = 13;
                    break;
                }
                case 34: {
                    n14 = 195;
                    break;
                }
                case 35: {
                    n14 = 53;
                    break;
                }
                case 36: {
                    n14 = 128;
                    break;
                }
                case 37: {
                    n14 = 140;
                    break;
                }
                case 38: {
                    n14 = 56;
                    break;
                }
                case 39: {
                    n14 = 51;
                    break;
                }
                case 40: {
                    n14 = 124;
                    break;
                }
                case 41: {
                    n14 = 132;
                    break;
                }
                case 42: {
                    n14 = 61;
                    break;
                }
                case 43: {
                    n14 = 228;
                    break;
                }
                case 44: {
                    n14 = 154;
                    break;
                }
                case 45: {
                    n14 = 87;
                    break;
                }
                case 46: {
                    n14 = 80;
                    break;
                }
                case 47: {
                    n14 = 227;
                    break;
                }
                case 48: {
                    n14 = 106;
                    break;
                }
                case 49: {
                    n14 = 150;
                    break;
                }
                case 50: {
                    n14 = 166;
                    break;
                }
                case 51: {
                    n14 = 136;
                    break;
                }
                case 52: {
                    n14 = 21;
                    break;
                }
                case 53: {
                    n14 = 115;
                    break;
                }
                case 54: {
                    n14 = 64;
                    break;
                }
                case 55: {
                    n14 = 82;
                    break;
                }
                case 56: {
                    n14 = 30;
                    break;
                }
                case 57: {
                    n14 = 217;
                    break;
                }
                case 58: {
                    n14 = 93;
                    break;
                }
                case 59: {
                    n14 = 254;
                    break;
                }
                case 60: {
                    n14 = 253;
                    break;
                }
                case 61: {
                    n14 = 171;
                    break;
                }
                case 62: {
                    n14 = 15;
                    break;
                }
                case 63: {
                    n14 = 170;
                    break;
                }
                case 64: {
                    n14 = 2;
                    break;
                }
                case 65: {
                    n14 = 123;
                    break;
                }
                case 66: {
                    n14 = 23;
                    break;
                }
                case 67: {
                    n14 = 246;
                    break;
                }
                case 68: {
                    n14 = 97;
                    break;
                }
                case 69: {
                    n14 = 206;
                    break;
                }
                case 70: {
                    n14 = 65;
                    break;
                }
                case 71: {
                    n14 = 165;
                    break;
                }
                case 72: {
                    n14 = 83;
                    break;
                }
                case 73: {
                    n14 = 241;
                    break;
                }
                case 74: {
                    n14 = 31;
                    break;
                }
                case 75: {
                    n14 = 12;
                    break;
                }
                case 76: {
                    n14 = 199;
                    break;
                }
                case 77: {
                    n14 = 255;
                    break;
                }
                case 78: {
                    n14 = 43;
                    break;
                }
                case 79: {
                    n14 = 221;
                    break;
                }
                case 80: {
                    n14 = 164;
                    break;
                }
                case 81: {
                    n14 = 177;
                    break;
                }
                case 82: {
                    n14 = 84;
                    break;
                }
                case 83: {
                    n14 = 142;
                    break;
                }
                case 84: {
                    n14 = 176;
                    break;
                }
                case 85: {
                    n14 = 133;
                    break;
                }
                case 86: {
                    n14 = 48;
                    break;
                }
                case 87: {
                    n14 = 50;
                    break;
                }
                case 88: {
                    n14 = 152;
                    break;
                }
                case 89: {
                    n14 = 188;
                    break;
                }
                case 90: {
                    n14 = 119;
                    break;
                }
                case 91: {
                    n14 = 174;
                    break;
                }
                case 92: {
                    n14 = 226;
                    break;
                }
                case 93: {
                    n14 = 130;
                    break;
                }
                case 94: {
                    n14 = 94;
                    break;
                }
                case 95: {
                    n14 = 16;
                    break;
                }
                case 96: {
                    n14 = 32;
                    break;
                }
                case 97: {
                    n14 = 34;
                    break;
                }
                case 98: {
                    n14 = 52;
                    break;
                }
                case 99: {
                    n14 = 58;
                    break;
                }
                case 100: {
                    n14 = 163;
                    break;
                }
                case 101: {
                    n14 = 219;
                    break;
                }
                case 102: {
                    n14 = 147;
                    break;
                }
                case 103: {
                    n14 = 236;
                    break;
                }
                case 104: {
                    n14 = 95;
                    break;
                }
                case 105: {
                    n14 = 198;
                    break;
                }
                case 106: {
                    n14 = 72;
                    break;
                }
                case 107: {
                    n14 = 185;
                    break;
                }
                case 108: {
                    n14 = 209;
                    break;
                }
                case 109: {
                    n14 = 158;
                    break;
                }
                case 110: {
                    n14 = 169;
                    break;
                }
                case 111: {
                    n14 = 62;
                    break;
                }
                case 112: {
                    n14 = 159;
                    break;
                }
                case 113: {
                    n14 = 192;
                    break;
                }
                case 114: {
                    n14 = 27;
                    break;
                }
                case 115: {
                    n14 = 238;
                    break;
                }
                case 116: {
                    n14 = 191;
                    break;
                }
                case 117: {
                    n14 = 224;
                    break;
                }
                case 118: {
                    n14 = 122;
                    break;
                }
                case 119: {
                    n14 = 59;
                    break;
                }
                case 120: {
                    n14 = 116;
                    break;
                }
                case 121: {
                    n14 = 141;
                    break;
                }
                case 122: {
                    n14 = 17;
                    break;
                }
                case 123: {
                    n14 = 126;
                    break;
                }
                case 124: {
                    n14 = 151;
                    break;
                }
                case 125: {
                    n14 = 160;
                    break;
                }
                case 126: {
                    n14 = 146;
                    break;
                }
                case 127: {
                    n14 = 41;
                    break;
                }
                case 128: {
                    n14 = 108;
                    break;
                }
                case 129: {
                    n14 = 196;
                    break;
                }
                case 130: {
                    n14 = 18;
                    break;
                }
                case 131: {
                    n14 = 186;
                    break;
                }
                case 132: {
                    n14 = 168;
                    break;
                }
                case 133: {
                    n14 = 184;
                    break;
                }
                case 134: {
                    n14 = 125;
                    break;
                }
                case 135: {
                    n14 = 112;
                    break;
                }
                case 136: {
                    n14 = 203;
                    break;
                }
                case 137: {
                    n14 = 167;
                    break;
                }
                case 138: {
                    n14 = 145;
                    break;
                }
                case 139: {
                    n14 = 44;
                    break;
                }
                case 140: {
                    n14 = 187;
                    break;
                }
                case 141: {
                    n14 = 180;
                    break;
                }
                case 142: {
                    n14 = 109;
                    break;
                }
                case 143: {
                    n14 = 74;
                    break;
                }
                case 144: {
                    n14 = 212;
                    break;
                }
                case 145: {
                    n14 = 100;
                    break;
                }
                case 146: {
                    n14 = 214;
                    break;
                }
                case 147: {
                    n14 = 24;
                    break;
                }
                case 148: {
                    n14 = 68;
                    break;
                }
                case 149: {
                    n14 = 57;
                    break;
                }
                case 150: {
                    n14 = 216;
                    break;
                }
                case 151: {
                    n14 = 213;
                    break;
                }
                case 152: {
                    n14 = 54;
                    break;
                }
                case 153: {
                    n14 = 197;
                    break;
                }
                case 154: {
                    n14 = 148;
                    break;
                }
                case 155: {
                    n14 = 20;
                    break;
                }
                case 156: {
                    n14 = 190;
                    break;
                }
                case 157: {
                    n14 = 235;
                    break;
                }
                case 158: {
                    n14 = 14;
                    break;
                }
                case 159: {
                    n14 = 66;
                    break;
                }
                case 160: {
                    n14 = 208;
                    break;
                }
                case 161: {
                    n14 = 175;
                    break;
                }
                case 162: {
                    n14 = 104;
                    break;
                }
                case 163: {
                    n14 = 40;
                    break;
                }
                case 164: {
                    n14 = 3;
                    break;
                }
                case 165: {
                    n14 = 19;
                    break;
                }
                case 166: {
                    n14 = 162;
                    break;
                }
                case 167: {
                    n14 = 251;
                    break;
                }
                case 168: {
                    n14 = 161;
                    break;
                }
                case 169: {
                    n14 = 211;
                    break;
                }
                case 170: {
                    n14 = 28;
                    break;
                }
                case 171: {
                    n14 = 101;
                    break;
                }
                case 172: {
                    n14 = 10;
                    break;
                }
                case 173: {
                    n14 = 139;
                    break;
                }
                case 174: {
                    n14 = 149;
                    break;
                }
                case 175: {
                    n14 = 77;
                    break;
                }
                case 176: {
                    n14 = 107;
                    break;
                }
                case 177: {
                    n14 = 63;
                    break;
                }
                case 178: {
                    n14 = 55;
                    break;
                }
                case 179: {
                    n14 = 75;
                    break;
                }
                case 180: {
                    n14 = 200;
                    break;
                }
                case 181: {
                    n14 = 237;
                    break;
                }
                case 182: {
                    n14 = 229;
                    break;
                }
                case 183: {
                    n14 = 38;
                    break;
                }
                case 184: {
                    n14 = 156;
                    break;
                }
                case 185: {
                    n14 = 9;
                    break;
                }
                case 186: {
                    n14 = 33;
                    break;
                }
                case 187: {
                    n14 = 89;
                    break;
                }
                case 188: {
                    n14 = 49;
                    break;
                }
                case 189: {
                    n14 = 127;
                    break;
                }
                case 190: {
                    n14 = 110;
                    break;
                }
                case 191: {
                    n14 = 231;
                    break;
                }
                case 192: {
                    n14 = 137;
                    break;
                }
                case 193: {
                    n14 = 129;
                    break;
                }
                case 194: {
                    n14 = 225;
                    break;
                }
                case 195: {
                    n14 = 135;
                    break;
                }
                case 196: {
                    n14 = 181;
                    break;
                }
                case 197: {
                    n14 = 35;
                    break;
                }
                case 198: {
                    n14 = 244;
                    break;
                }
                case 199: {
                    n14 = 37;
                    break;
                }
                case 200: {
                    n14 = 81;
                    break;
                }
                case 201: {
                    n14 = 143;
                    break;
                }
                case 202: {
                    n14 = 113;
                    break;
                }
                case 203: {
                    n14 = 4;
                    break;
                }
                case 204: {
                    n14 = 1;
                    break;
                }
                case 205: {
                    n14 = 189;
                    break;
                }
                case 206: {
                    n14 = 7;
                    break;
                }
                case 207: {
                    n14 = 240;
                    break;
                }
                case 208: {
                    n14 = 210;
                    break;
                }
                case 209: {
                    n14 = 86;
                    break;
                }
                case 210: {
                    n14 = 46;
                    break;
                }
                case 211: {
                    n14 = 220;
                    break;
                }
                case 212: {
                    n14 = 234;
                    break;
                }
                case 213: {
                    n14 = 117;
                    break;
                }
                case 214: {
                    n14 = 96;
                    break;
                }
                case 215: {
                    n14 = 230;
                    break;
                }
                case 216: {
                    n14 = 194;
                    break;
                }
                case 217: {
                    n14 = 153;
                    break;
                }
                case 218: {
                    n14 = 111;
                    break;
                }
                case 219: {
                    n14 = 233;
                    break;
                }
                case 220: {
                    n14 = 178;
                    break;
                }
                case 221: {
                    n14 = 202;
                    break;
                }
                case 222: {
                    n14 = 47;
                    break;
                }
                case 223: {
                    n14 = 172;
                    break;
                }
                case 224: {
                    n14 = 76;
                    break;
                }
                case 225: {
                    n14 = 249;
                    break;
                }
                case 226: {
                    n14 = 223;
                    break;
                }
                case 227: {
                    n14 = 183;
                    break;
                }
                case 228: {
                    n14 = 248;
                    break;
                }
                case 229: {
                    n14 = 0;
                    break;
                }
                case 230: {
                    n14 = 103;
                    break;
                }
                case 231: {
                    n14 = 131;
                    break;
                }
                case 232: {
                    n14 = 45;
                    break;
                }
                case 233: {
                    n14 = 201;
                    break;
                }
                case 234: {
                    n14 = 73;
                    break;
                }
                case 235: {
                    n14 = 155;
                    break;
                }
                case 236: {
                    n14 = 204;
                    break;
                }
                case 237: {
                    n14 = 193;
                    break;
                }
                case 238: {
                    n14 = 243;
                    break;
                }
                case 239: {
                    n14 = 26;
                    break;
                }
                case 240: {
                    n14 = 29;
                    break;
                }
                case 241: {
                    n14 = 5;
                    break;
                }
                case 242: {
                    n14 = 179;
                    break;
                }
                case 243: {
                    n14 = 114;
                    break;
                }
                case 244: {
                    n14 = 250;
                    break;
                }
                case 245: {
                    n14 = 239;
                    break;
                }
                case 246: {
                    n14 = 207;
                    break;
                }
                case 247: {
                    n14 = 85;
                    break;
                }
                case 248: {
                    n14 = 218;
                    break;
                }
                case 249: {
                    n14 = 144;
                    break;
                }
                case 250: {
                    n14 = 222;
                    break;
                }
                case 251: {
                    n14 = 118;
                    break;
                }
                case 252: {
                    n14 = 252;
                    break;
                }
                case 253: {
                    n14 = 215;
                    break;
                }
                case 254: {
                    n14 = 22;
                    break;
                }
                default: {
                    n14 = 25;
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
            YZ.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

