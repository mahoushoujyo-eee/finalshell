/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.wd_0;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fh
 */
class fh_0
extends FY {
    final wd_0 t;

    fh_0(wd_0 wd_02) {
        this.t = wd_02;
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.t.j();
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.t.j();
    }
}

