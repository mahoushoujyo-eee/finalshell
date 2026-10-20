/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class PB
extends MouseAdapter {
    final O5 K;

    PB(O5 o5) {
        this.K = o5;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.K.r(mouseEvent);
    }
}

