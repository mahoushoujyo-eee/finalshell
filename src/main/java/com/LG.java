/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ai_0;
import com.cj_1;
import com.kj_2;
import com.ky_2;

class LG
implements Runnable {
    final ai_0 r;
    private static final long a;

    LG(ai_0 ai_02) {
        this.r = ai_02;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        ky_2[] ky_2Array = kj_2.d();
        while (!ai_0.r(this.r)) {
            block23: {
                cj_1 cj_12;
                block22: {
                    block20: {
                        int n10 = ((kj_2)ai_0.q((ai_0)this.r).get((Object)Integer.valueOf((int)ai_0.E((ai_0)this.r)))).p;
                        try {
                            long l2;
                            block19: {
                                int n11;
                                block17: {
                                    block18: {
                                        n11 = n10;
                                        if (ky_2Array == null) break block17;
                                        try {
                                            block24: {
                                                if (n11 != 0) break block18;
                                                break block24;
                                                catch (InterruptedException interruptedException) {
                                                    throw LG.a(interruptedException);
                                                }
                                            }
                                            l2 = a;
                                            break block19;
                                        }
                                        catch (InterruptedException interruptedException) {
                                            throw LG.a(interruptedException);
                                        }
                                    }
                                    n11 = n10;
                                }
                                l2 = n11;
                            }
                            Thread.sleep(l2);
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                        }
                        try {
                            int n12;
                            block21: {
                                try {
                                    try {
                                        n12 = ai_0.E(this.r);
                                        if (ky_2Array == null) break block20;
                                        if (n12 != ai_0.C(this.r) - 1) break block21;
                                    }
                                    catch (InterruptedException interruptedException) {
                                        throw LG.a(interruptedException);
                                    }
                                    ai_0.g(this.r, 0);
                                    if (ky_2Array != null) break block20;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw LG.a(interruptedException);
                                }
                            }
                            n12 = ai_0.z(this.r);
                        }
                        catch (InterruptedException interruptedException) {
                            throw LG.a(interruptedException);
                        }
                    }
                    try {
                        try {
                            cj_12 = ai_0.I(this.r);
                            if (ky_2Array == null) break block22;
                            if (cj_12 == null) break block23;
                        }
                        catch (InterruptedException interruptedException) {
                            throw LG.a(interruptedException);
                        }
                        cj_12 = ai_0.I(this.r);
                    }
                    catch (InterruptedException interruptedException) {
                        throw LG.a(interruptedException);
                    }
                }
                cj_12.n();
            }
            if (ky_2Array != null) continue;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3088718530540375175L;
        a = 0x2ADD552388068CE3L ^ l2;
    }
}

