/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.K;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;

class H
implements TreeExpansionListener {
    final K l;

    H(K k2) {
        this.l = k2;
    }

    @Override
    public void treeExpanded(TreeExpansionEvent treeExpansionEvent) {
        this.l.F();
    }

    @Override
    public void treeCollapsed(TreeExpansionEvent treeExpansionEvent) {
        this.l.F();
    }
}

