/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k4_0;
import com.kk_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
 * Renamed from com._g
 */
class _g_0
implements ActionListener {
    final k4_0 q;
    final File T;
    final kk_2 E;

    _g_0(kk_2 kk_22, k4_0 k4_02, File file) {
        this.E = kk_22;
        this.q = k4_02;
        this.T = file;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        k4_0.y(this.E.E).remove(this.T);
        k4_0.g(this.E.E).remove(this.E);
        this.E.E.revalidate();
        this.E.E.repaint();
        k4_0.b(this.E.E, k4_0.y(this.E.E));
    }
}

