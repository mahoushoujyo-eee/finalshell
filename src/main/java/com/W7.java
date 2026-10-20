/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ku_2;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class W7
extends MouseAdapter {
    final ku_2 N;
    final Component W;

    W7(ku_2 ku_22, Component component) {
        this.N = ku_22;
        this.W = component;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            block2: {
                int n10 = ku_2.H();
                if (n10 != 0) break block2;
                if (!SwingUtilities.isMiddleMouseButton(mouseEvent)) break block3;
                this.N.remove(this.W);
                this.N.revalidate();
            }
            this.N.repaint();
        }
    }
}

