/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.pC
 */
class pc_1
extends MouseAdapter {
    final kz_2 m;

    pc_1(kz_2 kz_22) {
        this.m = kz_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            this.m.m();
        }
    }
}

