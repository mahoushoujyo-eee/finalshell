/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.n_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class y
implements ActionListener {
    final n_0 L;

    y(n_0 n_02) {
        this.L = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.L.x(this.L.t());
        n_0.D(this.L, actionEvent);
    }
}

