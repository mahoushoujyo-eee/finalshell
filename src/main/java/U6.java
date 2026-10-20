/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class U6
implements MouseListener {
    final JTableHeader W;
    final JR q;

    U6(JR jR, JTableHeader jTableHeader) {
        this.q = jR;
        this.W = jTableHeader;
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
        int n10 = ((JTableHeader)this.W).columnAtPoint(mouseEvent.getPoint());
        n10 = ((JR)this.q).convertColumnIndexToModel(n10);
        ((JR)this.q).getRowSorter().toggleSortOrder(n10);
    }
}

