/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IQ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class uD
implements ActionListener {
    final IQ Y;

    uD(IQ iQ) {
        this.Y = iQ;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Y.M();
    }
}

