/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FJ;
import com.FN;
import com.pb_2;
import com.xk_0;
import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.dK
 */
class dk_1
implements PropertyChangeListener {
    final FJ O;

    dk_1(FJ fJ2) {
        this.O = fJ2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block2: {
            Window window;
            block3: {
                Window window2;
                int[] nArray = pb_2.g();
                if (propertyChangeEvent.getNewValue() != Boolean.FALSE) break block2;
                window = window2 = FN.L(FJ.P(this.O));
                if (nArray == null) break block3;
                if (!FN.u(window)) break block2;
                xk_0.Z(window2, true);
                window = window2;
            }
            xk_0.v(window, null);
        }
    }
}

