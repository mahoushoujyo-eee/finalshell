/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from fr
 */
public class fr_2
extends AbstractTableModel {
    private ArrayList M;
    String[] p;
    Class[] d;

    fr_2() {
        this.M = new ArrayList();
        this.d = new Class[]{Object.class};
        this.p = new String[]{""};
    }

    public synchronized int C() {
        int n10;
        block7: {
            int n11 = 0;
            int[] nArray = jx_0.O();
            for (YI yI : (ArrayList)this.M) {
                block9: {
                    int n12;
                    int n13;
                    block8: {
                        int n14;
                        int n15;
                        try {
                            n15 = (Integer)yI.D();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n10 = n14 = n15;
                        if (nArray != null) break block7;
                        n13 = YI.e;
                        if (nArray != null) break block8;
                        if (n10 != n13) break block9;
                        try {
                            n12 = (Integer)yI.t();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n13 = YI.N;
                    }
                    if (n12 == n13) {
                        ++n11;
                    }
                }
                if (nArray == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public synchronized YI O() {
        YI yI = null;
        int[] nArray = jx_0.O();
        int n10 = 0;
        while (n10 < ((ArrayList)this.M).size()) {
            int n11;
            YI yI2 = (YI)((ArrayList)this.M).get(((ArrayList)this.M).size() - 1 - n10);
            try {
                n11 = (Integer)yI2.D();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            int n12 = n11;
            if (nArray != null) continue;
            if (n12 == YI.U) {
                yI = yI2;
                break;
            }
            ++n10;
        }
        return yI;
    }

    public synchronized void q(YI yI) {
        block9: {
            int n10;
            block8: {
                int n11;
                int[] nArray;
                block5: {
                    n10 = -1;
                    Iterator iterator = ((ArrayList)this.M).iterator();
                    nArray = jx_0.O();
                    while (iterator.hasNext()) {
                        block7: {
                            block6: {
                                YI yI2 = (YI)iterator.next();
                                if (nArray != null) break block6;
                                n11 = yI2.equals(yI) ? 1 : 0;
                                if (nArray != null) break block5;
                                if (n11 == 0) break block7;
                                ++n10;
                            }
                            if (nArray == null) break;
                        }
                        if (nArray == null) continue;
                    }
                    n11 = n10;
                }
                if (nArray != null) break block8;
                if (n11 <= -1) break block9;
                n11 = ((ArrayList)this.M).remove(yI) ? 1 : 0;
            }
            this.fireTableRowsDeleted(n10, n10);
        }
    }

    public synchronized void O(YI yI) {
        block3: {
            int n10 = 0;
            int[] nArray = jx_0.O();
            for (YI yI2 : (ArrayList)this.M) {
                if (nArray == null) {
                    if (nArray == null) {
                        if (yI2.equals(yI) && nArray == null) break;
                        ++n10;
                    }
                    if (nArray == null) continue;
                }
                break block3;
            }
            this.fireTableCellUpdated(n10, 0);
        }
    }

    public synchronized void S(YI yI) {
        ((ArrayList)this.M).add(yI);
        this.fireTableRowsInserted(((ArrayList)this.M).size() - 1, ((ArrayList)this.M).size());
    }

    public synchronized void D(YI yI) {
        ((ArrayList)this.M).add(0, yI);
        this.fireTableDataChanged();
    }

    public void T(List list) {
        block3: {
            ArrayList arrayList;
            block2: {
                int[] nArray = jx_0.O();
                arrayList = (ArrayList)this.M;
                if (nArray != null) break block2;
                arrayList.clear();
                if (list == null) break block3;
                arrayList = (ArrayList)this.M;
            }
            arrayList.addAll(list);
        }
    }

    public int V(int n10) {
        int n11;
        block5: {
            int n12 = -1;
            int n13 = 0;
            int[] nArray = jx_0.O();
            for (YI yI : (ArrayList)this.M) {
                if (nArray == null) {
                    int n14;
                    n11 = n10;
                    if (nArray != null) break block5;
                    try {
                        n14 = (Integer)yI.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (n11 == n14) {
                        n12 = n13;
                        if (nArray == null) break;
                    }
                    ++n13;
                }
                if (nArray == null) continue;
            }
            n11 = n12;
        }
        return n11;
    }

    List y() {
        return (ArrayList)this.M;
    }

    public YI b(int n10) {
        int[] nArray = jx_0.O();
        int n11 = n10;
        if (nArray == null) {
            n11 = n11 > -1 ? 1 : 0;
        }
        int n12 = n10;
        if (nArray == null) {
            n12 = n12 < ((ArrayList)this.M).size() ? 1 : 0;
        }
        if ((n11 & n12) != 0) {
            return (YI)((ArrayList)this.M).get(n10);
        }
        return null;
    }

    @Override
    public synchronized Object getValueAt(int n10, int n11) {
        YI yI = null;
        if (n10 < ((ArrayList)this.M).size()) {
            yI = (YI)((ArrayList)this.M).get(n10);
        }
        return yI;
    }

    @Override
    public void setValueAt(Object object, int n10, int n11) {
        this.fireTableCellUpdated(n10, n11);
    }

    @Override
    public synchronized int getRowCount() {
        return ((ArrayList)this.M).size();
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.p).length;
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.p)[n10];
    }

    public Class getColumnClass(int n10) {
        return ((Class[])this.d)[n10];
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        boolean bl = false;
        int[] nArray = jx_0.O();
        boolean bl2 = n11;
        if (nArray == null) {
            if (!bl2) {
                bl = true;
            }
            bl2 = false;
        }
        return bl2;
    }
}

