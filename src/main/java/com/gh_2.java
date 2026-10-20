/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.gy_2;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gh
 */
public class gh_2
extends gy_2 {
    private float b = 0.0f;
    private float i = 0.0f;
    private float H = 0.5f;
    private float p = 0.5f;
    private int V = (int)c;
    private float B = 0.0f;
    private float T;
    private float u;
    private static final String a;
    private static final long c;

    public gh_2() {
        this.Y(1);
    }

    public void y(int n10) {
        this.V = n10;
    }

    public int W() {
        return this.V;
    }

    public void e(float f10) {
        this.b = f10;
    }

    public float l() {
        return this.b;
    }

    public void H(float f10) {
        this.i = f10;
    }

    public float j() {
        return this.i;
    }

    public void l(float f10) {
        this.H = f10;
    }

    public float L() {
        return this.H;
    }

    public void U(float f10) {
        this.p = f10;
    }

    public float t() {
        return this.p;
    }

    public void s(Point2D point2D) {
        this.H = (float)point2D.getX();
        this.p = (float)point2D.getY();
    }

    public Point2D O() {
        return new Point2D.Float(this.H, this.p);
    }

    public void m(float f10) {
        this.B = f10;
    }

    public float M() {
        return this.B;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.T = (float)bufferedImage.getWidth() * this.H;
        this.u = (float)bufferedImage.getHeight() * this.p;
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        double d2 = (float)n10 - this.T;
        double d3 = (float)n11 - this.u;
        double d4 = Math.sqrt(d2 * d2 + d3 * d3);
        String[] stringArray = W5.q();
        double d5 = Math.atan2(d3, d2) - (double)this.b - (double)this.i;
        d5 = NM.l((float)(d5 / Math.PI * (double)this.V * 0.5));
        if (stringArray != null) {
            if (this.B != 0.0f) {
                double d6 = Math.cos(d5);
                double d7 = (double)this.B / d6;
                d4 = d7 * (double)NM.l((float)(d4 / d7));
            }
            fArray[0] = (float)((double)this.T + d4 * Math.cos(d5 += (double)this.b));
            fArray[1] = (float)((double)this.u + d4 * Math.sin(d5));
        }
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
                char[] cArray3 = "N_\u000f\u001e\f4e%}\u001d\u0006\u0006/ueE\u001f\u0005\u0013#?$\u0018".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 40;
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
                            n17 = 34;
                            break;
                        }
                        case 1: {
                            n17 = 30;
                            break;
                        }
                        case 2: {
                            n17 = 84;
                            break;
                        }
                        case 3: {
                            n17 = 66;
                            break;
                        }
                        case 4: {
                            n17 = 75;
                            break;
                        }
                        case 5: {
                            n17 = 110;
                            break;
                        }
                        default: {
                            n17 = 57;
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
        long l2 = 6287151486166661281L;
        c = 0x5C5E5CF9460878A2L ^ l2;
    }
}

