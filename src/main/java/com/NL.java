/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hl_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class NL
implements PropertyChangeListener {
    final hl_0 y;

    NL(hl_0 hl_02) {
        this.y = hl_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        hl_0.i(this.y);
    }
}

