/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.FN;
import com.FY;
import com.Z.T;
import com.xt_1;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Z.n
 */
class n_0
extends FY {
    final xt_1 f;
    final T M;

    n_0(T t2, xt_1 xt_12) {
        this.M = t2;
        this.f = xt_12;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        this.h();
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.h();
    }

    private void h() {
        this.f.O(FN.O(this.M));
    }
}

