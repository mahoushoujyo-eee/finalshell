/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.V;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class c
extends FocusAdapter {
    final V a;

    c(V v2) {
        this.a = v2;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.a.stopCellEditing();
    }
}

