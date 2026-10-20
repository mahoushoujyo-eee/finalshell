/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.W;
import com.L.E;
import com.L.U;
import com.OP;
import com.c.v_0;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Renamed from com.C.k
 */
public class k_0
extends v_0 {
    protected Color q = OP.I;
    protected Color W = OP.x;

    public Color j() {
        return this.q;
    }

    public void C(Color color) {
        this.q = color;
    }

    public Color M() {
        return this.W;
    }

    public void c(Color color) {
        this.W = color;
    }

    public void j(Graphics2D graphics2D, Rectangle rectangle, U u10) {
        block4: {
            block5: {
                U u11;
                int[] nArray;
                block2: {
                    block3: {
                        nArray = com.C.W.B();
                        u11 = u10;
                        if (nArray != null) break block2;
                        if (u11.T() != E.box) break block3;
                        this.f(graphics2D, rectangle, u10);
                        if (nArray == null) break block4;
                    }
                    u11 = u10;
                }
                if (!u11.J()) break block5;
                this.v(graphics2D, rectangle, u10);
                if (nArray == null) break block4;
            }
            this.k(graphics2D, rectangle, u10);
        }
        super.u(graphics2D, rectangle, u10);
    }

    protected void f(Graphics2D graphics2D, Rectangle rectangle, U u10) {
    }

    protected void v(Graphics2D graphics2D, Rectangle rectangle, U u10) {
        graphics2D.setPaint(new GradientPaint(0.0f, rectangle.y, this.q, 0.0f, rectangle.y + rectangle.height, this.W));
        graphics2D.fillRect(0, 0, u10.getWidth(), u10.getHeight());
    }

    protected void k(Graphics2D graphics2D, Rectangle rectangle, U u10) {
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JLabel jLabel) {
        this.j(graphics2D, rectangle, (U)jLabel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.j(graphics2D, rectangle, (U)jComponent);
    }
}

