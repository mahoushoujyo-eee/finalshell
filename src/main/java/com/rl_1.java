/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k4_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.rL
 */
class rl_1
extends MouseAdapter {
    final k4_0 d;

    rl_1(k4_0 k4_02) {
        this.d = k4_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            k4_0.L(this.d).doClick(0);
        }
    }
}

