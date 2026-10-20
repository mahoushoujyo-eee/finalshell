/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

class QH
extends MouseAdapter {
    final FK w;

    QH(FK fK2) {
        this.w = fK2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            try {
                this.w.u();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

