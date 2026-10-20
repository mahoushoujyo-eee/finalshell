/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class N
implements PropertyChangeListener {
    final d N;

    N(d d2) {
        this.N = d2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.N.V.revalidate();
        this.N.V.repaint();
    }
}

