/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.lk_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.wL
 */
class wl_1
extends KeyAdapter {
    final lk_2 B;

    wl_1(lk_2 lk_22) {
        this.B = lk_22;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block5: {
            boolean bl;
            block6: {
                block7: {
                    String[] stringArray;
                    block4: {
                        stringArray = lk_2.N();
                        bl = this.B.isEnabled();
                        if (stringArray != null) break block4;
                        if (!bl) break block5;
                        bl = GR.lD.J(keyEvent);
                    }
                    if (stringArray != null) break block6;
                    if (!bl) break block7;
                    this.B.H();
                    if (stringArray == null) break block5;
                }
                bl = GR.rI.J(keyEvent);
            }
            if (bl) {
                this.B.q();
            }
        }
    }
}

