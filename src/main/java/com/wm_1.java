/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._c_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.wM
 */
class wm_1
implements PropertyChangeListener {
    final _c_0 j;

    wm_1(_c_0 _c_02) {
        this.j = _c_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.j.h();
    }
}

