/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.oj_0;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fe
 */
class fe_0
extends FY {
    final oj_0 d;

    fe_0(oj_0 oj_02) {
        this.d = oj_02;
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.d.f(false);
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        this.d.f(false);
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.d.f(false);
    }
}

