/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qt_0;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JLayeredPane;

/*
 * Renamed from com.i5
 */
class i5_0
implements WindowStateListener {
    final qt_0 j;
    final JLayeredPane i;

    i5_0(qt_0 qt_02, JLayeredPane jLayeredPane) {
        this.j = qt_02;
        this.i = jLayeredPane;
    }

    @Override
    public void windowStateChanged(WindowEvent windowEvent) {
        this.j.setBounds(0, 0, this.i.getWidth(), this.i.getHeight());
        this.j.revalidate();
    }
}

