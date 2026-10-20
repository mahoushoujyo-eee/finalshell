/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.ge
 */
public class ge_2
extends W5 {
    private String t;
    private Font L;
    private Paint o;
    private Composite E;
    private AffineTransform a;
    private static final long[] b;
    private static final Integer[] c;

    public ge_2() {
    }

    public ge_2(String string, Font font, Paint paint, Composite composite, AffineTransform affineTransform) {
        this.t = string;
        this.L = font;
        this.E = composite;
        this.o = paint;
        this.a = affineTransform;
    }

    public void l(String string) {
        this.t = string;
    }

    public String f() {
        return this.t;
    }

    public void p(Composite composite) {
        this.E = composite;
    }

    public Composite A() {
        return this.E;
    }

    public void k(Paint paint) {
        this.o = paint;
    }

    public Paint a() {
        return this.o;
    }

    public void n(Font font) {
        this.L = font;
    }

    public Font y() {
        return this.L;
    }

    public void R(AffineTransform affineTransform) {
        this.a = affineTransform;
    }

    public AffineTransform H() {
        return this.a;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = bufferedImage2;
        }
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        ge_2 ge_22 = this;
        if (stringArray != null) {
            if (ge_22.L != null) {
                graphics2D.setFont(this.L);
            }
            ge_22 = this;
        }
        if (stringArray != null) {
            if (ge_22.a != null) {
                graphics2D.setTransform(this.a);
            }
            ge_22 = this;
        }
        if (stringArray != null) {
            if (ge_22.E != null) {
                graphics2D.setComposite(this.E);
            }
            ge_22 = this;
        }
        if (stringArray != null) {
            if (ge_22.o != null) {
                graphics2D.setPaint(this.o);
            }
            ge_22 = this;
        }
        if (ge_22.t != null) {
            graphics2D.drawString(this.t, ge_2.a(31563, 2506015766379174632L), ge_2.a(19781, 8376972399143890151L));
        }
        graphics2D.dispose();
        return bufferedImage2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8354668623742330589L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "T\u0003_\u0089\u00ca\u00cc|?@\u00b0\u0083Z\u00bezJ^";
        int n11 = "T\u0003_\u0089\u00ca\u00cc|?@\u00b0\u0083Z\u00bezJ^".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x61A3;
        if (c[n11] == null) {
            ge_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

