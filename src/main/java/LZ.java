/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

class LZ
implements MouseListener {
    final on_2 E;

    LZ(on_2 on_22) {
        this.E = on_22;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block7: {
            int n10;
            int n11;
            block6: {
                String[] stringArray = Y_.j();
                n11 = mouseEvent.getButton();
                n10 = 1;
                if (stringArray == null) break block6;
                if (n11 != n10) break block7;
                n11 = mouseEvent.getClickCount();
                n10 = 2;
            }
            if (n11 == n10) {
                try {
                    this.E.I();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }
}

