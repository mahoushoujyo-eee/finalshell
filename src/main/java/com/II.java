/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.GO;
import com.PS;
import com.RV;
import com.SS;
import com.SZ;
import com.WC;
import com.cb_2;
import com.cf_1;
import com.ky_2;
import com.wb_0;
import com.xg_0;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class II
extends JComponent {
    private final int V = II.a(16617, 4198566905093304367L);
    private int Z = II.a(19746, 8454235847178698214L);
    private final int P = II.a(2415, 6940938825119037859L);
    private final float x = 0.7f;
    private final int S = II.a(21730, 8976500173733176362L);
    private final Color i = new Color(II.a(27613, 3140147297034083100L), II.a(17347, 8900846371589206801L), II.a(17347, 8900846371589206801L));
    private final Color M = new Color(II.a(5649, 8532131175631939283L), II.a(13016, 3678242653083648536L), II.a(13016, 3678242653083648536L));
    private final Color t = new Color(II.a(17347, 8900846371589206801L), II.a(17347, 8900846371589206801L), II.a(17347, 8900846371589206801L), 0);
    private final Color B = new Color(II.a(13016, 3678242653083648536L), II.a(13016, 3678242653083648536L), II.a(13016, 3678242653083648536L), 0);
    private int k = 0;
    private int O = 0;
    private final List e = new ArrayList();
    private final List Y = new ArrayList();
    private final List j = new ArrayList();
    private int W;
    private boolean r;
    private int p;
    private int d;
    private float f;
    private WC s;
    private SZ R;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] g;

    public II() {
        String string = wb_0.m();
        this.W = II.a(5156, 7032456339291366634L);
        this.r = true;
        this.p = -1;
        this.d = -1;
        this.f = 0.0f;
        this.s = null;
        FN.Y(this);
        this.setFocusable(true);
        this.setFont(new JLabel().getFont().deriveFont(1));
        cb_2 cb_22 = new cb_2(this);
        this.addMouseListener(cb_22);
        this.addMouseWheelListener(cb_22);
        this.addKeyListener(new PS(this));
        if (string == null) {
            ky_2.K(new String[1]);
        }
    }

    public List f() {
        return this.e;
    }

    public int J() {
        return this.W;
    }

    public void s(int n10) {
        this.W = n10;
    }

    public SZ Y() {
        return this.r(true);
    }

    public SZ r(boolean bl) {
        String string = wb_0.m();
        SZ sZ = this.R;
        if (string != null) {
            if (sZ == null) {
                this.R = new SS(this, this, bl);
                this.R.setHorizontalScrollBarPolicy(II.a(9675, 7218392076847633676L));
                this.R.setVerticalScrollBarPolicy(II.a(15742, 1829144177888513469L));
                InputMap inputMap = this.R.getInputMap(1);
                inputMap.put(KeyStroke.getKeyStroke(II.a(-26562, 4686)), II.a(-26564, -18177));
                inputMap.put(KeyStroke.getKeyStroke(II.a(-26565, -21567)), II.a(-26566, -19388));
                inputMap.put(KeyStroke.getKeyStroke(II.a(-26570, -20033)), II.a(-26566, -19388));
                inputMap.put(KeyStroke.getKeyStroke(II.a(-26567, 32641)), II.a(-26566, -19388));
            }
            sZ = this.R;
        }
        return sZ;
    }

    public int U() {
        return this.Z;
    }

    public void F(int n10) {
        this.Z = n10;
    }

    public boolean Y() {
        return this.r;
    }

    public void u(boolean bl) {
        this.r = bl;
    }

    public int i() {
        return this.p;
    }

    public void T(int n10) {
        II iI;
        block6: {
            int n11;
            block5: {
                String string = wb_0.m();
                n11 = this.p;
                if (string == null) break block5;
                if (n11 == n10) {
                    return;
                }
                this.d = this.p;
                this.p = n10;
                this.repaint();
                iI = this;
                if (string == null) break block6;
                n11 = iI.r ? 1 : 0;
            }
            if (n11 != 0) {
                Rectangle rectangle = this.l(n10);
                FN.g(this.Y(), rectangle.x + rectangle.width / 2 - this.getVisibleRect().width / 2, rectangle.y);
            }
            iI = this;
        }
        iI.O();
    }

    private void O() {
        block4: {
            WC wC;
            block5: {
                String string = wb_0.m();
                wC = this.s;
                if (string == null) break block4;
                if (wC == null) break block5;
                wC = this.s;
                if (string == null) break block4;
                if (wC.i()) {
                    this.s.Y();
                }
            }
            this.f = 0.0f;
            this.s = new WC(II.a(-26568, -27797), GO.L, (ActionListener)new cf_1(this));
            wC = this.s.u();
        }
    }

    /*
     * Unable to fully structure code
     */
    public Rectangle l(int var1_1) {
        var3_2 = ((ImageIcon)this.e.get(var1_1)).getIconWidth();
        var4_3 = ((ImageIcon)this.e.get(var1_1)).getIconHeight();
        var2_4 = wb_0.m();
        var5_5 = this.getPreferredSize();
        v0 = this.getWidth();
        v1 = var5_5.width;
        if (var2_4 == null) ** GOTO lbl11
        if (v0 > v1) {
            v0 = this.getWidth() - var5_5.width;
            v1 = 2;
lbl11:
            // 2 sources

            v2 = v0 / v1;
        } else {
            v2 = 0;
        }
        var6_6 = v2 + II.a(23296, 5169269775888493519L) + (this.k + II.a(23296, 5169269775888493519L)) * var1_1 + this.k / 2;
        var7_7 = this.getHeight() / 2 - II.a(7022, 41280091240328107L) - var4_3 / 2;
        return new Rectangle(var6_6 - var3_2 / 2, var7_7 - var4_3 / 2, var3_2, var4_3);
    }

    public void V(ImageIcon imageIcon) {
        this.U(0, imageIcon);
    }

    public void U(int n10, ImageIcon imageIcon) {
        try {
            ImageIcon imageIcon2 = xg_0.q(imageIcon, this.Z);
            int n11 = imageIcon2.getIconWidth();
            int n12 = imageIcon2.getIconHeight();
            BufferedImage bufferedImage = xg_0.g(n11, n12, 3);
            Graphics2D graphics2D = bufferedImage.createGraphics();
            RV.X(graphics2D);
            graphics2D.drawImage(imageIcon2.getImage(), 0, 0, null);
            graphics2D.setComposite(AlphaComposite.getInstance(II.a(14432, 8129159732006996139L)));
            graphics2D.setPaint(new GradientPaint(0.0f, (float)n12 * 0.3f, new Color(0, 0, 0, 0), 0.0f, n12, new Color(0, 0, 0, II.a(25015, 9185314684683719034L))));
            graphics2D.fillRect(0, 0, n11, n12);
            graphics2D.dispose();
            this.e.add(n10, imageIcon2);
            this.j.add(n10, imageIcon.getIconWidth() + II.a(-26561, -1343) + imageIcon.getIconHeight() + II.a(-26563, -27126));
            this.Y.add(n10, bufferedImage);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.w();
        this.v();
    }

    public void g(ImageIcon imageIcon) {
        block3: {
            II iI;
            block2: {
                String string = wb_0.m();
                iI = this;
                if (string == null) break block2;
                if (!iI.e.contains(imageIcon)) break block3;
                iI = this;
            }
            iI.G(this.e.indexOf(imageIcon));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void G(int var1_1) {
        block6: {
            block10: {
                block9: {
                    block8: {
                        block7: {
                            block5: {
                                var2_2 = wb_0.m();
                                v0 = var1_1;
                                if (var2_2 == null) break block5;
                                if (v0 < 0) break block6;
                                v0 = var1_1;
                            }
                            v1 = this.e.size();
                            if (var2_2 == null) break block7;
                            if (v0 >= v1) break block6;
                            v0 = this.i();
                            if (var2_2 == null) break block8;
                            v1 = var1_1;
                        }
                        v0 = v0 == v1 ? 1 : 0;
                    }
                    var3_3 = v0;
                    this.e.remove(var1_1);
                    this.j.remove(var1_1);
                    ((BufferedImage)this.Y.remove(var1_1)).flush();
                    this.w();
                    this.v();
                    v2 = var3_3;
                    if (var2_2 == null) break block9;
                    if (v2 == 0) break block6;
                    v3 = this;
                    if (var2_2 == null) break block10;
                    v2 = v3.e.size();
                }
                if (v2 <= 0) break block6;
                v3 = this;
            }
            v4 = var1_1;
            v5 = this.e.size();
            if (var2_2 == null) ** GOTO lbl42
            if (v4 < v5) {
                v6 = var1_1;
            } else {
                v4 = var1_1;
                v5 = 1;
lbl42:
                // 2 sources

                v6 = v4 - v5;
            }
            v3.T(v6);
        }
    }

    private void v() {
        String string = wb_0.m();
        II iI = this;
        if (string != null) {
            if (iI.getParent() instanceof JComponent) {
                ((JComponent)this.getParent()).revalidate();
            }
            iI = this;
        }
        iI.repaint();
    }

    private void w() {
        Iterator iterator = this.e.iterator();
        String string = wb_0.m();
        while (iterator.hasNext()) {
            ImageIcon imageIcon = (ImageIcon)iterator.next();
            this.k = Math.max(this.k, imageIcon.getIconWidth());
            this.O = Math.max(this.O, imageIcon.getIconHeight());
            if (string != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected void paintComponent(Graphics var1_1) {
        block12: {
            super.paintComponent(var1_1);
            var3_2 = this.getHeight();
            var4_3 = this.getWidth();
            v0 = wb_0.m();
            var5_4 = (Graphics2D)var1_1;
            var6_5 = RV.X(var5_4);
            var5_4.setPaint(new GradientPaint(0.0f, 0.0f, Color.black, 0.0f, var3_2, Color.darkGray));
            var5_4.fillRect(0, 0, var4_3, var3_2);
            var7_6 = this.getVisibleRect();
            var2_7 = v0;
            var8_8 = this.getPreferredSize();
            var9_9 = var5_4.getComposite();
            for (var10_10 = 0; var10_10 < this.e.size(); ++var10_10) {
                block19: {
                    block17: {
                        block18: {
                            block15: {
                                block16: {
                                    block13: {
                                        block14: {
                                            if (var2_7 == null) break block12;
                                            v1 /* !! */  = this.l(var10_10);
                                            if (var2_7 != null) {
                                                if (!v1 /* !! */ .intersects(var7_6) && var2_7 != null) continue;
                                                v1 /* !! */  = this.e.get(var10_10);
                                            }
                                            var11_11 = (ImageIcon)v1 /* !! */ ;
                                            var12_12 = xg_0.Z(var11_11);
                                            var13_13 = var11_11.getIconWidth();
                                            var14_14 = var11_11.getIconHeight();
                                            v2 = this.getWidth();
                                            v3 = var8_8.width;
                                            if (var2_7 == null) ** GOTO lbl29
                                            if (v2 > v3) {
                                                v2 = this.getWidth() - var8_8.width;
                                                v3 = 2;
lbl29:
                                                // 2 sources

                                                v4 = v2 / v3;
                                            } else {
                                                v4 = 0;
                                            }
                                            var15_15 = v4 + II.a(23296, 5169269775888493519L) + (this.k + II.a(23296, 5169269775888493519L)) * var10_10 + this.k / 2;
                                            var16_16 = var3_2 / 2 - II.a(31847, 2939842551265627316L) - var14_14 / 2;
                                            var17_17 = var3_2 / 2 + II.a(31847, 2939842551265627316L) + var14_14 / 2;
                                            v5 = this.p;
                                            v6 = var10_10;
                                            if (var2_7 == null) ** GOTO lbl43
                                            if (v5 == v6) {
                                                v7 = this.f * 0.4f;
                                            } else {
                                                v5 = this.d;
                                                v6 = var10_10;
lbl43:
                                                // 2 sources

                                                v7 = v5 == v6 ? 0.4f - this.f * 0.4f : 0.0f;
                                            }
                                            var18_18 = v7;
                                            var5_4.setComposite(AlphaComposite.getInstance(3, 0.6f + var18_18));
                                            var5_4.drawImage((Image)var12_12, var15_15 - var13_13 / 2, var16_16 - var14_14 / 2, null);
                                            var5_4.setPaint(this.p == var10_10 ? Color.WHITE : Color.GRAY);
                                            var19_19 = new Area(new RoundRectangle2D.Double(var15_15 - var13_13 / 2 - 3, var16_16 - var14_14 / 2 - 3, var13_13 + II.a(24403, 3740709584549031833L), var14_14 + II.a(24403, 3740709584549031833L), 6.0, 6.0));
                                            var19_19.subtract(new Area(new Rectangle(var15_15 - var13_13 / 2, var16_16 - var14_14 / 2, var13_13, var14_14)));
                                            var5_4.fill(var19_19);
                                            var5_4.setComposite(var9_9);
                                            v8 = this.p;
                                            v9 = var10_10;
                                            if (var2_7 == null) break block13;
                                            if (v8 == v9) break block14;
                                            v10 = this.d;
                                            v11 = var10_10;
                                            if (var2_7 == null) break block15;
                                            if (v10 != v11) break block16;
                                        }
                                        v12 = this;
                                        if (var2_7 == null) ** GOTO lbl69
                                        v8 = v12.p;
                                        v9 = var10_10;
                                    }
                                    if (v8 == v9) {
                                        v12 = this;
lbl69:
                                        // 2 sources

                                        v13 = v12.f;
                                    } else {
                                        v13 = 1.0f - this.f;
                                    }
                                    var20_21 = v13;
                                    var5_4.setComposite(AlphaComposite.getInstance(3, var20_21));
                                    var5_4.setPaint(Color.WHITE);
                                    var21_23 = (String)this.j.get(var10_10);
                                    var22_25 = GA.A(var5_4.getFontMetrics(), var21_23);
                                    var5_4.drawString(var21_23, var15_15 + var22_25.x, this.getHeight() / 2 + II.a(31847, 2939842551265627316L) + var22_25.y);
                                    var5_4.setComposite(var9_9);
                                }
                                v10 = var13_13;
                                v11 = II.a(24403, 3740709584549031833L);
                            }
                            var20_20 = v10 + v11;
                            var21_22 = var14_14 + II.a(24403, 3740709584549031833L);
                            v14 = this.p;
                            v15 = var10_10;
                            if (var2_7 == null) break block17;
                            if (v14 != v15) break block18;
                            v16 = Math.round(this.f * 20.0f);
                            break block19;
                        }
                        v14 = this.d;
                        v15 = var10_10;
                    }
                    if (var2_7 == null) ** GOTO lbl99
                    if (v14 == v15) {
                        v14 = II.a(23296, 5169269775888493519L);
                        v15 = Math.round(this.f * 20.0f);
lbl99:
                        // 2 sources

                        v16 = v14 - v15;
                    } else {
                        v16 = var22_24 = 0;
                    }
                }
                if (var2_7 != null) {
                    if (this.Y.get(var10_10) != null) {
                        var5_4.drawImage((Image)this.Y.get(var10_10), var15_15 - var13_13 / 2, var17_17 + var14_14 / 2 + var22_24, var13_13, -var14_14, null);
                    }
                    var19_19 = new Area(new RoundRectangle2D.Double(var15_15 - var20_20 / 2, var17_17 - var21_22 / 2 + var22_24, var20_20, var21_22, 6.0, 6.0));
                    var19_19.subtract(new Area(new Rectangle(var15_15 - var20_20 / 2 + 3, var17_17 - var21_22 / 2 + var22_24 + 3, var20_20 - II.a(24403, 3740709584549031833L), var21_22 - II.a(24403, 3740709584549031833L))));
                }
                var5_4.setPaint(new GradientPaint(0.0f, var17_17 - var14_14 / 2 + var22_24, this.p == var10_10 ? this.M : this.i, 0.0f, (float)(var17_17 - var14_14 / 2 + var22_24) + (float)var14_14 * 0.7f, this.p == var10_10 ? this.B : this.t));
                var5_4.fill(var19_19);
                if (var2_7 != null) continue;
            }
            RV.X(var5_4, var6_5);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(II.a(23296, 5169269775888493519L) * (this.e.size() + 1) + this.k * this.e.size(), II.a(23427, 2024366731169606474L) + this.O * 2);
    }

    static List d(II iI) {
        return iI.e;
    }

    static int a(II iI) {
        return iI.W;
    }

    static int i(II iI) {
        return iI.k;
    }

    static float Z(II iI) {
        return iI.f;
    }

    static float k(II iI, float f10) {
        return iI.f += f10;
    }

    static float T(II iI, float f10) {
        iI.f = f10;
        return iI.f;
    }

    static WC I(II iI) {
        return iI.s;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[9];
                        var11_1 = 0;
                        var10_2 = "\u00b4}\u0003\u00956#\u0004\u008ct\u00c9\u009f\u0003!5\u00ed\u0004\u00b76\u00ae\u00d7\u0004\u001e\u0013\u00cd|#\u0094\u00ce\u00d8\u00af\u000e\u001d\u00dc7\u0018\u00db6\f\u00ab\u00a8yH\u009eq\u00dfb\u008er#\u00bd\u0007\u00cb\u00c6\u000f\u00f6I\u00a7\u007f\u0011'*";
                        var12_3 = "\u00b4}\u0003\u00956#\u0004\u008ct\u00c9\u009f\u0003!5\u00ed\u0004\u00b76\u00ae\u00d7\u0004\u001e\u0013\u00cd|#\u0094\u00ce\u00d8\u00af\u000e\u001d\u00dc7\u0018\u00db6\f\u00ab\u00a8yH\u009eq\u00dfb\u008er#\u00bd\u0007\u00cb\u00c6\u000f\u00f6I\u00a7\u007f\u0011'*".length();
                        var9_4 = 2;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 38;
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
                            var10_2 = "\u0013>\u008c=\u0018\u0004\u00db\u0094I\u00f9";
                            var12_3 = "\u0013>\u008c=\u0018\u0004\u00db\u0094I\u00f9".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 6;
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
                                    v15 = 90;
                                    break;
                                }
                                case 1: {
                                    v15 = 106;
                                    break;
                                }
                                case 2: {
                                    v15 = 60;
                                    break;
                                }
                                case 3: {
                                    v15 = 89;
                                    break;
                                }
                                case 4: {
                                    v15 = 51;
                                    break;
                                }
                                case 5: {
                                    v15 = 32;
                                    break;
                                }
                                default: {
                                    v15 = 62;
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
                II.a = var13;
                II.b = new String[9];
                var0_7 = 6682705630396613201L;
                var6_8 = new long[18];
                var3_9 = 0;
                var4_10 = "\u0012\u009b*\u0002\u001a\u00d8\u00e4}Rw@\u000f\u0000O\u00cf\u00f9<\u00bc[\u001f(\u00f6\u00c0\u00b6\u00a8\u00a5\u0084\u00db\u0010U\u0099\u00cd\u00e4t\\\u00b5\u00a9\u00872jJ\u00a5\u0090]#\u00b4WB\u00aa\u008c\u0011\u009a\u00a0>\u00bf\u007f\u0088\u00e4C\u00b4p\u00e7\u00e9\u00f0\u00dd\u00e9\u0095t\f\u00ba\u00ad\u00cee\u00feJ\u0094\u0082\u00e4\u00ca\u00fc+\u00e4\u00cd\u00b7s\u00d2&\u0006\u008d\u00b4_\u008eD0\u00a9'\u00cf\u00c8\u0085\u00e5\u00b7\u00ac\u00e6\u00bf\u00a6B\u00caRe\u00b4)\u008a(\u00d9=$p\u00a4\u00fb\u00f1iCM\u009ft\u008b\u0093V";
                var5_11 = "\u0012\u009b*\u0002\u001a\u00d8\u00e4}Rw@\u000f\u0000O\u00cf\u00f9<\u00bc[\u001f(\u00f6\u00c0\u00b6\u00a8\u00a5\u0084\u00db\u0010U\u0099\u00cd\u00e4t\\\u00b5\u00a9\u00872jJ\u00a5\u0090]#\u00b4WB\u00aa\u008c\u0011\u009a\u00a0>\u00bf\u007f\u0088\u00e4C\u00b4p\u00e7\u00e9\u00f0\u00dd\u00e9\u0095t\f\u00ba\u00ad\u00cee\u00feJ\u0094\u0082\u00e4\u00ca\u00fc+\u00e4\u00cd\u00b7s\u00d2&\u0006\u008d\u00b4_\u008eD0\u00a9'\u00cf\u00c8\u0085\u00e5\u00b7\u00ac\u00e6\u00bf\u00a6B\u00caRe\u00b4)\u008a(\u00d9=$p\u00a4\u00fb\u00f1iCM\u009ft\u008b\u0093V".length();
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
                    var4_10 = "\u00dewRZ\u0084\u00ad1\u00c0\u00f2\u0093\u00a1K5\u008f\u000e\u00ef";
                    var5_11 = "\u00dewRZ\u0084\u00ad1\u00c0\u00f2\u0093\u00a1K5\u008f\u000e\u00ef".length();
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
        II.c = var6_8;
        II.g = new Integer[18];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF983E) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 208;
                    break;
                }
                case 1: {
                    n14 = 153;
                    break;
                }
                case 2: {
                    n14 = 132;
                    break;
                }
                case 3: {
                    n14 = 140;
                    break;
                }
                case 4: {
                    n14 = 94;
                    break;
                }
                case 5: {
                    n14 = 236;
                    break;
                }
                case 6: {
                    n14 = 161;
                    break;
                }
                case 7: {
                    n14 = 178;
                    break;
                }
                case 8: {
                    n14 = 69;
                    break;
                }
                case 9: {
                    n14 = 36;
                    break;
                }
                case 10: {
                    n14 = 125;
                    break;
                }
                case 11: {
                    n14 = 237;
                    break;
                }
                case 12: {
                    n14 = 71;
                    break;
                }
                case 13: {
                    n14 = 86;
                    break;
                }
                case 14: {
                    n14 = 61;
                    break;
                }
                case 15: {
                    n14 = 35;
                    break;
                }
                case 16: {
                    n14 = 85;
                    break;
                }
                case 17: {
                    n14 = 135;
                    break;
                }
                case 18: {
                    n14 = 136;
                    break;
                }
                case 19: {
                    n14 = 147;
                    break;
                }
                case 20: {
                    n14 = 66;
                    break;
                }
                case 21: {
                    n14 = 8;
                    break;
                }
                case 22: {
                    n14 = 195;
                    break;
                }
                case 23: {
                    n14 = 223;
                    break;
                }
                case 24: {
                    n14 = 242;
                    break;
                }
                case 25: {
                    n14 = 81;
                    break;
                }
                case 26: {
                    n14 = 126;
                    break;
                }
                case 27: {
                    n14 = 59;
                    break;
                }
                case 28: {
                    n14 = 96;
                    break;
                }
                case 29: {
                    n14 = 250;
                    break;
                }
                case 30: {
                    n14 = 99;
                    break;
                }
                case 31: {
                    n14 = 113;
                    break;
                }
                case 32: {
                    n14 = 170;
                    break;
                }
                case 33: {
                    n14 = 196;
                    break;
                }
                case 34: {
                    n14 = 16;
                    break;
                }
                case 35: {
                    n14 = 123;
                    break;
                }
                case 36: {
                    n14 = 224;
                    break;
                }
                case 37: {
                    n14 = 122;
                    break;
                }
                case 38: {
                    n14 = 0;
                    break;
                }
                case 39: {
                    n14 = 148;
                    break;
                }
                case 40: {
                    n14 = 4;
                    break;
                }
                case 41: {
                    n14 = 107;
                    break;
                }
                case 42: {
                    n14 = 53;
                    break;
                }
                case 43: {
                    n14 = 133;
                    break;
                }
                case 44: {
                    n14 = 220;
                    break;
                }
                case 45: {
                    n14 = 38;
                    break;
                }
                case 46: {
                    n14 = 221;
                    break;
                }
                case 47: {
                    n14 = 56;
                    break;
                }
                case 48: {
                    n14 = 200;
                    break;
                }
                case 49: {
                    n14 = 77;
                    break;
                }
                case 50: {
                    n14 = 171;
                    break;
                }
                case 51: {
                    n14 = 87;
                    break;
                }
                case 52: {
                    n14 = 14;
                    break;
                }
                case 53: {
                    n14 = 76;
                    break;
                }
                case 54: {
                    n14 = 189;
                    break;
                }
                case 55: {
                    n14 = 120;
                    break;
                }
                case 56: {
                    n14 = 163;
                    break;
                }
                case 57: {
                    n14 = 179;
                    break;
                }
                case 58: {
                    n14 = 111;
                    break;
                }
                case 59: {
                    n14 = 58;
                    break;
                }
                case 60: {
                    n14 = 175;
                    break;
                }
                case 61: {
                    n14 = 247;
                    break;
                }
                case 62: {
                    n14 = 102;
                    break;
                }
                case 63: {
                    n14 = 145;
                    break;
                }
                case 64: {
                    n14 = 128;
                    break;
                }
                case 65: {
                    n14 = 150;
                    break;
                }
                case 66: {
                    n14 = 83;
                    break;
                }
                case 67: {
                    n14 = 185;
                    break;
                }
                case 68: {
                    n14 = 165;
                    break;
                }
                case 69: {
                    n14 = 180;
                    break;
                }
                case 70: {
                    n14 = 246;
                    break;
                }
                case 71: {
                    n14 = 62;
                    break;
                }
                case 72: {
                    n14 = 60;
                    break;
                }
                case 73: {
                    n14 = 156;
                    break;
                }
                case 74: {
                    n14 = 90;
                    break;
                }
                case 75: {
                    n14 = 124;
                    break;
                }
                case 76: {
                    n14 = 129;
                    break;
                }
                case 77: {
                    n14 = 52;
                    break;
                }
                case 78: {
                    n14 = 92;
                    break;
                }
                case 79: {
                    n14 = 100;
                    break;
                }
                case 80: {
                    n14 = 168;
                    break;
                }
                case 81: {
                    n14 = 154;
                    break;
                }
                case 82: {
                    n14 = 229;
                    break;
                }
                case 83: {
                    n14 = 218;
                    break;
                }
                case 84: {
                    n14 = 40;
                    break;
                }
                case 85: {
                    n14 = 176;
                    break;
                }
                case 86: {
                    n14 = 143;
                    break;
                }
                case 87: {
                    n14 = 93;
                    break;
                }
                case 88: {
                    n14 = 5;
                    break;
                }
                case 89: {
                    n14 = 191;
                    break;
                }
                case 90: {
                    n14 = 73;
                    break;
                }
                case 91: {
                    n14 = 228;
                    break;
                }
                case 92: {
                    n14 = 47;
                    break;
                }
                case 93: {
                    n14 = 141;
                    break;
                }
                case 94: {
                    n14 = 30;
                    break;
                }
                case 95: {
                    n14 = 15;
                    break;
                }
                case 96: {
                    n14 = 252;
                    break;
                }
                case 97: {
                    n14 = 106;
                    break;
                }
                case 98: {
                    n14 = 155;
                    break;
                }
                case 99: {
                    n14 = 28;
                    break;
                }
                case 100: {
                    n14 = 226;
                    break;
                }
                case 101: {
                    n14 = 43;
                    break;
                }
                case 102: {
                    n14 = 12;
                    break;
                }
                case 103: {
                    n14 = 183;
                    break;
                }
                case 104: {
                    n14 = 204;
                    break;
                }
                case 105: {
                    n14 = 1;
                    break;
                }
                case 106: {
                    n14 = 144;
                    break;
                }
                case 107: {
                    n14 = 241;
                    break;
                }
                case 108: {
                    n14 = 164;
                    break;
                }
                case 109: {
                    n14 = 158;
                    break;
                }
                case 110: {
                    n14 = 240;
                    break;
                }
                case 111: {
                    n14 = 243;
                    break;
                }
                case 112: {
                    n14 = 194;
                    break;
                }
                case 113: {
                    n14 = 184;
                    break;
                }
                case 114: {
                    n14 = 192;
                    break;
                }
                case 115: {
                    n14 = 146;
                    break;
                }
                case 116: {
                    n14 = 49;
                    break;
                }
                case 117: {
                    n14 = 115;
                    break;
                }
                case 118: {
                    n14 = 112;
                    break;
                }
                case 119: {
                    n14 = 11;
                    break;
                }
                case 120: {
                    n14 = 89;
                    break;
                }
                case 121: {
                    n14 = 254;
                    break;
                }
                case 122: {
                    n14 = 169;
                    break;
                }
                case 123: {
                    n14 = 32;
                    break;
                }
                case 124: {
                    n14 = 78;
                    break;
                }
                case 125: {
                    n14 = 82;
                    break;
                }
                case 126: {
                    n14 = 198;
                    break;
                }
                case 127: {
                    n14 = 74;
                    break;
                }
                case 128: {
                    n14 = 19;
                    break;
                }
                case 129: {
                    n14 = 160;
                    break;
                }
                case 130: {
                    n14 = 44;
                    break;
                }
                case 131: {
                    n14 = 84;
                    break;
                }
                case 132: {
                    n14 = 70;
                    break;
                }
                case 133: {
                    n14 = 182;
                    break;
                }
                case 134: {
                    n14 = 201;
                    break;
                }
                case 135: {
                    n14 = 244;
                    break;
                }
                case 136: {
                    n14 = 233;
                    break;
                }
                case 137: {
                    n14 = 167;
                    break;
                }
                case 138: {
                    n14 = 64;
                    break;
                }
                case 139: {
                    n14 = 21;
                    break;
                }
                case 140: {
                    n14 = 7;
                    break;
                }
                case 141: {
                    n14 = 101;
                    break;
                }
                case 142: {
                    n14 = 91;
                    break;
                }
                case 143: {
                    n14 = 17;
                    break;
                }
                case 144: {
                    n14 = 231;
                    break;
                }
                case 145: {
                    n14 = 157;
                    break;
                }
                case 146: {
                    n14 = 9;
                    break;
                }
                case 147: {
                    n14 = 239;
                    break;
                }
                case 148: {
                    n14 = 222;
                    break;
                }
                case 149: {
                    n14 = 235;
                    break;
                }
                case 150: {
                    n14 = 3;
                    break;
                }
                case 151: {
                    n14 = 41;
                    break;
                }
                case 152: {
                    n14 = 166;
                    break;
                }
                case 153: {
                    n14 = 105;
                    break;
                }
                case 154: {
                    n14 = 199;
                    break;
                }
                case 155: {
                    n14 = 207;
                    break;
                }
                case 156: {
                    n14 = 39;
                    break;
                }
                case 157: {
                    n14 = 34;
                    break;
                }
                case 158: {
                    n14 = 217;
                    break;
                }
                case 159: {
                    n14 = 103;
                    break;
                }
                case 160: {
                    n14 = 173;
                    break;
                }
                case 161: {
                    n14 = 33;
                    break;
                }
                case 162: {
                    n14 = 142;
                    break;
                }
                case 163: {
                    n14 = 116;
                    break;
                }
                case 164: {
                    n14 = 65;
                    break;
                }
                case 165: {
                    n14 = 162;
                    break;
                }
                case 166: {
                    n14 = 188;
                    break;
                }
                case 167: {
                    n14 = 134;
                    break;
                }
                case 168: {
                    n14 = 54;
                    break;
                }
                case 169: {
                    n14 = 72;
                    break;
                }
                case 170: {
                    n14 = 139;
                    break;
                }
                case 171: {
                    n14 = 31;
                    break;
                }
                case 172: {
                    n14 = 203;
                    break;
                }
                case 173: {
                    n14 = 45;
                    break;
                }
                case 174: {
                    n14 = 26;
                    break;
                }
                case 175: {
                    n14 = 27;
                    break;
                }
                case 176: {
                    n14 = 42;
                    break;
                }
                case 177: {
                    n14 = 75;
                    break;
                }
                case 178: {
                    n14 = 205;
                    break;
                }
                case 179: {
                    n14 = 186;
                    break;
                }
                case 180: {
                    n14 = 187;
                    break;
                }
                case 181: {
                    n14 = 206;
                    break;
                }
                case 182: {
                    n14 = 18;
                    break;
                }
                case 183: {
                    n14 = 253;
                    break;
                }
                case 184: {
                    n14 = 118;
                    break;
                }
                case 185: {
                    n14 = 25;
                    break;
                }
                case 186: {
                    n14 = 193;
                    break;
                }
                case 187: {
                    n14 = 24;
                    break;
                }
                case 188: {
                    n14 = 104;
                    break;
                }
                case 189: {
                    n14 = 109;
                    break;
                }
                case 190: {
                    n14 = 255;
                    break;
                }
                case 191: {
                    n14 = 63;
                    break;
                }
                case 192: {
                    n14 = 37;
                    break;
                }
                case 193: {
                    n14 = 29;
                    break;
                }
                case 194: {
                    n14 = 214;
                    break;
                }
                case 195: {
                    n14 = 211;
                    break;
                }
                case 196: {
                    n14 = 121;
                    break;
                }
                case 197: {
                    n14 = 213;
                    break;
                }
                case 198: {
                    n14 = 117;
                    break;
                }
                case 199: {
                    n14 = 209;
                    break;
                }
                case 200: {
                    n14 = 177;
                    break;
                }
                case 201: {
                    n14 = 245;
                    break;
                }
                case 202: {
                    n14 = 232;
                    break;
                }
                case 203: {
                    n14 = 159;
                    break;
                }
                case 204: {
                    n14 = 48;
                    break;
                }
                case 205: {
                    n14 = 238;
                    break;
                }
                case 206: {
                    n14 = 152;
                    break;
                }
                case 207: {
                    n14 = 225;
                    break;
                }
                case 208: {
                    n14 = 114;
                    break;
                }
                case 209: {
                    n14 = 67;
                    break;
                }
                case 210: {
                    n14 = 98;
                    break;
                }
                case 211: {
                    n14 = 127;
                    break;
                }
                case 212: {
                    n14 = 50;
                    break;
                }
                case 213: {
                    n14 = 251;
                    break;
                }
                case 214: {
                    n14 = 80;
                    break;
                }
                case 215: {
                    n14 = 216;
                    break;
                }
                case 216: {
                    n14 = 210;
                    break;
                }
                case 217: {
                    n14 = 88;
                    break;
                }
                case 218: {
                    n14 = 119;
                    break;
                }
                case 219: {
                    n14 = 212;
                    break;
                }
                case 220: {
                    n14 = 137;
                    break;
                }
                case 221: {
                    n14 = 68;
                    break;
                }
                case 222: {
                    n14 = 2;
                    break;
                }
                case 223: {
                    n14 = 130;
                    break;
                }
                case 224: {
                    n14 = 181;
                    break;
                }
                case 225: {
                    n14 = 202;
                    break;
                }
                case 226: {
                    n14 = 13;
                    break;
                }
                case 227: {
                    n14 = 227;
                    break;
                }
                case 228: {
                    n14 = 57;
                    break;
                }
                case 229: {
                    n14 = 151;
                    break;
                }
                case 230: {
                    n14 = 79;
                    break;
                }
                case 231: {
                    n14 = 108;
                    break;
                }
                case 232: {
                    n14 = 172;
                    break;
                }
                case 233: {
                    n14 = 248;
                    break;
                }
                case 234: {
                    n14 = 10;
                    break;
                }
                case 235: {
                    n14 = 23;
                    break;
                }
                case 236: {
                    n14 = 95;
                    break;
                }
                case 237: {
                    n14 = 6;
                    break;
                }
                case 238: {
                    n14 = 215;
                    break;
                }
                case 239: {
                    n14 = 230;
                    break;
                }
                case 240: {
                    n14 = 97;
                    break;
                }
                case 241: {
                    n14 = 219;
                    break;
                }
                case 242: {
                    n14 = 197;
                    break;
                }
                case 243: {
                    n14 = 149;
                    break;
                }
                case 244: {
                    n14 = 20;
                    break;
                }
                case 245: {
                    n14 = 174;
                    break;
                }
                case 246: {
                    n14 = 22;
                    break;
                }
                case 247: {
                    n14 = 51;
                    break;
                }
                case 248: {
                    n14 = 138;
                    break;
                }
                case 249: {
                    n14 = 249;
                    break;
                }
                case 250: {
                    n14 = 46;
                    break;
                }
                case 251: {
                    n14 = 55;
                    break;
                }
                case 252: {
                    n14 = 234;
                    break;
                }
                case 253: {
                    n14 = 190;
                    break;
                }
                case 254: {
                    n14 = 131;
                    break;
                }
                default: {
                    n14 = 110;
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
            II.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x70C2;
        if (g[n11] == null) {
            II.g[n11] = (int)(c[n11] ^ l2);
        }
        return g[n11];
    }
}

