/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ej_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com._a
 */
class _a_0
implements PropertyChangeListener {
    final ej_0 Z;

    _a_0(ej_0 ej_02) {
        this.Z = ej_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        ej_0.X(this.Z, ej_0.P(this.Z));
    }
}

