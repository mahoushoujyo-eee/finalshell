/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.HT;
import com.K3;
import com.O5;
import com.PY;
import com.a9;
import com.aL;
import com.az_0;
import com.ci_1;
import com.cs_0;
import com.ed_1;
import com.fs_0;
import com.kd_0;
import com.kp_0;
import com.ne_1;
import com.oq_0;
import com.os_2;
import com.pp_0;
import com.rq_0;
import com.sa_0;
import com.sr_0;
import com.w3_0;
import com.yb_2;
import com.yc_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CI
extends JList
implements pp_0,
yb_2,
sa_0 {
    protected List U = new ArrayList(1);
    protected boolean k = false;
    protected K3 D = null;
    protected rq_0 t = null;
    protected int x = -1;
    protected boolean X = true;
    private static String[] B;

    public CI() {
    }

    public CI(List list) {
        super(list.toArray());
    }

    public CI(Vector vector) {
        super(vector);
    }

    public CI(Object[] objectArray) {
        super(objectArray);
    }

    public CI(ListModel listModel) {
        super(listModel);
    }

    public void A(boolean n10) {
        String[] stringArray = CI.c();
        int n11 = n10;
        if (stringArray == null) {
            n11 = n11 != 0 ? 2 : 0;
        }
        this.setSelectionMode(n11);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public oq_0 f() {
        ListCellRenderer listCellRenderer = this.getCellRenderer();
        String[] stringArray = CI.c();
        ListCellRenderer listCellRenderer2 = listCellRenderer;
        if (stringArray == null) {
            if (!(listCellRenderer2 instanceof oq_0)) return null;
            listCellRenderer2 = listCellRenderer;
        }
        oq_0 oq_02 = (oq_0)listCellRenderer2;
        return oq_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ed_1 A() {
        ListModel listModel = this.getModel();
        String[] stringArray = CI.c();
        ListModel listModel2 = listModel;
        if (stringArray == null) {
            if (!(listModel2 instanceof ed_1)) return null;
            listModel2 = listModel;
        }
        ed_1 ed_12 = (ed_1)listModel2;
        return ed_12;
    }

    public void s(Object object) {
        this.setSelectedValue(object, true);
    }

    public void N(Object[] objectArray) {
        this.I(aL.o(objectArray));
    }

    public void x(Collection collection) {
        this.I(new ArrayList(collection));
    }

    public void I(List list) {
        block2: {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            String[] stringArray = CI.c();
            ListModel listModel = this.getModel();
            for (int i2 = 0; i2 < listModel.getSize(); ++i2) {
                if (stringArray == null) {
                    boolean bl = list.contains(listModel.getElementAt(i2));
                    if (stringArray != null || !bl) continue;
                    bl = arrayList.add(i2);
                    if (stringArray == null) continue;
                }
                break block2;
            }
            this.setSelectedIndices(aL.J(arrayList));
        }
    }

    public boolean z() {
        return this.k;
    }

    public void M(boolean bl) {
        block3: {
            CI cI;
            block4: {
                String[] stringArray;
                block2: {
                    stringArray = CI.c();
                    cI = this;
                    if (stringArray != null) break block2;
                    cI.k = bl;
                    if (!bl) break block3;
                    cI = this;
                }
                if (stringArray != null) break block4;
                if (cI.D != null) break block3;
                cI = this;
            }
            cI.J(this.O());
        }
    }

    public boolean f() {
        return ci_1.V(this);
    }

    public void d(boolean bl) {
        block5: {
            CI cI;
            block6: {
                boolean bl2;
                block2: {
                    String[] stringArray;
                    block3: {
                        CI cI2;
                        block4: {
                            stringArray = CI.c();
                            bl2 = bl;
                            if (stringArray != null) break block2;
                            if (!bl2) break block3;
                            cI2 = this;
                            if (stringArray != null) break block4;
                            if (cI2.f()) break block5;
                            this.L(false);
                            cI2 = this;
                        }
                        ci_1.w(cI2);
                        if (stringArray == null) break block5;
                    }
                    cI = this;
                    if (stringArray != null) break block6;
                    bl2 = cI.f();
                }
                if (!bl2) break block5;
                cI = this;
            }
            ci_1.z(cI);
        }
    }

    public void J(K3 k3) {
        this.L();
        this.D = k3;
        k3.V(this);
    }

    protected K3 O() {
        return new w3_0();
    }

    public K3 S() {
        return this.D;
    }

    public void L() {
        block3: {
            K3 k3;
            block2: {
                String[] stringArray = CI.c();
                k3 = this.D;
                if (stringArray != null) break block2;
                if (k3 == null) break block3;
                k3 = this.D;
            }
            k3.S(this);
            this.D = null;
        }
    }

    public void R() {
        this.z(this.getSelectedIndex());
    }

    public void z(int n10) {
        block2: {
            K3 k3;
            block3: {
                K3 k32 = this.S();
                String[] stringArray = CI.c();
                if (n10 == -1) break block2;
                k3 = k32;
                if (stringArray != null) break block3;
                if (k3 == null) break block2;
                this.setSelectedIndex(n10);
                k3 = k32;
            }
            k3.N(this, n10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean X() {
        K3 k3 = this.S();
        String[] stringArray = CI.c();
        K3 k32 = k3;
        if (stringArray == null) {
            if (k32 == null) return false;
            k32 = k3;
        }
        boolean bl = k32.D();
        if (stringArray == null) {
            if (!bl) return false;
            bl = k3.C(this);
        }
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean k() {
        K3 k3 = this.S();
        String[] stringArray = CI.c();
        K3 k32 = k3;
        if (stringArray == null) {
            if (k32 == null) return false;
            k32 = k3;
        }
        boolean bl = k32.D();
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public rq_0 m() {
        return this.t;
    }

    public void G(rq_0 rq_02) {
        this.t = rq_02;
    }

    public boolean b() {
        return this.X;
    }

    public void Y(boolean bl) {
        this.X = bl;
        int n10 = this.getLeadSelectionIndex();
        int[] nArray = this.getSelectedIndices();
        this.setSelectionModel(bl ? new DefaultListSelectionModel() : new kd_0());
        this.setSelectedIndices(nArray);
        this.getSelectionModel().setLeadSelectionIndex(n10);
    }

    public int J() {
        return this.getModel().getSize();
    }

    public Object D(int n10) {
        return this.getModel().getElementAt(n10);
    }

    public void R(ListDataListener listDataListener) {
        this.getModel().addListDataListener(listDataListener);
    }

    public void g(ListDataListener listDataListener) {
        this.getModel().removeListDataListener(listDataListener);
    }

    public void k(int n10) {
        Rectangle rectangle;
        if (n10 != -1 && (rectangle = this.getCellBounds(n10, n10)) != null) {
            this.scrollRectToVisible(rectangle);
        }
    }

    public boolean e() {
        return this.B().e();
    }

    public void e(boolean bl) {
        this.B().C(bl);
    }

    public boolean q() {
        return this.B().u();
    }

    public void L(boolean bl) {
        this.B().q(bl);
    }

    public int R() {
        return this.B().j();
    }

    public void L(int n10) {
        this.B().l(n10);
    }

    public int D() {
        return this.B().y();
    }

    public void a(int n10) {
        this.B().o(n10);
    }

    public boolean L() {
        return this.B().L();
    }

    public void Z(boolean bl) {
        this.B().l(bl);
    }

    public Color s() {
        return this.B().f();
    }

    public void B(Color color) {
        this.B().h(color);
    }

    public Color A() {
        return this.B().w();
    }

    public void j(Color color) {
        this.B().E(color);
    }

    public boolean J() {
        return this.B().M();
    }

    public void s(boolean bl) {
        this.B().t(bl);
    }

    public yc_0 B() {
        return (yc_0)this.getUI();
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
                        var1_1 = CI.c();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw CI.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw CI.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof yc_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw CI.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((yc_0)kp_0.w(a9.v, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new yc_0());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw CI.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    public void O(Object object) {
        block7: {
            int n10;
            String[] stringArray;
            ListModel listModel;
            block5: {
                int n11;
                block6: {
                    listModel = this.getModel();
                    stringArray = CI.c();
                    n11 = listModel instanceof ed_1;
                    if (stringArray != null) break block5;
                    if (n11 == 0) break block6;
                    this.T(((ed_1)listModel).J(object));
                    if (stringArray == null) break block7;
                }
                n11 = n10 = 0;
            }
            while (n10 < listModel.getSize()) {
                if (listModel.getElementAt(n10) == object) {
                    this.T(n10);
                    if (stringArray == null) break;
                }
                ++n10;
                if (stringArray == null) continue;
            }
        }
    }

    public void T(int n10) {
        this.s(n10, n10);
    }

    public void s(int n10, int n11) {
        Rectangle rectangle = this.getCellBounds(n10, n11);
        if (rectangle != null) {
            this.repaint(rectangle);
        }
    }

    public int K() {
        return this.x;
    }

    public void c(os_2 os_22) {
        this.U.add(os_22);
    }

    public void r(os_2 os_22) {
        this.U.remove(os_22);
    }

    public void D(int n10) {
        this.x = n10;
        Iterator iterator = aL.J((Collection)this.U).iterator();
        String[] stringArray = CI.c();
        while (iterator.hasNext()) {
            os_2 os_22 = (os_2)iterator.next();
            os_22.r(n10);
            if (stringArray == null) continue;
        }
    }

    public void h(int n10, Object object, Object object2) {
        this.x = -1;
        Iterator iterator = aL.J((Collection)this.U).iterator();
        String[] stringArray = CI.c();
        while (iterator.hasNext()) {
            os_2 os_22 = (os_2)iterator.next();
            os_22.u(n10, object, object2);
            if (stringArray == null) continue;
        }
    }

    public void M(int n10) {
        this.x = -1;
        String[] stringArray = CI.c();
        for (os_2 os_22 : aL.J((Collection)this.U)) {
            os_22.V(n10);
            if (stringArray == null) continue;
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

    public CI G() {
        return (CI)FN.A(this);
    }

    public CI Q(boolean bl) {
        return (CI)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public CI w() {
        return (CI)FN.u(this);
    }

    public CI q(boolean bl) {
        return (CI)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public CI A() {
        return (CI)FN.C(this);
    }

    public CI R(boolean bl) {
        return (CI)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public CI y(boolean bl, boolean bl2) {
        return (CI)FN.K(this, bl, bl2);
    }

    public CI j(int n10) {
        return (CI)FN.p((Component)this, n10);
    }

    public CI z(int n10) {
        return (CI)FN.O((Component)this, n10);
    }

    public CI h(int n10) {
        return (CI)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public CI J(int n10, boolean bl, boolean bl2) {
        return (CI)FN.d(this, n10, bl, bl2);
    }

    public CI v(int n10, int n11) {
        return (CI)FN.m(this, n10, n11);
    }

    public CI z(String string) {
        return (CI)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public CI s(int n10) {
        return (CI)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    @Override
    public CI D(int n10) {
        return (CI)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public CI f(int n10) {
        return (CI)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public CI t(int n10) {
        return (CI)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    @Override
    public CI G(int n10) {
        return (CI)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public CI o(int n10) {
        return (CI)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public CI X(int n10, int n11) {
        return (CI)PY.O(this, n10, n11);
    }

    @Override
    public Component N(String string) {
        return this.z(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.v(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.J(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.h(n10);
    }

    @Override
    public Component o(int n10) {
        return this.z(n10);
    }

    @Override
    public Component i(int n10) {
        return this.j(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.y(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.R(bl);
    }

    @Override
    public Component Q() {
        return this.A();
    }

    @Override
    public Component u(boolean bl) {
        return this.q(bl);
    }

    @Override
    public Component R() {
        return this.w();
    }

    @Override
    public Component c(boolean bl) {
        return this.Q(bl);
    }

    @Override
    public Component a() {
        return this.G();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.X(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.o(n10);
    }

    @Override
    public Component p(int n10) {
        return this.G(n10);
    }

    @Override
    public Component D(int n10) {
        return this.t(n10);
    }

    @Override
    public Component V(int n10) {
        return this.f(n10);
    }

    @Override
    public Component x(int n10) {
        return this.D(n10);
    }

    @Override
    public Component O(int n10) {
        return this.s(n10);
    }

    public static void p(String[] stringArray) {
        B = stringArray;
    }

    public static String[] c() {
        return B;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (CI.c() != null) {
            CI.p(new String[4]);
        }
    }
}

