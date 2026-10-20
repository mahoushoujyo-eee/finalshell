/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ix_0;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class EL
implements AdjustmentListener {
    final ix_0 Y;

    EL(ix_0 ix_02) {
        this.Y = ix_02;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
        this.Y.M();
    }
}

