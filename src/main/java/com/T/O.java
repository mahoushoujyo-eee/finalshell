/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.n_0;
import com.uE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class O
implements ActionListener {
    final uE s;
    final n_0 U;

    O(n_0 n_02, uE uE2) {
        this.U = n_02;
        this.s = uE2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.U.N(this.s.isSelected());
    }
}

