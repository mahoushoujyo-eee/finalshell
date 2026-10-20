/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.p0
 */
class p0_0
implements ChangeListener {
    final BX M;

    p0_0(BX bX) {
        this.M = bX;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.M.Z();
    }
}

