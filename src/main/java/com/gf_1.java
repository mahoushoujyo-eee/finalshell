/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gF
 */
public class gf_1
extends gy_2 {
    private float R;
    private float G;
    private float c;
    private float Z;
    private float a;
    private float A;
    private float l;
    private float g;
    private float p;
    private float I;
    private float o;
    private float C;
    private float h;
    private float K;
    private float O;
    private float x;
    private float Q;
    private float E;
    private float V;
    private float k;
    private float Y;
    private float T;
    private float b;
    private float M;
    private float w;
    private float H;
    private float i;
    private float W;
    private float u;
    private float e;
    private float B;
    private float m;
    private boolean J;
    private boolean D = false;
    private static final String d;

    public gf_1() {
        this(0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
    }

    public gf_1(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.A(f10, f11, f12, f13, f14, f15, f16, f17);
    }

    public void Q(boolean bl) {
        this.D = bl;
    }

    public boolean x() {
        return this.D;
    }

    public void J(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.A(f10, f11, f12, f13, f14, f15, f16, f17);
        this.J = true;
    }

    public void A(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        block4: {
            block2: {
                gf_1 gf_12;
                block3: {
                    this.R = f10;
                    this.G = f11;
                    this.c = f12;
                    this.Z = f13;
                    this.a = f14;
                    this.A = f15;
                    this.l = f16;
                    this.g = f17;
                    this.p = f12 - f14;
                    this.I = f13 - f15;
                    String[] stringArray = W5.q();
                    this.o = f16 - f14;
                    this.C = f17 - f15;
                    this.h = f10 - f12 + f14 - f16;
                    this.K = f11 - f13 + f15 - f17;
                    gf_12 = this;
                    if (stringArray == null) break block2;
                    if (gf_12.h != 0.0f) break block3;
                    gf_12 = this;
                    if (stringArray == null) break block2;
                    if (gf_12.K != 0.0f) break block3;
                    this.M = f12 - f10;
                    this.i = f14 - f12;
                    this.e = f10;
                    this.w = f13 - f11;
                    this.W = f15 - f13;
                    this.B = f11;
                    this.u = 0.0f;
                    this.H = 0.0f;
                    if (stringArray != null) break block4;
                }
                this.H = (this.h * this.C - this.o * this.K) / (this.p * this.C - this.I * this.o);
                this.u = (this.p * this.K - this.I * this.h) / (this.p * this.C - this.I * this.o);
                this.M = f12 - f10 + this.H * f12;
                this.i = f16 - f10 + this.u * f16;
                this.e = f10;
                this.w = f13 - f11 + this.H * f13;
                this.W = f17 - f11 + this.u * f17;
                gf_12 = this;
            }
            gf_12.B = f11;
        }
        this.m = 1.0f;
        this.J = false;
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.A(f10, f11, f12, f13, f14, f15, f16, f17);
        float f18 = this.W * this.m - this.B * this.u;
        float f19 = this.B * this.H - this.w * this.m;
        float f20 = this.w * this.u - this.W * this.H;
        float f21 = this.e * this.u - this.i * this.m;
        float f22 = this.M * this.m - this.e * this.H;
        float f23 = this.i * this.H - this.M * this.u;
        float f24 = this.i * this.B - this.e * this.W;
        float f25 = this.e * this.w - this.M * this.B;
        float f26 = this.M * this.W - this.i * this.w;
        float f27 = 1.0f / f26;
        this.M = f18 * f27;
        this.i = f21 * f27;
        this.e = f24 * f27;
        this.w = f19 * f27;
        this.W = f22 * f27;
        this.B = f25 * f27;
        this.H = f20 * f27;
        this.u = f23 * f27;
        this.m = 1.0f;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.O = this.W * this.m - this.B * this.u;
        this.x = this.e * this.u - this.i * this.m;
        this.Q = this.i * this.B - this.e * this.W;
        this.E = this.B * this.H - this.w * this.m;
        this.V = this.M * this.m - this.e * this.H;
        this.k = this.e * this.w - this.M * this.B;
        this.Y = this.w * this.u - this.W * this.H;
        this.T = this.i * this.H - this.M * this.u;
        this.b = this.M * this.W - this.i * this.w;
        String[] stringArray = W5.q();
        gf_1 gf_12 = this;
        if (stringArray != null) {
            if (!gf_12.J) {
                int n10 = bufferedImage.getWidth();
                int n11 = bufferedImage.getHeight();
                float f10 = 1.0f / (float)n10;
                float f11 = 1.0f / (float)n11;
                this.O *= f10;
                this.E *= f10;
                this.Y *= f10;
                this.x *= f11;
                this.V *= f11;
                this.T *= f11;
            }
            gf_12 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    protected void T(Rectangle rectangle) {
        String[] stringArray = W5.q();
        boolean bl = this.J;
        if (stringArray != null) {
            if (bl) {
                rectangle.x = (int)Math.min(Math.min(this.R, this.c), Math.min(this.a, this.l));
                rectangle.y = (int)Math.min(Math.min(this.G, this.Z), Math.min(this.A, this.g));
                rectangle.width = (int)Math.max(Math.max(this.R, this.c), Math.max(this.a, this.l)) - rectangle.x;
                rectangle.height = (int)Math.max(Math.max(this.G, this.Z), Math.max(this.A, this.g)) - rectangle.y;
                return;
            }
            bl = this.D;
        }
        if (!bl) {
            float f10 = (float)rectangle.getWidth();
            float f11 = (float)rectangle.getHeight();
            Rectangle rectangle2 = new Rectangle();
            rectangle2.add(this.getPoint2D(new Point2D.Float(0.0f, 0.0f), null));
            rectangle2.add(this.getPoint2D(new Point2D.Float(f10, 0.0f), null));
            rectangle2.add(this.getPoint2D(new Point2D.Float(0.0f, f11), null));
            rectangle2.add(this.getPoint2D(new Point2D.Float(f10, f11), null));
            rectangle.setRect(rectangle2);
        }
    }

    public float H() {
        return this.R - (float)((int)Math.min(Math.min(this.R, this.c), Math.min(this.a, this.l)));
    }

    public float p() {
        return this.G - (float)((int)Math.min(Math.min(this.G, this.Z), Math.min(this.A, this.g)));
    }

    @Override
    public Rectangle2D getBounds2D(BufferedImage bufferedImage) {
        String[] stringArray = W5.q();
        int n10 = this.D;
        if (stringArray != null) {
            if (n10 != 0) {
                return new Rectangle(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
            }
            n10 = bufferedImage.getWidth();
        }
        float f10 = n10;
        float f11 = bufferedImage.getHeight();
        Rectangle2D.Float float_ = new Rectangle2D.Float();
        float_.add(this.getPoint2D(new Point2D.Float(0.0f, 0.0f), null));
        float_.add(this.getPoint2D(new Point2D.Float(f10, 0.0f), null));
        float_.add(this.getPoint2D(new Point2D.Float(0.0f, f11), null));
        float_.add(this.getPoint2D(new Point2D.Float(f10, f11), null));
        return float_;
    }

    @Override
    public Point2D getPoint2D(Point2D point2D, Point2D point2D2) {
        String[] stringArray = W5.q();
        Point2D point2D3 = point2D2;
        if (stringArray != null) {
            if (point2D3 == null) {
                point2D2 = new Point2D.Float();
            }
            point2D3 = point2D;
        }
        float f10 = (float)point2D3.getX();
        float f11 = (float)point2D.getY();
        float f12 = 1.0f / (f10 * this.H + f11 * this.u + this.m);
        point2D2.setLocation((f10 * this.M + f11 * this.i + this.e) * f12, (f10 * this.w + f11 * this.W + this.B) * f12);
        return point2D2;
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        fArray[0] = (float)this.U.width * (this.O * (float)n10 + this.x * (float)n11 + this.Q) / (this.Y * (float)n10 + this.T * (float)n11 + this.b);
        fArray[1] = (float)this.U.height * (this.E * (float)n10 + this.V * (float)n11 + this.k) / (this.Y * (float)n10 + this.T * (float)n11 + this.b);
    }

    public String toString() {
        return d;
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
                char[] cArray3 = "F^\u0000J\u001e,Y-g\u0016L\u0002.HaC\u001aH\u0014p\u0003,".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 106;
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
                            n17 = 104;
                            break;
                        }
                        case 1: {
                            n17 = 93;
                            break;
                        }
                        case 2: {
                            n17 = 25;
                            break;
                        }
                        case 3: {
                            n17 = 84;
                            break;
                        }
                        case 4: {
                            n17 = 27;
                            break;
                        }
                        case 5: {
                            n17 = 52;
                            break;
                        }
                        default: {
                            n17 = 71;
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
        d = new String(cArray).intern();
    }
}

