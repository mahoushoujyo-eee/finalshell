/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.zH;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.zy
 */
public class zy_0
extends zH {
    private float o;
    private float s;
    private float R;
    private float b;
    private float c;
    private float q;

    public zy_0() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public zy_0(float f10, float f11, float f12, float f13) {
        this(f10, f11, f12, f13, 0.5f, 0.5f);
    }

    public zy_0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.R = f10;
        this.b = f11;
        this.c = f12;
        this.q = f13;
        this.o = f14;
        this.s = f15;
    }

    public void H(float f10) {
        this.b = f10;
    }

    public float g() {
        return this.b;
    }

    public void a(float f10) {
        this.R = f10;
    }

    public float E() {
        return this.R;
    }

    public void B(float f10) {
        this.c = f10;
    }

    public float R() {
        return this.c;
    }

    public void f(float f10) {
        this.q = f10;
    }

    public float j() {
        return this.q;
    }

    public void d(float f10) {
        this.o = f10;
    }

    public float Y() {
        return this.o;
    }

    public void S(float f10) {
        this.s = f10;
    }

    public float P() {
        return this.s;
    }

    public void a(Point2D point2D) {
        this.o = (float)point2D.getX();
        this.s = (float)point2D.getY();
    }

    public Point2D m() {
        return new Point2D.Float(this.o, this.s);
    }

    private int w(int n10) {
        int n11;
        block2: {
            int n12 = 1;
            String[] stringArray = zH.U();
            int n13 = 0;
            while (n12 < n10) {
                n11 = n12 * 2;
                if (stringArray == null) {
                    n12 = n11;
                    ++n13;
                    if (stringArray == null) continue;
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
            String[] stringArray = zH.U();
            BufferedImage bufferedImage4 = bufferedImage2;
            if (stringArray == null) {
                if (bufferedImage4 == null) {
                    bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                }
                bufferedImage4 = bufferedImage;
            }
            BufferedImage bufferedImage5 = bufferedImage4;
            float f10 = (float)bufferedImage.getWidth() * this.o;
            float f11 = (float)bufferedImage.getHeight() * this.s;
            float f12 = (float)Math.sqrt(f10 * f10 + f11 * f11);
            float f13 = (float)((double)this.R * Math.cos(this.b));
            float f14 = (float)((double)this.R * -Math.sin(this.b));
            float f15 = this.q;
            float f16 = this.c;
            float f17 = this.R + Math.abs(this.c * f12) + this.q * f12;
            int n10 = this.w((int)f17);
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
                if (stringArray == null) {
                    Graphics2D graphics2D = bufferedImage3.createGraphics();
                    graphics2D.drawImage(bufferedImage5, null, null);
                    graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    graphics2D.setComposite(AlphaComposite.getInstance(3, 0.5f));
                    graphics2D.translate(f10 + f13, f11 + f14);
                    graphics2D.scale(1.0001 + (double)f15, 1.0001 + (double)f15);
                    float f18 = this.c - 0.0f;
                    float f19 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                    if (stringArray == null) {
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
                    if (stringArray == null) continue;
                }
                break block7;
            }
            bufferedImage3 = bufferedImage2;
        }
        return bufferedImage3;
    }
}

