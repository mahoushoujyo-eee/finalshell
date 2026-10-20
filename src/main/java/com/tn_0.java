/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.k3_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Tn
 */
class tn_0
extends MouseAdapter {
    final k3_0 W;

    tn_0(k3_0 k3_02) {
        this.W = k3_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block3: {
            block2: {
                int[] nArray = k3_0.L();
                boolean bl = this.O(mouseEvent);
                if (nArray == null) break block2;
                if (!bl) break block3;
                bl = this.W.q();
            }
            this.W.o();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean O(MouseEvent mouseEvent) {
        int[] nArray = k3_0.L();
        boolean bl = SwingUtilities.isLeftMouseButton(mouseEvent);
        if (nArray != null) {
            if (!bl) return false;
            bl = FN.N(this.W).contains(mouseEvent.getPoint());
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }
}

