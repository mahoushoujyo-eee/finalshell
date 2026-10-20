/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class K2
implements MouseListener {
    final JTableHeader o;
    final y6_0 d;

    K2(y6_0 y6_02, JTableHeader jTableHeader) {
        this.d = y6_02;
        this.o = jTableHeader;
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
        int n10 = ((JTableHeader)this.o).columnAtPoint(mouseEvent.getPoint());
        n10 = ((y6_0)this.d).convertColumnIndexToModel(n10);
        ((y6_0)this.d).getRowSorter().toggleSortOrder(n10);
    }
}

