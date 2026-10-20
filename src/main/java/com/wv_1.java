/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OQ;
import com.co_0;
import java.awt.ComponentOrientation;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.wV
 */
class wv_1
implements PropertyChangeListener {
    final co_0 t;
    final OQ P;

    wv_1(OQ oQ, co_0 co_02) {
        this.P = oQ;
        this.t = co_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        ComponentOrientation componentOrientation = this.t.getComponentOrientation();
        this.P.a.setComponentOrientation(componentOrientation);
        this.P.o.setComponentOrientation(componentOrientation);
        this.P.U.setComponentOrientation(componentOrientation);
    }
}

