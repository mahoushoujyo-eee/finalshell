/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Renamed from De
 */
class de_0
implements MouseListener {
    final JLabel E;
    final Color o;
    final W8 n;
    final Color R;
    final jx_0 v;

    de_0(jx_0 jx_02, JLabel jLabel, Color color, W8 w8, Color color2) {
        this.v = jx_02;
        this.E = jLabel;
        this.o = color;
        this.n = w8;
        this.R = color2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        ((JLabel)this.E).setBackground((Color)this.o);
        ((W8)this.n).setBackground((Color)this.o);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        ((JLabel)this.E).setBackground((Color)this.R);
        ((W8)this.n).setBackground((Color)this.R);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            // empty if block
        }
    }
}

