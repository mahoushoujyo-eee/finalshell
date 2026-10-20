/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.yh_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.Fu
 */
class fu_0
implements PropertyChangeListener {
    final yh_0 u;

    fu_0(yh_0 yh_02) {
        this.u = yh_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.u.h();
    }
}

