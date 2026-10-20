/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.ej_0;
import javax.swing.event.AncestorEvent;

class FH
extends FY {
    final ej_0 q;

    FH(ej_0 ej_02) {
        this.q = ej_02;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        ej_0.X(this.q, ej_0.c(this.q));
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        ej_0.X(this.q, ej_0.O(this.q));
    }
}

