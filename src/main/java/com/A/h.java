/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

class h
implements WindowStateListener {
    final d Q;

    h(d d2) {
        this.Q = d2;
    }

    @Override
    public void windowStateChanged(WindowEvent windowEvent) {
        this.Q.B = windowEvent.getNewState();
        this.Q.R();
    }
}

