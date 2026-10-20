/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.nx_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.Py
 */
class py_0
extends KeyAdapter {
    final nx_2 o;

    py_0(nx_2 nx_22) {
        this.o = nx_22;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block5: {
            boolean bl;
            block6: {
                block7: {
                    int n10;
                    block4: {
                        n10 = nx_2.c();
                        bl = this.o.isEnabled();
                        if (n10 == 0) break block4;
                        if (!bl) break block5;
                        bl = GR.lD.J(keyEvent);
                    }
                    if (n10 == 0) break block6;
                    if (!bl) break block7;
                    this.o.x();
                    if (n10 != 0) break block5;
                }
                bl = GR.rI.J(keyEvent);
            }
            if (bl) {
                this.o.j();
            }
        }
    }
}

