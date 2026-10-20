/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bt
 */
class bt_2
implements MouseListener {
    final uv_1 H;

    bt_2(uv_1 uv_12) {
        this.H = uv_12;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block4: {
            l5_0 l5_02;
            aJ aJ2;
            block3: {
                String[] stringArray = F8.y();
                aJ2 = (aJ)this.H.W;
                if (stringArray != null) break block3;
                aJ2.getSelectionModel().clearSelection();
                if (mouseEvent.getButton() != 3) break block4;
                aJ2 = (aJ)this.H.W;
            }
            try {
                l5_02 = (l5_0)aJ2.v();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            l5_0 l5_03 = l5_02;
            l5_03.show((Component)mouseEvent.getSource(), mouseEvent.getX() + 1, mouseEvent.getY() + 1);
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

