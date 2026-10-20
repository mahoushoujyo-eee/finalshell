/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.o5_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.Dk
 */
class dk_0
implements PropertyChangeListener {
    final o5_0 h;

    dk_0(o5_0 o5_02) {
        this.h = o5_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.h.h();
    }
}

