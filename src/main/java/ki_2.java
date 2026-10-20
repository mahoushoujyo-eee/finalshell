/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Dimension;
import javax.swing.JPanel;

/*
 * Renamed from ki
 */
public class ki_2
extends JPanel {
    Y3 y;
    private static final long[] a;
    private static final Integer[] b;

    public ki_2(Y3 y3) {
        nB nB2 = new nB();
        this.setLayout(nB2);
        this.y = y3;
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(ki_2.a(5010, 9206486670880300411L), ki_2.a(27294, 5320961396955161718L)));
        this.add(y3);
    }

    public Y3 P() {
        return (Y3)this.y;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6680658910786993314L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00ffE,\u000bd1\u00e0\u00f5\u00c6~t\u00ef\u00d2\u0015\u0099\u00f8";
        int n11 = "\u00ffE,\u000bd1\u00e0\u00f5\u00c6~t\u00ef\u00d2\u0015\u0099\u00f8".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4EE9;
        if (b[n11] == null) {
            ki_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

