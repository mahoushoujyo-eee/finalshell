/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PQ;
import com.YO;
import com.xd_1;
import javax.swing.table.DefaultTableModel;

class Y3
extends YO {
    final PQ V;
    final DefaultTableModel y;
    final xd_1 x;

    Y3(xd_1 xd_12, PQ pQ, DefaultTableModel defaultTableModel) {
        this.x = xd_12;
        this.V = pQ;
        this.y = defaultTableModel;
    }

    @Override
    public void T() {
        int[] nArray = this.V.getSelectedRows();
        this.y.setColumnIdentifiers(xd_1.d(this.x));
        int[] nArray2 = nArray;
        int n10 = nArray2.length;
        String[] stringArray = xd_1.U();
        for (int i2 = 0; i2 < n10; ++i2) {
            int n11 = nArray2[i2];
            this.V.addRowSelectionInterval(n11, n11);
            if (stringArray == null) continue;
        }
    }
}

