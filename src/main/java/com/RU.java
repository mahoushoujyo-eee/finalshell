/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kf_1;
import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RU
implements ActionListener {
    final kf_1 L;

    RU(kf_1 kf_12) {
        this.L = kf_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            kf_1 kf_12;
            block2: {
                String string = kz_2.M();
                kf_12 = this.L;
                if (string == null) break block2;
                if (kf_12.D == null) break block3;
                kf_12 = this.L;
            }
            kf_12.V(this.L.D.getParentFile(), true, true);
        }
    }
}

