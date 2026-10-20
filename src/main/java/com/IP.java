/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QH;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class IP
implements PropertyChangeListener {
    final QH k;

    IP(QH qH) {
        this.k = qH;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        QH.j(this.k);
    }
}

