/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class xL
implements Runnable {
    final DefaultMutableTreeNode q;
    final TM T;

    xL(TM tM, DefaultMutableTreeNode defaultMutableTreeNode) {
        this.T = tM;
        this.q = defaultMutableTreeNode;
    }

    @Override
    public void run() {
        TreePath treePath;
        try {
            treePath = (TreePath)this.T.T.D.y(this.q);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((aJ)this.T.T.D).setSelectionPath(treePath);
    }
}

