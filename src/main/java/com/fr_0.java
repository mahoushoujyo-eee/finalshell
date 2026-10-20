/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.gi_0;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fr
 */
class fr_0
extends FY {
    final JComponent l;
    final gi_0 W;

    fr_0(gi_0 gi_02, JComponent jComponent) {
        this.W = gi_02;
        this.l = jComponent;
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.W.W = false;
        this.W.b.getModel().setRollover(false);
        this.W.u = 0.0f;
        this.W.F = null;
        gi_0.F(this.W);
        this.l.repaint();
    }
}

