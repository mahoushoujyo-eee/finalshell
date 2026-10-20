/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.table.TableCellEditor;

/*
 * Renamed from og
 */
class og_2
extends AbstractAction {
    final km_0 B;

    og_2(km_0 km_02) {
        this.B = km_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            TableCellEditor tableCellEditor;
            block2: {
                TableCellEditor tableCellEditor2 = ((km_0)this.B).getCellEditor();
                String string = km_0.U();
                tableCellEditor = tableCellEditor2;
                if (string != null) break block2;
                if (tableCellEditor == null) break block3;
                tableCellEditor = ((km_0)this.B).getCellEditor();
            }
            tableCellEditor.stopCellEditing();
        }
    }
}

