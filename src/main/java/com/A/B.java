/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

class B
implements WindowFocusListener {
    final d Y;

    B(d d2) {
        this.Y = d2;
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
        this.Y.N.repaint();
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
        this.Y.N.repaint();
    }
}

