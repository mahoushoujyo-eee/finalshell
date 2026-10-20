/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.a9;
import com.au_0;
import com.c;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.oc_1;
import com.og_2;
import com.pb_2;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.wA
 */
public class wa_1
extends JMenu
implements au_0,
yb_2 {
    public wa_1() {
    }

    public wa_1(Icon icon) {
        this.setIcon(icon);
    }

    public wa_1(String string) {
        super(string);
    }

    public wa_1(Action action) {
        super(action);
    }

    public wa_1(String string, Icon icon) {
        super(string);
        this.setIcon(icon);
    }

    @Override
    protected Point getPopupMenuOrigin() {
        Point point;
        block3: {
            block2: {
                point = super.getPopupMenuOrigin();
                int[] nArray = pb_2.g();
                if (nArray == null) break block2;
                if (this.getParent() instanceof JPopupMenu) break block3;
                point.x += cy_1.x;
            }
            point.y += cy_1.s;
        }
        return point;
    }

    @Override
    public void setPopupMenuVisible(boolean bl) {
        super.setPopupMenuVisible(bl);
    }

    public int z() {
        return this.I().F();
    }

    public void T(int n10) {
        this.I().C(n10);
    }

    public int J() {
        return this.I().t();
    }

    public void r(int n10) {
        this.I().P(n10);
    }

    @Override
    public Insets getMargin() {
        return this.I().o();
    }

    @Override
    public void setMargin(Insets insets) {
        this.I().S(insets);
    }

    public int r() {
        return this.I().q();
    }

    public void p(int n10) {
        this.I().f(n10);
    }

    public Color T() {
        return this.I().P();
    }

    public void i(Color color) {
        this.I().E(color);
    }

    public Color W() {
        return this.I().w();
    }

    public void x(Color color) {
        this.I().l(color);
    }

    public Color G() {
        return this.I().Q();
    }

    public void q(Color color) {
        this.I().W(color);
    }

    public int W() {
        return this.I().L();
    }

    public void F(int n10) {
        this.I().v(n10);
    }

    public boolean S() {
        return this.I().T();
    }

    public void h(boolean bl) {
        this.I().K(bl);
    }

    public int y() {
        return this.I().f();
    }

    public void t(int n10) {
        this.I().a(n10);
    }

    public og_2 u() {
        return this.I().P();
    }

    public void o(og_2 og_22) {
        this.I().z(og_22);
    }

    public oc_1 I() {
        return (oc_1)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block20: {
                                var1_1 = pb_2.g();
                                v0 = this;
                                if (var1_1 == null) ** GOTO lbl26
                                if (v0.getUI() == null) break block15;
                                break block20;
                                catch (Throwable v1) {
                                    throw wa_1.a(v1);
                                }
                            }
                            try {
                                block21: {
                                    v2 = this;
                                    if (var1_1 == null) break block16;
                                    break block21;
                                    catch (Throwable v3) {
                                        throw wa_1.a(v3);
                                    }
                                }
                                if (!(v2.getUI() instanceof oc_1)) {
                                }
                                ** GOTO lbl33
                            }
                            catch (Throwable v4) {
                                throw wa_1.a(v4);
                            }
                        }
                        try {
                            v0 = this;
lbl26:
                            // 2 sources

                            v0.setUI((oc_1)kp_0.w(a9.O, new Object[0]));
                            break block17;
                        }
                        catch (Throwable var2_2) {
                            try {
                                ne_1.g(this, var2_2);
                                this.setUI(new oc_1());
                                if (var1_1 != null) break block17;
lbl33:
                                // 2 sources

                                v2 = this;
                            }
                            catch (Throwable v5) {
                                throw wa_1.a(v5);
                            }
                        }
                    }
                    v2.setUI(this.getUI());
                }
                try {
                    try {
                        v6 = this.getPopupMenu();
                        if (var1_1 == null) break block18;
                        if (v6 == null) break block19;
                    }
                    catch (Throwable v7) {
                        throw wa_1.a(v7);
                    }
                    v6 = this.getPopupMenu();
                }
                catch (Throwable v8) {
                    throw wa_1.a(v8);
                }
            }
            v6.updateUI();
        }
    }

    @Override
    public void u(String string, Object[] objectArray) {
        i2_0.n(this, string, objectArray);
    }

    @Override
    public void F(Object[] objectArray) {
        i2_0.U(this, objectArray);
    }

    @Override
    public void N(String string, Object[] objectArray) {
        i2_0.q(this, string, objectArray);
    }

    @Override
    public void M() {
        i2_0.L(this);
    }

    @Override
    public boolean k() {
        return i2_0.Z(this);
    }

    @Override
    public void M(ld_2 ld_22) {
        i2_0.g(this, ld_22);
    }

    @Override
    public void i() {
        i2_0.o(this);
    }

    public wa_1 O() {
        return (wa_1)FN.A(this);
    }

    public wa_1 P(boolean bl) {
        return (wa_1)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public wa_1 V() {
        return (wa_1)FN.u(this);
    }

    public wa_1 B(boolean bl) {
        return (wa_1)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public wa_1 f() {
        return (wa_1)FN.C(this);
    }

    public wa_1 i(boolean bl) {
        return (wa_1)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    @Override
    public wa_1 D(boolean bl, boolean bl2) {
        return (wa_1)FN.K(this, bl, bl2);
    }

    public wa_1 v(int n10) {
        return (wa_1)FN.p((Component)this, n10);
    }

    public wa_1 A(int n10) {
        return (wa_1)FN.O((Component)this, n10);
    }

    public wa_1 Y(int n10) {
        return (wa_1)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public wa_1 T(int n10, boolean bl, boolean bl2) {
        return (wa_1)FN.d(this, n10, bl, bl2);
    }

    public wa_1 A(int n10, int n11) {
        return (wa_1)FN.m(this, n10, n11);
    }

    public wa_1 s(String string) {
        return (wa_1)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.s(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.A(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.T(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.Y(n10);
    }

    @Override
    public Component o(int n10) {
        return this.A(n10);
    }

    @Override
    public Component i(int n10) {
        return this.v(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.D(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.i(bl);
    }

    @Override
    public Component Q() {
        return this.f();
    }

    @Override
    public Component u(boolean bl) {
        return this.B(bl);
    }

    @Override
    public Component R() {
        return this.V();
    }

    @Override
    public Component c(boolean bl) {
        return this.P(bl);
    }

    @Override
    public Component a() {
        return this.O();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

