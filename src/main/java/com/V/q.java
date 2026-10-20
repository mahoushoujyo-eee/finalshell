/*
 * Decompiled with CFR 0.152.
 */
package com.V;

import com.FN;
import com.HT;
import com.O5;
import com.V.t;
import com.W2;
import com.WF;
import com.a9;
import com.ac_0;
import com.az_0;
import com.cs_0;
import com.fs_0;
import com.kp_0;
import com.ne_1;
import com.pp_0;
import com.rf_1;
import com.sr_0;
import com.wd_0;
import com.yb_2;
import java.awt.Component;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class q
extends JSpinner
implements pp_0,
rf_1,
W2,
yb_2 {
    public q() {
    }

    public q(SpinnerModel spinnerModel) {
        super(spinnerModel);
    }

    public int o() {
        return this.t().v();
    }

    public void t(int n10) {
        this.t().w(n10);
    }

    public int s() {
        return this.t().o();
    }

    public void o(int n10) {
        this.t().p(n10);
    }

    public boolean E() {
        return this.t().R();
    }

    public void V(boolean bl) {
        this.t().a(bl);
    }

    public boolean u() {
        return this.t().S();
    }

    public void u(boolean bl) {
        this.t().G(bl);
    }

    @Override
    protected JComponent createEditor(SpinnerModel spinnerModel) {
        int[] nArray = t.S();
        boolean bl = spinnerModel instanceof SpinnerDateModel;
        if (nArray != null) {
            if (bl) {
                JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(this);
                t.M(dateEditor.getTextField(), this);
                return dateEditor;
            }
            bl = spinnerModel instanceof SpinnerListModel;
        }
        if (nArray != null) {
            if (bl) {
                JSpinner.ListEditor listEditor = new JSpinner.ListEditor(this);
                t.M(listEditor.getTextField(), this);
                return listEditor;
            }
            bl = spinnerModel instanceof SpinnerNumberModel;
        }
        if (bl) {
            JSpinner.NumberEditor numberEditor = new JSpinner.NumberEditor(this);
            t.M(numberEditor.getTextField(), this);
            return numberEditor;
        }
        JSpinner.DefaultEditor defaultEditor = new JSpinner.DefaultEditor(this);
        t.M(defaultEditor.getTextField(), this);
        return defaultEditor;
    }

    @Override
    public Shape B() {
        return this.t().B();
    }

    public t t() {
        return (t)this.getUI();
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
                        var1_1 = t.S();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw q.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw q.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof t)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw q.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((t)kp_0.w(a9.H, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new t());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw q.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
        this.revalidate();
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

    public q k() {
        return (q)FN.A(this);
    }

    public q B(boolean bl) {
        return (q)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public q A() {
        return (q)FN.u(this);
    }

    public q d(boolean bl) {
        return (q)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public q T() {
        return (q)FN.C(this);
    }

    public q j(boolean bl) {
        return (q)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public q j(boolean bl, boolean bl2) {
        return (q)FN.K(this, bl, bl2);
    }

    public q s(int n10) {
        return (q)FN.p((Component)this, n10);
    }

    public q l(int n10) {
        return (q)FN.O((Component)this, n10);
    }

    @Override
    public q i(int n10) {
        return (q)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public q G(int n10, boolean bl, boolean bl2) {
        return (q)FN.d(this, n10, bl, bl2);
    }

    public q x(int n10, int n11) {
        return (q)FN.m(this, n10, n11);
    }

    public q H(String string) {
        return (q)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.H(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.x(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.G(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.i(n10);
    }

    @Override
    public Component o(int n10) {
        return this.l(n10);
    }

    @Override
    public Component i(int n10) {
        return this.s(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.j(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.j(bl);
    }

    @Override
    public Component Q() {
        return this.T();
    }

    @Override
    public Component u(boolean bl) {
        return this.d(bl);
    }

    @Override
    public Component R() {
        return this.A();
    }

    @Override
    public Component c(boolean bl) {
        return this.B(bl);
    }

    @Override
    public Component a() {
        return this.k();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

