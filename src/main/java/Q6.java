/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Q6
extends AbstractTableModel {
    private ArrayList v;
    String[] N;
    Class[] j;
    private static final long a;

    Q6() {
        this.v = new ArrayList();
        this.j = new Class[]{Object.class};
        this.N = new String[]{""};
    }

    @Override
    public int getRowCount() {
        int n10 = (int)a;
        String string = vn_0.C();
        int n11 = ((ArrayList)this.v).size();
        if (string == null) {
            if (n11 > n10) {
                return n10;
            }
            n11 = ((ArrayList)this.v).size();
        }
        return n11;
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.N).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.v).get(n10);
    }

    public ArrayList J() {
        return (ArrayList)this.v;
    }

    public void B(ArrayList arrayList) {
        this.v = arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 423249386125184514L;
        a = 0x9623919BFF64CE1CL ^ l2;
    }
}

