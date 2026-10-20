/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from cL
 */
class cl_1
implements ActionListener {
    final nO x;

    cl_1(nO nO2) {
        this.x = nO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JTable jTable = (JTable)SwingUtilities.getAncestorOfClass(JTable.class, (Component)actionEvent.getSource());
        int n10 = jTable.getEditingRow();
        jTable.getCellEditor().stopCellEditing();
        ((DefaultTableModel)jTable.getModel()).removeRow(n10);
    }
}

