/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F5;
import com.FN;
import com.HT;
import com.IB;
import com.O5;
import com.PY;
import com.RS;
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
import com.hl_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.ne_2;
import com.og_2;
import com.pp_0;
import com.rf_1;
import com.rk_0;
import com.sa_0;
import com.sr_0;
import com.wd_0;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.text.Document;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class R6
extends JPasswordField
implements W2,
RS,
pp_0,
rf_1,
au_0,
eh_0,
yb_2,
sa_0 {
    private static final long a;

    public R6() {
    }

    public R6(String string) {
        super(string);
    }

    public R6(int n10) {
        super(n10);
    }

    public R6(String string, int n10) {
        super(string, n10);
    }

    public R6(Document document, String string, int n10) {
        super(document, string, n10);
    }

    public void v() {
        this.setText("");
    }

    public boolean a() {
        return this.q().K();
    }

    public void x(boolean bl) {
        this.q().g(bl);
    }

    public boolean S() {
        return this.q().X();
    }

    public void o(boolean bl) {
        this.q().X(bl);
    }

    public JComponent x() {
        return this.q().w();
    }

    public void w(JComponent jComponent) {
        this.q().K(jComponent);
    }

    public JComponent l() {
        return this.q().f();
    }

    public void y(JComponent jComponent) {
        this.q().b(jComponent);
    }

    public void g(int n10, int n11, int n12, int n13) {
        this.setMargin(new Insets(n10, n11, n12, n13));
    }

    public void I(int n10) {
        this.g(n10, n10, n10, n10);
    }

    public void z(Insets insets) {
        this.q().S(insets);
    }

    public void v(int n10, int n11, int n12, int n13) {
        this.z(new Insets(n10, n11, n12, n13));
    }

    public void j(int n10) {
        this.v(n10, n10, n10, n10);
    }

    public Insets Q() {
        return this.q().v();
    }

    public int O() {
        return this.q().b();
    }

    public void z(int n10) {
        this.q().b(n10);
    }

    public boolean t() {
        return this.q().Z();
    }

    public void m(boolean bl) {
        this.q().A(bl);
    }

    public int q() {
        return this.q().G();
    }

    public void x(int n10) {
        this.q().M(n10);
    }

    public boolean o() {
        return this.q().b();
    }

    public void Y(boolean bl) {
        this.q().Y(bl);
    }

    public boolean W() {
        return this.q().C();
    }

    public void J(boolean bl) {
        this.q().m(bl);
    }

    public og_2 J() {
        return this.q().o();
    }

    public void f(og_2 og_22) {
        this.q().f(og_22);
    }

    public String p() {
        return this.q().P();
    }

    public void G(String string) {
        this.q().w(string);
    }

    public Font Q() {
        return this.q().M();
    }

    public void r(Font font) {
        this.q().G(font);
    }

    public Color D() {
        return this.q().t();
    }

    public void I(Color color) {
        this.q().o(color);
    }

    public int h() {
        return this.q().s();
    }

    public void M(int n10) {
        this.q().U(n10);
    }

    public boolean u() {
        return this.q().D();
    }

    public void r(boolean bl) {
        this.q().T(bl);
    }

    @Override
    public Shape B() {
        return this.q().B();
    }

    public hl_0 q() {
        return (hl_0)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block19: {
            block18: {
                block17: {
                    block21: {
                        block15: {
                            block16: {
                                var1_1 = ne_2.A();
                                v0 = this;
                                if (!var1_1) break block15;
                                try {
                                    block20: {
                                        if (v0.echoCharIsSet()) break block16;
                                        break block20;
                                        catch (Throwable v1) {
                                            throw R6.a(v1);
                                        }
                                    }
                                    this.setEchoChar((char)R6.a);
                                }
                                catch (Throwable v2) {
                                    throw R6.a(v2);
                                }
                            }
                            v0 = this;
                        }
                        if (!var1_1) ** GOTO lbl41
                        if (v0.getUI() == null) break block17;
                        break block21;
                        catch (Throwable v3) {
                            throw R6.a(v3);
                        }
                    }
                    try {
                        block22: {
                            v4 = this;
                            if (!var1_1) break block18;
                            break block22;
                            catch (Throwable v5) {
                                throw R6.a(v5);
                            }
                        }
                        if (!(v4.getUI() instanceof hl_0)) {
                        }
                        ** GOTO lbl48
                    }
                    catch (Throwable v6) {
                        throw R6.a(v6);
                    }
                }
                try {
                    v0 = this;
lbl41:
                    // 2 sources

                    v0.setUI((hl_0)kp_0.w(a9.w, new Object[0]));
                    break block19;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new hl_0());
                        if (var1_1) break block19;
lbl48:
                        // 2 sources

                        v4 = this;
                    }
                    catch (Throwable v7) {
                        throw R6.a(v7);
                    }
                }
            }
            v4.setUI(this.getUI());
        }
        this.invalidate();
    }

    @Override
    public F5 i(rk_0 rk_02) {
        return fs_0.X(this, rk_02);
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

    public R6 W() {
        return (R6)FN.A(this);
    }

    public R6 V(boolean bl) {
        return (R6)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public R6 g() {
        return (R6)FN.u(this);
    }

    public R6 H(boolean bl) {
        return (R6)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public R6 M() {
        return (R6)FN.C(this);
    }

    public R6 P(boolean bl) {
        return (R6)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public R6 Z(boolean bl, boolean bl2) {
        return (R6)FN.K(this, bl, bl2);
    }

    @Override
    public R6 p(int n10) {
        return (R6)FN.p((Component)this, n10);
    }

    public R6 K(int n10) {
        return (R6)FN.O((Component)this, n10);
    }

    @Override
    public R6 O(int n10) {
        return (R6)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public R6 O(int n10, boolean bl, boolean bl2) {
        return (R6)FN.d(this, n10, bl, bl2);
    }

    public R6 V(int n10, int n11) {
        return (R6)FN.m(this, n10, n11);
    }

    public R6 K(String string) {
        return (R6)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public R6 t(int n10) {
        return (R6)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public R6 m(int n10) {
        return (R6)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public R6 P(int n10) {
        return (R6)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public R6 f(int n10) {
        return (R6)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public R6 C(int n10) {
        return (R6)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public R6 T(int n10) {
        return (R6)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public R6 K(int n10, int n11) {
        return (R6)PY.O(this, n10, n11);
    }

    @Override
    public Component N(String string) {
        return this.K(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.V(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.O(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.O(n10);
    }

    @Override
    public Component o(int n10) {
        return this.K(n10);
    }

    @Override
    public Component i(int n10) {
        return this.p(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.Z(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.P(bl);
    }

    @Override
    public Component Q() {
        return this.M();
    }

    @Override
    public Component u(boolean bl) {
        return this.H(bl);
    }

    @Override
    public Component R() {
        return this.g();
    }

    @Override
    public Component c(boolean bl) {
        return this.V(bl);
    }

    @Override
    public Component a() {
        return this.W();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.K(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.T(n10);
    }

    @Override
    public Component p(int n10) {
        return this.C(n10);
    }

    @Override
    public Component D(int n10) {
        return this.f(n10);
    }

    @Override
    public Component V(int n10) {
        return this.P(n10);
    }

    @Override
    public Component x(int n10) {
        return this.m(n10);
    }

    @Override
    public Component O(int n10) {
        return this.t(n10);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8953872291300177252L;
        a = 0xAEABCAEAC728F54EL ^ l2;
    }
}

