/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WZ;
import com._y_0;
import com.lg_1;
import com.pe_1;
import com.xf_1;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Objects;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

class aF
extends BasicScrollBarUI {
    final _y_0 t;

    private aF(_y_0 _y_02) {
        this.t = _y_02;
    }

    @Override
    protected void paintTrack(Graphics graphics, JComponent jComponent, Rectangle rectangle) {
        int n10 = _y_0.y();
        super.paintTrack(graphics, jComponent, rectangle);
        int n11 = n10;
        WZ wZ = this.t.kj.f();
        if (wZ != null) {
            int n12 = this.scrollbar.getModel().getMaximum() - this.scrollbar.getModel().getMinimum();
            int n13 = Math.max(2, rectangle.height / n12);
            xf_1 xf_12 = this.t.kC.M().o(Objects.requireNonNull(this.t.kC.i().s()));
            graphics.setColor(lg_1.H(xf_12));
            for (pe_1 pe_12 : wZ.B()) {
                int n14 = rectangle.height * pe_12.s().r / n12;
                graphics.fillRect(rectangle.x, rectangle.y + n14, rectangle.width, n13);
                if (n11 == 0) continue;
            }
        }
    }
}

