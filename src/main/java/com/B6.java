/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B6
implements ActionListener {
    final IH C;

    B6(IH iH) {
        this.C = iH;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.C.M();
    }
}

