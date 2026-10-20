/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.FN;
import com.RV;
import com.a9;
import com.c;
import com.fk_0;
import com.ky_2;
import com.m.H;
import com.m.M;
import com.m.P;
import com.m.T;
import com.m.V;
import com.m.i;
import com.m.n;
import com.m.s;
import com.m.t_0;
import com.rv_2;
import com.u3;
import com.xg_0;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class K
extends BasicTreeUI {
    public static ImageIcon x;
    public static ImageIcon y;
    public static ImageIcon t;
    public static ImageIcon l;
    public static ImageIcon E;
    public static ImageIcon w;
    public static ImageIcon a;
    public static ImageIcon s;
    protected static final float[] V;
    protected boolean U = com.m.n.o;
    protected boolean h = com.m.n.a;
    protected boolean J = com.m.n.A;
    protected Color i = com.m.n.x;
    protected T Q = com.m.n.Y;
    protected int T = com.m.n.Q;
    protected int S = com.m.n.O;
    protected boolean v = com.m.n.G;
    protected Color W = com.m.n.E;
    protected Color m = com.m.n.W;
    protected int I = com.m.n.j;
    protected BasicStroke z = com.m.n.D;
    protected int B = com.m.n.U;
    protected PropertyChangeListener O;
    protected PropertyChangeListener A;
    protected TreeSelectionListener d;
    protected TreeExpansionListener N;
    protected MouseAdapter C;
    protected int g = -1;
    protected List P = new ArrayList();
    protected Point n;
    protected Point q;
    protected boolean k;
    protected TreePath G;
    boolean p;
    DefaultMutableTreeNode F;
    long R;
    long r;
    protected Color K;
    protected Color D;
    protected boolean H;
    Color b;
    private static final String[] c;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] j;

    public K() {
        String string = com.m.s.d();
        this.n = null;
        this.q = null;
        this.k = true;
        this.G = null;
        this.p = false;
        this.K = com.m.n.r;
        this.D = com.m.n.g;
        this.H = com.m.n.y;
        this.b = new Color(com.m.K.a(26372, 4763550615109458083L), com.m.K.a(31478, 5365773978781533526L), com.m.K.a(31478, 5365773978781533526L));
        if (ky_2.F() != null) {
            com.m.s.W("K1o9k");
        }
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new K();
    }

    public boolean f() {
        return this.p;
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.k = this.tree.getComponentOrientation().isLeftToRight();
        String string = com.m.s.d();
        if (string != null) {
            if (!a9.H()) {
                this.setRightChildIndent(com.m.n.F);
                this.setLeftChildIndent(com.m.n.F);
            }
            this.tree.setRowHeight(-1);
            this.tree.setVisibleRowCount(com.m.K.a(10154, 7217869562283038735L));
            this.O = new M(this);
            this.tree.addPropertyChangeListener(com.m.K.a(-5990, 20114), this.O);
            FN.Y(this.tree);
            this.A = new P(this);
            this.tree.addPropertyChangeListener(com.m.K.a(-5999, 17158), this.A);
            this.d = new t_0(this);
            this.tree.addTreeSelectionListener(this.d);
            this.N = new H(this);
            this.tree.addTreeExpansionListener(this.N);
            this.C = new i(this);
            this.tree.addMouseListener(this.C);
            this.tree.addMouseMotionListener(this.C);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        this.tree.removePropertyChangeListener(com.m.K.a(-5995, -1174), this.O);
        this.tree.removePropertyChangeListener(com.m.K.a(-5997, 26900), this.A);
        this.tree.removeTreeSelectionListener(this.d);
        this.tree.removeTreeExpansionListener(this.N);
        this.tree.removeMouseListener(this.C);
        this.tree.removeMouseMotionListener(this.C);
        super.uninstallUI(jComponent);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean V() {
        JTree jTree;
        String string;
        block6: {
            boolean bl;
            block5: {
                string = com.m.s.d();
                JTree jTree2 = this.tree;
                if (string != null) {
                    if (jTree2 == null) return 0 != 0;
                    jTree2 = this.tree;
                }
                bl = jTree2.isEnabled();
                if (string == null) break block5;
                if (!bl) return 0 != 0;
                jTree = this.tree;
                if (string == null) break block6;
                bl = jTree.getDragEnabled();
            }
            if (!bl) return 0 != 0;
            jTree = this.tree;
        }
        TransferHandler transferHandler = jTree.getTransferHandler();
        if (string != null) {
            if (transferHandler == null) return 0 != 0;
            transferHandler = this.tree.getTransferHandler();
        }
        int n10 = transferHandler.getSourceActions(this.tree);
        if (string == null) return n10 != 0;
        if (n10 <= 0) return 0 != 0;
        return 1 != 0;
    }

    public boolean q() {
        return this.U;
    }

    public void O(boolean bl) {
        this.U = bl;
    }

    public boolean H() {
        return this.h;
    }

    public void D(boolean bl) {
        this.h = bl;
    }

    public boolean x() {
        return this.J;
    }

    public void S(boolean bl) {
        this.J = bl;
    }

    public Color Z() {
        return this.i;
    }

    public void e(Color color) {
        this.i = color;
    }

    public T q() {
        return this.Q;
    }

    public void O(T t2) {
        this.Q = t2;
    }

    public int i() {
        return this.T;
    }

    public void z(int n10) {
        this.T = n10;
    }

    public int A() {
        return this.S;
    }

    public void U(int n10) {
        this.S = n10;
    }

    public boolean E() {
        return this.v;
    }

    public void B(boolean bl) {
        this.v = bl;
    }

    public Color j() {
        return this.W;
    }

    public void J(Color color) {
        this.W = color;
    }

    public Color o() {
        return this.m;
    }

    public void m(Color color) {
        this.m = color;
    }

    public int E() {
        return this.I;
    }

    public void y(int n10) {
        this.I = n10;
    }

    public BasicStroke R() {
        return this.z;
    }

    public void A(BasicStroke basicStroke) {
        this.z = basicStroke;
    }

    public int H() {
        return this.B;
    }

    public void e(int n10) {
        this.B = n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean y() {
        String string = com.m.s.d();
        K k2 = this;
        if (string != null) {
            if (!k2.E()) return 0 != 0;
            k2 = this;
        }
        JTree jTree = k2.tree;
        if (string != null) {
            if (jTree == null) return 0 != 0;
            jTree = this.tree;
        }
        int n10 = jTree.isEnabled();
        if (string != null) {
            if (n10 == 0) return 0 != 0;
            n10 = this.tree.getSelectionModel().getSelectionMode();
        }
        if (string == null) return n10 != 0;
        if (n10 == true) return 0 != 0;
        return 1 != 0;
    }

    public boolean o() {
        return this.Q == com.m.T.line;
    }

    public int Y(Point point) {
        return this.v(point, this.o());
    }

    public int v(Point point, boolean bl) {
        int n10;
        block5: {
            String string = com.m.s.d();
            if (this.tree != null) {
                int n11 = 0;
                while (n11 < this.tree.getRowCount()) {
                    Rectangle rectangle = this.C(n11, bl);
                    if (string != null) {
                        n10 = rectangle.contains(point) ? 1 : 0;
                        if (string == null) break block5;
                        if (n10 != 0) {
                            return n11;
                        }
                        ++n11;
                    }
                    if (string != null) continue;
                }
            }
            n10 = -1;
        }
        return n10;
    }

    public Rectangle G(int n10) {
        return this.C(n10, this.o());
    }

    public Rectangle C(int n10, boolean bl) {
        return bl ? this.A(n10) : this.tree.getRowBounds(n10);
    }

    public Rectangle A(int n10) {
        Rectangle rectangle = this.tree.getRowBounds(n10);
        String string = com.m.s.d();
        Rectangle rectangle2 = rectangle;
        if (string != null) {
            if (rectangle2 != null) {
                Insets insets = this.tree.getInsets();
                rectangle.x = insets.left;
                rectangle.width = this.tree.getWidth() - insets.left - insets.right;
            }
            rectangle2 = rectangle;
        }
        return rectangle2;
    }

    @Override
    protected TreeCellEditor createDefaultCellEditor() {
        return new V();
    }

    @Override
    protected void selectPathForEvent(TreePath treePath, MouseEvent mouseEvent) {
        block3: {
            MouseEvent mouseEvent2;
            TreePath treePath2;
            K k2;
            block2: {
                String string = com.m.s.d();
                k2 = this;
                treePath2 = treePath;
                mouseEvent2 = mouseEvent;
                if (string == null) break block2;
                if (k2.v(treePath2, mouseEvent2.getX(), mouseEvent.getY())) break block3;
                k2 = this;
                treePath2 = treePath;
                mouseEvent2 = mouseEvent;
            }
            super.selectPathForEvent(treePath2, mouseEvent2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean v(TreePath treePath, int n10, int n11) {
        Rectangle rectangle;
        String string = com.m.s.d();
        boolean bl = this.tree instanceof u3;
        if (string == null) return bl;
        if (!bl) return false;
        u3 u32 = (u3)this.tree;
        boolean bl2 = u32.b();
        if (string == null) return bl2;
        if (!bl2) return false;
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)treePath.getLastPathComponent();
        boolean bl3 = u32.R(defaultMutableTreeNode);
        if (string == null) return bl3;
        if (!bl3) return false;
        bl3 = u32.N(defaultMutableTreeNode);
        if (string == null) return bl3;
        if (!bl3) return false;
        Rectangle rectangle2 = rectangle = u32.C(treePath);
        if (string != null) {
            if (rectangle2 == null) return false;
            rectangle2 = rectangle;
        }
        boolean bl4 = rectangle2.contains(n10, n11);
        if (string == null) return bl4;
        if (!bl4) return false;
        return true;
    }

    @Override
    protected Color getHashColor() {
        return this.i;
    }

    @Override
    public Icon getExpandedIcon() {
        return this.tree.isEnabled() ? y : l;
    }

    @Override
    public Icon getCollapsedIcon() {
        return this.tree.isEnabled() ? x : t;
    }

    @Override
    protected void drawCentered(Component component, Graphics graphics, Icon icon, int n10, int n11) {
        icon.paintIcon(component, graphics, this.C(n10, icon.getIconWidth()), n11 - icon.getIconHeight() / 2);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected int C(int n10, int n11) {
        int n12;
        String string = com.m.s.d();
        int n13 = this.k;
        if (string != null) {
            if (n13 != 0) {
                n12 = n10 - 2 - (int)Math.ceil((double)n11 / 2.0);
                return n12;
            }
            n13 = n10 - 1;
        }
        n12 = n13 - (int)Math.floor((double)n11 / 2.0);
        return n12;
    }

    protected void F() {
        block4: {
            K k2;
            String string;
            block3: {
                string = com.m.s.d();
                k2 = this;
                if (string == null) break block3;
                if (k2.tree.getSelectionCount() <= 0) break block4;
                k2 = this;
            }
            for (Rectangle rectangle : k2.L()) {
                this.tree.repaint(rectangle);
                if (string != null) continue;
            }
        }
    }

    protected List L() {
        ArrayList<Rectangle> arrayList;
        block15: {
            boolean bl;
            int[] nArray;
            arrayList = new ArrayList<Rectangle>();
            String string = com.m.s.d();
            int[] nArray2 = nArray = this.tree.getSelectionRows();
            if (string != null) {
                if (nArray2 == null) {
                    return arrayList;
                }
                nArray2 = nArray;
            }
            Arrays.sort(nArray2);
            Insets insets = this.tree.getInsets();
            Rectangle rectangle = null;
            int n10 = -1;
            for (int n11 : nArray) {
                block19: {
                    int n12;
                    int n13;
                    block18: {
                        block16: {
                            block17: {
                                bl = this.Q.equals((Object)com.m.T.single);
                                if (string == null) break block15;
                                if (string != null) {
                                    if (bl) {
                                        arrayList.add(this.tree.getRowBounds(n11));
                                        if (string != null) continue;
                                    }
                                    n13 = n10;
                                }
                                n12 = -1;
                                if (string == null) break block16;
                                if (n13 == n12) break block17;
                                n13 = n10 + 1;
                                n12 = n11;
                                if (string == null) break block16;
                                if (n13 != n12) {
                                    arrayList.add(rectangle);
                                    rectangle = null;
                                    n10 = -1;
                                }
                            }
                            n13 = n10;
                            n12 = -1;
                        }
                        if (string == null) break block18;
                        if (n13 == n12) break block19;
                        n13 = n10 + 1;
                        n12 = n11;
                    }
                    if (n13 != n12) continue;
                }
                Rectangle rectangle2 = this.tree.getRowBounds(n11);
                int n14 = this.o();
                if (string != null) {
                    if (n14 != 0) {
                        rectangle2.x = insets.left;
                        rectangle2.width = this.tree.getWidth() - insets.left - insets.right;
                    }
                    n14 = n10;
                }
                rectangle = n14 == -1 ? rectangle2 : rv_2.B(rectangle, rectangle2);
                n10 = n11;
                if (string != null) continue;
            }
            if (rectangle != null) {
                bl = arrayList.add(rectangle);
            }
        }
        return arrayList;
    }

    @Override
    protected int getHorizontalLegBuffer() {
        return com.m.K.a(25568, 9085472095170124865L);
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        String string = com.m.s.d();
        K k2 = this;
        if (string != null) {
            if (k2.tree != jComponent) {
                throw new InternalError(com.m.K.a(-6000, 8370));
            }
            k2 = this;
        }
        if (k2.treeState == null) {
            return;
        }
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.i(graphics2D);
        this.N(graphics2D);
        this.c(graphics2D);
        this.o(graphics2D);
    }

    protected void i(Graphics2D graphics2D) {
        block7: {
            K k2;
            String string;
            block6: {
                this.S = 0;
                this.T = 0;
                string = com.m.s.d();
                k2 = this;
                if (string == null) break block6;
                if (k2.tree.getSelectionCount() <= 0) break block7;
                k2 = this;
            }
            List list = k2.L();
            for (Rectangle rectangle : list) {
                rectangle.x += this.S;
                rectangle.y += this.S;
                int n10 = rectangle.width;
                int n11 = this.S;
                int n12 = 2;
                if (string != null) {
                    n11 = n11 * n12;
                    n12 = this.K != null ? 1 : 0;
                }
                rectangle.width = n10 - (n11 + n12);
                int n13 = rectangle.height;
                int n14 = this.S;
                int n15 = 2;
                if (string != null) {
                    n14 = n14 * n15;
                    n15 = this.K != null ? 1 : 0;
                }
                rectangle.height = n13 - (n14 + n15);
                graphics2D.setColor(this.D);
                graphics2D.fillRect(rectangle.x + 1, rectangle.y, rectangle.width, rectangle.height);
                if (string != null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void N(Graphics2D var1_1) {
        block6: {
            block10: {
                block9: {
                    block8: {
                        block7: {
                            block5: {
                                var2_2 = com.m.s.d();
                                v0 = this.tree.isEnabled();
                                if (var2_2 == null) break block5;
                                if (v0 == 0) break block6;
                                v0 = this.h;
                            }
                            if (var2_2 == null) break block7;
                            if (v0 == 0) break block6;
                            v0 = this.g;
                        }
                        if (var2_2 == null) break block8;
                        if (v0 == -1) break block6;
                        v0 = (int)this.tree.isRowSelected(this.g);
                    }
                    if (var2_2 == null) break block9;
                    if (v0 != 0) break block6;
                    v1 = this;
                    if (var2_2 == null) ** GOTO lbl25
                    v0 = (int)v1.o();
                }
                if (v0 != 0) {
                    v2 = this.A(this.g);
                } else {
                    v1 = this;
lbl25:
                    // 2 sources

                    v2 = v1.tree.getRowBounds(this.g);
                }
                v3 = var3_3 = v2;
                if (var2_2 == null) break block10;
                if (v3 == null) break block6;
                var3_3.x += this.S;
                var3_3.y += this.S;
                var3_3.width -= this.S * 2 + 1;
                v3 = var3_3;
            }
            v3.height -= this.S * 2 + 1;
            var1_1.setColor(this.b);
            var1_1.fillRect(var3_3.x + 1, var3_3.y, var3_3.width, var3_3.height);
        }
    }

    protected void c(Graphics2D graphics2D) {
        block25: {
            block26: {
                Rectangle rectangle = graphics2D.getClipBounds();
                Insets insets = this.tree.getInsets();
                TreePath treePath = this.getClosestPathForLocation(this.tree, 0, rectangle.y);
                Enumeration<TreePath> enumeration = this.treeState.getVisiblePathsFrom(treePath);
                int n10 = rectangle.y + rectangle.height;
                int n11 = this.treeState.getRowForPath(treePath);
                String string = com.m.s.d();
                this.drawingCache.clear();
                if (string == null) break block25;
                if (treePath == null || enumeration == null) break block26;
                TreePath treePath2 = treePath;
                for (treePath2 = treePath2.getParentPath(); treePath2 != null; treePath2 = treePath2.getParentPath()) {
                    this.paintVerticalPartOfLeg(graphics2D, rectangle, insets, treePath2);
                    this.drawingCache.put(treePath2, Boolean.TRUE);
                    if (string != null) {
                        if (string != null) continue;
                    }
                    break block25;
                }
                Rectangle rectangle2 = new Rectangle();
                int n12 = this.isRootVisible();
                boolean bl = false;
                while (!bl) {
                    block37: {
                        block38: {
                            block27: {
                                int n13;
                                block36: {
                                    Rectangle rectangle3;
                                    boolean bl2;
                                    boolean bl3;
                                    boolean bl4;
                                    TreePath treePath3;
                                    block35: {
                                        block34: {
                                            block32: {
                                                K k2;
                                                block33: {
                                                    TreePath treePath4;
                                                    block31: {
                                                        block30: {
                                                            boolean bl5;
                                                            block28: {
                                                                block29: {
                                                                    Object object = enumeration;
                                                                    if (string != null) {
                                                                        if (!object.hasMoreElements()) break;
                                                                        object = enumeration.nextElement();
                                                                    }
                                                                    if ((treePath3 = (TreePath)object) == null) break block27;
                                                                    bl5 = bl4 = this.treeModel.isLeaf(treePath3.getLastPathComponent());
                                                                    if (string == null) break block28;
                                                                    if (!bl5) break block29;
                                                                    bl3 = false;
                                                                    bl2 = false;
                                                                    if (string != null) break block30;
                                                                }
                                                                bl5 = this.treeState.getExpandedState(treePath3);
                                                            }
                                                            bl2 = bl5;
                                                            bl3 = this.tree.hasBeenExpanded(treePath3);
                                                        }
                                                        rectangle3 = this.A(treePath3, insets, rectangle2);
                                                        if (string != null) {
                                                            if (rectangle3 == null) {
                                                                return;
                                                            }
                                                            treePath2 = treePath3.getParentPath();
                                                        }
                                                        treePath4 = treePath2;
                                                        if (string == null) break block31;
                                                        if (treePath4 == null) break block32;
                                                        k2 = this;
                                                        if (string == null) break block33;
                                                        treePath4 = k2.drawingCache.get(treePath2);
                                                    }
                                                    if (treePath4 == null) {
                                                        this.paintVerticalPartOfLeg(graphics2D, rectangle, insets, treePath2);
                                                        this.drawingCache.put(treePath2, Boolean.TRUE);
                                                    }
                                                    k2 = this;
                                                }
                                                k2.paintHorizontalPartOfLeg(graphics2D, rectangle, insets, rectangle3, treePath3, n11, bl2, bl3, bl4);
                                                if (string != null) break block34;
                                            }
                                            n13 = n12;
                                            if (string == null) break block35;
                                            if (n13 == 0) break block34;
                                            n13 = n11;
                                            if (string == null) break block35;
                                            if (n13 == 0) {
                                                this.paintHorizontalPartOfLeg(graphics2D, rectangle, insets, rectangle3, treePath3, n11, bl2, bl3, bl4);
                                            }
                                        }
                                        n13 = this.shouldPaintExpandControl(treePath3, n11, bl2, bl3, bl4) ? 1 : 0;
                                    }
                                    if (string == null) break block36;
                                    if (n13 != 0) {
                                        this.paintExpandControl(graphics2D, rectangle, insets, rectangle3, treePath3, n11, bl2, bl3, bl4);
                                    }
                                    this.paintRow(graphics2D, rectangle, insets, rectangle3, treePath3, n11, bl2, bl3, bl4);
                                    if (string == null) break block37;
                                    n13 = rectangle3.y + rectangle3.height;
                                }
                                if (n13 < n10) break block38;
                                bl = true;
                                if (string != null) break block38;
                            }
                            bl = true;
                        }
                        ++n11;
                    }
                    if (string != null) continue;
                }
            }
            this.rendererPane.removeAll();
        }
    }

    protected void o(Graphics2D graphics2D) {
        block3: {
            Color[] colorArray;
            Serializable serializable;
            K k2;
            TreePath treePath;
            block4: {
                block5: {
                    JTree.DropLocation dropLocation;
                    String string;
                    JTree.DropLocation dropLocation2;
                    block2: {
                        dropLocation2 = this.tree.getDropLocation();
                        string = com.m.s.d();
                        dropLocation = dropLocation2;
                        if (string == null) break block2;
                        if (dropLocation == null) break block3;
                        dropLocation = dropLocation2;
                    }
                    treePath = dropLocation.getPath();
                    k2 = this;
                    if (string == null) break block4;
                    if (!k2.isDropLine(dropLocation2)) break block5;
                    serializable = (Color)cy_1.i;
                    colorArray = new Color[]{serializable, serializable, serializable, serializable};
                    Rectangle rectangle = this.getDropLineRect(dropLocation2);
                    graphics2D.setPaint(new LinearGradientPaint(rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y, V, colorArray));
                    graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, 2);
                    if (string != null) break block3;
                }
                k2 = this;
            }
            serializable = k2.p(treePath);
            colorArray = fk_0.I(this.B, this.T, 1.0f);
            colorArray.n(graphics2D, (Rectangle)serializable);
        }
    }

    protected Rectangle p(TreePath treePath) {
        Rectangle rectangle = this.tree.getPathBounds(treePath);
        rectangle.x -= this.B;
        rectangle.y -= this.B;
        rectangle.width += this.B * 2;
        rectangle.height += this.B * 2;
        return rectangle;
    }

    protected void D(Graphics2D graphics2D) {
        block3: {
            Object object;
            block5: {
                String string;
                block4: {
                    K k2;
                    block2: {
                        string = com.m.s.d();
                        k2 = this;
                        if (string == null) break block2;
                        if (!k2.y()) break block3;
                        k2 = this;
                    }
                    object = k2.n;
                    if (string == null) break block4;
                    if (object == null) break block3;
                    object = this.q;
                }
                if (string == null) break block5;
                if (object == null) break block3;
                object = RV.X(graphics2D);
            }
            Point point = object;
            Stroke stroke = RV.M(graphics2D, this.z);
            Rectangle rectangle = rv_2.t(new Point[]{this.n, this.q});
            Rectangle rectangle2 = rectangle.intersection(FN.N(this.tree));
            --rectangle2.width;
            --rectangle2.height;
            graphics2D.setPaint(this.W);
            graphics2D.fill(this.B(rectangle2, true));
            graphics2D.setPaint(this.m);
            graphics2D.draw(this.B(rectangle2, false));
            RV.p(graphics2D, stroke);
            RV.X(graphics2D, point);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean isDropLine(JTree.DropLocation dropLocation) {
        String string = com.m.s.d();
        JTree.DropLocation dropLocation2 = dropLocation;
        if (string != null) {
            if (dropLocation2 == null) return 0 != 0;
            dropLocation2 = dropLocation;
        }
        if (string != null) {
            if (dropLocation2.getPath() == null) return 0 != 0;
            dropLocation2 = dropLocation;
        }
        int n10 = dropLocation2.getChildIndex();
        if (string == null) return n10 != 0;
        if (n10 == -1) return 0 != 0;
        return 1 != 0;
    }

    @Override
    protected Rectangle getDropLineRect(JTree.DropLocation dropLocation) {
        int n10;
        Rectangle rectangle;
        String string;
        block26: {
            block19: {
                int n11;
                Rectangle rectangle2;
                DefaultMutableTreeNode defaultMutableTreeNode;
                Serializable serializable;
                Serializable serializable2;
                Point point;
                boolean bl;
                block27: {
                    DefaultMutableTreeNode defaultMutableTreeNode2;
                    block25: {
                        TreeModel treeModel;
                        int n12;
                        TreePath treePath;
                        block20: {
                            block23: {
                                Object object;
                                block24: {
                                    int n13;
                                    block21: {
                                        block22: {
                                            K k2;
                                            block17: {
                                                block18: {
                                                    bl = false;
                                                    treePath = dropLocation.getPath();
                                                    n12 = dropLocation.getChildIndex();
                                                    point = dropLocation.getDropPoint();
                                                    TreePath treePath2 = dropLocation.getPath();
                                                    int n14 = dropLocation.getChildIndex();
                                                    string = com.m.s.d();
                                                    Insets insets = this.tree.getInsets();
                                                    k2 = this;
                                                    if (string == null) break block17;
                                                    if (k2.tree.getRowCount() != 0) break block18;
                                                    rectangle = new Rectangle(insets.left, insets.top, this.tree.getWidth() - insets.left - insets.right, 0);
                                                    if (string != null) break block19;
                                                }
                                                k2 = this;
                                            }
                                            treeModel = k2.getModel();
                                            object = treeModel.getRoot();
                                            if (treePath.getLastPathComponent() != object || n12 < treeModel.getChildCount(object)) break block20;
                                            rectangle = this.tree.getRowBounds(this.tree.getRowCount() - 1);
                                            rectangle.y += rectangle.height;
                                            n13 = this.tree.isRootVisible();
                                            if (string == null) break block21;
                                            if (n13 != 0) break block22;
                                            serializable2 = this.tree.getRowBounds(0);
                                            if (string != null) break block23;
                                        }
                                        n13 = treeModel.getChildCount(object);
                                    }
                                    if (n13 != 0) break block24;
                                    serializable2 = this.tree.getRowBounds(0);
                                    ((Rectangle)serializable2).x += this.totalChildIndent;
                                    ((Rectangle)serializable2).width -= this.totalChildIndent + this.totalChildIndent;
                                    if (string != null) break block23;
                                }
                                serializable = treePath.pathByAddingChild(treeModel.getChild(object, treeModel.getChildCount(object) - 1));
                                serializable2 = this.tree.getPathBounds((TreePath)serializable);
                            }
                            rectangle.x = ((Rectangle)serializable2).x;
                            rectangle.width = ((Rectangle)serializable2).width;
                            if (string != null) break block25;
                        }
                        rectangle = this.tree.getPathBounds(treePath.pathByAddingChild(treeModel.getChild(treePath.getLastPathComponent(), n12)));
                    }
                    n10 = this.tree.getClass().equals(aJ.class) ? 1 : 0;
                    if (string == null) break block26;
                    if (n10 == 0) break block19;
                    serializable2 = (aJ)this.tree;
                    try {
                        defaultMutableTreeNode2 = (DefaultMutableTreeNode)serializable2.p(point);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    defaultMutableTreeNode = this.F = defaultMutableTreeNode2;
                    if (string == null) break block27;
                    if (defaultMutableTreeNode == null) break block19;
                    defaultMutableTreeNode = (DefaultMutableTreeNode)this.F.getParent();
                }
                serializable = defaultMutableTreeNode;
                Object object = this.F.getUserObject();
                try {
                    rectangle2 = (Rectangle)serializable2.f(this.F);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                Rectangle rectangle3 = rectangle2;
                n10 = ((DefaultMutableTreeNode)serializable).getIndex(this.F);
                if (string == null) break block26;
                if (n10 != ((DefaultMutableTreeNode)serializable).getChildCount() - 1) break block19;
                n10 = n11 = (int)(rectangle.getY() - point.getY());
                if (string == null) break block26;
                if (n10 > com.m.K.a(27214, 6436223661878302189L)) break block19;
                n10 = n11;
                if (string == null) break block26;
                if (n10 > 0) {
                    rectangle.x = rectangle3.x;
                    bl = true;
                }
            }
            n10 = --rectangle.y;
        }
        if (string != null) {
            if (n10 != 0) {
                --rectangle.y;
            }
            n10 = this.k ? 1 : 0;
        }
        if (n10 == 0) {
            rectangle.x = rectangle.x + rectangle.width - com.m.K.a(18770, 2251216943926441718L);
        }
        rectangle.width = com.m.K.a(23310, 4762121926665331880L);
        rectangle.height = 5;
        return rectangle;
    }

    protected Rectangle A(TreePath treePath, Insets insets, Rectangle rectangle) {
        Rectangle rectangle2;
        block2: {
            block3: {
                block5: {
                    block4: {
                        rectangle = this.treeState.getBounds(treePath, rectangle);
                        String string = com.m.s.d();
                        rectangle2 = rectangle;
                        if (string == null) break block2;
                        if (rectangle2 == null) break block3;
                        if (!this.k) break block4;
                        rectangle.x += insets.left;
                        if (string != null) break block5;
                    }
                    rectangle.x = this.tree.getWidth() - (rectangle.x + rectangle.width) - insets.right;
                }
                rectangle.y += insets.top;
            }
            rectangle2 = rectangle;
        }
        return rectangle2;
    }

    protected Shape B(Rectangle rectangle, boolean bl) {
        int n10;
        String string = com.m.s.d();
        int n11 = bl;
        if (string != null) {
            n11 = n10 = n11 != 0 ? 1 : 0;
        }
        if (this.I > 0) {
            return new RoundRectangle2D.Double(rectangle.x + n10, rectangle.y + n10, rectangle.width - n10, rectangle.height - n10, this.I * 2, this.I * 2);
        }
        return new Rectangle2D.Double(rectangle.x + n10, rectangle.y + n10, rectangle.width - n10, rectangle.height - n10);
    }

    public DefaultMutableTreeNode n() {
        return this.F;
    }

    static JTree l(K k2) {
        return k2.tree;
    }

    static JTree B(K k2) {
        return k2.tree;
    }

    static JTree K(K k2) {
        return k2.tree;
    }

    static JTree V(K k2) {
        return k2.tree;
    }

    static JTree h(K k2) {
        return k2.tree;
    }

    static JTree x(K k2) {
        return k2.tree;
    }

    static JTree r(K k2) {
        return k2.tree;
    }

    static boolean i(K k2, TreePath treePath, int n10, int n11) {
        return k2.isLocationInExpandControl(treePath, n10, n11);
    }

    static JTree f(K k2) {
        return k2.tree;
    }

    static int g(K k2, int n10, int n11) {
        return k2.getRowX(n10, n11);
    }

    static JTree s(K k2) {
        return k2.tree;
    }

    static JTree b(K k2) {
        return k2.tree;
    }

    static JTree w(K k2) {
        return k2.tree;
    }

    static JTree E(K k2) {
        return k2.tree;
    }

    static JTree k(K k2) {
        return k2.tree;
    }

    static boolean K(K k2, TreePath treePath, int n10, int n11) {
        return k2.isLocationInExpandControl(treePath, n10, n11);
    }

    static JTree U(K k2) {
        return k2.tree;
    }

    static JTree g(K k2) {
        return k2.tree;
    }

    static JTree L(K k2) {
        return k2.tree;
    }

    static JTree C(K k2) {
        return k2.tree;
    }

    static JTree e(K k2) {
        return k2.tree;
    }

    static JTree D(K k2) {
        return k2.tree;
    }

    static JTree F(K k2) {
        return k2.tree;
    }

    static JTree R(K k2) {
        return k2.tree;
    }

    static JTree t(K k2) {
        return k2.tree;
    }

    static JTree v(K k2) {
        return k2.tree;
    }

    static JTree Y(K k2) {
        return k2.tree;
    }

    static JTree n(K k2) {
        return k2.tree;
    }

    static JTree j(K k2) {
        return k2.tree;
    }

    static JTree y(K k2) {
        return k2.tree;
    }

    static JTree I(K k2) {
        return k2.tree;
    }

    static JTree p(K k2) {
        return k2.tree;
    }

    static JTree a(K k2) {
        return k2.tree;
    }

    static JTree H(K k2) {
        return k2.tree;
    }

    static JTree G(K k2) {
        return k2.tree;
    }

    static JTree i(K k2) {
        return k2.tree;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[10];
                        var11_1 = 0;
                        var10_2 = "\"\u00e8\u008eH\u008b\u00a4\u000f\u00f4\u00a6\u0091`\b\u0013\u001a\u0094\u00de\u00f6\u00f6\f\u00e1\u00afZ\u008d.\u0081c\u00163\u0007\u00c7a\u0013\u00b1-\u00f0]\u00c8z@\u00d5\u0091t\u009fn\u00b0?|\u00d3\u0089\u0083'\f\t\u00dfG\u0083\u008d@\u0017.\u00bd\u0000\u0016\u0081\u0012^\u00e0\u0001Iz\u00841\u00f0a\u0011\u0098\u0018\f\u0018w\u009e\u008a\u00fe\u0010y\u00d2\u00e5\u000f\u00e6L\u00a4\u00fe\t(\u0005\u0087\fh\u00c10\u0010~\u00c4\u0005\u00cd\u00fa\u0014'\u00f5yI\u000b\u00ab\u00cd\u00ed\u00f9\u0080\u0014\u001c\u00ac\u0000S\u0004[gcua\u0012H:#?\u0082\u0088@/\u0003";
                        var12_3 = "\"\u00e8\u008eH\u008b\u00a4\u000f\u00f4\u00a6\u0091`\b\u0013\u001a\u0094\u00de\u00f6\u00f6\f\u00e1\u00afZ\u008d.\u0081c\u00163\u0007\u00c7a\u0013\u00b1-\u00f0]\u00c8z@\u00d5\u0091t\u009fn\u00b0?|\u00d3\u0089\u0083'\f\t\u00dfG\u0083\u008d@\u0017.\u00bd\u0000\u0016\u0081\u0012^\u00e0\u0001Iz\u00841\u00f0a\u0011\u0098\u0018\f\u0018w\u009e\u008a\u00fe\u0010y\u00d2\u00e5\u000f\u00e6L\u00a4\u00fe\t(\u0005\u0087\fh\u00c10\u0010~\u00c4\u0005\u00cd\u00fa\u0014'\u00f5yI\u000b\u00ab\u00cd\u00ed\u00f9\u0080\u0014\u001c\u00ac\u0000S\u0004[gcua\u0012H:#?\u0082\u0088@/\u0003".length();
                        var9_4 = 18;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 62;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u0002\u00df<\u00c2|\u0096\u0097%\u0094V\u00d1Q\u00bd\u00ff0\u00e6\u00963\u0013\u0092\u000e\u00e9\u00c0\b\u00b2\u00a4\u0004\u0004\u001f\b\u000bf\u00bf\u0097\u0011";
                            var12_3 = "\u0002\u00df<\u00c2|\u0096\u0097%\u0094V\u00d1Q\u00bd\u00ff0\u00e6\u00963\u0013\u0092\u000e\u00e9\u00c0\b\u00b2\u00a4\u0004\u0004\u001f\b\u000bf\u00bf\u0097\u0011".length();
                            var9_4 = 20;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 107;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 27;
                                    break;
                                }
                                case 1: {
                                    v15 = 22;
                                    break;
                                }
                                case 2: {
                                    v15 = 123;
                                    break;
                                }
                                case 3: {
                                    v15 = 15;
                                    break;
                                }
                                case 4: {
                                    v15 = 61;
                                    break;
                                }
                                case 5: {
                                    v15 = 57;
                                    break;
                                }
                                default: {
                                    v15 = 94;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                com.m.K.c = var13;
                com.m.K.e = new String[10];
                var0_7 = 894154647333599132L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = "&\u00d5\u0087\u00d6\u00eeio\u0099\u00aeK\u000e\u00ca\u001f\u0086\u0001:6\u009d\u00e1e\u00db\u00a4/\u00c5\u009c\u0015\u00c8\u00d3Gi\u0013L\u00ed\u00f3\u00cc\u0094><T#";
                var5_11 = "&\u00d5\u0087\u00d6\u00eeio\u0099\u00aeK\u000e\u00ca\u001f\u0086\u0001:6\u009d\u00e1e\u00db\u00a4/\u00c5\u009c\u0015\u00c8\u00d3Gi\u0013L\u00ed\u00f3\u00cc\u0094><T#".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "[\u009b\u0082W>\u00db\u00b20.\u00f3\u00c6\u000b\u00f5\u00ad\"{";
                    var5_11 = "[\u009b\u0082W>\u00db\u00b20.\u00f3\u00c6\u000b\u00f5\u00ad\"{".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        com.m.K.f = var6_8;
        com.m.K.j = new Integer[7];
        com.m.K.x = new ImageIcon(K.class.getResource(com.m.K.a(-5996, 17896)));
        com.m.K.y = new ImageIcon(K.class.getResource(com.m.K.a(-5994, 27345)));
        com.m.K.t = xg_0.J(com.m.K.x);
        com.m.K.l = xg_0.J(com.m.K.y);
        com.m.K.E = new ImageIcon(K.class.getResource(com.m.K.a(-5989, 9784)));
        com.m.K.w = new ImageIcon(K.class.getResource(com.m.K.a(-5993, 2469)));
        com.m.K.a = new ImageIcon(K.class.getResource(com.m.K.a(-5998, -17273)));
        com.m.K.s = new ImageIcon(K.class.getResource(com.m.K.a(-5998, -17273)));
        com.m.K.V = new float[]{0.0f, 0.25f, 0.75f, 1.0f};
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE892) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 186;
                    break;
                }
                case 1: {
                    n14 = 122;
                    break;
                }
                case 2: {
                    n14 = 69;
                    break;
                }
                case 3: {
                    n14 = 125;
                    break;
                }
                case 4: {
                    n14 = 144;
                    break;
                }
                case 5: {
                    n14 = 161;
                    break;
                }
                case 6: {
                    n14 = 173;
                    break;
                }
                case 7: {
                    n14 = 25;
                    break;
                }
                case 8: {
                    n14 = 160;
                    break;
                }
                case 9: {
                    n14 = 133;
                    break;
                }
                case 10: {
                    n14 = 214;
                    break;
                }
                case 11: {
                    n14 = 46;
                    break;
                }
                case 12: {
                    n14 = 130;
                    break;
                }
                case 13: {
                    n14 = 128;
                    break;
                }
                case 14: {
                    n14 = 18;
                    break;
                }
                case 15: {
                    n14 = 59;
                    break;
                }
                case 16: {
                    n14 = 99;
                    break;
                }
                case 17: {
                    n14 = 22;
                    break;
                }
                case 18: {
                    n14 = 45;
                    break;
                }
                case 19: {
                    n14 = 111;
                    break;
                }
                case 20: {
                    n14 = 79;
                    break;
                }
                case 21: {
                    n14 = 171;
                    break;
                }
                case 22: {
                    n14 = 107;
                    break;
                }
                case 23: {
                    n14 = 90;
                    break;
                }
                case 24: {
                    n14 = 142;
                    break;
                }
                case 25: {
                    n14 = 132;
                    break;
                }
                case 26: {
                    n14 = 236;
                    break;
                }
                case 27: {
                    n14 = 141;
                    break;
                }
                case 28: {
                    n14 = 172;
                    break;
                }
                case 29: {
                    n14 = 203;
                    break;
                }
                case 30: {
                    n14 = 53;
                    break;
                }
                case 31: {
                    n14 = 115;
                    break;
                }
                case 32: {
                    n14 = 81;
                    break;
                }
                case 33: {
                    n14 = 64;
                    break;
                }
                case 34: {
                    n14 = 120;
                    break;
                }
                case 35: {
                    n14 = 252;
                    break;
                }
                case 36: {
                    n14 = 47;
                    break;
                }
                case 37: {
                    n14 = 92;
                    break;
                }
                case 38: {
                    n14 = 165;
                    break;
                }
                case 39: {
                    n14 = 14;
                    break;
                }
                case 40: {
                    n14 = 234;
                    break;
                }
                case 41: {
                    n14 = 26;
                    break;
                }
                case 42: {
                    n14 = 66;
                    break;
                }
                case 43: {
                    n14 = 136;
                    break;
                }
                case 44: {
                    n14 = 190;
                    break;
                }
                case 45: {
                    n14 = 57;
                    break;
                }
                case 46: {
                    n14 = 180;
                    break;
                }
                case 47: {
                    n14 = 102;
                    break;
                }
                case 48: {
                    n14 = 118;
                    break;
                }
                case 49: {
                    n14 = 226;
                    break;
                }
                case 50: {
                    n14 = 36;
                    break;
                }
                case 51: {
                    n14 = 106;
                    break;
                }
                case 52: {
                    n14 = 210;
                    break;
                }
                case 53: {
                    n14 = 24;
                    break;
                }
                case 54: {
                    n14 = 193;
                    break;
                }
                case 55: {
                    n14 = 137;
                    break;
                }
                case 56: {
                    n14 = 149;
                    break;
                }
                case 57: {
                    n14 = 16;
                    break;
                }
                case 58: {
                    n14 = 93;
                    break;
                }
                case 59: {
                    n14 = 228;
                    break;
                }
                case 60: {
                    n14 = 218;
                    break;
                }
                case 61: {
                    n14 = 89;
                    break;
                }
                case 62: {
                    n14 = 162;
                    break;
                }
                case 63: {
                    n14 = 60;
                    break;
                }
                case 64: {
                    n14 = 188;
                    break;
                }
                case 65: {
                    n14 = 147;
                    break;
                }
                case 66: {
                    n14 = 243;
                    break;
                }
                case 67: {
                    n14 = 134;
                    break;
                }
                case 68: {
                    n14 = 159;
                    break;
                }
                case 69: {
                    n14 = 85;
                    break;
                }
                case 70: {
                    n14 = 114;
                    break;
                }
                case 71: {
                    n14 = 174;
                    break;
                }
                case 72: {
                    n14 = 241;
                    break;
                }
                case 73: {
                    n14 = 1;
                    break;
                }
                case 74: {
                    n14 = 225;
                    break;
                }
                case 75: {
                    n14 = 140;
                    break;
                }
                case 76: {
                    n14 = 37;
                    break;
                }
                case 77: {
                    n14 = 41;
                    break;
                }
                case 78: {
                    n14 = 135;
                    break;
                }
                case 79: {
                    n14 = 197;
                    break;
                }
                case 80: {
                    n14 = 238;
                    break;
                }
                case 81: {
                    n14 = 213;
                    break;
                }
                case 82: {
                    n14 = 97;
                    break;
                }
                case 83: {
                    n14 = 30;
                    break;
                }
                case 84: {
                    n14 = 139;
                    break;
                }
                case 85: {
                    n14 = 119;
                    break;
                }
                case 86: {
                    n14 = 148;
                    break;
                }
                case 87: {
                    n14 = 78;
                    break;
                }
                case 88: {
                    n14 = 167;
                    break;
                }
                case 89: {
                    n14 = 23;
                    break;
                }
                case 90: {
                    n14 = 33;
                    break;
                }
                case 91: {
                    n14 = 182;
                    break;
                }
                case 92: {
                    n14 = 112;
                    break;
                }
                case 93: {
                    n14 = 204;
                    break;
                }
                case 94: {
                    n14 = 207;
                    break;
                }
                case 95: {
                    n14 = 245;
                    break;
                }
                case 96: {
                    n14 = 101;
                    break;
                }
                case 97: {
                    n14 = 123;
                    break;
                }
                case 98: {
                    n14 = 150;
                    break;
                }
                case 99: {
                    n14 = 138;
                    break;
                }
                case 100: {
                    n14 = 110;
                    break;
                }
                case 101: {
                    n14 = 84;
                    break;
                }
                case 102: {
                    n14 = 201;
                    break;
                }
                case 103: {
                    n14 = 38;
                    break;
                }
                case 104: {
                    n14 = 40;
                    break;
                }
                case 105: {
                    n14 = 212;
                    break;
                }
                case 106: {
                    n14 = 216;
                    break;
                }
                case 107: {
                    n14 = 34;
                    break;
                }
                case 108: {
                    n14 = 244;
                    break;
                }
                case 109: {
                    n14 = 95;
                    break;
                }
                case 110: {
                    n14 = 223;
                    break;
                }
                case 111: {
                    n14 = 55;
                    break;
                }
                case 112: {
                    n14 = 124;
                    break;
                }
                case 113: {
                    n14 = 6;
                    break;
                }
                case 114: {
                    n14 = 129;
                    break;
                }
                case 115: {
                    n14 = 88;
                    break;
                }
                case 116: {
                    n14 = 98;
                    break;
                }
                case 117: {
                    n14 = 170;
                    break;
                }
                case 118: {
                    n14 = 251;
                    break;
                }
                case 119: {
                    n14 = 113;
                    break;
                }
                case 120: {
                    n14 = 250;
                    break;
                }
                case 121: {
                    n14 = 96;
                    break;
                }
                case 122: {
                    n14 = 58;
                    break;
                }
                case 123: {
                    n14 = 191;
                    break;
                }
                case 124: {
                    n14 = 83;
                    break;
                }
                case 125: {
                    n14 = 80;
                    break;
                }
                case 126: {
                    n14 = 183;
                    break;
                }
                case 127: {
                    n14 = 156;
                    break;
                }
                case 128: {
                    n14 = 209;
                    break;
                }
                case 129: {
                    n14 = 43;
                    break;
                }
                case 130: {
                    n14 = 12;
                    break;
                }
                case 131: {
                    n14 = 215;
                    break;
                }
                case 132: {
                    n14 = 239;
                    break;
                }
                case 133: {
                    n14 = 199;
                    break;
                }
                case 134: {
                    n14 = 2;
                    break;
                }
                case 135: {
                    n14 = 3;
                    break;
                }
                case 136: {
                    n14 = 146;
                    break;
                }
                case 137: {
                    n14 = 254;
                    break;
                }
                case 138: {
                    n14 = 177;
                    break;
                }
                case 139: {
                    n14 = 179;
                    break;
                }
                case 140: {
                    n14 = 211;
                    break;
                }
                case 141: {
                    n14 = 20;
                    break;
                }
                case 142: {
                    n14 = 152;
                    break;
                }
                case 143: {
                    n14 = 221;
                    break;
                }
                case 144: {
                    n14 = 17;
                    break;
                }
                case 145: {
                    n14 = 246;
                    break;
                }
                case 146: {
                    n14 = 8;
                    break;
                }
                case 147: {
                    n14 = 208;
                    break;
                }
                case 148: {
                    n14 = 181;
                    break;
                }
                case 149: {
                    n14 = 44;
                    break;
                }
                case 150: {
                    n14 = 21;
                    break;
                }
                case 151: {
                    n14 = 82;
                    break;
                }
                case 152: {
                    n14 = 247;
                    break;
                }
                case 153: {
                    n14 = 72;
                    break;
                }
                case 154: {
                    n14 = 70;
                    break;
                }
                case 155: {
                    n14 = 178;
                    break;
                }
                case 156: {
                    n14 = 253;
                    break;
                }
                case 157: {
                    n14 = 155;
                    break;
                }
                case 158: {
                    n14 = 242;
                    break;
                }
                case 159: {
                    n14 = 200;
                    break;
                }
                case 160: {
                    n14 = 15;
                    break;
                }
                case 161: {
                    n14 = 255;
                    break;
                }
                case 162: {
                    n14 = 28;
                    break;
                }
                case 163: {
                    n14 = 65;
                    break;
                }
                case 164: {
                    n14 = 10;
                    break;
                }
                case 165: {
                    n14 = 103;
                    break;
                }
                case 166: {
                    n14 = 9;
                    break;
                }
                case 167: {
                    n14 = 77;
                    break;
                }
                case 168: {
                    n14 = 153;
                    break;
                }
                case 169: {
                    n14 = 205;
                    break;
                }
                case 170: {
                    n14 = 154;
                    break;
                }
                case 171: {
                    n14 = 175;
                    break;
                }
                case 172: {
                    n14 = 29;
                    break;
                }
                case 173: {
                    n14 = 249;
                    break;
                }
                case 174: {
                    n14 = 219;
                    break;
                }
                case 175: {
                    n14 = 220;
                    break;
                }
                case 176: {
                    n14 = 73;
                    break;
                }
                case 177: {
                    n14 = 42;
                    break;
                }
                case 178: {
                    n14 = 198;
                    break;
                }
                case 179: {
                    n14 = 74;
                    break;
                }
                case 180: {
                    n14 = 54;
                    break;
                }
                case 181: {
                    n14 = 168;
                    break;
                }
                case 182: {
                    n14 = 0;
                    break;
                }
                case 183: {
                    n14 = 196;
                    break;
                }
                case 184: {
                    n14 = 109;
                    break;
                }
                case 185: {
                    n14 = 4;
                    break;
                }
                case 186: {
                    n14 = 108;
                    break;
                }
                case 187: {
                    n14 = 71;
                    break;
                }
                case 188: {
                    n14 = 222;
                    break;
                }
                case 189: {
                    n14 = 185;
                    break;
                }
                case 190: {
                    n14 = 35;
                    break;
                }
                case 191: {
                    n14 = 39;
                    break;
                }
                case 192: {
                    n14 = 248;
                    break;
                }
                case 193: {
                    n14 = 7;
                    break;
                }
                case 194: {
                    n14 = 27;
                    break;
                }
                case 195: {
                    n14 = 75;
                    break;
                }
                case 196: {
                    n14 = 116;
                    break;
                }
                case 197: {
                    n14 = 62;
                    break;
                }
                case 198: {
                    n14 = 86;
                    break;
                }
                case 199: {
                    n14 = 126;
                    break;
                }
                case 200: {
                    n14 = 19;
                    break;
                }
                case 201: {
                    n14 = 227;
                    break;
                }
                case 202: {
                    n14 = 50;
                    break;
                }
                case 203: {
                    n14 = 145;
                    break;
                }
                case 204: {
                    n14 = 187;
                    break;
                }
                case 205: {
                    n14 = 105;
                    break;
                }
                case 206: {
                    n14 = 192;
                    break;
                }
                case 207: {
                    n14 = 217;
                    break;
                }
                case 208: {
                    n14 = 5;
                    break;
                }
                case 209: {
                    n14 = 230;
                    break;
                }
                case 210: {
                    n14 = 56;
                    break;
                }
                case 211: {
                    n14 = 194;
                    break;
                }
                case 212: {
                    n14 = 206;
                    break;
                }
                case 213: {
                    n14 = 176;
                    break;
                }
                case 214: {
                    n14 = 235;
                    break;
                }
                case 215: {
                    n14 = 32;
                    break;
                }
                case 216: {
                    n14 = 51;
                    break;
                }
                case 217: {
                    n14 = 163;
                    break;
                }
                case 218: {
                    n14 = 100;
                    break;
                }
                case 219: {
                    n14 = 13;
                    break;
                }
                case 220: {
                    n14 = 143;
                    break;
                }
                case 221: {
                    n14 = 157;
                    break;
                }
                case 222: {
                    n14 = 224;
                    break;
                }
                case 223: {
                    n14 = 52;
                    break;
                }
                case 224: {
                    n14 = 94;
                    break;
                }
                case 225: {
                    n14 = 240;
                    break;
                }
                case 226: {
                    n14 = 229;
                    break;
                }
                case 227: {
                    n14 = 232;
                    break;
                }
                case 228: {
                    n14 = 91;
                    break;
                }
                case 229: {
                    n14 = 127;
                    break;
                }
                case 230: {
                    n14 = 121;
                    break;
                }
                case 231: {
                    n14 = 166;
                    break;
                }
                case 232: {
                    n14 = 231;
                    break;
                }
                case 233: {
                    n14 = 68;
                    break;
                }
                case 234: {
                    n14 = 63;
                    break;
                }
                case 235: {
                    n14 = 61;
                    break;
                }
                case 236: {
                    n14 = 49;
                    break;
                }
                case 237: {
                    n14 = 104;
                    break;
                }
                case 238: {
                    n14 = 184;
                    break;
                }
                case 239: {
                    n14 = 164;
                    break;
                }
                case 240: {
                    n14 = 233;
                    break;
                }
                case 241: {
                    n14 = 189;
                    break;
                }
                case 242: {
                    n14 = 195;
                    break;
                }
                case 243: {
                    n14 = 76;
                    break;
                }
                case 244: {
                    n14 = 87;
                    break;
                }
                case 245: {
                    n14 = 48;
                    break;
                }
                case 246: {
                    n14 = 31;
                    break;
                }
                case 247: {
                    n14 = 131;
                    break;
                }
                case 248: {
                    n14 = 11;
                    break;
                }
                case 249: {
                    n14 = 237;
                    break;
                }
                case 250: {
                    n14 = 67;
                    break;
                }
                case 251: {
                    n14 = 169;
                    break;
                }
                case 252: {
                    n14 = 202;
                    break;
                }
                case 253: {
                    n14 = 151;
                    break;
                }
                case 254: {
                    n14 = 117;
                    break;
                }
                default: {
                    n14 = 158;
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
            com.m.K.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3FA5;
        if (j[n11] == null) {
            com.m.K.j[n11] = (int)(f[n11] ^ l2);
        }
        return j[n11];
    }
}

