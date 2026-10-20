/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D5;
import com.P6;
import com.Q6;
import com.SV;
import com.WA;
import com.aL;
import com.bt_0;
import com.cb_1;
import com.m.s;
import com.nb_0;
import com.oh_0;
import com.pt_0;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u3
extends s {
    protected Boolean r = bt_0.k;
    protected Integer j = bt_0.N;
    protected Boolean T = bt_0.O;
    protected Boolean E = bt_0.Y;
    protected Boolean Y = bt_0.E;
    protected SV M;
    protected P6 o;
    protected TreeCellRenderer B;
    protected oh_0 u;
    protected oh_0 d;
    protected WA G;
    protected List n = new ArrayList(1);

    public u3() {
    }

    public u3(Object[] objectArray) {
        super(objectArray);
    }

    public u3(Vector vector) {
        super(vector);
    }

    public u3(Hashtable hashtable) {
        super(hashtable);
    }

    public u3(DefaultMutableTreeNode defaultMutableTreeNode) {
        super(defaultMutableTreeNode);
    }

    public u3(DefaultMutableTreeNode defaultMutableTreeNode, boolean bl) {
        super(defaultMutableTreeNode, bl);
    }

    public u3(TreeModel treeModel) {
        super(treeModel);
    }

    @Override
    protected void B() {
        this.M = this.p(this);
        this.G = new WA(this);
        this.addMouseListener(this.G);
        this.addKeyListener(this.G);
    }

    public P6 d() {
        return this.o;
    }

    public TreeCellRenderer h() {
        return this.B;
    }

    @Override
    public void setCellRenderer(TreeCellRenderer treeCellRenderer) {
        this.B = treeCellRenderer;
        String[] stringArray = cb_1.C();
        u3 u32 = this;
        if (stringArray != null) {
            if (u32.o == null) {
                this.o = this.h();
                this.o.M(this.U());
            }
            u32 = this;
        }
        super.setCellRenderer(this.o);
    }

    public void T(P6 p6) {
        this.o = p6;
        this.o.M(this.U());
        super.setCellRenderer(this.o);
    }

    protected Q6 h() {
        return new Q6(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int U() {
        int n10;
        String[] stringArray = cb_1.C();
        Integer n11 = this.j;
        if (stringArray != null) {
            if (n11 == null) {
                n10 = bt_0.N;
                return n10;
            }
            n11 = this.j;
        }
        n10 = n11;
        return n10;
    }

    public void V(int n10) {
        this.j = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public pt_0 j(DefaultMutableTreeNode defaultMutableTreeNode) {
        pt_0 pt_02;
        String[] stringArray = cb_1.C();
        SV sV = this.M;
        if (stringArray != null) {
            if (sV == null) {
                pt_02 = pt_0.unchecked;
                return pt_02;
            }
            sV = this.M;
        }
        pt_02 = sV.P(defaultMutableTreeNode);
        return pt_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean z(DefaultMutableTreeNode defaultMutableTreeNode) {
        String[] stringArray = cb_1.C();
        SV sV = this.M;
        if (stringArray != null) {
            if (sV == null) return false;
            sV = this.M;
        }
        if (sV.P(defaultMutableTreeNode) != pt_0.unchecked) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean O(DefaultMutableTreeNode defaultMutableTreeNode) {
        String[] stringArray = cb_1.C();
        SV sV = this.M;
        if (stringArray != null) {
            if (sV == null) return false;
            sV = this.M;
        }
        if (sV.P(defaultMutableTreeNode) != pt_0.checked) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean A(DefaultMutableTreeNode defaultMutableTreeNode) {
        String[] stringArray = cb_1.C();
        SV sV = this.M;
        if (stringArray != null) {
            if (sV == null) return false;
            sV = this.M;
        }
        if (sV.P(defaultMutableTreeNode) != pt_0.mixed) return false;
        return true;
    }

    public List T() {
        return this.x(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public List x(boolean bl) {
        List list;
        String[] stringArray = cb_1.C();
        SV sV = this.M;
        if (stringArray != null) {
            if (sV == null) {
                list = new ArrayList(0);
                return list;
            }
            sV = this.M;
        }
        list = sV.p(bl);
        return list;
    }

    /*
     * Enabled aggressive block sorting
     */
    public List c() {
        List list;
        String[] stringArray = cb_1.C();
        SV sV = this.M;
        if (stringArray != null) {
            if (sV == null) {
                list = new ArrayList(0);
                return list;
            }
            sV = this.M;
        }
        list = sV.O();
        return list;
    }

    public void R(Collection collection, boolean bl) {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                sV = this.M;
                if (stringArray == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.g(collection, bl);
        }
    }

    public void P(DefaultMutableTreeNode defaultMutableTreeNode, boolean bl) {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                sV = this.M;
                if (stringArray == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.s(defaultMutableTreeNode, bl);
        }
    }

    public void E(DefaultMutableTreeNode defaultMutableTreeNode) {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                sV = this.M;
                if (stringArray == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.j(defaultMutableTreeNode);
        }
    }

    public void i(List list) {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                sV = this.M;
                if (stringArray == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.I(list);
        }
    }

    public void x() {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                sV = this.M;
                if (stringArray == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.c();
        }
    }

    public void n() {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                sV = this.M;
                if (stringArray == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.h();
        }
    }

    public SV I() {
        return this.M;
    }

    public void I(SV sV) {
        String[] stringArray;
        block3: {
            Iterator iterator = this.n.iterator();
            stringArray = cb_1.C();
            while (iterator.hasNext()) {
                nb_0 nb_02 = (nb_0)iterator.next();
                this.M.e(nb_02);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block3;
            }
            this.M = sV;
            this.M();
        }
        for (nb_0 nb_02 : this.n) {
            sV.J(nb_02);
            if (stringArray != null) continue;
        }
    }

    protected SV p(u3 u32) {
        return new D5(u32);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean N(DefaultMutableTreeNode defaultMutableTreeNode) {
        String[] stringArray = cb_1.C();
        oh_0 oh_02 = this.u;
        if (stringArray != null) {
            if (oh_02 == null) return true;
            oh_02 = this.u;
        }
        boolean bl = oh_02.q(defaultMutableTreeNode);
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public void I(oh_0 oh_02) {
        this.u = oh_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean R(DefaultMutableTreeNode defaultMutableTreeNode) {
        String[] stringArray = cb_1.C();
        oh_0 oh_02 = this.d;
        if (stringArray != null) {
            if (oh_02 == null) return true;
            oh_02 = this.d;
        }
        boolean bl = oh_02.q(defaultMutableTreeNode);
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public void c(oh_0 oh_02) {
        this.d = oh_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e() {
        String[] stringArray = cb_1.C();
        Boolean bl = this.r;
        if (stringArray != null) {
            if (bl == null) return true;
            bl = this.r;
        }
        boolean bl2 = bl;
        return bl2;
    }

    public void J(boolean bl) {
        block5: {
            SV sV;
            block6: {
                u3 u32;
                String[] stringArray;
                block4: {
                    stringArray = cb_1.C();
                    boolean bl2 = this.r;
                    if (stringArray != null) {
                        bl2 = bl2 != bl;
                    }
                    boolean bl3 = bl2;
                    u32 = this;
                    if (stringArray == null) break block4;
                    u32.r = bl;
                    if (!bl3) break block5;
                    u32 = this;
                }
                sV = u32.M;
                if (stringArray == null) break block6;
                if (sV == null) break block5;
                sV = this.M;
            }
            sV.y(this.r);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean A() {
        boolean bl;
        String[] stringArray = cb_1.C();
        Boolean bl2 = this.T;
        if (stringArray != null) {
            if (bl2 == null) {
                bl = bt_0.O;
                return bl;
            }
            bl2 = this.T;
        }
        bl = bl2;
        return bl;
    }

    public void I(boolean bl) {
        this.T = bl;
        this.M();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean v() {
        boolean bl;
        String[] stringArray = cb_1.C();
        Boolean bl2 = this.E;
        if (stringArray != null) {
            if (bl2 == null) {
                bl = bt_0.Y;
                return bl;
            }
            bl2 = this.E;
        }
        bl = bl2;
        return bl;
    }

    public void C(boolean bl) {
        this.E = bl;
        this.repaint();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean X() {
        boolean bl;
        String[] stringArray = cb_1.C();
        Boolean bl2 = this.Y;
        if (stringArray != null) {
            if (bl2 == null) {
                bl = bt_0.E;
                return bl;
            }
            bl2 = this.Y;
        }
        bl = bl2;
        return bl;
    }

    public void m(boolean bl) {
        this.Y = bl;
    }

    public Rectangle O(DefaultMutableTreeNode defaultMutableTreeNode) {
        return this.C(this.N(defaultMutableTreeNode));
    }

    public Rectangle C(TreePath treePath) {
        block3: {
            Rectangle rectangle;
            block6: {
                int n10;
                block4: {
                    block5: {
                        P6 p6;
                        String[] stringArray;
                        block2: {
                            stringArray = cb_1.C();
                            p6 = this.o;
                            if (stringArray == null) break block2;
                            if (p6 == null) break block3;
                            p6 = this.o;
                        }
                        n10 = p6.N();
                        rectangle = this.getPathBounds(treePath);
                        if (stringArray == null) break block4;
                        if (!this.getComponentOrientation().isLeftToRight()) break block5;
                        rectangle.width = n10;
                        if (stringArray != null) break block6;
                    }
                    rectangle.x += rectangle.width - n10;
                }
                rectangle.width = n10;
            }
            return rectangle;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        String[] stringArray = cb_1.C();
        boolean bl = this.isEnabled();
        if (stringArray != null) {
            if (!bl) return false;
            bl = this.A();
        }
        if (stringArray != null) {
            if (!bl) return false;
            bl = this.v();
        }
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public void e(nb_0 nb_02) {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                this.n.add(nb_02);
                String[] stringArray2 = stringArray;
                sV = this.M;
                if (stringArray2 == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.J(nb_02);
        }
    }

    public void x(nb_0 nb_02) {
        block3: {
            SV sV;
            block2: {
                String[] stringArray = cb_1.C();
                this.n.remove(nb_02);
                String[] stringArray2 = stringArray;
                sV = this.M;
                if (stringArray2 == null) break block2;
                if (sV == null) break block3;
                sV = this.M;
            }
            sV.e(nb_02);
        }
    }

    public void s(List list) {
        Iterator iterator = aL.J((Collection)this.n).iterator();
        String[] stringArray = cb_1.C();
        while (iterator.hasNext()) {
            nb_0 nb_02 = (nb_0)iterator.next();
            nb_02.f(list);
            if (stringArray != null) continue;
        }
    }
}

