/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from Oy
 */
class oy_0
extends DefaultTableModel {
    final de_1 Z;

    oy_0(de_1 de_12, Object[][] objectArray, Object[] objectArray2) {
        this.Z = de_12;
        super(objectArray, objectArray2);
    }

    public Class getColumnClass(int n10) {
        return n10 == 2 ? Boolean.class : String.class;
    }
}

