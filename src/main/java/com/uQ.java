/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.at_0;
import com.bw_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class uQ
implements ActionListener {
    final BX G;
    final at_0 J;
    final bw_0 B;

    uQ(bw_0 bw_02, BX bX, at_0 at_02) {
        this.B = bw_02;
        this.G = bX;
        this.J = at_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.G.u(this.J);
    }
}

