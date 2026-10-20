/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DN;
import com.FN;
import com.GO;
import com.HT;
import com.O5;
import com.PY;
import com.SG;
import com.W2;
import com.WF;
import com.a9;
import com.ac_0;
import com.au_0;
import com.az_0;
import com.cs_0;
import com.fs_0;
import com.gi_0;
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
import javax.swing.JButton;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KD
extends JButton
implements W2,
pp_0,
rf_1,
au_0,
yb_2,
sa_0 {
    private static int[] G;

    public KD() {
    }

    public KD(Icon icon) {
        super(icon);
        this.s(SG.T);
        this.O(SG.M);
    }

    public KD(Icon icon, Icon icon2) {
        super(icon);
        this.setRolloverIcon(icon2);
        this.s(SG.T);
        this.O(SG.M);
    }

    public KD(String string) {
        super(string);
    }

    public KD(String string, Icon icon) {
        super(string, icon);
    }

    public KD(ActionListener actionListener) {
        this.addActionListener(actionListener);
    }

    public KD(Icon icon, ActionListener actionListener) {
        super(icon);
        this.s(SG.T);
        this.O(SG.M);
        this.addActionListener(actionListener);
    }

    public KD(String string, ActionListener actionListener) {
        super(string);
        this.addActionListener(actionListener);
    }

    public KD(String string, Icon icon, ActionListener actionListener) {
        super(string, icon);
        this.addActionListener(actionListener);
    }

    public KD(Action action) {
        super(action);
    }

    public KD(og_2 og_22) {
        this.U(og_22);
    }

    public DN U(Integer n10) {
        return this.p(new cs_0(n10));
    }

    public DN K(boolean bl, boolean bl2, boolean bl3, Integer n10) {
        return this.p(new cs_0(bl, bl2, bl3, n10));
    }

    public DN p(cs_0 cs_02) {
        return w6_0.R(this, cs_02);
    }

    public DN C(cs_0 cs_02, boolean bl) {
        return w6_0.T(this, cs_02, bl);
    }

    public DN G(cs_0 cs_02, WF wF) {
        return w6_0.y(this, cs_02, wF);
    }

    public DN Y(Component component, cs_0 cs_02) {
        return w6_0.k(component, this, cs_02);
    }

    public DN Q(Component component, cs_0 cs_02, boolean bl) {
        return w6_0.R(component, this, cs_02, bl);
    }

    public DN d(Component component, cs_0 cs_02, WF wF) {
        return w6_0.V(component, this, cs_02, wF);
    }

    public List v() {
        return w6_0.g(this);
    }

    public void l(DN dN) {
        w6_0.n(dN);
    }

    public void h() {
        w6_0.A(this);
    }

    public Color D() {
        return this.f().Y();
    }

    public KD n(Color color) {
        this.f().d(color);
        return this;
    }

    public Color Q() {
        return this.f().z();
    }

    public KD l(Color color) {
        this.f().Q(color);
        return this;
    }

    public Color N() {
        return this.f().k();
    }

    public KD e(Color color) {
        this.f().J(color);
        return this;
    }

    public Color n() {
        return this.f().i();
    }

    public KD G(Color color) {
        this.f().w(color);
        return this;
    }

    public Color t() {
        return this.f().H();
    }

    public KD t(Color color) {
        this.f().j(color);
        return this;
    }

    public boolean g() {
        return this.f().H();
    }

    public KD g(boolean bl) {
        this.f().f(bl);
        return this;
    }

    public boolean e() {
        return this.f().G();
    }

    public KD S(boolean bl) {
        this.f().y(bl);
        return this;
    }

    public Color M() {
        return this.f().l();
    }

    public KD u(Color color) {
        this.f().u(color);
        return this;
    }

    public int h() {
        return this.f().C();
    }

    public KD s(int n10) {
        this.f().D(n10);
        return this;
    }

    public boolean u() {
        return this.f().R();
    }

    public KD a(boolean bl) {
        this.f().w(bl);
        return this;
    }

    public boolean T() {
        return this.f().U();
    }

    public KD h(boolean bl) {
        this.f().d(bl);
        return this;
    }

    public boolean q() {
        return this.f().k();
    }

    public KD b(boolean bl) {
        this.f().A(bl);
        return this;
    }

    public int q() {
        return this.f().d();
    }

    public KD f(int n10) {
        this.f().z(n10);
        return this;
    }

    public Color U() {
        return this.f().V();
    }

    public KD H(Color color) {
        this.f().F(color);
        return this;
    }

    public int b() {
        return this.f().Z();
    }

    @Override
    public KD x(int n10) {
        this.f().r(n10);
        return this;
    }

    public Color s() {
        return this.f().t();
    }

    public KD z(Color color) {
        this.f().O(color);
        return this;
    }

    public Color C() {
        return this.f().E();
    }

    public KD s(Color color) {
        this.f().s(color);
        return this;
    }

    public int r() {
        return this.f().N();
    }

    @Override
    public KD O(int n10) {
        this.f().l(n10);
        return this;
    }

    public boolean j() {
        return this.f().x();
    }

    public KD K(boolean bl) {
        this.f().q(bl);
        return this;
    }

    public boolean Y() {
        return this.f().m();
    }

    public KD j(boolean bl) {
        this.f().k(bl);
        return this;
    }

    public boolean m() {
        return this.f().o();
    }

    public KD G(boolean bl) {
        this.f().l(bl);
        return this;
    }

    public og_2 l() {
        return this.f().R();
    }

    public KD U(og_2 og_22) {
        this.f().S(og_22);
        return this;
    }

    public boolean I() {
        return this.f().K();
    }

    public KD t(boolean bl) {
        this.f().B(bl);
        return this;
    }

    public boolean z() {
        return this.f().A();
    }

    public KD r(boolean bl) {
        this.f().M(bl);
        return this;
    }

    public boolean V() {
        return this.f().n();
    }

    public KD l(boolean bl) {
        this.f().r(bl);
        return this;
    }

    public boolean C() {
        return this.f().i();
    }

    public KD x(boolean bl) {
        this.f().m(bl);
        return this;
    }

    public boolean P() {
        return this.f().C();
    }

    public KD X(boolean bl) {
        this.f().E(bl);
        return this;
    }

    public boolean Z() {
        return this.f().Y();
    }

    public KD W(boolean bl) {
        this.f().J(bl);
        return this;
    }

    public KD E(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.f().Z(bl, bl2, bl3, bl4);
        return this;
    }

    public boolean b() {
        return this.f().F();
    }

    public KD z(boolean bl) {
        this.f().L(bl);
        return this;
    }

    public boolean c() {
        return this.f().B();
    }

    public KD M(boolean bl) {
        this.f().Q(bl);
        return this;
    }

    public boolean w() {
        return this.f().W();
    }

    public KD Z(boolean bl) {
        this.f().W(bl);
        return this;
    }

    public boolean s() {
        return this.f().I();
    }

    @Override
    public KD u(boolean bl) {
        this.f().K(bl);
        return this;
    }

    public KD h(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.f().a(bl, bl2, bl3, bl4);
        return this;
    }

    @Override
    public Insets getMargin() {
        return this.f().A();
    }

    @Override
    public void setMargin(Insets insets) {
        this.f().Q(insets);
    }

    public KD V(int n10, int n11, int n12, int n13) {
        this.setMargin(new Insets(n10, n11, n12, n13));
        return this;
    }

    public KD e(int n10) {
        return this.V(n10, n10, n10, n10);
    }

    @Override
    public Shape B() {
        return this.f().B();
    }

    public gi_0 f() {
        return (gi_0)this.getUI();
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
                            throw KD.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw KD.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof gi_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw KD.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((gi_0)kp_0.w(a9.r, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new gi_0());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw KD.a(v5);
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

    public KD B() {
        return (KD)FN.A(this);
    }

    @Override
    public KD N(boolean bl) {
        return (KD)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public KD c() {
        return (KD)FN.u(this);
    }

    public KD P(boolean bl) {
        return (KD)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public KD s() {
        return (KD)FN.C(this);
    }

    public KD m(boolean bl) {
        return (KD)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public KD c(boolean bl, boolean bl2) {
        return (KD)FN.K(this, bl, bl2);
    }

    public KD F(int n10) {
        return (KD)FN.p((Component)this, n10);
    }

    public KD j(int n10) {
        return (KD)FN.O((Component)this, n10);
    }

    public KD J(int n10) {
        return (KD)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public KD G(int n10, boolean bl, boolean bl2) {
        return (KD)FN.d(this, n10, bl, bl2);
    }

    public KD o(int n10, int n11) {
        return (KD)FN.m(this, n10, n11);
    }

    public KD j(String string) {
        return (KD)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public KD Y(int n10) {
        return (KD)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public KD M(int n10) {
        return (KD)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public KD z(int n10) {
        return (KD)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public KD X(int n10) {
        return (KD)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public KD P(int n10) {
        return (KD)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public KD t(int n10) {
        return (KD)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public KD m(int n10, int n11) {
        return (KD)PY.O(this, n10, n11);
    }

    public static KD y(ImageIcon imageIcon) {
        return KD.d(imageIcon, GO.Fx);
    }

    public static KD d(ImageIcon imageIcon, int n10) {
        return KD.l(imageIcon, n10, GO.FG);
    }

    public static KD l(ImageIcon imageIcon, int n10, int n11) {
        return KD.r(imageIcon, n10, n11, GO.f);
    }

    public static KD r(ImageIcon imageIcon, int n10, int n11, int n12) {
        return KD.W(imageIcon, n10, n11, n12, GO.Fg);
    }

    public static KD M(ImageIcon imageIcon, boolean bl) {
        return KD.K(imageIcon, GO.Fx, bl);
    }

    public static KD K(ImageIcon imageIcon, int n10, boolean bl) {
        return KD.S(imageIcon, n10, GO.FG, GO.f, bl, GO.Fl);
    }

    public static KD W(ImageIcon imageIcon, int n10, int n11, int n12, boolean bl) {
        return KD.S(imageIcon, n10, n11, n12, bl, GO.Fl);
    }

    public static KD S(ImageIcon imageIcon, int n10, int n11, int n12, boolean bl, boolean bl2) {
        return KD.F(imageIcon, n10, n11, n12, bl, bl2, true);
    }

    public static KD F(ImageIcon imageIcon, int n10, int n11, int n12, boolean bl, boolean bl2, boolean bl3) {
        KD kD = KD.a(n10, n11, n12, 0, bl, bl2, bl3);
        kD.setIcon(imageIcon);
        return kD;
    }

    public static KD a(int n10, int n11, int n12, int n13, boolean bl, boolean bl2, boolean bl3) {
        KD kD = new KD();
        kD.s(n10);
        kD.f(n11);
        kD.x(n12);
        kD.O(n13);
        kD.K(bl);
        kD.G(bl2);
        kD.r(bl3);
        return kD;
    }

    @Override
    public Component N(String string) {
        return this.j(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.o(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.G(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.J(n10);
    }

    @Override
    public Component o(int n10) {
        return this.j(n10);
    }

    @Override
    public Component i(int n10) {
        return this.F(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.c(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.m(bl);
    }

    @Override
    public Component Q() {
        return this.s();
    }

    @Override
    public Component u(boolean bl) {
        return this.P(bl);
    }

    @Override
    public Component R() {
        return this.c();
    }

    @Override
    public Component c(boolean bl) {
        return this.N(bl);
    }

    @Override
    public Component a() {
        return this.B();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.m(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.t(n10);
    }

    @Override
    public Component p(int n10) {
        return this.P(n10);
    }

    @Override
    public Component D(int n10) {
        return this.X(n10);
    }

    @Override
    public Component V(int n10) {
        return this.z(n10);
    }

    @Override
    public Component x(int n10) {
        return this.M(n10);
    }

    @Override
    public Component O(int n10) {
        return this.Y(n10);
    }

    public static void u(int[] nArray) {
        G = nArray;
    }

    public static int[] s() {
        return G;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (KD.s() != null) {
            KD.u(new int[2]);
        }
    }
}

