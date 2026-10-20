/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.I;
import com.C.W;
import com.FY;
import com.ke_1;
import com.ki_2;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

class Z
extends FY {
    final ki_2 U;
    final I H;

    Z(I i2, ki_2 ki_22) {
        this.H = i2;
        this.U = ki_22;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        Container container = this.U.getParent();
        int[] nArray = W.B();
        if (nArray == null) {
            if (container instanceof ke_1) {
                this.H.A = (ke_1)container;
                this.H.A.addContainerListener(this.H.S);
            }
            this.H.Z();
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.H.r();
        this.H.Z();
    }
}

