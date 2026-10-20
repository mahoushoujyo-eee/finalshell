/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/*
 * Renamed from d9
 */
class d9_0
implements MouseListener {
    final vn_0 c;

    d9_0(vn_0 vn_02) {
        this.c = vn_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block5: {
            block6: {
                String string = vn_0.C();
                if (string != null) break block5;
                if (mouseEvent.getButton() != 1) break block6;
                int n10 = ((vn_0)this.c).rowAtPoint(mouseEvent.getPoint());
                if (string != null) break block5;
                if (n10 > -1) {
                    String string2;
                    int n11 = ((vn_0)this.c).convertRowIndexToModel(n10);
                    lv_2 lv_22 = (lv_2)((vn_0)this.c).getModel().getValueAt(n11, 0);
                    try {
                        string2 = (String)lv_22.G();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    File file = new File(string2);
                    U u10 = (U)SwingUtilities.windowForComponent((vn_0)this.c);
                    SwingUtilities.invokeLater(new qz_0(this, file, u10));
                }
            }
            this.c.q = -1;
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
}

