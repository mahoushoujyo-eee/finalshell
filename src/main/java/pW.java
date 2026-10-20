/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class pW
extends DefaultTreeModel {
    public pW(TreeNode treeNode) {
        super(treeNode);
    }

    @Override
    public int getChildCount(Object object) {
        return ((TreeNode)object).getChildCount();
    }
}

