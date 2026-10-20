/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

class CN
extends MouseAdapter {
    final CV I;

    CN(CV cV) {
        this.I = cV;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            CN cN;
            block2: {
                boolean bl = uo_0.i();
                cN = this;
                if (bl) break block2;
                super.mousePressed(mouseEvent);
                if (mouseEvent.getButton() != 1) break block3;
                cN = this;
            }
            ((JTable)cN.I.Y).clearSelection();
        }
    }
}

