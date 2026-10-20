/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.dH
 */
class dh_1
implements ActionListener {
    final HD v;

    dh_1(HD hD2) {
        this.v = hD2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.v.L.Y();
    }
}

