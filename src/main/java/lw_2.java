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
 * Renamed from lw
 */
public class lw_2
extends JTable {
    private static final long[] a;
    private static final Integer[] b;

    public lw_2() {
        this.setSelectionBackground((Color)fx_2.E);
        this.setSelectionForeground((Color)fx_2.o);
        this.setBorder(null);
        this.setDragEnabled(false);
        this.setShowGrid(false);
        this.setAutoResizeMode(3);
        this.setIntercellSpacing(new Dimension(0, 0));
        this.setSelectionMode(0);
        this.addMouseListener(new V1(this));
    }

    @Override
    public void setModel(TableModel tableModel) {
        block4: {
            TableColumnModel tableColumnModel;
            int[] nArray;
            TableColumnModel tableColumnModel2;
            block3: {
                super.setModel(tableModel);
                tableColumnModel2 = this.getColumnModel();
                int[] nArray2 = YQ.m();
                this.setPreferredScrollableViewportSize(new Dimension(lw_2.a(29131, 646375044043598335L), lw_2.a(4454, 8676190360003479895L)));
                nArray = nArray2;
                tableColumnModel = tableColumnModel2;
                if (nArray == null) break block3;
                if (tableColumnModel.getColumnCount() <= 2) break block4;
                tableColumnModel2.getColumn(0).setPreferredWidth(lw_2.a(6882, 8226826480149496532L));
                tableColumnModel2.getColumn(0).setMinWidth(lw_2.a(5267, 543409159480478894L));
                tableColumnModel2.getColumn(0).setMaxWidth(lw_2.a(7194, 2686019252591232047L));
                tableColumnModel2.getColumn(1).setPreferredWidth(lw_2.a(29670, 6956600063648623569L));
                tableColumnModel2.getColumn(1).setMinWidth(lw_2.a(7109, 2674958735282373623L));
                tableColumnModel2.getColumn(2).setPreferredWidth(lw_2.a(1685, 2208406283000258213L));
                tableColumnModel2.getColumn(2).setMinWidth(lw_2.a(29059, 3754787136993913276L));
                tableColumnModel2.getColumn(2).setMaxWidth(lw_2.a(29059, 3754787136993913276L));
                tableColumnModel2.getColumn(3).setPreferredWidth(lw_2.a(29059, 3754787136993913276L));
                tableColumnModel2.getColumn(3).setMinWidth(lw_2.a(29059, 3754787136993913276L));
                tableColumnModel2.getColumn(3).setMaxWidth(lw_2.a(29059, 3754787136993913276L));
                tableColumnModel2.getColumn(4).setPreferredWidth(lw_2.a(32296, 2741972433358743060L));
                tableColumnModel = tableColumnModel2;
            }
            tableColumnModel.getColumn(4).setMinWidth(lw_2.a(25057, 9192055113034463698L));
            kb_1 kb_12 = new kb_1();
            for (int i2 = 0; i2 < tableColumnModel2.getColumnCount(); ++i2) {
                tableColumnModel2.getColumn(i2).setCellRenderer(kb_12);
                if (nArray != null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 395338075383430815L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "#\u00b5V\u00e4\u00ff\u00e5\u00fa\u00ae\u0005;|p\u0006\u008fY@mT\u009d\u00a5\u00fbV\u0014b\\\u00b5\u000f\u000f\u0017|\u00fc_\u007f\u00c7\u00c8\u00a3v\u00c7P\u00d8/\u00adp\u00fd\u00dc\u0092\u00e0\u0006\u00c1$\u00fb?\u00f5Q\u0007\u00cf\u001f\t}\u0010\u0098?\u00fd\u0092\u008d\u0092HP\u00d3\u00edr/";
                var5_4 = "#\u00b5V\u00e4\u00ff\u00e5\u00fa\u00ae\u0005;|p\u0006\u008fY@mT\u009d\u00a5\u00fbV\u0014b\\\u00b5\u000f\u000f\u0017|\u00fc_\u007f\u00c7\u00c8\u00a3v\u00c7P\u00d8/\u00adp\u00fd\u00dc\u0092\u00e0\u0006\u00c1$\u00fb?\u00f5Q\u0007\u00cf\u001f\t}\u0010\u0098?\u00fd\u0092\u008d\u0092HP\u00d3\u00edr/".length();
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
                    var4_3 = "f:Vs\u0007(\u008b\u0003x\u0082S\u00adn\u00d0\u0017\u001f";
                    var5_4 = "f:Vs\u0007(\u008b\u0003x\u0082S\u00adn\u00d0\u0017\u001f".length();
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
        lw_2.a = var6_1;
        lw_2.b = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1835;
        if (b[n11] == null) {
            lw_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

