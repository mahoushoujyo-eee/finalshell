/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xm_0;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/*
 * Renamed from com.ri
 */
class ri_2
implements AdjustmentListener {
    final xm_0 d;

    ri_2(xm_0 xm_02) {
        this.d = xm_02;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
        xm_0.x(this.d).repaint();
    }
}

