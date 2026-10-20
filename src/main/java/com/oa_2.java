/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xg_0;
import com.z1;
import com.z7;
import com.zi_0;
import com.zy_0;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

/*
 * Renamed from com.oa
 */
public final class oa_2 {
    private static final ColorConvertOp w;

    public static BufferedImage v(Image image, Image image2, int n10, int n11, int n12) {
        return oa_2.G(xg_0.v(image), xg_0.v(image2), n10, n11, n12);
    }

    public static BufferedImage G(BufferedImage bufferedImage, BufferedImage bufferedImage2, int n10, int n11, int n12) {
        return new z1(n10, n11, n12).filter(bufferedImage, bufferedImage2);
    }

    public static BufferedImage P(Image image, Image image2) {
        return oa_2.q(xg_0.v(image), xg_0.v(image2));
    }

    public static BufferedImage q(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        return w.filter(bufferedImage, bufferedImage2);
    }

    public static BufferedImage u(Image image, Image image2, float f10) {
        return oa_2.W(xg_0.v(image), xg_0.v(image2), f10);
    }

    public static BufferedImage W(BufferedImage bufferedImage, BufferedImage bufferedImage2, float f10) {
        return new z7(f10).filter(bufferedImage, bufferedImage2);
    }

    public static BufferedImage V(Image image, Image image2, float f10, float f11, float f12) {
        return oa_2.V(xg_0.v(image), xg_0.v(image2), f10, f11, f12);
    }

    public static BufferedImage V(BufferedImage bufferedImage, BufferedImage bufferedImage2, float f10, float f11, float f12) {
        return new zy_0(0.0f, 0.0f, 0.0f, f10, f11, f12).filter(bufferedImage, bufferedImage2);
    }

    public static BufferedImage n(Image image, Image image2, float f10, float f11, float f12) {
        return oa_2.G(xg_0.v(image), xg_0.v(image2), f10, f11, f12);
    }

    public static BufferedImage G(BufferedImage bufferedImage, BufferedImage bufferedImage2, float f10, float f11, float f12) {
        return new zy_0(0.0f, 0.0f, f10, 0.0f, f11, f12).filter(bufferedImage, bufferedImage2);
    }

    public static BufferedImage p(Image image, Image image2, float f10, float f11, float f12, float f13, float f14, float f15) {
        return oa_2.N(xg_0.v(image), xg_0.v(image2), f10, f11, f12, f13, f14, f15);
    }

    public static BufferedImage N(BufferedImage bufferedImage, BufferedImage bufferedImage2, float f10, float f11, float f12, float f13, float f14, float f15) {
        return new zy_0(f10, f11, f12, f13, f14, f15).filter(bufferedImage, bufferedImage2);
    }

    public static BufferedImage i(Image image, Image image2, int n10) {
        return oa_2.L(xg_0.v(image), xg_0.v(image2), n10);
    }

    public static BufferedImage L(BufferedImage bufferedImage, BufferedImage bufferedImage2, int n10) {
        return new zi_0(n10).filter(bufferedImage, bufferedImage2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 109975030304594454L;
        long l3 = 0xADCD1E351777D9FDL ^ l2;
        w = new ColorConvertOp(ColorSpace.getInstance((int)l3), null);
    }
}

