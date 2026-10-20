/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Sh
 */
class sh_0
implements ActionListener {
    final int I;
    final HD P;

    sh_0(HD hD2, int n10) {
        this.P = hD2;
        this.I = n10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.P.L.R(this.P.L.x(this.I));
    }
}

