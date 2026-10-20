/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.C.Y;
import com.GA;
import com.GO;
import com.ON;
import com.RJ;
import com.RV;
import com.WR;
import com.c.m_0;
import com.c.t_0;
import com.fk_0;
import com.lz_0;
import com.o4_0;
import com.p6_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends lz_0
implements RJ,
WR {
    protected boolean F = m_0.i;
    protected boolean K = m_0.F;
    protected int v = m_0.G;
    protected int q = m_0.s;
    protected float M = m_0.u;
    protected Stroke X = m_0.J;
    protected Color f = m_0.v;
    protected Color Q = m_0.T;
    protected boolean N = m_0.k;
    protected boolean I = m_0.d;
    protected boolean o = true;
    protected boolean C = true;
    protected boolean y = true;
    protected boolean P = true;
    protected boolean O = false;
    protected boolean W = false;
    protected boolean m = false;
    protected boolean J = false;
    protected p6_0 t;
    protected boolean u = false;
    protected boolean a;
    protected boolean x;
    protected boolean l;
    protected int b;
    protected int j;
    private static final String[] g;
    private static final String[] h;
    private static final long[] i;
    private static final Integer[] k;

    @Override
    public void A(JComponent jComponent) {
        super.A(jComponent);
        this.t = new Y(this);
        ON.b(jComponent, this.t);
    }

    @Override
    public void X(JComponent jComponent) {
        ON.i(this.t);
        this.t = null;
        super.X(jComponent);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Shape s(JComponent jComponent, Rectangle rectangle) {
        Shape shape;
        int[] nArray = com.C.W.B();
        O o2 = this;
        if (nArray == null) {
            if (o2.F) {
                shape = rectangle;
                return shape;
            }
            o2 = this;
        }
        shape = o2.g(jComponent, true);
        return shape;
    }

    public boolean s() {
        return this.F;
    }

    public void O(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.F == bl) break block3;
                this.F = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean i() {
        return this.K;
    }

    public void V(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.K == bl) break block3;
                this.K = bl;
                o2 = this;
            }
            o2.l();
        }
    }

    public int w() {
        return this.v;
    }

    public void D(int n10) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.v == n10) break block3;
                this.v = n10;
                o2 = this;
            }
            o2.l();
        }
    }

    public int X() {
        return this.q;
    }

    public void E(int n10) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.q == n10) break block3;
                this.q = n10;
                o2 = this;
            }
            o2.x();
        }
    }

    public float n() {
        return this.M;
    }

    public void K(float f10) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.M == f10) break block3;
                this.M = f10;
                o2 = this;
            }
            o2.l();
        }
    }

    public Stroke H() {
        return this.X;
    }

    public void X(Stroke stroke) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.X == stroke) break block3;
                this.X = stroke;
                o2 = this;
            }
            o2.l();
        }
    }

    public Color K() {
        return this.f;
    }

    public void K(Color color) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.f == color) break block3;
                this.f = color;
                o2 = this;
            }
            o2.l();
        }
    }

    public Color r() {
        return this.Q;
    }

    public void v(Color color) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.Q == color) break block3;
                this.Q = color;
                o2 = this;
            }
            o2.l();
        }
    }

    public boolean y() {
        return this.N;
    }

    public void W(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.N == bl) break block3;
                this.N = bl;
                o2 = this;
            }
            o2.l();
        }
    }

    public boolean z() {
        return this.I;
    }

    public void h(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.I == bl) break block3;
                this.I = bl;
                o2 = this;
            }
            o2.l();
        }
    }

    public boolean h() {
        return this.o;
    }

    @Override
    public void D(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.o == bl) break block3;
                this.o = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean n() {
        return this.C;
    }

    @Override
    public void C(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.C == bl) break block3;
                this.C = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean R() {
        return this.y;
    }

    @Override
    public void p(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.y == bl) break block3;
                this.y = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean S() {
        return this.P;
    }

    @Override
    public void w(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.P == bl) break block3;
                this.P = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    @Override
    public void I(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        block4: {
            O o2;
            block2: {
                block3: {
                    int[] nArray = com.C.W.B();
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.o != bl) break block3;
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.C != bl2) break block3;
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.y != bl3) break block3;
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.P == bl4) break block4;
                }
                this.o = bl;
                this.C = bl2;
                this.y = bl3;
                this.P = bl4;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean T() {
        return this.O;
    }

    @Override
    public void X(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.O == bl) break block3;
                this.O = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean Z() {
        return this.W;
    }

    @Override
    public void H(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.W == bl) break block3;
                this.W = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean V() {
        return this.m;
    }

    @Override
    public void B(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.m == bl) break block3;
                this.m = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    public boolean H() {
        return this.J;
    }

    @Override
    public void m(boolean bl) {
        block3: {
            O o2;
            block2: {
                int[] nArray = com.C.W.B();
                o2 = this;
                if (nArray != null) break block2;
                if (o2.J == bl) break block3;
                this.J = bl;
                o2 = this;
            }
            o2.Z();
        }
    }

    @Override
    public void X(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        block4: {
            O o2;
            block2: {
                block3: {
                    int[] nArray = com.C.W.B();
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.O != bl) break block3;
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.W != bl2) break block3;
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.m != bl3) break block3;
                    o2 = this;
                    if (nArray != null) break block2;
                    if (o2.J == bl4) break block4;
                }
                this.O = bl;
                this.W = bl2;
                this.m = bl3;
                this.J = bl4;
                o2 = this;
            }
            o2.Z();
        }
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.F;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Insets B(JComponent var1_1) {
        var2_2 = com.C.W.B();
        v0 = this.F;
        if (var2_2 == null) {
            if (v0 != 0) {
                return null;
            }
            v0 = this.q + 1;
        }
        var3_3 = v0;
        v1 = var4_4 = var1_1.getComponentOrientation().isLeftToRight();
        if (var2_2 == null) {
            v1 = (int)(v1 != 0 ? this.C : this.P);
        }
        var5_5 = v1;
        v2 = var4_4;
        if (var2_2 == null) {
            v2 = (int)(v2 != 0 ? this.W : this.J);
        }
        var6_6 = v2;
        v3 = var4_4;
        if (var2_2 == null) {
            v3 = (int)(v3 != 0 ? this.P : this.C);
        }
        var7_7 = v3;
        v4 = var4_4;
        if (var2_2 == null) {
            v4 = (int)(v4 != 0 ? this.J : this.W);
        }
        var8_8 = v4;
        v5 = this.o;
        if (var2_2 != null) ** GOTO lbl30
        if (v5 != 0) {
            v5 = var3_3;
        } else {
            v5 = (int)this.O;
lbl30:
            // 2 sources

            if (var2_2 == null) {
                v5 = v5 != 0 ? 1 : 0;
            }
        }
        var9_9 = v5;
        v6 = var5_5;
        if (var2_2 != null) ** GOTO lbl39
        if (v6 != 0) {
            v6 = var3_3;
        } else {
            v6 = var6_6;
lbl39:
            // 2 sources

            if (var2_2 == null) {
                v6 = v6 != 0 ? 1 : 0;
            }
        }
        var10_10 = v6;
        v7 = this.y;
        if (var2_2 != null) ** GOTO lbl48
        if (v7 != 0) {
            v7 = var3_3;
        } else {
            v7 = (int)this.m;
lbl48:
            // 2 sources

            if (var2_2 == null) {
                v7 = v7 != 0 ? 1 : 0;
            }
        }
        var11_11 = v7;
        v8 = var7_7;
        if (var2_2 != null) ** GOTO lbl57
        if (v8 != 0) {
            v8 = var3_3;
        } else {
            v8 = var8_8;
lbl57:
            // 2 sources

            if (var2_2 == null) {
                v8 = v8 != 0 ? 1 : 0;
            }
        }
        var12_12 = v8;
        return new Insets(var9_9, var10_10, var11_11, var12_12);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void u(Graphics2D var1_1, Rectangle var2_2, JComponent var3_3) {
        block29: {
            block37: {
                block40: {
                    block39: {
                        block38: {
                            block36: {
                                block34: {
                                    block35: {
                                        block33: {
                                            block32: {
                                                block31: {
                                                    block30: {
                                                        block28: {
                                                            var4_4 = com.C.W.B();
                                                            v0 = this;
                                                            if (var4_4 != null) break block28;
                                                            if (v0.F) break block29;
                                                            this.a = var3_3.getComponentOrientation().isLeftToRight();
                                                            v0 = this;
                                                        }
                                                        v1 = this;
                                                        if (var4_4 != null) ** GOTO lbl14
                                                        if (v1.a) {
                                                            v2 = this.C;
                                                        } else {
                                                            v1 = this;
lbl14:
                                                            // 2 sources

                                                            v2 = v1.P;
                                                        }
                                                        v0.x = v2;
                                                        v3 = this;
                                                        if (var4_4 != null) ** GOTO lbl22
                                                        if (v3.a) {
                                                            v4 = this.P;
                                                        } else {
                                                            v3 = this;
lbl22:
                                                            // 2 sources

                                                            v4 = v3.C;
                                                        }
                                                        this.l = v4;
                                                        this.b = var3_3.getWidth();
                                                        this.j = var3_3.getHeight();
                                                        v5 = this.o;
                                                        if (var4_4 != null) break block30;
                                                        if (v5 != 0) ** GOTO lbl-1000
                                                        v5 = this.P;
                                                        if (var4_4 != null) break block30;
                                                        if (v5 != 0) ** GOTO lbl-1000
                                                        v5 = this.y;
                                                        if (var4_4 == null) {
                                                            if (v5 == 0) {
                                                                v5 = this.C;
                                                                if (var4_4 == null) {
                                                                    ** if (v5 == 0) goto lbl-1000
                                                                } else {
                                                                    ** GOTO lbl40
                                                                }
                                                            } else {
                                                                ** GOTO lbl39
                                                            }
                                                        }
                                                        break block30;
lbl39:
                                                        // 2 sources

                                                        ** GOTO lbl-1000
lbl40:
                                                        // 2 sources

                                                        break block30;
lbl-1000:
                                                        // 4 sources

                                                        {
                                                            v5 = 1;
                                                            ** GOTO lbl44
                                                        }
lbl-1000:
                                                        // 1 sources

                                                        {
                                                            v5 = 0;
                                                        }
                                                    }
                                                    v6 = var5_5 = v5;
                                                    if (var4_4 != null) break block31;
                                                    if (v6 != 0) break block32;
                                                    v7 = this;
                                                    if (var4_4 != null) break block33;
                                                    v6 = v7.N;
                                                }
                                                if (v6 == 0) break block29;
                                            }
                                            v7 = RV.X(var1_1);
                                        }
                                        var6_6 = v7;
                                        var7_7 = var3_3.isEnabled();
                                        var8_8 = this.g(var3_3, false);
                                        var9_9 = this.g(var3_3, true);
                                        v8 = var5_5;
                                        if (var4_4 != null) break block34;
                                        if (v8 == 0) break block35;
                                        v8 = this.q;
                                        if (var4_4 != null) break block34;
                                        if (v8 > 0) {
                                            this.A(var1_1, var2_2, var3_3, var8_8);
                                        }
                                    }
                                    v8 = (int)this.N;
                                }
                                if (var4_4 == null) {
                                    if (v8 != 0) {
                                        this.S(var1_1, var2_2, var3_3, var9_9);
                                    }
                                    v8 = var5_5;
                                }
                                if (var4_4 != null) break block36;
                                if (v8 == 0) break block37;
                                v8 = (int)var7_7;
                            }
                            if (v8 == 0) break block38;
                            if (this.f == null) break block37;
                            break block39;
                        }
                        v9 = this;
                        if (var4_4 != null) break block40;
                        if (v9.Q == null) break block37;
                    }
                    v9 = this;
                }
                v9.f(var1_1, var2_2, var3_3, var8_8);
            }
            RV.X(var1_1, var6_6);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void A(Graphics2D var1_1, Rectangle var2_2, JComponent var3_3, Shape var4_4) {
        block19: {
            block16: {
                block17: {
                    block18: {
                        var5_5 = com.C.W.B();
                        v0 = this.q;
                        v1 = 4;
                        if (var5_5 != null) break block16;
                        if (v0 >= v1) break block17;
                        v2 = Float.valueOf(this.M);
                        cfr_temp_0 = this.M - 1.0f;
                        v3 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                        if (var5_5 == null) {
                            v3 = v3 < 0 ? (float)true : (float)false;
                        }
                        var6_6 = RV.a(var1_1, v2, (boolean)v3);
                        v4 = this.K;
                        if (var5_5 != null) break block18;
                        if (!v4) ** GOTO lbl-1000
                        v4 = this.u;
                    }
                    if (v4) {
                        v5 = GO.c;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v5 = GO.r;
                    }
                    var7_7 = v5;
                    RV.Y(var1_1, var4_4, var7_7, this.q);
                    cfr_temp_1 = this.M - 1.0f;
                    v6 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                    if (var5_5 == null) {
                        v6 = v6 < 0 ? (float)true : (float)false;
                    }
                    RV.E(var1_1, (Composite)var6_6, (boolean)v6);
                    if (var5_5 == null) break block19;
                }
                v0 = this.q;
                v1 = this.v;
            }
            var6_6 = fk_0.I(v0, v1, this.M);
            v7 = this.x;
            if (var5_5 != null) ** GOTO lbl40
            if (v7 != 0) {
                v8 = 0;
            } else {
                v7 = -this.q;
lbl40:
                // 2 sources

                v8 = v7 * 2;
            }
            var7_8 = v8;
            v9 = this.x;
            if (var5_5 != null) ** GOTO lbl48
            if (v9 != 0) {
                v10 = 0;
            } else {
                v9 = this.q;
lbl48:
                // 2 sources

                v10 = v9 * 2;
            }
            v11 = this.b + v10;
            v12 = this.l;
            if (var5_5 != null) ** GOTO lbl56
            if (v12 != 0) {
                v13 = 0;
            } else {
                v12 = this.q;
lbl56:
                // 2 sources

                v13 = v12 * 2;
            }
            var8_9 = v11 + v13;
            v14 = this.o;
            if (var5_5 != null) ** GOTO lbl64
            if (v14 != 0) {
                v15 = 0;
            } else {
                v14 = -this.q;
lbl64:
                // 2 sources

                v15 = v14 * 2;
            }
            var9_10 = v15;
            v16 = this.o;
            if (var5_5 != null) ** GOTO lbl72
            if (v16 != 0) {
                v17 = 0;
            } else {
                v16 = this.q;
lbl72:
                // 2 sources

                v17 = v16 * 2;
            }
            v18 = this.j + v17;
            v19 = this.y;
            if (var5_5 != null) ** GOTO lbl80
            if (v19 != 0) {
                v20 = 0;
            } else {
                v19 = this.q;
lbl80:
                // 2 sources

                v20 = v19 * 2;
            }
            var10_11 = v18 + v20;
            var6_6.l(var1_1, var7_8, var9_10, var8_9, var10_11);
        }
    }

    protected void S(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent, Shape shape) {
        block3: {
            block2: {
                int[] nArray = com.C.W.B();
                if (!this.I) break block2;
                Rectangle rectangle2 = shape.getBounds();
                graphics2D.setPaint(GA.m(0, rectangle2.y, 0, rectangle2.y + rectangle2.height));
                if (nArray == null) break block3;
            }
            graphics2D.setPaint(jComponent.getBackground());
        }
        graphics2D.fill(shape);
    }

    protected void f(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent, Shape shape) {
        Stroke stroke;
        block34: {
            int n10;
            int n11;
            int[] nArray;
            block35: {
                block33: {
                    block31: {
                        block32: {
                            block29: {
                                block30: {
                                    block27: {
                                        block28: {
                                            nArray = com.C.W.B();
                                            stroke = RV.d(graphics2D, this.X, this.X != null);
                                            graphics2D.setPaint(jComponent.isEnabled() ? this.f : this.Q);
                                            graphics2D.draw(shape);
                                            n11 = this.o;
                                            if (nArray != null) break block27;
                                            if (n11 != 0) break block28;
                                            n11 = this.O;
                                            if (nArray != null) break block27;
                                            if (n11 != 0) {
                                                int n12 = this.x;
                                                if (nArray == null) {
                                                    n12 = n12 != 0 ? this.q : 0;
                                                }
                                                n10 = n12;
                                                int n14 = n10 + jComponent.getWidth();
                                                n14 = this.x;
                                                if (nArray == null) {
                                                    n14 = n14 != 0 ? this.q : 0;
                                                }
                                                int n16 = n13 - n14;
                                                n16 = this.l;
                                                if (nArray == null) {
                                                    n16 = n16 != 0 ? this.q + 1 : 0;
                                                }
                                                graphics2D.drawLine(n10, 0, n15 - n16, 0);
                                            }
                                        }
                                        n11 = this.y;
                                    }
                                    if (nArray != null) break block29;
                                    if (n11 != 0) break block30;
                                    n11 = this.m;
                                    if (nArray != null) break block29;
                                    if (n11 != 0) {
                                        int n17 = this.x;
                                        if (nArray == null) {
                                            n17 = n17 != 0 ? this.q : 0;
                                        }
                                        n10 = n17;
                                        int n20 = jComponent.getHeight() - 1;
                                        n20 = n10 + jComponent.getWidth();
                                        n20 = this.x;
                                        if (nArray == null) {
                                            n20 = n20 != 0 ? this.q : 0;
                                        }
                                        int n22 = n19 - n20;
                                        n22 = this.l;
                                        if (nArray == null) {
                                            n22 = n22 != 0 ? this.q + 1 : 0;
                                        }
                                        graphics2D.drawLine(n10, n18, n21 - n22, jComponent.getHeight() - 1);
                                    }
                                }
                                n11 = this.C;
                            }
                            if (nArray != null) break block31;
                            if (n11 != 0) break block32;
                            n11 = this.W;
                            if (nArray != null) break block31;
                            if (n11 != 0) {
                                int n23 = this.o;
                                if (nArray == null) {
                                    n23 = n23 != 0 ? this.q : 0;
                                }
                                n10 = n23;
                                int n25 = n10 + jComponent.getHeight();
                                n25 = this.o;
                                if (nArray == null) {
                                    n25 = n25 != 0 ? this.q : 0;
                                }
                                int n27 = n24 - n25;
                                n27 = this.y;
                                if (nArray == null) {
                                    n27 = n27 != 0 ? this.q + 1 : 0;
                                }
                                graphics2D.drawLine(0, n10, 0, n26 - n27);
                            }
                        }
                        n11 = this.P;
                    }
                    if (nArray != null) break block33;
                    if (n11 != 0) break block34;
                    n11 = this.J;
                }
                if (nArray != null) break block35;
                if (n11 == 0) break block34;
                n11 = this.o;
            }
            if (nArray == null) {
                n11 = n11 != 0 ? this.q : 0;
            }
            n10 = n11;
            int n31 = jComponent.getWidth() - 1;
            n31 = jComponent.getWidth() - 1;
            n31 = n10 + jComponent.getHeight();
            n31 = this.o;
            if (nArray == null) {
                n31 = n31 != 0 ? this.q : 0;
            }
            int n33 = n30 - n31;
            n33 = this.y;
            if (nArray == null) {
                n33 = n33 != 0 ? this.q + 1 : 0;
            }
            graphics2D.drawLine(n28, n10, n29, n32 - n33);
        }
        RV.t(graphics2D, stroke, this.X != null);
    }

    protected Shape g(JComponent jComponent, boolean bl) {
        return o4_0.k(jComponent, bl ? com.C.O.a(16515, 458) : com.C.O.a(16514, 3058), new t_0(this, jComponent, bl), this.A(jComponent));
    }

    protected Object[] A(JComponent jComponent) {
        Object[] objectArray = new Object[com.C.O.a(5707, 8040048458137009893L)];
        objectArray[0] = this.b;
        objectArray[1] = this.j;
        objectArray[2] = this.a;
        objectArray[3] = this.v;
        objectArray[4] = this.q;
        objectArray[5] = this.o;
        objectArray[com.C.O.a((int)99, (long)8450514311306275016L)] = this.C;
        objectArray[com.C.O.a((int)3354, (long)6159643100633621941L)] = this.y;
        objectArray[com.C.O.a((int)26206, (long)1639371874851262194L)] = this.P;
        objectArray[com.C.O.a((int)5470, (long)3863090353741004275L)] = this.O;
        objectArray[com.C.O.a((int)22432, (long)5440591444549091081L)] = this.W;
        objectArray[com.C.O.a((int)23639, (long)3463740015491003647L)] = this.m;
        objectArray[com.C.O.a((int)9101, (long)6460277869894552359L)] = this.J;
        return objectArray;
    }

    /*
     * Exception decompiling
     */
    protected Shape o(JComponent var1_1, boolean var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public Shape D(Component component, Rectangle rectangle) {
        return this.s((JComponent)component, rectangle);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00ffD\u0085\u0083\bYc\u00a2\u0007\u00dc\u0006\u000f\u0004\u008aK\u00d8\u00ae";
                    var12_3 = "\u00ffD\u0085\u0083\bYc\u00a2\u0007\u00dc\u0006\u000f\u0004\u008aK\u00d8\u00ae".length();
                    var9_4 = 10;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 78;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 4;
                                    break;
                                }
                                case 1: {
                                    v11 = 101;
                                    break;
                                }
                                case 2: {
                                    v11 = 48;
                                    break;
                                }
                                case 3: {
                                    v11 = 6;
                                    break;
                                }
                                case 4: {
                                    v11 = 81;
                                    break;
                                }
                                case 5: {
                                    v11 = 26;
                                    break;
                                }
                                default: {
                                    v11 = 43;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                com.C.O.g = var13;
                com.C.O.h = new String[2];
                var0_7 = 4139849137200922019L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = "\u0094\u000fq\n\u00f2\u00e2\u0098\u0011\u00f0\u0002B\u00c8\u00ba\u00bf\u0083K\u0012'P \u00b3i\u0000YSRK\u00ba\u00f1\u00d7\u00f3Y\u0089:7^pR\u0095mw\u00fc\u00a5h\u009f\u00f0\u00b6\u0088";
                var5_11 = "\u0094\u000fq\n\u00f2\u00e2\u0098\u0011\u00f0\u0002B\u00c8\u00ba\u00bf\u0083K\u0012'P \u00b3i\u0000YSRK\u00ba\u00f1\u00d7\u00f3Y\u0089:7^pR\u0095mw\u00fc\u00a5h\u009f\u00f0\u00b6\u0088".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00c35\u00a4)\u00da\u00f1\u00c2\u00a0&\u00159D\u007f4\u00c9W";
                    var5_11 = "\u00c35\u00a4)\u00da\u00f1\u00c2\u00a0&\u00159D\u007f4\u00c9W".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        com.C.O.i = var6_8;
        com.C.O.k = new Integer[8];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4083) & 0xFFFF;
        if (h[n12] == null) {
            int n13;
            int n14;
            char[] cArray = g[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 212;
                    break;
                }
                case 1: {
                    n14 = 184;
                    break;
                }
                case 2: {
                    n14 = 224;
                    break;
                }
                case 3: {
                    n14 = 6;
                    break;
                }
                case 4: {
                    n14 = 158;
                    break;
                }
                case 5: {
                    n14 = 154;
                    break;
                }
                case 6: {
                    n14 = 105;
                    break;
                }
                case 7: {
                    n14 = 171;
                    break;
                }
                case 8: {
                    n14 = 241;
                    break;
                }
                case 9: {
                    n14 = 162;
                    break;
                }
                case 10: {
                    n14 = 29;
                    break;
                }
                case 11: {
                    n14 = 128;
                    break;
                }
                case 12: {
                    n14 = 94;
                    break;
                }
                case 13: {
                    n14 = 226;
                    break;
                }
                case 14: {
                    n14 = 32;
                    break;
                }
                case 15: {
                    n14 = 153;
                    break;
                }
                case 16: {
                    n14 = 0;
                    break;
                }
                case 17: {
                    n14 = 208;
                    break;
                }
                case 18: {
                    n14 = 31;
                    break;
                }
                case 19: {
                    n14 = 183;
                    break;
                }
                case 20: {
                    n14 = 151;
                    break;
                }
                case 21: {
                    n14 = 178;
                    break;
                }
                case 22: {
                    n14 = 86;
                    break;
                }
                case 23: {
                    n14 = 23;
                    break;
                }
                case 24: {
                    n14 = 58;
                    break;
                }
                case 25: {
                    n14 = 191;
                    break;
                }
                case 26: {
                    n14 = 235;
                    break;
                }
                case 27: {
                    n14 = 119;
                    break;
                }
                case 28: {
                    n14 = 80;
                    break;
                }
                case 29: {
                    n14 = 111;
                    break;
                }
                case 30: {
                    n14 = 230;
                    break;
                }
                case 31: {
                    n14 = 233;
                    break;
                }
                case 32: {
                    n14 = 3;
                    break;
                }
                case 33: {
                    n14 = 182;
                    break;
                }
                case 34: {
                    n14 = 221;
                    break;
                }
                case 35: {
                    n14 = 255;
                    break;
                }
                case 36: {
                    n14 = 5;
                    break;
                }
                case 37: {
                    n14 = 49;
                    break;
                }
                case 38: {
                    n14 = 189;
                    break;
                }
                case 39: {
                    n14 = 1;
                    break;
                }
                case 40: {
                    n14 = 120;
                    break;
                }
                case 41: {
                    n14 = 100;
                    break;
                }
                case 42: {
                    n14 = 201;
                    break;
                }
                case 43: {
                    n14 = 249;
                    break;
                }
                case 44: {
                    n14 = 195;
                    break;
                }
                case 45: {
                    n14 = 30;
                    break;
                }
                case 46: {
                    n14 = 113;
                    break;
                }
                case 47: {
                    n14 = 87;
                    break;
                }
                case 48: {
                    n14 = 210;
                    break;
                }
                case 49: {
                    n14 = 17;
                    break;
                }
                case 50: {
                    n14 = 103;
                    break;
                }
                case 51: {
                    n14 = 204;
                    break;
                }
                case 52: {
                    n14 = 170;
                    break;
                }
                case 53: {
                    n14 = 223;
                    break;
                }
                case 54: {
                    n14 = 122;
                    break;
                }
                case 55: {
                    n14 = 140;
                    break;
                }
                case 56: {
                    n14 = 207;
                    break;
                }
                case 57: {
                    n14 = 12;
                    break;
                }
                case 58: {
                    n14 = 107;
                    break;
                }
                case 59: {
                    n14 = 51;
                    break;
                }
                case 60: {
                    n14 = 149;
                    break;
                }
                case 61: {
                    n14 = 131;
                    break;
                }
                case 62: {
                    n14 = 97;
                    break;
                }
                case 63: {
                    n14 = 98;
                    break;
                }
                case 64: {
                    n14 = 143;
                    break;
                }
                case 65: {
                    n14 = 216;
                    break;
                }
                case 66: {
                    n14 = 218;
                    break;
                }
                case 67: {
                    n14 = 155;
                    break;
                }
                case 68: {
                    n14 = 117;
                    break;
                }
                case 69: {
                    n14 = 203;
                    break;
                }
                case 70: {
                    n14 = 190;
                    break;
                }
                case 71: {
                    n14 = 179;
                    break;
                }
                case 72: {
                    n14 = 41;
                    break;
                }
                case 73: {
                    n14 = 50;
                    break;
                }
                case 74: {
                    n14 = 57;
                    break;
                }
                case 75: {
                    n14 = 24;
                    break;
                }
                case 76: {
                    n14 = 16;
                    break;
                }
                case 77: {
                    n14 = 83;
                    break;
                }
                case 78: {
                    n14 = 157;
                    break;
                }
                case 79: {
                    n14 = 147;
                    break;
                }
                case 80: {
                    n14 = 14;
                    break;
                }
                case 81: {
                    n14 = 42;
                    break;
                }
                case 82: {
                    n14 = 9;
                    break;
                }
                case 83: {
                    n14 = 137;
                    break;
                }
                case 84: {
                    n14 = 71;
                    break;
                }
                case 85: {
                    n14 = 192;
                    break;
                }
                case 86: {
                    n14 = 61;
                    break;
                }
                case 87: {
                    n14 = 104;
                    break;
                }
                case 88: {
                    n14 = 88;
                    break;
                }
                case 89: {
                    n14 = 52;
                    break;
                }
                case 90: {
                    n14 = 222;
                    break;
                }
                case 91: {
                    n14 = 73;
                    break;
                }
                case 92: {
                    n14 = 95;
                    break;
                }
                case 93: {
                    n14 = 248;
                    break;
                }
                case 94: {
                    n14 = 252;
                    break;
                }
                case 95: {
                    n14 = 209;
                    break;
                }
                case 96: {
                    n14 = 188;
                    break;
                }
                case 97: {
                    n14 = 124;
                    break;
                }
                case 98: {
                    n14 = 194;
                    break;
                }
                case 99: {
                    n14 = 67;
                    break;
                }
                case 100: {
                    n14 = 166;
                    break;
                }
                case 101: {
                    n14 = 21;
                    break;
                }
                case 102: {
                    n14 = 20;
                    break;
                }
                case 103: {
                    n14 = 245;
                    break;
                }
                case 104: {
                    n14 = 76;
                    break;
                }
                case 105: {
                    n14 = 13;
                    break;
                }
                case 106: {
                    n14 = 121;
                    break;
                }
                case 107: {
                    n14 = 150;
                    break;
                }
                case 108: {
                    n14 = 135;
                    break;
                }
                case 109: {
                    n14 = 239;
                    break;
                }
                case 110: {
                    n14 = 211;
                    break;
                }
                case 111: {
                    n14 = 56;
                    break;
                }
                case 112: {
                    n14 = 225;
                    break;
                }
                case 113: {
                    n14 = 160;
                    break;
                }
                case 114: {
                    n14 = 34;
                    break;
                }
                case 115: {
                    n14 = 26;
                    break;
                }
                case 116: {
                    n14 = 250;
                    break;
                }
                case 117: {
                    n14 = 7;
                    break;
                }
                case 118: {
                    n14 = 102;
                    break;
                }
                case 119: {
                    n14 = 110;
                    break;
                }
                case 120: {
                    n14 = 66;
                    break;
                }
                case 121: {
                    n14 = 90;
                    break;
                }
                case 122: {
                    n14 = 48;
                    break;
                }
                case 123: {
                    n14 = 19;
                    break;
                }
                case 124: {
                    n14 = 36;
                    break;
                }
                case 125: {
                    n14 = 85;
                    break;
                }
                case 126: {
                    n14 = 148;
                    break;
                }
                case 127: {
                    n14 = 234;
                    break;
                }
                case 128: {
                    n14 = 231;
                    break;
                }
                case 129: {
                    n14 = 177;
                    break;
                }
                case 130: {
                    n14 = 108;
                    break;
                }
                case 131: {
                    n14 = 82;
                    break;
                }
                case 132: {
                    n14 = 37;
                    break;
                }
                case 133: {
                    n14 = 25;
                    break;
                }
                case 134: {
                    n14 = 251;
                    break;
                }
                case 135: {
                    n14 = 176;
                    break;
                }
                case 136: {
                    n14 = 174;
                    break;
                }
                case 137: {
                    n14 = 40;
                    break;
                }
                case 138: {
                    n14 = 39;
                    break;
                }
                case 139: {
                    n14 = 164;
                    break;
                }
                case 140: {
                    n14 = 92;
                    break;
                }
                case 141: {
                    n14 = 144;
                    break;
                }
                case 142: {
                    n14 = 156;
                    break;
                }
                case 143: {
                    n14 = 43;
                    break;
                }
                case 144: {
                    n14 = 115;
                    break;
                }
                case 145: {
                    n14 = 228;
                    break;
                }
                case 146: {
                    n14 = 246;
                    break;
                }
                case 147: {
                    n14 = 27;
                    break;
                }
                case 148: {
                    n14 = 186;
                    break;
                }
                case 149: {
                    n14 = 163;
                    break;
                }
                case 150: {
                    n14 = 96;
                    break;
                }
                case 151: {
                    n14 = 180;
                    break;
                }
                case 152: {
                    n14 = 229;
                    break;
                }
                case 153: {
                    n14 = 127;
                    break;
                }
                case 154: {
                    n14 = 159;
                    break;
                }
                case 155: {
                    n14 = 173;
                    break;
                }
                case 156: {
                    n14 = 175;
                    break;
                }
                case 157: {
                    n14 = 247;
                    break;
                }
                case 158: {
                    n14 = 69;
                    break;
                }
                case 159: {
                    n14 = 4;
                    break;
                }
                case 160: {
                    n14 = 181;
                    break;
                }
                case 161: {
                    n14 = 15;
                    break;
                }
                case 162: {
                    n14 = 142;
                    break;
                }
                case 163: {
                    n14 = 10;
                    break;
                }
                case 164: {
                    n14 = 45;
                    break;
                }
                case 165: {
                    n14 = 65;
                    break;
                }
                case 166: {
                    n14 = 133;
                    break;
                }
                case 167: {
                    n14 = 206;
                    break;
                }
                case 168: {
                    n14 = 232;
                    break;
                }
                case 169: {
                    n14 = 53;
                    break;
                }
                case 170: {
                    n14 = 146;
                    break;
                }
                case 171: {
                    n14 = 152;
                    break;
                }
                case 172: {
                    n14 = 93;
                    break;
                }
                case 173: {
                    n14 = 54;
                    break;
                }
                case 174: {
                    n14 = 253;
                    break;
                }
                case 175: {
                    n14 = 2;
                    break;
                }
                case 176: {
                    n14 = 185;
                    break;
                }
                case 177: {
                    n14 = 112;
                    break;
                }
                case 178: {
                    n14 = 215;
                    break;
                }
                case 179: {
                    n14 = 220;
                    break;
                }
                case 180: {
                    n14 = 145;
                    break;
                }
                case 181: {
                    n14 = 243;
                    break;
                }
                case 182: {
                    n14 = 172;
                    break;
                }
                case 183: {
                    n14 = 79;
                    break;
                }
                case 184: {
                    n14 = 214;
                    break;
                }
                case 185: {
                    n14 = 141;
                    break;
                }
                case 186: {
                    n14 = 169;
                    break;
                }
                case 187: {
                    n14 = 240;
                    break;
                }
                case 188: {
                    n14 = 242;
                    break;
                }
                case 189: {
                    n14 = 199;
                    break;
                }
                case 190: {
                    n14 = 213;
                    break;
                }
                case 191: {
                    n14 = 244;
                    break;
                }
                case 192: {
                    n14 = 161;
                    break;
                }
                case 193: {
                    n14 = 106;
                    break;
                }
                case 194: {
                    n14 = 237;
                    break;
                }
                case 195: {
                    n14 = 33;
                    break;
                }
                case 196: {
                    n14 = 165;
                    break;
                }
                case 197: {
                    n14 = 114;
                    break;
                }
                case 198: {
                    n14 = 38;
                    break;
                }
                case 199: {
                    n14 = 219;
                    break;
                }
                case 200: {
                    n14 = 196;
                    break;
                }
                case 201: {
                    n14 = 101;
                    break;
                }
                case 202: {
                    n14 = 11;
                    break;
                }
                case 203: {
                    n14 = 81;
                    break;
                }
                case 204: {
                    n14 = 132;
                    break;
                }
                case 205: {
                    n14 = 74;
                    break;
                }
                case 206: {
                    n14 = 193;
                    break;
                }
                case 207: {
                    n14 = 187;
                    break;
                }
                case 208: {
                    n14 = 18;
                    break;
                }
                case 209: {
                    n14 = 8;
                    break;
                }
                case 210: {
                    n14 = 202;
                    break;
                }
                case 211: {
                    n14 = 123;
                    break;
                }
                case 212: {
                    n14 = 236;
                    break;
                }
                case 213: {
                    n14 = 136;
                    break;
                }
                case 214: {
                    n14 = 238;
                    break;
                }
                case 215: {
                    n14 = 60;
                    break;
                }
                case 216: {
                    n14 = 91;
                    break;
                }
                case 217: {
                    n14 = 78;
                    break;
                }
                case 218: {
                    n14 = 134;
                    break;
                }
                case 219: {
                    n14 = 125;
                    break;
                }
                case 220: {
                    n14 = 44;
                    break;
                }
                case 221: {
                    n14 = 59;
                    break;
                }
                case 222: {
                    n14 = 198;
                    break;
                }
                case 223: {
                    n14 = 205;
                    break;
                }
                case 224: {
                    n14 = 62;
                    break;
                }
                case 225: {
                    n14 = 68;
                    break;
                }
                case 226: {
                    n14 = 139;
                    break;
                }
                case 227: {
                    n14 = 75;
                    break;
                }
                case 228: {
                    n14 = 72;
                    break;
                }
                case 229: {
                    n14 = 46;
                    break;
                }
                case 230: {
                    n14 = 168;
                    break;
                }
                case 231: {
                    n14 = 109;
                    break;
                }
                case 232: {
                    n14 = 63;
                    break;
                }
                case 233: {
                    n14 = 116;
                    break;
                }
                case 234: {
                    n14 = 22;
                    break;
                }
                case 235: {
                    n14 = 197;
                    break;
                }
                case 236: {
                    n14 = 77;
                    break;
                }
                case 237: {
                    n14 = 89;
                    break;
                }
                case 238: {
                    n14 = 55;
                    break;
                }
                case 239: {
                    n14 = 130;
                    break;
                }
                case 240: {
                    n14 = 84;
                    break;
                }
                case 241: {
                    n14 = 64;
                    break;
                }
                case 242: {
                    n14 = 70;
                    break;
                }
                case 243: {
                    n14 = 227;
                    break;
                }
                case 244: {
                    n14 = 217;
                    break;
                }
                case 245: {
                    n14 = 126;
                    break;
                }
                case 246: {
                    n14 = 254;
                    break;
                }
                case 247: {
                    n14 = 99;
                    break;
                }
                case 248: {
                    n14 = 138;
                    break;
                }
                case 249: {
                    n14 = 118;
                    break;
                }
                case 250: {
                    n14 = 35;
                    break;
                }
                case 251: {
                    n14 = 200;
                    break;
                }
                case 252: {
                    n14 = 28;
                    break;
                }
                case 253: {
                    n14 = 129;
                    break;
                }
                case 254: {
                    n14 = 167;
                    break;
                }
                default: {
                    n14 = 47;
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
            com.C.O.h[n12] = new String(cArray).intern();
        }
        return h[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x68AF;
        if (k[n11] == null) {
            com.C.O.k[n11] = (int)(i[n11] ^ l2);
        }
        return k[n11];
    }
}

