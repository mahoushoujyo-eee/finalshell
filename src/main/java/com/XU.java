/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FJ;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class XU
implements PropertyChangeListener {
    final FJ W;

    XU(FJ fJ2) {
        this.W = fJ2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        FJ.C(this.W).setVisible(false);
    }
}

