/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.lP
 */
class lp_1
implements PropertyChangeListener {
    final k3_0 z;

    lp_1(k3_0 k3_02) {
        this.z = k3_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.z.V();
    }
}

