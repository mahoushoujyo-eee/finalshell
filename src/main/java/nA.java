/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class nA
extends JTable {
    Y_ Z;
    VX g;
    private static final long[] a;
    private static final Integer[] b;

    nA(Y_ y_, VX vX) {
        block3: {
            TableColumnModel tableColumnModel;
            block2: {
                TableColumnModel tableColumnModel2;
                this.Z = y_;
                this.g = vX;
                this.setModel(vX);
                String[] stringArray = Y_.j();
                this.setSelectionBackground((Color)fx_2.E);
                this.setSelectionMode(0);
                C6 c6 = new C6();
                this.setDefaultRenderer(ln_1.class, c6);
                this.setShowGrid(false);
                String[] stringArray2 = stringArray;
                int n10 = nA.a(4474, 7314591075151813528L);
                this.setGridColor(new Color(n10, n10, n10));
                this.addMouseListener(new y4_0(this));
                tableColumnModel = tableColumnModel2 = this.getColumnModel();
                if (stringArray2 == null) break block2;
                if (tableColumnModel.getColumnCount() <= 2) break block3;
                tableColumnModel2.getColumn(0).setPreferredWidth(nA.a(2175, 1413830116305502876L));
                tableColumnModel2.getColumn(1).setPreferredWidth(nA.a(16363, 6373331554484532490L));
                tableColumnModel = tableColumnModel2;
            }
            tableColumnModel.getColumn(2).setPreferredWidth(nA.a(13044, 1039826064687446036L));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7188211259457863402L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "d\u00f6\u0003uN\u00a4K\u0084\u0085\u00ee\u00f0\r\u00af\u0091\u00c6\u009a";
                var5_4 = "d\u00f6\u0003uN\u00a4K\u0084\u0085\u00ee\u00f0\r\u00af\u0091\u00c6\u009a".length();
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
                    var4_3 = "\u00d1\u000e\u0001\u00fa\u00bdQ|\u00be,\u001f\u00db\u00acU\u00d8e\u00ba";
                    var5_4 = "\u00d1\u000e\u0001\u00fa\u00bdQ|\u00be,\u001f\u00db\u00acU\u00d8e\u00ba".length();
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
        nA.a = var6_1;
        nA.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xAE1;
        if (b[n11] == null) {
            nA.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

