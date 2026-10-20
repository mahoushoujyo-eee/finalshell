/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.w2_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

/*
 * Renamed from com.xo
 */
class xo_2
extends KeyAdapter {
    final JList F;
    final w2_0 C;

    xo_2(w2_0 w2_02, JList jList) {
        this.C = w2_02;
        this.F = jList;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (GR.lR.J(keyEvent)) {
            this.C.N(this.F, this.F.getSelectedIndex());
        }
    }
}

