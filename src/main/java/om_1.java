/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from oM
 */
class om_1
extends DefaultTableModel {
    final CV d;

    om_1(CV cV, Object[][] objectArray, Object[] objectArray2) {
        this.d = cV;
        super(objectArray, objectArray2);
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        return false;
    }
}

