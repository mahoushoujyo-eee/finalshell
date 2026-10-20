/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.n_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class k
implements ChangeListener {
    final n_0 M;

    k(n_0 n_02) {
        this.M = n_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        n_0.r(this.M).K(n_0.u(this.M).s());
    }
}

