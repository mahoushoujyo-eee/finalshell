/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gi_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.ce
 */
class ce_2
implements PropertyChangeListener {
    final gi_0 O;

    ce_2(gi_0 gi_02) {
        this.O = gi_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.O.h();
    }
}

