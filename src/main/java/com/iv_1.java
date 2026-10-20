/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BM;
import com.fk_0;
import com.kd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.iV
 */
class iv_1
implements ActionListener {
    final kd_1 p;

    iv_1(kd_1 kd_12) {
        this.p = kd_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            BM bM;
            block2: {
                int[] nArray = kd_1.u();
                bM = kd_1.c(this.p);
                if (nArray != null) break block2;
                if (bM.R()) break block3;
                bM = kd_1.c(this.p);
            }
            bM.g(fk_0.K(kd_1.c(this.p).T()));
        }
    }
}

