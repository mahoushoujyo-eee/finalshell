/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FT
extends AbstractTableModel {
    private ArrayList G;
    String[] F;
    Class[] H;
    private static final String a;

    public FT() {
        this.G = new ArrayList();
        this.F = new String[]{a};
        this.H = new Class[]{Object.class};
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.G).size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.F)[n10];
    }

    public void g() {
        ((ArrayList)this.G).clear();
    }

    public Class getColumnClass(int n10) {
        return ((Class[])this.H)[n10];
    }

    public void I(int n10) {
        ((ArrayList)this.G).remove(n10);
        this.fireTableRowsDeleted(n10, n10);
    }

    public synchronized void R(L1 l1) {
        ((ArrayList)this.G).add(l1);
        this.fireTableRowsInserted(((ArrayList)this.G).size() - 1, ((ArrayList)this.G).size() - 1);
    }

    public synchronized void S(L1 l1) {
        ((ArrayList)this.G).add(0, l1);
        this.fireTableRowsInserted(0, 0);
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        L1 l1 = (L1)((ArrayList)this.G).get(n10);
        return l1;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u0016%r".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 98;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 23;
                            break;
                        }
                        case 1: {
                            n17 = 42;
                            break;
                        }
                        case 2: {
                            n17 = 116;
                            break;
                        }
                        case 3: {
                            n17 = 108;
                            break;
                        }
                        case 4: {
                            n17 = 94;
                            break;
                        }
                        case 5: {
                            n17 = 24;
                            break;
                        }
                        default: {
                            n17 = 6;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

