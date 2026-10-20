/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Renamed from mc
 */
class mc_0
implements MouseListener {
    final JLabel m;
    final Color x;
    final W8 t;
    final Color e;
    final mi_0 Z;

    mc_0(mi_0 mi_02, JLabel jLabel, Color color, W8 w8, Color color2) {
        this.Z = mi_02;
        this.m = jLabel;
        this.x = color;
        this.t = w8;
        this.e = color2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        ((JLabel)this.m).setBackground((Color)this.x);
        ((W8)this.t).setBackground((Color)this.x);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        ((JLabel)this.m).setBackground((Color)this.e);
        ((W8)this.t).setBackground((Color)this.e);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            // empty if block
        }
    }
}

