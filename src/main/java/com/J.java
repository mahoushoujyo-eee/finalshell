/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.cs_0;
import com.sr_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class J
extends KeyAdapter {
    final cs_0 I;
    final sr_0 W;

    J(cs_0 cs_02, sr_0 sr_02) {
        this.I = cs_02;
        this.W = sr_02;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block4: {
            J j2;
            block2: {
                block3: {
                    String string = FV.D();
                    j2 = this;
                    if (string != null) break block2;
                    if (j2.I == null) break block3;
                    j2 = this;
                    if (string != null) break block2;
                    if (!j2.I.J(keyEvent)) break block4;
                }
                j2 = this;
            }
            j2.W.j(keyEvent);
        }
    }
}

