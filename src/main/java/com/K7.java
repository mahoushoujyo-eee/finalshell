/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ac_0;
import com.ic_1;
import com.ky_2;
import com.wd_0;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

class K7
implements AncestorListener {
    final wd_0 u;

    K7(wd_0 wd_02) {
        this.u = wd_02;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        wd_0.L(this.u);
        this.u.N();
        this.u.t();
        wd_0.F(this.u, 0.0f);
        wd_0.D(this.u, ic_1.fadeIn);
        wd_0.N(this.u).u();
        wd_0.A(this.u);
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        block3: {
            wd_0 wd_02;
            block2: {
                ky_2[] ky_2Array = ac_0.n();
                wd_02 = this.u;
                if (ky_2Array != null) break block2;
                if (wd_02.getParent() != null) break block3;
                wd_02 = this.u;
            }
            wd_0.I(wd_02);
        }
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.u.N();
        this.u.t();
    }
}

