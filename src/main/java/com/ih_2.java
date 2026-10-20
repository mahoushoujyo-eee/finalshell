/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qq_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.ih
 */
class ih_2
extends ComponentAdapter {
    final qq_0 Q;

    ih_2(qq_0 qq_02) {
        this.Q = qq_02;
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
        this.Q.q(false);
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.Q.R();
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        this.Q.R();
    }
}

