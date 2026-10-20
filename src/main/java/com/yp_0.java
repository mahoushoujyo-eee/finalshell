/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ON;
import com.c.v_0;
import com.cp_1;
import com.p6_0;
import com.pf_1;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Renamed from com.Yp
 */
public class yp_0
extends v_0 {
    protected boolean J = false;
    protected boolean s = false;
    protected pf_1 b = null;
    protected pf_1 R = null;
    protected p6_0 u;
    protected boolean G = false;
    private static int X;

    public yp_0() {
    }

    public yp_0(pf_1 pf_12) {
        this.s(pf_12);
    }

    public yp_0(pf_1 pf_12, pf_1 pf_13) {
        this.s(pf_12);
        this.x(pf_13);
    }

    public void v(JLabel jLabel) {
        super.A(jLabel);
        this.u = new cp_1(this);
        ON.b(jLabel, this.u);
    }

    public void B(JLabel jLabel) {
        ON.i(this.u);
        this.u = null;
        super.X(jLabel);
    }

    public boolean k() {
        return this.J;
    }

    public void s(boolean bl) {
        block3: {
            yp_0 yp_02;
            block2: {
                int n10 = yp_0.T();
                yp_02 = this;
                if (n10 == 0) break block2;
                if (yp_02.J == bl) break block3;
                this.J = bl;
                yp_02 = this;
            }
            yp_02.Z();
        }
    }

    public boolean e() {
        return this.s;
    }

    public void S(boolean bl) {
        block3: {
            yp_0 yp_02;
            block2: {
                int n10 = yp_0.T();
                yp_02 = this;
                if (n10 == 0) break block2;
                if (yp_02.s == bl) break block3;
                this.s = bl;
                yp_02 = this;
            }
            yp_02.Z();
        }
    }

    public pf_1 b() {
        return this.b;
    }

    public void s(pf_1 pf_12) {
        block3: {
            yp_0 yp_02;
            block4: {
                block5: {
                    boolean bl;
                    int n10;
                    block2: {
                        this.b = pf_12;
                        n10 = yp_0.T();
                        bl = this.J;
                        if (n10 == 0) break block2;
                        if (bl) break block3;
                        yp_02 = this;
                        if (n10 == 0) break block4;
                        bl = yp_02.s;
                    }
                    if (!bl) break block5;
                    yp_02 = this;
                    if (n10 == 0) break block4;
                    if (yp_02.G) break block3;
                }
                yp_02 = this;
            }
            yp_02.Z();
        }
    }

    public pf_1 v() {
        return this.R;
    }

    public void x(pf_1 pf_12) {
        block3: {
            yp_0 yp_02;
            block5: {
                boolean bl;
                block4: {
                    int n10;
                    block2: {
                        this.R = pf_12;
                        n10 = yp_0.f();
                        bl = this.J;
                        if (n10 != 0) break block2;
                        if (bl) break block3;
                        bl = this.s;
                    }
                    if (n10 != 0) break block4;
                    if (!bl) break block3;
                    yp_02 = this;
                    if (n10 != 0) break block5;
                    bl = yp_02.G;
                }
                if (!bl) break block3;
                yp_02 = this;
            }
            yp_02.Z();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Insets Q(JLabel jLabel) {
        Insets insets;
        yp_0 yp_02;
        block2: {
            block3: {
                pf_1 pf_12;
                block4: {
                    pf_1 pf_13 = this.Q();
                    int n10 = yp_0.T();
                    yp_02 = this;
                    if (n10 == 0) break block2;
                    if (yp_02.J) break block3;
                    pf_12 = pf_13;
                    if (n10 == 0) break block4;
                    if (pf_12 == null) break block3;
                    pf_12 = pf_13;
                }
                insets = pf_12.U();
                return insets;
            }
            yp_02 = this;
        }
        insets = super.Q(jLabel);
        return insets;
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JLabel jLabel) {
        block9: {
            yp_0 yp_02;
            block7: {
                block8: {
                    boolean bl;
                    int n10;
                    block5: {
                        block6: {
                            n10 = yp_0.T();
                            bl = this.J;
                            if (n10 == 0) break block5;
                            if (!bl) break block6;
                            bl = jLabel.isOpaque();
                            if (n10 == 0) break block5;
                            if (bl) {
                                graphics2D.setPaint(jLabel.getBackground());
                                graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
                            }
                        }
                        yp_02 = this;
                        if (n10 == 0) break block7;
                        bl = yp_02.J;
                    }
                    if (bl) break block8;
                    pf_1 pf_12 = this.Q();
                    if (n10 == 0) break block9;
                    if (pf_12 != null) {
                        pf_12.n(graphics2D, rectangle);
                    }
                }
                yp_02 = this;
            }
            super.u(graphics2D, rectangle, jLabel);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected pf_1 Q() {
        var1_1 = yp_0.f();
        v0 = this;
        if (var1_1 != 0) ** GOTO lbl12
        if (!v0.G) ** GOTO lbl-1000
        v0 = this;
        if (var1_1 == 0) {
            ** if (v0.R == null) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = this.R;
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

            v1 = v0.b;
        }
lbl13:
        // 2 sources

        return v1;
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.u(graphics2D, rectangle, (JLabel)jComponent);
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.Q((JLabel)jComponent);
    }

    @Override
    public void X(JComponent jComponent) {
        this.B((JLabel)jComponent);
    }

    @Override
    public void A(JComponent jComponent) {
        this.v((JLabel)jComponent);
    }

    public static void u(int n10) {
        X = n10;
    }

    public static int T() {
        return X;
    }

    public static int f() {
        int n10 = yp_0.T();
        if (n10 == 0) {
            return 91;
        }
        return 0;
    }

    static {
        if (yp_0.T() == 0) {
            yp_0.u(44);
        }
    }
}

