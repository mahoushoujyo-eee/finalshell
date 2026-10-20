/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gD
 */
public class gd_1
extends gy_2 {
    private float O = 0.0f;
    private float f = 0.0f;
    private float S = 0.0f;
    private float y = 0.0f;
    private float V = 0.5f;
    private float N = 0.5f;
    private float c = 1.5f;
    private float Z;
    private float I;
    private static final String a;

    public gd_1() {
        this.Y(1);
        this.V(100.0f);
    }

    public void r(float f10) {
        this.c = f10;
    }

    public float E() {
        return this.c;
    }

    public void V(float f10) {
        this.O = f10;
        this.f = f10;
    }

    public float O() {
        return this.O;
    }

    public void c(float f10) {
        this.V = f10;
    }

    public float l() {
        return this.V;
    }

    public void t(float f10) {
        this.N = f10;
    }

    public float s() {
        return this.N;
    }

    public void W(Point2D point2D) {
        this.V = (float)point2D.getX();
        this.N = (float)point2D.getY();
    }

    public Point2D i() {
        return new Point2D.Float(this.V, this.N);
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        gd_1 gd_12;
        block6: {
            float f10;
            int n10;
            block5: {
                int n11 = bufferedImage.getWidth();
                String[] stringArray = W5.q();
                n10 = bufferedImage.getHeight();
                this.Z = (float)n11 * this.V;
                this.I = (float)n10 * this.N;
                float f11 = this.O - 0.0f;
                f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (stringArray == null) break block5;
                if (f10 == false) {
                    this.O = n11 / 2;
                }
                gd_12 = this;
                if (stringArray == null) break block6;
                float f12 = gd_12.f - 0.0f;
                f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            }
            if (f10 == false) {
                this.f = n10 / 2;
            }
            this.S = this.O * this.O;
            this.y = this.f * this.f;
            gd_12 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        block4: {
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            block2: {
                block3: {
                    f15 = (float)n10 - this.Z;
                    f14 = (float)n11 - this.I;
                    f13 = f15 * f15;
                    f12 = f14 * f14;
                    String[] stringArray = W5.q();
                    f11 = f12;
                    f10 = this.y - this.y * f13 / this.S;
                    if (stringArray == null) break block2;
                    if (!(f11 >= f10)) break block3;
                    fArray[0] = n10;
                    fArray[1] = n11;
                    if (stringArray != null) break block4;
                }
                f11 = 1.0f;
                f10 = this.c;
            }
            float f16 = f11 / f10;
            float f17 = (float)Math.sqrt((1.0f - f13 / this.S - f12 / this.y) * (this.O * this.f));
            float f18 = f17 * f17;
            float f19 = (float)Math.acos((double)f15 / Math.sqrt(f13 + f18));
            float f20 = 1.5707964f - f19;
            float f21 = (float)Math.asin(Math.sin(f20) * (double)f16);
            f21 = 1.5707964f - f19 - f21;
            fArray[0] = (float)n10 - (float)Math.tan(f21) * f17;
            float f22 = (float)Math.acos((double)f14 / Math.sqrt(f12 + f18));
            f20 = 1.5707964f - f22;
            f21 = (float)Math.asin(Math.sin(f20) * (double)f16);
            f21 = 1.5707964f - f22 - f21;
            fArray[1] = (float)n11 - (float)Math.tan(f21) * f17;
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
                char[] cArray3 = "[}\t!F~\n0G\n=L~\u001b1:T".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 37;
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
                            n17 = 58;
                            break;
                        }
                        case 1: {
                            n17 = 49;
                            break;
                        }
                        case 2: {
                            n17 = 95;
                            break;
                        }
                        case 3: {
                            n17 = 112;
                            break;
                        }
                        case 4: {
                            n17 = 12;
                            break;
                        }
                        case 5: {
                            n17 = 41;
                            break;
                        }
                        default: {
                            n17 = 91;
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

