/*
 * Decompiled with CFR 0.152.
 */
package com.l;

import com.L.Q;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.L.u
 */
class u_0
implements PropertyChangeListener {
    final Q G;

    u_0(Q q2) {
        this.G = q2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.G.y();
    }
}

