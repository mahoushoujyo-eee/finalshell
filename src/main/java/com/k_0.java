/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xm_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.k
 */
class k_0
implements PropertyChangeListener {
    final xm_0 x;

    k_0(xm_0 xm_02) {
        this.x = xm_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.x.h();
    }
}

