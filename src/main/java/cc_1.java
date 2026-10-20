/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Renamed from cC
 */
public class cc_1
extends DefaultTableCellRenderer {
    Border j;
    JLabel s;
    private static final long[] a;
    private static final Integer[] b;

    public cc_1() {
        this.j = BorderFactory.createEmptyBorder(0, cc_1.a(18607, 3269062062980860896L), 0, 4);
        this.s = new JLabel();
        ((JLabel)this.s).setOpaque(false);
        ((JLabel)this.s).setBorder((Border)this.j);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        block7: {
            block8: {
                block9: {
                    int n12;
                    boolean bl3;
                    block5: {
                        block6: {
                            String string = "";
                            bl3 = uo_0.i();
                            n12 = object.getClass().equals(String.class);
                            if (!bl3) {
                                if (n12 != 0) {
                                    string = (String)object;
                                }
                                ((JLabel)this.s).setText(string);
                                n12 = bl ? 1 : 0;
                            }
                            if (bl3) break block5;
                            if (n12 == 0) break block6;
                            ((JLabel)this.s).setBackground((Color)fx_2.E);
                            ((JLabel)this.s).setForeground((Color)fx_2.o);
                            ((JLabel)this.s).setOpaque(true);
                            if (!bl3) break block7;
                        }
                        n12 = n10 % 2;
                    }
                    int n13 = n12;
                    ((JLabel)this.s).setForeground(new Color(cc_1.a(18064, 8934967926841968094L), cc_1.a(29928, 4784423068431398816L), cc_1.a(29928, 4784423068431398816L)));
                    if (bl3) break block8;
                    if (n13 != 0) break block9;
                    ((JLabel)this.s).setOpaque(false);
                    if (!bl3) break block7;
                }
                ((JLabel)this.s).setOpaque(true);
            }
            ((JLabel)this.s).setBackground(new Color(cc_1.a(27875, 6152197716845539240L), cc_1.a(4519, 3305820026644452077L), cc_1.a(4519, 3305820026644452077L), cc_1.a(222, 1429018933008253847L)));
        }
        return (JLabel)this.s;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 9118749117672873083L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u009e\u00f9\u00f6\u0099\u00f9O\u008e\u00f2\u00ebo\u00e0\u00d1.@s\u00b7k\u00f5\u009c\u00ce\u00eb\u00c5\u00eb\u00e9\u00da}q<\u0095\u008f\u009f\u00e6";
                var5_4 = "\u009e\u00f9\u00f6\u0099\u00f9O\u008e\u00f2\u00ebo\u00e0\u00d1.@s\u00b7k\u00f5\u009c\u00ce\u00eb\u00c5\u00eb\u00e9\u00da}q<\u0095\u008f\u009f\u00e6".length();
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
                    var4_3 = "\u00ff\u00b4]7\f \u00d9\u0097\u00b8\u00cd\u008b{&bW\u0093";
                    var5_4 = "\u00ff\u00b4]7\f \u00d9\u0097\u00b8\u00cd\u008b{&bW\u0093".length();
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
        cc_1.a = var6_1;
        cc_1.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x434A;
        if (b[n11] == null) {
            cc_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

