/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.wo_1;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;

class HW
extends KeyAdapter {
    final JList m;
    final wo_1 u;

    HW(wo_1 wo_12, JList jList) {
        this.u = wo_12;
        this.m = jList;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (GR.lR.J(keyEvent)) {
            this.u.N(this.m, this.m.getSelectedIndex());
        }
    }
}

