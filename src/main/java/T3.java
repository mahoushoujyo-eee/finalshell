/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public class T3
implements LayoutManager {
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
        Dimension dimension = new Dimension();
        dimension = new Dimension(T3.a(30281, 9053219455060983881L), T3.a(6416, 2628195482779889425L));
        return dimension;
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return new Dimension(T3.a(6416, 2628195482779889425L), T3.a(6416, 2628195482779889425L));
    }

    @Override
    public void layoutContainer(Container container) {
        Component[] componentArray = container.getComponents();
        String string = km_0.U();
        for (Component component : componentArray) {
            component.setBounds(0, 0, container.getWidth(), container.getHeight());
            if (string == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3744109555090489656L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00edcfTC\u00c0A\u0015L<E\u0092x1.M";
        int n11 = "\u00edcfTC\u00c0A\u0015L<E\u0092x1.M".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3600;
        if (b[n11] == null) {
            T3.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

