/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.ds_0;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;

class TF
implements E {
    private Rectangle b;
    final Component U;
    final E e;
    final ds_0 d;

    TF(ds_0 ds_02, Component component, E e2) {
        this.d = ds_02;
        this.U = component;
        this.e = e2;
        this.b = new Rectangle();
    }

    public Rectangle Q() {
        int[] nArray = ds_0.U();
        TF tF = this;
        if (nArray == null) {
            if (tF.U.isShowing()) {
                Rectangle rectangle = (Rectangle)this.e.J();
                Point point = this.U.getLocationOnScreen();
                this.b = new Rectangle(point.x + rectangle.x, point.y + rectangle.y, rectangle.width, rectangle.height);
            }
            tF = this;
        }
        return tF.b;
    }

    @Override
    public Object J() {
        return this.Q();
    }
}

