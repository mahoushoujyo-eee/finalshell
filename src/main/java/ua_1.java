/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/*
 * Renamed from uA
 */
public class ua_1
extends JTable {
    private static final long[] a;
    private static final Integer[] b;

    public ua_1() {
        this.setSelectionBackground((Color)fx_2.E);
        this.setSelectionForeground((Color)fx_2.o);
        this.setBorder(null);
        this.setDragEnabled(false);
        this.setShowGrid(false);
        this.setAutoResizeMode(3);
        this.setIntercellSpacing(new Dimension(0, 0));
        this.setSelectionMode(0);
        this.addMouseListener(new U_(this));
    }

    @Override
    public void setModel(TableModel tableModel) {
        block4: {
            TableColumnModel tableColumnModel;
            int[] nArray;
            TableColumnModel tableColumnModel2;
            block3: {
                int[] nArray2 = L9.X();
                super.setModel(tableModel);
                tableColumnModel2 = this.getColumnModel();
                nArray = nArray2;
                this.setPreferredScrollableViewportSize(new Dimension(ua_1.a(6556, 7497739156182494726L), ua_1.a(17690, 1441599798093984393L)));
                tableColumnModel = tableColumnModel2;
                if (nArray != null) break block3;
                if (tableColumnModel.getColumnCount() <= 2) break block4;
                tableColumnModel2.getColumn(0).setPreferredWidth(ua_1.a(22601, 3353290053650657232L));
                tableColumnModel2.getColumn(0).setMinWidth(ua_1.a(27908, 2904329102998739601L));
                tableColumnModel2.getColumn(0).setMaxWidth(ua_1.a(12979, 4783578787255469348L));
                tableColumnModel2.getColumn(1).setPreferredWidth(ua_1.a(28869, 945635511555491669L));
                tableColumnModel2.getColumn(1).setMinWidth(ua_1.a(2189, 5174710335906807579L));
                tableColumnModel2.getColumn(2).setPreferredWidth(ua_1.a(22629, 2442632864783446001L));
                tableColumnModel2.getColumn(2).setMinWidth(ua_1.a(27711, 6598046465395792814L));
                tableColumnModel2.getColumn(2).setMaxWidth(ua_1.a(27711, 6598046465395792814L));
                tableColumnModel2.getColumn(3).setPreferredWidth(ua_1.a(27711, 6598046465395792814L));
                tableColumnModel2.getColumn(3).setMinWidth(ua_1.a(27711, 6598046465395792814L));
                tableColumnModel2.getColumn(3).setMaxWidth(ua_1.a(27711, 6598046465395792814L));
                tableColumnModel2.getColumn(4).setPreferredWidth(ua_1.a(23065, 826086892827716994L));
                tableColumnModel = tableColumnModel2;
            }
            tableColumnModel.getColumn(4).setMinWidth(ua_1.a(6868, 1688547314968227142L));
            LR lR = new LR();
            for (int i2 = 0; i2 < tableColumnModel2.getColumnCount(); ++i2) {
                tableColumnModel2.getColumn(i2).setCellRenderer(lR);
                if (nArray == null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6137642646206389079L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u00f6\u00ac\u00aeg4\u00c1\u000e\u00ce\u00d6+\u0006\u00b3\u00fauv\u00931X\u00f0@\u00b0\u001b\u0080\u00c5\u009c\u00a8\u00e0\u0089\u0004)\u001d.\u00e9\u00b5\u00aa*\u00d4\u001f^m\tZ\u00bf\u00df\u00ee/\u00e4\u00b6\u0017\u00d9\u00e0v\u00baz\u0001\u00d8\u00e0*\u00bf\u00d2\u00cbw4\u009a\u0015\u00fc\u00d2\u00a4-\u00f1\u00a5]";
                var5_4 = "\u00f6\u00ac\u00aeg4\u00c1\u000e\u00ce\u00d6+\u0006\u00b3\u00fauv\u00931X\u00f0@\u00b0\u001b\u0080\u00c5\u009c\u00a8\u00e0\u0089\u0004)\u001d.\u00e9\u00b5\u00aa*\u00d4\u001f^m\tZ\u00bf\u00df\u00ee/\u00e4\u00b6\u0017\u00d9\u00e0v\u00baz\u0001\u00d8\u00e0*\u00bf\u00d2\u00cbw4\u009a\u0015\u00fc\u00d2\u00a4-\u00f1\u00a5]".length();
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
                    var4_3 = "1+q\u00fe{\u00a0\u00bbq\u0003\u00ae.\u00b4Y\u00d94\u0093";
                    var5_4 = "1+q\u00fe{\u00a0\u00bbq\u0003\u00ae.\u00b4Y\u00d94\u0093".length();
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
        ua_1.a = var6_1;
        ua_1.b = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7793;
        if (b[n11] == null) {
            ua_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

