/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.crypto.BlockCipher
 *  org.bouncycastle.crypto.BufferedBlockCipher
 *  org.bouncycastle.crypto.CipherParameters
 *  org.bouncycastle.crypto.engines.SEEDEngine
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
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/*
 * Renamed from com.xS
 */
public class xs_1
implements EU {
    private BufferedBlockCipher q;
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public int w() {
        return xs_1.a(20804, 7790036181248841007L);
    }

    @Override
    public int u() {
        return xs_1.a(28705, 6564198414571877451L);
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
                            n12 = xs_1.a(28705, 6564198414571877451L);
                            if (string != null) break block10;
                            if (n11 <= n12) break block11;
                        }
                        catch (Exception exception) {
                            throw xs_1.a(exception);
                        }
                        byArray3 = new byte[xs_1.a(28705, 6564198414571877451L)];
                        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
                        byArray2 = byArray3;
                    }
                    try {
                        n11 = byArray.length;
                        if (string != null) break block12;
                        n12 = xs_1.a(28705, 6564198414571877451L);
                    }
                    catch (Exception exception) {
                        throw xs_1.a(exception);
                    }
                }
                if (n11 <= n12) break block15;
                n11 = xs_1.a(28705, 6564198414571877451L);
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
                        bufferedBlockCipher = this.q = new BufferedBlockCipher((BlockCipher)new CBCBlockCipher((BlockCipher)new SEEDEngine()));
                        bl = n10;
                        if (string != null) break block13;
                        if (bl) break block14;
                    }
                    catch (Exception exception) {
                        throw xs_1.a(exception);
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
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7637294282316528227L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00b8\u0018]\u00fc\u00ac^/\\\u0019\u000b\u00f3-i$\u000e8";
        int n11 = "\u00b8\u0018]\u00fc\u00ac^/\\\u0019\u000b\u00f3-i$\u000e8".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x446B;
        if (b[n11] == null) {
            xs_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

