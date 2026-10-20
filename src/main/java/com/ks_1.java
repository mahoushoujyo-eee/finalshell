/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oc_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.kS
 */
class ks_1
extends MouseAdapter {
    final oc_1 E;

    ks_1(oc_1 oc_12) {
        this.E = oc_12;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.E.i = true;
        oc_1.l(this.E).repaint();
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.E.i = false;
        oc_1.w(this.E).repaint();
    }
}

