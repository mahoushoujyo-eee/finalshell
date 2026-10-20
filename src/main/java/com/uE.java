/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DN;
import com.FN;
import com.HT;
import com.IB;
import com.O5;
import com.PY;
import com.W2;
import com.WF;
import com.a9;
import com.ac_0;
import com.au_0;
import com.az_0;
import com.cl_2;
import com.cs_0;
import com.eh_0;
import com.fm_0;
import com.fs_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
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
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class uE
extends JCheckBox
implements W2,
pp_0,
rf_1,
au_0,
eh_0,
yb_2,
sa_0 {
    private static boolean t;

    public uE() {
    }

    public uE(boolean bl) {
        super("", bl);
    }

    public uE(Icon icon) {
        super(icon);
    }

    public uE(Icon icon, boolean bl) {
        super(icon, bl);
    }

    public uE(String string) {
        super(string);
    }

    public uE(Action action) {
        super(action);
    }

    public uE(String string, boolean bl) {
        super(string, bl);
    }

    public uE(String string, Icon icon) {
        super(string, icon);
    }

    public uE(String string, Icon icon, boolean bl) {
        super(string, icon, bl);
    }

    public DN R(Integer n10) {
        return this.d(new cs_0(n10));
    }

    public DN X(boolean bl, boolean bl2, boolean bl3, Integer n10) {
        return this.d(new cs_0(bl, bl2, bl3, n10));
    }

    public DN d(cs_0 cs_02) {
        return w6_0.R(this, cs_02);
    }

    public DN d(cs_0 cs_02, boolean bl) {
        return w6_0.T(this, cs_02, bl);
    }

    public DN w(cs_0 cs_02, WF wF) {
        return w6_0.y(this, cs_02, wF);
    }

    public DN f(Component component, cs_0 cs_02) {
        return w6_0.k(component, this, cs_02);
    }

    public DN I(Component component, cs_0 cs_02, boolean bl) {
        return w6_0.R(component, this, cs_02, bl);
    }

    public DN B(Component component, cs_0 cs_02, WF wF) {
        return w6_0.V(component, this, cs_02, wF);
    }

    public List a() {
        return w6_0.g(this);
    }

    public void b(DN dN) {
        w6_0.n(dN);
    }

    public void X() {
        w6_0.A(this);
    }

    @Override
    public Insets getMargin() {
        return this.M().k();
    }

    @Override
    public void setMargin(Insets insets) {
        this.M().G(insets);
    }

    public void f(int n10, int n11, int n12, int n13) {
        this.setMargin(new Insets(n10, n11, n12, n13));
    }

    public void D(int n10) {
        this.f(n10, n10, n10, n10);
    }

    public boolean L() {
        return this.M().O();
    }

    public void w(boolean bl) {
        this.M().C(bl);
    }

    public boolean j() {
        return this.M().h();
    }

    public void r(boolean bl) {
        this.M().m(bl);
    }

    public Color V() {
        return this.M().J();
    }

    public void J(Color color) {
        this.M().Z(color);
    }

    public Color a() {
        return this.M().e();
    }

    public void A(Color color) {
        this.M().p(color);
    }

    public Color I() {
        return this.M().p();
    }

    public void T(Color color) {
        this.M().O(color);
    }

    public Color H() {
        return this.M().h();
    }

    public void Q(Color color) {
        this.M().R(color);
    }

    public Color g() {
        return this.M().a();
    }

    public void c(Color color) {
        this.M().b(color);
    }

    public Color N() {
        return this.M().n();
    }

    public void D(Color color) {
        this.M().B(color);
    }

    public Color D() {
        return this.M().S();
    }

    public void b(Color color) {
        this.M().n(color);
    }

    public int y() {
        return this.M().n();
    }

    public void Y(int n10) {
        this.M().i(n10);
    }

    public int z() {
        return this.M().V();
    }

    public void e(int n10) {
        this.M().f(n10);
    }

    public int q() {
        return this.M().H();
    }

    public void G(int n10) {
        this.M().P(n10);
    }

    public int B() {
        return this.M().R();
    }

    public void u(int n10) {
        this.M().t(n10);
    }

    @Override
    public void setSelected(boolean bl) {
        this.M(bl, this.isShowing());
    }

    public void M(boolean bl, boolean bl2) {
        block7: {
            boolean bl3;
            uE uE2;
            block6: {
                boolean bl4;
                boolean bl5;
                block4: {
                    boolean bl6;
                    block5: {
                        bl5 = this.L();
                        bl6 = uE.o();
                        bl4 = bl2;
                        if (!bl6) break block4;
                        if (bl4) break block5;
                        bl4 = bl5;
                        if (!bl6) break block4;
                        if (bl4) {
                            this.w(false);
                        }
                    }
                    uE2 = this;
                    bl3 = bl;
                    if (!bl6) break block6;
                    super.setSelected(bl3);
                    bl4 = bl2;
                }
                if (bl4) break block7;
                uE2 = this;
                bl3 = bl5;
            }
            uE2.w(bl3);
        }
    }

    @Override
    public Shape B() {
        return this.M().B();
    }

    public fm_0 M() {
        return (fm_0)this.getUI();
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
                        var1_1 = uE.Z();
                        v0 = this;
                        if (var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw uE.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw uE.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof fm_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw uE.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((fm_0)kp_0.w(a9.E, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new fm_0());
                        if (!var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw uE.a(v5);
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

    public uE T() {
        return (uE)FN.A(this);
    }

    public uE K(boolean bl) {
        return (uE)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public uE k() {
        return (uE)FN.u(this);
    }

    public uE A(boolean bl) {
        return (uE)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public uE f() {
        return (uE)FN.C(this);
    }

    public uE W(boolean bl) {
        return (uE)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public uE t(boolean bl, boolean bl2) {
        return (uE)FN.K(this, bl, bl2);
    }

    public uE l(int n10) {
        return (uE)FN.p((Component)this, n10);
    }

    @Override
    public uE D(int n10) {
        return (uE)FN.O((Component)this, n10);
    }

    public uE q(int n10) {
        return (uE)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public uE B(int n10, boolean bl, boolean bl2) {
        return (uE)FN.d(this, n10, bl, bl2);
    }

    public uE U(int n10, int n11) {
        return (uE)FN.m(this, n10, n11);
    }

    public uE r(String string) {
        return (uE)FN.s(this, string);
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
    public uE G(int n10) {
        return (uE)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public uE g(int n10) {
        return (uE)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    @Override
    public uE o(int n10) {
        return (uE)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public uE z(int n10) {
        return (uE)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public uE m(int n10) {
        return (uE)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public uE S(int n10) {
        return (uE)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public uE Y(int n10, int n11) {
        return (uE)PY.O(this, n10, n11);
    }

    @Override
    public Component N(String string) {
        return this.r(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.U(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.B(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.q(n10);
    }

    @Override
    public Component o(int n10) {
        return this.D(n10);
    }

    @Override
    public Component i(int n10) {
        return this.l(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.t(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.W(bl);
    }

    @Override
    public Component Q() {
        return this.f();
    }

    @Override
    public Component u(boolean bl) {
        return this.A(bl);
    }

    @Override
    public Component R() {
        return this.k();
    }

    @Override
    public Component c(boolean bl) {
        return this.K(bl);
    }

    @Override
    public Component a() {
        return this.T();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.Y(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.S(n10);
    }

    @Override
    public Component p(int n10) {
        return this.m(n10);
    }

    @Override
    public Component D(int n10) {
        return this.z(n10);
    }

    @Override
    public Component V(int n10) {
        return this.o(n10);
    }

    @Override
    public Component x(int n10) {
        return this.g(n10);
    }

    @Override
    public Component O(int n10) {
        return this.G(n10);
    }

    public static void X(boolean bl) {
        t = bl;
    }

    public static boolean Z() {
        return t;
    }

    public static boolean o() {
        boolean bl = uE.Z();
        return !bl;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (uE.Z()) {
            uE.X(true);
        }
    }
}

