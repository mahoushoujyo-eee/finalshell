/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hl_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class X
extends ComponentAdapter {
    final hl_0 g;

    X(hl_0 hl_02) {
        this.g = hl_02;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.g.h();
    }
}

