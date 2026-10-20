/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CC;
import com.GR;
import com.co_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class XR
extends KeyAdapter {
    final CC q;

    protected XR(CC cC) {
        this.q = cC;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block4: {
            CC cC;
            String string;
            block6: {
                int n10;
                block5: {
                    block3: {
                        string = co_0.U();
                        n10 = GR.rN.J(keyEvent);
                        if (string == null) break block3;
                        if (n10 == 0) break block4;
                        n10 = this.q.getSelectedIndex();
                    }
                    if (string == null) break block5;
                    if (n10 == -1) break block4;
                    cC = this.q;
                    if (string == null) break block6;
                    n10 = cC.isEnabled() ? '\u0001' : '\u0000';
                }
                if (n10 == 0) break block4;
                cC = this.q;
            }
            for (int n11 : cC.getSelectedIndices()) {
                this.q.x(n11);
                if (string != null) continue;
            }
        }
    }
}

