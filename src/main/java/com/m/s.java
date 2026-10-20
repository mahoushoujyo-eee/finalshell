/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.FN;
import com.a9;
import com.kp_0;
import com.ky_2;
import com.m.K;
import com.m.L;
import com.m.Q;
import com.m.R;
import com.m.T;
import com.m.U;
import com.m.d;
import com.m.p_0;
import com.rv_2;
import com.yb_2;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class s
extends JTree
implements yb_2 {
    protected List I = new ArrayList(1);
    protected TreeSelectionListener z = null;
    private static String J;
    private static final String[] a;
    private static final String[] b;

    public s() {
        this(s.u());
    }

    public s(Object[] objectArray) {
        this(s.V(objectArray));
        this.setRootVisible(false);
        this.setShowsRootHandles(true);
        this.t();
    }

    public s(Vector vector) {
        this(s.V(vector));
        this.setRootVisible(false);
        this.setShowsRootHandles(true);
        this.t();
    }

    public s(Hashtable hashtable) {
        this(s.V(hashtable));
        this.setRootVisible(false);
        this.setShowsRootHandles(true);
        this.t();
    }

    public s(DefaultMutableTreeNode defaultMutableTreeNode) {
        this(new L(defaultMutableTreeNode));
    }

    public s(DefaultMutableTreeNode defaultMutableTreeNode, boolean bl) {
        this(new L(defaultMutableTreeNode, bl));
    }

    public s(TreeModel treeModel) {
        super(treeModel);
        this.B();
    }

    protected void B() {
    }

    @Override
    public void setCellEditor(TreeCellEditor treeCellEditor) {
        String string;
        block3: {
            Iterator iterator = this.I.iterator();
            string = s.d();
            while (iterator.hasNext()) {
                CellEditorListener cellEditorListener = (CellEditorListener)iterator.next();
                this.cellEditor.removeCellEditorListener(cellEditorListener);
                if (string != null) {
                    if (string != null) continue;
                }
                break block3;
            }
            super.setCellEditor(treeCellEditor);
        }
        for (CellEditorListener cellEditorListener : this.I) {
            this.cellEditor.addCellEditorListener(cellEditorListener);
            if (string != null) continue;
        }
    }

    public void h(CellEditorListener cellEditorListener) {
        block3: {
            TreeCellEditor treeCellEditor;
            block2: {
                String string = s.d();
                this.I.add(cellEditorListener);
                String string2 = string;
                treeCellEditor = this.cellEditor;
                if (string2 == null) break block2;
                if (treeCellEditor == null) break block3;
                treeCellEditor = this.cellEditor;
            }
            treeCellEditor.addCellEditorListener(cellEditorListener);
        }
    }

    public void f(CellEditorListener cellEditorListener) {
        block3: {
            TreeCellEditor treeCellEditor;
            block2: {
                String string = s.d();
                this.I.remove(cellEditorListener);
                String string2 = string;
                treeCellEditor = this.cellEditor;
                if (string2 == null) break block2;
                if (treeCellEditor == null) break block3;
                treeCellEditor = this.cellEditor;
            }
            treeCellEditor.removeCellEditorListener(cellEditorListener);
        }
    }

    public void t() {
        block5: {
            Object object;
            TreeModel treeModel;
            block4: {
                treeModel = this.getModel();
                String string = s.d();
                object = treeModel;
                if (string == null) break block4;
                if (object == null) break block5;
                object = treeModel.getRoot();
            }
            if (object != null) {
                this.expandPath(new TreePath(treeModel.getRoot()));
            }
        }
    }

    public void H() {
        String string = s.d();
        for (int i2 = 0; i2 < this.getRowCount(); ++i2) {
            this.expandRow(i2);
            if (string != null) continue;
        }
    }

    public void P(DefaultMutableTreeNode defaultMutableTreeNode) {
        this.expandPath(this.N(defaultMutableTreeNode));
    }

    public boolean I(DefaultMutableTreeNode defaultMutableTreeNode) {
        return this.isExpanded(this.N(defaultMutableTreeNode));
    }

    public Rectangle Z(DefaultMutableTreeNode defaultMutableTreeNode) {
        return this.getPathBounds(this.N(defaultMutableTreeNode));
    }

    public Rectangle O(List list) {
        Rectangle rectangle;
        block6: {
            String string;
            block9: {
                block8: {
                    List list2;
                    block7: {
                        string = s.d();
                        list2 = list;
                        if (string == null) break block7;
                        if (list2 == null) break block8;
                        list2 = list;
                    }
                    if (list2.size() != 0) break block9;
                }
                return null;
            }
            Rectangle rectangle2 = null;
            for (DefaultMutableTreeNode defaultMutableTreeNode : list) {
                rectangle = rv_2.B(rectangle2, this.Z(defaultMutableTreeNode));
                if (string != null) {
                    rectangle2 = rectangle;
                    if (string != null) continue;
                }
                break block6;
            }
            rectangle = rectangle2;
        }
        return rectangle;
    }

    public DefaultMutableTreeNode l(int n10) {
        return this.b(this.getPathForRow(n10));
    }

    public TreePath N(DefaultMutableTreeNode defaultMutableTreeNode) {
        return defaultMutableTreeNode != null ? new TreePath(defaultMutableTreeNode.getPath()) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DefaultMutableTreeNode b(TreePath treePath) {
        String string = s.d();
        Object object = treePath;
        if (string != null) {
            if (object == null) return null;
            object = treePath.getLastPathComponent();
        }
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)object;
        return defaultMutableTreeNode;
    }

    public DefaultMutableTreeNode q(Point point) {
        return this.H(point.x, point.y);
    }

    public DefaultMutableTreeNode H(int n10, int n11) {
        return this.b(this.getPathForLocation(n10, n11));
    }

    public TreePath K(Point point) {
        return this.getPathForLocation(point.x, point.y);
    }

    public DefaultMutableTreeNode D(Point point) {
        return this.q(point.x, point.y);
    }

    public DefaultMutableTreeNode q(int n10, int n11) {
        return this.b(this.getClosestPathForLocation(n10, n11));
    }

    public TreePath X(Point point) {
        return this.getClosestPathForLocation(point.x, point.y);
    }

    public boolean T(DefaultMutableTreeNode defaultMutableTreeNode) {
        return this.isPathSelected(this.N(defaultMutableTreeNode));
    }

    public DefaultMutableTreeNode Q() {
        return this.b(this.getSelectionPath());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public List V() {
        ArrayList<DefaultMutableTreeNode> arrayList;
        ArrayList<DefaultMutableTreeNode> arrayList2;
        block4: {
            TreePath[] treePathArray;
            String string;
            block3: {
                arrayList2 = new ArrayList<DefaultMutableTreeNode>();
                TreePath[] treePathArray2 = this.getSelectionPaths();
                string = s.d();
                treePathArray = treePathArray2;
                if (string == null) break block3;
                if (treePathArray == null) break block4;
                treePathArray = treePathArray2;
            }
            for (TreePath treePath : treePathArray) {
                arrayList = arrayList2;
                if (string == null) return arrayList;
                arrayList.add(this.b(treePath));
                if (string != null) continue;
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public void s(Point point) {
        this.G(point.x, point.y);
    }

    public void G(int n10, int n11) {
        this.setSelectionPath(this.getPathForLocation(n10, n11));
    }

    public void s(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath = this.N(defaultMutableTreeNode);
        if (treePath != null) {
            this.setSelectionPath(treePath);
        }
    }

    public void R(List list) {
        block2: {
            TreePath[] treePathArray = new TreePath[list.size()];
            String string = s.d();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                treePathArray[i2] = this.N((DefaultMutableTreeNode)list.get(i2));
                if (string != null) {
                    if (string != null) continue;
                }
                break block2;
            }
            this.setSelectionPaths(treePathArray);
        }
    }

    public void E(DefaultMutableTreeNode[] defaultMutableTreeNodeArray) {
        block2: {
            TreePath[] treePathArray = new TreePath[defaultMutableTreeNodeArray.length];
            String string = s.d();
            for (int i2 = 0; i2 < defaultMutableTreeNodeArray.length; ++i2) {
                treePathArray[i2] = this.N(defaultMutableTreeNodeArray[i2]);
                if (string != null) {
                    if (string != null) continue;
                }
                break block2;
            }
            this.setSelectionPaths(treePathArray);
        }
    }

    public DefaultMutableTreeNode E() {
        int n10 = 0;
        String string = s.d();
        while (n10 < this.getRowCount()) {
            DefaultMutableTreeNode defaultMutableTreeNode = this.l(n10);
            if (string != null) {
                if (this.getModel().isLeaf(defaultMutableTreeNode)) {
                    return defaultMutableTreeNode;
                }
                ++n10;
            }
            if (string != null) continue;
        }
        return null;
    }

    public void f() {
        DefaultMutableTreeNode defaultMutableTreeNode = this.E();
        if (defaultMutableTreeNode != null) {
            this.s(defaultMutableTreeNode);
        }
    }

    public void Y() {
        this.b(true);
    }

    public void b(boolean bl) {
        block6: {
            block3: {
                int n10;
                String string;
                block4: {
                    block5: {
                        int n11;
                        int n12;
                        block2: {
                            n12 = this.getLeadSelectionRow();
                            string = s.d();
                            n10 = n12;
                            n11 = -1;
                            if (string == null) break block2;
                            if (n10 == n11) break block3;
                            n10 = n12;
                            if (string == null) break block4;
                            n11 = this.getRowCount() - 1;
                        }
                        if (n10 >= n11) break block5;
                        this.setSelectionRow(n12 + 1);
                        if (string != null) break block6;
                    }
                    n10 = bl ? 1 : 0;
                }
                if (n10 == 0) break block6;
                this.setSelectionRow(0);
                if (string != null) break block6;
            }
            this.setSelectionRow(0);
        }
    }

    public void G() {
        this.T(true);
    }

    public void T(boolean bl) {
        block6: {
            block3: {
                int n10;
                String string;
                block4: {
                    block5: {
                        int n11;
                        block2: {
                            n11 = this.getLeadSelectionRow();
                            string = s.d();
                            n10 = n11;
                            if (string == null) break block2;
                            if (n10 == -1) break block3;
                            n10 = n11;
                        }
                        if (string == null) break block4;
                        if (n10 <= 0) break block5;
                        this.setSelectionRow(n11 - 1);
                        if (string != null) break block6;
                    }
                    n10 = bl ? 1 : 0;
                }
                if (n10 == 0) break block6;
                this.setSelectionRow(this.getRowCount() - 1);
                if (string != null) break block6;
            }
            this.setSelectionRow(this.getRowCount() - 1);
        }
    }

    public DefaultMutableTreeNode M() {
        return (DefaultMutableTreeNode)this.getModel().getRoot();
    }

    public List W() {
        ArrayList arrayList = new ArrayList();
        this.W(arrayList, this.M());
        return arrayList;
    }

    private void W(List list, DefaultMutableTreeNode defaultMutableTreeNode) {
        String string = s.d();
        list.add(defaultMutableTreeNode);
        String string2 = string;
        for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
            this.W(list, (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(i2));
            if (string2 != null) continue;
        }
    }

    public void T(int n10) {
        this.getSelectionModel().setSelectionMode(n10);
    }

    public void d(boolean n10) {
        String string = s.d();
        int n11 = n10;
        if (string != null) {
            n11 = n11 != 0 ? 4 : 1;
        }
        this.T(n11);
    }

    public boolean S() {
        return this.z != null;
    }

    public void D(boolean bl) {
        block5: {
            block6: {
                s s2;
                boolean bl2;
                block2: {
                    String string;
                    block3: {
                        s s3;
                        block4: {
                            string = s.d();
                            bl2 = bl;
                            if (string == null) break block2;
                            if (!bl2) break block3;
                            s3 = this;
                            if (string == null) break block4;
                            if (s3.S()) break block5;
                            this.z = new d(this);
                            s3 = this;
                        }
                        s3.addTreeSelectionListener(this.z);
                        if (string != null) break block5;
                    }
                    s2 = this;
                    if (string == null) break block6;
                    bl2 = s2.S();
                }
                if (!bl2) break block5;
                this.removeTreeSelectionListener(this.z);
                s2 = this;
            }
            s2.z = null;
        }
    }

    public void J() {
        this.scrollRectToVisible(new Rectangle(0, 0, 1, 1));
    }

    public void U() {
        Rectangle rectangle = this.getPathBounds(this.getSelectionPath());
        if (rectangle != null) {
            this.scrollRectToVisible(rectangle);
        }
    }

    public void O(DefaultMutableTreeNode defaultMutableTreeNode) {
        Rectangle rectangle = this.Z(defaultMutableTreeNode);
        if (rectangle != null) {
            this.scrollRectToVisible(rectangle);
        }
    }

    public void S() {
        TreePath treePath = this.getSelectionPath();
        if (treePath != null) {
            this.startEditingAtPath(treePath);
        }
    }

    public void b(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath = this.N(defaultMutableTreeNode);
        if (treePath != null) {
            this.startEditingAtPath(treePath);
        }
    }

    public void M() {
        this.revalidate();
        this.repaint();
    }

    public p_0 B() {
        return U.q(this);
    }

    public p_0 V(boolean bl) {
        return U.L(this, bl);
    }

    public void P(p_0 p_02) {
        U.A(this, p_02);
    }

    public void G(p_0 p_02, boolean bl) {
        U.T(this, p_02, bl);
    }

    public boolean p() {
        return this.E().q();
    }

    public void o(boolean bl) {
        this.E().O(bl);
    }

    public boolean Y() {
        return R.t(this);
    }

    public void f(boolean bl) {
        block5: {
            s s2;
            block6: {
                boolean bl2;
                block2: {
                    String string;
                    block3: {
                        s s3;
                        block4: {
                            string = s.d();
                            bl2 = bl;
                            if (string == null) break block2;
                            if (!bl2) break block3;
                            s3 = this;
                            if (string == null) break block4;
                            if (s3.Y()) break block5;
                            this.z(false);
                            s3 = this;
                        }
                        R.E(s3);
                        if (string != null) break block5;
                    }
                    s2 = this;
                    if (string == null) break block6;
                    bl2 = s2.Y();
                }
                if (!bl2) break block5;
                s2 = this;
            }
            R.s(s2);
        }
    }

    public boolean q() {
        return this.E().H();
    }

    public void z(boolean bl) {
        this.E().D(bl);
    }

    public boolean Q() {
        return this.E().x();
    }

    public void r(boolean bl) {
        this.E().S(bl);
    }

    public Color b() {
        return this.E().Z();
    }

    public void b(Color color) {
        this.E().e(color);
    }

    public T k() {
        return this.E().q();
    }

    public void b(T t2) {
        this.E().O(t2);
    }

    public int T() {
        return this.E().i();
    }

    public void S(int n10) {
        this.E().z(n10);
    }

    public int E() {
        return this.E().A();
    }

    public void y(int n10) {
        this.E().U(n10);
    }

    public boolean k() {
        return this.E().E();
    }

    public void j(boolean bl) {
        this.E().B(bl);
    }

    public Color K() {
        return this.E().j();
    }

    public void l(Color color) {
        this.E().J(color);
    }

    public Color C() {
        return this.E().o();
    }

    public void q(Color color) {
        this.E().m(color);
    }

    public int L() {
        return this.E().E();
    }

    public void q(int n10) {
        this.E().y(n10);
    }

    public BasicStroke U() {
        return this.E().R();
    }

    public void H(BasicStroke basicStroke) {
        this.E().A(basicStroke);
    }

    public int m() {
        return this.E().H();
    }

    public void D(int n10) {
        this.E().e(n10);
    }

    public K E() {
        return (K)this.getUI();
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
                        var1_1 = s.d();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw s.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw s.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof K)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw s.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((K)kp_0.w(a9.zr, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        var2_2.printStackTrace();
                        this.setUI(new K());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw s.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    public void H(int n10) {
        this.repaint(this.E().G(n10));
    }

    public void x(int n10, int n11) {
        Rectangle rectangle;
        K k2 = this.E();
        Rectangle rectangle2 = k2.G(n10);
        Rectangle rectangle3 = rv_2.B(rectangle2, rectangle = k2.G(n11));
        if (rectangle3 != null) {
            this.repaint(rectangle3);
        }
    }

    public void k(DefaultMutableTreeNode defaultMutableTreeNode) {
        if (defaultMutableTreeNode != null) {
            this.repaint(this.Z(defaultMutableTreeNode));
        }
    }

    public void t(List list) {
        block7: {
            List list2;
            String string;
            block8: {
                string = s.d();
                list2 = list;
                if (string == null) break block8;
                if (list2 == null) break block7;
                list2 = list;
            }
            if (list2.size() > 0) {
                Rectangle rectangle = null;
                for (DefaultMutableTreeNode defaultMutableTreeNode : list) {
                    rectangle = rv_2.B(rectangle, this.Z(defaultMutableTreeNode));
                    if (string != null) {
                        if (string != null) continue;
                    }
                    break block7;
                }
                if (rectangle != null) {
                    this.repaint(rectangle);
                }
            }
        }
    }

    public s G() {
        return (s)FN.A(this);
    }

    public s Q(boolean bl) {
        return (s)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    public s c() {
        return (s)FN.u(this);
    }

    public s p(boolean bl) {
        return (s)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public s H() {
        return (s)FN.C(this);
    }

    public s S(boolean bl) {
        return (s)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public s X(boolean bl, boolean bl2) {
        return (s)FN.K(this, bl, bl2);
    }

    @Override
    public s G(int n10) {
        return (s)FN.p((Component)this, n10);
    }

    public s u(int n10) {
        return (s)FN.O((Component)this, n10);
    }

    public s S(int n10) {
        return (s)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    public s z(int n10, boolean bl, boolean bl2) {
        return (s)FN.d(this, n10, bl, bl2);
    }

    public s J(int n10, int n11) {
        return (s)FN.m(this, n10, n11);
    }

    public s d(String string) {
        return (s)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    protected static TreeModel V(Object object) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        block6: {
            block5: {
                String string;
                block3: {
                    boolean bl;
                    block4: {
                        block2: {
                            string = s.d();
                            bl = object instanceof Object[];
                            if (string == null) break block2;
                            if (bl) break block3;
                            bl = object instanceof Hashtable;
                        }
                        if (string == null) break block4;
                        if (bl) break block3;
                        bl = object instanceof Vector;
                    }
                    if (!bl) break block5;
                }
                defaultMutableTreeNode = new DefaultMutableTreeNode("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50182 out of bounds for length 7");
                JTree.DynamicUtilTreeNode.createChildren(defaultMutableTreeNode, object);
                if (string != null) break block6;
            }
            defaultMutableTreeNode = new JTree.DynamicUtilTreeNode((Object)"\u0000ERR:ArrayIndexOutOfBoundsException:Index 50203 out of bounds for length 7", object);
        }
        return new L(defaultMutableTreeNode, false);
    }

    public static TreeModel u() {
        Q q2 = new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50206 out of bounds for length 7");
        String string = s.d();
        Q q3 = new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50192 out of bounds for length 7");
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50198 out of bounds for length 7"));
        String string2 = string;
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50196 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50197 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50205 out of bounds for length 7"));
        q2.add(q3);
        q3 = new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50207 out of bounds for length 7");
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50201 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50183 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50204 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50195 out of bounds for length 7"));
        q2.add(q3);
        q3 = new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50194 out of bounds for length 7");
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50202 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50199 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50193 out of bounds for length 7"));
        q3.add(new Q("\u0000ERR:ArrayIndexOutOfBoundsException:Index 50200 out of bounds for length 7"));
        q2.add(q3);
        L l2 = new L(q2);
        if (string2 == null) {
            ky_2.K(new String[5]);
        }
        return l2;
    }

    @Override
    public Component N(String string) {
        return this.d(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.J(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.z(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.S(n10);
    }

    @Override
    public Component o(int n10) {
        return this.u(n10);
    }

    @Override
    public Component i(int n10) {
        return this.G(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.X(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.S(bl);
    }

    @Override
    public Component Q() {
        return this.H();
    }

    @Override
    public Component u(boolean bl) {
        return this.p(bl);
    }

    @Override
    public Component R() {
        return this.c();
    }

    @Override
    public Component c(boolean bl) {
        return this.Q(bl);
    }

    @Override
    public Component a() {
        return this.G();
    }

    public static void W(String string) {
        J = string;
    }

    public static String d() {
        return J;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[18];
                var3_1 = 0;
                var2_2 = "\u00c2\u00a7\u00bd!\u0005\u00899\u008bH\u00fe\u0006N\u00f3\u00a0\u0007(\u0098\u0003\u0017\u00bf\u0004\u0004Q\u00c6Qo\u0006\u00aa\u00e6\u00edd\f\u001e\u0006L0T\u00ba\u00c2K\u0007\u00e8\u0016\u00e9\u00b713,\u0005\u000b\u00de\u00ae1W\u0006\u0018\u0089\u00cfl\u00d4/\b\u0010\u00a9y\u0092\u0014$!\u00bc\u0006\t\u0001\u00a5\u00d4\u00e1\u00e1\brJ\u00e1\u00bay\u00f1A\u00d6\u0004`!\u00e1\u0083\u0007\u0092n\u00ac\u00b0\u0083\u00d7A\n\u0005AC_\u00cbt3\f\u0096\u001e";
                var4_3 = "\u00c2\u00a7\u00bd!\u0005\u00899\u008bH\u00fe\u0006N\u00f3\u00a0\u0007(\u0098\u0003\u0017\u00bf\u0004\u0004Q\u00c6Qo\u0006\u00aa\u00e6\u00edd\f\u001e\u0006L0T\u00ba\u00c2K\u0007\u00e8\u0016\u00e9\u00b713,\u0005\u000b\u00de\u00ae1W\u0006\u0018\u0089\u00cfl\u00d4/\b\u0010\u00a9y\u0092\u0014$!\u00bc\u0006\t\u0001\u00a5\u00d4\u00e1\u00e1\brJ\u00e1\u00bay\u00f1A\u00d6\u0004`!\u00e1\u0083\u0007\u0092n\u00ac\u00b0\u0083\u00d7A\n\u0005AC_\u00cbt3\f\u0096\u001e".length();
                s.W("SfdVE");
                var1_4 = 4;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 41;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "~8\u00a6$\u0006,\u00fe\u00c1\u00eb\ri";
                    var4_3 = "~8\u00a6$\u0006,\u00fe\u00c1\u00eb\ri".length();
                    var1_4 = 4;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 45;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 117;
                            break;
                        }
                        case 1: {
                            v15 = 82;
                            break;
                        }
                        case 2: {
                            v15 = 28;
                            break;
                        }
                        case 3: {
                            v15 = 23;
                            break;
                        }
                        case 4: {
                            v15 = 84;
                            break;
                        }
                        case 5: {
                            v15 = 3;
                            break;
                        }
                        default: {
                            v15 = 103;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl86:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl96:
                // 1 sources

                ** continue;
            }
        }
        s.a = var5;
        s.b = new String[18];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x2C5B) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 206;
                    break;
                }
                case 1: {
                    n14 = 218;
                    break;
                }
                case 2: {
                    n14 = 211;
                    break;
                }
                case 3: {
                    n14 = 121;
                    break;
                }
                case 4: {
                    n14 = 23;
                    break;
                }
                case 5: {
                    n14 = 11;
                    break;
                }
                case 6: {
                    n14 = 79;
                    break;
                }
                case 7: {
                    n14 = 233;
                    break;
                }
                case 8: {
                    n14 = 191;
                    break;
                }
                case 9: {
                    n14 = 89;
                    break;
                }
                case 10: {
                    n14 = 67;
                    break;
                }
                case 11: {
                    n14 = 214;
                    break;
                }
                case 12: {
                    n14 = 12;
                    break;
                }
                case 13: {
                    n14 = 76;
                    break;
                }
                case 14: {
                    n14 = 172;
                    break;
                }
                case 15: {
                    n14 = 2;
                    break;
                }
                case 16: {
                    n14 = 131;
                    break;
                }
                case 17: {
                    n14 = 159;
                    break;
                }
                case 18: {
                    n14 = 43;
                    break;
                }
                case 19: {
                    n14 = 50;
                    break;
                }
                case 20: {
                    n14 = 45;
                    break;
                }
                case 21: {
                    n14 = 44;
                    break;
                }
                case 22: {
                    n14 = 163;
                    break;
                }
                case 23: {
                    n14 = 143;
                    break;
                }
                case 24: {
                    n14 = 158;
                    break;
                }
                case 25: {
                    n14 = 119;
                    break;
                }
                case 26: {
                    n14 = 118;
                    break;
                }
                case 27: {
                    n14 = 201;
                    break;
                }
                case 28: {
                    n14 = 177;
                    break;
                }
                case 29: {
                    n14 = 42;
                    break;
                }
                case 30: {
                    n14 = 117;
                    break;
                }
                case 31: {
                    n14 = 40;
                    break;
                }
                case 32: {
                    n14 = 95;
                    break;
                }
                case 33: {
                    n14 = 168;
                    break;
                }
                case 34: {
                    n14 = 38;
                    break;
                }
                case 35: {
                    n14 = 147;
                    break;
                }
                case 36: {
                    n14 = 29;
                    break;
                }
                case 37: {
                    n14 = 195;
                    break;
                }
                case 38: {
                    n14 = 125;
                    break;
                }
                case 39: {
                    n14 = 129;
                    break;
                }
                case 40: {
                    n14 = 84;
                    break;
                }
                case 41: {
                    n14 = 36;
                    break;
                }
                case 42: {
                    n14 = 57;
                    break;
                }
                case 43: {
                    n14 = 154;
                    break;
                }
                case 44: {
                    n14 = 55;
                    break;
                }
                case 45: {
                    n14 = 46;
                    break;
                }
                case 46: {
                    n14 = 250;
                    break;
                }
                case 47: {
                    n14 = 179;
                    break;
                }
                case 48: {
                    n14 = 238;
                    break;
                }
                case 49: {
                    n14 = 80;
                    break;
                }
                case 50: {
                    n14 = 91;
                    break;
                }
                case 51: {
                    n14 = 60;
                    break;
                }
                case 52: {
                    n14 = 208;
                    break;
                }
                case 53: {
                    n14 = 13;
                    break;
                }
                case 54: {
                    n14 = 194;
                    break;
                }
                case 55: {
                    n14 = 186;
                    break;
                }
                case 56: {
                    n14 = 52;
                    break;
                }
                case 57: {
                    n14 = 30;
                    break;
                }
                case 58: {
                    n14 = 205;
                    break;
                }
                case 59: {
                    n14 = 196;
                    break;
                }
                case 60: {
                    n14 = 48;
                    break;
                }
                case 61: {
                    n14 = 164;
                    break;
                }
                case 62: {
                    n14 = 87;
                    break;
                }
                case 63: {
                    n14 = 65;
                    break;
                }
                case 64: {
                    n14 = 171;
                    break;
                }
                case 65: {
                    n14 = 188;
                    break;
                }
                case 66: {
                    n14 = 153;
                    break;
                }
                case 67: {
                    n14 = 155;
                    break;
                }
                case 68: {
                    n14 = 234;
                    break;
                }
                case 69: {
                    n14 = 243;
                    break;
                }
                case 70: {
                    n14 = 174;
                    break;
                }
                case 71: {
                    n14 = 210;
                    break;
                }
                case 72: {
                    n14 = 144;
                    break;
                }
                case 73: {
                    n14 = 47;
                    break;
                }
                case 74: {
                    n14 = 231;
                    break;
                }
                case 75: {
                    n14 = 192;
                    break;
                }
                case 76: {
                    n14 = 116;
                    break;
                }
                case 77: {
                    n14 = 124;
                    break;
                }
                case 78: {
                    n14 = 54;
                    break;
                }
                case 79: {
                    n14 = 37;
                    break;
                }
                case 80: {
                    n14 = 149;
                    break;
                }
                case 81: {
                    n14 = 157;
                    break;
                }
                case 82: {
                    n14 = 99;
                    break;
                }
                case 83: {
                    n14 = 110;
                    break;
                }
                case 84: {
                    n14 = 140;
                    break;
                }
                case 85: {
                    n14 = 152;
                    break;
                }
                case 86: {
                    n14 = 136;
                    break;
                }
                case 87: {
                    n14 = 21;
                    break;
                }
                case 88: {
                    n14 = 113;
                    break;
                }
                case 89: {
                    n14 = 1;
                    break;
                }
                case 90: {
                    n14 = 221;
                    break;
                }
                case 91: {
                    n14 = 58;
                    break;
                }
                case 92: {
                    n14 = 212;
                    break;
                }
                case 93: {
                    n14 = 228;
                    break;
                }
                case 94: {
                    n14 = 248;
                    break;
                }
                case 95: {
                    n14 = 141;
                    break;
                }
                case 96: {
                    n14 = 74;
                    break;
                }
                case 97: {
                    n14 = 130;
                    break;
                }
                case 98: {
                    n14 = 146;
                    break;
                }
                case 99: {
                    n14 = 246;
                    break;
                }
                case 100: {
                    n14 = 187;
                    break;
                }
                case 101: {
                    n14 = 173;
                    break;
                }
                case 102: {
                    n14 = 0;
                    break;
                }
                case 103: {
                    n14 = 216;
                    break;
                }
                case 104: {
                    n14 = 16;
                    break;
                }
                case 105: {
                    n14 = 27;
                    break;
                }
                case 106: {
                    n14 = 145;
                    break;
                }
                case 107: {
                    n14 = 120;
                    break;
                }
                case 108: {
                    n14 = 100;
                    break;
                }
                case 109: {
                    n14 = 78;
                    break;
                }
                case 110: {
                    n14 = 62;
                    break;
                }
                case 111: {
                    n14 = 169;
                    break;
                }
                case 112: {
                    n14 = 150;
                    break;
                }
                case 113: {
                    n14 = 251;
                    break;
                }
                case 114: {
                    n14 = 148;
                    break;
                }
                case 115: {
                    n14 = 235;
                    break;
                }
                case 116: {
                    n14 = 127;
                    break;
                }
                case 117: {
                    n14 = 240;
                    break;
                }
                case 118: {
                    n14 = 166;
                    break;
                }
                case 119: {
                    n14 = 56;
                    break;
                }
                case 120: {
                    n14 = 126;
                    break;
                }
                case 121: {
                    n14 = 14;
                    break;
                }
                case 122: {
                    n14 = 139;
                    break;
                }
                case 123: {
                    n14 = 83;
                    break;
                }
                case 124: {
                    n14 = 17;
                    break;
                }
                case 125: {
                    n14 = 101;
                    break;
                }
                case 126: {
                    n14 = 142;
                    break;
                }
                case 127: {
                    n14 = 64;
                    break;
                }
                case 128: {
                    n14 = 204;
                    break;
                }
                case 129: {
                    n14 = 26;
                    break;
                }
                case 130: {
                    n14 = 20;
                    break;
                }
                case 131: {
                    n14 = 176;
                    break;
                }
                case 132: {
                    n14 = 241;
                    break;
                }
                case 133: {
                    n14 = 5;
                    break;
                }
                case 134: {
                    n14 = 237;
                    break;
                }
                case 135: {
                    n14 = 170;
                    break;
                }
                case 136: {
                    n14 = 4;
                    break;
                }
                case 137: {
                    n14 = 104;
                    break;
                }
                case 138: {
                    n14 = 28;
                    break;
                }
                case 139: {
                    n14 = 225;
                    break;
                }
                case 140: {
                    n14 = 249;
                    break;
                }
                case 141: {
                    n14 = 109;
                    break;
                }
                case 142: {
                    n14 = 105;
                    break;
                }
                case 143: {
                    n14 = 134;
                    break;
                }
                case 144: {
                    n14 = 189;
                    break;
                }
                case 145: {
                    n14 = 156;
                    break;
                }
                case 146: {
                    n14 = 18;
                    break;
                }
                case 147: {
                    n14 = 96;
                    break;
                }
                case 148: {
                    n14 = 220;
                    break;
                }
                case 149: {
                    n14 = 102;
                    break;
                }
                case 150: {
                    n14 = 135;
                    break;
                }
                case 151: {
                    n14 = 32;
                    break;
                }
                case 152: {
                    n14 = 128;
                    break;
                }
                case 153: {
                    n14 = 226;
                    break;
                }
                case 154: {
                    n14 = 209;
                    break;
                }
                case 155: {
                    n14 = 167;
                    break;
                }
                case 156: {
                    n14 = 230;
                    break;
                }
                case 157: {
                    n14 = 162;
                    break;
                }
                case 158: {
                    n14 = 217;
                    break;
                }
                case 159: {
                    n14 = 61;
                    break;
                }
                case 160: {
                    n14 = 103;
                    break;
                }
                case 161: {
                    n14 = 53;
                    break;
                }
                case 162: {
                    n14 = 253;
                    break;
                }
                case 163: {
                    n14 = 183;
                    break;
                }
                case 164: {
                    n14 = 161;
                    break;
                }
                case 165: {
                    n14 = 202;
                    break;
                }
                case 166: {
                    n14 = 97;
                    break;
                }
                case 167: {
                    n14 = 98;
                    break;
                }
                case 168: {
                    n14 = 9;
                    break;
                }
                case 169: {
                    n14 = 8;
                    break;
                }
                case 170: {
                    n14 = 199;
                    break;
                }
                case 171: {
                    n14 = 252;
                    break;
                }
                case 172: {
                    n14 = 106;
                    break;
                }
                case 173: {
                    n14 = 111;
                    break;
                }
                case 174: {
                    n14 = 77;
                    break;
                }
                case 175: {
                    n14 = 138;
                    break;
                }
                case 176: {
                    n14 = 178;
                    break;
                }
                case 177: {
                    n14 = 112;
                    break;
                }
                case 178: {
                    n14 = 70;
                    break;
                }
                case 179: {
                    n14 = 213;
                    break;
                }
                case 180: {
                    n14 = 3;
                    break;
                }
                case 181: {
                    n14 = 7;
                    break;
                }
                case 182: {
                    n14 = 94;
                    break;
                }
                case 183: {
                    n14 = 193;
                    break;
                }
                case 184: {
                    n14 = 19;
                    break;
                }
                case 185: {
                    n14 = 215;
                    break;
                }
                case 186: {
                    n14 = 81;
                    break;
                }
                case 187: {
                    n14 = 66;
                    break;
                }
                case 188: {
                    n14 = 160;
                    break;
                }
                case 189: {
                    n14 = 232;
                    break;
                }
                case 190: {
                    n14 = 63;
                    break;
                }
                case 191: {
                    n14 = 73;
                    break;
                }
                case 192: {
                    n14 = 69;
                    break;
                }
                case 193: {
                    n14 = 6;
                    break;
                }
                case 194: {
                    n14 = 115;
                    break;
                }
                case 195: {
                    n14 = 24;
                    break;
                }
                case 196: {
                    n14 = 41;
                    break;
                }
                case 197: {
                    n14 = 22;
                    break;
                }
                case 198: {
                    n14 = 137;
                    break;
                }
                case 199: {
                    n14 = 85;
                    break;
                }
                case 200: {
                    n14 = 190;
                    break;
                }
                case 201: {
                    n14 = 34;
                    break;
                }
                case 202: {
                    n14 = 223;
                    break;
                }
                case 203: {
                    n14 = 200;
                    break;
                }
                case 204: {
                    n14 = 133;
                    break;
                }
                case 205: {
                    n14 = 25;
                    break;
                }
                case 206: {
                    n14 = 180;
                    break;
                }
                case 207: {
                    n14 = 15;
                    break;
                }
                case 208: {
                    n14 = 122;
                    break;
                }
                case 209: {
                    n14 = 175;
                    break;
                }
                case 210: {
                    n14 = 31;
                    break;
                }
                case 211: {
                    n14 = 227;
                    break;
                }
                case 212: {
                    n14 = 236;
                    break;
                }
                case 213: {
                    n14 = 88;
                    break;
                }
                case 214: {
                    n14 = 182;
                    break;
                }
                case 215: {
                    n14 = 86;
                    break;
                }
                case 216: {
                    n14 = 90;
                    break;
                }
                case 217: {
                    n14 = 185;
                    break;
                }
                case 218: {
                    n14 = 197;
                    break;
                }
                case 219: {
                    n14 = 92;
                    break;
                }
                case 220: {
                    n14 = 222;
                    break;
                }
                case 221: {
                    n14 = 51;
                    break;
                }
                case 222: {
                    n14 = 207;
                    break;
                }
                case 223: {
                    n14 = 203;
                    break;
                }
                case 224: {
                    n14 = 244;
                    break;
                }
                case 225: {
                    n14 = 132;
                    break;
                }
                case 226: {
                    n14 = 247;
                    break;
                }
                case 227: {
                    n14 = 108;
                    break;
                }
                case 228: {
                    n14 = 10;
                    break;
                }
                case 229: {
                    n14 = 59;
                    break;
                }
                case 230: {
                    n14 = 242;
                    break;
                }
                case 231: {
                    n14 = 245;
                    break;
                }
                case 232: {
                    n14 = 198;
                    break;
                }
                case 233: {
                    n14 = 82;
                    break;
                }
                case 234: {
                    n14 = 33;
                    break;
                }
                case 235: {
                    n14 = 219;
                    break;
                }
                case 236: {
                    n14 = 68;
                    break;
                }
                case 237: {
                    n14 = 165;
                    break;
                }
                case 238: {
                    n14 = 107;
                    break;
                }
                case 239: {
                    n14 = 255;
                    break;
                }
                case 240: {
                    n14 = 229;
                    break;
                }
                case 241: {
                    n14 = 184;
                    break;
                }
                case 242: {
                    n14 = 72;
                    break;
                }
                case 243: {
                    n14 = 39;
                    break;
                }
                case 244: {
                    n14 = 181;
                    break;
                }
                case 245: {
                    n14 = 35;
                    break;
                }
                case 246: {
                    n14 = 239;
                    break;
                }
                case 247: {
                    n14 = 93;
                    break;
                }
                case 248: {
                    n14 = 224;
                    break;
                }
                case 249: {
                    n14 = 114;
                    break;
                }
                case 250: {
                    n14 = 254;
                    break;
                }
                case 251: {
                    n14 = 123;
                    break;
                }
                case 252: {
                    n14 = 71;
                    break;
                }
                case 253: {
                    n14 = 151;
                    break;
                }
                case 254: {
                    n14 = 75;
                    break;
                }
                default: {
                    n14 = 49;
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
            s.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

