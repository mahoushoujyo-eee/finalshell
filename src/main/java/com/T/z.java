/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.KD;
import com.t.n_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class z
extends MouseAdapter {
    final KD L;
    final n_0 P;

    z(n_0 n_02, KD kD) {
        this.P = n_02;
        this.L = kD;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.L.doClick(0);
        }
    }
}

