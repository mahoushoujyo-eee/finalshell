/*
 * Decompiled with CFR 0.152.
 */
package com.W;

import com.W.e;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Z
implements ActionListener {
    final e v;

    Z(e e2) {
        this.v = e2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        e.I(this.v, 1);
    }
}

