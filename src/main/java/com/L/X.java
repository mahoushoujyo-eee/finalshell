/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.FN;
import com.HT;
import com.IB;
import com.L.Q;
import com.L.m;
import com.O5;
import com.PY;
import com.W2;
import com.WF;
import com.a9;
import com.ac_0;
import com.ax_0;
import com.az_0;
import com.cl_2;
import com.cs_0;
import com.eh_0;
import com.fs_0;
import com.kp_0;
import com.ky_2;
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
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class X
extends JComboBox
implements W2,
pp_0,
rf_1,
eh_0,
yb_2,
sa_0 {
    public X() {
    }

    public X(Vector vector) {
        super(vector);
    }

    public X(Vector vector, int n10) {
        super(vector);
        this.setSelectedIndex(n10);
    }

    public X(Vector vector, Object object) {
        super(vector);
        this.setSelectedItem(object);
    }

    public X(Object[] objectArray) {
        super(objectArray);
    }

    public X(Object[] objectArray, int n10) {
        super(objectArray);
        this.setSelectedIndex(n10);
    }

    public X(Object[] objectArray, Object object) {
        super(objectArray);
        this.setSelectedItem(object);
    }

    public X(ComboBoxModel comboBoxModel) {
        super(comboBoxModel);
    }

    public X(ComboBoxModel comboBoxModel, int n10) {
        super(comboBoxModel);
        this.setSelectedIndex(n10);
    }

    public X(ComboBoxModel comboBoxModel, Object object) {
        super(comboBoxModel);
        this.setSelectedItem(object);
    }

    @Override
    public int getSelectedIndex() {
        int n10;
        block4: {
            Object object = this.dataModel.getSelectedItem();
            int n11 = 0;
            ky_2[] ky_2Array = m.X();
            while (n11 < this.dataModel.getSize()) {
                Object e2 = this.dataModel.getElementAt(n11);
                if (ky_2Array == null) {
                    n10 = ax_0.Z(e2, new Object[]{object}) ? 1 : 0;
                    if (ky_2Array != null) break block4;
                    if (n10 != 0) {
                        return n11;
                    }
                    ++n11;
                }
                if (ky_2Array == null) continue;
            }
            n10 = -1;
        }
        return n10;
    }

    public void W(int n10) {
        this.M().m(n10);
    }

    public boolean v() {
        return this.M().m();
    }

    public void P(boolean bl) {
        this.M().G(bl);
    }

    public ImageIcon g() {
        return this.M().d();
    }

    public void V(ImageIcon imageIcon) {
        this.M().k(imageIcon);
    }

    public ImageIcon A() {
        return this.M().L();
    }

    public void y(ImageIcon imageIcon) {
        this.M().h(imageIcon);
    }

    public int w() {
        return this.M().B();
    }

    public void l(int n10) {
        this.M().D(n10);
    }

    public boolean E() {
        return this.M().k();
    }

    public void B(boolean bl) {
        this.M().n(bl);
    }

    public boolean V() {
        return this.M().J();
    }

    public void y(boolean bl) {
        this.M().E(bl);
    }

    public Color n() {
        return this.M().U();
    }

    public void z(Color color) {
        this.M().l(color);
    }

    public boolean C() {
        return this.M().f();
    }

    public void M(boolean bl) {
        this.M().a(bl);
    }

    public int l() {
        return this.M().N();
    }

    public void a(int n10) {
        this.M().P(n10);
    }

    public int t() {
        return this.M().J();
    }

    public void x(int n10) {
        this.M().A(n10);
    }

    public boolean n() {
        return this.M().G();
    }

    public void Y(boolean bl) {
        this.M().W(bl);
    }

    @Override
    public Shape B() {
        return this.M().B();
    }

    public Q n() {
        return (Q)this.getRenderer();
    }

    public m M() {
        return (m)this.getUI();
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
                        var1_1 = m.X();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw X.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw X.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof m)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw X.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((m)kp_0.w(a9.F, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new m());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw X.a(v5);
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

    @Override
    public X a() {
        return (X)FN.A(this);
    }

    public X t(boolean bl) {
        return (X)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public X J() {
        return (X)FN.u(this);
    }

    @Override
    public X c(boolean bl) {
        return (X)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public X b() {
        return (X)FN.C(this);
    }

    public X Y(boolean bl) {
        return (X)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public X J(boolean bl, boolean bl2) {
        return (X)FN.K(this, bl, bl2);
    }

    public X v(int n10) {
        return (X)FN.p((Component)this, n10);
    }

    public X X(int n10) {
        return (X)FN.O((Component)this, n10);
    }

    @Override
    public X V(int n10) {
        return (X)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public X X(int n10, boolean bl, boolean bl2) {
        return (X)FN.d(this, n10, bl, bl2);
    }

    public X p(int n10, int n11) {
        return (X)FN.m(this, n10, n11);
    }

    public X r(String string) {
        return (X)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public X u(int n10) {
        return (X)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    @Override
    public X x(int n10) {
        return (X)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public X e(int n10) {
        return (X)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public X Z(int n10) {
        return (X)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public X R(int n10) {
        return (X)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public X i(int n10) {
        return (X)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public X U(int n10, int n11) {
        return (X)PY.O(this, n10, n11);
    }

    @Override
    public Component N(String string) {
        return this.r(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.p(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.X(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.V(n10);
    }

    @Override
    public Component o(int n10) {
        return this.X(n10);
    }

    @Override
    public Component i(int n10) {
        return this.v(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.J(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.Y(bl);
    }

    @Override
    public Component Q() {
        return this.b();
    }

    @Override
    public Component u(boolean bl) {
        return this.c(bl);
    }

    @Override
    public Component R() {
        return this.J();
    }

    @Override
    public Component c(boolean bl) {
        return this.t(bl);
    }

    @Override
    public Component a() {
        return this.a();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.U(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.i(n10);
    }

    @Override
    public Component p(int n10) {
        return this.R(n10);
    }

    @Override
    public Component D(int n10) {
        return this.Z(n10);
    }

    @Override
    public Component V(int n10) {
        return this.e(n10);
    }

    @Override
    public Component x(int n10) {
        return this.x(n10);
    }

    @Override
    public Component O(int n10) {
        return this.u(n10);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

