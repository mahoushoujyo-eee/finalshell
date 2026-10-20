/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nx_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class H4
implements ActionListener {
    final nx_2 d;

    H4(nx_2 nx_22) {
        this.d = nx_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.d.j();
    }
}

