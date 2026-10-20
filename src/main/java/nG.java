/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class nG
extends MouseAdapter {
    final Y_ I;

    nG(Y_ y_) {
        this.I = y_;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            nG nG2;
            block2: {
                String[] stringArray = Y_.j();
                nG2 = this;
                if (stringArray == null) break block2;
                super.mouseReleased(mouseEvent);
                if (mouseEvent.getButton() != 1) break block3;
                nG2 = this;
            }
            ((nA)nG2.I.j).clearSelection();
        }
    }
}

