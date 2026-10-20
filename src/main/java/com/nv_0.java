/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.ch_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Nv
 */
class nv_0
implements ActionListener {
    final KD p;

    nv_0(KD kD) {
        this.p = kD;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ch_0.P(this.p);
    }
}

