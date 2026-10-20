/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/*
 * Renamed from com.wI
 */
class wi_1
implements AncestorListener {
    final lk_2 R;

    wi_1(lk_2 lk_22) {
        this.R = lk_22;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        this.R.C();
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.R.C();
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.R.C();
    }
}

