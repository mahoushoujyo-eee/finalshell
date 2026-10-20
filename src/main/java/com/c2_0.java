/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cz_0;
import com.kf_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.c2
 */
class c2_0
implements ActionListener {
    final kf_1 O;

    c2_0(kf_1 kf_12) {
        this.O = kf_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.O.V(cz_0.x(), true, true);
    }
}

