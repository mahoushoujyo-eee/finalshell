/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class UT
extends JTable {
    cd_2 u;
    int C;
    int H;
    boolean S;
    private static final long[] a;
    private static final Integer[] b;

    public UT(boolean bl) {
        this.C = -1;
        this.H = -1;
        this.S = false;
        this.S = bl;
        this.setSelectionBackground((Color)fx_2.E);
        this.setSelectionForeground((Color)fx_2.o);
        this.setBorder(null);
        this.setDragEnabled(false);
        this.setShowGrid(false);
        this.setAutoResizeMode(3);
        this.setIntercellSpacing(new Dimension(0, 0));
        this.setAutoscrolls(false);
        this.setSelectionMode(0);
    }

    public void I(cd_2 cd_22) {
        boolean bl;
        block9: {
            int[] nArray = CE.S();
            this.u = cd_22;
            super.setModel(cd_22);
            TableColumnModel tableColumnModel = this.getColumnModel();
            int[] nArray2 = nArray;
            this.setPreferredScrollableViewportSize(new Dimension(UT.a(4966, 1471701062211156622L), UT.a(22104, 3154209052382363571L)));
            if (nArray2 != null) {
                TableRowSorter tableRowSorter;
                if (tableColumnModel.getColumnCount() > 2) {
                    int n10 = 0;
                    int n11 = UT.a(13328, 1553563138183437820L);
                    tableColumnModel.getColumn(n10).setPreferredWidth(n11);
                    tableColumnModel.getColumn(n10).setMinWidth(n11);
                    tableColumnModel.getColumn(n10).setMaxWidth(n11);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(UT.a(3068, 3888436801612685846L));
                    tableColumnModel.getColumn(n10).setMaxWidth(UT.a(6703, 1814893459250066369L));
                    tableColumnModel.getColumn(n10).setMinWidth(UT.a(25145, 7079552701270117340L));
                    int n12 = UT.a(19192, 1704274628962083607L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n12);
                    tableColumnModel.getColumn(n10).setMinWidth(n12);
                    tableColumnModel.getColumn(n10).setMaxWidth(n12);
                    n12 = UT.a(8112, 2838644309321496148L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n12);
                    tableColumnModel.getColumn(n10).setMinWidth(n12);
                    tableColumnModel.getColumn(n10).setMaxWidth(n12);
                    n12 = UT.a(16422, 3338968632610515407L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n12);
                    tableColumnModel.getColumn(n10).setMinWidth(n12);
                    tableColumnModel.getColumn(n10).setMaxWidth(n12);
                    n12 = UT.a(10097, 271023927652945564L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n12);
                    tableColumnModel.getColumn(n10).setMinWidth(n12);
                    tableColumnModel.getColumn(n10).setMaxWidth(n12);
                    n12 = UT.a(10097, 271023927652945564L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n12);
                    tableColumnModel.getColumn(n10).setMinWidth(n12);
                    tableColumnModel.getColumn(n10).setMaxWidth(n12);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n12);
                    tableColumnModel.getColumn(n10).setMinWidth(n12);
                    tableColumnModel.getColumn(n10).setMaxWidth(n12);
                    ug_2 ug_22 = new ug_2(this.S);
                    for (int i2 = 0; i2 < tableColumnModel.getColumnCount(); ++i2) {
                        tableColumnModel.getColumn(i2).setCellRenderer(ug_22);
                        if (nArray2 != null) {
                            if (nArray2 != null) continue;
                        }
                        break block9;
                    }
                }
                try {
                    tableRowSorter = (TableRowSorter)this.s();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.setRowSorter(tableRowSorter);
                this.getRowSorter().toggleSortOrder(2);
            }
        }
        JTableHeader jTableHeader = this.getTableHeader();
        try {
            bl = (Boolean)vk_0.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (bl) {
            jTableHeader.addMouseListener(new VF(this, jTableHeader));
        }
    }

    protected TableRowSorter s() {
        cd_2 cd_22 = (cd_2)this.getModel();
        int[] nArray = CE.S();
        dp_1 dp_12 = new dp_1(this, cd_22);
        int n10 = 0;
        do {
            block9: {
                dn_2 dn_22;
                block8: {
                    block7: {
                        String string;
                        int n11;
                        try {
                            n11 = (Integer)cd_22.getColumnCount();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (n10 >= n11) break;
                        try {
                            string = (String)cd_22.r(n10);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string2 = string;
                        dn_22 = new dn_2(this, string2);
                        if (nArray == null) break block7;
                        if (dn_22 != null) break block8;
                        dp_12.setSortable(n10, false);
                    }
                    if (nArray != null) break block9;
                }
                dp_12.setComparator(n10, dn_22);
            }
            ++n10;
        } while (nArray != null);
        return dp_12;
    }

    public int B() {
        return this.C;
    }

    public void w(int n10) {
        this.C = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8568066808941004683L;
                var6_1 = new long[10];
                var3_2 = 0;
                var4_3 = "\u00ba\u0019}\u00b1{\u00dc\u00c9Qg\u00ba\u00f3\u00e7\u0095.\u00da\u0013\u009c*\u00a8\u0094,@\u00a4\u00f2\u0087\u00e3\u0015H\u00b9y\u00f4\u00c8t\u001e$= U\u00aex\u008d\u009d\u0018Rj\u00173%\u00c5\u00ed~&\u001c,\u001f(h\b\u009cf\u00ad\u0010e\u001f";
                var5_4 = "\u00ba\u0019}\u00b1{\u00dc\u00c9Qg\u00ba\u00f3\u00e7\u0095.\u00da\u0013\u009c*\u00a8\u0094,@\u00a4\u00f2\u0087\u00e3\u0015H\u00b9y\u00f4\u00c8t\u001e$= U\u00aex\u008d\u009d\u0018Rj\u00173%\u00c5\u00ed~&\u001c,\u001f(h\b\u009cf\u00ad\u0010e\u001f".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\r\u00f3\u001d\u00ab\u00c9b\u008c3|\u008db\u00bbZt\u00f1\u0099";
                    var5_4 = "\r\u00f3\u001d\u00ab\u00c9b\u008c3|\u008db\u00bbZt\u00f1\u0099".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        UT.a = var6_1;
        UT.b = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x29ED;
        if (b[n11] == null) {
            UT.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

