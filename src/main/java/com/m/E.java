/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.V;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class E
extends FocusAdapter {
    final V E;

    E(V v2) {
        this.E = v2;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.E.stopCellEditing();
    }
}

