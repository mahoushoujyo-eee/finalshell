/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._c_0;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.text.JTextComponent;

class HS
implements FocusListener {
    final JTextComponent K;
    final _c_0 z;

    HS(_c_0 _c_02, JTextComponent jTextComponent) {
        this.z = _c_02;
        this.K = jTextComponent;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.K.repaint();
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.K.repaint();
    }
}

