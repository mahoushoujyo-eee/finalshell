/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.ac_0;
import com.kd_2;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

class FQ
extends FY {
    final JComponent L;
    final kd_2 I;

    FQ(kd_2 kd_22, JComponent jComponent) {
        this.I = kd_22;
        this.L = jComponent;
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        ac_0.o(this.L);
    }
}

