/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Renamed from uy
 */
class uy_2
implements MouseListener {
    final tq_2 k;

    uy_2(tq_2 tq_22) {
        this.k = tq_22;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.k.H = -1;
        ((tq_2)this.k).repaint();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block3: {
            tq_2 tq_22;
            int n10;
            block4: {
                int n11;
                block2: {
                    n10 = ((tq_2)this.k).rowAtPoint(mouseEvent.getPoint());
                    String[] stringArray = FK.i();
                    n11 = mouseEvent.getButton();
                    if (stringArray != null) break block2;
                    if (n11 != 3) break block3;
                    tq_22 = (tq_2)this.k;
                    if (stringArray != null) break block4;
                    n11 = tq_22.isRowSelected(n10) ? 1 : 0;
                }
                if (n11 != 0) break block3;
                tq_22 = (tq_2)this.k;
            }
            tq_22.getSelectionModel().setSelectionInterval(n10, n10);
        }
    }
}

