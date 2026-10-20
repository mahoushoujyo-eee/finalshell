/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.bq_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IU
implements ActionListener {
    final _y_0 Y;
    final bq_0 z;

    IU(bq_0 bq_02, _y_0 _y_02) {
        this.z = bq_02;
        this.Y = _y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Y.w();
    }
}

