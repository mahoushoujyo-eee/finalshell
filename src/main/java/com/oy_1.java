/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.GO;
import com.PY;
import com.RV;
import com.TI;
import com.W2;
import com.aL;
import com.i4_0;
import com.ky_2;
import com.lj_0;
import com.ob_1;
import com.ol_0;
import com.sa_0;
import com.u_;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.oY
 */
public class oy_1
extends JComponent
implements SwingConstants,
W2,
sa_0 {
    protected Insets k;
    protected int q;
    protected int g;
    protected int p;
    protected int e;
    protected int S;
    protected int X;
    protected int n;
    protected Color P;
    protected Color L;
    protected boolean M;
    protected int v;
    protected int b;
    protected int s;
    protected int T;
    protected boolean f;
    protected ob_1 c;
    protected final List y;
    protected int t;
    protected float O;
    protected boolean i;
    protected int Q;
    protected Shape r;
    protected LinearGradientPaint l;
    protected Shape R;
    private static boolean N;
    private static final long[] a;
    private static final Integer[] d;

    public oy_1() {
        this(Collections.EMPTY_LIST);
    }

    public oy_1(int n10) {
        this(oy_1.J(n10));
    }

    public oy_1(String[] stringArray) {
        this(oy_1.s(stringArray));
    }

    public oy_1(Component[] componentArray) {
        this(oy_1.C(componentArray));
    }

    public oy_1(u_[] u_Array) {
        this(aL.e(u_Array));
    }

    public oy_1(List list) {
        boolean bl = oy_1.y();
        this.k = lj_0.U;
        this.q = lj_0.s;
        this.g = lj_0.G;
        this.p = lj_0.o;
        this.e = lj_0.H;
        this.S = lj_0.B;
        this.X = lj_0.c;
        this.n = lj_0.a;
        this.P = lj_0.w;
        this.L = lj_0.D;
        this.M = lj_0.z;
        this.v = lj_0.I;
        this.b = lj_0.r;
        this.s = lj_0.K;
        this.T = lj_0.S;
        this.f = lj_0.F;
        this.c = lj_0.l;
        this.y = new ArrayList();
        this.t = 0;
        this.O = 0.0f;
        boolean bl2 = bl;
        this.i = false;
        this.Q = 0;
        this.j(list);
        this.setLayout(new TI(this));
        i4_0 i4_02 = new i4_0(this);
        this.addMouseListener(i4_02);
        this.addMouseMotionListener(i4_02);
        this.addComponentListener(new ol_0(this));
        if (ky_2.F() != null) {
            oy_1.x(!bl2);
        }
    }

    public Insets W() {
        return this.k;
    }

    public void A(Insets insets) {
        this.k = insets;
        this.revalidate();
    }

    public void V(int n10, int n11, int n12, int n13) {
        this.A(new Insets(n10, n11, n12, n13));
    }

    public void K(int n10) {
        this.V(n10, n10, n10, n10);
    }

    public int S() {
        return this.q;
    }

    public void x(int n10) {
        this.q = n10;
        this.revalidate();
    }

    public int T() {
        return this.g;
    }

    public void E(int n10) {
        this.g = n10;
        this.revalidate();
    }

    public int w() {
        return this.p;
    }

    public void b(int n10) {
        this.p = n10;
        this.repaint();
    }

    public int k() {
        return this.e;
    }

    public void C(int n10) {
        this.e = n10;
        this.revalidate();
    }

    public int R() {
        return this.S;
    }

    public void f(int n10) {
        this.S = n10;
        this.repaint();
    }

    public int h() {
        return this.X;
    }

    public void a(int n10) {
        this.X = n10;
        this.revalidate();
    }

    public int X() {
        return this.n;
    }

    public void G(int n10) {
        this.n = n10;
        this.revalidate();
    }

    public Color N() {
        return this.P;
    }

    public void o(Color color) {
        this.P = color;
        this.repaint();
    }

    public Color F() {
        return this.L;
    }

    public void F(Color color) {
        this.L = color;
        this.repaint();
    }

    public boolean R() {
        return this.M;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void i(boolean bl) {
        block9: {
            oy_1 oy_12;
            boolean bl2;
            block11: {
                block12: {
                    boolean bl3;
                    block10: {
                        bl2 = oy_1.Z();
                        bl3 = this.M;
                        if (bl2) break block10;
                        if (bl3 == bl) return;
                        oy_12 = this;
                        if (bl2) break block11;
                        oy_12.M = bl;
                        bl3 = bl;
                    }
                    if (!bl3) break block12;
                    for (u_ u_2 : this.y) {
                        if (!bl2) {
                            Component component = u_2.j();
                            if (!bl2 && component != null) {
                                component = this.add(u_2.j());
                            }
                            if (!bl2) continue;
                        }
                        break block9;
                    }
                    if (!bl2) break block9;
                }
                oy_12 = this;
            }
            for (u_ u_2 : oy_12.y) {
                if (bl2) return;
                if (u_2.j() != null) {
                    this.remove(u_2.j());
                }
                if (!bl2) continue;
            }
        }
        this.revalidate();
    }

    public int o() {
        return this.v;
    }

    public void O(int n10) {
        this.v = n10;
        this.revalidate();
    }

    public int q() {
        return this.b;
    }

    public void P(int n10) {
        this.b = n10;
        this.revalidate();
    }

    public int F() {
        return this.s;
    }

    public void z(int n10) {
        this.s = n10;
        this.revalidate();
    }

    public int t() {
        return this.T;
    }

    public void g(int n10) {
        this.T = n10;
        this.revalidate();
    }

    public boolean w() {
        return this.f;
    }

    public void h(boolean bl) {
        this.f = bl;
    }

    public ob_1 r() {
        return this.c;
    }

    public void d(ob_1 ob_12) {
        this.c = ob_12;
    }

    public int y() {
        return this.y.size();
    }

    public List k() {
        return aL.J((Collection)this.y);
    }

    public u_ J(int n10) {
        return (u_)this.y.get(n10);
    }

    public void Y(String[] stringArray) {
        this.j(oy_1.s(stringArray));
    }

    public void J(Component[] componentArray) {
        this.j(oy_1.C(componentArray));
    }

    public void j(List list) {
        this.X();
        this.v(list);
    }

    public void K(String[] stringArray) {
        if (stringArray != null) {
            this.v(oy_1.s(stringArray));
        }
    }

    public void R(Component[] componentArray) {
        if (componentArray != null) {
            this.v(oy_1.C(componentArray));
        }
    }

    public void v(List list) {
        block9: {
            List list2;
            boolean bl;
            block8: {
                bl = oy_1.Z();
                list2 = list;
                if (bl) break block8;
                if (list2 == null) break block9;
                list2 = this.y;
            }
            list2.addAll(list);
            oy_1 oy_12 = this;
            if (!bl) {
                block7: {
                    if (oy_12.M) {
                        for (u_ u_2 : list) {
                            if (!bl) {
                                Component component = u_2.j();
                                if (!bl && component != null) {
                                    component = this.add(u_2.j());
                                }
                                if (!bl) continue;
                            }
                            break block7;
                        }
                        this.revalidate();
                    }
                }
                oy_12 = this;
            }
            oy_12.L();
        }
    }

    public void s(int n10) {
        this.c(this.J(n10));
    }

    public void c(u_ u_2) {
        this.t(u_2);
        this.revalidate();
    }

    public void I(int n10) {
        this.X();
        this.v(oy_1.J(n10));
        this.revalidate();
    }

    protected void X() {
        block4: {
            List list;
            boolean bl;
            block3: {
                bl = oy_1.y();
                list = this.y;
                if (!bl) break block3;
                if (list.size() <= 0) break block4;
                list = this.y;
            }
            for (u_ u_2 : aL.J((Collection)list)) {
                this.t(u_2);
                if (bl) continue;
            }
        }
    }

    protected void t(u_ u_2) {
        block6: {
            block4: {
                boolean bl;
                block5: {
                    boolean bl2 = oy_1.y();
                    bl = this.M;
                    if (!bl2) break block4;
                    if (!bl) break block5;
                    Component component = u_2.j();
                    if (!bl2) break block6;
                    if (component != null) {
                        component.getParent().remove(component);
                    }
                }
                bl = this.y.remove(u_2);
            }
            this.L();
        }
    }

    public u_ M() {
        return (u_)this.y.get(this.V());
    }

    public void v(u_ u_2) {
        this.d(this.y.indexOf(u_2));
    }

    public int V() {
        return this.t;
    }

    public void d(int n10) {
        block8: {
            int n11;
            int n12;
            block7: {
                boolean bl = oy_1.y();
                n12 = n10;
                if (bl) {
                    if (n12 == this.t) {
                        return;
                    }
                    n12 = n10;
                }
                if (bl) {
                    if (n12 < 0) {
                        n10 = 0;
                    }
                    n12 = n10;
                }
                n11 = this.y.size();
                if (!bl) break block7;
                if (n12 < n11) break block8;
                n12 = this.y.size();
                n11 = 1;
            }
            n10 = n12 - n11;
        }
        this.t = n10;
        this.O = 0.0f;
        this.j();
    }

    protected void L() {
        block6: {
            oy_1 oy_12;
            block7: {
                int n10;
                block5: {
                    boolean bl = oy_1.Z();
                    n10 = this.t;
                    if (!bl) {
                        if (n10 >= this.y()) {
                            this.d(this.y() - 1);
                        }
                        n10 = this.t;
                    }
                    if (bl) break block5;
                    if (n10 >= 0) break block6;
                    oy_12 = this;
                    if (bl) break block7;
                    n10 = oy_12.y();
                }
                if (n10 <= 0) break block6;
                oy_12 = this;
            }
            oy_12.d(0);
        }
    }

    public float O() {
        return this.O;
    }

    public void o(float f10) {
        block7: {
            float f11;
            float f12;
            block8: {
                boolean bl;
                block5: {
                    float f13;
                    block6: {
                        bl = oy_1.Z();
                        float f14 = f10 - this.O;
                        f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                        if (!bl) {
                            if (f12 == false) {
                                return;
                            }
                            float f15 = f10 - 0.0f;
                            f12 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                        }
                        if (bl) break block5;
                        if (f12 >= 0) break block6;
                        float f16 = Math.abs(f10);
                        int n10 = this.t - Math.round(f16 - f16 % 1.0f) - 1;
                        f10 = n10 < 0 ? 0.0f : 1.0f - f16 % 1.0f;
                        this.d(n10);
                        if (!bl) break block7;
                    }
                    f12 = (f13 = f10 - 1.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                if (bl) break block8;
                if (f12 < 0) break block7;
                f12 = this.t + Math.round(f10 - f10 % 1.0f);
            }
            f10 = (f11 = f12) >= this.y.size() ? 0.0f : f10 % 1.0f;
            this.d((int)f11);
        }
        this.O = f10;
        this.j();
    }

    public float N() {
        return ((float)this.t + this.O) / (float)(this.y.size() - 1);
    }

    public float M(Point point) {
        boolean bl = oy_1.y();
        int n10 = this.v;
        if (bl) {
            n10 = n10 == 0 ? 1 : 0;
        }
        int n11 = n10;
        Point point2 = this.T();
        Point point3 = this.J();
        float f10 = this.O();
        int n12 = n11;
        if (bl) {
            if (n12 != 0) {
                int n13 = this.getComponentOrientation().isLeftToRight();
                if (bl) {
                    if (n13 != 0) {
                        int n14 = point.x;
                        int n15 = point2.x;
                        if (bl) {
                            if (n14 < n15) {
                                return 0.0f;
                            }
                            n14 = point.x;
                            n15 = point3.x;
                        }
                        if (bl) {
                            if (n14 > n15) {
                                return this.y.size() - 1;
                            }
                            n14 = this.y.size() - 1;
                            n15 = point.x - point2.x;
                        }
                        return (float)(n14 * n15) / f10;
                    }
                    n13 = point.x;
                }
                int n16 = point2.x;
                if (bl) {
                    if (n13 > n16) {
                        return 0.0f;
                    }
                    n13 = point.x;
                    n16 = point3.x;
                }
                if (bl) {
                    if (n13 < n16) {
                        return this.y.size() - 1;
                    }
                    n13 = this.y.size();
                    n16 = 1;
                }
                return (float)(n13 - n16) * (f10 - (float)(point.x - point3.x)) / f10;
            }
            n12 = point.y;
        }
        int n17 = point2.y;
        if (bl) {
            if (n12 < n17) {
                return 0.0f;
            }
            n12 = point.y;
            n17 = point3.y;
        }
        if (bl) {
            if (n12 > n17) {
                return this.y.size() - 1;
            }
            n12 = this.y.size() - 1;
            n17 = point.y - point2.y;
        }
        return (float)(n12 * n17) / f10;
    }

    public void N(float f10) {
        f10 = (float)(this.y.size() - 1) * f10;
        this.d(Math.round(f10 - f10 % 1.0f));
        this.o(f10 % 1.0f);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D)graphics;
        Object object = RV.X(graphics2D);
        GA.i(graphics2D, this, this.X(), GO.r, this.q, true, true);
        graphics2D.setPaint(this.u());
        graphics2D.fill(this.I());
        RV.X(graphics2D, object);
    }

    @Override
    public Shape B() {
        return this.X();
    }

    protected void g() {
        this.r = null;
        this.repaint();
    }

    protected void j() {
        this.l = null;
        this.R = null;
        this.repaint();
    }

    protected void P() {
        this.r = null;
        this.l = null;
        this.R = null;
        this.repaint();
    }

    protected Shape X() {
        boolean bl = oy_1.Z();
        Shape shape = this.r;
        if (!bl) {
            if (shape == null) {
                this.r = this.S();
            }
            shape = this.r;
        }
        return shape;
    }

    protected Shape S() {
        Area area;
        block2: {
            Area area2 = new Area(this.C());
            boolean bl = oy_1.Z();
            for (int i2 = 0; i2 < this.y.size(); ++i2) {
                area = area2;
                if (!bl) {
                    area.add(new Area(this.H(i2)));
                    if (!bl) continue;
                }
                break block2;
            }
            area = area2;
        }
        return area;
    }

    protected Shape H(int n10) {
        Point point = this.S(n10);
        if (this.p * 2 >= this.g) {
            return new Ellipse2D.Double(point.x - this.g / 2, point.y - this.g / 2, this.g, this.g);
        }
        return new RoundRectangle2D.Double(point.x - this.g / 2, point.y - this.g / 2, this.g, this.g, this.p * 2, this.p * 2);
    }

    protected LinearGradientPaint u() {
        boolean bl = oy_1.y();
        LinearGradientPaint linearGradientPaint = this.l;
        if (bl) {
            if (linearGradientPaint == null) {
                this.l = this.y();
            }
            linearGradientPaint = this.l;
        }
        return linearGradientPaint;
    }

    /*
     * Unable to fully structure code
     */
    protected LinearGradientPaint y() {
        block9: {
            block10: {
                var2_1 = this.T();
                var1_2 = oy_1.y();
                var3_3 = (float)this.t + this.O;
                v0 = var4_4 = this.y.size() - 1;
                if (var1_2) {
                    v0 = v0 > 0 ? this.O() / var4_4 : 0;
                }
                var5_5 = v0;
                var6_6 = (float)this.e * 1.5f + (float)var5_5 * var3_3;
                v1 = this;
                if (!var1_2) ** GOTO lbl15
                if (v1.isEnabled()) {
                    v2 = this.P;
                } else {
                    v1 = this;
lbl15:
                    // 2 sources

                    v2 = v1.L;
                }
                var7_7 = v2;
                v3 = this.v;
                if (!var1_2) break block9;
                if (v3 != 0) break block10;
                v4 = var8_8 = this.getComponentOrientation().isLeftToRight();
                if (!var1_2) ** GOTO lbl26
                if (v4 != 0) {
                    v5 = var2_1.x - this.e / 2;
                } else {
                    v4 = var2_1.x + this.e / 2;
lbl26:
                    // 2 sources

                    v5 = (float)v4 - var6_6;
                }
                var9_10 = v5;
                v6 = var8_8;
                if (!var1_2) ** GOTO lbl38
                if (v6 != 0) {
                    v7 = new float[3];
                    v7[0] = 0.0f;
                    v7[1] = ((float)this.e + (float)var5_5 * var3_3) / var6_6;
                    v8 = v7;
                    v7[2] = 1.0f;
                } else {
                    v6 = 3;
lbl38:
                    // 2 sources

                    v9 = new float[v6];
                    v9[0] = 0.0f;
                    v9[1] = 1.0f - ((float)this.e + (float)var5_5 * var3_3) / var6_6;
                    v8 = v9;
                    v9[2] = 1.0f;
                }
                var10_11 = v8;
                v10 = var8_8;
                if (!var1_2) ** GOTO lbl54
                if (v10 != 0) {
                    v11 = new Color[3];
                    v11[0] = var7_7;
                    v11[1] = var7_7;
                    v12 = v11;
                    v11[2] = GO.l;
                } else {
                    v10 = 3;
lbl54:
                    // 2 sources

                    v13 = new Color[v10];
                    v13[0] = GO.l;
                    v13[1] = var7_7;
                    v12 = v13;
                    v13[2] = var7_7;
                }
                var11_12 = v12;
                return new LinearGradientPaint(var9_10, 0.0f, var9_10 + var6_6, 0.0f, var10_11, var11_12);
            }
            v3 = var2_1.y - this.e / 2;
        }
        var8_9 = v3;
        return new LinearGradientPaint(0.0f, var8_9, 0.0f, var8_9 + var6_6, new float[]{0.0f, ((float)this.e + (float)var5_5 * var3_3) / var6_6, 1.0f}, new Color[]{var7_7, var7_7, GO.l});
    }

    protected Shape I() {
        boolean bl = oy_1.y();
        Shape shape = this.R;
        if (bl) {
            if (shape == null) {
                this.R = this.K();
            }
            shape = this.R;
        }
        return shape;
    }

    protected Shape K() {
        Area area;
        block2: {
            Area area2 = new Area(this.e());
            boolean bl = oy_1.Z();
            for (int i2 = 0; i2 < this.y.size(); ++i2) {
                area = area2;
                if (!bl) {
                    area.add(new Area(this.p(i2)));
                    if (!bl) continue;
                }
                break block2;
            }
            area = area2;
        }
        return area;
    }

    protected Shape p(int n10) {
        Point point = this.S(n10);
        if (this.S * 2 >= this.e) {
            return new Ellipse2D.Double(point.x - this.e / 2, point.y - this.e / 2, this.e, this.e);
        }
        return new RoundRectangle2D.Double(point.x - this.e / 2, point.y - this.e / 2, this.e, this.e, this.S * 2, this.S * 2);
    }

    protected Shape C() {
        Point point;
        Point point2;
        block3: {
            int n10;
            int n11;
            block2: {
                point2 = this.T();
                boolean bl = oy_1.y();
                point = this.J();
                n11 = this.v;
                if (!bl) break block2;
                if (n11 != 0) break block3;
                n11 = this.getComponentOrientation().isLeftToRight() ? 1 : 0;
            }
            return new Rectangle2D.Double((n10 = n11) != 0 ? (double)point2.x : (double)point.x, (float)point2.y - (float)this.X / 2.0f, n10 != 0 ? (double)(point.x - point2.x) : (double)(point2.x - point.x), this.X);
        }
        return new Rectangle2D.Double((float)point2.x - (float)this.X / 2.0f, point2.y, this.X, point.y - point2.y);
    }

    protected Shape e() {
        Point point;
        Point point2;
        block3: {
            int n10;
            int n11;
            block2: {
                point2 = this.T();
                boolean bl = oy_1.Z();
                point = this.J();
                n11 = this.v;
                if (bl) break block2;
                if (n11 != 0) break block3;
                n11 = this.getComponentOrientation().isLeftToRight() ? 1 : 0;
            }
            return new Rectangle2D.Double((n10 = n11) != 0 ? (double)point2.x : (double)point.x, (float)point2.y + 0.5f - (float)this.n / 2.0f, n10 != 0 ? (double)(point.x - point2.x) : (double)(point2.x - point.x), this.n);
        }
        return new Rectangle2D.Double((float)point2.x + 0.5f - (float)this.n / 2.0f, point2.y, this.n, point.y - point2.y);
    }

    protected Point T() {
        return this.S(0);
    }

    protected Point J() {
        return this.S(this.y.size() - 1);
    }

    /*
     * Unable to fully structure code
     */
    protected Point S(int var1_1) {
        block12: {
            block13: {
                block16: {
                    block15: {
                        block14: {
                            var3_2 = this.U().L();
                            var4_3 = this.getComponentOrientation().isLeftToRight();
                            var2_4 = oy_1.Z();
                            var5_5 = this.y.size() - 1;
                            v0 = this.v;
                            if (var2_4) break block12;
                            if (v0 != 0) break block13;
                            v1 = var5_5;
                            if (var2_4) break block14;
                            if (v1 <= 0) break block15;
                            v1 = this.O();
                        }
                        v2 = var4_3;
                        if (var2_4) ** GOTO lbl19
                        if (v2 != 0) {
                            v3 = var1_1;
                        } else {
                            v2 = var5_5;
lbl19:
                            // 2 sources

                            v3 = v2 - var1_1;
                        }
                        v4 = v1 * v3 / var5_5;
                        break block16;
                    }
                    v4 = 0;
                }
                var6_6 = v4;
                var7_8 = this.k.left + this.Q + var6_6;
                var8_10 = this.getHeight() - this.k.top - this.k.bottom;
                v5 = var3_2.height;
                v6 = var3_2.height;
                if (!var2_4) {
                    v6 = v6 > 0 ? this.s : 0;
                }
                var9_12 = v5 + v6;
                var10_14 = var9_12 + this.g + this.q * 2;
                v7 = this.b;
                if (!var2_4) {
                    v7 = v7 == oy_1.a(8665, 9126392506985866727L) ? 1 : 0;
                }
                var11_16 = v7;
                v8 = this.k.top + var8_10 / 2 - var10_14 / 2;
                v9 = var11_16;
                if (!var2_4) {
                    v9 = v9 != 0 ? var9_12 : 0;
                }
                var12_18 = v8 + v9 + this.q + this.g / 2;
                return new Point(var7_8, var12_18);
            }
            v0 = var5_5;
        }
        if (!var2_4) {
            v0 = v0 > 0 ? this.O() * var1_1 / var5_5 : 0;
        }
        var6_7 = v0;
        var7_9 = this.k.top + this.Q + var6_7;
        var8_11 = this.getWidth() - this.k.left - this.k.right;
        v10 = var3_2.width;
        v11 = var3_2.width;
        if (!var2_4) {
            v11 = v11 > 0 ? this.s : 0;
        }
        var9_13 = v10 + v11;
        var10_15 = var9_13 + this.g + this.q * 2;
        v12 = var4_3;
        if (var2_4) ** GOTO lbl66
        if (v12 != 0) {
            v12 = this.b;
            if (!var2_4) {
                v12 = v12 == oy_1.a(10896, 7841008706659741356L) ? 1 : 0;
            }
        } else {
            v12 = this.b;
lbl66:
            // 2 sources

            if (!var2_4) {
                v12 = v12 == oy_1.a(20142, 5809520768553486993L) ? 1 : 0;
            }
        }
        var11_17 = v12;
        v13 = this.k.left + var8_11 / 2 - var10_15 / 2;
        v14 = var11_17;
        if (!var2_4) {
            v14 = v14 != 0 ? var9_13 : 0;
        }
        var12_19 = v13 + v14 + this.q + this.g / 2;
        return new Point(var12_19, var7_9);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected int O() {
        int n10;
        boolean bl = oy_1.Z();
        int n11 = this.v;
        if (!bl) {
            if (n11 == 0) {
                n10 = this.getWidth() - this.Q * 2 - this.k.left - this.k.right - 1;
                return n10;
            }
            n11 = this.getHeight() - this.Q * 2 - this.k.top - this.k.bottom;
        }
        n10 = n11 - 1;
        return n10;
    }

    public int k(Point point) {
        int n10;
        block3: {
            boolean bl = oy_1.y();
            for (int i2 = 0; i2 < this.y.size(); ++i2) {
                n10 = this.H(i2).contains(point) ? 1 : 0;
                if (bl) {
                    int n11;
                    if (bl) {
                        if (n10 == 0) continue;
                        n11 = i2;
                    }
                    return n11;
                }
                break block3;
            }
            n10 = -1;
        }
        return n10;
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public oy_1 S(int n10) {
        return (oy_1)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public oy_1 o(int n10) {
        return (oy_1)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public oy_1 F(int n10) {
        return (oy_1)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public oy_1 T(int n10) {
        return (oy_1)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public oy_1 H(int n10) {
        return (oy_1)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public oy_1 V(int n10) {
        return (oy_1)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public oy_1 V(int n10, int n11) {
        return (oy_1)PY.O(this, n10, n11);
    }

    public TI U() {
        return (TI)this.getLayout();
    }

    public static List s(String[] stringArray) {
        ArrayList<u_> arrayList;
        block2: {
            ArrayList<u_> arrayList2 = new ArrayList<u_>();
            String[] stringArray2 = stringArray;
            boolean bl = oy_1.y();
            for (String string : stringArray2) {
                arrayList = arrayList2;
                if (bl) {
                    arrayList.add(new u_(string));
                    if (bl) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static List C(Component[] componentArray) {
        ArrayList<u_> arrayList;
        block2: {
            ArrayList<u_> arrayList2 = new ArrayList<u_>();
            Component[] componentArray2 = componentArray;
            int n10 = componentArray2.length;
            boolean bl = oy_1.y();
            for (int i2 = 0; i2 < n10; ++i2) {
                Component component = componentArray2[i2];
                arrayList = arrayList2;
                if (bl) {
                    arrayList.add(new u_(component));
                    if (bl) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static List J(int n10) {
        ArrayList<u_> arrayList;
        block2: {
            ArrayList<u_> arrayList2 = new ArrayList<u_>(n10);
            boolean bl = oy_1.y();
            for (int i2 = 0; i2 < n10; ++i2) {
                arrayList = arrayList2;
                if (bl) {
                    arrayList.add(new u_());
                    if (bl) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override
    public Component W(int n10, int n11) {
        return this.V(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.V(n10);
    }

    @Override
    public Component p(int n10) {
        return this.H(n10);
    }

    @Override
    public Component D(int n10) {
        return this.T(n10);
    }

    @Override
    public Component V(int n10) {
        return this.F(n10);
    }

    @Override
    public Component x(int n10) {
        return this.o(n10);
    }

    @Override
    public Component O(int n10) {
        return this.S(n10);
    }

    public static void x(boolean bl) {
        N = bl;
    }

    public static boolean y() {
        return N;
    }

    public static boolean Z() {
        boolean bl = oy_1.y();
        return !bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2323685241019508444L;
        long[] lArray = new long[3];
        int n10 = 0;
        oy_1.x(true);
        String string = "O\u00e1[\u00a7\u00f3d\u00c31\u008bK\u00eb\u00aa\u008c+\u00acF~\u0085e\u0002A\u00fb\u00c8z";
        int n11 = "O\u00e1[\u00a7\u00f3d\u00c31\u008bK\u00eb\u00aa\u008c+\u00acF~\u0085e\u0002A\u00fb\u00c8z".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        d = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x443E;
        if (d[n11] == null) {
            oy_1.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

