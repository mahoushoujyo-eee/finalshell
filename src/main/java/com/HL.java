/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class HL
extends WindowAdapter {
    final Frame c;
    final Frame e;

    HL(Frame frame, Frame frame2) {
        this.c = frame;
        this.e = frame2;
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        this.c.setEnabled(false);
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        this.c.setEnabled(true);
        this.e.removeWindowListener(this);
    }
}

