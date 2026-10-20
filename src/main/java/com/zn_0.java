/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DY;
import com.FN;
import com.aL;
import com.cb_1;
import com.eo_2;
import com.ig_2;
import com.m.L;
import com.m.p_0;
import com.nm_0;
import com.o2_0;
import com.on_0;
import com.op_1;
import com.r7_0;
import com.rt_1;
import com.um_0;
import com.us_0;
import com.ux_0;
import com.wm_0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.zn
 */
public class zn_0
extends L {
    protected final Object E = new Object();
    protected final List O = new ArrayList(1);
    protected us_0 q;
    protected boolean x = true;
    protected r7_0 c;
    protected cb_1 B = null;
    protected final Object f = new Object();
    protected final Map g = new HashMap();
    protected final Map i = new HashMap();
    protected final eo_2 L = new eo_2();
    protected final Object K = new Object();

    public zn_0(us_0 us_02, r7_0 r7_02) {
        super(null);
        this.q = us_02;
        this.c = r7_02;
    }

    public boolean z() {
        return this.x;
    }

    public void g(boolean bl) {
        this.x = bl;
    }

    public r7_0 t() {
        return this.c;
    }

    public cb_1 F() {
        String[] stringArray = cb_1.C();
        cb_1 cb_12 = this.B;
        if (stringArray != null) {
            if (cb_12 == null) {
                this.B = this.c.z();
                this.j(this.B);
                this.a(this.B);
            }
            cb_12 = this.B;
        }
        return cb_12;
    }

    @Override
    public boolean isLeaf(Object object) {
        return this.c.y((cb_1)object);
    }

    @Override
    public int getChildCount(Object object) {
        cb_1 cb_12 = (cb_1)object;
        String[] stringArray = cb_1.C();
        int n10 = this.isLeaf(cb_12);
        if (stringArray != null) {
            if (n10 != 0) {
                return 0;
            }
            n10 = this.L(cb_12) ? 1 : 0;
        }
        if (stringArray != null) {
            if (n10 != 0) {
                return super.getChildCount(object);
            }
            n10 = this.s(cb_12);
        }
        return n10;
    }

    public cb_1 f(Object object, int n10) {
        block3: {
            Object object2;
            zn_0 zn_02;
            block2: {
                cb_1 cb_12 = (cb_1)object;
                String[] stringArray = cb_1.C();
                zn_02 = this;
                object2 = cb_12;
                if (stringArray == null) break block2;
                if (!zn_02.L((cb_1)object2)) break block3;
                zn_02 = this;
                object2 = object;
            }
            return (cb_1)super.getChild(object2, n10);
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean L(cb_1 cb_12) {
        Object object = this.f;
        synchronized (object) {
            Boolean bl;
            String[] stringArray = cb_1.C();
            Boolean bl2 = bl = (Boolean)this.g.get(cb_12.H());
            if (stringArray != null) {
                if (bl2 == null) return false;
                bl2 = bl;
            }
            boolean bl3 = bl2;
            if (stringArray == null) return bl3;
            if (!bl3) return false;
            return true;
        }
    }

    @Override
    public void reload(TreeNode treeNode) {
        this.q.cancelEditing();
        this.I((cb_1)treeNode, false);
        super.reload(treeNode);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void I(cb_1 cb_12, boolean bl) {
        Object object = this.f;
        synchronized (object) {
            String[] stringArray = cb_1.C();
            if (stringArray != null) {
                if (bl) {
                    this.L.remove(cb_12.H());
                }
                this.g.remove(cb_12.H());
            }
            List list = (List)this.i.remove(cb_12.H());
            Object object2 = list;
            if (stringArray == null) return;
            if (object2 != null) {
                for (cb_1 cb_13 : list) {
                    this.I(cb_13, true);
                    if (stringArray == null) return;
                    if (stringArray != null) continue;
                }
            }
            object2 = object;
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void N(List list, boolean bl) {
        Object object = this.f;
        synchronized (object) {
            String[] stringArray = cb_1.C();
            for (cb_1 cb_12 : list) {
                this.I(cb_12, bl);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void b(cb_1[] cb_1Array, boolean bl) {
        Object object = this.f;
        synchronized (object) {
            String[] stringArray = cb_1.C();
            for (cb_1 cb_12 : cb_1Array) {
                this.I(cb_12, bl);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void j(cb_1 cb_12) {
        Object object = this.f;
        synchronized (object) {
            this.L.put(cb_12.H(), cb_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void g(List list) {
        Object object = this.f;
        synchronized (object) {
            String[] stringArray = cb_1.C();
            for (cb_1 cb_12 : list) {
                this.L.put(cb_12.H(), cb_12);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected int s(cb_1 cb_12) {
        Object object = this.K;
        synchronized (object) {
            int n10;
            String[] stringArray = cb_1.C();
            Object object2 = cb_12;
            if (stringArray != null) {
                if (((cb_1)object2).d()) {
                    return 0;
                }
                cb_12.Y(ux_0.loading);
                this.nodeChanged(cb_12);
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            this.r(cb_12);
            int n11 = n10 = cb_12.getChildCount();
            if (stringArray != null) {
                block11: {
                    if (n11 > 0) {
                        int[] nArray = new int[n10];
                        Object[] objectArray = new Object[n10];
                        for (int i2 = n10 - 1; i2 >= 0; --i2) {
                            nArray[i2] = i2;
                            objectArray[i2] = cb_12.T(i2);
                            cb_12.remove(i2);
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                            }
                            break block11;
                        }
                        this.nodesWereRemoved(cb_12, nArray, objectArray);
                    }
                }
                n11 = this.x ? 1 : 0;
            }
            if (stringArray != null) {
                if (n11 != 0) {
                    o2_0.P(this.q, new um_0(this, cb_12));
                    return 0;
                }
                this.c.w(cb_12, new nm_0(this, cb_12));
                n11 = cb_12.getChildCount();
            }
            return n11;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void h(cb_1 cb_12, List list) {
        Object object = this.K;
        // MONITORENTER : object
        String[] stringArray = cb_1.C();
        Object object2 = cb_12;
        if (stringArray != null) {
            if (((cb_1)object2).d()) {
                // MONITOREXIT : object
                return;
            }
            cb_12.Y(ux_0.loading);
            this.nodeChanged(cb_12);
            object2 = object;
        }
        // MONITOREXIT : object2
        object = this.f;
        // MONITORENTER : object
        this.i.put(cb_12.H(), list);
        this.g(list);
        // MONITOREXIT : object
        object = this.Y(cb_12, list);
        Object object3 = this.f;
        // MONITORENTER : object3
        this.g.put(cb_12.H(), true);
        // MONITOREXIT : object3
        FN.p(new DY(this, (List)object, list, cb_12));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Y(cb_1 cb_12, List list) {
        String[] stringArray = cb_1.C();
        Object object = cb_12;
        if (stringArray != null) {
            if (!((cb_1)object).g()) {
                return;
            }
            object = this.f;
        }
        cb_1 cb_13 = object;
        synchronized (object) {
            ArrayList arrayList;
            Cloneable cloneable = arrayList = (ArrayList)this.i.get(cb_12.H());
            if (stringArray != null) {
                if (cloneable == null) {
                    arrayList = new ArrayList(list.size());
                    this.i.put(cb_12.H(), arrayList);
                }
                arrayList.addAll(list);
                this.g(list);
                cloneable = cb_13;
            }
            // ** MonitorExit[v1 /* !! */ ] (shouldn't be in output)
            this.N(list, false);
            this.o(list, cb_12, cb_12.getChildCount());
            this.c(cb_12);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void removeNodeFromParent(MutableTreeNode mutableTreeNode) {
        Object object;
        cb_1 cb_12;
        cb_1 cb_13;
        String[] stringArray;
        block12: {
            block13: {
                block11: {
                    block10: {
                        stringArray = cb_1.C();
                        MutableTreeNode mutableTreeNode2 = mutableTreeNode;
                        if (stringArray != null) {
                            if (mutableTreeNode2 == null) {
                                return;
                            }
                            mutableTreeNode2 = mutableTreeNode;
                        }
                        cb_13 = (cb_1)mutableTreeNode2;
                        cb_12 = cb_13.C();
                        object = cb_12;
                        if (stringArray == null) break block10;
                        if (object == null) break block11;
                        object = cb_12;
                    }
                    if (stringArray == null) break block12;
                    if (((cb_1)object).g()) break block13;
                }
                return;
            }
            object = this.f;
        }
        cb_1 cb_14 = object;
        synchronized (object) {
            List list = (List)this.i.get(cb_12.H());
            Object object2 = list;
            if (stringArray != null) {
                if (object2 != null) {
                    list.remove(cb_13);
                }
                object2 = cb_14;
            }
            // ** MonitorExit[v2] (shouldn't be in output)
            this.I(cb_13, true);
            super.removeNodeFromParent(mutableTreeNode);
            this.c(cb_12);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void insertNodeInto(MutableTreeNode mutableTreeNode, MutableTreeNode mutableTreeNode2, int n10) {
        cb_1 cb_12 = (cb_1)mutableTreeNode;
        String[] stringArray = cb_1.C();
        cb_1 cb_13 = (cb_1)mutableTreeNode2;
        Object object = cb_13;
        if (stringArray != null) {
            if (!((cb_1)object).g()) {
                return;
            }
            object = this.f;
        }
        cb_1 cb_14 = object;
        synchronized (object) {
            ArrayList<cb_1> arrayList;
            Cloneable cloneable = arrayList = (ArrayList<cb_1>)this.i.get(cb_13.H());
            if (stringArray != null) {
                if (cloneable == null) {
                    arrayList = new ArrayList<cb_1>(1);
                    this.i.put(cb_13.H(), arrayList);
                }
                arrayList.add(cb_12);
                cloneable = cb_14;
            }
            // ** MonitorExit[v1 /* !! */ ] (shouldn't be in output)
            this.I(cb_12, false);
            super.insertNodeInto(mutableTreeNode, mutableTreeNode2, n10);
            this.a(cb_12);
            this.c(cb_13);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void u(List list, cb_1 cb_12, int n10) {
        String[] stringArray = cb_1.C();
        Object object = cb_12;
        if (stringArray != null) {
            if (!((cb_1)object).g()) {
                return;
            }
            object = this.f;
        }
        cb_1 cb_13 = object;
        synchronized (object) {
            ArrayList arrayList;
            Cloneable cloneable = arrayList = (ArrayList)this.i.get(cb_12.H());
            if (stringArray != null) {
                if (cloneable == null) {
                    arrayList = new ArrayList(1);
                    this.i.put(cb_12.H(), arrayList);
                }
                arrayList.addAll(n10, list);
                cloneable = cb_13;
            }
            // ** MonitorExit[v1 /* !! */ ] (shouldn't be in output)
            this.N(list, false);
            this.o(list, cb_12, n10);
            this.c(cb_12);
            return;
        }
    }

    protected void o(List list, cb_1 cb_12, int n10) {
        super.F(list, cb_12, n10);
        this.Q(list);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void K(cb_1[] cb_1Array, cb_1 cb_12, int n10) {
        String[] stringArray = cb_1.C();
        Object object = cb_12;
        if (stringArray != null) {
            if (!((cb_1)object).g()) {
                return;
            }
            object = this.f;
        }
        cb_1 cb_13 = object;
        synchronized (object) {
            ArrayList<cb_1> arrayList = (ArrayList<cb_1>)this.i.get(cb_12.H());
            if (arrayList == null) {
                arrayList = new ArrayList<cb_1>(1);
                this.i.put(cb_12.H(), arrayList);
            }
            for (int i2 = cb_1Array.length - 1; i2 >= 0; --i2) {
                arrayList.add(n10, cb_1Array[i2]);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break;
            }
            // ** MonitorExit[var5_5] (shouldn't be in output)
            this.b(cb_1Array, false);
            super.d(cb_1Array, cb_12, n10);
            this.W(cb_1Array);
            this.c(cb_12);
            return;
        }
    }

    public void E() {
        this.F(this.F(), true);
    }

    public void c(cb_1 cb_12) {
        this.F(cb_12, false);
    }

    public void F(cb_1 cb_12, boolean bl) {
        block5: {
            boolean bl2;
            block6: {
                block7: {
                    cb_1 cb_13;
                    String[] stringArray;
                    block4: {
                        stringArray = cb_1.C();
                        cb_13 = cb_12;
                        if (stringArray == null) break block4;
                        if (cb_13 == null) break block5;
                        cb_13 = cb_12;
                    }
                    bl2 = cb_13.g();
                    if (stringArray == null) break block6;
                    if (!bl2) break block7;
                    bl2 = this.i.containsKey(cb_12.H());
                    if (stringArray == null) break block6;
                    if (!bl2) break block7;
                    this.v(cb_12, bl);
                    if (stringArray != null) break block5;
                }
                bl2 = cb_12.d();
            }
            if (bl2) {
                this.h(new op_1(this, cb_12, bl));
            }
        }
    }

    protected void v(cb_1 cb_12, boolean bl) {
        p_0 p_02;
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    p_02 = this.q.B();
                    stringArray = cb_1.C();
                    if (stringArray == null) break block2;
                    if (!bl) break block3;
                    this.Z(cb_12);
                }
                if (stringArray != null) break block4;
            }
            this.e(cb_12);
        }
        this.nodeStructureChanged(cb_12);
        this.q.P(p_02);
    }

    protected void Z(cb_1 cb_12) {
        String[] stringArray = cb_1.C();
        this.e(cb_12);
        String[] stringArray2 = stringArray;
        for (int i2 = 0; i2 < cb_12.getChildCount(); ++i2) {
            this.Z(cb_12.T(i2));
            if (stringArray2 != null) continue;
        }
    }

    protected void e(cb_1 cb_12) {
        block4: {
            List list;
            String[] stringArray;
            block3: {
                List list2 = (List)this.i.get(cb_12.H());
                stringArray = cb_1.C();
                list = list2;
                if (stringArray == null) break block3;
                if (list == null) break block4;
                cb_12.removeAllChildren();
                list = this.Y(cb_12, list2);
            }
            List list3 = list;
            for (cb_1 cb_13 : list3) {
                cb_12.add(cb_13);
                if (stringArray != null) continue;
            }
        }
    }

    protected List Y(cb_1 cb_12, List list) {
        block8: {
            block7: {
                List list2;
                block6: {
                    String[] stringArray = cb_1.C();
                    list2 = list;
                    if (stringArray == null) break block6;
                    if (list2 == null) break block7;
                    list2 = list;
                }
                if (list2.size() != 0) break block8;
            }
            return new ArrayList(0);
        }
        on_0 on_02 = this.c.h(cb_12);
        Comparator comparator = this.c.H(cb_12);
        if (on_02 != null) {
            ArrayList arrayList = aL.E(list, on_02);
            if (comparator != null) {
                Collections.sort(arrayList, comparator);
            }
            return arrayList;
        }
        if (comparator != null) {
            list = aL.J((Collection)list);
            Collections.sort(list, comparator);
        }
        return list;
    }

    public cb_1 c(String string) {
        return (cb_1)this.L.get(string);
    }

    public eo_2 N() {
        return rt_1.T(this.L);
    }

    protected void Q(List list) {
        Iterator iterator = list.iterator();
        String[] stringArray = cb_1.C();
        while (iterator.hasNext()) {
            cb_1 cb_12 = (cb_1)iterator.next();
            this.a(cb_12);
            if (stringArray != null) continue;
        }
    }

    protected void W(cb_1[] cb_1Array) {
        cb_1[] cb_1Array2 = cb_1Array;
        String[] stringArray = cb_1.C();
        for (cb_1 cb_12 : cb_1Array2) {
            this.a(cb_12);
            if (stringArray != null) continue;
        }
    }

    protected void a(cb_1 cb_12) {
        block3: {
            ImageIcon imageIcon;
            block2: {
                ImageIcon imageIcon2 = cb_12.Y();
                String[] stringArray = cb_1.C();
                imageIcon = imageIcon2;
                if (stringArray == null) break block2;
                if (imageIcon == null) break block3;
                imageIcon = imageIcon2;
            }
            imageIcon.setImageObserver(new wm_0(this.q, cb_12));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List L() {
        Object object = this.E;
        synchronized (object) {
            return aL.J((Collection)this.O);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void h(ig_2 ig_22) {
        Object object = this.E;
        synchronized (object) {
            this.O.add(ig_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void B(ig_2 ig_22) {
        Object object = this.E;
        synchronized (object) {
            this.O.remove(ig_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void r(cb_1 cb_12) {
        ArrayList arrayList;
        String[] stringArray;
        Iterator iterator = this.E;
        synchronized (iterator) {
            stringArray = cb_1.C();
            arrayList = aL.J((Collection)this.O);
        }
        for (ig_2 ig_22 : arrayList) {
            ig_22.C(cb_12);
            if (stringArray != null) continue;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void s(cb_1 cb_12, List list) {
        ArrayList arrayList;
        String[] stringArray;
        Iterator iterator = this.E;
        synchronized (iterator) {
            stringArray = cb_1.C();
            arrayList = aL.J((Collection)this.O);
        }
        for (ig_2 ig_22 : arrayList) {
            ig_22.r(cb_12, list);
            if (stringArray != null) continue;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void r(cb_1 cb_12, Throwable throwable) {
        ArrayList arrayList;
        String[] stringArray;
        Iterator iterator = this.E;
        synchronized (iterator) {
            stringArray = cb_1.C();
            arrayList = aL.J((Collection)this.O);
        }
        for (ig_2 ig_22 : arrayList) {
            ig_22.N(cb_12, throwable);
            if (stringArray != null) continue;
        }
    }

    @Override
    public void d(DefaultMutableTreeNode[] defaultMutableTreeNodeArray, DefaultMutableTreeNode defaultMutableTreeNode, int n10) {
        this.K((cb_1[])defaultMutableTreeNodeArray, (cb_1)defaultMutableTreeNode, n10);
    }

    @Override
    public void F(List list, DefaultMutableTreeNode defaultMutableTreeNode, int n10) {
        this.u(list, (cb_1)defaultMutableTreeNode, n10);
    }

    @Override
    public Object getChild(Object object, int n10) {
        return this.f(object, n10);
    }

    @Override
    public Object getRoot() {
        return this.F();
    }
}

