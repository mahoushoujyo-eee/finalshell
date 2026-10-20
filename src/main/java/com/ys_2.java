/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ie_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.ys
 */
class ys_2
extends ComponentAdapter {
    final ie_0 W;

    ys_2(ie_0 ie_02) {
        this.W = ie_02;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.W.M();
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        this.W.M();
    }
}

