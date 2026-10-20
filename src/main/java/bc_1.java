/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bC
 */
class bc_1
implements MouseListener {
    final aM B;
    final t3_0 I;
    final bq_0 l;

    bc_1(bq_0 bq_02, aM aM2, t3_0 t3_02) {
        this.l = bq_02;
        this.B = aM2;
        this.I = t3_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 1) {
            try {
                this.B.N(this.I);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
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

