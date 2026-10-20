/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k4_0;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class XA
implements ActionListener {
    final Window T;
    final k4_0 g;

    XA(k4_0 k4_02, Window window) {
        this.g = k4_02;
        this.T = window;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        k4_0.v(this.g).showOpenDialog(this.T);
        k4_0.L(this.g).requestFocusInWindow();
    }
}

