/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

class OE
implements Runnable {
    final DefaultMutableTreeNode n;
    final aJ t;

    OE(aJ aJ2, DefaultMutableTreeNode defaultMutableTreeNode) {
        this.t = aJ2;
        this.n = defaultMutableTreeNode;
    }

    @Override
    public void run() {
        try {
            this.t.J(this.n);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

