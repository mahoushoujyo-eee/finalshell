/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.p2
 */
class p2_0
implements ActionListener {
    final HD F;

    p2_0(HD hD2) {
        this.F = hD2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.F.L.z();
    }
}

