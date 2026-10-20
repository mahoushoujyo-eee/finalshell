/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oy_1;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.Ol
 */
class ol_0
extends ComponentAdapter {
    final oy_1 M;

    ol_0(oy_1 oy_12) {
        this.M = oy_12;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.M.P();
    }
}

