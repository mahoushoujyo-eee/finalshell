/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kf_1;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/*
 * Renamed from com.Lh
 */
class lh_0
implements TreeSelectionListener {
    final kf_1 F;

    lh_0(kf_1 kf_12) {
        this.F = kf_12;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        this.F.V(this.F.a.N(), true, false);
    }
}

