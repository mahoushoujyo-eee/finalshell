/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.s_1;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class J
extends WindowAdapter {
    final s_1 L;

    J(s_1 s_12) {
        this.L = s_12;
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        s_1.K(this.L).z(-1);
    }
}

