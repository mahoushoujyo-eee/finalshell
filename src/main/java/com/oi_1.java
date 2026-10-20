/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.bq_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.oI
 */
class oi_1
implements ActionListener {
    final bq_0 B;

    oi_1(bq_0 bq_02) {
        this.B = bq_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.B.V();
    }
}

