/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.cs_0;
import com.sr_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class W8
extends KeyAdapter {
    final cs_0 c;
    final sr_0 V;

    W8(cs_0 cs_02, sr_0 sr_02) {
        this.c = cs_02;
        this.V = sr_02;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        block4: {
            W8 w8;
            block2: {
                block3: {
                    String string = FV.D();
                    w8 = this;
                    if (string != null) break block2;
                    if (w8.c == null) break block3;
                    w8 = this;
                    if (string != null) break block2;
                    if (!w8.c.J(keyEvent)) break block4;
                }
                w8 = this;
            }
            w8.V.j(keyEvent);
        }
    }
}

