/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bn
 */
class bn_2
implements MouseListener {
    final U Z;

    bn_2(U u10) {
        this.Z = u10;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block10: {
            int n10;
            int n11;
            block8: {
                block9: {
                    boolean bl;
                    String[] stringArray = F8.y();
                    n11 = mouseEvent.getButton();
                    n10 = 1;
                    if (stringArray != null) break block8;
                    if (n11 != n10) break block9;
                    try {
                        bl = (Boolean)vk_0.s();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block10;
                    try {
                        this.Z.s();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray == null) break block10;
                }
                n11 = mouseEvent.getButton();
                n10 = 3;
            }
            if (n11 == n10) {
                // empty if block
            }
        }
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

