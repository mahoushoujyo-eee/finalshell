/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.lk_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class vv
extends FocusAdapter {
    final lk_2 d;

    vv(lk_2 lk_22) {
        this.d = lk_22;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        block3: {
            lk_2 lk_22;
            block2: {
                String[] stringArray = lk_2.N();
                lk_22 = this.d;
                if (stringArray != null) break block2;
                if (FN.a(lk_22.R, focusEvent.getOppositeComponent())) break block3;
                lk_22 = this.d;
            }
            lk_22.Y(true);
        }
    }
}

