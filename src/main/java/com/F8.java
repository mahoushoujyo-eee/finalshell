/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DA;
import com.FY;
import com.SW;
import javax.swing.event.AncestorEvent;

class F8
extends FY {
    final SW X;
    final DA z;

    F8(DA dA, SW sW) {
        this.z = dA;
        this.X = sW;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        DA.l(this.z).requestFocusInWindow();
    }
}

