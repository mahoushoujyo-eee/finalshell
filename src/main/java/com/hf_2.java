/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hf
 */
public class hf_2
extends W5 {
    private float s = 1.0f;
    private float j = 0.5f;
    private float z;
    private float x;
    private float c;
    private float b;
    private static final String a;
    private static final long d;

    public void j(float f10) {
        this.x = f10;
    }

    public float a() {
        return this.x;
    }

    public void G(float f10) {
        this.z = f10;
    }

    public float i() {
        return this.z;
    }

    public void X(float f10) {
        this.c = f10;
    }

    public float x() {
        return this.c;
    }

    public void w(float f10) {
        this.b = f10;
    }

    public float y() {
        return this.b;
    }

    public void b(float f10) {
        this.s = f10;
    }

    public float w() {
        return this.s;
    }

    public void J(float f10) {
        this.j = f10;
    }

    public float P() {
        return this.j;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = bufferedImage;
        }
        BufferedImage bufferedImage4 = bufferedImage3;
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        int n12 = (int)(this.j * (float)n11);
        int n13 = (int)(this.b * (float)n11);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        Shape shape = graphics2D.getClip();
        graphics2D.clipRect(0, 0, n10, n12);
        graphics2D.drawRenderedImage(bufferedImage, null);
        graphics2D.setClip(shape);
        graphics2D.clipRect(0, n12 + n13, n10, n11 - n12 - n13);
        graphics2D.translate(0, 2 * n12 + n13);
        graphics2D.scale(1.0, -1.0);
        graphics2D.drawRenderedImage(bufferedImage, null);
        graphics2D.setPaint(new GradientPaint(0.0f, 0.0f, new Color(1.0f, 0.0f, 0.0f, 0.0f), 0.0f, n12, new Color(0.0f, 1.0f, 0.0f, this.s)));
        graphics2D.setComposite(AlphaComposite.getInstance((int)d));
        graphics2D.fillRect(0, 0, n10, n12);
        graphics2D.setClip(shape);
        graphics2D.dispose();
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
                char[] cArray3 = "Wdh%7\\\u0003=Og2&G\u0002<, ".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 75;
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
                            n17 = 89;
                            break;
                        }
                        case 1: {
                            n17 = 73;
                            break;
                        }
                        case 2: {
                            n17 = 69;
                            break;
                        }
                        case 3: {
                            n17 = 11;
                            break;
                        }
                        case 4: {
                            n17 = 31;
                            break;
                        }
                        case 5: {
                            n17 = 99;
                            break;
                        }
                        default: {
                            n17 = 59;
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
        long l2 = 8132161516603784665L;
        d = 0x2887388C35453DDFL ^ l2;
    }
}

