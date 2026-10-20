/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.c;
import com.pa_1;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.wZ
 */
class wz_1
implements Runnable {
    final String X;
    final boolean u;
    final boolean d;
    final pa_1 e;
    private static final String a;
    private static final long b;

    wz_1(pa_1 pa_12, String string, boolean bl, boolean bl2) {
        this.e = pa_12;
        this.X = string;
        this.u = bl;
        this.d = bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        try {
            v0 = (String[])lk_0.R(this.X);
        }
        catch (InvocationTargetException v1) {
            throw v1.getTargetException();
        }
        var2_1 = v0;
        var3_2 = new byte[1];
        var1_3 = _y_0.y();
        var3_2[0] = (int)wz_1.b;
        for (var4_4 = 0; var4_4 < var2_1.length; ++var4_4) {
            block21: {
                block22: {
                    block19: {
                        block20: {
                            var5_5 = var2_1[var4_4];
                            var5_5 = var5_5.replaceAll(wz_1.a, "");
                            try {
                                pa_1.A(this.e).D(var5_5);
                            }
                            catch (RuntimeException var6_7) {
                                // empty catch block
                            }
                            if (var4_4 == var2_1.length - 1) {
                                // empty if block
                            }
                            var6_6 = 1;
                            try {
                                v2 = var4_4;
                                if (var1_3 != 0) break block19;
                                if (v2 != var2_1.length - 1) break block20;
                            }
                            catch (RuntimeException v3) {
                                throw wz_1.a(v3);
                            }
                            var6_6 = (int)this.u;
                        }
                        v2 = var6_6;
                    }
                    if (var1_3 != 0) break block21;
                    if (v2 == 0) continue;
                    break block22;
                    catch (RuntimeException v4) {
                        throw wz_1.a(v4);
                    }
                }
                try {
                    block23: {
                        v5 = this;
                        if (var1_3 != 0) ** GOTO lbl61
                        break block23;
                        catch (RuntimeException v6) {
                            throw wz_1.a(v6);
                        }
                    }
                    v2 = (int)v5.d;
                }
                catch (RuntimeException v7) {
                    throw wz_1.a(v7);
                }
            }
            try {
                if (v2 != 0) {
                    this.e.K();
                    if (var1_3 == 0) continue;
                }
            }
            catch (RuntimeException v8) {
                throw wz_1.a(v8);
            }
            try {
                v5 = this;
lbl61:
                // 2 sources

                pa_1.A(v5.e).J(var3_2);
                continue;
            }
            catch (RuntimeException var7_8) {
                // empty catch block
            }
            if (var1_3 == 0) continue;
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = " R0".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 36;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 88;
                            break;
                        }
                        case 1: {
                            n17 = 4;
                            break;
                        }
                        case 2: {
                            n17 = 48;
                            break;
                        }
                        case 3: {
                            n17 = 20;
                            break;
                        }
                        case 4: {
                            n17 = 74;
                            break;
                        }
                        case 5: {
                            n17 = 34;
                            break;
                        }
                        default: {
                            n17 = 106;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 6827464145713970689L;
        b = 0x79D9470191FF3E0CL ^ l2;
    }
}

