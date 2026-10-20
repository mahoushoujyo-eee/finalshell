/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FH;
import com.FN;
import com.GA;
import com.GO;
import com.L0;
import com.RV;
import com.W2;
import com.WC;
import com.X1;
import com._a_0;
import com.by_0;
import com.ky_2;
import com.wl_0;
import com.zM;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicProgressBarUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Ej
 */
public class ej_0
extends BasicProgressBarUI
implements W2,
L0 {
    private static final AffineTransform M;
    private Color G = wl_0.X;
    private Color W = wl_0.T;
    private Color z = wl_0.m;
    private Color B = wl_0.k;
    private Color y = wl_0.V;
    private Color d = wl_0.E;
    private Color h = wl_0.Y;
    private Color O = wl_0.K;
    private Color k = wl_0.N;
    private int D = wl_0.A;
    private int Y = wl_0.h;
    private int Z = wl_0.R;
    private boolean Q = wl_0.U;
    private int P = wl_0.c;
    private final int v = ej_0.a(19684, 7610382587420619153L);
    private int F;
    private WC X;
    private PropertyChangeListener t;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    public ej_0() {
        int n10 = by_0.J();
        this.F = 0;
        this.X = null;
        if (ky_2.F() != null) {
            by_0.Z(++n10);
        }
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new ej_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.progressBar);
        LookAndFeel.installProperty(this.progressBar, ej_0.a(29835, 13665), Boolean.FALSE);
        this.progressBar.setBorderPainted(false);
        this.progressBar.setForeground(Color.DARK_GRAY);
        this.h();
        this.t = new _a_0(this);
        this.progressBar.addPropertyChangeListener(ej_0.a(29832, -9542), this.t);
        this.progressBar.addPropertyChangeListener(ej_0.a(29833, -6543), this.t);
        this.o(this.progressBar);
        jComponent.addAncestorListener(new FH(this));
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        int n10 = by_0.y();
        jComponent.removePropertyChangeListener(this.t);
        int n11 = n10;
        ej_0 ej_02 = this;
        if (n11 != 0) {
            if (ej_02.X != null) {
                this.X.Y();
            }
            ej_02 = this;
        }
        super.uninstallUI(jComponent);
    }

    @Override
    public void h() {
        block6: {
            JProgressBar jProgressBar;
            int n10;
            block5: {
                n10 = by_0.y();
                jProgressBar = this.progressBar;
                if (n10 == 0) break block5;
                if (jProgressBar == null) break block6;
                jProgressBar = this.progressBar;
            }
            if (n10 != 0) {
                if (FN.l(jProgressBar)) {
                    return;
                }
                jProgressBar = this.progressBar;
            }
            jProgressBar.setBorder(GA.C(this.Z + 1, this.Z + 1, this.Z + 1, this.Z + 1));
        }
    }

    public int A() {
        return this.D;
    }

    public void K(int n10) {
        this.D = n10;
    }

    public int W() {
        return this.Y;
    }

    public void y(int n10) {
        this.Y = n10;
    }

    public int J() {
        return this.Z;
    }

    public void i(int n10) {
        this.Z = n10;
        this.h();
    }

    public boolean f() {
        return this.Q;
    }

    public void i(boolean bl) {
        this.Q = bl;
    }

    public int Y() {
        return this.P;
    }

    public void j(int n10) {
        this.P = n10;
    }

    public Color j() {
        return this.G;
    }

    public void M(Color color) {
        this.G = color;
    }

    public Color l() {
        return this.W;
    }

    public void m(Color color) {
        this.W = color;
    }

    public Color z() {
        return this.z;
    }

    public void f(Color color) {
        this.z = color;
    }

    public Color p() {
        return this.B;
    }

    public void G(Color color) {
        this.B = color;
    }

    public Color H() {
        return this.y;
    }

    public void Y(Color color) {
        this.y = color;
    }

    public Color g() {
        return this.d;
    }

    public void C(Color color) {
        this.d = color;
    }

    public Color N() {
        return this.h;
    }

    public void Q(Color color) {
        this.h = color;
    }

    public Color D() {
        return this.O;
    }

    public void u(Color color) {
        this.O = color;
    }

    public Color J() {
        return this.k;
    }

    public void e(Color color) {
        this.k = color;
    }

    @Override
    public Shape B() {
        return GA.X(this.progressBar, this.J(), this.A());
    }

    private void o(JProgressBar jProgressBar) {
        block5: {
            block9: {
                block8: {
                    boolean bl;
                    int n10;
                    block7: {
                        block6: {
                            JProgressBar jProgressBar2;
                            block4: {
                                n10 = by_0.y();
                                WC wC = this.X;
                                if (n10 != 0 && wC != null) {
                                    wC = this.X.Y();
                                }
                                jProgressBar2 = jProgressBar;
                                if (n10 == 0) break block4;
                                if (FN.L(jProgressBar2) == null) break block5;
                                jProgressBar2 = jProgressBar;
                            }
                            bl = jProgressBar2.isShowing();
                            if (n10 == 0) break block6;
                            if (!bl) break block5;
                            bl = jProgressBar.isEnabled();
                        }
                        if (n10 == 0) break block7;
                        if (!bl) break block5;
                        bl = jProgressBar.isIndeterminate();
                    }
                    if (!bl) break block8;
                    this.F = 0;
                    this.X = new WC(ej_0.a(29837, -493), GO.FK, (ActionListener)new zM(this, jProgressBar));
                    this.X.r(false);
                    if (n10 != 0) break block9;
                }
                this.F = ej_0.a(1938, 9050229893902891744L);
                this.X = new WC(ej_0.a(29834, 17307), GO.FK, (ActionListener)new X1(this, jProgressBar));
            }
            this.X.r(false);
            this.X.u();
        }
    }

    @Override
    protected Dimension getPreferredInnerHorizontal() {
        Dimension dimension = super.getPreferredInnerHorizontal();
        dimension.width = this.P;
        return dimension;
    }

    @Override
    protected Dimension getPreferredInnerVertical() {
        Dimension dimension = super.getPreferredInnerVertical();
        dimension.height = this.P;
        return dimension;
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        Object object = RV.O(graphics);
        super.paint(graphics, jComponent);
        RV.s(graphics, object);
    }

    @Override
    protected void paintIndeterminate(Graphics graphics, JComponent jComponent) {
        Graphics2D graphics2D;
        Shape shape;
        Graphics2D graphics2D2;
        block14: {
            int n10;
            block11: {
                JComponent jComponent2;
                block13: {
                    int n11;
                    Shape shape2;
                    block12: {
                        block10: {
                            graphics2D2 = (Graphics2D)graphics;
                            this.b(jComponent, graphics2D2);
                            shape = this.c(jComponent);
                            shape2 = graphics2D2.getClip();
                            Area area = new Area(shape);
                            int n12 = by_0.y();
                            area.intersect(new Area(shape2));
                            graphics2D2.setClip(area);
                            GeneralPath generalPath = this.K(jComponent);
                            AffineTransform affineTransform = new AffineTransform();
                            n11 = n12;
                            affineTransform.translate(this.F, 0.0);
                            generalPath.transform(affineTransform);
                            int n13 = 0;
                            while (n13 < jComponent.getWidth() - this.Z * 2 - 4 - 1 + ej_0.a(9218, 744703668060313971L)) {
                                graphics2D2.setPaint(new GradientPaint(0.0f, this.Z, this.z, 0.0f, jComponent.getHeight() - this.Z, this.B));
                                graphics2D2.fill(generalPath);
                                if (n11 != 0) {
                                    n10 = this.Q ? 1 : 0;
                                    if (n11 == 0) break block10;
                                    if (n10 != 0) {
                                        graphics2D2.setPaint(this.h);
                                        graphics2D2.draw(generalPath);
                                    }
                                    n13 += 40;
                                    generalPath.transform(M);
                                }
                                if (n11 != 0) continue;
                                ky_2.K(new String[2]);
                                break;
                            }
                            n10 = this.progressBar.isStringPainted();
                        }
                        if (n11 == 0) break block11;
                        if (n10 == 0) break block12;
                        jComponent2 = this.progressBar;
                        if (n11 == 0) break block13;
                        if (jComponent2.getString() == null) break block12;
                        n10 = this.progressBar.getString().trim().length();
                        if (n11 == 0) break block11;
                        if (n10 > 0) {
                            int n14 = graphics2D2.getFontMetrics().stringWidth(this.progressBar.getString());
                            float f10 = (float)n14 / (float)(this.progressBar.getWidth() * 2);
                            float f11 = 0.5f - f10;
                            float f12 = 0.5f + f10;
                            graphics2D2.setPaint(new LinearGradientPaint(0.0f, 0.0f, this.progressBar.getWidth(), 0.0f, new float[]{f11 / 2.0f, f11, f12, f12 + (1.0f - f12) / 2.0f}, new Color[]{GO.l, this.O, this.O, GO.l}));
                            graphics2D2.fill(shape);
                        }
                    }
                    graphics2D = graphics2D2;
                    if (n11 == 0) break block14;
                    graphics2D.setClip(shape2);
                    jComponent2 = jComponent;
                }
                n10 = jComponent2.isEnabled();
            }
            if (n10 != 0) {
                RV.Y(graphics2D2, shape, GO.r, this.Z);
            }
            graphics2D = graphics2D2;
        }
        graphics2D.setPaint(jComponent.isEnabled() ? this.y : this.d);
        graphics2D2.draw(shape);
        this.J(graphics2D2);
    }

    @Override
    protected void paintDeterminate(Graphics graphics, JComponent jComponent) {
        ej_0 ej_02;
        Graphics2D graphics2D;
        block8: {
            block9: {
                Graphics2D graphics2D2;
                Shape shape;
                block14: {
                    block15: {
                        Shape shape2;
                        block18: {
                            block19: {
                                int n10;
                                int n11;
                                block16: {
                                    block17: {
                                        block12: {
                                            block13: {
                                                int n12;
                                                block10: {
                                                    block11: {
                                                        graphics2D = (Graphics2D)graphics;
                                                        n11 = by_0.y();
                                                        this.b(jComponent, graphics2D);
                                                        ej_02 = this;
                                                        if (n11 == 0) break block8;
                                                        if (ej_02.progressBar.getValue() <= this.progressBar.getMinimum()) break block9;
                                                        shape = this.U(jComponent);
                                                        n12 = jComponent.isEnabled();
                                                        if (n11 != 0) {
                                                            if (n12 != 0) {
                                                                RV.Y(graphics2D, shape, GO.r, this.Z);
                                                            }
                                                            n12 = this.progressBar.getOrientation();
                                                        }
                                                        if (n11 == 0) break block10;
                                                        if (n12 != 0) break block11;
                                                        graphics2D.setPaint(new GradientPaint(0.0f, this.Z, this.z, 0.0f, jComponent.getHeight() - this.Z, this.B));
                                                        if (n11 != 0) break block12;
                                                    }
                                                    n12 = this.progressBar.getComponentOrientation().isLeftToRight() ? 1 : 0;
                                                }
                                                if (n12 == 0) break block13;
                                                graphics2D.setPaint(new GradientPaint(this.Z, 0.0f, this.z, jComponent.getWidth() - this.Z, 0.0f, this.B));
                                                if (n11 != 0) break block12;
                                            }
                                            graphics2D.setPaint(new GradientPaint(this.Z, 0.0f, this.B, jComponent.getWidth() - this.Z, 0.0f, this.z));
                                        }
                                        graphics2D2 = graphics2D;
                                        if (n11 == 0) break block14;
                                        graphics2D2.fill(shape);
                                        if (!jComponent.isEnabled()) break block15;
                                        shape2 = graphics2D.getClip();
                                        Area area = new Area(shape);
                                        area.intersect(new Area(shape2));
                                        graphics2D.setClip(area);
                                        n10 = this.progressBar.getOrientation();
                                        if (n11 == 0) break block16;
                                        if (n10 != 0) break block17;
                                        graphics2D.setPaint(new RadialGradientPaint(this.Z * 2 + this.F + ej_0.a(25459, 2939179844087422464L), (float)(this.progressBar.getHeight() / 2), 60.0f, new float[]{0.0f, 1.0f}, new Color[]{this.k, GO.l}));
                                        if (n11 != 0) break block18;
                                    }
                                    n10 = this.progressBar.getComponentOrientation().isLeftToRight() ? 1 : 0;
                                }
                                if (n10 == 0) break block19;
                                graphics2D.setPaint(new RadialGradientPaint(jComponent.getWidth() / 2, (float)(jComponent.getHeight() - this.Z * 2 - this.F - ej_0.a(25765, 8939289877014059473L)), 60.0f, new float[]{0.0f, 1.0f}, new Color[]{this.k, GO.l}));
                                if (n11 != 0) break block18;
                            }
                            graphics2D.setPaint(new RadialGradientPaint(jComponent.getWidth() / 2, (float)(this.Z * 2 + this.F + ej_0.a(25765, 8939289877014059473L)), 60.0f, new float[]{0.0f, 1.0f}, new Color[]{this.k, GO.l}));
                        }
                        graphics2D.fill(shape);
                        graphics2D.setClip(shape2);
                    }
                    graphics2D2 = graphics2D;
                }
                graphics2D2.setPaint(jComponent.isEnabled() ? this.y : this.d);
                graphics2D.draw(shape);
            }
            ej_02 = this;
        }
        ej_02.J(graphics2D);
    }

    /*
     * Unable to fully structure code
     */
    private void J(Graphics2D var1_1) {
        block15: {
            block19: {
                block18: {
                    block17: {
                        block16: {
                            block14: {
                                var2_2 = by_0.J();
                                v0 = this.progressBar.isStringPainted();
                                if (var2_2 != 0) break block14;
                                if (v0 == 0) break block15;
                                v1 = this.progressBar;
                                if (var2_2 != 0) break block16;
                                v0 = v1.getOrientation();
                            }
                            if (v0 == 1) {
                                var1_1.translate(this.progressBar.getWidth() / 2, this.progressBar.getHeight() / 2);
                                v2 = this.progressBar.getComponentOrientation().isLeftToRight();
                                if (var2_2 == 0) {
                                    v2 = v2 != 0 ? -1 : 1;
                                }
                                var1_1.rotate((double)v2 * 3.141592653589793 / 2.0);
                                var1_1.translate(-this.progressBar.getWidth() / 2, -this.progressBar.getHeight() / 2);
                            }
                            v1 = this.progressBar;
                        }
                        var3_3 = v1.getString();
                        var4_4 = GA.A(var1_1.getFontMetrics(), var3_3);
                        if (var2_2 != 0) break block17;
                        if (this.progressBar.isEnabled()) break block18;
                        var1_1.setPaint(Color.WHITE);
                    }
                    var1_1.drawString(var3_3, this.progressBar.getWidth() / 2 + var4_4.x + 1, this.progressBar.getHeight() / 2 + var4_4.y + 1);
                }
                v3 = this.progressBar;
                if (var2_2 != 0) ** GOTO lbl30
                if (v3.isEnabled()) {
                    v3 = this.progressBar;
lbl30:
                    // 2 sources

                    v4 = v3.getForeground();
                } else {
                    v4 = GO.y;
                }
                var1_1.setPaint(v4);
                v5 = var1_1;
                if (var2_2 != 0) break block19;
                v5.drawString(var3_3, this.progressBar.getWidth() / 2 + var4_4.x, this.progressBar.getHeight() / 2 + var4_4.y);
                if (this.progressBar.getOrientation() != 1) break block15;
                v5 = var1_1;
            }
            v6 = this.progressBar.getComponentOrientation().isLeftToRight();
            if (var2_2 == 0) {
                v6 = v6 != 0 ? 1 : -1;
            }
            v5.rotate((double)v6 * 3.141592653589793 / 2.0);
        }
    }

    private void b(JComponent jComponent, Graphics2D graphics2D) {
        Shape shape;
        block6: {
            block5: {
                shape = this.c(jComponent);
                int n10 = by_0.J();
                int n11 = jComponent.isEnabled();
                if (n10 == 0) {
                    if (n11 != 0) {
                        RV.Y(graphics2D, shape, GO.r, this.Z);
                    }
                    n11 = this.progressBar.getOrientation();
                }
                if (n11 != 0) break block5;
                graphics2D.setPaint(new GradientPaint(0.0f, this.Z, this.G, 0.0f, jComponent.getHeight() - this.Z, this.W));
                if (n10 == 0) break block6;
            }
            graphics2D.setPaint(new GradientPaint(this.Z, 0.0f, this.G, jComponent.getWidth() - this.Z, 0.0f, this.W));
        }
        graphics2D.fill(shape);
        graphics2D.setPaint(jComponent.isEnabled() ? this.y : this.d);
        graphics2D.draw(shape);
    }

    private Shape c(JComponent jComponent) {
        if (this.D > 0) {
            return new RoundRectangle2D.Double(this.Z, this.Z, jComponent.getWidth() - this.Z * 2 - 1, jComponent.getHeight() - this.Z * 2 - 1, this.D * 2, this.D * 2);
        }
        return new Rectangle2D.Double(this.Z, this.Z, jComponent.getWidth() - this.Z * 2 - 1, jComponent.getHeight() - this.Z * 2 - 1);
    }

    private Shape U(JComponent jComponent) {
        int n10 = this.w();
        int n11 = by_0.J();
        int n12 = this.progressBar.getOrientation();
        if (n11 == 0) {
            if (n12 == 0) {
                if (this.Y > 0) {
                    return new RoundRectangle2D.Double(this.Z * 2, this.Z * 2, n10 - 1, jComponent.getHeight() - this.Z * 4 - 1, this.Y * 2, this.Y * 2);
                }
                return new Rectangle2D.Double(this.Z * 2, this.Z * 2, n10 - 1, jComponent.getHeight() - this.Z * 4 - 1);
            }
            n12 = this.progressBar.getComponentOrientation().isLeftToRight() ? 1 : 0;
        }
        if (n11 == 0) {
            if (n12 != 0) {
                if (this.Y > 0) {
                    return new RoundRectangle2D.Double(this.Z * 2, jComponent.getHeight() - n10 - this.Z * 2, jComponent.getWidth() - this.Z * 4 - 1, n10 - 1, this.Y * 2, this.Y * 2);
                }
                return new Rectangle2D.Double(this.Z * 2, jComponent.getHeight() - n10 - this.Z * 2, jComponent.getWidth() - this.Z * 4 - 1, n10 - 1);
            }
            n12 = this.Y;
        }
        if (n12 > 0) {
            return new RoundRectangle2D.Double(this.Z * 2, this.Z * 2, jComponent.getWidth() - this.Z * 4 - 1, n10 - 1, this.Y * 2, this.Y * 2);
        }
        return new Rectangle2D.Double(this.Z * 2, this.Z * 2, jComponent.getWidth() - this.Z * 4 - 1, n10 - 1);
    }

    private int w() {
        int n10;
        block6: {
            int n11;
            block7: {
                block8: {
                    int n12;
                    block2: {
                        block3: {
                            block4: {
                                int n13;
                                block5: {
                                    n12 = by_0.y();
                                    n11 = this.progressBar.isIndeterminate();
                                    if (n12 == 0) break block2;
                                    if (n11 == 0) break block3;
                                    n13 = this.progressBar.getOrientation();
                                    if (n12 == 0) break block4;
                                    if (n13 != 0) break block5;
                                    n10 = this.progressBar.getWidth() - this.Z * 4;
                                    if (n12 != 0) break block6;
                                }
                                n13 = n10 = this.progressBar.getHeight() - this.Z * 4;
                            }
                            if (n12 != 0) break block6;
                        }
                        n11 = this.progressBar.getOrientation();
                    }
                    if (n12 == 0) break block7;
                    if (n11 != 0) break block8;
                    n10 = (int)((float)(this.progressBar.getWidth() - this.Z * 4) * ((float)(this.progressBar.getValue() - this.progressBar.getMinimum()) / (float)(this.progressBar.getMaximum() - this.progressBar.getMinimum())));
                    if (n12 != 0) break block6;
                }
                n11 = (int)((float)(this.progressBar.getHeight() - this.Z * 4) * ((float)(this.progressBar.getValue() - this.progressBar.getMinimum()) / (float)(this.progressBar.getMaximum() - this.progressBar.getMinimum())));
            }
            n10 = n11;
        }
        return n10;
    }

    private GeneralPath K(JComponent jComponent) {
        GeneralPath generalPath = new GeneralPath(0);
        generalPath.moveTo(this.Z * 2 - ej_0.a(24828, 5754316187628838282L), jComponent.getHeight() - this.Z - 1);
        generalPath.lineTo(this.Z * 2 - ej_0.a(5976, 8244334151043213864L), this.Z);
        generalPath.lineTo(this.Z * 2, this.Z);
        generalPath.lineTo(this.Z * 2 - ej_0.a(23526, 6615173419979679377L), jComponent.getHeight() - this.Z - 1);
        generalPath.closePath();
        return generalPath;
    }

    static JProgressBar P(ej_0 ej_02) {
        return ej_02.progressBar;
    }

    static void X(ej_0 ej_02, JProgressBar jProgressBar) {
        ej_02.o(jProgressBar);
    }

    static JProgressBar c(ej_0 ej_02) {
        return ej_02.progressBar;
    }

    static JProgressBar O(ej_0 ej_02) {
        return ej_02.progressBar;
    }

    static int g(ej_0 ej_02) {
        return ej_02.F;
    }

    static int L(ej_0 ej_02) {
        return ej_02.F++;
    }

    static int X(ej_0 ej_02, int n10) {
        ej_02.F = n10;
        return ej_02.F;
    }

    static int I(ej_0 ej_02) {
        return ej_02.w();
    }

    static int C(ej_0 ej_02, int n10) {
        return ej_02.F += n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "\u00c2\u00a0.\u00c1\u00c2-\u0086\r\u00beE)z\u009f\u00bd 1\u00a6V\u00e5;\u00ca\u0006\u00fd\u00c2\u0082CN\f";
                        var12_3 = "\u00c2\u00a0.\u00c1\u00c2-\u0086\r\u00beE)z\u009f\u00bd 1\u00a6V\u00e5;\u00ca\u0006\u00fd\u00c2\u0082CN\f".length();
                        var9_4 = 7;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 112;
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
                            var10_2 = "B\u00c4L\u0010\u00f6l\u00dbZg\u00dfG\u0087\u00cf\u00d6\u00c6]\u00d2\u00bb\u00fc\b\u000f\u0003\u00a7\u0099m\u0019Nu\u00cd&\u00c6\u00aa\u00dd\u0082\u00a7\u00c4_\u00e4\u00cc\u00ba\u00a6\u00d0\u00de\n}>?\u00c5\u00a1A\u00ad";
                            var12_3 = "B\u00c4L\u0010\u00f6l\u00dbZg\u00dfG\u0087\u00cf\u00d6\u00c6]\u00d2\u00bb\u00fc\b\u000f\u0003\u00a7\u0099m\u0019Nu\u00cd&\u00c6\u00aa\u00dd\u0082\u00a7\u00c4_\u00e4\u00cc\u00ba\u00a6\u00d0\u00de\n}>?\u00c5\u00a1A\u00ad".length();
                            var9_4 = 25;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 81;
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
                                    v15 = 85;
                                    break;
                                }
                                case 1: {
                                    v15 = 73;
                                    break;
                                }
                                case 2: {
                                    v15 = 10;
                                    break;
                                }
                                case 3: {
                                    v15 = 67;
                                    break;
                                }
                                case 4: {
                                    v15 = 25;
                                    break;
                                }
                                case 5: {
                                    v15 = 72;
                                    break;
                                }
                                default: {
                                    v15 = 6;
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
                ej_0.a = var13;
                ej_0.b = new String[5];
                var0_7 = 5010098751501581439L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = "g\u00c2\u00ec\u00b8\u0082\u00ad9\u0017\u0011/\u00ee\u001c\u00fd0\u00a2Cr\u00c2\t\u00e1\u00f6lVC\u001b\u00faO\u00daIKe$\u001eO\u00f3\u008d\u00d4\u0004\u00a1\u00dd\\\u00d0$\u00dfU\u009f\u009a\u00fa";
                var5_11 = "g\u00c2\u00ec\u00b8\u0082\u00ad9\u0017\u0011/\u00ee\u001c\u00fd0\u00a2Cr\u00c2\t\u00e1\u00f6lVC\u001b\u00faO\u00daIKe$\u001eO\u00f3\u008d\u00d4\u0004\u00a1\u00dd\\\u00d0$\u00dfU\u009f\u009a\u00fa".length();
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
                    var4_10 = "\u00f3.\u0017V\u00cbJ%\u0092oc\u00a5\u001a\\\u00e7\b2";
                    var5_11 = "\u00f3.\u0017V\u00cbJ%\u0092oc\u00a5\u001a\\\u00e7\b2".length();
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
        ej_0.c = var6_8;
        ej_0.e = new Integer[8];
        ej_0.M = new AffineTransform();
        ej_0.M.translate(40.0, 0.0);
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x7489) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 93;
                    break;
                }
                case 1: {
                    n14 = 179;
                    break;
                }
                case 2: {
                    n14 = 38;
                    break;
                }
                case 3: {
                    n14 = 62;
                    break;
                }
                case 4: {
                    n14 = 67;
                    break;
                }
                case 5: {
                    n14 = 16;
                    break;
                }
                case 6: {
                    n14 = 236;
                    break;
                }
                case 7: {
                    n14 = 81;
                    break;
                }
                case 8: {
                    n14 = 86;
                    break;
                }
                case 9: {
                    n14 = 71;
                    break;
                }
                case 10: {
                    n14 = 160;
                    break;
                }
                case 11: {
                    n14 = 131;
                    break;
                }
                case 12: {
                    n14 = 84;
                    break;
                }
                case 13: {
                    n14 = 188;
                    break;
                }
                case 14: {
                    n14 = 220;
                    break;
                }
                case 15: {
                    n14 = 46;
                    break;
                }
                case 16: {
                    n14 = 234;
                    break;
                }
                case 17: {
                    n14 = 102;
                    break;
                }
                case 18: {
                    n14 = 55;
                    break;
                }
                case 19: {
                    n14 = 156;
                    break;
                }
                case 20: {
                    n14 = 51;
                    break;
                }
                case 21: {
                    n14 = 5;
                    break;
                }
                case 22: {
                    n14 = 57;
                    break;
                }
                case 23: {
                    n14 = 224;
                    break;
                }
                case 24: {
                    n14 = 0;
                    break;
                }
                case 25: {
                    n14 = 130;
                    break;
                }
                case 26: {
                    n14 = 182;
                    break;
                }
                case 27: {
                    n14 = 201;
                    break;
                }
                case 28: {
                    n14 = 184;
                    break;
                }
                case 29: {
                    n14 = 232;
                    break;
                }
                case 30: {
                    n14 = 157;
                    break;
                }
                case 31: {
                    n14 = 122;
                    break;
                }
                case 32: {
                    n14 = 155;
                    break;
                }
                case 33: {
                    n14 = 237;
                    break;
                }
                case 34: {
                    n14 = 133;
                    break;
                }
                case 35: {
                    n14 = 110;
                    break;
                }
                case 36: {
                    n14 = 211;
                    break;
                }
                case 37: {
                    n14 = 135;
                    break;
                }
                case 38: {
                    n14 = 123;
                    break;
                }
                case 39: {
                    n14 = 227;
                    break;
                }
                case 40: {
                    n14 = 223;
                    break;
                }
                case 41: {
                    n14 = 171;
                    break;
                }
                case 42: {
                    n14 = 25;
                    break;
                }
                case 43: {
                    n14 = 146;
                    break;
                }
                case 44: {
                    n14 = 250;
                    break;
                }
                case 45: {
                    n14 = 14;
                    break;
                }
                case 46: {
                    n14 = 142;
                    break;
                }
                case 47: {
                    n14 = 186;
                    break;
                }
                case 48: {
                    n14 = 202;
                    break;
                }
                case 49: {
                    n14 = 52;
                    break;
                }
                case 50: {
                    n14 = 193;
                    break;
                }
                case 51: {
                    n14 = 144;
                    break;
                }
                case 52: {
                    n14 = 41;
                    break;
                }
                case 53: {
                    n14 = 80;
                    break;
                }
                case 54: {
                    n14 = 91;
                    break;
                }
                case 55: {
                    n14 = 119;
                    break;
                }
                case 56: {
                    n14 = 141;
                    break;
                }
                case 57: {
                    n14 = 36;
                    break;
                }
                case 58: {
                    n14 = 82;
                    break;
                }
                case 59: {
                    n14 = 191;
                    break;
                }
                case 60: {
                    n14 = 245;
                    break;
                }
                case 61: {
                    n14 = 10;
                    break;
                }
                case 62: {
                    n14 = 137;
                    break;
                }
                case 63: {
                    n14 = 203;
                    break;
                }
                case 64: {
                    n14 = 252;
                    break;
                }
                case 65: {
                    n14 = 194;
                    break;
                }
                case 66: {
                    n14 = 100;
                    break;
                }
                case 67: {
                    n14 = 98;
                    break;
                }
                case 68: {
                    n14 = 168;
                    break;
                }
                case 69: {
                    n14 = 213;
                    break;
                }
                case 70: {
                    n14 = 138;
                    break;
                }
                case 71: {
                    n14 = 26;
                    break;
                }
                case 72: {
                    n14 = 109;
                    break;
                }
                case 73: {
                    n14 = 150;
                    break;
                }
                case 74: {
                    n14 = 246;
                    break;
                }
                case 75: {
                    n14 = 196;
                    break;
                }
                case 76: {
                    n14 = 108;
                    break;
                }
                case 77: {
                    n14 = 56;
                    break;
                }
                case 78: {
                    n14 = 53;
                    break;
                }
                case 79: {
                    n14 = 103;
                    break;
                }
                case 80: {
                    n14 = 162;
                    break;
                }
                case 81: {
                    n14 = 49;
                    break;
                }
                case 82: {
                    n14 = 1;
                    break;
                }
                case 83: {
                    n14 = 153;
                    break;
                }
                case 84: {
                    n14 = 189;
                    break;
                }
                case 85: {
                    n14 = 68;
                    break;
                }
                case 86: {
                    n14 = 198;
                    break;
                }
                case 87: {
                    n14 = 40;
                    break;
                }
                case 88: {
                    n14 = 226;
                    break;
                }
                case 89: {
                    n14 = 149;
                    break;
                }
                case 90: {
                    n14 = 66;
                    break;
                }
                case 91: {
                    n14 = 6;
                    break;
                }
                case 92: {
                    n14 = 183;
                    break;
                }
                case 93: {
                    n14 = 175;
                    break;
                }
                case 94: {
                    n14 = 47;
                    break;
                }
                case 95: {
                    n14 = 148;
                    break;
                }
                case 96: {
                    n14 = 176;
                    break;
                }
                case 97: {
                    n14 = 70;
                    break;
                }
                case 98: {
                    n14 = 231;
                    break;
                }
                case 99: {
                    n14 = 13;
                    break;
                }
                case 100: {
                    n14 = 28;
                    break;
                }
                case 101: {
                    n14 = 207;
                    break;
                }
                case 102: {
                    n14 = 219;
                    break;
                }
                case 103: {
                    n14 = 214;
                    break;
                }
                case 104: {
                    n14 = 205;
                    break;
                }
                case 105: {
                    n14 = 127;
                    break;
                }
                case 106: {
                    n14 = 129;
                    break;
                }
                case 107: {
                    n14 = 59;
                    break;
                }
                case 108: {
                    n14 = 132;
                    break;
                }
                case 109: {
                    n14 = 99;
                    break;
                }
                case 110: {
                    n14 = 163;
                    break;
                }
                case 111: {
                    n14 = 143;
                    break;
                }
                case 112: {
                    n14 = 247;
                    break;
                }
                case 113: {
                    n14 = 139;
                    break;
                }
                case 114: {
                    n14 = 233;
                    break;
                }
                case 115: {
                    n14 = 238;
                    break;
                }
                case 116: {
                    n14 = 22;
                    break;
                }
                case 117: {
                    n14 = 235;
                    break;
                }
                case 118: {
                    n14 = 242;
                    break;
                }
                case 119: {
                    n14 = 145;
                    break;
                }
                case 120: {
                    n14 = 174;
                    break;
                }
                case 121: {
                    n14 = 97;
                    break;
                }
                case 122: {
                    n14 = 134;
                    break;
                }
                case 123: {
                    n14 = 12;
                    break;
                }
                case 124: {
                    n14 = 45;
                    break;
                }
                case 125: {
                    n14 = 209;
                    break;
                }
                case 126: {
                    n14 = 124;
                    break;
                }
                case 127: {
                    n14 = 217;
                    break;
                }
                case 128: {
                    n14 = 166;
                    break;
                }
                case 129: {
                    n14 = 19;
                    break;
                }
                case 130: {
                    n14 = 64;
                    break;
                }
                case 131: {
                    n14 = 180;
                    break;
                }
                case 132: {
                    n14 = 197;
                    break;
                }
                case 133: {
                    n14 = 69;
                    break;
                }
                case 134: {
                    n14 = 39;
                    break;
                }
                case 135: {
                    n14 = 29;
                    break;
                }
                case 136: {
                    n14 = 253;
                    break;
                }
                case 137: {
                    n14 = 2;
                    break;
                }
                case 138: {
                    n14 = 35;
                    break;
                }
                case 139: {
                    n14 = 115;
                    break;
                }
                case 140: {
                    n14 = 15;
                    break;
                }
                case 141: {
                    n14 = 118;
                    break;
                }
                case 142: {
                    n14 = 140;
                    break;
                }
                case 143: {
                    n14 = 208;
                    break;
                }
                case 144: {
                    n14 = 23;
                    break;
                }
                case 145: {
                    n14 = 212;
                    break;
                }
                case 146: {
                    n14 = 37;
                    break;
                }
                case 147: {
                    n14 = 210;
                    break;
                }
                case 148: {
                    n14 = 190;
                    break;
                }
                case 149: {
                    n14 = 161;
                    break;
                }
                case 150: {
                    n14 = 31;
                    break;
                }
                case 151: {
                    n14 = 165;
                    break;
                }
                case 152: {
                    n14 = 218;
                    break;
                }
                case 153: {
                    n14 = 112;
                    break;
                }
                case 154: {
                    n14 = 101;
                    break;
                }
                case 155: {
                    n14 = 200;
                    break;
                }
                case 156: {
                    n14 = 79;
                    break;
                }
                case 157: {
                    n14 = 32;
                    break;
                }
                case 158: {
                    n14 = 104;
                    break;
                }
                case 159: {
                    n14 = 65;
                    break;
                }
                case 160: {
                    n14 = 243;
                    break;
                }
                case 161: {
                    n14 = 90;
                    break;
                }
                case 162: {
                    n14 = 225;
                    break;
                }
                case 163: {
                    n14 = 206;
                    break;
                }
                case 164: {
                    n14 = 255;
                    break;
                }
                case 165: {
                    n14 = 204;
                    break;
                }
                case 166: {
                    n14 = 58;
                    break;
                }
                case 167: {
                    n14 = 44;
                    break;
                }
                case 168: {
                    n14 = 105;
                    break;
                }
                case 169: {
                    n14 = 114;
                    break;
                }
                case 170: {
                    n14 = 106;
                    break;
                }
                case 171: {
                    n14 = 116;
                    break;
                }
                case 172: {
                    n14 = 136;
                    break;
                }
                case 173: {
                    n14 = 169;
                    break;
                }
                case 174: {
                    n14 = 20;
                    break;
                }
                case 175: {
                    n14 = 88;
                    break;
                }
                case 176: {
                    n14 = 48;
                    break;
                }
                case 177: {
                    n14 = 244;
                    break;
                }
                case 178: {
                    n14 = 85;
                    break;
                }
                case 179: {
                    n14 = 9;
                    break;
                }
                case 180: {
                    n14 = 96;
                    break;
                }
                case 181: {
                    n14 = 7;
                    break;
                }
                case 182: {
                    n14 = 11;
                    break;
                }
                case 183: {
                    n14 = 164;
                    break;
                }
                case 184: {
                    n14 = 42;
                    break;
                }
                case 185: {
                    n14 = 3;
                    break;
                }
                case 186: {
                    n14 = 94;
                    break;
                }
                case 187: {
                    n14 = 18;
                    break;
                }
                case 188: {
                    n14 = 107;
                    break;
                }
                case 189: {
                    n14 = 240;
                    break;
                }
                case 190: {
                    n14 = 229;
                    break;
                }
                case 191: {
                    n14 = 73;
                    break;
                }
                case 192: {
                    n14 = 27;
                    break;
                }
                case 193: {
                    n14 = 126;
                    break;
                }
                case 194: {
                    n14 = 178;
                    break;
                }
                case 195: {
                    n14 = 75;
                    break;
                }
                case 196: {
                    n14 = 95;
                    break;
                }
                case 197: {
                    n14 = 121;
                    break;
                }
                case 198: {
                    n14 = 172;
                    break;
                }
                case 199: {
                    n14 = 154;
                    break;
                }
                case 200: {
                    n14 = 185;
                    break;
                }
                case 201: {
                    n14 = 78;
                    break;
                }
                case 202: {
                    n14 = 72;
                    break;
                }
                case 203: {
                    n14 = 167;
                    break;
                }
                case 204: {
                    n14 = 17;
                    break;
                }
                case 205: {
                    n14 = 158;
                    break;
                }
                case 206: {
                    n14 = 248;
                    break;
                }
                case 207: {
                    n14 = 83;
                    break;
                }
                case 208: {
                    n14 = 92;
                    break;
                }
                case 209: {
                    n14 = 241;
                    break;
                }
                case 210: {
                    n14 = 195;
                    break;
                }
                case 211: {
                    n14 = 222;
                    break;
                }
                case 212: {
                    n14 = 251;
                    break;
                }
                case 213: {
                    n14 = 147;
                    break;
                }
                case 214: {
                    n14 = 181;
                    break;
                }
                case 215: {
                    n14 = 173;
                    break;
                }
                case 216: {
                    n14 = 170;
                    break;
                }
                case 217: {
                    n14 = 221;
                    break;
                }
                case 218: {
                    n14 = 8;
                    break;
                }
                case 219: {
                    n14 = 152;
                    break;
                }
                case 220: {
                    n14 = 187;
                    break;
                }
                case 221: {
                    n14 = 216;
                    break;
                }
                case 222: {
                    n14 = 177;
                    break;
                }
                case 223: {
                    n14 = 113;
                    break;
                }
                case 224: {
                    n14 = 21;
                    break;
                }
                case 225: {
                    n14 = 77;
                    break;
                }
                case 226: {
                    n14 = 249;
                    break;
                }
                case 227: {
                    n14 = 151;
                    break;
                }
                case 228: {
                    n14 = 159;
                    break;
                }
                case 229: {
                    n14 = 61;
                    break;
                }
                case 230: {
                    n14 = 60;
                    break;
                }
                case 231: {
                    n14 = 239;
                    break;
                }
                case 232: {
                    n14 = 43;
                    break;
                }
                case 233: {
                    n14 = 30;
                    break;
                }
                case 234: {
                    n14 = 76;
                    break;
                }
                case 235: {
                    n14 = 192;
                    break;
                }
                case 236: {
                    n14 = 120;
                    break;
                }
                case 237: {
                    n14 = 33;
                    break;
                }
                case 238: {
                    n14 = 254;
                    break;
                }
                case 239: {
                    n14 = 111;
                    break;
                }
                case 240: {
                    n14 = 63;
                    break;
                }
                case 241: {
                    n14 = 74;
                    break;
                }
                case 242: {
                    n14 = 125;
                    break;
                }
                case 243: {
                    n14 = 128;
                    break;
                }
                case 244: {
                    n14 = 89;
                    break;
                }
                case 245: {
                    n14 = 50;
                    break;
                }
                case 246: {
                    n14 = 34;
                    break;
                }
                case 247: {
                    n14 = 199;
                    break;
                }
                case 248: {
                    n14 = 4;
                    break;
                }
                case 249: {
                    n14 = 117;
                    break;
                }
                case 250: {
                    n14 = 215;
                    break;
                }
                case 251: {
                    n14 = 54;
                    break;
                }
                case 252: {
                    n14 = 24;
                    break;
                }
                case 253: {
                    n14 = 228;
                    break;
                }
                case 254: {
                    n14 = 87;
                    break;
                }
                default: {
                    n14 = 230;
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
            ej_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7D72;
        if (e[n11] == null) {
            ej_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

