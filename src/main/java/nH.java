/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class nH
extends JTable {
    zw_0 T;
    c1_0 u;
    private static final long[] a;
    private static final Integer[] b;

    nH(zw_0 zw_02, c1_0 c1_02) {
        block3: {
            TableColumnModel tableColumnModel;
            block2: {
                TableColumnModel tableColumnModel2;
                this.T = zw_02;
                this.u = c1_02;
                this.setModel(c1_02);
                this.setSelectionBackground((Color)fx_2.E);
                this.setSelectionMode(0);
                g5 g52 = new g5();
                String string = zw_0.V();
                this.setDefaultRenderer(Object.class, g52);
                this.setShowGrid(false);
                int n10 = nH.a(17100, 5986239008465241447L);
                this.setGridColor(new Color(n10, n10, n10));
                this.addMouseListener(new L7(this, c1_02, zw_02));
                String string2 = string;
                tableColumnModel = tableColumnModel2 = this.getColumnModel();
                if (string2 == null) break block2;
                if (tableColumnModel.getColumnCount() <= 2) break block3;
                tableColumnModel2.getColumn(0).setPreferredWidth(nH.a(21343, 7822676642979435766L));
                tableColumnModel2.getColumn(1).setPreferredWidth(nH.a(20796, 2367603294841067152L));
                tableColumnModel2.getColumn(2).setPreferredWidth(nH.a(31576, 4470151544674286832L));
                tableColumnModel2.getColumn(3).setPreferredWidth(nH.a(24214, 6504671289324689724L));
                tableColumnModel = tableColumnModel2;
            }
            tableColumnModel.getColumn(4).setPreferredWidth(nH.a(31576, 4470151544674286832L));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6498198663017808661L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "\u0097K\u0010\u0010-a?\u00d9x\u00c3?\u00c6\u00ac\u0090\u0097\u00bc\u00b1\u00dfn\u00ccA\u00f9\u001av";
                var5_4 = "\u0097K\u0010\u0010-a?\u00d9x\u00c3?\u00c6\u00ac\u0090\u0097\u00bc\u00b1\u00dfn\u00ccA\u00f9\u001av".length();
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
                    var4_3 = "\u00e41\u00afa%0\u0006\u00ba\u0093\u00fc\u00e6\u0013C\u0013\u0095\u00b9";
                    var5_4 = "\u00e41\u00afa%0\u0006\u00ba\u0093\u00fc\u00e6\u0013C\u0013\u0095\u00b9".length();
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
        nH.a = var6_1;
        nH.b = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7A8;
        if (b[n11] == null) {
            nH.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

