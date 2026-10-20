/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import com.at_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class S8
implements ActionListener {
    final at_0 R;
    final HD b;

    S8(HD hD2, at_0 at_02) {
        this.b = hD2;
        this.R = at_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.b.L.f(this.R, 3);
    }
}

