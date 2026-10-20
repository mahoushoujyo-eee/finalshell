/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.a_0;
import com.t.n_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class t
implements ChangeListener {
    final n_0 k;

    t(n_0 n_02) {
        this.k = n_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        n_0.y(this.k, n_0.r(this.k).d());
        n_0.a(this.k, n_0.c(this.k), a_0.palette);
    }
}

