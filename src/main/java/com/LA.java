/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FT;
import com.RV;
import com.lz_0;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

public class LA
extends lz_0 {
    protected int i = FT.T;
    protected int w = FT.y;
    protected Color L = FT.q;
    protected Stroke h = null;

    public LA() {
        this.p();
    }

    public LA(int n10) {
        this.i = n10;
    }

    public LA(Color color) {
        this.L = color;
        this.p();
    }

    public LA(int n10, Color color) {
        this.i = n10;
        this.L = color;
    }

    public int a() {
        return this.i;
    }

    public void O(int n10) {
        this.i = n10;
        this.p();
        this.Z();
    }

    public int t() {
        return this.w;
    }

    public void F(int n10) {
        this.w = n10;
        this.p();
        this.l();
    }

    public Color s() {
        return this.L;
    }

    public void r(Color color) {
        this.L = color;
        this.l();
    }

    public Stroke C() {
        return this.h;
    }

    public void x(Stroke stroke) {
        this.h = stroke;
        this.l();
    }

    protected void p() {
        this.h = new BasicStroke(this.a(), 1, 1);
    }

    @Override
    public Dimension d(JComponent jComponent) {
        return new Dimension(Math.max(this.i * 2, this.w * 2), Math.max(this.i * 2, this.w * 2));
    }

    @Override
    public Insets B(JComponent jComponent) {
        Insets insets = super.B(jComponent);
        return new Insets(insets.top + this.i, insets.left + this.i, insets.bottom + this.i, insets.right + this.i);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        block3: {
            Object object;
            block5: {
                LA lA;
                int[] nArray;
                block4: {
                    block2: {
                        nArray = lz_0.M();
                        lA = this;
                        if (nArray != null) break block2;
                        if (lA.i <= 0) break block3;
                        lA = this;
                    }
                    if (nArray != null) break block4;
                    if (lA.h == null) break block3;
                    lA = this;
                }
                object = lA.L;
                if (nArray != null) break block5;
                if (object == null) break block3;
                object = RV.X(graphics2D);
            }
            Color color = object;
            Stroke stroke = RV.d(graphics2D, this.h, this.h != null);
            graphics2D.setPaint(this.L);
            graphics2D.draw(this.v(rectangle));
            RV.t(graphics2D, stroke, this.h != null);
            RV.X(graphics2D, color);
        }
    }

    /*
     * Unable to fully structure code
     */
    protected RectangularShape v(Rectangle var1_1) {
        var2_2 = lz_0.M();
        v0 = this.i;
        if (var2_2 != null) ** GOTO lbl8
        if (v0 == 1) {
            v1 = 0.0;
        } else {
            v0 = this.i;
lbl8:
            // 2 sources

            v1 = var3_3 = (double)v0 / 2.0;
        }
        if (this.w > 0) {
            return new RoundRectangle2D.Double((double)var1_1.x + var3_3, (double)var1_1.y + var3_3, (double)var1_1.width - var3_3 * 2.0 - 1.0, (double)var1_1.height - var3_3 * 2.0 - 1.0, this.w * 2, this.w * 2);
        }
        return new Rectangle2D.Double((double)var1_1.x + var3_3, (double)var1_1.y + var3_3, (double)var1_1.width - var3_3 * 2.0 - 1.0, (double)var1_1.height - var3_3 * 2.0 - 1.0);
    }
}

