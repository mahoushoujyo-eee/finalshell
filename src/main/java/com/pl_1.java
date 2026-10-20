/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kv_1;
import com.qe_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/*
 * Renamed from com.pL
 */
class pl_1
implements ActionListener {
    final Date l;
    final kv_1 m;

    pl_1(kv_1 kv_12, Date date) {
        this.m = kv_12;
        this.l = date;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.m.p = (qe_0)actionEvent.getSource();
        this.m.J(this.l);
    }
}

