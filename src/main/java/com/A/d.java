/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.B;
import com.A.N;
import com.A.O;
import com.A.P;
import com.A.T;
import com.A.U;
import com.A.V;
import com.A.Y;
import com.A.h;
import com.A.j;
import com.A.l;
import com.A.w;
import com.A.x;
import com.FN;
import com.GO;
import com.KD;
import com.RV;
import com.a.c_0;
import com.a.m_0;
import com.a.v_0;
import com.a.y_0;
import com.fk_0;
import com.k2_0;
import com.ky_2;
import com.pf_1;
import com.wx_0;
import com.xg_0;
import com.xk_0;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;
import java.awt.geom.RoundRectangle2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicRootPaneUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d
extends BasicRootPaneUI
implements SwingConstants {
    public static ImageIcon U;
    public static ImageIcon m;
    public static ImageIcon i;
    public static ImageIcon w;
    public static ImageIcon K;
    public static ImageIcon H;
    public static ImageIcon o;
    public static ImageIcon Z;
    protected Color R = c_0.G;
    protected Color J = c_0.Y;
    protected Color r = c_0.X;
    protected Color v = c_0.p;
    protected int X = c_0.i;
    protected int I = c_0.V;
    protected int Y = c_0.e;
    protected Insets T = c_0.h;
    protected boolean G = c_0.W;
    protected ImageIcon a = c_0.K;
    protected int z = c_0.I;
    protected String s = com.A.d.a(-27687, 2326);
    protected boolean f = c_0.M;
    protected boolean t = c_0.Q;
    protected boolean p = c_0.z;
    protected boolean q;
    protected boolean g;
    protected boolean k;
    protected boolean Q;
    protected boolean C;
    protected boolean F;
    protected boolean M;
    protected JRootPane N;
    protected Window x;
    protected Frame P;
    protected Dialog j;
    protected int B;
    protected LayoutManager E;
    protected LayoutManager h;
    protected WindowFocusListener y;
    protected PropertyChangeListener D;
    protected PropertyChangeListener u;
    protected WindowStateListener n;
    protected JComponent V;
    protected k2_0 S;
    protected m_0 A;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    public d() {
        int[] nArray = y_0.M();
        this.q = c_0.u;
        this.g = c_0.A;
        this.k = c_0.o;
        this.Q = c_0.g;
        this.C = c_0.R;
        this.F = c_0.U;
        this.M = false;
        if (ky_2.F() != null) {
            y_0.s(new int[5]);
        }
    }

    public static ComponentUI createUI(JComponent jComponent) {
        return new d();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.N = (JRootPane)jComponent;
        FN.Y(this.N);
        this.N.setBackground(GO.R);
        this.N();
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        super.uninstallUI(jComponent);
        this.d();
        this.E = null;
        this.N = null;
    }

    public boolean r() {
        return this.M;
    }

    public Color q() {
        return this.R;
    }

    public void R(Color color) {
        this.R = color;
        this.N.repaint();
    }

    public Color V() {
        return this.J;
    }

    public void k(Color color) {
        this.J = color;
        this.N.repaint();
    }

    public Color s() {
        return this.r;
    }

    public void h(Color color) {
        this.r = color;
        this.N.repaint();
    }

    public Color t() {
        return this.v;
    }

    public void D(Color color) {
        this.v = color;
        this.N.repaint();
    }

    public int x() {
        return this.X;
    }

    public void f(int n10) {
        block3: {
            Window window;
            int n11;
            block4: {
                d d2;
                int[] nArray;
                block2: {
                    n11 = n10 - this.X;
                    this.X = n10;
                    nArray = y_0.M();
                    d2 = this;
                    if (nArray == null) break block2;
                    if (!d2.M) break block3;
                    d2 = this;
                }
                window = d2.x;
                if (nArray == null) break block4;
                if (window == null) break block3;
                window = this.x;
            }
            Rectangle rectangle = window.getBounds();
            this.x.setBounds(rectangle.x - n11, rectangle.y - n11, rectangle.width + n11 * 2, rectangle.height + n11 * 2);
            this.R();
            this.N.revalidate();
            this.N.repaint();
        }
    }

    public int d() {
        return this.I;
    }

    public void b(int n10) {
        block3: {
            d d2;
            block2: {
                this.I = n10;
                int[] nArray = y_0.M();
                d2 = this;
                if (nArray == null) break block2;
                if (!d2.M) break block3;
                this.R();
                this.N.revalidate();
                d2 = this;
            }
            d2.N.repaint();
        }
    }

    public int u() {
        return this.Y;
    }

    public void Q(int n10) {
        block3: {
            d d2;
            block2: {
                this.Y = n10;
                int[] nArray = y_0.M();
                d2 = this;
                if (nArray == null) break block2;
                if (!d2.M) break block3;
                this.n();
                this.N.revalidate();
                d2 = this;
            }
            d2.N.repaint();
        }
    }

    public Insets M() {
        return this.T;
    }

    public void I(Insets insets) {
        block3: {
            d d2;
            block2: {
                this.T = insets;
                int[] nArray = y_0.M();
                d2 = this;
                if (nArray == null) break block2;
                if (!d2.M) break block3;
                this.R();
                this.N.revalidate();
                d2 = this;
            }
            d2.N.repaint();
        }
    }

    public boolean C() {
        return this.G;
    }

    public void H(boolean bl) {
        block3: {
            d d2;
            block2: {
                this.G = bl;
                int[] nArray = y_0.M();
                d2 = this;
                if (nArray == null) break block2;
                if (!d2.M) break block3;
                d2 = this;
            }
            d2.N.repaint();
        }
    }

    public ImageIcon l() {
        ImageIcon imageIcon;
        block4: {
            d d2;
            block6: {
                block5: {
                    int[] nArray = y_0.M();
                    imageIcon = this.a;
                    if (nArray == null) break block4;
                    if (imageIcon != null) break block5;
                    d2 = this;
                    if (nArray == null) break block6;
                    if (d2.G) {
                        this.a = new ImageIcon(d.class.getResource(com.A.d.a(-27698, -7189)));
                    }
                }
                d2 = this;
            }
            imageIcon = d2.a;
        }
        return imageIcon;
    }

    public void g(ImageIcon imageIcon) {
        this.a = imageIcon;
    }

    public int R() {
        return this.z;
    }

    public void q(int n10) {
        block3: {
            JComponent jComponent;
            block4: {
                d d2;
                int[] nArray;
                block2: {
                    this.z = n10;
                    nArray = y_0.M();
                    d2 = this;
                    if (nArray == null) break block2;
                    if (!d2.r()) break block3;
                    d2 = this;
                }
                jComponent = d2.V;
                if (nArray == null) break block4;
                if (jComponent == null) break block3;
                this.V.revalidate();
                jComponent = this.V;
            }
            jComponent.repaint();
        }
    }

    public String D() {
        return this.s;
    }

    public void S(String string) {
        block3: {
            JComponent jComponent;
            block4: {
                d d2;
                int[] nArray;
                block2: {
                    this.s = string;
                    nArray = y_0.M();
                    d2 = this;
                    if (nArray == null) break block2;
                    if (!d2.r()) break block3;
                    d2 = this;
                }
                jComponent = d2.V;
                if (nArray == null) break block4;
                if (jComponent == null) break block3;
                this.V.revalidate();
                jComponent = this.V;
            }
            jComponent.repaint();
        }
    }

    public JComponent R() {
        return this.V;
    }

    public void B(JComponent jComponent) {
        this.V = jComponent;
        this.N.revalidate();
    }

    public k2_0 M() {
        return this.S;
    }

    public m_0 F() {
        return this.A;
    }

    public boolean i() {
        return this.F;
    }

    public void m(boolean bl) {
        this.F = bl;
        this.N.revalidate();
    }

    public boolean A() {
        return this.f;
    }

    public void V(boolean bl) {
        this.f = bl;
        this.N.revalidate();
    }

    public boolean y() {
        return this.p;
    }

    public void r(boolean bl) {
        this.p = bl;
        this.N.revalidate();
    }

    public boolean k() {
        return this.q;
    }

    public void v(boolean bl) {
        this.q = bl;
        this.Z();
        this.N.revalidate();
    }

    public boolean t() {
        return this.g;
    }

    public void L(boolean bl) {
        this.g = bl;
        this.Z();
        this.N.revalidate();
    }

    public boolean w() {
        return this.k;
    }

    public void E(boolean bl) {
        this.k = bl;
        this.Z();
        this.N.revalidate();
    }

    public boolean v() {
        return this.Q;
    }

    public void f(boolean bl) {
        this.Q = bl;
        this.Z();
        this.N.revalidate();
        this.N.repaint();
    }

    public boolean z() {
        return this.C;
    }

    public void O(boolean bl) {
        this.C = bl;
        this.Z();
        this.N.revalidate();
        this.N.repaint();
    }

    public boolean s() {
        return this.t;
    }

    public void C(boolean bl) {
        this.t = bl;
        this.N.revalidate();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block6: {
            d d2;
            block7: {
                Object object;
                int[] nArray;
                block5: {
                    int[] nArray2 = y_0.M();
                    super.propertyChange(propertyChangeEvent);
                    nArray = nArray2;
                    String string = propertyChangeEvent.getPropertyName();
                    object = string;
                    if (nArray != null) {
                        if (object == null) {
                            return;
                        }
                        object = string;
                    }
                    if (nArray == null) break block5;
                    if (!((String)object).equals(com.A.d.a(-27694, 18487))) break block6;
                    object = propertyChangeEvent.getSource();
                }
                JRootPane jRootPane = (JRootPane)object;
                int n10 = jRootPane.getWindowDecorationStyle();
                d2 = this;
                if (nArray == null) break block7;
                d2.d();
                if (n10 == 0) break block6;
                d2 = this;
            }
            d2.N();
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void N() {
        block7: {
            block6: {
                var1_1 = y_0.M();
                v0 = this;
                if (var1_1 == null) break block6;
                if (v0.N.getWindowDecorationStyle() == 0) break block7;
                v0 = this;
            }
            v1 = this.N;
            if (var1_1 == null) ** GOTO lbl11
            if (v1 != null) {
                v1 = this.N;
lbl11:
                // 2 sources

                v2 = FN.L(v1);
            } else {
                v2 = null;
            }
            v0.x = v2;
            v3 = this.x;
            if (var1_1 == null) ** GOTO lbl19
            if (v3 instanceof Frame) {
                v3 = this.x;
lbl19:
                // 2 sources

                v4 = (Frame)v3;
            } else {
                v4 = null;
            }
            this.P = v4;
            v5 = this.x;
            if (var1_1 == null) ** GOTO lbl27
            if (v5 instanceof Dialog) {
                v5 = this.x;
lbl27:
                // 2 sources

                v6 = (Dialog)v5;
            } else {
                v6 = null;
            }
            this.j = v6;
            this.f();
            this.O();
            this.X();
            this.R();
            this.b();
            this.j();
            this.M = true;
        }
    }

    protected void d() {
        block3: {
            block2: {
                int[] nArray = y_0.M();
                d d2 = this;
                if (nArray == null) break block2;
                if (!d2.M) break block3;
                this.q();
                this.A();
                this.r();
                this.m();
                this.T();
                this.h();
                this.x = null;
                this.P = null;
                this.j = null;
                d2 = this;
            }
            d2.M = false;
        }
    }

    protected void f() {
    }

    protected void q() {
        block3: {
            d d2;
            block2: {
                int[] nArray = y_0.M();
                d2 = this;
                if (nArray == null) break block2;
                if (!d2.u()) break block3;
                d2 = this;
            }
            d2.P.setMaximizedBounds(null);
        }
    }

    protected void O() {
        block3: {
            d d2;
            block2: {
                this.y = new B(this);
                int[] nArray = y_0.M();
                this.x.addWindowFocusListener(this.y);
                this.D = new N(this);
                this.x.addPropertyChangeListener(com.A.d.a(-27684, -27584), this.D);
                this.x.addPropertyChangeListener(com.A.d.a(-27685, 9307), this.D);
                this.u = new Y(this);
                this.x.addPropertyChangeListener(com.A.d.a(-27702, 23514), this.u);
                d2 = this;
                if (nArray == null) break block2;
                if (!d2.u()) break block3;
                this.B = this.P.getState();
                this.n = new h(this);
                d2 = this;
            }
            d2.x.addWindowStateListener(this.n);
        }
    }

    protected void A() {
        block3: {
            d d2;
            block2: {
                this.x.removeWindowFocusListener(this.y);
                int[] nArray = y_0.M();
                this.x.removePropertyChangeListener(com.A.d.a(-27695, 7361), this.D);
                this.x.removePropertyChangeListener(com.A.d.a(-27682, 9191), this.D);
                this.x.removePropertyChangeListener(com.A.d.a(-27701, 20287), this.u);
                int[] nArray2 = nArray;
                d2 = this;
                if (nArray2 == null) break block2;
                if (!d2.u()) break block3;
                d2 = this;
            }
            d2.x.removeWindowStateListener(this.n);
        }
    }

    protected void X() {
        block3: {
            block2: {
                int[] nArray = y_0.M();
                if (nArray == null) break block2;
                if (!xk_0.R()) break block3;
                this.N.setOpaque(false);
            }
            xk_0.Z(this.x, false);
        }
    }

    protected void r() {
        block3: {
            block2: {
                int[] nArray = y_0.M();
                if (nArray == null) break block2;
                if (!xk_0.R()) break block3;
                this.N.setOpaque(true);
            }
            xk_0.Z(this.x, true);
        }
    }

    protected void R() {
        block4: {
            d d2;
            block2: {
                block3: {
                    int[] nArray = y_0.M();
                    d2 = this;
                    if (nArray == null) break block2;
                    if (d2.j()) break block3;
                    this.N.setBorder(BorderFactory.createEmptyBorder(this.X + 1 + this.T.top, this.X + 1 + this.T.left, this.X + 1 + this.T.bottom, this.X + 1 + this.T.right));
                    if (nArray != null) break block4;
                }
                d2 = this;
            }
            d2.N.setBorder(BorderFactory.createEmptyBorder(1 + this.T.top, 1 + this.T.left, 1 + this.T.bottom, 1 + this.T.right));
        }
    }

    protected void m() {
        this.N.setBorder(null);
    }

    protected void b() {
        int[] nArray = y_0.M();
        d d2 = this;
        if (nArray != null) {
            if (d2.E == null) {
                this.E = new P();
            }
            this.h = this.N.getLayout();
            d2 = this;
        }
        d2.N.setLayout(this.E);
    }

    protected void T() {
        block3: {
            block2: {
                int[] nArray = y_0.M();
                d d2 = this;
                if (nArray == null) break block2;
                if (d2.h == null) break block3;
                this.N.setLayout(this.h);
                d2 = this;
            }
            d2.h = null;
        }
    }

    protected void j() {
        this.V = this.I();
        this.N.add(this.V);
        this.Z();
        this.A = new m_0();
        this.N.add(this.A);
    }

    protected JComponent I() {
        w w2 = new w(this);
        V v2 = new V(this);
        v2.D(true);
        v2.setHorizontalAlignment(0);
        v2.addComponentListener(new O(this, v2));
        FN.O((Component)v2, com.A.d.a(11453, 943208823448200609L));
        ky_2 ky_22 = new ky_2(new BorderLayout(5, 0));
        ky_22.setOpaque(false);
        ky_22.N(4, 5, 4, com.A.d.a(14706, 251982342018134122L));
        ky_22.add((Component)w2, com.A.d.a(-27688, 24915));
        ky_22.add((Component)v2, com.A.d.a(-27696, 635));
        l l2 = new l(this);
        ky_22.addMouseListener(l2);
        ky_22.addMouseMotionListener(l2);
        return ky_22;
    }

    protected void Z() {
        d d2;
        block15: {
            KD kD;
            boolean bl;
            JComponent[] jComponentArray;
            block13: {
                int[] nArray;
                block14: {
                    boolean bl2;
                    block11: {
                        block12: {
                            nArray = y_0.M();
                            d d3 = this;
                            if (nArray != null) {
                                if (d3.S != null) {
                                    this.N.remove(this.S);
                                }
                                d3 = this;
                            }
                            bl2 = d3.u();
                            jComponentArray = new JComponent[3];
                            bl = this.q;
                            if (nArray == null) break block11;
                            if (!bl) break block12;
                            bl = bl2;
                            if (nArray == null) break block11;
                            if (bl) {
                                kD = new KD(U);
                                kD.setName(com.A.d.a(-27692, -28005));
                                kD.setRolloverIcon(m);
                                kD.setFocusable(false);
                                kD.addActionListener(new U(this));
                                jComponentArray[0] = kD;
                            }
                        }
                        bl = this.g;
                    }
                    if (nArray == null) break block13;
                    if (!bl) break block14;
                    bl = this.f();
                    if (nArray == null) break block13;
                    if (!bl) break block14;
                    bl = bl2;
                    if (nArray == null) break block13;
                    if (bl) {
                        kD = new T(this, (Icon)i);
                        kD.setName(com.A.d.a(-27700, 9954));
                        kD.setRolloverIcon(w);
                        kD.setFocusable(false);
                        kD.addActionListener(new v_0(this));
                        jComponentArray[1] = kD;
                    }
                }
                d2 = this;
                if (nArray == null) break block15;
                bl = d2.k;
            }
            if (bl) {
                kD = new KD(o);
                kD.setName(com.A.d.a(-27686, 18636));
                kD.setRolloverIcon(Z);
                kD.setFocusable(false);
                kD.addActionListener(new x(this));
                jComponentArray[2] = kD;
            }
            this.S = new j(this, jComponentArray);
            this.n();
            d2 = this;
        }
        d2.N.add(this.S);
    }

    protected void n() {
        block5: {
            d d2;
            int[] nArray;
            block6: {
                k2_0 k2_02;
                block4: {
                    nArray = y_0.M();
                    k2_02 = this.S;
                    if (nArray == null) break block4;
                    if (k2_02 == null) break block5;
                    this.S.E(false);
                    this.S.J(c_0.T);
                    this.S.r(this.Y);
                    k2_02 = this.S;
                }
                k2_02.I(c_0.b);
                d2 = this;
                if (nArray == null) break block6;
                if (!d2.C) break block5;
                this.S.i(false);
                d2 = this;
            }
            k2_0 k2_03 = d2.S;
            boolean bl = this.Y;
            if (nArray != null) {
                bl = bl > false;
            }
            k2_03.P(bl);
        }
    }

    protected void h() {
        block8: {
            block7: {
                int[] nArray = y_0.M();
                d d2 = this;
                if (nArray != null) {
                    if (d2.V != null) {
                        this.N.remove(this.V);
                        this.V = null;
                    }
                    d2 = this;
                }
                if (nArray != null) {
                    if (d2.S != null) {
                        this.N.remove(this.S);
                        this.S = null;
                    }
                    d2 = this;
                }
                if (nArray == null) break block7;
                if (d2.A == null) break block8;
                this.N.remove(this.A);
                d2 = this;
            }
            d2.A = null;
        }
    }

    protected String i() {
        block6: {
            d d2;
            block5: {
                boolean bl;
                block4: {
                    int[] nArray = y_0.M();
                    bl = this.Z();
                    if (nArray == null) break block4;
                    if (bl) {
                        return this.j.getTitle();
                    }
                    d2 = this;
                    if (nArray == null) break block5;
                    bl = d2.u();
                }
                if (!bl) break block6;
                d2 = this;
            }
            return d2.P.getTitle();
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    protected ImageIcon k() {
        block17: {
            block16: {
                var1_1 = y_0.M();
                v0 = this.x;
                if (var1_1 == null) ** GOTO lbl6
                if (v0 != null) {
                    v0 = this.x;
lbl6:
                    // 2 sources

                    v1 = v0.getIconImages();
                } else {
                    v1 = null;
                }
                v2 = var2_2 = v1;
                if (var1_1 != null) {
                    if (v2 != null) {
                        v2 = var2_2;
                        if (var1_1 != null) {
                            if (v2.size() > 1) {
                                var3_3 = 0;
                                var4_4 = Math.abs(var2_2.get(var3_3).getWidth(null) - com.A.d.a(28489, 1625212319596226132L));
                                var5_5 = 1;
                                while (var5_5 < var2_2.size()) {
                                    v3 = var4_4;
                                    if (var1_1 != null) {
                                        if (v3 == 0 && var1_1 != null) break;
                                        v3 = var6_6 = Math.abs(var2_2.get(var5_5).getWidth(null) - com.A.d.a(16986, 928103912585202500L));
                                    }
                                    if (var1_1 != null) {
                                        if (var6_6 < var4_4) {
                                            var3_3 = var5_5;
                                            var4_4 = var6_6;
                                        }
                                        ++var5_5;
                                    }
                                    if (var1_1 != null) continue;
                                }
                                return this.Y(var2_2.get(var3_3));
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v2 = var2_2;
                    }
                }
                if (var1_1 == null) break block16;
                if (v2 == null) break block17;
                v2 = var2_2;
            }
            if (v2.size() == 1) {
                return this.Y(var2_2.get(0));
            }
        }
        return new ImageIcon();
    }

    protected ImageIcon Y(Image image) {
        int[] nArray = y_0.M();
        Image image2 = image;
        if (nArray != null) {
            if (image2.getWidth(null) <= com.A.d.a(16986, 928103912585202500L)) {
                return new ImageIcon(image);
            }
            image2 = image;
        }
        return xg_0.T(image2, com.A.d.a(16986, 928103912585202500L));
    }

    protected void Q() {
        block3: {
            Window window;
            block2: {
                int[] nArray = y_0.M();
                window = this.x;
                if (nArray == null) break block2;
                if (window == null) break block3;
                window = this.x;
            }
            window.dispatchEvent(new WindowEvent(this.x, com.A.d.a(16848, 4512645558544861387L)));
        }
    }

    protected void U() {
        block3: {
            Frame frame;
            block2: {
                int[] nArray = y_0.M();
                frame = this.P;
                if (nArray == null) break block2;
                if (frame == null) break block3;
                frame = this.P;
            }
            frame.setExtendedState(1);
        }
    }

    protected void p() {
        block3: {
            Frame frame;
            block2: {
                int[] nArray = y_0.M();
                frame = this.P;
                if (nArray == null) break block2;
                if (frame == null) break block3;
                frame = this.P;
            }
            GraphicsConfiguration graphicsConfiguration = frame.getGraphicsConfiguration().getDevice().getDefaultConfiguration();
            this.P.setMaximizedBounds(wx_0.F(graphicsConfiguration, true));
            this.P.setExtendedState(com.A.d.a(31005, 2934375978528878596L));
        }
    }

    protected void J() {
        block3: {
            Frame frame;
            block2: {
                int[] nArray = y_0.M();
                frame = this.P;
                if (nArray == null) break block2;
                if (frame == null) break block3;
                frame = this.P;
            }
            frame.setExtendedState(0);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean f() {
        boolean bl;
        block5: {
            int[] nArray;
            block4: {
                nArray = y_0.M();
                bl = this.Z();
                if (nArray == null) break block4;
                if (bl) break block5;
                bl = this.u();
            }
            if (nArray != null) {
                if (!bl) return false;
                bl = this.P.isResizable();
            }
            if (nArray == null) return bl;
            if (!bl) return false;
            return true;
        }
        bl = this.j.isResizable();
        return bl;
    }

    protected boolean u() {
        return this.P != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean j() {
        int[] nArray = y_0.M();
        int n10 = this.u();
        if (nArray != null) {
            if (n10 == 0) return 0 != 0;
            n10 = this.B;
        }
        if (nArray == null) return n10 != 0;
        if (n10 != com.A.d.a(2628, 5593412264602878814L)) return 0 != 0;
        return 1 != 0;
    }

    protected boolean Z() {
        return this.j != null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
        block6: {
            block13: {
                block9: {
                    block10: {
                        block11: {
                            block12: {
                                block7: {
                                    block8: {
                                        var3_3 = y_0.M();
                                        if (!this.M) break block6;
                                        var4_4 = (Graphics2D)var1_1;
                                        var5_5 = RV.X(var4_4);
                                        v0 = var6_6 = this.j();
                                        if (var3_3 == null) break block7;
                                        if (v0 == 0) break block8;
                                        var4_4.setPaint(new GradientPaint(0.0f, 0.0f, this.R, 0.0f, 30.0f, this.J));
                                        var4_4.fillRect(0, 0, var2_2.getWidth(), var2_2.getHeight());
                                        var4_4.setPaint(this.r);
                                        var4_4.drawRect(0, 0, var2_2.getWidth() - 1, var2_2.getHeight() - 1);
                                        var4_4.setPaint(this.v);
                                        v1 = var4_4;
                                        if (var3_3 == null) break block9;
                                        v1.drawRect(1, 1, var2_2.getWidth() - 3, var2_2.getHeight() - 3);
                                        if (!this.G) break block10;
                                        var7_7 = RV.n(var4_4, this.Z(var2_2));
                                        var4_4.drawImage(this.l().getImage(), 2, 2, null);
                                        RV.w(var4_4, var7_7);
                                        if (var3_3 != null) break block10;
                                    }
                                    v0 = this.X;
                                }
                                if (var3_3 == null) break block11;
                                if (v0 <= 0) break block12;
                                v2 = this.x(var2_2);
                                if (var3_3 == null) ** GOTO lbl33
                                if (v2 != 0) {
                                    v3 = 0;
                                } else {
                                    v2 = this.X;
lbl33:
                                    // 2 sources

                                    v3 = v2 - this.I;
                                }
                                var7_8 = v3;
                                this.q(var2_2).l(var4_4, var7_8, var7_8, var2_2.getWidth() - var7_8 * 2, var2_2.getHeight() - var7_8 * 2);
                            }
                            var4_4.setPaint(new GradientPaint(0.0f, this.X, this.R, 0.0f, this.X + com.A.d.a(19612, 5294271776300074371L), this.J));
                            var4_4.fillRoundRect(this.X, this.X, var2_2.getWidth() - this.X * 2, var2_2.getHeight() - this.X * 2, this.Y * 2, this.Y * 2);
                            var4_4.setPaint(this.r);
                            var4_4.drawRoundRect(this.X, this.X, var2_2.getWidth() - this.X * 2 - 1, var2_2.getHeight() - this.X * 2 - 1, this.Y * 2 - 2, this.Y * 2 - 2);
                            var4_4.setPaint(this.v);
                            v1 = var4_4;
                            v4 = this;
                            if (var3_3 == null) break block13;
                            v1.drawRoundRect(v4.X + 1, this.X + 1, var2_2.getWidth() - this.X * 2 - 3, var2_2.getHeight() - this.X * 2 - 3, this.Y * 2 - 4, this.Y * 2 - 4);
                            v0 = (int)this.G;
                        }
                        if (v0 != 0) {
                            var7_7 = RV.n(var4_4, this.Z(var2_2));
                            var4_4.drawImage(this.l().getImage(), this.X + 2, this.X + 2, null);
                            RV.w(var4_4, var7_7);
                        }
                    }
                    v1 = var4_4;
                }
                v4 = var5_5;
            }
            RV.X(v1, v4);
        }
    }

    protected RoundRectangle2D.Double Z(JComponent jComponent) {
        return new RoundRectangle2D.Double(this.X + 2, this.X + 2, jComponent.getWidth() - this.X * 2 - 3, jComponent.getHeight() - this.X * 2 - 3, this.Y * 2 - 4, this.Y * 2 - 4);
    }

    protected pf_1 q(JComponent jComponent) {
        block3: {
            int n10;
            block2: {
                int[] nArray = y_0.M();
                n10 = this.X;
                if (nArray == null) break block2;
                if (n10 <= 0) break block3;
                n10 = this.H(jComponent);
            }
            return fk_0.I(n10, this.Y, 0.8f);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected int H(JComponent jComponent) {
        int n10;
        int[] nArray = y_0.M();
        d d2 = this;
        if (nArray != null) {
            if (d2.x(jComponent)) {
                n10 = this.X;
                return n10;
            }
            d2 = this;
        }
        n10 = d2.I;
        return n10;
    }

    protected boolean x(JComponent jComponent) {
        return FN.L(jComponent).isFocused();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[22];
                        var11_1 = 0;
                        var10_2 = "\u00a5\u009a\u00fd\t\u0098\u0016$-h\u00b6D\u00f7R\u00eb\u00fb(\u00ea\u00ffX\u008c\u0081&{\u0097A\u00e6\tv\t.6)\u00d5V\u00d9o/\u0014\u000fp\u00c6\u00e2\u00cb\u0015Xx\u001e\u00be\u0096BY\\\n!\u0005,\u00c9\"\u00d9\u001b\u0005\u00cb\u00e90g!\u0006\u00f8\u00af\u00b4!\u00f6n\u0003\u0018s\u00c0\u0011\u00d9\u00fe\u00d7\u00cc\u00b3\u00b8\u00bd\u000b)\u001b%S\u00ee\u00dc\u00d7\u00cf$\u0019\u00b2*\u00baV\u001e\u00eb\u0017m\u009dG\u000f}\u00f6*\u0007<\u00f0\u00cc\u00c0\u00b8\u009d2\u00db\u0004\u0010\bu\u001e\u00c7\u009c\u008e\u0013\u00cf\u00f0\u0012\u0011\u00a6\u00ce\u00c7\u0090\u00d9\u00c6+\u00a7\u008fHd\u001e\tkI/B\u0015\u00a8\u00c1%j\u00d0\u007fx\u00a0qu!\u00f5\u00c1>\u001e<\u00d5\"B\u007f\u00df\u0018\u00961>5\u008e\u0087\u001a\u00ec\u00dd\u00e7\u00bb\u00cc=^\u00bc\u00cdi\u00ad\u00199\u0011-v{\u0006\n\u00f1\u00c3\u00f1\u0006\u001b\tP\u009b\u00e6`\u00afoP\u00f9\u00f3\u0013\u00f3\u0097\u0092\u00e1\u001b\u001d\u00ad\u00bb\u0089\u0098\u00cb\u000f\u0089\u00f7\u00a4=%P\u0005\u0019\u0017b\u000e_\u0088\u00ca\u00c5A\u00d1\u00cbR\u00ec]\u0018rz^\u0004\u0015\u00a1'\u0011\u008c`\u00fa\b]\u00fb\u00d4)8\u00a5\u0019&\u0012\u0088\u00e5\u00fd\u00af\u00f6\u00d4\n\u0082(\u00b3m\u00e3\u00ba\u00f9\u00ffW\u00bd\u0081";
                        var12_3 = "\u00a5\u009a\u00fd\t\u0098\u0016$-h\u00b6D\u00f7R\u00eb\u00fb(\u00ea\u00ffX\u008c\u0081&{\u0097A\u00e6\tv\t.6)\u00d5V\u00d9o/\u0014\u000fp\u00c6\u00e2\u00cb\u0015Xx\u001e\u00be\u0096BY\\\n!\u0005,\u00c9\"\u00d9\u001b\u0005\u00cb\u00e90g!\u0006\u00f8\u00af\u00b4!\u00f6n\u0003\u0018s\u00c0\u0011\u00d9\u00fe\u00d7\u00cc\u00b3\u00b8\u00bd\u000b)\u001b%S\u00ee\u00dc\u00d7\u00cf$\u0019\u00b2*\u00baV\u001e\u00eb\u0017m\u009dG\u000f}\u00f6*\u0007<\u00f0\u00cc\u00c0\u00b8\u009d2\u00db\u0004\u0010\bu\u001e\u00c7\u009c\u008e\u0013\u00cf\u00f0\u0012\u0011\u00a6\u00ce\u00c7\u0090\u00d9\u00c6+\u00a7\u008fHd\u001e\tkI/B\u0015\u00a8\u00c1%j\u00d0\u007fx\u00a0qu!\u00f5\u00c1>\u001e<\u00d5\"B\u007f\u00df\u0018\u00961>5\u008e\u0087\u001a\u00ec\u00dd\u00e7\u00bb\u00cc=^\u00bc\u00cdi\u00ad\u00199\u0011-v{\u0006\n\u00f1\u00c3\u00f1\u0006\u001b\tP\u009b\u00e6`\u00afoP\u00f9\u00f3\u0013\u00f3\u0097\u0092\u00e1\u001b\u001d\u00ad\u00bb\u0089\u0098\u00cb\u000f\u0089\u00f7\u00a4=%P\u0005\u0019\u0017b\u000e_\u0088\u00ca\u00c5A\u00d1\u00cbR\u00ec]\u0018rz^\u0004\u0015\u00a1'\u0011\u008c`\u00fa\b]\u00fb\u00d4)8\u00a5\u0019&\u0012\u0088\u00e5\u00fd\u00af\u00f6\u00d4\n\u0082(\u00b3m\u00e3\u00ba\u00f9\u00ffW\u00bd\u0081".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 92;
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
                            var10_2 = "\u00d6$=9\u0017\u00c0~\u00e5:\t<=`\u001a\u00bc\u00a4\u000bi\u0094";
                            var12_3 = "\u00d6$=9\u0017\u00c0~\u00e5:\t<=`\u001a\u00bc\u00a4\u000bi\u0094".length();
                            var9_4 = 9;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 118;
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
                                    v15 = 11;
                                    break;
                                }
                                case 1: {
                                    v15 = 109;
                                    break;
                                }
                                case 2: {
                                    v15 = 113;
                                    break;
                                }
                                case 3: {
                                    v15 = 8;
                                    break;
                                }
                                case 4: {
                                    v15 = 65;
                                    break;
                                }
                                case 5: {
                                    v15 = 123;
                                    break;
                                }
                                default: {
                                    v15 = 91;
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
                com.A.d.b = var13;
                com.A.d.c = new String[22];
                var0_7 = 9018354052923249198L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = "\u0087Tx\u0096\u008f{Yz\u0016`\u008c\u00b5\u008d\u008f\u00d7\u00b3q\\\u00bc\u00f4\u00a1\u00957\u0082\u0011\u0002W\u00b5\u00a5.\u00f4ji|\u009bt\u001e\u00c6\u0011vq/v\u00c0-~Z,";
                var5_11 = "\u0087Tx\u0096\u008f{Yz\u0016`\u008c\u00b5\u008d\u008f\u00d7\u00b3q\\\u00bc\u00f4\u00a1\u00957\u0082\u0011\u0002W\u00b5\u00a5.\u00f4ji|\u009bt\u001e\u00c6\u0011vq/v\u00c0-~Z,".length();
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
                    var4_10 = "\u008b:N\u00a36\u0098\u00a2N\u00b2\u009a\u001ac\u001a\u0096\u00e2,";
                    var5_11 = "\u008b:N\u00a36\u0098\u00a2N\u00b2\u009a\u001ac\u001a\u0096\u00e2,".length();
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
        com.A.d.d = var6_8;
        com.A.d.e = new Integer[8];
        com.A.d.U = new ImageIcon(d.class.getResource(com.A.d.a(-27691, -12277)));
        com.A.d.m = new ImageIcon(d.class.getResource(com.A.d.a(-27689, -7177)));
        com.A.d.i = new ImageIcon(d.class.getResource(com.A.d.a(-27699, -32641)));
        com.A.d.w = new ImageIcon(d.class.getResource(com.A.d.a(-27697, -2321)));
        com.A.d.K = new ImageIcon(d.class.getResource(com.A.d.a(-27690, -20759)));
        com.A.d.H = new ImageIcon(d.class.getResource(com.A.d.a(-27693, -5842)));
        com.A.d.o = new ImageIcon(d.class.getResource(com.A.d.a(-27683, -15748)));
        com.A.d.Z = new ImageIcon(d.class.getResource(com.A.d.a(-27681, 2725)));
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF93DE) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 6;
                    break;
                }
                case 1: {
                    n14 = 174;
                    break;
                }
                case 2: {
                    n14 = 214;
                    break;
                }
                case 3: {
                    n14 = 159;
                    break;
                }
                case 4: {
                    n14 = 179;
                    break;
                }
                case 5: {
                    n14 = 233;
                    break;
                }
                case 6: {
                    n14 = 110;
                    break;
                }
                case 7: {
                    n14 = 83;
                    break;
                }
                case 8: {
                    n14 = 5;
                    break;
                }
                case 9: {
                    n14 = 158;
                    break;
                }
                case 10: {
                    n14 = 123;
                    break;
                }
                case 11: {
                    n14 = 19;
                    break;
                }
                case 12: {
                    n14 = 58;
                    break;
                }
                case 13: {
                    n14 = 118;
                    break;
                }
                case 14: {
                    n14 = 38;
                    break;
                }
                case 15: {
                    n14 = 183;
                    break;
                }
                case 16: {
                    n14 = 15;
                    break;
                }
                case 17: {
                    n14 = 148;
                    break;
                }
                case 18: {
                    n14 = 242;
                    break;
                }
                case 19: {
                    n14 = 8;
                    break;
                }
                case 20: {
                    n14 = 203;
                    break;
                }
                case 21: {
                    n14 = 61;
                    break;
                }
                case 22: {
                    n14 = 193;
                    break;
                }
                case 23: {
                    n14 = 74;
                    break;
                }
                case 24: {
                    n14 = 145;
                    break;
                }
                case 25: {
                    n14 = 52;
                    break;
                }
                case 26: {
                    n14 = 173;
                    break;
                }
                case 27: {
                    n14 = 164;
                    break;
                }
                case 28: {
                    n14 = 154;
                    break;
                }
                case 29: {
                    n14 = 234;
                    break;
                }
                case 30: {
                    n14 = 207;
                    break;
                }
                case 31: {
                    n14 = 11;
                    break;
                }
                case 32: {
                    n14 = 100;
                    break;
                }
                case 33: {
                    n14 = 240;
                    break;
                }
                case 34: {
                    n14 = 76;
                    break;
                }
                case 35: {
                    n14 = 70;
                    break;
                }
                case 36: {
                    n14 = 92;
                    break;
                }
                case 37: {
                    n14 = 78;
                    break;
                }
                case 38: {
                    n14 = 157;
                    break;
                }
                case 39: {
                    n14 = 46;
                    break;
                }
                case 40: {
                    n14 = 147;
                    break;
                }
                case 41: {
                    n14 = 105;
                    break;
                }
                case 42: {
                    n14 = 195;
                    break;
                }
                case 43: {
                    n14 = 71;
                    break;
                }
                case 44: {
                    n14 = 16;
                    break;
                }
                case 45: {
                    n14 = 14;
                    break;
                }
                case 46: {
                    n14 = 128;
                    break;
                }
                case 47: {
                    n14 = 75;
                    break;
                }
                case 48: {
                    n14 = 185;
                    break;
                }
                case 49: {
                    n14 = 86;
                    break;
                }
                case 50: {
                    n14 = 66;
                    break;
                }
                case 51: {
                    n14 = 57;
                    break;
                }
                case 52: {
                    n14 = 18;
                    break;
                }
                case 53: {
                    n14 = 204;
                    break;
                }
                case 54: {
                    n14 = 77;
                    break;
                }
                case 55: {
                    n14 = 146;
                    break;
                }
                case 56: {
                    n14 = 9;
                    break;
                }
                case 57: {
                    n14 = 227;
                    break;
                }
                case 58: {
                    n14 = 20;
                    break;
                }
                case 59: {
                    n14 = 104;
                    break;
                }
                case 60: {
                    n14 = 160;
                    break;
                }
                case 61: {
                    n14 = 67;
                    break;
                }
                case 62: {
                    n14 = 35;
                    break;
                }
                case 63: {
                    n14 = 137;
                    break;
                }
                case 64: {
                    n14 = 198;
                    break;
                }
                case 65: {
                    n14 = 12;
                    break;
                }
                case 66: {
                    n14 = 43;
                    break;
                }
                case 67: {
                    n14 = 248;
                    break;
                }
                case 68: {
                    n14 = 23;
                    break;
                }
                case 69: {
                    n14 = 225;
                    break;
                }
                case 70: {
                    n14 = 220;
                    break;
                }
                case 71: {
                    n14 = 34;
                    break;
                }
                case 72: {
                    n14 = 255;
                    break;
                }
                case 73: {
                    n14 = 253;
                    break;
                }
                case 74: {
                    n14 = 129;
                    break;
                }
                case 75: {
                    n14 = 133;
                    break;
                }
                case 76: {
                    n14 = 163;
                    break;
                }
                case 77: {
                    n14 = 135;
                    break;
                }
                case 78: {
                    n14 = 213;
                    break;
                }
                case 79: {
                    n14 = 167;
                    break;
                }
                case 80: {
                    n14 = 3;
                    break;
                }
                case 81: {
                    n14 = 210;
                    break;
                }
                case 82: {
                    n14 = 117;
                    break;
                }
                case 83: {
                    n14 = 136;
                    break;
                }
                case 84: {
                    n14 = 194;
                    break;
                }
                case 85: {
                    n14 = 27;
                    break;
                }
                case 86: {
                    n14 = 94;
                    break;
                }
                case 87: {
                    n14 = 249;
                    break;
                }
                case 88: {
                    n14 = 218;
                    break;
                }
                case 89: {
                    n14 = 37;
                    break;
                }
                case 90: {
                    n14 = 127;
                    break;
                }
                case 91: {
                    n14 = 188;
                    break;
                }
                case 92: {
                    n14 = 228;
                    break;
                }
                case 93: {
                    n14 = 93;
                    break;
                }
                case 94: {
                    n14 = 113;
                    break;
                }
                case 95: {
                    n14 = 25;
                    break;
                }
                case 96: {
                    n14 = 181;
                    break;
                }
                case 97: {
                    n14 = 226;
                    break;
                }
                case 98: {
                    n14 = 239;
                    break;
                }
                case 99: {
                    n14 = 144;
                    break;
                }
                case 100: {
                    n14 = 138;
                    break;
                }
                case 101: {
                    n14 = 151;
                    break;
                }
                case 102: {
                    n14 = 124;
                    break;
                }
                case 103: {
                    n14 = 101;
                    break;
                }
                case 104: {
                    n14 = 176;
                    break;
                }
                case 105: {
                    n14 = 246;
                    break;
                }
                case 106: {
                    n14 = 162;
                    break;
                }
                case 107: {
                    n14 = 85;
                    break;
                }
                case 108: {
                    n14 = 91;
                    break;
                }
                case 109: {
                    n14 = 155;
                    break;
                }
                case 110: {
                    n14 = 31;
                    break;
                }
                case 111: {
                    n14 = 96;
                    break;
                }
                case 112: {
                    n14 = 39;
                    break;
                }
                case 113: {
                    n14 = 73;
                    break;
                }
                case 114: {
                    n14 = 252;
                    break;
                }
                case 115: {
                    n14 = 139;
                    break;
                }
                case 116: {
                    n14 = 202;
                    break;
                }
                case 117: {
                    n14 = 69;
                    break;
                }
                case 118: {
                    n14 = 4;
                    break;
                }
                case 119: {
                    n14 = 87;
                    break;
                }
                case 120: {
                    n14 = 189;
                    break;
                }
                case 121: {
                    n14 = 48;
                    break;
                }
                case 122: {
                    n14 = 79;
                    break;
                }
                case 123: {
                    n14 = 180;
                    break;
                }
                case 124: {
                    n14 = 232;
                    break;
                }
                case 125: {
                    n14 = 216;
                    break;
                }
                case 126: {
                    n14 = 29;
                    break;
                }
                case 127: {
                    n14 = 190;
                    break;
                }
                case 128: {
                    n14 = 55;
                    break;
                }
                case 129: {
                    n14 = 231;
                    break;
                }
                case 130: {
                    n14 = 22;
                    break;
                }
                case 131: {
                    n14 = 168;
                    break;
                }
                case 132: {
                    n14 = 63;
                    break;
                }
                case 133: {
                    n14 = 7;
                    break;
                }
                case 134: {
                    n14 = 230;
                    break;
                }
                case 135: {
                    n14 = 72;
                    break;
                }
                case 136: {
                    n14 = 116;
                    break;
                }
                case 137: {
                    n14 = 95;
                    break;
                }
                case 138: {
                    n14 = 51;
                    break;
                }
                case 139: {
                    n14 = 142;
                    break;
                }
                case 140: {
                    n14 = 219;
                    break;
                }
                case 141: {
                    n14 = 224;
                    break;
                }
                case 142: {
                    n14 = 2;
                    break;
                }
                case 143: {
                    n14 = 212;
                    break;
                }
                case 144: {
                    n14 = 112;
                    break;
                }
                case 145: {
                    n14 = 186;
                    break;
                }
                case 146: {
                    n14 = 140;
                    break;
                }
                case 147: {
                    n14 = 0;
                    break;
                }
                case 148: {
                    n14 = 88;
                    break;
                }
                case 149: {
                    n14 = 98;
                    break;
                }
                case 150: {
                    n14 = 80;
                    break;
                }
                case 151: {
                    n14 = 250;
                    break;
                }
                case 152: {
                    n14 = 54;
                    break;
                }
                case 153: {
                    n14 = 200;
                    break;
                }
                case 154: {
                    n14 = 192;
                    break;
                }
                case 155: {
                    n14 = 229;
                    break;
                }
                case 156: {
                    n14 = 115;
                    break;
                }
                case 157: {
                    n14 = 205;
                    break;
                }
                case 158: {
                    n14 = 130;
                    break;
                }
                case 159: {
                    n14 = 42;
                    break;
                }
                case 160: {
                    n14 = 172;
                    break;
                }
                case 161: {
                    n14 = 221;
                    break;
                }
                case 162: {
                    n14 = 41;
                    break;
                }
                case 163: {
                    n14 = 33;
                    break;
                }
                case 164: {
                    n14 = 30;
                    break;
                }
                case 165: {
                    n14 = 177;
                    break;
                }
                case 166: {
                    n14 = 56;
                    break;
                }
                case 167: {
                    n14 = 103;
                    break;
                }
                case 168: {
                    n14 = 215;
                    break;
                }
                case 169: {
                    n14 = 165;
                    break;
                }
                case 170: {
                    n14 = 53;
                    break;
                }
                case 171: {
                    n14 = 1;
                    break;
                }
                case 172: {
                    n14 = 245;
                    break;
                }
                case 173: {
                    n14 = 32;
                    break;
                }
                case 174: {
                    n14 = 217;
                    break;
                }
                case 175: {
                    n14 = 102;
                    break;
                }
                case 176: {
                    n14 = 24;
                    break;
                }
                case 177: {
                    n14 = 64;
                    break;
                }
                case 178: {
                    n14 = 60;
                    break;
                }
                case 179: {
                    n14 = 90;
                    break;
                }
                case 180: {
                    n14 = 236;
                    break;
                }
                case 181: {
                    n14 = 182;
                    break;
                }
                case 182: {
                    n14 = 243;
                    break;
                }
                case 183: {
                    n14 = 119;
                    break;
                }
                case 184: {
                    n14 = 156;
                    break;
                }
                case 185: {
                    n14 = 254;
                    break;
                }
                case 186: {
                    n14 = 191;
                    break;
                }
                case 187: {
                    n14 = 178;
                    break;
                }
                case 188: {
                    n14 = 131;
                    break;
                }
                case 189: {
                    n14 = 28;
                    break;
                }
                case 190: {
                    n14 = 184;
                    break;
                }
                case 191: {
                    n14 = 132;
                    break;
                }
                case 192: {
                    n14 = 84;
                    break;
                }
                case 193: {
                    n14 = 134;
                    break;
                }
                case 194: {
                    n14 = 59;
                    break;
                }
                case 195: {
                    n14 = 251;
                    break;
                }
                case 196: {
                    n14 = 26;
                    break;
                }
                case 197: {
                    n14 = 36;
                    break;
                }
                case 198: {
                    n14 = 17;
                    break;
                }
                case 199: {
                    n14 = 161;
                    break;
                }
                case 200: {
                    n14 = 121;
                    break;
                }
                case 201: {
                    n14 = 49;
                    break;
                }
                case 202: {
                    n14 = 222;
                    break;
                }
                case 203: {
                    n14 = 208;
                    break;
                }
                case 204: {
                    n14 = 109;
                    break;
                }
                case 205: {
                    n14 = 187;
                    break;
                }
                case 206: {
                    n14 = 111;
                    break;
                }
                case 207: {
                    n14 = 108;
                    break;
                }
                case 208: {
                    n14 = 47;
                    break;
                }
                case 209: {
                    n14 = 152;
                    break;
                }
                case 210: {
                    n14 = 10;
                    break;
                }
                case 211: {
                    n14 = 247;
                    break;
                }
                case 212: {
                    n14 = 237;
                    break;
                }
                case 213: {
                    n14 = 169;
                    break;
                }
                case 214: {
                    n14 = 197;
                    break;
                }
                case 215: {
                    n14 = 143;
                    break;
                }
                case 216: {
                    n14 = 244;
                    break;
                }
                case 217: {
                    n14 = 141;
                    break;
                }
                case 218: {
                    n14 = 106;
                    break;
                }
                case 219: {
                    n14 = 45;
                    break;
                }
                case 220: {
                    n14 = 153;
                    break;
                }
                case 221: {
                    n14 = 126;
                    break;
                }
                case 222: {
                    n14 = 170;
                    break;
                }
                case 223: {
                    n14 = 201;
                    break;
                }
                case 224: {
                    n14 = 125;
                    break;
                }
                case 225: {
                    n14 = 120;
                    break;
                }
                case 226: {
                    n14 = 206;
                    break;
                }
                case 227: {
                    n14 = 166;
                    break;
                }
                case 228: {
                    n14 = 50;
                    break;
                }
                case 229: {
                    n14 = 107;
                    break;
                }
                case 230: {
                    n14 = 40;
                    break;
                }
                case 231: {
                    n14 = 209;
                    break;
                }
                case 232: {
                    n14 = 171;
                    break;
                }
                case 233: {
                    n14 = 13;
                    break;
                }
                case 234: {
                    n14 = 149;
                    break;
                }
                case 235: {
                    n14 = 235;
                    break;
                }
                case 236: {
                    n14 = 199;
                    break;
                }
                case 237: {
                    n14 = 114;
                    break;
                }
                case 238: {
                    n14 = 68;
                    break;
                }
                case 239: {
                    n14 = 65;
                    break;
                }
                case 240: {
                    n14 = 21;
                    break;
                }
                case 241: {
                    n14 = 211;
                    break;
                }
                case 242: {
                    n14 = 97;
                    break;
                }
                case 243: {
                    n14 = 44;
                    break;
                }
                case 244: {
                    n14 = 82;
                    break;
                }
                case 245: {
                    n14 = 196;
                    break;
                }
                case 246: {
                    n14 = 62;
                    break;
                }
                case 247: {
                    n14 = 223;
                    break;
                }
                case 248: {
                    n14 = 122;
                    break;
                }
                case 249: {
                    n14 = 241;
                    break;
                }
                case 250: {
                    n14 = 238;
                    break;
                }
                case 251: {
                    n14 = 89;
                    break;
                }
                case 252: {
                    n14 = 81;
                    break;
                }
                case 253: {
                    n14 = 150;
                    break;
                }
                case 254: {
                    n14 = 99;
                    break;
                }
                default: {
                    n14 = 175;
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
            com.A.d.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x491E;
        if (e[n11] == null) {
            com.A.d.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

