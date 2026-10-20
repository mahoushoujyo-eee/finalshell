/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.xs_0;
import javax.swing.event.AncestorEvent;

class F1
extends FY {
    final xs_0 b;

    F1(xs_0 xs_02) {
        this.b = xs_02;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        this.b.o(xs_0.r(this.b));
    }
}

