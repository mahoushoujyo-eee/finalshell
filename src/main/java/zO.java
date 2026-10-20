/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

class zO
implements MouseListener {
    final String U;
    final JLabel g;
    final Color P;
    final W8 p;
    final JPopupMenu w;
    final mi_0 u;

    zO(mi_0 mi_02, String string, JLabel jLabel, Color color, W8 w8, JPopupMenu jPopupMenu) {
        this.u = mi_02;
        this.U = string;
        this.g = jLabel;
        this.P = color;
        this.p = w8;
        this.w = jPopupMenu;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            block4: {
                int[] nArray = L9.X();
                if (nArray != null) break block4;
                if (mouseEvent.getButton() != 1) break block5;
                ((JTextField)this.u.g).setText((String)this.U);
                ((JLabel)this.g).setBackground((Color)this.P);
                ((W8)this.p).setBackground((Color)this.P);
                ((JPopupMenu)this.w).setVisible(false);
            }
            try {
                this.u.e(null);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
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
}

