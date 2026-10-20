/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from dK
 */
class dk_1
extends MouseAdapter {
    final zw_0 b;

    dk_1(zw_0 zw_02) {
        this.b = zw_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            dk_1 dk_12;
            block2: {
                String string = zw_0.V();
                dk_12 = this;
                if (string == null) break block2;
                super.mouseReleased(mouseEvent);
                if (mouseEvent.getButton() != 1) break block3;
                dk_12 = this;
            }
            ((nH)dk_12.b.a).clearSelection();
        }
    }
}

