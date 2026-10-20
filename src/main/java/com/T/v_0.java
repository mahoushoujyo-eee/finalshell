/*
 * Decompiled with CFR 0.152.
 */
package com.t;

import com.t.n_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.t.v
 */
class v_0
implements ActionListener {
    final n_0 w;

    v_0(n_0 n_02) {
        this.w = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        n_0.l(this.w, 1);
        this.w.x(this.w.t());
        n_0.c(this.w, actionEvent);
    }
}

