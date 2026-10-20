/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.FV;
import com.O5;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.Hk
 */
class hk_0
extends MouseAdapter {
    final O5 u;

    hk_0(O5 o5) {
        this.u = o5;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block5: {
            int n10;
            block4: {
                String string = FV.D();
                n10 = FN.B(mouseEvent);
                if (string != null) break block4;
                if (n10 == 0) break block5;
                n10 = mouseEvent.getClickCount();
            }
            if (n10 == 2) {
                this.u.r(mouseEvent);
            }
        }
    }
}

