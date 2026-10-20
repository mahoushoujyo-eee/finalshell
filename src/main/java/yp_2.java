/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;

/*
 * Renamed from yp
 */
public class yp_2
extends JPanel {
    BufferedImage a;
    U t;
    BufferedImage I;
    Dimension Z;
    private static final long[] b;
    private static final Integer[] c;

    public yp_2(U u10) {
        this.Z = new Dimension();
        this.t = u10;
        this.setBackground(new Color(yp_2.a(23044, 7231760300941467345L), yp_2.a(30567, 7967035522027418547L), yp_2.a(30567, 7967035522027418547L)));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
    }

    private void C(Graphics graphics) {
        block3: {
            int n10;
            Graphics2D graphics2D = (Graphics2D)graphics;
            int n11 = ((BufferedImage)this.a).getWidth();
            String[] stringArray = F8.y();
            int n12 = ((BufferedImage)this.a).getHeight();
            int n13 = 0;
            while (n13 < this.getHeight()) {
                block4: {
                    n10 = 0;
                    if (stringArray != null) break block3;
                    for (int i2 = v13114719; i2 < this.getWidth(); i2 += n11) {
                        graphics2D.drawImage((Image)((BufferedImage)this.a), i2, n13, this);
                        if (stringArray == null) {
                            if (stringArray == null) continue;
                        }
                        break block4;
                    }
                    n13 += n12;
                }
                if (stringArray == null) continue;
            }
            n10 = graphics2D.drawImage((BufferedImage)this.a, 0, 0, this.getWidth(), this.getHeight(), this) ? 1 : 0;
        }
    }

    public void s(BufferedImage bufferedImage) {
        try {
            this.paintComponent(bufferedImage.getGraphics());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void C(BufferedImage bufferedImage, Point point) {
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        if ((BufferedImage)this.I != null) {
            graphics2D.drawImage((Image)((BufferedImage)this.I), -point.x, -point.y, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4738516379375152624L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u008b>\u00ee\u008d\bZ^\u00bc=\u0083\u00e43\re\u00f3\u00de";
        int n11 = "\u008b>\u00ee\u008d\bZ^\u00bc=\u0083\u00e43\re\u00f3\u00de".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4D4;
        if (c[n11] == null) {
            yp_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

