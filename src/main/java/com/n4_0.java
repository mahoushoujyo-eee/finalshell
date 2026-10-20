/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.HT;
import com.O5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.n4
 */
class n4_0
extends MouseAdapter {
    final HT C;
    final O5 E;

    n4_0(HT hT2, O5 o5) {
        this.C = hT2;
        this.E = o5;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block4: {
            n4_0 n4_02;
            block2: {
                block3: {
                    String string = FV.D();
                    n4_02 = this;
                    if (string != null) break block2;
                    if (n4_02.C == null) break block3;
                    n4_02 = this;
                    if (string != null) break block2;
                    if (n4_02.C != HT.l(mouseEvent)) break block4;
                }
                n4_02 = this;
            }
            n4_02.E.r(mouseEvent);
        }
    }
}

