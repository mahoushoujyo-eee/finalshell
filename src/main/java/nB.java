/*
 * Decompiled with CFR 0.152.
 */
import com.T4;
import com.c;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;

public class nB
extends T4 {
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return new Dimension(nB.b(28963, 6711902340995496985L), nB.b(667, 2600422355702370208L));
    }

    @Override
    public void layoutContainer(Container container) {
        Component[] componentArray = container.getComponents();
        String[] stringArray = F_.F();
        int n10 = componentArray.length;
        int n11 = 0;
        while (n11 < n10) {
            block8: {
                block9: {
                    Rectangle rectangle;
                    Component component = componentArray[n11];
                    if (stringArray == null) break block8;
                    if (!component.getClass().equals(Y3.class)) break block9;
                    Y3 y3 = (Y3)component;
                    if (stringArray == null) break block8;
                    try {
                        rectangle = (Rectangle)y3.Q();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (rectangle != null) {
                        Rectangle rectangle2;
                        try {
                            rectangle2 = (Rectangle)y3.Q();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        y3.setBounds(rectangle2);
                    }
                }
                ++n11;
            }
            if (stringArray != null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3899595100330472455L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00c3Ch\u0001\u00ea\u0092\u00fb\u00c3\u00d9yg\u009c\u0001+\bz";
        int n11 = "\u00c3Ch\u0001\u00ea\u0092\u00fb\u00c3\u00d9yg\u009c\u0001+\bz".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4D3B;
        if (b[n11] == null) {
            nB.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

