/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.du
 */
class du_2
implements ActionListener {
    final HD q;

    du_2(HD hD2) {
        this.q = hD2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.q.L.d();
    }
}

