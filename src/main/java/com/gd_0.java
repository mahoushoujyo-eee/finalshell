/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.crypto.BlockCipher
 *  org.bouncycastle.crypto.CipherParameters
 *  org.bouncycastle.crypto.engines.CAST5Engine
 *  org.bouncycastle.crypto.modes.SICBlockCipher
 *  org.bouncycastle.crypto.params.KeyParameter
 *  org.bouncycastle.crypto.params.ParametersWithIV
 */
package com;

import com.EU;
import com.K4;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.CAST5Engine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/*
 * Renamed from com.Gd
 */
public class gd_0
implements EU {
    private SICBlockCipher E;
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public int w() {
        return gd_0.a(26068, 6218604703012177085L);
    }

    @Override
    public int u() {
        return gd_0.a(25621, 750415618141767037L);
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
                            n12 = gd_0.a(32343, 408347346317303612L);
                            if (string != null) break block10;
                            if (n11 <= n12) break block11;
                        }
                        catch (Exception exception) {
                            throw gd_0.a(exception);
                        }
                        byArray3 = new byte[gd_0.a(32343, 408347346317303612L)];
                        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
                        byArray2 = byArray3;
                    }
                    try {
                        n11 = byArray.length;
                        if (string != null) break block12;
                        n12 = gd_0.a(20735, 2639437444571099541L);
                    }
                    catch (Exception exception) {
                        throw gd_0.a(exception);
                    }
                }
                if (n11 <= n12) break block15;
                n11 = gd_0.a(20735, 2639437444571099541L);
            }
            byArray3 = new byte[n11];
            System.arraycopy(byArray, 0, byArray3, 0, byArray3.length);
            byArray = byArray3;
        }
        try {
            boolean bl;
            SICBlockCipher sICBlockCipher;
            ParametersWithIV parametersWithIV;
            block13: {
                block14: {
                    parametersWithIV = new ParametersWithIV((CipherParameters)new KeyParameter(byArray, 0, byArray.length), byArray2, 0, byArray2.length);
                    try {
                        sICBlockCipher = this.E = new SICBlockCipher((BlockCipher)new CAST5Engine());
                        bl = n10;
                        if (string != null) break block13;
                        if (bl) break block14;
                    }
                    catch (Exception exception) {
                        throw gd_0.a(exception);
                    }
                    bl = true;
                    break block13;
                }
                bl = false;
            }
            sICBlockCipher.init(bl, (CipherParameters)parametersWithIV);
        }
        catch (Exception exception) {
            this.E = null;
            throw exception;
        }
    }

    @Override
    public void X(byte[] byArray, int n10, int n11, byte[] byArray2, int n12) throws Exception {
        this.E.processBytes(byArray, n10, n11, byArray2, n12);
    }

    @Override
    public boolean Y() {
        return false;
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
                var0 = 6751519979253033201L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "7\u00ca\rA\bj\u00ad\u009c\u0083\u00a2\u0007\u0082\u00c8\u00c9,D";
                var5_4 = "7\u00ca\rA\bj\u00ad\u009c\u0083\u00a2\u0007\u0082\u00c8\u00c9,D".length();
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
                    var4_3 = "\u009f\u00df\u008dws\u00d2\u0019t\u00c0h\u0001\u0017\u0013c7\u00c5";
                    var5_4 = "\u009f\u00df\u008dws\u00d2\u0019t\u00c0h\u0001\u0017\u0013c7\u00c5".length();
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
        gd_0.a = var6_1;
        gd_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2168;
        if (b[n11] == null) {
            gd_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

