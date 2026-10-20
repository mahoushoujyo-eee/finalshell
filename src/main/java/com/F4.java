/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OQ;
import com.co_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class F4
implements PropertyChangeListener {
    final co_0 U;
    final OQ a;

    F4(OQ oQ, co_0 co_02) {
        this.a = oQ;
        this.U = co_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        boolean bl = this.U.isEnabled();
        this.a.z.setEnabled(bl);
        this.a.a.setEnabled(bl);
        this.a.o.setEnabled(bl);
        this.a.U.setEnabled(bl);
    }
}

