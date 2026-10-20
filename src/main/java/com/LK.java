/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.lz_0;
import com.pe_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LK
extends lz_0 {
    protected int z = pe_0.q;
    protected Color l = pe_0.B;
    protected Color C = pe_0.S;
    private static final long[] a;
    private static final Integer[] b;

    public LK() {
    }

    public LK(int n10) {
        this.z = n10;
    }

    public LK(Color color, Color color2) {
        this.l = color;
        this.C = color2;
    }

    public LK(int n10, Color color, Color color2) {
        this.z = n10;
        this.l = color;
        this.C = color2;
    }

    public int F() {
        return this.z;
    }

    public void a(int n10) {
        this.z = n10;
        this.l();
    }

    public Color w() {
        return this.l;
    }

    public void W(Color color) {
        this.l = color;
        this.l();
    }

    public Color U() {
        return this.C;
    }

    public void p(Color color) {
        this.C = color;
        this.l();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean d(JComponent jComponent) {
        int n10;
        block5: {
            int n11;
            block4: {
                int[] nArray = lz_0.M();
                n10 = this.l.getAlpha();
                n11 = LK.a(1551, 3862150394586548285L);
                if (nArray != null) break block4;
                if (n10 != n11) break block5;
                n10 = this.C.getAlpha();
                if (nArray != null) return n10 != 0;
                n11 = LK.a(24958, 7667382412824850253L);
            }
            if (n10 == n11) {
                n10 = 1;
                return n10 != 0;
            }
        }
        n10 = 0;
        return n10 != 0;
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        GA.h(graphics2D, rectangle.x, rectangle.y, rectangle.width, rectangle.height, this.z, this.l, this.C);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7688990457244589854L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0085ms\u0003w\u0019\u00d7\u00dcM\u00dbs\u0090d\u00ee0\u00ac";
        int n11 = "\u0085ms\u0003w\u0019\u00d7\u00dcM\u00dbs\u0090d\u00ee0\u00ac".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4E32;
        if (b[n11] == null) {
            LK.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

