/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.CI;
import com.pb_2;
import com.z.i_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class M7
extends MouseAdapter {
    final CI v;
    final pb_2 H;
    final i_0 T;

    M7(i_0 i_02, CI cI, pb_2 pb_22) {
        this.T = i_02;
        this.v = cI;
        this.H = pb_22;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.T.f.a(this.v.getSelectedIndex());
        this.H.setVisible(false);
    }
}

