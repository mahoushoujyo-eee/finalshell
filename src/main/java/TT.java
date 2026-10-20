/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class TT
implements MouseListener {
    final uo_0 H;

    TT(uo_0 uo_02) {
        this.H = uo_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n10 = ((uo_0)this.H).rowAtPoint(mouseEvent.getPoint());
        if (mouseEvent.getButton() == 3) {
            // empty if block
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }
}

