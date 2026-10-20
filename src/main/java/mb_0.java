/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Renamed from mb
 */
class mb_0
implements Runnable {
    final DefaultMutableTreeNode z;
    final aJ k;

    mb_0(aJ aJ2, DefaultMutableTreeNode defaultMutableTreeNode) {
        this.k = aJ2;
        this.z = defaultMutableTreeNode;
    }

    @Override
    public void run() {
        ((aJ)this.k).scrollPathToVisible(new TreePath(((DefaultMutableTreeNode)this.z).getPath()));
    }
}

