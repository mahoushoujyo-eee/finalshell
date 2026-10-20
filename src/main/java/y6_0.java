/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/*
 * Renamed from y6
 */
public class y6_0
extends JTable {
    gR X;
    int u;
    int e;
    HashMap f;
    private static String[] i;
    private static final long[] a;
    private static final Integer[] b;

    public y6_0() {
        boolean bl;
        this.u = -1;
        this.e = -1;
        this.f = new HashMap();
        this.setSelectionBackground((Color)fx_2.E);
        this.setSelectionForeground((Color)fx_2.o);
        this.setBorder(null);
        this.setDragEnabled(false);
        this.setShowGrid(false);
        this.setAutoResizeMode(3);
        this.setIntercellSpacing(new Dimension(0, 0));
        this.setAutoscrolls(false);
        this.setSelectionMode(0);
        JTableHeader jTableHeader = this.getTableHeader();
        try {
            bl = (Boolean)vk_0.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (bl) {
            jTableHeader.addMouseListener(new K2(this, jTableHeader));
        }
    }

    public boolean T(String string) {
        return ((HashMap)this.f).containsKey(string);
    }

    public void S(String string) {
        ((HashMap)this.f).put(string, string);
    }

    public void s(gR gR2) {
        block6: {
            this.X = gR2;
            super.setModel(gR2);
            String[] stringArray = y6_0.Z();
            TableColumnModel tableColumnModel = this.getColumnModel();
            this.setPreferredScrollableViewportSize(new Dimension(y6_0.a(18594, 1289353088140141711L), y6_0.a(6571, 5198171512366642561L)));
            String[] stringArray2 = stringArray;
            if (stringArray2 != null) {
                TableRowSorter tableRowSorter;
                if (tableColumnModel.getColumnCount() > 2) {
                    int n10 = -1;
                    int n11 = y6_0.a(9330, 2447733586420172894L);
                    n11 = y6_0.a(14012, 2480174775648852628L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(y6_0.a(6021, 1688810638526495651L));
                    tableColumnModel.getColumn(n10).setMaxWidth(y6_0.a(29141, 274934773994282482L));
                    tableColumnModel.getColumn(n10).setMinWidth(y6_0.a(31769, 4265660311765274672L));
                    n11 = y6_0.a(27201, 8230874025373976174L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n11);
                    tableColumnModel.getColumn(n10).setMinWidth(n11);
                    tableColumnModel.getColumn(n10).setMaxWidth(n11);
                    n11 = y6_0.a(4107, 7367568161765440544L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n11);
                    tableColumnModel.getColumn(n10).setMinWidth(n11);
                    tableColumnModel.getColumn(n10).setMaxWidth(n11);
                    n11 = y6_0.a(3757, 617792856610677379L);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n11);
                    tableColumnModel.getColumn(n10).setMinWidth(n11);
                    tableColumnModel.getColumn(n10).setMaxWidth(n11);
                    tableColumnModel.getColumn(++n10).setPreferredWidth(n11);
                    tableColumnModel.getColumn(n10).setMinWidth(n11);
                    tableColumnModel.getColumn(n10).setMaxWidth(n11);
                    bu_0 bu_02 = new bu_0();
                    for (int i2 = 0; i2 < tableColumnModel.getColumnCount(); ++i2) {
                        tableColumnModel.getColumn(i2).setCellRenderer(bu_02);
                        if (stringArray2 != null) {
                            if (stringArray2 != null) continue;
                        }
                        break block6;
                    }
                }
                try {
                    tableRowSorter = (TableRowSorter)this.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.setRowSorter(tableRowSorter);
                this.getRowSorter().toggleSortOrder(3);
            }
        }
    }

    protected TableRowSorter g() {
        gR gR2 = (gR)this.getModel();
        d7_0 d7_02 = new d7_0(this, gR2);
        String[] stringArray = y6_0.Z();
        int n10 = 0;
        do {
            block9: {
                ct_0 ct_02;
                block8: {
                    block7: {
                        String string;
                        int n11;
                        try {
                            n11 = (Integer)gR2.getColumnCount();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (n10 >= n11) break;
                        try {
                            string = (String)gR2.V(n10);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string2 = string;
                        ct_02 = new ct_0(this, string2);
                        if (stringArray == null) break block7;
                        if (ct_02 != null) break block8;
                        d7_02.setSortable(n10, false);
                    }
                    if (stringArray != null) break block9;
                }
                d7_02.setComparator(n10, ct_02);
            }
            ++n10;
        } while (stringArray != null);
        return d7_02;
    }

    public int Y() {
        return this.u;
    }

    public void R(int n10) {
        this.u = n10;
    }

    public static void t(String[] stringArray) {
        i = stringArray;
    }

    public static String[] Z() {
        return i;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8161029370958280936L;
                var6_1 = new long[10];
                var3_2 = 0;
                y6_0.t(new String[1]);
                var4_3 = "\u0098\u000b\u0011\u0013\"r\u00da;\u00adoT\u00b8x\u0018\u00be\u00fb8\u00c2\u00f4\u0005:!p\u00d2mC\u0019\u009c9\u00daRG\u0093\u00bd9\u0086]Tjy+\u001d\u00b4#\u0015\u00fe\u00c4\u008e+\u00ab\u00b9\u00bd2\u0010b\u00c2f\u001d+\u00b7\u00ae?(\u00bc";
                var5_4 = "\u0098\u000b\u0011\u0013\"r\u00da;\u00adoT\u00b8x\u0018\u00be\u00fb8\u00c2\u00f4\u0005:!p\u00d2mC\u0019\u009c9\u00daRG\u0093\u00bd9\u0086]Tjy+\u001d\u00b4#\u0015\u00fe\u00c4\u008e+\u00ab\u00b9\u00bd2\u0010b\u00c2f\u001d+\u00b7\u00ae?(\u00bc".length();
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
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "Rw\u00a0q\u00ab:\u00c2g\u0091.\u007f\u009a5+\u00a5\u00fc";
                    var5_4 = "Rw\u00a0q\u00ab:\u00c2g\u0091.\u007f\u009a5+\u00a5\u00fc".length();
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
lbl28:
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
lbl39:
                // 1 sources

                ** continue;
            }
        }
        y6_0.a = var6_1;
        y6_0.b = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2C2E;
        if (b[n11] == null) {
            y6_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

