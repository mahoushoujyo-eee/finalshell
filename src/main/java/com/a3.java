/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class a3
implements ActionListener {
    final _y_0 z;

    a3(_y_0 _y_02) {
        this.z = _y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.z.kj.b(false, true);
    }
}

