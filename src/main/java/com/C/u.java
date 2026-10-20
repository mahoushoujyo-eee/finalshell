/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.E;
import java.awt.Dimension;
import java.awt.Shape;
import javax.swing.JComponent;

class u
implements E {
    final JComponent v;
    final Dimension C;
    final boolean U;
    final W p;

    u(W w2, JComponent jComponent, Dimension dimension, boolean bl) {
        this.p = w2;
        this.v = jComponent;
        this.C = dimension;
        this.U = bl;
    }

    public Shape Z() {
        return this.p.a(this.v, this.C, this.U);
    }

    @Override
    public Object J() {
        return this.Z();
    }
}

