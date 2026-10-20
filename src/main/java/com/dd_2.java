/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kf_1;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/*
 * Renamed from com.dd
 */
class dd_2
implements TreeSelectionListener {
    final kf_1 U;

    dd_2(kf_1 kf_12) {
        this.U = kf_12;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        this.U.e();
    }
}

