/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import com.at_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.iA
 */
class ia_1
implements ActionListener {
    final at_0 t;
    final HD d;

    ia_1(HD hD2, at_0 at_02) {
        this.d = hD2;
        this.t = at_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.d.L.f(this.t, 1);
    }
}

