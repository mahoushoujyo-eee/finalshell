/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.pk_2;
import javax.swing.event.AncestorEvent;

class F9
extends FY {
    final pk_2 M;

    F9(pk_2 pk_22) {
        this.M = pk_22;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        this.M.h();
        pk_2.I(this.M, pk_2.b(this.M), false);
    }
}

