/*
 * Decompiled with CFR 0.152.
 */
package com.W;

import com.W.e;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class D
implements ActionListener {
    final e N;

    D(e e2) {
        this.N = e2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        e.I(this.N, 0);
    }
}

