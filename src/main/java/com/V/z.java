/*
 * Decompiled with CFR 0.152.
 */
package com.V;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSpinner;

class z
extends FocusAdapter {
    final JSpinner f;

    z(JSpinner jSpinner) {
        this.f = jSpinner;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.f.repaint();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.f.repaint();
    }
}

