/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.k3_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class RQ
extends KeyAdapter {
    final k3_0 t;

    RQ(k3_0 k3_02) {
        this.t = k3_02;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block2: {
            boolean bl;
            block3: {
                int[] nArray = k3_0.L();
                bl = GR.lZ.J(keyEvent);
                if (nArray == null) break block2;
                if (bl) break block3;
                bl = GR.rN.J(keyEvent);
                if (nArray == null || !bl) break block2;
            }
            bl = this.t.q();
        }
    }
}

