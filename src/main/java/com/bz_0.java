/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.bq_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Bz
 */
class bz_0
implements ActionListener {
    final bq_0 f;

    bz_0(bq_0 bq_02) {
        this.f = bq_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.f.f();
    }
}

