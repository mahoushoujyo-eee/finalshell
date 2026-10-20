/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.pa_1;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class FK
extends FocusAdapter {
    final pa_1 L;

    FK(pa_1 pa_12) {
        this.L = pa_12;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        pa_1.C(this.L, pa_1.S(this.L).w());
        pa_1.D(this.L).E();
        this.L.h = System.currentTimeMillis();
        this.L.cQ = false;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        int n10 = _y_0.M();
        pa_1 pa_12 = this.L;
        if (n10 != 0) {
            if (pa_1.D(pa_12) != null) {
                pa_1.D(this.L).E();
            }
            pa_12 = this.L;
        }
        pa_1.Z(pa_12, focusEvent.getComponent(), false);
    }
}

