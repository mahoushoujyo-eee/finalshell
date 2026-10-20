/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ON;
import com.WR;
import com.cr_1;
import com.ky_2;
import com.lz_0;
import com.p6_0;
import com.pf_1;
import com.yp_0;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Y_
extends lz_0
implements WR {
    protected boolean N = false;
    protected boolean E = false;
    protected boolean J = true;
    protected boolean f;
    protected boolean r;
    protected boolean o;
    protected boolean P;
    protected boolean s;
    protected boolean R;
    protected boolean g;
    protected boolean K;
    protected int a;
    protected pf_1 h;
    protected pf_1 W;
    protected pf_1 v;
    protected pf_1 S;
    protected pf_1 n;
    protected pf_1 C;
    protected pf_1 Y;
    protected p6_0 x;
    protected boolean i;

    public Y_() {
        int n10 = yp_0.f();
        this.f = true;
        this.r = true;
        this.o = true;
        this.P = true;
        this.s = true;
        this.R = true;
        this.g = true;
        this.K = false;
        this.a = 0;
        this.h = null;
        this.W = null;
        this.v = null;
        this.S = null;
        this.n = null;
        this.C = null;
        this.Y = null;
        this.i = false;
        if (n10 != 0) {
            ky_2.K(new String[4]);
        }
    }

    @Override
    public void A(JComponent jComponent) {
        super.A(jComponent);
        this.x = new cr_1(this);
        ON.b(jComponent, this.x);
    }

    @Override
    public void X(JComponent jComponent) {
        ON.i(this.x);
        this.x = null;
        super.X(jComponent);
    }

    public boolean o() {
        return this.N;
    }

    public void O(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.T();
                y_ = this;
                if (n10 == 0) break block2;
                if (y_.N == bl) break block3;
                this.N = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean C() {
        return this.E;
    }

    public void V(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.f();
                y_ = this;
                if (n10 != 0) break block2;
                if (y_.E == bl) break block3;
                this.E = bl;
                y_ = this;
            }
            y_.l();
        }
    }

    public boolean K() {
        return this.J;
    }

    @Override
    public void D(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.T();
                y_ = this;
                if (n10 == 0) break block2;
                if (y_.J == bl) break block3;
                this.J = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean n() {
        return this.f;
    }

    @Override
    public void C(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.f();
                y_ = this;
                if (n10 != 0) break block2;
                if (y_.f == bl) break block3;
                this.f = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean F() {
        return this.r;
    }

    @Override
    public void p(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.f();
                y_ = this;
                if (n10 != 0) break block2;
                if (y_.r == bl) break block3;
                this.r = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean t() {
        return this.o;
    }

    @Override
    public void w(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.f();
                y_ = this;
                if (n10 != 0) break block2;
                if (y_.o == bl) break block3;
                this.o = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    @Override
    public void I(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        block4: {
            Y_ y_;
            block2: {
                block3: {
                    int n10 = yp_0.T();
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.J != bl) break block3;
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.f != bl2) break block3;
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.r != bl3) break block3;
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.o == bl4) break block4;
                }
                this.J = bl;
                this.f = bl2;
                this.r = bl3;
                this.o = bl4;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean B() {
        return this.P;
    }

    @Override
    public void X(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.f();
                y_ = this;
                if (n10 != 0) break block2;
                if (y_.P == bl) break block3;
                this.P = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean j() {
        return this.s;
    }

    @Override
    public void H(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.T();
                y_ = this;
                if (n10 == 0) break block2;
                if (y_.s == bl) break block3;
                this.s = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean q() {
        return this.R;
    }

    @Override
    public void B(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.f();
                y_ = this;
                if (n10 != 0) break block2;
                if (y_.R == bl) break block3;
                this.R = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean X() {
        return this.g;
    }

    @Override
    public void m(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.f();
                y_ = this;
                if (n10 != 0) break block2;
                if (y_.g == bl) break block3;
                this.g = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    @Override
    public void X(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        block4: {
            Y_ y_;
            block2: {
                block3: {
                    int n10 = yp_0.T();
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.P != bl) break block3;
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.s != bl2) break block3;
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.R != bl3) break block3;
                    y_ = this;
                    if (n10 == 0) break block2;
                    if (y_.g == bl4) break block4;
                }
                this.P = bl;
                this.s = bl2;
                this.R = bl3;
                this.g = bl4;
                y_ = this;
            }
            y_.Z();
        }
    }

    public boolean l() {
        return this.K;
    }

    public void E(boolean bl) {
        block3: {
            Y_ y_;
            block2: {
                int n10 = yp_0.T();
                y_ = this;
                if (n10 == 0) break block2;
                if (y_.K == bl) break block3;
                this.K = bl;
                y_ = this;
            }
            y_.Z();
        }
    }

    public int k() {
        return this.a;
    }

    public void v(int n10) {
        block3: {
            Y_ y_;
            block2: {
                int n11 = yp_0.T();
                y_ = this;
                if (n11 == 0) break block2;
                if (y_.a == n10) break block3;
                this.a = n10;
                y_ = this;
            }
            y_.Z();
        }
    }

    public pf_1 F() {
        return this.h;
    }

    public void T(pf_1 pf_12) {
        block3: {
            Y_ y_;
            block4: {
                block5: {
                    boolean bl;
                    int n10;
                    block2: {
                        this.h = pf_12;
                        n10 = yp_0.T();
                        bl = this.N;
                        if (n10 == 0) break block2;
                        if (bl) break block3;
                        y_ = this;
                        if (n10 == 0) break block4;
                        bl = y_.E;
                    }
                    if (!bl) break block5;
                    y_ = this;
                    if (n10 == 0) break block4;
                    if (y_.i) break block3;
                }
                y_ = this;
            }
            y_.Z();
        }
    }

    public pf_1 V() {
        return this.W;
    }

    public void G(pf_1 pf_12) {
        block3: {
            Y_ y_;
            block5: {
                boolean bl;
                block4: {
                    int n10;
                    block2: {
                        this.W = pf_12;
                        n10 = yp_0.T();
                        bl = this.N;
                        if (n10 == 0) break block2;
                        if (bl) break block3;
                        bl = this.E;
                    }
                    if (n10 == 0) break block4;
                    if (!bl) break block3;
                    y_ = this;
                    if (n10 == 0) break block5;
                    bl = y_.i;
                }
                if (!bl) break block3;
                y_ = this;
            }
            y_.Z();
        }
    }

    public pf_1 i() {
        return this.v;
    }

    public void s(pf_1 pf_12) {
        block3: {
            Y_ y_;
            block4: {
                boolean bl;
                block2: {
                    this.v = pf_12;
                    int n10 = yp_0.f();
                    bl = this.N;
                    if (n10 != 0) break block2;
                    if (bl) break block3;
                    y_ = this;
                    if (n10 != 0) break block4;
                    bl = y_.U();
                }
                if (!bl) break block3;
                y_ = this;
            }
            y_.Z();
        }
    }

    public pf_1 G() {
        return this.S;
    }

    public void P(pf_1 pf_12) {
        block3: {
            Y_ y_;
            block4: {
                boolean bl;
                block2: {
                    this.S = pf_12;
                    int n10 = yp_0.f();
                    bl = this.N;
                    if (n10 != 0) break block2;
                    if (bl) break block3;
                    y_ = this;
                    if (n10 != 0) break block4;
                    bl = y_.J();
                }
                if (!bl) break block3;
                y_ = this;
            }
            y_.Z();
        }
    }

    public pf_1 c() {
        return this.n;
    }

    public void D(pf_1 pf_12) {
        block3: {
            Y_ y_;
            block4: {
                boolean bl;
                block2: {
                    this.n = pf_12;
                    int n10 = yp_0.f();
                    bl = this.N;
                    if (n10 != 0) break block2;
                    if (bl) break block3;
                    y_ = this;
                    if (n10 != 0) break block4;
                    bl = y_.s();
                }
                if (!bl) break block3;
                y_ = this;
            }
            y_.Z();
        }
    }

    public pf_1 C() {
        return this.C;
    }

    public void n(pf_1 pf_12) {
        block3: {
            Y_ y_;
            block4: {
                boolean bl;
                block2: {
                    this.C = pf_12;
                    int n10 = yp_0.T();
                    bl = this.N;
                    if (n10 == 0) break block2;
                    if (bl) break block3;
                    y_ = this;
                    if (n10 == 0) break block4;
                    bl = y_.u();
                }
                if (!bl) break block3;
                y_ = this;
            }
            y_.Z();
        }
    }

    public pf_1 x() {
        return this.Y;
    }

    public void O(pf_1 pf_12) {
        block3: {
            Y_ y_;
            block4: {
                boolean bl;
                block2: {
                    this.Y = pf_12;
                    int n10 = yp_0.T();
                    bl = this.N;
                    if (n10 == 0) break block2;
                    if (bl) break block3;
                    y_ = this;
                    if (n10 == 0) break block4;
                    bl = y_.E();
                }
                if (!bl) break block3;
                y_ = this;
            }
            y_.Z();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Insets B(JComponent var1_1) {
        block8: {
            block9: {
                block18: {
                    block17: {
                        block15: {
                            block16: {
                                block13: {
                                    block14: {
                                        block11: {
                                            block12: {
                                                block10: {
                                                    var3_2 = this.J();
                                                    var2_3 = yp_0.f();
                                                    v0 = this;
                                                    if (var2_3 != 0) break block8;
                                                    if (v0.N) break block9;
                                                    v1 = var3_2;
                                                    if (var2_3 != 0) break block10;
                                                    if (v1 == null) break block9;
                                                    v1 = var3_2;
                                                }
                                                var4_4 = v1.U();
                                                v2 = this.J;
                                                if (var2_3 != 0) break block11;
                                                if (v2) break block12;
                                                var5_5 = this.K();
                                                if (!this.P) ** GOTO lbl-1000
                                                v3 = var5_5;
                                                if (var2_3 != 0) ** GOTO lbl21
                                                if (v3 != null) {
                                                    v3 = var5_5;
lbl21:
                                                    // 2 sources

                                                    v4 = v3.R().height;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    v4 = 0;
                                                }
                                                var4_4.top = v4 + this.a;
                                            }
                                            v2 = this.f;
                                        }
                                        if (var2_3 != 0) break block13;
                                        if (v2) break block14;
                                        var5_5 = this.L();
                                        if (!this.s) ** GOTO lbl-1000
                                        v5 = var5_5;
                                        if (var2_3 != 0) ** GOTO lbl36
                                        if (v5 != null) {
                                            v5 = var5_5;
lbl36:
                                            // 2 sources

                                            v6 = v5.R().width;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            v6 = 0;
                                        }
                                        var4_4.left = v6 + this.a;
                                    }
                                    v2 = this.r;
                                }
                                if (var2_3 != 0) break block15;
                                if (v2) break block16;
                                var5_5 = this.M();
                                if (!this.R) ** GOTO lbl-1000
                                v7 = var5_5;
                                if (var2_3 != 0) ** GOTO lbl51
                                if (v7 != null) {
                                    v7 = var5_5;
lbl51:
                                    // 2 sources

                                    v8 = v7.R().height;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    v8 = 0;
                                }
                                var4_4.bottom = v8 + this.a;
                            }
                            v9 = this;
                            if (var2_3 != 0) break block17;
                            v2 = v9.o;
                        }
                        if (v2) break block18;
                        v9 = this;
                    }
                    var5_5 = v9.h();
                    if (!this.g) ** GOTO lbl-1000
                    v10 = var5_5;
                    if (var2_3 != 0) ** GOTO lbl69
                    if (v10 != null) {
                        v10 = var5_5;
lbl69:
                        // 2 sources

                        v11 = v10.R().width;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v11 = 0;
                    }
                    var4_4.right = v11 + this.a;
                }
                return var4_4;
            }
            v0 = this;
        }
        return super.B(var1_1);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        block19: {
            pf_1 pf_12;
            Dimension dimension;
            pf_1 pf_13;
            block32: {
                Y_ y_;
                int n10;
                block31: {
                    boolean bl;
                    block28: {
                        block30: {
                            block29: {
                                block25: {
                                    Y_ y_3;
                                    block27: {
                                        block26: {
                                            block22: {
                                                Y_ y_4;
                                                block24: {
                                                    block23: {
                                                        block21: {
                                                            pf_1 pf_14;
                                                            pf_1 pf_15;
                                                            block20: {
                                                                Y_ y_5;
                                                                block18: {
                                                                    n10 = yp_0.f();
                                                                    y_5 = this;
                                                                    if (n10 != 0) break block18;
                                                                    if (y_5.N) break block19;
                                                                    y_5 = this;
                                                                }
                                                                pf_14 = pf_15 = y_5.J();
                                                                if (n10 != 0) break block20;
                                                                if (pf_14 == null) break block21;
                                                                pf_14 = pf_15;
                                                            }
                                                            pf_14.n(graphics2D, this.R(pf_15, rectangle, jComponent));
                                                        }
                                                        bl = this.J();
                                                        if (n10 != 0) break block22;
                                                        if (!bl) break block23;
                                                        y_4 = this;
                                                        if (n10 != 0) break block24;
                                                        pf_13 = y_4.K();
                                                        if (pf_13 != null) {
                                                            dimension = pf_13.R();
                                                            pf_13.l(graphics2D, rectangle.x, rectangle.y, rectangle.width, dimension.height);
                                                        }
                                                    }
                                                    y_4 = this;
                                                }
                                                bl = y_4.s();
                                            }
                                            if (n10 != 0) break block25;
                                            if (!bl) break block26;
                                            y_3 = this;
                                            if (n10 != 0) break block27;
                                            pf_13 = y_3.L();
                                            if (pf_13 != null) {
                                                dimension = pf_13.R();
                                                pf_13.l(graphics2D, rectangle.x, rectangle.y, dimension.width, rectangle.height);
                                            }
                                        }
                                        y_3 = this;
                                    }
                                    bl = y_3.u();
                                }
                                if (n10 != 0) break block28;
                                if (!bl) break block29;
                                y_ = this;
                                if (n10 != 0) break block30;
                                pf_13 = y_.M();
                                if (pf_13 != null) {
                                    dimension = pf_13.R();
                                    pf_13.l(graphics2D, rectangle.x, rectangle.y + rectangle.height - dimension.height, rectangle.width, dimension.height);
                                }
                            }
                            y_ = this;
                        }
                        if (n10 != 0) break block31;
                        bl = y_.E();
                    }
                    if (!bl) break block19;
                    y_ = this;
                }
                pf_12 = pf_13 = y_.h();
                if (n10 != 0) break block32;
                if (pf_12 == null) break block19;
                pf_12 = pf_13;
            }
            dimension = pf_12.R();
            pf_13.l(graphics2D, rectangle.x + rectangle.width - dimension.width, rectangle.y, dimension.width, rectangle.height);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected pf_1 J() {
        var1_1 = yp_0.f();
        v0 = this;
        if (var1_1 != 0) ** GOTO lbl12
        if (!v0.i) ** GOTO lbl-1000
        v0 = this;
        if (var1_1 == 0) {
            ** if (v0.W == null) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = this.W;
                ** GOTO lbl13
            }
        }
        ** GOTO lbl12
lbl-1000:
        // 2 sources

        {
            v0 = this;
lbl12:
            // 3 sources

            v1 = v0.h;
        }
lbl13:
        // 2 sources

        return v1;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected pf_1 K() {
        pf_1 pf_12;
        int n10 = yp_0.T();
        Y_ y_ = this;
        if (n10 != 0) {
            if (y_.S != null) {
                pf_12 = this.S;
                return pf_12;
            }
            y_ = this;
        }
        pf_12 = y_.v;
        return pf_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected pf_1 L() {
        pf_1 pf_12;
        int n10 = yp_0.T();
        Y_ y_ = this;
        if (n10 != 0) {
            if (y_.n != null) {
                pf_12 = this.n;
                return pf_12;
            }
            y_ = this;
        }
        pf_12 = y_.v;
        return pf_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected pf_1 M() {
        pf_1 pf_12;
        int n10 = yp_0.f();
        Y_ y_ = this;
        if (n10 == 0) {
            if (y_.C != null) {
                pf_12 = this.C;
                return pf_12;
            }
            y_ = this;
        }
        pf_12 = y_.v;
        return pf_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected pf_1 h() {
        pf_1 pf_12;
        int n10 = yp_0.f();
        Y_ y_ = this;
        if (n10 == 0) {
            if (y_.Y != null) {
                pf_12 = this.Y;
                return pf_12;
            }
            y_ = this;
        }
        pf_12 = y_.v;
        return pf_12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean U() {
        int n10 = yp_0.f();
        boolean bl = this.J();
        if (n10 != 0) return bl;
        if (bl) return true;
        bl = this.s();
        if (n10 != 0) return bl;
        if (bl) return true;
        bl = this.u();
        if (n10 != 0) return bl;
        if (bl) return true;
        bl = this.E();
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean J() {
        int n10 = yp_0.f();
        boolean bl = this.J;
        if (n10 == 0) {
            if (bl) return false;
            bl = this.P;
        }
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean s() {
        int n10 = yp_0.f();
        boolean bl = this.f;
        if (n10 == 0) {
            if (bl) return false;
            bl = this.s;
        }
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean u() {
        int n10 = yp_0.f();
        boolean bl = this.r;
        if (n10 == 0) {
            if (bl) return false;
            bl = this.R;
        }
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean E() {
        int n10 = yp_0.f();
        boolean bl = this.o;
        if (n10 == 0) {
            if (bl) return false;
            bl = this.g;
        }
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    protected Rectangle R(pf_1 pf_12, Rectangle rectangle, JComponent jComponent) {
        int n10 = yp_0.f();
        if (!this.N && pf_12 != null) {
            Insets insets = this.K ? pf_12.U() : pf_12.x();
            int n11 = this.J;
            if (n10 == 0) {
                n11 = n11 != 0 ? 0 : insets.top;
            }
            int n12 = n11;
            int n13 = this.f;
            if (n10 == 0) {
                n13 = n13 != 0 ? 0 : insets.left;
            }
            int n14 = n13;
            int n15 = this.r;
            if (n10 == 0) {
                n15 = n15 != 0 ? 0 : insets.bottom;
            }
            int n16 = n15;
            int n17 = this.o;
            if (n10 == 0) {
                n17 = n17 != 0 ? 0 : insets.right;
            }
            int n18 = n17;
            return new Rectangle(rectangle.x - n14, rectangle.y - n12, rectangle.width + n14 + n18, rectangle.height + n12 + n16);
        }
        return rectangle;
    }
}

