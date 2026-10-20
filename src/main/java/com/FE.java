/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.qq_0;
import javax.swing.event.AncestorEvent;

class FE
extends FY {
    final qq_0 M;

    FE(qq_0 qq_02) {
        this.M = qq_02;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        this.M.R();
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.M.R();
    }
}

