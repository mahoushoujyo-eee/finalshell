/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k0_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IS
implements ActionListener {
    final k0_0 i;

    IS(k0_0 k0_02) {
        this.i = k0_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.i.K(actionEvent, this.i.j);
    }
}

