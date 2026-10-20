/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pk_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.Kg
 */
class kg_0
implements PropertyChangeListener {
    final pk_2 v;

    kg_0(pk_2 pk_22) {
        this.v = pk_22;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.v.h();
        pk_2.I(this.v, pk_2.K(this.v), false);
    }
}

