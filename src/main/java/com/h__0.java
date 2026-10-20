/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.h_
 */
public class h__0
extends W5 {
    private int U;
    private int l;
    private int S;
    private int e;
    private Paint m;
    private static final String a;

    public h__0() {
    }

    public h__0(int n10, int n11, int n12, int n13, Paint paint) {
        this.U = n10;
        this.S = n11;
        this.l = n12;
        this.e = n13;
        this.m = paint;
    }

    public void r(int n10) {
        this.U = n10;
    }

    public int O() {
        return this.U;
    }

    public void I(int n10) {
        this.l = n10;
    }

    public int x() {
        return this.l;
    }

    public void V(int n10) {
        this.S = n10;
    }

    public int L() {
        return this.S;
    }

    public void u(int n10) {
        this.e = n10;
    }

    public int i() {
        return this.e;
    }

    public void M(Paint paint) {
        this.m = paint;
    }

    public Paint T() {
        return this.m;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = new BufferedImage(n10 + this.U + this.l, n11 + this.S + this.e, bufferedImage.getType());
            }
            bufferedImage3 = bufferedImage2;
        }
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        if (stringArray != null) {
            if (this.m != null) {
                graphics2D.setPaint(this.m);
                int n12 = this.U;
                if (stringArray != null) {
                    if (n12 > 0) {
                        graphics2D.fillRect(0, 0, this.U, n11);
                    }
                    n12 = this.l;
                }
                if (stringArray != null) {
                    if (n12 > 0) {
                        graphics2D.fillRect(n10 - this.l, 0, this.l, n11);
                    }
                    n12 = this.S;
                }
                if (stringArray != null) {
                    if (n12 > 0) {
                        graphics2D.fillRect(this.U, 0, n10 - this.U - this.l, this.S);
                    }
                    n12 = this.e;
                }
                if (n12 > 0) {
                    graphics2D.fillRect(this.U, n11 - this.e, n10 - this.U - this.l, this.e);
                }
            }
            graphics2D.drawRenderedImage(bufferedImage, AffineTransform.getTranslateInstance(this.U, this.l));
            graphics2D.dispose();
        }
        return bufferedImage2;
    }

    public String toString() {
        return a;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "y\u000bpMjhW\u0012 lKa\u007fQ\u0013L-".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 84;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 105;
                            break;
                        }
                        case 1: {
                            n17 = 54;
                            break;
                        }
                        case 2: {
                            n17 = 87;
                            break;
                        }
                        case 3: {
                            n17 = 109;
                            break;
                        }
                        case 4: {
                            n17 = 81;
                            break;
                        }
                        case 5: {
                            n17 = 78;
                            break;
                        }
                        default: {
                            n17 = 119;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

