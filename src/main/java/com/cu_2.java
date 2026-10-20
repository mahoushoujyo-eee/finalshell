/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.IB;
import com.YN;
import com.a9;
import com.au_0;
import com.cl_2;
import com.cs_0;
import com.eh_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.og_2;
import com.pb_2;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.cu
 */
public class cu_2
extends JRadioButtonMenuItem
implements au_0,
eh_0,
yb_2 {
    public cu_2() {
    }

    public cu_2(Action action) {
        super(action);
    }

    public cu_2(Icon icon) {
        super(icon);
    }

    public cu_2(Icon icon, boolean bl) {
        super(icon, bl);
    }

    public cu_2(String string) {
        super(string);
    }

    public cu_2(String string, KeyStroke keyStroke) {
        super(string);
        this.setAccelerator(keyStroke);
    }

    public cu_2(String string, cs_0 cs_02) {
        super(string);
        this.y(cs_02);
    }

    public cu_2(String string, Icon icon) {
        super(string, icon);
    }

    public cu_2(String string, Icon icon, boolean bl) {
        super(string, icon, bl);
    }

    public cu_2(String string, boolean bl) {
        super(string, bl);
    }

    public cu_2(String string, Icon icon, KeyStroke keyStroke) {
        super(string, icon);
        this.setAccelerator(keyStroke);
    }

    public cu_2(String string, Icon icon, boolean bl, KeyStroke keyStroke) {
        super(string, icon, bl);
        this.setAccelerator(keyStroke);
    }

    public cu_2(String string, Icon icon, cs_0 cs_02) {
        super(string, icon);
        this.y(cs_02);
    }

    public cu_2(String string, Icon icon, boolean bl, cs_0 cs_02) {
        super(string, icon, bl);
        this.y(cs_02);
    }

    public void y(cs_0 cs_02) {
        FN.H(this, cs_02);
    }

    @Override
    public Insets getMargin() {
        return this.v().s();
    }

    @Override
    public void setMargin(Insets insets) {
        this.v().L(insets);
    }

    public int R() {
        return this.v().W();
    }

    public void o(int n10) {
        this.v().d(n10);
    }

    public Color Q() {
        return this.v().S();
    }

    public void u(Color color) {
        this.v().T(color);
    }

    public Color T() {
        return this.v().f();
    }

    public void t(Color color) {
        this.v().G(color);
    }

    public Color u() {
        return this.v().w();
    }

    public void f(Color color) {
        this.v().C(color);
    }

    public Color l() {
        return this.v().x();
    }

    public void Z(Color color) {
        this.v().u(color);
    }

    public Color X() {
        return this.v().z();
    }

    public void T(Color color) {
        this.v().a(color);
    }

    public Color n() {
        return this.v().B();
    }

    public void R(Color color) {
        this.v().o(color);
    }

    public int I() {
        return this.v().A();
    }

    public void K(int n10) {
        this.v().U(n10);
    }

    public boolean V() {
        return this.v().X();
    }

    public void S(boolean bl) {
        this.v().E(bl);
    }

    public int T() {
        return this.v().h();
    }

    public void B(int n10) {
        this.v().v(n10);
    }

    public og_2 N() {
        return this.v().j();
    }

    public void u(og_2 og_22) {
        this.v().P(og_22);
    }

    public Color E() {
        return this.v().N();
    }

    public void B(Color color) {
        this.v().J(color);
    }

    public YN v() {
        return (YN)this.getUI();
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
                            throw cu_2.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw cu_2.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof YN)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw cu_2.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((YN)kp_0.w(a9.z7, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new YN());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw cu_2.a(v5);
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

    @Override
    public void p(String string) {
        cl_2.c(this, string);
    }

    @Override
    public void a(String string, Class clazz) {
        cl_2.x(this, string, clazz);
    }

    @Override
    public void E(String string, Object object) {
        cl_2.e(this, string, object);
    }

    @Override
    public void n(String string, String string2) {
        cl_2.B(this, string, string2);
    }

    @Override
    public void I(String string, String string2, Class clazz) {
        cl_2.t(this, string, string2, clazz);
    }

    @Override
    public void H(String string, String string2, Object object) {
        cl_2.a(this, string, string2, object);
    }

    @Override
    public void S(String string, boolean bl, boolean bl2) {
        cl_2.l(this, string, bl, bl2);
    }

    @Override
    public void O(String string, Class clazz, boolean bl, boolean bl2) {
        cl_2.X(this, string, clazz, bl, bl2);
    }

    @Override
    public void h(String string, Object object, boolean bl, boolean bl2) {
        cl_2.A(this, string, object, bl, bl2);
    }

    @Override
    public void e(String string, String string2, Class clazz, boolean bl, boolean bl2) {
        cl_2.L(this, string, string2, clazz, bl, bl2);
    }

    @Override
    public void D(String string, String string2, Object object, boolean bl, boolean bl2) {
        cl_2.y(this, string, string2, object, bl, bl2);
    }

    @Override
    public void z(IB iB) {
        cl_2.a(this, iB);
    }

    @Override
    public void w() {
        cl_2.O(this);
    }

    @Override
    public void m() {
        cl_2.G(this);
    }

    @Override
    public void e() {
        cl_2.H(this);
    }

    public cu_2 O() {
        return (cu_2)FN.A(this);
    }

    public cu_2 m(boolean bl) {
        return (cu_2)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public cu_2 A() {
        return (cu_2)FN.u(this);
    }

    public cu_2 o(boolean bl) {
        return (cu_2)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public cu_2 I() {
        return (cu_2)FN.C(this);
    }

    public cu_2 z(boolean bl) {
        return (cu_2)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public cu_2 B(boolean bl, boolean bl2) {
        return (cu_2)FN.K(this, bl, bl2);
    }

    public cu_2 g(int n10) {
        return (cu_2)FN.p((Component)this, n10);
    }

    public cu_2 T(int n10) {
        return (cu_2)FN.O((Component)this, n10);
    }

    public cu_2 A(int n10) {
        return (cu_2)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public cu_2 j(int n10, boolean bl, boolean bl2) {
        return (cu_2)FN.d(this, n10, bl, bl2);
    }

    public cu_2 J(int n10, int n11) {
        return (cu_2)FN.m(this, n10, n11);
    }

    public cu_2 p(String string) {
        return (cu_2)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.p(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.J(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.j(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.A(n10);
    }

    @Override
    public Component o(int n10) {
        return this.T(n10);
    }

    @Override
    public Component i(int n10) {
        return this.g(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.B(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.z(bl);
    }

    @Override
    public Component Q() {
        return this.I();
    }

    @Override
    public Component u(boolean bl) {
        return this.o(bl);
    }

    @Override
    public Component R() {
        return this.A();
    }

    @Override
    public Component c(boolean bl) {
        return this.m(bl);
    }

    @Override
    public Component a() {
        return this.O();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

