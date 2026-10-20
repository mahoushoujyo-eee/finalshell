/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.qq_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LL
implements ActionListener {
    final qq_0 O;

    LL(qq_0 qq_02) {
        this.O = qq_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.O.q(true);
    }
}

