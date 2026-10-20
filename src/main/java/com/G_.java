/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.O5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class G_
extends MouseAdapter {
    final O5 K;

    G_(O5 o5) {
        this.K = o5;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (FN.L(mouseEvent)) {
            this.K.r(mouseEvent);
        }
    }
}

