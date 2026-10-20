/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kh_2;
import com.nx_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.lN
 */
class ln_1
extends MouseAdapter {
    final kh_2 K;

    ln_1(kh_2 kh_22) {
        this.K = kh_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            block4: {
                int n10;
                int n11;
                block2: {
                    n11 = nx_2.R();
                    n10 = SwingUtilities.isLeftMouseButton(mouseEvent);
                    if (n11 != 0) break block2;
                    if (n10 == 0) break block3;
                    n10 = mouseEvent.getY();
                }
                if (n10 > this.K.getHeight() / 2) break block4;
                kh_2.e(this.K);
                if (n11 == 0) break block3;
            }
            kh_2.Q(this.K);
        }
    }
}

