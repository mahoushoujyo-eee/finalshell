/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class SF
implements ActionListener {
    final File G;
    final kz_2 h;

    SF(kz_2 kz_22, File file) {
        this.h = kz_22;
        this.G = file;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.h.X(this.G);
    }
}

