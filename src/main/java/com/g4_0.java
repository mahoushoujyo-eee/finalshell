/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.g4
 */
public class g4_0
extends gy_2 {
    private float h = 0.0f;
    private float l = 0.5f;
    private float p = 0.5f;
    private float o = 100.0f;
    private float m = 0.5f;
    private float v = 0.0f;
    private float a;
    private float J;
    private float E;
    private float y;
    private static final String b;

    public void G(float f10) {
        this.h = f10;
    }

    public float p() {
        return this.h;
    }

    public void w(float f10) {
        this.l = f10;
    }

    public float K() {
        return this.l;
    }

    public void s(float f10) {
        this.p = f10;
    }

    public float s() {
        return this.p;
    }

    public void o(Point2D point2D) {
        this.l = (float)point2D.getX();
        this.p = (float)point2D.getY();
    }

    public Point2D E() {
        return new Point2D.Float(this.l, this.p);
    }

    public void n(float f10) {
        this.o = f10;
    }

    public float d() {
        return this.o;
    }

    public void T(float f10) {
        this.m = f10;
    }

    public float z() {
        return this.m;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.E = bufferedImage.getWidth();
        String[] stringArray = W5.q();
        this.y = bufferedImage.getHeight();
        this.a = this.E * this.l;
        this.J = this.y * this.p;
        g4_0 g4_02 = this;
        if (stringArray != null) {
            if (g4_02.o == 0.0f) {
                this.o = Math.min(this.a, this.J);
            }
            this.v = this.o * this.o;
            g4_02 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        block6: {
            float f10;
            float f11;
            float f12;
            float f13;
            block4: {
                float f14;
                block5: {
                    String[] stringArray;
                    block2: {
                        block3: {
                            f13 = (float)n10 - this.a;
                            f12 = (float)n11 - this.J;
                            f14 = f13 * f13 + f12 * f12;
                            stringArray = W5.q();
                            if (stringArray == null) break block2;
                            if (f14 > this.v) break block3;
                            f11 = f14;
                            f10 = 0.0f;
                            if (stringArray == null) break block4;
                            if (f11 != f10) break block5;
                        }
                        fArray[0] = n10;
                        fArray[1] = n11;
                    }
                    if (stringArray != null) break block6;
                }
                f11 = f14;
                f10 = this.v;
            }
            float f15 = (float)Math.sqrt(f11 / f10);
            float f16 = (float)Math.pow(Math.sin(1.5707963267948966 * (double)f15), -this.m);
            float f17 = 1.0f - f15;
            float f18 = this.h * f17 * f17;
            float f19 = (float)Math.sin(f18);
            float f20 = (float)Math.cos(f18);
            fArray[0] = this.a + f20 * (f13 *= f16) - f19 * (f12 *= f16);
            fArray[1] = this.J + f19 * f13 + f20 * f12;
        }
    }

    public String toString() {
        return b;
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
                char[] cArray3 = "oQ$\u0017w\u0002*\u0004h>\r{\u0018p\u0005\u0016".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 71;
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
                            n17 = 108;
                            break;
                        }
                        case 1: {
                            n17 = 127;
                            break;
                        }
                        case 2: {
                            n17 = 16;
                            break;
                        }
                        case 3: {
                            n17 = 36;
                            break;
                        }
                        case 4: {
                            n17 = 95;
                            break;
                        }
                        case 5: {
                            n17 = 55;
                            break;
                        }
                        default: {
                            n17 = 25;
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
        b = new String(cArray).intern();
    }
}

