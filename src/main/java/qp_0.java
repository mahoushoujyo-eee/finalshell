/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/*
 * Renamed from Qp
 */
public class qp_0
extends JTable {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    qp_0() {
        this.setSelectionBackground((Color)fx_2.E);
        this.setSelectionForeground((Color)fx_2.o);
        this.setBorder(null);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setDragEnabled(false);
        this.setShowGrid(false);
        this.setAutoResizeMode(3);
        this.setIntercellSpacing(new Dimension(0, 0));
        this.setSelectionMode(0);
        this.getTableHeader().setFont((Font)fx_2.X);
        this.addMouseListener(new db_1(this));
        this.setDefaultRenderer(kl_0.class, new BL());
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    }

    @Override
    public void setModel(TableModel tableModel) {
        block4: {
            TableColumnModel tableColumnModel;
            int n10;
            boolean bl;
            TableColumnModel tableColumnModel2;
            block3: {
                super.setModel(tableModel);
                tableColumnModel2 = this.getColumnModel();
                bl = s.q();
                this.setPreferredScrollableViewportSize(new Dimension(qp_0.a(27490, 9008288787270549889L), qp_0.a(28871, 727885258968914469L)));
                JLabel jLabel = new JLabel();
                jLabel.setFont((Font)fx_2.X);
                jLabel.setText(a);
                n10 = jLabel.getPreferredSize().width;
                tableColumnModel = tableColumnModel2;
                if (!bl) break block3;
                if (tableColumnModel.getColumnCount() <= 1) break block4;
                tableColumnModel2.getColumn(0).setPreferredWidth(qp_0.a(3811, 1661198216132142085L));
                tableColumnModel2.getColumn(0).setMinWidth(qp_0.a(20169, 3273156019140584489L));
                tableColumnModel2.getColumn(1).setPreferredWidth(qp_0.a(26438, 8368305677147721127L));
                tableColumnModel = tableColumnModel2;
            }
            tableColumnModel.getColumn(1).setMinWidth(n10);
            BL bL = new BL();
            for (int i2 = 0; i2 < tableColumnModel2.getColumnCount(); ++i2) {
                tableColumnModel2.getColumn(i2).setCellRenderer(bL);
                if (bl) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "c\u001fJGT6Cc\u001fJGT6".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 104;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 51;
                                break;
                            }
                            case 1: {
                                v9 = 79;
                                break;
                            }
                            case 2: {
                                v9 = 26;
                                break;
                            }
                            case 3: {
                                v9 = 1;
                                break;
                            }
                            case 4: {
                                v9 = 4;
                                break;
                            }
                            case 5: {
                                v9 = 19;
                                break;
                            }
                            default: {
                                v9 = 4;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                qp_0.a = new String(v10).intern();
                var0_1 = 9164847704104554022L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "M\u0094\r`\u00b5\u00a13\u0013y\u0096\u0013\u0086`\u00d1\u00c1\u0087\u00a5\u00a5M\u00dbX\u00fa\u00aa\u0011";
                var5_5 = "M\u0094\r`\u00b5\u00a13\u0013y\u0096\u0013\u0086`\u00d1\u00c1\u0087\u00a5\u00a5M\u00dbX\u00fa\u00aa\u0011".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u009dW]e\u00f5\u00f2\u0083\u00d1\u00a3\u000e\u00ee_\t\u00a5i\u00cb";
                    var5_5 = "\u009dW]e\u00f5\u00f2\u0083\u00d1\u00a3\u000e\u00ee_\t\u00a5i\u00cb".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        qp_0.b = var6_2;
        qp_0.c = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2AE2;
        if (c[n11] == null) {
            qp_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

