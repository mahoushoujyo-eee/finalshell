/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/*
 * Renamed from com.Xr
 */
class xr_0
implements TreeSelectionListener {
    final kd_1 N;

    xr_0(kd_1 kd_12) {
        this.N = kd_12;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        block3: {
            kd_1 kd_12;
            block4: {
                int n10;
                block2: {
                    int[] nArray = kd_1.u();
                    n10 = kd_1.j(this.N);
                    if (nArray != null) break block2;
                    if (n10 == 0) break block3;
                    kd_12 = this.N;
                    if (nArray != null) break block4;
                    n10 = kd_1.E(kd_12).getSelectionCount();
                }
                if (n10 <= 0) break block3;
                kd_12 = this.N;
            }
            kd_12.v(kd_1.E(this.N).N());
        }
    }
}

