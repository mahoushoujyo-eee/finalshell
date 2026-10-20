/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.uz
 */
class uz_0
implements ChangeListener {
    final kd_1 U;

    uz_0(kd_1 kd_12) {
        this.U = kd_12;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        kd_1.M(this.U);
    }
}

