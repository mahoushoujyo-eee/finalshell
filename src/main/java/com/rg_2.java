/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kc_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.rg
 */
class rg_2
extends MouseAdapter {
    final kc_2 Y;

    rg_2(kc_2 kc_22) {
        this.Y = kc_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.Y.requestFocusInWindow();
    }
}

