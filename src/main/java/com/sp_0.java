/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kv_1;
import com.qe_0;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

/*
 * Renamed from com.Sp
 */
class sp_0
implements ItemListener {
    final Date c;
    final kv_1 Q;

    sp_0(kv_1 kv_12, Date date) {
        this.Q = kv_12;
        this.c = date;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        qe_0 qe_02 = (qe_0)itemEvent.getSource();
        if (qe_02.isSelected()) {
            this.Q.J(this.c);
        }
    }
}

