/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.cs_0;
import com.sr_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.oJ
 */
class oj_1
extends KeyAdapter {
    final cs_0 h;
    final sr_0 k;

    oj_1(cs_0 cs_02, sr_0 sr_02) {
        this.h = cs_02;
        this.k = sr_02;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block4: {
            oj_1 oj_12;
            block2: {
                block3: {
                    String string = FV.D();
                    oj_12 = this;
                    if (string != null) break block2;
                    if (oj_12.h == null) break block3;
                    oj_12 = this;
                    if (string != null) break block2;
                    if (!oj_12.h.J(keyEvent)) break block4;
                }
                oj_12 = this;
            }
            oj_12.k.j(keyEvent);
        }
    }
}

