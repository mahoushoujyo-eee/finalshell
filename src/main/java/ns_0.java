/*
 * Decompiled with CFR 0.152.
 */
import java.util.EventObject;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeNode;

/*
 * Renamed from ns
 */
class ns_0
extends DefaultTreeCellEditor {
    public ns_0(JTree jTree, DefaultTreeCellRenderer defaultTreeCellRenderer, TreeCellEditor treeCellEditor) {
        super(jTree, defaultTreeCellRenderer, treeCellEditor);
    }

    @Override
    public boolean isCellEditable(EventObject eventObject) {
        boolean bl;
        block4: {
            boolean bl2;
            block5: {
                Object object;
                Object object2;
                String string;
                block6: {
                    bl2 = super.isCellEditable(eventObject);
                    string = aA.z();
                    bl = bl2;
                    if (string != null) break block4;
                    if (!bl) break block5;
                    object = object2 = this.tree.getLastSelectedPathComponent();
                    if (string != null) break block6;
                    if (object == null) break block5;
                    object = object2;
                }
                bl = object instanceof TreeNode;
                if (string != null) break block4;
                if (bl) {
                    TreeNode treeNode = (TreeNode)object2;
                    bl2 = treeNode.isLeaf();
                }
            }
            bl = bl2;
        }
        return bl;
    }
}

