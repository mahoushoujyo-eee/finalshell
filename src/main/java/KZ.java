/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class KZ
extends MouseAdapter {
    final zK Z;

    KZ(zK zK2) {
        this.Z = zK2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            KZ kZ;
            block2: {
                String[] stringArray = zK.B();
                kZ = this;
                if (stringArray == null) break block2;
                super.mouseReleased(mouseEvent);
                if (mouseEvent.getButton() != 1) break block3;
                kZ = this;
            }
            ((LQ)kZ.Z.r).clearSelection();
        }
    }
}

