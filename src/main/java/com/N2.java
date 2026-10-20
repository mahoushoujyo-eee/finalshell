/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S0;
import com.fv_0;
import com.ky_2;
import java.util.function.Predicate;

class N2
implements Runnable {
    final fv_0 K;
    final S0 e;

    N2(S0 s0, fv_0 fv_02) {
        this.e = s0;
        this.K = fv_02;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block20: {
            var2_1 = 0;
            var1_2 = S0.p();
            try {
                while (true) {
                    try {
                        var2_1 = this.K.f();
                        ** break;
                    }
                    catch (InterruptedException var3_3) {
                        S0.g().debug("", var3_3);
                        if (var1_2 == null) continue;
                    }
                    break;
                }
            }
            catch (Throwable var4_5) {
                block21: {
                    try {
                        v0 = S0.P(this.e).isCancelled();
                        if (var1_2 != null) break block21;
                        try {
                            block22: {
                                if (v0) break block21;
                                break block22;
                                catch (InterruptedException v1) {
                                    throw N2.a(v1);
                                }
                            }
                            v0 = ((Predicate)S0.a(this.e).take()).test(var2_1);
                        }
                        catch (InterruptedException v2) {
                            throw N2.a(v2);
                        }
                    }
                    catch (InterruptedException var5_6) {
                        S0.g().info("", var5_6);
                    }
                }
                throw var4_5;
            }
lbl30:
            // 2 sources

            try {
                v3 = S0.P(this.e).isCancelled();
                if (var1_2 != null) break block20;
                try {
                    block23: {
                        if (v3) break block20;
                        break block23;
                        catch (InterruptedException v4) {
                            throw N2.a(v4);
                        }
                    }
                    v3 = ((Predicate)S0.a(this.e).take()).test(var2_1);
                }
                catch (InterruptedException v5) {
                    throw N2.a(v5);
                }
            }
            catch (InterruptedException var3_4) {
                S0.g().info("", var3_4);
            }
        }
        try {
            if (ky_2.F() != null) {
                S0.q(new ky_2[2]);
            }
        }
        catch (InterruptedException v6) {
            throw N2.a(v6);
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

