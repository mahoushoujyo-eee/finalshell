/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.HT;
import com.O5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class uC
extends MouseAdapter {
    final HT M;
    final O5 y;

    uC(HT hT2, O5 o5) {
        this.M = hT2;
        this.y = o5;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block4: {
            uC uC2;
            block2: {
                block3: {
                    String string = FV.D();
                    uC2 = this;
                    if (string != null) break block2;
                    if (uC2.M == null) break block3;
                    uC2 = this;
                    if (string != null) break block2;
                    if (uC2.M != HT.l(mouseEvent)) break block4;
                }
                uC2 = this;
            }
            uC2.y.r(mouseEvent);
        }
    }
}

