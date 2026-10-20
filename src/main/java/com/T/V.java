/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.n_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class V
implements ActionListener {
    final n_0 J;

    V(n_0 n_02) {
        this.J = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        n_0.l(this.J, 0);
        n_0.O(this.J, actionEvent);
    }
}

