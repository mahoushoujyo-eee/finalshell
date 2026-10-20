/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qt_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLayeredPane;

class ET
extends ComponentAdapter {
    final qt_0 A;
    final JLayeredPane m;

    ET(qt_0 qt_02, JLayeredPane jLayeredPane) {
        this.A = qt_02;
        this.m = jLayeredPane;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.A.setBounds(0, 0, this.m.getWidth(), this.m.getHeight());
        this.A.revalidate();
    }
}

