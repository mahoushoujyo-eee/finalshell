/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ON;
import com.c.y_0;
import com.cw_2;
import com.ky_2;
import com.p6_0;
import com.pf_1;
import com.yp_0;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

public class YG
extends y_0 {
    protected pf_1 y = null;
    protected pf_1 T = null;
    protected pf_1 E = null;
    protected pf_1 f = null;
    protected pf_1 w;
    protected pf_1 s;
    protected pf_1 S;
    protected pf_1 A;
    protected pf_1 X;
    protected pf_1 r;
    protected pf_1 g;
    protected pf_1 I;
    protected pf_1 M;
    protected pf_1 u;
    protected p6_0 N;
    protected boolean P;

    public YG() {
        int n10 = yp_0.f();
        this.w = null;
        this.s = null;
        this.S = null;
        this.A = null;
        this.X = null;
        this.r = null;
        this.g = null;
        this.I = null;
        this.M = null;
        this.u = null;
        this.P = false;
        if (ky_2.F() != null) {
            yp_0.u(++n10);
        }
    }

    @Override
    public void T(JScrollBar jScrollBar) {
        super.T(jScrollBar);
        this.Y = false;
        this.N = new cw_2(this);
        ON.b(jScrollBar, this.N);
    }

    @Override
    public void C(JScrollBar jScrollBar) {
        ON.i(this.N);
        this.N = null;
        super.C(jScrollBar);
    }

    public pf_1 M() {
        return this.y;
    }

    public void B(pf_1 pf_12) {
        this.y = pf_12;
    }

    public pf_1 q() {
        return this.T;
    }

    public void D(pf_1 pf_12) {
        this.T = pf_12;
    }

    public pf_1 f() {
        return this.E;
    }

    public void P(pf_1 pf_12) {
        this.E = pf_12;
    }

    public pf_1 g() {
        return this.f;
    }

    public void X(pf_1 pf_12) {
        this.f = pf_12;
    }

    public pf_1 J() {
        return this.w;
    }

    public void t(pf_1 pf_12) {
        this.w = pf_12;
    }

    public pf_1 y() {
        return this.s;
    }

    public void C(pf_1 pf_12) {
        this.s = pf_12;
    }

    public pf_1 Q() {
        return this.S;
    }

    public void N(pf_1 pf_12) {
        this.S = pf_12;
    }

    public pf_1 i() {
        return this.A;
    }

    public void J(pf_1 pf_12) {
        this.A = pf_12;
    }

    public pf_1 R() {
        return this.X;
    }

    public void U(pf_1 pf_12) {
        this.X = pf_12;
    }

    public pf_1 d() {
        return this.r;
    }

    public void Z(pf_1 pf_12) {
        this.r = pf_12;
    }

    public pf_1 C() {
        return this.g;
    }

    public void I(pf_1 pf_12) {
        this.g = pf_12;
    }

    public pf_1 a() {
        return this.I;
    }

    public void L(pf_1 pf_12) {
        this.I = pf_12;
    }

    public pf_1 H() {
        return this.M;
    }

    public void k(pf_1 pf_12) {
        this.M = pf_12;
    }

    public pf_1 I() {
        return this.u;
    }

    public void h(pf_1 pf_12) {
        this.u = pf_12;
    }

    @Override
    protected void O(Graphics2D graphics2D, JScrollBar jScrollBar, Rectangle rectangle) {
        block3: {
            pf_1 pf_12;
            block4: {
                pf_1 pf_13;
                YG yG;
                int n10;
                block2: {
                    n10 = yp_0.T();
                    yG = this;
                    if (n10 == 0) break block2;
                    if (!yG.q) break block3;
                    yG = this;
                }
                pf_12 = pf_13 = yG.H(jScrollBar);
                if (n10 == 0) break block4;
                if (pf_12 == null) break block3;
                pf_12 = pf_13;
            }
            pf_12.n(graphics2D, rectangle);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected pf_1 H(JScrollBar var1_1) {
        block6: {
            block7: {
                var2_2 = yp_0.f();
                v0 = var1_1.getOrientation();
                if (var2_2 != 0) break block6;
                if (v0 != 0) break block7;
                v1 = this;
                if (var2_2 != 0) ** GOTO lbl15
                if (!v1.P) ** GOTO lbl-1000
                v1 = this;
                if (var2_2 == 0) {
                    ** if (v1.T == null) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        v2 = this.T;
                        ** GOTO lbl16
                    }
                }
                ** GOTO lbl15
lbl-1000:
                // 2 sources

                {
                    v1 = this;
lbl15:
                    // 3 sources

                    v2 = v1.y;
                }
lbl16:
                // 2 sources

                return v2;
            }
            v3 = this;
            if (var2_2 != 0) ** GOTO lbl30
            v0 = (int)v3.P;
        }
        if (v0 == 0) ** GOTO lbl-1000
        v3 = this;
        if (var2_2 == 0) {
            ** if (v3.X == null) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v4 = this.X;
                ** GOTO lbl31
            }
        }
        ** GOTO lbl30
lbl-1000:
        // 2 sources

        {
            v3 = this;
lbl30:
            // 3 sources

            v4 = v3.A;
        }
lbl31:
        // 2 sources

        return v4;
    }

    @Override
    protected void Z(Graphics2D graphics2D, JScrollBar jScrollBar, Rectangle rectangle) {
        block3: {
            pf_1 pf_12;
            block4: {
                pf_1 pf_13;
                YG yG;
                int n10;
                block2: {
                    n10 = yp_0.T();
                    yG = this;
                    if (n10 == 0) break block2;
                    if (!yG.q) break block3;
                    yG = this;
                }
                pf_12 = pf_13 = yG.x(jScrollBar);
                if (n10 == 0) break block4;
                if (pf_12 == null) break block3;
                pf_12 = pf_13;
            }
            pf_12.n(graphics2D, rectangle);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected pf_1 x(JScrollBar var1_1) {
        block6: {
            block7: {
                var2_2 = yp_0.T();
                v0 = var1_1.getOrientation();
                if (var2_2 == 0) break block6;
                if (v0 != 0) break block7;
                v1 = this;
                if (var2_2 == 0) ** GOTO lbl15
                if (!v1.P) ** GOTO lbl-1000
                v1 = this;
                if (var2_2 != 0) {
                    ** if (v1.f == null) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        v2 = this.f;
                        ** GOTO lbl16
                    }
                }
                ** GOTO lbl15
lbl-1000:
                // 2 sources

                {
                    v1 = this;
lbl15:
                    // 3 sources

                    v2 = v1.E;
                }
lbl16:
                // 2 sources

                return v2;
            }
            v3 = this;
            if (var2_2 == 0) ** GOTO lbl30
            v0 = (int)v3.P;
        }
        if (v0 == 0) ** GOTO lbl-1000
        v3 = this;
        if (var2_2 != 0) {
            ** if (v3.g == null) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v4 = this.g;
                ** GOTO lbl31
            }
        }
        ** GOTO lbl30
lbl-1000:
        // 2 sources

        {
            v3 = this;
lbl30:
            // 3 sources

            v4 = v3.r;
        }
lbl31:
        // 2 sources

        return v4;
    }

    @Override
    protected void E(Graphics2D graphics2D, JScrollBar jScrollBar, Rectangle rectangle) {
        pf_1 pf_12 = this.Q(jScrollBar);
        if (pf_12 != null) {
            Insets insets = this.v(jScrollBar);
            pf_12.l(graphics2D, rectangle.x + insets.left, rectangle.y + insets.top, rectangle.width - insets.left - insets.right, rectangle.height - insets.top - insets.bottom);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected pf_1 Q(JScrollBar var1_1) {
        block19: {
            block16: {
                block18: {
                    block17: {
                        block14: {
                            block15: {
                                block6: {
                                    block7: {
                                        block13: {
                                            block10: {
                                                block12: {
                                                    block11: {
                                                        block8: {
                                                            block9: {
                                                                var2_2 = yp_0.f();
                                                                v0 = var1_1.getOrientation();
                                                                if (var2_2 != 0) break block6;
                                                                if (v0 != 0) break block7;
                                                                v1 = this;
                                                                if (var2_2 != 0) break block8;
                                                                if (v1.p) break block9;
                                                                v2 = this.L;
                                                                if (var2_2 != 0) break block10;
                                                                if (!v2) break block11;
                                                            }
                                                            v1 = this;
                                                        }
                                                        if (var2_2 != 0) break block12;
                                                        if (v1.S == null) break block11;
                                                        v3 = this.S;
                                                        break block13;
                                                    }
                                                    v1 = this;
                                                }
                                                if (var2_2 != 0) ** GOTO lbl32
                                                v2 = v1.P;
                                            }
                                            if (!v2) ** GOTO lbl-1000
                                            v1 = this;
                                            if (var2_2 == 0) {
                                                ** if (v1.T == null) goto lbl-1000
lbl-1000:
                                                // 1 sources

                                                {
                                                    v3 = this.s;
                                                    ** GOTO lbl33
                                                }
                                            }
                                            ** GOTO lbl32
lbl-1000:
                                            // 2 sources

                                            {
                                                v1 = this;
lbl32:
                                                // 3 sources

                                                v3 = v1.w;
                                            }
                                        }
                                        return v3;
                                    }
                                    v4 = this;
                                    if (var2_2 != 0) break block14;
                                    v0 = (int)v4.p;
                                }
                                if (v0 != 0) break block15;
                                v5 = this.L;
                                if (var2_2 != 0) break block16;
                                if (!v5) break block17;
                            }
                            v4 = this;
                        }
                        if (var2_2 != 0) break block18;
                        if (v4.u == null) break block17;
                        v6 = this.u;
                        break block19;
                    }
                    v4 = this;
                }
                if (var2_2 != 0) ** GOTO lbl65
                v5 = v4.P;
            }
            if (!v5) ** GOTO lbl-1000
            v4 = this;
            if (var2_2 == 0) {
                ** if (v4.X == null) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    v6 = this.M;
                    ** GOTO lbl66
                }
            }
            ** GOTO lbl65
lbl-1000:
            // 2 sources

            {
                v4 = this;
lbl65:
                // 3 sources

                v6 = v4.I;
            }
        }
        return v6;
    }

    @Override
    public void X(JComponent jComponent) {
        this.C((JScrollBar)jComponent);
    }

    @Override
    public void A(JComponent jComponent) {
        this.T((JScrollBar)jComponent);
    }
}

