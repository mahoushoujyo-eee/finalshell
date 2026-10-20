/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.C.X;
import com.FY;
import com.KR;
import com.ke_1;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

class T
extends FY {
    final KR M;
    final X f;

    T(X x10, KR kR) {
        this.f = x10;
        this.M = kR;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        Container container = this.M.getParent();
        int[] nArray = W.B();
        if (nArray == null) {
            if (container instanceof ke_1) {
                this.f.u = (ke_1)container;
                this.f.u.addContainerListener(this.f.D);
            }
            this.f.Z();
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.f.V();
        this.f.Z();
    }
}

