/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.ch_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.r
 */
class r_0
implements ActionListener {
    final KD g;

    r_0(KD kD) {
        this.g = kD;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ch_0.P(this.g);
    }
}

