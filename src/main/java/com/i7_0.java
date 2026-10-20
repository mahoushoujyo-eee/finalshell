/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.i7
 */
class i7_0
extends MouseAdapter {
    final kd_1 Y;

    i7_0(kd_1 kd_12) {
        this.Y = kd_12;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block3: {
            kd_1 kd_12;
            block5: {
                int n10;
                block4: {
                    int[] nArray;
                    block2: {
                        nArray = kd_1.u();
                        n10 = mouseEvent.getClickCount();
                        if (nArray != null) break block2;
                        if (n10 != 2) break block3;
                        n10 = kd_1.j(this.Y) ? 1 : 0;
                    }
                    if (nArray != null) break block4;
                    if (n10 == 0) break block3;
                    kd_12 = this.Y;
                    if (nArray != null) break block5;
                    n10 = kd_1.E(kd_12).getSelectionCount();
                }
                if (n10 <= 0) break block3;
                kd_12 = this.Y;
            }
            kd_12.v(kd_1.E(this.Y).N());
        }
    }
}

