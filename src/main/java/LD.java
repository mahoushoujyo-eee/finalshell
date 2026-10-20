/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.ExpandVetoException;

class LD
implements TreeWillExpandListener {
    final a3 Y;

    LD(a3 a32) {
        this.Y = a32;
    }

    @Override
    public void treeWillExpand(TreeExpansionEvent treeExpansionEvent) throws ExpandVetoException {
        try {
            this.Y.g(treeExpansionEvent);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void treeWillCollapse(TreeExpansionEvent treeExpansionEvent) throws ExpandVetoException {
    }
}

