/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nx_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.ll
 */
class ll_2
implements ActionListener {
    final nx_2 t;

    ll_2(nx_2 nx_22) {
        this.t = nx_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.t.b();
    }
}

