/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.E;
import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JComponent;

class K
implements E {
    final JComponent d;
    final Dimension S;
    final boolean V;
    final W t;

    K(W w2, JComponent jComponent, Dimension dimension, boolean bl) {
        this.t = w2;
        this.d = jComponent;
        this.S = dimension;
        this.V = bl;
    }

    public Shape y() {
        return this.t.E(this.d, this.S, this.V);
    }

    @Override
    public Object J() {
        return this.y();
    }
}

