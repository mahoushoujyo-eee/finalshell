/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._n_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class CM
implements ChangeListener {
    final _n_0 p;

    CM(_n_0 _n_02) {
        this.p = _n_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        _n_0.T(this.p).repaint();
    }
}

