/*
 * Decompiled with CFR 0.152.
 */
import com._C;
import com.c;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

class OS
implements MouseListener {
    final y1_0 N;
    final jx_0 A;
    private static final long a;

    OS(jx_0 jx_02, y1_0 y1_02) {
        this.A = jx_02;
        this.N = y1_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block6: {
            OS oS;
            block4: {
                block5: {
                    boolean bl;
                    int[] nArray = jx_0.O();
                    oS = this;
                    if (nArray != null) break block4;
                    try {
                        bl = (Boolean)oS.N.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break block5;
                    if (mouseEvent.getButton() != 1) break block6;
                    Dimension dimension = ((JPopupMenu)this.A.a).getPreferredSize();
                    ((JPopupMenu)this.A.a).show((_C)this.A.H, (int)a, ((_C)this.A.H).getHeight() + 4);
                    if (nArray == null) break block6;
                }
                oS = this;
            }
            ((JPopupMenu)oS.A.a).setVisible(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
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
        long l2 = 4601005144823139877L;
        a = 0x2D715673AD1271DEL ^ l2;
    }
}

