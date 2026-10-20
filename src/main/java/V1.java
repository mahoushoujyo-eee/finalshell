/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class V1
implements MouseListener {
    final lw_2 z;

    V1(lw_2 lw_22) {
        this.z = lw_22;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n10 = ((lw_2)this.z).rowAtPoint(mouseEvent.getPoint());
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

