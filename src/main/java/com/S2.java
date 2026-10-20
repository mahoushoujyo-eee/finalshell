/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kf_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class S2
implements ActionListener {
    final File A;
    final kf_1 a;

    S2(kf_1 kf_12, File file) {
        this.a = kf_12;
        this.A = file;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.V(this.A, true, true);
    }
}

