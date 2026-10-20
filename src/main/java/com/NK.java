/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.crypto.BlockCipher
 *  org.bouncycastle.crypto.CipherParameters
 *  org.bouncycastle.crypto.engines.TwofishEngine
 *  org.bouncycastle.crypto.modes.SICBlockCipher
 *  org.bouncycastle.crypto.params.KeyParameter
 *  org.bouncycastle.crypto.params.ParametersWithIV
 */
package com;

import com.EU;
import com.K4;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

abstract class NK
implements EU {
    private SICBlockCipher y;
    private static final long[] a;
    private static final Integer[] b;

    NK() {
    }

    @Override
    public int w() {
        return NK.a(25680, 8896557438840124926L);
    }

    /*
     * Loose catch block
     * Could not resolve type clashes
     */
    @Override
    public void z(int n10, byte[] byArray, byte[] byArray2) throws Exception {
        String string;
        block13: {
            int n11;
            byte[] byArray3;
            block12: {
                int n12;
                block10: {
                    block11: {
                        string = K4.z();
                        try {
                            n12 = byArray2.length;
                            if (string != null) break block10;
                            if (n12 <= NK.a(4065, 4114277951348235854L)) break block11;
                        }
                        catch (Exception exception) {
                            throw NK.a(exception);
                        }
                        byArray3 = new byte[NK.a(4065, 4114277951348235854L)];
                        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
                        byArray2 = byArray3;
                    }
                    n12 = this.u();
                }
                int n13 = n12;
                n11 = byArray.length;
                if (string != null) break block12;
                try {
                    block16: {
                        if (n11 <= n13) break block13;
                        break block16;
                        catch (Exception exception) {
                            throw NK.a(exception);
                        }
                    }
                    n11 = n13;
                }
                catch (Exception exception) {
                    throw NK.a(exception);
                }
            }
            byArray3 = new byte[n11];
            System.arraycopy(byArray, 0, byArray3, 0, byArray3.length);
            byArray = byArray3;
        }
        try {
            boolean bl;
            SICBlockCipher sICBlockCipher;
            ParametersWithIV parametersWithIV;
            block14: {
                block15: {
                    parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(byArray, 0, byArray.length), byArray2, 0, byArray2.length);
                    try {
                        sICBlockCipher = this.y = new SICBlockCipher((BlockCipher)new TwofishEngine());
                        bl = n10;
                        if (string != null) break block14;
                        if (bl) break block15;
                    }
                    catch (Exception exception) {
                        throw NK.a(exception);
                    }
                    bl = true;
                    break block14;
                }
                bl = false;
            }
            sICBlockCipher.init(bl, (CipherParameters)parametersWithIV);
        }
        catch (Exception exception) {
            this.y = null;
            throw exception;
        }
    }

    @Override
    public void X(byte[] byArray, int n10, int n11, byte[] byArray2, int n12) throws Exception {
        this.y.processBytes(byArray, n10, n11, byArray2, n12);
    }

    @Override
    public boolean Y() {
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5570044209373346366L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "H)\u009a{\u00bb\u0007\u00cf\u00d0ps\u008c\u00a9\u00e7\u00be$`";
        int n11 = "H)\u009a{\u00bb\u0007\u00cf\u00d0ps\u008c\u00a9\u00e7\u00be$`".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x51AE;
        if (b[n11] == null) {
            NK.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

