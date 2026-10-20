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
 * Renamed from com.et
 */
class et_2
implements ItemListener {
    final Date e;
    final kv_1 i;

    et_2(kv_1 kv_12, Date date) {
        this.i = kv_12;
        this.e = date;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        qe_0 qe_02 = (qe_0)itemEvent.getSource();
        if (qe_02.isSelected()) {
            this.i.J(this.e);
        }
    }
}

