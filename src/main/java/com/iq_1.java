/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.iQ
 */
class iq_1
implements PropertyChangeListener {
    final lk_2 s;

    iq_1(lk_2 lk_22) {
        this.s = lk_22;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block3: {
            lk_2 lk_22;
            block2: {
                String[] stringArray = lk_2.N();
                lk_22 = this.s;
                if (stringArray != null) break block2;
                if (!lk_22.R.isShowing()) break block3;
                lk_22 = this.s;
            }
            lk_22.l();
        }
    }
}

