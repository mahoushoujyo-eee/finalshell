/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.J;
import com.C.W;
import com.FY;
import com.ke_1;
import com.ov_0;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.C.s
 */
class s_0
extends FY {
    final ov_0 j;
    final J d;

    s_0(J j2, ov_0 ov_02) {
        this.d = j2;
        this.j = ov_02;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        Container container = this.j.getParent();
        int[] nArray = W.B();
        if (nArray == null) {
            if (container instanceof ke_1) {
                this.d.O = (ke_1)container;
                this.d.O.addContainerListener(this.d.F);
            }
            this.d.Z();
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.d.U();
        this.d.Z();
    }
}

