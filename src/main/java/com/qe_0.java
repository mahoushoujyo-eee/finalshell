/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DN;
import com.FN;
import com.G8;
import com.GO;
import com.HT;
import com.IB;
import com.KD;
import com.O5;
import com.PY;
import com.SG;
import com.W2;
import com.WF;
import com.a9;
import com.ac_0;
import com.au_0;
import com.az_0;
import com.cl_2;
import com.cs_0;
import com.eh_0;
import com.fs_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.og_2;
import com.pp_0;
import com.rf_1;
import com.sa_0;
import com.sr_0;
import com.w6_0;
import com.wd_0;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JToggleButton;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Qe
 */
public class qe_0
extends JToggleButton
implements W2,
pp_0,
rf_1,
au_0,
eh_0,
yb_2,
sa_0 {
    public qe_0() {
    }

    public qe_0(Icon icon) {
        super(icon);
        this.k(SG.T);
        this.K(SG.M);
    }

    public qe_0(Icon icon, boolean bl) {
        super(icon, bl);
    }

    public qe_0(String string) {
        super(string);
    }

    public qe_0(String string, boolean bl) {
        super(string, bl);
    }

    public qe_0(String string, Icon icon) {
        super(string, icon);
    }

    public qe_0(String string, Icon icon, boolean bl) {
        super(string, icon, bl);
    }

    public qe_0(ActionListener actionListener) {
        this.addActionListener(actionListener);
    }

    public qe_0(Icon icon, ActionListener actionListener) {
        super(icon);
        this.k(SG.T);
        this.K(SG.M);
        this.addActionListener(actionListener);
    }

    public qe_0(Icon icon, boolean bl, ActionListener actionListener) {
        super(icon, bl);
        this.addActionListener(actionListener);
    }

    public qe_0(String string, ActionListener actionListener) {
        super(string);
        this.addActionListener(actionListener);
    }

    public qe_0(String string, boolean bl, ActionListener actionListener) {
        super(string, bl);
        this.addActionListener(actionListener);
    }

    public qe_0(String string, Icon icon, ActionListener actionListener) {
        super(string, icon);
        this.addActionListener(actionListener);
    }

    public qe_0(String string, Icon icon, boolean bl, ActionListener actionListener) {
        super(string, icon, bl);
        this.addActionListener(actionListener);
    }

    public qe_0(Action action) {
        super(action);
    }

    public DN G(Integer n10) {
        return this.H(new cs_0(n10));
    }

    public DN G(boolean bl, boolean bl2, boolean bl3, Integer n10) {
        return this.H(new cs_0(bl, bl2, bl3, n10));
    }

    public DN H(cs_0 cs_02) {
        return w6_0.R(this, cs_02);
    }

    public DN Z(cs_0 cs_02, boolean bl) {
        return w6_0.T(this, cs_02, bl);
    }

    public DN T(cs_0 cs_02, WF wF) {
        return w6_0.y(this, cs_02, wF);
    }

    public DN X(Component component, cs_0 cs_02) {
        return w6_0.k(component, this, cs_02);
    }

    public DN L(Component component, cs_0 cs_02, boolean bl) {
        return w6_0.R(component, this, cs_02, bl);
    }

    public DN L(Component component, cs_0 cs_02, WF wF) {
        return w6_0.V(component, this, cs_02, wF);
    }

    public List y() {
        return w6_0.g(this);
    }

    public void k(DN dN) {
        w6_0.n(dN);
    }

    public void A() {
        w6_0.A(this);
    }

    public Color I() {
        return this.E().Y();
    }

    public qe_0 M(Color color) {
        this.E().d(color);
        return this;
    }

    public Color e() {
        return this.E().z();
    }

    public qe_0 C(Color color) {
        this.E().Q(color);
        return this;
    }

    public Color i() {
        return this.E().k();
    }

    public qe_0 R(Color color) {
        this.E().J(color);
        return this;
    }

    public Color E() {
        return this.E().i();
    }

    public qe_0 j(Color color) {
        this.E().w(color);
        return this;
    }

    public Color t() {
        return this.E().H();
    }

    public qe_0 r(Color color) {
        this.E().j(color);
        return this;
    }

    public boolean o() {
        return this.E().H();
    }

    public qe_0 M(boolean bl) {
        this.E().f(bl);
        return this;
    }

    public boolean A() {
        return this.E().G();
    }

    public qe_0 p(boolean bl) {
        this.E().y(bl);
        return this;
    }

    public Color b() {
        return this.E().l();
    }

    public qe_0 q(Color color) {
        this.E().u(color);
        return this;
    }

    public int W() {
        return this.E().C();
    }

    public qe_0 k(int n10) {
        this.E().D(n10);
        return this;
    }

    public boolean Q() {
        return this.E().U();
    }

    public qe_0 H(boolean bl) {
        this.E().d(bl);
        return this;
    }

    public boolean B() {
        return this.E().k();
    }

    public qe_0 V(boolean bl) {
        this.E().A(bl);
        return this;
    }

    public int N() {
        return this.E().d();
    }

    public qe_0 N(int n10) {
        this.E().z(n10);
        return this;
    }

    public Color v() {
        return this.E().V();
    }

    public qe_0 g(Color color) {
        this.E().F(color);
        return this;
    }

    public int r() {
        return this.E().Z();
    }

    public qe_0 W(int n10) {
        this.E().r(n10);
        return this;
    }

    public Color M() {
        return this.E().t();
    }

    public qe_0 X(Color color) {
        this.E().O(color);
        return this;
    }

    public int P() {
        return this.E().N();
    }

    public qe_0 K(int n10) {
        this.E().l(n10);
        return this;
    }

    public boolean x() {
        return this.E().x();
    }

    public qe_0 G(boolean bl) {
        this.E().q(bl);
        return this;
    }

    public boolean W() {
        return this.E().m();
    }

    public qe_0 l(boolean bl) {
        this.E().k(bl);
        return this;
    }

    public boolean c() {
        return this.E().o();
    }

    public qe_0 R(boolean bl) {
        this.E().l(bl);
        return this;
    }

    public og_2 U() {
        return this.E().R();
    }

    public qe_0 V(og_2 og_22) {
        this.E().S(og_22);
        return this;
    }

    public boolean Z() {
        return this.E().K();
    }

    public qe_0 T(boolean bl) {
        this.E().B(bl);
        return this;
    }

    public boolean p() {
        return this.E().A();
    }

    public qe_0 m(boolean bl) {
        this.E().M(bl);
        return this;
    }

    public boolean v() {
        return this.E().l();
    }

    public qe_0 A(boolean bl) {
        this.E().u(bl);
        return this;
    }

    public float E() {
        return this.E().Z();
    }

    public qe_0 O(float f10) {
        this.E().j(f10);
        return this;
    }

    public boolean t() {
        return this.E().n();
    }

    public qe_0 W(boolean bl) {
        this.E().r(bl);
        return this;
    }

    public boolean P() {
        return this.E().i();
    }

    public qe_0 b(boolean bl) {
        this.E().m(bl);
        return this;
    }

    public boolean X() {
        return this.E().C();
    }

    public qe_0 t(boolean bl) {
        this.E().E(bl);
        return this;
    }

    public boolean s() {
        return this.E().Y();
    }

    public qe_0 S(boolean bl) {
        this.E().J(bl);
        return this;
    }

    public qe_0 l(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.E().Z(bl, bl2, bl3, bl4);
        return this;
    }

    public boolean T() {
        return this.E().F();
    }

    public qe_0 I(boolean bl) {
        this.E().L(bl);
        return this;
    }

    public boolean z() {
        return this.E().B();
    }

    public qe_0 C(boolean bl) {
        this.E().Q(bl);
        return this;
    }

    public boolean n() {
        return this.E().W();
    }

    public qe_0 Y(boolean bl) {
        this.E().W(bl);
        return this;
    }

    public boolean R() {
        return this.E().I();
    }

    public qe_0 y(boolean bl) {
        this.E().K(bl);
        return this;
    }

    public qe_0 o(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.E().a(bl, bl2, bl3, bl4);
        return this;
    }

    @Override
    public Insets getMargin() {
        return this.E().A();
    }

    @Override
    public void setMargin(Insets insets) {
        this.E().Q(insets);
    }

    public qe_0 v(int n10, int n11, int n12, int n13) {
        this.setMargin(new Insets(n10, n11, n12, n13));
        return this;
    }

    public qe_0 t(int n10) {
        return this.v(n10, n10, n10, n10);
    }

    @Override
    public Shape B() {
        return this.E().B();
    }

    public G8 E() {
        return (G8)this.getUI();
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
                        var1_1 = KD.s();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw qe_0.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw qe_0.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof G8)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw qe_0.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((G8)kp_0.w(a9.Z, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new G8());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw qe_0.a(v5);
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

    public qe_0 t() {
        return (qe_0)FN.A(this);
    }

    public qe_0 x(boolean bl) {
        return (qe_0)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public qe_0 T() {
        return (qe_0)FN.u(this);
    }

    public qe_0 r(boolean bl) {
        return (qe_0)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public qe_0 m() {
        return (qe_0)FN.C(this);
    }

    public qe_0 k(boolean bl) {
        return (qe_0)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public qe_0 q(boolean bl, boolean bl2) {
        return (qe_0)FN.K(this, bl, bl2);
    }

    @Override
    public qe_0 O(int n10) {
        return (qe_0)FN.p((Component)this, n10);
    }

    public qe_0 l(int n10) {
        return (qe_0)FN.O((Component)this, n10);
    }

    public qe_0 M(int n10) {
        return (qe_0)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public qe_0 q(int n10, boolean bl, boolean bl2) {
        return (qe_0)FN.d(this, n10, bl, bl2);
    }

    public qe_0 N(int n10, int n11) {
        return (qe_0)FN.m(this, n10, n11);
    }

    public qe_0 e(String string) {
        return (qe_0)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    @Override
    public qe_0 i(int n10) {
        return (qe_0)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public qe_0 j(int n10) {
        return (qe_0)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    @Override
    public qe_0 V(int n10) {
        return (qe_0)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public qe_0 T(int n10) {
        return (qe_0)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public qe_0 e(int n10) {
        return (qe_0)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public qe_0 X(int n10) {
        return (qe_0)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public qe_0 Q(int n10, int n11) {
        return (qe_0)PY.O(this, n10, n11);
    }

    public static qe_0 T(ImageIcon imageIcon) {
        return qe_0.A(imageIcon, GO.Fx);
    }

    public static qe_0 A(ImageIcon imageIcon, int n10) {
        return qe_0.y(imageIcon, n10, GO.FG);
    }

    public static qe_0 y(ImageIcon imageIcon, int n10, int n11) {
        return qe_0.q(imageIcon, n10, n11, GO.f);
    }

    public static qe_0 q(ImageIcon imageIcon, int n10, int n11, int n12) {
        return qe_0.k(imageIcon, n10, n11, n12, GO.Fg);
    }

    public static qe_0 k(ImageIcon imageIcon, int n10, int n11, int n12, boolean bl) {
        return qe_0.r(imageIcon, n10, n11, n12, bl, GO.Fl);
    }

    public static qe_0 r(ImageIcon imageIcon, int n10, int n11, int n12, boolean bl, boolean bl2) {
        return qe_0.v(imageIcon, n10, n11, n12, bl, bl2, true);
    }

    public static qe_0 v(ImageIcon imageIcon, int n10, int n11, int n12, boolean bl, boolean bl2, boolean bl3) {
        qe_0 qe_02 = qe_0.F(n10, n11, n12, 0, bl, bl2, bl3);
        qe_02.setIcon(imageIcon);
        return qe_02;
    }

    public static qe_0 F(int n10, int n11, int n12, int n13, boolean bl, boolean bl2, boolean bl3) {
        qe_0 qe_02 = new qe_0();
        qe_02.k(n10);
        qe_02.N(n11);
        qe_02.W(n12);
        qe_02.K(n13);
        qe_02.G(bl);
        qe_02.R(bl2);
        qe_02.m(bl3);
        return qe_02;
    }

    @Override
    public Component N(String string) {
        return this.e(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.N(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.q(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.M(n10);
    }

    @Override
    public Component o(int n10) {
        return this.l(n10);
    }

    @Override
    public Component i(int n10) {
        return this.O(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.q(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.k(bl);
    }

    @Override
    public Component Q() {
        return this.m();
    }

    @Override
    public Component u(boolean bl) {
        return this.r(bl);
    }

    @Override
    public Component R() {
        return this.T();
    }

    @Override
    public Component c(boolean bl) {
        return this.x(bl);
    }

    @Override
    public Component a() {
        return this.t();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.Q(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.X(n10);
    }

    @Override
    public Component p(int n10) {
        return this.e(n10);
    }

    @Override
    public Component D(int n10) {
        return this.T(n10);
    }

    @Override
    public Component V(int n10) {
        return this.V(n10);
    }

    @Override
    public Component x(int n10) {
        return this.j(n10);
    }

    @Override
    public Component O(int n10) {
        return this.i(n10);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

