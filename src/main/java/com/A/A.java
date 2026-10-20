/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import com.a.y_0;
import com.a9;
import com.kp_0;
import com.ne_1;
import javax.swing.JRootPane;

public class A
extends JRootPane {
    public d Z() {
        return (d)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block13: {
            block12: {
                block11: {
                    block14: {
                        var1_1 = y_0.M();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw A.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw A.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof d)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw A.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((d)kp_0.w(a9.d, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new d());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw A.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

