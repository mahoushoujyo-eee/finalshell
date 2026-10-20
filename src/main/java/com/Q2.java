/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hl_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Q2
implements PropertyChangeListener {
    final hl_0 C;

    Q2(hl_0 hl_02) {
        this.C = hl_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.C.h();
    }
}

