/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.w1_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.gH
 */
public class gh_1
extends W5 {
    private float b = 0.5f;
    private float B = 0.5f;
    private float P;
    private float V;
    private float u;
    private float T;
    private float i = 1.0f;
    private float W = 1.0f;
    private int e = (int)c;
    private int z;
    private static final String a;
    private static final long c;

    public void P(float f10) {
        this.V = f10;
    }

    public float Y() {
        return this.V;
    }

    public void N(float f10) {
        this.P = f10;
    }

    public float V() {
        return this.P;
    }

    public void i(float f10) {
        this.u = f10;
    }

    public float p() {
        return this.u;
    }

    public void M(float f10) {
        this.T = f10;
    }

    public float c() {
        return this.T;
    }

    public void R(float f10) {
        this.i = f10;
    }

    public float D() {
        return this.i;
    }

    public void F(float f10) {
        this.W = f10;
    }

    public float C() {
        return this.W;
    }

    public void z(float f10) {
        this.b = f10;
    }

    public float A() {
        return this.b;
    }

    public void f(float f10) {
        this.B = f10;
    }

    public float B() {
        return this.B;
    }

    public void Y(Point2D point2D) {
        this.b = (float)point2D.getX();
        this.B = (float)point2D.getY();
    }

    public Point2D n() {
        return new Point2D.Float(this.b, this.B);
    }

    public void Y(int n10) {
        this.e = n10;
    }

    public int A() {
        return this.e;
    }

    public void G(int n10) {
        this.z = n10;
    }

    public int n() {
        return this.z;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block9: {
            Rectangle rectangle;
            int n10;
            Graphics2D graphics2D;
            float[] fArray;
            w1_0[] w1_0Array;
            int n11;
            float f10;
            float f11;
            String[] stringArray;
            block7: {
                int n12;
                stringArray = W5.q();
                BufferedImage bufferedImage3 = bufferedImage2;
                if (stringArray != null) {
                    if (bufferedImage3 == null) {
                        bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                    }
                    bufferedImage3 = bufferedImage;
                }
                f11 = bufferedImage3.getWidth();
                f10 = bufferedImage.getHeight();
                float f12 = (float)bufferedImage.getWidth() * this.b;
                float f13 = (float)bufferedImage.getHeight() * this.B;
                float f14 = (float)Math.sqrt(f12 * f12 + f13 * f13);
                n11 = this.e * this.e;
                w1_0Array = new w1_0[n11];
                float[] fArray2 = new float[n11];
                float[] fArray3 = new float[n11];
                fArray = new float[n11];
                graphics2D = bufferedImage2.createGraphics();
                Random random = new Random(0L);
                float f15 = 0.0f;
                float f16 = 0.0f;
                n10 = 0;
                while (n10 < this.e) {
                    block8: {
                        int n13 = (int)f10 * n10 / this.e;
                        int n14 = (int)f10 * (n10 + 1) / this.e;
                        n12 = 0;
                        if (stringArray == null) break block7;
                        for (int i2 = v7822903; i2 < this.e; ++i2) {
                            int n15 = n10 * this.e + i2;
                            int n16 = (int)f11 * i2 / this.e;
                            int n17 = (int)f11 * (i2 + 1) / this.e;
                            fArray2[n15] = (float)this.z * random.nextFloat();
                            fArray3[n15] = (float)this.z * random.nextFloat();
                            fArray2[n15] = 0.0f;
                            fArray3[n15] = 0.0f;
                            fArray[n15] = (float)this.z * (2.0f * random.nextFloat() - 1.0f);
                            rectangle = new Rectangle(n16, n13, n17 - n16, n14 - n13);
                            w1_0Array[n15] = new w1_0();
                            w1_0Array[n15].e = rectangle;
                            w1_0Array[n15].i = (float)(n16 + n17) * 0.5f;
                            w1_0Array[n15].H = (float)(n13 + n14) * 0.5f;
                            w1_0Array[n15].p = f11 - (f12 - (float)i2);
                            w1_0Array[n15].I = f10 - (f13 - (float)n10);
                            w1_0Array[n15].u = n17 - n16;
                            w1_0Array[n15].Q = n14 - n13;
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                            }
                            break block8;
                        }
                        ++n10;
                    }
                    if (stringArray != null) continue;
                }
                n12 = n10 = 0;
            }
            while (n10 < n11) {
                float f17 = (float)n10 / (float)n11;
                double d2 = (double)(f17 * 2.0f) * Math.PI;
                float f18 = this.V * f11 * (float)Math.cos(d2);
                float f19 = this.V * f10 * (float)Math.sin(d2);
                w1_0 w1_02 = w1_0Array[n10];
                rectangle = w1_02.e.getBounds();
                AffineTransform affineTransform = graphics2D.getTransform();
                f18 = w1_02.i + this.V * w1_02.p;
                f19 = w1_02.H + this.V * w1_02.I;
                graphics2D.translate(f18, f19);
                graphics2D.rotate(this.V * fArray[n10]);
                graphics2D.setColor(Color.getHSBColor(f17, 1.0f, 1.0f));
                Shape shape = graphics2D.getClip();
                graphics2D.clip(w1_02.e);
                graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
                graphics2D.setClip(shape);
                graphics2D.setTransform(affineTransform);
                ++n10;
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block9;
            }
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
                char[] cArray3 = "dq9D#!{Yl6\u0005\u0003 nDw=X~f!".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 21;
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
                            n17 = 37;
                            break;
                        }
                        case 1: {
                            n17 = 22;
                            break;
                        }
                        case 2: {
                            n17 = 77;
                            break;
                        }
                        case 3: {
                            n17 = 63;
                            break;
                        }
                        case 4: {
                            n17 = 69;
                            break;
                        }
                        case 5: {
                            n17 = 93;
                            break;
                        }
                        default: {
                            n17 = 26;
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
        long l2 = 8260201356131734083L;
        c = 0x6D1DA1BF756E9246L ^ l2;
    }
}

