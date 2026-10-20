/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/*
 * Renamed from com.Gv
 */
class gv_0
implements AdjustmentListener {
    final _y_0 n;

    gv_0(_y_0 _y_02) {
        this.n = _y_02;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
        this.n.e.repaint();
    }
}

