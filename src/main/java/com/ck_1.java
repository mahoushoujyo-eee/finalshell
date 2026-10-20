/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ic_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.cK
 */
class ck_1
extends ComponentAdapter {
    final ic_0 n;

    ck_1(ic_0 ic_02) {
        this.n = ic_02;
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        ic_0.w(this.n);
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        ic_0.w(this.n);
    }
}

