/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from Dy
 */
class dy_0
extends DefaultTableModel {
    dy_0(Object[][] objectArray, Object[] objectArray2) {
        super(objectArray, objectArray2);
    }

    public Class getColumnClass(int n10) {
        return this.getValueAt(0, n10).getClass();
    }
}

