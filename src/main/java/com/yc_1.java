/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.yC
 */
class yc_1
implements ActionListener {
    final lk_2 v;

    yc_1(lk_2 lk_22) {
        this.v = lk_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.v.q();
    }
}

