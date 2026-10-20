/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class UN
extends AbstractTableModel {
    private ArrayList F;
    String[] a;
    Class[] j;

    UN() {
        this.F = new ArrayList();
        this.j = new Class[]{Object.class};
        this.a = new String[]{""};
    }

    @Override
    public synchronized Object getValueAt(int n10, int n11) {
        String string = null;
        if (n10 < ((ArrayList)this.F).size()) {
            string = (String)((ArrayList)this.F).get(n10);
        }
        return string;
    }

    public int j(String string) {
        int n10;
        block3: {
            int n11 = 0;
            Iterator iterator = ((ArrayList)this.F).iterator();
            ky_2[] ky_2Array = zM.I();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                if (ky_2Array != null) {
                    n10 = string.equals(string2) ? 1 : 0;
                    if (ky_2Array == null) break block3;
                    if (n10 != 0 && ky_2Array != null) break;
                    ++n11;
                }
                if (ky_2Array != null) continue;
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
        return ((ArrayList)this.F).size();
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.a).length;
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.a)[n10];
    }

    public Class getColumnClass(int n10) {
        return ((Class[])this.j)[n10];
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        boolean bl = false;
        ky_2[] ky_2Array = zM.I();
        boolean bl2 = n11;
        if (ky_2Array != null) {
            if (!bl2) {
                bl = true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public ArrayList B() {
        return (ArrayList)this.F;
    }

    public void N(ArrayList arrayList) {
        this.F = arrayList;
    }
}

