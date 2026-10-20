/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;

/*
 * Renamed from d2
 */
class d2_0
extends JScrollPane {
    private static final long[] a;
    private static final Integer[] b;

    d2_0(Component component) {
        super(component);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.setColor(new Color(d2_0.a(2442, 8044787491513592176L), d2_0.a(18545, 1280317372384225417L), d2_0.a(18545, 1280317372384225417L), d2_0.a(23678, 2961074536848276613L)));
        graphics.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5735371437760898807L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "u0p\u00cb\u00c7\u0084\u008fOou`? \u00e3Z\n\u0004\u00ed\u00bcy\u0096\u0011\u00ce\u00b6";
        int n11 = "u0p\u00cb\u00c7\u0084\u008fOou`? \u00e3Z\n\u0004\u00ed\u00bcy\u0096\u0011\u00ce\u00b6".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x60FA;
        if (b[n11] == null) {
            d2_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

