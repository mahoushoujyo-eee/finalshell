/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.L.m;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class O
extends FocusAdapter {
    final m F;

    O(m m10) {
        this.F = m10;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        m.v(this.F).repaint();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        m.R(this.F).repaint();
    }
}

