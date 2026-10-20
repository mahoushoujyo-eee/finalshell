/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.fm_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.n0
 */
class n0_0
implements PropertyChangeListener {
    final fm_0 A;

    n0_0(fm_0 fm_02) {
        this.A = fm_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.A.I.a(this.A.U.isEnabled());
    }
}

