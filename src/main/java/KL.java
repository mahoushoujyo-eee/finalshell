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
import javax.swing.table.TableCellRenderer;

class KL
extends JLabel
implements TableCellRenderer {
    private final Border U = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, new Color(KL.a(16700, 7768351546985926532L), KL.a(14500, 8924090082085877277L), KL.a(14500, 8924090082085877277L))), BorderFactory.createEmptyBorder(2, 2, 1, 2));
    private final Color F = new Color(0, true);
    private static final long[] a;
    private static final Integer[] b;

    KL() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Component getTableCellRendererComponent(JTable var1_1, Object var2_2, boolean var3_3, boolean var4_4, int var5_5, int var6_6) {
        var7_7 = km_0.U();
        v0 = var2_2;
        if (var7_7 != null) ** GOTO lbl6
        if (v0 != null) {
            v0 = var2_2;
lbl6:
            // 2 sources

            v1 = v0.toString();
        } else {
            v1 = "";
        }
        this.setText(v1);
        this.setHorizontalAlignment(0);
        this.setOpaque(false);
        this.setBackground((Color)this.F);
        this.setForeground(Color.BLACK);
        this.setBorder((Border)this.U);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4838082143190303202L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u008f\u0084'2\u00a5Twi\u0013\u00b1\u00c3\u00c8\u00a3w\u000e\u00f0";
        int n11 = "\u008f\u0084'2\u00a5Twi\u0013\u00b1\u00c3\u00c8\u00a3w\u000e\u00f0".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xEB9;
        if (b[n11] == null) {
            KL.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

