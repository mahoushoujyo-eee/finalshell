/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class CY
implements MouseMotionListener {
    final tq_2 L;

    CY(tq_2 tq_22) {
        this.L = tq_22;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        Point point = mouseEvent.getPoint();
        String[] stringArray = FK.i();
        if (point != null) {
            this.L.U = ((tq_2)this.L).rowAtPoint(point);
        }
        tq_2 tq_22 = (tq_2)this.L;
        if (stringArray == null) {
            if (tq_22.H != this.L.U) {
                ((tq_2)this.L).repaint();
            }
            tq_22 = (tq_2)this.L;
        }
        tq_22.H = this.L.U;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    }
}

