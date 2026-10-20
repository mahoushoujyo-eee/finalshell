/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W2;
import com.a9;
import com.bj_0;
import com.kp_0;
import com.ne_1;
import com.pb_2;
import com.zl_0;
import java.awt.Color;
import java.awt.Shape;
import javax.swing.JMenuBar;

public class W9
extends JMenuBar
implements W2 {
    public W9() {
    }

    public W9(bj_0 bj_02) {
        this.E(bj_02);
    }

    public boolean d() {
        return this.D().O();
    }

    public void t(boolean bl) {
        this.D().j(bl);
    }

    public bj_0 x() {
        return this.D().w();
    }

    public void E(bj_0 bj_02) {
        this.D().v(bj_02);
    }

    public Color t() {
        return this.D().O();
    }

    public void C(Color color) {
        this.D().w(color);
    }

    public int e() {
        return this.D().K();
    }

    public void Q(int n10) {
        this.D().N(n10);
    }

    public int b() {
        return this.D().g();
    }

    public void S(int n10) {
        this.D().g(n10);
    }

    @Override
    public Shape B() {
        return this.D().B();
    }

    public zl_0 D() {
        return (zl_0)this.getUI();
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
                        var1_1 = pb_2.g();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw W9.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw W9.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof zl_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw W9.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((zl_0)kp_0.w(a9.s, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new zl_0());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw W9.a(v5);
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

