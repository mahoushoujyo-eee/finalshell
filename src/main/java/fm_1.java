/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Renamed from fM
 */
class fm_1
implements MouseListener {
    final jx_0 i;

    fm_1(jx_0 jx_02) {
        this.i = jx_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            yj_0 yj_02 = new yj_0((jx_0)this.i, (DT)this.i.I, (fr_2)this.i.A);
            yj_02.show((DT)this.i.I, mouseEvent.getX(), mouseEvent.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        ((DT)this.i.I).clearSelection();
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

