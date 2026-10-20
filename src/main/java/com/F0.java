/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.Y2;
import com.xd_1;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

class F0
extends JComponent {
    final xd_1 h;

    private F0(xd_1 xd_12) {
        this.h = xd_12;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        graphics.setColor(GO.R);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight() - 1);
        graphics.setColor(GO.Ff);
        graphics.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(0, 4);
    }

    F0(xd_1 xd_12, Y2 y2) {
        this(xd_12);
    }
}

