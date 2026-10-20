/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.d__0;
import com.pa_1;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class CV
extends FocusAdapter {
    final pa_1 o;

    CV(pa_1 pa_12) {
        this.o = pa_12;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        pa_1.D(this.o).E();
        this.o.h = System.currentTimeMillis();
        this.o.cQ = false;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        block3: {
            d__0 d__02;
            block2: {
                int n10 = _y_0.M();
                d__02 = pa_1.D(this.o);
                if (n10 == 0) break block2;
                if (d__02 == null) break block3;
                d__02 = pa_1.D(this.o);
            }
            d__02.E();
        }
    }
}

