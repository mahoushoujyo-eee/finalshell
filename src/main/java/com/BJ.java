/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WU;
import com.a9;
import com.kp_0;
import com.ky_2;
import com.ne_1;
import javax.swing.JViewport;

public class BJ
extends JViewport {
    public WU q() {
        return (WU)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block16: {
            block15: {
                block14: {
                    block17: {
                        var1_1 = WU.p();
                        v0 = this;
                        if (var1_1 == 0) ** GOTO lbl26
                        if (v0.getUI() == null) break block14;
                        break block17;
                        catch (Throwable v1) {
                            throw BJ.a(v1);
                        }
                    }
                    try {
                        block18: {
                            v2 = this;
                            if (var1_1 == 0) break block15;
                            break block18;
                            catch (Throwable v3) {
                                throw BJ.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof WU)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw BJ.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((WU)kp_0.w(a9.zf, new Object[0]));
                    break block16;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new WU());
                        if (var1_1 != 0) break block16;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw BJ.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
        try {
            if (ky_2.F() != null) {
                WU.M(++var1_1);
            }
        }
        catch (Throwable v6) {
            throw BJ.a(v6);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

