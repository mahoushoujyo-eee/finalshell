/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aL;
import com.cz_0;
import com.i2_0;
import com.kz_2;
import com.nd_2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from com.Pl
 */
public class pl_0
extends AbstractTableModel
implements nd_2 {
    private List O;
    private List x;
    private static final String b;

    public pl_0() {
        this(new ArrayList(), aL.J((Collection)q));
    }

    public pl_0(String[] stringArray) {
        this(new ArrayList(), Arrays.asList(stringArray));
    }

    public pl_0(List list) {
        this(new ArrayList(), list);
    }

    public pl_0(Collection collection, String[] stringArray) {
        this(collection, Arrays.asList(stringArray));
    }

    public pl_0(Collection collection, List list) {
        this.O = list;
        this.x = new ArrayList(collection);
    }

    public void L(Collection collection) {
        this.x.clear();
        this.x.addAll(collection);
        this.fireTableDataChanged();
    }

    public void d(Collection collection) {
        block3: {
            int n10;
            block2: {
                String string = kz_2.M();
                n10 = collection.size();
                if (string == null) break block2;
                if (n10 <= 0) break block3;
                n10 = this.x.size();
            }
            int n11 = n10;
            this.x.addAll(collection);
            this.fireTableRowsInserted(n11, n11 + collection.size() - 1);
        }
    }

    public int A(File file) {
        return this.x.indexOf(file);
    }

    public File m(int n10) {
        return (File)this.x.get(n10);
    }

    public void s(List list) {
        this.O = list;
        this.fireTableStructureChanged();
    }

    public String z(int n10) {
        return (String)this.O.get(n10);
    }

    public boolean S(String string) {
        return this.O.contains(string);
    }

    public int y(String string) {
        return this.O.indexOf(string);
    }

    @Override
    public String getColumnName(int n10) {
        return i2_0.O((String)this.O.get(n10));
    }

    @Override
    public int getRowCount() {
        return this.x.size();
    }

    @Override
    public int getColumnCount() {
        return this.O.size();
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return this.x.get(n10);
    }

    public Class getColumnClass(int n10) {
        return File.class;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean isCellEditable(int n10, int n11) {
        String string = kz_2.M();
        boolean bl = this.z(n11).equals(b);
        if (string != null) {
            if (!bl) return false;
            bl = cz_0.J(this.m(n10));
        }
        if (string == null) return bl;
        if (!bl) return false;
        return true;
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
                char[] cArray3 = "k(G]\u0012\\7z$IT\u0010Rvs>@C]Nx~!@\u001f\u0010Uui K\u001f\u001d[ty".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 3;
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
                            n17 = 31;
                            break;
                        }
                        case 1: {
                            n17 = 78;
                            break;
                        }
                        case 2: {
                            n17 = 38;
                            break;
                        }
                        case 3: {
                            n17 = 50;
                            break;
                        }
                        case 4: {
                            n17 = 112;
                            break;
                        }
                        case 5: {
                            n17 = 57;
                            break;
                        }
                        default: {
                            n17 = 26;
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
        b = new String(cArray).intern();
    }
}

