/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;

public class J6
implements LayoutManager {
    og_1 J;
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public void addLayoutComponent(String string, Component component) {
    }

    @Override
    public void removeLayoutComponent(Component component) {
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        JComponent jComponent;
        Dimension dimension = new Dimension();
        try {
            jComponent = (JComponent)this.J.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        dimension = new Dimension(container.getWidth(), jComponent.getPreferredSize().height);
        return dimension;
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return new Dimension(J6.a(7023, 5129712945139162511L), J6.a(13167, 7373005805903066510L));
    }

    @Override
    public void layoutContainer(Container container) {
        JComponent jComponent;
        Component[] componentArray = container.getComponents();
        try {
            jComponent = (JComponent)this.J.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        JComponent jComponent2 = jComponent;
        jComponent2.setBounds(0, 0, container.getWidth(), container.getHeight());
    }

    public void i(Rectangle rectangle) {
        JComponent jComponent;
        try {
            jComponent = (JComponent)this.J.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jComponent.setBounds(rectangle);
    }

    public og_1 q() {
        return (og_1)this.J;
    }

    public void P(og_1 og_12) {
        this.J = og_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7994035924332159797L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "/\u008d\u0004\u00f6a9\u00be\u00de\u00c8[\u00849\u00d49\u0016\u00df";
        int n11 = "/\u008d\u0004\u00f6a9\u00be\u00de\u00c8[\u00849\u00d49\u0016\u00df".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6E0;
        if (b[n11] == null) {
            J6.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

