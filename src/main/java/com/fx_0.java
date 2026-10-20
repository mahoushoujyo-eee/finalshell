/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.QL;
import com.rn_0;
import com.zU;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fx
 */
class fx_0
extends FY {
    final zU L;
    final QL E;

    fx_0(QL qL, zU zU2) {
        this.E = qL;
        this.L = zU2;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        rn_0.h(this.L);
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        rn_0.F(this.L);
    }
}

