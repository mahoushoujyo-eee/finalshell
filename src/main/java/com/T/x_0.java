/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.n_0;
import com.t.u_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.t.x
 */
class x_0
implements ChangeListener {
    final u_0 g;

    x_0(u_0 u_02) {
        this.g = u_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        int n10 = n_0.g();
        boolean bl = u_0.x(this.g);
        if (n10 == 0 && !bl) {
            u_0.N(this.g, true);
            u_0.c(this.g).x(u_0.k(this.g).getSelectedColor());
            bl = u_0.N(this.g, false);
        }
    }
}

