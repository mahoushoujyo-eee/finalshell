/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.Y_;
import com.ia_2;
import com.yp_0;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

/*
 * Renamed from com.Yv
 */
public class yv_0
extends Y_
implements ia_2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Boolean U(JPanel jPanel) {
        int n10 = yp_0.f();
        boolean bl = this.N;
        if (n10 == 0) {
            if (bl) {
                return null;
            }
            bl = false;
        }
        Boolean bl2 = bl;
        return bl2;
    }

    public void q(Graphics2D graphics2D, Rectangle rectangle, JPanel jPanel) {
        int n10 = yp_0.T();
        yv_0 yv_02 = this;
        if (n10 != 0) {
            if (yv_02.N && jPanel.isOpaque()) {
                graphics2D.setPaint(jPanel.getBackground());
                graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
            }
            yv_02 = this;
        }
        super.u(graphics2D, rectangle, jPanel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.q(graphics2D, rectangle, (JPanel)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.U((JPanel)jComponent);
    }
}

