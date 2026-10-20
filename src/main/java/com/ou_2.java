/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.GO;
import com.IA;
import com.IB;
import com.P9;
import com.PV;
import com.PY;
import com.RV;
import com.ax_0;
import com.cl_2;
import com.ed_0;
import com.eh_0;
import com.nx_2;
import com.sa_0;
import com.t.B;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.ou
 */
public class ou_2
extends JComponent
implements MouseListener,
MouseMotionListener,
FocusListener,
eh_0,
sa_0 {
    private static final Color t;
    private static final Color O;
    private static final Color p;
    private static final Color D;
    private static final Color E;
    private static final float[] l;
    private static final Color[] M;
    private static final Color[] d;
    private final List F = new ArrayList(1);
    private ed_0 a;
    private int m = IA.t;
    private int x = IA.i;
    private Dimension q = IA.Y;
    private Insets J = IA.X;
    private boolean y = IA.W;
    private PV w = null;
    private boolean g = false;
    private static final long[] b;
    private static final Integer[] c;

    public ou_2() {
        this((ed_0)cl_2.E(ed_0.class));
    }

    public ou_2(ed_0 ed_02) {
        this.Q(ed_02);
        this.setFocusable(true);
        this.setFont(IA.G);
        this.setForeground(IA.x);
        this.addFocusListener(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.repaint();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block6: {
            block7: {
                PV pV2;
                int n10;
                int n11;
                block5: {
                    n11 = nx_2.R();
                    n10 = this.isEnabled();
                    if (n11 == 0) {
                        if (n10 == 0) {
                            return;
                        }
                        n10 = SwingUtilities.isLeftMouseButton(mouseEvent);
                    }
                    if (n11 != 0) break block5;
                    if (n10 == 0) break block6;
                    n10 = mouseEvent.getClickCount();
                }
                if (n10 != 2 || (pV2 = this.q(mouseEvent.getPoint())) == null) break block6;
                Color color = B.D(this, pV2.N());
                if (n11 != 0) break block7;
                if (color == null) break block6;
                pV2.C(color);
                this.j();
            }
            this.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block20: {
            block24: {
                ou_2 ou_22;
                PV pV2;
                int n10;
                block23: {
                    int n11;
                    block21: {
                        block22: {
                            block13: {
                                block14: {
                                    block18: {
                                        ou_2 ou_23;
                                        block19: {
                                            PV pV3;
                                            block15: {
                                                block16: {
                                                    block17: {
                                                        n10 = nx_2.c();
                                                        n11 = this.isEnabled();
                                                        if (n10 != 0) {
                                                            if (n11 == 0) {
                                                                return;
                                                            }
                                                            n11 = this.isFocusOwner();
                                                        }
                                                        if (n10 != 0) {
                                                            if (n11 == 0) {
                                                                this.requestFocusInWindow();
                                                            }
                                                            n11 = SwingUtilities.isLeftMouseButton(mouseEvent);
                                                        }
                                                        if (n10 == 0) break block13;
                                                        if (n11 == 0) break block14;
                                                        pV3 = pV2 = this.q(mouseEvent.getPoint());
                                                        if (n10 == 0) break block15;
                                                        if (pV3 == null) break block16;
                                                        if (!FN.O(mouseEvent)) break block17;
                                                        this.w = pV2.H();
                                                        this.w.P(this.i(this.w.I()));
                                                        this.a.H(this.w);
                                                        this.g = false;
                                                        this.j();
                                                        this.repaint();
                                                        if (n10 != 0) break block16;
                                                    }
                                                    this.w = pV2;
                                                    this.g = false;
                                                }
                                                pV3 = this.w;
                                            }
                                            if (pV3 != null || mouseEvent.getY() <= 0) break block18;
                                            float f10 = this.D(mouseEvent);
                                            ou_23 = this;
                                            if (n10 == 0) break block19;
                                            if (!ou_23.H(f10)) break block18;
                                            this.w = new PV(f10, this.P(f10));
                                            this.a.H(this.w);
                                            this.g = false;
                                            this.j();
                                            ou_23 = this;
                                        }
                                        ou_23.repaint();
                                    }
                                    if (n10 != 0) break block20;
                                }
                                n11 = FN.N(mouseEvent);
                            }
                            if (n10 == 0) break block21;
                            if (n11 != 0) break block22;
                            n11 = FN.L(mouseEvent) ? 1 : 0;
                            if (n10 == 0) break block21;
                            if (n11 == 0) break block20;
                        }
                        ou_22 = this;
                        if (n10 == 0) break block23;
                        n11 = ou_22.a.C();
                    }
                    if (n11 <= 2) break block20;
                    ou_22 = this;
                }
                pV2 = ou_22.q(mouseEvent.getPoint());
                if (n10 == 0) break block24;
                if (pV2 == null) break block20;
                this.a.W(pV2);
                this.j();
            }
            this.repaint();
        }
    }

    public PV q(Point point) {
        PV pV2 = null;
        int n10 = nx_2.R();
        int n11 = this.a.C() - 1;
        while (n11 >= 0) {
            PV pV3 = this.a.B(n11);
            if (n10 != 0) continue;
            if (this.H(pV3).contains(point)) {
                pV2 = pV3;
                break;
            }
            --n11;
        }
        return pV2;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block7: {
            ou_2 ou_22;
            block11: {
                int n10;
                block8: {
                    int n11;
                    block9: {
                        ou_2 ou_23;
                        block10: {
                            n11 = nx_2.R();
                            ou_2 ou_24 = this;
                            if (n11 == 0) {
                                if (!ou_24.isEnabled()) {
                                    return;
                                }
                                ou_24 = this;
                            }
                            if (ou_24.w == null) break block7;
                            n10 = mouseEvent.getY();
                            if (n11 != 0) break block8;
                            if (n10 >= ou_2.a(22662, 2094445192968756174L)) break block9;
                            int n13 = this.a.C();
                            n13 = this.g;
                            if (n11 == 0) {
                                n13 = n13 != 0 ? 1 : 0;
                            }
                            n10 = n12 + n13;
                            if (n11 != 0) break block8;
                            if (n10 <= 2) break block9;
                            ou_23 = this;
                            if (n11 != 0) break block10;
                            if (ou_23.g) break block7;
                            this.g = true;
                            this.a.W(this.w);
                            this.j();
                            ou_23 = this;
                        }
                        ou_23.repaint();
                        if (n11 == 0) break block7;
                    }
                    ou_22 = this;
                    if (n11 != 0) break block11;
                    n10 = ou_22.g ? 1 : 0;
                }
                if (n10 != 0) {
                    this.g = false;
                    this.a.H(this.w);
                }
                ou_22 = this;
            }
            float f10 = ou_22.D(mouseEvent);
            f10 = this.i(f10);
            this.w.P(f10);
            this.j();
            this.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        int n10 = nx_2.R();
        boolean bl = this.isEnabled();
        if (n10 == 0) {
            if (!bl) {
                return;
            }
            bl = SwingUtilities.isLeftMouseButton(mouseEvent);
        }
        if (bl) {
            this.w = null;
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }

    public boolean H(float f10) {
        int n10 = nx_2.R();
        boolean bl = this.a.Z(f10);
        if (n10 == 0) {
            bl = !bl;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float i(float var1_1) {
        block3: {
            block5: {
                block4: {
                    var2_2 = nx_2.c();
                    v0 = this.a.Z(var1_1);
                    if (var2_2 == 0) break block4;
                    if (!v0) break block5;
                    cfr_temp_0 = var1_1 - 1.0f;
                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                }
                if (var2_2 == 0) ** GOTO lbl18
                if (v0) ** GOTO lbl16
                block0: while (this.a.Z(var1_1)) {
                    v1 = var1_1 - 0.001f;
                    if (var2_2 != 0) {
                        var1_1 = v1;
                        if (var2_2 != 0) continue;
                    }
                    break block3;
lbl16:
                    // 2 sources

                    do {
                        v0 = this.a.Z(var1_1);
lbl18:
                        // 2 sources

                        if (!v0) break block0;
                        v1 = var1_1 + 0.001f;
                        if (var2_2 == 0) break block3;
                        var1_1 = v1;
                    } while (var2_2 != 0);
                }
            }
            v1 = var1_1;
        }
        return v1;
    }

    public Rectangle L(int n10) {
        return this.H((PV)this.a.X().get(n10));
    }

    public Rectangle H(PV pV2) {
        float f10 = pV2.I();
        Rectangle rectangle = this.R();
        int n10 = rectangle.x + 2 + Math.round((float)(rectangle.width - 4) * f10) - this.q.width / 2;
        int n11 = rectangle.y + rectangle.height - this.q.height / 2;
        return new Rectangle(n10, n11, this.q.width, this.q.height);
    }

    private float D(MouseEvent mouseEvent) {
        return this.C(mouseEvent.getPoint());
    }

    public float C(Point point) {
        Rectangle rectangle = this.R();
        int n10 = rectangle.x + 2;
        int n11 = rectangle.width - 4;
        return (float)Math.max(0, Math.min(point.x - n10, n11)) / (float)n11;
    }

    public Color P(float f10) {
        return this.a.Z(f10);
    }

    public ed_0 l() {
        return this.a;
    }

    public void Q(ed_0 ed_02) {
        block3: {
            ou_2 ou_22;
            block2: {
                int n10 = nx_2.c();
                ou_22 = this;
                if (n10 == 0) break block2;
                if (ax_0.Z(ou_22.a, new Object[]{ed_02})) break block3;
                this.a = ed_02;
                this.w = null;
                this.j();
                ou_22 = this;
            }
            ou_22.repaint();
        }
    }

    public int D() {
        return this.m;
    }

    public void B(int n10) {
        this.m = n10;
        this.P();
    }

    public int L() {
        return this.x;
    }

    public void m(int n10) {
        this.x = n10;
    }

    public Dimension K() {
        return this.q;
    }

    public void h(Dimension dimension) {
        this.q = dimension;
    }

    public Insets a() {
        return this.J;
    }

    public void G(Insets insets) {
        this.J = insets;
        this.P();
    }

    public void I(int n10, int n11, int n12, int n13) {
        this.G(new Insets(n10, n11, n12, n13));
    }

    public void P(int n10) {
        this.I(n10, n10, n10, n10);
    }

    private void P() {
        this.setBorder(BorderFactory.createEmptyBorder(this.J.top, this.J.left, this.J.bottom, this.J.right));
    }

    public boolean Y() {
        return this.y;
    }

    public void o(boolean bl) {
        this.y = bl;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        Object object = RV.X(graphics2D);
        Rectangle rectangle = this.R();
        this.r(graphics2D, rectangle, this.j(rectangle), this.U(rectangle), false);
        this.P(graphics2D, rectangle);
        RV.X(graphics2D, object);
    }

    private void P(Graphics2D graphics2D, Rectangle rectangle) {
        int n10 = rectangle.x + 2;
        int n11 = rectangle.width - 4;
        int n12 = rectangle.y + rectangle.height - this.q.height / 2;
        int n13 = n12 + this.q.height;
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n14 = n13 - GA.d(fontMetrics) - 1;
        int n15 = 0;
        int n16 = nx_2.R();
        while (n15 < this.a.C()) {
            block5: {
                block6: {
                    PV pV2 = this.a.B(n15);
                    float f10 = pV2.I();
                    int n17 = n10 + Math.round((float)n11 * f10) - this.q.width / 2;
                    Rectangle rectangle2 = new Rectangle(n17, n12, this.q.width, this.q.height);
                    this.r(graphics2D, rectangle2, pV2.N(), this.n(rectangle2), true);
                    if (n16 != 0) break block5;
                    if (!this.y || n15 >= this.a.C() - 1) break block6;
                    PV pV3 = this.a.B(n15 + 1);
                    int n18 = n17 + this.q.width;
                    int n19 = n10 + Math.round((float)n11 * pV3.I()) - this.q.width / 2;
                    int n20 = Math.round((pV3.I() - f10) * 100.0f);
                    int n21 = fontMetrics.stringWidth(n20 + "");
                    if (n16 != 0) break block5;
                    if (n19 - n18 <= n21 + 4) break block6;
                    int n22 = (n18 + n19) / 2 - n21 / 2;
                    graphics2D.setPaint(this.isEnabled() ? p : D);
                    graphics2D.drawString(n20 + "", n22, n13);
                    if (n16 != 0) break block5;
                    if (n19 - n18 > n21 + ou_2.a(15632, 247772978569068126L)) {
                        graphics2D.setPaint(new GradientPaint(n18 + 2, 0.0f, GO.l, n22 - 2, 0.0f, Color.LIGHT_GRAY));
                        graphics2D.drawLine(n18 + 2, n14, n22 - 2, n14);
                        graphics2D.setPaint(new GradientPaint(n22 + n21 + 2, 0.0f, Color.LIGHT_GRAY, n19 - 2, 0.0f, GO.l));
                        graphics2D.drawLine(n22 + n21 + 2, n14, n19 - 2, n14);
                    }
                }
                ++n15;
            }
            if (n16 == 0) continue;
        }
    }

    private void r(Graphics2D graphics2D, Rectangle rectangle, Paint paint, Paint paint2, boolean bl) {
        block7: {
            boolean bl2;
            block5: {
                int n10;
                block6: {
                    n10 = nx_2.c();
                    bl2 = this.isEnabled();
                    if (n10 == 0) break block5;
                    if (!bl2) break block6;
                    bl2 = bl;
                    if (n10 == 0) break block5;
                    if (!bl2) {
                        RV.Y(graphics2D, new RoundRectangle2D.Double(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 1, 4.0, 4.0), this.isFocusOwner() ? GO.c : GO.N, this.m);
                    }
                }
                graphics2D.setPaint(paint);
                graphics2D.fillRoundRect(rectangle.x + 1, rectangle.y + 1, rectangle.width - 2, rectangle.height - 2, 2, 2);
                graphics2D.setPaint(E);
                graphics2D.drawRoundRect(rectangle.x + 1, rectangle.y + 1, rectangle.width - 3, rectangle.height - 3, 2, 2);
                if (n10 == 0) break block7;
                bl2 = bl;
            }
            if (bl2) {
                graphics2D.setPaint(new GradientPaint(rectangle.x + 2, rectangle.y + 2, P9.i(ou_2.a(28019, 5362165453006663222L)), rectangle.x + rectangle.width * 2 / 3, rectangle.y + rectangle.height - 2, GO.l));
                graphics2D.fillRect(rectangle.x + 2, rectangle.y + 2, rectangle.width - 4, rectangle.height - 4);
            }
            graphics2D.setPaint(paint2);
            graphics2D.fillRect(rectangle.x + 2, rectangle.y + 2, rectangle.width - 4, rectangle.height - 4);
        }
        graphics2D.setPaint(this.isEnabled() ? t : O);
        graphics2D.drawRoundRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 1, 4, 4);
    }

    private LinearGradientPaint j(Rectangle rectangle) {
        return new LinearGradientPaint(rectangle.x + 1, 0.0f, rectangle.x + rectangle.width - 1, 0.0f, this.a.l(), this.a.H());
    }

    private LinearGradientPaint U(Rectangle rectangle) {
        return this.u(rectangle, l, M);
    }

    private LinearGradientPaint n(Rectangle rectangle) {
        return this.u(rectangle, l, d);
    }

    private LinearGradientPaint u(Rectangle rectangle, float[] fArray, Color[] colorArray) {
        return new LinearGradientPaint(0.0f, rectangle.y + 2, 0.0f, rectangle.y + rectangle.height - 2, fArray, colorArray);
    }

    private Rectangle R() {
        Insets insets = this.getInsets();
        return new Rectangle(insets.left + Math.max(this.q.width / 2, this.m) - 2, insets.top + this.m, this.getWidth() - insets.left - insets.right - Math.max(this.q.width, this.m * 2) + 4, this.x);
    }

    public List e() {
        return this.F;
    }

    public void t(ChangeListener changeListener) {
        this.F.add(changeListener);
    }

    public void s(ChangeListener changeListener) {
        this.F.remove(changeListener);
    }

    private void j() {
        ChangeEvent changeEvent = new ChangeEvent(this);
        Iterator iterator = this.F.iterator();
        int n10 = nx_2.R();
        while (iterator.hasNext()) {
            ChangeListener changeListener = (ChangeListener)iterator.next();
            changeListener.stateChanged(changeEvent);
            if (n10 == 0) continue;
        }
    }

    @Override
    public void p(String string) {
        cl_2.c(this, string);
    }

    @Override
    public void a(String string, Class clazz) {
        cl_2.x(this, string, clazz);
    }

    @Override
    public void E(String string, Object object) {
        cl_2.e(this, string, object);
    }

    @Override
    public void n(String string, String string2) {
        cl_2.B(this, string, string2);
    }

    @Override
    public void I(String string, String string2, Class clazz) {
        cl_2.t(this, string, string2, clazz);
    }

    @Override
    public void H(String string, String string2, Object object) {
        cl_2.a(this, string, string2, object);
    }

    @Override
    public void S(String string, boolean bl, boolean bl2) {
        cl_2.l(this, string, bl, bl2);
    }

    @Override
    public void O(String string, Class clazz, boolean bl, boolean bl2) {
        cl_2.X(this, string, clazz, bl, bl2);
    }

    @Override
    public void h(String string, Object object, boolean bl, boolean bl2) {
        cl_2.A(this, string, object, bl, bl2);
    }

    @Override
    public void e(String string, String string2, Class clazz, boolean bl, boolean bl2) {
        cl_2.L(this, string, string2, clazz, bl, bl2);
    }

    @Override
    public void D(String string, String string2, Object object, boolean bl, boolean bl2) {
        cl_2.y(this, string, string2, object, bl, bl2);
    }

    @Override
    public void z(IB iB) {
        cl_2.a(this, iB);
    }

    @Override
    public void w() {
        cl_2.O(this);
    }

    @Override
    public void m() {
        cl_2.G(this);
    }

    @Override
    public void e() {
        cl_2.H(this);
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public ou_2 v(int n10) {
        return (ou_2)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public ou_2 f(int n10) {
        return (ou_2)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public ou_2 m(int n10) {
        return (ou_2)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public ou_2 w(int n10) {
        return (ou_2)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public ou_2 y(int n10) {
        return (ou_2)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public ou_2 O(int n10) {
        return (ou_2)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        Insets insets = this.getInsets();
        int n10 = nx_2.R();
        int n11 = insets.left + this.q.width * 5 + Math.max(this.q.width, this.m * 2) - 4 + insets.right;
        int n12 = insets.top + this.m * 2 + this.x + this.q.height / 2;
        int n13 = this.q.height % 2;
        if (n10 == 0) {
            n13 = n13 == 0 ? 0 : 1;
        }
        int n14 = n12 + n13 + insets.bottom;
        Dimension dimension = new Dimension(n11, n14);
        return PY.W(this, dimension);
    }

    public ou_2 P(int n10, int n11) {
        return (ou_2)PY.O(this, n10, n11);
    }

    @Override
    public Component W(int n10, int n11) {
        return this.P(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.O(n10);
    }

    @Override
    public Component p(int n10) {
        return this.y(n10);
    }

    @Override
    public Component D(int n10) {
        return this.w(n10);
    }

    @Override
    public Component V(int n10) {
        return this.m(n10);
    }

    @Override
    public Component x(int n10) {
        return this.f(n10);
    }

    @Override
    public Component O(int n10) {
        return this.v(n10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2638340195432351686L;
                var6_1 = new long[13];
                var3_2 = 0;
                var4_3 = "\u0098\u0097\u00bbx;.\u0085\u00ca/\u00ec\u00c76~\u00f3\u00e3\u00fe4dDx\u0015\u0080\u00cay\u00b5\u0092\u0015Y\u00aa\u0017v\n\u00eb\u0003\u00d5c}\u00c8\u00c1*X\r_\u00e2\u00ff\n\u001b\u00d8\u00b3\u00f8\u00b1\u00e3)\u001d\u00da\u00ed\u00d8Wf\u00a0\u00f5\u00ed\u00f9\u0096{\b\u0010\u0082\\\u00e3\u001d\u0000b\u00b4'b\u009d<\u00d0\u00c7\u00c3\u00d8P42\u00f3\u0092a";
                var5_4 = "\u0098\u0097\u00bbx;.\u0085\u00ca/\u00ec\u00c76~\u00f3\u00e3\u00fe4dDx\u0015\u0080\u00cay\u00b5\u0092\u0015Y\u00aa\u0017v\n\u00eb\u0003\u00d5c}\u00c8\u00c1*X\r_\u00e2\u00ff\n\u001b\u00d8\u00b3\u00f8\u00b1\u00e3)\u001d\u00da\u00ed\u00d8Wf\u00a0\u00f5\u00ed\u00f9\u0096{\b\u0010\u0082\\\u00e3\u001d\u0000b\u00b4'b\u009d<\u00d0\u00c7\u00c3\u00d8P42\u00f3\u0092a".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\"\u00a9\u00d9+\u0083\u00cd\u00e9\u0084i\u001d\u00d9\u00ee,4)D";
                    var5_4 = "\"\u00a9\u00d9+\u0083\u00cd\u00e9\u0084i\u001d\u00d9\u00ee,4)D".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        ou_2.b = var6_1;
        ou_2.c = new Integer[13];
        ou_2.t = Color.DARK_GRAY;
        ou_2.O = Color.LIGHT_GRAY;
        ou_2.p = Color.BLACK;
        ou_2.D = new Color(ou_2.a(22837, 2579124458518370932L), ou_2.a(7894, 873826364048579993L), ou_2.a(7894, 873826364048579993L));
        ou_2.E = P9.i(ou_2.a(5365, 8137916030943860661L));
        ou_2.l = new float[]{0.0f, 0.4f, 0.41f, 1.0f};
        ou_2.M = new Color[]{P9.i(ou_2.a(1281, 7779477744796665420L)), P9.i(ou_2.a(3724, 5664088593583410631L)), P9.i(ou_2.a(16673, 4108041831790396008L)), P9.i(ou_2.a(12974, 7573593731571790308L))};
        ou_2.d = new Color[]{P9.i(ou_2.a(22196, 3846895884366435831L)), P9.i(ou_2.a(11570, 1901542599536979568L)), P9.i(ou_2.a(24390, 6293472599324974090L)), GO.l};
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x349;
        if (c[n11] == null) {
            ou_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

