/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Renamed from Wz
 */
class wz_0
implements MouseListener {
    final br_0 k;

    wz_0(br_0 br_02) {
        this.k = br_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        ((nd_0)this.k.l).clearSelection();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }
}

