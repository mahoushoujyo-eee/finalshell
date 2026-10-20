/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pk_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.y0
 */
class y0_0
implements PropertyChangeListener {
    final pk_2 b;

    y0_0(pk_2 pk_22) {
        this.b = pk_22;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.b.h();
    }
}

