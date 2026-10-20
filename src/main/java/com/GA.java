/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D7;
import com.F2;
import com.FN;
import com.FV;
import com.GO;
import com.KS;
import com.L0;
import com.LB;
import com.LP;
import com.O_;
import com.P9;
import com.PM;
import com.RV;
import com.W2;
import com.WQ;
import com.c;
import com.eh_1;
import com.hq_0;
import com.kp_0;
import com.ky_2;
import com.lo_0;
import com.ne_1;
import com.ne_2;
import com.og_2;
import com.pf_1;
import com.pp_2;
import com.rv_2;
import com.xm_0;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicButtonUI;

public final class GA {
    public static final AffineTransform e;
    public static final AffineTransform N;
    public static final AffineTransform d;
    public static final AffineTransform P;
    private static final Map i;
    public static int a;
    public static int o;
    public static int u;
    public static int U;
    private static final pf_1 g;
    private static final pf_1 M;
    private static final pf_1 l;
    private static final pf_1 V;
    private static final pf_1 z;
    private static final pf_1 j;
    private static final pf_1 F;
    private static final pf_1 C;
    private static final pf_1 B;
    private static final ImageIcon x;
    private static final Map q;
    private static final String[] b;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] h;

    public static Border y(Insets insets) {
        return new KS(insets.top, insets.left, insets.bottom, insets.right);
    }

    public static Border C(int n10, int n11, int n12, int n13) {
        return new KS(n10, n11, n12, n13);
    }

    public static Border V(int n10) {
        return new KS(n10, n10, n10, n10);
    }

    public static og_2 u(og_2 og_22, Class clazz, Class clazz2) {
        og_2 og_23;
        block7: {
            Object object;
            block8: {
                block9: {
                    String string;
                    block6: {
                        string = FV.D();
                        try {
                            if (og_22 != null) break block6;
                            og_23 = null;
                            break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                    }
                    try {
                        try {
                            object = clazz;
                            if (string != null) break block8;
                            if (!kp_0.d((Class)object, og_22.getClass())) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                        og_23 = og_22;
                        break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                }
                object = kp_0.U(clazz2, new Object[]{og_22});
            }
            og_23 = (og_2)object;
        }
        return og_23;
    }

    public static og_2 m(og_2 og_22) {
        og_2 og_23;
        block8: {
            block7: {
                String string;
                block6: {
                    string = FV.D();
                    try {
                        og_23 = og_22;
                        if (string != null) break block6;
                        if (og_23 == null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    og_23 = og_22;
                }
                try {
                    try {
                        if (string != null) break block8;
                        if (!(og_23 instanceof LP)) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    og_23 = ((LP)og_22).J();
                    break block8;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            og_23 = og_22;
        }
        return og_23;
    }

    public static void q(JComponent jComponent, og_2 og_22, og_2 og_23) {
        try {
            kp_0.j(jComponent, GA.a(-31936, -19648), new Object[]{GA.a(-31913, 20788), og_22, og_23});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            ne_1.g(GA.class, noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            ne_1.g(GA.class, invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            ne_1.g(GA.class, illegalAccessException);
        }
    }

    public static void B(JScrollPane jScrollPane, String string) {
        block14: {
            ScrollBarUI scrollBarUI;
            block15: {
                Object object;
                ScrollBarUI scrollBarUI2;
                String string2;
                block13: {
                    Object object2;
                    JScrollBar jScrollBar;
                    block11: {
                        block12: {
                            JScrollBar jScrollBar2 = jScrollPane.getVerticalScrollBar();
                            string2 = FV.D();
                            try {
                                try {
                                    jScrollBar = jScrollBar2;
                                    if (string2 != null) break block11;
                                    if (jScrollBar == null) break block12;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                jScrollBar = jScrollBar2;
                                if (string2 != null) break block11;
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                            object2 = jScrollBar.getUI();
                            if (object2 instanceof xm_0) {
                                scrollBarUI2 = (xm_0)object2;
                                ((xm_0)scrollBarUI2).S(string);
                            }
                        }
                        jScrollBar = jScrollPane.getHorizontalScrollBar();
                    }
                    object2 = jScrollBar;
                    try {
                        object = object2;
                        if (string2 != null) break block13;
                        if (object == null) break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    object = object2;
                }
                scrollBarUI2 = ((JScrollBar)object).getUI();
                try {
                    try {
                        scrollBarUI = scrollBarUI2;
                        if (string2 != null) break block15;
                        if (!(scrollBarUI instanceof xm_0)) break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    scrollBarUI = scrollBarUI2;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            xm_0 xm_02 = (xm_0)scrollBarUI;
            xm_02.S(string);
        }
    }

    public static ComponentUI Z(Component component) {
        return (ComponentUI)kp_0.I(component, GA.a(-31909, 25504), new Object[0]);
    }

    public static void Z(JComponent jComponent, Insets insets, og_2 og_22) {
        block31: {
            Insets insets2;
            block43: {
                int n10;
                int n11;
                block50: {
                    Insets insets3;
                    block48: {
                        Insets insets4;
                        block49: {
                            int n12;
                            int n13;
                            boolean bl;
                            String string;
                            block47: {
                                Insets insets5;
                                block45: {
                                    block46: {
                                        Insets insets6;
                                        Insets insets7;
                                        block44: {
                                            og_2 og_23;
                                            block42: {
                                                block35: {
                                                    int n14;
                                                    int n15;
                                                    block41: {
                                                        Insets insets8;
                                                        block39: {
                                                            block40: {
                                                                int n16;
                                                                int n17;
                                                                block38: {
                                                                    Insets insets9;
                                                                    block36: {
                                                                        block37: {
                                                                            Insets insets10;
                                                                            Insets insets11;
                                                                            block34: {
                                                                                boolean bl2;
                                                                                block32: {
                                                                                    block33: {
                                                                                        JComponent jComponent2;
                                                                                        block30: {
                                                                                            string = FV.D();
                                                                                            try {
                                                                                                jComponent2 = jComponent;
                                                                                                if (string != null) break block30;
                                                                                                if (jComponent2 == null) break block31;
                                                                                            }
                                                                                            catch (RuntimeException runtimeException) {
                                                                                                throw GA.a(runtimeException);
                                                                                            }
                                                                                            jComponent2 = jComponent;
                                                                                        }
                                                                                        try {
                                                                                            bl2 = FN.l(jComponent2);
                                                                                            if (string != null) break block32;
                                                                                            if (!bl2) break block33;
                                                                                        }
                                                                                        catch (RuntimeException runtimeException) {
                                                                                            throw GA.a(runtimeException);
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    bl2 = jComponent.getComponentOrientation().isLeftToRight();
                                                                                }
                                                                                bl = bl2;
                                                                                insets2 = new Insets(0, 0, 0, 0);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            insets11 = insets;
                                                                                            if (string != null) break block34;
                                                                                            if (insets11 == null) break block35;
                                                                                        }
                                                                                        catch (RuntimeException runtimeException) {
                                                                                            throw GA.a(runtimeException);
                                                                                        }
                                                                                        Insets insets12 = insets2;
                                                                                        insets10 = insets12;
                                                                                        n17 = insets12.top;
                                                                                        insets9 = insets;
                                                                                        if (string != null) break block36;
                                                                                    }
                                                                                    catch (RuntimeException runtimeException) {
                                                                                        throw GA.a(runtimeException);
                                                                                    }
                                                                                    insets10.top = n17 + insets9.top;
                                                                                    insets11 = insets2;
                                                                                }
                                                                                catch (RuntimeException runtimeException) {
                                                                                    throw GA.a(runtimeException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                insets10 = insets11;
                                                                                n17 = insets11.left;
                                                                                if (!bl) break block37;
                                                                                n16 = insets.left;
                                                                                break block38;
                                                                            }
                                                                            catch (RuntimeException runtimeException) {
                                                                                throw GA.a(runtimeException);
                                                                            }
                                                                        }
                                                                        insets9 = insets;
                                                                    }
                                                                    n16 = insets9.right;
                                                                }
                                                                try {
                                                                    try {
                                                                        insets10.left = n17 + n16;
                                                                        Insets insets13 = insets2;
                                                                        Insets insets14 = insets13;
                                                                        n15 = insets13.bottom;
                                                                        insets8 = insets;
                                                                        if (string != null) break block39;
                                                                        insets14.bottom = n15 + insets8.bottom;
                                                                        Insets insets15 = insets2;
                                                                        insets14 = insets15;
                                                                        n15 = insets15.right;
                                                                        if (!bl) break block40;
                                                                    }
                                                                    catch (RuntimeException runtimeException) {
                                                                        throw GA.a(runtimeException);
                                                                    }
                                                                    n14 = insets.right;
                                                                    break block41;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw GA.a(runtimeException);
                                                                }
                                                            }
                                                            insets8 = insets;
                                                        }
                                                        n14 = insets8.left;
                                                    }
                                                    insets14.right = n15 + n14;
                                                }
                                                try {
                                                    og_23 = og_22;
                                                    if (string != null) break block42;
                                                    if (og_23 == null) break block43;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw GA.a(runtimeException);
                                                }
                                                og_23 = og_22;
                                            }
                                            insets4 = og_23.B(jComponent);
                                            try {
                                                try {
                                                    try {
                                                        insets7 = insets4;
                                                        if (string != null) break block44;
                                                        if (insets7 == null) break block43;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw GA.a(runtimeException);
                                                    }
                                                    Insets insets16 = insets2;
                                                    insets6 = insets16;
                                                    n13 = insets16.top;
                                                    insets5 = insets4;
                                                    if (string != null) break block45;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw GA.a(runtimeException);
                                                }
                                                insets6.top = n13 + insets5.top;
                                                insets7 = insets2;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw GA.a(runtimeException);
                                            }
                                        }
                                        try {
                                            insets6 = insets7;
                                            n13 = insets7.left;
                                            if (!bl) break block46;
                                            n12 = insets4.left;
                                            break block47;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw GA.a(runtimeException);
                                        }
                                    }
                                    insets5 = insets4;
                                }
                                n12 = insets5.right;
                            }
                            try {
                                try {
                                    insets6.left = n13 + n12;
                                    Insets insets17 = insets2;
                                    Insets insets18 = insets17;
                                    n11 = insets17.bottom;
                                    insets3 = insets4;
                                    if (string != null) break block48;
                                    insets18.bottom = n11 + insets3.bottom;
                                    Insets insets19 = insets2;
                                    insets18 = insets19;
                                    n11 = insets19.right;
                                    if (!bl) break block49;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                n10 = insets4.right;
                                break block50;
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                        }
                        insets3 = insets4;
                    }
                    n10 = insets3.left;
                }
                insets18.right = n11 + n10;
            }
            jComponent.setBorder(GA.y(insets2));
        }
    }

    public static Dimension a(JComponent jComponent, og_2 og_22) {
        Dimension dimension;
        block5: {
            block4: {
                og_2 og_23;
                block3: {
                    String string = FV.D();
                    try {
                        og_23 = og_22;
                        if (string != null) break block3;
                        if (og_23 == null) break block4;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    og_23 = og_22;
                }
                dimension = og_23.d(jComponent);
                break block5;
            }
            dimension = new Dimension(0, 0);
        }
        Dimension dimension2 = dimension;
        LayoutManager layoutManager = jComponent.getLayout();
        if (layoutManager != null) {
            dimension2 = FN.h(dimension2, layoutManager.preferredLayoutSize(jComponent));
        }
        return dimension2;
    }

    public static void A(Graphics graphics, JComponent jComponent) {
        block5: {
            block4: {
                String string = FV.D();
                try {
                    try {
                        if (string != null) break block4;
                        if (!jComponent.isOpaque()) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    graphics.setColor(jComponent.getBackground());
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            GA.L(graphics, jComponent);
        }
    }

    public static void L(Graphics graphics, JComponent jComponent) {
        Rectangle rectangle;
        block4: {
            block3: {
                Shape shape;
                block2: {
                    Shape shape2 = graphics.getClip();
                    String string = FV.D();
                    try {
                        shape = shape2;
                        if (string != null) break block2;
                        if (shape == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    shape = shape2;
                }
                rectangle = shape.getBounds();
                break block4;
            }
            rectangle = jComponent.getVisibleRect();
        }
        Rectangle rectangle2 = rectangle;
        graphics.fillRect(rectangle2.x, rectangle2.y, rectangle2.width, rectangle2.height);
    }

    public static void G(JButton jButton) {
        jButton.setUI(new BasicButtonUI());
        jButton.setMargin(new Insets(0, 0, 0, 0));
        jButton.setBorder(null);
        jButton.setBorderPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setFocusable(false);
        jButton.setOpaque(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Shape K(int n10, int[] nArray) {
        int n11;
        String string;
        block8: {
            block9: {
                int[] nArray2;
                block7: {
                    string = FV.D();
                    try {
                        nArray2 = nArray;
                        if (string != null) break block7;
                        if (nArray2 == null) throw new RuntimeException(GA.a(-31907, 10790));
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    nArray2 = nArray;
                }
                try {
                    try {
                        n11 = nArray2.length % 2;
                        if (string != null) break block8;
                        if (n11 == 0) break block9;
                        throw new RuntimeException(GA.a(-31907, 10790));
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            n11 = nArray.length / 2;
        }
        Point[] pointArray = new Point[n11];
        for (int i2 = 0; i2 < nArray.length; i2 += 2) {
            pointArray[i2 / 2] = new Point(nArray[i2], nArray[i2 + 1]);
            if (string == null) continue;
        }
        return GA.a(n10, pointArray);
    }

    public static Shape a(int n10, Point[] pointArray) {
        return GA.m(n10, pointArray, null);
    }

    /*
     * Unable to fully structure code
     */
    public static Shape m(int var0, Point[] var1_1, boolean[] var2_2) {
        block64: {
            block63: {
                block62: {
                    block61: {
                        var3_3 = FV.D();
                        try {
                            v0 = var1_1;
                            if (var3_3 != null) break block61;
                            if (v0 != null) {
                            }
                            ** GOTO lbl14
                        }
                        catch (RuntimeException v1) {
                            throw GA.a(v1);
                        }
                        v0 = var1_1;
                    }
                    try {
                        if (v0.length >= 3) break block62;
lbl14:
                        // 2 sources

                        throw new RuntimeException(GA.a(-31934, -12111));
                    }
                    catch (RuntimeException v2) {
                        throw GA.a(v2);
                    }
                }
                try {
                    v3 = var2_2;
                    if (var3_3 != null) break block63;
                    if (v3 == null) break block64;
                }
                catch (RuntimeException v4) {
                    throw GA.a(v4);
                }
                v3 = var2_2;
            }
            try {
                if (v3.length != var1_1.length) {
                    throw new RuntimeException(GA.a(-31918, 17304));
                }
            }
            catch (RuntimeException v5) {
                throw GA.a(v5);
            }
        }
        var4_4 = new GeneralPath(0);
        for (var5_5 = 0; var5_5 < var1_1.length; ++var5_5) {
            block79: {
                block78: {
                    block77: {
                        block75: {
                            block74: {
                                block65: {
                                    block73: {
                                        block71: {
                                            block70: {
                                                block69: {
                                                    block68: {
                                                        block66: {
                                                            block67: {
                                                                var6_6 = var1_1[var5_5];
                                                                try {
                                                                    v6 = var5_5;
                                                                    if (var3_3 != null) break block65;
                                                                    if (v6 == 0) {
                                                                    }
                                                                    ** GOTO lbl134
                                                                }
                                                                catch (RuntimeException v7) {
                                                                    throw GA.a(v7);
                                                                }
                                                                var7_7 = var1_1[var1_1.length - 1];
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var3_3 != null) break block66;
                                                                            if (var0 != 0) {
                                                                            }
                                                                            ** GOTO lbl76
                                                                        }
                                                                        catch (RuntimeException v8) {
                                                                            throw GA.a(v8);
                                                                        }
                                                                        v9 = var2_2;
                                                                        if (var3_3 != null) break block67;
                                                                    }
                                                                    catch (RuntimeException v10) {
                                                                        throw GA.a(v10);
                                                                    }
                                                                    if (v9 != null) {
                                                                    }
                                                                    ** GOTO lbl83
                                                                }
                                                                catch (RuntimeException v11) {
                                                                    throw GA.a(v11);
                                                                }
                                                                v9 = var2_2;
                                                            }
                                                            try {
                                                                try {
                                                                    v12 = v9[var1_1.length - 1];
                                                                    if (var3_3 != null) break block68;
                                                                    if (v12 == 0) {
                                                                    }
                                                                    ** GOTO lbl83
                                                                }
                                                                catch (RuntimeException v13) {
                                                                    throw GA.a(v13);
                                                                }
lbl76:
                                                                // 2 sources

                                                                var4_4.moveTo(var7_7.x, var7_7.y);
                                                            }
                                                            catch (RuntimeException v14) {
                                                                throw GA.a(v14);
                                                            }
                                                        }
                                                        try {
                                                            if (var3_3 == null) break block69;
lbl83:
                                                            // 3 sources

                                                            v12 = var0;
                                                        }
                                                        catch (RuntimeException v15) {
                                                            throw GA.a(v15);
                                                        }
                                                    }
                                                    var8_8 = GA.U(v12, var7_7, var6_6);
                                                    var4_4.moveTo(var8_8.x, var8_8.y);
                                                }
                                                try {
                                                    try {
                                                        if (var0 != 0) {
                                                            v16 = var2_2;
                                                            if (var3_3 != null) break block70;
                                                        }
                                                        ** GOTO lbl116
                                                    }
                                                    catch (RuntimeException v17) {
                                                        throw GA.a(v17);
                                                    }
                                                    if (v16 != null) {
                                                    }
                                                    ** GOTO lbl121
                                                }
                                                catch (RuntimeException v18) {
                                                    throw GA.a(v18);
                                                }
                                                v16 = var2_2;
                                            }
                                            try {
                                                block72: {
                                                    try {
                                                        try {
                                                            v19 = v16[var5_5];
                                                            if (var3_3 != null) break block71;
                                                            if (v19 != 0) break block72;
                                                        }
                                                        catch (RuntimeException v20) {
                                                            throw GA.a(v20);
                                                        }
lbl116:
                                                        // 2 sources

                                                        var4_4.lineTo(var6_6.x, var6_6.y);
                                                        if (var3_3 == null) break block73;
                                                    }
                                                    catch (RuntimeException v21) {
                                                        throw GA.a(v21);
                                                    }
                                                }
                                                v19 = var0;
                                            }
                                            catch (RuntimeException v22) {
                                                throw GA.a(v22);
                                            }
                                        }
                                        var8_8 = GA.U(v19, var6_6, var7_7);
                                        var9_9 = GA.U(var0, var6_6, var1_1[var5_5 + 1]);
                                        var4_4.lineTo(var8_8.x, var8_8.y);
                                        var4_4.quadTo(var6_6.x, var6_6.y, var9_9.x, var9_9.y);
                                    }
                                    try {
                                        if (var3_3 == null) continue;
lbl134:
                                        // 2 sources

                                        v6 = var0;
                                    }
                                    catch (RuntimeException v23) {
                                        throw GA.a(v23);
                                    }
                                }
                                try {
                                    try {
                                        if (v6 != 0) {
                                            v24 = var2_2;
                                            if (var3_3 != null) break block74;
                                        }
                                        ** GOTO lbl164
                                    }
                                    catch (RuntimeException v25) {
                                        throw GA.a(v25);
                                    }
                                    if (v24 != null) {
                                    }
                                    ** GOTO lbl169
                                }
                                catch (RuntimeException v26) {
                                    throw GA.a(v26);
                                }
                                v24 = var2_2;
                            }
                            try {
                                block76: {
                                    try {
                                        try {
                                            v27 = v24[var5_5];
                                            if (var3_3 != null) break block75;
                                            if (v27 != 0) break block76;
                                        }
                                        catch (RuntimeException v28) {
                                            throw GA.a(v28);
                                        }
lbl164:
                                        // 2 sources

                                        var4_4.lineTo(var6_6.x, var6_6.y);
                                        if (var3_3 == null) continue;
                                    }
                                    catch (RuntimeException v29) {
                                        throw GA.a(v29);
                                    }
                                }
                                v27 = var0;
                            }
                            catch (RuntimeException v30) {
                                throw GA.a(v30);
                            }
                        }
                        var7_7 = GA.U(v27, var6_6, var1_1[var5_5 - 1]);
                        try {
                            try {
                                v31 = var0;
                                v32 = var6_6;
                                v33 = var1_1;
                                v34 = var5_5;
                                v35 = var1_1.length - 1;
                                if (var3_3 != null) break block77;
                                if (v34 >= v35) break block78;
                            }
                            catch (RuntimeException v36) {
                                throw GA.a(v36);
                            }
                            v34 = var5_5;
                            v35 = 1;
                        }
                        catch (RuntimeException v37) {
                            throw GA.a(v37);
                        }
                    }
                    v38 = v34 + v35;
                    break block79;
                }
                v38 = 0;
            }
            var8_8 = GA.U(v31, v32, v33[v38]);
            var4_4.lineTo(var7_7.x, var7_7.y);
            var4_4.quadTo(var6_6.x, var6_6.y, var8_8.x, var8_8.y);
            if (var3_3 == null) continue;
        }
        return var4_4;
    }

    private static Point U(int n10, Point point, Point point2) {
        block22: {
            Point point3;
            block23: {
                int n11;
                int n12;
                block21: {
                    String string;
                    block17: {
                        block18: {
                            Point point4;
                            block19: {
                                block20: {
                                    string = FV.D();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n12 = point.y;
                                                    n11 = point2.y;
                                                    if (string != null) break block17;
                                                    if (n12 != n11) break block18;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw GA.a(runtimeException);
                                                }
                                                point4 = point;
                                                if (string != null) break block19;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw GA.a(runtimeException);
                                            }
                                            if (point4.x >= point2.x) break block20;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw GA.a(runtimeException);
                                        }
                                        return new Point(point.x + Math.min(n10, (point2.x - point.x) / 2), point.y);
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw GA.a(runtimeException);
                                    }
                                }
                                point4 = new Point(point.x - Math.min(n10, (point.x - point2.x) / 2), point.y);
                            }
                            return point4;
                        }
                        n12 = point.x;
                        n11 = point2.x;
                    }
                    try {
                        try {
                            try {
                                if (string != null) break block21;
                                if (n12 != n11) break block22;
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                            point3 = point;
                            if (string != null) break block23;
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                        n12 = point3.y;
                        n11 = point2.y;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                }
                try {
                    if (n12 < n11) {
                        return new Point(point.x, point.y + Math.min(n10, (point2.y - point.y) / 2));
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
                point3 = new Point(point.x, point.y - Math.min(n10, (point.y - point2.y) / 2));
            }
            return point3;
        }
        return null;
    }

    public static void r(Graphics2D graphics2D, Rectangle rectangle) {
        GA.o(graphics2D, rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public static void o(Graphics2D graphics2D, int n10, int n11, int n12, int n13) {
        GA.r(graphics2D, n10, n11, n12, n13, GO.FD);
    }

    public static void e(Graphics2D graphics2D, Rectangle rectangle, int n10) {
        GA.r(graphics2D, rectangle.x, rectangle.y, rectangle.width, rectangle.height, n10);
    }

    public static void r(Graphics2D graphics2D, int n10, int n11, int n12, int n13, int n14) {
        GA.h(graphics2D, n10, n11, n12, n13, n14, GO.v, GO.i);
    }

    public static void F(Graphics2D graphics2D, Rectangle rectangle, int n10, Color color, Color color2) {
        GA.h(graphics2D, rectangle.x, rectangle.y, rectangle.width, rectangle.height, n10, color, color2);
    }

    public static void h(Graphics2D graphics2D, int n10, int n11, int n12, int n13, int n14, Color color, Color color2) {
        int n15 = n12 / n14 + 1;
        int n16 = n13 / n14 + 1;
        int n17 = 0;
        String string = FV.D();
        block16: while (true) {
            int n18 = n17;
            block17: while (n18 < n15) {
                int n19 = 0;
                while (n19 < n16) {
                    block21: {
                        block22: {
                            int n20;
                            int n21;
                            block28: {
                                block26: {
                                    int n22;
                                    int n23;
                                    block25: {
                                        int n24;
                                        block27: {
                                            block24: {
                                                int n25;
                                                int n26;
                                                block23: {
                                                    Color color3;
                                                    boolean bl;
                                                    block19: {
                                                        block20: {
                                                            n18 = (n17 + n19) % 2;
                                                            if (string != null) continue block17;
                                                            try {
                                                                if (string != null) break block19;
                                                                if (n18 != 0) break block20;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw GA.a(runtimeException);
                                                            }
                                                            bl = true;
                                                            break block19;
                                                        }
                                                        bl = false;
                                                    }
                                                    boolean bl2 = bl;
                                                    try {
                                                        color3 = bl2 ? color : color2;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw GA.a(runtimeException);
                                                    }
                                                    Color color4 = color3;
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (string != null) break block21;
                                                                    if (color4 == null) break block22;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw GA.a(runtimeException);
                                                                }
                                                                graphics2D.setPaint(color4);
                                                                n26 = n10 + n17 * n14 + n14;
                                                                n25 = n10 + n12;
                                                                if (string != null) break block23;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw GA.a(runtimeException);
                                                            }
                                                            if (n26 <= n25) break block24;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw GA.a(runtimeException);
                                                        }
                                                        n26 = n12;
                                                        n25 = n17 * n14;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw GA.a(runtimeException);
                                                    }
                                                }
                                                n24 = n26 - n25;
                                                break block27;
                                            }
                                            n24 = n14;
                                        }
                                        n21 = n24;
                                        try {
                                            try {
                                                n23 = n11 + n19 * n14 + n14;
                                                n22 = n11 + n13;
                                                if (string != null) break block25;
                                                if (n23 <= n22) break block26;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw GA.a(runtimeException);
                                            }
                                            n23 = n13;
                                            n22 = n19 * n14;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw GA.a(runtimeException);
                                        }
                                    }
                                    n20 = n23 - n22;
                                    break block28;
                                }
                                n20 = n14;
                            }
                            int n27 = n20;
                            graphics2D.fillRect(n10 + n17 * n14, n11 + n19 * n14, n21, n27);
                        }
                        ++n19;
                    }
                    if (string == null) continue;
                }
                ++n17;
                if (string == null) continue block16;
            }
            break;
        }
    }

    public static Rectangle M(String string, Graphics graphics, Font font) {
        return GA.h(string, (Graphics2D)graphics, font);
    }

    public static Rectangle h(String string, Graphics2D graphics2D, Font font) {
        FontRenderContext fontRenderContext = graphics2D.getFontRenderContext();
        GlyphVector glyphVector = font.createGlyphVector(fontRenderContext, string);
        return glyphVector.getVisualBounds().getBounds();
    }

    public static Shape z(Graphics2D graphics2D, JComponent jComponent) {
        return GA.x(graphics2D, jComponent, GO.r, GO.FG, GO.Fx);
    }

    public static Shape x(Graphics2D graphics2D, JComponent jComponent, Color color, int n10, int n11) {
        return GA.i(graphics2D, jComponent, color, n10, n11, true);
    }

    public static Shape i(Graphics2D graphics2D, JComponent jComponent, Color color, int n10, int n11, boolean bl) {
        return GA.r(graphics2D, jComponent, color, n10, n11, bl, false);
    }

    public static Shape r(Graphics2D graphics2D, JComponent jComponent, Color color, int n10, int n11, boolean bl, boolean bl2) {
        return GA.m(graphics2D, jComponent, color, n10, n11, bl, bl2, GO.Ff, GO.FX);
    }

    public static Shape O(Graphics2D graphics2D, JComponent jComponent, Color color, int n10, int n11, boolean bl, boolean bl2, float f10) {
        return GA.Y(graphics2D, jComponent, color, n10, n11, bl, bl2, GO.Ff, GO.FX, f10);
    }

    public static Shape R(Graphics2D graphics2D, JComponent jComponent, Color color, int n10, int n11, boolean bl, boolean bl2, Color color2) {
        return GA.m(graphics2D, jComponent, color, n10, n11, bl, bl2, color2, color2);
    }

    public static Shape m(Graphics2D graphics2D, JComponent jComponent, Color color, int n10, int n11, boolean bl, boolean bl2, Color color2, Color color3) {
        return GA.Y(graphics2D, jComponent, color, n10, n11, bl, bl2, color2, color3, 1.0f);
    }

    public static Shape Y(Graphics2D graphics2D, JComponent jComponent, Color color, int n10, int n11, boolean bl, boolean bl2, Color color2, Color color3, float f10) {
        return GA.Z(graphics2D, jComponent, color, n10, n11, bl, bl2, color2, color3, jComponent.getBackground(), f10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Shape Z(Graphics2D var0, JComponent var1_1, Color var2_2, int var3_3, int var4_4, boolean var5_5, boolean var6_6, Color var7_7, Color var8_8, Color var9_9, float var10_10) {
        block47: {
            block48: {
                block44: {
                    block46: {
                        block45: {
                            block40: {
                                block43: {
                                    block49: {
                                        block42: {
                                            block41: {
                                                block38: {
                                                    block39: {
                                                        block36: {
                                                            block37: {
                                                                block35: {
                                                                    block34: {
                                                                        var11_11 = FV.D();
                                                                        try {
                                                                            try {
                                                                                cfr_temp_0 = var10_10 - 0.0f;
                                                                                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                if (var11_11 != null) break block34;
                                                                                if (v0 > 0) {
                                                                                }
                                                                                ** GOTO lbl20
                                                                            }
                                                                            catch (RuntimeException v1) {
                                                                                throw GA.a(v1);
                                                                            }
                                                                            cfr_temp_1 = var10_10 - 1.0f;
                                                                            v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                        }
                                                                        catch (RuntimeException v2) {
                                                                            throw GA.a(v2);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v0 <= 0) break block35;
lbl20:
                                                                        // 2 sources

                                                                        return null;
                                                                    }
                                                                    catch (RuntimeException v3) {
                                                                        throw GA.a(v3);
                                                                    }
                                                                }
                                                                var12_12 = RV.X(var0);
                                                                try {
                                                                    v4 = var0;
                                                                    v5 = Float.valueOf(var10_10);
                                                                    cfr_temp_2 = var10_10 - 1.0f;
                                                                    v6 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                                                    if (var11_11 != null) break block36;
                                                                    if (v6 >= 0) break block37;
                                                                }
                                                                catch (RuntimeException v7) {
                                                                    throw GA.a(v7);
                                                                }
                                                                v6 = (float)true;
                                                                break block36;
                                                            }
                                                            v6 = (float)false;
                                                        }
                                                        var13_13 = RV.a(v4, v5, (boolean)v6);
                                                        var14_14 = GA.X(var1_1, var3_3, var4_4);
                                                        try {
                                                            try {
                                                                try {
                                                                    v8 = var1_1.isEnabled();
                                                                    if (var11_11 != null) break block38;
                                                                    if (!v8) break block39;
                                                                }
                                                                catch (RuntimeException v9) {
                                                                    throw GA.a(v9);
                                                                }
                                                                if (var2_2 == null) break block39;
                                                            }
                                                            catch (RuntimeException v10) {
                                                                throw GA.a(v10);
                                                            }
                                                            RV.Y(var0, var14_14, var2_2, var3_3);
                                                        }
                                                        catch (RuntimeException v11) {
                                                            throw GA.a(v11);
                                                        }
                                                    }
                                                    v8 = var5_5;
                                                }
                                                try {
                                                    try {
                                                        if (!v8) break block40;
                                                        v12 = var0;
                                                        v13 = var6_6;
                                                        if (var11_11 != null) break block41;
                                                    }
                                                    catch (RuntimeException v14) {
                                                        throw GA.a(v14);
                                                    }
                                                    if (v13 == 0) break block42;
                                                }
                                                catch (RuntimeException v15) {
                                                    throw GA.a(v15);
                                                }
                                                v13 = 0;
                                            }
                                            v16 /* !! */  = GA.m(v13, var3_3, 0, var1_1.getHeight() - var3_3);
                                            break block49;
                                        }
                                        v16 /* !! */  = var9_9;
                                    }
                                    try {
                                        try {
                                            v12.setPaint(v16 /* !! */ );
                                            if (var11_11 != null) break block43;
                                            if (var4_4 > 0) {
                                            }
                                            ** GOTO lbl98
                                        }
                                        catch (RuntimeException v17) {
                                            throw GA.a(v17);
                                        }
                                        var0.fillRoundRect(var3_3, var3_3, var1_1.getWidth() - var3_3 * 2, var1_1.getHeight() - var3_3 * 2, var4_4 * 2 + 2, var4_4 * 2 + 2);
                                    }
                                    catch (RuntimeException v18) {
                                        throw GA.a(v18);
                                    }
                                }
                                try {
                                    if (var11_11 == null) break block40;
lbl98:
                                    // 2 sources

                                    var0.fillRect(var3_3, var3_3, var1_1.getWidth() - var3_3 * 2, var1_1.getHeight() - var3_3 * 2);
                                }
                                catch (RuntimeException v19) {
                                    throw GA.a(v19);
                                }
                            }
                            try {
                                try {
                                    if (var7_7 == null) break block44;
                                    v20 = var0;
                                    if (!var1_1.isEnabled()) break block45;
                                }
                                catch (RuntimeException v21) {
                                    throw GA.a(v21);
                                }
                                v22 = var7_7;
                                break block46;
                            }
                            catch (RuntimeException v23) {
                                throw GA.a(v23);
                            }
                        }
                        v22 = var8_8;
                    }
                    v20.setPaint(v22);
                    var0.draw(var14_14);
                }
                try {
                    v24 = var0;
                    v25 = var13_13;
                    cfr_temp_3 = var10_10 - 1.0f;
                    v26 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                    if (var11_11 != null) break block47;
                    if (v26 >= 0) break block48;
                }
                catch (RuntimeException v27) {
                    throw GA.a(v27);
                }
                v26 = (float)true;
                break block47;
            }
            v26 = (float)false;
        }
        RV.E(v24, v25, (boolean)v26);
        RV.X(var0, var12_12);
        return var14_14;
    }

    public static GradientPaint w(Rectangle rectangle) {
        return GA.m(rectangle.x, rectangle.y, rectangle.x, rectangle.y + rectangle.height);
    }

    public static GradientPaint m(int n10, int n11, int n12, int n13) {
        String string;
        block5: {
            String string2;
            Map map;
            block4: {
                string = n10 + ";" + n11 + ";" + n12 + ";" + n13;
                String string3 = FV.D();
                try {
                    try {
                        map = i;
                        string2 = string;
                        if (string3 != null) break block4;
                        if (!map.containsKey(string2)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    map = i;
                    string2 = string;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            return (GradientPaint)map.get(string2);
        }
        GradientPaint gradientPaint = new GradientPaint(n10, n11, GO.FR, n12, n13, GO.Q);
        i.put(string, gradientPaint);
        return gradientPaint;
    }

    public static Shape X(JComponent jComponent, int n10, int n11) {
        try {
            if (n11 > 0) {
                return new RoundRectangle2D.Double(n10, n10, jComponent.getWidth() - n10 * 2 - 1, jComponent.getHeight() - n10 * 2 - 1, n11 * 2, n11 * 2);
            }
        }
        catch (RuntimeException runtimeException) {
            throw GA.a(runtimeException);
        }
        return new Rectangle2D.Double(n10, n10, jComponent.getWidth() - n10 * 2 - 1, jComponent.getHeight() - n10 * 2 - 1);
    }

    public static void i(Graphics2D graphics2D, JComponent jComponent, Shape shape, Color color, int n10, boolean bl, boolean bl2) {
        GA.e(graphics2D, jComponent, shape, color, n10, bl, bl2, (Color)cy_1.F, Color.LIGHT_GRAY);
    }

    public static void e(Graphics2D graphics2D, JComponent jComponent, Shape shape, Color color, int n10, boolean bl, boolean bl2, Color color2, Color color3) {
        GA.R(graphics2D, jComponent, shape, color, n10, bl, bl2, color2, color3, jComponent.getBackground());
    }

    /*
     * Unable to fully structure code
     */
    public static void R(Graphics2D var0, JComponent var1_1, Shape var2_2, Color var3_3, int var4_4, boolean var5_5, boolean var6_6, Color var7_7, Color var8_8, Color var9_9) {
        block17: {
            block19: {
                block18: {
                    block16: {
                        block15: {
                            block13: {
                                block14: {
                                    var11_10 = RV.X(var0);
                                    var10_11 = FV.D();
                                    try {
                                        try {
                                            v0 = var1_1.isEnabled();
                                            if (var10_11 != null) break block13;
                                            if (!v0) break block14;
                                        }
                                        catch (RuntimeException v1) {
                                            throw GA.a(v1);
                                        }
                                        RV.Y(var0, var2_2, var3_3, var4_4);
                                    }
                                    catch (RuntimeException v2) {
                                        throw GA.a(v2);
                                    }
                                }
                                v0 = var5_5;
                            }
                            try {
                                if (var10_11 != null) break block15;
                                if (!v0) break block16;
                            }
                            catch (RuntimeException v3) {
                                throw GA.a(v3);
                            }
                            v0 = var6_6;
                        }
                        if (!v0) ** GOTO lbl32
                        var12_12 = var2_2.getBounds();
                        try {
                            var0.setPaint(new GradientPaint(0.0f, var12_12.y, GO.FR, 0.0f, var12_12.y + var12_12.height, GO.Q));
                            var0.fill(var2_2);
                            if (var10_11 == null) break block16;
lbl32:
                            // 2 sources

                            var0.setPaint(var9_9);
                            var0.fill(var2_2);
                        }
                        catch (RuntimeException v4) {
                            throw GA.a(v4);
                        }
                    }
                    try {
                        try {
                            if (var7_7 == null) break block17;
                            v5 = var0;
                            if (!var1_1.isEnabled()) break block18;
                        }
                        catch (RuntimeException v6) {
                            throw GA.a(v6);
                        }
                        v7 = var7_7;
                        break block19;
                    }
                    catch (RuntimeException v8) {
                        throw GA.a(v8);
                    }
                }
                v7 = var8_8;
            }
            v5.setPaint(v7);
            var0.draw(var2_2);
        }
        RV.X(var0, var11_10);
    }

    public static boolean w(Graphics2D graphics2D, JComponent jComponent, hq_0 hq_02, int n10, int n11) {
        return GA.m(graphics2D, jComponent, hq_02, n10, n11, null);
    }

    public static boolean m(Graphics2D graphics2D, JComponent jComponent, hq_0 hq_02, int n10, int n11, Boolean bl) {
        return GA.b(graphics2D, jComponent, hq_02, n10, n11, bl, null);
    }

    public static boolean b(Graphics2D graphics2D, JComponent jComponent, hq_0 hq_02, int n10, int n11, Boolean bl, Boolean bl2) {
        Color color;
        Boolean bl3;
        Boolean bl4;
        int n12;
        int n13;
        hq_0 hq_03;
        JComponent jComponent2;
        Graphics2D graphics2D2;
        try {
            graphics2D2 = graphics2D;
            jComponent2 = jComponent;
            hq_03 = hq_02;
            n13 = n10;
            n12 = n11;
            bl4 = bl;
            bl3 = bl2;
            color = hq_02.equals((Object)hq_0.componentFocus) ? GO.x : GO.c;
        }
        catch (RuntimeException runtimeException) {
            throw GA.a(runtimeException);
        }
        return GA.W(graphics2D2, jComponent2, hq_03, n13, n12, bl4, bl3, color);
    }

    public static boolean W(Graphics2D graphics2D, JComponent jComponent, hq_0 hq_02, int n10, int n11, Boolean bl, Boolean bl2, Color color) {
        Stroke stroke;
        Color color2;
        Boolean bl3;
        Boolean bl4;
        int n12;
        int n13;
        hq_0 hq_03;
        JComponent jComponent2;
        Graphics2D graphics2D2;
        try {
            graphics2D2 = graphics2D;
            jComponent2 = jComponent;
            hq_03 = hq_02;
            n13 = n10;
            n12 = n11;
            bl4 = bl;
            bl3 = bl2;
            color2 = color;
            stroke = hq_02.equals((Object)hq_0.componentFocus) ? GO.B : GO.FE;
        }
        catch (RuntimeException runtimeException) {
            throw GA.a(runtimeException);
        }
        return GA.j(graphics2D2, jComponent2, hq_03, n13, n12, bl4, bl3, color2, stroke);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean j(Graphics2D var0, JComponent var1_1, hq_0 var2_2, int var3_3, int var4_4, Boolean var5_5, Boolean var6_6, Color var7_7, Stroke var8_8) {
        block36: {
            block37: {
                block38: {
                    block39: {
                        block34: {
                            block35: {
                                block33: {
                                    block32: {
                                        block31: {
                                            block30: {
                                                block29: {
                                                    var9_9 = FV.D();
                                                    try {
                                                        v0 = var6_6;
                                                        if (var9_9 != null) break block29;
                                                        if (v0 == null) break block30;
                                                    }
                                                    catch (RuntimeException v1) {
                                                        throw GA.a(v1);
                                                    }
                                                    v0 = var6_6;
                                                }
                                                v2 = v0;
                                                break block33;
                                            }
                                            try {
                                                try {
                                                    v2 = var1_1.hasFocus();
                                                    if (var9_9 != null) break block31;
                                                    if (!v2) break block32;
                                                }
                                                catch (RuntimeException v3) {
                                                    throw GA.a(v3);
                                                }
                                                v2 = var1_1.isEnabled();
                                            }
                                            catch (RuntimeException v4) {
                                                throw GA.a(v4);
                                            }
                                        }
                                        try {
                                            if (var9_9 != null) break block33;
                                            if (!v2) break block32;
                                        }
                                        catch (RuntimeException v5) {
                                            throw GA.a(v5);
                                        }
                                        v2 = true;
                                        break block33;
                                    }
                                    v2 = false;
                                }
                                var6_6 = v2;
                                try {
                                    try {
                                        try {
                                            v6 = var6_6;
                                            if (var9_9 != null) break block34;
                                            if (!v6) break block35;
                                        }
                                        catch (RuntimeException v7) {
                                            throw GA.a(v7);
                                        }
                                        v6 = var2_2.equals((Object)hq_0.componentFocus);
                                        if (var9_9 != null) break block34;
                                    }
                                    catch (RuntimeException v8) {
                                        throw GA.a(v8);
                                    }
                                    if (!v6) break block35;
                                }
                                catch (RuntimeException v9) {
                                    throw GA.a(v9);
                                }
                                var10_10 = RV.X(var0);
                                var11_12 = RV.M(var0, var8_8);
                                var0.setPaint(var7_7);
                                var0.draw(GA.n(var1_1, var2_2, var3_3, var4_4));
                                RV.p(var0, var11_12);
                                RV.X(var0, var10_10);
                                return true;
                            }
                            v6 = var2_2.equals((Object)hq_0.fieldFocus);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var9_9 != null) break block36;
                                            if (!v6) break block37;
                                        }
                                        catch (RuntimeException v10) {
                                            throw GA.a(v10);
                                        }
                                        v11 = var6_6;
                                        if (var9_9 != null) break block38;
                                    }
                                    catch (RuntimeException v12) {
                                        throw GA.a(v12);
                                    }
                                    if (!v11.booleanValue()) {
                                    }
                                    ** GOTO lbl106
                                }
                                catch (RuntimeException v13) {
                                    throw GA.a(v13);
                                }
                                v14 = var5_5;
                                if (var9_9 != null) break block39;
                            }
                            catch (RuntimeException v15) {
                                throw GA.a(v15);
                            }
                            if (v14 == null) break block37;
                        }
                        catch (RuntimeException v16) {
                            throw GA.a(v16);
                        }
                        v14 = var5_5;
                    }
                    try {
                        try {
                            v6 = v14;
                            if (var9_9 != null) break block36;
                            if (!v6) break block37;
                        }
                        catch (RuntimeException v17) {
                            throw GA.a(v17);
                        }
lbl106:
                        // 2 sources

                        v11 = RV.X(var0);
                    }
                    catch (RuntimeException v18) {
                        throw GA.a(v18);
                    }
                }
                var10_11 = v11;
                var11_13 = RV.M(var0, var8_8);
                var0.setPaint(var7_7);
                var0.draw(GA.n(var1_1, var2_2, var3_3, var4_4));
                RV.p(var0, var11_13);
                RV.X(var0, var10_11);
                return true;
            }
            v6 = false;
        }
        return v6;
    }

    public static Shape n(JComponent jComponent, hq_0 hq_02, int n10, int n11) {
        int n12;
        int n13;
        block11: {
            block12: {
                int n14;
                String string;
                block9: {
                    block10: {
                        string = FV.D();
                        try {
                            n14 = hq_02.equals((Object)hq_0.componentFocus);
                            if (string != null) break block9;
                            if (n14 == 0) break block10;
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                        n14 = 2;
                        break block9;
                    }
                    n14 = 0;
                }
                n13 = n14;
                try {
                    try {
                        n12 = hq_02.equals((Object)hq_0.componentFocus);
                        if (string != null) break block11;
                        if (n12 == 0) break block12;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    n12 = Math.max(0, n11 - 2);
                    break block11;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            n12 = n11;
        }
        n11 = n12;
        try {
            if (n11 > 0) {
                return new RoundRectangle2D.Double(n10 + n13, n10 + n13, jComponent.getWidth() - n10 * 2 - n13 * 2 - 1, jComponent.getHeight() - n10 * 2 - n13 * 2 - 1, n11 * 2, n11 * 2);
            }
        }
        catch (RuntimeException runtimeException) {
            throw GA.a(runtimeException);
        }
        return new Rectangle2D.Double(n10 + n13, n10 + n13, jComponent.getWidth() - n10 * 2 - n13 * 2 - 1, jComponent.getHeight() - n10 * 2 - n13 * 2 - 1);
    }

    public static void i(Graphics2D graphics2D, JComponent jComponent, hq_0 hq_02, Shape shape) {
        GA.U(graphics2D, jComponent, hq_02, shape, null);
    }

    public static void U(Graphics2D graphics2D, JComponent jComponent, hq_0 hq_02, Shape shape, Boolean bl) {
        GA.l(graphics2D, jComponent, hq_02, shape, bl, null);
    }

    /*
     * Unable to fully structure code
     */
    public static void l(Graphics2D var0, JComponent var1_1, hq_0 var2_2, Shape var3_3, Boolean var4_4, Boolean var5_5) {
        block41: {
            block43: {
                block44: {
                    block42: {
                        block40: {
                            block39: {
                                block38: {
                                    block37: {
                                        block36: {
                                            block35: {
                                                var6_6 = FV.D();
                                                try {
                                                    v0 = var5_5;
                                                    if (var6_6 != null) break block35;
                                                    if (v0 == null) break block36;
                                                }
                                                catch (RuntimeException v1) {
                                                    throw GA.a(v1);
                                                }
                                                v0 = var5_5;
                                            }
                                            v2 = v0;
                                            break block39;
                                        }
                                        try {
                                            try {
                                                v2 = var1_1.hasFocus();
                                                if (var6_6 != null) break block37;
                                                if (!v2) break block38;
                                            }
                                            catch (RuntimeException v3) {
                                                throw GA.a(v3);
                                            }
                                            v2 = var1_1.isEnabled();
                                        }
                                        catch (RuntimeException v4) {
                                            throw GA.a(v4);
                                        }
                                    }
                                    try {
                                        if (var6_6 != null) break block39;
                                        if (!v2) break block38;
                                    }
                                    catch (RuntimeException v5) {
                                        throw GA.a(v5);
                                    }
                                    v2 = true;
                                    break block39;
                                }
                                v2 = false;
                            }
                            var5_5 = v2;
                            try {
                                try {
                                    try {
                                        v6 = var5_5;
                                        if (var6_6 != null) break block40;
                                        if (v6) {
                                        }
                                        ** GOTO lbl67
                                    }
                                    catch (RuntimeException v7) {
                                        throw GA.a(v7);
                                    }
                                    v6 = var2_2.equals((Object)hq_0.componentFocus);
                                    if (var6_6 != null) break block40;
                                }
                                catch (RuntimeException v8) {
                                    throw GA.a(v8);
                                }
                                if (v6) {
                                }
                                ** GOTO lbl67
                            }
                            catch (RuntimeException v9) {
                                throw GA.a(v9);
                            }
                            var7_7 = RV.X(var0);
                            var8_8 = RV.M(var0, GO.B);
                            try {
                                var0.setPaint(GO.x);
                                var0.draw(var3_3);
                                RV.p(var0, var8_8);
                                RV.X(var0, var7_7);
                                if (var6_6 == null) break block41;
lbl67:
                                // 3 sources

                                v6 = var2_2.equals((Object)hq_0.fieldFocus);
                            }
                            catch (RuntimeException v10) {
                                throw GA.a(v10);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var6_6 != null) break block42;
                                    if (!v6) break block41;
                                }
                                catch (RuntimeException v11) {
                                    throw GA.a(v11);
                                }
                                v12 = var5_5;
                                if (var6_6 != null) break block43;
                            }
                            catch (RuntimeException v13) {
                                throw GA.a(v13);
                            }
                            v6 = v12.booleanValue();
                        }
                        catch (RuntimeException v14) {
                            throw GA.a(v14);
                        }
                    }
                    try {
                        try {
                            if (!v6) {
                                v12 = var4_4;
                                if (var6_6 != null) break block44;
                            }
                            ** GOTO lbl112
                        }
                        catch (RuntimeException v15) {
                            throw GA.a(v15);
                        }
                        if (v12 == null) break block41;
                    }
                    catch (RuntimeException v16) {
                        throw GA.a(v16);
                    }
                    v12 = var4_4;
                }
                try {
                    try {
                        if (var6_6 != null) break block43;
                        if (!v12.booleanValue()) break block41;
                    }
                    catch (RuntimeException v17) {
                        throw GA.a(v17);
                    }
lbl112:
                    // 2 sources

                    v12 = RV.X(var0);
                }
                catch (RuntimeException v18) {
                    throw GA.a(v18);
                }
            }
            var7_7 = v12;
            var8_8 = RV.M(var0, GO.FE);
            try {
                v19 = var0;
                v20 = var5_5 != false ? GO.c : GO.n;
            }
            catch (RuntimeException v21) {
                throw GA.a(v21);
            }
            v19.setPaint(v20);
            var0.draw(var3_3);
            RV.p(var0, var8_8);
            RV.X(var0, var7_7);
        }
    }

    public static void H(Graphics2D graphics2D, Color color, int n10, int n11, int n12, int n13, boolean bl, boolean bl2, boolean bl3) {
        GA.t(graphics2D, color, new Rectangle(n10, n11, n12, n13), bl, bl2, bl3);
    }

    public static void S(Graphics2D graphics2D, Color color, int n10, int n11, int n12, int n13, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        GA.P(graphics2D, color, new Rectangle(n10, n11, n12, n13), bl, bl2, bl3, bl4);
    }

    public static void t(Graphics2D graphics2D, Color color, Rectangle rectangle, boolean bl, boolean bl2, boolean bl3) {
        GA.P(graphics2D, color, rectangle, bl, bl2, bl3, true);
    }

    public static void P(Graphics2D graphics2D, Color color, Rectangle rectangle, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        boolean bl5;
        Area area;
        Object object;
        block39: {
            block40: {
                String string;
                block41: {
                    block42: {
                        block37: {
                            block38: {
                                block33: {
                                    block34: {
                                        block35: {
                                            block36: {
                                                rectangle = rv_2.q(rectangle);
                                                object = RV.X(graphics2D);
                                                string = FV.D();
                                                area = new Area();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                bl5 = bl2;
                                                                if (string != null) break block33;
                                                                if (!bl5) break block34;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw GA.a(runtimeException);
                                                            }
                                                            bl5 = bl;
                                                            if (string != null) break block35;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw GA.a(runtimeException);
                                                        }
                                                        if (!bl5) break block36;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw GA.a(runtimeException);
                                                    }
                                                    area.add(new Area(new Ellipse2D.Double(rectangle.x - a, rectangle.y - a, a * 2, a * 2)));
                                                    area.add(new Area(new Ellipse2D.Double(rectangle.x + rectangle.width - a, rectangle.y - a, a * 2, a * 2)));
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw GA.a(runtimeException);
                                                }
                                            }
                                            bl5 = bl4;
                                        }
                                        try {
                                            try {
                                                if (string != null) break block33;
                                                if (!bl5) break block34;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw GA.a(runtimeException);
                                            }
                                            area.add(new Area(new Ellipse2D.Double(rectangle.x + rectangle.width / 2 - a, rectangle.y - a, a * 2, a * 2)));
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw GA.a(runtimeException);
                                        }
                                    }
                                    bl5 = bl;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (string != null) break block37;
                                                if (!bl5) break block38;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw GA.a(runtimeException);
                                            }
                                            bl5 = bl4;
                                            if (string != null) break block37;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw GA.a(runtimeException);
                                        }
                                        if (!bl5) break block38;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw GA.a(runtimeException);
                                    }
                                    area.add(new Area(new Ellipse2D.Double(rectangle.x - a, rectangle.y + rectangle.height / 2 - a, a * 2, a * 2)));
                                    area.add(new Area(new Ellipse2D.Double(rectangle.x + rectangle.width - a, rectangle.y + rectangle.height / 2 - a, a * 2, a * 2)));
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                            }
                            bl5 = bl2;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (string != null) break block39;
                                        if (!bl5) break block40;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw GA.a(runtimeException);
                                    }
                                    bl5 = bl;
                                    if (string != null) break block41;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                if (!bl5) break block42;
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                            area.add(new Area(new Ellipse2D.Double(rectangle.x - a, rectangle.y + rectangle.height - a, a * 2, a * 2)));
                            area.add(new Area(new Ellipse2D.Double(rectangle.x + rectangle.width - a, rectangle.y + rectangle.height - a, a * 2, a * 2)));
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                    }
                    bl5 = bl4;
                }
                try {
                    try {
                        if (string != null) break block39;
                        if (!bl5) break block40;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    area.add(new Area(new Ellipse2D.Double(rectangle.x + rectangle.width / 2 - a, rectangle.y + rectangle.height - a, a * 2, a * 2)));
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            bl5 = bl3;
        }
        if (bl5) {
            Area area2 = new Area(new RoundRectangle2D.Double(rectangle.x - u, rectangle.y - u, rectangle.width + u * 2, rectangle.height + u * 2, 5.0, 5.0));
            area2.subtract(new Area(new RoundRectangle2D.Double(rectangle.x + u, rectangle.y + u, rectangle.width - u * 2, rectangle.height - u * 2, 3.0, 3.0)));
            area.add(area2);
        }
        RV.Y(graphics2D, area, Color.GRAY, U);
        graphics2D.setPaint(Color.GRAY);
        graphics2D.draw(area);
        graphics2D.setPaint(color);
        graphics2D.fill(area);
        RV.X(graphics2D, object);
    }

    /*
     * Unable to fully structure code
     */
    public static void S(Graphics2D var0, Color var1_1, Rectangle var2_2, int var3_3) {
        block40: {
            block47: {
                block46: {
                    block45: {
                        block44: {
                            block43: {
                                block42: {
                                    block41: {
                                        block39: {
                                            var2_2 = rv_2.q(var2_2);
                                            var5_4 = RV.X(var0);
                                            var4_5 = FV.D();
                                            try {
                                                v0 = var3_3;
                                                v1 = GA.a(14906, 1280795380835452763L);
                                                if (var4_5 != null) break block39;
                                                if (v0 == v1) {
                                                }
                                                ** GOTO lbl16
                                            }
                                            catch (RuntimeException v2) {
                                                throw GA.a(v2);
                                            }
                                            var6_6 = new Ellipse2D.Double(var2_2.x - GA.o, var2_2.y - GA.o, GA.o * 2, GA.o * 2);
                                            try {
                                                if (var4_5 == null) break block40;
lbl16:
                                                // 2 sources

                                                v0 = var3_3;
                                                v1 = 1;
                                            }
                                            catch (RuntimeException v3) {
                                                throw GA.a(v3);
                                            }
                                        }
                                        try {
                                            if (var4_5 != null) break block41;
                                            if (v0 == v1) {
                                            }
                                            ** GOTO lbl32
                                        }
                                        catch (RuntimeException v4) {
                                            throw GA.a(v4);
                                        }
                                        var6_6 = new Ellipse2D.Double(var2_2.x + var2_2.width / 2 - GA.o, var2_2.y - GA.o, GA.o * 2, GA.o * 2);
                                        try {
                                            if (var4_5 == null) break block40;
lbl32:
                                            // 2 sources

                                            v0 = var3_3;
                                            v1 = 2;
                                        }
                                        catch (RuntimeException v5) {
                                            throw GA.a(v5);
                                        }
                                    }
                                    try {
                                        if (var4_5 != null) break block42;
                                        if (v0 == v1) {
                                        }
                                        ** GOTO lbl48
                                    }
                                    catch (RuntimeException v6) {
                                        throw GA.a(v6);
                                    }
                                    var6_6 = new Ellipse2D.Double(var2_2.x + var2_2.width - GA.o, var2_2.y - GA.o, GA.o * 2, GA.o * 2);
                                    try {
                                        if (var4_5 == null) break block40;
lbl48:
                                        // 2 sources

                                        v0 = var3_3;
                                        v1 = GA.a(29499, 4558395549346877016L);
                                    }
                                    catch (RuntimeException v7) {
                                        throw GA.a(v7);
                                    }
                                }
                                try {
                                    if (var4_5 != null) break block43;
                                    if (v0 == v1) {
                                    }
                                    ** GOTO lbl64
                                }
                                catch (RuntimeException v8) {
                                    throw GA.a(v8);
                                }
                                var6_6 = new Ellipse2D.Double(var2_2.x - GA.o, var2_2.y + var2_2.height / 2 - GA.o, GA.o * 2, GA.o * 2);
                                try {
                                    if (var4_5 == null) break block40;
lbl64:
                                    // 2 sources

                                    v0 = var3_3;
                                    v1 = 3;
                                }
                                catch (RuntimeException v9) {
                                    throw GA.a(v9);
                                }
                            }
                            try {
                                if (var4_5 != null) break block44;
                                if (v0 == v1) {
                                }
                                ** GOTO lbl80
                            }
                            catch (RuntimeException v10) {
                                throw GA.a(v10);
                            }
                            var6_6 = new Ellipse2D.Double(var2_2.x + var2_2.width - GA.o, var2_2.y + var2_2.height / 2 - GA.o, GA.o * 2, GA.o * 2);
                            try {
                                if (var4_5 == null) break block40;
lbl80:
                                // 2 sources

                                v0 = var3_3;
                                v1 = GA.a(2919, 3558482257251874307L);
                            }
                            catch (RuntimeException v11) {
                                throw GA.a(v11);
                            }
                        }
                        try {
                            if (var4_5 != null) break block45;
                            if (v0 == v1) {
                            }
                            ** GOTO lbl96
                        }
                        catch (RuntimeException v12) {
                            throw GA.a(v12);
                        }
                        var6_6 = new Ellipse2D.Double(var2_2.x - GA.o, var2_2.y + var2_2.height - GA.o, GA.o * 2, GA.o * 2);
                        try {
                            if (var4_5 == null) break block40;
lbl96:
                            // 2 sources

                            v0 = var3_3;
                            v1 = 5;
                        }
                        catch (RuntimeException v13) {
                            throw GA.a(v13);
                        }
                    }
                    try {
                        if (var4_5 != null) break block46;
                        if (v0 == v1) {
                        }
                        ** GOTO lbl112
                    }
                    catch (RuntimeException v14) {
                        throw GA.a(v14);
                    }
                    var6_6 = new Ellipse2D.Double(var2_2.x + var2_2.width / 2 - GA.o, var2_2.y + var2_2.height - GA.o, GA.o * 2, GA.o * 2);
                    try {
                        if (var4_5 == null) break block40;
lbl112:
                        // 2 sources

                        v0 = var3_3;
                        v1 = 4;
                    }
                    catch (RuntimeException v15) {
                        throw GA.a(v15);
                    }
                }
                if (v0 != v1) break block47;
                var6_6 = new Ellipse2D.Double(var2_2.x + var2_2.width - GA.o, var2_2.y + var2_2.height - GA.o, GA.o * 2, GA.o * 2);
                if (var4_5 == null) break block40;
            }
            var6_6 = null;
        }
        var0.setPaint(var1_1);
        var0.fill(var6_6);
        RV.X(var0, var5_4);
    }

    public static void z(Graphics2D graphics2D, Rectangle rectangle, boolean bl, boolean bl2, boolean bl3) {
        GA.C(graphics2D, rectangle, bl, bl2, bl3, true);
    }

    /*
     * Unable to fully structure code
     */
    public static void C(Graphics2D var0, Rectangle var1_1, boolean var2_2, boolean var3_3, boolean var4_4, boolean var5_5) {
        block92: {
            block105: {
                block104: {
                    block102: {
                        block100: {
                            block89: {
                                block98: {
                                    block97: {
                                        block95: {
                                            block93: {
                                                block90: {
                                                    var1_1 = rv_2.q(var1_1);
                                                    var7_6 = GA.Y(var1_1);
                                                    var6_7 = FV.D();
                                                    try {
                                                        block91: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v0 = var4_4;
                                                                                    if (var6_7 != null) break block89;
                                                                                    if (v0) {
                                                                                    }
                                                                                    ** GOTO lbl160
                                                                                }
                                                                                catch (RuntimeException v1) {
                                                                                    throw GA.a(v1);
                                                                                }
                                                                                v2 = var2_2;
                                                                                if (var6_7 != null) break block90;
                                                                            }
                                                                            catch (RuntimeException v3) {
                                                                                throw GA.a(v3);
                                                                            }
                                                                            if (v2) break block91;
                                                                        }
                                                                        catch (RuntimeException v4) {
                                                                            throw GA.a(v4);
                                                                        }
                                                                        v2 = var3_3;
                                                                        if (var6_7 != null) break block90;
                                                                    }
                                                                    catch (RuntimeException v5) {
                                                                        throw GA.a(v5);
                                                                    }
                                                                    if (v2) break block91;
                                                                }
                                                                catch (RuntimeException v6) {
                                                                    throw GA.a(v6);
                                                                }
                                                                GA.g.n(var0, var7_6);
                                                                if (var6_7 == null) break block92;
                                                            }
                                                            catch (RuntimeException v7) {
                                                                throw GA.a(v7);
                                                            }
                                                        }
                                                        v2 = var2_2;
                                                    }
                                                    catch (RuntimeException v8) {
                                                        throw GA.a(v8);
                                                    }
                                                }
                                                try {
                                                    block94: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var6_7 != null) break block93;
                                                                                if (!v2) break block94;
                                                                            }
                                                                            catch (RuntimeException v9) {
                                                                                throw GA.a(v9);
                                                                            }
                                                                            v2 = var3_3;
                                                                            if (var6_7 != null) break block93;
                                                                        }
                                                                        catch (RuntimeException v10) {
                                                                            throw GA.a(v10);
                                                                        }
                                                                        if (v2) break block94;
                                                                    }
                                                                    catch (RuntimeException v11) {
                                                                        throw GA.a(v11);
                                                                    }
                                                                    v2 = var5_5;
                                                                    if (var6_7 != null) break block93;
                                                                }
                                                                catch (RuntimeException v12) {
                                                                    throw GA.a(v12);
                                                                }
                                                                if (!v2) break block94;
                                                            }
                                                            catch (RuntimeException v13) {
                                                                throw GA.a(v13);
                                                            }
                                                            GA.M.n(var0, var7_6);
                                                            if (var6_7 == null) break block92;
                                                        }
                                                        catch (RuntimeException v14) {
                                                            throw GA.a(v14);
                                                        }
                                                    }
                                                    v2 = var2_2;
                                                }
                                                catch (RuntimeException v15) {
                                                    throw GA.a(v15);
                                                }
                                            }
                                            try {
                                                block96: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var6_7 != null) break block95;
                                                                            if (v2) break block96;
                                                                        }
                                                                        catch (RuntimeException v16) {
                                                                            throw GA.a(v16);
                                                                        }
                                                                        v2 = var3_3;
                                                                        if (var6_7 != null) break block95;
                                                                    }
                                                                    catch (RuntimeException v17) {
                                                                        throw GA.a(v17);
                                                                    }
                                                                    if (!v2) break block96;
                                                                }
                                                                catch (RuntimeException v18) {
                                                                    throw GA.a(v18);
                                                                }
                                                                v2 = var5_5;
                                                                if (var6_7 != null) break block95;
                                                            }
                                                            catch (RuntimeException v19) {
                                                                throw GA.a(v19);
                                                            }
                                                            if (!v2) break block96;
                                                        }
                                                        catch (RuntimeException v20) {
                                                            throw GA.a(v20);
                                                        }
                                                        GA.l.n(var0, var7_6);
                                                        if (var6_7 == null) break block92;
                                                    }
                                                    catch (RuntimeException v21) {
                                                        throw GA.a(v21);
                                                    }
                                                }
                                                v2 = var2_2;
                                            }
                                            catch (RuntimeException v22) {
                                                throw GA.a(v22);
                                            }
                                        }
                                        try {
                                            if (var6_7 != null) break block97;
                                            if (!v2) break block92;
                                        }
                                        catch (RuntimeException v23) {
                                            throw GA.a(v23);
                                        }
                                        v2 = var3_3;
                                    }
                                    try {
                                        if (var6_7 != null) break block98;
                                        if (!v2) break block92;
                                    }
                                    catch (RuntimeException v24) {
                                        throw GA.a(v24);
                                    }
                                    v2 = var5_5;
                                }
                                try {
                                    try {
                                        block99: {
                                            try {
                                                if (!v2) break block99;
                                                GA.z.n(var0, var7_6);
                                                if (var6_7 == null) break block92;
                                            }
                                            catch (RuntimeException v25) {
                                                throw GA.a(v25);
                                            }
                                        }
                                        GA.V.n(var0, var7_6);
                                        if (var6_7 == null) break block92;
                                    }
                                    catch (RuntimeException v26) {
                                        throw GA.a(v26);
                                    }
lbl160:
                                    // 2 sources

                                    v0 = var2_2;
                                }
                                catch (RuntimeException v27) {
                                    throw GA.a(v27);
                                }
                            }
                            try {
                                block101: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var6_7 != null) break block100;
                                                            if (!v0) break block101;
                                                        }
                                                        catch (RuntimeException v28) {
                                                            throw GA.a(v28);
                                                        }
                                                        v0 = var3_3;
                                                        if (var6_7 != null) break block100;
                                                    }
                                                    catch (RuntimeException v29) {
                                                        throw GA.a(v29);
                                                    }
                                                    if (v0) break block101;
                                                }
                                                catch (RuntimeException v30) {
                                                    throw GA.a(v30);
                                                }
                                                v0 = var5_5;
                                                if (var6_7 != null) break block100;
                                            }
                                            catch (RuntimeException v31) {
                                                throw GA.a(v31);
                                            }
                                            if (!v0) break block101;
                                        }
                                        catch (RuntimeException v32) {
                                            throw GA.a(v32);
                                        }
                                        GA.j.n(var0, var7_6);
                                        if (var6_7 == null) break block92;
                                    }
                                    catch (RuntimeException v33) {
                                        throw GA.a(v33);
                                    }
                                }
                                v0 = var2_2;
                            }
                            catch (RuntimeException v34) {
                                throw GA.a(v34);
                            }
                        }
                        try {
                            block103: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var6_7 != null) break block102;
                                                        if (v0) break block103;
                                                    }
                                                    catch (RuntimeException v35) {
                                                        throw GA.a(v35);
                                                    }
                                                    v0 = var3_3;
                                                    if (var6_7 != null) break block102;
                                                }
                                                catch (RuntimeException v36) {
                                                    throw GA.a(v36);
                                                }
                                                if (!v0) break block103;
                                            }
                                            catch (RuntimeException v37) {
                                                throw GA.a(v37);
                                            }
                                            v0 = var5_5;
                                            if (var6_7 != null) break block102;
                                        }
                                        catch (RuntimeException v38) {
                                            throw GA.a(v38);
                                        }
                                        if (!v0) break block103;
                                    }
                                    catch (RuntimeException v39) {
                                        throw GA.a(v39);
                                    }
                                    GA.F.n(var0, var7_6);
                                    if (var6_7 == null) break block92;
                                }
                                catch (RuntimeException v40) {
                                    throw GA.a(v40);
                                }
                            }
                            v0 = var2_2;
                        }
                        catch (RuntimeException v41) {
                            throw GA.a(v41);
                        }
                    }
                    try {
                        if (var6_7 != null) break block104;
                        if (!v0) break block92;
                    }
                    catch (RuntimeException v42) {
                        throw GA.a(v42);
                    }
                    v0 = var3_3;
                }
                try {
                    if (var6_7 != null) break block105;
                    if (!v0) break block92;
                }
                catch (RuntimeException v43) {
                    throw GA.a(v43);
                }
                v0 = var5_5;
            }
            try {
                block106: {
                    try {
                        if (!v0) break block106;
                        GA.B.n(var0, var7_6);
                        if (var6_7 == null) break block92;
                    }
                    catch (RuntimeException v44) {
                        throw GA.a(v44);
                    }
                }
                GA.C.n(var0, var7_6);
            }
            catch (RuntimeException v45) {
                throw GA.a(v45);
            }
        }
    }

    public static void f(Graphics2D graphics2D, Rectangle rectangle, int n10) {
        rectangle = rv_2.q(rectangle);
        Rectangle rectangle2 = GA.Y(rectangle);
        GA.r(n10).n(graphics2D, rectangle2);
    }

    public static void k(Graphics2D graphics2D, Point point) {
        GA.j(graphics2D, point.x, point.y);
    }

    public static void j(Graphics2D graphics2D, int n10, int n11) {
        graphics2D.drawImage(x.getImage(), n10 - x.getIconWidth() / 2, n11 - x.getIconHeight() / 2, null);
    }

    private static Rectangle Y(Rectangle rectangle) {
        return new Rectangle(rectangle.x - a - U, rectangle.y - a - U, rectangle.width + a * 2 + U * 2, rectangle.height + a * 2 + U * 2);
    }

    private static pf_1 r(int n10) {
        block5: {
            Integer n11;
            Map map;
            block4: {
                String string = FV.D();
                try {
                    try {
                        map = q;
                        n11 = n10;
                        if (string != null) break block4;
                        if (!map.containsKey(n11)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    map = q;
                    n11 = n10;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            return (pf_1)map.get(n11);
        }
        pf_1 pf_12 = new pf_1(GA.class.getResource(GA.a(-31920, 24707) + n10 + GA.a(-31917, -13296)));
        q.put(n10, pf_12);
        return pf_12;
    }

    public static void h(Graphics2D graphics2D, BufferedImage bufferedImage, BufferedImage bufferedImage2, Shape shape, Shape shape2) {
        Object object = RV.X(graphics2D);
        Rectangle rectangle = shape.getBounds();
        graphics2D.setPaint(new TexturePaint(bufferedImage, new Rectangle(rectangle.getLocation(), new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight()))));
        graphics2D.fill(shape);
        Shape shape3 = graphics2D.getClip();
        Area area = new Area(shape3);
        area.intersect(new Area(shape2));
        graphics2D.setClip(area);
        graphics2D.setPaint(new TexturePaint(bufferedImage2, new Rectangle(rectangle.getLocation(), new Dimension(bufferedImage2.getWidth(), bufferedImage2.getHeight()))));
        graphics2D.fill(shape2);
        RV.Y(graphics2D, shape2, Color.BLACK, 4);
        graphics2D.setClip(shape3);
        graphics2D.setPaint(Color.DARK_GRAY);
        graphics2D.draw(shape2);
        RV.X(graphics2D, object);
    }

    public static void g(Graphics2D graphics2D, String string) {
        GA.v(graphics2D, string, Color.LIGHT_GRAY);
    }

    public static void v(Graphics2D graphics2D, String string, Color color) {
        GA.M(graphics2D, string, P9.M(color), 2, -2.0, -1.0, true);
    }

    public static void X(Graphics2D graphics2D, String string, Color color) {
        GA.M(graphics2D, string, P9.M(color), 2, -2.0, -2.0, false);
    }

    public static void M(Graphics2D graphics2D, String string, Color color, int n10, double d2, double d3, boolean bl) {
        block22: {
            int n11;
            float f10;
            Color color2;
            Composite composite;
            String string2;
            block20: {
                block21: {
                    block18: {
                        block19: {
                            float f11 = 0.8f;
                            string2 = FV.D();
                            composite = graphics2D.getComposite();
                            color2 = graphics2D.getColor();
                            f10 = 0.4f;
                            try {
                                try {
                                    try {
                                        n11 = composite instanceof AlphaComposite;
                                        if (string2 != null) break block18;
                                        if (n11 == 0) break block19;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw GA.a(runtimeException);
                                    }
                                    n11 = ((AlphaComposite)composite).getRule();
                                    if (string2 != null) break block18;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                if (n11 != 3) break block19;
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                            f10 = Math.min(((AlphaComposite)composite).getAlpha(), f10);
                        }
                        graphics2D.setColor(color);
                        graphics2D.translate(d2, d3);
                        n11 = bl ? 1 : 0;
                    }
                    try {
                        try {
                            if (string2 != null) break block20;
                            if (n11 == 0) break block21;
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                        n11 = n10 - 1;
                        break block20;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                }
                n11 = n10;
            }
            int n12 = n11;
            int n13 = -n10;
            block14: while (true) {
                int n14 = n13;
                block15: while (n14 <= n12) {
                    if (string2 != null) break block22;
                    int n15 = -n10;
                    while (n15 <= n12) {
                        block25: {
                            float f12;
                            float f13;
                            block23: {
                                block24: {
                                    double d4 = n13 * n13 + n15 * n15;
                                    f13 = 0.8f;
                                    double d5 = d4 - 0.0;
                                    n14 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                                    if (string2 != null) continue block15;
                                    try {
                                        if (string2 != null) break block23;
                                        if (n14 <= 0) break block24;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw GA.a(runtimeException);
                                    }
                                    f13 = (float)(1.0 / (d4 * (double)n10 * (double)0.8f));
                                }
                                f13 *= f10;
                                try {
                                    if (string2 != null) break block25;
                                    float f14 = f13 - 1.0f;
                                    f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                            }
                            if (f12 > 0) {
                                f13 = 1.0f;
                            }
                            graphics2D.setComposite(AlphaComposite.getInstance(3, f13));
                            graphics2D.drawString(string, n13 + n10, n15 + n10);
                            ++n15;
                        }
                        if (string2 == null) continue;
                    }
                    ++n13;
                    if (string2 == null) continue block14;
                }
                break;
            }
            graphics2D.translate(-d2, -d3);
            graphics2D.setComposite(composite);
            graphics2D.setColor(color2);
            graphics2D.drawString(string, 0, 0);
        }
    }

    public static void i(Graphics2D graphics2D, int n10, int n11, int n12, int n13, int n14, int n15) {
        GA.W(graphics2D, n10, n11, n12, n13, n14, n15, 0.0f);
    }

    public static void W(Graphics2D graphics2D, int n10, int n11, int n12, int n13, int n14, int n15, float f10) {
        int n16;
        block10: {
            block11: {
                block9: {
                    int n17;
                    block8: {
                        String string = FV.D();
                        try {
                            try {
                                try {
                                    n16 = n12;
                                    n17 = n10;
                                    if (string != null) break block8;
                                    if (n16 < n17) break block9;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                n16 = n13;
                                if (string != null) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                            n17 = n11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                    }
                    if (n16 >= n17) break block11;
                }
                return;
            }
            n16 = 2;
        }
        float[] fArray = new float[n16];
        fArray[0] = n14;
        fArray[1] = n15;
        float[] fArray2 = fArray;
        BasicStroke basicStroke = new BasicStroke(1.0f, 1, 1, 10.0f, fArray2, f10);
        Stroke stroke = RV.M(graphics2D, basicStroke);
        graphics2D.drawRect(n10, n11, n12 - n10, n13 - n11);
        RV.p(graphics2D, stroke);
    }

    public static GeneralPath f(int n10, int n11, int n12, int n13, int n14, int n15) {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(n10, n11 + n15);
        generalPath.quadTo(n10, n11, n10 + n14, n11);
        generalPath.lineTo(n10 + n12 - n14, n11);
        generalPath.quadTo(n10 + n12, n11, n10 + n12, n11 + n15);
        generalPath.lineTo(n10 + n12, n11 + n13 - n15);
        generalPath.quadTo(n10 + n12, n11 + n13, n10 + n12 - n14, n11 + n13);
        generalPath.lineTo(n10 + n14, n11 + n13);
        generalPath.quadTo(n10, n11 + n13, n10, n11 + n13 - n15);
        generalPath.closePath();
        return generalPath;
    }

    public static Point A(FontMetrics fontMetrics, String string) {
        return new Point(GA.C(fontMetrics, string), GA.d(fontMetrics));
    }

    public static int C(FontMetrics fontMetrics, String string) {
        return -fontMetrics.stringWidth(string) / 2;
    }

    public static int d(FontMetrics fontMetrics) {
        return (fontMetrics.getAscent() - fontMetrics.getLeading() - fontMetrics.getDescent()) / 2;
    }

    public static boolean i(Component component) {
        block3: {
            L0 l0;
            block2: {
                L0 l02 = GA.J(component);
                String string = FV.D();
                try {
                    l0 = l02;
                    if (string != null) break block2;
                    if (l0 == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
                l0 = l02;
            }
            l0.h();
            return true;
        }
        return false;
    }

    public static L0 J(Component component) {
        block13: {
            ComponentUI componentUI;
            block14: {
                ComponentUI componentUI2;
                String string;
                block12: {
                    Component component2;
                    block10: {
                        block11: {
                            string = FV.D();
                            try {
                                try {
                                    component2 = component;
                                    if (string != null) break block10;
                                    if (!(component2 instanceof L0)) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                return (L0)((Object)component);
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                        }
                        component2 = component;
                    }
                    componentUI2 = GA.Z(component2);
                    try {
                        componentUI = componentUI2;
                        if (string != null) break block12;
                        if (componentUI == null) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    componentUI = componentUI2;
                }
                try {
                    try {
                        if (string != null) break block14;
                        if (!(componentUI instanceof L0)) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    componentUI = componentUI2;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            return (L0)((Object)componentUI);
        }
        return null;
    }

    public static W2 e(Component component) {
        block13: {
            ComponentUI componentUI;
            block14: {
                ComponentUI componentUI2;
                String string;
                block12: {
                    Component component2;
                    block10: {
                        block11: {
                            string = FV.D();
                            try {
                                try {
                                    component2 = component;
                                    if (string != null) break block10;
                                    if (!(component2 instanceof W2)) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                return (W2)((Object)component);
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                        }
                        component2 = component;
                    }
                    componentUI2 = GA.Z(component2);
                    try {
                        componentUI = componentUI2;
                        if (string != null) break block12;
                        if (componentUI == null) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    componentUI = componentUI2;
                }
                try {
                    try {
                        if (string != null) break block14;
                        if (!(componentUI instanceof W2)) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    componentUI = componentUI2;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            return (W2)((Object)componentUI);
        }
        return null;
    }

    public static D7 y(Component component) {
        block13: {
            ComponentUI componentUI;
            block14: {
                ComponentUI componentUI2;
                String string;
                block12: {
                    Component component2;
                    block10: {
                        block11: {
                            string = FV.D();
                            try {
                                try {
                                    component2 = component;
                                    if (string != null) break block10;
                                    if (!(component2 instanceof D7)) break block11;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw GA.a(runtimeException);
                                }
                                return (D7)((Object)component);
                            }
                            catch (RuntimeException runtimeException) {
                                throw GA.a(runtimeException);
                            }
                        }
                        component2 = component;
                    }
                    componentUI2 = GA.Z(component2);
                    try {
                        componentUI = componentUI2;
                        if (string != null) break block12;
                        if (componentUI == null) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    componentUI = componentUI2;
                }
                try {
                    try {
                        if (string != null) break block14;
                        if (!(componentUI instanceof D7)) break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                    componentUI = componentUI2;
                }
                catch (RuntimeException runtimeException) {
                    throw GA.a(runtimeException);
                }
            }
            return (D7)((Object)componentUI);
        }
        return null;
    }

    public static Rectangle p(O_ o_, ne_2 ne_22) {
        int n10;
        int n11;
        ne_2 ne_23;
        block6: {
            block5: {
                O_ o_2;
                block4: {
                    String string = FV.D();
                    try {
                        try {
                            ne_23 = ne_22;
                            n11 = 0;
                            o_2 = o_;
                            if (string != null) break block4;
                            if (o_2.getIcon() == null) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw GA.a(runtimeException);
                        }
                        o_2 = o_;
                    }
                    catch (RuntimeException runtimeException) {
                        throw GA.a(runtimeException);
                    }
                }
                n10 = o_2.getIconTextGap();
                break block6;
            }
            n10 = 0;
        }
        ne_23.d(n11, n10, 0, 0);
        Rectangle rectangle = new Rectangle(0, 0, o_.getWidth(), o_.getHeight());
        Insets insets = o_.getInsets();
        rectangle.x += insets.left;
        rectangle.y += insets.top;
        rectangle.width -= insets.left + insets.right;
        rectangle.height -= insets.top + insets.bottom;
        Insets insets2 = ne_22.getMargin();
        int n12 = 1 + ne_22.L();
        rectangle.x -= insets2.left + n12;
        rectangle.y -= insets2.top + n12;
        rectangle.width += insets2.left + insets2.right + n12 * 2;
        rectangle.height += insets2.top + insets2.bottom + n12 * 2;
        ++rectangle.width;
        return rectangle;
    }

    public static Rectangle T(O_ o_, ky_2 ky_22) {
        Rectangle rectangle = new Rectangle(0, 0, o_.getWidth(), o_.getHeight());
        Insets insets = o_.getInsets();
        rectangle.x += insets.left;
        rectangle.y += insets.top;
        rectangle.width -= insets.left + insets.right;
        rectangle.height -= insets.top + insets.bottom;
        Insets insets2 = ky_22.O();
        int n10 = 2 + ky_22.E();
        rectangle.x -= insets2.left + n10;
        rectangle.y -= insets2.top + n10;
        rectangle.width += insets2.left + insets2.right + n10 * 2;
        rectangle.height += insets2.top + insets2.bottom + n10 * 2;
        ++rectangle.width;
        return rectangle;
    }

    public static lo_0 p(Object object) {
        return GA.R(PM.P(object));
    }

    public static lo_0 R(F2 f22) {
        return new lo_0(PM.j(f22));
    }

    public static boolean I(Class clazz) {
        return GA.t(clazz.getCanonicalName());
    }

    public static boolean t(String string) {
        try {
            UIManager.setLookAndFeel(string);
            return true;
        }
        catch (Throwable throwable) {
            ne_1.g().error(GA.a(-31908, -1560) + string, throwable);
            return false;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[19];
                        var11_1 = 0;
                        var10_2 = "xUo\u0091\u00dc0\u00daI\u008f\u00ce)\u00a4\u00cd.s\u00cd\u00f5L\u000f\u00abL(L\u00c6\u001aY\u001bKXX\tJn\u009d*k8\u0085\u00bdz\u00bf\u00c4\b9c\u0085\u0016\u00d0\u00e7\u00c5%4\u00e0\u008a:\u00e79\u00b5\u00e1\u00d3\u00dc\u0083\u00e7\u00ffT\u00ac<\u000f\u0091\u00fe\u009ft\u0091\t\u00b6\u007f6c:SIp\u00a3\u00da\u00f9\u000bt\u000b`=\u00baW\t\u001f\u00bd\u0010\u00c3\u0005\u00fdC\u00b5\u00c5t\u00d2\u0006\u0088\u00d3\u009fN\u00b6^\u001d\u00a7\u0010\u00949\u00a3%5\u00ebr\u009a\u0096.:\u007f\u008d\u00e7,\b\u00c1\u0004\u00cc\u0001\u00d0\u00e6\u00da\u00d9\u00bb\u0091\u008e\u001f\u0015\u00a8\u00c2.i\u00c7l\u00b7Y\u0011\u00f3_\u0096Q\u0018\"\u008d\u00a1\u00b7\rg\u00c3\u0092R\u00e4\u0007\u0088\n\u009fa\u00a1\u0018!9D\u001c\u00b9\u0081v\u007f\u001a\b\u009b|\u009b5\u00b9\u00ae\u00b37ym\u00c5#\u00986\u0007\u00c3\u00f9$Ft\u0080)\"\u00f0s~U\u00fe\u00a8\u009eZ\u0007\u00ac8\u00e8\u00ef\u00a77\u00fcm`\u0010nt\u00fc\u0091\u00b7\u0016\u00ed-~\u00c8\u00f0\u0097*\u00b7\u00d2\u001d\u00b5s\u00d6U\u00eb\u00a8<ZS\u00ac\u00b2\u00e8\u00be\u00a7\u001d\u00fc'}\u009a~\u00a7N\u00bd\u000fw\u00e4\u000e68\u0018K~\t\u00f4\u0010\u009cC\u00dc\u00bc|O\u00f2\u0001\u00e4\u00ea\u0094\u00c0f-\u0093O\u00fc\u00c9\u00cd\u0005\u0097^F\r\u00bb)\u00a6\u00a2\u0001\u00cf\u00c1<\u00d6\u00da4\u00ca7\u00d3E\u0082en\u00cf\u00b3\u00a2\u00d9n^j\u0003\u00d5H\u007f\u00fe\u00ad%\u00b6\u0090\u0084\u00a2\u0082\u00c7\u00b0}d\u0095\u00eb!Uv\u00e2X\u00e1uJ\u0011QF\u00f2\u0000\u00de\u00a6\u000e:\u00e8\u00fdtq\u0084\u0019\u0011\u00fdR\u008eG\u0082A\u00d7\u00d6L\u00b5\u001b\u0011EB\u0093ypnA\u0019\u00cf\u00fb\u0084\u0097*8M\u0088K3\u00ab}\u008e\u0006}\u00d6\u00eaM\u001aX\u00fbkD\\\u008a\u00ca\u001e\u008d$i\u00f9\u00c5\u0085r\u00b8\u00c0\u00f2\u001eg#\u00d4\u0004\u00bf_.\u0012\u00d8@\u0088s\u00bd[\u00ad\u00c7\u00f7\u00bf\u0019r\u0014_(Ed4";
                        var12_3 = "xUo\u0091\u00dc0\u00daI\u008f\u00ce)\u00a4\u00cd.s\u00cd\u00f5L\u000f\u00abL(L\u00c6\u001aY\u001bKXX\tJn\u009d*k8\u0085\u00bdz\u00bf\u00c4\b9c\u0085\u0016\u00d0\u00e7\u00c5%4\u00e0\u008a:\u00e79\u00b5\u00e1\u00d3\u00dc\u0083\u00e7\u00ffT\u00ac<\u000f\u0091\u00fe\u009ft\u0091\t\u00b6\u007f6c:SIp\u00a3\u00da\u00f9\u000bt\u000b`=\u00baW\t\u001f\u00bd\u0010\u00c3\u0005\u00fdC\u00b5\u00c5t\u00d2\u0006\u0088\u00d3\u009fN\u00b6^\u001d\u00a7\u0010\u00949\u00a3%5\u00ebr\u009a\u0096.:\u007f\u008d\u00e7,\b\u00c1\u0004\u00cc\u0001\u00d0\u00e6\u00da\u00d9\u00bb\u0091\u008e\u001f\u0015\u00a8\u00c2.i\u00c7l\u00b7Y\u0011\u00f3_\u0096Q\u0018\"\u008d\u00a1\u00b7\rg\u00c3\u0092R\u00e4\u0007\u0088\n\u009fa\u00a1\u0018!9D\u001c\u00b9\u0081v\u007f\u001a\b\u009b|\u009b5\u00b9\u00ae\u00b37ym\u00c5#\u00986\u0007\u00c3\u00f9$Ft\u0080)\"\u00f0s~U\u00fe\u00a8\u009eZ\u0007\u00ac8\u00e8\u00ef\u00a77\u00fcm`\u0010nt\u00fc\u0091\u00b7\u0016\u00ed-~\u00c8\u00f0\u0097*\u00b7\u00d2\u001d\u00b5s\u00d6U\u00eb\u00a8<ZS\u00ac\u00b2\u00e8\u00be\u00a7\u001d\u00fc'}\u009a~\u00a7N\u00bd\u000fw\u00e4\u000e68\u0018K~\t\u00f4\u0010\u009cC\u00dc\u00bc|O\u00f2\u0001\u00e4\u00ea\u0094\u00c0f-\u0093O\u00fc\u00c9\u00cd\u0005\u0097^F\r\u00bb)\u00a6\u00a2\u0001\u00cf\u00c1<\u00d6\u00da4\u00ca7\u00d3E\u0082en\u00cf\u00b3\u00a2\u00d9n^j\u0003\u00d5H\u007f\u00fe\u00ad%\u00b6\u0090\u0084\u00a2\u0082\u00c7\u00b0}d\u0095\u00eb!Uv\u00e2X\u00e1uJ\u0011QF\u00f2\u0000\u00de\u00a6\u000e:\u00e8\u00fdtq\u0084\u0019\u0011\u00fdR\u008eG\u0082A\u00d7\u00d6L\u00b5\u001b\u0011EB\u0093ypnA\u0019\u00cf\u00fb\u0084\u0097*8M\u0088K3\u00ab}\u008e\u0006}\u00d6\u00eaM\u001aX\u00fbkD\\\u008a\u00ca\u001e\u008d$i\u00f9\u00c5\u0085r\u00b8\u00c0\u00f2\u001eg#\u00d4\u0004\u00bf_.\u0012\u00d8@\u0088s\u00bd[\u00ad\u00c7\u00f7\u00bf\u0019r\u0014_(Ed4".length();
                        var9_4 = 24;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 33;
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
                            var10_2 = "<\u00fcG\u0004y\"\u00ce\u00ab\u00ad2\u00cd\u009b\u00f1iT\u0085\u00a1\u00ef)?\u00f3v\u00c17\u00e6C\u009cb\u00ca.e\u00b0\u00fc\u00fbSM_\u00a5\u009cO\u00876\u001f\u00c3\u00e2s\u001f\u00c4\u00a2)[\u00dfW-\u009e\u0089u\u00be\u00b7;\u00a4\u00d6\u00e3\u0018\u00c3\u0093\u00a7\u00f4X\u00e5j\u009f~K\u00e2\r";
                            var12_3 = "<\u00fcG\u0004y\"\u00ce\u00ab\u00ad2\u00cd\u009b\u00f1iT\u0085\u00a1\u00ef)?\u00f3v\u00c17\u00e6C\u009cb\u00ca.e\u00b0\u00fc\u00fbSM_\u00a5\u009cO\u00876\u001f\u00c3\u00e2s\u001f\u00c4\u00a2)[\u00dfW-\u009e\u0089u\u00be\u00b7;\u00a4\u00d6\u00e3\u0018\u00c3\u0093\u00a7\u00f4X\u00e5j\u009f~K\u00e2\r".length();
                            var9_4 = 29;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 5;
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
                                    v15 = 73;
                                    break;
                                }
                                case 1: {
                                    v15 = 65;
                                    break;
                                }
                                case 2: {
                                    v15 = 103;
                                    break;
                                }
                                case 3: {
                                    v15 = 119;
                                    break;
                                }
                                case 4: {
                                    v15 = 41;
                                    break;
                                }
                                case 5: {
                                    v15 = 101;
                                    break;
                                }
                                default: {
                                    v15 = 15;
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
                GA.b = var13;
                GA.c = new String[19];
                var0_7 = 5972639322288249823L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u000e04\u00e1P-\u00dc\u008c\u0082\u008c\u00b6\u009b\u00d8B\u00df\u00b9OwV\u00dbp\u000f\u0095\u0080\u0088\u0093|\u0080)N6\u00a2";
                var5_11 = "\u000e04\u00e1P-\u00dc\u008c\u0082\u008c\u00b6\u009b\u00d8B\u00df\u00b9OwV\u00dbp\u000f\u0095\u0080\u0088\u0093|\u0080)N6\u00a2".length();
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
                    var4_10 = ")\u0082X\u00ec\u00d6\u00f0\u00f0\u00a2\u00a1\u0088\u00fb\u00c4\u00db\u0082m\u00da";
                    var5_11 = ")\u0082X\u00ec\u00d6\u00f0\u00f0\u00a2\u00a1\u0088\u00fb\u00c4\u00db\u0082m\u00da".length();
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
        GA.f = var6_8;
        GA.h = new Integer[6];
        GA.e = new eh_1();
        GA.N = new pp_2();
        GA.d = new WQ();
        GA.P = new LB();
        GA.i = new HashMap<K, V>();
        GA.a = GA.a(20507, 1036857957273005433L);
        GA.o = GA.a(14596, 2721872801761297508L);
        GA.u = 1;
        GA.U = GA.a(5658, 7393847499690453887L);
        GA.g = new pf_1(GA.class.getResource(GA.a(-31919, -22810)));
        GA.M = new pf_1(GA.class.getResource(GA.a(-31911, 22427)));
        GA.l = new pf_1(GA.class.getResource(GA.a(-31916, 12997)));
        GA.V = new pf_1(GA.class.getResource(GA.a(-31912, 24544)));
        GA.z = new pf_1(GA.class.getResource(GA.a(-31915, 24520)));
        GA.j = new pf_1(GA.class.getResource(GA.a(-31914, -26755)));
        GA.F = new pf_1(GA.class.getResource(GA.a(-31910, 4831)));
        GA.C = new pf_1(GA.class.getResource(GA.a(-31935, 25762)));
        GA.B = new pf_1(GA.class.getResource(GA.a(-31905, 31965)));
        GA.x = new ImageIcon(GA.class.getResource(GA.a(-31906, -21643)));
        GA.q = new HashMap<K, V>();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF8350) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 59;
                    break;
                }
                case 1: {
                    n14 = 129;
                    break;
                }
                case 2: {
                    n14 = 97;
                    break;
                }
                case 3: {
                    n14 = 189;
                    break;
                }
                case 4: {
                    n14 = 107;
                    break;
                }
                case 5: {
                    n14 = 70;
                    break;
                }
                case 6: {
                    n14 = 228;
                    break;
                }
                case 7: {
                    n14 = 114;
                    break;
                }
                case 8: {
                    n14 = 229;
                    break;
                }
                case 9: {
                    n14 = 187;
                    break;
                }
                case 10: {
                    n14 = 57;
                    break;
                }
                case 11: {
                    n14 = 207;
                    break;
                }
                case 12: {
                    n14 = 200;
                    break;
                }
                case 13: {
                    n14 = 140;
                    break;
                }
                case 14: {
                    n14 = 40;
                    break;
                }
                case 15: {
                    n14 = 188;
                    break;
                }
                case 16: {
                    n14 = 10;
                    break;
                }
                case 17: {
                    n14 = 60;
                    break;
                }
                case 18: {
                    n14 = 64;
                    break;
                }
                case 19: {
                    n14 = 51;
                    break;
                }
                case 20: {
                    n14 = 212;
                    break;
                }
                case 21: {
                    n14 = 170;
                    break;
                }
                case 22: {
                    n14 = 68;
                    break;
                }
                case 23: {
                    n14 = 223;
                    break;
                }
                case 24: {
                    n14 = 135;
                    break;
                }
                case 25: {
                    n14 = 196;
                    break;
                }
                case 26: {
                    n14 = 143;
                    break;
                }
                case 27: {
                    n14 = 21;
                    break;
                }
                case 28: {
                    n14 = 24;
                    break;
                }
                case 29: {
                    n14 = 32;
                    break;
                }
                case 30: {
                    n14 = 254;
                    break;
                }
                case 31: {
                    n14 = 109;
                    break;
                }
                case 32: {
                    n14 = 100;
                    break;
                }
                case 33: {
                    n14 = 42;
                    break;
                }
                case 34: {
                    n14 = 205;
                    break;
                }
                case 35: {
                    n14 = 149;
                    break;
                }
                case 36: {
                    n14 = 29;
                    break;
                }
                case 37: {
                    n14 = 157;
                    break;
                }
                case 38: {
                    n14 = 215;
                    break;
                }
                case 39: {
                    n14 = 155;
                    break;
                }
                case 40: {
                    n14 = 0;
                    break;
                }
                case 41: {
                    n14 = 52;
                    break;
                }
                case 42: {
                    n14 = 236;
                    break;
                }
                case 43: {
                    n14 = 92;
                    break;
                }
                case 44: {
                    n14 = 145;
                    break;
                }
                case 45: {
                    n14 = 63;
                    break;
                }
                case 46: {
                    n14 = 124;
                    break;
                }
                case 47: {
                    n14 = 185;
                    break;
                }
                case 48: {
                    n14 = 132;
                    break;
                }
                case 49: {
                    n14 = 142;
                    break;
                }
                case 50: {
                    n14 = 217;
                    break;
                }
                case 51: {
                    n14 = 103;
                    break;
                }
                case 52: {
                    n14 = 14;
                    break;
                }
                case 53: {
                    n14 = 54;
                    break;
                }
                case 54: {
                    n14 = 84;
                    break;
                }
                case 55: {
                    n14 = 95;
                    break;
                }
                case 56: {
                    n14 = 199;
                    break;
                }
                case 57: {
                    n14 = 110;
                    break;
                }
                case 58: {
                    n14 = 139;
                    break;
                }
                case 59: {
                    n14 = 22;
                    break;
                }
                case 60: {
                    n14 = 154;
                    break;
                }
                case 61: {
                    n14 = 178;
                    break;
                }
                case 62: {
                    n14 = 13;
                    break;
                }
                case 63: {
                    n14 = 220;
                    break;
                }
                case 64: {
                    n14 = 153;
                    break;
                }
                case 65: {
                    n14 = 35;
                    break;
                }
                case 66: {
                    n14 = 214;
                    break;
                }
                case 67: {
                    n14 = 233;
                    break;
                }
                case 68: {
                    n14 = 82;
                    break;
                }
                case 69: {
                    n14 = 46;
                    break;
                }
                case 70: {
                    n14 = 39;
                    break;
                }
                case 71: {
                    n14 = 136;
                    break;
                }
                case 72: {
                    n14 = 56;
                    break;
                }
                case 73: {
                    n14 = 93;
                    break;
                }
                case 74: {
                    n14 = 163;
                    break;
                }
                case 75: {
                    n14 = 2;
                    break;
                }
                case 76: {
                    n14 = 11;
                    break;
                }
                case 77: {
                    n14 = 27;
                    break;
                }
                case 78: {
                    n14 = 244;
                    break;
                }
                case 79: {
                    n14 = 255;
                    break;
                }
                case 80: {
                    n14 = 174;
                    break;
                }
                case 81: {
                    n14 = 53;
                    break;
                }
                case 82: {
                    n14 = 221;
                    break;
                }
                case 83: {
                    n14 = 65;
                    break;
                }
                case 84: {
                    n14 = 181;
                    break;
                }
                case 85: {
                    n14 = 17;
                    break;
                }
                case 86: {
                    n14 = 6;
                    break;
                }
                case 87: {
                    n14 = 165;
                    break;
                }
                case 88: {
                    n14 = 76;
                    break;
                }
                case 89: {
                    n14 = 208;
                    break;
                }
                case 90: {
                    n14 = 186;
                    break;
                }
                case 91: {
                    n14 = 116;
                    break;
                }
                case 92: {
                    n14 = 9;
                    break;
                }
                case 93: {
                    n14 = 73;
                    break;
                }
                case 94: {
                    n14 = 131;
                    break;
                }
                case 95: {
                    n14 = 224;
                    break;
                }
                case 96: {
                    n14 = 173;
                    break;
                }
                case 97: {
                    n14 = 203;
                    break;
                }
                case 98: {
                    n14 = 90;
                    break;
                }
                case 99: {
                    n14 = 1;
                    break;
                }
                case 100: {
                    n14 = 12;
                    break;
                }
                case 101: {
                    n14 = 43;
                    break;
                }
                case 102: {
                    n14 = 113;
                    break;
                }
                case 103: {
                    n14 = 197;
                    break;
                }
                case 104: {
                    n14 = 61;
                    break;
                }
                case 105: {
                    n14 = 118;
                    break;
                }
                case 106: {
                    n14 = 192;
                    break;
                }
                case 107: {
                    n14 = 176;
                    break;
                }
                case 108: {
                    n14 = 99;
                    break;
                }
                case 109: {
                    n14 = 209;
                    break;
                }
                case 110: {
                    n14 = 45;
                    break;
                }
                case 111: {
                    n14 = 37;
                    break;
                }
                case 112: {
                    n14 = 137;
                    break;
                }
                case 113: {
                    n14 = 230;
                    break;
                }
                case 114: {
                    n14 = 69;
                    break;
                }
                case 115: {
                    n14 = 81;
                    break;
                }
                case 116: {
                    n14 = 16;
                    break;
                }
                case 117: {
                    n14 = 20;
                    break;
                }
                case 118: {
                    n14 = 33;
                    break;
                }
                case 119: {
                    n14 = 183;
                    break;
                }
                case 120: {
                    n14 = 193;
                    break;
                }
                case 121: {
                    n14 = 101;
                    break;
                }
                case 122: {
                    n14 = 120;
                    break;
                }
                case 123: {
                    n14 = 235;
                    break;
                }
                case 124: {
                    n14 = 47;
                    break;
                }
                case 125: {
                    n14 = 180;
                    break;
                }
                case 126: {
                    n14 = 15;
                    break;
                }
                case 127: {
                    n14 = 127;
                    break;
                }
                case 128: {
                    n14 = 162;
                    break;
                }
                case 129: {
                    n14 = 211;
                    break;
                }
                case 130: {
                    n14 = 177;
                    break;
                }
                case 131: {
                    n14 = 144;
                    break;
                }
                case 132: {
                    n14 = 245;
                    break;
                }
                case 133: {
                    n14 = 108;
                    break;
                }
                case 134: {
                    n14 = 238;
                    break;
                }
                case 135: {
                    n14 = 34;
                    break;
                }
                case 136: {
                    n14 = 190;
                    break;
                }
                case 137: {
                    n14 = 168;
                    break;
                }
                case 138: {
                    n14 = 182;
                    break;
                }
                case 139: {
                    n14 = 226;
                    break;
                }
                case 140: {
                    n14 = 249;
                    break;
                }
                case 141: {
                    n14 = 128;
                    break;
                }
                case 142: {
                    n14 = 121;
                    break;
                }
                case 143: {
                    n14 = 213;
                    break;
                }
                case 144: {
                    n14 = 248;
                    break;
                }
                case 145: {
                    n14 = 41;
                    break;
                }
                case 146: {
                    n14 = 86;
                    break;
                }
                case 147: {
                    n14 = 125;
                    break;
                }
                case 148: {
                    n14 = 117;
                    break;
                }
                case 149: {
                    n14 = 219;
                    break;
                }
                case 150: {
                    n14 = 74;
                    break;
                }
                case 151: {
                    n14 = 148;
                    break;
                }
                case 152: {
                    n14 = 239;
                    break;
                }
                case 153: {
                    n14 = 166;
                    break;
                }
                case 154: {
                    n14 = 62;
                    break;
                }
                case 155: {
                    n14 = 172;
                    break;
                }
                case 156: {
                    n14 = 36;
                    break;
                }
                case 157: {
                    n14 = 210;
                    break;
                }
                case 158: {
                    n14 = 94;
                    break;
                }
                case 159: {
                    n14 = 198;
                    break;
                }
                case 160: {
                    n14 = 151;
                    break;
                }
                case 161: {
                    n14 = 234;
                    break;
                }
                case 162: {
                    n14 = 161;
                    break;
                }
                case 163: {
                    n14 = 19;
                    break;
                }
                case 164: {
                    n14 = 243;
                    break;
                }
                case 165: {
                    n14 = 138;
                    break;
                }
                case 166: {
                    n14 = 25;
                    break;
                }
                case 167: {
                    n14 = 179;
                    break;
                }
                case 168: {
                    n14 = 164;
                    break;
                }
                case 169: {
                    n14 = 49;
                    break;
                }
                case 170: {
                    n14 = 159;
                    break;
                }
                case 171: {
                    n14 = 89;
                    break;
                }
                case 172: {
                    n14 = 105;
                    break;
                }
                case 173: {
                    n14 = 122;
                    break;
                }
                case 174: {
                    n14 = 58;
                    break;
                }
                case 175: {
                    n14 = 4;
                    break;
                }
                case 176: {
                    n14 = 106;
                    break;
                }
                case 177: {
                    n14 = 133;
                    break;
                }
                case 178: {
                    n14 = 104;
                    break;
                }
                case 179: {
                    n14 = 247;
                    break;
                }
                case 180: {
                    n14 = 75;
                    break;
                }
                case 181: {
                    n14 = 194;
                    break;
                }
                case 182: {
                    n14 = 134;
                    break;
                }
                case 183: {
                    n14 = 156;
                    break;
                }
                case 184: {
                    n14 = 246;
                    break;
                }
                case 185: {
                    n14 = 38;
                    break;
                }
                case 186: {
                    n14 = 87;
                    break;
                }
                case 187: {
                    n14 = 146;
                    break;
                }
                case 188: {
                    n14 = 152;
                    break;
                }
                case 189: {
                    n14 = 71;
                    break;
                }
                case 190: {
                    n14 = 204;
                    break;
                }
                case 191: {
                    n14 = 30;
                    break;
                }
                case 192: {
                    n14 = 158;
                    break;
                }
                case 193: {
                    n14 = 102;
                    break;
                }
                case 194: {
                    n14 = 50;
                    break;
                }
                case 195: {
                    n14 = 112;
                    break;
                }
                case 196: {
                    n14 = 23;
                    break;
                }
                case 197: {
                    n14 = 227;
                    break;
                }
                case 198: {
                    n14 = 126;
                    break;
                }
                case 199: {
                    n14 = 242;
                    break;
                }
                case 200: {
                    n14 = 80;
                    break;
                }
                case 201: {
                    n14 = 83;
                    break;
                }
                case 202: {
                    n14 = 26;
                    break;
                }
                case 203: {
                    n14 = 5;
                    break;
                }
                case 204: {
                    n14 = 7;
                    break;
                }
                case 205: {
                    n14 = 96;
                    break;
                }
                case 206: {
                    n14 = 77;
                    break;
                }
                case 207: {
                    n14 = 31;
                    break;
                }
                case 208: {
                    n14 = 91;
                    break;
                }
                case 209: {
                    n14 = 147;
                    break;
                }
                case 210: {
                    n14 = 201;
                    break;
                }
                case 211: {
                    n14 = 28;
                    break;
                }
                case 212: {
                    n14 = 85;
                    break;
                }
                case 213: {
                    n14 = 191;
                    break;
                }
                case 214: {
                    n14 = 250;
                    break;
                }
                case 215: {
                    n14 = 251;
                    break;
                }
                case 216: {
                    n14 = 253;
                    break;
                }
                case 217: {
                    n14 = 79;
                    break;
                }
                case 218: {
                    n14 = 72;
                    break;
                }
                case 219: {
                    n14 = 123;
                    break;
                }
                case 220: {
                    n14 = 175;
                    break;
                }
                case 221: {
                    n14 = 231;
                    break;
                }
                case 222: {
                    n14 = 167;
                    break;
                }
                case 223: {
                    n14 = 237;
                    break;
                }
                case 224: {
                    n14 = 66;
                    break;
                }
                case 225: {
                    n14 = 78;
                    break;
                }
                case 226: {
                    n14 = 252;
                    break;
                }
                case 227: {
                    n14 = 171;
                    break;
                }
                case 228: {
                    n14 = 169;
                    break;
                }
                case 229: {
                    n14 = 55;
                    break;
                }
                case 230: {
                    n14 = 150;
                    break;
                }
                case 231: {
                    n14 = 88;
                    break;
                }
                case 232: {
                    n14 = 18;
                    break;
                }
                case 233: {
                    n14 = 3;
                    break;
                }
                case 234: {
                    n14 = 98;
                    break;
                }
                case 235: {
                    n14 = 184;
                    break;
                }
                case 236: {
                    n14 = 206;
                    break;
                }
                case 237: {
                    n14 = 218;
                    break;
                }
                case 238: {
                    n14 = 195;
                    break;
                }
                case 239: {
                    n14 = 115;
                    break;
                }
                case 240: {
                    n14 = 222;
                    break;
                }
                case 241: {
                    n14 = 240;
                    break;
                }
                case 242: {
                    n14 = 67;
                    break;
                }
                case 243: {
                    n14 = 141;
                    break;
                }
                case 244: {
                    n14 = 130;
                    break;
                }
                case 245: {
                    n14 = 225;
                    break;
                }
                case 246: {
                    n14 = 232;
                    break;
                }
                case 247: {
                    n14 = 216;
                    break;
                }
                case 248: {
                    n14 = 160;
                    break;
                }
                case 249: {
                    n14 = 202;
                    break;
                }
                case 250: {
                    n14 = 111;
                    break;
                }
                case 251: {
                    n14 = 44;
                    break;
                }
                case 252: {
                    n14 = 48;
                    break;
                }
                case 253: {
                    n14 = 119;
                    break;
                }
                case 254: {
                    n14 = 241;
                    break;
                }
                default: {
                    n14 = 8;
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
            GA.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3D61;
        if (h[n11] == null) {
            GA.h[n11] = (int)(f[n11] ^ l2);
        }
        return h[n11];
    }
}

