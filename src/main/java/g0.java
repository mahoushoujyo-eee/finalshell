/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.swing.tree.DefaultMutableTreeNode;

class g0
implements Runnable {
    final String u;
    final aJ n;

    g0(aJ aJ2, String string) {
        this.n = aJ2;
        this.u = string;
    }

    @Override
    public void run() {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.n.G).get((String)this.u);
        try {
            this.n.J(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

