/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.V;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class B
extends FocusAdapter {
    final V b;

    B(V v2) {
        this.b = v2;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.b.stopCellEditing();
    }
}

