/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QH;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com._q
 */
class _q_0
implements PropertyChangeListener {
    final QH I;

    _q_0(QH qH) {
        this.I = qH;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.I.h();
    }
}

