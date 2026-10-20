/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oc_1;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.w5
 */
class w5_0
implements PropertyChangeListener {
    final oc_1 V;

    w5_0(oc_1 oc_12) {
        this.V = oc_12;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.V.h();
    }
}

