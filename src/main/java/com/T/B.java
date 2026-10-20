/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.OM;
import com.a9;
import com.kp_0;
import com.ne_1;
import com.t.n_0;
import com.t.o_0;
import com.t.s_1;
import com.t.u_0;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JColorChooser;
import javax.swing.colorchooser.ColorSelectionModel;

public class B
extends JColorChooser
implements OM {
    public B() {
    }

    public B(Color color) {
        super(color);
    }

    public B(ColorSelectionModel colorSelectionModel) {
        super(colorSelectionModel);
    }

    public boolean T() {
        return this.R().c();
    }

    public void J(boolean bl) {
        this.R().K(bl);
    }

    public boolean C() {
        return this.R().X();
    }

    public void U(boolean bl) {
        this.R().Z(bl);
    }

    public Color V() {
        return this.R().o();
    }

    public void i(Color color) {
        this.R().t(color);
    }

    public void f() {
        this.R().j();
    }

    public void z(int n10) {
        this.R().i(n10);
    }

    public int Q() {
        return this.R().H();
    }

    public void f(o_0 o_02) {
        this.R().d(o_02);
    }

    public void E(o_0 o_02) {
        this.R().j(o_02);
    }

    public u_0 R() {
        return (u_0)this.getUI();
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
                        var1_1 = n_0.g();
                        v0 = this;
                        if (var1_1 != 0) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw B.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != 0) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw B.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof u_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw B.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((u_0)kp_0.w(a9.D, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new u_0());
                        if (var1_1 == 0) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw B.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    public static Color t(Component component) {
        return B.c(component, null, null);
    }

    public static Color W(Component component, String string) {
        return B.c(component, string, null);
    }

    public static Color D(Component component, Color color) {
        return B.c(component, null, color);
    }

    public static Color c(Component component, String string, Color color) {
        block6: {
            s_1 s_12;
            block5: {
                s_1 s_13 = new s_1(component, string);
                int n10 = n_0.W();
                if (n10 != 0) {
                    if (color != null) {
                        s_13.n(color);
                    }
                    s_13.setVisible(true);
                }
                s_12 = s_13;
                if (n10 == 0) break block5;
                if (s_12.b() != 0) break block6;
                s_12 = s_13;
            }
            return s_12.C();
        }
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

