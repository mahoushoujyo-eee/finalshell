/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CD
implements ActionListener {
    final QS f;

    CD(QS qS) {
        this.f = qS;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.f.V();
    }
}

