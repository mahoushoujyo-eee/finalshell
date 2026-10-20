/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.zH;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.zd
 */
public abstract class zd_0
extends zH {
    protected boolean Z = false;

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        int n12 = bufferedImage.getType();
        String[] stringArray = zH.U();
        WritableRaster writableRaster = bufferedImage.getRaster();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray == null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = bufferedImage2;
        }
        WritableRaster writableRaster2 = bufferedImage3.getRaster();
        this.Y(n10, n11);
        int[] nArray = new int[n10];
        int n13 = 0;
        while (n13 < n11) {
            block9: {
                block12: {
                    int n14;
                    block10: {
                        int n15;
                        block11: {
                            block8: {
                                n15 = n12;
                                if (stringArray != null) break block10;
                                if (n15 != 2) break block11;
                                writableRaster.getDataElements(0, n13, n10, 1, nArray);
                                for (n14 = 0; n14 < n10; ++n14) {
                                    nArray[n14] = this.T(n14, n13, nArray[n14]);
                                    if (stringArray == null) {
                                        if (stringArray == null) continue;
                                    }
                                    break block8;
                                }
                                writableRaster2.setDataElements(0, n13, n10, 1, nArray);
                            }
                            if (stringArray == null) break block12;
                        }
                        bufferedImage.getRGB(0, n13, n10, 1, nArray, 0, n10);
                        n15 = n14 = 0;
                    }
                    while (n14 < n10) {
                        nArray[n14] = this.T(n14, n13, nArray[n14]);
                        ++n14;
                        if (stringArray == null) {
                            if (stringArray == null) continue;
                        }
                        break block9;
                    }
                    bufferedImage2.setRGB(0, n13, n10, 1, nArray, 0, n10);
                }
                ++n13;
            }
            if (stringArray == null) continue;
        }
        return bufferedImage2;
    }

    public void Y(int n10, int n11) {
    }

    public abstract int T(int var1, int var2, int var3);
}

