/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BM;
import com.fk_0;
import com.kd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _R
implements ActionListener {
    final kd_1 T;

    _R(kd_1 kd_12) {
        this.T = kd_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            BM bM;
            block2: {
                int[] nArray = kd_1.u();
                bM = kd_1.c(this.T);
                if (nArray != null) break block2;
                if (bM.R()) break block3;
                bM = kd_1.c(this.T);
            }
            bM.g(fk_0.N(kd_1.c(this.T).T()));
        }
    }
}

