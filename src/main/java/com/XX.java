/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class XX
implements ActionListener {
    final HD Y;

    XX(HD hD2) {
        this.Y = hD2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Y.L.w();
    }
}

