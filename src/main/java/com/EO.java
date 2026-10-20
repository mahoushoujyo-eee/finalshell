/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com._y_0;
import java.awt.Rectangle;

class EO
implements E {
    final _y_0 J;

    EO(_y_0 _y_02) {
        this.J = _y_02;
    }

    public Rectangle I() {
        return new Rectangle(0, 0, _y_0.j(this.J).getWidth(), _y_0.j(this.J).getHeight());
    }

    @Override
    public Object J() {
        return this.I();
    }
}

