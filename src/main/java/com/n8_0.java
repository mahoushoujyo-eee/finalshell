/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kv_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.n8
 */
class n8_0
implements ActionListener {
    final kv_1 E;

    n8_0(kv_1 kv_12) {
        this.E = kv_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.E.S(-1);
    }
}

