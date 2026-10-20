/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.xi
 */
class xi_2
implements ActionListener {
    final kd_1 F;

    xi_2(kd_1 kd_12) {
        this.F = kd_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        kd_1.c(this.F).Q();
    }
}

