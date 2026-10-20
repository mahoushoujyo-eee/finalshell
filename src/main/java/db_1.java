/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Renamed from dB
 */
class db_1
implements MouseListener {
    final qp_0 Q;

    db_1(qp_0 qp_02) {
        this.Q = qp_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n10 = ((qp_0)this.Q).rowAtPoint(mouseEvent.getPoint());
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

