/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.c.y_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.C.i
 */
class i_0
extends MouseAdapter {
    final y_0 O;

    i_0(y_0 y_02) {
        this.O = y_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.O.I(true);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.O.I(false);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.O.P(this.O.K.contains(mouseEvent.getPoint()));
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        this.O.P(this.O.K.contains(mouseEvent.getPoint()));
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.O.P(false);
    }
}

