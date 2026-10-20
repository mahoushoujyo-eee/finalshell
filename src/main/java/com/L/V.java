/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.L.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class V
implements PropertyChangeListener {
    final m M;

    V(m m10) {
        this.M = m10;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        m.Z(this.M).setEnabled(m.h(this.M).isEnabled());
    }
}

