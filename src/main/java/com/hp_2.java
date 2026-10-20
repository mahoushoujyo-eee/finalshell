/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hp
 */
public class hp_2
extends W5 {
    private Composite f;
    private AffineTransform r;
    private static final String a;

    public hp_2() {
    }

    public hp_2(Composite composite) {
        this.f = composite;
    }

    public hp_2(Composite composite, AffineTransform affineTransform) {
        this.f = composite;
        this.r = affineTransform;
    }

    public void F(Composite composite) {
        this.f = composite;
    }

    public Composite M() {
        return this.f;
    }

    public void F(AffineTransform affineTransform) {
        this.r = affineTransform;
    }

    public AffineTransform X() {
        return this.r;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = bufferedImage2;
        }
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setComposite(this.f);
        graphics2D.drawRenderedImage(bufferedImage, this.r);
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
                char[] cArray3 = "KP;\u0018=YB|Z".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 62;
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
                            n17 = 54;
                            break;
                        }
                        case 1: {
                            n17 = 1;
                            break;
                        }
                        case 2: {
                            n17 = 104;
                            break;
                        }
                        case 3: {
                            n17 = 86;
                            break;
                        }
                        case 4: {
                            n17 = 108;
                            break;
                        }
                        case 5: {
                            n17 = 20;
                            break;
                        }
                        default: {
                            n17 = 21;
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

