/*
 * Decompiled with CFR 0.152.
 */
package com.U;

import com.U.y;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class b
implements PropertyChangeListener {
    final y g;

    b(y y2) {
        this.g = y2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.g.h();
    }
}

