/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.crypto.CipherParameters
 *  org.bouncycastle.crypto.engines.ChaChaEngine
 *  org.bouncycastle.crypto.macs.Poly1305
 *  org.bouncycastle.crypto.params.KeyParameter
 *  org.bouncycastle.crypto.params.ParametersWithIV
 */
package com;

import com.EU;
import com.K4;
import com.ky_2;
import java.nio.ByteBuffer;
import javax.crypto.AEADBadTagException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/*
 * Renamed from com.kY
 */
public class ky_1
implements EU {
    private ChaChaEngine P;
    private ChaChaEngine u;
    private KeyParameter f;
    private KeyParameter D;
    private int n;
    private Poly1305 z;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public int w() {
        return ky_1.a(25542, 4250405964038224850L);
    }

    @Override
    public int u() {
        return ky_1.a(6407, 1745338289894048021L);
    }

    @Override
    public int j() {
        return ky_1.a(8286, 3062491675511519310L);
    }

    @Override
    public void z(int n10, byte[] byArray, byte[] byArray2) throws Exception {
        int n11;
        block7: {
            block8: {
                String string = K4.z();
                try {
                    n11 = byArray.length;
                    if (string != null) break block7;
                    if (n11 <= ky_1.a(6407, 1745338289894048021L)) break block8;
                }
                catch (Exception exception) {
                    throw ky_1.a(exception);
                }
                byte[] byArray3 = new byte[ky_1.a(6407, 1745338289894048021L)];
                System.arraycopy(byArray, 0, byArray3, 0, byArray3.length);
                byArray = byArray3;
            }
            n11 = ky_1.a(2491, 6247900791907045804L);
        }
        byte[] byArray4 = new byte[n11];
        byte[] byArray5 = new byte[ky_1.a(2491, 6247900791907045804L)];
        System.arraycopy(byArray, ky_1.a(2491, 6247900791907045804L), byArray4, 0, ky_1.a(2491, 6247900791907045804L));
        System.arraycopy(byArray, 0, byArray5, 0, ky_1.a(2491, 6247900791907045804L));
        this.n = n10;
        try {
            this.f = new KeyParameter(byArray4, 0, byArray4.length);
            this.D = new KeyParameter(byArray5, 0, byArray5.length);
            this.P = new ChaChaEngine();
            this.u = new ChaChaEngine();
            this.z = new Poly1305();
        }
        catch (Exception exception) {
            this.P = null;
            this.u = null;
            this.f = null;
            this.D = null;
            throw exception;
        }
        try {
            if (ky_2.F() != null) {
                K4.Y("FRBfYb");
            }
        }
        catch (Exception exception) {
            throw ky_1.a(exception);
        }
    }

    @Override
    public void S(int n10) throws Exception {
        boolean bl;
        ChaChaEngine chaChaEngine;
        String string;
        ByteBuffer byteBuffer;
        block9: {
            block10: {
                boolean bl2;
                ChaChaEngine chaChaEngine2;
                block7: {
                    block8: {
                        byteBuffer = ByteBuffer.allocate(ky_1.a(22555, 6317735550937923594L));
                        string = K4.z();
                        try {
                            byteBuffer.putLong(0, n10);
                            chaChaEngine2 = this.P;
                            bl2 = this.n;
                            if (string != null) break block7;
                            if (bl2) break block8;
                        }
                        catch (Exception exception) {
                            throw ky_1.a(exception);
                        }
                        bl2 = true;
                        break block7;
                    }
                    bl2 = false;
                }
                try {
                    chaChaEngine2.init(bl2, (CipherParameters)new ParametersWithIV((CipherParameters)this.f, byteBuffer.array(), 0, byteBuffer.array().length));
                    chaChaEngine = this.u;
                    bl = this.n;
                    if (string != null) break block9;
                    if (bl) break block10;
                }
                catch (Exception exception) {
                    throw ky_1.a(exception);
                }
                bl = true;
                break block9;
            }
            bl = false;
        }
        chaChaEngine.init(bl, (CipherParameters)new ParametersWithIV((CipherParameters)this.D, byteBuffer.array(), 0, byteBuffer.array().length));
        byte[] byArray = new byte[ky_1.a(5250, 5089786397254503575L)];
        try {
            this.u.processBytes(byArray, 0, byArray.length, byArray, 0);
            this.z.init((CipherParameters)new KeyParameter(byArray, 0, ky_1.a(28658, 8254578760010151905L)));
            if (string != null) {
                ky_2.K(new String[3]);
            }
        }
        catch (Exception exception) {
            throw ky_1.a(exception);
        }
    }

    @Override
    public void X(byte[] byArray, int n10, int n11, byte[] byArray2, int n12) throws Exception {
        this.P.processBytes(byArray, n10, n11, byArray2, n12);
    }

    @Override
    public void E(byte[] byArray, int n10, int n11, byte[] byArray2, int n12) throws Exception {
        block12: {
            int n13;
            String string;
            block10: {
                block11: {
                    string = K4.z();
                    try {
                        n13 = this.n;
                        if (string != null) break block10;
                        if (n13 != 1) break block11;
                    }
                    catch (Exception exception) {
                        throw ky_1.a(exception);
                    }
                    byte[] byArray3 = new byte[ky_1.a(6700, 6652972783881339450L)];
                    System.arraycopy(byArray, n11, byArray3, 0, ky_1.a(8286, 3062491675511519310L));
                    byte[] byArray4 = new byte[ky_1.a(8286, 3062491675511519310L)];
                    try {
                        try {
                            this.z.update(byArray, n10, n11);
                            this.z.doFinal(byArray4, 0);
                            n13 = ky_1.k(byArray3, byArray4) ? 1 : 0;
                            if (string != null) break block10;
                            if (n13 != 0) break block11;
                        }
                        catch (Exception exception) {
                            throw ky_1.a(exception);
                        }
                        throw new AEADBadTagException(a);
                    }
                    catch (Exception exception) {
                        throw ky_1.a(exception);
                    }
                }
                this.u.processBytes(byArray, n10 + 4, n11 - 4, byArray2, n12 + 4);
                n13 = this.n;
            }
            try {
                try {
                    if (string != null || n13 != 0) break block12;
                }
                catch (Exception exception) {
                    throw ky_1.a(exception);
                }
                this.z.update(byArray2, n12, n11);
                n13 = this.z.doFinal(byArray2, n11);
            }
            catch (Exception exception) {
                throw ky_1.a(exception);
            }
        }
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean k(byte[] byArray, byte[] byArray2) {
        String string = K4.z();
        int n10 = byArray.length;
        if (string == null) {
            if (n10 != byArray2.length) {
                return false;
            }
            n10 = 0;
        }
        int n11 = n10;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            n11 |= byArray[i2] ^ byArray2[i2];
            if (string != null) return 0 != 0;
            if (string == null) continue;
        }
        int n12 = n11;
        if (string != null) return n12 != 0;
        if (n12 != 0) return 0 != 0;
        return 1 != 0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\b\u000b|m\u0007+\u00171\u000bo.\u0002".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 78;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 18;
                                break;
                            }
                            case 1: {
                                v9 = 36;
                                break;
                            }
                            case 2: {
                                v9 = 85;
                                break;
                            }
                            case 3: {
                                v9 = 3;
                                break;
                            }
                            case 4: {
                                v9 = 36;
                                break;
                            }
                            case 5: {
                                v9 = 12;
                                break;
                            }
                            default: {
                                v9 = 42;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                ky_1.a = new String(v10).intern();
                var0_1 = 3801446227395116548L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00a3\u009dH\u00f5\u000e\u00d6\u0006Z0$\u0093\u00da2!~\u0006\u001aS\u00c0\u000b\u009e\u00a7\u00bfQZ\u0012\u0098\u00a48A\u00c9\u00c5\u0082\u009b\u00b9v\u0095\u0011E\u00de\u00df\u0015\u00e1X\u001eZ2\u00d3";
                var5_5 = "\u00a3\u009dH\u00f5\u000e\u00d6\u0006Z0$\u0093\u00da2!~\u0006\u001aS\u00c0\u000b\u009e\u00a7\u00bfQZ\u0012\u0098\u00a48A\u00c9\u00c5\u0082\u009b\u00b9v\u0095\u0011E\u00de\u00df\u0015\u00e1X\u001eZ2\u00d3".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00d4\u00cd8\u00a9\u008b4\u00bc.952\u00d8-\"/\u0088";
                    var5_5 = "\u00d4\u00cd8\u00a9\u008b4\u00bc.952\u00d8-\"/\u0088".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        ky_1.b = var6_2;
        ky_1.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5810;
        if (c[n11] == null) {
            ky_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

