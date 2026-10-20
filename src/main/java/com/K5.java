/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DK;
import com.FN;
import com.ky_2;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class K5
implements PropertyChangeListener {
    final ky_2 v;
    final DK z;

    K5(DK dK, ky_2 ky_22) {
        this.z = dK;
        this.v = ky_22;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.z.j.setPreferredSize(null);
        this.z.L.setPreferredSize(null);
        FN.b(new Component[]{this.z.j, this.z.L});
        this.v.revalidate();
    }
}

