/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.fm_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.wJ
 */
class wj_1
implements PropertyChangeListener {
    final fm_0 e;

    wj_1(fm_0 fm_02) {
        this.e = fm_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.e.A();
    }
}

