/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class zJ
implements TreeSelectionListener {
    final kl_2 H;
    final a3 b;

    zJ(a3 a32, kl_2 kl_22) {
        this.b = a32;
        this.H = kl_22;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        block18: {
            Object object;
            a3 a32;
            tf_2 tf_22;
            block20: {
                boolean bl;
                Object object2;
                Object object3;
                int[] nArray;
                block19: {
                    Object object4;
                    block17: {
                        TreePath treePath;
                        block16: {
                            TableCellEditor tableCellEditor;
                            block15: {
                                int[] nArray2 = a3.I();
                                this.b.k = System.currentTimeMillis();
                                nArray = nArray2;
                                treePath = ((a3)this.b).getSelectionPath();
                                tableCellEditor = ((km_0)this.b.h).getCellEditor();
                                if (nArray == null) break block15;
                                if (tableCellEditor == null) break block16;
                                tableCellEditor = ((km_0)this.b.h).getCellEditor();
                            }
                            tableCellEditor.stopCellEditing();
                        }
                        object4 = treePath;
                        if (nArray == null) break block17;
                        if (object4 == null) break block18;
                        object4 = treePath.getLastPathComponent();
                    }
                    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)object4;
                    object3 = defaultMutableTreeNode.getUserObject().getClass();
                    if (nArray == null) break block19;
                    if (!object3.equals(tf_2.class)) break block18;
                    object3 = defaultMutableTreeNode.getUserObject();
                }
                tf_22 = (tf_2)object3;
                try {
                    this.b.h.C(0);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.H.O(tf_22);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                a32 = (a3)this.b;
                if (nArray == null) break block20;
                try {
                    object2 = tf_22.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                a32.t = object2;
                try {
                    bl = (Boolean)tf_22.z();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (bl) break block18;
                a32 = (a3)this.b;
            }
            try {
                object = tf_22.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                a32.o.T(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

