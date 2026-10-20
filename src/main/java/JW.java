/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.table.TableCellEditor;

class JW
implements MouseListener {
    final F6 O;

    JW(F6 f62) {
        this.O = f62;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == 3) {
            nx_0 nx_02 = new nx_0((km_0)this.O.h, (kl_2)this.O.P, (a3)this.O.S);
            nx_02.show((Component)mouseEvent.getSource(), mouseEvent.getX(), mouseEvent.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            TableCellEditor tableCellEditor;
            block2: {
                boolean bl = F6.g();
                ((km_0)this.O.h).requestFocus();
                ((km_0)this.O.h).clearSelection();
                boolean bl2 = bl;
                tableCellEditor = ((km_0)this.O.h).getCellEditor();
                if (bl2) break block2;
                if (tableCellEditor == null) break block3;
                tableCellEditor = ((km_0)this.O.h).getCellEditor();
            }
            tableCellEditor.stopCellEditing();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
}

