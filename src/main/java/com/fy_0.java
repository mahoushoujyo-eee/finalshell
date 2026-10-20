/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.qq_0;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fy
 */
class fy_0
extends FY {
    final qq_0 U;

    fy_0(qq_0 qq_02) {
        this.U = qq_02;
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.U.q(false);
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
        this.U.R();
    }
}

