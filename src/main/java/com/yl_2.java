/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QH;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.yl
 */
class yl_2
implements PropertyChangeListener {
    final QH h;

    yl_2(QH qH) {
        this.h = qH;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.h.h();
    }
}

