/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.nr_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.Ik
 */
class ik_0
extends KeyAdapter {
    final nr_2 Q;

    ik_0(nr_2 nr_22) {
        this.Q = nr_22;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (GR.lD.J(keyEvent)) {
            this.Q.g();
        }
    }
}

