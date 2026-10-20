/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.oj_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class HZ
extends KeyAdapter {
    final oj_0 B;

    HZ(oj_0 oj_02) {
        this.B = oj_02;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block4: {
            block3: {
                boolean bl;
                block2: {
                    boolean bl2 = oj_0.V();
                    bl = GR.lZ.J(keyEvent);
                    if (bl2) break block2;
                    if (bl) break block3;
                    bl = GR.rN.J(keyEvent);
                }
                if (!bl) break block4;
            }
            this.B.A();
        }
    }
}

