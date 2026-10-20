/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

/*
 * Renamed from lX
 */
class lx_1
extends MouseAdapter {
    final JPopupMenu e;
    final CV A;

    lx_1(CV cV, JPopupMenu jPopupMenu) {
        this.A = cV;
        this.e = jPopupMenu;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            int n10;
            block2: {
                boolean bl = uo_0.k();
                super.mousePressed(mouseEvent);
                boolean bl2 = bl;
                n10 = mouseEvent.getButton();
                if (!bl2) break block2;
                if (n10 != 3) break block3;
                n10 = ((JTable)this.A.Y).rowAtPoint(mouseEvent.getPoint());
            }
            int n11 = n10;
            int n12 = ((JTable)this.A.Y).convertRowIndexToModel(n11);
            ((JTable)this.A.Y).getSelectionModel().setSelectionInterval(n12, n12);
            ((JPopupMenu)this.e).show((JTable)this.A.Y, mouseEvent.getX(), mouseEvent.getY());
        }
    }
}

