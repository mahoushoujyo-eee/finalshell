/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.P;
import com.C.W;
import com.GO;
import com.P9;
import com.RV;
import com.WC;
import com._V;
import com.c;
import com.c.i_0;
import com.gw_0;
import com.lz_0;
import com.wt_2;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.C.y
 */
public class y_0
extends lz_0
implements wt_2 {
    protected boolean l = _V.d;
    protected boolean q = _V.S;
    protected int t = _V.o;
    protected Insets k = _V.X;
    protected Color J = _V.T;
    protected Color e = _V.v;
    protected Color F = _V.C;
    protected Color W = _V.z;
    protected Color h = _V.O;
    protected Color R = _V.e;
    protected Color G = _V.G;
    protected Color x = _V.M;
    protected Color O = _V.h;
    protected Color b = _V.a;
    protected boolean Y;
    protected WC Q;
    protected float D;
    protected boolean C;
    protected boolean p;
    protected boolean L;
    protected Rectangle v;
    protected Rectangle K;
    protected Insets i;
    protected Insets m;
    protected Insets j;
    protected MouseAdapter n;

    public void T(JScrollBar jScrollBar) {
        super.A(jScrollBar);
        this.Y = true;
        this.n = new i_0(this);
        jScrollBar.addMouseListener(this.n);
        jScrollBar.addMouseMotionListener(this.n);
    }

    public void C(JScrollBar jScrollBar) {
        jScrollBar.removeMouseListener(this.n);
        jScrollBar.removeMouseMotionListener(this.n);
        super.X(jScrollBar);
    }

    public boolean C() {
        return this.l;
    }

    @Override
    public void R(boolean bl) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.l == bl) break block3;
                this.l = bl;
                y_02 = this;
            }
            y_02.Z();
        }
    }

    public boolean z() {
        return this.q;
    }

    @Override
    public void G(boolean bl) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.q == bl) break block3;
                this.q = bl;
                y_02 = this;
            }
            y_02.Z();
        }
    }

    public int s() {
        return this.t;
    }

    public void t(int n10) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.t == n10) break block3;
                this.t = n10;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Insets N() {
        return this.k;
    }

    public void w(Insets insets) {
        block4: {
            y_0 y_02;
            block5: {
                Insets insets2;
                block2: {
                    int[] nArray;
                    block3: {
                        nArray = com.C.W.B();
                        insets2 = this.k;
                        if (nArray != null) break block2;
                        if (insets2 == insets) break block3;
                        this.k = insets;
                        this.s();
                        this.p();
                        if (nArray == null) break block4;
                    }
                    y_02 = this;
                    if (nArray != null) break block5;
                    insets2 = y_02.i;
                }
                if (insets2 != null) break block4;
                y_02 = this;
            }
            y_02.s();
        }
    }

    protected void s() {
        this.i = new Insets(this.k.top, this.k.right, this.k.bottom, this.k.left);
        this.m = new Insets(this.k.left, this.k.bottom, this.k.right, this.k.top);
        this.j = new Insets(this.k.right, this.k.top, this.k.left, this.k.bottom);
    }

    public Color n() {
        return this.J;
    }

    public void I(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.J == color) break block3;
                this.J = color;
                y_02 = this;
            }
            y_02.l();
        }
    }

    public Color N() {
        return this.e;
    }

    public void a(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.e == color) break block3;
                this.e = color;
                y_02 = this;
            }
            y_02.l();
        }
    }

    public Color H() {
        return this.F;
    }

    public void F(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.F == color) break block3;
                this.F = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Color m() {
        return this.W;
    }

    public void r(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.W == color) break block3;
                this.W = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Color W() {
        return this.h;
    }

    public void i(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.h == color) break block3;
                this.h = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Color J() {
        return this.R;
    }

    public void Z(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.R == color) break block3;
                this.R = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Color Z() {
        return this.G;
    }

    public void h(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.G == color) break block3;
                this.G = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Color x() {
        return this.x;
    }

    public void t(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.x == color) break block3;
                this.x = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Color V() {
        return this.O;
    }

    public void w(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.O == color) break block3;
                this.O = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public Color E() {
        return this.b;
    }

    public void N(Color color) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.b == color) break block3;
                this.b = color;
                y_02 = this;
            }
            y_02.p();
        }
    }

    public boolean O() {
        return this.C;
    }

    public void P(boolean bl) {
        block8: {
            block9: {
                y_0 y_02;
                block10: {
                    int[] nArray;
                    block11: {
                        boolean bl2;
                        block7: {
                            nArray = com.C.W.B();
                            bl2 = this.C;
                            if (nArray != null) break block7;
                            if (bl2 == bl) break block8;
                            this.C = bl;
                            y_02 = this;
                            if (nArray != null) break block9;
                            bl2 = y_02.Y;
                        }
                        if (!bl2) break block10;
                        if (!bl) break block11;
                        y_0 y_03 = this;
                        if (nArray == null) {
                            if (y_03.Q != null) {
                                this.Q.Y();
                            }
                            y_03 = this;
                        }
                        y_03.p();
                        if (nArray == null) break block8;
                    }
                    WC wC = this.Q;
                    if (nArray == null) {
                        if (wC == null) {
                            this.Q = new WC(GO.q, (ActionListener)new P(this));
                        }
                        this.D = 1.0f;
                        wC = this.Q.u();
                    }
                    if (nArray == null) break block8;
                }
                y_02 = this;
            }
            y_02.D = bl ? 1.0f : 0.0f;
            this.p();
        }
    }

    public boolean P() {
        return this.p;
    }

    public void I(boolean bl) {
        block3: {
            y_0 y_02;
            block2: {
                int[] nArray = com.C.W.B();
                y_02 = this;
                if (nArray != null) break block2;
                if (y_02.p == bl) break block3;
                this.p = bl;
                y_02 = this;
            }
            y_02.p();
        }
    }

    @Override
    public void j(boolean bl) {
        this.L = bl;
    }

    @Override
    public void R(Rectangle rectangle) {
        this.v = rectangle;
    }

    @Override
    public void j(Rectangle rectangle) {
        this.K = rectangle;
    }

    public Boolean O(JScrollBar jScrollBar) {
        return this.q;
    }

    public Insets K(JScrollBar jScrollBar) {
        block5: {
            int n10;
            int[] nArray;
            block4: {
                nArray = com.C.W.B();
                n10 = this.q;
                if (nArray != null) break block4;
                if (n10 == 0) break block5;
                n10 = jScrollBar.getOrientation();
            }
            if (nArray == null) {
                n10 = n10 == 0 ? 1 : 0;
            }
            int n11 = n10;
            return new Insets(n11 != 0 ? 1 : 0, n11 != 0 ? 0 : 1, 0, 0);
        }
        return null;
    }

    public void V(Graphics2D graphics2D, Rectangle rectangle, JScrollBar jScrollBar) {
        Object object = RV.X(graphics2D);
        this.E(graphics2D, jScrollBar, this.K);
        this.v(graphics2D, this.K);
        RV.X(graphics2D, object);
    }

    protected void v(Graphics2D graphics2D, Rectangle rectangle) {
    }

    /*
     * Unable to fully structure code
     */
    protected void O(Graphics2D var1_1, JScrollBar var2_2, Rectangle var3_3) {
        block6: {
            block7: {
                block8: {
                    block5: {
                        var4_4 = com.C.W.B();
                        v0 = this.q;
                        if (var4_4 != null) break block5;
                        if (v0 == 0) break block6;
                        var1_1.setPaint(this.e);
                        var1_1.fillRect(var3_3.x, var3_3.y, var3_3.width, var3_3.height);
                        if (var4_4 != null) break block7;
                        v0 = var2_2.getOrientation();
                    }
                    if (v0 != 1) break block8;
                    v1 = var5_5 = var2_2.getComponentOrientation().isLeftToRight();
                    if (var4_4 != null) ** GOTO lbl17
                    if (v1 != 0) {
                        v2 = var3_3.x;
                    } else {
                        v1 = var3_3.x + var3_3.width;
lbl17:
                        // 2 sources

                        v2 = v1 - 1;
                    }
                    var6_6 = v2;
                    var1_1.setColor(this.J);
                    var1_1.drawLine(var6_6, var3_3.y, var6_6, var3_3.height - 1);
                    if (var4_4 == null) break block6;
                }
                var1_1.setColor(this.J);
            }
            var1_1.drawLine(var3_3.x, var3_3.y, var3_3.x + var3_3.width - 1, var3_3.y);
        }
    }

    protected void Z(Graphics2D graphics2D, JScrollBar jScrollBar, Rectangle rectangle) {
    }

    protected void E(Graphics2D graphics2D, JScrollBar jScrollBar, Rectangle rectangle) {
        Insets insets = this.v(jScrollBar);
        int n10 = rectangle.width - insets.left - insets.right;
        int n11 = rectangle.height - insets.top - insets.bottom;
        int n12 = gw_0.G(new int[]{this.t, n10 - 1, n11 - 1});
        graphics2D.setPaint(this.c(jScrollBar));
        graphics2D.fillRoundRect(rectangle.x + insets.left, rectangle.y + insets.top, n10, n11, n12, n12);
        graphics2D.setPaint(this.o(jScrollBar));
        graphics2D.drawRoundRect(rectangle.x + insets.left, rectangle.y + insets.top, n10 - 1, n11 - 1, n12, n12);
    }

    protected Insets v(JScrollBar jScrollBar) {
        return (Insets)cy_1.P;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected Color o(JScrollBar jScrollBar) {
        y_0 y_02;
        Color color;
        block13: {
            boolean bl;
            block11: {
                int[] nArray;
                block12: {
                    y_0 y_03;
                    block9: {
                        block10: {
                            boolean bl2;
                            block8: {
                                nArray = com.C.W.B();
                                bl2 = jScrollBar.isEnabled();
                                if (nArray != null) break block8;
                                if (!bl2) {
                                    color = this.h;
                                    return color;
                                }
                                y_03 = this;
                                if (nArray != null) break block9;
                                bl2 = y_03.p;
                            }
                            if (bl2) break block10;
                            bl = this.L;
                            if (nArray != null) break block11;
                            if (!bl) break block12;
                        }
                        y_03 = this;
                    }
                    color = y_03.O;
                    return color;
                }
                y_02 = this;
                if (nArray != null) break block13;
                bl = y_02.C;
            }
            if (bl) {
                color = this.G;
                return color;
            }
            y_02 = this;
        }
        color = P9.N(y_02.F, this.G, this.D);
        return color;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected Color c(JScrollBar jScrollBar) {
        y_0 y_02;
        Color color;
        block13: {
            boolean bl;
            block11: {
                int[] nArray;
                block12: {
                    y_0 y_03;
                    block9: {
                        block10: {
                            boolean bl2;
                            block8: {
                                nArray = com.C.W.B();
                                bl2 = jScrollBar.isEnabled();
                                if (nArray != null) break block8;
                                if (!bl2) {
                                    color = this.R;
                                    return color;
                                }
                                y_03 = this;
                                if (nArray != null) break block9;
                                bl2 = y_03.p;
                            }
                            if (bl2) break block10;
                            bl = this.L;
                            if (nArray != null) break block11;
                            if (!bl) break block12;
                        }
                        y_03 = this;
                    }
                    color = y_03.b;
                    return color;
                }
                y_02 = this;
                if (nArray != null) break block13;
                bl = y_02.C;
            }
            if (bl) {
                color = this.x;
                return color;
            }
            y_02 = this;
        }
        color = P9.N(y_02.W, this.x, this.D);
        return color;
    }

    public void p() {
        block4: {
            y_0 y_02;
            block2: {
                block3: {
                    int[] nArray = com.C.W.B();
                    y_02 = this;
                    if (nArray != null) break block2;
                    if (y_02.K == null) break block3;
                    this.M(this.K);
                    if (nArray == null) break block4;
                }
                y_02 = this;
            }
            y_02.l();
        }
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.K((JScrollBar)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.O((JScrollBar)jComponent);
    }

    @Override
    public void X(JComponent jComponent) {
        this.C((JScrollBar)jComponent);
    }

    @Override
    public void A(JComponent jComponent) {
        this.T((JScrollBar)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.V(graphics2D, rectangle, (JScrollBar)jComponent);
    }
}

