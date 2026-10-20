/*
 * Decompiled with CFR 0.152.
 */
package com.h;

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
import com.fs_0;
import com.h.c;
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
import javax.swing.JComponent;
import javax.swing.JRadioButton;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class K
extends JRadioButton
implements W2,
pp_0,
rf_1,
au_0,
eh_0,
yb_2,
sa_0 {
    private static boolean h;

    public K() {
    }

    public K(boolean bl) {
        super("", bl);
    }

    public K(Icon icon) {
        super(icon);
    }

    public K(Action action) {
        super(action);
    }

    public K(Icon icon, boolean bl) {
        super(icon, bl);
    }

    public K(String string) {
        super(string);
    }

    public K(String string, boolean bl) {
        super(string, bl);
    }

    public K(String string, Icon icon) {
        super(string, icon);
    }

    public K(String string, Icon icon, boolean bl) {
        super(string, icon, bl);
    }

    public DN h(Integer n10) {
        return this.F(new cs_0(n10));
    }

    public DN N(boolean bl, boolean bl2, boolean bl3, Integer n10) {
        return this.F(new cs_0(bl, bl2, bl3, n10));
    }

    public DN F(cs_0 cs_02) {
        return w6_0.R(this, cs_02);
    }

    public DN J(cs_0 cs_02, boolean bl) {
        return w6_0.T(this, cs_02, bl);
    }

    public DN s(cs_0 cs_02, WF wF) {
        return w6_0.y(this, cs_02, wF);
    }

    public DN o(Component component, cs_0 cs_02) {
        return w6_0.k(component, this, cs_02);
    }

    public DN f(Component component, cs_0 cs_02, boolean bl) {
        return w6_0.R(component, this, cs_02, bl);
    }

    public DN U(Component component, cs_0 cs_02, WF wF) {
        return w6_0.V(component, this, cs_02, wF);
    }

    public List Q() {
        return w6_0.g(this);
    }

    public void H(DN dN) {
        w6_0.n(dN);
    }

    public void q() {
        w6_0.A(this);
    }

    @Override
    public Insets getMargin() {
        return this.L().E();
    }

    @Override
    public void setMargin(Insets insets) {
        this.L().t(insets);
    }

    public void k(int n10, int n11, int n12, int n13) {
        this.setMargin(new Insets(n10, n11, n12, n13));
    }

    public void A(int n10) {
        this.k(n10, n10, n10, n10);
    }

    public boolean e() {
        return this.L().w();
    }

    public void U(boolean bl) {
        this.L().r(bl);
    }

    public boolean m() {
        return this.L().e();
    }

    public void O(boolean bl) {
        this.L().t(bl);
    }

    public Color L() {
        return this.L().H();
    }

    public void g(Color color) {
        this.L().i(color);
    }

    public Color l() {
        return this.L().D();
    }

    public void u(Color color) {
        this.L().k(color);
    }

    public Color r() {
        return this.L().k();
    }

    public void m(Color color) {
        this.L().O(color);
    }

    public Color m() {
        return this.L().B();
    }

    public void Z(Color color) {
        this.L().J(color);
    }

    public Color H() {
        return this.L().L();
    }

    public void j(Color color) {
        this.L().G(color);
    }

    public Color e() {
        return this.L().i();
    }

    public void A(Color color) {
        this.L().a(color);
    }

    public Color Z() {
        return this.L().c();
    }

    public void Q(Color color) {
        this.L().T(color);
    }

    public int I() {
        return this.L().V();
    }

    public void u(int n10) {
        this.L().u(n10);
    }

    public int K() {
        return this.L().d();
    }

    public void P(int n10) {
        this.L().c(n10);
    }

    public int q() {
        return this.L().q();
    }

    public void s(int n10) {
        this.L().G(n10);
    }

    @Override
    public void setSelected(boolean bl) {
        this.y(bl, this.isShowing());
    }

    public void y(boolean bl, boolean bl2) {
        block7: {
            boolean bl3;
            K k2;
            block6: {
                boolean bl4;
                boolean bl5;
                block4: {
                    boolean bl6;
                    block5: {
                        bl5 = this.e();
                        bl6 = K.V();
                        bl4 = bl2;
                        if (bl6) break block4;
                        if (bl4) break block5;
                        bl4 = bl5;
                        if (bl6) break block4;
                        if (bl4) {
                            this.U(false);
                        }
                    }
                    k2 = this;
                    bl3 = bl;
                    if (bl6) break block6;
                    super.setSelected(bl3);
                    bl4 = bl2;
                }
                if (bl4) break block7;
                k2 = this;
                bl3 = bl5;
            }
            k2.U(bl3);
        }
    }

    @Override
    public Shape B() {
        return this.L().B();
    }

    public c L() {
        return (c)this.getUI();
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
                        var1_1 = K.Z();
                        v0 = this;
                        if (!var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw K.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (!var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw K.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof c)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw K.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((c)kp_0.w(a9.zx, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new c());
                        if (var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw K.a(v5);
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

    public K b() {
        return (K)FN.A(this);
    }

    public K R(boolean bl) {
        return (K)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public K N() {
        return (K)FN.u(this);
    }

    public K f(boolean bl) {
        return (K)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    @Override
    public K R() {
        return (K)FN.C(this);
    }

    public K L(boolean bl) {
        return (K)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public K X(boolean bl, boolean bl2) {
        return (K)FN.K(this, bl, bl2);
    }

    public K f(int n10) {
        return (K)FN.p((Component)this, n10);
    }

    @Override
    public K d(int n10) {
        return (K)FN.O((Component)this, n10);
    }

    public K X(int n10) {
        return (K)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public K q(int n10, boolean bl, boolean bl2) {
        return (K)FN.d(this, n10, bl, bl2);
    }

    public K w(int n10, int n11) {
        return (K)FN.m(this, n10, n11);
    }

    public K R(String string) {
        return (K)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public K h(int n10) {
        return (K)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public K e(int n10) {
        return (K)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public K s(int n10) {
        return (K)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public K E(int n10) {
        return (K)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public K n(int n10) {
        return (K)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public K v(int n10) {
        return (K)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public K U(int n10, int n11) {
        return (K)PY.O(this, n10, n11);
    }

    @Override
    public Component N(String string) {
        return this.R(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.w(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.q(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.X(n10);
    }

    @Override
    public Component o(int n10) {
        return this.d(n10);
    }

    @Override
    public Component i(int n10) {
        return this.f(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.X(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.L(bl);
    }

    @Override
    public Component Q() {
        return this.R();
    }

    @Override
    public Component u(boolean bl) {
        return this.f(bl);
    }

    @Override
    public Component R() {
        return this.N();
    }

    @Override
    public Component c(boolean bl) {
        return this.R(bl);
    }

    @Override
    public Component a() {
        return this.b();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.U(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.v(n10);
    }

    @Override
    public Component p(int n10) {
        return this.n(n10);
    }

    @Override
    public Component D(int n10) {
        return this.E(n10);
    }

    @Override
    public Component V(int n10) {
        return this.s(n10);
    }

    @Override
    public Component x(int n10) {
        return this.e(n10);
    }

    @Override
    public Component O(int n10) {
        return this.h(n10);
    }

    public static void G(boolean bl) {
        h = bl;
    }

    public static boolean V() {
        return h;
    }

    public static boolean Z() {
        boolean bl = K.V();
        return !bl;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (!K.Z()) {
            K.G(true);
        }
    }
}

