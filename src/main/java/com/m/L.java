/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.s;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class L
extends DefaultTreeModel {
    public L(DefaultMutableTreeNode defaultMutableTreeNode) {
        super(defaultMutableTreeNode);
    }

    public L(DefaultMutableTreeNode defaultMutableTreeNode, boolean bl) {
        super(defaultMutableTreeNode, bl);
    }

    public DefaultMutableTreeNode G() {
        return (DefaultMutableTreeNode)this.getRoot();
    }

    public void F(List list, DefaultMutableTreeNode defaultMutableTreeNode, int n10) {
        block3: {
            String string = s.d();
            for (int i2 = list.size() - 1; i2 >= 0; --i2) {
                defaultMutableTreeNode.insert((MutableTreeNode)list.get(i2), n10);
                if (string != null) continue;
            }
            int[] nArray = new int[list.size()];
            for (int i3 = 0; i3 < list.size(); ++i3) {
                nArray[i3] = n10 + i3;
                if (string != null) {
                    if (string != null) continue;
                }
                break block3;
            }
            this.nodesWereInserted(defaultMutableTreeNode, nArray);
        }
    }

    public void d(DefaultMutableTreeNode[] defaultMutableTreeNodeArray, DefaultMutableTreeNode defaultMutableTreeNode, int n10) {
        block3: {
            String string = s.d();
            for (int i2 = defaultMutableTreeNodeArray.length - 1; i2 >= 0; --i2) {
                defaultMutableTreeNode.insert(defaultMutableTreeNodeArray[i2], n10);
                if (string != null) continue;
            }
            int[] nArray = new int[defaultMutableTreeNodeArray.length];
            for (int i3 = 0; i3 < defaultMutableTreeNodeArray.length; ++i3) {
                nArray[i3] = n10 + i3;
                if (string != null) {
                    if (string != null) continue;
                }
                break block3;
            }
            this.nodesWereInserted(defaultMutableTreeNode, nArray);
        }
    }

    public void a(List list) {
        Iterator iterator = list.iterator();
        String string = s.d();
        while (iterator.hasNext()) {
            DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)iterator.next();
            this.removeNodeFromParent(defaultMutableTreeNode);
            if (string != null) continue;
        }
    }

    public void N(DefaultMutableTreeNode defaultMutableTreeNode) {
        String string = s.d();
        for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
            this.removeNodeFromParent((MutableTreeNode)defaultMutableTreeNode.getChildAt(i2));
            if (string != null) continue;
        }
    }

    public void l(DefaultMutableTreeNode[] defaultMutableTreeNodeArray) {
        DefaultMutableTreeNode[] defaultMutableTreeNodeArray2 = defaultMutableTreeNodeArray;
        String string = s.d();
        for (DefaultMutableTreeNode defaultMutableTreeNode : defaultMutableTreeNodeArray2) {
            this.removeNodeFromParent(defaultMutableTreeNode);
            if (string != null) continue;
        }
    }

    public void B(DefaultMutableTreeNode defaultMutableTreeNode) {
        if (defaultMutableTreeNode != null) {
            this.fireTreeNodesChanged(this, this.getPathToRoot(defaultMutableTreeNode), null, null);
        }
    }

    public void L(DefaultMutableTreeNode defaultMutableTreeNode) {
        if (defaultMutableTreeNode != null) {
            this.fireTreeStructureChanged(this, this.getPathToRoot(defaultMutableTreeNode), null, null);
        }
    }

    public void t() {
        this.fireTreeStructureChanged(this, this.G().getPath(), null, null);
    }
}

