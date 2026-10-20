/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._n_0;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class SD
implements MouseWheelListener {
    final _n_0 l;

    SD(_n_0 _n_02) {
        this.l = _n_02;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        int n10 = _n_0.x(this.l).getValue() - mouseWheelEvent.getWheelRotation();
        _n_0.H(this.l).setValue(Math.min(Math.max(_n_0.o(this.l).getMinimum(), n10), _n_0.I(this.l).getMaximum()));
    }
}

