/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BI;
import com.D7;
import com.HT;
import com.O5;
import com.PY;
import com.W2;
import com.WF;
import com.WR;
import com.a9;
import com.ac_0;
import com.az_0;
import com.cs_0;
import com.cx_1;
import com.fs_0;
import com.i2_0;
import com.kp_0;
import com.ne_1;
import com.og_2;
import com.ox_2;
import com.pp_0;
import com.rf_1;
import com.sa_0;
import com.sr_0;
import com.wd_0;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.ky
 */
public class ky_2
extends JPanel
implements D7,
W2,
WR,
pp_0,
rf_1,
sa_0,
cx_1 {
    private static String[] L;
    private static final String[] ab;
    private static final String[] bb;

    public ky_2() {
        super(new BorderLayout());
    }

    public ky_2(boolean bl) {
        ky_2[] ky_2Array = BI.u();
        super(new BorderLayout());
        ky_2[] ky_2Array2 = ky_2Array;
        boolean bl2 = bl;
        if (ky_2Array2 == null) {
            bl2 = !bl2;
        }
        this.T(bl2);
    }

    public ky_2(boolean bl, LayoutManager layoutManager) {
        ky_2[] ky_2Array = BI.u();
        super(layoutManager);
        ky_2[] ky_2Array2 = ky_2Array;
        boolean bl2 = bl;
        if (ky_2Array2 == null) {
            bl2 = !bl2;
        }
        this.T(bl2);
    }

    public ky_2(boolean bl, Component component) {
        ky_2[] ky_2Array = BI.u();
        super(new BorderLayout());
        ky_2[] ky_2Array2 = ky_2Array;
        boolean bl2 = bl;
        if (ky_2Array2 == null) {
            bl2 = !bl2;
        }
        this.T(bl2);
        this.add(component, ky_2.a(-27809, 6667));
    }

    public ky_2(Component component) {
        super(new BorderLayout());
        this.add(component, ky_2.a(-27810, 31514));
    }

    public ky_2(og_2 og_22) {
        super(new BorderLayout());
        this.L(og_22);
    }

    public ky_2(LayoutManager layoutManager, og_2 og_22) {
        super(layoutManager);
        this.L(og_22);
    }

    public ky_2(og_2 og_22, Component component) {
        super(new BorderLayout());
        this.L(og_22);
        this.add(component, ky_2.a(-27810, 31514));
    }

    public ky_2(LayoutManager layoutManager, og_2 og_22, Component[] componentArray) {
        super(layoutManager);
        this.L(og_22);
        this.S(componentArray);
    }

    public ky_2(LayoutManager layoutManager) {
        super(layoutManager);
    }

    public ky_2(LayoutManager layoutManager, boolean bl) {
        super(layoutManager, bl);
    }

    public ky_2(LayoutManager layoutManager, Component[] componentArray) {
        super(layoutManager);
        this.S(componentArray);
    }

    public ky_2(String string) {
        super(new BorderLayout());
        this.S(string);
    }

    public ky_2(String string, LayoutManager layoutManager) {
        super(layoutManager);
        this.S(string);
    }

    public ky_2(String string, Component component) {
        super(new BorderLayout());
        this.S(string);
        this.add(component, ky_2.a(-27810, 31514));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean o(Component component) {
        ky_2[] ky_2Array = BI.u();
        Component component2 = component;
        if (ky_2Array == null) {
            if (component2 == null) return false;
            component2 = component;
        }
        if (component2.getParent() != this) return false;
        return true;
    }

    public ky_2 g(List list, int n10) {
        block3: {
            ky_2[] ky_2Array = BI.u();
            if (list == null) break block3;
            int n11 = 0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                block5: {
                    block4: {
                        Component component;
                        Component component2 = component = (Component)list.get(i2);
                        if (ky_2Array != null) break block4;
                        if (component2 == null) break block5;
                        component2 = this.add(component, n10 + i2 - n11);
                    }
                    if (ky_2Array == null) continue;
                }
                ++n11;
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 N(List list, String string) {
        block6: {
            List list2;
            ky_2[] ky_2Array;
            block5: {
                ky_2Array = BI.u();
                list2 = list;
                if (ky_2Array != null) break block5;
                if (list2 == null) break block6;
                list2 = list;
            }
            for (Component component : list2) {
                if (component != null) {
                    this.add(component, string);
                }
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 l(List list) {
        block6: {
            List list2;
            ky_2[] ky_2Array;
            block5: {
                ky_2Array = BI.u();
                list2 = list;
                if (ky_2Array != null) break block5;
                if (list2 == null) break block6;
                list2 = list;
            }
            Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                Component component;
                Component component2 = component = (Component)iterator.next();
                if (ky_2Array == null && component2 != null) {
                    component2 = this.add(component);
                }
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 f(int n10, Component[] componentArray) {
        block4: {
            int n11;
            ky_2[] ky_2Array;
            block5: {
                Component[] componentArray2;
                block3: {
                    ky_2Array = BI.u();
                    componentArray2 = componentArray;
                    if (ky_2Array != null) break block3;
                    if (componentArray2 == null) break block4;
                    componentArray2 = componentArray;
                }
                n11 = componentArray2.length;
                if (ky_2Array != null) break block5;
                if (n11 <= 0) break block4;
                n11 = 0;
            }
            int n12 = n11;
            for (int i2 = 0; i2 < componentArray.length; ++i2) {
                block7: {
                    block6: {
                        Component component;
                        Component component2 = component = componentArray[i2];
                        if (ky_2Array != null) break block6;
                        if (component2 == null) break block7;
                        component2 = this.add(component, n10 + i2 - n12);
                    }
                    if (ky_2Array == null) continue;
                }
                ++n12;
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 j(String string, Component[] componentArray) {
        block7: {
            Component[] componentArray2;
            ky_2[] ky_2Array;
            block8: {
                block6: {
                    ky_2Array = BI.u();
                    componentArray2 = componentArray;
                    if (ky_2Array != null) break block6;
                    if (componentArray2 == null) break block7;
                    componentArray2 = componentArray;
                }
                if (ky_2Array != null) break block8;
                if (componentArray2.length <= 0) break block7;
                componentArray2 = componentArray;
            }
            Component[] componentArray3 = componentArray2;
            int n10 = componentArray3.length;
            int n11 = 0;
            while (n11 < n10) {
                Component component = componentArray3[n11];
                if (ky_2Array == null) {
                    if (component != null) {
                        this.add(component, string);
                    }
                    ++n11;
                }
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 S(Component[] componentArray) {
        block7: {
            Component[] componentArray2;
            ky_2[] ky_2Array;
            block8: {
                block6: {
                    ky_2Array = BI.u();
                    componentArray2 = componentArray;
                    if (ky_2Array != null) break block6;
                    if (componentArray2 == null) break block7;
                    componentArray2 = componentArray;
                }
                if (ky_2Array != null) break block8;
                if (componentArray2.length <= 0) break block7;
                componentArray2 = componentArray;
            }
            Component[] componentArray3 = componentArray2;
            int n10 = componentArray3.length;
            int n11 = 0;
            while (n11 < n10) {
                Component component = componentArray3[n11];
                if (ky_2Array == null) {
                    if (component != null) {
                        this.add(component);
                    }
                    ++n11;
                }
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 N(List list) {
        block6: {
            List list2;
            ky_2[] ky_2Array;
            block5: {
                ky_2Array = BI.u();
                list2 = list;
                if (ky_2Array != null) break block5;
                if (list2 == null) break block6;
                list2 = list;
            }
            for (Component component : list2) {
                if (component != null) {
                    this.remove(component);
                }
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 H(Component[] componentArray) {
        block7: {
            Component[] componentArray2;
            ky_2[] ky_2Array;
            block8: {
                block6: {
                    ky_2Array = BI.u();
                    componentArray2 = componentArray;
                    if (ky_2Array != null) break block6;
                    if (componentArray2 == null) break block7;
                    componentArray2 = componentArray;
                }
                if (ky_2Array != null) break block8;
                if (componentArray2.length <= 0) break block7;
                componentArray2 = componentArray;
            }
            Component[] componentArray3 = componentArray2;
            int n10 = componentArray3.length;
            int n11 = 0;
            while (n11 < n10) {
                Component component = componentArray3[n11];
                if (ky_2Array == null) {
                    if (component != null) {
                        this.remove(component);
                    }
                    ++n11;
                }
                if (ky_2Array == null) continue;
            }
        }
        return this;
    }

    public ky_2 P(Class clazz) {
        ky_2 ky_22;
        ky_2[] ky_2Array = BI.u();
        if (clazz != null) {
            int n10 = 0;
            while (n10 < this.getComponentCount()) {
                ky_22 = this;
                if (ky_2Array == null) {
                    Component component = ky_22.getComponent(n10);
                    if (ky_2Array == null) {
                        if (clazz.isAssignableFrom(component.getClass())) {
                            this.remove(component);
                        }
                        ++n10;
                    }
                    if (ky_2Array == null) continue;
                }
                break;
            }
        } else {
            ky_22 = this;
        }
        return ky_22;
    }

    public Component K() {
        block3: {
            Component component;
            block2: {
                ky_2[] ky_2Array = BI.u();
                component = this;
                if (ky_2Array != null) break block2;
                if (component.getComponentCount() <= 0) break block3;
                component = this.getComponent(0);
            }
            return component;
        }
        return null;
    }

    public Component q() {
        block3: {
            Component component;
            block2: {
                ky_2[] ky_2Array = BI.u();
                component = this;
                if (ky_2Array != null) break block2;
                if (component.getComponentCount() <= 0) break block3;
                component = this.getComponent(this.getComponentCount() - 1);
            }
            return component;
        }
        return null;
    }

    public boolean F() {
        return this.J().R();
    }

    public ky_2 T(boolean bl) {
        this.J().h(bl);
        return this;
    }

    public boolean m() {
        return this.J().f();
    }

    public ky_2 i(boolean bl) {
        this.J().g(bl);
        return this;
    }

    public Insets O() {
        return this.J().j();
    }

    public void b(Insets insets) {
        this.J().t(insets);
    }

    public ky_2 N(int n10, int n11, int n12, int n13) {
        this.b(new Insets(n10, n11, n12, n13));
        return this;
    }

    public ky_2 C(int n10) {
        return this.N(n10, n10, n10, n10);
    }

    public boolean c() {
        return this.J().s();
    }

    @Override
    public void D(boolean bl) {
        this.J().D(bl);
    }

    public boolean g() {
        return this.J().v();
    }

    @Override
    public void C(boolean bl) {
        this.J().C(bl);
    }

    public boolean S() {
        return this.J().M();
    }

    @Override
    public void p(boolean bl) {
        this.J().p(bl);
    }

    public boolean i() {
        return this.J().k();
    }

    @Override
    public void w(boolean bl) {
        this.J().w(bl);
    }

    @Override
    public void I(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.J().I(bl, bl2, bl3, bl4);
    }

    public boolean s() {
        return this.J().G();
    }

    @Override
    public void X(boolean bl) {
        this.J().X(bl);
    }

    public boolean r() {
        return this.J().D();
    }

    @Override
    public void H(boolean bl) {
        this.J().H(bl);
    }

    public boolean b() {
        return this.J().K();
    }

    @Override
    public void B(boolean bl) {
        this.J().B(bl);
    }

    public boolean j() {
        return this.J().m();
    }

    @Override
    public void m(boolean bl) {
        this.J().m(bl);
    }

    @Override
    public void X(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.J().X(bl, bl2, bl3, bl4);
    }

    public int q() {
        return this.J().d();
    }

    public ky_2 Y(int n10) {
        this.J().p(n10);
        return this;
    }

    public int E() {
        return this.J().B();
    }

    @Override
    public ky_2 D(int n10) {
        this.J().P(n10);
        return this;
    }

    public float e() {
        return this.J().V();
    }

    public ky_2 L(float f10) {
        this.J().a(f10);
        return this;
    }

    public Stroke b() {
        return this.J().A();
    }

    public ky_2 l(Stroke stroke) {
        this.J().a(stroke);
        return this;
    }

    public Color w() {
        return this.J().A();
    }

    public ky_2 E(Color color) {
        this.J().C(color);
        return this;
    }

    public Color g() {
        return this.J().O();
    }

    public ky_2 k(Color color) {
        this.J().q(color);
        return this;
    }

    public boolean h() {
        return this.J().r();
    }

    public ky_2 s(boolean bl) {
        this.J().P(bl);
        return this;
    }

    public boolean x() {
        return this.J().n();
    }

    public ky_2 u(boolean bl) {
        this.J().z(bl);
        return this;
    }

    public og_2 l() {
        return ox_2.y(this);
    }

    public ky_2 L(og_2 og_22) {
        ox_2.b(this, og_22);
        return this;
    }

    @Override
    public String A() {
        return this.J().A();
    }

    @Override
    public void S(String string) {
        this.J().S(string);
    }

    @Override
    public Shape B() {
        return this.J().B();
    }

    public BI J() {
        return (BI)this.getUI();
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
                        var1_1 = BI.u();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw ky_2.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw ky_2.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof BI)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw ky_2.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((BI)kp_0.w(a9.f, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new BI());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw ky_2.a(v5);
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
    public int M() {
        return PY.f(this);
    }

    public ky_2 t(int n10) {
        return (ky_2)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public ky_2 B(int n10) {
        return (ky_2)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public ky_2 H(int n10) {
        return (ky_2)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public ky_2 r(int n10) {
        return (ky_2)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public ky_2 Z(int n10) {
        return (ky_2)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public ky_2 P(int n10) {
        return (ky_2)PY.y(this, n10);
    }

    public ky_2 I(int n10, int n11) {
        return (ky_2)PY.O(this, n10, n11);
    }

    @Override
    public void o(String string) {
        i2_0.f(this, string);
    }

    @Override
    public void I() {
        i2_0.p(this);
    }

    @Override
    public String q() {
        return i2_0.O(this);
    }

    @Override
    public Component W(int n10, int n11) {
        return this.I(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.P(n10);
    }

    @Override
    public Component p(int n10) {
        return this.Z(n10);
    }

    @Override
    public Component D(int n10) {
        return this.r(n10);
    }

    @Override
    public Component V(int n10) {
        return this.H(n10);
    }

    @Override
    public Component x(int n10) {
        return this.B(n10);
    }

    @Override
    public Component O(int n10) {
        return this.t(n10);
    }

    public static void K(String[] stringArray) {
        L = stringArray;
    }

    public static String[] F() {
        return L;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u0080\u00c9\u00e5\u00e7\u00e2j\u0006\u0097n\u0007\u0013\u00be\u00f4";
            var4_3 = "\u0080\u00c9\u00e5\u00e7\u00e2j\u0006\u0097n\u0007\u0013\u00be\u00f4".length();
            var1_4 = 6;
            var0_5 = -1;
            ky_2.K(null);
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 46;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 74;
                            break;
                        }
                        case 1: {
                            v11 = 52;
                            break;
                        }
                        case 2: {
                            v11 = 18;
                            break;
                        }
                        case 3: {
                            v11 = 14;
                            break;
                        }
                        case 4: {
                            v11 = 49;
                            break;
                        }
                        case 5: {
                            v11 = 52;
                            break;
                        }
                        default: {
                            v11 = 47;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        ky_2.ab = var5;
        ky_2.bb = new String[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF935F) & 0xFFFF;
        if (bb[n12] == null) {
            int n13;
            int n14;
            char[] cArray = ab[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 237;
                    break;
                }
                case 1: {
                    n14 = 29;
                    break;
                }
                case 2: {
                    n14 = 40;
                    break;
                }
                case 3: {
                    n14 = 219;
                    break;
                }
                case 4: {
                    n14 = 96;
                    break;
                }
                case 5: {
                    n14 = 158;
                    break;
                }
                case 6: {
                    n14 = 28;
                    break;
                }
                case 7: {
                    n14 = 43;
                    break;
                }
                case 8: {
                    n14 = 144;
                    break;
                }
                case 9: {
                    n14 = 92;
                    break;
                }
                case 10: {
                    n14 = 168;
                    break;
                }
                case 11: {
                    n14 = 76;
                    break;
                }
                case 12: {
                    n14 = 85;
                    break;
                }
                case 13: {
                    n14 = 227;
                    break;
                }
                case 14: {
                    n14 = 54;
                    break;
                }
                case 15: {
                    n14 = 148;
                    break;
                }
                case 16: {
                    n14 = 113;
                    break;
                }
                case 17: {
                    n14 = 159;
                    break;
                }
                case 18: {
                    n14 = 12;
                    break;
                }
                case 19: {
                    n14 = 142;
                    break;
                }
                case 20: {
                    n14 = 170;
                    break;
                }
                case 21: {
                    n14 = 249;
                    break;
                }
                case 22: {
                    n14 = 23;
                    break;
                }
                case 23: {
                    n14 = 35;
                    break;
                }
                case 24: {
                    n14 = 179;
                    break;
                }
                case 25: {
                    n14 = 171;
                    break;
                }
                case 26: {
                    n14 = 86;
                    break;
                }
                case 27: {
                    n14 = 83;
                    break;
                }
                case 28: {
                    n14 = 78;
                    break;
                }
                case 29: {
                    n14 = 8;
                    break;
                }
                case 30: {
                    n14 = 67;
                    break;
                }
                case 31: {
                    n14 = 147;
                    break;
                }
                case 32: {
                    n14 = 44;
                    break;
                }
                case 33: {
                    n14 = 139;
                    break;
                }
                case 34: {
                    n14 = 224;
                    break;
                }
                case 35: {
                    n14 = 31;
                    break;
                }
                case 36: {
                    n14 = 152;
                    break;
                }
                case 37: {
                    n14 = 110;
                    break;
                }
                case 38: {
                    n14 = 188;
                    break;
                }
                case 39: {
                    n14 = 225;
                    break;
                }
                case 40: {
                    n14 = 178;
                    break;
                }
                case 41: {
                    n14 = 134;
                    break;
                }
                case 42: {
                    n14 = 174;
                    break;
                }
                case 43: {
                    n14 = 116;
                    break;
                }
                case 44: {
                    n14 = 156;
                    break;
                }
                case 45: {
                    n14 = 215;
                    break;
                }
                case 46: {
                    n14 = 70;
                    break;
                }
                case 47: {
                    n14 = 183;
                    break;
                }
                case 48: {
                    n14 = 74;
                    break;
                }
                case 49: {
                    n14 = 239;
                    break;
                }
                case 50: {
                    n14 = 63;
                    break;
                }
                case 51: {
                    n14 = 45;
                    break;
                }
                case 52: {
                    n14 = 119;
                    break;
                }
                case 53: {
                    n14 = 18;
                    break;
                }
                case 54: {
                    n14 = 233;
                    break;
                }
                case 55: {
                    n14 = 32;
                    break;
                }
                case 56: {
                    n14 = 213;
                    break;
                }
                case 57: {
                    n14 = 87;
                    break;
                }
                case 58: {
                    n14 = 229;
                    break;
                }
                case 59: {
                    n14 = 137;
                    break;
                }
                case 60: {
                    n14 = 132;
                    break;
                }
                case 61: {
                    n14 = 157;
                    break;
                }
                case 62: {
                    n14 = 20;
                    break;
                }
                case 63: {
                    n14 = 109;
                    break;
                }
                case 64: {
                    n14 = 108;
                    break;
                }
                case 65: {
                    n14 = 59;
                    break;
                }
                case 66: {
                    n14 = 55;
                    break;
                }
                case 67: {
                    n14 = 185;
                    break;
                }
                case 68: {
                    n14 = 228;
                    break;
                }
                case 69: {
                    n14 = 236;
                    break;
                }
                case 70: {
                    n14 = 82;
                    break;
                }
                case 71: {
                    n14 = 38;
                    break;
                }
                case 72: {
                    n14 = 220;
                    break;
                }
                case 73: {
                    n14 = 231;
                    break;
                }
                case 74: {
                    n14 = 4;
                    break;
                }
                case 75: {
                    n14 = 97;
                    break;
                }
                case 76: {
                    n14 = 210;
                    break;
                }
                case 77: {
                    n14 = 135;
                    break;
                }
                case 78: {
                    n14 = 202;
                    break;
                }
                case 79: {
                    n14 = 127;
                    break;
                }
                case 80: {
                    n14 = 65;
                    break;
                }
                case 81: {
                    n14 = 90;
                    break;
                }
                case 82: {
                    n14 = 222;
                    break;
                }
                case 83: {
                    n14 = 191;
                    break;
                }
                case 84: {
                    n14 = 118;
                    break;
                }
                case 85: {
                    n14 = 49;
                    break;
                }
                case 86: {
                    n14 = 241;
                    break;
                }
                case 87: {
                    n14 = 190;
                    break;
                }
                case 88: {
                    n14 = 79;
                    break;
                }
                case 89: {
                    n14 = 33;
                    break;
                }
                case 90: {
                    n14 = 130;
                    break;
                }
                case 91: {
                    n14 = 47;
                    break;
                }
                case 92: {
                    n14 = 242;
                    break;
                }
                case 93: {
                    n14 = 126;
                    break;
                }
                case 94: {
                    n14 = 164;
                    break;
                }
                case 95: {
                    n14 = 46;
                    break;
                }
                case 96: {
                    n14 = 206;
                    break;
                }
                case 97: {
                    n14 = 162;
                    break;
                }
                case 98: {
                    n14 = 128;
                    break;
                }
                case 99: {
                    n14 = 149;
                    break;
                }
                case 100: {
                    n14 = 68;
                    break;
                }
                case 101: {
                    n14 = 56;
                    break;
                }
                case 102: {
                    n14 = 189;
                    break;
                }
                case 103: {
                    n14 = 52;
                    break;
                }
                case 104: {
                    n14 = 51;
                    break;
                }
                case 105: {
                    n14 = 25;
                    break;
                }
                case 106: {
                    n14 = 180;
                    break;
                }
                case 107: {
                    n14 = 172;
                    break;
                }
                case 108: {
                    n14 = 21;
                    break;
                }
                case 109: {
                    n14 = 192;
                    break;
                }
                case 110: {
                    n14 = 98;
                    break;
                }
                case 111: {
                    n14 = 184;
                    break;
                }
                case 112: {
                    n14 = 167;
                    break;
                }
                case 113: {
                    n14 = 19;
                    break;
                }
                case 114: {
                    n14 = 114;
                    break;
                }
                case 115: {
                    n14 = 0;
                    break;
                }
                case 116: {
                    n14 = 61;
                    break;
                }
                case 117: {
                    n14 = 182;
                    break;
                }
                case 118: {
                    n14 = 71;
                    break;
                }
                case 119: {
                    n14 = 166;
                    break;
                }
                case 120: {
                    n14 = 111;
                    break;
                }
                case 121: {
                    n14 = 115;
                    break;
                }
                case 122: {
                    n14 = 37;
                    break;
                }
                case 123: {
                    n14 = 53;
                    break;
                }
                case 124: {
                    n14 = 11;
                    break;
                }
                case 125: {
                    n14 = 69;
                    break;
                }
                case 126: {
                    n14 = 235;
                    break;
                }
                case 127: {
                    n14 = 22;
                    break;
                }
                case 128: {
                    n14 = 238;
                    break;
                }
                case 129: {
                    n14 = 27;
                    break;
                }
                case 130: {
                    n14 = 103;
                    break;
                }
                case 131: {
                    n14 = 154;
                    break;
                }
                case 132: {
                    n14 = 36;
                    break;
                }
                case 133: {
                    n14 = 221;
                    break;
                }
                case 134: {
                    n14 = 50;
                    break;
                }
                case 135: {
                    n14 = 141;
                    break;
                }
                case 136: {
                    n14 = 26;
                    break;
                }
                case 137: {
                    n14 = 247;
                    break;
                }
                case 138: {
                    n14 = 223;
                    break;
                }
                case 139: {
                    n14 = 2;
                    break;
                }
                case 140: {
                    n14 = 199;
                    break;
                }
                case 141: {
                    n14 = 187;
                    break;
                }
                case 142: {
                    n14 = 232;
                    break;
                }
                case 143: {
                    n14 = 81;
                    break;
                }
                case 144: {
                    n14 = 197;
                    break;
                }
                case 145: {
                    n14 = 101;
                    break;
                }
                case 146: {
                    n14 = 203;
                    break;
                }
                case 147: {
                    n14 = 99;
                    break;
                }
                case 148: {
                    n14 = 104;
                    break;
                }
                case 149: {
                    n14 = 136;
                    break;
                }
                case 150: {
                    n14 = 117;
                    break;
                }
                case 151: {
                    n14 = 252;
                    break;
                }
                case 152: {
                    n14 = 95;
                    break;
                }
                case 153: {
                    n14 = 161;
                    break;
                }
                case 154: {
                    n14 = 200;
                    break;
                }
                case 155: {
                    n14 = 75;
                    break;
                }
                case 156: {
                    n14 = 173;
                    break;
                }
                case 157: {
                    n14 = 122;
                    break;
                }
                case 158: {
                    n14 = 88;
                    break;
                }
                case 159: {
                    n14 = 10;
                    break;
                }
                case 160: {
                    n14 = 14;
                    break;
                }
                case 161: {
                    n14 = 254;
                    break;
                }
                case 162: {
                    n14 = 107;
                    break;
                }
                case 163: {
                    n14 = 216;
                    break;
                }
                case 164: {
                    n14 = 5;
                    break;
                }
                case 165: {
                    n14 = 181;
                    break;
                }
                case 166: {
                    n14 = 176;
                    break;
                }
                case 167: {
                    n14 = 160;
                    break;
                }
                case 168: {
                    n14 = 234;
                    break;
                }
                case 169: {
                    n14 = 196;
                    break;
                }
                case 170: {
                    n14 = 72;
                    break;
                }
                case 171: {
                    n14 = 41;
                    break;
                }
                case 172: {
                    n14 = 153;
                    break;
                }
                case 173: {
                    n14 = 94;
                    break;
                }
                case 174: {
                    n14 = 163;
                    break;
                }
                case 175: {
                    n14 = 209;
                    break;
                }
                case 176: {
                    n14 = 6;
                    break;
                }
                case 177: {
                    n14 = 212;
                    break;
                }
                case 178: {
                    n14 = 64;
                    break;
                }
                case 179: {
                    n14 = 9;
                    break;
                }
                case 180: {
                    n14 = 186;
                    break;
                }
                case 181: {
                    n14 = 195;
                    break;
                }
                case 182: {
                    n14 = 146;
                    break;
                }
                case 183: {
                    n14 = 143;
                    break;
                }
                case 184: {
                    n14 = 123;
                    break;
                }
                case 185: {
                    n14 = 39;
                    break;
                }
                case 186: {
                    n14 = 58;
                    break;
                }
                case 187: {
                    n14 = 240;
                    break;
                }
                case 188: {
                    n14 = 230;
                    break;
                }
                case 189: {
                    n14 = 15;
                    break;
                }
                case 190: {
                    n14 = 211;
                    break;
                }
                case 191: {
                    n14 = 24;
                    break;
                }
                case 192: {
                    n14 = 250;
                    break;
                }
                case 193: {
                    n14 = 255;
                    break;
                }
                case 194: {
                    n14 = 205;
                    break;
                }
                case 195: {
                    n14 = 121;
                    break;
                }
                case 196: {
                    n14 = 1;
                    break;
                }
                case 197: {
                    n14 = 133;
                    break;
                }
                case 198: {
                    n14 = 201;
                    break;
                }
                case 199: {
                    n14 = 80;
                    break;
                }
                case 200: {
                    n14 = 177;
                    break;
                }
                case 201: {
                    n14 = 165;
                    break;
                }
                case 202: {
                    n14 = 7;
                    break;
                }
                case 203: {
                    n14 = 3;
                    break;
                }
                case 204: {
                    n14 = 66;
                    break;
                }
                case 205: {
                    n14 = 93;
                    break;
                }
                case 206: {
                    n14 = 17;
                    break;
                }
                case 207: {
                    n14 = 91;
                    break;
                }
                case 208: {
                    n14 = 105;
                    break;
                }
                case 209: {
                    n14 = 62;
                    break;
                }
                case 210: {
                    n14 = 204;
                    break;
                }
                case 211: {
                    n14 = 73;
                    break;
                }
                case 212: {
                    n14 = 150;
                    break;
                }
                case 213: {
                    n14 = 42;
                    break;
                }
                case 214: {
                    n14 = 151;
                    break;
                }
                case 215: {
                    n14 = 245;
                    break;
                }
                case 216: {
                    n14 = 89;
                    break;
                }
                case 217: {
                    n14 = 34;
                    break;
                }
                case 218: {
                    n14 = 120;
                    break;
                }
                case 219: {
                    n14 = 218;
                    break;
                }
                case 220: {
                    n14 = 155;
                    break;
                }
                case 221: {
                    n14 = 207;
                    break;
                }
                case 222: {
                    n14 = 16;
                    break;
                }
                case 223: {
                    n14 = 112;
                    break;
                }
                case 224: {
                    n14 = 244;
                    break;
                }
                case 225: {
                    n14 = 243;
                    break;
                }
                case 226: {
                    n14 = 251;
                    break;
                }
                case 227: {
                    n14 = 84;
                    break;
                }
                case 228: {
                    n14 = 100;
                    break;
                }
                case 229: {
                    n14 = 30;
                    break;
                }
                case 230: {
                    n14 = 208;
                    break;
                }
                case 231: {
                    n14 = 214;
                    break;
                }
                case 232: {
                    n14 = 125;
                    break;
                }
                case 233: {
                    n14 = 13;
                    break;
                }
                case 234: {
                    n14 = 169;
                    break;
                }
                case 235: {
                    n14 = 57;
                    break;
                }
                case 236: {
                    n14 = 129;
                    break;
                }
                case 237: {
                    n14 = 140;
                    break;
                }
                case 238: {
                    n14 = 246;
                    break;
                }
                case 239: {
                    n14 = 77;
                    break;
                }
                case 240: {
                    n14 = 198;
                    break;
                }
                case 241: {
                    n14 = 175;
                    break;
                }
                case 242: {
                    n14 = 226;
                    break;
                }
                case 243: {
                    n14 = 106;
                    break;
                }
                case 244: {
                    n14 = 131;
                    break;
                }
                case 245: {
                    n14 = 194;
                    break;
                }
                case 246: {
                    n14 = 145;
                    break;
                }
                case 247: {
                    n14 = 60;
                    break;
                }
                case 248: {
                    n14 = 248;
                    break;
                }
                case 249: {
                    n14 = 102;
                    break;
                }
                case 250: {
                    n14 = 217;
                    break;
                }
                case 251: {
                    n14 = 48;
                    break;
                }
                case 252: {
                    n14 = 253;
                    break;
                }
                case 253: {
                    n14 = 193;
                    break;
                }
                case 254: {
                    n14 = 124;
                    break;
                }
                default: {
                    n14 = 138;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            ky_2.bb[n12] = new String(cArray).intern();
        }
        return bb[n12];
    }
}

