/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lt
 */
public class lt_2 {
    D2 n;
    BufferedImage M;
    Component z;
    Dimension m;
    static boolean F;
    float N;
    boolean X;
    boolean O;
    String L;
    private static final long[] a;
    private static final Integer[] b;

    public lt_2(Component component, D2 d2) {
        this.M = null;
        this.m = new Dimension();
        this.N = 2.0f;
        this.X = false;
        this.O = true;
        this.L = "";
        this.z = component;
        this.n = d2;
    }

    public void a(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        float f10 = (float)graphics2D.getTransform().getScaleX();
        try {
            lk_0.c(f10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.w((Object)graphics, f10, ((Component)this.z).getWidth(), ((Component)this.z).getHeight());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void w(Graphics graphics, float f10, int n10, int n11) {
        AffineTransform affineTransform;
        Graphics2D graphics2D;
        block38: {
            block37: {
                Cloneable cloneable;
                Color color;
                Object object;
                String[] stringArray;
                block36: {
                    Object object2;
                    block34: {
                        block35: {
                            block30: {
                                int n12;
                                int n13;
                                int n14;
                                block33: {
                                    int n15;
                                    block31: {
                                        block32: {
                                            block29: {
                                                Object object3;
                                                lt_2 lt_22;
                                                block28: {
                                                    boolean bl;
                                                    graphics2D = (Graphics2D)graphics;
                                                    affineTransform = graphics2D.getTransform();
                                                    stringArray = F8.y();
                                                    try {
                                                        bl = (Boolean)vk_0.s();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (stringArray == null) {
                                                        if (bl || f10 == 1.0f) {
                                                            // empty if block
                                                        }
                                                        try {
                                                            bl = (Boolean)vk_0.s();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                    if (!bl) {
                                                        // empty if block
                                                    }
                                                    n14 = (int)((float)n10 * f10);
                                                    n13 = (int)((float)n11 * f10);
                                                    lt_22 = this;
                                                    if (stringArray != null) break block28;
                                                    if ((BufferedImage)lt_22.M != null) break block29;
                                                    lt_22 = this;
                                                }
                                                try {
                                                    object3 = this.Y(n14, n13);
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                lt_22.M = object3;
                                                if (stringArray == null) break block30;
                                            }
                                            n12 = 0;
                                            n15 = n14;
                                            if (stringArray != null) break block31;
                                            if (n15 != ((Dimension)c.c((long)634698459927178616L).get((Object)this)).width) break block32;
                                            n15 = n13;
                                            if (stringArray != null) break block31;
                                            if (n15 == ((Dimension)c.c((long)634698459927178616L).get((Object)this)).height) break block33;
                                        }
                                        n15 = 1;
                                    }
                                    n12 = n15;
                                }
                                object = graphics2D.getDeviceConfiguration().getDevice().getIDstring();
                                int n16 = ((String)this.L).equals(object);
                                if (stringArray == null) {
                                    if (n16 == 0) {
                                        n12 = 1;
                                    }
                                    n16 = n12;
                                }
                                if (n16 != 0) {
                                    Object object4;
                                    try {
                                        object4 = this.Y(n14, n13);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    this.M = object4;
                                    ((Dimension)c.c((long)634698459927178616L).get((Object)this)).width = n14;
                                    ((Dimension)c.c((long)634698459927178616L).get((Object)this)).height = n13;
                                }
                            }
                            this.L = graphics2D.getDeviceConfiguration().getDevice().getIDstring();
                            AffineTransform affineTransform2 = new AffineTransform(f10, 0.0f, 0.0f, f10, 0.0f, 0.0f);
                            object = (Graphics2D)((BufferedImage)this.M).getGraphics();
                            ((Graphics2D)object).setTransform(affineTransform2);
                            color = ((Graphics)object).getColor();
                            object2 = object;
                            if (stringArray != null) break block34;
                            ((Graphics)object2).setColor(new Color(lt_2.a(21216, 4670391162059273871L), lt_2.a(8279, 2351571850038035513L), lt_2.a(8279, 2351571850038035513L)));
                            if (this.O) break block35;
                            ((Graphics)object).fillRect(0, 0, n10, n11);
                            if (stringArray == null) break block36;
                        }
                        object2 = object;
                    }
                    Composite composite = ((Graphics2D)object2).getComposite();
                    ((Graphics2D)object).setComposite(AlphaComposite.getInstance(1, 0.0f));
                    cloneable = new Rectangle2D.Double(0.0, 0.0, n10, n11);
                    ((Graphics2D)object).fill((Shape)((Object)cloneable));
                    ((Graphics2D)object).setComposite(composite);
                }
                ((Graphics)object).setColor(color);
                try {
                    this.n.h(object);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((Graphics)object).dispose();
                if (!this.X) break block37;
                float f11 = 1.0f / this.N;
                cloneable = new AffineTransform((double)f11, 0.0, 0.0, (double)f11, affineTransform.getTranslateX(), affineTransform.getTranslateY());
                graphics2D.setTransform((AffineTransform)cloneable);
                if (stringArray == null) break block38;
            }
            AffineTransform affineTransform3 = new AffineTransform(1.0, 0.0, 0.0, 1.0, affineTransform.getTranslateX(), affineTransform.getTranslateY());
            graphics2D.setTransform(affineTransform3);
        }
        graphics2D.drawImage((Image)((BufferedImage)this.M), 0, 0, null);
        graphics2D.setTransform(affineTransform);
    }

    BufferedImage Y(int n10, int n11) {
        BufferedImage bufferedImage;
        String[] stringArray = F8.y();
        int n12 = this.O;
        if (stringArray == null) {
            if (n12 != 0) {
                BufferedImage bufferedImage2;
                try {
                    bufferedImage2 = (BufferedImage)lk_0.u(n10, n11);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return bufferedImage2;
            }
            n12 = n10;
        }
        try {
            bufferedImage = (BufferedImage)lk_0.W(n12, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return bufferedImage;
    }

    public boolean J() {
        return this.O;
    }

    public void Q(boolean bl) {
        this.O = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8571628829633698297L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "z\u0089\f'\u00f0z\u00ef\u0089\u0011\u00d4\u0013\u00ab\u00e1\u0083\u001d?";
        int n11 = "z\u0089\f'\u00f0z\u00ef\u0089\u0011\u00d4\u0013\u00ab\u00e1\u0083\u001d?".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        lt_2.F = false;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x646F;
        if (b[n11] == null) {
            lt_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

