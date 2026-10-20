/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xc_2;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.eW
 */
class ew_1
implements ChangeListener {
    final xc_2 H;

    ew_1(xc_2 xc_22) {
        this.H = xc_22;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        xc_2.N(this.H);
    }
}

