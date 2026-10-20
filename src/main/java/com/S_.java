/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nx_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class S_
implements PropertyChangeListener {
    final nx_2 t;

    S_(nx_2 nx_22) {
        this.t = nx_22;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block3: {
            nx_2 nx_22;
            block2: {
                int n10 = nx_2.R();
                nx_22 = this.t;
                if (n10 != 0) break block2;
                if (!nx_22.S.isShowing()) break block3;
                nx_22 = this.t;
            }
            nx_22.y();
        }
    }
}

