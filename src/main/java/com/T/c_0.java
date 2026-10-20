/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.P9;
import com.t.A;
import com.t.n_0;
import com.t.q_0;
import java.awt.Color;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

/*
 * Renamed from com.t.c
 */
public class c_0
implements Paint {
    private boolean O = false;
    private ColorModel f = ColorModel.getRGBdefault();
    private int Q;
    private int D;
    private static final long[] a;
    private static final Integer[] b;

    public c_0(int n10, int n11) {
        this.Q = n10;
        this.D = n11;
    }

    @Override
    public PaintContext createContext(ColorModel colorModel, Rectangle rectangle, Rectangle2D rectangle2D, AffineTransform affineTransform, RenderingHints renderingHints) {
        return new q_0(this, affineTransform);
    }

    public Color T(int n10) {
        return new A(1.0f - Math.max(0.0f, Math.min((float)(n10 - this.Q) / (float)this.D, 1.0f)), 1.0f, 1.0f).E();
    }

    private int v(int n10) {
        int n11;
        block9: {
            block8: {
                int n12;
                block6: {
                    block7: {
                        n12 = n_0.W();
                        n11 = this.O;
                        if (n12 != 0) {
                            if (n11 != 0) {
                                n10 = P9.d(n10);
                            }
                            n11 = n10;
                        }
                        if (n12 == 0) break block6;
                        if (n11 >= 0) break block7;
                        n10 = 0;
                        if (n12 != 0) break block8;
                    }
                    n11 = n10;
                }
                if (n12 == 0) break block9;
                if (n11 > c_0.a(5840, 7828266098155595869L)) {
                    n10 = c_0.a(15824, 547945893086495580L);
                }
            }
            n11 = n10;
        }
        return n11;
    }

    @Override
    public int getTransparency() {
        return 1;
    }

    public boolean i() {
        return this.O;
    }

    public void D(boolean bl) {
        this.O = bl;
    }

    static ColorModel t(c_0 c_02) {
        return c_02.f;
    }

    static int O(c_0 c_02) {
        return c_02.Q;
    }

    static int L(c_0 c_02) {
        return c_02.D;
    }

    static int l(c_0 c_02, int n10) {
        return c_02.v(n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8227343561617086384L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d1\u0091\u00c7\u00c0P\u0084\u00bf\u0012#\u0004R\u00fe\u00fa\u00c6\u0094\u0013";
        int n11 = "\u00d1\u0091\u00c7\u00c0P\u0084\u00bf\u0012#\u0004R\u00fe\u00fa\u00c6\u0094\u0013".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3E8D;
        if (b[n11] == null) {
            c_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

