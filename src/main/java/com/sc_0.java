/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.Sc
 */
class sc_0
extends ComponentAdapter {
    final pa_1 G;

    sc_0(pa_1 pa_12) {
        this.G = pa_12;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        pa_1.I(this.G);
    }
}

