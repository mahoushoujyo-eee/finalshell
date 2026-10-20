/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.X;
import com.t.d_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class R
extends MouseAdapter {
    final X n;

    private R(X x10) {
        this.n = x10;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.F(mouseEvent.getY());
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.F(mouseEvent.getY());
    }

    private void F(int n10) {
        X.B(this.n, Math.round(360.0f * ((float)(n10 - 5) / (float)(X.E(this.n).getHeight() - 4))), true);
    }

    R(X x10, d_1 d_12) {
        this(x10);
    }
}

