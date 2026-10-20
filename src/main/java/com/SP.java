/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.JPanel;

public class SP
extends JPanel {
    protected Dimension K = new Dimension(SP.a(22388, 1388335077066673046L), SP.a(12892, 5118450692145278652L));
    private static final long[] a;
    private static final Integer[] b;

    public SP() {
        this.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Insets insets = this.getBorder().getBorderInsets(this);
        int n10 = insets.left;
        int n11 = this.getBorder().getBorderInsets((Component)this).top;
        int n12 = this.getWidth();
        int n13 = this.getHeight();
        Graphics2D graphics2D = (Graphics2D)graphics;
        int n14 = 0;
        graphics2D.setColor(new Color(n14, n14, n14, SP.a(21641, 3944900261045733482L)));
        graphics2D.fillRoundRect(n10, n11, n12 - insets.left - insets.right, n13 - insets.top - insets.bottom, this.K.width, this.K.height);
    }

    public Dimension z() {
        return this.K;
    }

    public void x(Dimension dimension) {
        this.K = dimension;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5641139834241331243L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00d5\u00b4\u008d\u00b6\u0015\u0084\u00bb\u00a9\u00ac\u00f1\u0015\u00e7a\u00b8\u00b8\u0011g\u00ef\u00b4`\u00a5\u00e9^\u0083";
        int n11 = "\u00d5\u00b4\u008d\u00b6\u0015\u0084\u00bb\u00a9\u00ac\u00f1\u0015\u00e7a\u00b8\u00b8\u0011g\u00ef\u00b4`\u00a5\u00e9^\u0083".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5CE2;
        if (b[n11] == null) {
            SP.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

