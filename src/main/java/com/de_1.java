/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.dE
 */
class de_1
implements ActionListener {
    final DK V;

    de_1(DK dK) {
        this.V = dK;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.V.z = 0;
        this.V.dispose();
    }
}

