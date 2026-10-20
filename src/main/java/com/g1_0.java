/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gs_1;
import com.hc_2;
import com.hx_1;
import com.ro_1;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.g1
 */
public class g1_0
extends W5 {
    private float H = 5.0f;
    private float f = 5.4977875f;
    private float Y = 5.0f;
    private float h = 0.5f;
    private boolean b = false;
    private int X = -1;
    private float S = 0.2f;
    private float v = 0.0f;
    private static final String a;

    public void r(float f10) {
        this.f = f10;
    }

    public float x() {
        return this.f;
    }

    public void L(float f10) {
        this.Y = f10;
    }

    public float B() {
        return this.Y;
    }

    public void M(float f10) {
        this.H = f10;
    }

    public float J() {
        return this.H;
    }

    public void s(float f10) {
        this.h = f10;
    }

    public float I() {
        return this.h;
    }

    public void K(int n10) {
        this.X = n10;
    }

    public int o() {
        return this.X;
    }

    public void S(boolean bl) {
        this.b = bl;
    }

    public boolean e() {
        return this.b;
    }

    public void p(float f10) {
        this.S = f10;
    }

    public float M() {
        return this.S;
    }

    public void Z(float f10) {
        this.v = f10;
    }

    public float K() {
        return this.v;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10;
        int n11;
        block3: {
            BufferedImage bufferedImage3;
            block2: {
                n11 = bufferedImage.getWidth();
                String[] stringArray = W5.q();
                n10 = bufferedImage.getHeight();
                bufferedImage3 = bufferedImage2;
                if (stringArray == null) break block2;
                if (bufferedImage3 != null) break block3;
                bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage2 = bufferedImage3;
        }
        float f10 = this.Y * (float)Math.cos(this.f);
        float f11 = -this.Y * (float)Math.sin(this.f);
        BufferedImage bufferedImage4 = new BufferedImage(n11, n10, 2);
        hc_2 hc_22 = new hc_2(this.h * 10.0f, 0.75f, 0.1f);
        bufferedImage4 = hc_22.filter(bufferedImage, null);
        BufferedImage bufferedImage5 = new BufferedImage(n11, n10, 2);
        Graphics2D graphics2D = bufferedImage5.createGraphics();
        graphics2D.setColor(new Color(this.X));
        graphics2D.fillRect(0, 0, n11, n10);
        graphics2D.setComposite(AlphaComposite.DstIn);
        graphics2D.drawRenderedImage(bufferedImage4, null);
        graphics2D.setComposite(AlphaComposite.DstOut);
        graphics2D.translate(f10, f11);
        graphics2D.drawRenderedImage(bufferedImage4, null);
        graphics2D.dispose();
        bufferedImage5 = new hx_1(this.H).filter(bufferedImage5, null);
        bufferedImage5 = new gs_1(3.0f * this.S).filter(bufferedImage5, bufferedImage5);
        graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawRenderedImage(bufferedImage, null);
        graphics2D.setComposite(new ro_1(1.0f));
        graphics2D.drawRenderedImage(bufferedImage5, null);
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
                char[] cArray3 = "gL>\u001cN\u0001z\u001bk/\u0019I\u001e1\u001a\u0016".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 28;
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
                            n17 = 40;
                            break;
                        }
                        case 1: {
                            n17 = 36;
                            break;
                        }
                        case 2: {
                            n17 = 91;
                            break;
                        }
                        case 3: {
                            n17 = 108;
                            break;
                        }
                        case 4: {
                            n17 = 59;
                            break;
                        }
                        case 5: {
                            n17 = 103;
                            break;
                        }
                        default: {
                            n17 = 3;
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

