/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kc_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.lX
 */
class lx_1
extends MouseAdapter {
    final kc_2 l;

    lx_1(kc_2 kc_22) {
        this.l = kc_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.l.requestFocusInWindow();
    }
}

