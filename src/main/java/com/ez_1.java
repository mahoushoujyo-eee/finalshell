/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ig_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.eZ
 */
class ez_1
implements ActionListener {
    final ig_0 I;

    ez_1(ig_0 ig_02) {
        this.I = ig_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.I.M();
    }
}

