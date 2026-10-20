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

/*
 * Renamed from Uo
 */
public class uo_0
extends JTable {
    gk_0 O;
    int p;
    int T;
    boolean c;
    private static boolean q;
    private static final long[] a;
    private static final Integer[] b;

    public uo_0(boolean bl) {
        this.p = -1;
        this.T = -1;
        this.c = false;
        this.c = bl;
        this.setSelectionBackground((Color)fx_2.E);
        this.setSelectionForeground((Color)fx_2.o);
        this.setBorder(null);
        this.setDragEnabled(false);
        this.setShowGrid(false);
        this.setAutoResizeMode(3);
        this.setIntercellSpacing(new Dimension(0, 0));
        this.setAutoscrolls(false);
        this.setSelectionMode(0);
        this.addMouseListener(new TT(this));
    }

    public void a(gk_0 gk_02) {
        boolean bl;
        block11: {
            TableRowSorter tableRowSorter;
            block12: {
                TableColumnModel tableColumnModel;
                boolean bl2;
                block15: {
                    int n10;
                    block13: {
                        int n11;
                        block14: {
                            this.O = gk_02;
                            boolean bl3 = uo_0.k();
                            super.setModel(gk_02);
                            bl2 = bl3;
                            tableColumnModel = this.getColumnModel();
                            this.setPreferredScrollableViewportSize(new Dimension(uo_0.a(25595, 7063817420701316977L), uo_0.a(9419, 229963766743134278L)));
                            if (!bl2) break block11;
                            if (tableColumnModel.getColumnCount() <= 2) break block12;
                            n11 = uo_0.a(8322, 5857202403724456971L);
                            n10 = this.c;
                            if (!bl2) break block13;
                            if (n10 != 0) break block14;
                            tableColumnModel.getColumn(0).setPreferredWidth(n11 + uo_0.a(27045, 1956572961118338340L));
                            tableColumnModel.getColumn(0).setMinWidth(n11 + uo_0.a(28876, 8868048237203104844L));
                            tableColumnModel.getColumn(0).setMaxWidth(n11 + uo_0.a(28876, 8868048237203104844L));
                            tableColumnModel.getColumn(1).setPreferredWidth(uo_0.a(27549, 2142858034283888402L));
                            tableColumnModel.getColumn(1).setMinWidth(uo_0.a(15720, 6233352049541310955L));
                            tableColumnModel.getColumn(1).setMaxWidth(uo_0.a(19223, 5580837678578835345L));
                            tableColumnModel.getColumn(2).setPreferredWidth(uo_0.a(15720, 6233352049541310955L));
                            tableColumnModel.getColumn(2).setMinWidth(uo_0.a(15720, 6233352049541310955L));
                            tableColumnModel.getColumn(2).setMaxWidth(uo_0.a(16970, 8684712898756220609L));
                            tableColumnModel.getColumn(3).setPreferredWidth(n11);
                            tableColumnModel.getColumn(3).setMinWidth(n11);
                            tableColumnModel.getColumn(3).setMaxWidth(n11);
                            tableColumnModel.getColumn(4).setPreferredWidth(uo_0.a(16774, 7739565980523762954L));
                            tableColumnModel.getColumn(4).setMinWidth(uo_0.a(29759, 2880920720934641848L));
                            tableColumnModel.getColumn(5).setPreferredWidth(uo_0.a(73, 7505577197186700492L));
                            tableColumnModel.getColumn(5).setMinWidth(uo_0.a(9237, 1868883256011321501L));
                            if (bl2) break block15;
                        }
                        tableColumnModel.getColumn(0).setPreferredWidth(n11 + uo_0.a(28876, 8868048237203104844L));
                        tableColumnModel.getColumn(0).setMinWidth(n11 + uo_0.a(28876, 8868048237203104844L));
                        tableColumnModel.getColumn(0).setMaxWidth(n11 + uo_0.a(28876, 8868048237203104844L));
                        tableColumnModel.getColumn(1).setPreferredWidth(uo_0.a(31100, 6469178833126927864L));
                        tableColumnModel.getColumn(1).setMaxWidth(uo_0.a(10561, 8874418977266793935L));
                        tableColumnModel.getColumn(1).setMinWidth(uo_0.a(9237, 1868883256011321501L));
                        tableColumnModel.getColumn(2).setPreferredWidth(uo_0.a(15720, 6233352049541310955L));
                        tableColumnModel.getColumn(2).setMinWidth(uo_0.a(15720, 6233352049541310955L));
                        tableColumnModel.getColumn(2).setMaxWidth(uo_0.a(15720, 6233352049541310955L));
                        n10 = uo_0.a(13825, 5180027800035058307L);
                    }
                    int n12 = n10;
                    tableColumnModel.getColumn(3).setPreferredWidth(n12);
                    tableColumnModel.getColumn(3).setMinWidth(n12);
                    tableColumnModel.getColumn(3).setMaxWidth(n12);
                    tableColumnModel.getColumn(4).setPreferredWidth(n12);
                    tableColumnModel.getColumn(4).setMinWidth(n12);
                    tableColumnModel.getColumn(4).setMaxWidth(n12);
                }
                f1_0 f1_02 = new f1_0(this.c);
                for (int i2 = 0; i2 < tableColumnModel.getColumnCount(); ++i2) {
                    tableColumnModel.getColumn(i2).setCellRenderer(f1_02);
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block11;
                }
            }
            try {
                tableRowSorter = (TableRowSorter)this.f();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.setRowSorter(tableRowSorter);
            this.getRowSorter().toggleSortOrder(3);
            this.getTableHeader().addMouseListener(new WN(this));
        }
        JTableHeader jTableHeader = this.getTableHeader();
        try {
            bl = (Boolean)vk_0.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (bl) {
            jTableHeader.addMouseListener(new gY(this, jTableHeader));
        }
    }

    protected TableRowSorter f() {
        gk_0 gk_02 = (gk_0)this.getModel();
        boolean bl = uo_0.i();
        u9_0 u9_02 = new u9_0(this, gk_02);
        int n10 = 0;
        do {
            block9: {
                JS jS;
                block8: {
                    block7: {
                        String string;
                        int n11;
                        try {
                            n11 = (Integer)gk_02.getColumnCount();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (n10 >= n11) break;
                        try {
                            string = (String)gk_02.e(n10);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string2 = string;
                        jS = new JS(this, string2);
                        if (bl) break block7;
                        if (jS != null) break block8;
                        u9_02.setSortable(n10, false);
                    }
                    if (!bl) break block9;
                }
                u9_02.setComparator(n10, jS);
            }
            ++n10;
        } while (!bl);
        return u9_02;
    }

    public int J() {
        return this.p;
    }

    public void w(int n10) {
        this.p = n10;
    }

    public static void J(boolean bl) {
        q = bl;
    }

    public static boolean i() {
        return q;
    }

    public static boolean k() {
        boolean bl = uo_0.i();
        return !bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4505512185014356453L;
                var6_1 = new long[16];
                var3_2 = 0;
                var4_3 = "\u00a9\u00f0\u0003\u0086\u00b1\u00e7\u00f0\u00b4Rqe\u008e,g\u009f@\u0015G\u009f\u0088o\u00c3y\u00fa\u0013\u007f/s\u00adv\u00fd\u00be\u008eF\u008bL\u0081\u0001t\u00e2\u00a0Kh`gl\u00b6\u00b1#\u00cbWa\u00de(\u009d\u00ebA\u00fa\u00fd~\u00d5\u0016\u00de\u00b3o\u00f51(\u00d5Ek\u0002\u00cc\u00f7H\u00a4\u00d6%`H\u00bf\u00c8\u0097D\u0003|\u00ad\u00a3P\u00a0\u00d1\u0080\u00e2n4\u00cbC\u00ea\u008c\u00b5\u00d27\u0016\u00e2\u00ce*\u00a9\u00f8\u00c3\u00a6\u00a9\u00df";
                var5_4 = "\u00a9\u00f0\u0003\u0086\u00b1\u00e7\u00f0\u00b4Rqe\u008e,g\u009f@\u0015G\u009f\u0088o\u00c3y\u00fa\u0013\u007f/s\u00adv\u00fd\u00be\u008eF\u008bL\u0081\u0001t\u00e2\u00a0Kh`gl\u00b6\u00b1#\u00cbWa\u00de(\u009d\u00ebA\u00fa\u00fd~\u00d5\u0016\u00de\u00b3o\u00f51(\u00d5Ek\u0002\u00cc\u00f7H\u00a4\u00d6%`H\u00bf\u00c8\u0097D\u0003|\u00ad\u00a3P\u00a0\u00d1\u0080\u00e2n4\u00cbC\u00ea\u008c\u00b5\u00d27\u0016\u00e2\u00ce*\u00a9\u00f8\u00c3\u00a6\u00a9\u00df".length();
                uo_0.J(false);
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
                    var4_3 = "\u001a\u00e7{o\u00a7\u00f8$\u008b]`$\u00ee\u00d6l\\-";
                    var5_4 = "\u001a\u00e7{o\u00a7\u00f8$\u008b]`$\u00ee\u00d6l\\-".length();
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
        uo_0.a = var6_1;
        uo_0.b = new Integer[16];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x548A;
        if (b[n11] == null) {
            uo_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

