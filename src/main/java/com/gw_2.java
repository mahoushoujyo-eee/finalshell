/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gw
 */
public class gw_2
extends gy_2 {
    private float j = 16.0f;
    private float l = 10.0f;
    private float R = 0.0f;
    private float w = 0.5f;
    private float N = 0.5f;
    private float T = 50.0f;
    private float B = 0.0f;
    private float s;
    private float I;
    private static final String a;

    public gw_2() {
        this.Y(1);
    }

    public void f(float f10) {
        this.j = f10;
    }

    public float k() {
        return this.j;
    }

    public void D(float f10) {
        this.l = f10;
    }

    public float q() {
        return this.l;
    }

    public void x(float f10) {
        this.R = f10;
    }

    public float u() {
        return this.R;
    }

    public void K(float f10) {
        this.w = f10;
    }

    public float G() {
        return this.w;
    }

    public void F(float f10) {
        this.N = f10;
    }

    public float m() {
        return this.N;
    }

    public void B(Point2D point2D) {
        this.w = (float)point2D.getX();
        this.N = (float)point2D.getY();
    }

    public Point2D b() {
        return new Point2D.Float(this.w, this.N);
    }

    public void V(float f10) {
        this.T = f10;
    }

    public float g() {
        return this.T;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean M(int n10, int n11, int n12) {
        String[] stringArray = W5.q();
        boolean bl = n11;
        int n13 = n10;
        if (stringArray != null) {
            if (bl > n13) return false;
            bl = n10;
            if (stringArray == null) return bl;
            n13 = n12;
        }
        if (bl > n13) return false;
        return true;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.s = (float)bufferedImage.getWidth() * this.w;
        String[] stringArray = W5.q();
        this.I = (float)bufferedImage.getHeight() * this.N;
        gw_2 gw_22 = this;
        if (stringArray != null) {
            if (gw_22.T == 0.0f) {
                this.T = Math.min(this.s, this.I);
            }
            this.B = this.T * this.T;
            gw_22 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        block7: {
            float f10;
            String[] stringArray;
            float f11;
            float f12;
            block5: {
                float f13;
                block6: {
                    f12 = (float)n10 - this.s;
                    f11 = (float)n11 - this.I;
                    stringArray = W5.q();
                    f10 = f13 = f12 * f12 + f11 * f11;
                    if (stringArray == null) break block5;
                    if (!(f10 > this.B)) break block6;
                    fArray[0] = n10;
                    fArray[1] = n11;
                    if (stringArray != null) break block7;
                }
                f10 = (float)Math.sqrt(f13);
            }
            float f14 = f10;
            float f15 = this.l * (float)Math.sin(f14 / this.j * ((float)Math.PI * 2) - this.R);
            f15 *= (this.T - f14) / this.T;
            if (stringArray != null) {
                if (f14 != 0.0f) {
                    f15 *= this.j / f14;
                }
                fArray[0] = (float)n10 + f12 * f15;
            }
            fArray[1] = (float)n11 + f11 * f15;
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
                char[] cArray3 = "g5H<t\u0004^\f\u000bZ<~\u0004\nq5K8w\u0013Y\rr\u0015".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 120;
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
                            n17 = 91;
                            break;
                        }
                        case 1: {
                            n17 = 36;
                            break;
                        }
                        case 2: {
                            n17 = 67;
                            break;
                        }
                        case 3: {
                            n17 = 48;
                            break;
                        }
                        case 4: {
                            n17 = 99;
                            break;
                        }
                        case 5: {
                            n17 = 14;
                            break;
                        }
                        default: {
                            n17 = 82;
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

