/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.s;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class d
implements TreeSelectionListener {
    final s g;

    d(s s2) {
        this.g = s2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        this.g.U();
    }
}

