/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F5;
import com.FN;
import com.GO;
import com.HT;
import com.IB;
import com.O5;
import com.PY;
import com.QH;
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
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
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
import javax.swing.JTextField;
import javax.swing.text.Document;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.ne
 */
public class ne_2
extends JTextField
implements W2,
RS,
pp_0,
rf_1,
au_0,
eh_0,
yb_2,
sa_0 {
    private static boolean J;

    public ne_2() {
    }

    public ne_2(boolean bl) {
        this.y(bl);
    }

    public ne_2(String string) {
        super(string);
    }

    public ne_2(String string, boolean bl) {
        super(string);
        this.y(bl);
    }

    public ne_2(int n10) {
        super(n10);
    }

    public ne_2(int n10, boolean bl) {
        super(n10);
        this.y(bl);
    }

    public ne_2(String string, int n10) {
        super(string, n10);
    }

    public ne_2(String string, int n10, boolean bl) {
        super(string, n10);
        this.y(bl);
    }

    public ne_2(Document document, String string, int n10) {
        super(document, string, n10);
    }

    public ne_2(Document document, String string, int n10, boolean bl) {
        super(document, string, n10);
        this.y(bl);
    }

    public void g() {
        this.setText("");
    }

    public boolean g() {
        return this.j().R();
    }

    public void y(boolean bl) {
        this.j().R(bl);
    }

    public boolean H() {
        return this.j().C();
    }

    public void c(boolean bl) {
        this.j().o(bl);
    }

    public JComponent I() {
        return this.j().v();
    }

    public void v(JComponent jComponent) {
        this.j().o(jComponent);
    }

    public JComponent n() {
        return this.j().d();
    }

    public void z(JComponent jComponent) {
        this.j().z(jComponent);
    }

    public void I(int n10, int n11, int n12, int n13) {
        this.setMargin(new Insets(n10, n11, n12, n13));
    }

    public void n(int n10) {
        this.I(n10, n10, n10, n10);
    }

    public void l(Insets insets) {
        this.j().T(insets);
    }

    public void d(int n10, int n11, int n12, int n13) {
        this.l(new Insets(n10, n11, n12, n13));
    }

    public void J(int n10) {
        this.d(n10, n10, n10, n10);
    }

    public Insets p() {
        return this.j().Z();
    }

    public int z() {
        return this.j().k();
    }

    public void h(int n10) {
        this.j().T(n10);
    }

    public boolean V() {
        return this.j().T();
    }

    public void L(boolean bl) {
        this.j().h(bl);
    }

    public int L() {
        return this.j().a();
    }

    public void F(int n10) {
        this.j().g(n10);
    }

    public boolean a() {
        return this.j().G();
    }

    public void P(boolean bl) {
        this.j().L(bl);
    }

    public boolean M() {
        return this.j().q();
    }

    public void T(boolean bl) {
        this.j().D(bl);
    }

    public og_2 f() {
        return this.j().i();
    }

    public void F(og_2 og_22) {
        this.j().Y(og_22);
    }

    public String t() {
        return this.j().F();
    }

    public void P(String string) {
        this.j().F(string);
    }

    public Font I() {
        return this.j().n();
    }

    public void v(Font font) {
        this.j().B(font);
    }

    public Color O() {
        return this.j().u();
    }

    public void B(Color color) {
        this.j().w(color);
    }

    public int u() {
        return this.j().O();
    }

    public void j(int n10) {
        this.j().e(n10);
    }

    public boolean f() {
        return this.j().A();
    }

    public void z(boolean bl) {
        this.j().k(bl);
    }

    @Override
    public Shape B() {
        return this.j().B();
    }

    public QH j() {
        return (QH)this.getUI();
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
                        var1_1 = ne_2.A();
                        v0 = this;
                        if (!var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw ne_2.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (!var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw ne_2.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof QH)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw ne_2.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((QH)kp_0.w(a9.zP, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new QH());
                        if (var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw ne_2.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
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

    public ne_2 o() {
        return (ne_2)FN.A(this);
    }

    public ne_2 C(boolean bl) {
        return (ne_2)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    @Override
    public ne_2 R() {
        return (ne_2)FN.u(this);
    }

    public ne_2 Q(boolean bl) {
        return (ne_2)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    @Override
    public ne_2 Q() {
        return (ne_2)FN.C(this);
    }

    public ne_2 H(boolean bl) {
        return (ne_2)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public ne_2 S(boolean bl, boolean bl2) {
        return (ne_2)FN.K(this, bl, bl2);
    }

    public ne_2 g(int n10) {
        return (ne_2)FN.p((Component)this, n10);
    }

    public ne_2 j(int n10) {
        return (ne_2)FN.O((Component)this, n10);
    }

    public ne_2 u(int n10) {
        return (ne_2)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public ne_2 C(int n10, boolean bl, boolean bl2) {
        return (ne_2)FN.d(this, n10, bl, bl2);
    }

    public ne_2 A(int n10, int n11) {
        return (ne_2)FN.m(this, n10, n11);
    }

    public ne_2 i(String string) {
        return (ne_2)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public ne_2 M(int n10) {
        return (ne_2)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public ne_2 H(int n10) {
        return (ne_2)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public ne_2 R(int n10) {
        return (ne_2)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public ne_2 Z(int n10) {
        return (ne_2)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public ne_2 S(int n10) {
        return (ne_2)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public ne_2 p(int n10) {
        return (ne_2)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public ne_2 H(int n10, int n11) {
        return (ne_2)PY.O(this, n10, n11);
    }

    public static ne_2 i() {
        return ne_2.k(GO.d);
    }

    public static ne_2 k(boolean bl) {
        return ne_2.s(bl, GO.FT);
    }

    public static ne_2 s(boolean bl, int n10) {
        return ne_2.r(bl, n10, GO.FG);
    }

    public static ne_2 r(boolean bl, int n10, int n11) {
        ne_2 ne_22 = new ne_2();
        ne_22.y(bl);
        ne_22.h(n10);
        ne_22.F(n11);
        return ne_22;
    }

    @Override
    public Component N(String string) {
        return this.i(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.A(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.C(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.u(n10);
    }

    @Override
    public Component o(int n10) {
        return this.j(n10);
    }

    @Override
    public Component i(int n10) {
        return this.g(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.S(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.H(bl);
    }

    @Override
    public Component Q() {
        return this.Q();
    }

    @Override
    public Component u(boolean bl) {
        return this.Q(bl);
    }

    @Override
    public Component R() {
        return this.R();
    }

    @Override
    public Component c(boolean bl) {
        return this.C(bl);
    }

    @Override
    public Component a() {
        return this.o();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.H(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.p(n10);
    }

    @Override
    public Component p(int n10) {
        return this.S(n10);
    }

    @Override
    public Component D(int n10) {
        return this.Z(n10);
    }

    @Override
    public Component V(int n10) {
        return this.R(n10);
    }

    @Override
    public Component x(int n10) {
        return this.H(n10);
    }

    @Override
    public Component O(int n10) {
        return this.M(n10);
    }

    public static void p(boolean bl) {
        J = bl;
    }

    public static boolean m() {
        return J;
    }

    public static boolean A() {
        boolean bl = ne_2.m();
        return !bl;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (ne_2.m()) {
            ne_2.p(true);
        }
    }
}

