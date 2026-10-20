/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * Renamed from Bi
 */
public class bi_0
extends JPanel {
    private static final long[] a;
    private static final Integer[] b;

    bi_0() {
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(new Color(bi_0.a(5322, 8166423488860772340L), bi_0.a(2798, 7607016043794647505L), bi_0.a(2798, 7607016043794647505L)));
        int n10 = bi_0.a(18612, 1673463886484835208L);
        graphics.drawLine(this.getWidth() - 1, n10, this.getWidth() - 1, this.getHeight() - n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5550589772441252277L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u0094\r\u0081q\"\u00b5&\u00d7\u0000\u00fag\u00ae\u00a3U8\u00f2*zN\u008a\u00b2\u0019z;";
        int n11 = "\u0094\r\u0081q\"\u00b5&\u00d7\u0000\u00fag\u00ae\u00a3U8\u00f2*zN\u008a\u00b2\u0019z;".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x433E;
        if (b[n11] == null) {
            bi_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

