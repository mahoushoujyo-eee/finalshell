/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CM;
import com.FN;
import com.GA;
import com.GO;
import com.L0;
import com.P9;
import com.RV;
import com.SD;
import com.WC;
import com.WO;
import com.cl_0;
import com.fl_0;
import com.ky_2;
import com.li_2;
import com.o__0;
import com.og_2;
import com.pm_1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.LookAndFeel;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSliderUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com._n
 */
public class _n_0
extends BasicSliderUI
implements L0 {
    protected Color R = pm_1.h;
    protected Color G = pm_1.a;
    protected int L = pm_1.r;
    protected int O = pm_1.J;
    protected int c = pm_1.G;
    protected boolean D = pm_1.D;
    protected Color f = pm_1.R;
    protected Color h = pm_1.g;
    protected Color N = pm_1.c;
    protected int a = pm_1.S;
    protected int F = pm_1.b;
    protected boolean T = pm_1.p;
    protected Color e = pm_1.j;
    protected Color I = pm_1.Z;
    protected int b = pm_1.t;
    protected int M = pm_1.n;
    protected int u = pm_1.u;
    protected int K = pm_1.e;
    protected boolean Y = pm_1.o;
    protected boolean Q;
    protected int l;
    protected boolean g;
    protected boolean t;
    protected Insets n;
    protected og_2 q;
    protected boolean p;
    protected PropertyChangeListener P;
    protected MouseWheelListener S;
    protected ChangeListener w;
    protected MouseAdapter z;
    protected boolean y;
    protected int B;
    protected WC v;
    private static int r;
    private static final String[] d;
    private static final String[] i;
    private static final long j;

    public _n_0(JSlider jSlider) {
        super(jSlider);
        int n10 = _n_0.W();
        this.Q = pm_1.X;
        this.l = pm_1.F;
        this.g = pm_1.q;
        this.t = pm_1.K;
        this.n = o__0.u;
        this.q = o__0.C;
        this.p = pm_1.s;
        this.y = false;
        this.B = 0;
        if (n10 == 0) {
            ky_2.K(new String[1]);
        }
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new _n_0((JSlider)jComponent);
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.slider);
        LookAndFeel.installProperty(this.slider, _n_0.a(8152, -28050), Boolean.FALSE);
        this.slider.setForeground(GO.V);
        int n10 = _n_0.G();
        WO.t(this.slider, this.q);
        this.h();
        this.P = new cl_0(this);
        this.slider.addPropertyChangeListener(_n_0.a(8154, 31839), this.P);
        this.S = new SD(this);
        this.slider.addMouseWheelListener(this.S);
        this.w = new CM(this);
        this.slider.addChangeListener(this.w);
        this.v = new WC(_n_0.a(8153, 9385), j, (ActionListener)new fl_0(this));
        this.z = new li_2(this, jComponent);
        this.slider.addMouseListener(this.z);
        this.slider.addMouseMotionListener(this.z);
        int n11 = n10;
        if (ky_2.F() != null) {
            _n_0.z(++n11);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        WO.C(this.slider, this.q);
        this.slider.removePropertyChangeListener(_n_0.a(8155, -4476), this.P);
        this.slider.removeMouseWheelListener(this.S);
        this.slider.removeChangeListener(this.w);
        this.slider.removeMouseListener(this.z);
        this.slider.removeMouseMotionListener(this.z);
        super.uninstallUI(jComponent);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void h() {
        block6: {
            block7: {
                block8: {
                    block5: {
                        var1_1 = _n_0.W();
                        v0 = this.slider;
                        if (var1_1 == 0) break block5;
                        if (v0 == null) break block6;
                        v0 = this.slider;
                    }
                    v1 = FN.l(v0);
                    if (var1_1 != 0) {
                        if (v1 != 0) {
                            return;
                        }
                        v1 = this.slider.getComponentOrientation().isLeftToRight();
                    }
                    var2_2 = v1;
                    var3_3 = new Insets(this.n.top, var2_2 != 0 ? this.n.left : this.n.right, this.n.bottom, var2_2 != 0 ? this.n.right : this.n.left);
                    v2 = this;
                    if (var1_1 == 0) break block7;
                    if (v2.q == null) break block8;
                    var4_4 = this.q.B(this.slider);
                    var3_3.top += var4_4.top;
                    v3 = var3_3;
                    v4 = v3;
                    v5 = v3.bottom;
                    v6 = var4_4;
                    if (var1_1 == 0) ** GOTO lbl32
                    v4.bottom = v5 + v6.bottom;
                    v7 = var3_3;
                    v4 = v7;
                    v5 = v7.left;
                    if (var2_2 != 0) {
                        v8 = var4_4.left;
                    } else {
                        v6 = var4_4;
lbl32:
                        // 2 sources

                        v8 = v6.right;
                    }
                    v4.left = v5 + v8;
                    v9 = var3_3.right;
                    v10 = var2_2;
                    if (var1_1 != 0) {
                        v10 = v10 != 0 ? var4_4.right : var4_4.left;
                    }
                    var3_3.right = v9 + v10;
                }
                v2 = this;
            }
            v2.slider.setBorder(GA.y(var3_3));
        }
    }

    public boolean h() {
        return this.g;
    }

    public void J(boolean bl) {
        this.g = bl;
    }

    public boolean f() {
        return this.t;
    }

    public void F(boolean bl) {
        this.t = bl;
    }

    public boolean G() {
        return this.p;
    }

    public void j(boolean bl) {
        this.p = bl;
    }

    public Color O() {
        return this.R;
    }

    public void l(Color color) {
        this.R = color;
    }

    public Color u() {
        return this.G;
    }

    public void h(Color color) {
        this.G = color;
    }

    public int Y() {
        return this.L;
    }

    public void y(int n10) {
        this.L = n10;
    }

    public int M() {
        return this.O;
    }

    public void E(int n10) {
        this.O = n10;
    }

    public int P() {
        return this.c;
    }

    public void M(int n10) {
        this.c = n10;
    }

    public boolean L() {
        return this.D;
    }

    public void D(boolean bl) {
        this.D = bl;
    }

    public Color d() {
        return this.f;
    }

    public void x(Color color) {
        this.f = color;
    }

    public Color b() {
        return this.h;
    }

    public void w(Color color) {
        this.h = color;
    }

    public Color s() {
        return this.N;
    }

    public void B(Color color) {
        this.N = color;
    }

    public int V() {
        return this.a;
    }

    public void s(int n10) {
        this.a = n10;
    }

    public int h() {
        return this.F;
    }

    public void q(int n10) {
        this.F = n10;
    }

    public boolean T() {
        return this.T;
    }

    public void p(boolean bl) {
        this.T = bl;
    }

    public Color A() {
        return this.e;
    }

    public void g(Color color) {
        this.e = color;
    }

    public Color f() {
        return this.I;
    }

    public void k(Color color) {
        this.I = color;
    }

    public int p() {
        return this.b;
    }

    public void L(int n10) {
        this.b = n10;
    }

    public int I() {
        return this.M;
    }

    public void H(int n10) {
        this.M = n10;
    }

    public int l() {
        return this.u;
    }

    public void j(int n10) {
        this.u = n10;
    }

    public int S() {
        return this.K;
    }

    public void l(int n10) {
        this.K = n10;
    }

    public boolean x() {
        return this.Y;
    }

    public void m(boolean bl) {
        this.Y = bl;
    }

    public boolean s() {
        return this.Q;
    }

    public void K(boolean bl) {
        this.Q = bl;
    }

    public int i() {
        return this.l;
    }

    public void V(int n10) {
        this.l = n10;
    }

    public Insets r() {
        return this.n;
    }

    public void p(Insets insets) {
        this.n = insets;
        this.h();
    }

    public og_2 o() {
        return this.q;
    }

    public void S(og_2 og_22) {
        WO.C(this.slider, this.q);
        this.q = og_22;
        WO.t(this.slider, this.q);
        this.h();
    }

    @Override
    protected Dimension getThumbSize() {
        if (this.slider.getOrientation() == 0) {
            return new Dimension(this.b, this.M);
        }
        return new Dimension(this.M, this.b);
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        int n10 = _n_0.G();
        _n_0 _n_02 = this;
        if (n10 == 0) {
            if (_n_02.q != null) {
                this.q.u((Graphics2D)graphics, FN.N(jComponent), jComponent);
            }
            _n_02 = this;
        }
        super.paint(graphics, jComponent);
    }

    @Override
    public void paintFocus(Graphics graphics) {
    }

    @Override
    public void paintThumb(Graphics graphics) {
        block2: {
            Shape shape;
            Object object;
            Graphics2D graphics2D;
            block5: {
                block4: {
                    int n10;
                    block3: {
                        n10 = _n_0.W();
                        if (!this.T) break block2;
                        graphics2D = (Graphics2D)graphics;
                        object = RV.X(graphics2D);
                        shape = this.l();
                        if (n10 == 0) break block3;
                        if (this.slider.getOrientation() != 0) break block4;
                        graphics2D.setPaint(new GradientPaint(0.0f, this.thumbRect.y, this.e, 0.0f, this.thumbRect.y + this.thumbRect.height, this.I));
                    }
                    if (n10 != 0) break block5;
                }
                graphics2D.setPaint(new GradientPaint(this.thumbRect.x, 0.0f, this.e, this.thumbRect.x + this.thumbRect.width, 0.0f, this.I));
            }
            graphics2D.fill(shape);
            graphics2D.setPaint(this.slider.isEnabled() ? GO.Ff : GO.FX);
            graphics2D.draw(shape);
            RV.X(graphics2D, object);
        }
    }

    protected Color r() {
        return P9.N(GO.N, GO.Ff, this.i());
    }

    protected float i() {
        return (float)this.B / 5.0f;
    }

    protected Shape l() {
        block7: {
            GeneralPath generalPath;
            block19: {
                block20: {
                    block21: {
                        boolean bl;
                        int n10;
                        block14: {
                            block15: {
                                block18: {
                                    block16: {
                                        block17: {
                                            block10: {
                                                GeneralPath generalPath2;
                                                block13: {
                                                    block11: {
                                                        block12: {
                                                            int n11;
                                                            block8: {
                                                                block9: {
                                                                    block6: {
                                                                        n10 = _n_0.W();
                                                                        n11 = this.Y;
                                                                        if (n10 == 0) break block6;
                                                                        if (n11 == 0) break block7;
                                                                        n11 = this.slider.getPaintLabels();
                                                                    }
                                                                    if (n10 == 0) break block8;
                                                                    if (n11 != 0) break block9;
                                                                    n11 = this.slider.getPaintTicks();
                                                                    if (n10 == 0) break block8;
                                                                    if (n11 == 0) break block7;
                                                                }
                                                                n11 = this.slider.getOrientation();
                                                            }
                                                            if (n11 != 0) break block10;
                                                            generalPath2 = new GeneralPath(0);
                                                            generalPath2.moveTo(this.thumbRect.x, this.thumbRect.y + this.u);
                                                            generalPath2.quadTo(this.thumbRect.x, this.thumbRect.y, this.thumbRect.x + this.u, this.thumbRect.y);
                                                            generalPath2.lineTo(this.thumbRect.x + this.thumbRect.width - this.u, this.thumbRect.y);
                                                            generalPath2.quadTo(this.thumbRect.x + this.thumbRect.width, this.thumbRect.y, this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.u);
                                                            generalPath2.lineTo(this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.thumbRect.height - this.l);
                                                            if (n10 == 0) break block11;
                                                            if (!this.Q) break block12;
                                                            generalPath2.lineTo(this.thumbRect.x + this.thumbRect.width / 2, this.thumbRect.y + this.thumbRect.height);
                                                            generalPath2.lineTo(this.thumbRect.x, this.thumbRect.y + this.thumbRect.height - this.l);
                                                            if (n10 != 0) break block13;
                                                        }
                                                        generalPath2.quadTo(this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.thumbRect.height - this.l / 2, this.thumbRect.x + this.thumbRect.width / 2, this.thumbRect.y + this.thumbRect.height);
                                                    }
                                                    generalPath2.quadTo(this.thumbRect.x, this.thumbRect.y + this.thumbRect.height - this.l / 2, this.thumbRect.x, this.thumbRect.y + this.thumbRect.height - this.l);
                                                }
                                                generalPath2.closePath();
                                                return generalPath2;
                                            }
                                            generalPath = new GeneralPath(0);
                                            bl = this.slider.getComponentOrientation().isLeftToRight();
                                            if (n10 == 0) break block14;
                                            if (!bl) break block15;
                                            generalPath.moveTo(this.thumbRect.x, this.thumbRect.y + this.u);
                                            generalPath.quadTo(this.thumbRect.x, this.thumbRect.y, this.thumbRect.x + this.u, this.thumbRect.y);
                                            generalPath.lineTo(this.thumbRect.x + this.thumbRect.width - this.l, this.thumbRect.y);
                                            if (n10 == 0) break block16;
                                            if (!this.Q) break block17;
                                            generalPath.lineTo(this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.thumbRect.height / 2);
                                            generalPath.lineTo(this.thumbRect.x + this.thumbRect.width - this.l, this.thumbRect.y + this.thumbRect.height);
                                            if (n10 != 0) break block18;
                                        }
                                        generalPath.quadTo(this.thumbRect.x + this.thumbRect.width - this.l / 2, this.thumbRect.y, this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.thumbRect.height / 2);
                                    }
                                    generalPath.quadTo(this.thumbRect.x + this.thumbRect.width - this.l / 2, this.thumbRect.y + this.thumbRect.height, this.thumbRect.x + this.thumbRect.width - this.l, this.thumbRect.y + this.thumbRect.height);
                                }
                                generalPath.lineTo(this.thumbRect.x + this.u, this.thumbRect.y + this.thumbRect.height);
                                generalPath.quadTo(this.thumbRect.x, this.thumbRect.y + this.thumbRect.height, this.thumbRect.x, this.thumbRect.y + this.thumbRect.height - this.u);
                                if (n10 != 0) break block19;
                            }
                            generalPath.moveTo(this.thumbRect.x + this.thumbRect.width - this.u, this.thumbRect.y);
                            generalPath.quadTo(this.thumbRect.x + this.thumbRect.width, this.thumbRect.y, this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.u);
                            generalPath.lineTo(this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.thumbRect.height - this.u);
                            generalPath.quadTo(this.thumbRect.x + this.thumbRect.width, this.thumbRect.y + this.thumbRect.height, this.thumbRect.x + this.thumbRect.width - this.u, this.thumbRect.y + this.thumbRect.height);
                            generalPath.lineTo(this.thumbRect.x + this.l, this.thumbRect.y + this.thumbRect.height);
                            if (n10 == 0) break block20;
                            bl = this.Q;
                        }
                        if (!bl) break block21;
                        generalPath.lineTo(this.thumbRect.x, this.thumbRect.y + this.thumbRect.height / 2);
                        generalPath.lineTo(this.thumbRect.x + this.l, this.thumbRect.y);
                        if (n10 != 0) break block19;
                    }
                    generalPath.quadTo(this.thumbRect.x + this.l / 2, this.thumbRect.y + this.thumbRect.height, this.thumbRect.x, this.thumbRect.y + this.thumbRect.height / 2);
                }
                generalPath.quadTo(this.thumbRect.x + this.l / 2, this.thumbRect.y, this.thumbRect.x + this.l, this.thumbRect.y);
            }
            generalPath.closePath();
            return generalPath;
        }
        return new RoundRectangle2D.Double(this.thumbRect.x, this.thumbRect.y, this.thumbRect.width, this.thumbRect.height, this.u * 2, this.u * 2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void paintTrack(Graphics var1_1) {
        block23: {
            block21: {
                block22: {
                    block20: {
                        block15: {
                            block16: {
                                block19: {
                                    block18: {
                                        block17: {
                                            block14: {
                                                block13: {
                                                    var3_2 = (Graphics2D)var1_1;
                                                    var2_3 = _n_0.W();
                                                    var4_4 = RV.X(var3_2);
                                                    var5_5 = this.S();
                                                    v0 = this.slider.isEnabled();
                                                    if (var2_3 != 0) {
                                                        if (v0 != 0) {
                                                            RV.Y(var3_2, var5_5, this.slider.isFocusOwner() != false ? GO.c : GO.r, this.c);
                                                        }
                                                        v0 = this.slider.getOrientation();
                                                    }
                                                    if (v0 != 0) break block13;
                                                    var3_2.setPaint(new GradientPaint(0.0f, this.trackRect.y, this.R, 0.0f, this.trackRect.y + this.trackRect.height, this.G));
                                                    if (var2_3 != 0) break block14;
                                                }
                                                var3_2.setPaint(new GradientPaint(this.trackRect.x, 0.0f, this.R, this.trackRect.x + this.trackRect.width, 0.0f, this.G));
                                            }
                                            v1 = var3_2;
                                            if (var2_3 == 0) break block15;
                                            v1.fill(var5_5);
                                            if (!this.D) break block16;
                                            var6_6 = this.r();
                                            if (this.slider.isEnabled()) {
                                                RV.Y(var3_2, var6_6, GO.r, this.F);
                                            }
                                            var7_7 = var5_5.getBounds();
                                            if (var2_3 == 0) break block17;
                                            if (this.slider.getOrientation() != 0) break block18;
                                            var3_2.setPaint(new GradientPaint(0.0f, var7_7.y + this.F, this.f, 0.0f, var7_7.y + var7_7.height - this.F, this.h));
                                        }
                                        if (var2_3 != 0) break block19;
                                    }
                                    var3_2.setPaint(new GradientPaint(var7_7.x + this.F, 0.0f, this.f, var7_7.x + var7_7.width - this.F, 0.0f, this.h));
                                }
                                var3_2.fill(var6_6);
                                v2 = this;
                                if (var2_3 == 0) ** GOTO lbl37
                                if (v2.slider.isEnabled()) {
                                    v2 = this;
lbl37:
                                    // 2 sources

                                    v3 = v2.N;
                                } else {
                                    v3 = GO.FX;
                                }
                                var3_2.setPaint(v3);
                                var3_2.draw(var6_6);
                            }
                            v1 = var3_2;
                        }
                        v4 = this.slider.isEnabled();
                        if (var2_3 == 0) break block20;
                        if (!v4) break block21;
                        v4 = this.t;
                    }
                    if (var2_3 == 0) break block22;
                    if (!v4) ** GOTO lbl-1000
                    v5 = this;
                    if (var2_3 == 0) ** GOTO lbl58
                    v4 = v5.isDragging();
                }
                if (!v4) {
                    v5 = this;
lbl58:
                    // 2 sources

                    v6 = v5.r();
                } else lbl-1000:
                // 2 sources

                {
                    v6 = GO.Ff;
                }
                break block23;
            }
            v6 = GO.FX;
        }
        v1.setPaint(v6);
        var3_2.draw(var5_5);
        RV.X(var3_2, var4_4);
    }

    protected Shape S() {
        int n10 = _n_0.G();
        int n11 = this.O;
        if (n10 == 0) {
            if (n11 > 0) {
                if (this.slider.getOrientation() == 0) {
                    return new RoundRectangle2D.Double(this.trackRect.x - this.O, this.trackRect.y + this.trackRect.height / 2 - this.L / 2, this.trackRect.width + this.O * 2 - 1, this.L, this.O * 2, this.O * 2);
                }
                return new RoundRectangle2D.Double(this.trackRect.x + this.trackRect.width / 2 - this.L / 2, this.trackRect.y - this.O, this.L, this.trackRect.height + this.O * 2 - 1, this.O * 2, this.O * 2);
            }
            n11 = this.slider.getOrientation();
        }
        if (n11 == 0) {
            return new Rectangle2D.Double(this.trackRect.x, this.trackRect.y + this.trackRect.height / 2 - this.L / 2, this.trackRect.width - 1, this.L);
        }
        return new Rectangle2D.Double(this.trackRect.x + this.trackRect.width / 2 - this.L / 2, this.trackRect.y, this.L, this.trackRect.height - 1);
    }

    protected Shape r() {
        int n10;
        block11: {
            block12: {
                int n11;
                int n12;
                block15: {
                    int n13;
                    block13: {
                        block14: {
                            int n14;
                            block4: {
                                block5: {
                                    int n15;
                                    block6: {
                                        block7: {
                                            int n16;
                                            int n17;
                                            block10: {
                                                int n18;
                                                block8: {
                                                    block9: {
                                                        n14 = _n_0.G();
                                                        n10 = this.O;
                                                        if (n14 != 0) break block4;
                                                        if (n10 <= 0) break block5;
                                                        n15 = this.slider.getOrientation();
                                                        if (n14 != 0) break block6;
                                                        if (n15 != 0) break block7;
                                                        n18 = this.slider.getComponentOrientation().isLeftToRight();
                                                        if (n14 != 0) break block8;
                                                        if (n18 == 0) break block9;
                                                        n17 = this.trackRect.x - this.O + this.F;
                                                        n16 = this.thumbRect.x + this.thumbRect.width / 2 + this.a - n17;
                                                        if (n14 == 0) break block10;
                                                    }
                                                    n18 = this.thumbRect.x + this.thumbRect.width / 2 - this.a;
                                                }
                                                n17 = n18;
                                                n16 = this.trackRect.x + this.trackRect.width + this.O - this.F - 1 - n17;
                                            }
                                            return new RoundRectangle2D.Double(n17, this.trackRect.y + this.trackRect.height / 2 - this.L / 2 + this.F, n16, this.L - this.F * 2, this.a * 2, this.a * 2);
                                        }
                                        n15 = this.thumbRect.y + this.thumbRect.height / 2;
                                    }
                                    int n19 = n15;
                                    int n20 = this.trackRect.y + this.trackRect.height + this.O - this.F - n19 - 1;
                                    return new RoundRectangle2D.Double(this.trackRect.x + this.F + this.trackRect.width / 2 - this.L / 2, n19, this.L - this.F * 2, n20, this.a * 2, this.a * 2);
                                }
                                n10 = this.slider.getOrientation();
                            }
                            if (n14 != 0) break block11;
                            if (n10 != 0) break block12;
                            n13 = this.slider.getComponentOrientation().isLeftToRight();
                            if (n14 != 0) break block13;
                            if (n13 == 0) break block14;
                            n12 = this.trackRect.x + this.F;
                            n11 = this.thumbRect.x + this.thumbRect.width / 2 - n12;
                            if (n14 == 0) break block15;
                        }
                        n13 = this.thumbRect.x + this.thumbRect.width / 2;
                    }
                    n12 = n13;
                    n11 = this.trackRect.x + this.trackRect.width - this.F - 1 - n12;
                }
                return new Rectangle2D.Double(n12, this.trackRect.y + this.trackRect.height / 2 - this.L / 2 + this.F, n11, this.L - this.F * 2);
            }
            n10 = this.trackRect.y + this.F;
        }
        int n21 = n10;
        int n22 = this.thumbRect.y + this.thumbRect.height / 2 - n21;
        return new Rectangle2D.Double(this.trackRect.x + this.F + this.trackRect.width / 2 - this.L / 2, n21, this.L - this.F * 2, n22);
    }

    static JSlider x(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider o(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider I(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider H(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider T(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider a(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider l(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider r(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider q(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider K(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider s(_n_0 _n_02) {
        return _n_02.slider;
    }

    static JSlider X(_n_0 _n_02) {
        return _n_02.slider;
    }

    public static void z(int n10) {
        r = n10;
    }

    public static int W() {
        return r;
    }

    public static int G() {
        int n10 = _n_0.W();
        if (n10 == 0) {
            return 55;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[4];
                    var5_1 = 0;
                    var4_2 = "\u00ae\u00c5\u00ae}\u0003 \u00aa\u00d2\u00fd\u00af\u0000C\u00c6o~:XT\u00e7?\u0014v@\u00b5\u00cd`6\u00c6\u0010p\u00f7\u00b1H\u00f0\u000e\u00b8\u0016\u0080\u00d1\u00fc\u008f";
                    var6_3 = "\u00ae\u00c5\u00ae}\u0003 \u00aa\u00d2\u00fd\u00af\u0000C\u00c6o~:XT\u00e7?\u0014v@\u00b5\u00cd`6\u00c6\u0010p\u00f7\u00b1H\u00f0\u000e\u00b8\u0016\u0080\u00d1\u00fc\u008f".length();
                    var3_4 = 20;
                    _n_0.z(93);
                    var2_5 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = 38;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\u0085\u00feF\u00eb\u0085\u00d4\u0019t\u0099D\u0091\u00a1\u0094Nu>\u00f4F\u00b4'\u00cf\u00eb\u0095\u00b9\u0088\u00c7\u00a6\u0017\u00e6O\u00ebZ";
                        var6_3 = "\u0085\u00feF\u00eb\u0085\u00d4\u0019t\u0099D\u0091\u00a1\u0094Nu>\u00f4F\u00b4'\u00cf\u00eb\u0095\u00b9\u0088\u00c7\u00a6\u0017\u00e6O\u00ebZ".length();
                        var3_4 = 6;
                        var2_5 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v0 = 15;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl86
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 62;
                                break;
                            }
                            case 1: {
                                v15 = 126;
                                break;
                            }
                            case 2: {
                                v15 = 60;
                                break;
                            }
                            case 3: {
                                v15 = 26;
                                break;
                            }
                            case 4: {
                                v15 = 28;
                                break;
                            }
                            case 5: {
                                v15 = 62;
                                break;
                            }
                            default: {
                                v15 = 76;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl86:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var8_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl96:
                    // 1 sources

                    ** continue;
                }
            }
            _n_0.d = var7;
            _n_0.i = new String[4];
            break block22;
lbl101:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 7735517806301404264L;
        ** while (true)
        _n_0.j = 7735517806301404224L ^ var0_7;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1FDA) & 0xFFFF;
        if (i[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 146;
                    break;
                }
                case 1: {
                    n14 = 40;
                    break;
                }
                case 2: {
                    n14 = 101;
                    break;
                }
                case 3: {
                    n14 = 22;
                    break;
                }
                case 4: {
                    n14 = 9;
                    break;
                }
                case 5: {
                    n14 = 244;
                    break;
                }
                case 6: {
                    n14 = 226;
                    break;
                }
                case 7: {
                    n14 = 245;
                    break;
                }
                case 8: {
                    n14 = 135;
                    break;
                }
                case 9: {
                    n14 = 242;
                    break;
                }
                case 10: {
                    n14 = 200;
                    break;
                }
                case 11: {
                    n14 = 210;
                    break;
                }
                case 12: {
                    n14 = 121;
                    break;
                }
                case 13: {
                    n14 = 84;
                    break;
                }
                case 14: {
                    n14 = 232;
                    break;
                }
                case 15: {
                    n14 = 4;
                    break;
                }
                case 16: {
                    n14 = 106;
                    break;
                }
                case 17: {
                    n14 = 15;
                    break;
                }
                case 18: {
                    n14 = 142;
                    break;
                }
                case 19: {
                    n14 = 229;
                    break;
                }
                case 20: {
                    n14 = 208;
                    break;
                }
                case 21: {
                    n14 = 17;
                    break;
                }
                case 22: {
                    n14 = 241;
                    break;
                }
                case 23: {
                    n14 = 25;
                    break;
                }
                case 24: {
                    n14 = 116;
                    break;
                }
                case 25: {
                    n14 = 42;
                    break;
                }
                case 26: {
                    n14 = 190;
                    break;
                }
                case 27: {
                    n14 = 64;
                    break;
                }
                case 28: {
                    n14 = 239;
                    break;
                }
                case 29: {
                    n14 = 51;
                    break;
                }
                case 30: {
                    n14 = 201;
                    break;
                }
                case 31: {
                    n14 = 134;
                    break;
                }
                case 32: {
                    n14 = 71;
                    break;
                }
                case 33: {
                    n14 = 49;
                    break;
                }
                case 34: {
                    n14 = 68;
                    break;
                }
                case 35: {
                    n14 = 170;
                    break;
                }
                case 36: {
                    n14 = 145;
                    break;
                }
                case 37: {
                    n14 = 233;
                    break;
                }
                case 38: {
                    n14 = 92;
                    break;
                }
                case 39: {
                    n14 = 0;
                    break;
                }
                case 40: {
                    n14 = 80;
                    break;
                }
                case 41: {
                    n14 = 65;
                    break;
                }
                case 42: {
                    n14 = 23;
                    break;
                }
                case 43: {
                    n14 = 183;
                    break;
                }
                case 44: {
                    n14 = 120;
                    break;
                }
                case 45: {
                    n14 = 74;
                    break;
                }
                case 46: {
                    n14 = 252;
                    break;
                }
                case 47: {
                    n14 = 11;
                    break;
                }
                case 48: {
                    n14 = 193;
                    break;
                }
                case 49: {
                    n14 = 47;
                    break;
                }
                case 50: {
                    n14 = 180;
                    break;
                }
                case 51: {
                    n14 = 150;
                    break;
                }
                case 52: {
                    n14 = 55;
                    break;
                }
                case 53: {
                    n14 = 102;
                    break;
                }
                case 54: {
                    n14 = 224;
                    break;
                }
                case 55: {
                    n14 = 81;
                    break;
                }
                case 56: {
                    n14 = 133;
                    break;
                }
                case 57: {
                    n14 = 203;
                    break;
                }
                case 58: {
                    n14 = 168;
                    break;
                }
                case 59: {
                    n14 = 217;
                    break;
                }
                case 60: {
                    n14 = 41;
                    break;
                }
                case 61: {
                    n14 = 194;
                    break;
                }
                case 62: {
                    n14 = 164;
                    break;
                }
                case 63: {
                    n14 = 228;
                    break;
                }
                case 64: {
                    n14 = 63;
                    break;
                }
                case 65: {
                    n14 = 128;
                    break;
                }
                case 66: {
                    n14 = 247;
                    break;
                }
                case 67: {
                    n14 = 159;
                    break;
                }
                case 68: {
                    n14 = 54;
                    break;
                }
                case 69: {
                    n14 = 151;
                    break;
                }
                case 70: {
                    n14 = 31;
                    break;
                }
                case 71: {
                    n14 = 103;
                    break;
                }
                case 72: {
                    n14 = 10;
                    break;
                }
                case 73: {
                    n14 = 82;
                    break;
                }
                case 74: {
                    n14 = 220;
                    break;
                }
                case 75: {
                    n14 = 246;
                    break;
                }
                case 76: {
                    n14 = 225;
                    break;
                }
                case 77: {
                    n14 = 177;
                    break;
                }
                case 78: {
                    n14 = 58;
                    break;
                }
                case 79: {
                    n14 = 130;
                    break;
                }
                case 80: {
                    n14 = 122;
                    break;
                }
                case 81: {
                    n14 = 24;
                    break;
                }
                case 82: {
                    n14 = 176;
                    break;
                }
                case 83: {
                    n14 = 29;
                    break;
                }
                case 84: {
                    n14 = 107;
                    break;
                }
                case 85: {
                    n14 = 38;
                    break;
                }
                case 86: {
                    n14 = 249;
                    break;
                }
                case 87: {
                    n14 = 243;
                    break;
                }
                case 88: {
                    n14 = 56;
                    break;
                }
                case 89: {
                    n14 = 99;
                    break;
                }
                case 90: {
                    n14 = 26;
                    break;
                }
                case 91: {
                    n14 = 174;
                    break;
                }
                case 92: {
                    n14 = 160;
                    break;
                }
                case 93: {
                    n14 = 195;
                    break;
                }
                case 94: {
                    n14 = 27;
                    break;
                }
                case 95: {
                    n14 = 207;
                    break;
                }
                case 96: {
                    n14 = 231;
                    break;
                }
                case 97: {
                    n14 = 175;
                    break;
                }
                case 98: {
                    n14 = 179;
                    break;
                }
                case 99: {
                    n14 = 191;
                    break;
                }
                case 100: {
                    n14 = 197;
                    break;
                }
                case 101: {
                    n14 = 96;
                    break;
                }
                case 102: {
                    n14 = 44;
                    break;
                }
                case 103: {
                    n14 = 112;
                    break;
                }
                case 104: {
                    n14 = 52;
                    break;
                }
                case 105: {
                    n14 = 204;
                    break;
                }
                case 106: {
                    n14 = 126;
                    break;
                }
                case 107: {
                    n14 = 70;
                    break;
                }
                case 108: {
                    n14 = 202;
                    break;
                }
                case 109: {
                    n14 = 236;
                    break;
                }
                case 110: {
                    n14 = 119;
                    break;
                }
                case 111: {
                    n14 = 37;
                    break;
                }
                case 112: {
                    n14 = 110;
                    break;
                }
                case 113: {
                    n14 = 13;
                    break;
                }
                case 114: {
                    n14 = 254;
                    break;
                }
                case 115: {
                    n14 = 182;
                    break;
                }
                case 116: {
                    n14 = 221;
                    break;
                }
                case 117: {
                    n14 = 111;
                    break;
                }
                case 118: {
                    n14 = 93;
                    break;
                }
                case 119: {
                    n14 = 45;
                    break;
                }
                case 120: {
                    n14 = 124;
                    break;
                }
                case 121: {
                    n14 = 53;
                    break;
                }
                case 122: {
                    n14 = 136;
                    break;
                }
                case 123: {
                    n14 = 188;
                    break;
                }
                case 124: {
                    n14 = 240;
                    break;
                }
                case 125: {
                    n14 = 162;
                    break;
                }
                case 126: {
                    n14 = 143;
                    break;
                }
                case 127: {
                    n14 = 230;
                    break;
                }
                case 128: {
                    n14 = 83;
                    break;
                }
                case 129: {
                    n14 = 78;
                    break;
                }
                case 130: {
                    n14 = 115;
                    break;
                }
                case 131: {
                    n14 = 57;
                    break;
                }
                case 132: {
                    n14 = 94;
                    break;
                }
                case 133: {
                    n14 = 72;
                    break;
                }
                case 134: {
                    n14 = 36;
                    break;
                }
                case 135: {
                    n14 = 206;
                    break;
                }
                case 136: {
                    n14 = 139;
                    break;
                }
                case 137: {
                    n14 = 91;
                    break;
                }
                case 138: {
                    n14 = 117;
                    break;
                }
                case 139: {
                    n14 = 8;
                    break;
                }
                case 140: {
                    n14 = 187;
                    break;
                }
                case 141: {
                    n14 = 132;
                    break;
                }
                case 142: {
                    n14 = 60;
                    break;
                }
                case 143: {
                    n14 = 18;
                    break;
                }
                case 144: {
                    n14 = 173;
                    break;
                }
                case 145: {
                    n14 = 189;
                    break;
                }
                case 146: {
                    n14 = 88;
                    break;
                }
                case 147: {
                    n14 = 131;
                    break;
                }
                case 148: {
                    n14 = 48;
                    break;
                }
                case 149: {
                    n14 = 167;
                    break;
                }
                case 150: {
                    n14 = 161;
                    break;
                }
                case 151: {
                    n14 = 21;
                    break;
                }
                case 152: {
                    n14 = 234;
                    break;
                }
                case 153: {
                    n14 = 253;
                    break;
                }
                case 154: {
                    n14 = 85;
                    break;
                }
                case 155: {
                    n14 = 250;
                    break;
                }
                case 156: {
                    n14 = 7;
                    break;
                }
                case 157: {
                    n14 = 171;
                    break;
                }
                case 158: {
                    n14 = 98;
                    break;
                }
                case 159: {
                    n14 = 123;
                    break;
                }
                case 160: {
                    n14 = 144;
                    break;
                }
                case 161: {
                    n14 = 43;
                    break;
                }
                case 162: {
                    n14 = 140;
                    break;
                }
                case 163: {
                    n14 = 149;
                    break;
                }
                case 164: {
                    n14 = 157;
                    break;
                }
                case 165: {
                    n14 = 248;
                    break;
                }
                case 166: {
                    n14 = 219;
                    break;
                }
                case 167: {
                    n14 = 33;
                    break;
                }
                case 168: {
                    n14 = 12;
                    break;
                }
                case 169: {
                    n14 = 154;
                    break;
                }
                case 170: {
                    n14 = 87;
                    break;
                }
                case 171: {
                    n14 = 153;
                    break;
                }
                case 172: {
                    n14 = 213;
                    break;
                }
                case 173: {
                    n14 = 79;
                    break;
                }
                case 174: {
                    n14 = 129;
                    break;
                }
                case 175: {
                    n14 = 155;
                    break;
                }
                case 176: {
                    n14 = 227;
                    break;
                }
                case 177: {
                    n14 = 104;
                    break;
                }
                case 178: {
                    n14 = 185;
                    break;
                }
                case 179: {
                    n14 = 172;
                    break;
                }
                case 180: {
                    n14 = 147;
                    break;
                }
                case 181: {
                    n14 = 169;
                    break;
                }
                case 182: {
                    n14 = 138;
                    break;
                }
                case 183: {
                    n14 = 156;
                    break;
                }
                case 184: {
                    n14 = 105;
                    break;
                }
                case 185: {
                    n14 = 97;
                    break;
                }
                case 186: {
                    n14 = 222;
                    break;
                }
                case 187: {
                    n14 = 166;
                    break;
                }
                case 188: {
                    n14 = 75;
                    break;
                }
                case 189: {
                    n14 = 165;
                    break;
                }
                case 190: {
                    n14 = 16;
                    break;
                }
                case 191: {
                    n14 = 1;
                    break;
                }
                case 192: {
                    n14 = 46;
                    break;
                }
                case 193: {
                    n14 = 59;
                    break;
                }
                case 194: {
                    n14 = 39;
                    break;
                }
                case 195: {
                    n14 = 235;
                    break;
                }
                case 196: {
                    n14 = 61;
                    break;
                }
                case 197: {
                    n14 = 211;
                    break;
                }
                case 198: {
                    n14 = 216;
                    break;
                }
                case 199: {
                    n14 = 192;
                    break;
                }
                case 200: {
                    n14 = 30;
                    break;
                }
                case 201: {
                    n14 = 77;
                    break;
                }
                case 202: {
                    n14 = 19;
                    break;
                }
                case 203: {
                    n14 = 5;
                    break;
                }
                case 204: {
                    n14 = 238;
                    break;
                }
                case 205: {
                    n14 = 67;
                    break;
                }
                case 206: {
                    n14 = 114;
                    break;
                }
                case 207: {
                    n14 = 35;
                    break;
                }
                case 208: {
                    n14 = 209;
                    break;
                }
                case 209: {
                    n14 = 50;
                    break;
                }
                case 210: {
                    n14 = 205;
                    break;
                }
                case 211: {
                    n14 = 66;
                    break;
                }
                case 212: {
                    n14 = 95;
                    break;
                }
                case 213: {
                    n14 = 125;
                    break;
                }
                case 214: {
                    n14 = 118;
                    break;
                }
                case 215: {
                    n14 = 89;
                    break;
                }
                case 216: {
                    n14 = 100;
                    break;
                }
                case 217: {
                    n14 = 212;
                    break;
                }
                case 218: {
                    n14 = 215;
                    break;
                }
                case 219: {
                    n14 = 69;
                    break;
                }
                case 220: {
                    n14 = 137;
                    break;
                }
                case 221: {
                    n14 = 184;
                    break;
                }
                case 222: {
                    n14 = 181;
                    break;
                }
                case 223: {
                    n14 = 3;
                    break;
                }
                case 224: {
                    n14 = 108;
                    break;
                }
                case 225: {
                    n14 = 2;
                    break;
                }
                case 226: {
                    n14 = 28;
                    break;
                }
                case 227: {
                    n14 = 251;
                    break;
                }
                case 228: {
                    n14 = 148;
                    break;
                }
                case 229: {
                    n14 = 76;
                    break;
                }
                case 230: {
                    n14 = 196;
                    break;
                }
                case 231: {
                    n14 = 218;
                    break;
                }
                case 232: {
                    n14 = 14;
                    break;
                }
                case 233: {
                    n14 = 113;
                    break;
                }
                case 234: {
                    n14 = 86;
                    break;
                }
                case 235: {
                    n14 = 152;
                    break;
                }
                case 236: {
                    n14 = 32;
                    break;
                }
                case 237: {
                    n14 = 6;
                    break;
                }
                case 238: {
                    n14 = 186;
                    break;
                }
                case 239: {
                    n14 = 178;
                    break;
                }
                case 240: {
                    n14 = 20;
                    break;
                }
                case 241: {
                    n14 = 109;
                    break;
                }
                case 242: {
                    n14 = 214;
                    break;
                }
                case 243: {
                    n14 = 223;
                    break;
                }
                case 244: {
                    n14 = 158;
                    break;
                }
                case 245: {
                    n14 = 34;
                    break;
                }
                case 246: {
                    n14 = 73;
                    break;
                }
                case 247: {
                    n14 = 255;
                    break;
                }
                case 248: {
                    n14 = 163;
                    break;
                }
                case 249: {
                    n14 = 237;
                    break;
                }
                case 250: {
                    n14 = 127;
                    break;
                }
                case 251: {
                    n14 = 62;
                    break;
                }
                case 252: {
                    n14 = 90;
                    break;
                }
                case 253: {
                    n14 = 141;
                    break;
                }
                case 254: {
                    n14 = 198;
                    break;
                }
                default: {
                    n14 = 199;
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
            _n_0.i[n12] = new String(cArray).intern();
        }
        return i[n12];
    }
}

