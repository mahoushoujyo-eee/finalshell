/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.HT;
import com.O5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class G4
extends MouseAdapter {
    final HT v;
    final O5 V;

    G4(HT hT2, O5 o5) {
        this.v = hT2;
        this.V = o5;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block4: {
            G4 g42;
            block2: {
                block3: {
                    String string = FV.D();
                    g42 = this;
                    if (string != null) break block2;
                    if (g42.v == null) break block3;
                    g42 = this;
                    if (string != null) break block2;
                    if (g42.v != HT.l(mouseEvent)) break block4;
                }
                g42 = this;
            }
            g42.V.r(mouseEvent);
        }
    }
}

