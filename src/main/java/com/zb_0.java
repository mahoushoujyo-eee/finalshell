/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.awt.image.PixelGrabber;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.zb
 */
public abstract class zb_0 {
    private static BufferedImage I;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static BufferedImage d(ImageProducer imageProducer) {
        int n10;
        PixelGrabber pixelGrabber;
        block9: {
            block10: {
                pixelGrabber = new PixelGrabber(imageProducer, 0, 0, -1, -1, null, 0, 0);
                String[] stringArray = W5.q();
                try {
                    pixelGrabber.grabPixels();
                }
                catch (InterruptedException interruptedException) {
                    throw new RuntimeException("\u0000ERR:ArrayIndexOutOfBoundsException:Index 13875 out of bounds for length 42");
                }
                try {
                    try {
                        n10 = pixelGrabber.status() & zb_0.a(29296, 7324890674716781270L);
                        if (stringArray == null) break block9;
                        if (n10 == 0) break block10;
                    }
                    catch (InterruptedException interruptedException) {
                        throw zb_0.a(interruptedException);
                    }
                    throw new RuntimeException("\u0000ERR:ArrayIndexOutOfBoundsException:Index 13874 out of bounds for length 42");
                }
                catch (InterruptedException interruptedException) {
                    throw zb_0.a(interruptedException);
                }
            }
            n10 = pixelGrabber.status() & zb_0.a(28905, 2153863042812192846L);
        }
        try {
            if (n10 != 0) {
                throw new RuntimeException("\u0000ERR:ArrayIndexOutOfBoundsException:Index 13872 out of bounds for length 42");
            }
        }
        catch (InterruptedException interruptedException) {
            throw zb_0.a(interruptedException);
        }
        BufferedImage bufferedImage = new BufferedImage(pixelGrabber.getWidth(), pixelGrabber.getHeight(), 2);
        bufferedImage.setRGB(0, 0, pixelGrabber.getWidth(), pixelGrabber.getHeight(), (int[])pixelGrabber.getPixels(), 0, pixelGrabber.getWidth());
        return bufferedImage;
    }

    public static BufferedImage u(Image image) {
        BufferedImage bufferedImage;
        block11: {
            block10: {
                int n10;
                block9: {
                    String[] stringArray = W5.q();
                    try {
                        try {
                            try {
                                n10 = image instanceof BufferedImage;
                                if (stringArray == null) break block9;
                                if (n10 == 0) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw zb_0.a(runtimeException);
                            }
                            bufferedImage = (BufferedImage)image;
                            if (stringArray == null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw zb_0.a(runtimeException);
                        }
                        n10 = bufferedImage.getType();
                    }
                    catch (RuntimeException runtimeException) {
                        throw zb_0.a(runtimeException);
                    }
                }
                try {
                    if (n10 == 2) {
                        return (BufferedImage)image;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw zb_0.a(runtimeException);
                }
            }
            bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
        }
        BufferedImage bufferedImage2 = bufferedImage;
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage h(BufferedImage bufferedImage, int n10, int n11, int n12, int n13) {
        BufferedImage bufferedImage2 = new BufferedImage(n12, n13, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawRenderedImage(bufferedImage, AffineTransform.getTranslateInstance(-n10, -n11));
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage A(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawRenderedImage(bufferedImage, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static void f(Component component, Graphics graphics, int n10, int n11, int n12, int n13) {
        block34: {
            int n14;
            Object object;
            BufferedImage bufferedImage;
            String[] stringArray;
            block24: {
                block25: {
                    Object object2;
                    block26: {
                        stringArray = W5.q();
                        try {
                            bufferedImage = I;
                            if (stringArray == null) break block24;
                            if (bufferedImage != null) break block25;
                        }
                        catch (RuntimeException runtimeException) {
                            throw zb_0.a(runtimeException);
                        }
                        I = new BufferedImage(zb_0.a(25483, 1348758473218308907L), zb_0.a(28905, 2153863042812192846L), 2);
                        object = I.createGraphics();
                        for (int i2 = 0; i2 < zb_0.a(28905, 2153863042812192846L); i2 += 8) {
                            if (stringArray == null) break block25;
                            for (n14 = 0; n14 < zb_0.a(28905, 2153863042812192846L); n14 += 8) {
                                Color color;
                                block28: {
                                    block27: {
                                        try {
                                            try {
                                                object2 = object;
                                                if (stringArray == null) break block26;
                                                if (((n14 ^ i2) & zb_0.a(7262, 7453272590818034940L)) == 0) break block27;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw zb_0.a(runtimeException);
                                            }
                                            color = Color.lightGray;
                                            break block28;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw zb_0.a(runtimeException);
                                        }
                                    }
                                    color = Color.white;
                                }
                                ((Graphics)object2).setColor(color);
                                ((Graphics)object).fillRect(n14, i2, zb_0.a(7410, 108848770989343827L), zb_0.a(7410, 108848770989343827L));
                                if (stringArray != null) continue;
                            }
                            if (stringArray != null) continue;
                        }
                        object2 = object;
                    }
                    ((Graphics)object2).dispose();
                }
                bufferedImage = I;
            }
            if (bufferedImage != null) {
                block32: {
                    int n15;
                    int n16;
                    int n17;
                    Rectangle rectangle;
                    block33: {
                        block31: {
                            Rectangle rectangle2;
                            block29: {
                                block30: {
                                    object = graphics.getClip();
                                    rectangle = graphics.getClipBounds();
                                    try {
                                        rectangle2 = rectangle;
                                        if (stringArray == null) break block29;
                                        if (rectangle2 != null) break block30;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw zb_0.a(runtimeException);
                                    }
                                    rectangle = new Rectangle(component.getSize());
                                }
                                rectangle2 = rectangle.intersection(new Rectangle(n10, n11, n12, n13));
                            }
                            rectangle = rectangle2;
                            graphics.setClip(rectangle);
                            n14 = I.getWidth();
                            n17 = I.getHeight();
                            try {
                                try {
                                    n16 = n14;
                                    n15 = -1;
                                    if (stringArray == null) break block31;
                                    if (n16 == n15) break block32;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw zb_0.a(runtimeException);
                                }
                                n16 = n17;
                                n15 = -1;
                            }
                            catch (RuntimeException runtimeException) {
                                throw zb_0.a(runtimeException);
                            }
                        }
                        try {
                            try {
                                if (stringArray == null) break block33;
                                if (n16 == n15) break block32;
                            }
                            catch (RuntimeException runtimeException) {
                                throw zb_0.a(runtimeException);
                            }
                            n16 = rectangle.x / n14;
                            n15 = n14;
                        }
                        catch (RuntimeException runtimeException) {
                            throw zb_0.a(runtimeException);
                        }
                    }
                    int n18 = n16 * n15;
                    int n19 = rectangle.y / n17 * n17;
                    int n20 = (rectangle.x + rectangle.width + n14 - 1) / n14 * n14;
                    int n21 = (rectangle.y + rectangle.height + n17 - 1) / n17 * n17;
                    n11 = n19;
                    while (n11 < n21) {
                        block35: {
                            if (stringArray == null) break block34;
                            for (n10 = n18; n10 < n20; n10 += n14) {
                                graphics.drawImage(I, n10, n11, component);
                                try {
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                        break;
                                    }
                                    break block35;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw zb_0.a(runtimeException);
                                }
                            }
                            n11 += n17;
                        }
                        if (stringArray != null) continue;
                    }
                }
                graphics.setClip((Shape)object);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Rectangle f(BufferedImage var0) {
        block46: {
            var2_1 = var0.getWidth();
            var3_2 = var0.getHeight();
            var4_3 = 0;
            var5_4 = 0;
            var6_5 = var2_1;
            var7_6 = var3_2;
            var8_7 = 0;
            var10_8 = null;
            var1_10 = W5.q();
            for (var9_9 = var3_2 - 1; var9_9 >= 0; --var9_9) {
                block44: {
                    block42: {
                        var10_8 = zb_0.Z(var0, 0, var9_9, var2_1, 1, var10_8);
                        for (var11_11 = 0; var11_11 < var6_5; ++var11_11) {
                            block43: {
                                try {
                                    try {
                                        v0 = var10_8[var11_11] & zb_0.a(21823, 7691695537885121947L);
                                        if (var1_10 == null) break block42;
                                        if (var1_10 == null) break block43;
                                    }
                                    catch (RuntimeException v1) {
                                        throw zb_0.a(v1);
                                    }
                                    if (v0 == 0) continue;
                                }
                                catch (RuntimeException v2) {
                                    throw zb_0.a(v2);
                                }
                                var6_5 = var11_11;
                                var5_4 = var9_9;
                                v3 = true;
                            }
                            var8_7 = v3;
                            try {
                                if (var1_10 != null) break;
                                if (var1_10 != null) continue;
                                break;
                            }
                            catch (RuntimeException v4) {
                                throw zb_0.a(v4);
                            }
                        }
                        v0 = var11_11 = var2_1 - 1;
                    }
                    while (var11_11 >= var4_3) {
                        block45: {
                            try {
                                try {
                                    v5 = var10_8[var11_11] & zb_0.a(4101, 3170561948624570528L);
                                    if (var1_10 == null) break block44;
                                    if (var1_10 == null) break block45;
                                }
                                catch (RuntimeException v6) {
                                    throw zb_0.a(v6);
                                }
                                if (v5 != 0) {
                                }
                                ** GOTO lbl59
                            }
                            catch (RuntimeException v7) {
                                throw zb_0.a(v7);
                            }
                            var4_3 = var11_11;
                            var5_4 = var9_9;
                            v8 = true;
                        }
                        var8_7 = v8;
                        try {
                            if (var1_10 != null) break;
lbl59:
                            // 2 sources

                            --var11_11;
                            if (var1_10 != null) continue;
                            break;
                        }
                        catch (RuntimeException v9) {
                            throw zb_0.a(v9);
                        }
                    }
                    v5 = var8_7;
                }
                try {
                    try {
                        if (v5 != 0 && var1_10 != null) break;
                        continue;
                    }
                    catch (RuntimeException v10) {
                        throw zb_0.a(v10);
                    }
                }
                catch (RuntimeException v11) {
                    throw zb_0.a(v11);
                }
            }
            var10_8 = null;
            var11_11 = 0;
            block35: while (true) {
                v12 = var11_11;
                block36: while (v12 < var9_9) {
                    block47: {
                        var10_8 = zb_0.Z(var0, 0, var11_11, var2_1, 1, var10_8);
                        v13 = 0;
                        if (var1_10 == null) break block46;
                        for (var12_12 = v10274739; var12_12 < var6_5; ++var12_12) {
                            block49: {
                                block50: {
                                    block48: {
                                        try {
                                            try {
                                                v14 = var10_8[var12_12] & zb_0.a(4101, 3170561948624570528L);
                                                if (var1_10 == null) break block47;
                                                if (var1_10 == null) break block48;
                                            }
                                            catch (RuntimeException v15) {
                                                throw zb_0.a(v15);
                                            }
                                            if (v14 == 0) continue;
                                        }
                                        catch (RuntimeException v16) {
                                            throw zb_0.a(v16);
                                        }
                                        var6_5 = var12_12;
                                        v17 = var11_11;
                                    }
                                    try {
                                        if (var1_10 == null) break block49;
                                        if (v17 >= var7_6) break block50;
                                    }
                                    catch (RuntimeException v18) {
                                        throw zb_0.a(v18);
                                    }
                                    var7_6 = var11_11;
                                }
                                v17 = 1;
                            }
                            var8_7 = v17;
                            try {
                                if (var1_10 != null) break;
                                if (var1_10 != null) continue;
                                break;
                            }
                            catch (RuntimeException v19) {
                                throw zb_0.a(v19);
                            }
                        }
                        v14 = var12_12 = var2_1 - 1;
                    }
                    while (var12_12 >= var4_3) {
                        block52: {
                            block53: {
                                block51: {
                                    v12 = var10_8[var12_12] & zb_0.a(4101, 3170561948624570528L);
                                    if (var1_10 == null) continue block36;
                                    try {
                                        if (var1_10 == null) break block51;
                                        if (v12 != 0) {
                                        }
                                        ** GOTO lbl143
                                    }
                                    catch (RuntimeException v20) {
                                        throw zb_0.a(v20);
                                    }
                                    var4_3 = var12_12;
                                    v21 = var11_11;
                                }
                                try {
                                    if (var1_10 == null) break block52;
                                    if (v21 >= var7_6) break block53;
                                }
                                catch (RuntimeException v22) {
                                    throw zb_0.a(v22);
                                }
                                var7_6 = var11_11;
                            }
                            v21 = 1;
                        }
                        var8_7 = v21;
                        try {
                            if (var1_10 != null) break;
lbl143:
                            // 2 sources

                            --var12_12;
                            if (var1_10 != null) continue;
                            break;
                        }
                        catch (RuntimeException v23) {
                            throw zb_0.a(v23);
                        }
                    }
                    ++var11_11;
                    if (var1_10 != null) continue block35;
                }
                break;
            }
            v13 = var8_7;
        }
        try {
            if (v13 != 0) {
                return new Rectangle(var6_5, var7_6, var4_3 - var6_5 + 1, var5_4 - var7_6 + 1);
            }
        }
        catch (RuntimeException v24) {
            throw zb_0.a(v24);
        }
        return null;
    }

    public static void g(Raster raster, WritableRaster writableRaster, Raster raster2) {
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
            block5: {
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
                    try {
                        nArray3[n15] = (int)(f10 * (float)n16 + f11 * (float)n17);
                        nArray3[n15 + 1] = (int)(f10 * (float)n18 + f11 * (float)n19);
                        nArray3[n15 + 2] = (int)(f10 * (float)n20 + f11 * (float)n21);
                        nArray3[n15 + 3] = (int)(f10 * (float)n22 + f11 * (float)n23);
                        n15 += 4;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw zb_0.a(runtimeException);
                    }
                }
                writableRaster.setPixels(n10, n11, n12, 1, nArray3);
                ++n11;
                ++n14;
            }
            if (stringArray != null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int[] Z(BufferedImage bufferedImage, int n10, int n11, int n12, int n13, int[] nArray) {
        int n14;
        int n15;
        block6: {
            int n16 = bufferedImage.getType();
            String[] stringArray = W5.q();
            try {
                try {
                    n15 = n16;
                    n14 = 2;
                    if (stringArray == null) break block6;
                    if (n15 == n14) return (int[])bufferedImage.getRaster().getDataElements(n10, n11, n12, n13, nArray);
                }
                catch (RuntimeException runtimeException) {
                    throw zb_0.a(runtimeException);
                }
                n15 = n16;
                n14 = 1;
            }
            catch (RuntimeException runtimeException) {
                throw zb_0.a(runtimeException);
            }
        }
        try {
            if (n15 != n14) return bufferedImage.getRGB(n10, n11, n12, n13, nArray, 0, n12);
            return (int[])bufferedImage.getRaster().getDataElements(n10, n11, n12, n13, nArray);
        }
        catch (RuntimeException runtimeException) {
            throw zb_0.a(runtimeException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void u(BufferedImage var0, int var1_1, int var2_2, int var3_3, int var4_4, int[] var5_5) {
        block12: {
            block10: {
                var7_6 = var0.getType();
                var6_7 = W5.q();
                try {
                    block11: {
                        try {
                            try {
                                if (var6_7 == null) break block10;
                                if (var7_6 == 2) break block11;
                            }
                            catch (RuntimeException v0) {
                                throw zb_0.a(v0);
                            }
                            if (var7_6 == 1) {
                            }
                            ** GOTO lbl24
                        }
                        catch (RuntimeException v1) {
                            throw zb_0.a(v1);
                        }
                    }
                    var0.getRaster().setDataElements(var1_1, var2_2, var3_3, var4_4, var5_5);
                }
                catch (RuntimeException v2) {
                    throw zb_0.a(v2);
                }
            }
            try {
                if (var6_7 != null) break block12;
lbl24:
                // 2 sources

                var0.setRGB(var1_1, var2_2, var3_3, var4_4, var5_5, 0, var3_3);
            }
            catch (RuntimeException v3) {
                throw zb_0.a(v3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\u00b9\u00e96\u008d(\u00b5M\u0089l\u009b\b\u009a\u00aa\u00f2\t\u0019\u00d7m\u00a2\u0017\u00d6\u00f3\u00db\u00ce\u0095\u00dd\u00fa\u0084\u009a:\u00d6\u00aeyxa\u00d2\u00a4\u00f6\u001b=+\u00c2\u00e0\u0011O\u009a\u00e8\u00e3\u00f3x60\u0003\u00ac\u00e5|\u0013>\u00a7\u008f\u00ba";
                    var12_3 = "\u00b9\u00e96\u008d(\u00b5M\u0089l\u009b\b\u009a\u00aa\u00f2\t\u0019\u00d7m\u00a2\u0017\u00d6\u00f3\u00db\u00ce\u0095\u00dd\u00fa\u0084\u009a:\u00d6\u00aeyxa\u00d2\u00a4\u00f6\u001b=+\u00c2\u00e0\u0011O\u009a\u00e8\u00e3\u00f3x60\u0003\u00ac\u00e5|\u0013>\u00a7\u008f\u00ba".length();
                    var9_4 = 19;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 14;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 116;
                                    break;
                                }
                                case 1: {
                                    v11 = 85;
                                    break;
                                }
                                case 2: {
                                    v11 = 65;
                                    break;
                                }
                                case 3: {
                                    v11 = 114;
                                    break;
                                }
                                case 4: {
                                    v11 = 33;
                                    break;
                                }
                                case 5: {
                                    v11 = 46;
                                    break;
                                }
                                default: {
                                    v11 = 12;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                zb_0.a = var13;
                zb_0.b = new String[3];
                var0_7 = 76515271408208940L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = "\u009b\u00ac\u00d8N\u00fb4A\u00b7\u008cB\u00fde%\u000e\u0084\u008c\u000f\u00ab\u0089\u00f3\u0099=fz!\u0082\u0080z}\u0084d\"9H\u008f\u00f2\u0097\u00d4wG";
                var5_11 = "\u009b\u00ac\u00d8N\u00fb4A\u00b7\u008cB\u00fde%\u000e\u0084\u008c\u000f\u00ab\u0089\u00f3\u0099=fz!\u0082\u0080z}\u0084d\"9H\u008f\u00f2\u0097\u00d4wG".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00c7[:\u0094\u008d#\bwm\u00fb\u00aaUA\u00f0\u0088\u00d8";
                    var5_11 = "\u00c7[:\u0094\u008d#\bwm\u00fb\u00aaUA\u00f0\u0088\u00d8".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        zb_0.c = var6_8;
        zb_0.d = new Integer[7];
        zb_0.I = null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFEA49) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 137;
                    break;
                }
                case 1: {
                    n14 = 60;
                    break;
                }
                case 2: {
                    n14 = 236;
                    break;
                }
                case 3: {
                    n14 = 15;
                    break;
                }
                case 4: {
                    n14 = 222;
                    break;
                }
                case 5: {
                    n14 = 99;
                    break;
                }
                case 6: {
                    n14 = 153;
                    break;
                }
                case 7: {
                    n14 = 27;
                    break;
                }
                case 8: {
                    n14 = 90;
                    break;
                }
                case 9: {
                    n14 = 164;
                    break;
                }
                case 10: {
                    n14 = 105;
                    break;
                }
                case 11: {
                    n14 = 96;
                    break;
                }
                case 12: {
                    n14 = 37;
                    break;
                }
                case 13: {
                    n14 = 170;
                    break;
                }
                case 14: {
                    n14 = 70;
                    break;
                }
                case 15: {
                    n14 = 116;
                    break;
                }
                case 16: {
                    n14 = 221;
                    break;
                }
                case 17: {
                    n14 = 126;
                    break;
                }
                case 18: {
                    n14 = 24;
                    break;
                }
                case 19: {
                    n14 = 74;
                    break;
                }
                case 20: {
                    n14 = 231;
                    break;
                }
                case 21: {
                    n14 = 19;
                    break;
                }
                case 22: {
                    n14 = 218;
                    break;
                }
                case 23: {
                    n14 = 30;
                    break;
                }
                case 24: {
                    n14 = 39;
                    break;
                }
                case 25: {
                    n14 = 26;
                    break;
                }
                case 26: {
                    n14 = 25;
                    break;
                }
                case 27: {
                    n14 = 243;
                    break;
                }
                case 28: {
                    n14 = 8;
                    break;
                }
                case 29: {
                    n14 = 185;
                    break;
                }
                case 30: {
                    n14 = 38;
                    break;
                }
                case 31: {
                    n14 = 157;
                    break;
                }
                case 32: {
                    n14 = 192;
                    break;
                }
                case 33: {
                    n14 = 62;
                    break;
                }
                case 34: {
                    n14 = 232;
                    break;
                }
                case 35: {
                    n14 = 67;
                    break;
                }
                case 36: {
                    n14 = 2;
                    break;
                }
                case 37: {
                    n14 = 178;
                    break;
                }
                case 38: {
                    n14 = 40;
                    break;
                }
                case 39: {
                    n14 = 51;
                    break;
                }
                case 40: {
                    n14 = 205;
                    break;
                }
                case 41: {
                    n14 = 87;
                    break;
                }
                case 42: {
                    n14 = 31;
                    break;
                }
                case 43: {
                    n14 = 112;
                    break;
                }
                case 44: {
                    n14 = 6;
                    break;
                }
                case 45: {
                    n14 = 59;
                    break;
                }
                case 46: {
                    n14 = 143;
                    break;
                }
                case 47: {
                    n14 = 63;
                    break;
                }
                case 48: {
                    n14 = 53;
                    break;
                }
                case 49: {
                    n14 = 36;
                    break;
                }
                case 50: {
                    n14 = 135;
                    break;
                }
                case 51: {
                    n14 = 201;
                    break;
                }
                case 52: {
                    n14 = 41;
                    break;
                }
                case 53: {
                    n14 = 234;
                    break;
                }
                case 54: {
                    n14 = 175;
                    break;
                }
                case 55: {
                    n14 = 131;
                    break;
                }
                case 56: {
                    n14 = 233;
                    break;
                }
                case 57: {
                    n14 = 100;
                    break;
                }
                case 58: {
                    n14 = 188;
                    break;
                }
                case 59: {
                    n14 = 5;
                    break;
                }
                case 60: {
                    n14 = 152;
                    break;
                }
                case 61: {
                    n14 = 238;
                    break;
                }
                case 62: {
                    n14 = 228;
                    break;
                }
                case 63: {
                    n14 = 216;
                    break;
                }
                case 64: {
                    n14 = 187;
                    break;
                }
                case 65: {
                    n14 = 88;
                    break;
                }
                case 66: {
                    n14 = 77;
                    break;
                }
                case 67: {
                    n14 = 14;
                    break;
                }
                case 68: {
                    n14 = 194;
                    break;
                }
                case 69: {
                    n14 = 246;
                    break;
                }
                case 70: {
                    n14 = 110;
                    break;
                }
                case 71: {
                    n14 = 179;
                    break;
                }
                case 72: {
                    n14 = 119;
                    break;
                }
                case 73: {
                    n14 = 203;
                    break;
                }
                case 74: {
                    n14 = 202;
                    break;
                }
                case 75: {
                    n14 = 48;
                    break;
                }
                case 76: {
                    n14 = 145;
                    break;
                }
                case 77: {
                    n14 = 206;
                    break;
                }
                case 78: {
                    n14 = 165;
                    break;
                }
                case 79: {
                    n14 = 16;
                    break;
                }
                case 80: {
                    n14 = 211;
                    break;
                }
                case 81: {
                    n14 = 226;
                    break;
                }
                case 82: {
                    n14 = 235;
                    break;
                }
                case 83: {
                    n14 = 49;
                    break;
                }
                case 84: {
                    n14 = 47;
                    break;
                }
                case 85: {
                    n14 = 245;
                    break;
                }
                case 86: {
                    n14 = 125;
                    break;
                }
                case 87: {
                    n14 = 12;
                    break;
                }
                case 88: {
                    n14 = 29;
                    break;
                }
                case 89: {
                    n14 = 71;
                    break;
                }
                case 90: {
                    n14 = 18;
                    break;
                }
                case 91: {
                    n14 = 224;
                    break;
                }
                case 92: {
                    n14 = 161;
                    break;
                }
                case 93: {
                    n14 = 197;
                    break;
                }
                case 94: {
                    n14 = 84;
                    break;
                }
                case 95: {
                    n14 = 229;
                    break;
                }
                case 96: {
                    n14 = 160;
                    break;
                }
                case 97: {
                    n14 = 0;
                    break;
                }
                case 98: {
                    n14 = 81;
                    break;
                }
                case 99: {
                    n14 = 120;
                    break;
                }
                case 100: {
                    n14 = 52;
                    break;
                }
                case 101: {
                    n14 = 241;
                    break;
                }
                case 102: {
                    n14 = 109;
                    break;
                }
                case 103: {
                    n14 = 1;
                    break;
                }
                case 104: {
                    n14 = 66;
                    break;
                }
                case 105: {
                    n14 = 176;
                    break;
                }
                case 106: {
                    n14 = 89;
                    break;
                }
                case 107: {
                    n14 = 28;
                    break;
                }
                case 108: {
                    n14 = 73;
                    break;
                }
                case 109: {
                    n14 = 121;
                    break;
                }
                case 110: {
                    n14 = 138;
                    break;
                }
                case 111: {
                    n14 = 210;
                    break;
                }
                case 112: {
                    n14 = 34;
                    break;
                }
                case 113: {
                    n14 = 130;
                    break;
                }
                case 114: {
                    n14 = 166;
                    break;
                }
                case 115: {
                    n14 = 72;
                    break;
                }
                case 116: {
                    n14 = 108;
                    break;
                }
                case 117: {
                    n14 = 151;
                    break;
                }
                case 118: {
                    n14 = 68;
                    break;
                }
                case 119: {
                    n14 = 114;
                    break;
                }
                case 120: {
                    n14 = 78;
                    break;
                }
                case 121: {
                    n14 = 177;
                    break;
                }
                case 122: {
                    n14 = 168;
                    break;
                }
                case 123: {
                    n14 = 128;
                    break;
                }
                case 124: {
                    n14 = 42;
                    break;
                }
                case 125: {
                    n14 = 46;
                    break;
                }
                case 126: {
                    n14 = 75;
                    break;
                }
                case 127: {
                    n14 = 223;
                    break;
                }
                case 128: {
                    n14 = 65;
                    break;
                }
                case 129: {
                    n14 = 124;
                    break;
                }
                case 130: {
                    n14 = 55;
                    break;
                }
                case 131: {
                    n14 = 239;
                    break;
                }
                case 132: {
                    n14 = 227;
                    break;
                }
                case 133: {
                    n14 = 33;
                    break;
                }
                case 134: {
                    n14 = 94;
                    break;
                }
                case 135: {
                    n14 = 163;
                    break;
                }
                case 136: {
                    n14 = 252;
                    break;
                }
                case 137: {
                    n14 = 254;
                    break;
                }
                case 138: {
                    n14 = 191;
                    break;
                }
                case 139: {
                    n14 = 182;
                    break;
                }
                case 140: {
                    n14 = 230;
                    break;
                }
                case 141: {
                    n14 = 69;
                    break;
                }
                case 142: {
                    n14 = 171;
                    break;
                }
                case 143: {
                    n14 = 156;
                    break;
                }
                case 144: {
                    n14 = 4;
                    break;
                }
                case 145: {
                    n14 = 186;
                    break;
                }
                case 146: {
                    n14 = 214;
                    break;
                }
                case 147: {
                    n14 = 204;
                    break;
                }
                case 148: {
                    n14 = 195;
                    break;
                }
                case 149: {
                    n14 = 154;
                    break;
                }
                case 150: {
                    n14 = 217;
                    break;
                }
                case 151: {
                    n14 = 180;
                    break;
                }
                case 152: {
                    n14 = 219;
                    break;
                }
                case 153: {
                    n14 = 129;
                    break;
                }
                case 154: {
                    n14 = 80;
                    break;
                }
                case 155: {
                    n14 = 251;
                    break;
                }
                case 156: {
                    n14 = 23;
                    break;
                }
                case 157: {
                    n14 = 184;
                    break;
                }
                case 158: {
                    n14 = 140;
                    break;
                }
                case 159: {
                    n14 = 142;
                    break;
                }
                case 160: {
                    n14 = 244;
                    break;
                }
                case 161: {
                    n14 = 117;
                    break;
                }
                case 162: {
                    n14 = 9;
                    break;
                }
                case 163: {
                    n14 = 10;
                    break;
                }
                case 164: {
                    n14 = 213;
                    break;
                }
                case 165: {
                    n14 = 248;
                    break;
                }
                case 166: {
                    n14 = 101;
                    break;
                }
                case 167: {
                    n14 = 3;
                    break;
                }
                case 168: {
                    n14 = 122;
                    break;
                }
                case 169: {
                    n14 = 220;
                    break;
                }
                case 170: {
                    n14 = 133;
                    break;
                }
                case 171: {
                    n14 = 95;
                    break;
                }
                case 172: {
                    n14 = 174;
                    break;
                }
                case 173: {
                    n14 = 189;
                    break;
                }
                case 174: {
                    n14 = 255;
                    break;
                }
                case 175: {
                    n14 = 21;
                    break;
                }
                case 176: {
                    n14 = 13;
                    break;
                }
                case 177: {
                    n14 = 57;
                    break;
                }
                case 178: {
                    n14 = 93;
                    break;
                }
                case 179: {
                    n14 = 144;
                    break;
                }
                case 180: {
                    n14 = 172;
                    break;
                }
                case 181: {
                    n14 = 237;
                    break;
                }
                case 182: {
                    n14 = 225;
                    break;
                }
                case 183: {
                    n14 = 198;
                    break;
                }
                case 184: {
                    n14 = 107;
                    break;
                }
                case 185: {
                    n14 = 17;
                    break;
                }
                case 186: {
                    n14 = 97;
                    break;
                }
                case 187: {
                    n14 = 247;
                    break;
                }
                case 188: {
                    n14 = 181;
                    break;
                }
                case 189: {
                    n14 = 111;
                    break;
                }
                case 190: {
                    n14 = 139;
                    break;
                }
                case 191: {
                    n14 = 209;
                    break;
                }
                case 192: {
                    n14 = 20;
                    break;
                }
                case 193: {
                    n14 = 127;
                    break;
                }
                case 194: {
                    n14 = 45;
                    break;
                }
                case 195: {
                    n14 = 104;
                    break;
                }
                case 196: {
                    n14 = 102;
                    break;
                }
                case 197: {
                    n14 = 58;
                    break;
                }
                case 198: {
                    n14 = 158;
                    break;
                }
                case 199: {
                    n14 = 35;
                    break;
                }
                case 200: {
                    n14 = 208;
                    break;
                }
                case 201: {
                    n14 = 7;
                    break;
                }
                case 202: {
                    n14 = 106;
                    break;
                }
                case 203: {
                    n14 = 123;
                    break;
                }
                case 204: {
                    n14 = 249;
                    break;
                }
                case 205: {
                    n14 = 190;
                    break;
                }
                case 206: {
                    n14 = 91;
                    break;
                }
                case 207: {
                    n14 = 200;
                    break;
                }
                case 208: {
                    n14 = 44;
                    break;
                }
                case 209: {
                    n14 = 150;
                    break;
                }
                case 210: {
                    n14 = 242;
                    break;
                }
                case 211: {
                    n14 = 173;
                    break;
                }
                case 212: {
                    n14 = 50;
                    break;
                }
                case 213: {
                    n14 = 196;
                    break;
                }
                case 214: {
                    n14 = 85;
                    break;
                }
                case 215: {
                    n14 = 193;
                    break;
                }
                case 216: {
                    n14 = 61;
                    break;
                }
                case 217: {
                    n14 = 250;
                    break;
                }
                case 218: {
                    n14 = 167;
                    break;
                }
                case 219: {
                    n14 = 134;
                    break;
                }
                case 220: {
                    n14 = 155;
                    break;
                }
                case 221: {
                    n14 = 98;
                    break;
                }
                case 222: {
                    n14 = 32;
                    break;
                }
                case 223: {
                    n14 = 253;
                    break;
                }
                case 224: {
                    n14 = 159;
                    break;
                }
                case 225: {
                    n14 = 147;
                    break;
                }
                case 226: {
                    n14 = 103;
                    break;
                }
                case 227: {
                    n14 = 54;
                    break;
                }
                case 228: {
                    n14 = 86;
                    break;
                }
                case 229: {
                    n14 = 113;
                    break;
                }
                case 230: {
                    n14 = 11;
                    break;
                }
                case 231: {
                    n14 = 83;
                    break;
                }
                case 232: {
                    n14 = 146;
                    break;
                }
                case 233: {
                    n14 = 183;
                    break;
                }
                case 234: {
                    n14 = 207;
                    break;
                }
                case 235: {
                    n14 = 64;
                    break;
                }
                case 236: {
                    n14 = 43;
                    break;
                }
                case 237: {
                    n14 = 212;
                    break;
                }
                case 238: {
                    n14 = 115;
                    break;
                }
                case 239: {
                    n14 = 92;
                    break;
                }
                case 240: {
                    n14 = 148;
                    break;
                }
                case 241: {
                    n14 = 76;
                    break;
                }
                case 242: {
                    n14 = 199;
                    break;
                }
                case 243: {
                    n14 = 132;
                    break;
                }
                case 244: {
                    n14 = 149;
                    break;
                }
                case 245: {
                    n14 = 136;
                    break;
                }
                case 246: {
                    n14 = 169;
                    break;
                }
                case 247: {
                    n14 = 141;
                    break;
                }
                case 248: {
                    n14 = 162;
                    break;
                }
                case 249: {
                    n14 = 215;
                    break;
                }
                case 250: {
                    n14 = 240;
                    break;
                }
                case 251: {
                    n14 = 79;
                    break;
                }
                case 252: {
                    n14 = 82;
                    break;
                }
                case 253: {
                    n14 = 56;
                    break;
                }
                case 254: {
                    n14 = 22;
                    break;
                }
                default: {
                    n14 = 118;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            zb_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x58A4;
        if (d[n11] == null) {
            zb_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

