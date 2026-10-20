/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lk_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Rm
 */
class rm_0
extends MouseAdapter {
    final lk_2 K;

    rm_0(lk_2 lk_22) {
        this.K = lk_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block4: {
                String[] stringArray = lk_2.N();
                bl = this.K.isEnabled();
                if (stringArray != null) break block4;
                if (!bl) break block5;
                bl = SwingUtilities.isRightMouseButton(mouseEvent);
            }
            if (bl) {
                this.K.q();
            }
        }
    }
}

