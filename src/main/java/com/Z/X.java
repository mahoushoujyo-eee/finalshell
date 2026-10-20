/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.A;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class X
implements PropertyChangeListener {
    final A y;

    X(A a10) {
        this.y = a10;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.y.Z(propertyChangeEvent);
    }
}

