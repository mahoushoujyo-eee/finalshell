/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.JTableHeader;

class gY
implements MouseListener {
    final JTableHeader h;
    final uo_0 O;

    gY(uo_0 uo_02, JTableHeader jTableHeader) {
        this.O = uo_02;
        this.h = jTableHeader;
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
        int n10 = ((JTableHeader)this.h).columnAtPoint(mouseEvent.getPoint());
        n10 = ((uo_0)this.O).convertColumnIndexToModel(n10);
        ((uo_0)this.O).getRowSorter().toggleSortOrder(n10);
    }
}

