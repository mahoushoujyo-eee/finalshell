/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class U_
implements MouseListener {
    final ua_1 G;

    U_(ua_1 ua_12) {
        this.G = ua_12;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n10 = ((ua_1)this.G).rowAtPoint(mouseEvent.getPoint());
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

