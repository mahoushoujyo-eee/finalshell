/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.yi_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

/*
 * Renamed from com.wz
 */
class wz_2
implements ActionListener {
    final JComponent o;
    final int E;
    final int G;
    final yi_0 D;

    wz_2(yi_0 yi_02, JComponent jComponent, int n10, int n11) {
        this.D = yi_02;
        this.o = jComponent;
        this.E = n10;
        this.G = n11;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.D.z(this.o, this.E, this.G);
    }
}

