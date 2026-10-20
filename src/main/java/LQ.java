/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class LQ
extends JTable {
    zK m;
    oa_2 O;
    private static final long[] a;
    private static final Integer[] b;

    LQ(zK zK2, oa_2 oa_22) {
        block3: {
            TableColumnModel tableColumnModel;
            block2: {
                TableColumnModel tableColumnModel2;
                this.m = zK2;
                this.O = oa_22;
                this.setModel(oa_22);
                this.setSelectionBackground((Color)fx_2.E);
                this.setSelectionMode(0);
                xM xM2 = new xM();
                this.setDefaultRenderer(zG.class, xM2);
                String[] stringArray = zK.B();
                this.setShowGrid(false);
                int n10 = LQ.a(4664, 6672082193902842022L);
                this.setGridColor(new Color(n10, n10, n10));
                this.addMouseListener(new JF(this, oa_22, zK2));
                String[] stringArray2 = stringArray;
                tableColumnModel = tableColumnModel2 = this.getColumnModel();
                if (stringArray2 == null) break block2;
                if (tableColumnModel.getColumnCount() <= 1) break block3;
                tableColumnModel2.getColumn(0).setPreferredWidth(LQ.a(19387, 7183216449445751078L));
                tableColumnModel = tableColumnModel2;
            }
            tableColumnModel.getColumn(1).setPreferredWidth(LQ.a(21734, 5361513782989223545L));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2137019640573185596L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00fc\u00ebK\u00eeg\u000b9iW\u0003\u0088j\u00dd\u00ac~RDY\u00ec\u00db\u0007\u0091'~";
        int n11 = "\u00fc\u00ebK\u00eeg\u000b9iW\u0003\u0088j\u00dd\u00ac~RDY\u00ec\u00db\u0007\u0091'~".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x229F;
        if (b[n11] == null) {
            LQ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

