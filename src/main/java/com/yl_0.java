/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kv_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Yl
 */
class yl_0
implements ActionListener {
    final kv_1 b;

    yl_0(kv_1 kv_12) {
        this.b = kv_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.b.P(-1);
    }
}

