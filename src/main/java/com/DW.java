/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hl_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class DW
implements PropertyChangeListener {
    final hl_0 S;

    DW(hl_0 hl_02) {
        this.S = hl_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.S.h();
    }
}

