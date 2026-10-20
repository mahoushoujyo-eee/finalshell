/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;

/*
 * Renamed from ol
 */
class ol_2
extends AbstractCellEditor
implements TreeCellEditor {
    dq_2 u;
    ChangeEvent E;
    JTree k;

    public ol_2(JTree jTree) {
        this.u = new dq_2();
        this.E = null;
        this.k = jTree;
    }

    @Override
    public Object getCellEditorValue() {
        JCheckBox jCheckBox;
        try {
            jCheckBox = (JCheckBox)this.u.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JCheckBox jCheckBox2 = jCheckBox;
        fp_0 fp_02 = new fp_0(jCheckBox2.getText(), jCheckBox2.isSelected());
        return fp_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean isCellEditable(EventObject eventObject) {
        boolean bl;
        boolean bl2;
        block6: {
            TreePath treePath;
            TreePath treePath2;
            String string;
            block8: {
                Object object;
                block7: {
                    bl2 = false;
                    string = aA.z();
                    bl = eventObject instanceof MouseEvent;
                    if (string != null) return bl;
                    if (!bl) break block6;
                    MouseEvent mouseEvent = (MouseEvent)eventObject;
                    TreePath treePath3 = ((JTree)this.k).getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                    object = treePath3;
                    if (string != null) break block7;
                    if (object == null) break block6;
                    object = treePath3.getLastPathComponent();
                }
                treePath = treePath2 = object;
                if (string != null) break block8;
                if (treePath == null) break block6;
                treePath = treePath2;
            }
            bl = treePath instanceof DefaultMutableTreeNode;
            if (string != null) return bl;
            if (bl) {
                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((Object)treePath2);
                Object object = defaultMutableTreeNode.getUserObject();
                boolean bl3 = defaultMutableTreeNode.isLeaf();
                if (string == null) {
                    if (!bl3) return false;
                    bl3 = object instanceof fp_0;
                }
                if (string == null) {
                    if (!bl3) return false;
                    return true;
                }
                bl2 = bl3;
            }
        }
        bl = bl2;
        return bl;
    }

    @Override
    public Component getTreeCellEditorComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10) {
        Component component;
        try {
            component = (Component)this.u.getTreeCellRendererComponent((Object)jTree, object, true, bl2, bl3, n10, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        Component component2 = component;
        W7 w7 = new W7(this);
        String string = aA.z();
        Component component3 = component2;
        if (string == null) {
            if (component3 instanceof JCheckBox) {
                ((JCheckBox)component2).addItemListener(w7);
            }
            component3 = component2;
        }
        return component3;
    }

    static void i(ol_2 ol_22) {
        ol_22.fireEditingStopped();
    }
}

