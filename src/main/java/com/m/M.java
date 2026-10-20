/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.K;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class M
implements PropertyChangeListener {
    final K L;

    M(K k2) {
        this.L = k2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.L.k = K.l(this.L).getComponentOrientation().isLeftToRight();
    }
}

