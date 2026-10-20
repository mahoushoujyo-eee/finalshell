/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.gy_2;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gE
 */
public class ge_1
extends gy_2 {
    private float x = 10.0f;
    private float c = 20.0f;
    private float h = 0.0f;
    private float v = (float)Math.PI;
    private float G = 0.5f;
    private float Z = 0.5f;
    private float b;
    private float M;
    private float N;
    private float w;
    private static final String a;

    public ge_1() {
        this.Y(0);
    }

    public void K(float f10) {
        this.c = f10;
    }

    public float V() {
        return this.c;
    }

    public void R(float f10) {
        this.h = f10;
    }

    public float F() {
        return this.h;
    }

    public void D(float f10) {
        this.v = f10;
    }

    public float f() {
        return this.v;
    }

    public void l(float f10) {
        this.x = f10;
    }

    public float W() {
        return this.x;
    }

    public void L(float f10) {
        this.G = f10;
    }

    public float B() {
        return this.G;
    }

    public void V(float f10) {
        this.Z = f10;
    }

    public float h() {
        return this.Z;
    }

    public void N(Point2D point2D) {
        this.G = (float)point2D.getX();
        this.Z = (float)point2D.getY();
    }

    public Point2D b() {
        return new Point2D.Float(this.G, this.Z);
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.N = bufferedImage.getWidth();
        this.w = bufferedImage.getHeight();
        this.b = this.N * this.G;
        this.M = this.w * this.Z;
        this.N -= 1.0f;
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        float f10 = (float)n10 - this.b;
        float f11 = (float)n11 - this.M;
        float f12 = (float)Math.atan2(-f11, -f10) + this.h;
        float f13 = (float)Math.sqrt(f10 * f10 + f11 * f11);
        f12 = NM.i(f12, (float)Math.PI * 2);
        fArray[0] = this.N * f12 / (this.v + 1.0E-5f);
        fArray[1] = this.w * (1.0f - (f13 - this.x) / (this.c + 1.0E-5f));
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
                char[] cArray3 = "5N\u0003&3 ^^d\u0019 ?>O_\t^".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 127;
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
                            n17 = 14;
                            break;
                        }
                        case 1: {
                            n17 = 88;
                            break;
                        }
                        case 2: {
                            n17 = 15;
                            break;
                        }
                        case 3: {
                            n17 = 45;
                            break;
                        }
                        case 4: {
                            n17 = 35;
                            break;
                        }
                        case 5: {
                            n17 = 45;
                            break;
                        }
                        default: {
                            n17 = 85;
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

