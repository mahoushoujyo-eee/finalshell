/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import com.at_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Sk
 */
class sk_0
implements ActionListener {
    final at_0 R;
    final HD o;

    sk_0(HD hD2, at_0 at_02) {
        this.o = hD2;
        this.R = at_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.o.L.f(this.R, 4);
    }
}

