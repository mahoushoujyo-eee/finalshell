/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.i1_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class YC
implements PropertyChangeListener {
    final i1_0 C;

    YC(i1_0 i1_02) {
        this.C = i1_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.C.h();
    }
}

