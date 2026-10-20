/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class WW
extends W5 {
    private BufferedImage o;
    private BufferedImage t;
    private static final String a;

    public WW() {
    }

    public WW(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.t = bufferedImage;
        this.o = bufferedImage2;
    }

    public void s(BufferedImage bufferedImage) {
        this.o = bufferedImage;
    }

    public BufferedImage m() {
        return this.o;
    }

    public void w(BufferedImage bufferedImage) {
        this.t = bufferedImage;
    }

    public BufferedImage h() {
        return this.t;
    }

    public static void m(Raster raster, WritableRaster writableRaster, Raster raster2) {
        int n10 = raster.getMinX();
        int n11 = raster.getMinY();
        int n12 = raster.getWidth();
        int n13 = raster.getHeight();
        int[] nArray = null;
        int[] nArray2 = null;
        int[] nArray3 = null;
        int n14 = 0;
        String[] stringArray = W5.q();
        while (n14 < n13) {
            block3: {
                nArray = raster.getPixels(n10, n11, n12, 1, nArray);
                nArray2 = raster2.getPixels(n10, n11, n12, 1, nArray2);
                nArray3 = writableRaster.getPixels(n10, n11, n12, 1, nArray3);
                int n15 = n10;
                for (int i2 = 0; i2 < n12; ++i2) {
                    int n16 = nArray[n15];
                    int n17 = nArray3[n15];
                    int n18 = nArray[n15 + 1];
                    int n19 = nArray3[n15 + 1];
                    int n20 = nArray[n15 + 2];
                    int n21 = nArray3[n15 + 2];
                    int n22 = nArray[n15 + 3];
                    int n23 = nArray3[n15 + 3];
                    float f10 = (float)nArray2[n15 + 3] / 255.0f;
                    float f11 = 1.0f - f10;
                    nArray3[n15] = (int)(f10 * (float)n16 + f11 * (float)n17);
                    nArray3[n15 + 1] = (int)(f10 * (float)n18 + f11 * (float)n19);
                    nArray3[n15 + 2] = (int)(f10 * (float)n20 + f11 * (float)n21);
                    nArray3[n15 + 3] = (int)(f10 * (float)n22 + f11 * (float)n23);
                    n15 += 4;
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block3;
                }
                writableRaster.setPixels(n10, n11, n12, 1, nArray3);
                ++n11;
                ++n14;
            }
            if (stringArray != null) continue;
        }
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        BufferedImage bufferedImage3;
        block6: {
            block7: {
                int n10 = bufferedImage.getWidth();
                int n11 = bufferedImage.getHeight();
                int n12 = bufferedImage.getType();
                WritableRaster writableRaster = bufferedImage.getRaster();
                String[] stringArray = W5.q();
                BufferedImage bufferedImage4 = bufferedImage2;
                if (stringArray != null) {
                    if (bufferedImage4 == null) {
                        bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                    }
                    bufferedImage4 = bufferedImage2;
                }
                WritableRaster writableRaster2 = bufferedImage4.getRaster();
                bufferedImage3 = this.o;
                if (stringArray == null) break block6;
                if (bufferedImage3 == null) break block7;
                bufferedImage3 = this.t;
                if (stringArray == null) break block6;
                if (bufferedImage3 != null) {
                    WW.m(bufferedImage.getRaster(), bufferedImage2.getRaster(), this.t.getRaster());
                }
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
                char[] cArray3 = "Bz\u007f\u007f%\u00055Bz\u007f8eL".toCharArray();
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
                            n17 = 59;
                            break;
                        }
                        case 1: {
                            n17 = 45;
                            break;
                        }
                        case 2: {
                            n17 = 52;
                            break;
                        }
                        case 3: {
                            n17 = 36;
                            break;
                        }
                        case 4: {
                            n17 = 121;
                            break;
                        }
                        case 5: {
                            n17 = 80;
                            break;
                        }
                        default: {
                            n17 = 40;
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

