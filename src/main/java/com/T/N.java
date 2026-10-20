/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.n_0;
import com.t.u_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class N
implements ChangeListener {
    final u_0 S;

    N(u_0 u_02) {
        this.S = u_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        int n10 = n_0.W();
        boolean bl = u_0.x(this.S);
        if (n10 != 0 && !bl) {
            u_0.N(this.S, true);
            u_0.k(this.S).setSelectedColor(u_0.c(this.S).T());
            bl = u_0.N(this.S, false);
        }
    }
}

