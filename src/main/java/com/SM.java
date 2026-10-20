/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XL;
import com.XW;
import com.du_0;
import com.gw_0;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SM
implements ActionListener {
    final XW r;
    final XL g;

    SM(XL xL2, XW xW2) {
        this.g = xL2;
        this.r = xW2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        boolean bl = du_0.W();
        for (int i2 = 0; i2 < XL.I(this.g); ++i2) {
            XL xL2 = this.g;
            if (!bl) {
                if (XL.X(xL2).size() > 0) {
                    int n10 = gw_0.K(XL.X(this.g).size());
                    Point point = (Point)XL.X(this.g).remove(n10);
                    int[] nArray = XL.Q(this.g)[point.x];
                    int n11 = point.y;
                    nArray[n11] = nArray[n11] + XL.K(this.g);
                    this.r.repaint();
                    if (!bl) continue;
                }
                xL2 = this.g;
            }
            XL.h(xL2).Y();
            if (!bl) continue;
        }
    }
}

