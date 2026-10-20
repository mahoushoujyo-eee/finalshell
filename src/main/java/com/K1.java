/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BM;
import com.PM;
import com.kd_1;
import com.wx_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class K1
implements ActionListener {
    final kd_1 A;

    K1(kd_1 kd_12) {
        this.A = kd_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            BM bM;
            block2: {
                int[] nArray = kd_1.u();
                bM = kd_1.c(this.A);
                if (nArray != null) break block2;
                if (bM.R()) break block3;
                bM = kd_1.c(this.A);
            }
            wx_0.G(PM.l(bM.w()));
        }
    }
}

