/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NR;
import com.Q0;
import com.uJ;
import com.y1_0;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Lr
 */
abstract class lr_0
implements Q0 {
    Signature m;
    KeyFactory j;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;

    lr_0() {
    }

    abstract String X();

    /*
     * Unable to fully structure code
     */
    @Override
    public void k() throws Exception {
        block12: {
            block13: {
                block11: {
                    var2_1 = this.X();
                    var3_2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15668 out of bounds for length 6";
                    var1_3 = y1_0.Q();
                    try {
                        v0 = var2_1.equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 15678 out of bounds for length 6");
                        if (!var1_3) break block11;
                        if (v0) {
                        }
                        ** GOTO lbl16
                    }
                    catch (Exception v1) {
                        throw lr_0.a(v1);
                    }
                    var3_2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15667 out of bounds for length 6";
                    try {
                        try {
                            if (var1_3) break block12;
lbl16:
                            // 2 sources

                            v2 = var2_1;
                            if (!var1_3) break block13;
                        }
                        catch (Exception v3) {
                            throw lr_0.a(v3);
                        }
                        v0 = v2.equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 15677 out of bounds for length 6");
                    }
                    catch (Exception v4) {
                        throw lr_0.a(v4);
                    }
                }
                if (!v0) break block12;
                v2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15664 out of bounds for length 6";
            }
            var3_2 = v2;
        }
        this.m = Signature.getInstance(var3_2);
        this.j = KeyFactory.getInstance("\u0000ERR:ArrayIndexOutOfBoundsException:Index 15676 out of bounds for length 6");
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void T(byte[] var1_1, byte[] var2_2) throws Exception {
        block7: {
            block6: {
                var1_1 = lr_0.F(var1_1);
                var2_2 = lr_0.F(var2_2);
                var3_3 = y1_0.D();
                var4_4 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15673 out of bounds for length 6";
                try {
                    v0 = var1_1.length;
                    v1 = lr_0.a(21246, 3981263770132948190L);
                    if (var3_3) break block6;
                    if (v0 >= v1) {
                    }
                    ** GOTO lbl17
                }
                catch (Exception v2) {
                    throw lr_0.a(v2);
                }
                var4_4 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15670 out of bounds for length 6";
                try {
                    if (!var3_3) break block7;
lbl17:
                    // 2 sources

                    v0 = var1_1.length;
                    v1 = lr_0.a(6119, 4989468713581142475L);
                }
                catch (Exception v3) {
                    throw lr_0.a(v3);
                }
            }
            if (v0 >= v1) {
                var4_4 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15679 out of bounds for length 6";
            }
        }
        var5_5 = AlgorithmParameters.getInstance("\u0000ERR:ArrayIndexOutOfBoundsException:Index 15676 out of bounds for length 6");
        var5_5.init(new ECGenParameterSpec(var4_4));
        var6_6 = var5_5.getParameterSpec(ECParameterSpec.class);
        var7_7 = new ECPoint(new BigInteger(1, var1_1), new BigInteger(1, var2_2));
        var8_8 = this.j.generatePublic(new ECPublicKeySpec(var7_7, var6_6));
        this.m.initVerify(var8_8);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void N(byte[] var1_1) throws Exception {
        block7: {
            block6: {
                var1_1 = lr_0.F(var1_1);
                var3_2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15665 out of bounds for length 6";
                var2_3 = y1_0.D();
                try {
                    v0 = var1_1.length;
                    v1 = lr_0.a(25160, 2353833720034104426L);
                    if (var2_3) break block6;
                    if (v0 >= v1) {
                    }
                    ** GOTO lbl16
                }
                catch (Exception v2) {
                    throw lr_0.a(v2);
                }
                var3_2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15671 out of bounds for length 6";
                try {
                    if (!var2_3) break block7;
lbl16:
                    // 2 sources

                    v0 = var1_1.length;
                    v1 = lr_0.a(15835, 23714235633257468L);
                }
                catch (Exception v3) {
                    throw lr_0.a(v3);
                }
            }
            if (v0 >= v1) {
                var3_2 = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 15666 out of bounds for length 6";
            }
        }
        var4_4 = AlgorithmParameters.getInstance("\u0000ERR:ArrayIndexOutOfBoundsException:Index 15669 out of bounds for length 6");
        var4_4.init(new ECGenParameterSpec(var3_2));
        var5_5 = var4_4.getParameterSpec(ECParameterSpec.class);
        var6_6 = new BigInteger(1, var1_1);
        var7_7 = this.j.generatePrivate(new ECPrivateKeySpec(var6_6, var5_5));
        this.m.initSign(var7_7);
    }

    @Override
    public byte[] k() throws Exception {
        byte[] byArray;
        block22: {
            byte[] byArray2;
            block23: {
                int n10;
                int n11;
                block26: {
                    block27: {
                        int n12;
                        boolean bl;
                        block24: {
                            byArray2 = this.m.sign();
                            bl = y1_0.Q();
                            try {
                                block25: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                byArray = byArray2;
                                                                if (!bl) break block22;
                                                                if (byArray[0] != lr_0.a(6119, 4989468713581142475L)) break block23;
                                                            }
                                                            catch (Exception exception) {
                                                                throw lr_0.a(exception);
                                                            }
                                                            n12 = byArray2[1] + 2;
                                                            if (!bl) break block24;
                                                        }
                                                        catch (Exception exception) {
                                                            throw lr_0.a(exception);
                                                        }
                                                        if (n12 == byArray2.length) break block25;
                                                    }
                                                    catch (Exception exception) {
                                                        throw lr_0.a(exception);
                                                    }
                                                    byArray = byArray2;
                                                    if (!bl) break block22;
                                                }
                                                catch (Exception exception) {
                                                    throw lr_0.a(exception);
                                                }
                                                if ((byArray[1] & lr_0.a(28176, 6512412846924306486L)) == 0) break block23;
                                            }
                                            catch (Exception exception) {
                                                throw lr_0.a(exception);
                                            }
                                            byArray = byArray2;
                                            if (!bl) break block22;
                                        }
                                        catch (Exception exception) {
                                            throw lr_0.a(exception);
                                        }
                                        if ((byArray[2] & lr_0.a(6226, 6525345766547779190L)) + 3 != byArray2.length) break block23;
                                    }
                                    catch (Exception exception) {
                                        throw lr_0.a(exception);
                                    }
                                }
                                n12 = 3;
                            }
                            catch (Exception exception) {
                                throw lr_0.a(exception);
                            }
                        }
                        n11 = n12;
                        try {
                            try {
                                try {
                                    n10 = byArray2[1] & lr_0.a(17841, 3008414072576095120L);
                                    if (!bl) break block26;
                                    if (n10 == 0) break block27;
                                }
                                catch (Exception exception) {
                                    throw lr_0.a(exception);
                                }
                                n10 = (byArray2[2] & lr_0.a(19338, 6366338719621135780L)) + 3;
                                if (!bl) break block26;
                            }
                            catch (Exception exception) {
                                throw lr_0.a(exception);
                            }
                            if (n10 != byArray2.length) break block27;
                        }
                        catch (Exception exception) {
                            throw lr_0.a(exception);
                        }
                        n11 = 4;
                    }
                    n10 = byArray2[n11];
                }
                byte[] byArray3 = new byte[n10];
                byte[] byArray4 = new byte[byArray2[n11 + 2 + byArray2[n11]]];
                System.arraycopy(byArray2, n11 + 1, byArray3, 0, byArray3.length);
                System.arraycopy(byArray2, n11 + 3 + byArray2[n11], byArray4, 0, byArray4.length);
                byArray3 = lr_0.J(byArray3);
                byArray4 = lr_0.J(byArray4);
                uJ uJ2 = new uJ();
                uJ2.x(byArray3);
                uJ2.x(byArray4);
                byArray2 = new byte[uJ2.P()];
                uJ2.Z(0);
                uJ2.W(byArray2);
            }
            byArray = byArray2;
        }
        return byArray;
    }

    @Override
    public void d(byte[] byArray) throws Exception {
        this.m.update(byArray);
    }

    @Override
    public boolean g(byte[] byArray) throws Exception {
        int n10;
        block18: {
            block19: {
                byte[] byArray2;
                block23: {
                    int n11;
                    int n12;
                    byte[] byArray3;
                    byte[] byArray4;
                    block21: {
                        block22: {
                            boolean bl;
                            block17: {
                                block20: {
                                    int n13;
                                    block16: {
                                        bl = y1_0.Q();
                                        try {
                                            try {
                                                try {
                                                    n10 = byArray[0];
                                                    n13 = lr_0.a(6119, 4989468713581142475L);
                                                    if (!bl) break block16;
                                                    if (n10 != n13) break block17;
                                                }
                                                catch (Exception exception) {
                                                    throw lr_0.a(exception);
                                                }
                                                n10 = byArray[1] + 2;
                                                if (!bl) break block18;
                                            }
                                            catch (Exception exception) {
                                                throw lr_0.a(exception);
                                            }
                                            n13 = byArray.length;
                                        }
                                        catch (Exception exception) {
                                            throw lr_0.a(exception);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (n10 == n13) break block19;
                                                n10 = byArray[1] & lr_0.a(17841, 3008414072576095120L);
                                                if (!bl) break block20;
                                            }
                                            catch (Exception exception) {
                                                throw lr_0.a(exception);
                                            }
                                            if (n10 == 0) break block17;
                                        }
                                        catch (Exception exception) {
                                            throw lr_0.a(exception);
                                        }
                                        n10 = (byArray[2] & lr_0.a(19338, 6366338719621135780L)) + 3;
                                    }
                                    catch (Exception exception) {
                                        throw lr_0.a(exception);
                                    }
                                }
                                try {
                                    if (!bl) break block18;
                                    if (n10 == byArray.length) break block19;
                                }
                                catch (Exception exception) {
                                    throw lr_0.a(exception);
                                }
                            }
                            uJ uJ2 = new uJ(byArray);
                            uJ2.S();
                            uJ2.d();
                            byArray4 = uJ2.e();
                            byArray3 = uJ2.e();
                            byArray4 = lr_0.a(lr_0.F(byArray4));
                            byArray3 = lr_0.a(lr_0.F(byArray3));
                            byArray2 = null;
                            try {
                                n12 = byArray4.length;
                                n11 = lr_0.a(21246, 3981263770132948190L);
                                if (!bl) break block21;
                                if (n12 >= n11) break block22;
                            }
                            catch (Exception exception) {
                                throw lr_0.a(exception);
                            }
                            byArray2 = new byte[lr_0.a(6284, 4220649401221705385L) + byArray4.length + byArray3.length];
                            byArray2[0] = lr_0.a(6119, 4989468713581142475L);
                            byArray2[1] = (byte)(4 + byArray4.length + byArray3.length);
                            byArray2[2] = 2;
                            byArray2[3] = (byte)byArray4.length;
                            System.arraycopy(byArray4, 0, byArray2, 4, byArray4.length);
                            byArray2[byArray4.length + 4] = 2;
                            byArray2[byArray4.length + 5] = (byte)byArray3.length;
                            System.arraycopy(byArray3, 0, byArray2, lr_0.a(20324, 1278296689168300363L) + byArray4.length, byArray3.length);
                            break block23;
                        }
                        n12 = lr_0.a(20324, 1278296689168300363L) + byArray4.length + byArray3.length;
                        n11 = 1;
                    }
                    byArray2 = new byte[n12 + n11];
                    byArray2[0] = lr_0.a(6119, 4989468713581142475L);
                    byArray2[1] = lr_0.a(5174, 8935114547981279771L);
                    byArray2[2] = (byte)(4 + byArray4.length + byArray3.length);
                    byArray2[3] = 2;
                    byArray2[4] = (byte)byArray4.length;
                    System.arraycopy(byArray4, 0, byArray2, 5, byArray4.length);
                    byArray2[byArray4.length + 5] = 2;
                    byArray2[byArray4.length + lr_0.a((int)20324, (long)1278296689168300363L)] = (byte)byArray3.length;
                    System.arraycopy(byArray3, 0, byArray2, lr_0.a(2681, 4464435364681612378L) + byArray4.length, byArray3.length);
                }
                byArray = byArray2;
            }
            n10 = this.m.verify(byArray) ? 1 : 0;
        }
        return n10 != 0;
    }

    private static byte[] F(byte[] byArray) {
        boolean bl = y1_0.Q();
        int n10 = byArray[0] & lr_0.a(17841, 3008414072576095120L);
        if (bl) {
            if (n10 == 0) {
                return byArray;
            }
            n10 = byArray.length + 1;
        }
        byte[] byArray2 = new byte[n10];
        System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
        NR.C(byArray);
        return byArray2;
    }

    private static byte[] J(byte[] byArray) {
        boolean bl = y1_0.D();
        int n10 = byArray[0];
        if (!bl) {
            if (n10 != 0) {
                return byArray;
            }
            n10 = byArray.length - 1;
        }
        byte[] byArray2 = new byte[n10];
        System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
        NR.C(byArray);
        return byArray2;
    }

    private static byte[] a(byte[] byArray) {
        int n10;
        int n11;
        boolean bl;
        block7: {
            bl = y1_0.D();
            int n12 = byArray.length;
            if (!bl) {
                if (n12 < 2) {
                    return byArray;
                }
                n12 = n11 = 0;
            }
            while (n11 < byArray.length - 1) {
                n10 = byArray[n11];
                if (!bl && !bl) {
                    if (n10 != 0) break;
                    n10 = byArray[n11 + 1] & lr_0.a(17841, 3008414072576095120L);
                    if (!bl) {
                        if (n10 != 0) break;
                        ++n11;
                        if (!bl) continue;
                    }
                }
                break block7;
            }
            n10 = n11;
        }
        if (!bl) {
            if (n10 == 0) {
                return byArray;
            }
            n10 = byArray.length - n11;
        }
        byte[] byArray2 = new byte[n10];
        System.arraycopy(byArray, n11, byArray2, 0, byArray2.length);
        NR.C(byArray);
        return byArray2;
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
                        var13 = new String[13];
                        var11_1 = 0;
                        var10_2 = "`\u00a0\u000f-~\u00a6\u0090\u00b7\u0087E\u00ffb\u00a8\u00df\f\u0085\u00ae\u00ab\t&\u00b6\u00c1C=\u00f3R\u00eeK\t\u00ef\u008e\u00f8D\u001a\u0013\u00b6\u00f2\u00d7\t\u00df\u0007\u00feu\u00dd2\u00ae13\u000f'-\u00e7\u00fd\u009b\u00c9D\u00b2B\u0001\u00db9\u0005\b\u00bb\u000f$\u00fc\u0087\u00c1\u009e\u008e\u00cc\u009cS\u00c4\u00f9\u0081A\u001f3\t<\u00fc\u0082\nS\u00d0\\\u00c1/\u0013\u0099<\u00e5\u00d7\n\u001d(\u00d5^\u0096\u0087\u00f7\u00c6y~e{\u00cc\u00f2\u0002yU\t\u0096\u00d6\u00d7O\u00f9x\t\u00d4\u0085";
                        var12_3 = "`\u00a0\u000f-~\u00a6\u0090\u00b7\u0087E\u00ffb\u00a8\u00df\f\u0085\u00ae\u00ab\t&\u00b6\u00c1C=\u00f3R\u00eeK\t\u00ef\u008e\u00f8D\u001a\u0013\u00b6\u00f2\u00d7\t\u00df\u0007\u00feu\u00dd2\u00ae13\u000f'-\u00e7\u00fd\u009b\u00c9D\u00b2B\u0001\u00db9\u0005\b\u00bb\u000f$\u00fc\u0087\u00c1\u009e\u008e\u00cc\u009cS\u00c4\u00f9\u0081A\u001f3\t<\u00fc\u0082\nS\u00d0\\\u00c1/\u0013\u0099<\u00e5\u00d7\n\u001d(\u00d5^\u0096\u0087\u00f7\u00c6y~e{\u00cc\u00f2\u0002yU\t\u0096\u00d6\u00d7O\u00f9x\t\u00d4\u0085".length();
                        var9_4 = 2;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 105;
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
                            var10_2 = "\u008aK\u00bb\u0005\u00fd{\u00ea%:\u00b47\u008f\u00ecJ\u0007?n\u00b1\u00af\t\u0095D\u008b!O\u0084\u00c0\u00db\u00c2";
                            var12_3 = "\u008aK\u00bb\u0005\u00fd{\u00ea%:\u00b47\u008f\u00ecJ\u0007?n\u00b1\u00af\t\u0095D\u008b!O\u0084\u00c0\u00db\u00c2".length();
                            var9_4 = 19;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 27;
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
                                    v15 = 49;
                                    break;
                                }
                                case 1: {
                                    v15 = 96;
                                    break;
                                }
                                case 2: {
                                    v15 = 25;
                                    break;
                                }
                                case 3: {
                                    v15 = 100;
                                    break;
                                }
                                case 4: {
                                    v15 = 88;
                                    break;
                                }
                                case 5: {
                                    v15 = 31;
                                    break;
                                }
                                default: {
                                    v15 = 24;
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
                lr_0.a = var13;
                lr_0.b = new String[13];
                var0_7 = 6712375378014846983L;
                var6_8 = new long[12];
                var3_9 = 0;
                var4_10 = "\u0088\u00ebJOV\n\u00ae\u008e\u0097\"\u00c19\f\u00ef\u00ae\u00a8\u00fej\u00e4\u00bcV:X\u00b1p\u0084J\u0018\n\u00ad\u000b\u00cbLB\u00e4~\u0092Od\u0099\u00db\u00172\u00f8P\u0088s\u0017\u009d\u009a\u00c3\u0014\u00a3_T-~\u0016Pb7.\u00bcZ\u00a3\u00a6\u00d9\u00d8\u00a7J\u00a1\u00fc\u00f3\u00aa\u00dc\u0099\u0019\u0081\u00dd\u009d";
                var5_11 = "\u0088\u00ebJOV\n\u00ae\u008e\u0097\"\u00c19\f\u00ef\u00ae\u00a8\u00fej\u00e4\u00bcV:X\u00b1p\u0084J\u0018\n\u00ad\u000b\u00cbLB\u00e4~\u0092Od\u0099\u00db\u00172\u00f8P\u0088s\u0017\u009d\u009a\u00c3\u0014\u00a3_T-~\u0016Pb7.\u00bcZ\u00a3\u00a6\u00d9\u00d8\u00a7J\u00a1\u00fc\u00f3\u00aa\u00dc\u0099\u0019\u0081\u00dd\u009d".length();
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
                    var4_10 = "j\u00e0\u008b\u00b1{r}\\\u00a8\u0002\t\u00f9^\u00c8yJ";
                    var5_11 = "j\u00e0\u008b\u00b1{r}\\\u00a8\u0002\t\u00f9^\u00c8yJ".length();
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
        lr_0.d = var6_8;
        lr_0.e = new Integer[12];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1710) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 158;
                    break;
                }
                case 1: {
                    n14 = 217;
                    break;
                }
                case 2: {
                    n14 = 218;
                    break;
                }
                case 3: {
                    n14 = 25;
                    break;
                }
                case 4: {
                    n14 = 176;
                    break;
                }
                case 5: {
                    n14 = 189;
                    break;
                }
                case 6: {
                    n14 = 198;
                    break;
                }
                case 7: {
                    n14 = 113;
                    break;
                }
                case 8: {
                    n14 = 16;
                    break;
                }
                case 9: {
                    n14 = 252;
                    break;
                }
                case 10: {
                    n14 = 144;
                    break;
                }
                case 11: {
                    n14 = 168;
                    break;
                }
                case 12: {
                    n14 = 206;
                    break;
                }
                case 13: {
                    n14 = 221;
                    break;
                }
                case 14: {
                    n14 = 216;
                    break;
                }
                case 15: {
                    n14 = 92;
                    break;
                }
                case 16: {
                    n14 = 219;
                    break;
                }
                case 17: {
                    n14 = 223;
                    break;
                }
                case 18: {
                    n14 = 254;
                    break;
                }
                case 19: {
                    n14 = 87;
                    break;
                }
                case 20: {
                    n14 = 17;
                    break;
                }
                case 21: {
                    n14 = 242;
                    break;
                }
                case 22: {
                    n14 = 67;
                    break;
                }
                case 23: {
                    n14 = 164;
                    break;
                }
                case 24: {
                    n14 = 172;
                    break;
                }
                case 25: {
                    n14 = 98;
                    break;
                }
                case 26: {
                    n14 = 69;
                    break;
                }
                case 27: {
                    n14 = 147;
                    break;
                }
                case 28: {
                    n14 = 79;
                    break;
                }
                case 29: {
                    n14 = 62;
                    break;
                }
                case 30: {
                    n14 = 68;
                    break;
                }
                case 31: {
                    n14 = 58;
                    break;
                }
                case 32: {
                    n14 = 210;
                    break;
                }
                case 33: {
                    n14 = 212;
                    break;
                }
                case 34: {
                    n14 = 14;
                    break;
                }
                case 35: {
                    n14 = 5;
                    break;
                }
                case 36: {
                    n14 = 197;
                    break;
                }
                case 37: {
                    n14 = 119;
                    break;
                }
                case 38: {
                    n14 = 215;
                    break;
                }
                case 39: {
                    n14 = 126;
                    break;
                }
                case 40: {
                    n14 = 231;
                    break;
                }
                case 41: {
                    n14 = 20;
                    break;
                }
                case 42: {
                    n14 = 72;
                    break;
                }
                case 43: {
                    n14 = 170;
                    break;
                }
                case 44: {
                    n14 = 129;
                    break;
                }
                case 45: {
                    n14 = 232;
                    break;
                }
                case 46: {
                    n14 = 156;
                    break;
                }
                case 47: {
                    n14 = 169;
                    break;
                }
                case 48: {
                    n14 = 2;
                    break;
                }
                case 49: {
                    n14 = 13;
                    break;
                }
                case 50: {
                    n14 = 130;
                    break;
                }
                case 51: {
                    n14 = 228;
                    break;
                }
                case 52: {
                    n14 = 61;
                    break;
                }
                case 53: {
                    n14 = 121;
                    break;
                }
                case 54: {
                    n14 = 230;
                    break;
                }
                case 55: {
                    n14 = 225;
                    break;
                }
                case 56: {
                    n14 = 4;
                    break;
                }
                case 57: {
                    n14 = 103;
                    break;
                }
                case 58: {
                    n14 = 195;
                    break;
                }
                case 59: {
                    n14 = 220;
                    break;
                }
                case 60: {
                    n14 = 194;
                    break;
                }
                case 61: {
                    n14 = 7;
                    break;
                }
                case 62: {
                    n14 = 56;
                    break;
                }
                case 63: {
                    n14 = 112;
                    break;
                }
                case 64: {
                    n14 = 186;
                    break;
                }
                case 65: {
                    n14 = 227;
                    break;
                }
                case 66: {
                    n14 = 159;
                    break;
                }
                case 67: {
                    n14 = 191;
                    break;
                }
                case 68: {
                    n14 = 192;
                    break;
                }
                case 69: {
                    n14 = 65;
                    break;
                }
                case 70: {
                    n14 = 166;
                    break;
                }
                case 71: {
                    n14 = 162;
                    break;
                }
                case 72: {
                    n14 = 10;
                    break;
                }
                case 73: {
                    n14 = 24;
                    break;
                }
                case 74: {
                    n14 = 244;
                    break;
                }
                case 75: {
                    n14 = 1;
                    break;
                }
                case 76: {
                    n14 = 53;
                    break;
                }
                case 77: {
                    n14 = 90;
                    break;
                }
                case 78: {
                    n14 = 42;
                    break;
                }
                case 79: {
                    n14 = 245;
                    break;
                }
                case 80: {
                    n14 = 34;
                    break;
                }
                case 81: {
                    n14 = 82;
                    break;
                }
                case 82: {
                    n14 = 240;
                    break;
                }
                case 83: {
                    n14 = 85;
                    break;
                }
                case 84: {
                    n14 = 118;
                    break;
                }
                case 85: {
                    n14 = 115;
                    break;
                }
                case 86: {
                    n14 = 78;
                    break;
                }
                case 87: {
                    n14 = 60;
                    break;
                }
                case 88: {
                    n14 = 151;
                    break;
                }
                case 89: {
                    n14 = 99;
                    break;
                }
                case 90: {
                    n14 = 32;
                    break;
                }
                case 91: {
                    n14 = 12;
                    break;
                }
                case 92: {
                    n14 = 235;
                    break;
                }
                case 93: {
                    n14 = 160;
                    break;
                }
                case 94: {
                    n14 = 243;
                    break;
                }
                case 95: {
                    n14 = 66;
                    break;
                }
                case 96: {
                    n14 = 177;
                    break;
                }
                case 97: {
                    n14 = 196;
                    break;
                }
                case 98: {
                    n14 = 125;
                    break;
                }
                case 99: {
                    n14 = 77;
                    break;
                }
                case 100: {
                    n14 = 97;
                    break;
                }
                case 101: {
                    n14 = 59;
                    break;
                }
                case 102: {
                    n14 = 187;
                    break;
                }
                case 103: {
                    n14 = 48;
                    break;
                }
                case 104: {
                    n14 = 184;
                    break;
                }
                case 105: {
                    n14 = 39;
                    break;
                }
                case 106: {
                    n14 = 89;
                    break;
                }
                case 107: {
                    n14 = 255;
                    break;
                }
                case 108: {
                    n14 = 183;
                    break;
                }
                case 109: {
                    n14 = 154;
                    break;
                }
                case 110: {
                    n14 = 91;
                    break;
                }
                case 111: {
                    n14 = 37;
                    break;
                }
                case 112: {
                    n14 = 6;
                    break;
                }
                case 113: {
                    n14 = 124;
                    break;
                }
                case 114: {
                    n14 = 122;
                    break;
                }
                case 115: {
                    n14 = 128;
                    break;
                }
                case 116: {
                    n14 = 93;
                    break;
                }
                case 117: {
                    n14 = 131;
                    break;
                }
                case 118: {
                    n14 = 46;
                    break;
                }
                case 119: {
                    n14 = 33;
                    break;
                }
                case 120: {
                    n14 = 229;
                    break;
                }
                case 121: {
                    n14 = 3;
                    break;
                }
                case 122: {
                    n14 = 106;
                    break;
                }
                case 123: {
                    n14 = 134;
                    break;
                }
                case 124: {
                    n14 = 30;
                    break;
                }
                case 125: {
                    n14 = 247;
                    break;
                }
                case 126: {
                    n14 = 84;
                    break;
                }
                case 127: {
                    n14 = 127;
                    break;
                }
                case 128: {
                    n14 = 86;
                    break;
                }
                case 129: {
                    n14 = 161;
                    break;
                }
                case 130: {
                    n14 = 54;
                    break;
                }
                case 131: {
                    n14 = 52;
                    break;
                }
                case 132: {
                    n14 = 236;
                    break;
                }
                case 133: {
                    n14 = 167;
                    break;
                }
                case 134: {
                    n14 = 105;
                    break;
                }
                case 135: {
                    n14 = 102;
                    break;
                }
                case 136: {
                    n14 = 73;
                    break;
                }
                case 137: {
                    n14 = 95;
                    break;
                }
                case 138: {
                    n14 = 202;
                    break;
                }
                case 139: {
                    n14 = 199;
                    break;
                }
                case 140: {
                    n14 = 21;
                    break;
                }
                case 141: {
                    n14 = 27;
                    break;
                }
                case 142: {
                    n14 = 63;
                    break;
                }
                case 143: {
                    n14 = 141;
                    break;
                }
                case 144: {
                    n14 = 137;
                    break;
                }
                case 145: {
                    n14 = 38;
                    break;
                }
                case 146: {
                    n14 = 80;
                    break;
                }
                case 147: {
                    n14 = 116;
                    break;
                }
                case 148: {
                    n14 = 155;
                    break;
                }
                case 149: {
                    n14 = 142;
                    break;
                }
                case 150: {
                    n14 = 104;
                    break;
                }
                case 151: {
                    n14 = 204;
                    break;
                }
                case 152: {
                    n14 = 36;
                    break;
                }
                case 153: {
                    n14 = 238;
                    break;
                }
                case 154: {
                    n14 = 182;
                    break;
                }
                case 155: {
                    n14 = 111;
                    break;
                }
                case 156: {
                    n14 = 29;
                    break;
                }
                case 157: {
                    n14 = 140;
                    break;
                }
                case 158: {
                    n14 = 110;
                    break;
                }
                case 159: {
                    n14 = 71;
                    break;
                }
                case 160: {
                    n14 = 239;
                    break;
                }
                case 161: {
                    n14 = 148;
                    break;
                }
                case 162: {
                    n14 = 207;
                    break;
                }
                case 163: {
                    n14 = 120;
                    break;
                }
                case 164: {
                    n14 = 132;
                    break;
                }
                case 165: {
                    n14 = 179;
                    break;
                }
                case 166: {
                    n14 = 251;
                    break;
                }
                case 167: {
                    n14 = 185;
                    break;
                }
                case 168: {
                    n14 = 23;
                    break;
                }
                case 169: {
                    n14 = 9;
                    break;
                }
                case 170: {
                    n14 = 109;
                    break;
                }
                case 171: {
                    n14 = 108;
                    break;
                }
                case 172: {
                    n14 = 83;
                    break;
                }
                case 173: {
                    n14 = 209;
                    break;
                }
                case 174: {
                    n14 = 70;
                    break;
                }
                case 175: {
                    n14 = 136;
                    break;
                }
                case 176: {
                    n14 = 138;
                    break;
                }
                case 177: {
                    n14 = 190;
                    break;
                }
                case 178: {
                    n14 = 237;
                    break;
                }
                case 179: {
                    n14 = 165;
                    break;
                }
                case 180: {
                    n14 = 35;
                    break;
                }
                case 181: {
                    n14 = 96;
                    break;
                }
                case 182: {
                    n14 = 117;
                    break;
                }
                case 183: {
                    n14 = 114;
                    break;
                }
                case 184: {
                    n14 = 31;
                    break;
                }
                case 185: {
                    n14 = 171;
                    break;
                }
                case 186: {
                    n14 = 18;
                    break;
                }
                case 187: {
                    n14 = 214;
                    break;
                }
                case 188: {
                    n14 = 208;
                    break;
                }
                case 189: {
                    n14 = 123;
                    break;
                }
                case 190: {
                    n14 = 101;
                    break;
                }
                case 191: {
                    n14 = 19;
                    break;
                }
                case 192: {
                    n14 = 40;
                    break;
                }
                case 193: {
                    n14 = 224;
                    break;
                }
                case 194: {
                    n14 = 200;
                    break;
                }
                case 195: {
                    n14 = 203;
                    break;
                }
                case 196: {
                    n14 = 133;
                    break;
                }
                case 197: {
                    n14 = 57;
                    break;
                }
                case 198: {
                    n14 = 249;
                    break;
                }
                case 199: {
                    n14 = 174;
                    break;
                }
                case 200: {
                    n14 = 75;
                    break;
                }
                case 201: {
                    n14 = 152;
                    break;
                }
                case 202: {
                    n14 = 55;
                    break;
                }
                case 203: {
                    n14 = 50;
                    break;
                }
                case 204: {
                    n14 = 241;
                    break;
                }
                case 205: {
                    n14 = 193;
                    break;
                }
                case 206: {
                    n14 = 64;
                    break;
                }
                case 207: {
                    n14 = 226;
                    break;
                }
                case 208: {
                    n14 = 26;
                    break;
                }
                case 209: {
                    n14 = 173;
                    break;
                }
                case 210: {
                    n14 = 81;
                    break;
                }
                case 211: {
                    n14 = 153;
                    break;
                }
                case 212: {
                    n14 = 28;
                    break;
                }
                case 213: {
                    n14 = 233;
                    break;
                }
                case 214: {
                    n14 = 180;
                    break;
                }
                case 215: {
                    n14 = 100;
                    break;
                }
                case 216: {
                    n14 = 143;
                    break;
                }
                case 217: {
                    n14 = 94;
                    break;
                }
                case 218: {
                    n14 = 253;
                    break;
                }
                case 219: {
                    n14 = 188;
                    break;
                }
                case 220: {
                    n14 = 211;
                    break;
                }
                case 221: {
                    n14 = 181;
                    break;
                }
                case 222: {
                    n14 = 213;
                    break;
                }
                case 223: {
                    n14 = 246;
                    break;
                }
                case 224: {
                    n14 = 44;
                    break;
                }
                case 225: {
                    n14 = 145;
                    break;
                }
                case 226: {
                    n14 = 146;
                    break;
                }
                case 227: {
                    n14 = 163;
                    break;
                }
                case 228: {
                    n14 = 248;
                    break;
                }
                case 229: {
                    n14 = 205;
                    break;
                }
                case 230: {
                    n14 = 88;
                    break;
                }
                case 231: {
                    n14 = 107;
                    break;
                }
                case 232: {
                    n14 = 51;
                    break;
                }
                case 233: {
                    n14 = 150;
                    break;
                }
                case 234: {
                    n14 = 201;
                    break;
                }
                case 235: {
                    n14 = 15;
                    break;
                }
                case 236: {
                    n14 = 41;
                    break;
                }
                case 237: {
                    n14 = 22;
                    break;
                }
                case 238: {
                    n14 = 222;
                    break;
                }
                case 239: {
                    n14 = 139;
                    break;
                }
                case 240: {
                    n14 = 157;
                    break;
                }
                case 241: {
                    n14 = 234;
                    break;
                }
                case 242: {
                    n14 = 11;
                    break;
                }
                case 243: {
                    n14 = 149;
                    break;
                }
                case 244: {
                    n14 = 76;
                    break;
                }
                case 245: {
                    n14 = 74;
                    break;
                }
                case 246: {
                    n14 = 8;
                    break;
                }
                case 247: {
                    n14 = 178;
                    break;
                }
                case 248: {
                    n14 = 0;
                    break;
                }
                case 249: {
                    n14 = 175;
                    break;
                }
                case 250: {
                    n14 = 43;
                    break;
                }
                case 251: {
                    n14 = 49;
                    break;
                }
                case 252: {
                    n14 = 47;
                    break;
                }
                case 253: {
                    n14 = 45;
                    break;
                }
                case 254: {
                    n14 = 135;
                    break;
                }
                default: {
                    n14 = 250;
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
            lr_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7624;
        if (e[n11] == null) {
            lr_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

