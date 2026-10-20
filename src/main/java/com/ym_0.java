/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WZ;
import com._y_0;
import com.c;
import com.c.y_0;
import com.pe_1;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/*
 * Renamed from com.Ym
 */
class ym_0
extends y_0 {
    final _y_0 s;

    ym_0(_y_0 _y_02) {
        this.s = _y_02;
    }

    @Override
    protected void v(Graphics2D graphics2D, Rectangle rectangle) {
        WZ wZ = this.s.kj.f();
        int n10 = _y_0.M();
        if (wZ != null) {
            int n11 = this.s.e.getModel().getMaximum() - this.s.e.getModel().getMinimum();
            int n12 = Math.max(2, this.v.height / n11);
            Color color = (Color)TI.f;
            graphics2D.setColor(color);
            for (pe_1 pe_12 : wZ.B()) {
                int n13 = this.v.height * pe_12.s().r / n11;
                graphics2D.fillRect(this.v.x, this.v.y + n13, this.v.width, n12);
                if (n10 != 0) continue;
            }
        }
    }
}

