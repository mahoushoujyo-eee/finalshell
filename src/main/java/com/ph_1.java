/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kv_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.pH
 */
class ph_1
implements ActionListener {
    final kv_1 k;

    ph_1(kv_1 kv_12) {
        this.k = kv_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.k.P(1);
    }
}

