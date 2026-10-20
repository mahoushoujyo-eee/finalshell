/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.c.d_0;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

/*
 * Renamed from com.c.M
 */
class m_1
implements Icon {
    final d_0 x;
    private static final long[] a;
    private static final Integer[] b;

    m_1(d_0 d_02) {
        this.x = d_02;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n10, int n11) {
        block3: {
            Icon icon;
            block2: {
                int[] nArray = d_0.W();
                icon = d_0.X(this.x).getFrameIcon();
                if (nArray != null) break block2;
                if (icon == null) break block3;
                icon = d_0.g(this.x).getFrameIcon();
            }
            icon.paintIcon(component, graphics, n10, n11);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int getIconWidth() {
        int n10;
        int[] nArray = d_0.W();
        Icon icon = d_0.D(this.x).getFrameIcon();
        if (nArray == null) {
            if (icon == null) {
                n10 = m_1.a(23165, 6140383083694913544L);
                return n10;
            }
            icon = d_0.o(this.x).getFrameIcon();
        }
        n10 = icon.getIconWidth();
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int getIconHeight() {
        int n10;
        int[] nArray = d_0.W();
        Icon icon = d_0.G(this.x).getFrameIcon();
        if (nArray == null) {
            if (icon == null) {
                n10 = m_1.a(2280, 8839665802153699996L);
                return n10;
            }
            icon = d_0.J(this.x).getFrameIcon();
        }
        n10 = icon.getIconHeight();
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7258878483675810214L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "(\u00b9S\u00af\u00e9\u00b3#*:h=\u009a'J\u00f1\u00be";
        int n11 = "(\u00b9S\u00af\u00e9\u00b3#*:h=\u009a'J\u00f1\u00be".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2274;
        if (b[n11] == null) {
            m_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

