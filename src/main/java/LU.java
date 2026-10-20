/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class LU
extends MouseAdapter {
    final z_ K;

    LU(z_ z_3) {
        this.K = z_3;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            LU lU;
            block2: {
                ky_2[] ky_2Array = z_.t();
                lU = this;
                if (ky_2Array != null) break block2;
                super.mouseReleased(mouseEvent);
                if (mouseEvent.getButton() != 1) break block3;
                lU = this;
            }
            ((yy_0)lU.K.E).clearSelection();
        }
    }
}

