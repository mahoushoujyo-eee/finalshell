/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Dimension;
import javax.swing.JPanel;

public class BS
extends JPanel {
    Y3 m;
    private static final long[] a;
    private static final Integer[] b;

    public BS(Y3 y3) {
        nB nB2 = new nB();
        this.setLayout(nB2);
        this.m = y3;
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(BS.a(29379, 8305696419938623317L), BS.a(13510, 5822189323777546577L)));
        this.add(y3);
    }

    public Y3 N() {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 393518101829894274L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "N\u00a4\u00fa\u0086\u0082\u00ed\u001e\u00fb\f\u00fd?\u00efJ\u0094\u00d8\u00ff";
        int n11 = "N\u00a4\u00fa\u0086\u0082\u00ed\u001e\u00fb\f\u00fd?\u00efJ\u0094\u00d8\u00ff".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2D96;
        if (b[n11] == null) {
            BS.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

