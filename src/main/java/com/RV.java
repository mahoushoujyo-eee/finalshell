/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.GO;
import com.pi_1;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.util.HashMap;
import java.util.Map;

public final class RV {
    private static boolean m;
    private static Map H;
    private static final Map g;
    private static final String a;

    public static Object O(Graphics graphics) {
        return RV.f((Graphics2D)graphics, RenderingHints.VALUE_ANTIALIAS_ON);
    }

    public static Object X(Graphics2D graphics2D) {
        return RV.f(graphics2D, RenderingHints.VALUE_ANTIALIAS_ON);
    }

    public static Object h(Graphics graphics) {
        return RV.f((Graphics2D)graphics, RenderingHints.VALUE_ANTIALIAS_OFF);
    }

    public static Object j(Graphics2D graphics2D) {
        return RV.f(graphics2D, RenderingHints.VALUE_ANTIALIAS_OFF);
    }

    private static Object f(Graphics2D graphics2D, Object object) {
        Object object2 = graphics2D.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, object);
        return object2;
    }

    public static void s(Graphics graphics, Object object) {
        RV.X((Graphics2D)graphics, object);
    }

    public static void X(Graphics2D graphics2D, Object object) {
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, object);
    }

    public static Map A() {
        block3: {
            boolean bl;
            block2: {
                String string = FV.D();
                bl = m;
                if (string != null) break block2;
                if (bl) break block3;
                H = (Map)Toolkit.getDefaultToolkit().getDesktopProperty(a);
                bl = true;
            }
            m = bl;
        }
        return H;
    }

    public static void K(Graphics graphics) {
        RV.L((Graphics2D)graphics);
    }

    public static void L(Graphics2D graphics2D) {
        Map map = RV.A();
        if (map != null) {
            graphics2D.addRenderingHints(map);
        }
    }

    public static Composite p(Graphics2D graphics2D, Float f10) {
        return RV.a(graphics2D, f10, true);
    }

    public static Composite a(Graphics2D graphics2D, Float f10, boolean bl) {
        return RV.a(graphics2D, graphics2D.getComposite(), f10, bl);
    }

    public static Composite U(Graphics2D graphics2D, Composite composite, Float f10) {
        return RV.a(graphics2D, composite, f10, true);
    }

    public static Composite a(Graphics2D graphics2D, Composite composite, Float f10, boolean bl) {
        Composite composite2 = graphics2D.getComposite();
        if (!bl || f10 == null) {
            return composite2;
        }
        float f11 = 1.0f;
        if (composite != null && composite instanceof AlphaComposite) {
            f11 = ((AlphaComposite)composite).getAlpha();
        }
        AlphaComposite alphaComposite = AlphaComposite.getInstance(3, f11 * f10.floatValue());
        graphics2D.setComposite(alphaComposite);
        return composite2;
    }

    public static void c(Graphics2D graphics2D, Composite composite) {
        graphics2D.setComposite(composite);
    }

    public static void E(Graphics2D graphics2D, Composite composite, boolean bl) {
        if (bl) {
            graphics2D.setComposite(composite);
        }
    }

    public static Stroke M(Graphics2D graphics2D, Stroke stroke) {
        return RV.d(graphics2D, stroke, true);
    }

    public static Stroke d(Graphics2D graphics2D, Stroke stroke, boolean bl) {
        block2: {
            Stroke stroke2;
            block3: {
                String string = FV.D();
                if (!bl) break block2;
                stroke2 = stroke;
                if (string != null) break block3;
                if (stroke2 == null) break block2;
                stroke2 = graphics2D.getStroke();
            }
            Stroke stroke3 = stroke2;
            graphics2D.setStroke(stroke);
            return stroke3;
        }
        return null;
    }

    public static void p(Graphics2D graphics2D, Stroke stroke) {
        RV.t(graphics2D, stroke, true);
    }

    public static void t(Graphics2D graphics2D, Stroke stroke, boolean bl) {
        if (bl && stroke != null) {
            graphics2D.setStroke(stroke);
        }
    }

    public static Shape e(Graphics2D graphics2D, Shape shape) {
        return RV.A(graphics2D, shape, true);
    }

    public static Shape A(Graphics2D graphics2D, Shape shape, boolean bl) {
        block2: {
            Shape shape2;
            block3: {
                String string = FV.D();
                if (!bl) break block2;
                shape2 = shape;
                if (string != null) break block3;
                if (shape2 == null) break block2;
                shape2 = graphics2D.getClip();
            }
            Shape shape3 = shape2;
            graphics2D.setClip(shape);
            return shape3;
        }
        return null;
    }

    public static Shape d(Graphics2D graphics2D, int n10, int n11, int n12, int n13) {
        return RV.K(graphics2D, n10, n11, n12, n13, true);
    }

    public static Shape K(Graphics2D graphics2D, int n10, int n11, int n12, int n13, boolean bl) {
        if (bl) {
            Shape shape = graphics2D.getClip();
            graphics2D.setClip(n10, n11, n12, n13);
            return shape;
        }
        return null;
    }

    public static void w(Graphics2D graphics2D, Shape shape) {
        RV.n(graphics2D, shape, true);
    }

    public static void n(Graphics2D graphics2D, Shape shape, boolean bl) {
        if (bl && shape != null) {
            graphics2D.setClip(shape);
        }
    }

    public static Object I(Graphics graphics) {
        return RV.O((Graphics2D)graphics);
    }

    public static Object O(Graphics2D graphics2D) {
        Object object = graphics2D.getRenderingHint(RenderingHints.KEY_INTERPOLATION);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        return object;
    }

    public static void S(Graphics graphics, Object object) {
        RV.N((Graphics2D)graphics, object);
    }

    public static void N(Graphics2D graphics2D, Object object) {
        String string = FV.D();
        Object object2 = object;
        if (string == null) {
            object2 = object2 != null ? object : RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object2);
    }

    public static Font b(Graphics graphics, Font font) {
        block3: {
            Font font2;
            block2: {
                String string = FV.D();
                font2 = font;
                if (string != null) break block2;
                if (font2 == null) break block3;
                font2 = graphics.getFont();
            }
            Font font3 = font2;
            graphics.setFont(font);
            return font3;
        }
        return null;
    }

    public static void j(Graphics graphics, Font font) {
        if (font != null) {
            graphics.setFont(font);
        }
    }

    public static Shape n(Graphics2D graphics2D, Shape shape) {
        return RV.I(graphics2D, shape, true);
    }

    public static Shape I(Graphics2D graphics2D, Shape shape, boolean bl) {
        block2: {
            Shape shape2;
            block3: {
                String string = FV.D();
                if (!bl) break block2;
                shape2 = shape;
                if (string != null) break block3;
                if (shape2 == null) break block2;
                shape2 = graphics2D.getClip();
            }
            Shape shape3 = shape2;
            graphics2D.clip(shape);
            return shape3;
        }
        return null;
    }

    public static Shape k(Graphics graphics, Shape shape) {
        return RV.t(graphics, shape, true);
    }

    public static Shape t(Graphics graphics, Shape shape, boolean bl) {
        block5: {
            Shape shape2;
            Shape shape3;
            String string;
            block6: {
                string = FV.D();
                if (!bl) break block5;
                shape3 = shape;
                if (string != null) break block6;
                if (shape3 == null) break block5;
                shape3 = graphics.getClip();
            }
            Shape shape4 = shape2 = shape3;
            if (string == null) {
                if (shape4 != null) {
                    Area area = new Area(shape2);
                    area.subtract(new Area(shape));
                    graphics.setClip(area);
                }
                shape4 = shape2;
            }
            return shape4;
        }
        return null;
    }

    public static void t(Graphics graphics, Shape shape) {
        RV.j(graphics, shape, true);
    }

    public static void j(Graphics graphics, Shape shape, boolean bl) {
        if (bl && shape != null) {
            graphics.setClip(shape);
        }
    }

    public static Stroke y(int n10) {
        return RV.Z(n10, 1, 1);
    }

    public static Stroke c(int n10, int n11) {
        return RV.Z(n10, n11, 1);
    }

    public static Stroke Z(int n10, int n11, int n12) {
        String string = n10 + "," + n11 + "," + n12;
        Stroke stroke = (Stroke)g.get(string);
        String string2 = FV.D();
        Stroke stroke2 = stroke;
        if (string2 == null) {
            if (stroke2 == null) {
                stroke = new BasicStroke(n10, n11, n12);
                g.put(string, stroke);
            }
            stroke2 = stroke;
        }
        return stroke2;
    }

    public static void Y(Graphics2D graphics2D, Shape shape, Color color, int n10) {
        RV.y(graphics2D, shape, GO.m, color, n10);
    }

    public static void y(Graphics2D graphics2D, Shape shape, pi_1 pi_12, Color color, int n10) {
        RV.n(graphics2D, shape, pi_12, color, n10, null, true);
    }

    public static void D(Graphics2D graphics2D, Shape shape, Color color, int n10, Shape shape2) {
        RV.n(graphics2D, shape, GO.m, color, n10, shape2, true);
    }

    public static void m(Graphics2D graphics2D, Shape shape, pi_1 pi_12, Color color, int n10, Shape shape2) {
        RV.n(graphics2D, shape, pi_12, color, n10, shape2, true);
    }

    public static void Z(Graphics2D graphics2D, Shape shape, Color color, int n10, boolean bl) {
        RV.n(graphics2D, shape, GO.m, color, n10, null, bl);
    }

    public static void y(Graphics2D graphics2D, Shape shape, pi_1 pi_12, Color color, int n10, boolean bl) {
        RV.n(graphics2D, shape, pi_12, color, n10, null, bl);
    }

    public static void n(Graphics2D graphics2D, Shape shape, Color color, int n10, Shape shape2, boolean bl) {
        RV.n(graphics2D, shape, GO.m, color, n10, shape2, bl);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void n(Graphics2D var0, Shape var1_1, pi_1 var2_2, Color var3_3, int var4_4, Shape var5_5, boolean var6_6) {
        block15: {
            block14: {
                var7_7 = FV.D();
                if (var4_4 <= 1) {
                    return;
                }
                v0 = var5_5;
                if (var7_7 == null) {
                    v0 = v0 != null ? RV.n(var0, var5_5) : RV.k(var0, var1_1);
                }
                var8_8 = v0;
                var9_9 = var0.getComposite();
                var10_10 = 1.0f;
                v1 = var9_9;
                if (var7_7 != null) break block14;
                if (!(v1 instanceof AlphaComposite)) break block15;
                v1 = var9_9;
            }
            var10_10 = ((AlphaComposite)v1).getAlpha();
        }
        var11_11 = var0.getStroke();
        if (var3_3 != null) {
            var0.setPaint(var3_3);
        }
        v2 = var2_2.equals((Object)pi_1.simple);
        if (var7_7 != null) ** GOTO lbl32
        if (v2 == 0) ** GOTO lbl-1000
        if (GO.p < 1.0f) {
            var0.setComposite(AlphaComposite.getInstance(3, GO.p * var10_10));
        }
        v3 = var6_6;
        if (var7_7 == null) {
            v3 = v3 != 0 ? 1 : 0;
        }
        var0.setStroke(RV.c(var4_4 * 2, v3));
        var0.draw(var1_1);
        if (var7_7 != null) lbl-1000:
        // 2 sources

        {
            v2 = var12_12 = (var4_4 *= 2);
lbl32:
            // 3 sources

            while (var12_12 >= 2) {
                var13_13 = (float)(var4_4 - var12_12) / (float)(var4_4 - 1);
                var0.setComposite(AlphaComposite.getInstance(3, var13_13 * var10_10));
                v4 = var0;
                if (var7_7 == null) {
                    v5 = var6_6;
                    if (var7_7 == null) {
                        v5 = v5 != 0 ? 1 : 0;
                    }
                    v4.setStroke(RV.c(var12_12, v5));
                    var0.draw(var1_1);
                    var12_12 -= 2;
                    if (var7_7 == null) continue;
                }
                break;
            }
        } else {
            RV.p(var0, var11_11);
            RV.c(var0, var9_9);
            v4 = var0;
        }
        RV.w(v4, var8_8);
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
                char[] cArray3 = "-?\u0003i+L\r8f\u0013\">H\u0017#8\u001f.#W\u0010".toCharArray();
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
                            n17 = 114;
                            break;
                        }
                        case 1: {
                            n17 = 118;
                            break;
                        }
                        case 2: {
                            n17 = 73;
                            break;
                        }
                        case 3: {
                            n17 = 121;
                            break;
                        }
                        case 4: {
                            n17 = 115;
                            break;
                        }
                        case 5: {
                            n17 = 29;
                            break;
                        }
                        default: {
                            n17 = 93;
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
        m = false;
        H = null;
        g = new HashMap();
    }
}

