/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hx
 */
public class hx_2
extends W5 {
    private float d = 0.5f;
    private float G = 0.5f;
    private float L;
    private float y;
    private float l;
    private float n;
    private float D = 1.0f;
    private float e = 1.0f;
    private int h;
    private static final String a;

    public hx_2() {
    }

    public hx_2(float f10, float f11, float f12, float f13) {
        this.L = f10;
        this.y = f11;
        this.l = f12;
        this.n = f13;
    }

    public void H(float f10) {
        this.y = f10;
    }

    public float Y() {
        return this.y;
    }

    public void N(float f10) {
        this.L = f10;
    }

    public float y() {
        return this.L;
    }

    public void L(float f10) {
        this.l = f10;
    }

    public float u() {
        return this.l;
    }

    public void o(float f10) {
        this.n = f10;
    }

    public float H() {
        return this.n;
    }

    public void s(float f10) {
        this.D = f10;
    }

    public float v() {
        return this.D;
    }

    public void y(float f10) {
        this.e = f10;
    }

    public float U() {
        return this.e;
    }

    public void v(float f10) {
        this.d = f10;
    }

    public float G() {
        return this.d;
    }

    public void T(float f10) {
        this.G = f10;
    }

    public float e() {
        return this.G;
    }

    public void C(Point2D point2D) {
        this.d = (float)point2D.getX();
        this.G = (float)point2D.getY();
    }

    public Point2D a() {
        return new Point2D.Float(this.d, this.G);
    }

    public void U(int n10) {
        this.h = n10;
    }

    public int m() {
        return this.h;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block6: {
            String[] stringArray = W5.q();
            BufferedImage bufferedImage3 = bufferedImage2;
            if (stringArray != null) {
                if (bufferedImage3 == null) {
                    bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                }
                bufferedImage3 = bufferedImage;
            }
            float f10 = (float)bufferedImage3.getWidth() * this.d;
            float f11 = (float)bufferedImage.getHeight() * this.G;
            float f12 = (float)Math.sqrt(f10 * f10 + f11 * f11);
            float f13 = (float)((double)this.L * Math.cos(this.y));
            float f14 = (float)((double)this.L * -Math.sin(this.y));
            float f15 = (float)Math.exp(this.n);
            float f16 = this.l;
            if (this.h == 0) {
                Graphics2D graphics2D = bufferedImage2.createGraphics();
                graphics2D.drawRenderedImage(bufferedImage, null);
                graphics2D.dispose();
                return bufferedImage2;
            }
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            graphics2D.drawImage(bufferedImage, null, null);
            for (int i2 = 0; i2 < this.h; ++i2) {
                graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                graphics2D.setComposite(AlphaComposite.getInstance(3, NM.J((float)i2 / (float)(this.h - 1), this.D, this.e)));
                graphics2D.translate(f10 + f13, f11 + f14);
                graphics2D.scale(f15, f15);
                if (stringArray != null) {
                    float f17 = this.l - 0.0f;
                    float f18 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                    if (stringArray == null) continue;
                    if (f18 != false) {
                        graphics2D.rotate(f16);
                    }
                    graphics2D.translate(-f10, -f11);
                    f18 = (float)graphics2D.drawImage(bufferedImage, null, null);
                    if (stringArray != null) continue;
                }
                break block6;
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
                char[] cArray3 = "?#UO\u001c[JU\u0003VO\u001bMX\u0019.\u001d\u0004Q".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 13;
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
                            n17 = 119;
                            break;
                        }
                        case 1: {
                            n17 = 72;
                            break;
                        }
                        case 2: {
                            n17 = 62;
                            break;
                        }
                        case 3: {
                            n17 = 39;
                            break;
                        }
                        case 4: {
                            n17 = 114;
                            break;
                        }
                        case 5: {
                            n17 = 34;
                            break;
                        }
                        default: {
                            n17 = 52;
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

