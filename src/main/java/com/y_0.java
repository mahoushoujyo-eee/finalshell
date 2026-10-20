/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.y
 */
class y_0
extends ComponentAdapter {
    final kz_2 W;

    y_0(kz_2 kz_22) {
        this.W = kz_22;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        block3: {
            kz_2 kz_22;
            block2: {
                String string = kz_2.M();
                kz_22 = this.W;
                if (string == null) break block2;
                if (kz_22.Z.isShowing()) break block3;
                kz_22 = this.W;
            }
            kz_22.P();
        }
    }
}

