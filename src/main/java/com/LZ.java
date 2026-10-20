/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.IB;
import com.YV;
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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.KeyStroke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class LZ
extends JCheckBoxMenuItem
implements au_0,
eh_0,
yb_2 {
    public LZ() {
    }

    public LZ(Action action) {
        super(action);
    }

    public LZ(Icon icon) {
        super(icon);
    }

    public LZ(String string) {
        super(string);
    }

    public LZ(String string, KeyStroke keyStroke) {
        super(string);
        this.setAccelerator(keyStroke);
    }

    public LZ(String string, cs_0 cs_02) {
        super(string);
        this.s(cs_02);
    }

    public LZ(String string, boolean bl) {
        super(string, bl);
    }

    public LZ(String string, Icon icon) {
        super(string, icon);
    }

    public LZ(String string, Icon icon, boolean bl) {
        super(string, icon, bl);
    }

    public LZ(String string, Icon icon, KeyStroke keyStroke) {
        super(string, icon);
        this.setAccelerator(keyStroke);
    }

    public LZ(String string, Icon icon, boolean bl, KeyStroke keyStroke) {
        super(string, icon, bl);
        this.setAccelerator(keyStroke);
    }

    public LZ(String string, Icon icon, cs_0 cs_02) {
        super(string, icon);
        this.s(cs_02);
    }

    public LZ(String string, Icon icon, boolean bl, cs_0 cs_02) {
        super(string, icon, bl);
        this.s(cs_02);
    }

    public void s(cs_0 cs_02) {
        FN.H(this, cs_02);
    }

    @Override
    public Insets getMargin() {
        return this.f().s();
    }

    @Override
    public void setMargin(Insets insets) {
        this.f().L(insets);
    }

    public int K() {
        return this.f().W();
    }

    public void K(int n10) {
        this.f().d(n10);
    }

    public Color H() {
        return this.f().S();
    }

    public void v(Color color) {
        this.f().T(color);
    }

    public Color w() {
        return this.f().f();
    }

    public void q(Color color) {
        this.f().G(color);
    }

    public Color e() {
        return this.f().w();
    }

    public void F(Color color) {
        this.f().C(color);
    }

    public Color y() {
        return this.f().x();
    }

    public void H(Color color) {
        this.f().u(color);
    }

    public Color d() {
        return this.f().z();
    }

    public void h(Color color) {
        this.f().a(color);
    }

    public Color m() {
        return this.f().B();
    }

    public void K(Color color) {
        this.f().o(color);
    }

    public int N() {
        return this.f().A();
    }

    public void q(int n10) {
        this.f().U(n10);
    }

    public boolean v() {
        return this.f().X();
    }

    public void W(boolean bl) {
        this.f().E(bl);
    }

    public int e() {
        return this.f().h();
    }

    public void C(int n10) {
        this.f().v(n10);
    }

    public og_2 y() {
        return this.f().j();
    }

    public void d(og_2 og_22) {
        this.f().P(og_22);
    }

    public Color G() {
        return this.f().Z();
    }

    public void G(Color color) {
        this.f().Q(color);
    }

    public YV f() {
        return (YV)this.getUI();
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
                            throw LZ.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw LZ.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof YV)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw LZ.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((YV)kp_0.w(a9.C, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new YV());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw LZ.a(v5);
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

    public LZ O() {
        return (LZ)FN.A(this);
    }

    public LZ h(boolean bl) {
        return (LZ)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    @Override
    public LZ a() {
        return (LZ)FN.u(this);
    }

    public LZ l(boolean bl) {
        return (LZ)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public LZ F() {
        return (LZ)FN.C(this);
    }

    public LZ F(boolean bl) {
        return (LZ)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public LZ V(boolean bl, boolean bl2) {
        return (LZ)FN.K(this, bl, bl2);
    }

    public LZ q(int n10) {
        return (LZ)FN.p((Component)this, n10);
    }

    public LZ T(int n10) {
        return (LZ)FN.O((Component)this, n10);
    }

    public LZ A(int n10) {
        return (LZ)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public LZ v(int n10, boolean bl, boolean bl2) {
        return (LZ)FN.d(this, n10, bl, bl2);
    }

    public LZ t(int n10, int n11) {
        return (LZ)FN.m(this, n10, n11);
    }

    public LZ f(String string) {
        return (LZ)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.f(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.t(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.v(n10, bl, bl2);
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
        return this.q(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.V(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.F(bl);
    }

    @Override
    public Component Q() {
        return this.F();
    }

    @Override
    public Component u(boolean bl) {
        return this.l(bl);
    }

    @Override
    public Component R() {
        return this.a();
    }

    @Override
    public Component c(boolean bl) {
        return this.h(bl);
    }

    @Override
    public Component a() {
        return this.O();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

