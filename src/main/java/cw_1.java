/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from cW
 */
class cw_1
implements Runnable {
    final aJ Y;

    cw_1(aJ aJ2) {
        this.Y = aJ2;
    }

    @Override
    public void run() {
        try {
            this.Y.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((yo_2)this.Y.j).nodeStructureChanged((DefaultMutableTreeNode)this.Y.Z);
        try {
            c.d(425714381873688660L).invoke(null, c.a(this.Y));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

