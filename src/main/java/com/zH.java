/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;

public abstract class zH
implements BufferedImageOp {
    private static String[] P;

    @Override
    public BufferedImage createCompatibleDestImage(BufferedImage bufferedImage, ColorModel colorModel) {
        block3: {
            ColorModel colorModel2;
            block2: {
                String[] stringArray = zH.U();
                colorModel2 = colorModel;
                if (stringArray != null) break block2;
                if (colorModel2 != null) break block3;
                colorModel2 = bufferedImage.getColorModel();
            }
            colorModel = colorModel2;
        }
        return new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight()), colorModel.isAlphaPremultiplied(), null);
    }

    @Override
    public Rectangle2D getBounds2D(BufferedImage bufferedImage) {
        return new Rectangle(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
    }

    @Override
    public Point2D getPoint2D(Point2D point2D, Point2D point2D2) {
        String[] stringArray = zH.U();
        Point2D point2D3 = point2D2;
        if (stringArray == null) {
            if (point2D3 == null) {
                point2D2 = new Point2D.Double();
            }
            point2D2.setLocation(point2D.getX(), point2D.getY());
            point2D3 = point2D2;
        }
        return point2D3;
    }

    @Override
    public RenderingHints getRenderingHints() {
        return null;
    }

    public int[] Q(BufferedImage bufferedImage, int n10, int n11, int n12, int n13, int[] nArray) {
        block4: {
            block3: {
                int n14;
                int n15;
                block2: {
                    int n16 = bufferedImage.getType();
                    String[] stringArray = zH.U();
                    n15 = n16;
                    n14 = 2;
                    if (stringArray != null) break block2;
                    if (n15 == n14) break block3;
                    n15 = n16;
                    n14 = 1;
                }
                if (n15 != n14) break block4;
            }
            return (int[])bufferedImage.getRaster().getDataElements(n10, n11, n12, n13, nArray);
        }
        return bufferedImage.getRGB(n10, n11, n12, n13, nArray, 0, n12);
    }

    public void K(BufferedImage bufferedImage, int n10, int n11, int n12, int n13, int[] nArray) {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    int n14 = bufferedImage.getType();
                    stringArray = zH.U();
                    if (stringArray != null) break block2;
                    if (n14 != 2 && n14 != 1) break block3;
                    bufferedImage.getRaster().setDataElements(n10, n11, n12, n13, nArray);
                }
                if (stringArray == null) break block4;
            }
            bufferedImage.setRGB(n10, n11, n12, n13, nArray, 0, n12);
        }
    }

    public static void L(String[] stringArray) {
        P = stringArray;
    }

    public static String[] U() {
        return P;
    }

    static {
        if (zH.U() != null) {
            zH.L(new String[2]);
        }
    }
}

