/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class P4
extends MouseAdapter {
    final O5 c;

    P4(O5 o5) {
        this.c = o5;
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.c.r(mouseEvent);
    }
}

