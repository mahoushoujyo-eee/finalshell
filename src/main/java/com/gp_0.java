/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wd_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.Gp
 */
class gp_0
extends ComponentAdapter {
    final wd_0 I;

    gp_0(wd_0 wd_02) {
        this.I = wd_02;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.I.t();
    }
}

