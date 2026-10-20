/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nr_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _G
implements ActionListener {
    final nr_2 R;

    _G(nr_2 nr_22) {
        this.R = nr_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.R.E.Q(this.R.l.isSelected());
        this.R.v();
    }
}

