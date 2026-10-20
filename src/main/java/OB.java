/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

class OB
implements MouseListener {
    final xw_0 W;

    OB(xw_0 xw_02) {
        this.W = xw_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block7: {
            int n10;
            int n11;
            block6: {
                boolean bl = F6.g();
                n11 = mouseEvent.getClickCount();
                n10 = 2;
                if (bl) break block6;
                if (n11 != n10) break block7;
                n11 = mouseEvent.getButton();
                n10 = 1;
            }
            if (n11 == n10) {
                try {
                    this.W.F();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
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

