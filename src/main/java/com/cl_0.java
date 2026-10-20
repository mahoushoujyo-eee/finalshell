/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._n_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.Cl
 */
class cl_0
implements PropertyChangeListener {
    final _n_0 X;

    cl_0(_n_0 _n_02) {
        this.X = _n_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.X.h();
    }
}

