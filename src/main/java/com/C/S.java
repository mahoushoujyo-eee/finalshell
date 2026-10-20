/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.FY;
import com.c.a_0;
import com.ke_1;
import com.qx_0;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

class S
extends FY {
    final qx_0 Y;
    final a_0 U;

    S(a_0 a_02, qx_0 qx_02) {
        this.U = a_02;
        this.Y = qx_02;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        Container container = this.Y.getParent();
        int[] nArray = W.B();
        if (nArray == null) {
            if (container instanceof ke_1) {
                this.U.t = (ke_1)container;
                this.U.t.addContainerListener(this.U.G);
            }
            this.U.Z();
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.U.K();
        this.U.Z();
    }
}

