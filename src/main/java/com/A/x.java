/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class x
implements ActionListener {
    final d K;

    x(d d2) {
        this.K = d2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.K.Q();
    }
}

