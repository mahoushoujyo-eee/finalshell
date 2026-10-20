/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nx_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class KM
extends MouseAdapter {
    final nx_2 i;

    KM(nx_2 nx_22) {
        this.i = nx_22;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block4: {
                int n10 = nx_2.c();
                bl = this.i.isEnabled();
                if (n10 == 0) break block4;
                if (!bl) break block5;
                bl = SwingUtilities.isRightMouseButton(mouseEvent);
            }
            if (bl) {
                this.i.j();
            }
        }
    }
}

