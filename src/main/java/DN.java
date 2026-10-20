/*
 * Decompiled with CFR 0.152.
 */
import com.KS;
import com.c;
import com.ne_2;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class DN
extends ne_2 {
    private BufferedImage I;
    private static final Map D;
    private static final long[] a;
    private static final Integer[] b;

    public DN() {
        this(DN.a(14808, 3943790025191899887L));
    }

    public DN(int n10) {
        super(n10);
        Font font;
        Object object;
        this.I = null;
        this.L(false);
        this.c(false);
        KS kS = new KS(3, DN.a(14435, 4717495035907064661L), 3, 3);
        this.setBorder(kS);
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            font = (Font)fx_2.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setFont(font);
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        super.paint(graphics);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void paintComponent(Graphics graphics) {
        block15: {
            block9: {
                Object object;
                BufferedImage bufferedImage;
                int n10;
                int n11;
                String string;
                block13: {
                    block14: {
                        DN dN;
                        block11: {
                            block12: {
                                int n12;
                                block10: {
                                    block8: {
                                        Container container = this.getTopLevelAncestor();
                                        string = aA.z();
                                        n12 = container instanceof Window;
                                        if (string != null) break block8;
                                        if (n12 == 0) break block9;
                                        n12 = ((Window)container).isOpaque();
                                    }
                                    if (string != null) break block10;
                                    if (n12 != 0) break block9;
                                    n12 = this.getWidth();
                                }
                                n11 = n12;
                                n10 = this.getHeight();
                                dN = this;
                                if (string != null) break block11;
                                if ((BufferedImage)dN.I == null) break block12;
                                dN = this;
                                if (string != null) break block11;
                                if (((BufferedImage)dN.I).getWidth() != n11) break block12;
                                bufferedImage = (BufferedImage)this.I;
                                if (string != null) break block13;
                                if (bufferedImage.getHeight() == n10) break block14;
                            }
                            dN = this;
                        }
                        object = dN.getGraphicsConfiguration();
                        this.I = ((GraphicsConfiguration)object).createCompatibleImage(n11, n10, 3);
                    }
                    bufferedImage = (BufferedImage)this.I;
                }
                object = bufferedImage.createGraphics();
                try {
                    super.paintComponent((Graphics)object);
                }
                finally {
                    ((Graphics)object).dispose();
                }
                graphics.drawImage((BufferedImage)this.I, 0, 0, n11, n10, 0, 0, n11, n10, null);
                if (string == null) break block15;
            }
            super.paintComponent(graphics);
        }
    }

    public ImageIcon U(String string) {
        ImageIcon imageIcon;
        try {
            imageIcon = (ImageIcon)this.q(this.getClass(), (Object)string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return imageIcon;
    }

    public ImageIcon q(Class clazz, String string) {
        String string2 = clazz.getCanonicalName() + ":" + string;
        String string3 = aA.z();
        Map map = (Map)DN.D;
        String string4 = string2;
        if (string3 == null) {
            if (!map.containsKey(string4)) {
                ((Map)DN.D).put(string2, new ImageIcon(clazz.getResource("/" + string)));
            }
            map = (Map)DN.D;
            string4 = string2;
        }
        return (ImageIcon)map.get(string4);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3754755697294332681L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00e1h\u00ae\u00c0\u00c3\u00d0\u0091\u00e9T\u00b3\u008cLgr\u0090V";
        int n11 = "\u00e1h\u00ae\u00c0\u00c3\u00d0\u0091\u00e9T\u00b3\u008cLgr\u0090V".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        D = new HashMap();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7B37;
        if (b[n11] == null) {
            DN.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

