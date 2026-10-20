/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S5;
import com.SK;
import com.T8;
import com.aL;
import com.cb_1;
import com.ig_2;
import com.m.V;
import com.m.s;
import com.nx_1;
import com.o2_0;
import com.od_0;
import com.of_0;
import com.on_0;
import com.r7_0;
import com.rg_1;
import com.rp_2;
import com.rq_1;
import com.sb_0;
import com.th_0;
import com.zn_0;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.us
 */
public class us_0
extends s
implements ig_2 {
    protected static final Object F = new Object();
    protected final Object c = new Object();
    protected List X = new ArrayList(1);
    protected final Object x = new Object();
    protected boolean S = true;
    protected Comparator M;
    protected on_0 u;
    protected T8 Q;

    public us_0() {
        this.N(new rg_1());
        this.q(true);
        this.setCellRenderer(new of_0());
        this.setCellEditor(new rq_1());
    }

    public us_0(r7_0 r7_02) {
        this.N(r7_02);
        this.setCellRenderer(new od_0());
        this.setCellEditor(new V());
    }

    public us_0(zn_0 zn_02) {
        super(zn_02);
        this.setModel(zn_02);
        this.setCellRenderer(new od_0());
        this.setCellEditor(new V());
    }

    public boolean w() {
        return this.S;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void q(boolean bl) {
        String[] stringArray = cb_1.C();
        Object object = this.x;
        if (stringArray != null) {
            object = object != null ? this.x : F;
        }
        Object object2 = object;
        synchronized (object) {
            this.S = bl;
            Object object3 = this;
            if (stringArray != null) {
                if (((us_0)object3).H()) {
                    this.D().g(bl);
                }
                object3 = object2;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    public r7_0 W() {
        return this.D().t();
    }

    public void N(r7_0 r7_02) {
        if (r7_02 != null) {
            this.setModel(new zn_0(this, r7_02));
        }
    }

    public Comparator D() {
        return this.M;
    }

    public void T(Comparator comparator) {
        block3: {
            r7_0 r7_02;
            block2: {
                this.M = comparator;
                r7_0 r7_03 = this.W();
                String[] stringArray = cb_1.C();
                r7_02 = r7_03;
                if (stringArray == null) break block2;
                if (!(r7_02 instanceof rp_2)) break block3;
                r7_02 = r7_03;
            }
            ((rp_2)r7_02).L(comparator);
            this.R();
        }
    }

    public void g() {
        this.T((Comparator)null);
    }

    public on_0 a() {
        return this.u;
    }

    public void S(on_0 on_02) {
        block3: {
            r7_0 r7_02;
            block2: {
                this.u = on_02;
                r7_0 r7_03 = this.W();
                String[] stringArray = cb_1.C();
                r7_02 = r7_03;
                if (stringArray == null) break block2;
                if (!(r7_02 instanceof rp_2)) break block3;
                r7_02 = r7_03;
            }
            ((rp_2)r7_02).P(on_02);
            this.R();
        }
    }

    public void h() {
        this.S(null);
    }

    public void R() {
        this.D().E();
    }

    public void O(cb_1 cb_12) {
        this.D().c(cb_12);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void setModel(TreeModel treeModel) {
        block9: {
            Object object;
            String[] stringArray;
            block8: {
                boolean bl;
                block7: {
                    stringArray = cb_1.C();
                    bl = this.getModel() instanceof zn_0;
                    if (stringArray == null) break block7;
                    if (bl) {
                        this.D().B(this);
                    }
                    object = treeModel;
                    if (stringArray == null) break block8;
                    bl = object instanceof zn_0;
                }
                if (!bl) break block9;
                object = this.x;
            }
            if (stringArray != null) {
                object = object != null ? this.x : F;
            }
            Object object2 = object;
            // MONITORENTER : object
            zn_0 zn_02 = (zn_0)treeModel;
            zn_02.g(this.S);
            zn_02.h(this);
            // MONITOREXIT : object2
        }
        super.setModel(treeModel);
    }

    @Override
    public void setCellEditor(TreeCellEditor treeCellEditor) {
        block6: {
            TreeCellEditor treeCellEditor2;
            block5: {
                String[] stringArray = cb_1.C();
                treeCellEditor2 = this.cellEditor;
                if (stringArray != null) {
                    if (treeCellEditor2 != null) {
                        this.cellEditor.removeCellEditorListener(this.Q);
                    }
                    super.setCellEditor(treeCellEditor);
                    treeCellEditor2 = treeCellEditor;
                }
                if (stringArray == null) break block5;
                if (treeCellEditor2 == null) break block6;
                this.Q = new th_0(this, treeCellEditor);
                treeCellEditor2 = treeCellEditor;
            }
            treeCellEditor2.addCellEditorListener(this.Q);
        }
    }

    public zn_0 D() {
        return (zn_0)this.getModel();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean H() {
        TreeModel treeModel = this.getModel();
        String[] stringArray = cb_1.C();
        TreeModel treeModel2 = treeModel;
        if (stringArray != null) {
            if (treeModel2 == null) return false;
            treeModel2 = treeModel;
        }
        boolean bl = treeModel2 instanceof zn_0;
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public void e(int n10) {
        o2_0.y(this, n10);
    }

    public void N(cb_1 cb_12, List list) {
        this.D().h(cb_12, list);
    }

    public void m(cb_1 cb_12, cb_1 cb_13) {
        this.D().Y(cb_12, Arrays.asList(cb_13));
    }

    public void z(cb_1 cb_12, List list) {
        this.D().Y(cb_12, list);
    }

    public void r(List list, cb_1 cb_12, int n10) {
        this.D().u(list, cb_12, n10);
    }

    public void y(cb_1[] cb_1Array, cb_1 cb_12, int n10) {
        this.D().K(cb_1Array, cb_12, n10);
    }

    public boolean O(String string) {
        return this.c(this.A(string));
    }

    /*
     * Unable to fully structure code
     */
    public boolean c(cb_1 var1_1) {
        block4: {
            var2_2 = cb_1.C();
            v0 = var1_1;
            if (var2_2 == null) break block4;
            if (v0 == null) ** GOTO lbl-1000
            v0 = var1_1.C();
        }
        if (v0 != null) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        v2 = var3_3 = v1;
        if (var2_2 != null) {
            if (v2) {
                this.D().removeNodeFromParent(var1_1);
            }
            v2 = var3_3;
        }
        return v2;
    }

    public void s(List list) {
        this.D().a(list);
    }

    public void L(cb_1[] cb_1Array) {
        this.D().l(cb_1Array);
    }

    public boolean j(cb_1 cb_12) {
        return this.D().L(cb_12);
    }

    public cb_1 A(String string) {
        return this.D().c(string);
    }

    public void a(String string) {
        this.Q(this.A(string));
    }

    public void Q(cb_1 cb_12) {
        this.D().B(cb_12);
    }

    public void Z(String string) {
        this.k(this.A(string));
    }

    public void k(cb_1 cb_12) {
        this.D().L((DefaultMutableTreeNode)cb_12);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        String[] stringArray = cb_1.C();
        Object object = this.x;
        if (stringArray != null) {
            object = object != null ? this.x : F;
        }
        Object object2 = object;
        synchronized (object) {
            boolean bl = this.w();
            this.q(false);
            this.u();
            this.q(bl);
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return;
        }
    }

    public void u() {
        block7: {
            TreePath[] treePathArray;
            String[] stringArray;
            block6: {
                TreePath[] treePathArray2 = this.getSelectionPaths();
                stringArray = cb_1.C();
                treePathArray = treePathArray2;
                if (stringArray == null) break block6;
                if (treePathArray == null) break block7;
                treePathArray = treePathArray2;
            }
            TreePath[] treePathArray3 = treePathArray;
            int n10 = treePathArray3.length;
            int n11 = 0;
            while (n11 < n10) {
                TreePath treePath = treePathArray3[n11];
                cb_1 cb_12 = (cb_1)this.b(treePath);
                if (stringArray != null) {
                    if (cb_12 != null && !cb_12.d()) {
                        this.r(cb_12, treePath, false);
                    }
                    ++n11;
                }
                if (stringArray != null) continue;
            }
        }
    }

    public cb_1 M(Point point) {
        return this.P(point.x, point.y);
    }

    public cb_1 P(int n10, int n11) {
        return this.a(this.getPathForLocation(n10, n11));
    }

    public cb_1 h(String string) {
        return this.w(this.A(string));
    }

    public cb_1 w(cb_1 cb_12) {
        return this.S(cb_12, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public cb_1 S(cb_1 cb_12, boolean bl) {
        String[] stringArray = cb_1.C();
        Object object = this.x;
        if (stringArray != null) {
            object = object != null ? this.x : F;
        }
        Object object2 = object;
        synchronized (object) {
            boolean bl2 = this.w();
            this.q(false);
            this.B(cb_12, bl);
            this.q(bl2);
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return cb_12;
        }
    }

    public cb_1 T() {
        return this.K((cb_1)this.M());
    }

    public cb_1 g(String string) {
        return this.K(this.A(string));
    }

    public cb_1 K(cb_1 cb_12) {
        return this.B(cb_12, false);
    }

    public cb_1 B(cb_1 cb_12, boolean bl) {
        block3: {
            cb_1 cb_13;
            block4: {
                String[] stringArray;
                block2: {
                    stringArray = cb_1.C();
                    cb_13 = cb_12;
                    if (stringArray == null) break block2;
                    if (cb_13 == null) break block3;
                    cb_13 = cb_12;
                }
                if (stringArray == null) break block4;
                if (cb_13.d()) break block3;
                this.r(cb_12, this.N(cb_12), bl);
                cb_13 = cb_12;
            }
            return cb_13;
        }
        return null;
    }

    public cb_1 r(TreePath treePath) {
        return this.M(treePath, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public cb_1 M(TreePath treePath, boolean bl) {
        String[] stringArray = cb_1.C();
        Object object = this.x;
        if (stringArray != null) {
            object = object != null ? this.x : F;
        }
        Object object2 = object;
        synchronized (object) {
            boolean bl2 = this.w();
            this.q(false);
            cb_1 cb_12 = this.l(treePath, bl);
            this.q(bl2);
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return cb_12;
        }
    }

    public cb_1 a(TreePath treePath) {
        return this.l(treePath, false);
    }

    public cb_1 l(TreePath treePath, boolean bl) {
        block2: {
            cb_1 cb_12;
            block4: {
                cb_1 cb_13;
                String[] stringArray;
                block3: {
                    stringArray = cb_1.C();
                    if (treePath == null) break block2;
                    cb_12 = cb_13 = (cb_1)this.b(treePath);
                    if (stringArray == null) break block3;
                    if (cb_12 == null) break block2;
                    cb_12 = cb_13;
                }
                if (stringArray == null) break block4;
                if (cb_12.d()) break block2;
                this.r(cb_13, treePath, bl);
                cb_12 = cb_13;
            }
            return cb_12;
        }
        return null;
    }

    protected void r(cb_1 cb_12, TreePath treePath, boolean bl) {
        block13: {
            cb_1 cb_13;
            block12: {
                String[] stringArray;
                block11: {
                    TreePath treePath2;
                    us_0 us_02;
                    block10: {
                        boolean bl2;
                        block8: {
                            block9: {
                                stringArray = cb_1.C();
                                bl2 = bl;
                                if (stringArray == null) break block8;
                                if (!bl2) break block9;
                                bl2 = this.isPathSelected(treePath);
                                if (stringArray == null) break block8;
                                if (!bl2) {
                                    this.setSelectionPath(treePath);
                                }
                            }
                            us_02 = this;
                            treePath2 = treePath;
                            if (stringArray == null) break block10;
                            bl2 = us_02.isExpanded(treePath2);
                        }
                        if (bl2) break block11;
                        us_02 = this;
                        treePath2 = treePath;
                    }
                    us_02.expandPath(treePath2);
                }
                cb_13 = cb_12;
                if (stringArray == null) break block12;
                if (cb_13 == null) break block13;
                cb_13 = cb_12;
            }
            if (!cb_13.d()) {
                this.D().reload(cb_12);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List w() {
        Object object = this.c;
        synchronized (object) {
            return aL.J((Collection)this.X);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d(nx_1 nx_12) {
        Object object = this.c;
        synchronized (object) {
            this.X.add(nx_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void C(nx_1 nx_12) {
        Object object = this.c;
        synchronized (object) {
            this.X.remove(nx_12);
        }
    }

    @Override
    public void C(cb_1 cb_12) {
        this.P(cb_12);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void P(cb_1 cb_12) {
        ArrayList arrayList;
        String[] stringArray;
        Iterator iterator = this.c;
        synchronized (iterator) {
            stringArray = cb_1.C();
            arrayList = aL.J((Collection)this.X);
        }
        for (nx_1 nx_12 : arrayList) {
            nx_12.o(cb_12);
            if (stringArray != null) continue;
        }
    }

    @Override
    public void r(cb_1 cb_12, List list) {
        this.b(cb_12, list);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void b(cb_1 cb_12, List list) {
        ArrayList arrayList;
        String[] stringArray;
        Iterator iterator = this.c;
        synchronized (iterator) {
            stringArray = cb_1.C();
            arrayList = aL.J((Collection)this.X);
        }
        for (nx_1 nx_12 : arrayList) {
            nx_12.y(cb_12, list);
            if (stringArray != null) continue;
        }
    }

    @Override
    public void N(cb_1 cb_12, Throwable throwable) {
        this.V(cb_12, throwable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void V(cb_1 cb_12, Throwable throwable) {
        ArrayList arrayList;
        String[] stringArray;
        Iterator iterator = this.c;
        synchronized (iterator) {
            stringArray = cb_1.C();
            arrayList = aL.J((Collection)this.X);
        }
        for (nx_1 nx_12 : arrayList) {
            nx_12.X(cb_12, throwable);
            if (stringArray != null) continue;
        }
    }

    public void F(String string) {
        this.P((DefaultMutableTreeNode)this.A(string));
    }

    public void Y(List list) {
        this.L(list, true, true, null);
    }

    public void S(List list, S5 s5) {
        this.L(list, true, true, s5);
    }

    public void W(List list, boolean bl) {
        this.L(list, bl, true, null);
    }

    public void w(List list, boolean bl, S5 s5) {
        this.L(list, bl, true, s5);
    }

    public void f(List list, boolean bl, boolean bl2) {
        this.L(list, bl, bl2, null);
    }

    public void L(List list, boolean bl, boolean bl2, S5 s5) {
        block11: {
            S5 s52;
            block13: {
                ArrayList arrayList = aL.J((Collection)list);
                int n10 = 0;
                String[] stringArray = cb_1.C();
                while (n10 < arrayList.size()) {
                    cb_1 cb_12 = this.A((String)arrayList.get(n10));
                    if (stringArray == null) break block11;
                    if (stringArray != null) {
                        if (cb_12 != null) {
                            block12: {
                                for (int i2 = 0; i2 <= n10; ++i2) {
                                    arrayList.remove(i2);
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                    }
                                    break block12;
                                }
                                if (arrayList.size() > 0) {
                                    this.k(cb_12, arrayList, bl, bl2, s5);
                                }
                            }
                            return;
                        }
                        ++n10;
                    }
                    if (stringArray != null) continue;
                }
                s52 = s5;
                if (stringArray == null) break block13;
                if (s52 == null) break block11;
                s52 = s5;
            }
            s52.f();
        }
    }

    protected void k(cb_1 cb_12, List list, boolean bl, boolean bl2, S5 s5) {
        block15: {
            S5 s52;
            block16: {
                String[] stringArray;
                block8: {
                    block9: {
                        block10: {
                            block13: {
                                S5 s53;
                                block14: {
                                    block11: {
                                        block12: {
                                            stringArray = cb_1.C();
                                            if (stringArray == null) break block8;
                                            if (list.size() <= 0) break block9;
                                            if (!cb_12.g()) break block10;
                                            us_0 us_02 = this;
                                            cb_1 cb_13 = cb_12;
                                            if (stringArray != null) {
                                                us_02.P((DefaultMutableTreeNode)cb_13);
                                                if (s5 != null) {
                                                    s5.T(cb_12);
                                                }
                                                us_02 = this;
                                                cb_13 = list.get(0);
                                            }
                                            cb_1 cb_14 = us_02.A((String)((Object)cb_13));
                                            list.remove(0);
                                            if (stringArray == null) break block11;
                                            if (cb_14 == null) break block12;
                                            this.k(cb_14, list, bl, bl2, s5);
                                            if (stringArray != null) break block13;
                                        }
                                        this.r(cb_12, bl, bl2);
                                    }
                                    s53 = s5;
                                    if (stringArray == null) break block14;
                                    if (s53 == null) break block13;
                                    s53 = s5;
                                }
                                s53.K(cb_12);
                            }
                            if (stringArray != null) break block15;
                        }
                        this.d(new sb_0(this, cb_12, s5, list, bl, bl2));
                        this.P((DefaultMutableTreeNode)cb_12);
                        if (stringArray != null) break block15;
                    }
                    this.r(cb_12, bl, bl2);
                }
                s52 = s5;
                if (stringArray == null) break block16;
                if (s52 == null) break block15;
                s52 = s5;
            }
            s52.t(cb_12);
        }
    }

    protected void r(cb_1 cb_12, boolean bl, boolean bl2) {
        String[] stringArray = cb_1.C();
        boolean bl3 = bl2;
        if (stringArray != null) {
            if (bl3) {
                this.s(cb_12);
            }
            bl3 = bl;
        }
        if (bl3) {
            this.P((DefaultMutableTreeNode)cb_12);
        }
    }

    @Override
    public final void H() {
        block8: {
            us_0 us_02;
            block9: {
                block10: {
                    String[] stringArray = cb_1.C();
                    us_02 = this;
                    if (stringArray == null) break block9;
                    if (!us_02.w()) break block10;
                    int n10 = this.getRowCount() - 1;
                    while (n10 >= 0) {
                        TreePath treePath = this.getPathForRow(n10);
                        if (stringArray != null) {
                            if (stringArray != null) {
                                if (!this.getModel().isLeaf(this.b(treePath))) {
                                    this.z(treePath);
                                }
                                --n10;
                            }
                            if (stringArray != null) continue;
                        }
                        break block8;
                    }
                    if (stringArray != null) break block8;
                }
                us_02 = this;
            }
            super.H();
        }
    }

    protected void z(TreePath treePath) {
        block4: {
            TreePath treePath2;
            us_0 us_02;
            block2: {
                block3: {
                    String[] stringArray = cb_1.C();
                    us_02 = this;
                    treePath2 = treePath;
                    if (stringArray == null) break block2;
                    if (!us_02.hasBeenExpanded(treePath2)) break block3;
                    this.t(treePath);
                    if (stringArray != null) break block4;
                }
                us_02 = this;
                treePath2 = treePath;
            }
            us_02.b(treePath2);
        }
    }

    protected void t(TreePath treePath) {
        String[] stringArray = cb_1.C();
        this.expandPath(treePath);
        String[] stringArray2 = stringArray;
        cb_1 cb_12 = (cb_1)this.b(treePath);
        for (int i2 = 0; i2 < cb_12.getChildCount(); ++i2) {
            this.z(this.N(cb_12.T(i2)));
            if (stringArray2 != null) continue;
        }
    }

    protected void b(TreePath treePath) {
        this.d(new SK(this, treePath));
        this.expandPath(treePath);
    }
}

