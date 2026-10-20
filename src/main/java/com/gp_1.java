/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gP
 */
public class gp_1
extends gy_2 {
    private float T = 0.0f;
    private float n = 0.5f;
    private float v = 0.5f;
    private float D = 100.0f;
    private float z = 0.0f;
    private float f;
    private float K;
    private static final String a;

    public gp_1() {
        this.Y(1);
    }

    public void w(float f10) {
        this.T = f10;
    }

    public float C() {
        return this.T;
    }

    public void o(float f10) {
        this.n = f10;
    }

    public float z() {
        return this.n;
    }

    public void t(float f10) {
        this.v = f10;
    }

    public float T() {
        return this.v;
    }

    public void C(Point2D point2D) {
        this.n = (float)point2D.getX();
        this.v = (float)point2D.getY();
    }

    public Point2D y() {
        return new Point2D.Float(this.n, this.v);
    }

    public void h(float f10) {
        this.D = f10;
    }

    public float P() {
        return this.D;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.f = (float)bufferedImage.getWidth() * this.n;
        String[] stringArray = W5.q();
        this.K = (float)bufferedImage.getHeight() * this.v;
        gp_1 gp_12 = this;
        if (stringArray != null) {
            if (gp_12.D == 0.0f) {
                this.D = Math.min(this.f, this.K);
            }
            this.z = this.D * this.D;
            gp_12 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        block4: {
            float f10;
            float f11;
            float f12;
            block2: {
                float f13;
                float f14;
                block3: {
                    f14 = (float)n10 - this.f;
                    f13 = (float)n11 - this.K;
                    f12 = f14 * f14 + f13 * f13;
                    String[] stringArray = W5.q();
                    f11 = f12;
                    f10 = this.z;
                    if (stringArray == null) break block2;
                    if (!(f11 > f10)) break block3;
                    fArray[0] = n10;
                    fArray[1] = n11;
                    if (stringArray != null) break block4;
                }
                f12 = (float)Math.sqrt(f12);
                f11 = (float)Math.atan2(f13, f14);
                f10 = this.T * (this.D - f12) / this.D;
            }
            float f15 = f11 + f10;
            fArray[0] = this.f + f12 * (float)Math.cos(f15);
            fArray[1] = this.K + f12 * (float)Math.sin(f15);
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
                char[] cArray3 = "/as\u001cK\f'D\\w\u0001V\u0012}E&".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 121;
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
                            n17 = 18;
                            break;
                        }
                        case 1: {
                            n17 = 113;
                            break;
                        }
                        case 2: {
                            n17 = 121;
                            break;
                        }
                        case 3: {
                            n17 = 17;
                            break;
                        }
                        case 4: {
                            n17 = 93;
                            break;
                        }
                        case 5: {
                            n17 = 7;
                            break;
                        }
                        default: {
                            n17 = 42;
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

