/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class VF
implements MouseListener {
    final JTableHeader x;
    final UT l;

    VF(UT uT2, JTableHeader jTableHeader) {
        this.l = uT2;
        this.x = jTableHeader;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        int n10 = ((JTableHeader)this.x).columnAtPoint(mouseEvent.getPoint());
        n10 = ((UT)this.l).convertColumnIndexToModel(n10);
        ((UT)this.l).getRowSorter().toggleSortOrder(n10);
    }
}

