/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;

/*
 * Renamed from com.ga
 */
public class ga_2
extends W5 {
    private float V = 0.1f;
    private float b;
    private float t = 1.0f;
    private float c = 0.5f;
    private float U = 0.5f;
    private int e = -1;
    private int l = 0;
    private static final String a;

    public void T(float f10) {
        this.b = f10;
    }

    public float k() {
        return this.b;
    }

    public void b(float f10) {
        this.t = f10;
    }

    public float s() {
        return this.t;
    }

    public void R(float f10) {
        this.V = f10;
    }

    public float b() {
        return this.V;
    }

    public void W(float f10) {
        this.U = f10;
    }

    public float z() {
        return this.U;
    }

    public void l(float f10) {
        this.c = f10;
    }

    public float t() {
        return this.c;
    }

    public void U(int n10) {
        this.e = n10;
    }

    public int i() {
        return this.e;
    }

    public void K(int n10) {
        this.l = n10;
    }

    public int E() {
        return this.l;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block4: {
            String[] stringArray = W5.q();
            BufferedImage bufferedImage3 = bufferedImage2;
            if (stringArray != null) {
                if (bufferedImage3 == null) {
                    bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                }
                bufferedImage3 = bufferedImage;
            }
            int n10 = bufferedImage3.getWidth();
            int n11 = bufferedImage.getHeight();
            int n12 = (int)(this.V * (float)n10 * (float)n11 / 100.0f);
            float f10 = this.U * (float)n10;
            Random random = new Random(this.l);
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setColor(new Color(this.e));
            graphics2D.setStroke(new BasicStroke(this.c));
            for (int i2 = 0; i2 < n12; ++i2) {
                float f11 = (float)n10 * random.nextFloat();
                float f12 = (float)n11 * random.nextFloat();
                float f13 = this.b + (float)Math.PI * 2 * (this.t * (random.nextFloat() - 0.5f));
                float f14 = (float)Math.sin(f13) * f10;
                float f15 = (float)Math.cos(f13) * f10;
                float f16 = f11 - f15;
                float f17 = f12 - f14;
                float f18 = f11 + f15;
                float f19 = f12 + f14;
                graphics2D.drawLine((int)f16, (int)f17, (int)f18, (int)f19);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block4;
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
                char[] cArray3 = "^7\u0015z.!\u0005_1\t\u007f?0Bi!U0e".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 65;
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
                            n17 = 77;
                            break;
                        }
                        case 1: {
                            n17 = 19;
                            break;
                        }
                        case 2: {
                            n17 = 58;
                            break;
                        }
                        case 3: {
                            n17 = 95;
                            break;
                        }
                        case 4: {
                            n17 = 10;
                            break;
                        }
                        case 5: {
                            n17 = 18;
                            break;
                        }
                        default: {
                            n17 = 107;
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

