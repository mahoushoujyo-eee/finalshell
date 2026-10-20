/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

/*
 * Renamed from cF
 */
class cf_1
implements MouseListener {
    final JTableHeader q;
    final km_0 g;

    cf_1(km_0 km_02, JTableHeader jTableHeader) {
        this.g = km_02;
        this.q = jTableHeader;
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
        int n10 = ((JTableHeader)this.q).columnAtPoint(mouseEvent.getPoint());
        n10 = ((km_0)this.g).convertColumnIndexToModel(n10);
        ((km_0)this.g).getRowSorter().toggleSortOrder(n10);
    }
}

