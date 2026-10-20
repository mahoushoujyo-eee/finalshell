/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._e_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OA
extends MouseAdapter {
    final _e_0 s;

    OA(_e_0 _e_02) {
        this.s = _e_02;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        _e_0.P(this.s, true);
        this.s.repaint();
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        _e_0.P(this.s, false);
        this.s.repaint();
    }
}

