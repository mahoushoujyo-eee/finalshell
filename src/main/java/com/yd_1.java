/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.yD
 */
class yd_1
extends ComponentAdapter {
    final lk_2 o;

    yd_1(lk_2 lk_22) {
        this.o = lk_22;
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
        this.o.C();
    }
}

