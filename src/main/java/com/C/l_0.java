/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.W;
import com.E;
import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JComponent;

/*
 * Renamed from com.C.l
 */
class l_0
implements E {
    final JComponent u;
    final Dimension M;
    final boolean m;
    final W V;

    l_0(W w2, JComponent jComponent, Dimension dimension, boolean bl) {
        this.V = w2;
        this.u = jComponent;
        this.M = dimension;
        this.m = bl;
    }

    public Shape H() {
        return this.V.G(this.u, this.M, this.m);
    }

    @Override
    public Object J() {
        return this.H();
    }
}

