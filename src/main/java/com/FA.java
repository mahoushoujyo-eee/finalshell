/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EX;
import com.kd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FA
implements ActionListener {
    final EX w;
    final kd_1 F;

    FA(kd_1 kd_12, EX eX) {
        this.F = kd_12;
        this.w = eX;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.w.setValue(1);
    }
}

