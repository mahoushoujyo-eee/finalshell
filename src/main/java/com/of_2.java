/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.of
 */
class of_2
implements ActionListener {
    final DK M;

    of_2(DK dK) {
        this.M = dK;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.M.z = 1;
        this.M.dispose();
    }
}

