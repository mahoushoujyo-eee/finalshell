/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Y
implements PropertyChangeListener {
    final d Y;

    Y(d d2) {
        this.Y = d2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.Y.Z();
    }
}

