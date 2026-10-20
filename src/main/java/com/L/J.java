/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.L.m;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class J
implements PropertyChangeListener {
    final m u;

    J(m m10) {
        this.u = m10;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.u.m(propertyChangeEvent.getOldValue());
        this.u.w(propertyChangeEvent.getNewValue());
    }
}

