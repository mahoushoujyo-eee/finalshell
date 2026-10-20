/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nr_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class _M
implements PropertyChangeListener {
    final nr_2 a;

    _M(nr_2 nr_22) {
        this.a = nr_22;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.a.y();
    }
}

