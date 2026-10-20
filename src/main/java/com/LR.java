/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O_;
import com.YM;
import com.lz_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

class LR
extends lz_0 {
    final YM P;

    LR(YM yM) {
        this.P = yM;
    }

    public Insets D(O_ o_) {
        return new Insets(0, 2, 2, 2);
    }

    public void g(Graphics2D graphics2D, Rectangle rectangle, O_ o_) {
        graphics2D.setPaint(Color.BLACK);
        graphics2D.drawRect(rectangle.x, rectangle.y - 1, rectangle.width - 1, rectangle.height);
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.D((O_)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.g(graphics2D, rectangle, (O_)jComponent);
    }
}

