/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.HT;
import com.IB;
import com.O5;
import com.PY;
import com.WF;
import com._n_0;
import com.a9;
import com.ac_0;
import com.az_0;
import com.cl_2;
import com.cs_0;
import com.eh_0;
import com.fs_0;
import com.kp_0;
import com.ne_1;
import com.og_2;
import com.pp_0;
import com.rf_1;
import com.sa_0;
import com.sr_0;
import com.wd_0;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.BoundedRangeModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JSlider;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EX
extends JSlider
implements pp_0,
rf_1,
eh_0,
yb_2,
sa_0 {
    public EX() {
    }

    public EX(int n10) {
        super(n10);
    }

    public EX(int n10, int n11) {
        super(n10, n11);
    }

    public EX(int n10, int n11, int n12) {
        super(n10, n11, n12);
    }

    public EX(int n10, int n11, int n12, int n13) {
        super(n10, n11, n12, n13);
    }

    public EX(BoundedRangeModel boundedRangeModel) {
        super(boundedRangeModel);
    }

    public boolean N() {
        return this.i().h();
    }

    public void u(boolean bl) {
        this.i().J(bl);
    }

    public boolean A() {
        return this.i().f();
    }

    public void l(boolean bl) {
        this.i().F(bl);
    }

    public boolean c() {
        return this.i().G();
    }

    public void c(boolean bl) {
        this.i().j(bl);
    }

    public Color T() {
        return this.i().O();
    }

    public void d(Color color) {
        this.i().l(color);
    }

    public Color W() {
        return this.i().u();
    }

    public void j(Color color) {
        this.i().h(color);
    }

    public int o() {
        return this.i().Y();
    }

    public void Y(int n10) {
        this.i().y(n10);
    }

    public int E() {
        return this.i().M();
    }

    public void b(int n10) {
        this.i().E(n10);
    }

    public int S() {
        return this.i().P();
    }

    public void S(int n10) {
        this.i().M(n10);
    }

    public boolean r() {
        return this.i().L();
    }

    public void D(boolean bl) {
        this.i().D(bl);
    }

    public Color S() {
        return this.i().d();
    }

    public void D(Color color) {
        this.i().x(color);
    }

    public Color w() {
        return this.i().b();
    }

    public void s(Color color) {
        this.i().w(color);
    }

    public Color s() {
        return this.i().s();
    }

    public void V(Color color) {
        this.i().B(color);
    }

    public int K() {
        return this.i().V();
    }

    public void J(int n10) {
        this.i().s(n10);
    }

    public int r() {
        return this.i().h();
    }

    public void d(int n10) {
        this.i().q(n10);
    }

    public boolean M() {
        return this.i().T();
    }

    public void a(boolean bl) {
        this.i().p(bl);
    }

    public Color b() {
        return this.i().A();
    }

    public void L(Color color) {
        this.i().g(color);
    }

    public Color R() {
        return this.i().f();
    }

    public void X(Color color) {
        this.i().k(color);
    }

    public int y() {
        return this.i().p();
    }

    public void P(int n10) {
        this.i().L(n10);
    }

    public int z() {
        return this.i().I();
    }

    public void H(int n10) {
        this.i().H(n10);
    }

    public int O() {
        return this.i().l();
    }

    public void e(int n10) {
        this.i().j(n10);
    }

    public int D() {
        return this.i().S();
    }

    public void p(int n10) {
        this.i().l(n10);
    }

    public boolean Q() {
        return this.i().x();
    }

    public void Y(boolean bl) {
        this.i().m(bl);
    }

    public boolean O() {
        return this.i().s();
    }

    public void K(boolean bl) {
        this.i().K(bl);
    }

    public int P() {
        return this.i().i();
    }

    public void a(int n10) {
        this.i().V(n10);
    }

    public Insets V() {
        return this.i().r();
    }

    public void q(Insets insets) {
        this.i().p(insets);
    }

    public EX g(int n10, int n11, int n12, int n13) {
        this.q(new Insets(n10, n11, n12, n13));
        return this;
    }

    public EX R(int n10) {
        return this.g(n10, n10, n10, n10);
    }

    public og_2 r() {
        return this.i().o();
    }

    public EX y(og_2 og_22) {
        this.i().S(og_22);
        return this;
    }

    public _n_0 i() {
        return (_n_0)this.getUI();
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
                        var1_1 = _n_0.G();
                        v0 = this;
                        if (var1_1 != 0) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw EX.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != 0) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw EX.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof _n_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw EX.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((_n_0)kp_0.w(a9.b, new Object[]{this}));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new _n_0(this));
                        if (var1_1 == 0) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw EX.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public MouseAdapter o(O5 o5) {
        return fs_0.F(this, o5);
    }

    @Override
    public MouseAdapter j(HT hT2, O5 o5) {
        return fs_0.h(this, hT2, o5);
    }

    @Override
    public MouseAdapter e(O5 o5) {
        return fs_0.P(this, o5);
    }

    @Override
    public MouseAdapter N(O5 o5) {
        return fs_0.H(this, o5);
    }

    @Override
    public MouseAdapter a(O5 o5) {
        return fs_0.W(this, o5);
    }

    @Override
    public MouseAdapter L(HT hT2, O5 o5) {
        return fs_0.W(this, hT2, o5);
    }

    @Override
    public MouseAdapter h(O5 o5) {
        return fs_0.J(this, o5);
    }

    @Override
    public MouseAdapter d(HT hT2, O5 o5) {
        return fs_0.O((Component)this, hT2, o5);
    }

    @Override
    public MouseAdapter F(O5 o5) {
        return fs_0.q(this, o5);
    }

    @Override
    public MouseAdapter v(O5 o5) {
        return fs_0.o(this, o5);
    }

    @Override
    public KeyAdapter i(sr_0 sr_02) {
        return fs_0.G(this, sr_02);
    }

    @Override
    public KeyAdapter I(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.O((Component)this, cs_02, sr_02);
    }

    @Override
    public KeyAdapter g(sr_0 sr_02) {
        return fs_0.Q(this, sr_02);
    }

    @Override
    public KeyAdapter U(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.R(this, cs_02, sr_02);
    }

    @Override
    public KeyAdapter e(sr_0 sr_02) {
        return fs_0.u(this, sr_02);
    }

    @Override
    public KeyAdapter j(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.I(this, cs_02, sr_02);
    }

    @Override
    public FocusAdapter u(az_0 az_02) {
        return fs_0.K(this, az_02);
    }

    @Override
    public FocusAdapter e(az_0 az_02) {
        return fs_0.t(this, az_02);
    }

    @Override
    public wd_0 p(String string) {
        return ac_0.I(this, string);
    }

    @Override
    public wd_0 d(Icon icon, String string) {
        return ac_0.d(this, icon, string);
    }

    @Override
    public wd_0 V(String string, WF wF) {
        return ac_0.B(this, string, wF);
    }

    @Override
    public wd_0 X(Icon icon, String string, WF wF) {
        return ac_0.g((Component)this, icon, string, wF);
    }

    @Override
    public wd_0 y(String string, WF wF, int n10) {
        return ac_0.l(this, string, wF, n10);
    }

    @Override
    public wd_0 Y(Icon icon, String string, WF wF, int n10) {
        return ac_0.R(this, icon, string, wF, n10);
    }

    @Override
    public wd_0 g(JComponent jComponent) {
        return ac_0.k(this, jComponent);
    }

    @Override
    public wd_0 I(JComponent jComponent, int n10) {
        return ac_0.o((Component)this, jComponent, n10);
    }

    @Override
    public wd_0 j(JComponent jComponent, WF wF) {
        return ac_0.R(this, jComponent, wF);
    }

    @Override
    public wd_0 g(JComponent jComponent, WF wF, int n10) {
        return ac_0.B(this, jComponent, wF, n10);
    }

    @Override
    public wd_0 s(String string) {
        return ac_0.Q((Component)this, string);
    }

    @Override
    public wd_0 u(Icon icon, String string) {
        return ac_0.o((Component)this, icon, string);
    }

    @Override
    public wd_0 u(String string, WF wF) {
        return ac_0.q(this, string, wF);
    }

    @Override
    public wd_0 h(Icon icon, String string, WF wF) {
        return ac_0.P(this, icon, string, wF);
    }

    @Override
    public wd_0 f(String string, WF wF, int n10) {
        return ac_0.r(this, string, wF, n10);
    }

    @Override
    public wd_0 o(Icon icon, String string, WF wF, int n10) {
        return ac_0.V(this, icon, string, wF, n10);
    }

    @Override
    public wd_0 B(JComponent jComponent) {
        return ac_0.Q((Component)this, jComponent);
    }

    @Override
    public wd_0 p(JComponent jComponent, int n10) {
        return ac_0.S(this, jComponent, n10);
    }

    @Override
    public wd_0 n(JComponent jComponent, WF wF) {
        return ac_0.I(this, jComponent, wF);
    }

    @Override
    public wd_0 X(JComponent jComponent, WF wF, int n10) {
        return ac_0.U(this, jComponent, wF, n10);
    }

    @Override
    public void Q(wd_0 wd_02) {
        ac_0.s(this, wd_02);
    }

    @Override
    public void O() {
        ac_0.o(this);
    }

    @Override
    public void q(wd_0[] wd_0Array) {
        ac_0.Y(this, wd_0Array);
    }

    @Override
    public void W(List list) {
        ac_0.S(this, list);
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

    public EX J() {
        return (EX)FN.A(this);
    }

    public EX Z(boolean bl) {
        return (EX)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public EX j() {
        return (EX)FN.u(this);
    }

    public EX S(boolean bl) {
        return (EX)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public EX P() {
        return (EX)FN.C(this);
    }

    public EX m(boolean bl) {
        return (EX)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public EX n(boolean bl, boolean bl2) {
        return (EX)FN.K(this, bl, bl2);
    }

    public EX F(int n10) {
        return (EX)FN.p((Component)this, n10);
    }

    public EX M(int n10) {
        return (EX)FN.O((Component)this, n10);
    }

    public EX T(int n10) {
        return (EX)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public EX i(int n10, boolean bl, boolean bl2) {
        return (EX)FN.d(this, n10, bl, bl2);
    }

    public EX V(int n10, int n11) {
        return (EX)FN.m(this, n10, n11);
    }

    public EX P(String string) {
        return (EX)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public EX q(int n10) {
        return (EX)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public EX m(int n10) {
        return (EX)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    @Override
    public EX p(int n10) {
        return (EX)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    @Override
    public EX i(int n10) {
        return (EX)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public EX Y(int n10) {
        return (EX)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public EX K(int n10) {
        return (EX)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public EX K(int n10, int n11) {
        return (EX)PY.O(this, n10, n11);
    }

    @Override
    public Component N(String string) {
        return this.P(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.V(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.i(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.T(n10);
    }

    @Override
    public Component o(int n10) {
        return this.M(n10);
    }

    @Override
    public Component i(int n10) {
        return this.F(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.n(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.m(bl);
    }

    @Override
    public Component Q() {
        return this.P();
    }

    @Override
    public Component u(boolean bl) {
        return this.S(bl);
    }

    @Override
    public Component R() {
        return this.j();
    }

    @Override
    public Component c(boolean bl) {
        return this.Z(bl);
    }

    @Override
    public Component a() {
        return this.J();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.K(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.K(n10);
    }

    @Override
    public Component p(int n10) {
        return this.Y(n10);
    }

    @Override
    public Component D(int n10) {
        return this.i(n10);
    }

    @Override
    public Component V(int n10) {
        return this.p(n10);
    }

    @Override
    public Component x(int n10) {
        return this.m(n10);
    }

    @Override
    public Component O(int n10) {
        return this.q(n10);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

