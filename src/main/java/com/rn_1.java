/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import com.at_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.rN
 */
class rn_1
implements ActionListener {
    final at_0 n;
    final HD T;

    rn_1(HD hD2, at_0 at_02) {
        this.T = hD2;
        this.n = at_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.T.L.f(this.n, 2);
    }
}

