/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OG;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.rf
 */
class rf_2
implements ActionListener {
    final OG V;

    rf_2(OG oG) {
        this.V = oG;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.V.B();
    }
}

