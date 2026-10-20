/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/*
 * Renamed from Yy
 */
public class yy_0
extends JTable {
    z_ n;
    c6_0 f;
    private static final long[] a;
    private static final Integer[] b;

    yy_0(z_ z_3, c6_0 c6_02) {
        block3: {
            TableColumnModel tableColumnModel;
            block2: {
                TableColumnModel tableColumnModel2;
                ky_2[] ky_2Array = z_.t();
                this.n = z_3;
                ky_2[] ky_2Array2 = ky_2Array;
                this.f = c6_02;
                this.setModel(c6_02);
                this.setSelectionBackground((Color)fx_2.E);
                this.setSelectionMode(0);
                JI jI = new JI();
                this.setDefaultRenderer(ld_1.class, jI);
                this.setShowGrid(false);
                int n10 = yy_0.a(24765, 747603782168300477L);
                this.setGridColor(new Color(n10, n10, n10));
                this.addMouseListener(new jh_0(this, c6_02, z_3));
                tableColumnModel = tableColumnModel2 = this.getColumnModel();
                if (ky_2Array2 != null) break block2;
                if (tableColumnModel.getColumnCount() <= 2) break block3;
                tableColumnModel2.getColumn(0).setPreferredWidth(yy_0.a(12745, 2358495401579289288L));
                tableColumnModel2.getColumn(1).setPreferredWidth(yy_0.a(15196, 3767527622567366751L));
                tableColumnModel2.getColumn(2).setPreferredWidth(yy_0.a(2467, 7554511668053484198L));
                tableColumnModel2.getColumn(3).setPreferredWidth(yy_0.a(31650, 2918051882401878182L));
                tableColumnModel = tableColumnModel2;
            }
            tableColumnModel.getColumn(4).setPreferredWidth(yy_0.a(3960, 5802092705360422010L));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6163276181693750193L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u00de\u0082\u00885\u0001\u00fd\u00c1Q3^\u00f4\u00ba\u00aa\u009a\u0010\u00c4\u00a5\u00cf\u008c\u0081>\u00e2\u00cb\u0096\u00ca\u00e6\u00e6UF\u009f\u00ff\u00f9";
                var5_4 = "\u00de\u0082\u00885\u0001\u00fd\u00c1Q3^\u00f4\u00ba\u00aa\u009a\u0010\u00c4\u00a5\u00cf\u008c\u0081>\u00e2\u00cb\u0096\u00ca\u00e6\u00e6UF\u009f\u00ff\u00f9".length();
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
                    var4_3 = "\u00d4\u009e\u009cvO\u00a4y+P\u00ac\u0092Y\u0098\u00c2\u000b\u00b7";
                    var5_4 = "\u00d4\u009e\u009cvO\u00a4y+P\u00ac\u0092Y\u0098\u00c2\u000b\u00b7".length();
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
        yy_0.a = var6_1;
        yy_0.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2B01;
        if (b[n11] == null) {
            yy_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

