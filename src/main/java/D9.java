/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class D9
implements TableModelListener {
    final de_1 o;

    public D9(de_1 de_12) {
        this.o = de_12;
    }

    @Override
    public void tableChanged(TableModelEvent tableModelEvent) {
        int n10 = tableModelEvent.getFirstRow();
        int n11 = tableModelEvent.getColumn();
        if (n11 == 2) {
            TableModel tableModel = (TableModel)tableModelEvent.getSource();
            String string = tableModel.getColumnName(n11);
            Boolean bl = (Boolean)tableModel.getValueAt(n10, n11);
            if (bl.booleanValue()) {
                // empty if block
            }
        }
    }
}

