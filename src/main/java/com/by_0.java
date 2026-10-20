/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.HT;
import com.O5;
import com.PY;
import com.W2;
import com.WF;
import com.a9;
import com.ac_0;
import com.au_0;
import com.az_0;
import com.cs_0;
import com.ej_0;
import com.fs_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import com.pp_0;
import com.rf_1;
import com.sa_0;
import com.sr_0;
import com.wd_0;
import com.yb_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.BoundedRangeModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JProgressBar;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.By
 */
public class by_0
extends JProgressBar
implements W2,
pp_0,
rf_1,
au_0,
yb_2,
sa_0 {
    private static int g;

    public by_0() {
        this.z();
    }

    public by_0(int n10) {
        super(n10);
        this.z();
    }

    public by_0(int n10, int n11) {
        super(n10, n11);
        this.z();
    }

    public by_0(int n10, int n11, int n12) {
        super(n10, n11, n12);
        this.z();
    }

    public by_0(BoundedRangeModel boundedRangeModel) {
        super(boundedRangeModel);
        this.z();
    }

    private void z() {
        this.getUI().installUI(this);
    }

    public int W() {
        return this.Z().A();
    }

    public void n(int n10) {
        this.Z().K(n10);
    }

    public int K() {
        return this.Z().W();
    }

    public void s(int n10) {
        this.Z().y(n10);
    }

    public int q() {
        return this.Z().J();
    }

    public void Q(int n10) {
        this.Z().i(n10);
    }

    public boolean H() {
        return this.Z().f();
    }

    public void s(boolean bl) {
        this.Z().i(bl);
    }

    public int h() {
        return this.Z().Y();
    }

    public void W(int n10) {
        this.Z().j(n10);
    }

    public Color R() {
        return this.Z().j();
    }

    public void I(Color color) {
        this.Z().M(color);
    }

    public Color U() {
        return this.Z().l();
    }

    public void T(Color color) {
        this.Z().m(color);
    }

    public Color j() {
        return this.Z().z();
    }

    public void Y(Color color) {
        this.Z().f(color);
    }

    public Color N() {
        return this.Z().p();
    }

    public void y(Color color) {
        this.Z().G(color);
    }

    public Color o() {
        return this.Z().N();
    }

    public void s(Color color) {
        this.Z().Q(color);
    }

    public Color f() {
        return this.Z().D();
    }

    public void m(Color color) {
        this.Z().u(color);
    }

    public Color O() {
        return this.Z().J();
    }

    public void j(Color color) {
        this.Z().e(color);
    }

    @Override
    public Shape B() {
        return this.Z().B();
    }

    public ej_0 Z() {
        return (ej_0)this.getUI();
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
                        var1_1 = by_0.y();
                        v0 = this;
                        if (var1_1 == 0) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw by_0.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == 0) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw by_0.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof ej_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw by_0.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((ej_0)kp_0.w(a9.zQ, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new ej_0());
                        if (var1_1 != 0) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw by_0.a(v5);
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

    public by_0 n() {
        return (by_0)FN.A(this);
    }

    @Override
    public by_0 u(boolean bl) {
        return (by_0)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public by_0 t() {
        return (by_0)FN.u(this);
    }

    public by_0 d(boolean bl) {
        return (by_0)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public by_0 L() {
        return (by_0)FN.C(this);
    }

    public by_0 s(boolean bl) {
        return (by_0)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public by_0 v(boolean bl, boolean bl2) {
        return (by_0)FN.K(this, bl, bl2);
    }

    public by_0 k(int n10) {
        return (by_0)FN.p((Component)this, n10);
    }

    public by_0 U(int n10) {
        return (by_0)FN.O((Component)this, n10);
    }

    @Override
    public by_0 V(int n10) {
        return (by_0)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public by_0 F(int n10, boolean bl, boolean bl2) {
        return (by_0)FN.d(this, n10, bl, bl2);
    }

    public by_0 R(int n10, int n11) {
        return (by_0)FN.m(this, n10, n11);
    }

    public by_0 A(String string) {
        return (by_0)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public by_0 E(int n10) {
        return (by_0)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public by_0 t(int n10) {
        return (by_0)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public by_0 g(int n10) {
        return (by_0)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public by_0 S(int n10) {
        return (by_0)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public by_0 M(int n10) {
        return (by_0)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public by_0 R(int n10) {
        return (by_0)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public by_0 P(int n10, int n11) {
        return (by_0)PY.O(this, n10, n11);
    }

    @Override
    public Component N(String string) {
        return this.A(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.R(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.F(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.V(n10);
    }

    @Override
    public Component o(int n10) {
        return this.U(n10);
    }

    @Override
    public Component i(int n10) {
        return this.k(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.v(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.s(bl);
    }

    @Override
    public Component Q() {
        return this.L();
    }

    @Override
    public Component u(boolean bl) {
        return this.d(bl);
    }

    @Override
    public Component R() {
        return this.t();
    }

    @Override
    public Component c(boolean bl) {
        return this.u(bl);
    }

    @Override
    public Component a() {
        return this.n();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.P(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.R(n10);
    }

    @Override
    public Component p(int n10) {
        return this.M(n10);
    }

    @Override
    public Component D(int n10) {
        return this.S(n10);
    }

    @Override
    public Component V(int n10) {
        return this.g(n10);
    }

    @Override
    public Component x(int n10) {
        return this.t(n10);
    }

    @Override
    public Component O(int n10) {
        return this.E(n10);
    }

    public static void Z(int n10) {
        g = n10;
    }

    public static int y() {
        return g;
    }

    public static int J() {
        int n10 = by_0.y();
        if (n10 == 0) {
            return 102;
        }
        return 0;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (by_0.y() == 0) {
            by_0.Z(61);
        }
    }
}

