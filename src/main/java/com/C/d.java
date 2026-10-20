/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.O;
import com.C.W;
import com.ia_2;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class d
extends O
implements ia_2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Boolean y(JPanel jPanel) {
        int[] nArray = com.C.W.B();
        boolean bl = this.F;
        if (nArray == null) {
            if (bl) {
                return null;
            }
            bl = false;
        }
        Boolean bl2 = bl;
        return bl2;
    }

    public void h(Graphics2D graphics2D, Rectangle rectangle, JPanel jPanel) {
        int[] nArray = com.C.W.B();
        d d2 = this;
        if (nArray == null) {
            if (d2.F && jPanel.isOpaque()) {
                graphics2D.setPaint(jPanel.getBackground());
                graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
            }
            d2 = this;
        }
        super.u(graphics2D, rectangle, jPanel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.h(graphics2D, rectangle, (JPanel)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.y((JPanel)jComponent);
    }
}

