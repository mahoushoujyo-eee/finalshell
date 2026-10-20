/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.xZ
 */
class xz_1
implements Runnable {
    final ActionListener U;
    final ActionEvent b;
    final WC h;

    xz_1(WC wC, ActionListener actionListener, ActionEvent actionEvent) {
        this.h = wC;
        this.U = actionListener;
        this.b = actionEvent;
    }

    @Override
    public void run() {
        this.U.actionPerformed(this.b);
    }
}

