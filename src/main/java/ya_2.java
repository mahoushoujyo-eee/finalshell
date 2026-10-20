/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ya
 */
class ya_2
implements MouseListener {
    final JR m;

    ya_2(JR jR) {
        this.m = jR;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n10 = ((JR)this.m).rowAtPoint(mouseEvent.getPoint());
        if (mouseEvent.getButton() == 1) {
            try {
                yt_1.F.J(new T4(this));
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
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }
}

