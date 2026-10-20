/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B1;
import com.C.M;
import com.C.N;
import com.C0;
import com.D7;
import com.DL;
import com.E;
import com.E2;
import com.FG;
import com.FN;
import com.R7;
import com.RZ;
import com.TF;
import com.a.y_0;
import com.aL;
import com.fa_0;
import com.fs_0;
import com.hm_0;
import com.kt_2;
import com.ky_2;
import com.l__0;
import com.lr_2;
import com.lt_1;
import com.ng_2;
import com.nq_2;
import com.ox_2;
import com.ry_0;
import com.wm_2;
import com.wy_0;
import com.xh_2;
import com.xk_0;
import com.yr_1;
import com.yt_1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Ds
 */
public class ds_0
extends y_0
implements D7,
lt_1 {
    protected boolean v = E2.c;
    protected xh_2 s = E2.G;
    protected ky_2 o;
    protected boolean r = false;
    protected B1 G = null;
    protected B1 I = null;
    protected nq_2 n = null;
    protected List Q = new ArrayList(1);
    private static int[] g;
    private static final String[] b;
    private static final String[] c;

    public ds_0() {
    }

    public ds_0(Frame frame) {
        super(frame);
    }

    public ds_0(Frame frame, String string) {
        super(frame, string);
    }

    public ds_0(Dialog dialog) {
        super(dialog);
    }

    public ds_0(Dialog dialog, String string) {
        super(dialog, string);
    }

    public ds_0(Component component) {
        super(component);
    }

    public ds_0(Component component, String string) {
        super(component, string);
    }

    public ds_0(Window window) {
        super(window);
    }

    public ds_0(Window window, String string) {
        super(window, string);
    }

    @Override
    protected void j() {
        EventListener eventListener;
        block5: {
            boolean bl;
            block4: {
                super.j();
                this.getRootPane().setWindowDecorationStyle(0);
                this.setUndecorated(true);
                int[] nArray = ds_0.U();
                this.Z(false);
                this.o = new ky_2();
                this.o.S(ds_0.a(-14040, 6571));
                this.setContentPane(this.o);
                int[] nArray2 = nArray;
                bl = xk_0.R();
                if (nArray2 != null) break block4;
                if (bl) break block5;
                bl = xk_0.d();
            }
            if (bl) {
                eventListener = new l__0(this);
                this.addComponentListener((ComponentListener)eventListener);
            }
        }
        eventListener = new hm_0(this);
        this.o.addMouseListener((MouseListener)eventListener);
        this.o.addMouseMotionListener((MouseMotionListener)eventListener);
        this.addWindowFocusListener(new yt_1(this));
        wm_2 wm_22 = new wm_2(this);
        this.addComponentListener(wm_22);
        this.addWindowListener(wm_22);
    }

    @Override
    public String A() {
        return this.o.A();
    }

    @Override
    public void S(String string) {
        this.o.S(string);
    }

    public void t(Color color) {
        this.o.setBackground(color);
    }

    public Color v() {
        return this.o.getBackground();
    }

    public Insets F() {
        return this.o.O();
    }

    public ds_0 S(Insets insets) {
        this.o.b(insets);
        return this;
    }

    public ds_0 A(int n10, int n11, int n12, int n13) {
        this.o.N(n10, n11, n12, n13);
        return this;
    }

    public ds_0 B(int n10) {
        this.o.C(n10);
        return this;
    }

    public N g() {
        return (N)this.o.l();
    }

    public void r(N n10) {
        this.o.L(n10);
    }

    public boolean j() {
        return this.v;
    }

    public void Q(boolean bl) {
        this.v = bl;
    }

    public xh_2 V() {
        return this.s;
    }

    public void J(xh_2 xh_22) {
        this.s = xh_22;
    }

    public Color B() {
        return this.g().o();
    }

    public void J(Color color) {
        ox_2.E(this.o, ds_0.a(-14048, -13795), color);
    }

    @Override
    public int S() {
        return this.g().U();
    }

    @Override
    public void U(int n10) {
        ox_2.E(this.o, ds_0.a(-14039, -12912), n10);
    }

    @Override
    public int G() {
        return this.g().j();
    }

    @Override
    public void L(int n10) {
        ox_2.E(this.o, ds_0.a(-14033, -1438), n10);
    }

    public float d() {
        return this.g().A();
    }

    public void C(float f10) {
        ox_2.E(this.o, ds_0.a(-14045, -32285), Float.valueOf(f10));
    }

    public int e() {
        return this.g().h();
    }

    public void f(int n10) {
        ox_2.E(this.o, ds_0.a(-14047, 10559), n10);
    }

    public float m() {
        return this.g().P();
    }

    public void v(float f10) {
        ox_2.E(this.o, ds_0.a(-14034, 18833), Float.valueOf(f10));
    }

    protected M Q() {
        return this.g().M();
    }

    protected void e(M m10) {
        ox_2.E(this.o, ds_0.a(-14035, -19132), (Object)m10);
    }

    protected int f() {
        return this.g().I();
    }

    protected void x(int n10) {
        ox_2.E(this.o, ds_0.a(-14038, -31209), n10);
    }

    protected int r() {
        return this.g().i();
    }

    protected void M(int n10) {
        ox_2.E(this.o, ds_0.a(-14037, -19018), n10);
    }

    protected int B() {
        return this.g().B();
    }

    protected void l(int n10) {
        ox_2.E(this.o, ds_0.a(-14036, 2596), n10);
    }

    public boolean r() {
        return this.g().G();
    }

    public void P(boolean bl) {
        ox_2.E(this.o, ds_0.a(-14043, -28901), bl);
    }

    public ds_0 g(yr_1 yr_12) {
        this.r = false;
        this.G = null;
        int[] nArray = ds_0.U();
        this.e(M.simple);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.pack();
        if (nArray == null) {
            switch (FG.V[yr_12.ordinal()]) {
                case 1: {
                    this.setLocation(dimension.width / 2 - this.getWidth() / 2, dimension.height / 2 - this.getHeight() / 2);
                    if (nArray == null) break;
                }
                case 2: {
                    this.setLocation(0, 0);
                    if (nArray == null) break;
                }
                case 3: {
                    this.setLocation(dimension.width - this.getWidth(), 0);
                    if (nArray == null) break;
                }
                case 4: {
                    this.setLocation(0, dimension.height - this.getHeight());
                    if (nArray == null) break;
                }
                case 5: {
                    this.setLocation(dimension.width - this.getWidth(), dimension.height - this.getHeight());
                    if (nArray == null) break;
                }
                case 6: {
                    this.setLocation(dimension.width / 2 - this.getWidth() / 2, 0);
                    if (nArray == null) break;
                }
                case 7: {
                    this.setLocation(dimension.width / 2 - this.getWidth() / 2, dimension.height - this.getHeight());
                    if (nArray == null) break;
                }
                case 8: {
                    this.setLocation(0, dimension.height / 2 - this.getHeight() / 2);
                    if (nArray == null) break;
                }
                case 9: {
                    this.setLocation(dimension.width - this.getWidth(), dimension.height / 2 - this.getHeight() / 2);
                }
            }
            this.setVisible(true);
        }
        return this;
    }

    public ds_0 u(Point point) {
        return this.Y(point.x, point.y);
    }

    public ds_0 Y(int n10, int n11) {
        this.r = false;
        this.G = null;
        this.e(M.simple);
        this.pack();
        this.setLocation(n10 - this.G(), n11 - this.G());
        this.setVisible(true);
        return this;
    }

    public ds_0 O(Component component) {
        return this.d(component, this.G);
    }

    public ds_0 d(Component component, B1 b1) {
        return this.I(component, b1, nq_2.centered);
    }

    public ds_0 I(Component component, B1 b1, nq_2 nq_22) {
        return this.J(component, null, b1, nq_22);
    }

    public ds_0 S(Component component, int n10, int n11) {
        return this.H(component, n10, n11, this.G);
    }

    public ds_0 H(Component component, int n10, int n11, B1 b1) {
        return this.Z(component, n10, n11, b1, nq_2.centered);
    }

    public ds_0 Z(Component component, int n10, int n11, B1 b1, nq_2 nq_22) {
        return this.F(component, n10, n11, 0, 0, b1, nq_22);
    }

    public ds_0 M(Component component, int n10, int n11, int n12, int n13) {
        return this.c(component, n10, n11, n12, n13, this.G);
    }

    public ds_0 c(Component component, int n10, int n11, int n12, int n13, B1 b1) {
        return this.F(component, n10, n11, n12, n13, b1, nq_2.centered);
    }

    public ds_0 F(Component component, int n10, int n11, int n12, int n13, B1 b1, nq_2 nq_22) {
        Rectangle rectangle = new Rectangle(n10, n11, n12, n13);
        return this.J(component, new lr_2(this, rectangle), b1, nq_22);
    }

    public ds_0 g(Component component, E e2) {
        return this.w(component, e2, this.G);
    }

    public ds_0 w(Component component, E e2, B1 b1) {
        return this.J(component, e2, b1, nq_2.centered);
    }

    public ds_0 J(Component component, E e2, B1 b1, nq_2 nq_22) {
        int[] nArray;
        block5: {
            ds_0 ds_02;
            block4: {
                nArray = ds_0.U();
                ds_02 = this;
                if (nArray != null) break block4;
                if (!ds_02.isShowing()) break block5;
                ds_02 = this;
            }
            ds_02.Q();
        }
        TF tF = e2 == null ? null : new TF(this, component, e2);
        this.r = true;
        B1 b12 = b1;
        if (nArray == null) {
            b12 = b12 != null ? b1 : B1.down;
        }
        this.G = b12;
        this.n = nq_22;
        this.pack();
        this.F(component, tF);
        this.N(component, tF);
        this.setVisible(true);
        this.J();
        return this;
    }

    protected void F(Component component, E e2) {
        block4: {
            block3: {
                int[] nArray;
                block2: {
                    nArray = ds_0.U();
                    if (nArray != null) break block2;
                    if (e2 == null) break block3;
                    this.R((Rectangle)e2.J());
                }
                if (nArray == null) break block4;
            }
            this.L(component);
        }
    }

    protected void L(Component component) {
        block6: {
            boolean bl;
            block4: {
                block5: {
                    int[] nArray = ds_0.U();
                    bl = component instanceof Window;
                    if (nArray != null) break block4;
                    if (!bl) break block5;
                    this.e(M.simple);
                    Rectangle rectangle = component.getBounds();
                    Dimension dimension = this.getSize();
                    this.I = null;
                    this.setLocation(rectangle.x + rectangle.width / 2 - dimension.width / 2, rectangle.y + rectangle.height / 2 - dimension.height / 2);
                    if (nArray == null) break block6;
                }
                bl = component.isShowing();
            }
            if (bl) {
                this.R(FN.f(component));
            }
        }
    }

    protected void R(Rectangle rectangle) {
        this.e(M.dropdown);
        Dimension dimension = this.getSize();
        int n10 = this.G();
        int n11 = this.S();
        int[] nArray = ds_0.U();
        int n12 = this.e();
        Dimension dimension2 = new Dimension(dimension.width - n10 * 2, dimension.height - n10 * 2);
        Rectangle rectangle2 = this.getGraphicsConfiguration().getBounds();
        boolean bl = this.getComponentOrientation().isLeftToRight();
        B1 b1 = this.Z(rectangle, bl, n12, dimension2, rectangle2);
        this.x(b1.m(bl));
        this.I = b1;
        Point point = this.D(rectangle, bl, n11, n12, dimension2, rectangle2, b1);
        point.x -= n10;
        point.y -= n10;
        this.l(-1);
        this.M(this.W(rectangle, b1, point));
        this.setLocation(point);
        if (ky_2.F() != null) {
            ds_0.Z(new int[3]);
        }
    }

    protected void N(Component component, E e2) {
        fa_0 fa_02;
        ng_2 ng_22;
        wy_0 wy_02;
        RZ rZ;
        Window window;
        block3: {
            block2: {
                window = FN.L(component);
                rZ = new RZ(this, this, window);
                window.addComponentListener(rZ);
                wy_02 = new wy_0(this, component, e2, rZ);
                window.addComponentListener(wy_02);
                ng_22 = new ng_2(this, component, e2, rZ);
                int[] nArray = ds_0.U();
                component.addComponentListener(ng_22);
                if (!(component instanceof JComponent)) break block2;
                fa_02 = new fa_0(this, component, e2, rZ);
                ((JComponent)component).addAncestorListener(fa_02);
                if (nArray == null) break block3;
            }
            fa_02 = null;
        }
        DL dL = new DL(this, component, e2, rZ);
        this.addPropertyChangeListener(ds_0.a(-14046, -27750), dL);
        this.D(new ry_0(this, window, wy_02, rZ, component, ng_22, fa_02, dL));
    }

    protected int W(Rectangle rectangle, B1 b1, Point point) {
        int[] nArray = ds_0.U();
        int n10 = FG.L[b1.ordinal()];
        if (nArray == null) {
            switch (n10) {
                case 1: 
                case 2: {
                    return rectangle.x + rectangle.width / 2 - point.x;
                }
                case 3: 
                case 4: {
                    return rectangle.y + rectangle.height / 2 - point.y;
                }
            }
            n10 = -1;
        }
        return n10;
    }

    protected Point D(Rectangle rectangle, boolean bl, int n10, int n11, Dimension dimension, Rectangle rectangle2, B1 b1) {
        block24: {
            ds_0 ds_02;
            Point point;
            block31: {
                nq_2 nq_22;
                nq_2 nq_23;
                block30: {
                    int[] nArray;
                    block27: {
                        ds_0 ds_03;
                        block29: {
                            nq_2 nq_24;
                            nq_2 nq_25;
                            block28: {
                                B1 b12;
                                block25: {
                                    block26: {
                                        B1 b13;
                                        block22: {
                                            block23: {
                                                point = this.p(rectangle, bl, b1);
                                                nArray = ds_0.U();
                                                b12 = b1;
                                                b13 = B1.up;
                                                if (nArray != null) break block22;
                                                if (b12 != b13) break block23;
                                                nq_2 nq_26 = this.n;
                                                if (nArray == null) {
                                                    if (nq_26 == nq_2.centered) {
                                                        Point point2 = new Point(point.x - dimension.width / 2, point.y - n11 - dimension.height);
                                                        return this.i(this.z(point2, rectangle2), dimension, rectangle2);
                                                    }
                                                    nq_26 = this.n;
                                                }
                                                if (nq_26 == (bl ? nq_2.leading : nq_2.trailing)) {
                                                    return this.z(new Point(point.x + n11 * 2 + n10 - dimension.width, point.y - n11 - dimension.height), rectangle2);
                                                }
                                                if (this.n == (bl ? nq_2.trailing : nq_2.leading)) {
                                                    return this.i(new Point(point.x - n11 * 2 - n10, point.y - n11 - dimension.height), dimension, rectangle2);
                                                }
                                                break block24;
                                            }
                                            b12 = b1;
                                            if (nArray != null) break block25;
                                            b13 = B1.down;
                                        }
                                        if (b12 != b13) break block26;
                                        nq_2 nq_27 = this.n;
                                        if (nArray == null) {
                                            if (nq_27 == nq_2.centered) {
                                                Point point3 = new Point(point.x - dimension.width / 2, point.y + n11);
                                                return this.i(this.z(point3, rectangle2), dimension, rectangle2);
                                            }
                                            nq_27 = this.n;
                                        }
                                        if (nq_27 == (bl ? nq_2.leading : nq_2.trailing)) {
                                            return this.z(new Point(point.x + n11 * 2 + n10 - dimension.width, point.y + n11), rectangle2);
                                        }
                                        if (this.n == (bl ? nq_2.trailing : nq_2.leading)) {
                                            return this.i(new Point(point.x - n11 * 2 - n10, point.y + n11), dimension, rectangle2);
                                        }
                                        break block24;
                                    }
                                    b12 = b1;
                                }
                                if (b12 != (bl ? B1.left : B1.right)) break block27;
                                nq_25 = this.n;
                                nq_24 = nq_2.centered;
                                if (nArray == null) {
                                    if (nq_25 == nq_24) {
                                        Point point4 = new Point(point.x - n11 - dimension.width, point.y - dimension.height / 2);
                                        return this.B(this.k(point4, rectangle2), dimension, rectangle2);
                                    }
                                    nq_25 = this.n;
                                    nq_24 = nq_2.leading;
                                }
                                if (nArray != null) break block28;
                                if (nq_25 == nq_24) {
                                    return this.k(new Point(point.x - n11 - dimension.width, point.y + n11 * 2 + n10 - dimension.height), rectangle2);
                                }
                                ds_03 = this;
                                if (nArray != null) break block29;
                                nq_25 = ds_03.n;
                                nq_24 = nq_2.trailing;
                            }
                            if (nq_25 != nq_24) break block24;
                            ds_03 = this;
                        }
                        return ds_03.B(new Point(point.x - n11 - dimension.width, point.y - n11 * 2 - n10), dimension, rectangle2);
                    }
                    if (b1 != (bl ? B1.right : B1.left)) break block24;
                    nq_23 = this.n;
                    nq_22 = nq_2.centered;
                    if (nArray == null) {
                        if (nq_23 == nq_22) {
                            Point point5 = new Point(point.x + n11, point.y - dimension.height / 2);
                            return this.B(this.k(point5, rectangle2), dimension, rectangle2);
                        }
                        nq_23 = this.n;
                        nq_22 = nq_2.leading;
                    }
                    if (nArray != null) break block30;
                    if (nq_23 == nq_22) {
                        return this.k(new Point(point.x + n11, point.y + n11 * 2 + n10 - dimension.height), rectangle2);
                    }
                    ds_02 = this;
                    if (nArray != null) break block31;
                    nq_23 = ds_02.n;
                    nq_22 = nq_2.trailing;
                }
                if (nq_23 != nq_22) break block24;
                ds_02 = this;
            }
            return ds_02.B(new Point(point.x + n11, point.y - n11 * 2 - n10), dimension, rectangle2);
        }
        return null;
    }

    protected Point k(Point point, Rectangle rectangle) {
        int[] nArray = ds_0.U();
        Point point2 = point;
        if (nArray == null) {
            if (point2.y < rectangle.y) {
                point.y = rectangle.y;
            }
            point2 = point;
        }
        return point2;
    }

    protected Point B(Point point, Dimension dimension, Rectangle rectangle) {
        int[] nArray = ds_0.U();
        Point point2 = point;
        if (nArray == null) {
            if (point2.y + dimension.height > rectangle.y + rectangle.height) {
                point.y = rectangle.y + rectangle.height - dimension.height;
            }
            point2 = point;
        }
        return point2;
    }

    protected Point z(Point point, Rectangle rectangle) {
        int[] nArray = ds_0.U();
        Point point2 = point;
        if (nArray == null) {
            if (point2.x < rectangle.x) {
                point.x = rectangle.x;
            }
            point2 = point;
        }
        return point2;
    }

    protected Point i(Point point, Dimension dimension, Rectangle rectangle) {
        int[] nArray = ds_0.U();
        Point point2 = point;
        if (nArray == null) {
            if (point2.x + dimension.width > rectangle.x + rectangle.width) {
                point.x = rectangle.x + rectangle.width - dimension.width;
            }
            point2 = point;
        }
        return point2;
    }

    protected B1 Z(Rectangle rectangle, boolean bl, int n10, Dimension dimension, Rectangle rectangle2) {
        B1 b1;
        block6: {
            B1[] b1Array = this.G.r();
            int n11 = b1Array.length;
            int[] nArray = ds_0.U();
            for (int i2 = 0; i2 < n11; ++i2) {
                B1 b12;
                Point point;
                B1 b13;
                block8: {
                    B1 b14;
                    block7: {
                        b13 = b1Array[i2];
                        point = this.p(rectangle, bl, b13);
                        b1 = b13;
                        if (nArray != null) break block6;
                        b14 = B1.up;
                        if (nArray != null) break block7;
                        if (b1 == b14) {
                            if (point.y - n10 - dimension.height <= rectangle2.y) continue;
                            return b13;
                        }
                        b12 = b13;
                        if (nArray != null) break block8;
                        b14 = B1.down;
                    }
                    if (b12 == b14) {
                        if (point.y + n10 + dimension.height >= rectangle2.y + rectangle2.height) continue;
                        return b13;
                    }
                    b12 = b13;
                }
                if (!(b12 == (bl ? B1.left : B1.right) ? point.x - n10 - dimension.width > rectangle2.x : b13 == (bl ? B1.right : B1.left) && point.x + n10 + dimension.width < rectangle2.x + rectangle2.width)) continue;
                return b13;
            }
            b1 = this.G;
        }
        return b1;
    }

    protected Point p(Rectangle rectangle, boolean bl, B1 b1) {
        B1 b12;
        block9: {
            B1 b13;
            block8: {
                int[] nArray = ds_0.U();
                if (this.s == xh_2.componentCenter) {
                    return new Point(rectangle.x + rectangle.width / 2, rectangle.y + rectangle.height / 2);
                }
                b12 = b1;
                b13 = B1.up;
                if (nArray != null) break block8;
                if (b12 == b13) {
                    return new Point(rectangle.x + rectangle.width / 2, rectangle.y);
                }
                b12 = b1;
                if (nArray != null) break block9;
                b13 = B1.down;
            }
            if (b12 == b13) {
                return new Point(rectangle.x + rectangle.width / 2, rectangle.y + rectangle.height);
            }
            b12 = b1;
        }
        if (b12 == (bl ? B1.left : B1.right)) {
            return new Point(rectangle.x, rectangle.y + rectangle.height / 2);
        }
        if (b1 == (bl ? B1.right : B1.left)) {
            return new Point(rectangle.x + rectangle.width, rectangle.y + rectangle.height / 2);
        }
        return null;
    }

    public B1 U() {
        return this.G;
    }

    public void g(B1 b1) {
        this.G = b1;
    }

    public B1 I() {
        return this.I;
    }

    public void v(B1 b1) {
        this.I = b1;
    }

    public void D(kt_2 kt_22) {
        this.Q.add(kt_22);
    }

    public void b(kt_2 kt_22) {
        this.Q.remove(kt_22);
    }

    public void J() {
        Iterator iterator = aL.J((Collection)this.Q).iterator();
        int[] nArray = ds_0.U();
        while (iterator.hasNext()) {
            kt_2 kt_22 = (kt_2)iterator.next();
            kt_22.j(this);
            if (nArray == null) continue;
        }
    }

    public void Q() {
        Iterator iterator = aL.J((Collection)this.Q).iterator();
        int[] nArray = ds_0.U();
        while (iterator.hasNext()) {
            kt_2 kt_22 = (kt_2)iterator.next();
            kt_22.u(this);
            if (nArray == null) continue;
        }
    }

    public void r() {
        Iterator iterator = aL.J((Collection)this.Q).iterator();
        int[] nArray = ds_0.U();
        while (iterator.hasNext()) {
            kt_2 kt_22 = (kt_2)iterator.next();
            kt_22.X(this);
            if (nArray == null) continue;
        }
    }

    public void U() {
        Iterator iterator = aL.J((Collection)this.Q).iterator();
        int[] nArray = ds_0.U();
        while (iterator.hasNext()) {
            kt_2 kt_22 = (kt_2)iterator.next();
            kt_22.f(this);
            if (nArray == null) continue;
        }
    }

    @Override
    public R7 D(C0 c0) {
        return fs_0.r(this, c0);
    }

    @Override
    public R7 L(C0 c0) {
        return fs_0.E(this, c0);
    }

    @Override
    public R7 v(C0 c0) {
        return fs_0.w(this, c0);
    }

    @Override
    public R7 H(C0 c0) {
        return fs_0.F(this, c0);
    }

    public static void Z(int[] nArray) {
        g = nArray;
    }

    public static int[] U() {
        return g;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[13];
                var3_1 = 0;
                var2_2 = "J\u00e9\u00fa\u007f\u00fd\bw\u00e1\u001a=O7w\u008c\u000e\u0087\u00eaZ[\u00c3!\u008d\u00a5\u009f\u00e8\u0004\u00ec\u00b75\n\u00aa\u00ac\u00d2\u00d7\u001eE ]\u008cp\n\u00a9^\u00c1\u0092+\u00b4\u0016v\u0081\u0007\u000f\u00f9\u00e4\u00b8\u00deSd\u009b|\u00a6\u00f3P\u0085\u00a2gI\n\u00ed5;\tR\u00f0\u0093g\u0097\u0096\f\u00d6\u00e3\u00bb\u0080T\u00ad\u008f\u0019\f\u008b\u0085\u00b6\u000b\u00c0\u0081\u009fr\u00b7\u00f1\u0011\u00cb.\u00b3\u00eb\u000b\u0082\u0001\u00f6h\u009a\u00f9\u00a0\u00cc\u0086\u008e\u00ed\u0011\u00c5\u00c7>W\u00f28\u009c\u0018\u0014\u00c7\u00ff\u0099\u009dbA3\b";
                var4_3 = "J\u00e9\u00fa\u007f\u00fd\bw\u00e1\u001a=O7w\u008c\u000e\u0087\u00eaZ[\u00c3!\u008d\u00a5\u009f\u00e8\u0004\u00ec\u00b75\n\u00aa\u00ac\u00d2\u00d7\u001eE ]\u008cp\n\u00a9^\u00c1\u0092+\u00b4\u0016v\u0081\u0007\u000f\u00f9\u00e4\u00b8\u00deSd\u009b|\u00a6\u00f3P\u0085\u00a2gI\n\u00ed5;\tR\u00f0\u0093g\u0097\u0096\f\u00d6\u00e3\u00bb\u0080T\u00ad\u008f\u0019\f\u008b\u0085\u00b6\u000b\u00c0\u0081\u009fr\u00b7\u00f1\u0011\u00cb.\u00b3\u00eb\u000b\u0082\u0001\u00f6h\u009a\u00f9\u00a0\u00cc\u0086\u008e\u00ed\u0011\u00c5\u00c7>W\u00f28\u009c\u0018\u0014\u00c7\u00ff\u0099\u009dbA3\b".length();
                var1_4 = 5;
                var0_5 = -1;
                ds_0.Z(null);
lbl8:
                // 2 sources

                while (true) {
                    v0 = 49;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u0080\u00f0\u00d2\u0018\u00b2'\u0092\u00d3`6pNc\u00c0+UKz\u00bbQ\u000e\u00dd-\u0015\u009c\u00eddT\u00f9Vr\u00c9u\u00b3\u00f4";
                    var4_3 = "\u0080\u00f0\u00d2\u0018\u00b2'\u0092\u00d3`6pNc\u00c0+UKz\u00bbQ\u000e\u00dd-\u0015\u009c\u00eddT\u00f9Vr\u00c9u\u00b3\u00f4".length();
                    var1_4 = 20;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 97;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 125;
                            break;
                        }
                        case 1: {
                            v15 = 6;
                            break;
                        }
                        case 2: {
                            v15 = 66;
                            break;
                        }
                        case 3: {
                            v15 = 121;
                            break;
                        }
                        case 4: {
                            v15 = 66;
                            break;
                        }
                        case 5: {
                            v15 = 86;
                            break;
                        }
                        default: {
                            v15 = 38;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        ds_0.b = var5;
        ds_0.c = new String[13];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC929) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 240;
                    break;
                }
                case 1: {
                    n14 = 208;
                    break;
                }
                case 2: {
                    n14 = 160;
                    break;
                }
                case 3: {
                    n14 = 95;
                    break;
                }
                case 4: {
                    n14 = 205;
                    break;
                }
                case 5: {
                    n14 = 41;
                    break;
                }
                case 6: {
                    n14 = 28;
                    break;
                }
                case 7: {
                    n14 = 251;
                    break;
                }
                case 8: {
                    n14 = 12;
                    break;
                }
                case 9: {
                    n14 = 241;
                    break;
                }
                case 10: {
                    n14 = 62;
                    break;
                }
                case 11: {
                    n14 = 58;
                    break;
                }
                case 12: {
                    n14 = 190;
                    break;
                }
                case 13: {
                    n14 = 130;
                    break;
                }
                case 14: {
                    n14 = 133;
                    break;
                }
                case 15: {
                    n14 = 55;
                    break;
                }
                case 16: {
                    n14 = 17;
                    break;
                }
                case 17: {
                    n14 = 229;
                    break;
                }
                case 18: {
                    n14 = 85;
                    break;
                }
                case 19: {
                    n14 = 168;
                    break;
                }
                case 20: {
                    n14 = 8;
                    break;
                }
                case 21: {
                    n14 = 193;
                    break;
                }
                case 22: {
                    n14 = 225;
                    break;
                }
                case 23: {
                    n14 = 194;
                    break;
                }
                case 24: {
                    n14 = 90;
                    break;
                }
                case 25: {
                    n14 = 89;
                    break;
                }
                case 26: {
                    n14 = 235;
                    break;
                }
                case 27: {
                    n14 = 10;
                    break;
                }
                case 28: {
                    n14 = 245;
                    break;
                }
                case 29: {
                    n14 = 52;
                    break;
                }
                case 30: {
                    n14 = 59;
                    break;
                }
                case 31: {
                    n14 = 188;
                    break;
                }
                case 32: {
                    n14 = 70;
                    break;
                }
                case 33: {
                    n14 = 198;
                    break;
                }
                case 34: {
                    n14 = 137;
                    break;
                }
                case 35: {
                    n14 = 66;
                    break;
                }
                case 36: {
                    n14 = 74;
                    break;
                }
                case 37: {
                    n14 = 132;
                    break;
                }
                case 38: {
                    n14 = 143;
                    break;
                }
                case 39: {
                    n14 = 79;
                    break;
                }
                case 40: {
                    n14 = 154;
                    break;
                }
                case 41: {
                    n14 = 37;
                    break;
                }
                case 42: {
                    n14 = 200;
                    break;
                }
                case 43: {
                    n14 = 227;
                    break;
                }
                case 44: {
                    n14 = 236;
                    break;
                }
                case 45: {
                    n14 = 161;
                    break;
                }
                case 46: {
                    n14 = 24;
                    break;
                }
                case 47: {
                    n14 = 116;
                    break;
                }
                case 48: {
                    n14 = 11;
                    break;
                }
                case 49: {
                    n14 = 7;
                    break;
                }
                case 50: {
                    n14 = 255;
                    break;
                }
                case 51: {
                    n14 = 82;
                    break;
                }
                case 52: {
                    n14 = 13;
                    break;
                }
                case 53: {
                    n14 = 135;
                    break;
                }
                case 54: {
                    n14 = 249;
                    break;
                }
                case 55: {
                    n14 = 35;
                    break;
                }
                case 56: {
                    n14 = 158;
                    break;
                }
                case 57: {
                    n14 = 223;
                    break;
                }
                case 58: {
                    n14 = 25;
                    break;
                }
                case 59: {
                    n14 = 96;
                    break;
                }
                case 60: {
                    n14 = 110;
                    break;
                }
                case 61: {
                    n14 = 123;
                    break;
                }
                case 62: {
                    n14 = 34;
                    break;
                }
                case 63: {
                    n14 = 93;
                    break;
                }
                case 64: {
                    n14 = 119;
                    break;
                }
                case 65: {
                    n14 = 122;
                    break;
                }
                case 66: {
                    n14 = 183;
                    break;
                }
                case 67: {
                    n14 = 252;
                    break;
                }
                case 68: {
                    n14 = 182;
                    break;
                }
                case 69: {
                    n14 = 21;
                    break;
                }
                case 70: {
                    n14 = 215;
                    break;
                }
                case 71: {
                    n14 = 43;
                    break;
                }
                case 72: {
                    n14 = 243;
                    break;
                }
                case 73: {
                    n14 = 196;
                    break;
                }
                case 74: {
                    n14 = 189;
                    break;
                }
                case 75: {
                    n14 = 126;
                    break;
                }
                case 76: {
                    n14 = 237;
                    break;
                }
                case 77: {
                    n14 = 173;
                    break;
                }
                case 78: {
                    n14 = 149;
                    break;
                }
                case 79: {
                    n14 = 98;
                    break;
                }
                case 80: {
                    n14 = 134;
                    break;
                }
                case 81: {
                    n14 = 128;
                    break;
                }
                case 82: {
                    n14 = 174;
                    break;
                }
                case 83: {
                    n14 = 84;
                    break;
                }
                case 84: {
                    n14 = 209;
                    break;
                }
                case 85: {
                    n14 = 140;
                    break;
                }
                case 86: {
                    n14 = 5;
                    break;
                }
                case 87: {
                    n14 = 129;
                    break;
                }
                case 88: {
                    n14 = 46;
                    break;
                }
                case 89: {
                    n14 = 101;
                    break;
                }
                case 90: {
                    n14 = 38;
                    break;
                }
                case 91: {
                    n14 = 114;
                    break;
                }
                case 92: {
                    n14 = 250;
                    break;
                }
                case 93: {
                    n14 = 214;
                    break;
                }
                case 94: {
                    n14 = 42;
                    break;
                }
                case 95: {
                    n14 = 228;
                    break;
                }
                case 96: {
                    n14 = 220;
                    break;
                }
                case 97: {
                    n14 = 61;
                    break;
                }
                case 98: {
                    n14 = 197;
                    break;
                }
                case 99: {
                    n14 = 56;
                    break;
                }
                case 100: {
                    n14 = 49;
                    break;
                }
                case 101: {
                    n14 = 192;
                    break;
                }
                case 102: {
                    n14 = 179;
                    break;
                }
                case 103: {
                    n14 = 76;
                    break;
                }
                case 104: {
                    n14 = 239;
                    break;
                }
                case 105: {
                    n14 = 115;
                    break;
                }
                case 106: {
                    n14 = 202;
                    break;
                }
                case 107: {
                    n14 = 141;
                    break;
                }
                case 108: {
                    n14 = 33;
                    break;
                }
                case 109: {
                    n14 = 244;
                    break;
                }
                case 110: {
                    n14 = 30;
                    break;
                }
                case 111: {
                    n14 = 22;
                    break;
                }
                case 112: {
                    n14 = 171;
                    break;
                }
                case 113: {
                    n14 = 120;
                    break;
                }
                case 114: {
                    n14 = 213;
                    break;
                }
                case 115: {
                    n14 = 121;
                    break;
                }
                case 116: {
                    n14 = 203;
                    break;
                }
                case 117: {
                    n14 = 15;
                    break;
                }
                case 118: {
                    n14 = 64;
                    break;
                }
                case 119: {
                    n14 = 234;
                    break;
                }
                case 120: {
                    n14 = 94;
                    break;
                }
                case 121: {
                    n14 = 109;
                    break;
                }
                case 122: {
                    n14 = 14;
                    break;
                }
                case 123: {
                    n14 = 247;
                    break;
                }
                case 124: {
                    n14 = 224;
                    break;
                }
                case 125: {
                    n14 = 83;
                    break;
                }
                case 126: {
                    n14 = 32;
                    break;
                }
                case 127: {
                    n14 = 206;
                    break;
                }
                case 128: {
                    n14 = 108;
                    break;
                }
                case 129: {
                    n14 = 88;
                    break;
                }
                case 130: {
                    n14 = 2;
                    break;
                }
                case 131: {
                    n14 = 211;
                    break;
                }
                case 132: {
                    n14 = 125;
                    break;
                }
                case 133: {
                    n14 = 150;
                    break;
                }
                case 134: {
                    n14 = 81;
                    break;
                }
                case 135: {
                    n14 = 112;
                    break;
                }
                case 136: {
                    n14 = 91;
                    break;
                }
                case 137: {
                    n14 = 233;
                    break;
                }
                case 138: {
                    n14 = 176;
                    break;
                }
                case 139: {
                    n14 = 127;
                    break;
                }
                case 140: {
                    n14 = 80;
                    break;
                }
                case 141: {
                    n14 = 26;
                    break;
                }
                case 142: {
                    n14 = 105;
                    break;
                }
                case 143: {
                    n14 = 9;
                    break;
                }
                case 144: {
                    n14 = 3;
                    break;
                }
                case 145: {
                    n14 = 20;
                    break;
                }
                case 146: {
                    n14 = 162;
                    break;
                }
                case 147: {
                    n14 = 201;
                    break;
                }
                case 148: {
                    n14 = 195;
                    break;
                }
                case 149: {
                    n14 = 31;
                    break;
                }
                case 150: {
                    n14 = 75;
                    break;
                }
                case 151: {
                    n14 = 181;
                    break;
                }
                case 152: {
                    n14 = 232;
                    break;
                }
                case 153: {
                    n14 = 159;
                    break;
                }
                case 154: {
                    n14 = 163;
                    break;
                }
                case 155: {
                    n14 = 217;
                    break;
                }
                case 156: {
                    n14 = 155;
                    break;
                }
                case 157: {
                    n14 = 142;
                    break;
                }
                case 158: {
                    n14 = 164;
                    break;
                }
                case 159: {
                    n14 = 178;
                    break;
                }
                case 160: {
                    n14 = 185;
                    break;
                }
                case 161: {
                    n14 = 144;
                    break;
                }
                case 162: {
                    n14 = 157;
                    break;
                }
                case 163: {
                    n14 = 51;
                    break;
                }
                case 164: {
                    n14 = 246;
                    break;
                }
                case 165: {
                    n14 = 4;
                    break;
                }
                case 166: {
                    n14 = 19;
                    break;
                }
                case 167: {
                    n14 = 167;
                    break;
                }
                case 168: {
                    n14 = 156;
                    break;
                }
                case 169: {
                    n14 = 44;
                    break;
                }
                case 170: {
                    n14 = 16;
                    break;
                }
                case 171: {
                    n14 = 187;
                    break;
                }
                case 172: {
                    n14 = 97;
                    break;
                }
                case 173: {
                    n14 = 186;
                    break;
                }
                case 174: {
                    n14 = 104;
                    break;
                }
                case 175: {
                    n14 = 65;
                    break;
                }
                case 176: {
                    n14 = 191;
                    break;
                }
                case 177: {
                    n14 = 145;
                    break;
                }
                case 178: {
                    n14 = 169;
                    break;
                }
                case 179: {
                    n14 = 212;
                    break;
                }
                case 180: {
                    n14 = 148;
                    break;
                }
                case 181: {
                    n14 = 78;
                    break;
                }
                case 182: {
                    n14 = 53;
                    break;
                }
                case 183: {
                    n14 = 118;
                    break;
                }
                case 184: {
                    n14 = 210;
                    break;
                }
                case 185: {
                    n14 = 54;
                    break;
                }
                case 186: {
                    n14 = 36;
                    break;
                }
                case 187: {
                    n14 = 6;
                    break;
                }
                case 188: {
                    n14 = 103;
                    break;
                }
                case 189: {
                    n14 = 138;
                    break;
                }
                case 190: {
                    n14 = 218;
                    break;
                }
                case 191: {
                    n14 = 77;
                    break;
                }
                case 192: {
                    n14 = 47;
                    break;
                }
                case 193: {
                    n14 = 106;
                    break;
                }
                case 194: {
                    n14 = 147;
                    break;
                }
                case 195: {
                    n14 = 92;
                    break;
                }
                case 196: {
                    n14 = 87;
                    break;
                }
                case 197: {
                    n14 = 1;
                    break;
                }
                case 198: {
                    n14 = 72;
                    break;
                }
                case 199: {
                    n14 = 73;
                    break;
                }
                case 200: {
                    n14 = 166;
                    break;
                }
                case 201: {
                    n14 = 238;
                    break;
                }
                case 202: {
                    n14 = 29;
                    break;
                }
                case 203: {
                    n14 = 253;
                    break;
                }
                case 204: {
                    n14 = 27;
                    break;
                }
                case 205: {
                    n14 = 86;
                    break;
                }
                case 206: {
                    n14 = 113;
                    break;
                }
                case 207: {
                    n14 = 165;
                    break;
                }
                case 208: {
                    n14 = 177;
                    break;
                }
                case 209: {
                    n14 = 184;
                    break;
                }
                case 210: {
                    n14 = 230;
                    break;
                }
                case 211: {
                    n14 = 67;
                    break;
                }
                case 212: {
                    n14 = 216;
                    break;
                }
                case 213: {
                    n14 = 0;
                    break;
                }
                case 214: {
                    n14 = 204;
                    break;
                }
                case 215: {
                    n14 = 226;
                    break;
                }
                case 216: {
                    n14 = 68;
                    break;
                }
                case 217: {
                    n14 = 111;
                    break;
                }
                case 218: {
                    n14 = 48;
                    break;
                }
                case 219: {
                    n14 = 63;
                    break;
                }
                case 220: {
                    n14 = 242;
                    break;
                }
                case 221: {
                    n14 = 221;
                    break;
                }
                case 222: {
                    n14 = 57;
                    break;
                }
                case 223: {
                    n14 = 60;
                    break;
                }
                case 224: {
                    n14 = 99;
                    break;
                }
                case 225: {
                    n14 = 45;
                    break;
                }
                case 226: {
                    n14 = 231;
                    break;
                }
                case 227: {
                    n14 = 124;
                    break;
                }
                case 228: {
                    n14 = 151;
                    break;
                }
                case 229: {
                    n14 = 175;
                    break;
                }
                case 230: {
                    n14 = 146;
                    break;
                }
                case 231: {
                    n14 = 102;
                    break;
                }
                case 232: {
                    n14 = 222;
                    break;
                }
                case 233: {
                    n14 = 131;
                    break;
                }
                case 234: {
                    n14 = 18;
                    break;
                }
                case 235: {
                    n14 = 180;
                    break;
                }
                case 236: {
                    n14 = 117;
                    break;
                }
                case 237: {
                    n14 = 40;
                    break;
                }
                case 238: {
                    n14 = 71;
                    break;
                }
                case 239: {
                    n14 = 254;
                    break;
                }
                case 240: {
                    n14 = 199;
                    break;
                }
                case 241: {
                    n14 = 23;
                    break;
                }
                case 242: {
                    n14 = 50;
                    break;
                }
                case 243: {
                    n14 = 139;
                    break;
                }
                case 244: {
                    n14 = 136;
                    break;
                }
                case 245: {
                    n14 = 207;
                    break;
                }
                case 246: {
                    n14 = 100;
                    break;
                }
                case 247: {
                    n14 = 219;
                    break;
                }
                case 248: {
                    n14 = 69;
                    break;
                }
                case 249: {
                    n14 = 170;
                    break;
                }
                case 250: {
                    n14 = 152;
                    break;
                }
                case 251: {
                    n14 = 172;
                    break;
                }
                case 252: {
                    n14 = 153;
                    break;
                }
                case 253: {
                    n14 = 39;
                    break;
                }
                case 254: {
                    n14 = 107;
                    break;
                }
                default: {
                    n14 = 248;
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
            ds_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

