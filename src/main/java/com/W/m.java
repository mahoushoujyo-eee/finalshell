/*
 * Decompiled with CFR 0.152.
 */
package com.W;

import com.W.e;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class m
implements ActionListener {
    final e x;

    m(e e2) {
        this.x = e2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        e.I(this.x, 2);
    }
}

