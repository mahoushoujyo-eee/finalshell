/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.lA
 */
class la_1
implements ActionListener {
    final kd_1 T;

    la_1(kd_1 kd_12) {
        this.T = kd_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        kd_1.c(this.T).R();
    }
}

