/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.crypto.BlockCipher
 *  org.bouncycastle.crypto.BufferedBlockCipher
 *  org.bouncycastle.crypto.CipherParameters
 *  org.bouncycastle.crypto.DefaultBufferedBlockCipher
 *  org.bouncycastle.crypto.engines.CAST5Engine
 *  org.bouncycastle.crypto.modes.CBCBlockCipher
 *  org.bouncycastle.crypto.params.KeyParameter
 *  org.bouncycastle.crypto.params.ParametersWithIV
 */
package com;

import com.EU;
import com.K4;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.engines.CAST5Engine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/*
 * Renamed from com.c3
 */
public class c3_0
implements EU {
    private BufferedBlockCipher q;
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public int w() {
        return c3_0.a(18899, 3617493055858331449L);
    }

    @Override
    public int u() {
        return c3_0.a(4097, 5813600699454101226L);
    }

    @Override
    public void z(int n10, byte[] byArray, byte[] byArray2) throws Exception {
        String string;
        block15: {
            byte[] byArray3;
            int n11;
            block12: {
                int n12;
                block10: {
                    block11: {
                        string = K4.z();
                        try {
                            int n12 = byArray2.length;
                            n12 = c3_0.a(7809, 8319515567597885544L);
                            if (string != null) break block10;
                            if (n11 <= n12) break block11;
                        }
                        catch (Exception exception) {
                            throw c3_0.a(exception);
                        }
                        byArray3 = new byte[c3_0.a(18899, 3617493055858331449L)];
                        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
                        byArray2 = byArray3;
                    }
                    try {
                        n11 = byArray.length;
                        if (string != null) break block12;
                        n12 = c3_0.a(7906, 532473451379070986L);
                    }
                    catch (Exception exception) {
                        throw c3_0.a(exception);
                    }
                }
                if (n11 <= n12) break block15;
                n11 = c3_0.a(7906, 532473451379070986L);
            }
            byArray3 = new byte[n11];
            System.arraycopy(byArray, 0, byArray3, 0, byArray3.length);
            byArray = byArray3;
        }
        try {
            boolean bl;
            BufferedBlockCipher bufferedBlockCipher;
            ParametersWithIV parametersWithIV;
            block13: {
                block14: {
                    parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(byArray, 0, byArray.length), byArray2, 0, byArray2.length);
                    try {
                        bufferedBlockCipher = this.q = new DefaultBufferedBlockCipher((BlockCipher)CBCBlockCipher.newInstance((BlockCipher)new CAST5Engine()));
                        bl = n10;
                        if (string != null) break block13;
                        if (bl) break block14;
                    }
                    catch (Exception exception) {
                        throw c3_0.a(exception);
                    }
                    bl = true;
                    break block13;
                }
                bl = false;
            }
            bufferedBlockCipher.init(bl, (CipherParameters)parametersWithIV);
        }
        catch (Exception exception) {
            this.q = null;
            throw exception;
        }
    }

    @Override
    public void X(byte[] byArray, int n10, int n11, byte[] byArray2, int n12) throws Exception {
        this.q.processBytes(byArray, n10, n11, byArray2, n12);
    }

    @Override
    public boolean Y() {
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2800153939881299565L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "eX1SY\b\u0016\r\u00e4\nL\u009dN\u00cf\u0096w";
                var5_4 = "eX1SY\b\u0016\r\u00e4\nL\u009dN\u00cf\u0096w".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u0087Q\u009d\u00f3\u00eb\u00e5\u0098\u0097\u00a7\u00a5\u00be\u009f\u00bc\u00e9\u00c1\\";
                    var5_4 = "\u0087Q\u009d\u00f3\u00eb\u00e5\u0098\u0097\u00a7\u00a5\u00be\u009f\u00bc\u00e9\u00c1\\".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        c3_0.a = var6_1;
        c3_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6E9;
        if (b[n11] == null) {
            c3_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

