/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class H3
implements ActionListener {
    final int b;
    final HD X;

    H3(HD hD2, int n10) {
        this.X = hD2;
        this.b = n10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.X.L.u(this.X.L.x(this.b));
    }
}

