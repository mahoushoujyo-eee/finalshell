/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DE;
import com.FV;
import com.GO;
import com.LE;
import com.RV;
import com.cz_0;
import com.mortennobel.imagescaling.ResampleOp;
import com.ne_1;
import com.oa_2;
import com.wx_0;
import com.zf_0;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LinearGradientPaint;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Xg
 */
public final class xg_0 {
    private static final Map Z;
    private static final Map l;
    public static final ImageIcon C;
    public static final ImageIcon z;
    private static final Map g;
    private static final Map E;
    private static final Map S;
    private static final Map k;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static boolean V(BufferedImage bufferedImage, int n10, int n11) {
        String string = FV.D();
        boolean bl = bufferedImage.getRGB(n10, n11) >> xg_0.a(14003, 7425200876588139692L) & xg_0.a(15643, 8247608782124551944L);
        if (string == null) {
            bl = bl > false;
        }
        return bl;
    }

    public static BufferedImage P(int n10, int n11) {
        return wx_0.S().createCompatibleImage(n10, n11);
    }

    public static BufferedImage g(int n10, int n11, int n12) {
        return wx_0.S().createCompatibleImage(n10, n11, n12);
    }

    public static BufferedImage c(BufferedImage bufferedImage) {
        return xg_0.o(bufferedImage, bufferedImage.getWidth(), bufferedImage.getHeight());
    }

    public static BufferedImage m(BufferedImage bufferedImage, int n10) {
        return xg_0.g(bufferedImage.getWidth(), bufferedImage.getHeight(), n10);
    }

    public static BufferedImage o(BufferedImage bufferedImage, int n10, int n11) {
        return xg_0.g(n10, n11, bufferedImage.getTransparency());
    }

    public static BufferedImage f(URL uRL) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(uRL);
        return xg_0.v(bufferedImage);
    }

    public static BufferedImage v(BufferedImage bufferedImage) {
        String string = FV.D();
        BufferedImage bufferedImage2 = bufferedImage;
        if (string == null) {
            if (xg_0.A(bufferedImage2)) {
                return bufferedImage;
            }
            bufferedImage2 = wx_0.S().createCompatibleImage(bufferedImage.getWidth(), bufferedImage.getHeight(), bufferedImage.getTransparency());
        }
        BufferedImage bufferedImage3 = bufferedImage2;
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage3;
    }

    public static boolean A(BufferedImage bufferedImage) {
        return bufferedImage.getColorModel().equals(wx_0.S().getColorModel());
    }

    public static ImageIcon b(Shape shape, ImageIcon imageIcon) {
        return new ImageIcon(xg_0.A(shape, imageIcon.getImage()));
    }

    public static BufferedImage A(Shape shape, Image image) {
        int n10 = image.getWidth(null);
        int n11 = image.getHeight(null);
        BufferedImage bufferedImage = xg_0.g(n10, n11, 3);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        RV.X(graphics2D);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fill(shape);
        graphics2D.setComposite(AlphaComposite.getInstance(5));
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static List i(List list) {
        ArrayList<Image> arrayList;
        block2: {
            ArrayList<Image> arrayList2 = new ArrayList<Image>(list.size());
            Iterator iterator = list.iterator();
            String string = FV.D();
            while (iterator.hasNext()) {
                ImageIcon imageIcon = (ImageIcon)iterator.next();
                arrayList = arrayList2;
                if (string == null) {
                    arrayList.add(imageIcon.getImage());
                    if (string == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static ImageIcon z(List list) {
        return xg_0.Z(0, list);
    }

    /*
     * Unable to fully structure code
     */
    public static ImageIcon Z(int var0, List var1_1) {
        block6: {
            block9: {
                block10: {
                    block8: {
                        block7: {
                            var2_2 = FV.D();
                            v0 = var1_1;
                            if (var2_2 != null) break block7;
                            if (v0 == null) break block8;
                            v0 = var1_1;
                        }
                        v1 = v0.size();
                        if (var2_2 != null) break block9;
                        if (v1 != 0) break block10;
                    }
                    return null;
                }
                v1 = var1_1.size();
            }
            var3_3 = new Image[v1];
            var4_4 = 0;
            for (ImageIcon v2 : var1_1) {
                if (var2_2 != null) break block6;
                v3 = var6_6 = v2;
                if (var2_2 != null) ** GOTO lbl23
                if (v3 != null) {
                    v3 = var6_6;
lbl23:
                    // 2 sources

                    v4 = v3.getImage();
                } else {
                    v4 = null;
                }
                var3_3[var4_4] = v4;
                ++var4_4;
                if (var2_2 == null) continue;
            }
            v2 = new ImageIcon(xg_0.k(var0, var3_3));
        }
        return v2;
    }

    public static ImageIcon o(ImageIcon[] imageIconArray) {
        return xg_0.w(0, imageIconArray);
    }

    /*
     * Unable to fully structure code
     */
    public static ImageIcon w(int var0, ImageIcon[] var1_1) {
        block6: {
            block9: {
                block10: {
                    block8: {
                        block7: {
                            var2_2 = FV.D();
                            v0 = var1_1;
                            if (var2_2 != null) break block7;
                            if (v0 == null) break block8;
                            v0 = var1_1;
                        }
                        v1 = v0.length;
                        if (var2_2 != null) break block9;
                        if (v1 != 0) break block10;
                    }
                    return null;
                }
                v1 = var1_1.length;
            }
            var3_3 = new Image[v1];
            var4_4 = 0;
            for (ImageIcon v2 : var1_1) {
                if (var2_2 != null) break block6;
                v3 = var8_8 = v2;
                if (var2_2 != null) ** GOTO lbl23
                if (v3 != null) {
                    v3 = var8_8;
lbl23:
                    // 2 sources

                    v4 = v3.getImage();
                } else {
                    v4 = null;
                }
                var3_3[var4_4] = v4;
                ++var4_4;
                if (var2_2 == null) continue;
            }
            v2 = new ImageIcon(xg_0.k(var0, var3_3));
        }
        return v2;
    }

    public static BufferedImage P(Image[] imageArray) {
        return xg_0.k(0, imageArray);
    }

    public static BufferedImage k(int n10, Image[] imageArray) {
        Object object;
        block17: {
            int n11;
            Image[] imageArray2;
            int n12;
            Dimension dimension;
            String string;
            block23: {
                block24: {
                    block22: {
                        block21: {
                            block16: {
                                block20: {
                                    block19: {
                                        Image[] imageArray3;
                                        block18: {
                                            string = FV.D();
                                            imageArray3 = imageArray;
                                            if (string != null) break block18;
                                            if (imageArray3 == null) break block19;
                                            imageArray3 = imageArray;
                                        }
                                        if (imageArray3.length != 0) break block20;
                                    }
                                    return null;
                                }
                                dimension = new Dimension(0, 0);
                                object = imageArray;
                                int n13 = ((Image[])object).length;
                                n12 = 0;
                                while (n12 < n13) {
                                    imageArray2 = object[n12];
                                    if (string == null) {
                                        if (string == null) {
                                            if (imageArray2 != null) {
                                                dimension.width = dimension.width + imageArray2.getWidth(null) + n10;
                                                dimension.height = Math.max(dimension.height, imageArray2.getHeight(null));
                                            }
                                            ++n12;
                                        }
                                        if (string == null) continue;
                                    }
                                    break block16;
                                }
                                dimension.width -= n10;
                            }
                            n11 = dimension.width;
                            if (string != null) break block21;
                            if (n11 <= 0) break block22;
                            n11 = dimension.height;
                        }
                        if (string != null) break block23;
                        if (n11 > 0) break block24;
                    }
                    return null;
                }
                n11 = dimension.width;
            }
            object = xg_0.g(n11, dimension.height, 3);
            Graphics2D graphics2D = ((BufferedImage)object).createGraphics();
            n12 = 0;
            imageArray2 = imageArray;
            int n14 = imageArray2.length;
            int n15 = 0;
            while (n15 < n14) {
                Image image = imageArray2[n15];
                if (string == null) {
                    if (string == null) {
                        if (image != null) {
                            graphics2D.drawImage(image, n12, 0, null);
                            n12 += image.getWidth(null) + n10;
                        }
                        ++n15;
                    }
                    if (string == null) continue;
                }
                break block17;
            }
            graphics2D.dispose();
        }
        return object;
    }

    public static void s() {
        Z.clear();
    }

    public static ImageIcon G(List list) {
        return xg_0.E(null, list);
    }

    /*
     * Unable to fully structure code
     */
    public static ImageIcon E(String var0, List var1_1) {
        block12: {
            block17: {
                block18: {
                    block16: {
                        block15: {
                            block13: {
                                block14: {
                                    var2_2 = FV.D();
                                    if (var0 == null) break block13;
                                    v0 = xg_0.Z;
                                    v1 = var0;
                                    if (var2_2 != null) break block14;
                                    if (!v0.containsKey(v1)) break block13;
                                    v0 = xg_0.Z;
                                    v1 = var0;
                                }
                                return (ImageIcon)v0.get(v1);
                            }
                            v2 = var1_1;
                            if (var2_2 != null) break block15;
                            if (v2 == null) break block16;
                            v2 = var1_1;
                        }
                        v3 = v2.size();
                        if (var2_2 != null) break block17;
                        if (v3 != 0) break block18;
                    }
                    return null;
                }
                v3 = var1_1.size();
            }
            if (var2_2 == null) {
                if (v3 == 1) {
                    return (ImageIcon)var1_1.get(0);
                }
                v3 = var1_1.size();
            }
            var3_3 = new Image[v3];
            var4_4 = 0;
            for (ImageIcon v4 : var1_1) {
                if (var2_2 != null) break block12;
                v5 = var6_6 = v4;
                if (var2_2 != null) ** GOTO lbl37
                if (v5 != null) {
                    v5 = var6_6;
lbl37:
                    // 2 sources

                    v6 = v5.getImage();
                } else {
                    v6 = null;
                }
                var3_3[var4_4] = v6;
                ++var4_4;
                if (var2_2 == null) continue;
            }
            v4 = new ImageIcon(xg_0.G(var3_3));
        }
        var5_5 = v4;
        v7 = var0;
        if (var2_2 == null && v7 != null) {
            v7 = xg_0.Z.put(var0, var5_5);
        }
        return var5_5;
    }

    public static ImageIcon I(ImageIcon[] imageIconArray) {
        return xg_0.U(null, imageIconArray);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public static ImageIcon U(String var0, ImageIcon[] var1_1) {
        block12: {
            block17: {
                block18: {
                    block16: {
                        block15: {
                            block13: {
                                block14: {
                                    var2_2 = FV.D();
                                    if (var0 == null) break block13;
                                    v0 = xg_0.Z;
                                    v1 = var0;
                                    if (var2_2 != null) break block14;
                                    if (!v0.containsKey(v1)) break block13;
                                    v0 = xg_0.Z;
                                    v1 = var0;
                                }
                                return (ImageIcon)v0.get(v1);
                            }
                            v2 = var1_1;
                            if (var2_2 != null) break block15;
                            if (v2 == null) break block16;
                            v2 = var1_1;
                        }
                        v3 = v2.length;
                        if (var2_2 != null) break block17;
                        if (v3 != 0) break block18;
                    }
                    return null;
                }
                v3 = var1_1.length;
            }
            if (var2_2 == null) {
                if (v3 == 1) {
                    return var1_1[0];
                }
                v3 = var1_1.length;
            }
            var3_3 = new Image[v3];
            var4_4 = 0;
            for (ImageIcon v4 : var1_1) {
                if (var2_2 != null) break block12;
                v5 = var8_8 = v4;
                if (var2_2 != null) ** GOTO lbl37
                if (v5 != null) {
                    v5 = var8_8;
lbl37:
                    // 2 sources

                    v6 = v5.getImage();
                } else {
                    v6 = null;
                }
                var3_3[var4_4] = v6;
                ++var4_4;
                if (var2_2 == null) continue;
            }
            v4 = new ImageIcon(xg_0.G(var3_3));
        }
        var5_5 /* !! */  = v4;
        v7 = var0;
        if (var2_2 == null && v7 != null) {
            v7 = xg_0.Z.put(var0, var5_5 /* !! */ );
        }
        return var5_5 /* !! */ ;
    }

    public static void G() {
        l.clear();
    }

    public static BufferedImage G(Image[] imageArray) {
        return xg_0.I(null, imageArray);
    }

    public static BufferedImage I(String string, Image[] imageArray) {
        Object object;
        block31: {
            Object object2;
            int n10;
            Dimension dimension;
            String string2;
            block41: {
                block42: {
                    block30: {
                        block40: {
                            block39: {
                                Image[] imageArray2;
                                block38: {
                                    int n11;
                                    block36: {
                                        block37: {
                                            block35: {
                                                Image[] imageArray3;
                                                block34: {
                                                    block32: {
                                                        String string3;
                                                        Map map;
                                                        block33: {
                                                            string2 = FV.D();
                                                            if (string == null) break block32;
                                                            map = l;
                                                            string3 = string;
                                                            if (string2 != null) break block33;
                                                            if (!map.containsKey(string3)) break block32;
                                                            map = l;
                                                            string3 = string;
                                                        }
                                                        return (BufferedImage)map.get(string3);
                                                    }
                                                    imageArray3 = imageArray;
                                                    if (string2 != null) break block34;
                                                    if (imageArray3 == null) break block35;
                                                    imageArray3 = imageArray;
                                                }
                                                n11 = imageArray3.length;
                                                if (string2 != null) break block36;
                                                if (n11 != 0) break block37;
                                            }
                                            return null;
                                        }
                                        imageArray2 = imageArray;
                                        if (string2 != null) break block38;
                                        n11 = imageArray2.length;
                                    }
                                    if (n11 != 1) break block39;
                                    imageArray2 = imageArray;
                                }
                                return xg_0.v(imageArray2[0]);
                            }
                            dimension = new Dimension(0, 0);
                            object = imageArray;
                            int n12 = ((Image[])object).length;
                            int n13 = 0;
                            while (n13 < n12) {
                                Image image = object[n13];
                                if (string2 == null) {
                                    if (string2 == null) {
                                        if (image != null) {
                                            dimension.width = Math.max(dimension.width, image.getWidth(null));
                                            dimension.height = Math.max(dimension.height, image.getHeight(null));
                                        }
                                        ++n13;
                                    }
                                    if (string2 == null) continue;
                                }
                                break block30;
                            }
                            n10 = dimension.width;
                            if (string2 != null) break block40;
                            if (n10 <= 0) break block30;
                            n10 = dimension.height;
                        }
                        if (string2 != null) break block41;
                        if (n10 > 0) break block42;
                    }
                    return null;
                }
                n10 = dimension.width;
            }
            object = xg_0.g(n10, dimension.height, 3);
            Graphics2D graphics2D = ((BufferedImage)object).createGraphics();
            Image[] imageArray4 = imageArray;
            int n14 = imageArray4.length;
            int n15 = 0;
            while (n15 < n14) {
                Image image = imageArray4[n15];
                if (string2 == null) {
                    object2 = image;
                    if (string2 != null) break block31;
                    if (object2 != null) {
                        graphics2D.drawImage(image, 0, 0, null);
                    }
                    ++n15;
                }
                if (string2 == null) continue;
            }
            graphics2D.dispose();
            object2 = string;
            if (string2 == null && object2 != null) {
                object2 = l.put(string, object);
            }
        }
        return object;
    }

    public static BufferedImage L(String string) {
        return xg_0.a(new File(string));
    }

    public static BufferedImage a(File file) {
        try {
            return ImageIO.read(file);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static ImageIcon a(URL uRL) {
        try {
            return new ImageIcon(uRL);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static ImageIcon Z(Class clazz, String string) {
        try {
            return new ImageIcon(clazz.getResource(string));
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static ImageIcon U(InputStream inputStream) {
        try {
            return new ImageIcon(ImageIO.read(inputStream));
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static ImageIcon l(ImageIcon imageIcon, Color color) {
        return new ImageIcon(xg_0.l(xg_0.Z(imageIcon), color));
    }

    public static BufferedImage l(BufferedImage bufferedImage, Color color) {
        BufferedImage bufferedImage2 = xg_0.c(bufferedImage);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setPaint(color);
        graphics2D.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static ImageIcon i(ImageIcon imageIcon, int n10, int n11) {
        return new ImageIcon(xg_0.g(xg_0.Z(imageIcon), n10, n11));
    }

    public static BufferedImage g(BufferedImage bufferedImage, int n10, int n11) {
        BufferedImage bufferedImage2 = xg_0.o(bufferedImage, n10, n11);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawImage((Image)bufferedImage, n10 / 2 - bufferedImage.getWidth() / 2, n11 / 2 - bufferedImage.getHeight() / 2, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static ImageIcon U(ImageIcon imageIcon) {
        return new ImageIcon(xg_0.g(xg_0.Z(imageIcon)));
    }

    public static BufferedImage g(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = xg_0.g(bufferedImage.getHeight(), bufferedImage.getWidth(), 3);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.translate(bufferedImage.getHeight(), 0);
        graphics2D.rotate(1.5707963267948966);
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static ImageIcon h(ImageIcon imageIcon) {
        return new ImageIcon(xg_0.X(xg_0.Z(imageIcon)));
    }

    public static BufferedImage X(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = xg_0.g(bufferedImage.getHeight(), bufferedImage.getWidth(), 3);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.translate(0, bufferedImage.getWidth());
        graphics2D.rotate(-1.5707963267948966);
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static ImageIcon r(ImageIcon imageIcon) {
        return new ImageIcon(xg_0.F(xg_0.Z(imageIcon)));
    }

    public static BufferedImage F(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = xg_0.g(bufferedImage.getWidth(), bufferedImage.getHeight(), 3);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.translate(bufferedImage.getWidth(), bufferedImage.getHeight());
        graphics2D.rotate(Math.PI);
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static ImageIcon F(int n10, int n11) {
        return new ImageIcon(xg_0.a(n10, n11));
    }

    public static BufferedImage a(int n10, int n11) {
        return xg_0.g(n10, n11, 3);
    }

    public static ImageIcon l(Color color) {
        return xg_0.G(color, xg_0.a(5667, 1320727664616219698L), xg_0.a(5667, 1320727664616219698L));
    }

    public static ImageIcon G(Color color, int n10, int n11) {
        return new ImageIcon(xg_0.b(color, n10, n11));
    }

    public static BufferedImage E(Color color) {
        return xg_0.b(color, xg_0.a(5667, 1320727664616219698L), xg_0.a(5667, 1320727664616219698L));
    }

    public static BufferedImage b(Color color, int n10, int n11) {
        BufferedImage bufferedImage = xg_0.g(n10, n11, 3);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        RV.X(graphics2D);
        graphics2D.setPaint(Color.GRAY);
        graphics2D.drawRoundRect(0, 0, n10 - 1, n11 - 1, GO.Y, GO.FT);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.drawRoundRect(1, 1, n10 - 3, n11 - 3, GO.FT, GO.FT);
        graphics2D.setPaint(color);
        graphics2D.fillRoundRect(2, 2, n10 - 4, n11 - 4, GO.FT, GO.FT);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static ImageIcon L(Color color) {
        return new ImageIcon(xg_0.q(color));
    }

    public static BufferedImage q(Color color) {
        Color color2;
        Graphics2D graphics2D;
        BufferedImage bufferedImage;
        block6: {
            block7: {
                block5: {
                    String string;
                    block4: {
                        bufferedImage = xg_0.g(xg_0.a(5667, 1320727664616219698L), xg_0.a(5667, 1320727664616219698L), 3);
                        string = FV.D();
                        graphics2D = bufferedImage.createGraphics();
                        color2 = color;
                        if (string != null) break block4;
                        if (color2 == null) break block5;
                        color2 = color;
                    }
                    if (string != null) break block6;
                    if (color2.getAlpha() >= xg_0.a(15643, 8247608782124551944L)) break block7;
                }
                graphics2D.drawImage(z.getImage(), 0, 0, null);
            }
            color2 = color;
        }
        if (color2 != null) {
            graphics2D.setPaint(color);
            graphics2D.fillRect(2, 2, xg_0.a(22436, 273184142911301050L), xg_0.a(8240, 6941280575379313196L));
        }
        graphics2D.drawImage(C.getImage(), 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static void U(BufferedImage bufferedImage, float f10) {
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.getInstance(3, f10));
        graphics2D.setPaint(Color.BLACK);
        graphics2D.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        graphics2D.dispose();
    }

    public static Color e(ImageIcon imageIcon) {
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        block3: {
            n14 = 0;
            n13 = 0;
            n12 = 0;
            BufferedImage bufferedImage = xg_0.v(imageIcon.getImage());
            n11 = 0;
            String string = FV.D();
            while (n11 < imageIcon.getIconWidth()) {
                block4: {
                    n10 = 0;
                    if (string != null) break block3;
                    for (int i2 = v5485317; i2 < imageIcon.getIconHeight(); ++i2) {
                        int n15 = bufferedImage.getRGB(n11, i2);
                        n14 += n15 >> xg_0.a(6052, 2430465669435368895L) & xg_0.a(1619, 4472629596573480014L);
                        n13 += n15 >> xg_0.a(15301, 369906032393357776L) & xg_0.a(15643, 8247608782124551944L);
                        n12 += n15 & xg_0.a(15643, 8247608782124551944L);
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block4;
                    }
                    ++n11;
                }
                if (string == null) continue;
            }
            n10 = imageIcon.getIconWidth() * imageIcon.getIconHeight();
        }
        n11 = n10;
        return new Color(n14 / n11, n13 / n11, n12 / n11);
    }

    public static boolean P(String string) {
        return DE.o.contains(cz_0.G(string, false).toLowerCase());
    }

    public static ImageIcon G(String string) {
        return xg_0.l(string, xg_0.a(25653, 8865959407765378597L));
    }

    public static ImageIcon l(String string, int n10) {
        block6: {
            ImageIcon imageIcon;
            ImageIcon imageIcon2;
            String string2;
            ImageIcon imageIcon3;
            block5: {
                imageIcon3 = xg_0.e(string, false);
                string2 = FV.D();
                imageIcon2 = imageIcon3;
                if (string2 != null) break block5;
                if (imageIcon2 == null) break block6;
                imageIcon2 = xg_0.T(imageIcon3.getImage(), n10);
            }
            ImageIcon imageIcon4 = imageIcon = imageIcon2;
            if (string2 == null) {
                if (imageIcon4 != null) {
                    imageIcon.setDescription(imageIcon3.getIconWidth() + "x" + imageIcon3.getIconHeight());
                }
                imageIcon4 = imageIcon;
            }
            return imageIcon4;
        }
        return null;
    }

    public static ImageIcon q(ImageIcon imageIcon, int n10) {
        return xg_0.T(imageIcon.getImage(), n10);
    }

    public static ImageIcon T(Image image, int n10) {
        return xg_0.W(xg_0.v(image), n10);
    }

    public static ImageIcon W(BufferedImage bufferedImage, int n10) {
        BufferedImage bufferedImage2 = xg_0.h(bufferedImage, n10);
        if (bufferedImage2 != null) {
            return new ImageIcon(bufferedImage2);
        }
        return new ImageIcon();
    }

    public static BufferedImage g(BufferedImage bufferedImage, Dimension dimension) {
        return xg_0.S(bufferedImage, dimension.width, dimension.height);
    }

    public static BufferedImage S(BufferedImage bufferedImage, int n10, int n11) {
        BufferedImage bufferedImage2;
        block6: {
            block7: {
                int n12;
                block4: {
                    float f10;
                    block5: {
                        String string = FV.D();
                        n12 = bufferedImage.getWidth();
                        if (string != null) break block4;
                        if (n12 > n10) break block5;
                        bufferedImage2 = bufferedImage;
                        if (string != null) break block6;
                        if (bufferedImage2.getHeight() <= n11) break block7;
                    }
                    n12 = (f10 = (float)n11 * ((float)bufferedImage.getWidth() / (float)bufferedImage.getHeight()) - (float)n10) == 0.0f ? (char)'\u0000' : (f10 < 0.0f ? (char)'\uffffffff' : '\u0001');
                }
                if (n12 <= 0) {
                    return xg_0.h(bufferedImage, Math.max(n11, Math.round((float)n11 * ((float)bufferedImage.getWidth() / (float)bufferedImage.getHeight()))));
                }
                return xg_0.h(bufferedImage, Math.max(n10, Math.round((float)n10 * ((float)bufferedImage.getHeight() / (float)bufferedImage.getWidth()))));
            }
            bufferedImage2 = bufferedImage;
        }
        return bufferedImage2;
    }

    /*
     * Unable to fully structure code
     */
    public static BufferedImage h(BufferedImage var0, int var1_1) {
        block18: {
            block19: {
                block20: {
                    block16: {
                        block17: {
                            var2_2 = FV.D();
                            v0 = var0;
                            if (var2_2 == null) {
                                if (v0 == null) {
                                    return null;
                                }
                                v0 = var0;
                            }
                            v1 = v0.getWidth();
                            v2 = var1_1;
                            if (var2_2 == null) {
                                if (v1 <= v2) {
                                    v1 = var0.getHeight();
                                    v2 = var1_1;
                                    if (var2_2 == null) {
                                        if (v1 <= v2) {
                                            return var0;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    v1 = var0.getWidth();
                                    v2 = var0.getHeight();
                                }
                            }
                            if (var2_2 != null) break block16;
                            if (v1 <= v2) break block17;
                            var3_3 = var1_1;
                            var4_4 = Math.round((float)var1_1 * (float)var0.getHeight() / (float)var0.getWidth());
                            if (var2_2 == null) break block18;
                        }
                        v1 = var0.getWidth();
                        v2 = var0.getHeight();
                    }
                    if (var2_2 != null) break block19;
                    if (v1 >= v2) break block20;
                    var4_4 = var1_1;
                    var3_3 = Math.round((float)var1_1 * (float)var0.getWidth() / (float)var0.getHeight());
                    if (var2_2 == null) break block18;
                }
                v3 = var1_1;
                v2 = v3;
                v1 = v3;
            }
            var4_4 = v2;
            var3_3 = v1;
        }
        v4 = var3_3;
        v5 = 3;
        if (var2_2 == null) {
            if (v4 >= v5) {
                v4 = var4_4;
                v5 = 3;
                if (var2_2 == null) {
                    if (v4 >= v5) {
                        return new ResampleOp(var3_3, var4_4).filter(var0, xg_0.c(var0));
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v4 = 1;
                v5 = var3_3;
            }
        }
        var5_5 = Math.max(v4, v5);
        var6_6 = Math.max(1, var4_4);
        var7_7 = xg_0.g(var5_5, var6_6, 3);
        var8_8 = var7_7.createGraphics();
        RV.O(var8_8);
        var8_8.drawImage(var0, 0, 0, var3_3, var4_4, null);
        var8_8.dispose();
        return var7_7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean K(String string) {
        String string2 = FV.D();
        Map map = g;
        String string3 = string;
        if (string2 == null) {
            if (!map.containsKey(string3)) return false;
            map = g;
            string3 = string;
        }
        if (map.get(string3) == null) return false;
        return true;
    }

    public static void J(String string, ImageIcon imageIcon) {
        g.put(string, imageIcon);
    }

    public static void j() {
        g.clear();
    }

    public static void Q(String string) {
        block5: {
            Object object;
            block7: {
                String string2;
                Map map;
                String string3;
                block6: {
                    int n10;
                    block4: {
                        string3 = FV.D();
                        n10 = g.size();
                        if (string3 != null) break block4;
                        if (n10 <= 0) break block5;
                        map = g;
                        string2 = string;
                        if (string3 != null) break block6;
                        n10 = map.containsKey(string2) ? '\u0001' : '\u0000';
                    }
                    if (n10 == 0) break block5;
                    map = g;
                    string2 = string;
                }
                object = map.get(string2);
                if (string3 != null) break block5;
                if (object == null) break block7;
                object = ((ImageIcon)g.get(string)).getImage();
                if (string3 != null) break block5;
                if (object != null) {
                    ((ImageIcon)g.get(string)).getImage().flush();
                }
            }
            object = g.remove(string);
        }
    }

    public static ImageIcon K(File file) {
        return xg_0.O(file, true);
    }

    public static ImageIcon O(File file, boolean bl) {
        return xg_0.e(file.getAbsolutePath(), bl);
    }

    public static ImageIcon e(String string) {
        return xg_0.e(string, true);
    }

    public static ImageIcon e(String string, boolean bl) {
        block7: {
            block10: {
                ImageIcon imageIcon;
                String string2;
                Map map;
                String string3;
                block11: {
                    boolean bl2;
                    block9: {
                        block8: {
                            String string4;
                            block6: {
                                string3 = FV.D();
                                string4 = string;
                                if (string3 != null) break block6;
                                if (string4 == null) break block7;
                                string4 = string.trim();
                            }
                            bl2 = string4.equals("");
                            if (string3 != null) break block8;
                            if (bl2) break block7;
                            bl2 = bl;
                        }
                        if (string3 != null) break block9;
                        if (!bl2) break block10;
                        map = g;
                        string2 = string;
                        if (string3 != null) break block11;
                        bl2 = map.containsKey(string2);
                    }
                    if (!bl2) break block10;
                    map = g;
                    string2 = string;
                }
                ImageIcon imageIcon2 = imageIcon = (ImageIcon)map.get(string2);
                if (string3 == null) {
                    if (imageIcon2 != null) {
                        return imageIcon;
                    }
                    g.remove(string);
                    imageIcon2 = xg_0.e(string, bl);
                }
                return imageIcon2;
            }
            ImageIcon imageIcon = xg_0.w(string);
            if (bl) {
                g.put(string, imageIcon);
            }
            return imageIcon;
        }
        return null;
    }

    private static ImageIcon w(String string) {
        try {
            if (!new File(string).exists()) {
                return new ImageIcon();
            }
        }
        catch (Throwable throwable) {
            throw xg_0.a(throwable);
        }
        try {
            return new ImageIcon(ImageIO.read(new File(string)));
        }
        catch (Throwable throwable) {
            return new ImageIcon();
        }
    }

    public static ImageIcon U(URL uRL) {
        return xg_0.d(uRL, true);
    }

    public static ImageIcon d(URL uRL, boolean bl) {
        block7: {
            String string;
            block9: {
                ImageIcon imageIcon;
                String string2;
                Map map;
                String string3;
                block10: {
                    boolean bl2;
                    block8: {
                        URL uRL2;
                        block6: {
                            string3 = FV.D();
                            uRL2 = uRL;
                            if (string3 != null) break block6;
                            if (uRL2 == null) break block7;
                            uRL2 = uRL;
                        }
                        string = uRL2.toString();
                        bl2 = bl;
                        if (string3 != null) break block8;
                        if (!bl2) break block9;
                        map = g;
                        string2 = string;
                        if (string3 != null) break block10;
                        bl2 = map.containsKey(string2);
                    }
                    if (!bl2) break block9;
                    map = g;
                    string2 = string;
                }
                ImageIcon imageIcon2 = imageIcon = (ImageIcon)map.get(string2);
                if (string3 == null) {
                    if (imageIcon2 != null) {
                        return imageIcon;
                    }
                    g.remove(string);
                    imageIcon2 = xg_0.e(string, bl);
                }
                return imageIcon2;
            }
            ImageIcon imageIcon = new ImageIcon(uRL);
            if (bl) {
                g.put(string, imageIcon);
            }
            return imageIcon;
        }
        return null;
    }

    public static BufferedImage m(Image image) {
        return xg_0.h(xg_0.v(image));
    }

    public static BufferedImage h(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = xg_0.c(bufferedImage);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage z(URL uRL) {
        return xg_0.Z(new ImageIcon(uRL));
    }

    public static BufferedImage R(String string) {
        return xg_0.Z(new ImageIcon(string));
    }

    public static BufferedImage Z(ImageIcon imageIcon) {
        return xg_0.v(imageIcon.getImage());
    }

    public static BufferedImage v(Image image) {
        if (image == null || image.getWidth(null) <= 0 || image.getHeight(null) <= 0) {
            return null;
        }
        if (image instanceof BufferedImage) {
            return (BufferedImage)image;
        }
        BufferedImage bufferedImage = xg_0.g(image.getWidth(null), image.getHeight(null), 3);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static BufferedImage i(Icon icon) {
        Icon icon2;
        block5: {
            block6: {
                block8: {
                    Image image;
                    block7: {
                        Image image2;
                        String string = FV.D();
                        icon2 = icon;
                        if (string == null) {
                            if (icon2 == null) {
                                return null;
                            }
                            icon2 = icon;
                        }
                        if (string != null) break block5;
                        if (!(icon2 instanceof ImageIcon)) break block6;
                        image = image2 = ((ImageIcon)icon).getImage();
                        if (string != null) break block7;
                        if (image == null) break block8;
                        image = image2;
                    }
                    return xg_0.v(image);
                }
                return xg_0.Z(icon);
            }
            icon2 = icon;
        }
        return xg_0.Z(icon2);
    }

    public static BufferedImage Z(Icon icon) {
        BufferedImage bufferedImage = xg_0.g(icon.getIconWidth(), icon.getIconHeight(), 3);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        icon.paintIcon(null, graphics2D, 0, 0);
        graphics2D.dispose();
        return bufferedImage;
    }

    public static ImageIcon S(Icon icon) {
        block3: {
            Icon icon2;
            block2: {
                String string = FV.D();
                icon2 = icon;
                if (string != null) break block2;
                if (!(icon2 instanceof ImageIcon)) break block3;
                icon2 = icon;
            }
            return (ImageIcon)icon2;
        }
        return new ImageIcon(xg_0.i(icon));
    }

    public static ImageIcon U(String string, int n10, boolean bl) {
        block3: {
            String string2;
            Map map;
            block2: {
                String string3 = FV.D();
                map = E;
                string2 = n10 + xg_0.b(-31662, -21917) + string;
                if (string3 != null) break block2;
                if (!map.containsKey(string2)) break block3;
                map = E;
                string2 = n10 + xg_0.b(-31657, -7393) + string;
            }
            return (ImageIcon)map.get(string2);
        }
        ImageIcon imageIcon = xg_0.l(string, n10);
        ImageIcon imageIcon2 = xg_0.c(imageIcon, n10, bl);
        E.put(n10 + xg_0.b(-31657, -7393) + string, imageIcon2);
        return imageIcon2;
    }

    public static ImageIcon Y(String string, ImageIcon imageIcon, int n10, boolean bl) {
        block3: {
            String string2;
            Map map;
            block2: {
                String string3 = FV.D();
                map = E;
                string2 = string;
                if (string3 != null) break block2;
                if (!map.containsKey(string2)) break block3;
                map = E;
                string2 = string;
            }
            return (ImageIcon)map.get(string2);
        }
        ImageIcon imageIcon2 = xg_0.c(imageIcon, n10, bl);
        E.put(string, imageIcon2);
        return imageIcon2;
    }

    /*
     * Unable to fully structure code
     */
    public static ImageIcon c(ImageIcon var0, int var1_1, boolean var2_2) {
        var4_3 = xg_0.g(var1_1 += 4, var1_1, 3);
        var5_4 = var4_3.createGraphics();
        var3_5 = FV.D();
        if (var0 != null) {
            var5_4.drawImage(var0.getImage(), var1_1 / 2 - var0.getIconWidth() / 2, var1_1 / 2 - var0.getIconHeight() / 2, null);
        }
        if (var2_2) {
            var5_4.setPaint(Color.LIGHT_GRAY);
            var5_4.drawRect(0, 0, var1_1 - 1, var1_1 - 1);
        }
        var5_4.dispose();
        var6_6 = new ImageIcon(var4_3);
        v0 = var0;
        if (var3_5 != null) ** GOTO lbl16
        if (v0 != null) {
            v0 = var0;
lbl16:
            // 2 sources

            v1 = v0.getDescription();
        } else {
            v1 = null;
        }
        var6_6.setDescription(v1);
        return var6_6;
    }

    public static void c() {
        S.clear();
    }

    public static void y(String string) {
        S.remove(string);
    }

    public static ImageIcon H(String string, ImageIcon imageIcon) {
        if (S.containsKey(string)) {
            return (ImageIcon)S.get(string);
        }
        S.put(string, xg_0.J(imageIcon));
        return (ImageIcon)S.get(string);
    }

    public static ImageIcon J(ImageIcon imageIcon) {
        return new ImageIcon(xg_0.h(imageIcon.getImage()));
    }

    public static BufferedImage h(Image image) {
        BufferedImage bufferedImage = xg_0.f(image);
        BufferedImage bufferedImage2 = xg_0.c(bufferedImage);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        RV.p(graphics2D, Float.valueOf(GO.F8));
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static ImageIcon C(ImageIcon imageIcon) {
        return new ImageIcon(xg_0.f(imageIcon.getImage()));
    }

    public static BufferedImage f(Image image) {
        return xg_0.n(xg_0.v(image));
    }

    public static BufferedImage n(BufferedImage bufferedImage) {
        return oa_2.q(bufferedImage, null);
    }

    public static ImageIcon h(String string, ImageIcon imageIcon, float f10) {
        String string2 = FV.D();
        Map map = k;
        String string3 = string;
        if (string2 == null) {
            if (map.containsKey(string3)) {
                return (ImageIcon)k.get(string);
            }
            k.put(string, xg_0.f(imageIcon, f10));
            map = k;
            string3 = string;
        }
        return (ImageIcon)map.get(string3);
    }

    public static ImageIcon f(ImageIcon imageIcon, float f10) {
        BufferedImage bufferedImage = xg_0.g(imageIcon.getIconWidth(), imageIcon.getIconHeight(), 3);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        RV.p(graphics2D, Float.valueOf(f10));
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, null);
        graphics2D.dispose();
        return new ImageIcon(bufferedImage);
    }

    public static BufferedImage Z(Image image, int n10, int n11) {
        return xg_0.j(xg_0.v(image), n10, n11);
    }

    public static BufferedImage j(BufferedImage bufferedImage, int n10, int n11) {
        int n12 = bufferedImage.getWidth();
        int n13 = bufferedImage.getHeight();
        BufferedImage bufferedImage2 = xg_0.g(n12 + n10 * 2 + 1, n13 + n10 * 2 + 1, 3);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        RV.X(graphics2D);
        RV.O(graphics2D);
        RoundRectangle2D.Double double_ = new RoundRectangle2D.Double(n10, n10, n12, n13, n11, n11);
        Shape shape = graphics2D.getClip();
        graphics2D.setClip(double_);
        graphics2D.drawImage((Image)bufferedImage, n10, n10, null);
        graphics2D.setClip(shape);
        RV.Y(graphics2D, double_, GO.r, n10);
        graphics2D.setPaint(new LinearGradientPaint(0.0f, n10, 0.0f, n13 - n10, new float[]{0.0f, 0.5f, 1.0f}, new Color[]{new Color(xg_0.a(15608, 5655894665130905312L), xg_0.a(7019, 1957122256642287996L), xg_0.a(7019, 1957122256642287996L), xg_0.a(15510, 3972533210596642432L)), new Color(xg_0.a(7019, 1957122256642287996L), xg_0.a(7019, 1957122256642287996L), xg_0.a(7019, 1957122256642287996L), 0), new Color(xg_0.a(7019, 1957122256642287996L), xg_0.a(7019, 1957122256642287996L), xg_0.a(7019, 1957122256642287996L), xg_0.a(31505, 1209462129975576840L))}));
        graphics2D.fill(double_);
        graphics2D.setColor(Color.GRAY);
        graphics2D.draw(double_);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage p(int n10, int n11, Shape shape, int n12, float f10) {
        return xg_0.C(n10, n11, shape, n12, f10, GO.l);
    }

    public static BufferedImage C(int n10, int n11, Shape shape, int n12, float f10, Color color) {
        int n13 = n12 * 2 + n10;
        int n14 = n12 * 2 + n11;
        BufferedImage bufferedImage = xg_0.g(n13, n13, 3);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        RV.X(graphics2D);
        graphics2D.translate(n12, n12);
        graphics2D.setPaint(Color.BLACK);
        graphics2D.fill(shape);
        graphics2D.dispose();
        zf_0 zf_02 = new zf_0(n12, 0, 0, f10);
        BufferedImage bufferedImage2 = zf_02.filter(bufferedImage, null);
        if (color != null) {
            Graphics2D graphics2D2 = bufferedImage2.createGraphics();
            RV.X(graphics2D2);
            graphics2D2.translate(n12, n12);
            graphics2D2.setComposite(AlphaComposite.getInstance(5));
            graphics2D2.setPaint(color);
            graphics2D2.fill(shape);
            graphics2D2.dispose();
        }
        return bufferedImage2;
    }

    public static ImageIcon l(int n10) {
        return new ImageIcon(xg_0.J(n10));
    }

    public static BufferedImage J(int n10) {
        return xg_0.C(xg_0.a(1396, 7302371937458468704L), xg_0.a(1396, 7302371937458468704L), xg_0.Z(), n10, 1.0f, Color.WHITE);
    }

    public static ImageIcon Y(int n10) {
        return new ImageIcon(xg_0.G(n10));
    }

    public static BufferedImage G(int n10) {
        return xg_0.M(xg_0.Z(), xg_0.V(), n10);
    }

    private static GeneralPath Z() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(0.0f, 7.0f);
        generalPath.lineTo(5.0f, 1.0f);
        generalPath.lineTo(10.0f, 7.0f);
        generalPath.closePath();
        return generalPath;
    }

    private static GeneralPath V() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(0.0f, 6.0f);
        generalPath.lineTo(4.0f, 2.0f);
        generalPath.lineTo(8.0f, 6.0f);
        generalPath.closePath();
        return generalPath;
    }

    public static ImageIcon p(int n10) {
        return new ImageIcon(xg_0.s(n10));
    }

    public static BufferedImage s(int n10) {
        return xg_0.C(xg_0.a(1396, 7302371937458468704L), xg_0.a(1396, 7302371937458468704L), xg_0.e(), n10, 1.0f, Color.WHITE);
    }

    public static ImageIcon P(int n10) {
        return new ImageIcon(xg_0.g(n10));
    }

    public static BufferedImage g(int n10) {
        return xg_0.M(xg_0.e(), xg_0.a(), n10);
    }

    private static GeneralPath e() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(7.0f, 0.0f);
        generalPath.lineTo(1.0f, 5.0f);
        generalPath.lineTo(7.0f, 10.0f);
        generalPath.closePath();
        return generalPath;
    }

    private static GeneralPath a() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(6.0f, 0.0f);
        generalPath.lineTo(2.0f, 4.0f);
        generalPath.lineTo(6.0f, 8.0f);
        generalPath.closePath();
        return generalPath;
    }

    public static ImageIcon q(int n10) {
        return new ImageIcon(xg_0.y(n10));
    }

    public static BufferedImage y(int n10) {
        return xg_0.C(xg_0.a(1396, 7302371937458468704L), xg_0.a(1396, 7302371937458468704L), xg_0.P(), n10, 1.0f, Color.WHITE);
    }

    public static ImageIcon e(int n10) {
        return new ImageIcon(xg_0.e(n10));
    }

    public static BufferedImage e(int n10) {
        return xg_0.M(xg_0.P(), xg_0.D(), n10);
    }

    private static GeneralPath P() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(0.0f, 3.0f);
        generalPath.lineTo(5.0f, 9.0f);
        generalPath.lineTo(10.0f, 3.0f);
        generalPath.closePath();
        return generalPath;
    }

    private static GeneralPath D() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(0.0f, 3.0f);
        generalPath.lineTo(4.0f, 7.0f);
        generalPath.lineTo(8.0f, 3.0f);
        generalPath.closePath();
        return generalPath;
    }

    public static ImageIcon L(int n10) {
        return new ImageIcon(xg_0.Q(n10));
    }

    public static BufferedImage Q(int n10) {
        return xg_0.C(xg_0.a(28776, 1012553027963535986L), xg_0.a(1396, 7302371937458468704L), xg_0.l(), n10, 1.0f, Color.WHITE);
    }

    public static ImageIcon a(int n10) {
        return new ImageIcon(xg_0.l(n10));
    }

    public static BufferedImage l(int n10) {
        return xg_0.M(xg_0.l(), xg_0.M(), n10);
    }

    private static GeneralPath l() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(3.0f, 0.0f);
        generalPath.lineTo(9.0f, 5.0f);
        generalPath.lineTo(3.0f, 10.0f);
        generalPath.closePath();
        return generalPath;
    }

    private static GeneralPath M() {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(3.0f, 0.0f);
        generalPath.lineTo(7.0f, 4.0f);
        generalPath.lineTo(3.0f, 8.0f);
        generalPath.closePath();
        return generalPath;
    }

    private static BufferedImage M(GeneralPath generalPath, GeneralPath generalPath2, int n10) {
        BufferedImage bufferedImage = xg_0.C(xg_0.a(1396, 7302371937458468704L), xg_0.a(1396, 7302371937458468704L), generalPath, n10, 1.0f, Color.BLACK);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        RV.X(graphics2D);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.translate(n10, n10);
        graphics2D.draw(generalPath2);
        graphics2D.dispose();
        return bufferedImage;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static BufferedImage a(String string) {
        String string2;
        BufferedImage bufferedImage;
        block11: {
            block12: {
                String string3;
                block10: {
                    bufferedImage = null;
                    string3 = FV.D();
                    try {
                        string2 = string;
                        if (string3 != null) break block10;
                        if (string2 == null) return bufferedImage;
                    }
                    catch (Exception exception) {
                        throw xg_0.a(exception);
                    }
                    string2 = string;
                }
                if (string3 != null) break block11;
                try {
                    if (!string2.equals("")) break block12;
                    return bufferedImage;
                    catch (Exception exception) {
                        throw xg_0.a(exception);
                    }
                }
                catch (Exception exception) {
                    throw xg_0.a(exception);
                }
            }
            string2 = LE.Q(string);
        }
        byte[] byArray = string2.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        try {
            bufferedImage = ImageIO.read(byteArrayInputStream);
            byteArrayInputStream.close();
            return bufferedImage;
        }
        catch (Exception exception) {
            ne_1.M(xg_0.b(-31663, -5324), exception);
            try {
                byteArrayInputStream.close();
                return bufferedImage;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return bufferedImage;
    }

    public static String K(BufferedImage bufferedImage) {
        String string = null;
        try {
            if (bufferedImage == null) {
                return string;
            }
        }
        catch (IOException iOException) {
            throw xg_0.a(iOException);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ImageIO.write((RenderedImage)bufferedImage, xg_0.b(-31659, 21210), byteArrayOutputStream);
            string = LE.S(new String(byteArrayOutputStream.toByteArray()));
            byteArrayOutputStream.close();
        }
        catch (IOException iOException) {
            ne_1.M(xg_0.b(-31664, 14473), iOException);
            try {
                byteArrayOutputStream.close();
            }
            catch (IOException iOException2) {
                // empty catch block
            }
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[7];
                        var11_1 = 0;
                        var10_2 = "\u00d6\u00c9\u00a0\u00d8\u00af\u00f0\u00e4\u0015#\u001ew$\u00c1S\r\u00e4\u00ce\u00cf\u00ef\u0092\u00ba\u00ae6\t\u00cc\u00ee\u00e7\u0004\u0080\u000f;\u001d\u001b\u000b\u00b1\u00aew\u00be\u00c2yK\u00b8\u00e2qW\u00c2#\u009d_*\u00cbF;\u0000\u00e1w\u00cd)\u00d8#\u001b\u00b3!\u00b9e\\\u0080%\u00033\u00eb\u0001}\u00ed\fx\u00ba\u0096w\u00d1\u00ac\u00f2\u0013)\u0093\u00e2\u0013Z\u0004\u0085\u008f\u009b\r";
                        var12_3 = "\u00d6\u00c9\u00a0\u00d8\u00af\u00f0\u00e4\u0015#\u001ew$\u00c1S\r\u00e4\u00ce\u00cf\u00ef\u0092\u00ba\u00ae6\t\u00cc\u00ee\u00e7\u0004\u0080\u000f;\u001d\u001b\u000b\u00b1\u00aew\u00be\u00c2yK\u00b8\u00e2qW\u00c2#\u009d_*\u00cbF;\u0000\u00e1w\u00cd)\u00d8#\u001b\u00b3!\u00b9e\\\u0080%\u00033\u00eb\u0001}\u00ed\fx\u00ba\u0096w\u00d1\u00ac\u00f2\u0013)\u0093\u00e2\u0013Z\u0004\u0085\u008f\u009b\r".length();
                        var9_4 = 27;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 86;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00cc\u00ea\u0091\u00ce\u00fb@\u001cqN\u00e0\u00a8\u0089_\u0089Tr:\u00103\u0092b\u0003\u00f1)\u0004";
                            var12_3 = "\u00cc\u00ea\u0091\u00ce\u00fb@\u001cqN\u00e0\u00a8\u0089_\u0089Tr:\u00103\u0092b\u0003\u00f1)\u0004".length();
                            var9_4 = 21;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 15;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 28;
                                    break;
                                }
                                case 1: {
                                    v15 = 66;
                                    break;
                                }
                                case 2: {
                                    v15 = 78;
                                    break;
                                }
                                case 3: {
                                    v15 = 84;
                                    break;
                                }
                                case 4: {
                                    v15 = 31;
                                    break;
                                }
                                case 5: {
                                    v15 = 113;
                                    break;
                                }
                                default: {
                                    v15 = 16;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                xg_0.a = var13;
                xg_0.b = new String[7];
                var0_7 = 7617842255369400522L;
                var6_8 = new long[15];
                var3_9 = 0;
                var4_10 = "f\u00fa\u00adhY\u00e9\u00c4{*\u00fcB?\u00b7\u008db\u00eaR\u00f2\u00c2y\u00c8\u00b4t~\u009c\\\u00ec[F?\u0095}\u00a2\u00d8\u00cbc\u00a0;\u00b9\u00f2\u009fb];\u00c0g~W\u0094=\u00d4\u00ef\u00a3:\u00d5eV\u00e9\u00fcx\u00aeC\u00b2\u00b2\u00e3\u0083\u009c\u00f7\u000fTy\u00122\u00e6#\u00d7\u00f7\u00be\u00c7\u00a0\u008b\u00be57+lY\u00cb\u00b2}\u00fd\u00fc\u00ceN\u00fez\u00d9)=\u0017\u00ac;\u00d4\u00e8";
                var5_11 = "f\u00fa\u00adhY\u00e9\u00c4{*\u00fcB?\u00b7\u008db\u00eaR\u00f2\u00c2y\u00c8\u00b4t~\u009c\\\u00ec[F?\u0095}\u00a2\u00d8\u00cbc\u00a0;\u00b9\u00f2\u009fb];\u00c0g~W\u0094=\u00d4\u00ef\u00a3:\u00d5eV\u00e9\u00fcx\u00aeC\u00b2\u00b2\u00e3\u0083\u009c\u00f7\u000fTy\u00122\u00e6#\u00d7\u00f7\u00be\u00c7\u00a0\u008b\u00be57+lY\u00cb\u00b2}\u00fd\u00fc\u00ceN\u00fez\u00d9)=\u0017\u00ac;\u00d4\u00e8".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00bd\u00dcH\u0084\u0016\u00a3\u00a6\u00ddKA\u00de\u001d\u00ca\u00ad\u00ff=";
                    var5_11 = "\u00bd\u00dcH\u0084\u0016\u00a3\u00a6\u00ddKA\u00de\u001d\u00ca\u00ad\u00ff=".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        xg_0.c = var6_8;
        xg_0.d = new Integer[15];
        xg_0.Z = new HashMap<K, V>();
        xg_0.l = new HashMap<K, V>();
        xg_0.C = new ImageIcon(xg_0.class.getResource(xg_0.b(-31658, -30855)));
        xg_0.z = new ImageIcon(xg_0.class.getResource(xg_0.b(-31661, 13676)));
        xg_0.g = new HashMap<K, V>();
        xg_0.E = new HashMap<K, V>();
        xg_0.S = new HashMap<K, V>();
        xg_0.k = new HashMap<K, V>();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF8453) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 230;
                    break;
                }
                case 1: {
                    n14 = 5;
                    break;
                }
                case 2: {
                    n14 = 65;
                    break;
                }
                case 3: {
                    n14 = 115;
                    break;
                }
                case 4: {
                    n14 = 194;
                    break;
                }
                case 5: {
                    n14 = 150;
                    break;
                }
                case 6: {
                    n14 = 123;
                    break;
                }
                case 7: {
                    n14 = 84;
                    break;
                }
                case 8: {
                    n14 = 16;
                    break;
                }
                case 9: {
                    n14 = 192;
                    break;
                }
                case 10: {
                    n14 = 122;
                    break;
                }
                case 11: {
                    n14 = 191;
                    break;
                }
                case 12: {
                    n14 = 88;
                    break;
                }
                case 13: {
                    n14 = 145;
                    break;
                }
                case 14: {
                    n14 = 37;
                    break;
                }
                case 15: {
                    n14 = 15;
                    break;
                }
                case 16: {
                    n14 = 181;
                    break;
                }
                case 17: {
                    n14 = 126;
                    break;
                }
                case 18: {
                    n14 = 174;
                    break;
                }
                case 19: {
                    n14 = 17;
                    break;
                }
                case 20: {
                    n14 = 27;
                    break;
                }
                case 21: {
                    n14 = 35;
                    break;
                }
                case 22: {
                    n14 = 80;
                    break;
                }
                case 23: {
                    n14 = 247;
                    break;
                }
                case 24: {
                    n14 = 73;
                    break;
                }
                case 25: {
                    n14 = 118;
                    break;
                }
                case 26: {
                    n14 = 121;
                    break;
                }
                case 27: {
                    n14 = 48;
                    break;
                }
                case 28: {
                    n14 = 81;
                    break;
                }
                case 29: {
                    n14 = 132;
                    break;
                }
                case 30: {
                    n14 = 218;
                    break;
                }
                case 31: {
                    n14 = 243;
                    break;
                }
                case 32: {
                    n14 = 22;
                    break;
                }
                case 33: {
                    n14 = 33;
                    break;
                }
                case 34: {
                    n14 = 164;
                    break;
                }
                case 35: {
                    n14 = 36;
                    break;
                }
                case 36: {
                    n14 = 19;
                    break;
                }
                case 37: {
                    n14 = 59;
                    break;
                }
                case 38: {
                    n14 = 58;
                    break;
                }
                case 39: {
                    n14 = 156;
                    break;
                }
                case 40: {
                    n14 = 142;
                    break;
                }
                case 41: {
                    n14 = 235;
                    break;
                }
                case 42: {
                    n14 = 239;
                    break;
                }
                case 43: {
                    n14 = 187;
                    break;
                }
                case 44: {
                    n14 = 25;
                    break;
                }
                case 45: {
                    n14 = 95;
                    break;
                }
                case 46: {
                    n14 = 240;
                    break;
                }
                case 47: {
                    n14 = 251;
                    break;
                }
                case 48: {
                    n14 = 214;
                    break;
                }
                case 49: {
                    n14 = 50;
                    break;
                }
                case 50: {
                    n14 = 106;
                    break;
                }
                case 51: {
                    n14 = 180;
                    break;
                }
                case 52: {
                    n14 = 225;
                    break;
                }
                case 53: {
                    n14 = 149;
                    break;
                }
                case 54: {
                    n14 = 102;
                    break;
                }
                case 55: {
                    n14 = 219;
                    break;
                }
                case 56: {
                    n14 = 204;
                    break;
                }
                case 57: {
                    n14 = 85;
                    break;
                }
                case 58: {
                    n14 = 99;
                    break;
                }
                case 59: {
                    n14 = 53;
                    break;
                }
                case 60: {
                    n14 = 112;
                    break;
                }
                case 61: {
                    n14 = 189;
                    break;
                }
                case 62: {
                    n14 = 52;
                    break;
                }
                case 63: {
                    n14 = 26;
                    break;
                }
                case 64: {
                    n14 = 250;
                    break;
                }
                case 65: {
                    n14 = 32;
                    break;
                }
                case 66: {
                    n14 = 242;
                    break;
                }
                case 67: {
                    n14 = 202;
                    break;
                }
                case 68: {
                    n14 = 11;
                    break;
                }
                case 69: {
                    n14 = 74;
                    break;
                }
                case 70: {
                    n14 = 100;
                    break;
                }
                case 71: {
                    n14 = 184;
                    break;
                }
                case 72: {
                    n14 = 94;
                    break;
                }
                case 73: {
                    n14 = 7;
                    break;
                }
                case 74: {
                    n14 = 64;
                    break;
                }
                case 75: {
                    n14 = 234;
                    break;
                }
                case 76: {
                    n14 = 163;
                    break;
                }
                case 77: {
                    n14 = 18;
                    break;
                }
                case 78: {
                    n14 = 254;
                    break;
                }
                case 79: {
                    n14 = 157;
                    break;
                }
                case 80: {
                    n14 = 158;
                    break;
                }
                case 81: {
                    n14 = 56;
                    break;
                }
                case 82: {
                    n14 = 171;
                    break;
                }
                case 83: {
                    n14 = 14;
                    break;
                }
                case 84: {
                    n14 = 105;
                    break;
                }
                case 85: {
                    n14 = 160;
                    break;
                }
                case 86: {
                    n14 = 146;
                    break;
                }
                case 87: {
                    n14 = 67;
                    break;
                }
                case 88: {
                    n14 = 136;
                    break;
                }
                case 89: {
                    n14 = 144;
                    break;
                }
                case 90: {
                    n14 = 147;
                    break;
                }
                case 91: {
                    n14 = 222;
                    break;
                }
                case 92: {
                    n14 = 49;
                    break;
                }
                case 93: {
                    n14 = 173;
                    break;
                }
                case 94: {
                    n14 = 21;
                    break;
                }
                case 95: {
                    n14 = 182;
                    break;
                }
                case 96: {
                    n14 = 62;
                    break;
                }
                case 97: {
                    n14 = 217;
                    break;
                }
                case 98: {
                    n14 = 135;
                    break;
                }
                case 99: {
                    n14 = 178;
                    break;
                }
                case 100: {
                    n14 = 177;
                    break;
                }
                case 101: {
                    n14 = 77;
                    break;
                }
                case 102: {
                    n14 = 208;
                    break;
                }
                case 103: {
                    n14 = 104;
                    break;
                }
                case 104: {
                    n14 = 152;
                    break;
                }
                case 105: {
                    n14 = 6;
                    break;
                }
                case 106: {
                    n14 = 186;
                    break;
                }
                case 107: {
                    n14 = 79;
                    break;
                }
                case 108: {
                    n14 = 169;
                    break;
                }
                case 109: {
                    n14 = 9;
                    break;
                }
                case 110: {
                    n14 = 0;
                    break;
                }
                case 111: {
                    n14 = 193;
                    break;
                }
                case 112: {
                    n14 = 228;
                    break;
                }
                case 113: {
                    n14 = 167;
                    break;
                }
                case 114: {
                    n14 = 101;
                    break;
                }
                case 115: {
                    n14 = 54;
                    break;
                }
                case 116: {
                    n14 = 83;
                    break;
                }
                case 117: {
                    n14 = 141;
                    break;
                }
                case 118: {
                    n14 = 45;
                    break;
                }
                case 119: {
                    n14 = 68;
                    break;
                }
                case 120: {
                    n14 = 162;
                    break;
                }
                case 121: {
                    n14 = 4;
                    break;
                }
                case 122: {
                    n14 = 215;
                    break;
                }
                case 123: {
                    n14 = 28;
                    break;
                }
                case 124: {
                    n14 = 197;
                    break;
                }
                case 125: {
                    n14 = 227;
                    break;
                }
                case 126: {
                    n14 = 42;
                    break;
                }
                case 127: {
                    n14 = 200;
                    break;
                }
                case 128: {
                    n14 = 133;
                    break;
                }
                case 129: {
                    n14 = 38;
                    break;
                }
                case 130: {
                    n14 = 1;
                    break;
                }
                case 131: {
                    n14 = 82;
                    break;
                }
                case 132: {
                    n14 = 224;
                    break;
                }
                case 133: {
                    n14 = 113;
                    break;
                }
                case 134: {
                    n14 = 89;
                    break;
                }
                case 135: {
                    n14 = 31;
                    break;
                }
                case 136: {
                    n14 = 172;
                    break;
                }
                case 137: {
                    n14 = 3;
                    break;
                }
                case 138: {
                    n14 = 116;
                    break;
                }
                case 139: {
                    n14 = 30;
                    break;
                }
                case 140: {
                    n14 = 23;
                    break;
                }
                case 141: {
                    n14 = 93;
                    break;
                }
                case 142: {
                    n14 = 41;
                    break;
                }
                case 143: {
                    n14 = 223;
                    break;
                }
                case 144: {
                    n14 = 166;
                    break;
                }
                case 145: {
                    n14 = 210;
                    break;
                }
                case 146: {
                    n14 = 220;
                    break;
                }
                case 147: {
                    n14 = 111;
                    break;
                }
                case 148: {
                    n14 = 229;
                    break;
                }
                case 149: {
                    n14 = 51;
                    break;
                }
                case 150: {
                    n14 = 78;
                    break;
                }
                case 151: {
                    n14 = 253;
                    break;
                }
                case 152: {
                    n14 = 203;
                    break;
                }
                case 153: {
                    n14 = 76;
                    break;
                }
                case 154: {
                    n14 = 216;
                    break;
                }
                case 155: {
                    n14 = 13;
                    break;
                }
                case 156: {
                    n14 = 119;
                    break;
                }
                case 157: {
                    n14 = 109;
                    break;
                }
                case 158: {
                    n14 = 71;
                    break;
                }
                case 159: {
                    n14 = 29;
                    break;
                }
                case 160: {
                    n14 = 143;
                    break;
                }
                case 161: {
                    n14 = 165;
                    break;
                }
                case 162: {
                    n14 = 12;
                    break;
                }
                case 163: {
                    n14 = 87;
                    break;
                }
                case 164: {
                    n14 = 176;
                    break;
                }
                case 165: {
                    n14 = 92;
                    break;
                }
                case 166: {
                    n14 = 70;
                    break;
                }
                case 167: {
                    n14 = 170;
                    break;
                }
                case 168: {
                    n14 = 183;
                    break;
                }
                case 169: {
                    n14 = 161;
                    break;
                }
                case 170: {
                    n14 = 201;
                    break;
                }
                case 171: {
                    n14 = 103;
                    break;
                }
                case 172: {
                    n14 = 120;
                    break;
                }
                case 173: {
                    n14 = 245;
                    break;
                }
                case 174: {
                    n14 = 148;
                    break;
                }
                case 175: {
                    n14 = 185;
                    break;
                }
                case 176: {
                    n14 = 206;
                    break;
                }
                case 177: {
                    n14 = 248;
                    break;
                }
                case 178: {
                    n14 = 55;
                    break;
                }
                case 179: {
                    n14 = 128;
                    break;
                }
                case 180: {
                    n14 = 137;
                    break;
                }
                case 181: {
                    n14 = 168;
                    break;
                }
                case 182: {
                    n14 = 238;
                    break;
                }
                case 183: {
                    n14 = 57;
                    break;
                }
                case 184: {
                    n14 = 188;
                    break;
                }
                case 185: {
                    n14 = 91;
                    break;
                }
                case 186: {
                    n14 = 10;
                    break;
                }
                case 187: {
                    n14 = 34;
                    break;
                }
                case 188: {
                    n14 = 212;
                    break;
                }
                case 189: {
                    n14 = 179;
                    break;
                }
                case 190: {
                    n14 = 63;
                    break;
                }
                case 191: {
                    n14 = 236;
                    break;
                }
                case 192: {
                    n14 = 140;
                    break;
                }
                case 193: {
                    n14 = 231;
                    break;
                }
                case 194: {
                    n14 = 90;
                    break;
                }
                case 195: {
                    n14 = 199;
                    break;
                }
                case 196: {
                    n14 = 129;
                    break;
                }
                case 197: {
                    n14 = 44;
                    break;
                }
                case 198: {
                    n14 = 159;
                    break;
                }
                case 199: {
                    n14 = 20;
                    break;
                }
                case 200: {
                    n14 = 40;
                    break;
                }
                case 201: {
                    n14 = 233;
                    break;
                }
                case 202: {
                    n14 = 114;
                    break;
                }
                case 203: {
                    n14 = 209;
                    break;
                }
                case 204: {
                    n14 = 252;
                    break;
                }
                case 205: {
                    n14 = 97;
                    break;
                }
                case 206: {
                    n14 = 207;
                    break;
                }
                case 207: {
                    n14 = 43;
                    break;
                }
                case 208: {
                    n14 = 151;
                    break;
                }
                case 209: {
                    n14 = 190;
                    break;
                }
                case 210: {
                    n14 = 75;
                    break;
                }
                case 211: {
                    n14 = 153;
                    break;
                }
                case 212: {
                    n14 = 213;
                    break;
                }
                case 213: {
                    n14 = 244;
                    break;
                }
                case 214: {
                    n14 = 124;
                    break;
                }
                case 215: {
                    n14 = 60;
                    break;
                }
                case 216: {
                    n14 = 138;
                    break;
                }
                case 217: {
                    n14 = 69;
                    break;
                }
                case 218: {
                    n14 = 86;
                    break;
                }
                case 219: {
                    n14 = 131;
                    break;
                }
                case 220: {
                    n14 = 117;
                    break;
                }
                case 221: {
                    n14 = 39;
                    break;
                }
                case 222: {
                    n14 = 196;
                    break;
                }
                case 223: {
                    n14 = 195;
                    break;
                }
                case 224: {
                    n14 = 47;
                    break;
                }
                case 225: {
                    n14 = 98;
                    break;
                }
                case 226: {
                    n14 = 72;
                    break;
                }
                case 227: {
                    n14 = 205;
                    break;
                }
                case 228: {
                    n14 = 246;
                    break;
                }
                case 229: {
                    n14 = 108;
                    break;
                }
                case 230: {
                    n14 = 226;
                    break;
                }
                case 231: {
                    n14 = 237;
                    break;
                }
                case 232: {
                    n14 = 241;
                    break;
                }
                case 233: {
                    n14 = 232;
                    break;
                }
                case 234: {
                    n14 = 134;
                    break;
                }
                case 235: {
                    n14 = 255;
                    break;
                }
                case 236: {
                    n14 = 61;
                    break;
                }
                case 237: {
                    n14 = 8;
                    break;
                }
                case 238: {
                    n14 = 249;
                    break;
                }
                case 239: {
                    n14 = 139;
                    break;
                }
                case 240: {
                    n14 = 24;
                    break;
                }
                case 241: {
                    n14 = 198;
                    break;
                }
                case 242: {
                    n14 = 175;
                    break;
                }
                case 243: {
                    n14 = 46;
                    break;
                }
                case 244: {
                    n14 = 66;
                    break;
                }
                case 245: {
                    n14 = 96;
                    break;
                }
                case 246: {
                    n14 = 130;
                    break;
                }
                case 247: {
                    n14 = 107;
                    break;
                }
                case 248: {
                    n14 = 211;
                    break;
                }
                case 249: {
                    n14 = 221;
                    break;
                }
                case 250: {
                    n14 = 125;
                    break;
                }
                case 251: {
                    n14 = 127;
                    break;
                }
                case 252: {
                    n14 = 154;
                    break;
                }
                case 253: {
                    n14 = 110;
                    break;
                }
                case 254: {
                    n14 = 2;
                    break;
                }
                default: {
                    n14 = 155;
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
            xg_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x321D;
        if (d[n11] == null) {
            xg_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

