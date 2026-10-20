/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.gT
 */
public abstract class gt_1
extends W5 {
    protected Rectangle l;
    protected Rectangle H;

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        Object object;
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        int n12 = bufferedImage.getType();
        WritableRaster writableRaster = bufferedImage.getRaster();
        this.H = new Rectangle(0, 0, n10, n11);
        this.l = new Rectangle(0, 0, n10, n11);
        String[] stringArray = W5.q();
        this.J(this.l);
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                object = bufferedImage.getColorModel();
                bufferedImage2 = new BufferedImage((ColorModel)object, ((ColorModel)object).createCompatibleWritableRaster(this.l.width, this.l.height), ((ColorModel)object).isAlphaPremultiplied(), null);
            }
            bufferedImage3 = bufferedImage2;
        }
        object = bufferedImage3.getRaster();
        int[] nArray = this.l(bufferedImage, 0, 0, n10, n11, null);
        nArray = this.K(n10, n11, nArray, this.l);
        this.E(bufferedImage2, 0, 0, this.l.width, this.l.height, nArray);
        return bufferedImage2;
    }

    protected void J(Rectangle rectangle) {
    }

    protected abstract int[] K(int var1, int var2, int[] var3, Rectangle var4);
}

