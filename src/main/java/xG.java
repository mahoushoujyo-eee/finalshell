/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class xG
extends AbstractTableModel {
    private ArrayList Z;
    String[] w;
    Class[] E;

    xG() {
        this.Z = new ArrayList();
        this.E = new Class[]{Object.class};
        this.w = new String[]{""};
    }

    @Override
    public synchronized Object getValueAt(int n10, int n11) {
        String string = null;
        if (n10 < ((ArrayList)this.Z).size()) {
            string = (String)((ArrayList)this.Z).get(n10);
        }
        return string;
    }

    public int L(String string) {
        int n10 = 0;
        int[] nArray = zn_0.g();
        for (String string2 : (ArrayList)this.Z) {
            block3: {
                block4: {
                    int n11;
                    block5: {
                        if (nArray != null) break block3;
                        if (string == null) break block4;
                        n11 = string.equals(string2);
                        if (nArray != null) break block5;
                        if (n11 == 0) break block4;
                        n11 = n10;
                    }
                    return n11;
                }
                ++n10;
            }
            if (nArray == null) continue;
        }
        return -1;
    }

    @Override
    public void setValueAt(Object object, int n10, int n11) {
        this.fireTableCellUpdated(n10, n11);
    }

    @Override
    public synchronized int getRowCount() {
        return ((ArrayList)this.Z).size();
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.w).length;
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.w)[n10];
    }

    public Class getColumnClass(int n10) {
        return ((Class[])this.E)[n10];
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        boolean bl = false;
        int[] nArray = zn_0.g();
        boolean bl2 = n11;
        if (nArray == null) {
            if (!bl2) {
                bl = true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public ArrayList j() {
        return (ArrayList)this.Z;
    }

    public void g(ArrayList arrayList) {
        this.Z = arrayList;
    }
}

