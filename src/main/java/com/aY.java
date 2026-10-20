/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DK;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class aY
extends WindowAdapter {
    final DK q;

    aY(DK dK) {
        this.q = dK;
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        this.q.z = -1;
    }
}

