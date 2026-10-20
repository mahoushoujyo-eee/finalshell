/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class VY
implements MouseListener {
    final a3 y;
    private static final long a;

    VY(a3 a32) {
        this.y = a32;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block7: {
            long l2;
            long l3;
            block8: {
                int n10;
                int n11;
                int[] nArray;
                block6: {
                    int n12;
                    try {
                        n12 = (Integer)this.y.p(mouseEvent.getPoint());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    int n13 = n12;
                    nArray = a3.I();
                    this.y.s = ((a3)this.y.K).getPathForRow(n13);
                    n11 = n13;
                    n10 = -1;
                    if (nArray == null) break block6;
                    if (n11 == n10) break block7;
                    n11 = mouseEvent.getClickCount();
                    n10 = 1;
                }
                if (n11 != n10) break block7;
                long l4 = System.currentTimeMillis() - this.y.m;
                long l5 = l4 - a;
                l3 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                if (nArray == null) break block8;
                if (l3 <= 0) break block7;
                l3 = ((a3)this.y.K).getSelectionCount();
            }
            if ((l2 = l3) == true) {
                this.y.U = true;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block45: {
            Object object;
            Serializable serializable;
            DefaultMutableTreeNode defaultMutableTreeNode;
            TreePath treePath;
            a3 a32;
            block57: {
                int n10;
                int n11;
                block46: {
                    block53: {
                        int[] nArray;
                        block47: {
                            TreePath treePath2;
                            a3 a33;
                            block55: {
                                block56: {
                                    int n12;
                                    block54: {
                                        TreePath treePath3;
                                        DefaultMutableTreeNode defaultMutableTreeNode2;
                                        block49: {
                                            block50: {
                                                block52: {
                                                    int n13;
                                                    int n14;
                                                    block51: {
                                                        Object object2;
                                                        block48: {
                                                            Object object3;
                                                            block44: {
                                                                int n15;
                                                                nArray = a3.I();
                                                                a3 a34 = (a3)this.y;
                                                                if (nArray != null) {
                                                                    if (a34.U) {
                                                                        this.y.U = false;
                                                                    }
                                                                    a34 = (a3)mouseEvent.getSource();
                                                                }
                                                                a32 = a34;
                                                                try {
                                                                    n15 = (Integer)this.y.p(mouseEvent.getPoint());
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                n12 = n15;
                                                                treePath = a32.getPathForRow(n12);
                                                                object3 = treePath;
                                                                if (nArray == null) break block44;
                                                                if (object3 == null) break block45;
                                                                object3 = treePath.getLastPathComponent();
                                                            }
                                                            defaultMutableTreeNode = (DefaultMutableTreeNode)object3;
                                                            defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getParent();
                                                            n11 = mouseEvent.getButton();
                                                            n10 = 1;
                                                            if (nArray == null) break block46;
                                                            if (n11 != n10) break block47;
                                                            object2 = defaultMutableTreeNode;
                                                            if (nArray == null) break block48;
                                                            if (object2 == null) break block47;
                                                            object2 = defaultMutableTreeNode.getUserObject();
                                                        }
                                                        n11 = object2.getClass().equals(ck_2.class) ? 1 : 0;
                                                        if (nArray == null) break block49;
                                                        if (n11 == 0) break block50;
                                                        serializable = (ck_2)defaultMutableTreeNode.getUserObject();
                                                        n14 = mouseEvent.getClickCount();
                                                        n13 = 2;
                                                        if (nArray == null) break block51;
                                                        if (n14 == n13) break block52;
                                                        n14 = mouseEvent.getClickCount();
                                                        n13 = 1;
                                                    }
                                                    if (n14 == n13) {
                                                        // empty if block
                                                    }
                                                }
                                                if (nArray != null) break block47;
                                            }
                                            n11 = defaultMutableTreeNode.getUserObject().getClass().equals(tf_2.class) ? 1 : 0;
                                        }
                                        if (nArray == null) break block53;
                                        if (n11 == 0) break block47;
                                        serializable = (tf_2)defaultMutableTreeNode.getUserObject();
                                        boolean bl = false;
                                        n11 = mouseEvent.getClickCount();
                                        if (nArray != null) {
                                            if (n11 == 2) {
                                                String string;
                                                bl = true;
                                                try {
                                                    string = (String)serializable.k();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                ((HashSet)this.y.T).add(string);
                                            }
                                            try {
                                                n11 = ((Boolean)a32.N(defaultMutableTreeNode)).booleanValue() ? 1 : 0;
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                        }
                                        if (nArray != null) {
                                            if (n11 != 0) {
                                                F6 f62;
                                                try {
                                                    this.y.s((Object)defaultMutableTreeNode2, (Object)serializable, (Object)treePath, null, true, true);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                try {
                                                    f62 = (F6)this.y.R();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (nArray != null) {
                                                    if (f62 != null) {
                                                        try {
                                                            f62 = (F6)this.y.R();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                } else {
                                                    Object object4;
                                                    try {
                                                        object4 = serializable.k();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        f62.H(object4, true);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                }
                                            }
                                            n11 = mouseEvent.getClickCount();
                                        }
                                        n10 = 2;
                                        if (nArray == null) break block46;
                                        if (n11 != n10) break block47;
                                        a33 = a32;
                                        if (nArray == null) break block54;
                                        try {
                                            treePath3 = (TreePath)a33.K(mouseEvent.getPoint());
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (treePath3 != null) break block47;
                                        a33 = a32;
                                    }
                                    treePath2 = treePath;
                                    if (nArray == null) break block55;
                                    if (!a33.isExpanded(treePath2)) break block56;
                                    a32.collapseRow(n12);
                                    if (nArray != null) break block47;
                                }
                                a33 = a32;
                                treePath2 = treePath;
                            }
                            a33.expandPath(treePath2);
                        }
                        object = mouseEvent;
                        if (nArray == null) break block57;
                        n11 = ((MouseEvent)object).getButton();
                    }
                    n10 = 3;
                }
                if (n11 != n10) break block45;
                object = defaultMutableTreeNode.getUserObject();
            }
            serializable = (tf_2)object;
            ((a3)this.y).stopEditing();
            if (this.y.j) {
                wx_0 wx_02 = new wx_0(a32, treePath, (tf_2)serializable, defaultMutableTreeNode);
                wx_02.show((Component)mouseEvent.getSource(), mouseEvent.getX(), mouseEvent.getY());
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.y.U = false;
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.y.U = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1350285597611114077L;
        a = 0x12BD2D98CEEFBE49L ^ l2;
    }
}

