/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nr_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TE
implements ActionListener {
    final nr_2 T;

    TE(nr_2 nr_22) {
        this.T = nr_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.T.E.u(this.T.v.isSelected());
        this.T.v();
    }
}

