/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QH;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.da
 */
class da_2
extends ComponentAdapter {
    final QH q;

    da_2(QH qH) {
        this.q = qH;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.q.h();
    }
}

