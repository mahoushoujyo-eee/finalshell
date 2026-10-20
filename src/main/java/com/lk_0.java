/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kc_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
 * Renamed from com.Lk
 */
class lk_0
implements ActionListener {
    final File y;
    final kc_2 E;

    lk_0(kc_2 kc_22, File file) {
        this.E = kc_22;
        this.y = file;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.E.m.remove(this.y);
        this.E.n();
    }
}

