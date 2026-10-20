/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class E7
implements ActionListener {
    final File M;
    final kz_2 h;

    E7(kz_2 kz_22, File file) {
        this.h = kz_22;
        this.M = file;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.h.X(this.M);
    }
}

