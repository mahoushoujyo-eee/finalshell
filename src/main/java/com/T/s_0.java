/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.FN;
import com.t.X;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/*
 * Renamed from com.t.S
 */
class s_0
extends JComponent {
    final X i;
    private static final long[] a;
    private static final Integer[] b;

    public s_0(X x10) {
        this.i = x10;
        FN.Y(this);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setPaint(Color.GRAY);
        graphics2D.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.drawRect(1, 1, this.getWidth() - 3, this.getHeight() - 3);
        graphics2D.setPaint(X.o(this.i));
        graphics2D.fillRect(2, 2, this.getWidth() - 4, this.getHeight() - 4);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(s_0.a(30760, 6596961787425933515L), s_0.a(8497, 7651104621442666963L));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2420588774803213953L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00cfu\u00ee`\u00d9\u0001\u001eVI\u00e2\u00e5\u00beU(\u00c6\\";
        int n11 = "\u00cfu\u00ee`\u00d9\u0001\u001eVI\u00e2\u00e5\u00beU(\u00c6\\".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x30E2;
        if (b[n11] == null) {
            s_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

