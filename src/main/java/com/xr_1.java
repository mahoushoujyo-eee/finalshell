/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.qq_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.xR
 */
class xr_1
implements PropertyChangeListener {
    final KD P;
    final qq_0 v;

    xr_1(qq_0 qq_02, KD kD) {
        this.v = qq_02;
        this.P = kD;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (qq_0.u().contains(propertyChangeEvent.getPropertyName())) {
            qq_0.D(this.v, this.P, qq_0.m(this.v));
        }
    }
}

