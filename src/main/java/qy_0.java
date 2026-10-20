/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from Qy
 */
class qy_0
implements MouseListener {
    final a3 n;
    private static final long a;

    qy_0(a3 a32) {
        this.n = a32;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block9: {
            a3 a32;
            block11: {
                long l2;
                block10: {
                    DefaultMutableTreeNode defaultMutableTreeNode;
                    int[] nArray = a3.I();
                    if (mouseEvent.getButton() != 1) break block9;
                    try {
                        defaultMutableTreeNode = (DefaultMutableTreeNode)this.n.o(mouseEvent.getPoint());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
                    if (defaultMutableTreeNode2 == null) break block9;
                    long l3 = System.currentTimeMillis() - this.n.k;
                    long l4 = l3 - a;
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (nArray == null) break block10;
                    if (l2 <= 0) break block9;
                    a32 = (a3)this.n;
                    if (nArray != null) {
                        try {
                            l2 = (long)((Boolean)a32.N(defaultMutableTreeNode2)).booleanValue();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block11;
                }
                if (l2 == false) break block9;
                a32 = (a3)this.n;
            }
            ((km_0)a32.h).clearSelection();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4099623915440704107L;
        a = 0x38E4CA3AF88A0B9FL ^ l2;
    }
}

