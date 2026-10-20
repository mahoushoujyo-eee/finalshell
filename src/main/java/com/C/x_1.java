/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.a9;
import com.c.d_0;
import com.c.l_1;
import com.kp_0;
import com.ne_1;
import javax.swing.JDesktopPane;

/*
 * Renamed from com.c.x
 */
public class x_1
extends JDesktopPane {
    public l_1 a() {
        return (l_1)this.getUI();
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
                        var1_1 = d_0.W();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw x_1.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw x_1.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof l_1)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw x_1.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((l_1)kp_0.w(a9.V, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new l_1());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw x_1.a(v5);
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

