/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
 * Renamed from com.Kz
 */
class kz_0
implements ActionListener {
    final File O;
    final kz_2 c;

    kz_0(kz_2 kz_22, File file) {
        this.c = kz_22;
        this.O = file;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.c.X(this.O);
    }
}

