/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.fm_0;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Renamed from com.dk
 */
class dk_2
implements ItemListener {
    final fm_0 y;

    dk_2(fm_0 fm_02) {
        this.y = fm_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        this.y.A();
    }
}

