/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class I6
implements ActionListener {
    final kz_2 v;

    I6(kz_2 kz_22) {
        this.v = kz_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.v.X(null);
    }
}

