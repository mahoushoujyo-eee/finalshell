/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Renamed from ud
 */
class ud_2
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private nO l;
    private nO L;

    ud_2() {
        this.l = new nO();
        this.L = new nO();
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        try {
            this.l.K((UC)object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return (nO)this.l;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n10, int n11) {
        try {
            this.L.K((UC)object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return (nO)this.L;
    }

    @Override
    public Object getCellEditorValue() {
        UC uC2;
        try {
            uC2 = (UC)this.L.e();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return uC2;
    }

    @Override
    public boolean isCellEditable(EventObject eventObject) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject eventObject) {
        return false;
    }
}

