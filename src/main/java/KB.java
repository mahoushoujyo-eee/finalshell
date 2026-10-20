/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

class KB
implements MouseListener {
    final f7_0 P;

    KB(f7_0 f7_02) {
        this.P = f7_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block9: {
            int n10;
            int n11;
            block8: {
                String[] stringArray = Y_.j();
                n11 = mouseEvent.getButton();
                n10 = 1;
                if (stringArray == null) break block8;
                if (n11 != n10) break block9;
                n11 = mouseEvent.getClickCount();
                n10 = 2;
            }
            if (n11 == n10) {
                ln_1 ln_12;
                try {
                    ln_12 = (ln_1)this.P.e.U();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ln_1 ln_13 = ln_12;
                if (ln_13 != null) {
                    try {
                        this.P.e.e(ln_13);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
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

