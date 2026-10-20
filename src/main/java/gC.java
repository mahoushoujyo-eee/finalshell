/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;

class gC
extends JScrollPane {
    private static final long[] a;
    private static final Integer[] b;

    gC(Component component) {
        super(component);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.setColor(new Color(gC.a(9027, 7207630479965414036L), gC.a(17656, 7074004464367273261L), gC.a(17656, 7074004464367273261L), gC.a(10517, 6162690979598231747L)));
        graphics.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2328232635136771963L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "J\u00e3K\u00de\u00ddQe'h\u0081\u0085Zh\u00b8o\u00c0l\u00c7R\u00c4\u00a5\u00ef\u0002\u009e";
        int n11 = "J\u00e3K\u00de\u00ddQe'h\u0081\u0085Zh\u00b8o\u00c0l\u00c7R\u00c4\u00a5\u00ef\u0002\u009e".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x41D7;
        if (b[n11] == null) {
            gC.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

