/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.a9;
import com.au_0;
import com.cs_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.og_2;
import com.pb_2;
import com.yb_2;
import com.yh_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class QW
extends JMenuItem
implements au_0,
yb_2 {
    public QW() {
    }

    public QW(Icon icon) {
        super(icon);
    }

    public QW(String string) {
        super(string);
    }

    public QW(String string, KeyStroke keyStroke) {
        super(string);
        this.setAccelerator(keyStroke);
    }

    public QW(String string, cs_0 cs_02) {
        super(string);
        this.D(cs_02);
    }

    public QW(Action action) {
        super(action);
    }

    public QW(String string, Icon icon) {
        super(string, icon);
    }

    public QW(String string, int n10) {
        super(string, n10);
    }

    public QW(String string, Icon icon, KeyStroke keyStroke) {
        super(string, icon);
        this.setAccelerator(keyStroke);
    }

    public QW(String string, Icon icon, cs_0 cs_02) {
        super(string, icon);
        this.D(cs_02);
    }

    public void D(cs_0 cs_02) {
        FN.H(this, cs_02);
    }

    @Override
    public Insets getMargin() {
        return this.N().s();
    }

    @Override
    public void setMargin(Insets insets) {
        this.N().L(insets);
    }

    public int G() {
        return this.N().W();
    }

    public void r(int n10) {
        this.N().d(n10);
    }

    public Color J() {
        return this.N().S();
    }

    public void R(Color color) {
        this.N().T(color);
    }

    public Color B() {
        return this.N().f();
    }

    public void b(Color color) {
        this.N().G(color);
    }

    public Color c() {
        return this.N().w();
    }

    public void V(Color color) {
        this.N().C(color);
    }

    public Color C() {
        return this.N().x();
    }

    public void P(Color color) {
        this.N().u(color);
    }

    public Color h() {
        return this.N().z();
    }

    public void F(Color color) {
        this.N().a(color);
    }

    public Color G() {
        return this.N().B();
    }

    public void G(Color color) {
        this.N().o(color);
    }

    public int I() {
        return this.N().A();
    }

    public void e(int n10) {
        this.N().U(n10);
    }

    public boolean E() {
        return this.N().X();
    }

    public void F(boolean bl) {
        this.N().E(bl);
    }

    public int E() {
        return this.N().h();
    }

    public void u(int n10) {
        this.N().v(n10);
    }

    public og_2 z() {
        return this.N().j();
    }

    public void E(og_2 og_22) {
        this.N().P(og_22);
    }

    public yh_0 N() {
        return (yh_0)this.getUI();
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
                            throw QW.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw QW.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof yh_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw QW.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((yh_0)kp_0.w(a9.zH, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new yh_0());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw QW.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
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

    public QW L() {
        return (QW)FN.A(this);
    }

    public QW b(boolean bl) {
        return (QW)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public QW j() {
        return (QW)FN.u(this);
    }

    @Override
    public QW u(boolean bl) {
        return (QW)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public QW b() {
        return (QW)FN.C(this);
    }

    @Override
    public QW c(boolean bl) {
        return (QW)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public QW O(boolean bl, boolean bl2) {
        return (QW)FN.K(this, bl, bl2);
    }

    public QW B(int n10) {
        return (QW)FN.p((Component)this, n10);
    }

    public QW w(int n10) {
        return (QW)FN.O((Component)this, n10);
    }

    public QW u(int n10) {
        return (QW)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public QW u(int n10, boolean bl, boolean bl2) {
        return (QW)FN.d(this, n10, bl, bl2);
    }

    public QW d(int n10, int n11) {
        return (QW)FN.m(this, n10, n11);
    }

    public QW z(String string) {
        return (QW)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.z(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.d(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.u(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.u(n10);
    }

    @Override
    public Component o(int n10) {
        return this.w(n10);
    }

    @Override
    public Component i(int n10) {
        return this.B(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.O(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.c(bl);
    }

    @Override
    public Component Q() {
        return this.b();
    }

    @Override
    public Component u(boolean bl) {
        return this.u(bl);
    }

    @Override
    public Component R() {
        return this.j();
    }

    @Override
    public Component c(boolean bl) {
        return this.b(bl);
    }

    @Override
    public Component a() {
        return this.L();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

