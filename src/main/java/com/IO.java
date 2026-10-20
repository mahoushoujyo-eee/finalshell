/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IO
extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        mouseEvent.getComponent().requestFocusInWindow();
    }
}

