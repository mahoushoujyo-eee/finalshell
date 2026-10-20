/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hh
 */
public class hh_2
extends W5 {
    private float i = 0.5f;
    private float Y = 0.5f;
    private float D;
    private float G;
    private float n;
    private float M;
    private static final String a;

    public hh_2() {
    }

    public hh_2(float f10, float f11, float f12, float f13) {
        this.D = f10;
        this.G = f11;
        this.n = f12;
        this.M = f13;
    }

    public void A(float f10) {
        this.G = f10;
    }

    public float Q() {
        return this.G;
    }

    public void x(float f10) {
        this.D = f10;
    }

    public float L() {
        return this.D;
    }

    public void p(float f10) {
        this.n = f10;
    }

    public float T() {
        return this.n;
    }

    public void Y(float f10) {
        this.M = f10;
    }

    public float x() {
        return this.M;
    }

    public void N(float f10) {
        this.i = f10;
    }

    public float z() {
        return this.i;
    }

    public void D(float f10) {
        this.Y = f10;
    }

    public float i() {
        return this.Y;
    }

    public void i(Point2D point2D) {
        this.i = (float)point2D.getX();
        this.Y = (float)point2D.getY();
    }

    public Point2D f() {
        return new Point2D.Float(this.i, this.Y);
    }

    private int K(int n10) {
        int n11;
        block2: {
            int n12 = 1;
            String[] stringArray = W5.q();
            int n13 = 0;
            while (n12 < n10) {
                n11 = n12 * 2;
                if (stringArray != null) {
                    n12 = n11;
                    ++n13;
                    if (stringArray != null) continue;
                }
                break block2;
            }
            n11 = n13;
        }
        return n11;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        BufferedImage bufferedImage3;
        block7: {
            String[] stringArray = W5.q();
            BufferedImage bufferedImage4 = bufferedImage2;
            if (stringArray != null) {
                if (bufferedImage4 == null) {
                    bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                }
                bufferedImage4 = bufferedImage;
            }
            BufferedImage bufferedImage5 = bufferedImage4;
            float f10 = (float)bufferedImage.getWidth() * this.i;
            float f11 = (float)bufferedImage.getHeight() * this.Y;
            float f12 = (float)Math.sqrt(f10 * f10 + f11 * f11);
            float f13 = (float)((double)this.D * Math.cos(this.G));
            float f14 = (float)((double)this.D * -Math.sin(this.G));
            float f15 = this.M;
            float f16 = this.n;
            float f17 = this.D + Math.abs(this.n * f12) + this.M * f12;
            int n10 = this.K((int)f17);
            f13 /= f17;
            f14 /= f17;
            f15 /= f17;
            f16 /= f17;
            if (n10 == 0) {
                Graphics2D graphics2D = bufferedImage2.createGraphics();
                graphics2D.drawRenderedImage(bufferedImage, null);
                graphics2D.dispose();
                return bufferedImage2;
            }
            BufferedImage bufferedImage6 = this.createCompatibleDestImage(bufferedImage, null);
            for (int i2 = 0; i2 < n10; ++i2) {
                bufferedImage3 = bufferedImage6;
                if (stringArray != null) {
                    Graphics2D graphics2D = bufferedImage3.createGraphics();
                    graphics2D.drawImage(bufferedImage5, null, null);
                    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    graphics2D.setComposite(AlphaComposite.getInstance(3, 0.5f));
                    graphics2D.translate(f10 + f13, f11 + f14);
                    graphics2D.scale(1.0001 + (double)f15, 1.0001 + (double)f15);
                    float f18 = this.n - 0.0f;
                    float f19 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                    if (stringArray != null) {
                        if (f19 != false) {
                            graphics2D.rotate(f16);
                        }
                        graphics2D.translate(-f10, -f11);
                        f19 = (float)graphics2D.drawImage(bufferedImage2, null, null);
                    }
                    graphics2D.dispose();
                    BufferedImage bufferedImage7 = bufferedImage2;
                    bufferedImage2 = bufferedImage6;
                    bufferedImage6 = bufferedImage7;
                    bufferedImage5 = bufferedImage2;
                    f13 *= 2.0f;
                    f14 *= 2.0f;
                    f15 *= 2.0f;
                    f16 *= 2.0f;
                    if (stringArray != null) continue;
                }
                break block7;
            }
            bufferedImage3 = bufferedImage2;
        }
        return bufferedImage3;
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
                char[] cArray3 = "~T1\u001a501OL!\u001a:;?HQ+\u0006:4<IJjF4".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 50;
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
                            n17 = 10;
                            break;
                        }
                        case 2: {
                            n17 = 118;
                            break;
                        }
                        case 3: {
                            n17 = 90;
                            break;
                        }
                        case 4: {
                            n17 = 40;
                            break;
                        }
                        case 5: {
                            n17 = 68;
                            break;
                        }
                        default: {
                            n17 = 98;
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

