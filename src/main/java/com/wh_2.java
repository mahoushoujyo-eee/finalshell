/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.wh
 */
class wh_2
implements ActionListener {
    final Runnable y;

    wh_2(Runnable runnable) {
        this.y = runnable;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        FV.p(this.y);
    }
}

