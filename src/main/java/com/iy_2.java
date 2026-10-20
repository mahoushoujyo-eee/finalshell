/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nr_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.iy
 */
class iy_2
extends MouseAdapter {
    final nr_2 g;

    iy_2(nr_2 nr_22) {
        this.g = nr_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.g.o.r(this.g.q);
    }
}

