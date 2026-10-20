/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.E;
import com.c.g_0;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.AbstractButton;

class R
implements E {
    final Rectangle v;
    final AbstractButton m;
    final g_0 N;

    R(g_0 g_02, Rectangle rectangle, AbstractButton abstractButton) {
        this.N = g_02;
        this.v = rectangle;
        this.m = abstractButton;
    }

    public Shape H() {
        return this.N.d(this.v, this.m);
    }

    @Override
    public Object J() {
        return this.H();
    }
}

