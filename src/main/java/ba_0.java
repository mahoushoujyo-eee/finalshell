/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from Ba
 */
public class ba_0
extends AbstractTableModel {
    private ArrayList R;
    String[] T;
    Class[] L;

    ba_0() {
        this.R = new ArrayList();
        this.L = new Class[]{Object.class};
        this.T = new String[]{""};
    }

    @Override
    public synchronized Object getValueAt(int n10, int n11) {
        String string = null;
        if (n10 < ((ArrayList)this.R).size()) {
            string = (String)((ArrayList)this.R).get(n10);
        }
        return string;
    }

    public int p(String string) {
        int n10;
        block3: {
            int n11 = 0;
            Iterator iterator = ((ArrayList)this.R).iterator();
            String[] stringArray = br_0.w();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                if (stringArray == null) {
                    n10 = string.equals(string2) ? 1 : 0;
                    if (stringArray != null) break block3;
                    if (n10 != 0 && stringArray == null) break;
                    ++n11;
                }
                if (stringArray == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    @Override
    public void setValueAt(Object object, int n10, int n11) {
        this.fireTableCellUpdated(n10, n11);
    }

    @Override
    public synchronized int getRowCount() {
        return ((ArrayList)this.R).size();
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.T).length;
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.T)[n10];
    }

    public Class getColumnClass(int n10) {
        return ((Class[])this.L)[n10];
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        boolean bl = false;
        String[] stringArray = br_0.w();
        boolean bl2 = n11;
        if (stringArray == null) {
            if (!bl2) {
                bl = true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public ArrayList u() {
        return (ArrayList)this.R;
    }

    public void p(ArrayList arrayList) {
        this.R = arrayList;
    }
}

